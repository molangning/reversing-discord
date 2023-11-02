package p193k6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import p193k6.InterfaceC9090g;
import p195k8.C9149a;
import p195k8.C9191p0;

/* renamed from: k6.p0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9114p0 implements InterfaceC9090g {

    /* renamed from: b */
    private int f23978b;

    /* renamed from: c */
    private float f23979c = 1.0f;

    /* renamed from: d */
    private float f23980d = 1.0f;

    /* renamed from: e */
    private InterfaceC9090g.C9091a f23981e;

    /* renamed from: f */
    private InterfaceC9090g.C9091a f23982f;

    /* renamed from: g */
    private InterfaceC9090g.C9091a f23983g;

    /* renamed from: h */
    private InterfaceC9090g.C9091a f23984h;

    /* renamed from: i */
    private boolean f23985i;

    /* renamed from: j */
    private C9112o0 f23986j;

    /* renamed from: k */
    private ByteBuffer f23987k;

    /* renamed from: l */
    private ShortBuffer f23988l;

    /* renamed from: m */
    private ByteBuffer f23989m;

    /* renamed from: n */
    private long f23990n;

    /* renamed from: o */
    private long f23991o;

    /* renamed from: p */
    private boolean f23992p;

    public C9114p0() {
        InterfaceC9090g.C9091a c9091a = InterfaceC9090g.C9091a.f23884e;
        this.f23981e = c9091a;
        this.f23982f = c9091a;
        this.f23983g = c9091a;
        this.f23984h = c9091a;
        ByteBuffer byteBuffer = InterfaceC9090g.f23883a;
        this.f23987k = byteBuffer;
        this.f23988l = byteBuffer.asShortBuffer();
        this.f23989m = byteBuffer;
        this.f23978b = -1;
    }

    @Override // p193k6.InterfaceC9090g
    /* renamed from: a */
    public boolean mo16496a() {
        if (this.f23982f.f23885a != -1 && (Math.abs(this.f23979c - 1.0f) >= 1.0E-4f || Math.abs(this.f23980d - 1.0f) >= 1.0E-4f || this.f23982f.f23885a != this.f23981e.f23885a)) {
            return true;
        }
        return false;
    }

    @Override // p193k6.InterfaceC9090g
    /* renamed from: b */
    public ByteBuffer mo16495b() {
        int m16619k;
        C9112o0 c9112o0 = this.f23986j;
        if (c9112o0 != null && (m16619k = c9112o0.m16619k()) > 0) {
            if (this.f23987k.capacity() < m16619k) {
                ByteBuffer order = ByteBuffer.allocateDirect(m16619k).order(ByteOrder.nativeOrder());
                this.f23987k = order;
                this.f23988l = order.asShortBuffer();
            } else {
                this.f23987k.clear();
                this.f23988l.clear();
            }
            c9112o0.m16620j(this.f23988l);
            this.f23991o += m16619k;
            this.f23987k.limit(m16619k);
            this.f23989m = this.f23987k;
        }
        ByteBuffer byteBuffer = this.f23989m;
        this.f23989m = InterfaceC9090g.f23883a;
        return byteBuffer;
    }

    @Override // p193k6.InterfaceC9090g
    /* renamed from: c */
    public boolean mo16494c() {
        C9112o0 c9112o0;
        return this.f23992p && ((c9112o0 = this.f23986j) == null || c9112o0.m16619k() == 0);
    }

    @Override // p193k6.InterfaceC9090g
    /* renamed from: d */
    public InterfaceC9090g.C9091a mo16493d(InterfaceC9090g.C9091a c9091a) {
        if (c9091a.f23887c == 2) {
            int i = this.f23978b;
            if (i == -1) {
                i = c9091a.f23885a;
            }
            this.f23981e = c9091a;
            InterfaceC9090g.C9091a c9091a2 = new InterfaceC9090g.C9091a(i, c9091a.f23886b, 2);
            this.f23982f = c9091a2;
            this.f23985i = true;
            return c9091a2;
        }
        throw new InterfaceC9090g.C9092b(c9091a);
    }

    @Override // p193k6.InterfaceC9090g
    /* renamed from: e */
    public void mo16488e(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.f23990n += remaining;
        ((C9112o0) C9149a.m16448e(this.f23986j)).m16610t(asShortBuffer);
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override // p193k6.InterfaceC9090g
    /* renamed from: f */
    public void mo16492f() {
        C9112o0 c9112o0 = this.f23986j;
        if (c9112o0 != null) {
            c9112o0.m16611s();
        }
        this.f23992p = true;
    }

    @Override // p193k6.InterfaceC9090g
    public void flush() {
        if (mo16496a()) {
            InterfaceC9090g.C9091a c9091a = this.f23981e;
            this.f23983g = c9091a;
            InterfaceC9090g.C9091a c9091a2 = this.f23982f;
            this.f23984h = c9091a2;
            if (this.f23985i) {
                this.f23986j = new C9112o0(c9091a.f23885a, c9091a.f23886b, this.f23979c, this.f23980d, c9091a2.f23885a);
            } else {
                C9112o0 c9112o0 = this.f23986j;
                if (c9112o0 != null) {
                    c9112o0.m16621i();
                }
            }
        }
        this.f23989m = InterfaceC9090g.f23883a;
        this.f23990n = 0L;
        this.f23991o = 0L;
        this.f23992p = false;
    }

    /* renamed from: g */
    public long m16606g(long j) {
        if (this.f23991o >= 1024) {
            long m16618l = this.f23990n - ((C9112o0) C9149a.m16448e(this.f23986j)).m16618l();
            int i = this.f23984h.f23885a;
            int i2 = this.f23983g.f23885a;
            if (i == i2) {
                return C9191p0.m16296I0(j, m16618l, this.f23991o);
            }
            return C9191p0.m16296I0(j, m16618l * i, this.f23991o * i2);
        }
        return (long) (this.f23979c * j);
    }

    /* renamed from: h */
    public void m16605h(float f) {
        if (this.f23980d != f) {
            this.f23980d = f;
            this.f23985i = true;
        }
    }

    /* renamed from: i */
    public void m16604i(float f) {
        if (this.f23979c != f) {
            this.f23979c = f;
            this.f23985i = true;
        }
    }

    @Override // p193k6.InterfaceC9090g
    public void reset() {
        this.f23979c = 1.0f;
        this.f23980d = 1.0f;
        InterfaceC9090g.C9091a c9091a = InterfaceC9090g.C9091a.f23884e;
        this.f23981e = c9091a;
        this.f23982f = c9091a;
        this.f23983g = c9091a;
        this.f23984h = c9091a;
        ByteBuffer byteBuffer = InterfaceC9090g.f23883a;
        this.f23987k = byteBuffer;
        this.f23988l = byteBuffer.asShortBuffer();
        this.f23989m = byteBuffer;
        this.f23978b = -1;
        this.f23985i = false;
        this.f23986j = null;
        this.f23990n = 0L;
        this.f23991o = 0L;
        this.f23992p = false;
    }
}