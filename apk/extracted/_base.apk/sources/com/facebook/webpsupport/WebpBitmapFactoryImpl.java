package com.facebook.webpsupport;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.TypedValue;
import com.facebook.imagepipeline.nativecode.C3742h;
import java.io.BufferedInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import p094f3.C6308c;
import p094f3.InterfaceC6305a;
import p094f3.InterfaceC6306b;
import p394w2.InterfaceC13370d;

@InterfaceC13370d
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class WebpBitmapFactoryImpl implements InterfaceC6306b {

    /* renamed from: a */
    public static final boolean f11018a = true;

    /* renamed from: b */
    private static InterfaceC6305a f11019b;

    /* renamed from: c */
    private static byte[] m30060c(InputStream inputStream, BitmapFactory.Options options) {
        byte[] bArr;
        inputStream.mark(20);
        if (options == null || (bArr = options.inTempStorage) == null || bArr.length < 20) {
            bArr = new byte[20];
        }
        try {
            inputStream.read(bArr, 0, 20);
            inputStream.reset();
            return bArr;
        } catch (IOException unused) {
            return null;
        }
    }

    @InterfaceC13370d
    private static Bitmap createBitmap(int i, int i2, BitmapFactory.Options options) {
        Bitmap bitmap;
        if (f11018a && options != null && (bitmap = options.inBitmap) != null && bitmap.isMutable()) {
            return options.inBitmap;
        }
        return f11019b.mo9411a(i, i2, Bitmap.Config.ARGB_8888);
    }

    /* renamed from: d */
    private static void m30059d(String str) {
    }

    /* renamed from: e */
    private static void m30058e(Bitmap bitmap, BitmapFactory.Options options) {
        if (bitmap != null && options != null) {
            int i = options.inDensity;
            if (i != 0) {
                bitmap.setDensity(i);
                int i2 = options.inTargetDensity;
                if (i2 != 0 && i != i2 && i != options.inScreenDensity && options.inScaled) {
                    bitmap.setDensity(i2);
                }
            } else if (f11018a && options.inBitmap != null) {
                bitmap.setDensity(160);
            }
        }
    }

    /* renamed from: f */
    private static void m30057f(Bitmap bitmap, BitmapFactory.Options options) {
        m30058e(bitmap, options);
        if (options != null) {
            options.outMimeType = "image/webp";
        }
    }

    /* renamed from: g */
    private static InputStream m30056g(InputStream inputStream) {
        if (!inputStream.markSupported()) {
            return new BufferedInputStream(inputStream, 20);
        }
        return inputStream;
    }

    @InterfaceC13370d
    private static byte[] getInTempStorageFromOptions(BitmapFactory.Options options) {
        byte[] bArr;
        return (options == null || (bArr = options.inTempStorage) == null) ? new byte[8192] : bArr;
    }

    @InterfaceC13370d
    private static float getScaleFromOptions(BitmapFactory.Options options) {
        float f = 1.0f;
        if (options == null) {
            return 1.0f;
        }
        int i = options.inSampleSize;
        if (i > 1) {
            f = 1.0f / i;
        }
        if (options.inScaled) {
            int i2 = options.inDensity;
            int i3 = options.inTargetDensity;
            int i4 = options.inScreenDensity;
            if (i2 != 0 && i3 != 0 && i2 != i4) {
                return i3 / i2;
            }
            return f;
        }
        return f;
    }

    @InterfaceC13370d
    public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        Bitmap originalDecodeByteArray;
        C3742h.m30940a();
        if (C6308c.f17810a && C6308c.m23002h(bArr, i, i2)) {
            originalDecodeByteArray = nativeDecodeByteArray(bArr, i, i2, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
            if (originalDecodeByteArray == null) {
                m30059d("webp_direct_decode_array");
            }
            m30057f(originalDecodeByteArray, options);
        } else {
            originalDecodeByteArray = originalDecodeByteArray(bArr, i, i2, options);
            if (originalDecodeByteArray == null) {
                m30059d("webp_direct_decode_array_failed_on_no_webp");
            }
        }
        return originalDecodeByteArray;
    }

    @InterfaceC13370d
    public static Bitmap hookDecodeFile(String str, BitmapFactory.Options options) {
        Bitmap bitmap = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            bitmap = hookDecodeStream(fileInputStream, null, options);
            fileInputStream.close();
        } catch (Exception unused) {
        }
        return bitmap;
    }

    @InterfaceC13370d
    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        Bitmap originalDecodeFileDescriptor;
        C3742h.m30940a();
        long nativeSeek = nativeSeek(fileDescriptor, 0L, false);
        if (nativeSeek != -1) {
            InputStream m30056g = m30056g(new FileInputStream(fileDescriptor));
            try {
                byte[] m30060c = m30060c(m30056g, options);
                if (C6308c.f17810a && m30060c != null && C6308c.m23002h(m30060c, 0, 20)) {
                    originalDecodeFileDescriptor = nativeDecodeStream(m30056g, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
                    if (originalDecodeFileDescriptor == null) {
                        m30059d("webp_direct_decode_fd");
                    }
                    setPaddingDefaultValues(rect);
                    m30057f(originalDecodeFileDescriptor, options);
                } else {
                    nativeSeek(fileDescriptor, nativeSeek, true);
                    originalDecodeFileDescriptor = originalDecodeFileDescriptor(fileDescriptor, rect, options);
                    if (originalDecodeFileDescriptor == null) {
                        m30059d("webp_direct_decode_fd_failed_on_no_webp");
                    }
                }
                try {
                } catch (Throwable unused) {
                    return originalDecodeFileDescriptor;
                }
            } finally {
                try {
                    m30056g.close();
                } catch (Throwable unused2) {
                }
            }
        } else {
            Bitmap hookDecodeStream = hookDecodeStream(new FileInputStream(fileDescriptor), rect, options);
            setPaddingDefaultValues(rect);
            return hookDecodeStream;
        }
    }

    @InterfaceC13370d
    public static Bitmap hookDecodeResource(Resources resources, int i, BitmapFactory.Options options) {
        TypedValue typedValue = new TypedValue();
        Bitmap bitmap = null;
        try {
            InputStream openRawResource = resources.openRawResource(i, typedValue);
            bitmap = hookDecodeResourceStream(resources, typedValue, openRawResource, null, options);
            if (openRawResource != null) {
                openRawResource.close();
            }
        } catch (Exception unused) {
        }
        if (!f11018a || bitmap != null || options == null || options.inBitmap == null) {
            return bitmap;
        }
        throw new IllegalArgumentException("Problem decoding into existing bitmap");
    }

    @InterfaceC13370d
    public static Bitmap hookDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        if (options.inDensity == 0 && typedValue != null) {
            int i = typedValue.density;
            if (i == 0) {
                options.inDensity = 160;
            } else if (i != 65535) {
                options.inDensity = i;
            }
        }
        if (options.inTargetDensity == 0 && resources != null) {
            options.inTargetDensity = resources.getDisplayMetrics().densityDpi;
        }
        return hookDecodeStream(inputStream, rect, options);
    }

    @InterfaceC13370d
    public static Bitmap hookDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        Bitmap originalDecodeStream;
        C3742h.m30940a();
        InputStream m30056g = m30056g(inputStream);
        byte[] m30060c = m30060c(m30056g, options);
        if (C6308c.f17810a && m30060c != null && C6308c.m23002h(m30060c, 0, 20)) {
            originalDecodeStream = nativeDecodeStream(m30056g, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
            if (originalDecodeStream == null) {
                m30059d("webp_direct_decode_stream");
            }
            m30057f(originalDecodeStream, options);
            setPaddingDefaultValues(rect);
        } else {
            originalDecodeStream = originalDecodeStream(m30056g, rect, options);
            if (originalDecodeStream == null) {
                m30059d("webp_direct_decode_stream_failed_on_no_webp");
            }
        }
        return originalDecodeStream;
    }

    @InterfaceC13370d
    private static native Bitmap nativeDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options, float f, byte[] bArr2);

    @InterfaceC13370d
    private static native Bitmap nativeDecodeStream(InputStream inputStream, BitmapFactory.Options options, float f, byte[] bArr);

    @InterfaceC13370d
    private static native long nativeSeek(FileDescriptor fileDescriptor, long j, boolean z);

    @InterfaceC13370d
    private static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        return BitmapFactory.decodeByteArray(bArr, i, i2, options);
    }

    @InterfaceC13370d
    private static Bitmap originalDecodeFile(String str, BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(str, options);
    }

    @InterfaceC13370d
    private static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
    }

    @InterfaceC13370d
    private static Bitmap originalDecodeResource(Resources resources, int i, BitmapFactory.Options options) {
        return BitmapFactory.decodeResource(resources, i, options);
    }

    @InterfaceC13370d
    private static Bitmap originalDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeResourceStream(resources, typedValue, inputStream, rect, options);
    }

    @InterfaceC13370d
    private static Bitmap originalDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(inputStream, rect, options);
    }

    @InterfaceC13370d
    private static void setBitmapSize(BitmapFactory.Options options, int i, int i2) {
        if (options != null) {
            options.outWidth = i;
            options.outHeight = i2;
        }
    }

    @InterfaceC13370d
    private static boolean setOutDimensions(BitmapFactory.Options options, int i, int i2) {
        if (options != null && options.inJustDecodeBounds) {
            options.outWidth = i;
            options.outHeight = i2;
            return true;
        }
        return false;
    }

    @InterfaceC13370d
    private static void setPaddingDefaultValues(Rect rect) {
        if (rect != null) {
            rect.top = -1;
            rect.left = -1;
            rect.bottom = -1;
            rect.right = -1;
        }
    }

    @SuppressLint({"NewApi"})
    @InterfaceC13370d
    private static boolean shouldPremultiply(BitmapFactory.Options options) {
        if (options != null) {
            return options.inPremultiplied;
        }
        return true;
    }

    @Override // p094f3.InterfaceC6306b
    /* renamed from: a */
    public Bitmap mo23011a(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        return hookDecodeFileDescriptor(fileDescriptor, rect, options);
    }

    @Override // p094f3.InterfaceC6306b
    /* renamed from: b */
    public void mo23010b(InterfaceC6305a interfaceC6305a) {
        f11019b = interfaceC6305a;
    }

    @InterfaceC13370d
    private static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2) {
        return BitmapFactory.decodeByteArray(bArr, i, i2);
    }

    @InterfaceC13370d
    private static Bitmap originalDecodeFile(String str) {
        return BitmapFactory.decodeFile(str);
    }

    @InterfaceC13370d
    private static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor);
    }

    @InterfaceC13370d
    private static Bitmap originalDecodeResource(Resources resources, int i) {
        return BitmapFactory.decodeResource(resources, i);
    }

    @InterfaceC13370d
    private static Bitmap originalDecodeStream(InputStream inputStream) {
        return BitmapFactory.decodeStream(inputStream);
    }

    @InterfaceC13370d
    public static Bitmap hookDecodeFile(String str) {
        return hookDecodeFile(str, null);
    }

    @InterfaceC13370d
    public static Bitmap hookDecodeResource(Resources resources, int i) {
        return hookDecodeResource(resources, i, null);
    }

    @InterfaceC13370d
    public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2) {
        return hookDecodeByteArray(bArr, i, i2, null);
    }

    @InterfaceC13370d
    public static Bitmap hookDecodeStream(InputStream inputStream) {
        return hookDecodeStream(inputStream, null, null);
    }

    @InterfaceC13370d
    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return hookDecodeFileDescriptor(fileDescriptor, null, null);
    }
}
