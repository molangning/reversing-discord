package bb;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: bb.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C2243l {

    /* renamed from: a */
    private final C2247m[] f6307a = new C2247m[4];

    /* renamed from: b */
    private final Matrix[] f6308b = new Matrix[4];

    /* renamed from: c */
    private final Matrix[] f6309c = new Matrix[4];

    /* renamed from: d */
    private final PointF f6310d = new PointF();

    /* renamed from: e */
    private final Path f6311e = new Path();

    /* renamed from: f */
    private final Path f6312f = new Path();

    /* renamed from: g */
    private final C2247m f6313g = new C2247m();

    /* renamed from: h */
    private final float[] f6314h = new float[2];

    /* renamed from: i */
    private final float[] f6315i = new float[2];

    /* renamed from: j */
    private final Path f6316j = new Path();

    /* renamed from: k */
    private final Path f6317k = new Path();

    /* renamed from: l */
    private boolean f6318l = true;

    /* renamed from: bb.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class C2244a {

        /* renamed from: a */
        static final C2243l f6319a = new C2243l();
    }

    /* renamed from: bb.l$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC2245b {
        /* renamed from: a */
        void mo33802a(C2247m c2247m, Matrix matrix, int i);

        /* renamed from: b */
        void mo33801b(C2247m c2247m, Matrix matrix, int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bb.l$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C2246c {

        /* renamed from: a */
        public final C2239k f6320a;

        /* renamed from: b */
        public final Path f6321b;

        /* renamed from: c */
        public final RectF f6322c;

        /* renamed from: d */
        public final InterfaceC2245b f6323d;

        /* renamed from: e */
        public final float f6324e;

        C2246c(C2239k c2239k, float f, RectF rectF, InterfaceC2245b interfaceC2245b, Path path) {
            this.f6323d = interfaceC2245b;
            this.f6320a = c2239k;
            this.f6324e = f;
            this.f6322c = rectF;
            this.f6321b = path;
        }
    }

    public C2243l() {
        for (int i = 0; i < 4; i++) {
            this.f6307a[i] = new C2247m();
            this.f6308b[i] = new Matrix();
            this.f6309c[i] = new Matrix();
        }
    }

    /* renamed from: a */
    private float m33816a(int i) {
        return (i + 1) * 90;
    }

    /* renamed from: b */
    private void m33815b(C2246c c2246c, int i) {
        this.f6314h[0] = this.f6307a[i].m33790k();
        this.f6314h[1] = this.f6307a[i].m33789l();
        this.f6308b[i].mapPoints(this.f6314h);
        if (i == 0) {
            Path path = c2246c.f6321b;
            float[] fArr = this.f6314h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = c2246c.f6321b;
            float[] fArr2 = this.f6314h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f6307a[i].m33797d(this.f6308b[i], c2246c.f6321b);
        InterfaceC2245b interfaceC2245b = c2246c.f6323d;
        if (interfaceC2245b != null) {
            interfaceC2245b.mo33801b(this.f6307a[i], this.f6308b[i], i);
        }
    }

    /* renamed from: c */
    private void m33814c(C2246c c2246c, int i) {
        int i2 = (i + 1) % 4;
        this.f6314h[0] = this.f6307a[i].m33792i();
        this.f6314h[1] = this.f6307a[i].m33791j();
        this.f6308b[i].mapPoints(this.f6314h);
        this.f6315i[0] = this.f6307a[i2].m33790k();
        this.f6315i[1] = this.f6307a[i2].m33789l();
        this.f6308b[i2].mapPoints(this.f6315i);
        float[] fArr = this.f6314h;
        float f = fArr[0];
        float[] fArr2 = this.f6315i;
        float max = Math.max(((float) Math.hypot(f - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float m33808i = m33808i(c2246c.f6322c, i);
        this.f6313g.m33787n(0.0f, 0.0f);
        C2231f m33807j = m33807j(i, c2246c.f6320a);
        m33807j.mo27773c(max, m33808i, c2246c.f6324e, this.f6313g);
        this.f6316j.reset();
        this.f6313g.m33797d(this.f6309c[i], this.f6316j);
        if (this.f6318l && (m33807j.m33944b() || m33805l(this.f6316j, i) || m33805l(this.f6316j, i2))) {
            Path path = this.f6316j;
            path.op(path, this.f6312f, Path.Op.DIFFERENCE);
            this.f6314h[0] = this.f6313g.m33790k();
            this.f6314h[1] = this.f6313g.m33789l();
            this.f6309c[i].mapPoints(this.f6314h);
            Path path2 = this.f6311e;
            float[] fArr3 = this.f6314h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f6313g.m33797d(this.f6309c[i], this.f6311e);
        } else {
            this.f6313g.m33797d(this.f6309c[i], c2246c.f6321b);
        }
        InterfaceC2245b interfaceC2245b = c2246c.f6323d;
        if (interfaceC2245b != null) {
            interfaceC2245b.mo33802a(this.f6313g, this.f6309c[i], i);
        }
    }

    /* renamed from: f */
    private void m33811f(int i, RectF rectF, PointF pointF) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    pointF.set(rectF.right, rectF.top);
                    return;
                } else {
                    pointF.set(rectF.left, rectF.top);
                    return;
                }
            }
            pointF.set(rectF.left, rectF.bottom);
            return;
        }
        pointF.set(rectF.right, rectF.bottom);
    }

    /* renamed from: g */
    private InterfaceC2228c m33810g(int i, C2239k c2239k) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return c2239k.m33855t();
                }
                return c2239k.m33857r();
            }
            return c2239k.m33865j();
        }
        return c2239k.m33863l();
    }

    /* renamed from: h */
    private C2229d m33809h(int i, C2239k c2239k) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return c2239k.m33856s();
                }
                return c2239k.m33858q();
            }
            return c2239k.m33866i();
        }
        return c2239k.m33864k();
    }

    /* renamed from: i */
    private float m33808i(RectF rectF, int i) {
        float[] fArr = this.f6314h;
        C2247m c2247m = this.f6307a[i];
        fArr[0] = c2247m.f6327c;
        fArr[1] = c2247m.f6328d;
        this.f6308b[i].mapPoints(fArr);
        if (i != 1 && i != 3) {
            return Math.abs(rectF.centerY() - this.f6314h[1]);
        }
        return Math.abs(rectF.centerX() - this.f6314h[0]);
    }

    /* renamed from: j */
    private C2231f m33807j(int i, C2239k c2239k) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return c2239k.m33860o();
                }
                return c2239k.m33859p();
            }
            return c2239k.m33861n();
        }
        return c2239k.m33867h();
    }

    /* renamed from: k */
    public static C2243l m33806k() {
        return C2244a.f6319a;
    }

    /* renamed from: l */
    private boolean m33805l(Path path, int i) {
        this.f6317k.reset();
        this.f6307a[i].m33797d(this.f6308b[i], this.f6317k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f6317k.computeBounds(rectF, true);
        path.op(this.f6317k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() > 1.0f && rectF.height() > 1.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private void m33804m(C2246c c2246c, int i) {
        m33809h(i, c2246c.f6320a).m33945b(this.f6307a[i], 90.0f, c2246c.f6324e, c2246c.f6322c, m33810g(i, c2246c.f6320a));
        float m33816a = m33816a(i);
        this.f6308b[i].reset();
        m33811f(i, c2246c.f6322c, this.f6310d);
        Matrix matrix = this.f6308b[i];
        PointF pointF = this.f6310d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f6308b[i].preRotate(m33816a);
    }

    /* renamed from: n */
    private void m33803n(int i) {
        this.f6314h[0] = this.f6307a[i].m33792i();
        this.f6314h[1] = this.f6307a[i].m33791j();
        this.f6308b[i].mapPoints(this.f6314h);
        float m33816a = m33816a(i);
        this.f6309c[i].reset();
        Matrix matrix = this.f6309c[i];
        float[] fArr = this.f6314h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f6309c[i].preRotate(m33816a);
    }

    /* renamed from: d */
    public void m33813d(C2239k c2239k, float f, RectF rectF, Path path) {
        m33812e(c2239k, f, rectF, null, path);
    }

    /* renamed from: e */
    public void m33812e(C2239k c2239k, float f, RectF rectF, InterfaceC2245b interfaceC2245b, Path path) {
        path.rewind();
        this.f6311e.rewind();
        this.f6312f.rewind();
        this.f6312f.addRect(rectF, Path.Direction.CW);
        C2246c c2246c = new C2246c(c2239k, f, rectF, interfaceC2245b, path);
        for (int i = 0; i < 4; i++) {
            m33804m(c2246c, i);
            m33803n(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            m33815b(c2246c, i2);
            m33814c(c2246c, i2);
        }
        path.close();
        this.f6311e.close();
        if (!this.f6311e.isEmpty()) {
            path.op(this.f6311e, Path.Op.UNION);
        }
    }
}
