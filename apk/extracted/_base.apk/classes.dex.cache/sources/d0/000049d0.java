package p291q1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;
import p073e1.C6043e;
import p111g1.C6541u;
import p125h1.C6871d;

/* renamed from: q1.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C11680l {

    /* renamed from: a */
    private static final ThreadLocal<PathMeasure> f30462a = new C11681a();

    /* renamed from: b */
    private static final ThreadLocal<Path> f30463b = new C11682b();

    /* renamed from: c */
    private static final ThreadLocal<Path> f30464c = new C11683c();

    /* renamed from: d */
    private static final ThreadLocal<float[]> f30465d = new C11684d();

    /* renamed from: e */
    private static final float f30466e = (float) (Math.sqrt(2.0d) / 2.0d);

    /* renamed from: q1.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C11681a extends ThreadLocal<PathMeasure> {
        C11681a() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    /* renamed from: q1.l$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C11682b extends ThreadLocal<Path> {
        C11682b() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Path initialValue() {
            return new Path();
        }
    }

    /* renamed from: q1.l$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C11683c extends ThreadLocal<Path> {
        C11683c() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Path initialValue() {
            return new Path();
        }
    }

    /* renamed from: q1.l$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C11684d extends ThreadLocal<float[]> {
        C11684d() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public float[] initialValue() {
            return new float[4];
        }
    }

    /* renamed from: a */
    public static void m7192a(Path path, float f, float f2, float f3) {
        C6043e.m23828b("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = f30462a.get();
        Path path2 = f30463b.get();
        Path path3 = f30464c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            C6043e.m23827c("applyTrimPathIfNeeded");
        } else if (length >= 1.0f && Math.abs((f2 - f) - 1.0f) >= 0.01d) {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float min = Math.min(f4, f5) + f6;
            float max = Math.max(f4, f5) + f6;
            if (min >= length && max >= length) {
                min = C11679k.m7198f(min, length);
                max = C11679k.m7198f(max, length);
            }
            if (min < 0.0f) {
                min = C11679k.m7198f(min, length);
            }
            if (max < 0.0f) {
                max = C11679k.m7198f(max, length);
            }
            int i = (min > max ? 1 : (min == max ? 0 : -1));
            if (i == 0) {
                path.reset();
                C6043e.m23827c("applyTrimPathIfNeeded");
                return;
            }
            if (i >= 0) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            C6043e.m23827c("applyTrimPathIfNeeded");
        } else {
            C6043e.m23827c("applyTrimPathIfNeeded");
        }
    }

    /* renamed from: b */
    public static void m7191b(Path path, C6541u c6541u) {
        if (c6541u != null && !c6541u.m22421l()) {
            m7192a(path, ((C6871d) c6541u.m22423j()).m21749p() / 100.0f, ((C6871d) c6541u.m22425f()).m21749p() / 100.0f, ((C6871d) c6541u.m22424i()).m21749p() / 360.0f);
        }
    }

    /* renamed from: c */
    public static void m7190c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    public static Path m7189d(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
            float f = pointF.x;
            float f2 = pointF2.x;
            float f3 = pointF2.y;
            path.cubicTo(pointF3.x + f, pointF.y + pointF3.y, f2 + pointF4.x, f3 + pointF4.y, f2, f3);
        } else {
            path.lineTo(pointF2.x, pointF2.y);
        }
        return path;
    }

    /* renamed from: e */
    public static float m7188e() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    /* renamed from: f */
    public static float m7187f(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    /* renamed from: g */
    public static float m7186g(Matrix matrix) {
        float[] fArr = f30465d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = f30466e;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    /* renamed from: h */
    public static boolean m7185h(Matrix matrix) {
        float[] fArr = f30465d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        if (fArr[0] != fArr[2] && fArr[1] != fArr[3]) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static int m7184i(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (527 * f) : 17;
        if (f2 != 0.0f) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        return f4 != 0.0f ? (int) (i * 31 * f4) : i;
    }

    /* renamed from: j */
    public static boolean m7183j(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < i4) {
            return false;
        }
        if (i > i4) {
            return true;
        }
        if (i2 < i5) {
            return false;
        }
        return i2 > i5 || i3 >= i6;
    }

    /* renamed from: k */
    public static boolean m7182k(Throwable th2) {
        return (th2 instanceof SocketException) || (th2 instanceof ClosedChannelException) || (th2 instanceof InterruptedIOException) || (th2 instanceof ProtocolException) || (th2 instanceof SSLException) || (th2 instanceof UnknownHostException) || (th2 instanceof UnknownServiceException);
    }

    /* renamed from: l */
    public static Bitmap m7181l(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    /* renamed from: m */
    public static void m7180m(Canvas canvas, RectF rectF, Paint paint) {
        m7179n(canvas, rectF, paint, 31);
    }

    /* renamed from: n */
    public static void m7179n(Canvas canvas, RectF rectF, Paint paint, int i) {
        C6043e.m23828b("Utils#saveLayer");
        canvas.saveLayer(rectF, paint);
        C6043e.m23827c("Utils#saveLayer");
    }
}