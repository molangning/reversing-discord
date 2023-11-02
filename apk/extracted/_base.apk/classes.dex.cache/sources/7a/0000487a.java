package org.webrtc.voiceengine;

import android.media.AudioRecord;
import android.os.Process;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class WebRtcAudioRecord {
    private static final long AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int BUFFER_SIZE_FACTOR = 2;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_AUDIO_SOURCE;
    private static final String TAG = "WebRtcAudioRecord";
    private static WebRtcAudioRecordSamplesReadyCallback audioSamplesReadyCallback;
    private static int audioSource;
    private static WebRtcAudioRecordErrorCallback errorCallback;
    private static volatile boolean microphoneMute;
    private AudioRecord audioRecord;
    private AudioRecordThread audioThread;
    private ByteBuffer byteBuffer;
    private WebRtcAudioEffects effects;
    private byte[] emptyBytes;
    private final long nativeAudioRecord;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    private class AudioRecordThread extends Thread {
        private volatile boolean keepAlive;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioRecordThread(String str) {
            super(str);
            WebRtcAudioRecord.this = r1;
            this.keepAlive = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean z;
            Process.setThreadPriority(-19);
            Logging.m8411d(WebRtcAudioRecord.TAG, "AudioRecordThread" + WebRtcAudioUtils.getThreadInfo());
            if (WebRtcAudioRecord.this.audioRecord.getRecordingState() == 3) {
                z = true;
            } else {
                z = false;
            }
            WebRtcAudioRecord.assertTrue(z);
            System.nanoTime();
            while (this.keepAlive) {
                int read = WebRtcAudioRecord.this.audioRecord.read(WebRtcAudioRecord.this.byteBuffer, WebRtcAudioRecord.this.byteBuffer.capacity());
                if (read == WebRtcAudioRecord.this.byteBuffer.capacity()) {
                    if (WebRtcAudioRecord.microphoneMute) {
                        ByteBuffer byteBuffer = (ByteBuffer) WebRtcAudioRecord.this.byteBuffer.clear();
                        WebRtcAudioRecord.this.byteBuffer.put(WebRtcAudioRecord.this.emptyBytes);
                    }
                    if (this.keepAlive) {
                        WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                        webRtcAudioRecord.nativeDataIsRecorded(read, webRtcAudioRecord.nativeAudioRecord);
                    }
                    if (WebRtcAudioRecord.audioSamplesReadyCallback != null) {
                        WebRtcAudioRecord.audioSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new AudioSamples(WebRtcAudioRecord.this.audioRecord, Arrays.copyOf(WebRtcAudioRecord.this.byteBuffer.array(), WebRtcAudioRecord.this.byteBuffer.capacity())));
                    }
                } else {
                    String str = "AudioRecord.read failed: " + read;
                    Logging.m8410e(WebRtcAudioRecord.TAG, str);
                    if (read == -3) {
                        this.keepAlive = false;
                        WebRtcAudioRecord.this.reportWebRtcAudioRecordError(str);
                    }
                }
            }
            try {
                if (WebRtcAudioRecord.this.audioRecord != null) {
                    WebRtcAudioRecord.this.audioRecord.stop();
                }
            } catch (IllegalStateException e) {
                Logging.m8410e(WebRtcAudioRecord.TAG, "AudioRecord.stop failed: " + e.getMessage());
            }
        }

        public void stopThread() {
            Logging.m8411d(WebRtcAudioRecord.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class AudioSamples {
        private final int audioFormat;
        private final int channelCount;
        private final byte[] data;
        private final int sampleRate;

        private AudioSamples(AudioRecord audioRecord, byte[] bArr) {
            this.audioFormat = audioRecord.getAudioFormat();
            this.channelCount = audioRecord.getChannelCount();
            this.sampleRate = audioRecord.getSampleRate();
            this.data = bArr;
        }

        public int getAudioFormat() {
            return this.audioFormat;
        }

        public int getChannelCount() {
            return this.channelCount;
        }

        public byte[] getData() {
            return this.data;
        }

        public int getSampleRate() {
            return this.sampleRate;
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public interface WebRtcAudioRecordErrorCallback {
        void onWebRtcAudioRecordError(String str);

        void onWebRtcAudioRecordInitError(String str);

        void onWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str);
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public interface WebRtcAudioRecordSamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(AudioSamples audioSamples);
    }

    static {
        int defaultAudioSource = getDefaultAudioSource();
        DEFAULT_AUDIO_SOURCE = defaultAudioSource;
        audioSource = defaultAudioSource;
    }

    WebRtcAudioRecord(long j) {
        String threadInfo = WebRtcAudioUtils.getThreadInfo();
        Logging.m8411d(TAG, "ctor" + threadInfo);
        this.nativeAudioRecord = j;
        this.effects = WebRtcAudioEffects.create();
    }

    public static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 16 : 12;
    }

    private boolean enableBuiltInAEC(boolean z) {
        Logging.m8411d(TAG, "enableBuiltInAEC(" + z + ")");
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects == null) {
            Logging.m8410e(TAG, "Built-in AEC is not supported on this platform");
            return false;
        }
        return webRtcAudioEffects.setAEC(z);
    }

    private boolean enableBuiltInNS(boolean z) {
        Logging.m8411d(TAG, "enableBuiltInNS(" + z + ")");
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects == null) {
            Logging.m8410e(TAG, "Built-in NS is not supported on this platform");
            return false;
        }
        return webRtcAudioEffects.setNS(z);
    }

    private static int getDefaultAudioSource() {
        return 7;
    }

    private int initRecording(int i, int i2) {
        Logging.m8411d(TAG, "initRecording(sampleRate=" + i + ", channels=" + i2 + ")");
        if (this.audioRecord != null) {
            reportWebRtcAudioRecordInitError("InitRecording called twice without StopRecording.");
            return -1;
        }
        int i3 = i / 100;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2 * 2 * i3);
        this.byteBuffer = allocateDirect;
        int capacity = allocateDirect.capacity();
        Logging.m8411d(TAG, "byteBuffer.capacity: " + capacity);
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioRecord);
        int channelCountToConfiguration = channelCountToConfiguration(i2);
        int minBufferSize = AudioRecord.getMinBufferSize(i, channelCountToConfiguration, 2);
        if (minBufferSize != -1 && minBufferSize != -2) {
            Logging.m8411d(TAG, "AudioRecord.getMinBufferSize: " + minBufferSize);
            int max = Math.max(minBufferSize * 2, this.byteBuffer.capacity());
            Logging.m8411d(TAG, "bufferSizeInBytes: " + max);
            try {
                AudioRecord audioRecord = new AudioRecord(audioSource, i, channelCountToConfiguration, 2, max);
                this.audioRecord = audioRecord;
                if (audioRecord.getState() != 1) {
                    reportWebRtcAudioRecordInitError("Failed to create a new AudioRecord instance");
                    releaseAudioResources();
                    return -1;
                }
                WebRtcAudioEffects webRtcAudioEffects = this.effects;
                if (webRtcAudioEffects != null) {
                    webRtcAudioEffects.enable(this.audioRecord.getAudioSessionId());
                }
                logMainParameters();
                logMainParametersExtended();
                return i3;
            } catch (IllegalArgumentException e) {
                String message = e.getMessage();
                reportWebRtcAudioRecordInitError("AudioRecord ctor error: " + message);
                releaseAudioResources();
                return -1;
            }
        }
        reportWebRtcAudioRecordInitError("AudioRecord.getMinBufferSize failed: " + minBufferSize);
        return -1;
    }

    private void logMainParameters() {
        int audioSessionId = this.audioRecord.getAudioSessionId();
        int channelCount = this.audioRecord.getChannelCount();
        int sampleRate = this.audioRecord.getSampleRate();
        Logging.m8411d(TAG, "AudioRecord: session ID: " + audioSessionId + ", channels: " + channelCount + ", sample rate: " + sampleRate);
    }

    private void logMainParametersExtended() {
        int bufferSizeInFrames = this.audioRecord.getBufferSizeInFrames();
        Logging.m8411d(TAG, "AudioRecord: buffer size in frames: " + bufferSizeInFrames);
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j);

    public native void nativeDataIsRecorded(int i, long j);

    private void releaseAudioResources() {
        Logging.m8411d(TAG, "releaseAudioResources");
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            audioRecord.release();
            this.audioRecord = null;
        }
    }

    public void reportWebRtcAudioRecordError(String str) {
        Logging.m8410e(TAG, "Run-time recording error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordError(str);
        }
    }

    private void reportWebRtcAudioRecordInitError(String str) {
        Logging.m8410e(TAG, "Init recording error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordInitError(str);
        }
    }

    private void reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        Logging.m8410e(TAG, "Start recording error: " + audioRecordStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        }
    }

    public static synchronized void setAudioSource(int i) {
        synchronized (WebRtcAudioRecord.class) {
            int i2 = audioSource;
            Logging.m8407w(TAG, "Audio source is changed from: " + i2 + " to " + i);
            audioSource = i;
        }
    }

    public static void setErrorCallback(WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback) {
        Logging.m8411d(TAG, "Set error callback");
        errorCallback = webRtcAudioRecordErrorCallback;
    }

    public static void setMicrophoneMute(boolean z) {
        Logging.m8407w(TAG, "setMicrophoneMute(" + z + ")");
        microphoneMute = z;
    }

    public static void setOnAudioSamplesReady(WebRtcAudioRecordSamplesReadyCallback webRtcAudioRecordSamplesReadyCallback) {
        audioSamplesReadyCallback = webRtcAudioRecordSamplesReadyCallback;
    }

    private boolean startRecording() {
        boolean z;
        boolean z2;
        try {
            Logging.m8411d(TAG, "startRecording");
            if (this.audioRecord != null) {
                z = true;
            } else {
                z = false;
            }
            assertTrue(z);
            if (this.audioThread == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            assertTrue(z2);
            try {
                this.audioRecord.startRecording();
                if (this.audioRecord.getRecordingState() != 3) {
                    reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, "AudioRecord.startRecording failed - incorrect state :" + this.audioRecord.getRecordingState());
                    return false;
                }
                AudioRecordThread audioRecordThread = new AudioRecordThread("AudioRecordJavaThread");
                this.audioThread = audioRecordThread;
                audioRecordThread.start();
                return true;
            } catch (IllegalStateException e) {
                reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION, "AudioRecord.startRecording failed: " + e.getMessage());
                return false;
            }
        } catch (Throwable th2) {
            Logging.m8409e(TAG, "WebrtcAudioRecord.startRecording fail hard!", th2);
            throw th2;
        }
    }

    private boolean stopRecording() {
        boolean z;
        Logging.m8411d(TAG, "stopRecording");
        if (this.audioThread != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        this.audioThread.stopThread();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS)) {
            Logging.m8410e(TAG, "Join of AudioRecordJavaThread timed out");
            WebRtcAudioUtils.logAudioState(TAG);
        }
        this.audioThread = null;
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            webRtcAudioEffects.release();
        }
        releaseAudioResources();
        return true;
    }
}