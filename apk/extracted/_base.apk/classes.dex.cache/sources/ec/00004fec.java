package vc;

import p368uc.C12947b;
import p368uc.C12948c;

/* renamed from: vc.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13244b {

    /* renamed from: a */
    private final boolean f34298a;

    /* renamed from: b */
    private final C12947b f34299b;

    /* renamed from: c */
    private final C12947b f34300c;

    /* renamed from: d */
    private final C12948c f34301d;

    public C13244b(C12947b c12947b, C12947b c12947b2, C12948c c12948c, boolean z) {
        this.f34299b = c12947b;
        this.f34300c = c12947b2;
        this.f34301d = c12948c;
        this.f34298a = z;
    }

    /* renamed from: a */
    private static boolean m2970a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: e */
    private static int m2966e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: b */
    public C12948c m2969b() {
        return this.f34301d;
    }

    /* renamed from: c */
    public C12947b m2968c() {
        return this.f34299b;
    }

    /* renamed from: d */
    public C12947b m2967d() {
        return this.f34300c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C13244b)) {
            return false;
        }
        C13244b c13244b = (C13244b) obj;
        if (!m2970a(this.f34299b, c13244b.f34299b) || !m2970a(this.f34300c, c13244b.f34300c) || !m2970a(this.f34301d, c13244b.f34301d)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean m2965f() {
        return this.f34300c == null;
    }

    public int hashCode() {
        return (m2966e(this.f34299b) ^ m2966e(this.f34300c)) ^ m2966e(this.f34301d);
    }

    public String toString() {
        Object valueOf;
        StringBuilder sb2 = new StringBuilder("[ ");
        sb2.append(this.f34299b);
        sb2.append(" , ");
        sb2.append(this.f34300c);
        sb2.append(" : ");
        C12948c c12948c = this.f34301d;
        if (c12948c == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(c12948c.m3620c());
        }
        sb2.append(valueOf);
        sb2.append(" ]");
        return sb2.toString();
    }
}