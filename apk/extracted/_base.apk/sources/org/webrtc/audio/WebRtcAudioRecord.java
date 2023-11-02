package org.webrtc.audio;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import android.os.Build;
import android.os.Process;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.CalledByNative;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;
import org.webrtc.audio.JavaAudioDeviceModule;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class WebRtcAudioRecord {
    private static final int AUDIO_RECORD_START = 0;
    private static final int AUDIO_RECORD_STOP = 1;
    private static final long AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int BUFFER_SIZE_FACTOR = 2;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final int CHECK_REC_STATUS_DELAY_MS = 100;
    public static final int DEFAULT_AUDIO_FORMAT = 2;
    public static final int DEFAULT_AUDIO_SOURCE = 7;
    private static final String TAG = "WebRtcAudioRecordExternal";
    private static final AtomicInteger nextSchedulerId = new AtomicInteger(0);
    private final int audioFormat;
    private final AudioManager audioManager;
    private AudioRecord audioRecord;
    private final JavaAudioDeviceModule.SamplesReadyCallback audioSamplesReadyCallback;
    private final int audioSource;
    private final AtomicReference<Boolean> audioSourceMatchesRecordingSessionRef;
    private AudioRecordThread audioThread;
    private ByteBuffer byteBuffer;
    private final Context context;
    private final WebRtcAudioEffects effects;
    private byte[] emptyBytes;
    private final JavaAudioDeviceModule.AudioRecordErrorCallback errorCallback;
    private final ScheduledExecutorService executor;
    private ScheduledFuture<String> future;
    private final boolean isAcousticEchoCancelerSupported;
    private final boolean isNoiseSuppressorSupported;
    private volatile boolean microphoneMute;
    private long nativeAudioRecord;
    private AudioDeviceInfo preferredDevice;
    private final JavaAudioDeviceModule.AudioRecordStateCallback stateCallback;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    private class AudioRecordThread extends Thread {
        private volatile boolean keepAlive;

        public AudioRecordThread(String str) {
            super(str);
            this.keepAlive = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean z;
            AudioTimestamp audioTimestamp;
            long j;
            int timestamp;
            Process.setThreadPriority(-19);
            Logging.m8411d(WebRtcAudioRecord.TAG, "AudioRecordThread" + WebRtcAudioUtils.getThreadInfo());
            if (WebRtcAudioRecord.this.audioRecord.getRecordingState() == 3) {
                z = true;
            } else {
                z = false;
            }
            WebRtcAudioRecord.assertTrue(z);
            WebRtcAudioRecord.this.doAudioRecordStateCallback(0);
            System.nanoTime();
            if (Build.VERSION.SDK_INT >= 24) {
                audioTimestamp = new AudioTimestamp();
            } else {
                audioTimestamp = null;
            }
            while (this.keepAlive) {
                int read = WebRtcAudioRecord.this.audioRecord.read(WebRtcAudioRecord.this.byteBuffer, WebRtcAudioRecord.this.byteBuffer.capacity());
                if (read == WebRtcAudioRecord.this.byteBuffer.capacity()) {
                    if (WebRtcAudioRecord.this.microphoneMute) {
                        ByteBuffer byteBuffer = (ByteBuffer) WebRtcAudioRecord.this.byteBuffer.clear();
                        WebRtcAudioRecord.this.byteBuffer.put(WebRtcAudioRecord.this.emptyBytes);
                    }
                    if (this.keepAlive) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            timestamp = WebRtcAudioRecord.this.audioRecord.getTimestamp(audioTimestamp, 0);
                            if (timestamp == 0) {
                                j = audioTimestamp.nanoTime;
                                WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                                webRtcAudioRecord.nativeDataIsRecorded(webRtcAudioRecord.nativeAudioRecord, read, j);
                            }
                        }
                        j = 0;
                        WebRtcAudioRecord webRtcAudioRecord2 = WebRtcAudioRecord.this;
                        webRtcAudioRecord2.nativeDataIsRecorded(webRtcAudioRecord2.nativeAudioRecord, read, j);
                    }
                    if (WebRtcAudioRecord.this.audioSamplesReadyCallback != null) {
                        WebRtcAudioRecord.this.audioSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new JavaAudioDeviceModule.AudioSamples(WebRtcAudioRecord.this.audioRecord.getAudioFormat(), WebRtcAudioRecord.this.audioRecord.getChannelCount(), WebRtcAudioRecord.this.audioRecord.getSampleRate(), Arrays.copyOfRange(WebRtcAudioRecord.this.byteBuffer.array(), WebRtcAudioRecord.this.byteBuffer.arrayOffset(), WebRtcAudioRecord.this.byteBuffer.capacity() + WebRtcAudioRecord.this.byteBuffer.arrayOffset())));
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
                    WebRtcAudioRecord.this.doAudioRecordStateCallback(1);
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

    @CalledByNative
    WebRtcAudioRecord(Context context, AudioManager audioManager) {
        this(context, newDefaultScheduler(), audioManager, 7, 2, null, null, null, WebRtcAudioEffects.isAcousticEchoCancelerSupported(), WebRtcAudioEffects.isNoiseSuppressorSupported());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private static String audioStateToString(int i) {
        return i != 0 ? i != 1 ? "INVALID" : "STOP" : "START";
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 16 : 12;
    }

    @TargetApi(24)
    private static boolean checkDeviceMatch(AudioDeviceInfo audioDeviceInfo, AudioDeviceInfo audioDeviceInfo2) {
        return audioDeviceInfo.getId() == audioDeviceInfo2.getId() && audioDeviceInfo.getType() == audioDeviceInfo2.getType();
    }

    private static AudioRecord createAudioRecordOnLowerThanM(int i, int i2, int i3, int i4, int i5) {
        Logging.m8411d(TAG, "createAudioRecordOnLowerThanM");
        return new AudioRecord(i, i2, i3, i4, i5);
    }

    @TargetApi(23)
    private static AudioRecord createAudioRecordOnMOrHigher(int i, int i2, int i3, int i4, int i5) {
        Logging.m8411d(TAG, "createAudioRecordOnMOrHigher");
        return new AudioRecord.Builder().setAudioSource(i).setAudioFormat(new AudioFormat.Builder().setEncoding(i4).setSampleRate(i2).setChannelMask(i3).build()).setBufferSizeInBytes(i5).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doAudioRecordStateCallback(int i) {
        String audioStateToString = audioStateToString(i);
        Logging.m8411d(TAG, "doAudioRecordStateCallback: " + audioStateToString);
        JavaAudioDeviceModule.AudioRecordStateCallback audioRecordStateCallback = this.stateCallback;
        if (audioRecordStateCallback != null) {
            if (i == 0) {
                audioRecordStateCallback.onWebRtcAudioRecordStart();
            } else if (i == 1) {
                audioRecordStateCallback.onWebRtcAudioRecordStop();
            } else {
                Logging.m8410e(TAG, "Invalid audio state");
            }
        }
    }

    @CalledByNative
    private boolean enableBuiltInAEC(boolean z) {
        Logging.m8411d(TAG, "enableBuiltInAEC(" + z + ")");
        return this.effects.setAEC(z);
    }

    @CalledByNative
    private boolean enableBuiltInNS(boolean z) {
        Logging.m8411d(TAG, "enableBuiltInNS(" + z + ")");
        return this.effects.setNS(z);
    }

    private static int getBytesPerSample(int i) {
        int i2 = 1;
        if (i != 1 && i != 2) {
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    if (i != 13) {
                        throw new IllegalArgumentException("Bad audio format " + i);
                    }
                }
            }
            return i2;
        }
        return 2;
    }

    @CalledByNative
    private int initRecording(int i, int i2) {
        Logging.m8411d(TAG, "initRecording(sampleRate=" + i + ", channels=" + i2 + ")");
        if (this.audioRecord != null) {
            reportWebRtcAudioRecordInitError("InitRecording called twice without StopRecording.");
            return -1;
        }
        int i3 = i / 100;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(getBytesPerSample(this.audioFormat) * i2 * i3);
        this.byteBuffer = allocateDirect;
        if (!allocateDirect.hasArray()) {
            reportWebRtcAudioRecordInitError("ByteBuffer does not have backing array.");
            return -1;
        }
        int capacity = this.byteBuffer.capacity();
        Logging.m8411d(TAG, "byteBuffer.capacity: " + capacity);
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.nativeAudioRecord, this.byteBuffer);
        int channelCountToConfiguration = channelCountToConfiguration(i2);
        int minBufferSize = AudioRecord.getMinBufferSize(i, channelCountToConfiguration, this.audioFormat);
        if (minBufferSize != -1 && minBufferSize != -2) {
            Logging.m8411d(TAG, "AudioRecord.getMinBufferSize: " + minBufferSize);
            int max = Math.max(minBufferSize * 2, this.byteBuffer.capacity());
            Logging.m8411d(TAG, "bufferSizeInBytes: " + max);
            try {
                this.audioRecord = createAudioRecordOnMOrHigher(this.audioSource, i, channelCountToConfiguration, this.audioFormat, max);
                this.audioSourceMatchesRecordingSessionRef.set(null);
                AudioDeviceInfo audioDeviceInfo = this.preferredDevice;
                if (audioDeviceInfo != null) {
                    setPreferredDevice(audioDeviceInfo);
                }
                AudioRecord audioRecord = this.audioRecord;
                if (audioRecord != null && audioRecord.getState() == 1) {
                    this.effects.enable(this.audioRecord.getAudioSessionId());
                    logMainParameters();
                    logMainParametersExtended();
                    int logRecordingConfigurations = logRecordingConfigurations(this.audioRecord, false);
                    if (logRecordingConfigurations != 0) {
                        Logging.m8407w(TAG, "Potential microphone conflict. Active sessions: " + logRecordingConfigurations);
                    }
                    return i3;
                }
                reportWebRtcAudioRecordInitError("Creation or initialization of audio recorder failed.");
                releaseAudioResources();
                return -1;
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                reportWebRtcAudioRecordInitError(e.getMessage());
                releaseAudioResources();
                return -1;
            }
        }
        reportWebRtcAudioRecordInitError("AudioRecord.getMinBufferSize failed: " + minBufferSize);
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$scheduleLogRecordingConfigurationsTask$0(AudioRecord audioRecord) {
        if (this.audioRecord == audioRecord) {
            logRecordingConfigurations(audioRecord, true);
            return "Scheduled task is done";
        }
        Logging.m8411d(TAG, "audio record has changed");
        return "Scheduled task is done";
    }

    @TargetApi(24)
    private static boolean logActiveRecordingConfigs(int i, List<AudioRecordingConfiguration> list) {
        int clientAudioSource;
        int clientAudioSessionId;
        AudioFormat format;
        AudioFormat clientFormat;
        AudioDeviceInfo audioDevice;
        assertTrue(!list.isEmpty());
        Logging.m8411d(TAG, "AudioRecordingConfigurations: ");
        for (AudioRecordingConfiguration audioRecordingConfiguration : list) {
            StringBuilder sb2 = new StringBuilder();
            clientAudioSource = audioRecordingConfiguration.getClientAudioSource();
            sb2.append("  client audio source=");
            sb2.append(WebRtcAudioUtils.audioSourceToString(clientAudioSource));
            sb2.append(", client session id=");
            clientAudioSessionId = audioRecordingConfiguration.getClientAudioSessionId();
            sb2.append(clientAudioSessionId);
            sb2.append(" (");
            sb2.append(i);
            sb2.append(")");
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            format = audioRecordingConfiguration.getFormat();
            sb2.append("  Device AudioFormat: ");
            sb2.append("channel count=");
            sb2.append(format.getChannelCount());
            sb2.append(", channel index mask=");
            sb2.append(format.getChannelIndexMask());
            sb2.append(", channel mask=");
            sb2.append(WebRtcAudioUtils.channelMaskToString(format.getChannelMask()));
            sb2.append(", encoding=");
            sb2.append(WebRtcAudioUtils.audioEncodingToString(format.getEncoding()));
            sb2.append(", sample rate=");
            sb2.append(format.getSampleRate());
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            clientFormat = audioRecordingConfiguration.getClientFormat();
            sb2.append("  Client AudioFormat: ");
            sb2.append("channel count=");
            sb2.append(clientFormat.getChannelCount());
            sb2.append(", channel index mask=");
            sb2.append(clientFormat.getChannelIndexMask());
            sb2.append(", channel mask=");
            sb2.append(WebRtcAudioUtils.channelMaskToString(clientFormat.getChannelMask()));
            sb2.append(", encoding=");
            sb2.append(WebRtcAudioUtils.audioEncodingToString(clientFormat.getEncoding()));
            sb2.append(", sample rate=");
            sb2.append(clientFormat.getSampleRate());
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            audioDevice = audioRecordingConfiguration.getAudioDevice();
            if (audioDevice != null) {
                assertTrue(audioDevice.isSource());
                sb2.append("  AudioDevice: ");
                sb2.append("type=");
                sb2.append(WebRtcAudioUtils.deviceTypeToString(audioDevice.getType()));
                sb2.append(", id=");
                sb2.append(audioDevice.getId());
            }
            Logging.m8411d(TAG, sb2.toString());
        }
        return true;
    }

    private void logMainParameters() {
        int audioSessionId = this.audioRecord.getAudioSessionId();
        int channelCount = this.audioRecord.getChannelCount();
        int sampleRate = this.audioRecord.getSampleRate();
        Logging.m8411d(TAG, "AudioRecord: session ID: " + audioSessionId + ", channels: " + channelCount + ", sample rate: " + sampleRate);
    }

    @TargetApi(23)
    private void logMainParametersExtended() {
        int bufferSizeInFrames = this.audioRecord.getBufferSizeInFrames();
        Logging.m8411d(TAG, "AudioRecord: buffer size in frames: " + bufferSizeInFrames);
    }

    @TargetApi(24)
    private int logRecordingConfigurations(AudioRecord audioRecord, boolean z) {
        List activeRecordingConfigurations;
        if (Build.VERSION.SDK_INT < 24) {
            Logging.m8407w(TAG, "AudioManager#getActiveRecordingConfigurations() requires N or higher");
            return 0;
        } else if (audioRecord == null) {
            return 0;
        } else {
            activeRecordingConfigurations = this.audioManager.getActiveRecordingConfigurations();
            int size = activeRecordingConfigurations.size();
            Logging.m8411d(TAG, "Number of active recording sessions: " + size);
            if (size > 0) {
                logActiveRecordingConfigs(audioRecord.getAudioSessionId(), activeRecordingConfigurations);
                if (z) {
                    this.audioSourceMatchesRecordingSessionRef.set(Boolean.valueOf(verifyAudioConfig(audioRecord.getAudioSource(), audioRecord.getAudioSessionId(), audioRecord.getFormat(), audioRecord.getRoutedDevice(), activeRecordingConfigurations)));
                }
            }
            return size;
        }
    }

    private native void nativeCacheDirectBufferAddress(long j, ByteBuffer byteBuffer);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeDataIsRecorded(long j, int i, long j2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ScheduledExecutorService newDefaultScheduler() {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        return Executors.newScheduledThreadPool(0, new ThreadFactory() { // from class: org.webrtc.audio.WebRtcAudioRecord.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                newThread.setName(String.format("WebRtcAudioRecordScheduler-%s-%s", Integer.valueOf(WebRtcAudioRecord.nextSchedulerId.getAndIncrement()), Integer.valueOf(atomicInteger.getAndIncrement())));
                return newThread;
            }
        });
    }

    private void releaseAudioResources() {
        Logging.m8411d(TAG, "releaseAudioResources");
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            audioRecord.release();
            this.audioRecord = null;
        }
        this.audioSourceMatchesRecordingSessionRef.set(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioRecordError(String str) {
        Logging.m8410e(TAG, "Run-time recording error: " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordError(str);
        }
    }

    private void reportWebRtcAudioRecordInitError(String str) {
        Logging.m8410e(TAG, "Init recording error: " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        logRecordingConfigurations(this.audioRecord, false);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordInitError(str);
        }
    }

    private void reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        Logging.m8410e(TAG, "Start recording error: " + audioRecordStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        logRecordingConfigurations(this.audioRecord, false);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        }
    }

    private void scheduleLogRecordingConfigurationsTask(final AudioRecord audioRecord) {
        Logging.m8411d(TAG, "scheduleLogRecordingConfigurationsTask");
        if (Build.VERSION.SDK_INT < 24) {
            return;
        }
        Callable callable = new Callable() { // from class: org.webrtc.audio.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String lambda$scheduleLogRecordingConfigurationsTask$0;
                lambda$scheduleLogRecordingConfigurationsTask$0 = WebRtcAudioRecord.this.lambda$scheduleLogRecordingConfigurationsTask$0(audioRecord);
                return lambda$scheduleLogRecordingConfigurationsTask$0;
            }
        };
        ScheduledFuture<String> scheduledFuture = this.future;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.future.cancel(true);
        }
        this.future = this.executor.schedule(callable, 100L, TimeUnit.MILLISECONDS);
    }

    @CalledByNative
    private boolean startRecording() {
        boolean z;
        boolean z2;
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
                reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, "AudioRecord.startRecording failed - incorrect state: " + this.audioRecord.getRecordingState());
                return false;
            }
            AudioRecordThread audioRecordThread = new AudioRecordThread("AudioRecordJavaThread");
            this.audioThread = audioRecordThread;
            audioRecordThread.start();
            scheduleLogRecordingConfigurationsTask(this.audioRecord);
            return true;
        } catch (IllegalStateException e) {
            reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION, "AudioRecord.startRecording failed: " + e.getMessage());
            return false;
        }
    }

    @CalledByNative
    private boolean stopRecording() {
        boolean z;
        Logging.m8411d(TAG, "stopRecording");
        if (this.audioThread != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        ScheduledFuture<String> scheduledFuture = this.future;
        if (scheduledFuture != null) {
            if (!scheduledFuture.isDone()) {
                this.future.cancel(true);
            }
            this.future = null;
        }
        this.audioThread.stopThread();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS)) {
            Logging.m8410e(TAG, "Join of AudioRecordJavaThread timed out");
            WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        }
        this.audioThread = null;
        this.effects.release();
        releaseAudioResources();
        return true;
    }

    @TargetApi(24)
    private static boolean verifyAudioConfig(int i, int i2, AudioFormat audioFormat, AudioDeviceInfo audioDeviceInfo, List<AudioRecordingConfiguration> list) {
        AudioDeviceInfo audioDevice;
        int clientAudioSource;
        int clientAudioSessionId;
        AudioFormat clientFormat;
        AudioFormat clientFormat2;
        AudioFormat clientFormat3;
        AudioFormat clientFormat4;
        AudioFormat format;
        AudioFormat format2;
        AudioFormat format3;
        AudioFormat format4;
        assertTrue(!list.isEmpty());
        for (AudioRecordingConfiguration audioRecordingConfiguration : list) {
            audioDevice = audioRecordingConfiguration.getAudioDevice();
            if (audioDevice != null) {
                clientAudioSource = audioRecordingConfiguration.getClientAudioSource();
                if (clientAudioSource == i) {
                    clientAudioSessionId = audioRecordingConfiguration.getClientAudioSessionId();
                    if (clientAudioSessionId == i2) {
                        clientFormat = audioRecordingConfiguration.getClientFormat();
                        if (clientFormat.getEncoding() == audioFormat.getEncoding()) {
                            clientFormat2 = audioRecordingConfiguration.getClientFormat();
                            if (clientFormat2.getSampleRate() == audioFormat.getSampleRate()) {
                                clientFormat3 = audioRecordingConfiguration.getClientFormat();
                                if (clientFormat3.getChannelMask() == audioFormat.getChannelMask()) {
                                    clientFormat4 = audioRecordingConfiguration.getClientFormat();
                                    if (clientFormat4.getChannelIndexMask() == audioFormat.getChannelIndexMask()) {
                                        format = audioRecordingConfiguration.getFormat();
                                        if (format.getEncoding() != 0) {
                                            format2 = audioRecordingConfiguration.getFormat();
                                            if (format2.getSampleRate() > 0) {
                                                format3 = audioRecordingConfiguration.getFormat();
                                                if (format3.getChannelMask() == 0) {
                                                    format4 = audioRecordingConfiguration.getFormat();
                                                    if (format4.getChannelIndexMask() == 0) {
                                                        continue;
                                                    }
                                                }
                                                if (checkDeviceMatch(audioDevice, audioDeviceInfo)) {
                                                    Logging.m8411d(TAG, "verifyAudioConfig: PASS");
                                                    return true;
                                                }
                                            } else {
                                                continue;
                                            }
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        Logging.m8410e(TAG, "verifyAudioConfig: FAILED");
        return false;
    }

    @CalledByNative
    boolean isAcousticEchoCancelerSupported() {
        return this.isAcousticEchoCancelerSupported;
    }

    @CalledByNative
    boolean isAudioConfigVerified() {
        return this.audioSourceMatchesRecordingSessionRef.get() != null;
    }

    @CalledByNative
    boolean isAudioSourceMatchingRecordingSession() {
        Boolean bool = this.audioSourceMatchesRecordingSessionRef.get();
        if (bool == null) {
            Logging.m8407w(TAG, "Audio configuration has not yet been verified");
            return false;
        }
        return bool.booleanValue();
    }

    @CalledByNative
    boolean isNoiseSuppressorSupported() {
        return this.isNoiseSuppressorSupported;
    }

    public void setMicrophoneMute(boolean z) {
        Logging.m8407w(TAG, "setMicrophoneMute(" + z + ")");
        this.microphoneMute = z;
    }

    @CalledByNative
    public void setNativeAudioRecord(long j) {
        this.nativeAudioRecord = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(23)
    public void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        Integer num;
        if (audioDeviceInfo != null) {
            num = Integer.valueOf(audioDeviceInfo.getId());
        } else {
            num = null;
        }
        Logging.m8411d(TAG, "setPreferredDevice " + num);
        this.preferredDevice = audioDeviceInfo;
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null && !audioRecord.setPreferredDevice(audioDeviceInfo)) {
            Logging.m8410e(TAG, "setPreferredDevice failed");
        }
    }

    public WebRtcAudioRecord(Context context, ScheduledExecutorService scheduledExecutorService, AudioManager audioManager, int i, int i2, JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback, JavaAudioDeviceModule.AudioRecordStateCallback audioRecordStateCallback, JavaAudioDeviceModule.SamplesReadyCallback samplesReadyCallback, boolean z, boolean z2) {
        this.effects = new WebRtcAudioEffects();
        this.audioSourceMatchesRecordingSessionRef = new AtomicReference<>();
        if (z && !WebRtcAudioEffects.isAcousticEchoCancelerSupported()) {
            throw new IllegalArgumentException("HW AEC not supported");
        }
        if (z2 && !WebRtcAudioEffects.isNoiseSuppressorSupported()) {
            throw new IllegalArgumentException("HW NS not supported");
        }
        this.context = context;
        this.executor = scheduledExecutorService;
        this.audioManager = audioManager;
        this.audioSource = i;
        this.audioFormat = i2;
        this.errorCallback = audioRecordErrorCallback;
        this.stateCallback = audioRecordStateCallback;
        this.audioSamplesReadyCallback = samplesReadyCallback;
        this.isAcousticEchoCancelerSupported = z;
        this.isNoiseSuppressorSupported = z2;
        String threadInfo = WebRtcAudioUtils.getThreadInfo();
        Logging.m8411d(TAG, "ctor" + threadInfo);
    }
}
