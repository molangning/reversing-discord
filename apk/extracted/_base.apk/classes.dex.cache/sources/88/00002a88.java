package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.C0624a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4616d;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p010a9.AbstractC0122t;
import p010a9.BinderC0100e0;
import p010a9.C0093b;
import p010a9.C0104g0;
import p010a9.C0126x;
import p029b9.C2172h0;
import p029b9.C2190n;
import p029b9.C2198p;
import p062d9.C5787e;
import p119g9.C6579b;
import p441y8.C13930a;
import p441y8.C13932c;
import p441y8.C13934e;
import p461z8.AbstractC14121e;
import p461z8.AbstractC14124f;
import p461z8.C14107a;
import p461z8.C14107a.InterfaceC14111d;
import p461z8.C14134m;

/* renamed from: com.google.android.gms.common.api.internal.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4649t<O extends C14107a.InterfaceC14111d> implements AbstractC14124f.InterfaceC14125a, AbstractC14124f.InterfaceC14126b {
    @NotOnlyInitialized

    /* renamed from: d */
    private final C14107a.InterfaceC14116f f12755d;

    /* renamed from: e */
    private final C0093b<O> f12756e;

    /* renamed from: f */
    private final C4636l f12757f;

    /* renamed from: i */
    private final int f12760i;

    /* renamed from: j */
    private final BinderC0100e0 f12761j;

    /* renamed from: k */
    private boolean f12762k;

    /* renamed from: o */
    final /* synthetic */ C4614c f12766o;

    /* renamed from: c */
    private final Queue<AbstractC4633j0> f12754c = new LinkedList();

    /* renamed from: g */
    private final Set<C0104g0> f12758g = new HashSet();

    /* renamed from: h */
    private final Map<C4616d.C4617a<?>, C0126x> f12759h = new HashMap();

    /* renamed from: l */
    private final List<C4650u> f12763l = new ArrayList();

    /* renamed from: m */
    private C13930a f12764m = null;

    /* renamed from: n */
    private int f12765n = 0;

    public C4649t(C4614c c4614c, AbstractC14121e<O> abstractC14121e) {
        Handler handler;
        Context context;
        Handler handler2;
        this.f12766o = c4614c;
        handler = c4614c.f12689y;
        C14107a.InterfaceC14116f m612y = abstractC14121e.m612y(handler.getLooper(), this);
        this.f12755d = m612y;
        this.f12756e = abstractC14121e.m619r();
        this.f12757f = new C4636l();
        this.f12760i = abstractC14121e.m613x();
        if (m612y.mo642g()) {
            context = c4614c.f12680p;
            handler2 = c4614c.f12689y;
            this.f12761j = abstractC14121e.m611z(context, handler2);
            return;
        }
        this.f12761j = null;
    }

    /* renamed from: B */
    public static /* bridge */ /* synthetic */ void m28111B(C4649t c4649t, C4650u c4650u) {
        if (c4649t.f12763l.contains(c4650u) && !c4649t.f12762k) {
            if (!c4649t.f12755d.mo648a()) {
                c4649t.m28108E();
            } else {
                c4649t.m28088i();
            }
        }
    }

    /* renamed from: C */
    public static /* bridge */ /* synthetic */ void m28110C(C4649t c4649t, C4650u c4650u) {
        Handler handler;
        Handler handler2;
        C13932c c13932c;
        C13932c[] mo28150g;
        if (c4649t.f12763l.remove(c4650u)) {
            handler = c4649t.f12766o.f12689y;
            handler.removeMessages(15, c4650u);
            handler2 = c4649t.f12766o.f12689y;
            handler2.removeMessages(16, c4650u);
            c13932c = c4650u.f12768b;
            ArrayList arrayList = new ArrayList(c4649t.f12754c.size());
            for (AbstractC4633j0 abstractC4633j0 : c4649t.f12754c) {
                if ((abstractC4633j0 instanceof AbstractC0122t) && (mo28150g = ((AbstractC0122t) abstractC4633j0).mo28150g(c4649t)) != null && C6579b.m22384b(mo28150g, c13932c)) {
                    arrayList.add(abstractC4633j0);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                AbstractC4633j0 abstractC4633j02 = (AbstractC4633j0) arrayList.get(i);
                c4649t.f12754c.remove(abstractC4633j02);
                abstractC4633j02.mo28147b(new C14134m(c13932c));
            }
        }
    }

    /* renamed from: d */
    private final C13932c m28093d(C13932c[] c13932cArr) {
        if (c13932cArr != null && c13932cArr.length != 0) {
            C13932c[] mo637n = this.f12755d.mo637n();
            if (mo637n == null) {
                mo637n = new C13932c[0];
            }
            C0624a c0624a = new C0624a(mo637n.length);
            for (C13932c c13932c : mo637n) {
                c0624a.put(c13932c.m1141r(), Long.valueOf(c13932c.m1140z()));
            }
            for (C13932c c13932c2 : c13932cArr) {
                Long l = (Long) c0624a.get(c13932c2.m1141r());
                if (l == null || l.longValue() < c13932c2.m1140z()) {
                    return c13932c2;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    private final void m28091f(C13930a c13930a) {
        String str;
        for (C0104g0 c0104g0 : this.f12758g) {
            if (C2190n.m34004b(c13930a, C13930a.f35870n)) {
                str = this.f12755d.mo645d();
            } else {
                str = null;
            }
            c0104g0.m41137b(this.f12756e, c13930a, str);
        }
        this.f12758g.clear();
    }

    /* renamed from: g */
    public final void m28090g(Status status) {
        Handler handler;
        handler = this.f12766o.f12689y;
        C2198p.m33991d(handler);
        m28089h(status, null, false);
    }

    /* renamed from: h */
    private final void m28089h(Status status, Exception exc, boolean z) {
        Handler handler;
        boolean z2;
        handler = this.f12766o.f12689y;
        C2198p.m33991d(handler);
        boolean z3 = false;
        if (status != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (exc == null) {
            z3 = true;
        }
        if (z2 != z3) {
            Iterator<AbstractC4633j0> it = this.f12754c.iterator();
            while (it.hasNext()) {
                AbstractC4633j0 next = it.next();
                if (!z || next.f12728a == 2) {
                    if (status != null) {
                        next.mo28148a(status);
                    } else {
                        next.mo28147b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    /* renamed from: i */
    private final void m28088i() {
        ArrayList arrayList = new ArrayList(this.f12754c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC4633j0 abstractC4633j0 = (AbstractC4633j0) arrayList.get(i);
            if (this.f12755d.mo648a()) {
                if (m28082o(abstractC4633j0)) {
                    this.f12754c.remove(abstractC4633j0);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: j */
    public final void m28087j() {
        m28109D();
        m28091f(C13930a.f35870n);
        m28083n();
        Iterator<C0126x> it = this.f12759h.values().iterator();
        while (it.hasNext()) {
            C0126x next = it.next();
            if (m28093d(next.f492a.m28176c()) != null) {
                it.remove();
            } else {
                try {
                    next.f492a.mo28175d(this.f12755d, new TaskCompletionSource<>());
                } catch (DeadObjectException unused) {
                    mo28092e(3);
                    this.f12755d.mo647b("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        m28088i();
        m28085l();
    }

    /* renamed from: k */
    public final void m28086k(int i) {
        Handler handler;
        Handler handler2;
        long j;
        Handler handler3;
        Handler handler4;
        long j2;
        C2172h0 c2172h0;
        m28109D();
        this.f12762k = true;
        this.f12757f.m28137e(i, this.f12755d.mo635p());
        C4614c c4614c = this.f12766o;
        handler = c4614c.f12689y;
        handler2 = c4614c.f12689y;
        Message obtain = Message.obtain(handler2, 9, this.f12756e);
        j = this.f12766o.f12674j;
        handler.sendMessageDelayed(obtain, j);
        C4614c c4614c2 = this.f12766o;
        handler3 = c4614c2.f12689y;
        handler4 = c4614c2.f12689y;
        Message obtain2 = Message.obtain(handler4, 11, this.f12756e);
        j2 = this.f12766o.f12675k;
        handler3.sendMessageDelayed(obtain2, j2);
        c2172h0 = this.f12766o.f12682r;
        c2172h0.m34032c();
        for (C0126x c0126x : this.f12759h.values()) {
            c0126x.f494c.run();
        }
    }

    /* renamed from: l */
    private final void m28085l() {
        Handler handler;
        Handler handler2;
        Handler handler3;
        long j;
        handler = this.f12766o.f12689y;
        handler.removeMessages(12, this.f12756e);
        C4614c c4614c = this.f12766o;
        handler2 = c4614c.f12689y;
        handler3 = c4614c.f12689y;
        Message obtainMessage = handler3.obtainMessage(12, this.f12756e);
        j = this.f12766o.f12676l;
        handler2.sendMessageDelayed(obtainMessage, j);
    }

    /* renamed from: m */
    private final void m28084m(AbstractC4633j0 abstractC4633j0) {
        abstractC4633j0.mo28145d(this.f12757f, m28097P());
        try {
            abstractC4633j0.mo28146c(this);
        } catch (DeadObjectException unused) {
            mo28092e(1);
            this.f12755d.mo647b("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    /* renamed from: n */
    private final void m28083n() {
        Handler handler;
        Handler handler2;
        if (this.f12762k) {
            handler = this.f12766o.f12689y;
            handler.removeMessages(11, this.f12756e);
            handler2 = this.f12766o.f12689y;
            handler2.removeMessages(9, this.f12756e);
            this.f12762k = false;
        }
    }

    /* renamed from: o */
    private final boolean m28082o(AbstractC4633j0 abstractC4633j0) {
        boolean z;
        Handler handler;
        Handler handler2;
        long j;
        Handler handler3;
        Handler handler4;
        long j2;
        Handler handler5;
        Handler handler6;
        Handler handler7;
        long j3;
        if (!(abstractC4633j0 instanceof AbstractC0122t)) {
            m28084m(abstractC4633j0);
            return true;
        }
        AbstractC0122t abstractC0122t = (AbstractC0122t) abstractC4633j0;
        C13932c m28093d = m28093d(abstractC0122t.mo28150g(this));
        if (m28093d == null) {
            m28084m(abstractC4633j0);
            return true;
        }
        String name = this.f12755d.getClass().getName();
        String m1141r = m28093d.m1141r();
        long m1140z = m28093d.m1140z();
        StringBuilder sb2 = new StringBuilder(name.length() + 77 + String.valueOf(m1141r).length());
        sb2.append(name);
        sb2.append(" could not execute call because it requires feature (");
        sb2.append(m1141r);
        sb2.append(", ");
        sb2.append(m1140z);
        sb2.append(").");
        Log.w("GoogleApiManager", sb2.toString());
        z = this.f12766o.f12690z;
        if (z && abstractC0122t.mo28151f(this)) {
            C4650u c4650u = new C4650u(this.f12756e, m28093d, null);
            int indexOf = this.f12763l.indexOf(c4650u);
            if (indexOf >= 0) {
                C4650u c4650u2 = this.f12763l.get(indexOf);
                handler5 = this.f12766o.f12689y;
                handler5.removeMessages(15, c4650u2);
                C4614c c4614c = this.f12766o;
                handler6 = c4614c.f12689y;
                handler7 = c4614c.f12689y;
                Message obtain = Message.obtain(handler7, 15, c4650u2);
                j3 = this.f12766o.f12674j;
                handler6.sendMessageDelayed(obtain, j3);
                return false;
            }
            this.f12763l.add(c4650u);
            C4614c c4614c2 = this.f12766o;
            handler = c4614c2.f12689y;
            handler2 = c4614c2.f12689y;
            Message obtain2 = Message.obtain(handler2, 15, c4650u);
            j = this.f12766o.f12674j;
            handler.sendMessageDelayed(obtain2, j);
            C4614c c4614c3 = this.f12766o;
            handler3 = c4614c3.f12689y;
            handler4 = c4614c3.f12689y;
            Message obtain3 = Message.obtain(handler4, 16, c4650u);
            j2 = this.f12766o.f12675k;
            handler3.sendMessageDelayed(obtain3, j2);
            C13930a c13930a = new C13930a(2, null);
            if (!m28081p(c13930a)) {
                this.f12766o.m28203h(c13930a, this.f12760i);
                return false;
            }
            return false;
        }
        abstractC0122t.mo28147b(new C14134m(m28093d));
        return true;
    }

    /* renamed from: p */
    private final boolean m28081p(C13930a c13930a) {
        Object obj;
        C4638m c4638m;
        Set set;
        C4638m c4638m2;
        obj = C4614c.f12672C;
        synchronized (obj) {
            C4614c c4614c = this.f12766o;
            c4638m = c4614c.f12686v;
            if (c4638m != null) {
                set = c4614c.f12687w;
                if (set.contains(this.f12756e)) {
                    c4638m2 = this.f12766o.f12686v;
                    c4638m2.m28114s(c13930a, this.f12760i);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: q */
    public final boolean m28080q(boolean z) {
        Handler handler;
        handler = this.f12766o.f12689y;
        C2198p.m33991d(handler);
        if (!this.f12755d.mo648a() || this.f12759h.size() != 0) {
            return false;
        }
        if (this.f12757f.m28135g()) {
            if (z) {
                m28085l();
            }
            return false;
        }
        this.f12755d.mo647b("Timing out service connection.");
        return true;
    }

    /* renamed from: D */
    public final void m28109D() {
        Handler handler;
        handler = this.f12766o.f12689y;
        C2198p.m33991d(handler);
        this.f12764m = null;
    }

    /* renamed from: E */
    public final void m28108E() {
        Handler handler;
        C2172h0 c2172h0;
        Context context;
        handler = this.f12766o.f12689y;
        C2198p.m33991d(handler);
        if (!this.f12755d.mo648a() && !this.f12755d.mo646c()) {
            try {
                C4614c c4614c = this.f12766o;
                c2172h0 = c4614c.f12682r;
                context = c4614c.f12680p;
                int m34033b = c2172h0.m34033b(context, this.f12755d);
                if (m34033b != 0) {
                    C13930a c13930a = new C13930a(m34033b, null);
                    String name = this.f12755d.getClass().getName();
                    String obj = c13930a.toString();
                    StringBuilder sb2 = new StringBuilder(name.length() + 35 + obj.length());
                    sb2.append("The service for ");
                    sb2.append(name);
                    sb2.append(" is not available: ");
                    sb2.append(obj);
                    Log.w("GoogleApiManager", sb2.toString());
                    m28105H(c13930a, null);
                    return;
                }
                C4614c c4614c2 = this.f12766o;
                C14107a.InterfaceC14116f interfaceC14116f = this.f12755d;
                C4652w c4652w = new C4652w(c4614c2, interfaceC14116f, this.f12756e);
                if (interfaceC14116f.mo642g()) {
                    ((BinderC0100e0) C2198p.m33985j(this.f12761j)).m41145j0(c4652w);
                }
                try {
                    this.f12755d.mo643f(c4652w);
                } catch (SecurityException e) {
                    m28105H(new C13930a(10), e);
                }
            } catch (IllegalStateException e2) {
                m28105H(new C13930a(10), e2);
            }
        }
    }

    /* renamed from: F */
    public final void m28107F(AbstractC4633j0 abstractC4633j0) {
        Handler handler;
        handler = this.f12766o.f12689y;
        C2198p.m33991d(handler);
        if (this.f12755d.mo648a()) {
            if (m28082o(abstractC4633j0)) {
                m28085l();
                return;
            } else {
                this.f12754c.add(abstractC4633j0);
                return;
            }
        }
        this.f12754c.add(abstractC4633j0);
        C13930a c13930a = this.f12764m;
        if (c13930a != null && c13930a.m1147G()) {
            m28105H(this.f12764m, null);
        } else {
            m28108E();
        }
    }

    /* renamed from: G */
    public final void m28106G() {
        this.f12765n++;
    }

    /* renamed from: H */
    public final void m28105H(C13930a c13930a, Exception exc) {
        Handler handler;
        C2172h0 c2172h0;
        boolean z;
        Status m28202i;
        Status m28202i2;
        Status m28202i3;
        Handler handler2;
        Handler handler3;
        long j;
        Handler handler4;
        Status status;
        Handler handler5;
        Handler handler6;
        handler = this.f12766o.f12689y;
        C2198p.m33991d(handler);
        BinderC0100e0 binderC0100e0 = this.f12761j;
        if (binderC0100e0 != null) {
            binderC0100e0.m41144k0();
        }
        m28109D();
        c2172h0 = this.f12766o.f12682r;
        c2172h0.m34032c();
        m28091f(c13930a);
        if ((this.f12755d instanceof C5787e) && c13930a.m1144r() != 24) {
            this.f12766o.f12677m = true;
            C4614c c4614c = this.f12766o;
            handler5 = c4614c.f12689y;
            handler6 = c4614c.f12689y;
            handler5.sendMessageDelayed(handler6.obtainMessage(19), 300000L);
        }
        if (c13930a.m1144r() == 4) {
            status = C4614c.f12671B;
            m28090g(status);
        } else if (this.f12754c.isEmpty()) {
            this.f12764m = c13930a;
        } else if (exc != null) {
            handler4 = this.f12766o.f12689y;
            C2198p.m33991d(handler4);
            m28089h(null, exc, false);
        } else {
            z = this.f12766o.f12690z;
            if (z) {
                m28202i2 = C4614c.m28202i(this.f12756e, c13930a);
                m28089h(m28202i2, null, true);
                if (!this.f12754c.isEmpty() && !m28081p(c13930a) && !this.f12766o.m28203h(c13930a, this.f12760i)) {
                    if (c13930a.m1144r() == 18) {
                        this.f12762k = true;
                    }
                    if (this.f12762k) {
                        C4614c c4614c2 = this.f12766o;
                        handler2 = c4614c2.f12689y;
                        handler3 = c4614c2.f12689y;
                        Message obtain = Message.obtain(handler3, 9, this.f12756e);
                        j = this.f12766o.f12674j;
                        handler2.sendMessageDelayed(obtain, j);
                        return;
                    }
                    m28202i3 = C4614c.m28202i(this.f12756e, c13930a);
                    m28090g(m28202i3);
                    return;
                }
                return;
            }
            m28202i = C4614c.m28202i(this.f12756e, c13930a);
            m28090g(m28202i);
        }
    }

    /* renamed from: I */
    public final void m28104I(C13930a c13930a) {
        Handler handler;
        handler = this.f12766o.f12689y;
        C2198p.m33991d(handler);
        C14107a.InterfaceC14116f interfaceC14116f = this.f12755d;
        String name = interfaceC14116f.getClass().getName();
        String valueOf = String.valueOf(c13930a);
        StringBuilder sb2 = new StringBuilder(name.length() + 25 + valueOf.length());
        sb2.append("onSignInFailed for ");
        sb2.append(name);
        sb2.append(" with ");
        sb2.append(valueOf);
        interfaceC14116f.mo647b(sb2.toString());
        m28105H(c13930a, null);
    }

    /* renamed from: J */
    public final void m28103J(C0104g0 c0104g0) {
        Handler handler;
        handler = this.f12766o.f12689y;
        C2198p.m33991d(handler);
        this.f12758g.add(c0104g0);
    }

    /* renamed from: K */
    public final void m28102K() {
        Handler handler;
        handler = this.f12766o.f12689y;
        C2198p.m33991d(handler);
        if (this.f12762k) {
            m28108E();
        }
    }

    /* renamed from: L */
    public final void m28101L() {
        Handler handler;
        handler = this.f12766o.f12689y;
        C2198p.m33991d(handler);
        m28090g(C4614c.f12670A);
        this.f12757f.m28136f();
        for (C4616d.C4617a c4617a : (C4616d.C4617a[]) this.f12759h.keySet().toArray(new C4616d.C4617a[0])) {
            m28107F(new C4631i0(c4617a, new TaskCompletionSource()));
        }
        m28091f(new C13930a(4));
        if (this.f12755d.mo648a()) {
            this.f12755d.mo636o(new C4648s(this));
        }
    }

    /* renamed from: M */
    public final void m28100M() {
        Handler handler;
        C13934e c13934e;
        Context context;
        Status status;
        handler = this.f12766o.f12689y;
        C2198p.m33991d(handler);
        if (this.f12762k) {
            m28083n();
            C4614c c4614c = this.f12766o;
            c13934e = c4614c.f12681q;
            context = c4614c.f12680p;
            if (c13934e.mo1121e(context) == 18) {
                status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
            } else {
                status = new Status(22, "API failed to connect while resuming due to an unknown error.");
            }
            m28090g(status);
            this.f12755d.mo647b("Timing out connection while resuming.");
        }
    }

    /* renamed from: O */
    public final boolean m28098O() {
        return this.f12755d.mo648a();
    }

    /* renamed from: P */
    public final boolean m28097P() {
        return this.f12755d.mo642g();
    }

    /* renamed from: a */
    public final boolean m28096a() {
        return m28080q(true);
    }

    @Override // p010a9.InterfaceC0097d
    /* renamed from: b */
    public final void mo28095b(Bundle bundle) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.f12766o.f12689y;
        if (myLooper == handler.getLooper()) {
            m28087j();
            return;
        }
        handler2 = this.f12766o.f12689y;
        handler2.post(new RunnableC4644p(this));
    }

    @Override // p010a9.InterfaceC0105h
    /* renamed from: c */
    public final void mo28094c(C13930a c13930a) {
        m28105H(c13930a, null);
    }

    @Override // p010a9.InterfaceC0097d
    /* renamed from: e */
    public final void mo28092e(int i) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.f12766o.f12689y;
        if (myLooper == handler.getLooper()) {
            m28086k(i);
            return;
        }
        handler2 = this.f12766o.f12689y;
        handler2.post(new RunnableC4646q(this, i));
    }

    /* renamed from: r */
    public final int m28079r() {
        return this.f12760i;
    }

    /* renamed from: s */
    public final int m28078s() {
        return this.f12765n;
    }

    /* renamed from: t */
    public final C13930a m28077t() {
        Handler handler;
        handler = this.f12766o.f12689y;
        C2198p.m33991d(handler);
        return this.f12764m;
    }

    /* renamed from: v */
    public final C14107a.InterfaceC14116f m28075v() {
        return this.f12755d;
    }

    /* renamed from: x */
    public final Map<C4616d.C4617a<?>, C0126x> m28073x() {
        return this.f12759h;
    }
}