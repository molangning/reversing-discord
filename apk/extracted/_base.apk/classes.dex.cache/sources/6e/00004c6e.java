package p331s1;

/* renamed from: s1.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C12350a {

    /* renamed from: a */
    private String f32183a;

    /* renamed from: s1.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C12351a {

        /* renamed from: a */
        private String f32184a;

        /* synthetic */ C12351a(C12374k c12374k) {
        }

        /* renamed from: a */
        public C12350a m5436a() {
            String str = this.f32184a;
            if (str != null) {
                C12350a c12350a = new C12350a(null);
                c12350a.f32183a = str;
                return c12350a;
            }
            throw new IllegalArgumentException("Purchase token must be set");
        }

        /* renamed from: b */
        public C12351a m5435b(String str) {
            this.f32184a = str;
            return this;
        }
    }

    /* synthetic */ C12350a(C12385s c12385s) {
    }

    /* renamed from: b */
    public static C12351a m5438b() {
        return new C12351a(null);
    }

    /* renamed from: a */
    public String m5439a() {
        return this.f32183a;
    }
}