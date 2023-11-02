package com.facebook.imagepipeline.memory;

import com.facebook.common.references.CloseableReference;
import p394w2.C13379j;
import p437y4.C13897t;
import p437y4.InterfaceC13896s;
import p455z2.AbstractC14082j;

/* renamed from: com.facebook.imagepipeline.memory.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3732j extends AbstractC14082j {

    /* renamed from: j */
    private final AbstractC3730h f10518j;

    /* renamed from: k */
    private CloseableReference<InterfaceC13896s> f10519k;

    /* renamed from: l */
    private int f10520l;

    /* renamed from: com.facebook.imagepipeline.memory.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C3733a extends RuntimeException {
        public C3733a() {
            super("OutputStream no longer valid");
        }
    }

    public C3732j(AbstractC3730h abstractC3730h) {
        this(abstractC3730h, abstractC3730h.m30973D());
    }

    /* renamed from: h */
    private void m30963h() {
        if (CloseableReference.m31727Q(this.f10519k)) {
            return;
        }
        throw new C3733a();
    }

    @Override // p455z2.AbstractC14082j, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        CloseableReference.m31715v(this.f10519k);
        this.f10519k = null;
        this.f10520l = -1;
        super.close();
    }

    /* renamed from: i */
    void m30962i(int i) {
        m30963h();
        C13379j.m2677g(this.f10519k);
        if (i <= this.f10519k.m31730D().getSize()) {
            return;
        }
        InterfaceC13896s interfaceC13896s = this.f10518j.get(i);
        C13379j.m2677g(this.f10519k);
        this.f10519k.m31730D().mo1281q(0, interfaceC13896s, 0, this.f10520l);
        this.f10519k.close();
        this.f10519k = CloseableReference.m31724U(interfaceC13896s, this.f10518j);
    }

    @Override // p455z2.AbstractC14082j
    /* renamed from: j */
    public C13897t mo716a() {
        m30963h();
        return new C13897t((CloseableReference) C13379j.m2677g(this.f10519k), this.f10520l);
    }

    @Override // p455z2.AbstractC14082j
    public int size() {
        return this.f10520l;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        write(new byte[]{(byte) i});
    }

    public C3732j(AbstractC3730h abstractC3730h, int i) {
        C13379j.m2682b(Boolean.valueOf(i > 0));
        AbstractC3730h abstractC3730h2 = (AbstractC3730h) C13379j.m2677g(abstractC3730h);
        this.f10518j = abstractC3730h2;
        this.f10520l = 0;
        this.f10519k = CloseableReference.m31724U(abstractC3730h2.get(i), abstractC3730h2);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            m30963h();
            m30962i(this.f10520l + i2);
            ((InterfaceC13896s) ((CloseableReference) C13379j.m2677g(this.f10519k)).m31730D()).mo1282o(this.f10520l, bArr, i, i2);
            this.f10520l += i2;
            return;
        }
        throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i + "; regionLength=" + i2);
    }
}