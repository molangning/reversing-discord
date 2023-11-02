package p193k6;

import java.nio.ByteBuffer;
import p193k6.InterfaceC9090g;
import p195k8.C9191p0;

/* renamed from: k6.q0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C9117q0 extends AbstractC9129v {

    /* renamed from: i */
    private int f23995i;

    /* renamed from: j */
    private int f23996j;

    /* renamed from: k */
    private boolean f23997k;

    /* renamed from: l */
    private int f23998l;

    /* renamed from: m */
    private byte[] f23999m = C9191p0.f24176f;

    /* renamed from: n */
    private int f24000n;

    /* renamed from: o */
    private long f24001o;

    @Override // p193k6.AbstractC9129v, p193k6.InterfaceC9090g
    /* renamed from: b */
    public ByteBuffer mo16495b() {
        int i;
        if (super.mo16494c() && (i = this.f24000n) > 0) {
            m16489l(i).put(this.f23999m, 0, this.f24000n).flip();
            this.f24000n = 0;
        }
        return super.mo16495b();
    }

    @Override // p193k6.AbstractC9129v, p193k6.InterfaceC9090g
    /* renamed from: c */
    public boolean mo16494c() {
        return super.mo16494c() && this.f24000n == 0;
    }

    @Override // p193k6.InterfaceC9090g
    /* renamed from: e */
    public void mo16488e(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.f23998l);
        this.f24001o += min / this.f24054b.f23888d;
        this.f23998l -= min;
        byteBuffer.position(position + min);
        if (this.f23998l > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.f24000n + i2) - this.f23999m.length;
        ByteBuffer m16489l = m16489l(length);
        int m16227r = C9191p0.m16227r(length, 0, this.f24000n);
        m16489l.put(this.f23999m, 0, m16227r);
        int m16227r2 = C9191p0.m16227r(length - m16227r, 0, i2);
        byteBuffer.limit(byteBuffer.position() + m16227r2);
        m16489l.put(byteBuffer);
        byteBuffer.limit(limit);
        int i3 = i2 - m16227r2;
        int i4 = this.f24000n - m16227r;
        this.f24000n = i4;
        byte[] bArr = this.f23999m;
        System.arraycopy(bArr, m16227r, bArr, 0, i4);
        byteBuffer.get(this.f23999m, this.f24000n, i3);
        this.f24000n += i3;
        m16489l.flip();
    }

    @Override // p193k6.AbstractC9129v
    /* renamed from: h */
    public InterfaceC9090g.C9091a mo16487h(InterfaceC9090g.C9091a c9091a) {
        if (c9091a.f23887c == 2) {
            this.f23997k = true;
            if (this.f23995i == 0 && this.f23996j == 0) {
                return InterfaceC9090g.C9091a.f23884e;
            }
            return c9091a;
        }
        throw new InterfaceC9090g.C9092b(c9091a);
    }

    @Override // p193k6.AbstractC9129v
    /* renamed from: i */
    protected void mo16486i() {
        if (this.f23997k) {
            this.f23997k = false;
            int i = this.f23996j;
            int i2 = this.f24054b.f23888d;
            this.f23999m = new byte[i * i2];
            this.f23998l = this.f23995i * i2;
        }
        this.f24000n = 0;
    }

    @Override // p193k6.AbstractC9129v
    /* renamed from: j */
    protected void mo16490j() {
        int i;
        if (this.f23997k) {
            if (this.f24000n > 0) {
                this.f24001o += i / this.f24054b.f23888d;
            }
            this.f24000n = 0;
        }
    }

    @Override // p193k6.AbstractC9129v
    /* renamed from: k */
    protected void mo16485k() {
        this.f23999m = C9191p0.f24176f;
    }

    /* renamed from: m */
    public long m16567m() {
        return this.f24001o;
    }

    /* renamed from: n */
    public void m16566n() {
        this.f24001o = 0L;
    }

    /* renamed from: o */
    public void m16565o(int i, int i2) {
        this.f23995i = i;
        this.f23996j = i2;
    }
}