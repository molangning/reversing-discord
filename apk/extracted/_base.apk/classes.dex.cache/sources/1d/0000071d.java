package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.Lifecycle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p144i.C7365a;
import p165j.C8770a;
import p165j.C8771b;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class LifecycleRegistry extends Lifecycle {

    /* renamed from: b */
    private C8770a<InterfaceC1698o, C1653a> f4395b;

    /* renamed from: c */
    private Lifecycle.State f4396c;

    /* renamed from: d */
    private final WeakReference<LifecycleOwner> f4397d;

    /* renamed from: e */
    private int f4398e;

    /* renamed from: f */
    private boolean f4399f;

    /* renamed from: g */
    private boolean f4400g;

    /* renamed from: h */
    private ArrayList<Lifecycle.State> f4401h;

    /* renamed from: i */
    private final boolean f4402i;

    /* renamed from: androidx.lifecycle.LifecycleRegistry$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1653a {

        /* renamed from: a */
        Lifecycle.State f4403a;

        /* renamed from: b */
        InterfaceC1695l f4404b;

        C1653a(InterfaceC1698o interfaceC1698o, Lifecycle.State state) {
            this.f4404b = C1701r.m36026f(interfaceC1698o);
            this.f4403a = state;
        }

        /* renamed from: a */
        void m36109a(LifecycleOwner lifecycleOwner, Lifecycle.EnumC1651b enumC1651b) {
            Lifecycle.State m36130b = enumC1651b.m36130b();
            this.f4403a = LifecycleRegistry.m36115k(this.f4403a, m36130b);
            this.f4404b.mo11423a(lifecycleOwner, enumC1651b);
            this.f4403a = m36130b;
        }
    }

    public LifecycleRegistry(LifecycleOwner lifecycleOwner) {
        this(lifecycleOwner, true);
    }

    /* renamed from: d */
    private void m36122d(LifecycleOwner lifecycleOwner) {
        Iterator<Map.Entry<InterfaceC1698o, C1653a>> descendingIterator = this.f4395b.descendingIterator();
        while (descendingIterator.hasNext() && !this.f4400g) {
            Map.Entry<InterfaceC1698o, C1653a> next = descendingIterator.next();
            C1653a value = next.getValue();
            while (value.f4403a.compareTo(this.f4396c) > 0 && !this.f4400g && this.f4395b.contains(next.getKey())) {
                Lifecycle.EnumC1651b m36131a = Lifecycle.EnumC1651b.m36131a(value.f4403a);
                if (m36131a != null) {
                    m36112n(m36131a.m36130b());
                    value.m36109a(lifecycleOwner, m36131a);
                    m36113m();
                } else {
                    throw new IllegalStateException("no event down from " + value.f4403a);
                }
            }
        }
    }

    /* renamed from: e */
    private Lifecycle.State m36121e(InterfaceC1698o interfaceC1698o) {
        Lifecycle.State state;
        ArrayList<Lifecycle.State> arrayList;
        Map.Entry<InterfaceC1698o, C1653a> m17289p = this.f4395b.m17289p(interfaceC1698o);
        Lifecycle.State state2 = null;
        if (m17289p != null) {
            state = m17289p.getValue().f4403a;
        } else {
            state = null;
        }
        if (!this.f4401h.isEmpty()) {
            state2 = this.f4401h.get(arrayList.size() - 1);
        }
        return m36115k(m36115k(this.f4396c, state), state2);
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: f */
    private void m36120f(String str) {
        if (this.f4402i && !C7365a.m20832d().mo20828b()) {
            throw new IllegalStateException("Method " + str + " must be called on the main thread");
        }
    }

    /* renamed from: g */
    private void m36119g(LifecycleOwner lifecycleOwner) {
        C8771b<InterfaceC1698o, C1653a>.C8775d m17286e = this.f4395b.m17286e();
        while (m17286e.hasNext() && !this.f4400g) {
            Map.Entry next = m17286e.next();
            C1653a c1653a = (C1653a) next.getValue();
            while (c1653a.f4403a.compareTo(this.f4396c) < 0 && !this.f4400g && this.f4395b.contains((InterfaceC1698o) next.getKey())) {
                m36112n(c1653a.f4403a);
                Lifecycle.EnumC1651b m36129c = Lifecycle.EnumC1651b.m36129c(c1653a.f4403a);
                if (m36129c != null) {
                    c1653a.m36109a(lifecycleOwner, m36129c);
                    m36113m();
                } else {
                    throw new IllegalStateException("no event up from " + c1653a.f4403a);
                }
            }
        }
    }

    /* renamed from: i */
    private boolean m36117i() {
        if (this.f4395b.size() == 0) {
            return true;
        }
        Lifecycle.State state = this.f4395b.m17288a().getValue().f4403a;
        Lifecycle.State state2 = this.f4395b.m17285h().getValue().f4403a;
        if (state == state2 && this.f4396c == state2) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    static Lifecycle.State m36115k(Lifecycle.State state, Lifecycle.State state2) {
        return (state2 == null || state2.compareTo(state) >= 0) ? state : state2;
    }

    /* renamed from: l */
    private void m36114l(Lifecycle.State state) {
        Lifecycle.State state2 = this.f4396c;
        if (state2 == state) {
            return;
        }
        if (state2 == Lifecycle.State.INITIALIZED && state == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException("no event down from " + this.f4396c);
        }
        this.f4396c = state;
        if (!this.f4399f && this.f4398e == 0) {
            this.f4399f = true;
            m36110p();
            this.f4399f = false;
            if (this.f4396c == Lifecycle.State.DESTROYED) {
                this.f4395b = new C8770a<>();
                return;
            }
            return;
        }
        this.f4400g = true;
    }

    /* renamed from: m */
    private void m36113m() {
        ArrayList<Lifecycle.State> arrayList = this.f4401h;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: n */
    private void m36112n(Lifecycle.State state) {
        this.f4401h.add(state);
    }

    /* renamed from: p */
    private void m36110p() {
        LifecycleOwner lifecycleOwner = this.f4397d.get();
        if (lifecycleOwner != null) {
            while (!m36117i()) {
                this.f4400g = false;
                if (this.f4396c.compareTo(this.f4395b.m17288a().getValue().f4403a) < 0) {
                    m36122d(lifecycleOwner);
                }
                Map.Entry<InterfaceC1698o, C1653a> m17285h = this.f4395b.m17285h();
                if (!this.f4400g && m17285h != null && this.f4396c.compareTo(m17285h.getValue().f4403a) > 0) {
                    m36119g(lifecycleOwner);
                }
            }
            this.f4400g = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    @Override // androidx.lifecycle.Lifecycle
    /* renamed from: a */
    public void mo36125a(InterfaceC1698o interfaceC1698o) {
        LifecycleOwner lifecycleOwner;
        boolean z;
        m36120f("addObserver");
        Lifecycle.State state = this.f4396c;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        C1653a c1653a = new C1653a(interfaceC1698o, state2);
        if (this.f4395b.mo17283k(interfaceC1698o, c1653a) != null || (lifecycleOwner = this.f4397d.get()) == null) {
            return;
        }
        if (this.f4398e == 0 && !this.f4399f) {
            z = false;
        } else {
            z = true;
        }
        Lifecycle.State m36121e = m36121e(interfaceC1698o);
        this.f4398e++;
        while (c1653a.f4403a.compareTo(m36121e) < 0 && this.f4395b.contains(interfaceC1698o)) {
            m36112n(c1653a.f4403a);
            Lifecycle.EnumC1651b m36129c = Lifecycle.EnumC1651b.m36129c(c1653a.f4403a);
            if (m36129c != null) {
                c1653a.m36109a(lifecycleOwner, m36129c);
                m36113m();
                m36121e = m36121e(interfaceC1698o);
            } else {
                throw new IllegalStateException("no event up from " + c1653a.f4403a);
            }
        }
        if (!z) {
            m36110p();
        }
        this.f4398e--;
    }

    @Override // androidx.lifecycle.Lifecycle
    /* renamed from: b */
    public Lifecycle.State mo36124b() {
        return this.f4396c;
    }

    @Override // androidx.lifecycle.Lifecycle
    /* renamed from: c */
    public void mo36123c(InterfaceC1698o interfaceC1698o) {
        m36120f("removeObserver");
        this.f4395b.mo17282o(interfaceC1698o);
    }

    /* renamed from: h */
    public void m36118h(Lifecycle.EnumC1651b enumC1651b) {
        m36120f("handleLifecycleEvent");
        m36114l(enumC1651b.m36130b());
    }

    @Deprecated
    /* renamed from: j */
    public void m36116j(Lifecycle.State state) {
        m36120f("markState");
        m36111o(state);
    }

    /* renamed from: o */
    public void m36111o(Lifecycle.State state) {
        m36120f("setCurrentState");
        m36114l(state);
    }

    private LifecycleRegistry(LifecycleOwner lifecycleOwner, boolean z) {
        this.f4395b = new C8770a<>();
        this.f4398e = 0;
        this.f4399f = false;
        this.f4400g = false;
        this.f4401h = new ArrayList<>();
        this.f4397d = new WeakReference<>(lifecycleOwner);
        this.f4396c = Lifecycle.State.INITIALIZED;
        this.f4402i = z;
    }
}