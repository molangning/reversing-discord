package p461z8;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.AbstractC4612b;
import com.google.android.gms.common.api.internal.AbstractC4627h;
import com.google.android.gms.common.api.internal.C4614c;
import com.google.android.gms.common.api.internal.C4616d;
import com.google.android.gms.common.api.internal.C4620e;
import com.google.android.gms.common.api.internal.C4624g;
import com.google.android.gms.common.api.internal.C4638m;
import com.google.android.gms.common.api.internal.C4649t;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p010a9.BinderC0100e0;
import p010a9.C0091a;
import p010a9.C0093b;
import p010a9.C0119q;
import p010a9.InterfaceC0111k;
import p010a9.ServiceConnectionC0103g;
import p029b9.AbstractC2150c;
import p029b9.C2158d;
import p029b9.C2198p;
import p119g9.C6587j;
import p461z8.C14107a;
import p461z8.C14107a.InterfaceC14111d;

/* renamed from: z8.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC14121e<O extends C14107a.InterfaceC14111d> {

    /* renamed from: a */
    private final Context f36306a;

    /* renamed from: b */
    private final String f36307b;

    /* renamed from: c */
    private final C14107a<O> f36308c;

    /* renamed from: d */
    private final O f36309d;

    /* renamed from: e */
    private final C0093b<O> f36310e;

    /* renamed from: f */
    private final Looper f36311f;

    /* renamed from: g */
    private final int f36312g;
    @NotOnlyInitialized

    /* renamed from: h */
    private final AbstractC14124f f36313h;

    /* renamed from: i */
    private final InterfaceC0111k f36314i;

    /* renamed from: j */
    protected final C4614c f36315j;

    /* renamed from: z8.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C14122a {

        /* renamed from: c */
        public static final C14122a f36316c = new C14123a().m610a();

        /* renamed from: a */
        public final InterfaceC0111k f36317a;

        /* renamed from: b */
        public final Looper f36318b;

        /* renamed from: z8.e$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public static class C14123a {

            /* renamed from: a */
            private InterfaceC0111k f36319a;

            /* renamed from: b */
            private Looper f36320b;

            /* renamed from: a */
            public C14122a m610a() {
                if (this.f36319a == null) {
                    this.f36319a = new C0091a();
                }
                if (this.f36320b == null) {
                    this.f36320b = Looper.getMainLooper();
                }
                return new C14122a(this.f36319a, this.f36320b);
            }

            /* renamed from: b */
            public C14123a m609b(Looper looper) {
                C2198p.m33984k(looper, "Looper must not be null.");
                this.f36320b = looper;
                return this;
            }

            /* renamed from: c */
            public C14123a m608c(InterfaceC0111k interfaceC0111k) {
                C2198p.m33984k(interfaceC0111k, "StatusExceptionMapper must not be null.");
                this.f36319a = interfaceC0111k;
                return this;
            }
        }

        private C14122a(InterfaceC0111k interfaceC0111k, Account account, Looper looper) {
            this.f36317a = interfaceC0111k;
            this.f36318b = looper;
        }
    }

    public AbstractC14121e(Activity activity, C14107a<O> c14107a, O o, C14122a c14122a) {
        this(activity, activity, c14107a, o, c14122a);
    }

    /* renamed from: A */
    private final <A extends C14107a.InterfaceC14109b, T extends AbstractC4612b<? extends InterfaceC14132k, A>> T m631A(int i, T t) {
        t.zak();
        this.f36315j.m28214G(this, i, t);
        return t;
    }

    /* renamed from: B */
    private final <TResult, A extends C14107a.InterfaceC14109b> Task<TResult> m630B(int i, AbstractC4627h<A, TResult> abstractC4627h) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f36315j.m28213H(this, i, abstractC4627h, taskCompletionSource, this.f36314i);
        return taskCompletionSource.m28013a();
    }

    /* renamed from: h */
    public AbstractC14124f m629h() {
        return this.f36313h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public C2158d.C2159a mo628i() {
        Account account;
        Set<Scope> emptySet;
        GoogleSignInAccount m649e;
        C2158d.C2159a c2159a = new C2158d.C2159a();
        O o = this.f36309d;
        if ((o instanceof C14107a.InterfaceC14111d.InterfaceC14113b) && (m649e = ((C14107a.InterfaceC14111d.InterfaceC14113b) o).m649e()) != null) {
            account = m649e.m28290k();
        } else {
            O o2 = this.f36309d;
            if (o2 instanceof C14107a.InterfaceC14111d.InterfaceC14112a) {
                account = ((C14107a.InterfaceC14111d.InterfaceC14112a) o2).m650k();
            } else {
                account = null;
            }
        }
        c2159a.m34059d(account);
        O o3 = this.f36309d;
        if (o3 instanceof C14107a.InterfaceC14111d.InterfaceC14113b) {
            GoogleSignInAccount m649e2 = ((C14107a.InterfaceC14111d.InterfaceC14113b) o3).m649e();
            if (m649e2 == null) {
                emptySet = Collections.emptySet();
            } else {
                emptySet = m649e2.m28296M();
            }
        } else {
            emptySet = Collections.emptySet();
        }
        c2159a.m34060c(emptySet);
        c2159a.m34058e(this.f36306a.getClass().getName());
        c2159a.m34061b(this.f36306a.getPackageName());
        return c2159a;
    }

    /* renamed from: j */
    public <TResult, A extends C14107a.InterfaceC14109b> Task<TResult> m627j(AbstractC4627h<A, TResult> abstractC4627h) {
        return m630B(2, abstractC4627h);
    }

    /* renamed from: k */
    public <A extends C14107a.InterfaceC14109b, T extends AbstractC4612b<? extends InterfaceC14132k, A>> T m626k(T t) {
        m631A(0, t);
        return t;
    }

    /* renamed from: l */
    public <TResult, A extends C14107a.InterfaceC14109b> Task<TResult> m625l(AbstractC4627h<A, TResult> abstractC4627h) {
        return m630B(0, abstractC4627h);
    }

    /* renamed from: m */
    public <A extends C14107a.InterfaceC14109b> Task<Void> m624m(C4624g<A, ?> c4624g) {
        C2198p.m33985j(c4624g);
        C2198p.m33984k(c4624g.f12703a.m28177b(), "Listener has already been released.");
        C2198p.m33984k(c4624g.f12704b.m28153a(), "Listener has already been released.");
        return this.f36315j.m28220A(this, c4624g.f12703a, c4624g.f12704b, c4624g.f12705c);
    }

    /* renamed from: n */
    public Task<Boolean> m623n(C4616d.C4617a<?> c4617a) {
        return m622o(c4617a, 0);
    }

    /* renamed from: o */
    public Task<Boolean> m622o(C4616d.C4617a<?> c4617a, int i) {
        C2198p.m33984k(c4617a, "Listener key cannot be null.");
        return this.f36315j.m28219B(this, c4617a, i);
    }

    /* renamed from: p */
    public <A extends C14107a.InterfaceC14109b, T extends AbstractC4612b<? extends InterfaceC14132k, A>> T m621p(T t) {
        m631A(1, t);
        return t;
    }

    /* renamed from: q */
    public <TResult, A extends C14107a.InterfaceC14109b> Task<TResult> m620q(AbstractC4627h<A, TResult> abstractC4627h) {
        return m630B(1, abstractC4627h);
    }

    /* renamed from: r */
    public final C0093b<O> m619r() {
        return this.f36310e;
    }

    /* renamed from: s */
    public O m618s() {
        return this.f36309d;
    }

    /* renamed from: t */
    public Context m617t() {
        return this.f36306a;
    }

    /* renamed from: u */
    protected String m616u() {
        return this.f36307b;
    }

    /* renamed from: v */
    public Looper m615v() {
        return this.f36311f;
    }

    /* renamed from: w */
    public <L> C4616d<L> m614w(L l, String str) {
        return C4620e.m28180a(l, this.f36311f, str);
    }

    /* renamed from: x */
    public final int m613x() {
        return this.f36312g;
    }

    /* renamed from: y */
    public final C14107a.InterfaceC14116f m612y(Looper looper, C4649t<O> c4649t) {
        C14107a.InterfaceC14116f mo651b = ((C14107a.AbstractC14108a) C2198p.m33985j(this.f36308c.m655a())).mo651b(this.f36306a, looper, mo628i().m34062a(), this.f36309d, c4649t, c4649t);
        String m616u = m616u();
        if (m616u != null && (mo651b instanceof AbstractC2150c)) {
            ((AbstractC2150c) mo651b).m34105O(m616u);
        }
        if (m616u != null && (mo651b instanceof ServiceConnectionC0103g)) {
            ((ServiceConnectionC0103g) mo651b).m41141r(m616u);
        }
        return mo651b;
    }

    /* renamed from: z */
    public final BinderC0100e0 m611z(Context context, Handler handler) {
        return new BinderC0100e0(context, handler, mo628i().m34062a());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC14121e(android.app.Activity r2, p461z8.C14107a<O> r3, O r4, p010a9.InterfaceC0111k r5) {
        /*
            r1 = this;
            z8.e$a$a r0 = new z8.e$a$a
            r0.<init>()
            r0.m608c(r5)
            android.os.Looper r5 = r2.getMainLooper()
            r0.m609b(r5)
            z8.e$a r5 = r0.m610a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p461z8.AbstractC14121e.<init>(android.app.Activity, z8.a, z8.a$d, a9.k):void");
    }

    private AbstractC14121e(Context context, Activity activity, C14107a<O> c14107a, O o, C14122a c14122a) {
        C2198p.m33984k(context, "Null context is not permitted.");
        C2198p.m33984k(c14107a, "Api must not be null.");
        C2198p.m33984k(c14122a, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f36306a = context.getApplicationContext();
        String str = null;
        if (C6587j.m22357k()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f36307b = str;
        this.f36308c = c14107a;
        this.f36309d = o;
        this.f36311f = c14122a.f36318b;
        C0093b<O> m41153a = C0093b.m41153a(c14107a, o, str);
        this.f36310e = m41153a;
        this.f36313h = new C0119q(this);
        C4614c m28186y = C4614c.m28186y(this.f36306a);
        this.f36315j = m28186y;
        this.f36312g = m28186y.m28197n();
        this.f36314i = c14122a.f36317a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C4638m.m28130u(activity, m28186y, m41153a);
        }
        m28186y.m28208c(this);
    }

    public AbstractC14121e(Context context, C14107a<O> c14107a, O o, C14122a c14122a) {
        this(context, null, c14107a, o, c14122a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC14121e(android.content.Context r2, p461z8.C14107a<O> r3, O r4, p010a9.InterfaceC0111k r5) {
        /*
            r1 = this;
            z8.e$a$a r0 = new z8.e$a$a
            r0.<init>()
            r0.m608c(r5)
            z8.e$a r5 = r0.m610a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p461z8.AbstractC14121e.<init>(android.content.Context, z8.a, z8.a$d, a9.k):void");
    }
}
