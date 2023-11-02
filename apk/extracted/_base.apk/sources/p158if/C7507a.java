package p158if;

import androidx.recyclerview.widget.RecyclerView;
import gf.InterfaceC6744e;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p233mf.C10453f;

/* renamed from: if.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7507a<E> extends AtomicReferenceArray<E> implements InterfaceC6744e<E> {

    /* renamed from: o */
    private static final Integer f20743o = Integer.getInteger("jctools.spsc.max.lookahead.step", (int) RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);

    /* renamed from: j */
    final int f20744j;

    /* renamed from: k */
    final AtomicLong f20745k;

    /* renamed from: l */
    long f20746l;

    /* renamed from: m */
    final AtomicLong f20747m;

    /* renamed from: n */
    final int f20748n;

    public C7507a(int i) {
        super(C10453f.m11513a(i));
        this.f20744j = length() - 1;
        this.f20745k = new AtomicLong();
        this.f20747m = new AtomicLong();
        this.f20748n = Math.min(i / 4, f20743o.intValue());
    }

    /* renamed from: a */
    int m20555a(long j) {
        return ((int) j) & this.f20744j;
    }

    /* renamed from: b */
    int m20554b(long j, int i) {
        return ((int) j) & i;
    }

    @Override // gf.InterfaceC6745f
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    /* renamed from: d */
    E m20553d(int i) {
        return get(i);
    }

    /* renamed from: e */
    void m20552e(long j) {
        this.f20747m.lazySet(j);
    }

    /* renamed from: f */
    void m20551f(int i, E e) {
        lazySet(i, e);
    }

    /* renamed from: g */
    void m20550g(long j) {
        this.f20745k.lazySet(j);
    }

    @Override // gf.InterfaceC6745f
    public boolean isEmpty() {
        return this.f20745k.get() == this.f20747m.get();
    }

    @Override // gf.InterfaceC6745f
    public boolean offer(E e) {
        if (e != null) {
            int i = this.f20744j;
            long j = this.f20745k.get();
            int m20554b = m20554b(j, i);
            if (j >= this.f20746l) {
                long j2 = this.f20748n + j;
                if (m20553d(m20554b(j2, i)) == null) {
                    this.f20746l = j2;
                } else if (m20553d(m20554b) != null) {
                    return false;
                }
            }
            m20551f(m20554b, e);
            m20550g(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // gf.InterfaceC6744e, gf.InterfaceC6745f
    public E poll() {
        long j = this.f20747m.get();
        int m20555a = m20555a(j);
        E m20553d = m20553d(m20555a);
        if (m20553d == null) {
            return null;
        }
        m20552e(j + 1);
        m20551f(m20555a, null);
        return m20553d;
    }
}
