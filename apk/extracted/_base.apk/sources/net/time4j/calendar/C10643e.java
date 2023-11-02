package net.time4j.calendar;

import java.io.Serializable;
import java.text.ParsePosition;
import java.util.Locale;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7662o;
import p184jj.C8969a;
import p184jj.EnumC8981g;
import p184jj.InterfaceC9014t;

/* renamed from: net.time4j.calendar.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
class C10643e implements InterfaceC9014t<C10640c>, Serializable {

    /* renamed from: j */
    static final C10643e f27745j = new C10643e();
    private static final long serialVersionUID = -4211396220263977858L;

    C10643e() {
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: M */
    public boolean mo9555M() {
        return true;
    }

    @Override // p184jj.InterfaceC9014t
    /* renamed from: Q */
    public void mo9904Q(InterfaceC7662o interfaceC7662o, Appendable appendable, InterfaceC7633d interfaceC7633d) {
        appendable.append(((C10640c) interfaceC7662o.mo10212i(this)).m10811g((Locale) interfaceC7633d.mo14441b(C8969a.f23562c, Locale.ROOT)));
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: V */
    public boolean mo9553V() {
        return false;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: a */
    public char mo9552a() {
        return 'U';
    }

    @Override // java.util.Comparator
    /* renamed from: b */
    public int compare(InterfaceC7662o interfaceC7662o, InterfaceC7662o interfaceC7662o2) {
        return ((C10640c) interfaceC7662o.mo10212i(this)).compareTo((C10664o) interfaceC7662o2.mo10212i(this));
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: c */
    public C10640c mo9551e() {
        return C10640c.m10947o(60);
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: f */
    public C10640c mo9554U() {
        return C10640c.m10947o(1);
    }

    @Override // p184jj.InterfaceC9014t
    /* renamed from: g */
    public C10640c mo9903d(CharSequence charSequence, ParsePosition parsePosition, InterfaceC7633d interfaceC7633d) {
        return C10640c.m10946p(charSequence, parsePosition, (Locale) interfaceC7633d.mo14441b(C8969a.f23562c, Locale.ROOT), !((EnumC8981g) interfaceC7633d.mo14441b(C8969a.f23565f, EnumC8981g.SMART)).m16887c());
    }

    @Override // p162ij.InterfaceC7664p
    public Class<C10640c> getType() {
        return C10640c.class;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: k */
    public boolean mo9930k() {
        return false;
    }

    @Override // p162ij.InterfaceC7664p
    public String name() {
        return "CYCLIC_YEAR";
    }

    protected Object readResolve() {
        return f27745j;
    }
}
