package net.time4j;

import java.io.InvalidObjectException;
import java.lang.Enum;
import java.text.ParsePosition;
import java.util.Locale;
import p162ij.AbstractC7665q;
import p162ij.InterfaceC7631c;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7662o;
import p184jj.C8969a;
import p184jj.C8972b;
import p184jj.C9013s;
import p184jj.EnumC8981g;
import p184jj.EnumC9003m;
import p184jj.EnumC9016v;
import p184jj.InterfaceC9002l;
import p220lj.InterfaceC10218e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10784p<V extends Enum<V>> extends AbstractC10581a<V> implements InterfaceC10623c0<V>, InterfaceC9002l<V>, InterfaceC10218e<V> {
    private static final long serialVersionUID = 2055272540517425102L;

    /* renamed from: m */
    private final transient Class<V> f28150m;

    /* renamed from: n */
    private final transient V f28151n;

    /* renamed from: o */
    private final transient V f28152o;

    /* renamed from: p */
    private final transient int f28153p;

    /* renamed from: q */
    private final transient char f28154q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10784p(String str, Class<V> cls, V v, V v2, int i, char c) {
        super(str);
        this.f28150m = cls;
        this.f28151n = v;
        this.f28152o = v2;
        this.f28153p = i;
        this.f28154q = c;
    }

    private Object readResolve() {
        Object m10715K0 = C10697f0.m10715K0(name());
        if (m10715K0 != null) {
            return m10715K0;
        }
        throw new InvalidObjectException(name());
    }

    /* renamed from: x */
    private C9013s m10229x(Locale locale, EnumC9016v enumC9016v, EnumC9003m enumC9003m) {
        switch (this.f28153p) {
            case 101:
                return C8972b.m16914d(locale).m16906l(enumC9016v, enumC9003m);
            case 102:
                return C8972b.m16914d(locale).m16902p(enumC9016v, enumC9003m);
            case 103:
                return C8972b.m16914d(locale).m16907k(enumC9016v, enumC9003m);
            default:
                throw new UnsupportedOperationException(name());
        }
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: B */
    public V mo9554U() {
        return this.f28151n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public int m10235C() {
        return this.f28153p;
    }

    /* renamed from: D */
    public int m10234D(V v) {
        return v.ordinal() + 1;
    }

    @Override // p184jj.InterfaceC9014t
    /* renamed from: E */
    public V mo9903d(CharSequence charSequence, ParsePosition parsePosition, InterfaceC7633d interfaceC7633d) {
        int index = parsePosition.getIndex();
        Locale locale = (Locale) interfaceC7633d.mo14441b(C8969a.f23562c, Locale.ROOT);
        EnumC9016v enumC9016v = (EnumC9016v) interfaceC7633d.mo14441b(C8969a.f23566g, EnumC9016v.WIDE);
        InterfaceC7631c<EnumC9003m> interfaceC7631c = C8969a.f23567h;
        EnumC9003m enumC9003m = EnumC9003m.FORMAT;
        EnumC9003m enumC9003m2 = (EnumC9003m) interfaceC7633d.mo14441b(interfaceC7631c, enumC9003m);
        V v = (V) m10229x(locale, enumC9016v, enumC9003m2).m16858c(charSequence, parsePosition, getType(), interfaceC7633d);
        if (v == null && ((Boolean) interfaceC7633d.mo14441b(C8969a.f23570k, Boolean.TRUE)).booleanValue()) {
            parsePosition.setErrorIndex(-1);
            parsePosition.setIndex(index);
            if (enumC9003m2 == enumC9003m) {
                enumC9003m = EnumC9003m.STANDALONE;
            }
            return (V) m10229x(locale, enumC9016v, enumC9003m).m16858c(charSequence, parsePosition, getType(), interfaceC7633d);
        }
        return v;
    }

    @Override // p220lj.InterfaceC10218e
    /* renamed from: F */
    public V mo10237A(CharSequence charSequence, ParsePosition parsePosition, Locale locale, EnumC9016v enumC9016v, EnumC9003m enumC9003m, EnumC8981g enumC8981g) {
        int index = parsePosition.getIndex();
        V v = (V) m10229x(locale, enumC9016v, enumC9003m).m16857d(charSequence, parsePosition, getType(), enumC8981g);
        if (v == null && !enumC8981g.m16887c()) {
            parsePosition.setErrorIndex(-1);
            parsePosition.setIndex(index);
            EnumC9003m enumC9003m2 = EnumC9003m.FORMAT;
            if (enumC9003m == enumC9003m2) {
                enumC9003m2 = EnumC9003m.STANDALONE;
            }
            return (V) m10229x(locale, enumC9016v, enumC9003m2).m16857d(charSequence, parsePosition, getType(), enumC8981g);
        }
        return v;
    }

    @Override // p184jj.InterfaceC9002l
    /* renamed from: G */
    public boolean mo9907G(AbstractC7665q<?> abstractC7665q, int i) {
        V[] enumConstants;
        for (V v : getType().getEnumConstants()) {
            if (m10234D(v) == i) {
                abstractC7665q.mo14419F(this, v);
                return true;
            }
        }
        return false;
    }

    @Override // p184jj.InterfaceC9002l
    /* renamed from: I */
    public int mo9906H(V v, InterfaceC7662o interfaceC7662o, InterfaceC7633d interfaceC7633d) {
        return v.ordinal() + 1;
    }

    @Override // p220lj.InterfaceC10218e
    /* renamed from: J */
    public void mo10230J(InterfaceC7662o interfaceC7662o, Appendable appendable, Locale locale, EnumC9016v enumC9016v, EnumC9003m enumC9003m) {
        appendable.append(m10229x(locale, enumC9016v, enumC9003m).m16855f((Enum) interfaceC7662o.mo10212i(this)));
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: M */
    public boolean mo9555M() {
        return true;
    }

    @Override // p184jj.InterfaceC9014t
    /* renamed from: Q */
    public void mo9904Q(InterfaceC7662o interfaceC7662o, Appendable appendable, InterfaceC7633d interfaceC7633d) {
        appendable.append(m10229x((Locale) interfaceC7633d.mo14441b(C8969a.f23562c, Locale.ROOT), (EnumC9016v) interfaceC7633d.mo14441b(C8969a.f23566g, EnumC9016v.WIDE), (EnumC9003m) interfaceC7633d.mo14441b(C8969a.f23567h, EnumC9003m.FORMAT)).m16855f((Enum) interfaceC7662o.mo10212i(this)));
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: V */
    public boolean mo9553V() {
        return false;
    }

    @Override // p162ij.AbstractC7635e, p162ij.InterfaceC7664p
    /* renamed from: a */
    public char mo9552a() {
        return this.f28154q;
    }

    @Override // p162ij.InterfaceC7664p
    public Class<V> getType() {
        return this.f28150m;
    }

    @Override // p162ij.AbstractC7635e
    /* renamed from: v */
    protected boolean mo9550v() {
        return true;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: y */
    public V mo9551e() {
        return this.f28152o;
    }
}
