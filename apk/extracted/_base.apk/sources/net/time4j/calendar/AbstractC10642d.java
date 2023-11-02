package net.time4j.calendar;

import net.time4j.C10582a0;
import net.time4j.C10697f0;
import net.time4j.base.C10616c;
import net.time4j.calendar.AbstractC10644f;
import net.time4j.p249tz.C10835p;
import p143hj.C7350c;
import p143hj.EnumC7348b;
import p143hj.EnumC7352d;
import p162ij.EnumC7627a0;
import p162ij.InterfaceC7653k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.calendar.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC10642d<D extends AbstractC10644f<?, D>> implements InterfaceC7653k<D> {

    /* renamed from: a */
    private static final long f27742a = C10697f0.m10713M0(1645, 1, 28).mo10920b();

    /* renamed from: b */
    private static final long f27743b = C10697f0.m10713M0(3000, 1, 27).mo10920b();

    /* renamed from: c */
    private static final long f27744c = C10697f0.m10713M0(-2636, 2, 15).mo10920b();

    /* renamed from: f */
    private long m10944f(int i, int i2, C10651h c10651h) {
        long m10934p = m10934p(m10933q(i, i2) + ((c10651h.getNumber() - 1) * 29));
        if (c10651h.equals(mo10629b(m10934p).m10914g0())) {
            return m10934p;
        }
        return m10934p(m10934p + 1);
    }

    /* renamed from: j */
    private boolean m10940j(long j, long j2) {
        return j2 >= j && (m10939k(j2) || m10940j(j, m10935o(j2)));
    }

    /* renamed from: m */
    private static long m10937m(long j, long j2) {
        return Math.round((j2 - j) / 29.530588861d);
    }

    /* renamed from: o */
    private long m10935o(long j) {
        return EnumC7352d.NEW_MOON.m20880c(m10936n(j)).m11138x0(mo10941i(j)).m10484j0().mo10920b();
    }

    /* renamed from: r */
    private long m10932r(long j) {
        long m10927w = m10927w(j);
        long m10927w2 = m10927w(370 + m10927w);
        long m10934p = m10934p(m10927w + 1);
        long m10934p2 = m10934p(m10934p + 1);
        if (m10937m(m10934p, m10935o(m10927w2 + 1)) == 12 && (m10939k(m10934p) || m10939k(m10934p2))) {
            return m10934p(m10934p2 + 1);
        }
        return m10934p2;
    }

    /* renamed from: s */
    private long m10931s(long j) {
        long m10932r = m10932r(j);
        if (j >= m10932r) {
            return m10932r;
        }
        return m10932r(j - 180);
    }

    /* renamed from: w */
    private long m10927w(long j) {
        int mo10482o;
        C10835p mo10941i = mo10941i(j);
        C10697f0 m10707R0 = C10697f0.m10707R0(j, EnumC7627a0.UTC);
        if (m10707R0.mo10481p() > 11 && m10707R0.mo10480r() > 15) {
            mo10482o = m10707R0.mo10482o();
        } else {
            mo10482o = m10707R0.mo10482o() - 1;
        }
        EnumC7348b enumC7348b = EnumC7348b.WINTER_SOLSTICE;
        C10697f0 m10496Z = enumC7348b.m20894c(mo10482o).m11138x0(mo10941i).m10496Z();
        if (m10496Z.m20132S(m10707R0)) {
            m10496Z = enumC7348b.m20894c(mo10482o - 1).m11138x0(mo10941i).m10496Z();
        }
        return m10496Z.mo10920b();
    }

    @Override // p162ij.InterfaceC7653k
    /* renamed from: a */
    public final long mo10630a() {
        return f27743b;
    }

    @Override // p162ij.InterfaceC7653k
    /* renamed from: d */
    public long mo10627d() {
        return f27742a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract D mo10945e(int i, int i2, C10651h c10651h, int i3, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final int m10943g(int i, int i2) {
        int[] mo10942h = mo10942h();
        int i3 = (((i - 1) * 60) + i2) - 1;
        int i4 = ((i3 - mo10942h[0]) / 3) * 2;
        while (i4 < mo10942h.length) {
            int i5 = mo10942h[i4];
            if (i5 < i3) {
                i4 += Math.max(((i3 - i5) / 3) * 2, 2);
            } else if (i5 > i3) {
                return 0;
            } else {
                return mo10942h[i4 + 1];
            }
        }
        return 0;
    }

    /* renamed from: h */
    abstract int[] mo10942h();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract C10835p mo10941i(long j);

    /* renamed from: k */
    final boolean m10939k(long j) {
        if ((((int) Math.floor(EnumC10667p.m10792m(C7350c.m20884g(m10936n(j)).m20888c()) / 30.0d)) + 2) % 12 == (((int) Math.floor(EnumC10667p.m10792m(C7350c.m20884g(m10936n(m10934p(j + 1))).m20888c()) / 30.0d)) + 2) % 12) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    boolean m10938l(int i, int i2, C10651h c10651h, int i3) {
        if (i < 72 || i > 94 || i2 < 1 || i2 > 60 || ((i == 72 && i2 < 22) || ((i == 94 && i2 > 56) || i3 < 1 || i3 > 30 || c10651h == null || (c10651h.m10871c() && c10651h.getNumber() != m10943g(i, i2))))) {
            return false;
        }
        if (i3 != 30) {
            return true;
        }
        long m10944f = m10944f(i, i2, c10651h);
        if (m10934p(1 + m10944f) - m10944f != 30) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public C10582a0 m10936n(long j) {
        return C10697f0.m10707R0(j, EnumC7627a0.UTC).m10675u0().m10501U(mo10941i(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final long m10934p(long j) {
        return EnumC7352d.NEW_MOON.m20881b(m10936n(j)).m11138x0(mo10941i(j)).m10484j0().mo10920b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final long m10933q(int i, int i2) {
        return m10931s((long) Math.floor(f27744c + (((((i - 1) * 60) + i2) - 0.5d) * 365.242189d)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final long m10930t(int i, int i2, C10651h c10651h, int i3) {
        if (m10938l(i, i2, c10651h, i3)) {
            return (m10944f(i, i2, c10651h) + i3) - 1;
        }
        throw new IllegalArgumentException("Invalid date.");
    }

    @Override // p162ij.InterfaceC7653k
    /* renamed from: u */
    public final long mo10628c(D d) {
        return m10930t(d.m10921a0(), d.m10910k0().getNumber(), d.m10914g0(), d.m10908r());
    }

    @Override // p162ij.InterfaceC7653k
    /* renamed from: v */
    public final D mo10629b(long j) {
        boolean z;
        long m10927w = m10927w(j);
        long m10927w2 = m10927w(370 + m10927w);
        long m10934p = m10934p(m10927w + 1);
        long m10935o = m10935o(m10927w2 + 1);
        long m10935o2 = m10935o(j + 1);
        if (m10937m(m10934p, m10935o) == 12) {
            z = true;
        } else {
            z = false;
        }
        long m10937m = m10937m(m10934p, m10935o2);
        if (z && m10940j(m10934p, m10935o2)) {
            m10937m--;
        }
        int i = 12;
        int m11038d = C10616c.m11038d(m10937m, 12);
        if (m11038d != 0) {
            i = m11038d;
        }
        long floor = (long) Math.floor((1.5d - (i / 12.0d)) + ((j - f27744c) / 365.242189d));
        int i2 = 60;
        int m11040b = 1 + ((int) C10616c.m11040b(floor - 1, 60));
        int m11038d2 = C10616c.m11038d(floor, 60);
        if (m11038d2 != 0) {
            i2 = m11038d2;
        }
        int i3 = (int) ((j - m10935o2) + 1);
        C10651h m10870d = C10651h.m10870d(i);
        if (z && m10939k(m10935o2) && !m10940j(m10934p, m10935o(m10935o2))) {
            m10870d = m10870d.m10869e();
        }
        return mo10945e(m11040b, i2, m10870d, i3, j);
    }
}
