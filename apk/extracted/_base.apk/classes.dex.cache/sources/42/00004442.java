package net.time4j.calendar;

import java.io.Serializable;
import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.calendar.AbstractC10644f;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7662o;
import p162ij.InterfaceC7664p;
import p162ij.InterfaceC7676z;
import p184jj.C8969a;
import p184jj.InterfaceC9014t;

/* renamed from: net.time4j.calendar.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
class C10652i<D extends AbstractC10644f<?, D>> implements InterfaceC9014t<EnumC10667p>, InterfaceC7676z<D, EnumC10667p>, Serializable {

    /* renamed from: j */
    private static final C10652i f27762j = new C10652i();
    private static final long serialVersionUID = 4572549754637955194L;

    C10652i() {
    }

    /* renamed from: u */
    public static <D extends AbstractC10644f<?, D>> C10652i<D> m10861u() {
        return f27762j;
    }

    @Override // p184jj.InterfaceC9014t
    /* renamed from: B */
    public EnumC10667p mo9903d(CharSequence charSequence, ParsePosition parsePosition, InterfaceC7633d interfaceC7633d) {
        Locale locale = (Locale) interfaceC7633d.mo14441b(C8969a.f23562c, Locale.ROOT);
        int length = charSequence.length();
        if (parsePosition.getIndex() >= length) {
            parsePosition.setErrorIndex(length);
            return null;
        }
        return EnumC10667p.m10794k(charSequence, locale, parsePosition);
    }

    @Override // p162ij.InterfaceC7676z
    /* renamed from: C */
    public D mo9916n(D d, EnumC10667p enumC10667p, boolean z) {
        if (enumC10667p != null) {
            return (D) d.m20120G(enumC10667p.m10793l());
        }
        throw new IllegalArgumentException("Missing solar term.");
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: M */
    public boolean mo9555M() {
        return true;
    }

    @Override // p184jj.InterfaceC9014t
    /* renamed from: Q */
    public void mo9904Q(InterfaceC7662o interfaceC7662o, Appendable appendable, InterfaceC7633d interfaceC7633d) {
        appendable.append(((EnumC10667p) interfaceC7662o.mo10212i(this)).m10801c((Locale) interfaceC7633d.mo14441b(C8969a.f23562c, Locale.ROOT)));
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: V */
    public boolean mo9553V() {
        return false;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: a */
    public char mo9552a() {
        return (char) 0;
    }

    @Override // p162ij.InterfaceC7664p
    public Class<EnumC10667p> getType() {
        return EnumC10667p.class;
    }

    @Override // java.util.Comparator
    /* renamed from: j */
    public int compare(InterfaceC7662o interfaceC7662o, InterfaceC7662o interfaceC7662o2) {
        return ((EnumC10667p) interfaceC7662o.mo10212i(this)).compareTo((EnumC10667p) interfaceC7662o2.mo10212i(this));
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: k */
    public boolean mo9930k() {
        return false;
    }

    @Override // p162ij.InterfaceC7664p
    public String name() {
        return "SOLAR_TERM";
    }

    @Override // p162ij.InterfaceC7676z
    /* renamed from: p */
    public InterfaceC7664p<?> mo9926b(D d) {
        throw new AbstractMethodError();
    }

    @Override // p162ij.InterfaceC7676z
    /* renamed from: q */
    public InterfaceC7664p<?> mo9925c(D d) {
        throw new AbstractMethodError();
    }

    protected Object readResolve() {
        return f27762j;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: s */
    public EnumC10667p mo9551e() {
        return EnumC10667p.MAJOR_12_DAHAN_300;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: t */
    public EnumC10667p mo9554U() {
        return EnumC10667p.MINOR_01_LICHUN_315;
    }

    @Override // p162ij.InterfaceC7676z
    /* renamed from: v */
    public EnumC10667p mo9922f(D d) {
        AbstractC10642d mo10922Z = d.mo10922Z();
        return EnumC10667p.m10796h(mo10922Z.m10936n(mo10922Z.m10933q(d.m10921a0(), d.m10910k0().getNumber()) + d.lengthOfYear()));
    }

    @Override // p162ij.InterfaceC7676z
    /* renamed from: w */
    public EnumC10667p mo9917l(D d) {
        AbstractC10642d mo10922Z = d.mo10922Z();
        return EnumC10667p.m10796h(mo10922Z.m10936n(mo10922Z.m10933q(d.m10921a0(), d.m10910k0().getNumber()) + 1));
    }

    @Override // p162ij.InterfaceC7676z
    /* renamed from: x */
    public EnumC10667p mo9915o(D d) {
        return EnumC10667p.m10796h(d.mo10922Z().m10936n(d.mo10920b() + 1));
    }

    @Override // p162ij.InterfaceC7676z
    /* renamed from: y */
    public boolean mo9920i(D d, EnumC10667p enumC10667p) {
        return enumC10667p != null;
    }
}