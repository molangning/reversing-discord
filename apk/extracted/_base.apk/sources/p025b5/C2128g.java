package p025b5;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import java.io.OutputStream;
import p170j4.C8792b;
import p170j4.C8793c;
import p380v4.C13065e;
import p414x2.C13677a;

/* renamed from: b5.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C2128g implements InterfaceC2124c {

    /* renamed from: a */
    private final boolean f5995a;

    /* renamed from: b */
    private final int f5996b;

    public C2128g(boolean z, int i) {
        this.f5995a = z;
        this.f5996b = i;
    }

    /* renamed from: e */
    private static Bitmap.CompressFormat m34147e(C8793c c8793c) {
        if (c8793c == null) {
            return Bitmap.CompressFormat.JPEG;
        }
        if (c8793c == C8792b.f23081a) {
            return Bitmap.CompressFormat.JPEG;
        }
        if (c8793c == C8792b.f23082b) {
            return Bitmap.CompressFormat.PNG;
        }
        if (C8792b.m17235a(c8793c)) {
            return Bitmap.CompressFormat.WEBP;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    /* renamed from: f */
    private int m34146f(C13065e c13065e, RotationOptions rotationOptions, ResizeOptions resizeOptions) {
        if (!this.f5995a) {
            return 1;
        }
        return C2122a.m34168b(rotationOptions, resizeOptions, c13065e, this.f5996b);
    }

    @Override // p025b5.InterfaceC2124c
    /* renamed from: a */
    public String mo30953a() {
        return "SimpleImageTranscoder";
    }

    @Override // p025b5.InterfaceC2124c
    /* renamed from: b */
    public boolean mo30952b(C13065e c13065e, RotationOptions rotationOptions, ResizeOptions resizeOptions) {
        if (rotationOptions == null) {
            rotationOptions = RotationOptions.m31189a();
        }
        if (this.f5995a && C2122a.m34168b(rotationOptions, resizeOptions, c13065e, this.f5996b) > 1) {
            return true;
        }
        return false;
    }

    @Override // p025b5.InterfaceC2124c
    /* renamed from: c */
    public boolean mo30951c(C8793c c8793c) {
        return c8793c == C8792b.f23091k || c8793c == C8792b.f23081a;
    }

    @Override // p025b5.InterfaceC2124c
    /* renamed from: d */
    public C2123b mo30950d(C13065e c13065e, OutputStream outputStream, RotationOptions rotationOptions, ResizeOptions resizeOptions, C8793c c8793c, Integer num) {
        Integer num2;
        C2128g c2128g;
        RotationOptions rotationOptions2;
        Bitmap bitmap;
        Throwable th2;
        OutOfMemoryError e;
        if (num == null) {
            num2 = 85;
        } else {
            num2 = num;
        }
        if (rotationOptions == null) {
            rotationOptions2 = RotationOptions.m31189a();
            c2128g = this;
        } else {
            c2128g = this;
            rotationOptions2 = rotationOptions;
        }
        int m34146f = c2128g.m34146f(c13065e, rotationOptions2, resizeOptions);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = m34146f;
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(c13065e.m3354D(), null, options);
            if (decodeStream == null) {
                C13677a.m1854j("SimpleImageTranscoder", "Couldn't decode the EncodedImage InputStream ! ");
                return new C2123b(2);
            }
            Matrix m34156g = C2126e.m34156g(c13065e, rotationOptions2);
            if (m34156g != null) {
                try {
                    bitmap = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), m34156g, false);
                } catch (OutOfMemoryError e2) {
                    e = e2;
                    bitmap = decodeStream;
                    C13677a.m1853k("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                    C2123b c2123b = new C2123b(2);
                    bitmap.recycle();
                    decodeStream.recycle();
                    return c2123b;
                } catch (Throwable th3) {
                    th2 = th3;
                    bitmap = decodeStream;
                    bitmap.recycle();
                    decodeStream.recycle();
                    throw th2;
                }
            } else {
                bitmap = decodeStream;
            }
            try {
                try {
                    bitmap.compress(m34147e(c8793c), num2.intValue(), outputStream);
                    int i = 1;
                    if (m34146f > 1) {
                        i = 0;
                    }
                    C2123b c2123b2 = new C2123b(i);
                    bitmap.recycle();
                    decodeStream.recycle();
                    return c2123b2;
                } catch (Throwable th4) {
                    th2 = th4;
                    bitmap.recycle();
                    decodeStream.recycle();
                    throw th2;
                }
            } catch (OutOfMemoryError e3) {
                e = e3;
                C13677a.m1853k("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                C2123b c2123b3 = new C2123b(2);
                bitmap.recycle();
                decodeStream.recycle();
                return c2123b3;
            }
        } catch (OutOfMemoryError e4) {
            C13677a.m1853k("SimpleImageTranscoder", "Out-Of-Memory during transcode", e4);
            return new C2123b(2);
        }
    }
}
