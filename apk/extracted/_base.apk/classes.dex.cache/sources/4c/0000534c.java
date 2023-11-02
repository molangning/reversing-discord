package p461z8;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import p010a9.InterfaceC0097d;
import p010a9.InterfaceC0105h;
import p029b9.AbstractC2150c;
import p029b9.C2158d;
import p029b9.C2198p;
import p029b9.InterfaceC2177j;
import p441y8.C13932c;
import p461z8.AbstractC14124f;
import p461z8.C14107a.InterfaceC14111d;

/* renamed from: z8.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C14107a<O extends InterfaceC14111d> {

    /* renamed from: a */
    private final AbstractC14108a<?, O> f36300a;

    /* renamed from: b */
    private final C14117g<?> f36301b;

    /* renamed from: c */
    private final String f36302c;

    /* renamed from: z8.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC14108a<T extends InterfaceC14116f, O> extends AbstractC14115e<T, O> {
        /* renamed from: a */
        public T mo652a(Context context, Looper looper, C2158d c2158d, O o, InterfaceC0097d interfaceC0097d, InterfaceC0105h interfaceC0105h) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }

        @Deprecated
        /* renamed from: b */
        public T mo651b(Context context, Looper looper, C2158d c2158d, O o, AbstractC14124f.InterfaceC14125a interfaceC14125a, AbstractC14124f.InterfaceC14126b interfaceC14126b) {
            return mo652a(context, looper, c2158d, o, interfaceC14125a, interfaceC14126b);
        }
    }

    /* renamed from: z8.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC14109b {
    }

    /* renamed from: z8.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C14110c<C extends InterfaceC14109b> {
    }

    /* renamed from: z8.a$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC14111d {

        /* renamed from: i */
        public static final C14114c f36303i = new C14114c(null);

        /* renamed from: z8.a$d$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public interface InterfaceC14112a extends InterfaceC14111d {
            /* renamed from: k */
            Account m650k();
        }

        /* renamed from: z8.a$d$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public interface InterfaceC14113b extends InterfaceC14111d {
            /* renamed from: e */
            GoogleSignInAccount m649e();
        }

        /* renamed from: z8.a$d$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public static final class C14114c implements InterfaceC14111d {
            private C14114c() {
            }

            /* synthetic */ C14114c(C14135n c14135n) {
            }
        }
    }

    /* renamed from: z8.a$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC14115e<T extends InterfaceC14109b, O> {
    }

    /* renamed from: z8.a$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC14116f extends InterfaceC14109b {
        /* renamed from: a */
        boolean mo648a();

        /* renamed from: b */
        void mo647b(String str);

        /* renamed from: c */
        boolean mo646c();

        /* renamed from: d */
        String mo645d();

        /* renamed from: e */
        boolean mo644e();

        /* renamed from: f */
        void mo643f(AbstractC2150c.InterfaceC2153c interfaceC2153c);

        /* renamed from: g */
        boolean mo642g();

        /* renamed from: i */
        Set<Scope> mo641i();

        /* renamed from: j */
        void mo640j(InterfaceC2177j interfaceC2177j, Set<Scope> set);

        /* renamed from: l */
        void mo639l();

        /* renamed from: m */
        int mo638m();

        /* renamed from: n */
        C13932c[] mo637n();

        /* renamed from: o */
        void mo636o(AbstractC2150c.InterfaceC2155e interfaceC2155e);

        /* renamed from: p */
        String mo635p();
    }

    /* renamed from: z8.a$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C14117g<C extends InterfaceC14116f> extends C14110c<C> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends InterfaceC14116f> C14107a(String str, AbstractC14108a<C, O> abstractC14108a, C14117g<C> c14117g) {
        C2198p.m33984k(abstractC14108a, "Cannot construct an Api with a null ClientBuilder");
        C2198p.m33984k(c14117g, "Cannot construct an Api with a null ClientKey");
        this.f36302c = str;
        this.f36300a = abstractC14108a;
        this.f36301b = c14117g;
    }

    /* renamed from: a */
    public final AbstractC14108a<?, O> m655a() {
        return this.f36300a;
    }

    /* renamed from: b */
    public final C14110c<?> m654b() {
        return this.f36301b;
    }

    /* renamed from: c */
    public final String m653c() {
        return this.f36302c;
    }
}