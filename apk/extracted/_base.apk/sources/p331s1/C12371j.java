package p331s1;

/* renamed from: s1.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C12371j {

    /* renamed from: a */
    private final String f32189a;

    /* renamed from: s1.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C12372a {

        /* renamed from: a */
        private String f32190a;

        /* synthetic */ C12372a(C12363f0 c12363f0) {
        }

        /* renamed from: a */
        public C12371j m5418a() {
            if (this.f32190a != null) {
                return new C12371j(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        /* renamed from: b */
        public C12372a m5417b(String str) {
            this.f32190a = str;
            return this;
        }
    }

    /* synthetic */ C12371j(C12372a c12372a, C12365g0 c12365g0) {
        this.f32189a = c12372a.f32190a;
    }

    /* renamed from: a */
    public static C12372a m5420a() {
        return new C12372a(null);
    }

    /* renamed from: b */
    public final String m5419b() {
        return this.f32189a;
    }
}
