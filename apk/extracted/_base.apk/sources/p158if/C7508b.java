package p158if;

import androidx.recyclerview.widget.RecyclerView;
import gf.InterfaceC6744e;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p233mf.C10453f;

/* renamed from: if.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7508b<T> implements InterfaceC6744e<T> {

    /* renamed from: r */
    static final int f20749r = Integer.getInteger("jctools.spsc.max.lookahead.step", (int) RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT).intValue();

    /* renamed from: s */
    private static final Object f20750s = new Object();

    /* renamed from: k */
    int f20752k;

    /* renamed from: l */
    long f20753l;

    /* renamed from: m */
    final int f20754m;

    /* renamed from: n */
    AtomicReferenceArray<Object> f20755n;

    /* renamed from: o */
    final int f20756o;

    /* renamed from: p */
    AtomicReferenceArray<Object> f20757p;

    /* renamed from: j */
    final AtomicLong f20751j = new AtomicLong();

    /* renamed from: q */
    final AtomicLong f20758q = new AtomicLong();

    public C7508b(int i) {
        int m11513a = C10453f.m11513a(Math.max(8, i));
        int i2 = m11513a - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(m11513a + 1);
        this.f20755n = atomicReferenceArray;
        this.f20754m = i2;
        m20549a(m11513a);
        this.f20757p = atomicReferenceArray;
        this.f20756o = i2;
        this.f20753l = i2 - 1;
        m20535p(0L);
    }

    /* renamed from: a */
    private void m20549a(int i) {
        this.f20752k = Math.min(i / 4, f20749r);
    }

    /* renamed from: b */
    private static int m20548b(int i) {
        return i;
    }

    /* renamed from: d */
    private static int m20547d(long j, int i) {
        return m20548b(((int) j) & i);
    }

    /* renamed from: e */
    private long m20546e() {
        return this.f20758q.get();
    }

    /* renamed from: f */
    private long m20545f() {
        return this.f20751j.get();
    }

    /* renamed from: g */
    private long m20544g() {
        return this.f20758q.get();
    }

    /* renamed from: h */
    private static <E> Object m20543h(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    /* renamed from: i */
    private AtomicReferenceArray<Object> m20542i(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        int m20548b = m20548b(i);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) m20543h(atomicReferenceArray, m20548b);
        m20537n(atomicReferenceArray, m20548b, null);
        return atomicReferenceArray2;
    }

    /* renamed from: j */
    private long m20541j() {
        return this.f20751j.get();
    }

    /* renamed from: k */
    private T m20540k(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f20757p = atomicReferenceArray;
        int m20547d = m20547d(j, i);
        T t = (T) m20543h(atomicReferenceArray, m20547d);
        if (t != null) {
            m20537n(atomicReferenceArray, m20547d, null);
            m20538m(j + 1);
        }
        return t;
    }

    /* renamed from: l */
    private void m20539l(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f20755n = atomicReferenceArray2;
        this.f20753l = (j2 + j) - 1;
        m20537n(atomicReferenceArray2, i, t);
        m20536o(atomicReferenceArray, atomicReferenceArray2);
        m20537n(atomicReferenceArray, i, f20750s);
        m20535p(j + 1);
    }

    /* renamed from: m */
    private void m20538m(long j) {
        this.f20758q.lazySet(j);
    }

    /* renamed from: n */
    private static void m20537n(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* renamed from: o */
    private void m20536o(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        m20537n(atomicReferenceArray, m20548b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    /* renamed from: p */
    private void m20535p(long j) {
        this.f20751j.lazySet(j);
    }

    /* renamed from: q */
    private boolean m20534q(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        m20537n(atomicReferenceArray, i, t);
        m20535p(j + 1);
        return true;
    }

    @Override // gf.InterfaceC6745f
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // gf.InterfaceC6745f
    public boolean isEmpty() {
        return m20541j() == m20544g();
    }

    @Override // gf.InterfaceC6745f
    public boolean offer(T t) {
        if (t != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.f20755n;
            long m20545f = m20545f();
            int i = this.f20754m;
            int m20547d = m20547d(m20545f, i);
            if (m20545f < this.f20753l) {
                return m20534q(atomicReferenceArray, t, m20545f, m20547d);
            }
            long j = this.f20752k + m20545f;
            if (m20543h(atomicReferenceArray, m20547d(j, i)) == null) {
                this.f20753l = j - 1;
                return m20534q(atomicReferenceArray, t, m20545f, m20547d);
            } else if (m20543h(atomicReferenceArray, m20547d(1 + m20545f, i)) == null) {
                return m20534q(atomicReferenceArray, t, m20545f, m20547d);
            } else {
                m20539l(atomicReferenceArray, m20545f, m20547d, t, i);
                return true;
            }
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // gf.InterfaceC6744e, gf.InterfaceC6745f
    public T poll() {
        boolean z;
        AtomicReferenceArray<Object> atomicReferenceArray = this.f20757p;
        long m20546e = m20546e();
        int i = this.f20756o;
        int m20547d = m20547d(m20546e, i);
        T t = (T) m20543h(atomicReferenceArray, m20547d);
        if (t == f20750s) {
            z = true;
        } else {
            z = false;
        }
        if (t != null && !z) {
            m20537n(atomicReferenceArray, m20547d, null);
            m20538m(m20546e + 1);
            return t;
        } else if (!z) {
            return null;
        } else {
            return m20540k(m20542i(atomicReferenceArray, i + 1), m20546e, i);
        }
    }
}
