package p257o4;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imageutils.C3874a;
import p314r4.C12048a;
import p394w2.C13379j;
import p437y4.InterfaceC13883h;

@TargetApi(21)
/* renamed from: o4.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10982a extends PlatformBitmapFactory {

    /* renamed from: a */
    private final InterfaceC13883h f28779a;

    /* renamed from: b */
    private final C12048a f28780b;

    public C10982a(InterfaceC13883h interfaceC13883h, C12048a c12048a) {
        this.f28779a = interfaceC13883h;
        this.f28780b = c12048a;
    }

    @Override // com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory
    /* renamed from: d */
    public CloseableReference<Bitmap> mo9413d(int i, int i2, Bitmap.Config config) {
        boolean z;
        Bitmap bitmap = this.f28779a.get(C3874a.m30553d(i, i2, config));
        if (bitmap.getAllocationByteCount() >= i * i2 * C3874a.m30554c(config)) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2682b(Boolean.valueOf(z));
        bitmap.reconfigure(i, i2, config);
        return this.f28780b.m6466c(bitmap, this.f28779a);
    }
}
