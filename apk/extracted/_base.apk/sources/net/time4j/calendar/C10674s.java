package net.time4j.calendar;

import net.time4j.C10852z0;
import net.time4j.EnumC10846x0;
import net.time4j.base.C10616c;
import p162ij.InterfaceC7641g;
import p162ij.InterfaceC7653k;
import p162ij.InterfaceC7664p;
import p162ij.InterfaceC7668t;
import p162ij.InterfaceC7676z;

/* renamed from: net.time4j.calendar.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
class C10674s<D extends InterfaceC7641g> implements InterfaceC7676z<D, EnumC10846x0> {

    /* renamed from: j */
    private final C10852z0 f27852j;

    /* renamed from: k */
    private final InterfaceC7668t<D, InterfaceC7653k<D>> f27853k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10674s(C10852z0 c10852z0, InterfaceC7668t<D, InterfaceC7653k<D>> interfaceC7668t) {
        this.f27852j = c10852z0;
        this.f27853k = interfaceC7668t;
    }

    /* renamed from: k */
    private static EnumC10846x0 m10768k(long j) {
        return EnumC10846x0.m9993f(C10616c.m11038d(j + 5, 7) + 1);
    }

    @Override // p162ij.InterfaceC7676z
    /* renamed from: a */
    public InterfaceC7664p<?> mo9926b(D d) {
        return null;
    }

    @Override // p162ij.InterfaceC7676z
    /* renamed from: d */
    public InterfaceC7664p<?> mo9925c(D d) {
        return null;
    }

    @Override // p162ij.InterfaceC7676z
    /* renamed from: e */
    public EnumC10846x0 mo9922f(D d) {
        InterfaceC7653k<D> apply = this.f27853k.apply(d);
        if ((d.mo10920b() + 7) - mo9915o(d).m9996c(this.f27852j) > apply.mo10630a()) {
            return m10768k(apply.mo10630a());
        }
        return this.f27852j.m9973f().m9995d(6);
    }

    @Override // p162ij.InterfaceC7676z
    /* renamed from: h */
    public EnumC10846x0 mo9917l(D d) {
        InterfaceC7653k<D> apply = this.f27853k.apply(d);
        if ((d.mo10920b() + 1) - mo9915o(d).m9996c(this.f27852j) < apply.mo10627d()) {
            return m10768k(apply.mo10627d());
        }
        return this.f27852j.m9973f();
    }

    @Override // p162ij.InterfaceC7676z
    /* renamed from: j */
    public EnumC10846x0 mo9915o(D d) {
        return m10768k(d.mo10920b());
    }

    @Override // p162ij.InterfaceC7676z
    /* renamed from: p */
    public boolean mo9920i(D d, EnumC10846x0 enumC10846x0) {
        if (enumC10846x0 == null) {
            return false;
        }
        int m9996c = mo9915o(d).m9996c(this.f27852j);
        long mo10920b = (d.mo10920b() + enumC10846x0.m9996c(this.f27852j)) - m9996c;
        InterfaceC7653k<D> apply = this.f27853k.apply(d);
        if (mo10920b < apply.mo10627d() || mo10920b > apply.mo10630a()) {
            return false;
        }
        return true;
    }

    @Override // p162ij.InterfaceC7676z
    /* renamed from: q */
    public D mo9916n(D d, EnumC10846x0 enumC10846x0, boolean z) {
        if (enumC10846x0 != null) {
            int m9996c = mo9915o(d).m9996c(this.f27852j);
            long mo10920b = (d.mo10920b() + enumC10846x0.m9996c(this.f27852j)) - m9996c;
            InterfaceC7653k<D> apply = this.f27853k.apply(d);
            if (mo10920b >= apply.mo10627d() && mo10920b <= apply.mo10630a()) {
                return apply.mo10629b(mo10920b);
            }
            throw new IllegalArgumentException("New day out of supported range.");
        }
        throw new IllegalArgumentException("Missing weekday.");
    }
}
