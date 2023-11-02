package p193k6;

import java.nio.ByteBuffer;
import p193k6.InterfaceC9090g;
import p195k8.C9149a;

/* renamed from: k6.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C9130w extends AbstractC9129v {

    /* renamed from: i */
    private int[] f24061i;

    /* renamed from: j */
    private int[] f24062j;

    @Override // p193k6.InterfaceC9090g
    /* renamed from: e */
    public void mo16488e(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) C9149a.m16448e(this.f24062j);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer m16489l = m16489l(((limit - position) / this.f24054b.f23888d) * this.f24055c.f23888d);
        while (position < limit) {
            for (int i : iArr) {
                m16489l.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f24054b.f23888d;
        }
        byteBuffer.position(limit);
        m16489l.flip();
    }

    @Override // p193k6.AbstractC9129v
    /* renamed from: h */
    public InterfaceC9090g.C9091a mo16487h(InterfaceC9090g.C9091a c9091a) {
        boolean z;
        boolean z2;
        int[] iArr = this.f24061i;
        if (iArr == null) {
            return InterfaceC9090g.C9091a.f23884e;
        }
        if (c9091a.f23887c == 2) {
            if (c9091a.f23886b != iArr.length) {
                z = true;
            } else {
                z = false;
            }
            for (int i = 0; i < iArr.length; i++) {
                int i2 = iArr[i];
                if (i2 < c9091a.f23886b) {
                    if (i2 != i) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z |= z2;
                } else {
                    throw new InterfaceC9090g.C9092b(c9091a);
                }
            }
            if (z) {
                return new InterfaceC9090g.C9091a(c9091a.f23885a, iArr.length, 2);
            }
            return InterfaceC9090g.C9091a.f23884e;
        }
        throw new InterfaceC9090g.C9092b(c9091a);
    }

    @Override // p193k6.AbstractC9129v
    /* renamed from: i */
    protected void mo16486i() {
        this.f24062j = this.f24061i;
    }

    @Override // p193k6.AbstractC9129v
    /* renamed from: k */
    protected void mo16485k() {
        this.f24062j = null;
        this.f24061i = null;
    }

    /* renamed from: m */
    public void m16484m(int[] iArr) {
        this.f24061i = iArr;
    }
}
