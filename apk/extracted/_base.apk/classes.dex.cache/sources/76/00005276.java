package p437y4;

import android.graphics.Bitmap;
import java.util.Set;
import p394w2.C13379j;
import p394w2.C13381l;

/* renamed from: y4.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13893p implements InterfaceC13883h {

    /* renamed from: a */
    private final Set<Bitmap> f35730a = C13381l.m2671b();

    @Override // p455z2.InterfaceC14076e
    /* renamed from: g */
    public Bitmap get(int i) {
        Bitmap createBitmap = Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
        this.f35730a.add(createBitmap);
        return createBitmap;
    }

    @Override // p455z2.InterfaceC14076e, p004a3.InterfaceC0016c
    /* renamed from: h */
    public void release(Bitmap bitmap) {
        C13379j.m2677g(bitmap);
        this.f35730a.remove(bitmap);
        bitmap.recycle();
    }
}