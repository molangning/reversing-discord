package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.memory.C3726f;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import p394w2.C13379j;
import p394w2.InterfaceC13370d;
import p455z2.InterfaceC14078g;

@TargetApi(19)
@InterfaceC13370d
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {

    /* renamed from: c */
    private final C3726f f10538c;

    @InterfaceC13370d
    public KitKatPurgeableDecoder(C3726f c3726f) {
        this.f10538c = c3726f;
    }

    /* renamed from: h */
    private static void m30929h(byte[] bArr, int i) {
        bArr[i] = -1;
        bArr[i + 1] = -39;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    /* renamed from: c */
    protected Bitmap mo30931c(CloseableReference<InterfaceC14078g> closeableReference, BitmapFactory.Options options) {
        InterfaceC14078g m31730D = closeableReference.m31730D();
        int size = m31730D.size();
        CloseableReference<byte[]> m30983a = this.f10538c.m30983a(size);
        try {
            byte[] m31730D2 = m30983a.m31730D();
            m31730D.mo725e(0, m31730D2, 0, size);
            return (Bitmap) C13379j.m2676h(BitmapFactory.decodeByteArray(m31730D2, 0, size, options), "BitmapFactory returned null");
        } finally {
            CloseableReference.m31715v(m30983a);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    /* renamed from: d */
    protected Bitmap mo30930d(CloseableReference<InterfaceC14078g> closeableReference, int i, BitmapFactory.Options options) {
        byte[] bArr;
        boolean z;
        if (DalvikPurgeableDecoder.m30958e(closeableReference, i)) {
            bArr = null;
        } else {
            bArr = DalvikPurgeableDecoder.f10523b;
        }
        InterfaceC14078g m31730D = closeableReference.m31730D();
        if (i <= m31730D.size()) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2682b(Boolean.valueOf(z));
        int i2 = i + 2;
        CloseableReference<byte[]> m30983a = this.f10538c.m30983a(i2);
        try {
            byte[] m31730D2 = m30983a.m31730D();
            m31730D.mo725e(0, m31730D2, 0, i);
            if (bArr != null) {
                m30929h(m31730D2, i);
                i = i2;
            }
            return (Bitmap) C13379j.m2676h(BitmapFactory.decodeByteArray(m31730D2, 0, i, options), "BitmapFactory returned null");
        } finally {
            CloseableReference.m31715v(m30983a);
        }
    }
}
