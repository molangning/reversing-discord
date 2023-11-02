package p288pj;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import net.time4j.base.AbstractC10617d;
import net.time4j.base.C10615b;
import net.time4j.base.C10616c;
import net.time4j.base.InterfaceC10614a;

/* renamed from: pj.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C11648d implements Iterable<InterfaceC11646b>, Comparator<InterfaceC11646b> {

    /* renamed from: o */
    public static final boolean f30320o = Boolean.getBoolean("net.time4j.scale.leapseconds.suppressed");

    /* renamed from: p */
    public static final boolean f30321p = Boolean.getBoolean("net.time4j.scale.leapseconds.final");

    /* renamed from: q */
    public static final String f30322q = System.getProperty("net.time4j.scale.leapseconds.path", "data/leapseconds.data");

    /* renamed from: r */
    private static final InterfaceC11645a[] f30323r = new InterfaceC11645a[0];

    /* renamed from: s */
    private static final C11648d f30324s = new C11648d();

    /* renamed from: j */
    private final InterfaceC11647c f30325j;

    /* renamed from: k */
    private final List<InterfaceC11645a> f30326k;

    /* renamed from: l */
    private final InterfaceC11645a[] f30327l;

    /* renamed from: m */
    private volatile InterfaceC11645a[] f30328m;

    /* renamed from: n */
    private final boolean f30329n;

    private C11648d() {
        InterfaceC11647c interfaceC11647c;
        int i;
        InterfaceC10614a key;
        boolean z = false;
        if (!f30320o) {
            interfaceC11647c = null;
            i = 0;
            for (InterfaceC11647c interfaceC11647c2 : AbstractC10617d.m11026c().mo11022g(InterfaceC11647c.class)) {
                int size = interfaceC11647c2.mo6628g().size();
                if (size > i) {
                    interfaceC11647c = interfaceC11647c2;
                    i = size;
                }
            }
        } else {
            interfaceC11647c = null;
            i = 0;
        }
        if (interfaceC11647c != null && i != 0) {
            TreeSet treeSet = new TreeSet(this);
            for (Map.Entry<InterfaceC10614a, Integer> entry : interfaceC11647c.mo6628g().entrySet()) {
                treeSet.add(new C11649a(entry.getKey(), Long.MIN_VALUE, (m7369I(key) - 62985600) - 1, entry.getValue().intValue()));
            }
            m7365s(treeSet);
            boolean z2 = f30321p;
            if (z2) {
                this.f30326k = Collections.unmodifiableList(new ArrayList(treeSet));
            } else {
                this.f30326k = new CopyOnWriteArrayList(treeSet);
            }
            InterfaceC11645a[] m7374B = m7374B();
            this.f30327l = m7374B;
            this.f30328m = m7374B;
            this.f30325j = interfaceC11647c;
            if (z2) {
                boolean mo6632c = interfaceC11647c.mo6632c();
                if (mo6632c) {
                    Iterator<InterfaceC11645a> it = this.f30326k.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().mo7358a() < 0) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    mo6632c = z;
                }
                this.f30329n = mo6632c;
                return;
            }
            this.f30329n = true;
            return;
        }
        this.f30325j = null;
        this.f30326k = Collections.emptyList();
        InterfaceC11645a[] interfaceC11645aArr = f30323r;
        this.f30327l = interfaceC11645aArr;
        this.f30328m = interfaceC11645aArr;
        this.f30329n = false;
    }

    /* renamed from: B */
    private InterfaceC11645a[] m7374B() {
        ArrayList arrayList = new ArrayList(this.f30326k.size());
        arrayList.addAll(this.f30326k);
        Collections.reverse(arrayList);
        return (InterfaceC11645a[]) arrayList.toArray(new InterfaceC11645a[arrayList.size()]);
    }

    /* renamed from: I */
    private static long m7369I(InterfaceC10614a interfaceC10614a) {
        return C10616c.m11033i(C10616c.m11029m(C10615b.m11044k(interfaceC10614a), 40587L), 86400L);
    }

    /* renamed from: s */
    private static void m7365s(SortedSet<InterfaceC11645a> sortedSet) {
        ArrayList arrayList = new ArrayList(sortedSet.size());
        int i = 0;
        for (InterfaceC11645a interfaceC11645a : sortedSet) {
            if (interfaceC11645a.mo7357b() == Long.MIN_VALUE) {
                i += interfaceC11645a.mo7358a();
                arrayList.add(new C11649a(interfaceC11645a, i));
            } else {
                arrayList.add(interfaceC11645a);
            }
        }
        sortedSet.clear();
        sortedSet.addAll(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static String m7364t(InterfaceC10614a interfaceC10614a) {
        return String.format("%1$04d-%2$02d-%3$02d", Integer.valueOf(interfaceC10614a.mo10482o()), Integer.valueOf(interfaceC10614a.mo10481p()), Integer.valueOf(interfaceC10614a.mo10480r()));
    }

    /* renamed from: v */
    private InterfaceC11645a[] m7362v() {
        if (!f30320o && !f30321p) {
            return this.f30328m;
        }
        return this.f30327l;
    }

    /* renamed from: w */
    public static C11648d m7361w() {
        return f30324s;
    }

    /* renamed from: C */
    public boolean m7373C() {
        return !this.f30326k.isEmpty();
    }

    /* renamed from: D */
    public boolean m7372D(long j) {
        if (j <= 0) {
            return false;
        }
        InterfaceC11645a[] m7362v = m7362v();
        for (int i = 0; i < m7362v.length; i++) {
            int i2 = (m7362v[i].mo7357b() > j ? 1 : (m7362v[i].mo7357b() == j ? 0 : -1));
            if (i2 == 0) {
                if (m7362v[i].mo7358a() != 1) {
                    return false;
                }
                return true;
            } else if (i2 < 0) {
                break;
            }
        }
        return false;
    }

    /* renamed from: E */
    public long m7371E(long j) {
        if (j <= 0) {
            return j + 63072000;
        }
        InterfaceC11645a[] m7362v = m7362v();
        boolean z = this.f30329n;
        for (InterfaceC11645a interfaceC11645a : m7362v) {
            if (interfaceC11645a.mo7357b() - interfaceC11645a.mo7358a() < j || (z && interfaceC11645a.mo7358a() < 0 && interfaceC11645a.mo7357b() < j)) {
                j = C10616c.m11036f(j, interfaceC11645a.mo7355d() - interfaceC11645a.mo7357b());
                break;
            }
        }
        return j + 63072000;
    }

    /* renamed from: F */
    public boolean m7370F() {
        return this.f30329n;
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC11646b> iterator() {
        return Collections.unmodifiableList(Arrays.asList(m7362v())).iterator();
    }

    @Override // java.util.Comparator
    /* renamed from: o */
    public int compare(InterfaceC11646b interfaceC11646b, InterfaceC11646b interfaceC11646b2) {
        InterfaceC10614a mo7356c = interfaceC11646b.mo7356c();
        InterfaceC10614a mo7356c2 = interfaceC11646b2.mo7356c();
        int mo10482o = mo7356c.mo10482o();
        int mo10482o2 = mo7356c2.mo10482o();
        if (mo10482o < mo10482o2) {
            return -1;
        }
        if (mo10482o > mo10482o2) {
            return 1;
        }
        int mo10481p = mo7356c.mo10481p();
        int mo10481p2 = mo7356c2.mo10481p();
        if (mo10481p < mo10481p2) {
            return -1;
        }
        if (mo10481p > mo10481p2) {
            return 1;
        }
        int mo10480r = mo7356c.mo10480r();
        int mo10480r2 = mo7356c2.mo10480r();
        if (mo10480r < mo10480r2) {
            return -1;
        }
        if (mo10480r != mo10480r2) {
            return 1;
        }
        return 0;
    }

    /* renamed from: p */
    public long m7366p(long j) {
        InterfaceC11645a[] m7362v;
        long j2 = j - 63072000;
        if (j <= 0) {
            return j2;
        }
        for (InterfaceC11645a interfaceC11645a : m7362v()) {
            if (interfaceC11645a.mo7355d() < j2) {
                return C10616c.m11036f(j2, interfaceC11645a.mo7357b() - interfaceC11645a.mo7355d());
            }
        }
        return j2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((int) RecyclerView.ItemAnimator.FLAG_MOVED);
        sb2.append("[PROVIDER=");
        sb2.append(this.f30325j);
        if (this.f30325j != null) {
            sb2.append(",EXPIRES=");
            sb2.append(m7364t(m7363u()));
        }
        sb2.append(",EVENTS=[");
        if (m7373C()) {
            boolean z = true;
            for (InterfaceC11645a interfaceC11645a : this.f30326k) {
                if (z) {
                    z = false;
                } else {
                    sb2.append('|');
                }
                sb2.append(interfaceC11645a);
            }
        } else {
            sb2.append("NOT SUPPORTED");
        }
        sb2.append("]]");
        return sb2.toString();
    }

    /* renamed from: u */
    public InterfaceC10614a m7363u() {
        if (m7373C()) {
            return this.f30325j.mo6630e();
        }
        throw new IllegalStateException("Leap seconds not activated.");
    }

    /* renamed from: x */
    public InterfaceC11646b m7360x(long j) {
        InterfaceC11645a[] m7362v = m7362v();
        InterfaceC11645a interfaceC11645a = null;
        int i = 0;
        while (i < m7362v.length) {
            InterfaceC11645a interfaceC11645a2 = m7362v[i];
            if (j >= interfaceC11645a2.mo7357b()) {
                break;
            }
            i++;
            interfaceC11645a = interfaceC11645a2;
        }
        return interfaceC11645a;
    }

    /* renamed from: y */
    public int m7359y(long j) {
        InterfaceC11645a[] m7362v;
        if (j <= 0) {
            return 0;
        }
        for (InterfaceC11645a interfaceC11645a : m7362v()) {
            if (j > interfaceC11645a.mo7357b()) {
                return 0;
            }
            long mo7357b = interfaceC11645a.mo7357b() - interfaceC11645a.mo7358a();
            if (j > mo7357b) {
                return (int) (j - mo7357b);
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pj.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class C11649a implements InterfaceC11645a, Serializable {
        private static final long serialVersionUID = 5986185471610524587L;
        private final long _raw;
        private final long _utc;
        private final InterfaceC10614a date;
        private final int shift;

        C11649a(InterfaceC10614a interfaceC10614a, long j, long j2, int i) {
            this.date = interfaceC10614a;
            this.shift = i;
            this._utc = j;
            this._raw = j2;
        }

        @Override // p288pj.InterfaceC11646b
        /* renamed from: a */
        public int mo7358a() {
            return this.shift;
        }

        @Override // p288pj.InterfaceC11645a
        /* renamed from: b */
        public long mo7357b() {
            return this._utc;
        }

        @Override // p288pj.InterfaceC11646b
        /* renamed from: c */
        public InterfaceC10614a mo7356c() {
            return this.date;
        }

        @Override // p288pj.InterfaceC11645a
        /* renamed from: d */
        public long mo7355d() {
            return this._raw;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append(InterfaceC11646b.class.getName());
            sb2.append('[');
            sb2.append(C11648d.m7364t(this.date));
            sb2.append(": utc=");
            sb2.append(this._utc);
            sb2.append(", raw=");
            sb2.append(this._raw);
            sb2.append(" (shift=");
            sb2.append(this.shift);
            sb2.append(")]");
            return sb2.toString();
        }

        C11649a(InterfaceC11645a interfaceC11645a, int i) {
            this.date = interfaceC11645a.mo7356c();
            this.shift = interfaceC11645a.mo7358a();
            this._utc = interfaceC11645a.mo7355d() + i;
            this._raw = interfaceC11645a.mo7355d();
        }
    }
}
