package net.time4j.calendar;

import java.util.Collections;
import java.util.Map;
import net.time4j.base.C10616c;
import p162ij.AbstractC7655l;
import p162ij.AbstractC7665q;
import p162ij.EnumC7627a0;
import p162ij.InterfaceC7653k;
import p162ij.InterfaceC7664p;
import p162ij.InterfaceC7676z;

/* renamed from: net.time4j.calendar.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
final class C10663n<T extends AbstractC7665q<T>> implements InterfaceC7676z<T, Integer> {

    /* renamed from: j */
    private final Map<String, ? extends InterfaceC7653k<T>> f27769j;

    /* renamed from: k */
    private final InterfaceC7664p<Integer> f27770k;

    public C10663n(InterfaceC7653k<T> interfaceC7653k, InterfaceC7664p<Integer> interfaceC7664p) {
        this.f27769j = Collections.singletonMap("calendrical", interfaceC7653k);
        this.f27770k = interfaceC7664p;
    }

    /* renamed from: a */
    private InterfaceC7653k<T> m10826a(T t) {
        if (t instanceof AbstractC7655l) {
            return this.f27769j.get(((AbstractC7655l) AbstractC7655l.class.cast(t)).mo10407n());
        }
        return this.f27769j.get("calendrical");
    }

    /* renamed from: q */
    private static Integer m10819q(long j) {
        long j2;
        long m11036f = C10616c.m11036f(EnumC7627a0.MODIFIED_JULIAN_DATE.m20216i(j, EnumC7627a0.UTC), 678881L);
        long m11040b = C10616c.m11040b(m11036f, 146097);
        int m11038d = C10616c.m11038d(m11036f, 146097);
        if (m11038d == 146096) {
            j2 = (m11040b + 1) * 400;
        } else {
            int i = m11038d / 36524;
            int i2 = m11038d % 36524;
            int i3 = i2 / 1461;
            int i4 = i2 % 1461;
            if (i4 == 1460) {
                j2 = (m11040b * 400) + (i * 100) + ((i3 + 1) * 4);
            } else {
                j2 = (m11040b * 400) + (i * 100) + (i3 * 4) + (i4 / 365);
                if (((((i4 % 365) + 31) * 5) / 153) + 2 > 12) {
                    j2++;
                }
            }
        }
        return Integer.valueOf(C10616c.m11035g(j2));
    }

    @Override // p162ij.InterfaceC7676z
    /* renamed from: d */
    public InterfaceC7664p<?> mo9926b(T t) {
        return null;
    }

    @Override // p162ij.InterfaceC7676z
    /* renamed from: e */
    public InterfaceC7664p<?> mo9925c(T t) {
        return null;
    }

    @Override // p162ij.InterfaceC7676z
    /* renamed from: h */
    public Integer mo9922f(T t) {
        InterfaceC7653k<T> m10826a = m10826a(t);
        return m10819q(m10826a.mo10628c((T) m10826a.mo10629b(m10826a.mo10630a()).mo14420D(this.f27770k, 1)));
    }

    @Override // p162ij.InterfaceC7676z
    /* renamed from: j */
    public Integer mo9917l(T t) {
        InterfaceC7653k<T> m10826a = m10826a(t);
        return m10819q(m10826a.mo10628c((T) m10826a.mo10629b(m10826a.mo10627d()).mo14420D(this.f27770k, 1)));
    }

    @Override // p162ij.InterfaceC7676z
    /* renamed from: k */
    public Integer mo9915o(T t) {
        return m10819q(m10826a(t).mo10628c((T) t.mo14420D(this.f27770k, 1)));
    }

    @Override // p162ij.InterfaceC7676z
    /* renamed from: p */
    public boolean mo9920i(T t, Integer num) {
        return mo9915o(t).equals(num);
    }

    @Override // p162ij.InterfaceC7676z
    /* renamed from: r */
    public T mo9916n(T t, Integer num, boolean z) {
        if (mo9920i(t, num)) {
            return t;
        }
        throw new IllegalArgumentException("The related gregorian year is read-only.");
    }
}