package p272oj;

import java.util.Locale;
import java.util.Set;
import net.time4j.C10697f0;
import net.time4j.history.C10736d;
import net.time4j.history.C10741h;
import net.time4j.history.EnumC10744j;
import p162ij.AbstractC7665q;
import p162ij.InterfaceC7631c;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7664p;
import p162ij.InterfaceC7667s;
import p184jj.C8969a;
import p184jj.EnumC8981g;
import p235mj.EnumC10476a;
import p251nj.C10915a;
import p251nj.C10918c;

/* renamed from: oj.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class C11177b implements InterfaceC7667s {
    /* renamed from: e */
    private static C10736d m9071e(Locale locale, InterfaceC7633d interfaceC7633d) {
        InterfaceC7631c<String> interfaceC7631c = C8969a.f23561b;
        if (((String) interfaceC7633d.mo14441b(interfaceC7631c, "iso8601")).equals("julian")) {
            return C10736d.f28011A;
        }
        InterfaceC7631c<C10736d> interfaceC7631c2 = C10915a.f28643a;
        if (interfaceC7633d.mo14442a(interfaceC7631c2)) {
            return (C10736d) interfaceC7633d.mo14440c(interfaceC7631c2);
        }
        if (((String) interfaceC7633d.mo14441b(interfaceC7631c, "iso8601")).equals("historic")) {
            InterfaceC7631c<String> interfaceC7631c3 = C8969a.f23579t;
            if (interfaceC7633d.mo14442a(interfaceC7631c3)) {
                return C10736d.m10411j((String) interfaceC7633d.mo14440c(interfaceC7631c3));
            }
        }
        return C10736d.m10430D(locale);
    }

    @Override // p162ij.InterfaceC7667s
    /* renamed from: a */
    public boolean mo9075a(InterfaceC7664p<?> interfaceC7664p) {
        return interfaceC7664p instanceof C10918c;
    }

    @Override // p162ij.InterfaceC7667s
    /* renamed from: b */
    public Set<InterfaceC7664p<?>> mo9074b(Locale locale, InterfaceC7633d interfaceC7633d) {
        return m9071e(locale, interfaceC7633d).m10406o();
    }

    @Override // p162ij.InterfaceC7667s
    /* renamed from: c */
    public AbstractC7665q<?> mo9073c(AbstractC7665q<?> abstractC7665q, Locale locale, InterfaceC7633d interfaceC7633d) {
        return m9070f(abstractC7665q, m9071e(locale, interfaceC7633d), interfaceC7633d);
    }

    @Override // p162ij.InterfaceC7667s
    /* renamed from: d */
    public boolean mo9072d(Class<?> cls) {
        return cls == C10697f0.class;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [ij.q, ij.q<?>] */
    /* JADX WARN: Type inference failed for: r9v2, types: [ij.q, ij.q<?>] */
    /* renamed from: f */
    public AbstractC7665q<?> m9070f(AbstractC7665q<?> abstractC7665q, C10736d c10736d, InterfaceC7633d interfaceC7633d) {
        EnumC10744j enumC10744j;
        EnumC10744j enumC10744j2;
        if (abstractC7665q.mo10210q(c10736d.m10412i())) {
            enumC10744j2 = (EnumC10744j) abstractC7665q.mo10212i(c10736d.m10412i());
        } else if (((EnumC8981g) interfaceC7633d.mo14441b(C8969a.f23565f, EnumC8981g.SMART)).m16889a()) {
            enumC10744j2 = EnumC10744j.AD;
        } else {
            enumC10744j = null;
            if (enumC10744j == null && abstractC7665q.mo10210q(c10736d.m10421M())) {
                int mo10218c = abstractC7665q.mo10218c(c10736d.m10421M());
                if (abstractC7665q.mo10210q(c10736d.m10431C()) && abstractC7665q.mo10210q(c10736d.m10414g())) {
                    C10697f0 m10417d = c10736d.m10417d(C10741h.m10378h(enumC10744j, mo10218c, abstractC7665q.mo10218c(c10736d.m10431C()), abstractC7665q.mo10218c(c10736d.m10414g()), (EnumC10476a) interfaceC7633d.mo14441b(C10736d.f28017y, EnumC10476a.DUAL_DATING), c10736d.m10398w()));
                    abstractC7665q.mo14419F(c10736d.m10412i(), null);
                    abstractC7665q.mo14419F(c10736d.m10421M(), null);
                    abstractC7665q.mo14419F(c10736d.m10431C(), null);
                    abstractC7665q.mo14419F(c10736d.m10414g(), null);
                    return abstractC7665q.mo14419F(C10697f0.f27907x, m10417d);
                } else if (abstractC7665q.mo10210q(c10736d.m10413h())) {
                    int mo10218c2 = abstractC7665q.mo10218c(c10736d.m10413h());
                    InterfaceC7664p<Integer> interfaceC7664p = C10918c.f28654n;
                    if (abstractC7665q.mo10210q(interfaceC7664p)) {
                        mo10218c = abstractC7665q.mo10218c(interfaceC7664p);
                    }
                    return abstractC7665q.mo14419F(C10697f0.f27907x, (C10697f0) c10736d.m10417d(c10736d.m10408m(enumC10744j, mo10218c)).mo14420D(c10736d.m10413h(), mo10218c2));
                } else {
                    return abstractC7665q;
                }
            }
        }
        enumC10744j = enumC10744j2;
        return enumC10744j == null ? abstractC7665q : abstractC7665q;
    }
}
