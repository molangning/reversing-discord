package p437y4;

import android.graphics.Bitmap;
import com.facebook.imageutils.C3874a;
import p414x2.C13677a;

/* renamed from: y4.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13884i extends AbstractC13895r<Bitmap> {
    @Override // p437y4.AbstractC13895r, p437y4.InterfaceC13900w
    /* renamed from: c */
    public Bitmap get(int i) {
        Bitmap bitmap = (Bitmap) super.get(i);
        if (bitmap != null && m1312e(bitmap)) {
            bitmap.eraseColor(0);
            return bitmap;
        }
        return null;
    }

    @Override // p437y4.InterfaceC13900w
    /* renamed from: d */
    public int mo1265a(Bitmap bitmap) {
        return C3874a.m30552e(bitmap);
    }

    /* renamed from: e */
    protected boolean m1312e(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            C13677a.m1864N("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        } else if (bitmap.isMutable()) {
            return true;
        } else {
            C13677a.m1864N("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
            return false;
        }
    }

    @Override // p437y4.AbstractC13895r, p437y4.InterfaceC13900w
    /* renamed from: f */
    public void put(Bitmap bitmap) {
        if (m1312e(bitmap)) {
            super.put(bitmap);
        }
    }
}
