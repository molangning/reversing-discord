package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.collection.C0626b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4616d;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p010a9.C0093b;
import p010a9.C0104g0;
import p010a9.C0125w;
import p010a9.C0126x;
import p010a9.InterfaceC0111k;
import p029b9.AbstractC2171h;
import p029b9.C2172h0;
import p029b9.C2187m;
import p029b9.C2201q;
import p029b9.C2204r;
import p029b9.C2210t;
import p029b9.C2212u;
import p029b9.InterfaceC2214v;
import p119g9.C6583f;
import p164j$.util.concurrent.ConcurrentHashMap;
import p319r9.HandlerC12118f;
import p441y8.C13930a;
import p441y8.C13934e;
import p461z8.AbstractC14121e;
import p461z8.C14107a;
import p461z8.InterfaceC14132k;

/* renamed from: com.google.android.gms.common.api.internal.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4614c implements Handler.Callback {

    /* renamed from: A */
    public static final Status f12670A = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: B */
    private static final Status f12671B = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: C */
    private static final Object f12672C = new Object();

    /* renamed from: D */
    private static C4614c f12673D;

    /* renamed from: n */
    private C2210t f12678n;

    /* renamed from: o */
    private InterfaceC2214v f12679o;

    /* renamed from: p */
    private final Context f12680p;

    /* renamed from: q */
    private final C13934e f12681q;

    /* renamed from: r */
    private final C2172h0 f12682r;
    @NotOnlyInitialized

    /* renamed from: y */
    private final Handler f12689y;

    /* renamed from: z */
    private volatile boolean f12690z;

    /* renamed from: j */
    private long f12674j = 5000;

    /* renamed from: k */
    private long f12675k = 120000;

    /* renamed from: l */
    private long f12676l = 10000;

    /* renamed from: m */
    private boolean f12677m = false;

    /* renamed from: s */
    private final AtomicInteger f12683s = new AtomicInteger(1);

    /* renamed from: t */
    private final AtomicInteger f12684t = new AtomicInteger(0);

    /* renamed from: u */
    private final Map<C0093b<?>, C4649t<?>> f12685u = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: v */
    private C4638m f12686v = null;

    /* renamed from: w */
    private final Set<C0093b<?>> f12687w = new C0626b();

    /* renamed from: x */
    private final Set<C0093b<?>> f12688x = new C0626b();

    private C4614c(Context context, Looper looper, C13934e c13934e) {
        this.f12690z = true;
        this.f12680p = context;
        HandlerC12118f handlerC12118f = new HandlerC12118f(looper, this);
        this.f12689y = handlerC12118f;
        this.f12681q = c13934e;
        this.f12682r = new C2172h0(c13934e);
        if (C6583f.m22379a(context)) {
            this.f12690z = false;
        }
        handlerC12118f.sendMessage(handlerC12118f.obtainMessage(6));
    }

    /* renamed from: a */
    public static void m28210a() {
        synchronized (f12672C) {
            C4614c c4614c = f12673D;
            if (c4614c != null) {
                c4614c.f12684t.incrementAndGet();
                Handler handler = c4614c.f12689y;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    /* renamed from: i */
    public static Status m28202i(C0093b<?> c0093b, C13930a c13930a) {
        String m41152b = c0093b.m41152b();
        String valueOf = String.valueOf(c13930a);
        StringBuilder sb2 = new StringBuilder(String.valueOf(m41152b).length() + 63 + valueOf.length());
        sb2.append("API: ");
        sb2.append(m41152b);
        sb2.append(" is not available on this device. Connection failed with: ");
        sb2.append(valueOf);
        return new Status(c13930a, sb2.toString());
    }

    /* renamed from: j */
    private final C4649t<?> m28201j(AbstractC14121e<?> abstractC14121e) {
        C0093b<?> m619r = abstractC14121e.m619r();
        C4649t<?> c4649t = this.f12685u.get(m619r);
        if (c4649t == null) {
            c4649t = new C4649t<>(this, abstractC14121e);
            this.f12685u.put(m619r, c4649t);
        }
        if (c4649t.m28097P()) {
            this.f12688x.add(m619r);
        }
        c4649t.m28108E();
        return c4649t;
    }

    /* renamed from: k */
    private final InterfaceC2214v m28200k() {
        if (this.f12679o == null) {
            this.f12679o = C2212u.m33960a(this.f12680p);
        }
        return this.f12679o;
    }

    /* renamed from: l */
    private final void m28199l() {
        C2210t c2210t = this.f12678n;
        if (c2210t != null) {
            if (c2210t.m33962r() > 0 || m28204g()) {
                m28200k().mo24509d(c2210t);
            }
            this.f12678n = null;
        }
    }

    /* renamed from: m */
    private final <T> void m28198m(TaskCompletionSource<T> taskCompletionSource, int i, AbstractC14121e abstractC14121e) {
        C4654y m28060b;
        if (i != 0 && (m28060b = C4654y.m28060b(this, i, abstractC14121e.m619r())) != null) {
            Task<T> m28013a = taskCompletionSource.m28013a();
            final Handler handler = this.f12689y;
            handler.getClass();
            m28013a.mo27981c(new Executor() { // from class: a9.o
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, m28060b);
        }
    }

    /* renamed from: y */
    public static C4614c m28186y(Context context) {
        C4614c c4614c;
        synchronized (f12672C) {
            if (f12673D == null) {
                f12673D = new C4614c(context.getApplicationContext(), AbstractC2171h.m34036c().getLooper(), C13934e.m1136k());
            }
            c4614c = f12673D;
        }
        return c4614c;
    }

    /* renamed from: A */
    public final <O extends C14107a.InterfaceC14111d> Task<Void> m28220A(AbstractC14121e<O> abstractC14121e, AbstractC4622f<C14107a.InterfaceC14109b, ?> abstractC4622f, AbstractC4630i<C14107a.InterfaceC14109b, ?> abstractC4630i, Runnable runnable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m28198m(taskCompletionSource, abstractC4622f.m28174e(), abstractC14121e);
        C4626g0 c4626g0 = new C4626g0(new C0126x(abstractC4622f, abstractC4630i, runnable), taskCompletionSource);
        Handler handler = this.f12689y;
        handler.sendMessage(handler.obtainMessage(8, new C0125w(c4626g0, this.f12684t.get(), abstractC14121e)));
        return taskCompletionSource.m28013a();
    }

    /* renamed from: B */
    public final <O extends C14107a.InterfaceC14111d> Task<Boolean> m28219B(AbstractC14121e<O> abstractC14121e, C4616d.C4617a c4617a, int i) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m28198m(taskCompletionSource, i, abstractC14121e);
        C4631i0 c4631i0 = new C4631i0(c4617a, taskCompletionSource);
        Handler handler = this.f12689y;
        handler.sendMessage(handler.obtainMessage(13, new C0125w(c4631i0, this.f12684t.get(), abstractC14121e)));
        return taskCompletionSource.m28013a();
    }

    /* renamed from: G */
    public final <O extends C14107a.InterfaceC14111d> void m28214G(AbstractC14121e<O> abstractC14121e, int i, AbstractC4612b<? extends InterfaceC14132k, C14107a.InterfaceC14109b> abstractC4612b) {
        C4623f0 c4623f0 = new C4623f0(i, abstractC4612b);
        Handler handler = this.f12689y;
        handler.sendMessage(handler.obtainMessage(4, new C0125w(c4623f0, this.f12684t.get(), abstractC14121e)));
    }

    /* renamed from: H */
    public final <O extends C14107a.InterfaceC14111d, ResultT> void m28213H(AbstractC14121e<O> abstractC14121e, int i, AbstractC4627h<C14107a.InterfaceC14109b, ResultT> abstractC4627h, TaskCompletionSource<ResultT> taskCompletionSource, InterfaceC0111k interfaceC0111k) {
        m28198m(taskCompletionSource, abstractC4627h.m28161d(), abstractC14121e);
        C4629h0 c4629h0 = new C4629h0(i, abstractC4627h, taskCompletionSource, interfaceC0111k);
        Handler handler = this.f12689y;
        handler.sendMessage(handler.obtainMessage(4, new C0125w(c4629h0, this.f12684t.get(), abstractC14121e)));
    }

    /* renamed from: I */
    public final void m28212I(C2187m c2187m, int i, long j, int i2) {
        Handler handler = this.f12689y;
        handler.sendMessage(handler.obtainMessage(18, new C4655z(c2187m, i, j, i2)));
    }

    /* renamed from: J */
    public final void m28211J(C13930a c13930a, int i) {
        if (!m28203h(c13930a, i)) {
            Handler handler = this.f12689y;
            handler.sendMessage(handler.obtainMessage(5, i, 0, c13930a));
        }
    }

    /* renamed from: b */
    public final void m28209b() {
        Handler handler = this.f12689y;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* renamed from: c */
    public final void m28208c(AbstractC14121e<?> abstractC14121e) {
        Handler handler = this.f12689y;
        handler.sendMessage(handler.obtainMessage(7, abstractC14121e));
    }

    /* renamed from: d */
    public final void m28207d(C4638m c4638m) {
        synchronized (f12672C) {
            if (this.f12686v != c4638m) {
                this.f12686v = c4638m;
                this.f12687w.clear();
            }
            this.f12687w.addAll(c4638m.m28131t());
        }
    }

    /* renamed from: e */
    public final void m28206e(C4638m c4638m) {
        synchronized (f12672C) {
            if (this.f12686v == c4638m) {
                this.f12686v = null;
                this.f12687w.clear();
            }
        }
    }

    /* renamed from: g */
    public final boolean m28204g() {
        if (this.f12677m) {
            return false;
        }
        C2204r m33977a = C2201q.m33976b().m33977a();
        if (m33977a != null && !m33977a.m33971A()) {
            return false;
        }
        int m34034a = this.f12682r.m34034a(this.f12680p, 203400000);
        if (m34034a != -1 && m34034a != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final boolean m28203h(C13930a c13930a, int i) {
        return this.f12681q.m1126u(this.f12680p, c13930a, i);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C0093b c0093b;
        boolean m28080q;
        C0093b c0093b2;
        C0093b c0093b3;
        C0093b c0093b4;
        C0093b c0093b5;
        int i = message.what;
        long j = 300000;
        C4649t<?> c4649t = null;
        switch (i) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f12676l = j;
                this.f12689y.removeMessages(12);
                for (C0093b<?> c0093b6 : this.f12685u.keySet()) {
                    Handler handler = this.f12689y;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c0093b6), this.f12676l);
                }
                break;
            case 2:
                C0104g0 c0104g0 = (C0104g0) message.obj;
                Iterator<C0093b<?>> it = c0104g0.m41138a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        C0093b<?> next = it.next();
                        C4649t<?> c4649t2 = this.f12685u.get(next);
                        if (c4649t2 == null) {
                            c0104g0.m41137b(next, new C13930a(13), null);
                            break;
                        } else if (c4649t2.m28098O()) {
                            c0104g0.m41137b(next, C13930a.f35870n, c4649t2.m28075v().mo645d());
                        } else {
                            C13930a m28077t = c4649t2.m28077t();
                            if (m28077t != null) {
                                c0104g0.m41137b(next, m28077t, null);
                            } else {
                                c4649t2.m28103J(c0104g0);
                                c4649t2.m28108E();
                            }
                        }
                    }
                }
            case 3:
                for (C4649t<?> c4649t3 : this.f12685u.values()) {
                    c4649t3.m28109D();
                    c4649t3.m28108E();
                }
                break;
            case 4:
            case 8:
            case 13:
                C0125w c0125w = (C0125w) message.obj;
                C4649t<?> c4649t4 = this.f12685u.get(c0125w.f491c.m619r());
                if (c4649t4 == null) {
                    c4649t4 = m28201j(c0125w.f491c);
                }
                if (c4649t4.m28097P() && this.f12684t.get() != c0125w.f490b) {
                    c0125w.f489a.mo28148a(f12670A);
                    c4649t4.m28101L();
                    break;
                } else {
                    c4649t4.m28107F(c0125w.f489a);
                    break;
                }
                break;
            case 5:
                int i2 = message.arg1;
                C13930a c13930a = (C13930a) message.obj;
                Iterator<C4649t<?>> it2 = this.f12685u.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C4649t<?> next2 = it2.next();
                        if (next2.m28079r() == i2) {
                            c4649t = next2;
                        }
                    }
                }
                if (c4649t != null) {
                    if (c13930a.m1144r() == 13) {
                        String mo1122d = this.f12681q.mo1122d(c13930a.m1144r());
                        String m1143z = c13930a.m1143z();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(mo1122d).length() + 69 + String.valueOf(m1143z).length());
                        sb2.append("Error resolution was canceled by the user, original error message: ");
                        sb2.append(mo1122d);
                        sb2.append(": ");
                        sb2.append(m1143z);
                        c4649t.m28090g(new Status(17, sb2.toString()));
                        break;
                    } else {
                        c0093b = ((C4649t) c4649t).f12756e;
                        c4649t.m28090g(m28202i(c0093b, c13930a));
                        break;
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder(76);
                    sb3.append("Could not find API instance ");
                    sb3.append(i2);
                    sb3.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb3.toString(), new Exception());
                    break;
                }
            case 6:
                if (this.f12680p.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C4609a.m28227c((Application) this.f12680p.getApplicationContext());
                    ComponentCallbacks2C4609a.m28228b().m28229a(new C4642o(this));
                    if (!ComponentCallbacks2C4609a.m28228b().m28225e(true)) {
                        this.f12676l = 300000L;
                        break;
                    }
                }
                break;
            case 7:
                m28201j((AbstractC14121e) message.obj);
                break;
            case 9:
                if (this.f12685u.containsKey(message.obj)) {
                    this.f12685u.get(message.obj).m28102K();
                    break;
                }
                break;
            case 10:
                for (C0093b<?> c0093b7 : this.f12688x) {
                    C4649t<?> remove = this.f12685u.remove(c0093b7);
                    if (remove != null) {
                        remove.m28101L();
                    }
                }
                this.f12688x.clear();
                break;
            case 11:
                if (this.f12685u.containsKey(message.obj)) {
                    this.f12685u.get(message.obj).m28100M();
                    break;
                }
                break;
            case 12:
                if (this.f12685u.containsKey(message.obj)) {
                    this.f12685u.get(message.obj).m28096a();
                    break;
                }
                break;
            case 14:
                C4640n c4640n = (C4640n) message.obj;
                C0093b<?> m28128a = c4640n.m28128a();
                if (!this.f12685u.containsKey(m28128a)) {
                    c4640n.m28127b().m28011c(Boolean.FALSE);
                    break;
                } else {
                    m28080q = this.f12685u.get(m28128a).m28080q(false);
                    c4640n.m28127b().m28011c(Boolean.valueOf(m28080q));
                    break;
                }
            case 15:
                C4650u c4650u = (C4650u) message.obj;
                Map<C0093b<?>, C4649t<?>> map = this.f12685u;
                c0093b2 = c4650u.f12767a;
                if (map.containsKey(c0093b2)) {
                    Map<C0093b<?>, C4649t<?>> map2 = this.f12685u;
                    c0093b3 = c4650u.f12767a;
                    C4649t.m28111B(map2.get(c0093b3), c4650u);
                    break;
                }
                break;
            case 16:
                C4650u c4650u2 = (C4650u) message.obj;
                Map<C0093b<?>, C4649t<?>> map3 = this.f12685u;
                c0093b4 = c4650u2.f12767a;
                if (map3.containsKey(c0093b4)) {
                    Map<C0093b<?>, C4649t<?>> map4 = this.f12685u;
                    c0093b5 = c4650u2.f12767a;
                    C4649t.m28110C(map4.get(c0093b5), c4650u2);
                    break;
                }
                break;
            case 17:
                m28199l();
                break;
            case 18:
                C4655z c4655z = (C4655z) message.obj;
                if (c4655z.f12786c == 0) {
                    m28200k().mo24509d(new C2210t(c4655z.f12785b, Arrays.asList(c4655z.f12784a)));
                    break;
                } else {
                    C2210t c2210t = this.f12678n;
                    if (c2210t != null) {
                        List<C2187m> m33961z = c2210t.m33961z();
                        if (c2210t.m33962r() == c4655z.f12785b && (m33961z == null || m33961z.size() < c4655z.f12787d)) {
                            this.f12678n.m33963A(c4655z.f12784a);
                        } else {
                            this.f12689y.removeMessages(17);
                            m28199l();
                        }
                    }
                    if (this.f12678n == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(c4655z.f12784a);
                        this.f12678n = new C2210t(c4655z.f12785b, arrayList);
                        Handler handler2 = this.f12689y;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), c4655z.f12786c);
                        break;
                    }
                }
                break;
            case 19:
                this.f12677m = false;
                break;
            default:
                StringBuilder sb4 = new StringBuilder(31);
                sb4.append("Unknown message id: ");
                sb4.append(i);
                Log.w("GoogleApiManager", sb4.toString());
                return false;
        }
        return true;
    }

    /* renamed from: n */
    public final int m28197n() {
        return this.f12683s.getAndIncrement();
    }

    /* renamed from: x */
    public final C4649t m28187x(C0093b<?> c0093b) {
        return this.f12685u.get(c0093b);
    }
}