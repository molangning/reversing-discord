package p193k6;

import java.nio.ByteBuffer;
import p193k6.InterfaceC9090g;
import p195k8.C9191p0;

/* renamed from: k6.i0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C9097i0 extends AbstractC9129v {

    /* renamed from: i */
    private static final int f23898i = Float.floatToIntBits(Float.NaN);

    /* renamed from: m */
    private static void m16672m(int i, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i * 4.656612875245797E-10d));
        if (floatToIntBits == f23898i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // p193k6.InterfaceC9090g
    /* renamed from: e */
    public void mo16488e(ByteBuffer byteBuffer) {
        ByteBuffer m16489l;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.f24054b.f23887c;
        if (i2 != 536870912) {
            if (i2 == 805306368) {
                m16489l = m16489l(i);
                while (position < limit) {
                    m16672m((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), m16489l);
                    position += 4;
                }
            } else {
                throw new IllegalStateException();
            }
        } else {
            m16489l = m16489l((i / 3) * 4);
            while (position < limit) {
                m16672m(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), m16489l);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        m16489l.flip();
    }

    @Override // p193k6.AbstractC9129v
    /* renamed from: h */
    public InterfaceC9090g.C9091a mo16487h(InterfaceC9090g.C9091a c9091a) {
        int i = c9091a.f23887c;
        if (C9191p0.m16232o0(i)) {
            if (i != 4) {
                return new InterfaceC9090g.C9091a(c9091a.f23885a, c9091a.f23886b, 4);
            }
            return InterfaceC9090g.C9091a.f23884e;
        }
        throw new InterfaceC9090g.C9092b(c9091a);
    }
}