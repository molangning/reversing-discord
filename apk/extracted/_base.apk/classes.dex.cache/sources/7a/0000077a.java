package androidx.media;

import android.media.AudioAttributes;
import android.os.Build;
import android.util.SparseIntArray;
import p342t0.InterfaceC12569b;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class AudioAttributesCompat implements InterfaceC12569b {

    /* renamed from: b */
    private static final SparseIntArray f4549b;

    /* renamed from: c */
    static boolean f4550c;

    /* renamed from: d */
    private static final int[] f4551d;

    /* renamed from: a */
    public AudioAttributesImpl f4552a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4549b = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
        f4551d = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    public AudioAttributesCompat() {
    }

    /* renamed from: a */
    public static int m35966a(boolean z, int i, int i2) {
        if ((i & 1) == 1) {
            return z ? 1 : 7;
        } else if ((i & 4) == 4) {
            return z ? 0 : 6;
        } else {
            switch (i2) {
                case 0:
                case 1:
                case 12:
                case 14:
                case 16:
                    return 3;
                case 2:
                    return 0;
                case 3:
                    return z ? 0 : 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                case 11:
                    return 10;
                case 13:
                    return 1;
                case 15:
                default:
                    if (z) {
                        throw new IllegalArgumentException("Unknown usage value " + i2 + " in audio attributes");
                    }
                    return 3;
            }
        }
    }

    /* renamed from: b */
    public static String m35965b(int i) {
        switch (i) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 15:
            default:
                return "unknown usage " + i;
            case 16:
                return "USAGE_ASSISTANT";
        }
    }

    /* renamed from: c */
    public static AudioAttributesCompat m35964c(Object obj) {
        if (f4550c) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return new AudioAttributesCompat(new AudioAttributesImplApi26((AudioAttributes) obj));
        }
        return new AudioAttributesCompat(new AudioAttributesImplApi21((AudioAttributes) obj));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f4552a;
        if (audioAttributesImpl == null) {
            if (audioAttributesCompat.f4552a != null) {
                return false;
            }
            return true;
        }
        return audioAttributesImpl.equals(audioAttributesCompat.f4552a);
    }

    public int hashCode() {
        return this.f4552a.hashCode();
    }

    public String toString() {
        return this.f4552a.toString();
    }

    AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.f4552a = audioAttributesImpl;
    }
}