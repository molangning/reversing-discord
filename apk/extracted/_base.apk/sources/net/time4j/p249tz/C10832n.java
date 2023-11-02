package net.time4j.p249tz;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import net.time4j.base.C10615b;
import net.time4j.base.C10616c;
import net.time4j.base.InterfaceC10614a;
import net.time4j.base.InterfaceC10621g;
import p164j$.util.DesugarTimeZone;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.tz.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C10832n implements InterfaceC10834o, Serializable {

    /* renamed from: l */
    private static final Map<Integer, C10832n> f28284l = new HashMap();
    private static final long serialVersionUID = 1790434289322009750L;

    /* renamed from: j */
    private final transient EnumC10799b f28285j;

    /* renamed from: k */
    private final transient EnumC10804g f28286k;

    /* renamed from: net.time4j.tz.n$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    static /* synthetic */ class C10833a {

        /* renamed from: a */
        static final /* synthetic */ int[] f28287a;

        static {
            int[] iArr = new int[EnumC10799b.values().length];
            f28287a = iArr;
            try {
                iArr[EnumC10799b.PUSH_FORWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28287a[EnumC10799b.NEXT_VALID_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28287a[EnumC10799b.ABORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        EnumC10799b[] values;
        EnumC10804g[] values2;
        for (EnumC10799b enumC10799b : EnumC10799b.values()) {
            for (EnumC10804g enumC10804g : EnumC10804g.values()) {
                f28284l.put(Integer.valueOf((enumC10799b.ordinal() * 2) + enumC10804g.ordinal()), new C10832n(enumC10799b, enumC10804g));
            }
        }
    }

    private C10832n(EnumC10799b enumC10799b, EnumC10804g enumC10804g) {
        this.f28285j = enumC10799b;
        this.f28286k = enumC10804g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C10832n m10040d(EnumC10799b enumC10799b, EnumC10804g enumC10804g) {
        return f28284l.get(Integer.valueOf((enumC10799b.ordinal() * 2) + enumC10804g.ordinal()));
    }

    /* renamed from: e */
    private static void m10039e(InterfaceC10614a interfaceC10614a, InterfaceC10621g interfaceC10621g, AbstractC10809l abstractC10809l) {
        throw new IllegalArgumentException("Invalid local timestamp due to timezone transition: local-date=" + interfaceC10614a + ", local-time=" + interfaceC10621g + " [" + abstractC10809l.mo10125z().mo10035a() + "]");
    }

    /* renamed from: f */
    private static long m10038f(int i, int i2, int i3, int i4, int i5, int i6) {
        return C10616c.m11033i(C10616c.m11029m(C10615b.m11045j(i, i2, i3), 40587L), 86400L) + (i4 * 3600) + (i5 * 60) + i6;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 13);
    }

    @Override // net.time4j.p249tz.InterfaceC10834o
    /* renamed from: a */
    public InterfaceC10834o mo10037a(EnumC10804g enumC10804g) {
        if (enumC10804g == this.f28286k) {
            return this;
        }
        return this.f28285j.m10172a(enumC10804g);
    }

    @Override // net.time4j.p249tz.InterfaceC10834o
    /* renamed from: b */
    public long mo10036b(InterfaceC10614a interfaceC10614a, InterfaceC10621g interfaceC10621g, AbstractC10809l abstractC10809l) {
        long m10038f;
        int m10008i;
        EnumC10799b enumC10799b;
        int mo10482o = interfaceC10614a.mo10482o();
        int mo10481p = interfaceC10614a.mo10481p();
        int mo10480r = interfaceC10614a.mo10480r();
        int mo10479s = interfaceC10621g.mo10479s();
        int mo10483m = interfaceC10621g.mo10483m();
        int mo10487h = interfaceC10621g.mo10487h();
        InterfaceC10815m mo10126y = abstractC10809l.mo10126y();
        if (mo10126y == null && this.f28286k == EnumC10804g.LATER_OFFSET && ((enumC10799b = this.f28285j) == EnumC10799b.PUSH_FORWARD || enumC10799b == EnumC10799b.ABORT)) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone(abstractC10809l.mo10125z().mo10035a()));
            gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
            gregorianCalendar.set(14, 0);
            gregorianCalendar.set(mo10482o, mo10481p - 1, mo10480r, mo10479s, mo10483m, mo10487h);
            int i = gregorianCalendar.get(1);
            int i2 = 1 + gregorianCalendar.get(2);
            int i3 = gregorianCalendar.get(5);
            int i4 = gregorianCalendar.get(11);
            int i5 = gregorianCalendar.get(12);
            int i6 = gregorianCalendar.get(13);
            if (this.f28285j == EnumC10799b.ABORT && (mo10482o != i || mo10481p != i2 || mo10480r != i3 || mo10479s != i4 || mo10483m != i5 || mo10487h != i6)) {
                m10039e(interfaceC10614a, interfaceC10621g, abstractC10809l);
            }
            m10038f = m10038f(i, i2, i3, i4, i5, i6);
            m10008i = abstractC10809l.mo10162A(interfaceC10614a, interfaceC10621g).m10026k();
        } else if (mo10126y != null) {
            C10836q mo10063a = mo10126y.mo10063a(interfaceC10614a, interfaceC10621g);
            if (mo10063a != null) {
                if (mo10063a.m10007k()) {
                    int i7 = C10833a.f28287a[this.f28285j.ordinal()];
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 == 3) {
                                m10039e(interfaceC10614a, interfaceC10621g, abstractC10809l);
                            } else {
                                throw new UnsupportedOperationException(this.f28285j.name());
                            }
                        } else {
                            return mo10063a.m10012e();
                        }
                    } else {
                        m10038f = m10038f(mo10482o, mo10481p, mo10480r, mo10479s, mo10483m, mo10487h) + mo10063a.m10010g();
                        m10008i = mo10063a.m10008i();
                    }
                } else if (mo10063a.m10006l()) {
                    m10038f = m10038f(mo10482o, mo10481p, mo10480r, mo10479s, mo10483m, mo10487h);
                    m10008i = mo10063a.m10008i();
                    if (this.f28286k == EnumC10804g.EARLIER_OFFSET) {
                        m10008i = mo10063a.m10011f();
                    }
                }
            }
            return m10038f(mo10482o, mo10481p, mo10480r, mo10479s, mo10483m, mo10487h) - mo10126y.mo10059e(interfaceC10614a, interfaceC10621g).get(0).m10026k();
        } else {
            throw new UnsupportedOperationException("Timezone provider does not expose its transition history.");
        }
        return m10038f - m10008i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m10041c() {
        return (this.f28285j.ordinal() * 2) + this.f28286k.ordinal();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(C10832n.class.getName());
        sb2.append(":[gap=");
        sb2.append(this.f28285j);
        sb2.append(",overlap=");
        sb2.append(this.f28286k);
        sb2.append(']');
        return sb2.toString();
    }
}
