package com.facebook.imagepipeline.nativecode;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.platform.InterfaceC3751g;
import com.facebook.imageutils.C3874a;
import com.facebook.soloader.InterfaceC4303e;
import java.util.Locale;
import p294q4.C11701c;
import p380v4.C13065e;
import p394w2.C13379j;
import p394w2.C13386n;
import p394w2.InterfaceC13370d;
import p437y4.C13880f;
import p437y4.C13882g;
import p455z2.InterfaceC14078g;

@InterfaceC13370d
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class DalvikPurgeableDecoder implements InterfaceC3751g {

    /* renamed from: b */
    protected static final byte[] f10523b;

    /* renamed from: a */
    private final C13880f f10524a = C13882g.m1316a();

    @InterfaceC4303e
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class OreoUtils {
        private OreoUtils() {
        }

        @TargetApi(26)
        /* renamed from: a */
        static void m30955a(BitmapFactory.Options options, ColorSpace colorSpace) {
            ColorSpace.Named named;
            if (colorSpace == null) {
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
            }
            options.inPreferredColorSpace = colorSpace;
        }
    }

    static {
        C3738d.m30944a();
        f10523b = new byte[]{-1, -39};
    }

    /* renamed from: e */
    public static boolean m30958e(CloseableReference<InterfaceC14078g> closeableReference, int i) {
        InterfaceC14078g m31730D = closeableReference.m31730D();
        if (i >= 2 && m31730D.mo723k(i - 2) == -1 && m31730D.mo723k(i - 1) == -39) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static BitmapFactory.Options m30957f(int i, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        options.inMutable = true;
        return options;
    }

    @InterfaceC13370d
    private static native void nativePinBitmap(Bitmap bitmap);

    @Override // com.facebook.imagepipeline.platform.InterfaceC3751g
    /* renamed from: a */
    public CloseableReference<Bitmap> mo30921a(C13065e c13065e, Bitmap.Config config, Rect rect, int i, ColorSpace colorSpace) {
        BitmapFactory.Options m30957f = m30957f(c13065e.m3345Q(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.m30955a(m30957f, colorSpace);
        }
        CloseableReference<InterfaceC14078g> m3332m = c13065e.m3332m();
        C13379j.m2677g(m3332m);
        try {
            return m30956g(mo30930d(m3332m, i, m30957f));
        } finally {
            CloseableReference.m31715v(m3332m);
        }
    }

    @Override // com.facebook.imagepipeline.platform.InterfaceC3751g
    /* renamed from: b */
    public CloseableReference<Bitmap> mo30920b(C13065e c13065e, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options m30957f = m30957f(c13065e.m3345Q(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.m30955a(m30957f, colorSpace);
        }
        CloseableReference<InterfaceC14078g> m3332m = c13065e.m3332m();
        C13379j.m2677g(m3332m);
        try {
            return m30956g(mo30931c(m3332m, m30957f));
        } finally {
            CloseableReference.m31715v(m3332m);
        }
    }

    /* renamed from: c */
    protected abstract Bitmap mo30931c(CloseableReference<InterfaceC14078g> closeableReference, BitmapFactory.Options options);

    /* renamed from: d */
    protected abstract Bitmap mo30930d(CloseableReference<InterfaceC14078g> closeableReference, int i, BitmapFactory.Options options);

    /* renamed from: g */
    public CloseableReference<Bitmap> m30956g(Bitmap bitmap) {
        C13379j.m2677g(bitmap);
        try {
            nativePinBitmap(bitmap);
            if (this.f10524a.m1318g(bitmap)) {
                return CloseableReference.m31724U(bitmap, this.f10524a.m1320e());
            }
            int m30552e = C3874a.m30552e(bitmap);
            bitmap.recycle();
            throw new C11701c(String.format(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", Integer.valueOf(m30552e), Integer.valueOf(this.f10524a.m1323b()), Long.valueOf(this.f10524a.m1319f()), Integer.valueOf(this.f10524a.m1322c()), Integer.valueOf(this.f10524a.m1321d())));
        } catch (Exception e) {
            bitmap.recycle();
            throw C13386n.m2666a(e);
        }
    }
}