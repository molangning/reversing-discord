package org.webrtc.audio;

import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.NoiseSuppressor;
import com.facebook.react.uimanager.ViewProps;
import java.util.UUID;
import org.webrtc.Logging;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
class WebRtcAudioEffects {
    private static final UUID AOSP_ACOUSTIC_ECHO_CANCELER = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    private static final UUID AOSP_NOISE_SUPPRESSOR = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");
    private static final boolean DEBUG = false;
    private static final String TAG = "WebRtcAudioEffectsExternal";
    private static AudioEffect.Descriptor[] cachedEffects;
    private AcousticEchoCanceler aec;

    /* renamed from: ns */
    private NoiseSuppressor f29514ns;
    private boolean shouldEnableAec;
    private boolean shouldEnableNs;

    public WebRtcAudioEffects() {
        String threadInfo = WebRtcAudioUtils.getThreadInfo();
        Logging.m8411d(TAG, "ctor" + threadInfo);
    }

    private static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private boolean effectTypeIsVoIP(UUID uuid) {
        if ((AudioEffect.EFFECT_TYPE_AEC.equals(uuid) && isAcousticEchoCancelerSupported()) || (AudioEffect.EFFECT_TYPE_NS.equals(uuid) && isNoiseSuppressorSupported())) {
            return true;
        }
        return false;
    }

    private static AudioEffect.Descriptor[] getAvailableEffects() {
        AudioEffect.Descriptor[] descriptorArr = cachedEffects;
        if (descriptorArr != null) {
            return descriptorArr;
        }
        AudioEffect.Descriptor[] queryEffects = AudioEffect.queryEffects();
        cachedEffects = queryEffects;
        return queryEffects;
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC, AOSP_ACOUSTIC_ECHO_CANCELER);
    }

    private static boolean isEffectTypeAvailable(UUID uuid, UUID uuid2) {
        AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
        if (availableEffects == null) {
            return false;
        }
        for (AudioEffect.Descriptor descriptor : availableEffects) {
            if (descriptor.type.equals(uuid)) {
                return !descriptor.uuid.equals(uuid2);
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorSupported() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS, AOSP_NOISE_SUPPRESSOR);
    }

    public void enable(int i) {
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        String str2;
        String str3;
        Logging.m8411d(TAG, "enable(audioSession=" + i + ")");
        boolean z4 = true;
        if (this.aec == null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        if (this.f29514ns == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        assertTrue(z2);
        boolean isAcousticEchoCancelerSupported = isAcousticEchoCancelerSupported();
        String str4 = ViewProps.ENABLED;
        if (isAcousticEchoCancelerSupported) {
            AcousticEchoCanceler create = AcousticEchoCanceler.create(i);
            this.aec = create;
            if (create != null) {
                boolean enabled = create.getEnabled();
                if (this.shouldEnableAec && isAcousticEchoCancelerSupported()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (this.aec.setEnabled(z3) != 0) {
                    Logging.m8410e(TAG, "Failed to set the AcousticEchoCanceler state");
                }
                if (!enabled) {
                    str2 = "disabled";
                } else {
                    str2 = ViewProps.ENABLED;
                }
                if (!this.aec.getEnabled()) {
                    str3 = "disabled";
                } else {
                    str3 = ViewProps.ENABLED;
                }
                Logging.m8411d(TAG, "AcousticEchoCanceler: was " + str2 + ", enable: " + z3 + ", is now: " + str3);
            } else {
                Logging.m8410e(TAG, "Failed to create the AcousticEchoCanceler instance");
            }
        }
        if (isNoiseSuppressorSupported()) {
            NoiseSuppressor create2 = NoiseSuppressor.create(i);
            this.f29514ns = create2;
            if (create2 != null) {
                boolean enabled2 = create2.getEnabled();
                if (!this.shouldEnableNs || !isNoiseSuppressorSupported()) {
                    z4 = false;
                }
                if (this.f29514ns.setEnabled(z4) != 0) {
                    Logging.m8410e(TAG, "Failed to set the NoiseSuppressor state");
                }
                if (!enabled2) {
                    str = "disabled";
                } else {
                    str = ViewProps.ENABLED;
                }
                if (!this.f29514ns.getEnabled()) {
                    str4 = "disabled";
                }
                Logging.m8411d(TAG, "NoiseSuppressor: was " + str + ", enable: " + z4 + ", is now: " + str4);
                return;
            }
            Logging.m8410e(TAG, "Failed to create the NoiseSuppressor instance");
        }
    }

    public void release() {
        Logging.m8411d(TAG, "release");
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            this.aec = null;
        }
        NoiseSuppressor noiseSuppressor = this.f29514ns;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            this.f29514ns = null;
        }
    }

    public boolean setAEC(boolean z) {
        Logging.m8411d(TAG, "setAEC(" + z + ")");
        if (!isAcousticEchoCancelerSupported()) {
            Logging.m8407w(TAG, "Platform AEC is not supported");
            this.shouldEnableAec = false;
            return false;
        } else if (this.aec != null && z != this.shouldEnableAec) {
            Logging.m8410e(TAG, "Platform AEC state can't be modified while recording");
            return false;
        } else {
            this.shouldEnableAec = z;
            return true;
        }
    }

    public boolean setNS(boolean z) {
        Logging.m8411d(TAG, "setNS(" + z + ")");
        if (!isNoiseSuppressorSupported()) {
            Logging.m8407w(TAG, "Platform NS is not supported");
            this.shouldEnableNs = false;
            return false;
        } else if (this.f29514ns != null && z != this.shouldEnableNs) {
            Logging.m8410e(TAG, "Platform NS state can't be modified while recording");
            return false;
        } else {
            this.shouldEnableNs = z;
            return true;
        }
    }
}
