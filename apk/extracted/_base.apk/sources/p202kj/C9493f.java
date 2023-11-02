package p202kj;

import com.facebook.react.uimanager.ViewDefaults;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import net.time4j.C10582a0;
import net.time4j.C10613b1;
import p162ij.AbstractC7665q;
import p162ij.C7672x;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7662o;
import p162ij.InterfaceC7664p;
import p162ij.InterfaceC7668t;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kj.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C9493f<V> implements InterfaceC9500h<V> {

    /* renamed from: q */
    private static final InterfaceC7668t<InterfaceC7662o, Void> f25151q = new C9494a();

    /* renamed from: j */
    private final InterfaceC7664p<V> f25152j;

    /* renamed from: k */
    private final InterfaceC9491e<V> f25153k;

    /* renamed from: l */
    private final InterfaceC9488d<V> f25154l;

    /* renamed from: m */
    private final boolean f25155m;

    /* renamed from: n */
    private boolean f25156n;

    /* renamed from: o */
    private boolean f25157o;

    /* renamed from: p */
    private boolean f25158p;

    /* renamed from: kj.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    static class C9494a implements InterfaceC7668t<InterfaceC7662o, Void> {
        C9494a() {
        }

        @Override // p162ij.InterfaceC7668t
        /* renamed from: a */
        public Void apply(InterfaceC7662o interfaceC7662o) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9493f(InterfaceC7664p<V> interfaceC7664p, InterfaceC9491e<V> interfaceC9491e, InterfaceC9488d<V> interfaceC9488d) {
        this(interfaceC7664p, interfaceC9491e, interfaceC9488d, false, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static Map<InterfaceC7664p<?>, Object> m14544a(Map<InterfaceC7664p<?>, Object> map, C9479c<?> c9479c) {
        C7672x<?> m14626q = c9479c.m14626q();
        HashMap hashMap = new HashMap();
        for (InterfaceC7664p<?> interfaceC7664p : map.keySet()) {
            if (m14626q.mo20106x(interfaceC7664p)) {
                hashMap.put(interfaceC7664p, map.get(interfaceC7664p));
            }
        }
        return hashMap;
    }

    /* renamed from: i */
    private static <T> Set<C9496g> m14542i(C9479c<T> c9479c, Object obj, StringBuilder sb2, InterfaceC7633d interfaceC7633d) {
        return c9479c.m14652K(c9479c.m14626q().m20113p().cast(obj), sb2, interfaceC7633d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m14543b() {
        return this.f25158p;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: c */
    public InterfaceC7664p<V> mo14365c() {
        return this.f25152j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p202kj.InterfaceC9500h
    /* renamed from: d */
    public int mo14364d(InterfaceC7662o interfaceC7662o, Appendable appendable, InterfaceC7633d interfaceC7633d, Set<C9496g> set, boolean z) {
        if (z && this.f25156n) {
            interfaceC7633d = ((C9479c) C9479c.class.cast(this.f25153k)).m14628o();
        }
        if (this.f25155m && (interfaceC7662o instanceof C10613b1) && set == null) {
            ((C9479c) this.f25153k).m14653J(interfaceC7662o, appendable, interfaceC7633d, false);
            return ViewDefaults.NUMBER_OF_LINES;
        }
        Object mo10212i = interfaceC7662o.mo10212i(this.f25152j);
        StringBuilder sb2 = new StringBuilder();
        if ((appendable instanceof CharSequence) && set != null) {
            int length = ((CharSequence) appendable).length();
            InterfaceC9491e<V> interfaceC9491e = this.f25153k;
            if (interfaceC9491e instanceof C9479c) {
                Set<C9496g> m14542i = m14542i((C9479c) C9479c.class.cast(interfaceC9491e), mo10212i, sb2, interfaceC7633d);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (C9496g c9496g : m14542i) {
                    linkedHashSet.add(new C9496g(c9496g.m14538a(), c9496g.m14536c() + length, c9496g.m14537b() + length));
                }
                set.addAll(linkedHashSet);
            } else {
                interfaceC9491e.mo14472a(mo10212i, sb2, interfaceC7633d, f25151q);
            }
            set.add(new C9496g(this.f25152j, length, sb2.length() + length));
        } else {
            this.f25153k.mo14472a(mo10212i, sb2, interfaceC7633d, f25151q);
        }
        appendable.append(sb2);
        return sb2.length();
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: e */
    public void mo14363e(CharSequence charSequence, C9518s c9518s, InterfaceC7633d interfaceC7633d, AbstractC9519t<?> abstractC9519t, boolean z) {
        int m14430f = c9518s.m14430f();
        if (z) {
            try {
                if (this.f25157o) {
                    interfaceC7633d = ((C9479c) C9479c.class.cast(this.f25154l)).m14628o();
                }
            } catch (IndexOutOfBoundsException e) {
                c9518s.m14425k(m14430f, e.getMessage());
                return;
            }
        }
        V mo14469b = this.f25154l.mo14469b(charSequence, c9518s, interfaceC7633d);
        if (mo14469b == null) {
            c9518s.m14425k(m14430f, c9518s.m14432d());
        } else if (this.f25158p && (abstractC9519t instanceof C9520u)) {
            abstractC9519t.mo14413K(mo14469b);
        } else {
            AbstractC7665q<?> m14429g = c9518s.m14429g();
            for (InterfaceC7664p<?> interfaceC7664p : m14429g.mo14394z()) {
                if (interfaceC7664p.getType() == Integer.class) {
                    abstractC9519t.mo14415I(interfaceC7664p, m14429g.mo10218c(interfaceC7664p));
                } else {
                    abstractC9519t.mo14414J(interfaceC7664p, m14429g.mo10212i(interfaceC7664p));
                }
            }
            abstractC9519t.mo14414J(this.f25152j, mo14469b);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9493f)) {
            return false;
        }
        C9493f c9493f = (C9493f) obj;
        if (this.f25152j.equals(c9493f.f25152j) && this.f25153k.equals(c9493f.f25153k) && this.f25154l.equals(c9493f.f25154l)) {
            return true;
        }
        return false;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: f */
    public boolean mo14362f() {
        return false;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: g */
    public InterfaceC9500h<V> mo14361g(InterfaceC7664p<V> interfaceC7664p) {
        if (this.f25152j == interfaceC7664p) {
            return this;
        }
        return new C9493f(interfaceC7664p, this.f25153k, this.f25154l);
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: h */
    public InterfaceC9500h<V> mo14360h(C9479c<?> c9479c, InterfaceC7633d interfaceC7633d, int i) {
        boolean z;
        C9479c c9479c2;
        boolean z2;
        boolean z3;
        C9479c c9479c3;
        if (c9479c.m14617z() && this.f25152j.getType().equals(c9479c.m14626q().m20113p())) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC7633d instanceof C9476b) {
            InterfaceC9491e<V> interfaceC9491e = this.f25153k;
            InterfaceC9488d<V> interfaceC9488d = this.f25154l;
            Map<InterfaceC7664p<?>, Object> m14625r = c9479c.m14625r();
            C9476b c9476b = (C9476b) interfaceC7633d;
            InterfaceC9491e<V> interfaceC9491e2 = this.f25153k;
            if (interfaceC9491e2 instanceof C9479c) {
                C9479c c9479c4 = (C9479c) C9479c.class.cast(interfaceC9491e2);
                c9479c2 = c9479c4.m14644S(m14544a(m14625r, c9479c4), c9476b);
                z2 = true;
            } else {
                c9479c2 = interfaceC9491e;
                z2 = false;
            }
            InterfaceC9488d<V> interfaceC9488d2 = this.f25154l;
            if (interfaceC9488d2 instanceof C9479c) {
                C9479c c9479c5 = (C9479c) C9479c.class.cast(interfaceC9488d2);
                c9479c3 = c9479c5.m14644S(m14544a(m14625r, c9479c5), c9476b);
                z3 = true;
            } else {
                z3 = false;
                c9479c3 = interfaceC9488d;
            }
            return new C9493f(this.f25152j, c9479c2, c9479c3, z2, z3, z);
        } else if (!this.f25156n && !this.f25157o) {
            return this;
        } else {
            return new C9493f(this.f25152j, this.f25153k, this.f25154l);
        }
    }

    public int hashCode() {
        return (this.f25152j.hashCode() * 7) + (this.f25153k.hashCode() * 31) + (this.f25154l.hashCode() * 37);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(C9493f.class.getName());
        sb2.append("[element=");
        sb2.append(this.f25152j.name());
        sb2.append(", printer=");
        sb2.append(this.f25153k);
        sb2.append(", parser=");
        sb2.append(this.f25154l);
        sb2.append(']');
        return sb2.toString();
    }

    private C9493f(InterfaceC7664p<V> interfaceC7664p, InterfaceC9491e<V> interfaceC9491e, InterfaceC9488d<V> interfaceC9488d, boolean z, boolean z2, boolean z3) {
        if (interfaceC7664p == null) {
            throw new NullPointerException("Missing element.");
        }
        if (interfaceC9491e == null) {
            throw new NullPointerException("Missing printer.");
        }
        if (interfaceC9488d != null) {
            this.f25152j = interfaceC7664p;
            this.f25153k = interfaceC9491e;
            this.f25154l = interfaceC9488d;
            this.f25155m = (interfaceC9491e instanceof C9479c) && interfaceC7664p.getType() == C10582a0.class;
            this.f25156n = z;
            this.f25157o = z2;
            this.f25158p = z3;
            return;
        }
        throw new NullPointerException("Missing parser.");
    }
}
