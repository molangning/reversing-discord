package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.AbstractC3719b;
import p394w2.C13379j;
import p437y4.C13905z;
import p437y4.InterfaceC13875a0;
import p455z2.InterfaceC14072a;
import p455z2.InterfaceC14074c;

/* renamed from: com.facebook.imagepipeline.memory.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3729g extends AbstractC3719b<byte[]> implements InterfaceC14072a {

    /* renamed from: k */
    private final int[] f10516k;

    public C3729g(InterfaceC14074c interfaceC14074c, C13905z c13905z, InterfaceC13875a0 interfaceC13875a0) {
        super(interfaceC14074c, c13905z, interfaceC13875a0);
        SparseIntArray sparseIntArray = (SparseIntArray) C13379j.m2677g(c13905z.f35780c);
        this.f10516k = new int[sparseIntArray.size()];
        for (int i = 0; i < sparseIntArray.size(); i++) {
            this.f10516k[i] = sparseIntArray.keyAt(i);
        }
        m31004s();
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC3719b
    /* renamed from: A */
    public byte[] mo30971g(int i) {
        return new byte[i];
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC3719b
    /* renamed from: B */
    public void mo30970k(byte[] bArr) {
        C13379j.m2677g(bArr);
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC3719b
    /* renamed from: C */
    public int mo30968o(byte[] bArr) {
        C13379j.m2677g(bArr);
        return bArr.length;
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC3719b
    /* renamed from: n */
    protected int mo30969n(int i) {
        int[] iArr;
        if (i > 0) {
            for (int i2 : this.f10516k) {
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
    public int mo30967p(int i) {
        return i;
    }
}