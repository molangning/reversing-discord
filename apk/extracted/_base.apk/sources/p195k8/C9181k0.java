package p195k8;

import java.util.Arrays;

/* renamed from: k8.k0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9181k0<V> {

    /* renamed from: a */
    private long[] f24153a;

    /* renamed from: b */
    private V[] f24154b;

    /* renamed from: c */
    private int f24155c;

    /* renamed from: d */
    private int f24156d;

    public C9181k0() {
        this(10);
    }

    /* renamed from: b */
    private void m16367b(long j, V v) {
        int i = this.f24155c;
        int i2 = this.f24156d;
        V[] vArr = this.f24154b;
        int length = (i + i2) % vArr.length;
        this.f24153a[length] = j;
        vArr[length] = v;
        this.f24156d = i2 + 1;
    }

    /* renamed from: d */
    private void m16365d(long j) {
        int i = this.f24156d;
        if (i > 0) {
            if (j <= this.f24153a[((this.f24155c + i) - 1) % this.f24154b.length]) {
                m16366c();
            }
        }
    }

    /* renamed from: e */
    private void m16364e() {
        int length = this.f24154b.length;
        if (this.f24156d < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        V[] vArr = (V[]) m16363f(i);
        int i2 = this.f24155c;
        int i3 = length - i2;
        System.arraycopy(this.f24153a, i2, jArr, 0, i3);
        System.arraycopy(this.f24154b, this.f24155c, vArr, 0, i3);
        int i4 = this.f24155c;
        if (i4 > 0) {
            System.arraycopy(this.f24153a, 0, jArr, i3, i4);
            System.arraycopy(this.f24154b, 0, vArr, i3, this.f24155c);
        }
        this.f24153a = jArr;
        this.f24154b = vArr;
        this.f24155c = 0;
    }

    /* renamed from: f */
    private static <V> V[] m16363f(int i) {
        return (V[]) new Object[i];
    }

    /* renamed from: h */
    private V m16361h(long j, boolean z) {
        V v = null;
        long j2 = Long.MAX_VALUE;
        while (this.f24156d > 0) {
            long j3 = j - this.f24153a[this.f24155c];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            v = m16358k();
            j2 = j3;
        }
        return v;
    }

    /* renamed from: k */
    private V m16358k() {
        boolean z;
        if (this.f24156d > 0) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        V[] vArr = this.f24154b;
        int i = this.f24155c;
        V v = vArr[i];
        vArr[i] = null;
        this.f24155c = (i + 1) % vArr.length;
        this.f24156d--;
        return v;
    }

    /* renamed from: a */
    public synchronized void m16368a(long j, V v) {
        m16365d(j);
        m16364e();
        m16367b(j, v);
    }

    /* renamed from: c */
    public synchronized void m16366c() {
        this.f24155c = 0;
        this.f24156d = 0;
        Arrays.fill(this.f24154b, (Object) null);
    }

    /* renamed from: g */
    public synchronized V m16362g(long j) {
        return m16361h(j, false);
    }

    /* renamed from: i */
    public synchronized V m16360i() {
        V m16358k;
        if (this.f24156d == 0) {
            m16358k = null;
        } else {
            m16358k = m16358k();
        }
        return m16358k;
    }

    /* renamed from: j */
    public synchronized V m16359j(long j) {
        return m16361h(j, true);
    }

    /* renamed from: l */
    public synchronized int m16357l() {
        return this.f24156d;
    }

    public C9181k0(int i) {
        this.f24153a = new long[i];
        this.f24154b = (V[]) m16363f(i);
    }
}
