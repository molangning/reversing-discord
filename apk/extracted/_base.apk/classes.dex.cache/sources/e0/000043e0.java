package p247nb;

/* renamed from: nb.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10558q {

    /* renamed from: a */
    private final Class<?> f27557a;

    /* renamed from: b */
    private final int f27558b;

    /* renamed from: c */
    private final int f27559c;

    private C10558q(Class<?> cls, int i, int i2) {
        this.f27557a = (Class) C10532c0.m11312c(cls, "Null dependency anInterface.");
        this.f27558b = i;
        this.f27559c = i2;
    }

    /* renamed from: a */
    private static String m11242a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return "deferred";
                }
                throw new AssertionError("Unsupported injection: " + i);
            }
            return "provider";
        }
        return "direct";
    }

    @Deprecated
    /* renamed from: g */
    public static C10558q m11236g(Class<?> cls) {
        return new C10558q(cls, 0, 0);
    }

    /* renamed from: h */
    public static C10558q m11235h(Class<?> cls) {
        return new C10558q(cls, 0, 1);
    }

    /* renamed from: i */
    public static C10558q m11234i(Class<?> cls) {
        return new C10558q(cls, 1, 0);
    }

    /* renamed from: j */
    public static C10558q m11233j(Class<?> cls) {
        return new C10558q(cls, 1, 1);
    }

    /* renamed from: k */
    public static C10558q m11232k(Class<?> cls) {
        return new C10558q(cls, 2, 0);
    }

    /* renamed from: b */
    public Class<?> m11241b() {
        return this.f27557a;
    }

    /* renamed from: c */
    public boolean m11240c() {
        return this.f27559c == 2;
    }

    /* renamed from: d */
    public boolean m11239d() {
        return this.f27559c == 0;
    }

    /* renamed from: e */
    public boolean m11238e() {
        return this.f27558b == 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10558q)) {
            return false;
        }
        C10558q c10558q = (C10558q) obj;
        if (this.f27557a != c10558q.f27557a || this.f27558b != c10558q.f27558b || this.f27559c != c10558q.f27559c) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean m11237f() {
        return this.f27558b == 2;
    }

    public int hashCode() {
        return ((((this.f27557a.hashCode() ^ 1000003) * 1000003) ^ this.f27558b) * 1000003) ^ this.f27559c;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f27557a);
        sb2.append(", type=");
        int i = this.f27558b;
        if (i == 1) {
            str = "required";
        } else if (i == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        sb2.append(m11242a(this.f27559c));
        sb2.append("}");
        return sb2.toString();
    }
}