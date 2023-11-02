package p257o4;

import android.graphics.Bitmap;
import p004a3.InterfaceC0016c;

/* renamed from: o4.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10986e implements InterfaceC0016c<Bitmap> {

    /* renamed from: a */
    private static C10986e f28786a;

    private C10986e() {
    }

    /* renamed from: a */
    public static C10986e m9408a() {
        if (f28786a == null) {
            f28786a = new C10986e();
        }
        return f28786a;
    }

    @Override // p004a3.InterfaceC0016c
    /* renamed from: b */
    public void release(Bitmap bitmap) {
        bitmap.recycle();
    }
}
