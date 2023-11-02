package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.AbstractC3719b;
import p394w2.C13379j;
import p437y4.C13905z;
import p437y4.InterfaceC13875a0;
import p437y4.InterfaceC13896s;
import p455z2.InterfaceC14074c;

/* renamed from: com.facebook.imagepipeline.memory.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC3730h extends AbstractC3719b<InterfaceC13896s> {

    /* renamed from: k */
    private final int[] f10517k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3730h(InterfaceC14074c interfaceC14074c, C13905z c13905z, InterfaceC13875a0 interfaceC13875a0) {
        super(interfaceC14074c, c13905z, interfaceC13875a0);
        SparseIntArray sparseIntArray = (SparseIntArray) C13379j.m2677g(c13905z.f35780c);
        this.f10517k = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.f10517k;
            if (i < iArr.length) {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            } else {
                m31004s();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.AbstractC3719b
    /* renamed from: A */
    public abstract InterfaceC13896s mo30971g(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.AbstractC3719b
    /* renamed from: B */
    public void mo30970k(InterfaceC13896s interfaceC13896s) {
        C13379j.m2677g(interfaceC13896s);
        interfaceC13896s.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.AbstractC3719b
    /* renamed from: C */
    public int mo30968o(InterfaceC13896s interfaceC13896s) {
        C13379j.m2677g(interfaceC13896s);
        return interfaceC13896s.getSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public int m30973D() {
        return this.f10517k[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.AbstractC3719b
    /* renamed from: E */
    public boolean mo30966u(InterfaceC13896s interfaceC13896s) {
        C13379j.m2677g(interfaceC13896s);
        return !interfaceC13896s.isClosed();
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC3719b
    /* renamed from: n */
    protected int mo30969n(int i) {
        int[] iArr;
        if (i > 0) {
            for (int i2 : this.f10517k) {
                if (i2 >= i) {
                    return i2;
                }
            }
            return i;
        }
        throw new AbstractC3719b.C3721b(Integer.valueOf(i));
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC3719b
    /* renamed from: p */
    protected int mo30967p(int i) {
        return i;
    }
}
