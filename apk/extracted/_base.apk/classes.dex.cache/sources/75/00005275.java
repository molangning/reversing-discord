package p437y4;

import android.graphics.Bitmap;
import p394w2.C13379j;

/* renamed from: y4.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13892o implements InterfaceC13883h {
    @Override // p455z2.InterfaceC14076e
    /* renamed from: g */
    public Bitmap get(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
    }

    @Override // p455z2.InterfaceC14076e, p004a3.InterfaceC0016c
    /* renamed from: h */
    public void release(Bitmap bitmap) {
        C13379j.m2677g(bitmap);
        bitmap.recycle();
    }
}