package bb;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.util.C1134c;
import bb.C2239k;
import bb.C2243l;
import bb.C2247m;
import java.util.BitSet;
import p012ab.C0137a;
import p155ia.C7480b;
import pa.C11487a;
import sa.C12443a;

/* renamed from: bb.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C2232g extends Drawable implements InterfaceC2255n {

    /* renamed from: G */
    private static final String f6230G = "g";

    /* renamed from: H */
    private static final Paint f6231H;

    /* renamed from: A */
    private final C2243l f6232A;

    /* renamed from: B */
    private PorterDuffColorFilter f6233B;

    /* renamed from: C */
    private PorterDuffColorFilter f6234C;

    /* renamed from: D */
    private int f6235D;

    /* renamed from: E */
    private final RectF f6236E;

    /* renamed from: F */
    private boolean f6237F;

    /* renamed from: j */
    private C2235c f6238j;

    /* renamed from: k */
    private final C2247m.AbstractC2254g[] f6239k;

    /* renamed from: l */
    private final C2247m.AbstractC2254g[] f6240l;

    /* renamed from: m */
    private final BitSet f6241m;

    /* renamed from: n */
    private boolean f6242n;

    /* renamed from: o */
    private final Matrix f6243o;

    /* renamed from: p */
    private final Path f6244p;

    /* renamed from: q */
    private final Path f6245q;

    /* renamed from: r */
    private final RectF f6246r;

    /* renamed from: s */
    private final RectF f6247s;

    /* renamed from: t */
    private final Region f6248t;

    /* renamed from: u */
    private final Region f6249u;

    /* renamed from: v */
    private C2239k f6250v;

    /* renamed from: w */
    private final Paint f6251w;

    /* renamed from: x */
    private final Paint f6252x;

    /* renamed from: y */
    private final C0137a f6253y;

    /* renamed from: z */
    private final C2243l.InterfaceC2245b f6254z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bb.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C2233a implements C2243l.InterfaceC2245b {
        C2233a() {
            C2232g.this = r1;
        }

        @Override // bb.C2243l.InterfaceC2245b
        /* renamed from: a */
        public void mo33802a(C2247m c2247m, Matrix matrix, int i) {
            C2232g.this.f6241m.set(i + 4, c2247m.m33796e());
            C2232g.this.f6240l[i] = c2247m.m33795f(matrix);
        }

        @Override // bb.C2243l.InterfaceC2245b
        /* renamed from: b */
        public void mo33801b(C2247m c2247m, Matrix matrix, int i) {
            C2232g.this.f6241m.set(i, c2247m.m33796e());
            C2232g.this.f6239k[i] = c2247m.m33795f(matrix);
        }
    }

    /* renamed from: bb.g$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C2234b implements C2239k.InterfaceC2242c {

        /* renamed from: a */
        final /* synthetic */ float f6256a;

        C2234b(float f) {
            C2232g.this = r1;
            this.f6256a = f;
        }

        @Override // bb.C2239k.InterfaceC2242c
        /* renamed from: a */
        public InterfaceC2228c mo33817a(InterfaceC2228c interfaceC2228c) {
            if (!(interfaceC2228c instanceof C2237i)) {
                return new C2227b(this.f6256a, interfaceC2228c);
            }
            return interfaceC2228c;
        }
    }

    static {
        Paint paint = new Paint(1);
        f6231H = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* synthetic */ C2232g(C2235c c2235c, C2233a c2233a) {
        this(c2235c);
    }

    /* renamed from: F */
    private float m33938F() {
        if (m33930N()) {
            return this.f6252x.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: L */
    private boolean m33932L() {
        C2235c c2235c = this.f6238j;
        int i = c2235c.f6274q;
        if (i != 1 && c2235c.f6275r > 0 && (i == 2 || m33922V())) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    private boolean m33931M() {
        Paint.Style style = this.f6238j.f6279v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    /* renamed from: N */
    private boolean m33930N() {
        Paint.Style style = this.f6238j.f6279v;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f6252x.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    private void m33928P() {
        super.invalidateSelf();
    }

    /* renamed from: S */
    private void m33925S(Canvas canvas) {
        if (!m33932L()) {
            return;
        }
        canvas.save();
        m33923U(canvas);
        if (!this.f6237F) {
            m33894n(canvas);
            canvas.restore();
            return;
        }
        int width = (int) (this.f6236E.width() - getBounds().width());
        int height = (int) (this.f6236E.height() - getBounds().height());
        if (width >= 0 && height >= 0) {
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.f6236E.width()) + (this.f6238j.f6275r * 2) + width, ((int) this.f6236E.height()) + (this.f6238j.f6275r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f = (getBounds().left - this.f6238j.f6275r) - width;
            float f2 = (getBounds().top - this.f6238j.f6275r) - height;
            canvas2.translate(-f, -f2);
            m33894n(canvas2);
            canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
            return;
        }
        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
    }

    /* renamed from: T */
    private static int m33924T(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    /* renamed from: U */
    private void m33923U(Canvas canvas) {
        canvas.translate(m33942B(), m33941C());
    }

    /* renamed from: f */
    private PorterDuffColorFilter m33908f(Paint paint, boolean z) {
        if (z) {
            int color = paint.getColor();
            int m33896l = m33896l(color);
            this.f6235D = m33896l;
            if (m33896l != color) {
                return new PorterDuffColorFilter(m33896l, PorterDuff.Mode.SRC_IN);
            }
            return null;
        }
        return null;
    }

    /* renamed from: g */
    private void m33906g(RectF rectF, Path path) {
        m33904h(rectF, path);
        if (this.f6238j.f6267j != 1.0f) {
            this.f6243o.reset();
            Matrix matrix = this.f6243o;
            float f = this.f6238j.f6267j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f6243o);
        }
        path.computeBounds(this.f6236E, true);
    }

    /* renamed from: i */
    private void m33902i() {
        C2239k m33850y = m33939E().m33850y(new C2234b(-m33938F()));
        this.f6250v = m33850y;
        this.f6232A.m33813d(m33850y, this.f6238j.f6268k, m33887v(), this.f6245q);
    }

    /* renamed from: i0 */
    private boolean m33901i0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f6238j.f6261d != null && color2 != (colorForState2 = this.f6238j.f6261d.getColorForState(iArr, (color2 = this.f6251w.getColor())))) {
            this.f6251w.setColor(colorForState2);
            z = true;
        } else {
            z = false;
        }
        if (this.f6238j.f6262e != null && color != (colorForState = this.f6238j.f6262e.getColorForState(iArr, (color = this.f6252x.getColor())))) {
            this.f6252x.setColor(colorForState);
            return true;
        }
        return z;
    }

    /* renamed from: j */
    private PorterDuffColorFilter m33900j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = m33896l(colorForState);
        }
        this.f6235D = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* renamed from: j0 */
    private boolean m33899j0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f6233B;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f6234C;
        C2235c c2235c = this.f6238j;
        this.f6233B = m33898k(c2235c.f6264g, c2235c.f6265h, this.f6251w, true);
        C2235c c2235c2 = this.f6238j;
        this.f6234C = m33898k(c2235c2.f6263f, c2235c2.f6265h, this.f6252x, false);
        C2235c c2235c3 = this.f6238j;
        if (c2235c3.f6278u) {
            this.f6253y.m41112d(c2235c3.f6264g.getColorForState(getState(), 0));
        }
        if (!C1134c.m37835a(porterDuffColorFilter, this.f6233B) || !C1134c.m37835a(porterDuffColorFilter2, this.f6234C)) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private PorterDuffColorFilter m33898k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList != null && mode != null) {
            return m33900j(colorStateList, mode, z);
        }
        return m33908f(paint, z);
    }

    /* renamed from: k0 */
    private void m33897k0() {
        float m33933K = m33933K();
        this.f6238j.f6275r = (int) Math.ceil(0.75f * m33933K);
        this.f6238j.f6276s = (int) Math.ceil(m33933K * 0.25f);
        m33899j0();
        m33928P();
    }

    /* renamed from: m */
    public static C2232g m33895m(Context context, float f) {
        int m8017c = C11487a.m8017c(context, C7480b.f20110m, C2232g.class.getSimpleName());
        C2232g c2232g = new C2232g();
        c2232g.m33929O(context);
        c2232g.m33919Y(ColorStateList.valueOf(m8017c));
        c2232g.m33920X(f);
        return c2232g;
    }

    /* renamed from: n */
    private void m33894n(Canvas canvas) {
        if (this.f6241m.cardinality() > 0) {
            Log.w(f6230G, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f6238j.f6276s != 0) {
            canvas.drawPath(this.f6244p, this.f6253y.m41113c());
        }
        for (int i = 0; i < 4; i++) {
            this.f6239k[i].m33753a(this.f6253y, this.f6238j.f6275r, canvas);
            this.f6240l[i].m33753a(this.f6253y, this.f6238j.f6275r, canvas);
        }
        if (this.f6237F) {
            int m33942B = m33942B();
            int m33941C = m33941C();
            canvas.translate(-m33942B, -m33941C);
            canvas.drawPath(this.f6244p, f6231H);
            canvas.translate(m33942B, m33941C);
        }
    }

    /* renamed from: o */
    private void m33893o(Canvas canvas) {
        m33891q(canvas, this.f6251w, this.f6244p, this.f6238j.f6258a, m33888u());
    }

    /* renamed from: q */
    private void m33891q(Canvas canvas, Paint paint, Path path, C2239k c2239k, RectF rectF) {
        if (c2239k.m33854u(rectF)) {
            float mo33876a = c2239k.m33855t().mo33876a(rectF) * this.f6238j.f6268k;
            canvas.drawRoundRect(rectF, mo33876a, mo33876a, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: v */
    private RectF m33887v() {
        this.f6247s.set(m33888u());
        float m33938F = m33938F();
        this.f6247s.inset(m33938F, m33938F);
        return this.f6247s;
    }

    /* renamed from: A */
    public int m33943A() {
        return this.f6235D;
    }

    /* renamed from: B */
    public int m33942B() {
        C2235c c2235c = this.f6238j;
        return (int) (c2235c.f6276s * Math.sin(Math.toRadians(c2235c.f6277t)));
    }

    /* renamed from: C */
    public int m33941C() {
        C2235c c2235c = this.f6238j;
        return (int) (c2235c.f6276s * Math.cos(Math.toRadians(c2235c.f6277t)));
    }

    /* renamed from: D */
    public int m33940D() {
        return this.f6238j.f6275r;
    }

    /* renamed from: E */
    public C2239k m33939E() {
        return this.f6238j.f6258a;
    }

    /* renamed from: G */
    public ColorStateList m33937G() {
        return this.f6238j.f6264g;
    }

    /* renamed from: H */
    public float m33936H() {
        return this.f6238j.f6258a.m33857r().mo33876a(m33888u());
    }

    /* renamed from: I */
    public float m33935I() {
        return this.f6238j.f6258a.m33855t().mo33876a(m33888u());
    }

    /* renamed from: J */
    public float m33934J() {
        return this.f6238j.f6273p;
    }

    /* renamed from: K */
    public float m33933K() {
        return m33886w() + m33934J();
    }

    /* renamed from: O */
    public void m33929O(Context context) {
        this.f6238j.f6259b = new C12443a(context);
        m33897k0();
    }

    /* renamed from: Q */
    public boolean m33927Q() {
        C12443a c12443a = this.f6238j.f6259b;
        if (c12443a != null && c12443a.m5275d()) {
            return true;
        }
        return false;
    }

    /* renamed from: R */
    public boolean m33926R() {
        return this.f6238j.f6258a.m33854u(m33888u());
    }

    /* renamed from: V */
    public boolean m33922V() {
        int i = Build.VERSION.SDK_INT;
        if (!m33926R() && !this.f6244p.isConvex() && i < 29) {
            return true;
        }
        return false;
    }

    /* renamed from: W */
    public void m33921W(InterfaceC2228c interfaceC2228c) {
        setShapeAppearanceModel(this.f6238j.f6258a.m33851x(interfaceC2228c));
    }

    /* renamed from: X */
    public void m33920X(float f) {
        C2235c c2235c = this.f6238j;
        if (c2235c.f6272o != f) {
            c2235c.f6272o = f;
            m33897k0();
        }
    }

    /* renamed from: Y */
    public void m33919Y(ColorStateList colorStateList) {
        C2235c c2235c = this.f6238j;
        if (c2235c.f6261d != colorStateList) {
            c2235c.f6261d = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: Z */
    public void m33918Z(float f) {
        C2235c c2235c = this.f6238j;
        if (c2235c.f6268k != f) {
            c2235c.f6268k = f;
            this.f6242n = true;
            invalidateSelf();
        }
    }

    /* renamed from: a0 */
    public void m33917a0(int i, int i2, int i3, int i4) {
        C2235c c2235c = this.f6238j;
        if (c2235c.f6266i == null) {
            c2235c.f6266i = new Rect();
        }
        this.f6238j.f6266i.set(i, i2, i3, i4);
        invalidateSelf();
    }

    /* renamed from: b0 */
    public void m33915b0(float f) {
        C2235c c2235c = this.f6238j;
        if (c2235c.f6271n != f) {
            c2235c.f6271n = f;
            m33897k0();
        }
    }

    /* renamed from: c0 */
    public void m33913c0(boolean z) {
        this.f6237F = z;
    }

    /* renamed from: d0 */
    public void m33911d0(int i) {
        this.f6253y.m41112d(i);
        this.f6238j.f6278u = false;
        m33928P();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f6251w.setColorFilter(this.f6233B);
        int alpha = this.f6251w.getAlpha();
        this.f6251w.setAlpha(m33924T(alpha, this.f6238j.f6270m));
        this.f6252x.setColorFilter(this.f6234C);
        this.f6252x.setStrokeWidth(this.f6238j.f6269l);
        int alpha2 = this.f6252x.getAlpha();
        this.f6252x.setAlpha(m33924T(alpha2, this.f6238j.f6270m));
        if (this.f6242n) {
            m33902i();
            m33906g(m33888u(), this.f6244p);
            this.f6242n = false;
        }
        m33925S(canvas);
        if (m33931M()) {
            m33893o(canvas);
        }
        if (m33930N()) {
            mo26663r(canvas);
        }
        this.f6251w.setAlpha(alpha);
        this.f6252x.setAlpha(alpha2);
    }

    /* renamed from: e0 */
    public void m33909e0(float f, int i) {
        m33903h0(f);
        m33905g0(ColorStateList.valueOf(i));
    }

    /* renamed from: f0 */
    public void m33907f0(float f, ColorStateList colorStateList) {
        m33903h0(f);
        m33905g0(colorStateList);
    }

    /* renamed from: g0 */
    public void m33905g0(ColorStateList colorStateList) {
        C2235c c2235c = this.f6238j;
        if (c2235c.f6262e != colorStateList) {
            c2235c.f6262e = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f6238j.f6270m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f6238j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f6238j.f6274q == 2) {
            return;
        }
        if (m33926R()) {
            outline.setRoundRect(getBounds(), m33936H() * this.f6238j.f6268k);
            return;
        }
        m33906g(m33888u(), this.f6244p);
        if (this.f6244p.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.f6244p);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f6238j.f6266i;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f6248t.set(getBounds());
        m33906g(m33888u(), this.f6244p);
        this.f6249u.setPath(this.f6244p, this.f6248t);
        this.f6248t.op(this.f6249u, Region.Op.DIFFERENCE);
        return this.f6248t;
    }

    /* renamed from: h */
    public final void m33904h(RectF rectF, Path path) {
        C2243l c2243l = this.f6232A;
        C2235c c2235c = this.f6238j;
        c2243l.m33812e(c2235c.f6258a, c2235c.f6268k, rectF, this.f6254z, path);
    }

    /* renamed from: h0 */
    public void m33903h0(float f) {
        this.f6238j.f6269l = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f6242n = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        if (!super.isStateful() && (((colorStateList = this.f6238j.f6264g) == null || !colorStateList.isStateful()) && (((colorStateList2 = this.f6238j.f6263f) == null || !colorStateList2.isStateful()) && (((colorStateList3 = this.f6238j.f6262e) == null || !colorStateList3.isStateful()) && ((colorStateList4 = this.f6238j.f6261d) == null || !colorStateList4.isStateful()))))) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public int m33896l(int i) {
        float m33933K = m33933K() + m33883z();
        C12443a c12443a = this.f6238j.f6259b;
        if (c12443a != null) {
            return c12443a.m5276c(i, m33933K);
        }
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f6238j = new C2235c(this.f6238j);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f6242n = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z;
        boolean m33901i0 = m33901i0(iArr);
        boolean m33899j0 = m33899j0();
        if (!m33901i0 && !m33899j0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* renamed from: p */
    public void m33892p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        m33891q(canvas, paint, path, this.f6238j.f6258a, rectF);
    }

    /* renamed from: r */
    public void mo26663r(Canvas canvas) {
        m33891q(canvas, this.f6252x, this.f6245q, this.f6250v, m33887v());
    }

    /* renamed from: s */
    public float m33890s() {
        return this.f6238j.f6258a.m33865j().mo33876a(m33888u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C2235c c2235c = this.f6238j;
        if (c2235c.f6270m != i) {
            c2235c.f6270m = i;
            m33928P();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f6238j.f6260c = colorFilter;
        m33928P();
    }

    @Override // bb.InterfaceC2255n
    public void setShapeAppearanceModel(C2239k c2239k) {
        this.f6238j.f6258a = c2239k;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f6238j.f6264g = colorStateList;
        m33899j0();
        m33928P();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C2235c c2235c = this.f6238j;
        if (c2235c.f6265h != mode) {
            c2235c.f6265h = mode;
            m33899j0();
            m33928P();
        }
    }

    /* renamed from: t */
    public float m33889t() {
        return this.f6238j.f6258a.m33863l().mo33876a(m33888u());
    }

    /* renamed from: u */
    public RectF m33888u() {
        this.f6246r.set(getBounds());
        return this.f6246r;
    }

    /* renamed from: w */
    public float m33886w() {
        return this.f6238j.f6272o;
    }

    /* renamed from: x */
    public ColorStateList m33885x() {
        return this.f6238j.f6261d;
    }

    /* renamed from: y */
    public float m33884y() {
        return this.f6238j.f6268k;
    }

    /* renamed from: z */
    public float m33883z() {
        return this.f6238j.f6271n;
    }

    public C2232g() {
        this(new C2239k());
    }

    public C2232g(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C2239k.m33870e(context, attributeSet, i, i2).m33831m());
    }

    public C2232g(C2239k c2239k) {
        this(new C2235c(c2239k, null));
    }

    private C2232g(C2235c c2235c) {
        C2243l c2243l;
        this.f6239k = new C2247m.AbstractC2254g[4];
        this.f6240l = new C2247m.AbstractC2254g[4];
        this.f6241m = new BitSet(8);
        this.f6243o = new Matrix();
        this.f6244p = new Path();
        this.f6245q = new Path();
        this.f6246r = new RectF();
        this.f6247s = new RectF();
        this.f6248t = new Region();
        this.f6249u = new Region();
        Paint paint = new Paint(1);
        this.f6251w = paint;
        Paint paint2 = new Paint(1);
        this.f6252x = paint2;
        this.f6253y = new C0137a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c2243l = C2243l.m33806k();
        } else {
            c2243l = new C2243l();
        }
        this.f6232A = c2243l;
        this.f6236E = new RectF();
        this.f6237F = true;
        this.f6238j = c2235c;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m33899j0();
        m33901i0(getState());
        this.f6254z = new C2233a();
    }

    /* renamed from: bb.g$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C2235c extends Drawable.ConstantState {

        /* renamed from: a */
        public C2239k f6258a;

        /* renamed from: b */
        public C12443a f6259b;

        /* renamed from: c */
        public ColorFilter f6260c;

        /* renamed from: d */
        public ColorStateList f6261d;

        /* renamed from: e */
        public ColorStateList f6262e;

        /* renamed from: f */
        public ColorStateList f6263f;

        /* renamed from: g */
        public ColorStateList f6264g;

        /* renamed from: h */
        public PorterDuff.Mode f6265h;

        /* renamed from: i */
        public Rect f6266i;

        /* renamed from: j */
        public float f6267j;

        /* renamed from: k */
        public float f6268k;

        /* renamed from: l */
        public float f6269l;

        /* renamed from: m */
        public int f6270m;

        /* renamed from: n */
        public float f6271n;

        /* renamed from: o */
        public float f6272o;

        /* renamed from: p */
        public float f6273p;

        /* renamed from: q */
        public int f6274q;

        /* renamed from: r */
        public int f6275r;

        /* renamed from: s */
        public int f6276s;

        /* renamed from: t */
        public int f6277t;

        /* renamed from: u */
        public boolean f6278u;

        /* renamed from: v */
        public Paint.Style f6279v;

        public C2235c(C2239k c2239k, C12443a c12443a) {
            this.f6261d = null;
            this.f6262e = null;
            this.f6263f = null;
            this.f6264g = null;
            this.f6265h = PorterDuff.Mode.SRC_IN;
            this.f6266i = null;
            this.f6267j = 1.0f;
            this.f6268k = 1.0f;
            this.f6270m = 255;
            this.f6271n = 0.0f;
            this.f6272o = 0.0f;
            this.f6273p = 0.0f;
            this.f6274q = 0;
            this.f6275r = 0;
            this.f6276s = 0;
            this.f6277t = 0;
            this.f6278u = false;
            this.f6279v = Paint.Style.FILL_AND_STROKE;
            this.f6258a = c2239k;
            this.f6259b = c12443a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C2232g c2232g = new C2232g(this, null);
            c2232g.f6242n = true;
            return c2232g;
        }

        public C2235c(C2235c c2235c) {
            this.f6261d = null;
            this.f6262e = null;
            this.f6263f = null;
            this.f6264g = null;
            this.f6265h = PorterDuff.Mode.SRC_IN;
            this.f6266i = null;
            this.f6267j = 1.0f;
            this.f6268k = 1.0f;
            this.f6270m = 255;
            this.f6271n = 0.0f;
            this.f6272o = 0.0f;
            this.f6273p = 0.0f;
            this.f6274q = 0;
            this.f6275r = 0;
            this.f6276s = 0;
            this.f6277t = 0;
            this.f6278u = false;
            this.f6279v = Paint.Style.FILL_AND_STROKE;
            this.f6258a = c2235c.f6258a;
            this.f6259b = c2235c.f6259b;
            this.f6269l = c2235c.f6269l;
            this.f6260c = c2235c.f6260c;
            this.f6261d = c2235c.f6261d;
            this.f6262e = c2235c.f6262e;
            this.f6265h = c2235c.f6265h;
            this.f6264g = c2235c.f6264g;
            this.f6270m = c2235c.f6270m;
            this.f6267j = c2235c.f6267j;
            this.f6276s = c2235c.f6276s;
            this.f6274q = c2235c.f6274q;
            this.f6278u = c2235c.f6278u;
            this.f6268k = c2235c.f6268k;
            this.f6271n = c2235c.f6271n;
            this.f6272o = c2235c.f6272o;
            this.f6273p = c2235c.f6273p;
            this.f6275r = c2235c.f6275r;
            this.f6277t = c2235c.f6277t;
            this.f6263f = c2235c.f6263f;
            this.f6279v = c2235c.f6279v;
            if (c2235c.f6266i != null) {
                this.f6266i = new Rect(c2235c.f6266i);
            }
        }
    }
}