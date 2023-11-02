package net.time4j.p249tz.model;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.time4j.C10582a0;
import net.time4j.base.InterfaceC10614a;
import net.time4j.base.InterfaceC10620f;
import net.time4j.base.InterfaceC10621g;
import net.time4j.p249tz.C10835p;
import net.time4j.p249tz.C10836q;
import p288pj.EnumC11651f;

/* renamed from: net.time4j.tz.model.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C10816a extends AbstractC10831l {
    private static final long serialVersionUID = -5264909488983076587L;

    /* renamed from: k */
    private final transient C10836q[] f28250k;

    /* renamed from: l */
    private final transient boolean f28251l;

    /* renamed from: m */
    private final transient List<C10836q> f28252m;

    /* renamed from: n */
    private transient int f28253n = 0;

    public C10816a(List<C10836q> list, boolean z, boolean z2) {
        if (!list.isEmpty()) {
            C10836q[] c10836qArr = (C10836q[]) list.toArray(new C10836q[list.size()]);
            boolean z3 = false;
            for (C10836q c10836q : c10836qArr) {
                if (!z3 && c10836q.m10013d() >= 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            }
            this.f28251l = z3;
            if (z) {
                Arrays.sort(c10836qArr);
            }
            if (z2) {
                m10093k(c10836qArr, list);
            }
            this.f28250k = c10836qArr;
            this.f28252m = m10089o(c10836qArr, 0L, AbstractC10831l.m10046f(1));
            return;
        }
        throw new IllegalArgumentException("Missing timezone transitions.");
    }

    /* renamed from: k */
    private static void m10093k(C10836q[] c10836qArr, List<C10836q> list) {
        int m10008i = c10836qArr[0].m10008i();
        for (int i = 1; i < c10836qArr.length; i++) {
            if (m10008i == c10836qArr[i].m10011f()) {
                m10008i = c10836qArr[i].m10008i();
            } else {
                C10582a0 m11145q0 = C10582a0.m11145q0(c10836qArr[i].m10012e(), EnumC11651f.POSIX);
                throw new IllegalArgumentException("Model inconsistency detected at: " + m11145q0 + " (" + c10836qArr[i].m10012e() + ")  in transitions: " + list);
            }
        }
    }

    /* renamed from: o */
    private static List<C10836q> m10089o(C10836q[] c10836qArr, long j, long j2) {
        if (j <= j2) {
            int m10086r = m10086r(j, c10836qArr);
            int m10086r2 = m10086r(j2, c10836qArr);
            if (m10086r2 == 0) {
                return Collections.emptyList();
            }
            if (m10086r > 0 && c10836qArr[m10086r - 1].m10012e() == j) {
                m10086r--;
            }
            int i = m10086r2 - 1;
            if (c10836qArr[i].m10012e() == j2) {
                i--;
            }
            if (m10086r > i) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList((i - m10086r) + 1);
            while (m10086r <= i) {
                arrayList.add(c10836qArr[m10086r]);
                m10086r++;
            }
            return Collections.unmodifiableList(arrayList);
        }
        throw new IllegalArgumentException("Start after end.");
    }

    /* renamed from: r */
    private static int m10086r(long j, C10836q[] c10836qArr) {
        int length = c10836qArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) / 2;
            if (c10836qArr[i2].m10012e() <= j) {
                i = i2 + 1;
            } else {
                length = i2 - 1;
            }
        }
        return i;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    /* renamed from: s */
    private static int m10085s(long j, C10836q[] c10836qArr) {
        C10836q c10836q;
        int length = c10836qArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) / 2;
            if (c10836qArr[i2].m10012e() + Math.max(c10836q.m10008i(), c10836q.m10011f()) <= j) {
                i = i2 + 1;
            } else {
                length = i2 - 1;
            }
        }
        return i;
    }

    private Object writeReplace() {
        return new SPX(this, 126);
    }

    @Override // net.time4j.p249tz.InterfaceC10815m
    /* renamed from: a */
    public C10836q mo10063a(InterfaceC10614a interfaceC10614a, InterfaceC10621g interfaceC10621g) {
        return m10091m(interfaceC10614a, interfaceC10621g, null);
    }

    @Override // net.time4j.p249tz.InterfaceC10815m
    /* renamed from: b */
    public C10836q mo10062b(InterfaceC10620f interfaceC10620f) {
        int m10086r = m10086r(interfaceC10620f.mo10164k(), this.f28250k);
        if (m10086r == 0) {
            return null;
        }
        return this.f28250k[m10086r - 1];
    }

    @Override // net.time4j.p249tz.InterfaceC10815m
    /* renamed from: c */
    public boolean mo10061c() {
        return this.f28251l;
    }

    @Override // net.time4j.p249tz.InterfaceC10815m
    /* renamed from: d */
    public C10835p mo10060d() {
        return C10835p.m10020q(this.f28250k[0].m10011f());
    }

    @Override // net.time4j.p249tz.InterfaceC10815m
    /* renamed from: e */
    public List<C10835p> mo10059e(InterfaceC10614a interfaceC10614a, InterfaceC10621g interfaceC10621g) {
        return m10088p(interfaceC10614a, interfaceC10621g, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10816a) {
            return Arrays.equals(this.f28250k, ((C10816a) obj).f28250k);
        }
        return false;
    }

    public int hashCode() {
        int i = this.f28253n;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.f28250k);
            this.f28253n = hashCode;
            return hashCode;
        }
        return i;
    }

    /* renamed from: l */
    public boolean m10092l(C10816a c10816a, int i, int i2) {
        int min = Math.min(i, this.f28250k.length);
        if (min != Math.min(i2, c10816a.f28250k.length)) {
            return false;
        }
        for (int i3 = 0; i3 < min; i3++) {
            if (!this.f28250k[i3].equals(c10816a.f28250k[i3])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public C10836q m10091m(InterfaceC10614a interfaceC10614a, InterfaceC10621g interfaceC10621g, C10828j c10828j) {
        long m10042j = AbstractC10831l.m10042j(interfaceC10614a, interfaceC10621g);
        int m10085s = m10085s(m10042j, this.f28250k);
        C10836q[] c10836qArr = this.f28250k;
        if (m10085s == c10836qArr.length) {
            if (c10828j == null) {
                return null;
            }
            return c10828j.m10058k(interfaceC10614a, m10042j);
        }
        C10836q c10836q = c10836qArr[m10085s];
        if (c10836q.m10007k()) {
            if (c10836q.m10012e() + c10836q.m10011f() <= m10042j) {
                return c10836q;
            }
        } else if (c10836q.m10006l() && c10836q.m10012e() + c10836q.m10008i() <= m10042j) {
            return c10836q;
        }
        return null;
    }

    /* renamed from: n */
    public C10836q m10090n() {
        C10836q[] c10836qArr = this.f28250k;
        return c10836qArr[c10836qArr.length - 1];
    }

    /* renamed from: p */
    public List<C10835p> m10088p(InterfaceC10614a interfaceC10614a, InterfaceC10621g interfaceC10621g, C10828j c10828j) {
        long m10042j = AbstractC10831l.m10042j(interfaceC10614a, interfaceC10621g);
        int m10085s = m10085s(m10042j, this.f28250k);
        C10836q[] c10836qArr = this.f28250k;
        if (m10085s == c10836qArr.length) {
            if (c10828j == null) {
                return AbstractC10831l.m10044h(c10836qArr[c10836qArr.length - 1].m10008i());
            }
            return c10828j.m10049t(interfaceC10614a, m10042j);
        }
        C10836q c10836q = c10836qArr[m10085s];
        if (c10836q.m10007k()) {
            if (c10836q.m10012e() + c10836q.m10011f() <= m10042j) {
                return Collections.emptyList();
            }
        } else if (c10836q.m10006l() && c10836q.m10012e() + c10836q.m10008i() <= m10042j) {
            return AbstractC10831l.m10043i(c10836q.m10008i(), c10836q.m10011f());
        }
        return AbstractC10831l.m10044h(c10836q.m10011f());
    }

    /* renamed from: q */
    public int m10087q(int i) {
        int min = Math.min(i, this.f28250k.length);
        C10836q[] c10836qArr = new C10836q[min];
        System.arraycopy(this.f28250k, 0, c10836qArr, 0, min);
        return Arrays.hashCode(c10836qArr);
    }

    /* renamed from: t */
    public void m10084t(int i, ObjectOutput objectOutput) {
        SPX.m10094z(this.f28250k, i, objectOutput);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(C10816a.class.getName());
        sb2.append("[transition-count=");
        sb2.append(this.f28250k.length);
        sb2.append(",hash=");
        sb2.append(hashCode());
        sb2.append(']');
        return sb2.toString();
    }

    /* renamed from: u */
    public void m10083u(ObjectOutput objectOutput) {
        m10084t(this.f28250k.length, objectOutput);
    }
}