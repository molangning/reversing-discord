package p072e0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: e0.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C6031b extends C6032c {
    /* renamed from: h */
    public static C6031b m23841h(ByteBuffer byteBuffer) {
        return m23840i(byteBuffer, new C6031b());
    }

    /* renamed from: i */
    public static C6031b m23840i(ByteBuffer byteBuffer, C6031b c6031b) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return c6031b.m23843f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* renamed from: f */
    public C6031b m23843f(int i, ByteBuffer byteBuffer) {
        m23842g(i, byteBuffer);
        return this;
    }

    /* renamed from: g */
    public void m23842g(int i, ByteBuffer byteBuffer) {
        m23834c(i, byteBuffer);
    }

    /* renamed from: j */
    public C6030a m23839j(C6030a c6030a, int i) {
        int m23835b = m23835b(6);
        if (m23835b != 0) {
            return c6030a.m23852f(m23836a(m23833d(m23835b) + (i * 4)), this.f17099b);
        }
        return null;
    }

    /* renamed from: k */
    public int m23838k() {
        int m23835b = m23835b(6);
        if (m23835b != 0) {
            return m23832e(m23835b);
        }
        return 0;
    }

    /* renamed from: l */
    public int m23837l() {
        int m23835b = m23835b(4);
        if (m23835b != 0) {
            return this.f17099b.getInt(m23835b + this.f17098a);
        }
        return 0;
    }
}
