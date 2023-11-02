package sa;

import android.content.Context;
import android.graphics.Color;
import androidx.core.graphics.C0995a;
import p155ia.C7480b;
import p443ya.C13956b;
import pa.C11487a;

/* renamed from: sa.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12443a {

    /* renamed from: f */
    private static final int f32378f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a */
    private final boolean f32379a;

    /* renamed from: b */
    private final int f32380b;

    /* renamed from: c */
    private final int f32381c;

    /* renamed from: d */
    private final int f32382d;

    /* renamed from: e */
    private final float f32383e;

    public C12443a(Context context) {
        this(C13956b.m1093b(context, C7480b.f20114q, false), C11487a.m8018b(context, C7480b.f20113p, 0), C11487a.m8018b(context, C7480b.f20112o, 0), C11487a.m8018b(context, C7480b.f20110m, 0), context.getResources().getDisplayMetrics().density);
    }

    /* renamed from: e */
    private boolean m5274e(int i) {
        return C0995a.m38177k(i, 255) == this.f32382d;
    }

    /* renamed from: a */
    public float m5278a(float f) {
        float f2 = this.f32383e;
        if (f2 <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    /* renamed from: b */
    public int m5277b(int i, float f) {
        int i2;
        float m5278a = m5278a(f);
        int alpha = Color.alpha(i);
        int m8012h = C11487a.m8012h(C0995a.m38177k(i, 255), this.f32380b, m5278a);
        if (m5278a > 0.0f && (i2 = this.f32381c) != 0) {
            m8012h = C11487a.m8013g(m8012h, C0995a.m38177k(i2, f32378f));
        }
        return C0995a.m38177k(m8012h, alpha);
    }

    /* renamed from: c */
    public int m5276c(int i, float f) {
        if (this.f32379a && m5274e(i)) {
            return m5277b(i, f);
        }
        return i;
    }

    /* renamed from: d */
    public boolean m5275d() {
        return this.f32379a;
    }

    public C12443a(boolean z, int i, int i2, int i3, float f) {
        this.f32379a = z;
        this.f32380b = i;
        this.f32381c = i2;
        this.f32382d = i3;
        this.f32383e = f;
    }
}