package p040c7;

import java.nio.ByteBuffer;
import p195k8.C9149a;
import p228m6.C10271g;

/* renamed from: c7.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C2422i extends C10271g {

    /* renamed from: r */
    private long f6625r;

    /* renamed from: s */
    private int f6626s;

    /* renamed from: t */
    private int f6627t;

    public C2422i() {
        super(2);
        this.f6627t = 32;
    }

    /* renamed from: z */
    private boolean m33443z(C10271g c10271g) {
        ByteBuffer byteBuffer;
        if (!m33446D()) {
            return true;
        }
        if (this.f6626s >= this.f6627t || c10271g.m11989k() != m11989k()) {
            return false;
        }
        ByteBuffer byteBuffer2 = c10271g.f26743l;
        if (byteBuffer2 == null || (byteBuffer = this.f26743l) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000) {
            return true;
        }
        return false;
    }

    /* renamed from: A */
    public long m33449A() {
        return this.f26745n;
    }

    /* renamed from: B */
    public long m33448B() {
        return this.f6625r;
    }

    /* renamed from: C */
    public int m33447C() {
        return this.f6626s;
    }

    /* renamed from: D */
    public boolean m33446D() {
        return this.f6626s > 0;
    }

    /* renamed from: E */
    public void m33445E(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16452a(z);
        this.f6627t = i;
    }

    @Override // p228m6.C10271g, p228m6.AbstractC10263a
    /* renamed from: f */
    public void mo3126f() {
        super.mo3126f();
        this.f6626s = 0;
    }

    /* renamed from: w */
    public boolean m33444w(C10271g c10271g) {
        C9149a.m16452a(!c10271g.m11975r());
        C9149a.m16452a(!c10271g.m11990i());
        C9149a.m16452a(!c10271g.m11988l());
        if (!m33443z(c10271g)) {
            return false;
        }
        int i = this.f6626s;
        this.f6626s = i + 1;
        if (i == 0) {
            this.f26745n = c10271g.f26745n;
            if (c10271g.m11987m()) {
                m11986n(1);
            }
        }
        if (c10271g.m11989k()) {
            m11986n(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = c10271g.f26743l;
        if (byteBuffer != null) {
            m11977p(byteBuffer.remaining());
            this.f26743l.put(byteBuffer);
        }
        this.f6625r = c10271g.f26745n;
        return true;
    }
}
