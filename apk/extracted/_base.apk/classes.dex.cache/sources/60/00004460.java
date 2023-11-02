package net.time4j;

import java.text.ParsePosition;
import java.util.Locale;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7662o;
import p184jj.C8969a;
import p184jj.C8972b;
import p184jj.C9013s;
import p184jj.EnumC8981g;
import p184jj.EnumC9003m;
import p184jj.EnumC9016v;
import p220lj.InterfaceC10218e;

/* renamed from: net.time4j.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
enum EnumC10682d implements InterfaceC10624c1<EnumC10851z>, InterfaceC10218e<EnumC10851z> {
    AM_PM_OF_DAY;

    /* renamed from: b */
    private C9013s m10739b(InterfaceC7633d interfaceC7633d) {
        return C8972b.m16914d((Locale) interfaceC7633d.mo14441b(C8969a.f23562c, Locale.ROOT)).m16910h((EnumC9016v) interfaceC7633d.mo14441b(C8969a.f23566g, EnumC9016v.WIDE), (EnumC9003m) interfaceC7633d.mo14441b(C8969a.f23567h, EnumC9003m.FORMAT));
    }

    /* renamed from: c */
    private C9013s m10738c(Locale locale, EnumC9016v enumC9016v, EnumC9003m enumC9003m) {
        return C8972b.m16914d(locale).m16910h(enumC9016v, enumC9003m);
    }

    /* renamed from: n */
    static EnumC10851z m10732n(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int i = index + 2;
        if (charSequence.length() >= i) {
            char charAt = charSequence.charAt(index + 1);
            if (charAt == 'M' || charAt == 'm') {
                char charAt2 = charSequence.charAt(index);
                if (charAt2 != 'A' && charAt2 != 'a') {
                    if (charAt2 == 'P' || charAt2 == 'p') {
                        parsePosition.setIndex(i);
                        return EnumC10851z.PM;
                    }
                    return null;
                }
                parsePosition.setIndex(i);
                return EnumC10851z.AM;
            }
            return null;
        }
        return null;
    }

    @Override // p220lj.InterfaceC10218e
    /* renamed from: J */
    public void mo10230J(InterfaceC7662o interfaceC7662o, Appendable appendable, Locale locale, EnumC9016v enumC9016v, EnumC9003m enumC9003m) {
        appendable.append(m10738c(locale, enumC9016v, enumC9003m).m16855f((Enum) interfaceC7662o.mo10212i(this)));
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: M */
    public boolean mo9555M() {
        return false;
    }

    @Override // p184jj.InterfaceC9014t
    /* renamed from: Q */
    public void mo9904Q(InterfaceC7662o interfaceC7662o, Appendable appendable, InterfaceC7633d interfaceC7633d) {
        appendable.append(m10739b(interfaceC7633d).m16855f((Enum) interfaceC7662o.mo10212i(this)));
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: V */
    public boolean mo9553V() {
        return true;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: a */
    public char mo9552a() {
        return 'a';
    }

    @Override // java.util.Comparator
    /* renamed from: f */
    public int compare(InterfaceC7662o interfaceC7662o, InterfaceC7662o interfaceC7662o2) {
        return ((EnumC10851z) interfaceC7662o.mo10212i(this)).compareTo((EnumC10851z) interfaceC7662o2.mo10212i(this));
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: g */
    public EnumC10851z mo9551e() {
        return EnumC10851z.PM;
    }

    @Override // p162ij.InterfaceC7664p
    public Class<EnumC10851z> getType() {
        return EnumC10851z.class;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: i */
    public EnumC10851z mo9554U() {
        return EnumC10851z.AM;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: k */
    public boolean mo9930k() {
        return false;
    }

    @Override // p184jj.InterfaceC9014t
    /* renamed from: l */
    public EnumC10851z mo9903d(CharSequence charSequence, ParsePosition parsePosition, InterfaceC7633d interfaceC7633d) {
        EnumC10851z m10732n = m10732n(charSequence, parsePosition);
        if (m10732n == null) {
            return (EnumC10851z) m10739b(interfaceC7633d).m16858c(charSequence, parsePosition, getType(), interfaceC7633d);
        }
        return m10732n;
    }

    @Override // p220lj.InterfaceC10218e
    /* renamed from: m */
    public EnumC10851z mo10237A(CharSequence charSequence, ParsePosition parsePosition, Locale locale, EnumC9016v enumC9016v, EnumC9003m enumC9003m, EnumC8981g enumC8981g) {
        EnumC10851z m10732n = m10732n(charSequence, parsePosition);
        if (m10732n == null) {
            return (EnumC10851z) m10738c(locale, enumC9016v, enumC9003m).m16857d(charSequence, parsePosition, getType(), enumC8981g);
        }
        return m10732n;
    }
}