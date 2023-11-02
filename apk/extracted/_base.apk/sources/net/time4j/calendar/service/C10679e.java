package net.time4j.calendar.service;

import java.lang.Enum;
import java.text.ParsePosition;
import java.util.Locale;
import p162ij.AbstractC7665q;
import p162ij.InterfaceC7631c;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7662o;
import p162ij.InterfaceC7670v;
import p184jj.C8969a;
import p184jj.C8972b;
import p184jj.C9013s;
import p184jj.EnumC9003m;
import p184jj.EnumC9016v;
import p184jj.InterfaceC8977c;
import p184jj.InterfaceC9002l;
import p184jj.InterfaceC9014t;

/* renamed from: net.time4j.calendar.service.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C10679e<V extends Enum<V>, T extends AbstractC7665q<T>> extends AbstractC10678d<V, T> implements InterfaceC9002l<V>, InterfaceC9014t<V> {
    private static final long serialVersionUID = -2452569351302286113L;

    /* renamed from: m */
    private final transient Class<V> f27860m;

    /* renamed from: n */
    private final transient String f27861n;

    /* renamed from: o */
    private final transient InterfaceC7670v<T> f27862o;

    /* renamed from: p */
    private final transient InterfaceC7670v<T> f27863p;

    public C10679e(String str, Class<T> cls, Class<V> cls2, char c) {
        super(str, cls, c, m10752L(c));
        this.f27860m = cls2;
        this.f27861n = m10748y(cls);
        this.f27862o = null;
        this.f27863p = null;
    }

    /* renamed from: L */
    private static boolean m10752L(char c) {
        return c == 'E';
    }

    /* renamed from: y */
    private static String m10748y(Class<?> cls) {
        InterfaceC8977c interfaceC8977c = (InterfaceC8977c) cls.getAnnotation(InterfaceC8977c.class);
        if (interfaceC8977c == null) {
            return "iso8601";
        }
        return interfaceC8977c.value();
    }

    /* renamed from: B */
    protected String m10757B(InterfaceC7633d interfaceC7633d) {
        if (!m10754I() && !m10755F()) {
            if (mo10753K()) {
                return "iso8601";
            }
            return this.f27861n;
        }
        return (String) interfaceC7633d.mo14441b(C8969a.f23561b, this.f27861n);
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: C */
    public V mo9551e() {
        V[] enumConstants = this.f27860m.getEnumConstants();
        return enumConstants[enumConstants.length - 1];
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: D */
    public V mo9554U() {
        return this.f27860m.getEnumConstants()[0];
    }

    /* renamed from: E */
    protected boolean m10756E(InterfaceC7662o interfaceC7662o) {
        return false;
    }

    /* renamed from: F */
    protected boolean m10755F() {
        return mo9552a() == 'G';
    }

    @Override // p184jj.InterfaceC9002l
    /* renamed from: G */
    public boolean mo9907G(AbstractC7665q<?> abstractC7665q, int i) {
        V[] enumConstants;
        for (V v : getType().getEnumConstants()) {
            if (mo10743N(v) == i) {
                abstractC7665q.mo14419F(this, v);
                return true;
            }
        }
        return false;
    }

    /* renamed from: I */
    protected boolean m10754I() {
        return mo9552a() == 'M';
    }

    /* renamed from: K */
    protected boolean mo10753K() {
        return m10752L(mo9552a());
    }

    /* renamed from: N */
    public int mo10743N(V v) {
        return v.ordinal() + 1;
    }

    @Override // p184jj.InterfaceC9014t
    /* renamed from: O */
    public V mo9903d(CharSequence charSequence, ParsePosition parsePosition, InterfaceC7633d interfaceC7633d) {
        int index = parsePosition.getIndex();
        InterfaceC7631c<EnumC9003m> interfaceC7631c = C8969a.f23567h;
        EnumC9003m enumC9003m = EnumC9003m.FORMAT;
        EnumC9003m enumC9003m2 = (EnumC9003m) interfaceC7633d.mo14441b(interfaceC7631c, enumC9003m);
        V v = (V) m10749x(interfaceC7633d, enumC9003m2, false).m16858c(charSequence, parsePosition, getType(), interfaceC7633d);
        if (v == null && m10754I()) {
            parsePosition.setErrorIndex(-1);
            parsePosition.setIndex(index);
            v = (V) m10749x(interfaceC7633d, enumC9003m2, true).m16858c(charSequence, parsePosition, getType(), interfaceC7633d);
        }
        if (v == null && ((Boolean) interfaceC7633d.mo14441b(C8969a.f23570k, Boolean.TRUE)).booleanValue()) {
            parsePosition.setErrorIndex(-1);
            parsePosition.setIndex(index);
            if (enumC9003m2 == enumC9003m) {
                enumC9003m = EnumC9003m.STANDALONE;
            }
            V v2 = (V) m10749x(interfaceC7633d, enumC9003m, false).m16858c(charSequence, parsePosition, getType(), interfaceC7633d);
            if (v2 == null && m10754I()) {
                parsePosition.setErrorIndex(-1);
                parsePosition.setIndex(index);
                return (V) m10749x(interfaceC7633d, enumC9003m, true).m16858c(charSequence, parsePosition, getType(), interfaceC7633d);
            }
            return v2;
        }
        return v;
    }

    @Override // p184jj.InterfaceC9002l
    /* renamed from: P */
    public int mo9906H(V v, InterfaceC7662o interfaceC7662o, InterfaceC7633d interfaceC7633d) {
        return mo10743N(v);
    }

    @Override // p184jj.InterfaceC9014t
    /* renamed from: Q */
    public void mo9904Q(InterfaceC7662o interfaceC7662o, Appendable appendable, InterfaceC7633d interfaceC7633d) {
        appendable.append(m10749x(interfaceC7633d, (EnumC9003m) interfaceC7633d.mo14441b(C8969a.f23567h, EnumC9003m.FORMAT), m10756E(interfaceC7662o)).m16855f((Enum) interfaceC7662o.mo10212i(this)));
    }

    @Override // p162ij.InterfaceC7664p
    public Class<V> getType() {
        return this.f27860m;
    }

    /* renamed from: x */
    protected C9013s m10749x(InterfaceC7633d interfaceC7633d, EnumC9003m enumC9003m, boolean z) {
        EnumC9016v enumC9016v = (EnumC9016v) interfaceC7633d.mo14441b(C8969a.f23566g, EnumC9016v.WIDE);
        C8972b m16915c = C8972b.m16915c(m10757B(interfaceC7633d), (Locale) interfaceC7633d.mo14441b(C8969a.f23562c, Locale.ROOT));
        if (m10754I()) {
            if (z) {
                return m16915c.m16911g(enumC9016v, enumC9003m);
            }
            return m16915c.m16906l(enumC9016v, enumC9003m);
        } else if (mo10753K()) {
            return m16915c.m16902p(enumC9016v, enumC9003m);
        } else {
            if (m10755F()) {
                return m16915c.m16916b(enumC9016v);
            }
            return m16915c.m16903o(name(), this.f27860m, new String[0]);
        }
    }
}
