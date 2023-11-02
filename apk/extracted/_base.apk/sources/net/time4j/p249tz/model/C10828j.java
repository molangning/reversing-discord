package net.time4j.p249tz.model;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import net.time4j.C10582a0;
import net.time4j.base.C10615b;
import net.time4j.base.C10616c;
import net.time4j.base.InterfaceC10614a;
import net.time4j.base.InterfaceC10620f;
import net.time4j.base.InterfaceC10621g;
import net.time4j.p249tz.C10835p;
import net.time4j.p249tz.C10836q;
import p162ij.EnumC7627a0;
import p164j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.tz.model.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C10828j extends AbstractC10831l {

    /* renamed from: p */
    private static final int f28274p = C10615b.m11046i(C10615b.m11043l(EnumC7627a0.MODIFIED_JULIAN_DATE.m20216i(AbstractC10831l.m10046f(100), EnumC7627a0.UNIX)));
    private static final long serialVersionUID = 2456700806862862287L;

    /* renamed from: k */
    private final transient C10836q f28275k;

    /* renamed from: l */
    private final transient List<AbstractC10819d> f28276l;

    /* renamed from: m */
    private final transient ConcurrentMap<Integer, List<C10836q>> f28277m;

    /* renamed from: n */
    private final transient List<C10836q> f28278n;

    /* renamed from: o */
    private final transient boolean f28279o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: net.time4j.tz.model.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static /* synthetic */ class C10829a {

        /* renamed from: a */
        static final /* synthetic */ int[] f28280a;

        static {
            int[] iArr = new int[EnumC10824i.values().length];
            f28280a = iArr;
            try {
                iArr[EnumC10824i.f28269j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28280a[EnumC10824i.f28270k.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28280a[EnumC10824i.f28271l.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10828j(C10835p c10835p, List<AbstractC10819d> list, boolean z) {
        this(new C10836q(Long.MIN_VALUE, c10835p.m10026k(), c10835p.m10026k(), 0), list, z);
    }

    /* renamed from: m */
    private static C10836q m10056m(long j, C10836q c10836q, List<AbstractC10819d> list) {
        long max = Math.max(j, c10836q.m10012e());
        int m10009h = c10836q.m10009h();
        int size = list.size();
        int i = Integer.MIN_VALUE;
        C10836q c10836q2 = null;
        int i2 = 0;
        while (c10836q2 == null) {
            int i3 = i2 % size;
            AbstractC10819d abstractC10819d = list.get(i3);
            AbstractC10819d abstractC10819d2 = list.get(((i2 - 1) + size) % size);
            int m10054o = m10054o(abstractC10819d, m10009h, abstractC10819d2.m10075e());
            if (i2 == 0) {
                i = m10048u(abstractC10819d, m10054o + max);
            } else if (i3 == 0) {
                i++;
            }
            long m10053p = m10053p(abstractC10819d, i, m10054o);
            if (m10053p > max) {
                c10836q2 = new C10836q(m10053p, m10009h + abstractC10819d2.m10075e(), m10009h + abstractC10819d.m10075e(), abstractC10819d.m10075e());
            }
            i2++;
        }
        return c10836q2;
    }

    /* renamed from: o */
    private static int m10054o(AbstractC10819d abstractC10819d, int i, int i2) {
        EnumC10824i m10076d = abstractC10819d.m10076d();
        int i3 = C10829a.f28280a[m10076d.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    return i + i2;
                }
                throw new UnsupportedOperationException(m10076d.name());
            }
            return i;
        }
        return 0;
    }

    /* renamed from: p */
    private static long m10053p(AbstractC10819d abstractC10819d, int i, int i2) {
        return abstractC10819d.mo10071b(i).m10676t0(abstractC10819d.m10074f()).m10501U(C10835p.m10020q(i2)).mo10164k();
    }

    /* renamed from: q */
    private List<C10836q> m10052q(int i) {
        List<C10836q> putIfAbsent;
        Integer valueOf = Integer.valueOf(i);
        List<C10836q> list = this.f28277m.get(valueOf);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            int m10009h = this.f28275k.m10009h();
            int size = this.f28276l.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC10819d abstractC10819d = this.f28276l.get(i2);
                AbstractC10819d abstractC10819d2 = this.f28276l.get(((i2 - 1) + size) % size);
                arrayList.add(new C10836q(m10053p(abstractC10819d, i, m10054o(abstractC10819d, m10009h, abstractC10819d2.m10075e())), m10009h + abstractC10819d2.m10075e(), m10009h + abstractC10819d.m10075e(), abstractC10819d.m10075e()));
            }
            List<C10836q> unmodifiableList = Collections.unmodifiableList(arrayList);
            if (i <= f28274p && this.f28279o && (putIfAbsent = this.f28277m.putIfAbsent(valueOf, unmodifiableList)) != null) {
                return putIfAbsent;
            }
            return unmodifiableList;
        }
        return list;
    }

    /* renamed from: r */
    private List<C10836q> m10051r(InterfaceC10614a interfaceC10614a) {
        return m10052q(this.f28276l.get(0).mo10069i(interfaceC10614a));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static List<C10836q> m10050s(C10836q c10836q, List<AbstractC10819d> list, long j, long j2) {
        int i;
        int i2;
        long m10012e = c10836q.m10012e();
        int i3 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i3 <= 0) {
            if (j2 > m10012e && i3 != 0) {
                ArrayList arrayList = new ArrayList();
                int size = list.size();
                int m10009h = c10836q.m10009h();
                int i4 = Integer.MIN_VALUE;
                int i5 = 0;
                while (true) {
                    int i6 = i5 % size;
                    AbstractC10819d abstractC10819d = list.get(i6);
                    AbstractC10819d abstractC10819d2 = list.get(((i5 - 1) + size) % size);
                    int m10054o = m10054o(abstractC10819d, m10009h, abstractC10819d2.m10075e());
                    if (i5 == 0) {
                        i = size;
                        i2 = m10009h;
                        i4 = m10048u(abstractC10819d, Math.max(j, m10012e) + m10054o);
                    } else {
                        i = size;
                        i2 = m10009h;
                        if (i6 == 0) {
                            i4++;
                        }
                    }
                    long m10053p = m10053p(abstractC10819d, i4, m10054o);
                    i5++;
                    if (m10053p >= j2) {
                        return Collections.unmodifiableList(arrayList);
                    }
                    if (m10053p >= j && m10053p > m10012e) {
                        arrayList.add(new C10836q(m10053p, i2 + abstractC10819d2.m10075e(), i2 + abstractC10819d.m10075e(), abstractC10819d.m10075e()));
                    }
                    m10009h = i2;
                    size = i;
                }
            } else {
                return Collections.emptyList();
            }
        } else {
            throw new IllegalArgumentException("Start after end.");
        }
    }

    /* renamed from: u */
    private static int m10048u(AbstractC10819d abstractC10819d, long j) {
        return abstractC10819d.mo10070h(EnumC7627a0.MODIFIED_JULIAN_DATE.m20216i(C10616c.m11040b(j, 86400), EnumC7627a0.UNIX));
    }

    private Object writeReplace() {
        return new SPX(this, 125);
    }

    @Override // net.time4j.p249tz.InterfaceC10815m
    /* renamed from: a */
    public C10836q mo10063a(InterfaceC10614a interfaceC10614a, InterfaceC10621g interfaceC10621g) {
        return m10058k(interfaceC10614a, AbstractC10831l.m10042j(interfaceC10614a, interfaceC10621g));
    }

    @Override // net.time4j.p249tz.InterfaceC10815m
    /* renamed from: b */
    public C10836q mo10062b(InterfaceC10620f interfaceC10620f) {
        AbstractC10819d abstractC10819d;
        C10836q c10836q;
        long m10012e = this.f28275k.m10012e();
        C10836q c10836q2 = null;
        if (interfaceC10620f.mo10164k() <= m10012e) {
            return null;
        }
        int m10009h = this.f28275k.m10009h();
        int size = this.f28276l.size();
        int i = size - 1;
        int m10048u = m10048u(this.f28276l.get(0), interfaceC10620f.mo10164k() + m10054o(abstractC10819d, m10009h, this.f28276l.get(i).m10075e()));
        List<C10836q> m10052q = m10052q(m10048u);
        for (int i2 = 0; i2 < size; i2++) {
            C10836q c10836q3 = m10052q.get(i2);
            long m10012e2 = c10836q3.m10012e();
            if (interfaceC10620f.mo10164k() < m10012e2) {
                if (c10836q2 == null) {
                    if (i2 == 0) {
                        c10836q = m10052q(m10048u - 1).get(i);
                    } else {
                        c10836q = m10052q.get(i2 - 1);
                    }
                    if (c10836q.m10012e() > m10012e) {
                        return c10836q;
                    }
                    return c10836q2;
                }
                return c10836q2;
            }
            if (m10012e2 > m10012e) {
                c10836q2 = c10836q3;
            }
        }
        return c10836q2;
    }

    @Override // net.time4j.p249tz.InterfaceC10815m
    /* renamed from: c */
    public boolean mo10061c() {
        for (AbstractC10819d abstractC10819d : this.f28276l) {
            if (abstractC10819d.m10075e() < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // net.time4j.p249tz.InterfaceC10815m
    /* renamed from: d */
    public C10835p mo10060d() {
        return C10835p.m10020q(this.f28275k.m10008i());
    }

    @Override // net.time4j.p249tz.InterfaceC10815m
    /* renamed from: e */
    public List<C10835p> mo10059e(InterfaceC10614a interfaceC10614a, InterfaceC10621g interfaceC10621g) {
        return m10049t(interfaceC10614a, AbstractC10831l.m10042j(interfaceC10614a, interfaceC10621g));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10828j)) {
            return false;
        }
        C10828j c10828j = (C10828j) obj;
        if (this.f28275k.equals(c10828j.f28275k) && this.f28276l.equals(c10828j.f28276l)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f28275k.hashCode() * 17) + (this.f28276l.hashCode() * 37);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public C10836q m10058k(InterfaceC10614a interfaceC10614a, long j) {
        if (j <= this.f28275k.m10012e() + Math.max(this.f28275k.m10011f(), this.f28275k.m10008i())) {
            return null;
        }
        for (C10836q c10836q : m10051r(interfaceC10614a)) {
            long m10012e = c10836q.m10012e();
            if (c10836q.m10007k()) {
                if (j < c10836q.m10011f() + m10012e) {
                    return null;
                }
                if (j < m10012e + c10836q.m10008i()) {
                    return c10836q;
                }
            } else if (!c10836q.m10006l()) {
                continue;
            } else if (j < c10836q.m10008i() + m10012e) {
                return null;
            } else {
                if (j < m10012e + c10836q.m10011f()) {
                    return c10836q;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public C10836q m10057l() {
        return this.f28275k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public List<AbstractC10819d> m10055n() {
        return this.f28276l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public List<C10835p> m10049t(InterfaceC10614a interfaceC10614a, long j) {
        long m10012e = this.f28275k.m10012e();
        int m10008i = this.f28275k.m10008i();
        if (j <= m10012e + Math.max(this.f28275k.m10011f(), m10008i)) {
            return AbstractC10831l.m10044h(m10008i);
        }
        for (C10836q c10836q : m10051r(interfaceC10614a)) {
            long m10012e2 = c10836q.m10012e();
            int m10008i2 = c10836q.m10008i();
            if (c10836q.m10007k()) {
                if (j < c10836q.m10011f() + m10012e2) {
                    return AbstractC10831l.m10044h(c10836q.m10011f());
                }
                if (j < m10012e2 + m10008i2) {
                    return Collections.emptyList();
                }
            } else if (!c10836q.m10006l()) {
                continue;
            } else if (j < m10008i2 + m10012e2) {
                return AbstractC10831l.m10044h(c10836q.m10011f());
            } else {
                if (j < m10012e2 + c10836q.m10011f()) {
                    return AbstractC10831l.m10043i(m10008i2, c10836q.m10011f());
                }
            }
            m10008i = m10008i2;
        }
        return AbstractC10831l.m10044h(m10008i);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(256);
        sb2.append(C10828j.class.getName());
        sb2.append("[initial=");
        sb2.append(this.f28275k);
        sb2.append(",rules=");
        sb2.append(this.f28276l);
        sb2.append(']');
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10828j(C10836q c10836q, List<AbstractC10819d> list, boolean z) {
        C10836q c10836q2;
        this.f28277m = new ConcurrentHashMap();
        if (!list.isEmpty()) {
            if (list.size() < 128) {
                list = z ? new ArrayList(list) : list;
                Collections.sort(list, EnumC10830k.INSTANCE);
                String str = null;
                if (list.size() > 1) {
                    for (AbstractC10819d abstractC10819d : list) {
                        if (str == null) {
                            str = abstractC10819d.mo10072a();
                        } else if (!str.equals(abstractC10819d.mo10072a())) {
                            throw new IllegalArgumentException("Rules with different calendar systems not permitted.");
                        }
                    }
                }
                this.f28279o = "iso8601".equals(str);
                if (c10836q.m10012e() == Long.MIN_VALUE) {
                    if (c10836q.m10013d() == 0) {
                        c10836q2 = new C10836q(C10582a0.m11164X().m20170O().mo10164k(), c10836q.m10009h(), c10836q.m10009h(), 0);
                    } else {
                        throw new IllegalArgumentException("Initial transition must not have any dst-offset: " + c10836q);
                    }
                } else {
                    if (c10836q.m10008i() != m10056m(c10836q.m10012e(), c10836q, list).m10011f()) {
                        throw new IllegalArgumentException("Inconsistent model: " + c10836q + " / " + list);
                    }
                    c10836q2 = c10836q;
                }
                this.f28275k = c10836q2;
                List<AbstractC10819d> unmodifiableList = Collections.unmodifiableList(list);
                this.f28276l = unmodifiableList;
                this.f28278n = m10050s(c10836q2, unmodifiableList, 0L, AbstractC10831l.m10046f(1));
                return;
            }
            throw new IllegalArgumentException("Too many daylight saving rules: " + list);
        }
        throw new IllegalArgumentException("Missing daylight saving rules.");
    }
}
