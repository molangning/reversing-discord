package p193k6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import java.util.Arrays;
import p195k8.C9191p0;

/* renamed from: k6.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9086e {

    /* renamed from: c */
    public static final C9086e f23879c = new C9086e(new int[]{2}, 8);

    /* renamed from: d */
    private static final C9086e f23880d = new C9086e(new int[]{2, 5, 6}, 8);

    /* renamed from: a */
    private final int[] f23881a;

    /* renamed from: b */
    private final int f23882b;

    public C9086e(int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f23881a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f23881a = new int[0];
        }
        this.f23882b = i;
    }

    /* renamed from: a */
    private static boolean m16688a() {
        if (C9191p0.f24171a >= 17) {
            String str = C9191p0.f24173c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static C9086e m16687b(Context context) {
        return m16686c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: c */
    static C9086e m16686c(Context context, Intent intent) {
        if (m16688a() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            return f23880d;
        }
        if (intent != null && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0) {
            return new C9086e(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
        }
        return f23879c;
    }

    /* renamed from: d */
    public int m16685d() {
        return this.f23882b;
    }

    /* renamed from: e */
    public boolean m16684e(int i) {
        return Arrays.binarySearch(this.f23881a, i) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9086e)) {
            return false;
        }
        C9086e c9086e = (C9086e) obj;
        if (Arrays.equals(this.f23881a, c9086e.f23881a) && this.f23882b == c9086e.f23882b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f23882b + (Arrays.hashCode(this.f23881a) * 31);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f23882b + ", supportedEncodings=" + Arrays.toString(this.f23881a) + "]";
    }
}