package p202kj;

import com.facebook.react.uimanager.ViewDefaults;
import java.util.Locale;
import java.util.Set;
import net.time4j.C10697f0;
import net.time4j.EnumC10612b0;
import p162ij.InterfaceC7631c;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7662o;
import p162ij.InterfaceC7664p;
import p184jj.C8969a;
import p184jj.EnumC8981g;
import p184jj.EnumC9003m;
import p184jj.EnumC9016v;
import p184jj.InterfaceC9014t;
import p220lj.InterfaceC10214a;
import p220lj.InterfaceC10218e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kj.a0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C9475a0<V> implements InterfaceC9500h<V> {

    /* renamed from: j */
    private final InterfaceC9014t<V> f25063j;

    /* renamed from: k */
    private final boolean f25064k;

    /* renamed from: l */
    private final InterfaceC10218e<V> f25065l;

    /* renamed from: m */
    private final Locale f25066m;

    /* renamed from: n */
    private final EnumC9016v f25067n;

    /* renamed from: o */
    private final EnumC9003m f25068o;

    /* renamed from: p */
    private final EnumC8981g f25069p;

    /* renamed from: q */
    private final int f25070q;

    private C9475a0(InterfaceC9014t<V> interfaceC9014t, boolean z, Locale locale, EnumC9016v enumC9016v, EnumC9003m enumC9003m, EnumC8981g enumC8981g, int i) {
        InterfaceC10218e<V> interfaceC10218e;
        if (interfaceC9014t != null) {
            this.f25063j = interfaceC9014t;
            this.f25064k = z;
            if (interfaceC9014t instanceof InterfaceC10218e) {
                interfaceC10218e = (InterfaceC10218e) interfaceC9014t;
            } else {
                interfaceC10218e = null;
            }
            this.f25065l = interfaceC10218e;
            this.f25066m = locale;
            this.f25067n = enumC9016v;
            this.f25068o = enumC9003m;
            this.f25069p = enumC8981g;
            this.f25070q = i;
            return;
        }
        throw new NullPointerException("Missing element.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <V> C9475a0<V> m14683a(InterfaceC9014t<V> interfaceC9014t) {
        return new C9475a0<>(interfaceC9014t, false, Locale.ROOT, EnumC9016v.WIDE, EnumC9003m.FORMAT, EnumC8981g.SMART, 0);
    }

    /* renamed from: b */
    private boolean m14682b(InterfaceC7662o interfaceC7662o, Appendable appendable, InterfaceC7633d interfaceC7633d, boolean z) {
        InterfaceC10218e<V> interfaceC10218e = this.f25065l;
        if (interfaceC10218e != null && z) {
            interfaceC10218e.mo10230J(interfaceC7662o, appendable, this.f25066m, this.f25067n, this.f25068o);
            return true;
        } else if (interfaceC7662o.mo10210q(this.f25063j)) {
            this.f25063j.mo9904Q(interfaceC7662o, appendable, interfaceC7633d);
            return true;
        } else {
            return false;
        }
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: c */
    public InterfaceC7664p<V> mo14365c() {
        return this.f25063j;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: d */
    public int mo14364d(InterfaceC7662o interfaceC7662o, Appendable appendable, InterfaceC7633d interfaceC7633d, Set<C9496g> set, boolean z) {
        if (appendable instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) appendable;
            int length = charSequence.length();
            if (m14682b(interfaceC7662o, appendable, interfaceC7633d, z)) {
                if (set != null) {
                    set.add(new C9496g(this.f25063j, length, charSequence.length()));
                }
                return charSequence.length() - length;
            }
            return -1;
        } else if (m14682b(interfaceC7662o, appendable, interfaceC7633d, z)) {
            return ViewDefaults.NUMBER_OF_LINES;
        } else {
            return -1;
        }
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: e */
    public void mo14363e(CharSequence charSequence, C9518s c9518s, InterfaceC7633d interfaceC7633d, AbstractC9519t<?> abstractC9519t, boolean z) {
        int intValue;
        Object mo9903d;
        InterfaceC10218e<V> interfaceC10218e;
        int m14430f = c9518s.m14430f();
        int length = charSequence.length();
        if (z) {
            intValue = this.f25070q;
        } else {
            intValue = ((Integer) interfaceC7633d.mo14441b(C8969a.f23578s, 0)).intValue();
        }
        if (intValue > 0) {
            length -= intValue;
        }
        if (m14430f >= length) {
            c9518s.m14425k(m14430f, "Missing chars for: " + this.f25063j.name());
            c9518s.m14422n();
            return;
        }
        if (z && (interfaceC10218e = this.f25065l) != null && this.f25069p != null) {
            mo9903d = interfaceC10218e.mo10237A(charSequence, c9518s.m14431e(), this.f25066m, this.f25067n, this.f25068o, this.f25069p);
        } else {
            InterfaceC9014t<V> interfaceC9014t = this.f25063j;
            if (interfaceC9014t instanceof InterfaceC10214a) {
                mo9903d = ((InterfaceC10214a) interfaceC9014t).mo10347h(charSequence, c9518s.m14431e(), interfaceC7633d, abstractC9519t);
            } else {
                mo9903d = interfaceC9014t.mo9903d(charSequence, c9518s.m14431e(), interfaceC7633d);
            }
        }
        if (c9518s.m14427i()) {
            Class<V> type = this.f25063j.getType();
            if (type.isEnum()) {
                int m14433c = c9518s.m14433c();
                c9518s.m14425k(m14433c, "No suitable enum found: " + type.getName());
                return;
            }
            int m14433c2 = c9518s.m14433c();
            c9518s.m14425k(m14433c2, "Unparseable element: " + this.f25063j.name());
        } else if (mo9903d == null) {
            c9518s.m14425k(m14430f, "No interpretable value.");
        } else {
            InterfaceC9014t<V> interfaceC9014t2 = this.f25063j;
            if (interfaceC9014t2 == C10697f0.f27886B) {
                abstractC9519t.mo14415I(C10697f0.f27887C, ((EnumC10612b0) EnumC10612b0.class.cast(mo9903d)).m11060b());
            } else {
                abstractC9519t.mo14414J(interfaceC9014t2, mo9903d);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9475a0)) {
            return false;
        }
        C9475a0 c9475a0 = (C9475a0) obj;
        if (this.f25063j.equals(c9475a0.f25063j) && this.f25064k == c9475a0.f25064k) {
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
        if (!this.f25064k && this.f25063j != interfaceC7664p) {
            if (interfaceC7664p instanceof InterfaceC9014t) {
                return m14683a((InterfaceC9014t) interfaceC7664p);
            }
            throw new IllegalArgumentException("Text element required: " + interfaceC7664p.getClass().getName());
        }
        return this;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: h */
    public InterfaceC9500h<V> mo14360h(C9479c<?> c9479c, InterfaceC7633d interfaceC7633d, int i) {
        EnumC8981g enumC8981g;
        InterfaceC7631c<EnumC8981g> interfaceC7631c = C8969a.f23565f;
        EnumC8981g enumC8981g2 = EnumC8981g.SMART;
        EnumC8981g enumC8981g3 = (EnumC8981g) interfaceC7633d.mo14441b(interfaceC7631c, enumC8981g2);
        InterfaceC7631c<Boolean> interfaceC7631c2 = C8969a.f23570k;
        Boolean bool = Boolean.TRUE;
        boolean booleanValue = ((Boolean) interfaceC7633d.mo14441b(interfaceC7631c2, bool)).booleanValue();
        boolean booleanValue2 = ((Boolean) interfaceC7633d.mo14441b(C8969a.f23568i, bool)).booleanValue();
        boolean booleanValue3 = ((Boolean) interfaceC7633d.mo14441b(C8969a.f23569j, Boolean.FALSE)).booleanValue();
        if ((enumC8981g3 == EnumC8981g.STRICT && (booleanValue || booleanValue2 || booleanValue3)) || ((enumC8981g3 == enumC8981g2 && (!booleanValue || !booleanValue2 || booleanValue3)) || !booleanValue || !booleanValue2 || !booleanValue3)) {
            enumC8981g = null;
        } else {
            enumC8981g = enumC8981g3;
        }
        return new C9475a0(this.f25063j, this.f25064k, (Locale) interfaceC7633d.mo14441b(C8969a.f23562c, Locale.ROOT), (EnumC9016v) interfaceC7633d.mo14441b(C8969a.f23566g, EnumC9016v.WIDE), (EnumC9003m) interfaceC7633d.mo14441b(C8969a.f23567h, EnumC9003m.FORMAT), enumC8981g, ((Integer) interfaceC7633d.mo14441b(C8969a.f23578s, 0)).intValue());
    }

    public int hashCode() {
        return this.f25063j.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(C9475a0.class.getName());
        sb2.append("[element=");
        sb2.append(this.f25063j.name());
        sb2.append(",protected-mode=");
        sb2.append(this.f25064k);
        sb2.append(']');
        return sb2.toString();
    }
}
