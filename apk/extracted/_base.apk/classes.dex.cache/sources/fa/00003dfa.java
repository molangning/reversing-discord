package p193k6;

import java.nio.ByteBuffer;
import p193k6.InterfaceC9090g;
import p195k8.C9149a;
import p195k8.C9191p0;

/* renamed from: k6.n0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9110n0 extends AbstractC9129v {

    /* renamed from: i */
    private final long f23938i;

    /* renamed from: j */
    private final long f23939j;

    /* renamed from: k */
    private final short f23940k;

    /* renamed from: l */
    private int f23941l;

    /* renamed from: m */
    private boolean f23942m;

    /* renamed from: n */
    private byte[] f23943n;

    /* renamed from: o */
    private byte[] f23944o;

    /* renamed from: p */
    private int f23945p;

    /* renamed from: q */
    private int f23946q;

    /* renamed from: r */
    private int f23947r;

    /* renamed from: s */
    private boolean f23948s;

    /* renamed from: t */
    private long f23949t;

    public C9110n0() {
        this(150000L, 20000L, (short) 1024);
    }

    /* renamed from: m */
    private int m16640m(long j) {
        return (int) ((j * this.f24054b.f23885a) / 1000000);
    }

    /* renamed from: n */
    private int m16639n(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        while (true) {
            limit -= 2;
            if (limit >= byteBuffer.position()) {
                if (Math.abs((int) byteBuffer.getShort(limit)) > this.f23940k) {
                    int i = this.f23941l;
                    return ((limit / i) * i) + i;
                }
            } else {
                return byteBuffer.position();
            }
        }
    }

    /* renamed from: o */
    private int m16638o(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f23940k) {
                int i = this.f23941l;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    /* renamed from: q */
    private void m16636q(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        m16489l(remaining).put(byteBuffer).flip();
        if (remaining > 0) {
            this.f23948s = true;
        }
    }

    /* renamed from: r */
    private void m16635r(byte[] bArr, int i) {
        m16489l(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.f23948s = true;
        }
    }

    /* renamed from: s */
    private void m16634s(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int m16638o = m16638o(byteBuffer);
        int position = m16638o - byteBuffer.position();
        byte[] bArr = this.f23943n;
        int length = bArr.length;
        int i = this.f23946q;
        int i2 = length - i;
        if (m16638o < limit && position < i2) {
            m16635r(bArr, i);
            this.f23946q = 0;
            this.f23945p = 0;
            return;
        }
        int min = Math.min(position, i2);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.f23943n, this.f23946q, min);
        int i3 = this.f23946q + min;
        this.f23946q = i3;
        byte[] bArr2 = this.f23943n;
        if (i3 == bArr2.length) {
            if (this.f23948s) {
                m16635r(bArr2, this.f23947r);
                this.f23949t += (this.f23946q - (this.f23947r * 2)) / this.f23941l;
            } else {
                this.f23949t += (i3 - this.f23947r) / this.f23941l;
            }
            m16630w(byteBuffer, this.f23943n, this.f23946q);
            this.f23946q = 0;
            this.f23945p = 2;
        }
        byteBuffer.limit(limit);
    }

    /* renamed from: t */
    private void m16633t(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f23943n.length));
        int m16639n = m16639n(byteBuffer);
        if (m16639n == byteBuffer.position()) {
            this.f23945p = 1;
        } else {
            byteBuffer.limit(m16639n);
            m16636q(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    /* renamed from: u */
    private void m16632u(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int m16638o = m16638o(byteBuffer);
        byteBuffer.limit(m16638o);
        this.f23949t += byteBuffer.remaining() / this.f23941l;
        m16630w(byteBuffer, this.f23944o, this.f23947r);
        if (m16638o < limit) {
            m16635r(this.f23944o, this.f23947r);
            this.f23945p = 0;
            byteBuffer.limit(limit);
        }
    }

    /* renamed from: w */
    private void m16630w(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.f23947r);
        int i2 = this.f23947r - min;
        System.arraycopy(bArr, i - i2, this.f23944o, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f23944o, i2, min);
    }

    @Override // p193k6.AbstractC9129v, p193k6.InterfaceC9090g
    /* renamed from: a */
    public boolean mo16496a() {
        return this.f23942m;
    }

    @Override // p193k6.InterfaceC9090g
    /* renamed from: e */
    public void mo16488e(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !m16491g()) {
            int i = this.f23945p;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        m16632u(byteBuffer);
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    m16634s(byteBuffer);
                }
            } else {
                m16633t(byteBuffer);
            }
        }
    }

    @Override // p193k6.AbstractC9129v
    /* renamed from: h */
    public InterfaceC9090g.C9091a mo16487h(InterfaceC9090g.C9091a c9091a) {
        if (c9091a.f23887c == 2) {
            if (!this.f23942m) {
                return InterfaceC9090g.C9091a.f23884e;
            }
            return c9091a;
        }
        throw new InterfaceC9090g.C9092b(c9091a);
    }

    @Override // p193k6.AbstractC9129v
    /* renamed from: i */
    protected void mo16486i() {
        if (this.f23942m) {
            this.f23941l = this.f24054b.f23888d;
            int m16640m = m16640m(this.f23938i) * this.f23941l;
            if (this.f23943n.length != m16640m) {
                this.f23943n = new byte[m16640m];
            }
            int m16640m2 = m16640m(this.f23939j) * this.f23941l;
            this.f23947r = m16640m2;
            if (this.f23944o.length != m16640m2) {
                this.f23944o = new byte[m16640m2];
            }
        }
        this.f23945p = 0;
        this.f23949t = 0L;
        this.f23946q = 0;
        this.f23948s = false;
    }

    @Override // p193k6.AbstractC9129v
    /* renamed from: j */
    protected void mo16490j() {
        int i = this.f23946q;
        if (i > 0) {
            m16635r(this.f23943n, i);
        }
        if (!this.f23948s) {
            this.f23949t += this.f23947r / this.f23941l;
        }
    }

    @Override // p193k6.AbstractC9129v
    /* renamed from: k */
    protected void mo16485k() {
        this.f23942m = false;
        this.f23947r = 0;
        byte[] bArr = C9191p0.f24176f;
        this.f23943n = bArr;
        this.f23944o = bArr;
    }

    /* renamed from: p */
    public long m16637p() {
        return this.f23949t;
    }

    /* renamed from: v */
    public void m16631v(boolean z) {
        this.f23942m = z;
    }

    public C9110n0(long j, long j2, short s) {
        C9149a.m16452a(j2 <= j);
        this.f23938i = j;
        this.f23939j = j2;
        this.f23940k = s;
        byte[] bArr = C9191p0.f24176f;
        this.f23943n = bArr;
        this.f23944o = bArr;
    }
}