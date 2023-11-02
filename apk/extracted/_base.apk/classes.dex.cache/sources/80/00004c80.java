package p331s1;

/* renamed from: s1.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C12368i {

    /* renamed from: a */
    private final String f32187a;

    /* renamed from: s1.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C12369a {

        /* renamed from: a */
        private String f32188a;

        /* synthetic */ C12369a(C12359d0 c12359d0) {
        }

        /* renamed from: a */
        public C12368i m5423a() {
            if (this.f32188a != null) {
                return new C12368i(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        /* renamed from: b */
        public C12369a m5422b(String str) {
            this.f32188a = str;
            return this;
        }
    }

    /* synthetic */ C12368i(C12369a c12369a, C12361e0 c12361e0) {
        this.f32187a = c12369a.f32188a;
    }

    /* renamed from: a */
    public static C12369a m5425a() {
        return new C12369a(null);
    }

    /* renamed from: b */
    public final String m5424b() {
        return this.f32187a;
    }
}