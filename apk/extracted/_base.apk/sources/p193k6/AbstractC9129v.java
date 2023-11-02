package p193k6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p193k6.InterfaceC9090g;

/* renamed from: k6.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC9129v implements InterfaceC9090g {

    /* renamed from: b */
    protected InterfaceC9090g.C9091a f24054b;

    /* renamed from: c */
    protected InterfaceC9090g.C9091a f24055c;

    /* renamed from: d */
    private InterfaceC9090g.C9091a f24056d;

    /* renamed from: e */
    private InterfaceC9090g.C9091a f24057e;

    /* renamed from: f */
    private ByteBuffer f24058f;

    /* renamed from: g */
    private ByteBuffer f24059g;

    /* renamed from: h */
    private boolean f24060h;

    public AbstractC9129v() {
        ByteBuffer byteBuffer = InterfaceC9090g.f23883a;
        this.f24058f = byteBuffer;
        this.f24059g = byteBuffer;
        InterfaceC9090g.C9091a c9091a = InterfaceC9090g.C9091a.f23884e;
        this.f24056d = c9091a;
        this.f24057e = c9091a;
        this.f24054b = c9091a;
        this.f24055c = c9091a;
    }

    @Override // p193k6.InterfaceC9090g
    /* renamed from: a */
    public boolean mo16496a() {
        return this.f24057e != InterfaceC9090g.C9091a.f23884e;
    }

    @Override // p193k6.InterfaceC9090g
    /* renamed from: b */
    public ByteBuffer mo16495b() {
        ByteBuffer byteBuffer = this.f24059g;
        this.f24059g = InterfaceC9090g.f23883a;
        return byteBuffer;
    }

    @Override // p193k6.InterfaceC9090g
    /* renamed from: c */
    public boolean mo16494c() {
        return this.f24060h && this.f24059g == InterfaceC9090g.f23883a;
    }

    @Override // p193k6.InterfaceC9090g
    /* renamed from: d */
    public final InterfaceC9090g.C9091a mo16493d(InterfaceC9090g.C9091a c9091a) {
        this.f24056d = c9091a;
        this.f24057e = mo16487h(c9091a);
        if (mo16496a()) {
            return this.f24057e;
        }
        return InterfaceC9090g.C9091a.f23884e;
    }

    @Override // p193k6.InterfaceC9090g
    /* renamed from: f */
    public final void mo16492f() {
        this.f24060h = true;
        mo16490j();
    }

    @Override // p193k6.InterfaceC9090g
    public final void flush() {
        this.f24059g = InterfaceC9090g.f23883a;
        this.f24060h = false;
        this.f24054b = this.f24056d;
        this.f24055c = this.f24057e;
        mo16486i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean m16491g() {
        return this.f24059g.hasRemaining();
    }

    /* renamed from: h */
    protected abstract InterfaceC9090g.C9091a mo16487h(InterfaceC9090g.C9091a c9091a);

    /* renamed from: i */
    protected void mo16486i() {
    }

    /* renamed from: j */
    protected void mo16490j() {
    }

    /* renamed from: k */
    protected void mo16485k() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public final ByteBuffer m16489l(int i) {
        if (this.f24058f.capacity() < i) {
            this.f24058f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f24058f.clear();
        }
        ByteBuffer byteBuffer = this.f24058f;
        this.f24059g = byteBuffer;
        return byteBuffer;
    }

    @Override // p193k6.InterfaceC9090g
    public final void reset() {
        flush();
        this.f24058f = InterfaceC9090g.f23883a;
        InterfaceC9090g.C9091a c9091a = InterfaceC9090g.C9091a.f23884e;
        this.f24056d = c9091a;
        this.f24057e = c9091a;
        this.f24054b = c9091a;
        this.f24055c = c9091a;
        mo16485k();
    }
}
