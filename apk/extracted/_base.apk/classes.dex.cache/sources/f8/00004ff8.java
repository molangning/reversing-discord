package ve;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import android.view.WindowManager;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import p370ue.AsyncTaskC12957a;
import se.InterfaceC12461b;

/* renamed from: ve.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13256a {
    /* renamed from: a */
    public static int m2916a(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            while (true) {
                if (i3 / i5 <= i2 && i4 / i5 <= i) {
                    break;
                }
                i5 *= 2;
            }
        }
        return i5;
    }

    /* renamed from: b */
    public static int m2915b(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(point);
        }
        int sqrt = (int) Math.sqrt(Math.pow(point.x, 2.0d) + Math.pow(point.y, 2.0d));
        Canvas canvas = new Canvas();
        int min = Math.min(canvas.getMaximumBitmapWidth(), canvas.getMaximumBitmapHeight());
        if (min > 0) {
            sqrt = Math.min(sqrt, min);
        }
        int m2905b = C13258c.m2905b();
        if (m2905b > 0) {
            sqrt = Math.min(sqrt, m2905b);
        }
        Log.d("BitmapLoadUtils", "maxBitmapSize: " + sqrt);
        return sqrt;
    }

    /* renamed from: c */
    public static void m2914c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: d */
    public static void m2913d(Context context, Uri uri, Uri uri2, int i, int i2, InterfaceC12461b interfaceC12461b) {
        new AsyncTaskC12957a(context, uri, uri2, i, i2, interfaceC12461b).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* renamed from: e */
    public static int m2912e(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: f */
    public static int m2911f(int i) {
        return (i == 2 || i == 7 || i == 4 || i == 5) ? -1 : 1;
    }

    /* renamed from: g */
    public static int m2910g(Context context, Uri uri) {
        int i = 0;
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                return 0;
            }
            i = new C13261f(openInputStream).m2899c();
            m2914c(openInputStream);
            return i;
        } catch (IOException e) {
            Log.e("BitmapLoadUtils", "getExifOrientation: " + uri.toString(), e);
            return i;
        }
    }

    /* renamed from: h */
    public static Bitmap m2909h(Bitmap bitmap, Matrix matrix) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            if (!bitmap.sameAs(createBitmap)) {
                return createBitmap;
            }
            return bitmap;
        } catch (OutOfMemoryError e) {
            Log.e("BitmapLoadUtils", "transformBitmap: ", e);
            return bitmap;
        }
    }
}