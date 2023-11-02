package p136hc;

import mc.C10434a;

/* renamed from: hc.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C7069o {

    /* renamed from: a */
    private final float f19364a;

    /* renamed from: b */
    private final float f19365b;

    public C7069o(float f, float f2) {
        this.f19364a = f;
        this.f19365b = f2;
    }

    /* renamed from: a */
    private static float m21457a(C7069o c7069o, C7069o c7069o2, C7069o c7069o3) {
        float f = c7069o2.f19364a;
        float f2 = c7069o2.f19365b;
        return ((c7069o3.f19364a - f) * (c7069o.f19365b - f2)) - ((c7069o3.f19365b - f2) * (c7069o.f19364a - f));
    }

    /* renamed from: b */
    public static float m21456b(C7069o c7069o, C7069o c7069o2) {
        return C10434a.m11571a(c7069o.f19364a, c7069o.f19365b, c7069o2.f19364a, c7069o2.f19365b);
    }

    /* renamed from: e */
    public static void m21453e(C7069o[] c7069oArr) {
        C7069o c7069o;
        C7069o c7069o2;
        C7069o c7069o3;
        float m21456b = m21456b(c7069oArr[0], c7069oArr[1]);
        float m21456b2 = m21456b(c7069oArr[1], c7069oArr[2]);
        float m21456b3 = m21456b(c7069oArr[0], c7069oArr[2]);
        if (m21456b2 >= m21456b && m21456b2 >= m21456b3) {
            c7069o = c7069oArr[0];
            c7069o2 = c7069oArr[1];
            c7069o3 = c7069oArr[2];
        } else if (m21456b3 >= m21456b2 && m21456b3 >= m21456b) {
            c7069o = c7069oArr[1];
            c7069o2 = c7069oArr[0];
            c7069o3 = c7069oArr[2];
        } else {
            c7069o = c7069oArr[2];
            c7069o2 = c7069oArr[0];
            c7069o3 = c7069oArr[1];
        }
        if (m21457a(c7069o2, c7069o, c7069o3) < 0.0f) {
            C7069o c7069o4 = c7069o3;
            c7069o3 = c7069o2;
            c7069o2 = c7069o4;
        }
        c7069oArr[0] = c7069o2;
        c7069oArr[1] = c7069o;
        c7069oArr[2] = c7069o3;
    }

    /* renamed from: c */
    public final float m21455c() {
        return this.f19364a;
    }

    /* renamed from: d */
    public final float m21454d() {
        return this.f19365b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7069o) {
            C7069o c7069o = (C7069o) obj;
            if (this.f19364a == c7069o.f19364a && this.f19365b == c7069o.f19365b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f19364a) * 31) + Float.floatToIntBits(this.f19365b);
    }

    public final String toString() {
        return "(" + this.f19364a + ',' + this.f19365b + ')';
    }
}
