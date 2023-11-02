package p176ja;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p145i0.C7372a;
import p145i0.C7373b;
import p145i0.C7374c;

/* renamed from: ja.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C8878a {

    /* renamed from: a */
    public static final TimeInterpolator f23260a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f23261b = new C7373b();

    /* renamed from: c */
    public static final TimeInterpolator f23262c = new C7372a();

    /* renamed from: d */
    public static final TimeInterpolator f23263d = new C7374c();

    /* renamed from: e */
    public static final TimeInterpolator f23264e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m17112a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: b */
    public static float m17111b(float f, float f2, float f3, float f4, float f5) {
        return f5 < f3 ? f : f5 > f4 ? f2 : m17112a(f, f2, (f5 - f3) / (f4 - f3));
    }

    /* renamed from: c */
    public static int m17110c(int i, int i2, float f) {
        return i + Math.round(f * (i2 - i));
    }
}
