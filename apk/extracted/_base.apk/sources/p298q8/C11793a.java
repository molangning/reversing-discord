package p298q8;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import p029b9.C2190n;
import p283p9.C11477l;
import p318r8.InterfaceC12108c;
import p350t8.InterfaceC12604a;
import p365u8.InterfaceC12888a;
import p384v8.C13149h;
import p461z8.C14107a;

/* renamed from: q8.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11793a {
    @Deprecated

    /* renamed from: a */
    public static final C14107a<C11797c> f30770a;

    /* renamed from: b */
    public static final C14107a<C11794a> f30771b;

    /* renamed from: c */
    public static final C14107a<GoogleSignInOptions> f30772c;
    @Deprecated

    /* renamed from: d */
    public static final InterfaceC12604a f30773d;

    /* renamed from: e */
    public static final InterfaceC12108c f30774e;

    /* renamed from: f */
    public static final InterfaceC12888a f30775f;

    /* renamed from: g */
    public static final C14107a.C14117g f30776g;

    /* renamed from: h */
    public static final C14107a.C14117g f30777h;

    /* renamed from: i */
    private static final C14107a.AbstractC14108a f30778i;

    /* renamed from: j */
    private static final C14107a.AbstractC14108a f30779j;

    @Deprecated
    /* renamed from: q8.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C11794a implements C14107a.InterfaceC14111d {

        /* renamed from: m */
        public static final C11794a f30780m = new C11794a(new C11795a());

        /* renamed from: j */
        private final String f30781j = null;

        /* renamed from: k */
        private final boolean f30782k;

        /* renamed from: l */
        private final String f30783l;

        @Deprecated
        /* renamed from: q8.a$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public static class C11795a {

            /* renamed from: a */
            protected Boolean f30784a;

            /* renamed from: b */
            protected String f30785b;

            public C11795a() {
                this.f30784a = Boolean.FALSE;
            }

            /* renamed from: a */
            public final C11795a m6842a(String str) {
                this.f30785b = str;
                return this;
            }

            public C11795a(C11794a c11794a) {
                this.f30784a = Boolean.FALSE;
                C11794a.m6845b(c11794a);
                this.f30784a = Boolean.valueOf(c11794a.f30782k);
                this.f30785b = c11794a.f30783l;
            }
        }

        public C11794a(C11795a c11795a) {
            this.f30782k = c11795a.f30784a.booleanValue();
            this.f30783l = c11795a.f30785b;
        }

        /* renamed from: b */
        static /* bridge */ /* synthetic */ String m6845b(C11794a c11794a) {
            String str = c11794a.f30781j;
            return null;
        }

        /* renamed from: a */
        public final Bundle m6846a() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", null);
            bundle.putBoolean("force_save_dialog", this.f30782k);
            bundle.putString("log_session_id", this.f30783l);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C11794a)) {
                return false;
            }
            C11794a c11794a = (C11794a) obj;
            String str = c11794a.f30781j;
            if (C2190n.m34004b(null, null) && this.f30782k == c11794a.f30782k && C2190n.m34004b(this.f30783l, c11794a.f30783l)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return C2190n.m34003c(null, Boolean.valueOf(this.f30782k), this.f30783l);
        }
    }

    static {
        C14107a.C14117g c14117g = new C14107a.C14117g();
        f30776g = c14117g;
        C14107a.C14117g c14117g2 = new C14107a.C14117g();
        f30777h = c14117g2;
        C11798d c11798d = new C11798d();
        f30778i = c11798d;
        C11799e c11799e = new C11799e();
        f30779j = c11799e;
        f30770a = C11796b.f30786a;
        f30771b = new C14107a<>("Auth.CREDENTIALS_API", c11798d, c14117g);
        f30772c = new C14107a<>("Auth.GOOGLE_SIGN_IN_API", c11799e, c14117g2);
        f30773d = C11796b.f30787b;
        f30774e = new C11477l();
        f30775f = new C13149h();
    }
}
