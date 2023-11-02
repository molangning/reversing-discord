package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import p394w2.C13379j;
import p437y4.C13905z;
import p437y4.InterfaceC13875a0;
import p437y4.InterfaceC13883h;
import p455z2.InterfaceC14074c;

@TargetApi(21)
/* renamed from: com.facebook.imagepipeline.memory.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3724d extends AbstractC3719b<Bitmap> implements InterfaceC13883h {
    public C3724d(InterfaceC14074c interfaceC14074c, C13905z c13905z, InterfaceC13875a0 interfaceC13875a0, boolean z) {
        super(interfaceC14074c, c13905z, interfaceC13875a0, z);
        m31004s();
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC3719b
    /* renamed from: A */
    public Bitmap mo30971g(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC3719b
    /* renamed from: B */
    public void mo30970k(Bitmap bitmap) {
        C13379j.m2677g(bitmap);
        bitmap.recycle();
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC3719b
    /* renamed from: C */
    public int mo30968o(Bitmap bitmap) {
        C13379j.m2677g(bitmap);
        return bitmap.getAllocationByteCount();
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC3719b
    /* renamed from: D */
    public Bitmap mo30985q(C3723c<Bitmap> c3723c) {
        Bitmap bitmap = (Bitmap) super.mo30985q(c3723c);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC3719b
    /* renamed from: E */
    public boolean mo30966u(Bitmap bitmap) {
        C13379j.m2677g(bitmap);
        if (!bitmap.isRecycled() && bitmap.isMutable()) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC3719b
    /* renamed from: n */
    protected int mo30969n(int i) {
        return i;
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC3719b
    /* renamed from: p */
    protected int mo30967p(int i) {
        return i;
    }
}