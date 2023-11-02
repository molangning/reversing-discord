package org.webrtc.voiceengine;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import java.nio.ByteBuffer;
import org.webrtc.ContextUtils;
import org.webrtc.Logging;
import org.webrtc.MediaStreamTrack;
import org.webrtc.ThreadUtils;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class WebRtcAudioTrack {
    private static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_USAGE = 2;
    private static final String TAG = "WebRtcAudioTrack";
    private static ErrorCallback errorCallback = null;
    private static WebRtcAudioTrackErrorCallback errorCallbackOld = null;
    private static volatile boolean speakerMute = false;
    private static int usageAttribute = 2;
    private final AudioManager audioManager;
    private AudioTrackThread audioThread;
    private AudioTrack audioTrack;
    private ByteBuffer byteBuffer;
    private byte[] emptyBytes;
    private final long nativeAudioTrack;
    private final ThreadUtils.ThreadChecker threadChecker;
    private final boolean useMediaTrack;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    private class AudioTrackThread extends Thread {
        private volatile boolean keepAlive;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioTrackThread(String str) {
            super(str);
            WebRtcAudioTrack.this = r1;
            this.keepAlive = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean z;
            boolean z2;
            Process.setThreadPriority(-19);
            Logging.m8411d(WebRtcAudioTrack.TAG, "AudioTrackThread" + WebRtcAudioUtils.getThreadInfo());
            if (WebRtcAudioTrack.this.audioTrack.getPlayState() == 3) {
                z = true;
            } else {
                z = false;
            }
            WebRtcAudioTrack.assertTrue(z);
            int capacity = WebRtcAudioTrack.this.byteBuffer.capacity();
            while (this.keepAlive) {
                WebRtcAudioTrack webRtcAudioTrack = WebRtcAudioTrack.this;
                webRtcAudioTrack.nativeGetPlayoutData(capacity, webRtcAudioTrack.nativeAudioTrack);
                if (capacity <= WebRtcAudioTrack.this.byteBuffer.remaining()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                WebRtcAudioTrack.assertTrue(z2);
                if (WebRtcAudioTrack.speakerMute) {
                    ByteBuffer byteBuffer = (ByteBuffer) WebRtcAudioTrack.this.byteBuffer.clear();
                    WebRtcAudioTrack.this.byteBuffer.put(WebRtcAudioTrack.this.emptyBytes);
                    ByteBuffer byteBuffer2 = (ByteBuffer) WebRtcAudioTrack.this.byteBuffer.position(0);
                }
                int write = WebRtcAudioTrack.this.audioTrack.write(WebRtcAudioTrack.this.byteBuffer, capacity, 0);
                if (write != capacity) {
                    Logging.m8410e(WebRtcAudioTrack.TAG, "AudioTrack.write played invalid number of bytes: " + write);
                    if (write < 0) {
                        this.keepAlive = false;
                        WebRtcAudioTrack.this.reportWebRtcAudioTrackError("AudioTrack.write failed: " + write);
                    }
                }
                ByteBuffer byteBuffer3 = (ByteBuffer) WebRtcAudioTrack.this.byteBuffer.rewind();
            }
            if (WebRtcAudioTrack.this.audioTrack != null) {
                Logging.m8411d(WebRtcAudioTrack.TAG, "Calling AudioTrack.stop...");
                try {
                    WebRtcAudioTrack.this.audioTrack.stop();
                    Logging.m8411d(WebRtcAudioTrack.TAG, "AudioTrack.stop is done.");
                } catch (IllegalStateException e) {
                    Logging.m8410e(WebRtcAudioTrack.TAG, "AudioTrack.stop failed: " + e.getMessage());
                }
            }
        }

        public void stopThread() {
            Logging.m8411d(WebRtcAudioTrack.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public interface ErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str);
    }

    @Deprecated
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public interface WebRtcAudioTrackErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(String str);
    }

    WebRtcAudioTrack(long j, boolean z) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        threadChecker.checkIsOnValidThread();
        String threadInfo = WebRtcAudioUtils.getThreadInfo();
        Logging.m8411d(TAG, "ctor" + threadInfo);
        this.nativeAudioTrack = j;
        this.useMediaTrack = z;
        this.audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
    }

    public static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 4 : 12;
    }

    private static AudioTrack createAudioTrack(int i, int i2, int i3, boolean z) {
        int i4;
        Logging.m8411d(TAG, "createAudioTrack");
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(getAudioManagerStreamType(z));
        Logging.m8411d(TAG, "nativeOutputSampleRate: " + nativeOutputSampleRate);
        if (i != nativeOutputSampleRate) {
            Logging.m8407w(TAG, "Unable to use fast mode since requested sample rate is not native");
        }
        int i5 = usageAttribute;
        if (i5 != 2) {
            Logging.m8407w(TAG, "A non default usage attribute is used: " + i5);
        }
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        int i6 = 1;
        if (z) {
            i4 = 1;
        } else {
            i4 = usageAttribute;
        }
        AudioAttributes.Builder usage = builder.setUsage(i4);
        if (z) {
            i6 = 2;
        }
        return new AudioTrack(usage.setContentType(i6).build(), new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(i2).build(), i3, 1, 0);
    }

    private int getAudioManagerStreamType() {
        return getAudioManagerStreamType(this.useMediaTrack);
    }

    private static int getAudioManagerStreamType(boolean z) {
        return z ? 3 : 0;
    }

    private int getBufferSizeInFrames() {
        return this.audioTrack.getBufferSizeInFrames();
    }

    private int getStreamMaxVolume() {
        boolean z;
        this.threadChecker.checkIsOnValidThread();
        Logging.m8411d(TAG, "getStreamMaxVolume");
        if (this.audioManager != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        return this.audioManager.getStreamMaxVolume(getAudioManagerStreamType());
    }

    private int getStreamVolume() {
        boolean z;
        this.threadChecker.checkIsOnValidThread();
        Logging.m8411d(TAG, "getStreamVolume");
        if (this.audioManager != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        return this.audioManager.getStreamVolume(getAudioManagerStreamType());
    }

    private int initPlayout(int i, int i2, double d) {
        this.threadChecker.checkIsOnValidThread();
        Logging.m8411d(TAG, "initPlayout(sampleRate=" + i + ", channels=" + i2 + ", bufferSizeFactor=" + d + ")");
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2 * 2 * (i / 100));
        this.byteBuffer = allocateDirect;
        int capacity = allocateDirect.capacity();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("byteBuffer.capacity: ");
        sb2.append(capacity);
        Logging.m8411d(TAG, sb2.toString());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioTrack);
        int channelCountToConfiguration = channelCountToConfiguration(i2);
        int minBufferSize = (int) (AudioTrack.getMinBufferSize(i, channelCountToConfiguration, 2) * d);
        Logging.m8411d(TAG, "minBufferSizeInBytes: " + minBufferSize);
        if (minBufferSize < this.byteBuffer.capacity()) {
            reportWebRtcAudioTrackInitError("AudioTrack.getMinBufferSize returns an invalid value.");
            return -1;
        } else if (this.audioTrack != null) {
            reportWebRtcAudioTrackInitError("Conflict with existing AudioTrack.");
            return -1;
        } else {
            try {
                AudioTrack createAudioTrack = createAudioTrack(i, channelCountToConfiguration, minBufferSize, this.useMediaTrack);
                this.audioTrack = createAudioTrack;
                if (createAudioTrack != null && createAudioTrack.getState() == 1) {
                    logMainParameters();
                    logMainParametersExtended();
                    return minBufferSize;
                }
                reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
                releaseAudioResources();
                return -1;
            } catch (IllegalArgumentException e) {
                reportWebRtcAudioTrackInitError(e.getMessage());
                releaseAudioResources();
                return -1;
            }
        }
    }

    private void logBufferCapacityInFrames() {
        int bufferCapacityInFrames;
        if (Build.VERSION.SDK_INT >= 24) {
            bufferCapacityInFrames = this.audioTrack.getBufferCapacityInFrames();
            Logging.m8411d(TAG, "AudioTrack: buffer capacity in frames: " + bufferCapacityInFrames);
        }
    }

    private void logBufferSizeInFrames() {
        int bufferSizeInFrames = this.audioTrack.getBufferSizeInFrames();
        Logging.m8411d(TAG, "AudioTrack: buffer size in frames: " + bufferSizeInFrames);
    }

    private void logMainParameters() {
        int audioSessionId = this.audioTrack.getAudioSessionId();
        int channelCount = this.audioTrack.getChannelCount();
        int sampleRate = this.audioTrack.getSampleRate();
        float maxVolume = AudioTrack.getMaxVolume();
        Logging.m8411d(TAG, "AudioTrack: session ID: " + audioSessionId + ", channels: " + channelCount + ", sample rate: " + sampleRate + ", max gain: " + maxVolume);
    }

    private void logMainParametersExtended() {
        logBufferSizeInFrames();
        logBufferCapacityInFrames();
    }

    private void logUnderrunCount() {
        int underrunCount;
        if (Build.VERSION.SDK_INT >= 24) {
            underrunCount = this.audioTrack.getUnderrunCount();
            Logging.m8411d(TAG, "underrun count: " + underrunCount);
        }
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j);

    public native void nativeGetPlayoutData(int i, long j);

    private void releaseAudioResources() {
        Logging.m8411d(TAG, "releaseAudioResources");
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.audioTrack = null;
        }
    }

    public void reportWebRtcAudioTrackError(String str) {
        Logging.m8410e(TAG, "Run-time playback error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackError(str);
        }
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        Logging.m8410e(TAG, "Init playout error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackInitError(str);
        }
    }

    private void reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        Logging.m8410e(TAG, "Start playout error: " + audioTrackStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackStartError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    public static synchronized void setAudioTrackUsageAttribute(int i) {
        synchronized (WebRtcAudioTrack.class) {
            Logging.m8407w(TAG, "Default usage attribute is changed from: 2 to " + i);
            usageAttribute = i;
        }
    }

    @Deprecated
    public static void setErrorCallback(WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback) {
        Logging.m8411d(TAG, "Set error callback (deprecated");
        errorCallbackOld = webRtcAudioTrackErrorCallback;
    }

    public static void setSpeakerMute(boolean z) {
        Logging.m8407w(TAG, "setSpeakerMute(" + z + ")");
        speakerMute = z;
    }

    private boolean setStreamVolume(int i) {
        boolean z;
        this.threadChecker.checkIsOnValidThread();
        Logging.m8411d(TAG, "setStreamVolume(" + i + ")");
        if (this.audioManager != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        if (this.audioManager.isVolumeFixed()) {
            Logging.m8410e(TAG, "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(getAudioManagerStreamType(), i, 0);
        return true;
    }

    private boolean startPlayout() {
        boolean z;
        boolean z2;
        try {
            this.threadChecker.checkIsOnValidThread();
            Logging.m8411d(TAG, "startPlayout");
            if (this.audioTrack != null) {
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
                this.audioTrack.play();
                if (this.audioTrack.getPlayState() != 3) {
                    reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH, "AudioTrack.play failed - incorrect state :" + this.audioTrack.getPlayState());
                    releaseAudioResources();
                    return false;
                }
                AudioTrackThread audioTrackThread = new AudioTrackThread("AudioTrackJavaThread");
                this.audioThread = audioTrackThread;
                audioTrackThread.start();
                return true;
            } catch (IllegalStateException e) {
                reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION, "AudioTrack.play failed: " + e.getMessage());
                releaseAudioResources();
                return false;
            }
        } catch (Throwable th2) {
            Logging.m8409e(TAG, "WebRtcAudioTrack.startPlayout fail hard!", th2);
            throw th2;
        }
    }

    private boolean stopPlayout() {
        boolean z;
        this.threadChecker.checkIsOnValidThread();
        Logging.m8411d(TAG, "stopPlayout");
        if (this.audioThread != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        logUnderrunCount();
        this.audioThread.stopThread();
        Logging.m8411d(TAG, "Stopping the AudioTrackThread...");
        this.audioThread.interrupt();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS)) {
            Logging.m8410e(TAG, "Join of AudioTrackThread timed out.");
            WebRtcAudioUtils.logAudioState(TAG);
        }
        Logging.m8411d(TAG, "AudioTrackThread has now been stopped.");
        this.audioThread = null;
        releaseAudioResources();
        return true;
    }

    public static void setErrorCallback(ErrorCallback errorCallback2) {
        Logging.m8411d(TAG, "Set extended error callback");
        errorCallback = errorCallback2;
    }
}