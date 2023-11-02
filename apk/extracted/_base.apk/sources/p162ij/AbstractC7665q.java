package p162ij;

import java.util.Set;
import net.time4j.p249tz.InterfaceC10808k;
import p162ij.AbstractC7665q;

/* renamed from: ij.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC7665q<T extends AbstractC7665q<T>> implements InterfaceC7662o {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public <V> InterfaceC7676z<T, V> mo20123A(InterfaceC7664p<V> interfaceC7664p) {
        return mo10478v().m20108v(interfaceC7664p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: B */
    public boolean m20122B(InterfaceC7664p<Long> interfaceC7664p, long j) {
        return mo14421C(interfaceC7664p, Long.valueOf(j));
    }

    /* renamed from: C */
    public <V> boolean mo14421C(InterfaceC7664p<V> interfaceC7664p, V v) {
        if (interfaceC7664p != null) {
            if (mo10210q(interfaceC7664p) && mo20123A(interfaceC7664p).mo9920i(mo10477w(), v)) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("Missing chronological element.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: D */
    public T mo14420D(InterfaceC7664p<Integer> interfaceC7664p, int i) {
        InterfaceC7632c0<T> m20110t = mo10478v().m20110t(interfaceC7664p);
        if (m20110t != null) {
            return m20110t.mo10650g(mo10477w(), i, interfaceC7664p.mo9930k());
        }
        return mo14419F(interfaceC7664p, Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: E */
    public T m20121E(InterfaceC7664p<Long> interfaceC7664p, long j) {
        return mo14419F(interfaceC7664p, Long.valueOf(j));
    }

    /* renamed from: F */
    public <V> T mo14419F(InterfaceC7664p<V> interfaceC7664p, V v) {
        return mo20123A(interfaceC7664p).mo9916n(mo10477w(), v, interfaceC7664p.mo9930k());
    }

    /* renamed from: G */
    public T m20120G(InterfaceC7670v<T> interfaceC7670v) {
        return interfaceC7670v.apply(mo10477w());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p162ij.InterfaceC7662o
    /* renamed from: c */
    public int mo10218c(InterfaceC7664p<Integer> interfaceC7664p) {
        InterfaceC7632c0<T> m20110t = mo10478v().m20110t(interfaceC7664p);
        try {
            if (m20110t == null) {
                return ((Integer) mo10212i(interfaceC7664p)).intValue();
            }
            return m20110t.mo10646m(mo10477w());
        } catch (C7666r unused) {
            return Integer.MIN_VALUE;
        }
    }

    @Override // p162ij.InterfaceC7662o
    /* renamed from: d */
    public boolean mo10217d() {
        return false;
    }

    @Override // p162ij.InterfaceC7662o
    /* renamed from: f */
    public <V> V mo10215f(InterfaceC7664p<V> interfaceC7664p) {
        return mo20123A(interfaceC7664p).mo9917l(mo10477w());
    }

    @Override // p162ij.InterfaceC7662o
    /* renamed from: i */
    public <V> V mo10212i(InterfaceC7664p<V> interfaceC7664p) {
        return mo20123A(interfaceC7664p).mo9915o(mo10477w());
    }

    @Override // p162ij.InterfaceC7662o
    /* renamed from: l */
    public <V> V mo10211l(InterfaceC7664p<V> interfaceC7664p) {
        return mo20123A(interfaceC7664p).mo9922f(mo10477w());
    }

    @Override // p162ij.InterfaceC7662o
    /* renamed from: q */
    public boolean mo10210q(InterfaceC7664p<?> interfaceC7664p) {
        return mo10478v().mo20106x(interfaceC7664p);
    }

    @Override // p162ij.InterfaceC7662o
    /* renamed from: t */
    public InterfaceC10808k mo10209t() {
        throw new C7666r("Timezone not available: " + this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public abstract C7672x<T> mo10478v();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public T mo10477w() {
        C7672x<T> mo10478v = mo10478v();
        Class<T> m20113p = mo10478v.m20113p();
        if (m20113p.isInstance(this)) {
            return m20113p.cast(this);
        }
        for (InterfaceC7664p<?> interfaceC7664p : mo10478v.m20109u()) {
            if (m20113p == interfaceC7664p.getType()) {
                return m20113p.cast(mo10212i(interfaceC7664p));
            }
        }
        throw new IllegalStateException("Implementation error: Cannot find entity context.");
    }

    /* renamed from: z */
    public Set<InterfaceC7664p<?>> mo14394z() {
        return mo10478v().m20109u();
    }
}
