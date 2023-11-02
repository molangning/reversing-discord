package net.time4j.calendar;

import java.io.Serializable;
import java.util.Locale;
import net.time4j.EnumC10612b0;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7662o;
import p184jj.C8969a;
import p184jj.C8972b;
import p184jj.C9013s;
import p184jj.EnumC8985j;
import p184jj.EnumC9003m;
import p184jj.EnumC9016v;
import p184jj.InterfaceC9014t;
import p220lj.InterfaceC10214a;

/* renamed from: net.time4j.calendar.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
class C10650g implements InterfaceC9014t<C10651h>, Serializable {

    /* renamed from: j */
    static final C10650g f27758j = new C10650g();
    private static final long serialVersionUID = -5874268477318061153L;

    C10650g() {
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: M */
    public boolean mo9555M() {
        return true;
    }

    @Override // p184jj.InterfaceC9014t
    /* renamed from: Q */
    public void mo9904Q(InterfaceC7662o interfaceC7662o, Appendable appendable, InterfaceC7633d interfaceC7633d) {
        C9013s m16906l;
        Locale locale = (Locale) interfaceC7633d.mo14441b(C8969a.f23562c, Locale.ROOT);
        C10651h c10651h = (C10651h) interfaceC7662o.mo10212i(this);
        if (interfaceC7633d.mo14442a(InterfaceC10214a.f26520d)) {
            appendable.append(c10651h.m10872b(locale, (EnumC8985j) interfaceC7633d.mo14441b(C8969a.f23571l, EnumC8985j.f23622j), interfaceC7633d));
            return;
        }
        EnumC9016v enumC9016v = (EnumC9016v) interfaceC7633d.mo14441b(C8969a.f23566g, EnumC9016v.WIDE);
        EnumC9003m enumC9003m = (EnumC9003m) interfaceC7633d.mo14441b(C8969a.f23567h, EnumC9003m.FORMAT);
        if (c10651h.m10871c()) {
            m16906l = C8972b.m16915c("chinese", locale).m16911g(enumC9016v, enumC9003m);
        } else {
            m16906l = C8972b.m16915c("chinese", locale).m16906l(enumC9016v, enumC9003m);
        }
        appendable.append(m16906l.m16855f(EnumC10612b0.m11058d(c10651h.getNumber())));
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: V */
    public boolean mo9553V() {
        return false;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: a */
    public char mo9552a() {
        return 'M';
    }

    @Override // java.util.Comparator
    /* renamed from: b */
    public int compare(InterfaceC7662o interfaceC7662o, InterfaceC7662o interfaceC7662o2) {
        return ((C10651h) interfaceC7662o.mo10212i(this)).compareTo((C10651h) interfaceC7662o2.mo10212i(this));
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: c */
    public C10651h mo9551e() {
        return C10651h.m10870d(12);
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: f */
    public C10651h mo9554U() {
        return C10651h.m10870d(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0149  */
    @Override // p184jj.InterfaceC9014t
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public net.time4j.calendar.C10651h mo9903d(java.lang.CharSequence r19, java.text.ParsePosition r20, p162ij.InterfaceC7633d r21) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.calendar.C10650g.mo9903d(java.lang.CharSequence, java.text.ParsePosition, ij.d):net.time4j.calendar.h");
    }

    @Override // p162ij.InterfaceC7664p
    public Class<C10651h> getType() {
        return C10651h.class;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: k */
    public boolean mo9930k() {
        return false;
    }

    @Override // p162ij.InterfaceC7664p
    public String name() {
        return "MONTH_OF_YEAR";
    }

    protected Object readResolve() {
        return f27758j;
    }
}