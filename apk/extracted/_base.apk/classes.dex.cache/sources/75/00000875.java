package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.collection.C0624a;
import androidx.core.content.res.C0970d;
import androidx.core.content.res.C0980h;
import androidx.core.content.res.C0992l;
import androidx.core.graphics.C1004d;
import androidx.core.graphics.drawable.C1013a;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.vectordrawable.graphics.drawable.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1915h extends AbstractC1914g {

    /* renamed from: t */
    static final PorterDuff.Mode f5250t = PorterDuff.Mode.SRC_IN;

    /* renamed from: k */
    private C1923h f5251k;

    /* renamed from: l */
    private PorterDuffColorFilter f5252l;

    /* renamed from: m */
    private ColorFilter f5253m;

    /* renamed from: n */
    private boolean f5254n;

    /* renamed from: o */
    private boolean f5255o;

    /* renamed from: p */
    private Drawable.ConstantState f5256p;

    /* renamed from: q */
    private final float[] f5257q;

    /* renamed from: r */
    private final Matrix f5258r;

    /* renamed from: s */
    private final Rect f5259s;

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1917b extends AbstractC1921f {
        C1917b() {
        }

        /* renamed from: f */
        private void m35042f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f5286b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f5285a = C1004d.m38159d(string2);
            }
            this.f5287c = C0992l.m38210g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.C1915h.AbstractC1921f
        /* renamed from: c */
        public boolean mo35032c() {
            return true;
        }

        /* renamed from: e */
        public void m35043e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (!C0992l.m38207j(xmlPullParser, "pathData")) {
                return;
            }
            TypedArray m38206k = C0992l.m38206k(resources, theme, attributeSet, C1904a.f5225d);
            m35042f(m38206k, xmlPullParser);
            m38206k.recycle();
        }

        C1917b(C1917b c1917b) {
            super(c1917b);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class AbstractC1920e {
        private AbstractC1920e() {
        }

        /* renamed from: a */
        public boolean mo35034a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo35033b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1923h extends Drawable.ConstantState {

        /* renamed from: a */
        int f5306a;

        /* renamed from: b */
        C1922g f5307b;

        /* renamed from: c */
        ColorStateList f5308c;

        /* renamed from: d */
        PorterDuff.Mode f5309d;

        /* renamed from: e */
        boolean f5310e;

        /* renamed from: f */
        Bitmap f5311f;

        /* renamed from: g */
        ColorStateList f5312g;

        /* renamed from: h */
        PorterDuff.Mode f5313h;

        /* renamed from: i */
        int f5314i;

        /* renamed from: j */
        boolean f5315j;

        /* renamed from: k */
        boolean f5316k;

        /* renamed from: l */
        Paint f5317l;

        public C1923h(C1923h c1923h) {
            this.f5308c = null;
            this.f5309d = C1915h.f5250t;
            if (c1923h != null) {
                this.f5306a = c1923h.f5306a;
                C1922g c1922g = new C1922g(c1923h.f5307b);
                this.f5307b = c1922g;
                if (c1923h.f5307b.f5294e != null) {
                    c1922g.f5294e = new Paint(c1923h.f5307b.f5294e);
                }
                if (c1923h.f5307b.f5293d != null) {
                    this.f5307b.f5293d = new Paint(c1923h.f5307b.f5293d);
                }
                this.f5308c = c1923h.f5308c;
                this.f5309d = c1923h.f5309d;
                this.f5310e = c1923h.f5310e;
            }
        }

        /* renamed from: a */
        public boolean m35023a(int i, int i2) {
            if (i == this.f5311f.getWidth() && i2 == this.f5311f.getHeight()) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public boolean m35022b() {
            if (!this.f5316k && this.f5312g == this.f5308c && this.f5313h == this.f5309d && this.f5315j == this.f5310e && this.f5314i == this.f5307b.getRootAlpha()) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public void m35021c(int i, int i2) {
            if (this.f5311f == null || !m35023a(i, i2)) {
                this.f5311f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f5316k = true;
            }
        }

        /* renamed from: d */
        public void m35020d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f5311f, (Rect) null, rect, m35019e(colorFilter));
        }

        /* renamed from: e */
        public Paint m35019e(ColorFilter colorFilter) {
            if (!m35018f() && colorFilter == null) {
                return null;
            }
            if (this.f5317l == null) {
                Paint paint = new Paint();
                this.f5317l = paint;
                paint.setFilterBitmap(true);
            }
            this.f5317l.setAlpha(this.f5307b.getRootAlpha());
            this.f5317l.setColorFilter(colorFilter);
            return this.f5317l;
        }

        /* renamed from: f */
        public boolean m35018f() {
            return this.f5307b.getRootAlpha() < 255;
        }

        /* renamed from: g */
        public boolean m35017g() {
            return this.f5307b.m35025f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f5306a;
        }

        /* renamed from: h */
        public boolean m35016h(int[] iArr) {
            boolean m35024g = this.f5307b.m35024g(iArr);
            this.f5316k |= m35024g;
            return m35024g;
        }

        /* renamed from: i */
        public void m35015i() {
            this.f5312g = this.f5308c;
            this.f5313h = this.f5309d;
            this.f5314i = this.f5307b.getRootAlpha();
            this.f5315j = this.f5310e;
            this.f5316k = false;
        }

        /* renamed from: j */
        public void m35014j(int i, int i2) {
            this.f5311f.eraseColor(0);
            this.f5307b.m35029b(new Canvas(this.f5311f), i, i2, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C1915h(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C1915h(this);
        }

        public C1923h() {
            this.f5308c = null;
            this.f5309d = C1915h.f5250t;
            this.f5307b = new C1922g();
        }
    }

    C1915h() {
        this.f5255o = true;
        this.f5257q = new float[9];
        this.f5258r = new Matrix();
        this.f5259s = new Rect();
        this.f5251k = new C1923h();
    }

    /* renamed from: a */
    static int m35053a(int i, float f) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f)) << 24);
    }

    /* renamed from: b */
    public static C1915h m35052b(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C1915h c1915h = new C1915h();
            c1915h.f5249j = C0980h.m38241f(resources, i, theme);
            c1915h.f5256p = new C1924i(c1915h.f5249j.getConstantState());
            return c1915h;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    break;
                }
            }
            if (next == 2) {
                return m35051c(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        } catch (XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    /* renamed from: c */
    public static C1915h m35051c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C1915h c1915h = new C1915h();
        c1915h.inflate(resources, xmlPullParser, attributeSet, theme);
        return c1915h;
    }

    /* renamed from: e */
    private void m35049e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C1923h c1923h = this.f5251k;
        C1922g c1922g = c1923h.f5307b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c1922g.f5297h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C1919d c1919d = (C1919d) arrayDeque.peek();
                if ("path".equals(name)) {
                    C1918c c1918c = new C1918c();
                    c1918c.m35039g(resources, attributeSet, theme, xmlPullParser);
                    c1919d.f5273b.add(c1918c);
                    if (c1918c.getPathName() != null) {
                        c1922g.f5305p.put(c1918c.getPathName(), c1918c);
                    }
                    c1923h.f5306a = c1918c.f5288d | c1923h.f5306a;
                    z = false;
                } else if ("clip-path".equals(name)) {
                    C1917b c1917b = new C1917b();
                    c1917b.m35043e(resources, attributeSet, theme, xmlPullParser);
                    c1919d.f5273b.add(c1917b);
                    if (c1917b.getPathName() != null) {
                        c1922g.f5305p.put(c1917b.getPathName(), c1917b);
                    }
                    c1923h.f5306a = c1917b.f5288d | c1923h.f5306a;
                } else if ("group".equals(name)) {
                    C1919d c1919d2 = new C1919d();
                    c1919d2.m35037c(resources, attributeSet, theme, xmlPullParser);
                    c1919d.f5273b.add(c1919d2);
                    arrayDeque.push(c1919d2);
                    if (c1919d2.getGroupName() != null) {
                        c1922g.f5305p.put(c1919d2.getGroupName(), c1919d2);
                    }
                    c1923h.f5306a = c1919d2.f5282k | c1923h.f5306a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (!z) {
            return;
        }
        throw new XmlPullParserException("no path defined");
    }

    /* renamed from: f */
    private boolean m35048f() {
        if (isAutoMirrored() && C1013a.m38092f(this) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private static PorterDuff.Mode m35047g(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    /* renamed from: i */
    private void m35045i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        C1923h c1923h = this.f5251k;
        C1922g c1922g = c1923h.f5307b;
        c1923h.f5309d = m35047g(C0992l.m38210g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList m38214c = C0992l.m38214c(typedArray, xmlPullParser, theme, "tint", 1);
        if (m38214c != null) {
            c1923h.f5308c = m38214c;
        }
        c1923h.f5310e = C0992l.m38216a(typedArray, xmlPullParser, "autoMirrored", 5, c1923h.f5310e);
        c1922g.f5300k = C0992l.m38211f(typedArray, xmlPullParser, "viewportWidth", 7, c1922g.f5300k);
        float m38211f = C0992l.m38211f(typedArray, xmlPullParser, "viewportHeight", 8, c1922g.f5301l);
        c1922g.f5301l = m38211f;
        if (c1922g.f5300k > 0.0f) {
            if (m38211f > 0.0f) {
                c1922g.f5298i = typedArray.getDimension(3, c1922g.f5298i);
                float dimension = typedArray.getDimension(2, c1922g.f5299j);
                c1922g.f5299j = dimension;
                if (c1922g.f5298i > 0.0f) {
                    if (dimension > 0.0f) {
                        c1922g.setAlpha(C0992l.m38211f(typedArray, xmlPullParser, "alpha", 4, c1922g.getAlpha()));
                        String string = typedArray.getString(0);
                        if (string != null) {
                            c1922g.f5303n = string;
                            c1922g.f5305p.put(string, c1922g);
                            return;
                        }
                        return;
                    }
                    throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
                }
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            }
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1914g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            C1013a.m38096b(drawable);
            return false;
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1914g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* renamed from: d */
    public Object m35050d(String str) {
        return this.f5251k.f5307b.f5305p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f5259s);
        if (this.f5259s.width() > 0 && this.f5259s.height() > 0) {
            ColorFilter colorFilter = this.f5253m;
            if (colorFilter == null) {
                colorFilter = this.f5252l;
            }
            canvas.getMatrix(this.f5258r);
            this.f5258r.getValues(this.f5257q);
            float abs = Math.abs(this.f5257q[0]);
            float abs2 = Math.abs(this.f5257q[4]);
            float abs3 = Math.abs(this.f5257q[1]);
            float abs4 = Math.abs(this.f5257q[3]);
            if (abs3 != 0.0f || abs4 != 0.0f) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min((int) RecyclerView.ItemAnimator.FLAG_MOVED, (int) (this.f5259s.width() * abs));
            int min2 = Math.min((int) RecyclerView.ItemAnimator.FLAG_MOVED, (int) (this.f5259s.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f5259s;
                canvas.translate(rect.left, rect.top);
                if (m35048f()) {
                    canvas.translate(this.f5259s.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f5259s.offsetTo(0, 0);
                this.f5251k.m35021c(min, min2);
                if (!this.f5255o) {
                    this.f5251k.m35014j(min, min2);
                } else if (!this.f5251k.m35022b()) {
                    this.f5251k.m35014j(min, min2);
                    this.f5251k.m35015i();
                }
                this.f5251k.m35020d(canvas, colorFilter, this.f5259s);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            return C1013a.m38094d(drawable);
        }
        return this.f5251k.f5307b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f5251k.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            return C1013a.m38093e(drawable);
        }
        return this.f5253m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f5249j != null && Build.VERSION.SDK_INT >= 24) {
            return new C1924i(this.f5249j.getConstantState());
        }
        this.f5251k.f5306a = getChangingConfigurations();
        return this.f5251k;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1914g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f5251k.f5307b.f5299j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f5251k.f5307b.f5298i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1914g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1914g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1914g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1914g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1914g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* renamed from: h */
    public void m35046h(boolean z) {
        this.f5255o = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            return C1013a.m38090h(drawable);
        }
        return this.f5251k.f5310e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C1923h c1923h;
        ColorStateList colorStateList;
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful() && ((c1923h = this.f5251k) == null || (!c1923h.m35017g() && ((colorStateList = this.f5251k.f5308c) == null || !colorStateList.isStateful())))) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    PorterDuffColorFilter m35044j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1914g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f5254n && super.mutate() == this) {
            this.f5251k = new C1923h(this.f5251k);
            this.f5254n = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C1923h c1923h = this.f5251k;
        ColorStateList colorStateList = c1923h.f5308c;
        if (colorStateList != null && (mode = c1923h.f5309d) != null) {
            this.f5252l = m35044j(this.f5252l, colorStateList, mode);
            invalidateSelf();
            z = true;
        } else {
            z = false;
        }
        if (c1923h.m35017g() && c1923h.m35016h(iArr)) {
            invalidateSelf();
            return true;
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f5251k.f5307b.getRootAlpha() != i) {
            this.f5251k.f5307b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            C1013a.m38088j(drawable, z);
        } else {
            this.f5251k.f5310e = z;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1914g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1914g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1914g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1914g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1914g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1914g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            C1013a.m38084n(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            C1013a.m38083o(drawable, colorStateList);
            return;
        }
        C1923h c1923h = this.f5251k;
        if (c1923h.f5308c != colorStateList) {
            c1923h.f5308c = colorStateList;
            this.f5252l = m35044j(this.f5252l, colorStateList, c1923h.f5309d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            C1013a.m38082p(drawable, mode);
            return;
        }
        C1923h c1923h = this.f5251k;
        if (c1923h.f5309d != mode) {
            c1923h.f5309d = mode;
            this.f5252l = m35044j(this.f5252l, c1923h.f5308c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.h$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1924i extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f5318a;

        public C1924i(Drawable.ConstantState constantState) {
            this.f5318a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f5318a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f5318a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C1915h c1915h = new C1915h();
            c1915h.f5249j = (VectorDrawable) this.f5318a.newDrawable();
            return c1915h;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C1915h c1915h = new C1915h();
            c1915h.f5249j = (VectorDrawable) this.f5318a.newDrawable(resources);
            return c1915h;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C1915h c1915h = new C1915h();
            c1915h.f5249j = (VectorDrawable) this.f5318a.newDrawable(resources, theme);
            return c1915h;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f5253m = colorFilter;
        invalidateSelf();
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class AbstractC1921f extends AbstractC1920e {

        /* renamed from: a */
        protected C1004d.C1006b[] f5285a;

        /* renamed from: b */
        String f5286b;

        /* renamed from: c */
        int f5287c;

        /* renamed from: d */
        int f5288d;

        public AbstractC1921f() {
            super();
            this.f5285a = null;
            this.f5287c = 0;
        }

        /* renamed from: c */
        public boolean mo35032c() {
            return false;
        }

        /* renamed from: d */
        public void m35031d(Path path) {
            path.reset();
            C1004d.C1006b[] c1006bArr = this.f5285a;
            if (c1006bArr != null) {
                C1004d.C1006b.m38148e(c1006bArr, path);
            }
        }

        public C1004d.C1006b[] getPathData() {
            return this.f5285a;
        }

        public String getPathName() {
            return this.f5286b;
        }

        public void setPathData(C1004d.C1006b[] c1006bArr) {
            if (!C1004d.m38161b(this.f5285a, c1006bArr)) {
                this.f5285a = C1004d.m38157f(c1006bArr);
            } else {
                C1004d.m38153j(this.f5285a, c1006bArr);
            }
        }

        public AbstractC1921f(AbstractC1921f abstractC1921f) {
            super();
            this.f5285a = null;
            this.f5287c = 0;
            this.f5286b = abstractC1921f.f5286b;
            this.f5288d = abstractC1921f.f5288d;
            this.f5285a = C1004d.m38157f(abstractC1921f.f5285a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            C1013a.m38091g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C1923h c1923h = this.f5251k;
        c1923h.f5307b = new C1922g();
        TypedArray m38206k = C0992l.m38206k(resources, theme, attributeSet, C1904a.f5222a);
        m35045i(m38206k, xmlPullParser, theme);
        m38206k.recycle();
        c1923h.f5306a = getChangingConfigurations();
        c1923h.f5316k = true;
        m35049e(resources, xmlPullParser, attributeSet, theme);
        this.f5252l = m35044j(this.f5252l, c1923h.f5308c, c1923h.f5309d);
    }

    C1915h(C1923h c1923h) {
        this.f5255o = true;
        this.f5257q = new float[9];
        this.f5258r = new Matrix();
        this.f5259s = new Rect();
        this.f5251k = c1923h;
        this.f5252l = m35044j(this.f5252l, c1923h.f5308c, c1923h.f5309d);
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1918c extends AbstractC1921f {

        /* renamed from: e */
        private int[] f5260e;

        /* renamed from: f */
        C0970d f5261f;

        /* renamed from: g */
        float f5262g;

        /* renamed from: h */
        C0970d f5263h;

        /* renamed from: i */
        float f5264i;

        /* renamed from: j */
        float f5265j;

        /* renamed from: k */
        float f5266k;

        /* renamed from: l */
        float f5267l;

        /* renamed from: m */
        float f5268m;

        /* renamed from: n */
        Paint.Cap f5269n;

        /* renamed from: o */
        Paint.Join f5270o;

        /* renamed from: p */
        float f5271p;

        C1918c() {
            this.f5262g = 0.0f;
            this.f5264i = 1.0f;
            this.f5265j = 1.0f;
            this.f5266k = 0.0f;
            this.f5267l = 1.0f;
            this.f5268m = 0.0f;
            this.f5269n = Paint.Cap.BUTT;
            this.f5270o = Paint.Join.MITER;
            this.f5271p = 4.0f;
        }

        /* renamed from: e */
        private Paint.Cap m35041e(int i, Paint.Cap cap) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return cap;
                    }
                    return Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }

        /* renamed from: f */
        private Paint.Join m35040f(int i, Paint.Join join) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return join;
                    }
                    return Paint.Join.BEVEL;
                }
                return Paint.Join.ROUND;
            }
            return Paint.Join.MITER;
        }

        /* renamed from: h */
        private void m35038h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f5260e = null;
            if (!C0992l.m38207j(xmlPullParser, "pathData")) {
                return;
            }
            String string = typedArray.getString(0);
            if (string != null) {
                this.f5286b = string;
            }
            String string2 = typedArray.getString(2);
            if (string2 != null) {
                this.f5285a = C1004d.m38159d(string2);
            }
            this.f5263h = C0992l.m38212e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
            this.f5265j = C0992l.m38211f(typedArray, xmlPullParser, "fillAlpha", 12, this.f5265j);
            this.f5269n = m35041e(C0992l.m38210g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f5269n);
            this.f5270o = m35040f(C0992l.m38210g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f5270o);
            this.f5271p = C0992l.m38211f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f5271p);
            this.f5261f = C0992l.m38212e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
            this.f5264i = C0992l.m38211f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f5264i);
            this.f5262g = C0992l.m38211f(typedArray, xmlPullParser, "strokeWidth", 4, this.f5262g);
            this.f5267l = C0992l.m38211f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f5267l);
            this.f5268m = C0992l.m38211f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f5268m);
            this.f5266k = C0992l.m38211f(typedArray, xmlPullParser, "trimPathStart", 5, this.f5266k);
            this.f5287c = C0992l.m38210g(typedArray, xmlPullParser, "fillType", 13, this.f5287c);
        }

        @Override // androidx.vectordrawable.graphics.drawable.C1915h.AbstractC1920e
        /* renamed from: a */
        public boolean mo35034a() {
            return this.f5263h.m38277i() || this.f5261f.m38277i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.C1915h.AbstractC1920e
        /* renamed from: b */
        public boolean mo35033b(int[] iArr) {
            return this.f5261f.m38276j(iArr) | this.f5263h.m38276j(iArr);
        }

        /* renamed from: g */
        public void m35039g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray m38206k = C0992l.m38206k(resources, theme, attributeSet, C1904a.f5224c);
            m35038h(m38206k, xmlPullParser, theme);
            m38206k.recycle();
        }

        float getFillAlpha() {
            return this.f5265j;
        }

        int getFillColor() {
            return this.f5263h.m38281e();
        }

        float getStrokeAlpha() {
            return this.f5264i;
        }

        int getStrokeColor() {
            return this.f5261f.m38281e();
        }

        float getStrokeWidth() {
            return this.f5262g;
        }

        float getTrimPathEnd() {
            return this.f5267l;
        }

        float getTrimPathOffset() {
            return this.f5268m;
        }

        float getTrimPathStart() {
            return this.f5266k;
        }

        void setFillAlpha(float f) {
            this.f5265j = f;
        }

        void setFillColor(int i) {
            this.f5263h.m38275k(i);
        }

        void setStrokeAlpha(float f) {
            this.f5264i = f;
        }

        void setStrokeColor(int i) {
            this.f5261f.m38275k(i);
        }

        void setStrokeWidth(float f) {
            this.f5262g = f;
        }

        void setTrimPathEnd(float f) {
            this.f5267l = f;
        }

        void setTrimPathOffset(float f) {
            this.f5268m = f;
        }

        void setTrimPathStart(float f) {
            this.f5266k = f;
        }

        C1918c(C1918c c1918c) {
            super(c1918c);
            this.f5262g = 0.0f;
            this.f5264i = 1.0f;
            this.f5265j = 1.0f;
            this.f5266k = 0.0f;
            this.f5267l = 1.0f;
            this.f5268m = 0.0f;
            this.f5269n = Paint.Cap.BUTT;
            this.f5270o = Paint.Join.MITER;
            this.f5271p = 4.0f;
            this.f5260e = c1918c.f5260e;
            this.f5261f = c1918c.f5261f;
            this.f5262g = c1918c.f5262g;
            this.f5264i = c1918c.f5264i;
            this.f5263h = c1918c.f5263h;
            this.f5287c = c1918c.f5287c;
            this.f5265j = c1918c.f5265j;
            this.f5266k = c1918c.f5266k;
            this.f5267l = c1918c.f5267l;
            this.f5268m = c1918c.f5268m;
            this.f5269n = c1918c.f5269n;
            this.f5270o = c1918c.f5270o;
            this.f5271p = c1918c.f5271p;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1922g {

        /* renamed from: q */
        private static final Matrix f5289q = new Matrix();

        /* renamed from: a */
        private final Path f5290a;

        /* renamed from: b */
        private final Path f5291b;

        /* renamed from: c */
        private final Matrix f5292c;

        /* renamed from: d */
        Paint f5293d;

        /* renamed from: e */
        Paint f5294e;

        /* renamed from: f */
        private PathMeasure f5295f;

        /* renamed from: g */
        private int f5296g;

        /* renamed from: h */
        final C1919d f5297h;

        /* renamed from: i */
        float f5298i;

        /* renamed from: j */
        float f5299j;

        /* renamed from: k */
        float f5300k;

        /* renamed from: l */
        float f5301l;

        /* renamed from: m */
        int f5302m;

        /* renamed from: n */
        String f5303n;

        /* renamed from: o */
        Boolean f5304o;

        /* renamed from: p */
        final C0624a<String, Object> f5305p;

        public C1922g() {
            this.f5292c = new Matrix();
            this.f5298i = 0.0f;
            this.f5299j = 0.0f;
            this.f5300k = 0.0f;
            this.f5301l = 0.0f;
            this.f5302m = 255;
            this.f5303n = null;
            this.f5304o = null;
            this.f5305p = new C0624a<>();
            this.f5297h = new C1919d();
            this.f5290a = new Path();
            this.f5291b = new Path();
        }

        /* renamed from: a */
        private static float m35030a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: c */
        private void m35028c(C1919d c1919d, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            c1919d.f5272a.set(matrix);
            c1919d.f5272a.preConcat(c1919d.f5281j);
            canvas.save();
            for (int i3 = 0; i3 < c1919d.f5273b.size(); i3++) {
                AbstractC1920e abstractC1920e = c1919d.f5273b.get(i3);
                if (abstractC1920e instanceof C1919d) {
                    m35028c((C1919d) abstractC1920e, c1919d.f5272a, canvas, i, i2, colorFilter);
                } else if (abstractC1920e instanceof AbstractC1921f) {
                    m35027d(c1919d, (AbstractC1921f) abstractC1920e, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: d */
        private void m35027d(C1919d c1919d, AbstractC1921f abstractC1921f, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            Path.FillType fillType;
            Path.FillType fillType2;
            float f = i / this.f5300k;
            float f2 = i2 / this.f5301l;
            float min = Math.min(f, f2);
            Matrix matrix = c1919d.f5272a;
            this.f5292c.set(matrix);
            this.f5292c.postScale(f, f2);
            float m35026e = m35026e(matrix);
            if (m35026e == 0.0f) {
                return;
            }
            abstractC1921f.m35031d(this.f5290a);
            Path path = this.f5290a;
            this.f5291b.reset();
            if (abstractC1921f.mo35032c()) {
                Path path2 = this.f5291b;
                if (abstractC1921f.f5287c == 0) {
                    fillType2 = Path.FillType.WINDING;
                } else {
                    fillType2 = Path.FillType.EVEN_ODD;
                }
                path2.setFillType(fillType2);
                this.f5291b.addPath(path, this.f5292c);
                canvas.clipPath(this.f5291b);
                return;
            }
            C1918c c1918c = (C1918c) abstractC1921f;
            float f3 = c1918c.f5266k;
            if (f3 != 0.0f || c1918c.f5267l != 1.0f) {
                float f4 = c1918c.f5268m;
                float f5 = (f3 + f4) % 1.0f;
                float f6 = (c1918c.f5267l + f4) % 1.0f;
                if (this.f5295f == null) {
                    this.f5295f = new PathMeasure();
                }
                this.f5295f.setPath(this.f5290a, false);
                float length = this.f5295f.getLength();
                float f7 = f5 * length;
                float f8 = f6 * length;
                path.reset();
                if (f7 > f8) {
                    this.f5295f.getSegment(f7, length, path, true);
                    this.f5295f.getSegment(0.0f, f8, path, true);
                } else {
                    this.f5295f.getSegment(f7, f8, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f5291b.addPath(path, this.f5292c);
            if (c1918c.f5263h.m38274l()) {
                C0970d c0970d = c1918c.f5263h;
                if (this.f5294e == null) {
                    Paint paint = new Paint(1);
                    this.f5294e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f5294e;
                if (c0970d.m38278h()) {
                    Shader m38280f = c0970d.m38280f();
                    m38280f.setLocalMatrix(this.f5292c);
                    paint2.setShader(m38280f);
                    paint2.setAlpha(Math.round(c1918c.f5265j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(C1915h.m35053a(c0970d.m38281e(), c1918c.f5265j));
                }
                paint2.setColorFilter(colorFilter);
                Path path3 = this.f5291b;
                if (c1918c.f5287c == 0) {
                    fillType = Path.FillType.WINDING;
                } else {
                    fillType = Path.FillType.EVEN_ODD;
                }
                path3.setFillType(fillType);
                canvas.drawPath(this.f5291b, paint2);
            }
            if (c1918c.f5261f.m38274l()) {
                C0970d c0970d2 = c1918c.f5261f;
                if (this.f5293d == null) {
                    Paint paint3 = new Paint(1);
                    this.f5293d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f5293d;
                Paint.Join join = c1918c.f5270o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = c1918c.f5269n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(c1918c.f5271p);
                if (c0970d2.m38278h()) {
                    Shader m38280f2 = c0970d2.m38280f();
                    m38280f2.setLocalMatrix(this.f5292c);
                    paint4.setShader(m38280f2);
                    paint4.setAlpha(Math.round(c1918c.f5264i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(C1915h.m35053a(c0970d2.m38281e(), c1918c.f5264i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(c1918c.f5262g * min * m35026e);
                canvas.drawPath(this.f5291b, paint4);
            }
        }

        /* renamed from: e */
        private float m35026e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float m35030a = m35030a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot(fArr[0], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
            if (max <= 0.0f) {
                return 0.0f;
            }
            return Math.abs(m35030a) / max;
        }

        /* renamed from: b */
        public void m35029b(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m35028c(this.f5297h, f5289q, canvas, i, i2, colorFilter);
        }

        /* renamed from: f */
        public boolean m35025f() {
            if (this.f5304o == null) {
                this.f5304o = Boolean.valueOf(this.f5297h.mo35034a());
            }
            return this.f5304o.booleanValue();
        }

        /* renamed from: g */
        public boolean m35024g(int[] iArr) {
            return this.f5297h.mo35033b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f5302m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f5302m = i;
        }

        public C1922g(C1922g c1922g) {
            this.f5292c = new Matrix();
            this.f5298i = 0.0f;
            this.f5299j = 0.0f;
            this.f5300k = 0.0f;
            this.f5301l = 0.0f;
            this.f5302m = 255;
            this.f5303n = null;
            this.f5304o = null;
            C0624a<String, Object> c0624a = new C0624a<>();
            this.f5305p = c0624a;
            this.f5297h = new C1919d(c1922g.f5297h, c0624a);
            this.f5290a = new Path(c1922g.f5290a);
            this.f5291b = new Path(c1922g.f5291b);
            this.f5298i = c1922g.f5298i;
            this.f5299j = c1922g.f5299j;
            this.f5300k = c1922g.f5300k;
            this.f5301l = c1922g.f5301l;
            this.f5296g = c1922g.f5296g;
            this.f5302m = c1922g.f5302m;
            this.f5303n = c1922g.f5303n;
            String str = c1922g.f5303n;
            if (str != null) {
                c0624a.put(str, this);
            }
            this.f5304o = c1922g.f5304o;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1919d extends AbstractC1920e {

        /* renamed from: a */
        final Matrix f5272a;

        /* renamed from: b */
        final ArrayList<AbstractC1920e> f5273b;

        /* renamed from: c */
        float f5274c;

        /* renamed from: d */
        private float f5275d;

        /* renamed from: e */
        private float f5276e;

        /* renamed from: f */
        private float f5277f;

        /* renamed from: g */
        private float f5278g;

        /* renamed from: h */
        private float f5279h;

        /* renamed from: i */
        private float f5280i;

        /* renamed from: j */
        final Matrix f5281j;

        /* renamed from: k */
        int f5282k;

        /* renamed from: l */
        private int[] f5283l;

        /* renamed from: m */
        private String f5284m;

        public C1919d(C1919d c1919d, C0624a<String, Object> c0624a) {
            super();
            AbstractC1921f c1917b;
            this.f5272a = new Matrix();
            this.f5273b = new ArrayList<>();
            this.f5274c = 0.0f;
            this.f5275d = 0.0f;
            this.f5276e = 0.0f;
            this.f5277f = 1.0f;
            this.f5278g = 1.0f;
            this.f5279h = 0.0f;
            this.f5280i = 0.0f;
            Matrix matrix = new Matrix();
            this.f5281j = matrix;
            this.f5284m = null;
            this.f5274c = c1919d.f5274c;
            this.f5275d = c1919d.f5275d;
            this.f5276e = c1919d.f5276e;
            this.f5277f = c1919d.f5277f;
            this.f5278g = c1919d.f5278g;
            this.f5279h = c1919d.f5279h;
            this.f5280i = c1919d.f5280i;
            this.f5283l = c1919d.f5283l;
            String str = c1919d.f5284m;
            this.f5284m = str;
            this.f5282k = c1919d.f5282k;
            if (str != null) {
                c0624a.put(str, this);
            }
            matrix.set(c1919d.f5281j);
            ArrayList<AbstractC1920e> arrayList = c1919d.f5273b;
            for (int i = 0; i < arrayList.size(); i++) {
                AbstractC1920e abstractC1920e = arrayList.get(i);
                if (abstractC1920e instanceof C1919d) {
                    this.f5273b.add(new C1919d((C1919d) abstractC1920e, c0624a));
                } else {
                    if (abstractC1920e instanceof C1918c) {
                        c1917b = new C1918c((C1918c) abstractC1920e);
                    } else if (abstractC1920e instanceof C1917b) {
                        c1917b = new C1917b((C1917b) abstractC1920e);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f5273b.add(c1917b);
                    String str2 = c1917b.f5286b;
                    if (str2 != null) {
                        c0624a.put(str2, c1917b);
                    }
                }
            }
        }

        /* renamed from: d */
        private void m35036d() {
            this.f5281j.reset();
            this.f5281j.postTranslate(-this.f5275d, -this.f5276e);
            this.f5281j.postScale(this.f5277f, this.f5278g);
            this.f5281j.postRotate(this.f5274c, 0.0f, 0.0f);
            this.f5281j.postTranslate(this.f5279h + this.f5275d, this.f5280i + this.f5276e);
        }

        /* renamed from: e */
        private void m35035e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f5283l = null;
            this.f5274c = C0992l.m38211f(typedArray, xmlPullParser, ViewProps.ROTATION, 5, this.f5274c);
            this.f5275d = typedArray.getFloat(1, this.f5275d);
            this.f5276e = typedArray.getFloat(2, this.f5276e);
            this.f5277f = C0992l.m38211f(typedArray, xmlPullParser, ViewProps.SCALE_X, 3, this.f5277f);
            this.f5278g = C0992l.m38211f(typedArray, xmlPullParser, ViewProps.SCALE_Y, 4, this.f5278g);
            this.f5279h = C0992l.m38211f(typedArray, xmlPullParser, ViewProps.TRANSLATE_X, 6, this.f5279h);
            this.f5280i = C0992l.m38211f(typedArray, xmlPullParser, ViewProps.TRANSLATE_Y, 7, this.f5280i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f5284m = string;
            }
            m35036d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.C1915h.AbstractC1920e
        /* renamed from: a */
        public boolean mo35034a() {
            for (int i = 0; i < this.f5273b.size(); i++) {
                if (this.f5273b.get(i).mo35034a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.C1915h.AbstractC1920e
        /* renamed from: b */
        public boolean mo35033b(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f5273b.size(); i++) {
                z |= this.f5273b.get(i).mo35033b(iArr);
            }
            return z;
        }

        /* renamed from: c */
        public void m35037c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray m38206k = C0992l.m38206k(resources, theme, attributeSet, C1904a.f5223b);
            m35035e(m38206k, xmlPullParser);
            m38206k.recycle();
        }

        public String getGroupName() {
            return this.f5284m;
        }

        public Matrix getLocalMatrix() {
            return this.f5281j;
        }

        public float getPivotX() {
            return this.f5275d;
        }

        public float getPivotY() {
            return this.f5276e;
        }

        public float getRotation() {
            return this.f5274c;
        }

        public float getScaleX() {
            return this.f5277f;
        }

        public float getScaleY() {
            return this.f5278g;
        }

        public float getTranslateX() {
            return this.f5279h;
        }

        public float getTranslateY() {
            return this.f5280i;
        }

        public void setPivotX(float f) {
            if (f != this.f5275d) {
                this.f5275d = f;
                m35036d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f5276e) {
                this.f5276e = f;
                m35036d();
            }
        }

        public void setRotation(float f) {
            if (f != this.f5274c) {
                this.f5274c = f;
                m35036d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f5277f) {
                this.f5277f = f;
                m35036d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f5278g) {
                this.f5278g = f;
                m35036d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f5279h) {
                this.f5279h = f;
                m35036d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f5280i) {
                this.f5280i = f;
                m35036d();
            }
        }

        public C1919d() {
            super();
            this.f5272a = new Matrix();
            this.f5273b = new ArrayList<>();
            this.f5274c = 0.0f;
            this.f5275d = 0.0f;
            this.f5276e = 0.0f;
            this.f5277f = 1.0f;
            this.f5278g = 1.0f;
            this.f5279h = 0.0f;
            this.f5280i = 0.0f;
            this.f5281j = new Matrix();
            this.f5284m = null;
        }
    }
}