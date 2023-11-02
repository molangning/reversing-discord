package p090f;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import androidx.core.graphics.drawable.C1013a;

/* renamed from: f.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6278b extends Drawable implements Drawable.Callback {

    /* renamed from: j */
    private AbstractC6282d f17727j;

    /* renamed from: k */
    private Rect f17728k;

    /* renamed from: l */
    private Drawable f17729l;

    /* renamed from: m */
    private Drawable f17730m;

    /* renamed from: o */
    private boolean f17732o;

    /* renamed from: q */
    private boolean f17734q;

    /* renamed from: r */
    private Runnable f17735r;

    /* renamed from: s */
    private long f17736s;

    /* renamed from: t */
    private long f17737t;

    /* renamed from: u */
    private C6281c f17738u;

    /* renamed from: n */
    private int f17731n = 255;

    /* renamed from: p */
    private int f17733p = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC6279a implements Runnable {
        RunnableC6279a() {
            C6278b.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6278b.this.m23096a(true);
            C6278b.this.invalidateSelf();
        }
    }

    /* renamed from: f.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C6280b {
        /* renamed from: a */
        public static boolean m23089a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        /* renamed from: b */
        public static void m23088b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        /* renamed from: c */
        public static Resources m23087c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* renamed from: f.b$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C6281c implements Drawable.Callback {

        /* renamed from: j */
        private Drawable.Callback f17740j;

        C6281c() {
        }

        /* renamed from: a */
        public Drawable.Callback m23086a() {
            Drawable.Callback callback = this.f17740j;
            this.f17740j = null;
            return callback;
        }

        /* renamed from: b */
        public C6281c m23085b(Drawable.Callback callback) {
            this.f17740j = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f17740j;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f17740j;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: f.b$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class AbstractC6282d extends Drawable.ConstantState {

        /* renamed from: A */
        int f17741A;

        /* renamed from: B */
        int f17742B;

        /* renamed from: C */
        boolean f17743C;

        /* renamed from: D */
        ColorFilter f17744D;

        /* renamed from: E */
        boolean f17745E;

        /* renamed from: F */
        ColorStateList f17746F;

        /* renamed from: G */
        PorterDuff.Mode f17747G;

        /* renamed from: H */
        boolean f17748H;

        /* renamed from: I */
        boolean f17749I;

        /* renamed from: a */
        final C6278b f17750a;

        /* renamed from: b */
        Resources f17751b;

        /* renamed from: c */
        int f17752c;

        /* renamed from: d */
        int f17753d;

        /* renamed from: e */
        int f17754e;

        /* renamed from: f */
        SparseArray<Drawable.ConstantState> f17755f;

        /* renamed from: g */
        Drawable[] f17756g;

        /* renamed from: h */
        int f17757h;

        /* renamed from: i */
        boolean f17758i;

        /* renamed from: j */
        boolean f17759j;

        /* renamed from: k */
        Rect f17760k;

        /* renamed from: l */
        boolean f17761l;

        /* renamed from: m */
        boolean f17762m;

        /* renamed from: n */
        int f17763n;

        /* renamed from: o */
        int f17764o;

        /* renamed from: p */
        int f17765p;

        /* renamed from: q */
        int f17766q;

        /* renamed from: r */
        boolean f17767r;

        /* renamed from: s */
        int f17768s;

        /* renamed from: t */
        boolean f17769t;

        /* renamed from: u */
        boolean f17770u;

        /* renamed from: v */
        boolean f17771v;

        /* renamed from: w */
        boolean f17772w;

        /* renamed from: x */
        boolean f17773x;

        /* renamed from: y */
        boolean f17774y;

        /* renamed from: z */
        int f17775z;

        public AbstractC6282d(AbstractC6282d abstractC6282d, C6278b c6278b, Resources resources) {
            Resources resources2;
            int i;
            this.f17758i = false;
            this.f17761l = false;
            this.f17773x = true;
            this.f17741A = 0;
            this.f17742B = 0;
            this.f17750a = c6278b;
            if (resources != null) {
                resources2 = resources;
            } else if (abstractC6282d != null) {
                resources2 = abstractC6282d.f17751b;
            } else {
                resources2 = null;
            }
            this.f17751b = resources2;
            if (abstractC6282d != null) {
                i = abstractC6282d.f17752c;
            } else {
                i = 0;
            }
            int m23092f = C6278b.m23092f(resources, i);
            this.f17752c = m23092f;
            if (abstractC6282d != null) {
                this.f17753d = abstractC6282d.f17753d;
                this.f17754e = abstractC6282d.f17754e;
                this.f17771v = true;
                this.f17772w = true;
                this.f17758i = abstractC6282d.f17758i;
                this.f17761l = abstractC6282d.f17761l;
                this.f17773x = abstractC6282d.f17773x;
                this.f17774y = abstractC6282d.f17774y;
                this.f17775z = abstractC6282d.f17775z;
                this.f17741A = abstractC6282d.f17741A;
                this.f17742B = abstractC6282d.f17742B;
                this.f17743C = abstractC6282d.f17743C;
                this.f17744D = abstractC6282d.f17744D;
                this.f17745E = abstractC6282d.f17745E;
                this.f17746F = abstractC6282d.f17746F;
                this.f17747G = abstractC6282d.f17747G;
                this.f17748H = abstractC6282d.f17748H;
                this.f17749I = abstractC6282d.f17749I;
                if (abstractC6282d.f17752c == m23092f) {
                    if (abstractC6282d.f17759j) {
                        this.f17760k = abstractC6282d.f17760k != null ? new Rect(abstractC6282d.f17760k) : null;
                        this.f17759j = true;
                    }
                    if (abstractC6282d.f17762m) {
                        this.f17763n = abstractC6282d.f17763n;
                        this.f17764o = abstractC6282d.f17764o;
                        this.f17765p = abstractC6282d.f17765p;
                        this.f17766q = abstractC6282d.f17766q;
                        this.f17762m = true;
                    }
                }
                if (abstractC6282d.f17767r) {
                    this.f17768s = abstractC6282d.f17768s;
                    this.f17767r = true;
                }
                if (abstractC6282d.f17769t) {
                    this.f17770u = abstractC6282d.f17770u;
                    this.f17769t = true;
                }
                Drawable[] drawableArr = abstractC6282d.f17756g;
                this.f17756g = new Drawable[drawableArr.length];
                this.f17757h = abstractC6282d.f17757h;
                SparseArray<Drawable.ConstantState> sparseArray = abstractC6282d.f17755f;
                if (sparseArray != null) {
                    this.f17755f = sparseArray.clone();
                } else {
                    this.f17755f = new SparseArray<>(this.f17757h);
                }
                int i2 = this.f17757h;
                for (int i3 = 0; i3 < i2; i3++) {
                    Drawable drawable = drawableArr[i3];
                    if (drawable != null) {
                        Drawable.ConstantState constantState = drawable.getConstantState();
                        if (constantState != null) {
                            this.f17755f.put(i3, constantState);
                        } else {
                            this.f17756g[i3] = drawableArr[i3];
                        }
                    }
                }
                return;
            }
            this.f17756g = new Drawable[10];
            this.f17757h = 0;
        }

        /* renamed from: e */
        private void m23080e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f17755f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f17756g[this.f17755f.keyAt(i)] = m23068s(this.f17755f.valueAt(i).newDrawable(this.f17751b));
                }
                this.f17755f = null;
            }
        }

        /* renamed from: s */
        private Drawable m23068s(Drawable drawable) {
            C1013a.m38085m(drawable, this.f17775z);
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f17750a);
            return mutate;
        }

        /* renamed from: a */
        public final int m23084a(Drawable drawable) {
            int i = this.f17757h;
            if (i >= this.f17756g.length) {
                mo23055o(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f17750a);
            this.f17756g[i] = drawable;
            this.f17757h++;
            this.f17754e = drawable.getChangingConfigurations() | this.f17754e;
            m23070p();
            this.f17760k = null;
            this.f17759j = false;
            this.f17762m = false;
            this.f17771v = false;
            return i;
        }

        /* renamed from: b */
        final void m23083b(Resources.Theme theme) {
            if (theme != null) {
                m23080e();
                int i = this.f17757h;
                Drawable[] drawableArr = this.f17756g;
                for (int i2 = 0; i2 < i; i2++) {
                    Drawable drawable = drawableArr[i2];
                    if (drawable != null && C1013a.m38096b(drawable)) {
                        C1013a.m38097a(drawableArr[i2], theme);
                        this.f17754e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                m23062y(C6280b.m23087c(theme));
            }
        }

        /* renamed from: c */
        public boolean m23082c() {
            if (this.f17771v) {
                return this.f17772w;
            }
            m23080e();
            this.f17771v = true;
            int i = this.f17757h;
            Drawable[] drawableArr = this.f17756g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f17772w = false;
                    return false;
                }
            }
            this.f17772w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i = this.f17757h;
            Drawable[] drawableArr = this.f17756g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    if (C1013a.m38096b(drawable)) {
                        return true;
                    }
                } else {
                    Drawable.ConstantState constantState = this.f17755f.get(i2);
                    if (constantState != null && C6280b.m23089a(constantState)) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: d */
        protected void m23081d() {
            this.f17762m = true;
            m23080e();
            int i = this.f17757h;
            Drawable[] drawableArr = this.f17756g;
            this.f17764o = -1;
            this.f17763n = -1;
            this.f17766q = 0;
            this.f17765p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f17763n) {
                    this.f17763n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f17764o) {
                    this.f17764o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f17765p) {
                    this.f17765p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f17766q) {
                    this.f17766q = minimumHeight;
                }
            }
        }

        /* renamed from: f */
        public final int m23079f() {
            return this.f17756g.length;
        }

        /* renamed from: g */
        public final Drawable m23078g(int i) {
            int indexOfKey;
            Drawable drawable = this.f17756g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f17755f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable m23068s = m23068s(this.f17755f.valueAt(indexOfKey).newDrawable(this.f17751b));
            this.f17756g[i] = m23068s;
            this.f17755f.removeAt(indexOfKey);
            if (this.f17755f.size() == 0) {
                this.f17755f = null;
            }
            return m23068s;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f17753d | this.f17754e;
        }

        /* renamed from: h */
        public final int m23077h() {
            return this.f17757h;
        }

        /* renamed from: i */
        public final int m23076i() {
            if (!this.f17762m) {
                m23081d();
            }
            return this.f17764o;
        }

        /* renamed from: j */
        public final int m23075j() {
            if (!this.f17762m) {
                m23081d();
            }
            return this.f17766q;
        }

        /* renamed from: k */
        public final int m23074k() {
            if (!this.f17762m) {
                m23081d();
            }
            return this.f17765p;
        }

        /* renamed from: l */
        public final Rect m23073l() {
            Rect rect = null;
            if (this.f17758i) {
                return null;
            }
            Rect rect2 = this.f17760k;
            if (rect2 == null && !this.f17759j) {
                m23080e();
                Rect rect3 = new Rect();
                int i = this.f17757h;
                Drawable[] drawableArr = this.f17756g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect3)) {
                        if (rect == null) {
                            rect = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect3.left;
                        if (i3 > rect.left) {
                            rect.left = i3;
                        }
                        int i4 = rect3.top;
                        if (i4 > rect.top) {
                            rect.top = i4;
                        }
                        int i5 = rect3.right;
                        if (i5 > rect.right) {
                            rect.right = i5;
                        }
                        int i6 = rect3.bottom;
                        if (i6 > rect.bottom) {
                            rect.bottom = i6;
                        }
                    }
                }
                this.f17759j = true;
                this.f17760k = rect;
                return rect;
            }
            return rect2;
        }

        /* renamed from: m */
        public final int m23072m() {
            if (!this.f17762m) {
                m23081d();
            }
            return this.f17763n;
        }

        /* renamed from: n */
        public final int m23071n() {
            int i;
            if (this.f17767r) {
                return this.f17768s;
            }
            m23080e();
            int i2 = this.f17757h;
            Drawable[] drawableArr = this.f17756g;
            if (i2 > 0) {
                i = drawableArr[0].getOpacity();
            } else {
                i = -2;
            }
            for (int i3 = 1; i3 < i2; i3++) {
                i = Drawable.resolveOpacity(i, drawableArr[i3].getOpacity());
            }
            this.f17768s = i;
            this.f17767r = true;
            return i;
        }

        /* renamed from: o */
        public void mo23055o(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = this.f17756g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.f17756g = drawableArr;
        }

        /* renamed from: p */
        void m23070p() {
            this.f17767r = false;
            this.f17769t = false;
        }

        /* renamed from: q */
        public final boolean m23069q() {
            return this.f17761l;
        }

        /* renamed from: r */
        abstract void mo23054r();

        /* renamed from: t */
        public final void m23067t(boolean z) {
            this.f17761l = z;
        }

        /* renamed from: u */
        public final void m23066u(int i) {
            this.f17741A = i;
        }

        /* renamed from: v */
        public final void m23065v(int i) {
            this.f17742B = i;
        }

        /* renamed from: w */
        final boolean m23064w(int i, int i2) {
            int i3 = this.f17757h;
            Drawable[] drawableArr = this.f17756g;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                if (drawable != null) {
                    boolean m38085m = C1013a.m38085m(drawable, i);
                    if (i4 == i2) {
                        z = m38085m;
                    }
                }
            }
            this.f17775z = i;
            return z;
        }

        /* renamed from: x */
        public final void m23063x(boolean z) {
            this.f17758i = z;
        }

        /* renamed from: y */
        final void m23062y(Resources resources) {
            if (resources != null) {
                this.f17751b = resources;
                int m23092f = C6278b.m23092f(resources, this.f17752c);
                int i = this.f17752c;
                this.f17752c = m23092f;
                if (i != m23092f) {
                    this.f17762m = false;
                    this.f17759j = false;
                }
            }
        }
    }

    /* renamed from: d */
    private void m23094d(Drawable drawable) {
        if (this.f17738u == null) {
            this.f17738u = new C6281c();
        }
        drawable.setCallback(this.f17738u.m23085b(drawable.getCallback()));
        try {
            if (this.f17727j.f17741A <= 0 && this.f17732o) {
                drawable.setAlpha(this.f17731n);
            }
            AbstractC6282d abstractC6282d = this.f17727j;
            if (abstractC6282d.f17745E) {
                drawable.setColorFilter(abstractC6282d.f17744D);
            } else {
                if (abstractC6282d.f17748H) {
                    C1013a.m38083o(drawable, abstractC6282d.f17746F);
                }
                AbstractC6282d abstractC6282d2 = this.f17727j;
                if (abstractC6282d2.f17749I) {
                    C1013a.m38082p(drawable, abstractC6282d2.f17747G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f17727j.f17773x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            C1013a.m38085m(drawable, C1013a.m38092f(this));
            C1013a.m38088j(drawable, this.f17727j.f17743C);
            Rect rect = this.f17728k;
            if (rect != null) {
                C1013a.m38086l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f17738u.m23086a());
        }
    }

    /* renamed from: e */
    private boolean m23093e() {
        if (isAutoMirrored() && C1013a.m38092f(this) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    static int m23092f(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m23096a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f17732o = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f17729l
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f17736s
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f17731n
            r3.setAlpha(r9)
            r13.f17736s = r6
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            f.b$d r10 = r13.f17727j
            int r10 = r10.f17741A
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f17731n
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L39
        L36:
            r13.f17736s = r6
        L38:
            r3 = r8
        L39:
            android.graphics.drawable.Drawable r9 = r13.f17730m
            if (r9 == 0) goto L61
            long r10 = r13.f17737t
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f17730m = r0
            r13.f17737t = r6
            goto L63
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            f.b$d r4 = r13.f17727j
            int r4 = r4.f17742B
            int r3 = r3 / r4
            int r4 = r13.f17731n
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.f17737t = r6
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            java.lang.Runnable r14 = r13.f17735r
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p090f.C6278b.m23096a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f17727j.m23083b(theme);
    }

    /* renamed from: b */
    AbstractC6282d mo23060b() {
        throw null;
    }

    /* renamed from: c */
    public int m23095c() {
        return this.f17733p;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f17727j.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f17729l;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f17730m;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0073  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m23091g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f17733p
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            f.b$d r0 = r9.f17727j
            int r0 = r0.f17742B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f17730m
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f17729l
            if (r0 == 0) goto L29
            r9.f17730m = r0
            f.b$d r0 = r9.f17727j
            int r0 = r0.f17742B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f17737t = r0
            goto L35
        L29:
            r9.f17730m = r4
            r9.f17737t = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f17729l
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            f.b$d r0 = r9.f17727j
            int r1 = r0.f17757h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.m23078g(r10)
            r9.f17729l = r0
            r9.f17733p = r10
            if (r0 == 0) goto L5a
            f.b$d r10 = r9.f17727j
            int r10 = r10.f17741A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f17736s = r2
        L51:
            r9.m23094d(r0)
            goto L5a
        L55:
            r9.f17729l = r4
            r10 = -1
            r9.f17733p = r10
        L5a:
            long r0 = r9.f17736s
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f17737t
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L79
        L67:
            java.lang.Runnable r10 = r9.f17735r
            if (r10 != 0) goto L73
            f.b$a r10 = new f.b$a
            r10.<init>()
            r9.f17735r = r10
            goto L76
        L73:
            r9.unscheduleSelf(r10)
        L76:
            r9.m23096a(r0)
        L79:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p090f.C6278b.m23091g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f17731n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f17727j.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f17727j.m23082c()) {
            this.f17727j.f17753d = getChangingConfigurations();
            return this.f17727j;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f17729l;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f17728k;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f17727j.m23069q()) {
            return this.f17727j.m23076i();
        }
        Drawable drawable = this.f17729l;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f17727j.m23069q()) {
            return this.f17727j.m23072m();
        }
        Drawable drawable = this.f17729l;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f17727j.m23069q()) {
            return this.f17727j.m23075j();
        }
        Drawable drawable = this.f17729l;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f17727j.m23069q()) {
            return this.f17727j.m23074k();
        }
        Drawable drawable = this.f17729l;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f17729l;
        if (drawable != null && drawable.isVisible()) {
            return this.f17727j.m23071n();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f17729l;
        if (drawable != null) {
            C6280b.m23088b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect m23073l = this.f17727j.m23073l();
        if (m23073l != null) {
            rect.set(m23073l);
            if ((m23073l.right | m23073l.left | m23073l.top | m23073l.bottom) != 0) {
                padding = true;
            } else {
                padding = false;
            }
        } else {
            Drawable drawable = this.f17729l;
            if (drawable != null) {
                padding = drawable.getPadding(rect);
            } else {
                padding = super.getPadding(rect);
            }
        }
        if (m23093e()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return padding;
    }

    /* renamed from: h */
    public void mo23059h(AbstractC6282d abstractC6282d) {
        this.f17727j = abstractC6282d;
        int i = this.f17733p;
        if (i >= 0) {
            Drawable m23078g = abstractC6282d.m23078g(i);
            this.f17729l = m23078g;
            if (m23078g != null) {
                m23094d(m23078g);
            }
        }
        this.f17730m = null;
    }

    /* renamed from: i */
    public final void m23090i(Resources resources) {
        this.f17727j.m23062y(resources);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        AbstractC6282d abstractC6282d = this.f17727j;
        if (abstractC6282d != null) {
            abstractC6282d.m23070p();
        }
        if (drawable == this.f17729l && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f17727j.f17743C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f17730m;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f17730m = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f17729l;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f17732o) {
                this.f17729l.setAlpha(this.f17731n);
            }
        }
        if (this.f17737t != 0) {
            this.f17737t = 0L;
            z = true;
        }
        if (this.f17736s != 0) {
            this.f17736s = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f17734q && super.mutate() == this) {
            AbstractC6282d mo23060b = mo23060b();
            mo23060b.mo23054r();
            mo23059h(mo23060b);
            this.f17734q = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f17730m;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f17729l;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return this.f17727j.m23064w(i, m23095c());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        Drawable drawable = this.f17730m;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f17729l;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f17730m;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f17729l;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f17729l && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (!this.f17732o || this.f17731n != i) {
            this.f17732o = true;
            this.f17731n = i;
            Drawable drawable = this.f17729l;
            if (drawable != null) {
                if (this.f17736s == 0) {
                    drawable.setAlpha(i);
                } else {
                    m23096a(false);
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        AbstractC6282d abstractC6282d = this.f17727j;
        if (abstractC6282d.f17743C != z) {
            abstractC6282d.f17743C = z;
            Drawable drawable = this.f17729l;
            if (drawable != null) {
                C1013a.m38088j(drawable, z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        AbstractC6282d abstractC6282d = this.f17727j;
        abstractC6282d.f17745E = true;
        if (abstractC6282d.f17744D != colorFilter) {
            abstractC6282d.f17744D = colorFilter;
            Drawable drawable = this.f17729l;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        AbstractC6282d abstractC6282d = this.f17727j;
        if (abstractC6282d.f17773x != z) {
            abstractC6282d.f17773x = z;
            Drawable drawable = this.f17729l;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f17729l;
        if (drawable != null) {
            C1013a.m38087k(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f17728k;
        if (rect == null) {
            this.f17728k = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f17729l;
        if (drawable != null) {
            C1013a.m38086l(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        AbstractC6282d abstractC6282d = this.f17727j;
        abstractC6282d.f17748H = true;
        if (abstractC6282d.f17746F != colorStateList) {
            abstractC6282d.f17746F = colorStateList;
            C1013a.m38083o(this.f17729l, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        AbstractC6282d abstractC6282d = this.f17727j;
        abstractC6282d.f17749I = true;
        if (abstractC6282d.f17747G != mode) {
            abstractC6282d.f17747G = mode;
            C1013a.m38082p(this.f17729l, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f17730m;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f17729l;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f17729l && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}