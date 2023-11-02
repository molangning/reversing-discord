package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import androidx.core.util.Pools$SynchronizedPool;
import com.facebook.common.references.CloseableReference;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p036c3.C2390a;
import p036c3.C2391b;
import p380v4.C13065e;
import p394w2.C13379j;
import p437y4.InterfaceC13883h;

@TargetApi(11)
/* renamed from: com.facebook.imagepipeline.platform.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC3746b implements InterfaceC3751g {

    /* renamed from: d */
    private static final Class<?> f10539d = AbstractC3746b.class;

    /* renamed from: e */
    private static final byte[] f10540e = {-1, -39};

    /* renamed from: a */
    private final InterfaceC13883h f10541a;

    /* renamed from: b */
    private final PreverificationHelper f10542b;

    /* renamed from: c */
    final Pools$SynchronizedPool<ByteBuffer> f10543c;

    public AbstractC3746b(InterfaceC13883h interfaceC13883h, int i, Pools$SynchronizedPool pools$SynchronizedPool) {
        PreverificationHelper preverificationHelper;
        if (Build.VERSION.SDK_INT >= 26) {
            preverificationHelper = new PreverificationHelper();
        } else {
            preverificationHelper = null;
        }
        this.f10542b = preverificationHelper;
        this.f10541a = interfaceC13883h;
        this.f10543c = pools$SynchronizedPool;
        for (int i2 = 0; i2 < i; i2++) {
            this.f10543c.release(ByteBuffer.allocate(16384));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00a8 A[Catch: all -> 0x00cb, RuntimeException -> 0x00cd, IllegalArgumentException -> 0x00d6, TRY_LEAVE, TryCatch #7 {IllegalArgumentException -> 0x00d6, RuntimeException -> 0x00cd, blocks: (B:117:0x006e, B:122:0x0085, B:137:0x00a8, B:129:0x0099, B:133:0x00a1, B:134:0x00a4), top: B:168:0x006e, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.facebook.common.references.CloseableReference<android.graphics.Bitmap> m30928c(java.io.InputStream r10, android.graphics.BitmapFactory.Options r11, android.graphics.Rect r12, android.graphics.ColorSpace r13) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.platform.AbstractC3746b.m30928c(java.io.InputStream, android.graphics.BitmapFactory$Options, android.graphics.Rect, android.graphics.ColorSpace):com.facebook.common.references.CloseableReference");
    }

    /* renamed from: e */
    private static BitmapFactory.Options m30927e(C13065e c13065e, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = c13065e.m3345Q();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(c13065e.m3354D(), null, options);
        if (options.outWidth != -1 && options.outHeight != -1) {
            options.inJustDecodeBounds = false;
            options.inDither = true;
            options.inPreferredConfig = config;
            options.inMutable = true;
            return options;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.facebook.imagepipeline.platform.InterfaceC3751g
    /* renamed from: a */
    public CloseableReference<Bitmap> mo30921a(C13065e c13065e, Bitmap.Config config, Rect rect, int i, ColorSpace colorSpace) {
        boolean z;
        boolean m3340Y = c13065e.m3340Y(i);
        BitmapFactory.Options m30927e = m30927e(c13065e, config);
        C2391b m3354D = c13065e.m3354D();
        C13379j.m2677g(m3354D);
        if (c13065e.m3344R() > i) {
            m3354D = new C2390a(m3354D, i);
        }
        if (!m3340Y) {
            m3354D = new C2391b(m3354D, f10540e);
        }
        if (m30927e.inPreferredConfig != Bitmap.Config.ARGB_8888) {
            z = true;
        } else {
            z = false;
        }
        try {
            try {
                CloseableReference<Bitmap> m30928c = m30928c(m3354D, m30927e, rect, colorSpace);
                try {
                    m3354D.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return m30928c;
            } catch (Throwable th2) {
                try {
                    m3354D.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                throw th2;
            }
        } catch (RuntimeException e3) {
            if (z) {
                CloseableReference<Bitmap> mo30921a = mo30921a(c13065e, Bitmap.Config.ARGB_8888, rect, i, colorSpace);
                try {
                    m3354D.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                return mo30921a;
            }
            throw e3;
        }
    }

    @Override // com.facebook.imagepipeline.platform.InterfaceC3751g
    /* renamed from: b */
    public CloseableReference<Bitmap> mo30920b(C13065e c13065e, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        boolean z;
        BitmapFactory.Options m30927e = m30927e(c13065e, config);
        if (m30927e.inPreferredConfig != Bitmap.Config.ARGB_8888) {
            z = true;
        } else {
            z = false;
        }
        try {
            return m30928c((InputStream) C13379j.m2677g(c13065e.m3354D()), m30927e, rect, colorSpace);
        } catch (RuntimeException e) {
            if (z) {
                return mo30920b(c13065e, Bitmap.Config.ARGB_8888, rect, colorSpace);
            }
            throw e;
        }
    }

    /* renamed from: d */
    public abstract int mo30923d(int i, int i2, BitmapFactory.Options options);
}