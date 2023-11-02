package p029b9;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p441y8.C13930a;
import p441y8.C13932c;
import p441y8.C13935f;

/* renamed from: b9.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC2150c<T extends IInterface> {

    /* renamed from: B */
    private ServiceConnectionC2149b1 f6056B;

    /* renamed from: D */
    private final InterfaceC2151a f6058D;

    /* renamed from: E */
    private final InterfaceC2152b f6059E;

    /* renamed from: F */
    private final int f6060F;

    /* renamed from: G */
    private final String f6061G;

    /* renamed from: H */
    private volatile String f6062H;

    /* renamed from: j */
    private int f6067j;

    /* renamed from: k */
    private long f6068k;

    /* renamed from: l */
    private long f6069l;

    /* renamed from: m */
    private int f6070m;

    /* renamed from: n */
    private long f6071n;

    /* renamed from: p */
    C2200p1 f6073p;

    /* renamed from: q */
    private final Context f6074q;

    /* renamed from: r */
    private final Looper f6075r;

    /* renamed from: s */
    private final AbstractC2171h f6076s;

    /* renamed from: t */
    private final C13935f f6077t;

    /* renamed from: u */
    final Handler f6078u;

    /* renamed from: x */
    private InterfaceC2184l f6081x;

    /* renamed from: y */
    protected InterfaceC2153c f6082y;

    /* renamed from: z */
    private T f6083z;

    /* renamed from: N */
    private static final C13932c[] f6054N = new C13932c[0];

    /* renamed from: M */
    public static final String[] f6053M = {"service_esmobile", "service_googleme"};

    /* renamed from: o */
    private volatile String f6072o = null;

    /* renamed from: v */
    private final Object f6079v = new Object();

    /* renamed from: w */
    private final Object f6080w = new Object();

    /* renamed from: A */
    private final ArrayList<AbstractC2224z0<?>> f6055A = new ArrayList<>();

    /* renamed from: C */
    private int f6057C = 1;

    /* renamed from: I */
    private C13930a f6063I = null;

    /* renamed from: J */
    private boolean f6064J = false;

    /* renamed from: K */
    private volatile C2164e1 f6065K = null;

    /* renamed from: L */
    protected AtomicInteger f6066L = new AtomicInteger(0);

    /* renamed from: b9.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC2151a {
        /* renamed from: b */
        void mo34047b(Bundle bundle);

        /* renamed from: e */
        void mo34046e(int i);
    }

    /* renamed from: b9.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC2152b {
        /* renamed from: c */
        void mo34039c(C13930a c13930a);
    }

    /* renamed from: b9.c$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC2153c {
        /* renamed from: a */
        void mo28068a(C13930a c13930a);
    }

    /* renamed from: b9.c$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    protected class C2154d implements InterfaceC2153c {
        public C2154d() {
            AbstractC2150c.this = r1;
        }

        @Override // p029b9.AbstractC2150c.InterfaceC2153c
        /* renamed from: a */
        public final void mo28068a(C13930a c13930a) {
            if (c13930a.m1146H()) {
                AbstractC2150c abstractC2150c = AbstractC2150c.this;
                abstractC2150c.m34082j(null, abstractC2150c.mo34045B());
            } else if (AbstractC2150c.this.f6059E != null) {
                AbstractC2150c.this.f6059E.mo34039c(c13930a);
            }
        }
    }

    /* renamed from: b9.c$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC2155e {
        /* renamed from: a */
        void mo28113a();
    }

    public AbstractC2150c(Context context, Looper looper, AbstractC2171h abstractC2171h, C13935f c13935f, int i, InterfaceC2151a interfaceC2151a, InterfaceC2152b interfaceC2152b, String str) {
        C2198p.m33984k(context, "Context must not be null");
        this.f6074q = context;
        C2198p.m33984k(looper, "Looper must not be null");
        this.f6075r = looper;
        C2198p.m33984k(abstractC2171h, "Supervisor must not be null");
        this.f6076s = abstractC2171h;
        C2198p.m33984k(c13935f, "API availability must not be null");
        this.f6077t = c13935f;
        this.f6078u = new HandlerC2222y0(this, looper);
        this.f6060F = i;
        this.f6058D = interfaceC2151a;
        this.f6059E = interfaceC2152b;
        this.f6061G = str;
    }

    /* renamed from: a0 */
    public static /* bridge */ /* synthetic */ void m34093a0(AbstractC2150c abstractC2150c, C2164e1 c2164e1) {
        C2204r m34054J;
        abstractC2150c.f6065K = c2164e1;
        if (abstractC2150c.mo3014Q()) {
            C2162e c2162e = c2164e1.f6117m;
            C2201q m33976b = C2201q.m33976b();
            if (c2162e == null) {
                m34054J = null;
            } else {
                m34054J = c2162e.m34054J();
            }
            m33976b.m33975c(m34054J);
        }
    }

    /* renamed from: b0 */
    public static /* bridge */ /* synthetic */ void m34091b0(AbstractC2150c abstractC2150c, int i) {
        int i2;
        int i3;
        synchronized (abstractC2150c.f6079v) {
            i2 = abstractC2150c.f6057C;
        }
        if (i2 == 3) {
            abstractC2150c.f6064J = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = abstractC2150c.f6078u;
        handler.sendMessage(handler.obtainMessage(i3, abstractC2150c.f6066L.get(), 16));
    }

    /* renamed from: e0 */
    public static /* bridge */ /* synthetic */ boolean m34086e0(AbstractC2150c abstractC2150c, int i, int i2, IInterface iInterface) {
        synchronized (abstractC2150c.f6079v) {
            if (abstractC2150c.f6057C != i) {
                return false;
            }
            abstractC2150c.m34083g0(i2, iInterface);
            return true;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException
        	at java.base/java.util.BitSet.or(BitSet.java:941)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:732)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:811)
        	at jadx.core.dex.visitors.regions.IfMakerHelper.restructureIf(IfMakerHelper.java:88)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:706)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* renamed from: f0 */
    static /* bridge */ /* synthetic */ boolean m34084f0(p029b9.AbstractC2150c r2) {
        /*
            boolean r0 = r2.f6064J
            r1 = 0
            if (r0 == 0) goto L6
            goto L24
        L6:
            java.lang.String r0 = r2.mo3016D()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            goto L24
        L11:
            java.lang.String r0 = r2.m34113A()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
            goto L24
        L1c:
            java.lang.String r2 = r2.mo3016D()     // Catch: java.lang.ClassNotFoundException -> L24
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L24
            r1 = 1
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p029b9.AbstractC2150c.m34084f0(b9.c):boolean");
    }

    /* renamed from: g0 */
    public final void m34083g0(int i, T t) {
        boolean z;
        boolean z2;
        C2200p1 c2200p1;
        String str;
        C2200p1 c2200p12;
        boolean z3 = false;
        if (i != 4) {
            z = false;
        } else {
            z = true;
        }
        if (t == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z == z2) {
            z3 = true;
        }
        C2198p.m33994a(z3);
        synchronized (this.f6079v) {
            this.f6057C = i;
            this.f6083z = t;
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i == 4) {
                        C2198p.m33985j(t);
                        mo3027J(t);
                    }
                } else {
                    ServiceConnectionC2149b1 serviceConnectionC2149b1 = this.f6056B;
                    if (serviceConnectionC2149b1 != null && (c2200p12 = this.f6073p) != null) {
                        String m33979c = c2200p12.m33979c();
                        String m33980b = c2200p12.m33980b();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(m33979c).length() + 70 + String.valueOf(m33980b).length());
                        sb2.append("Calling connect() while still connected, missing disconnect() for ");
                        sb2.append(m33979c);
                        sb2.append(" on ");
                        sb2.append(m33980b);
                        Log.e("GmsClient", sb2.toString());
                        AbstractC2171h abstractC2171h = this.f6076s;
                        String m33979c2 = this.f6073p.m33979c();
                        C2198p.m33985j(m33979c2);
                        abstractC2171h.m34035e(m33979c2, this.f6073p.m33980b(), this.f6073p.m33981a(), serviceConnectionC2149b1, m34099V(), this.f6073p.m33978d());
                        this.f6066L.incrementAndGet();
                    }
                    ServiceConnectionC2149b1 serviceConnectionC2149b12 = new ServiceConnectionC2149b1(this, this.f6066L.get());
                    this.f6056B = serviceConnectionC2149b12;
                    if (this.f6057C == 3 && m34113A() != null) {
                        c2200p1 = new C2200p1(m34075x().getPackageName(), m34113A(), true, AbstractC2171h.m34038a(), false);
                    } else {
                        c2200p1 = new C2200p1(m34111F(), mo3015E(), false, AbstractC2171h.m34038a(), mo24508H());
                    }
                    this.f6073p = c2200p1;
                    if (c2200p1.m33978d() && mo638m() < 17895000) {
                        String valueOf = String.valueOf(this.f6073p.m33979c());
                        if (valueOf.length() != 0) {
                            str = "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf);
                        } else {
                            str = new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ");
                        }
                        throw new IllegalStateException(str);
                    }
                    AbstractC2171h abstractC2171h2 = this.f6076s;
                    String m33979c3 = this.f6073p.m33979c();
                    C2198p.m33985j(m33979c3);
                    if (!abstractC2171h2.mo34011f(new C2176i1(m33979c3, this.f6073p.m33980b(), this.f6073p.m33981a(), this.f6073p.m33978d()), serviceConnectionC2149b12, m34099V(), mo34040v())) {
                        String m33979c4 = this.f6073p.m33979c();
                        String m33980b2 = this.f6073p.m33980b();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(m33979c4).length() + 34 + String.valueOf(m33980b2).length());
                        sb3.append("unable to connect to service: ");
                        sb3.append(m33979c4);
                        sb3.append(" on ");
                        sb3.append(m33980b2);
                        Log.w("GmsClient", sb3.toString());
                        m34089c0(16, null, this.f6066L.get());
                    }
                }
            } else {
                ServiceConnectionC2149b1 serviceConnectionC2149b13 = this.f6056B;
                if (serviceConnectionC2149b13 != null) {
                    AbstractC2171h abstractC2171h3 = this.f6076s;
                    String m33979c5 = this.f6073p.m33979c();
                    C2198p.m33985j(m33979c5);
                    abstractC2171h3.m34035e(m33979c5, this.f6073p.m33980b(), this.f6073p.m33981a(), serviceConnectionC2149b13, m34099V(), this.f6073p.m33978d());
                    this.f6056B = null;
                }
            }
        }
    }

    /* renamed from: A */
    protected String m34113A() {
        return null;
    }

    /* renamed from: B */
    protected Set<Scope> mo34045B() {
        return Collections.emptySet();
    }

    /* renamed from: C */
    public final T m34112C() {
        T t;
        synchronized (this.f6079v) {
            if (this.f6057C != 5) {
                m34078q();
                t = this.f6083z;
                C2198p.m33984k(t, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    /* renamed from: D */
    public abstract String mo3016D();

    /* renamed from: E */
    protected abstract String mo3015E();

    /* renamed from: F */
    protected String m34111F() {
        return "com.google.android.gms";
    }

    /* renamed from: G */
    public C2162e m34110G() {
        C2164e1 c2164e1 = this.f6065K;
        if (c2164e1 == null) {
            return null;
        }
        return c2164e1.f6117m;
    }

    /* renamed from: H */
    protected boolean mo24508H() {
        return mo638m() >= 211700000;
    }

    /* renamed from: I */
    public boolean m34109I() {
        return this.f6065K != null;
    }

    /* renamed from: J */
    public void mo3027J(T t) {
        this.f6069l = System.currentTimeMillis();
    }

    /* renamed from: K */
    public void m34108K(C13930a c13930a) {
        this.f6070m = c13930a.m1144r();
        this.f6071n = System.currentTimeMillis();
    }

    /* renamed from: L */
    public void mo3026L(int i) {
        this.f6067j = i;
        this.f6068k = System.currentTimeMillis();
    }

    /* renamed from: M */
    public void m34107M(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.f6078u;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new C2157c1(this, i, iBinder, bundle)));
    }

    /* renamed from: N */
    public boolean m34106N() {
        return false;
    }

    /* renamed from: O */
    public void m34105O(String str) {
        this.f6062H = str;
    }

    /* renamed from: P */
    public void m34104P(int i) {
        Handler handler = this.f6078u;
        handler.sendMessage(handler.obtainMessage(6, this.f6066L.get(), i));
    }

    /* renamed from: Q */
    public boolean mo3014Q() {
        return false;
    }

    /* renamed from: V */
    protected final String m34099V() {
        String str = this.f6061G;
        return str == null ? this.f6074q.getClass().getName() : str;
    }

    /* renamed from: a */
    public boolean m34094a() {
        boolean z;
        synchronized (this.f6079v) {
            if (this.f6057C == 4) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    public void m34092b(String str) {
        this.f6072o = str;
        mo639l();
    }

    /* renamed from: c */
    public boolean m34090c() {
        boolean z;
        synchronized (this.f6079v) {
            int i = this.f6057C;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: c0 */
    public final void m34089c0(int i, Bundle bundle, int i2) {
        Handler handler = this.f6078u;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new C2161d1(this, i, null)));
    }

    /* renamed from: d */
    public String m34088d() {
        C2200p1 c2200p1;
        if (m34094a() && (c2200p1 = this.f6073p) != null) {
            return c2200p1.m33980b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    /* renamed from: e */
    public boolean mo644e() {
        return true;
    }

    /* renamed from: f */
    public void m34085f(InterfaceC2153c interfaceC2153c) {
        C2198p.m33984k(interfaceC2153c, "Connection progress callbacks cannot be null.");
        this.f6082y = interfaceC2153c;
        m34083g0(2, null);
    }

    /* renamed from: g */
    public boolean mo642g() {
        return false;
    }

    /* renamed from: j */
    public void m34082j(InterfaceC2177j interfaceC2177j, Set<Scope> set) {
        Bundle mo3023z = mo3023z();
        C2165f c2165f = new C2165f(this.f6060F, this.f6062H);
        c2165f.f6121m = this.f6074q.getPackageName();
        c2165f.f6124p = mo3023z;
        if (set != null) {
            c2165f.f6123o = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (mo642g()) {
            Account mo34041t = mo34041t();
            if (mo34041t == null) {
                mo34041t = new Account("<<default account>>", "com.google");
            }
            c2165f.f6125q = mo34041t;
            if (interfaceC2177j != null) {
                c2165f.f6122n = interfaceC2177j.asBinder();
            }
        } else if (m34106N()) {
            c2165f.f6125q = mo34041t();
        }
        c2165f.f6126r = f6054N;
        c2165f.f6127s = mo3024u();
        if (mo3014Q()) {
            c2165f.f6130v = true;
        }
        try {
            synchronized (this.f6080w) {
                InterfaceC2184l interfaceC2184l = this.f6081x;
                if (interfaceC2184l != null) {
                    interfaceC2184l.mo33958j(new BinderC2146a1(this, this.f6066L.get()), c2165f);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            m34104P(3);
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            m34107M(8, null, null, this.f6066L.get());
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            m34107M(8, null, null, this.f6066L.get());
        }
    }

    /* renamed from: l */
    public void mo639l() {
        this.f6066L.incrementAndGet();
        synchronized (this.f6055A) {
            int size = this.f6055A.size();
            for (int i = 0; i < size; i++) {
                this.f6055A.get(i).m33947d();
            }
            this.f6055A.clear();
        }
        synchronized (this.f6080w) {
            this.f6081x = null;
        }
        m34083g0(1, null);
    }

    /* renamed from: m */
    public int mo638m() {
        return C13935f.f35885a;
    }

    /* renamed from: n */
    public final C13932c[] m34081n() {
        C2164e1 c2164e1 = this.f6065K;
        if (c2164e1 == null) {
            return null;
        }
        return c2164e1.f6115k;
    }

    /* renamed from: o */
    public void m34080o(InterfaceC2155e interfaceC2155e) {
        interfaceC2155e.mo28113a();
    }

    /* renamed from: p */
    public String m34079p() {
        return this.f6072o;
    }

    /* renamed from: q */
    protected final void m34078q() {
        if (m34094a()) {
            return;
        }
        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
    }

    /* renamed from: r */
    public abstract T mo3013r(IBinder iBinder);

    /* renamed from: s */
    public boolean m34077s() {
        return false;
    }

    /* renamed from: t */
    public Account mo34041t() {
        return null;
    }

    /* renamed from: u */
    public C13932c[] mo3024u() {
        return f6054N;
    }

    /* renamed from: v */
    protected Executor mo34040v() {
        return null;
    }

    /* renamed from: w */
    public Bundle m34076w() {
        return null;
    }

    /* renamed from: x */
    public final Context m34075x() {
        return this.f6074q;
    }

    /* renamed from: y */
    public int m34074y() {
        return this.f6060F;
    }

    /* renamed from: z */
    public Bundle mo3023z() {
        return new Bundle();
    }
}