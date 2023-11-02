package p072e0;

import java.nio.ByteBuffer;

/* renamed from: e0.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C6030a extends C6032c {
    /* renamed from: f */
    public C6030a m23852f(int i, ByteBuffer byteBuffer) {
        m23851g(i, byteBuffer);
        return this;
    }

    /* renamed from: g */
    public void m23851g(int i, ByteBuffer byteBuffer) {
        m23834c(i, byteBuffer);
    }

    /* renamed from: h */
    public int m23850h(int i) {
        int m23835b = m23835b(16);
        if (m23835b != 0) {
            return this.f17099b.getInt(m23833d(m23835b) + (i * 4));
        }
        return 0;
    }

    /* renamed from: i */
    public int m23849i() {
        int m23835b = m23835b(16);
        if (m23835b != 0) {
            return m23832e(m23835b);
        }
        return 0;
    }

    /* renamed from: j */
    public boolean m23848j() {
        int m23835b = m23835b(6);
        return (m23835b == 0 || this.f17099b.get(m23835b + this.f17098a) == 0) ? false : true;
    }

    /* renamed from: k */
    public short m23847k() {
        int m23835b = m23835b(14);
        if (m23835b != 0) {
            return this.f17099b.getShort(m23835b + this.f17098a);
        }
        return (short) 0;
    }

    /* renamed from: l */
    public int m23846l() {
        int m23835b = m23835b(4);
        if (m23835b != 0) {
            return this.f17099b.getInt(m23835b + this.f17098a);
        }
        return 0;
    }

    /* renamed from: m */
    public short m23845m() {
        int m23835b = m23835b(8);
        if (m23835b != 0) {
            return this.f17099b.getShort(m23835b + this.f17098a);
        }
        return (short) 0;
    }

    /* renamed from: n */
    public short m23844n() {
        int m23835b = m23835b(12);
        if (m23835b != 0) {
            return this.f17099b.getShort(m23835b + this.f17098a);
        }
        return (short) 0;
    }
}