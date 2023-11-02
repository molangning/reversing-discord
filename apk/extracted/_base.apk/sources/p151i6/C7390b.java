package p151i6;

import android.content.Context;
import android.media.AudioManager;
import java.util.UUID;
import org.webrtc.MediaStreamTrack;

/* renamed from: i6.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7390b {

    /* renamed from: a */
    public static final UUID f19878a = new UUID(0, 0);

    /* renamed from: b */
    public static final UUID f19879b = new UUID(1186680826959645954L, -5988876978535335093L);

    /* renamed from: c */
    public static final UUID f19880c = new UUID(-2129748144642739255L, 8654423357094679310L);

    /* renamed from: d */
    public static final UUID f19881d = new UUID(-1301668207276963122L, -6645017420763422227L);

    /* renamed from: e */
    public static final UUID f19882e = new UUID(-7348484286925749626L, -6083546864340672619L);

    /* renamed from: a */
    public static int m20794a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    /* renamed from: b */
    public static String m20793b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return "YES";
                        }
                        throw new IllegalStateException();
                    }
                    return "NO_EXCEEDS_CAPABILITIES";
                }
                return "NO_UNSUPPORTED_DRM";
            }
            return "NO_UNSUPPORTED_TYPE";
        }
        return "NO";
    }

    /* renamed from: c */
    public static long m20792c(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    /* renamed from: d */
    public static long m20791d(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }
}
