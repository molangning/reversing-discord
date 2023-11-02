package org.webrtc.audio;

import android.media.AudioManager;
import com.facebook.react.uimanager.ViewProps;
import java.util.Timer;
import java.util.TimerTask;
import org.webrtc.Logging;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class VolumeLogger {
    private static final String TAG = "VolumeLogger";
    private static final String THREAD_NAME = "WebRtcVolumeLevelLoggerThread";
    private static final int TIMER_PERIOD_IN_SECONDS = 30;
    private final AudioManager audioManager;
    private Timer timer;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public class LogVolumeTask extends TimerTask {
        private final int maxRingVolume;
        private final int maxVoiceCallVolume;

        LogVolumeTask(int i, int i2) {
            VolumeLogger.this = r1;
            this.maxRingVolume = i;
            this.maxVoiceCallVolume = i2;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            int mode = VolumeLogger.this.audioManager.getMode();
            if (mode == 1) {
                int streamVolume = VolumeLogger.this.audioManager.getStreamVolume(2);
                int i = this.maxRingVolume;
                Logging.m8411d(VolumeLogger.TAG, "STREAM_RING stream volume: " + streamVolume + " (max=" + i + ")");
            } else if (mode == 3) {
                int streamVolume2 = VolumeLogger.this.audioManager.getStreamVolume(0);
                int i2 = this.maxVoiceCallVolume;
                Logging.m8411d(VolumeLogger.TAG, "VOICE_CALL stream volume: " + streamVolume2 + " (max=" + i2 + ")");
            }
        }
    }

    public VolumeLogger(AudioManager audioManager) {
        this.audioManager = audioManager;
    }

    public void start() {
        String threadInfo = WebRtcAudioUtils.getThreadInfo();
        Logging.m8411d(TAG, ViewProps.START + threadInfo);
        if (this.timer != null) {
            return;
        }
        String modeToString = WebRtcAudioUtils.modeToString(this.audioManager.getMode());
        Logging.m8411d(TAG, "audio mode is: " + modeToString);
        Timer timer = new Timer(THREAD_NAME);
        this.timer = timer;
        timer.schedule(new LogVolumeTask(this.audioManager.getStreamMaxVolume(2), this.audioManager.getStreamMaxVolume(0)), 0L, 30000L);
    }

    public void stop() {
        String threadInfo = WebRtcAudioUtils.getThreadInfo();
        Logging.m8411d(TAG, "stop" + threadInfo);
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
            this.timer = null;
        }
    }
}