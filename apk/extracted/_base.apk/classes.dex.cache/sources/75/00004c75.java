package p331s1;

/* renamed from: s1.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C12357d {

    /* renamed from: a */
    private String f32185a;

    /* renamed from: s1.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C12358a {

        /* renamed from: a */
        private String f32186a;

        /* synthetic */ C12358a(C12388v c12388v) {
        }

        /* renamed from: a */
        public C12357d m5430a() {
            String str = this.f32186a;
            if (str != null) {
                C12357d c12357d = new C12357d(null);
                c12357d.f32185a = str;
                return c12357d;
            }
            throw new IllegalArgumentException("Purchase token must be set");
        }

        /* renamed from: b */
        public C12358a m5429b(String str) {
            this.f32186a = str;
            return this;
        }
    }

    /* synthetic */ C12357d(C12389w c12389w) {
    }

    /* renamed from: b */
    public static C12358a m5432b() {
        return new C12358a(null);
    }

    /* renamed from: a */
    public String m5433a() {
        return this.f32185a;
    }
}