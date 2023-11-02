package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.C0492c1;
import androidx.core.graphics.C0995a;
import p052d.C5706a;
import p052d.C5708c;
import p052d.C5709d;
import p052d.C5710e;
import p071e.C6029a;

/* renamed from: androidx.appcompat.widget.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C0529j {

    /* renamed from: b */
    private static final PorterDuff.Mode f1872b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private static C0529j f1873c;

    /* renamed from: a */
    private C0492c1 f1874a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0530a implements C0492c1.InterfaceC0498f {

        /* renamed from: a */
        private final int[] f1875a = {C5710e.f16114R, C5710e.f16112P, C5710e.f16116a};

        /* renamed from: b */
        private final int[] f1876b = {C5710e.f16130o, C5710e.f16098B, C5710e.f16135t, C5710e.f16131p, C5710e.f16132q, C5710e.f16134s, C5710e.f16133r};

        /* renamed from: c */
        private final int[] f1877c = {C5710e.f16111O, C5710e.f16113Q, C5710e.f16126k, C5710e.f16107K, C5710e.f16108L, C5710e.f16109M, C5710e.f16110N};

        /* renamed from: d */
        private final int[] f1878d = {C5710e.f16138w, C5710e.f16124i, C5710e.f16137v};

        /* renamed from: e */
        private final int[] f1879e = {C5710e.f16106J, C5710e.f16115S};

        /* renamed from: f */
        private final int[] f1880f = {C5710e.f16118c, C5710e.f16122g, C5710e.f16119d, C5710e.f16123h};

        C0530a() {
        }

        /* renamed from: f */
        private boolean m39826f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private ColorStateList m39825g(Context context) {
            return m39824h(context, 0);
        }

        /* renamed from: h */
        private ColorStateList m39824h(Context context, int i) {
            int m39844c = C0528i1.m39844c(context, C5706a.f16069w);
            return new ColorStateList(new int[][]{C0528i1.f1863b, C0528i1.f1866e, C0528i1.f1864c, C0528i1.f1870i}, new int[]{C0528i1.m39845b(context, C5706a.f16067u), C0995a.m38181g(m39844c, i), C0995a.m38181g(m39844c, i), i});
        }

        /* renamed from: i */
        private ColorStateList m39823i(Context context) {
            return m39824h(context, C0528i1.m39844c(context, C5706a.f16066t));
        }

        /* renamed from: j */
        private ColorStateList m39822j(Context context) {
            return m39824h(context, C0528i1.m39844c(context, C5706a.f16067u));
        }

        /* renamed from: k */
        private ColorStateList m39821k(Context context) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            int i = C5706a.f16071y;
            ColorStateList m39842e = C0528i1.m39842e(context, i);
            if (m39842e != null && m39842e.isStateful()) {
                int[] iArr3 = C0528i1.f1863b;
                iArr[0] = iArr3;
                iArr2[0] = m39842e.getColorForState(iArr3, 0);
                iArr[1] = C0528i1.f1867f;
                iArr2[1] = C0528i1.m39844c(context, C5706a.f16068v);
                iArr[2] = C0528i1.f1870i;
                iArr2[2] = m39842e.getDefaultColor();
            } else {
                iArr[0] = C0528i1.f1863b;
                iArr2[0] = C0528i1.m39845b(context, i);
                iArr[1] = C0528i1.f1867f;
                iArr2[1] = C0528i1.m39844c(context, C5706a.f16068v);
                iArr[2] = C0528i1.f1870i;
                iArr2[2] = C0528i1.m39844c(context, i);
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: l */
        private LayerDrawable m39820l(C0492c1 c0492c1, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable m39957j = c0492c1.m39957j(context, C5710e.f16102F);
            Drawable m39957j2 = c0492c1.m39957j(context, C5710e.f16103G);
            if ((m39957j instanceof BitmapDrawable) && m39957j.getIntrinsicWidth() == dimensionPixelSize && m39957j.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) m39957j;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                m39957j.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                m39957j.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((m39957j2 instanceof BitmapDrawable) && m39957j2.getIntrinsicWidth() == dimensionPixelSize && m39957j2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) m39957j2;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                m39957j2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                m39957j2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        /* renamed from: m */
        private void m39819m(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (C0550p0.m39770a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C0529j.f1872b;
            }
            drawable.setColorFilter(C0529j.m39836e(i, mode));
        }

        @Override // androidx.appcompat.widget.C0492c1.InterfaceC0498f
        /* renamed from: a */
        public Drawable mo39831a(C0492c1 c0492c1, Context context, int i) {
            if (i == C5710e.f16125j) {
                return new LayerDrawable(new Drawable[]{c0492c1.m39957j(context, C5710e.f16124i), c0492c1.m39957j(context, C5710e.f16126k)});
            }
            if (i == C5710e.f16140y) {
                return m39820l(c0492c1, context, C5709d.f16090i);
            }
            if (i == C5710e.f16139x) {
                return m39820l(c0492c1, context, C5709d.f16091j);
            }
            if (i == C5710e.f16141z) {
                return m39820l(c0492c1, context, C5709d.f16092k);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.C0492c1.InterfaceC0498f
        /* renamed from: b */
        public ColorStateList mo39830b(Context context, int i) {
            if (i == C5710e.f16128m) {
                return C6029a.m23854a(context, C5708c.f16078e);
            }
            if (i == C5710e.f16105I) {
                return C6029a.m23854a(context, C5708c.f16081h);
            }
            if (i == C5710e.f16104H) {
                return m39821k(context);
            }
            if (i == C5710e.f16121f) {
                return m39822j(context);
            }
            if (i == C5710e.f16117b) {
                return m39825g(context);
            }
            if (i == C5710e.f16120e) {
                return m39823i(context);
            }
            if (i != C5710e.f16100D && i != C5710e.f16101E) {
                if (m39826f(this.f1876b, i)) {
                    return C0528i1.m39842e(context, C5706a.f16070x);
                }
                if (m39826f(this.f1879e, i)) {
                    return C6029a.m23854a(context, C5708c.f16077d);
                }
                if (m39826f(this.f1880f, i)) {
                    return C6029a.m23854a(context, C5708c.f16076c);
                }
                if (i == C5710e.f16097A) {
                    return C6029a.m23854a(context, C5708c.f16079f);
                }
                return null;
            }
            return C6029a.m23854a(context, C5708c.f16080g);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x006c A[RETURN] */
        @Override // androidx.appcompat.widget.C0492c1.InterfaceC0498f
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean mo39829c(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
            /*
                r7 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0529j.m39840a()
                int[] r1 = r7.f1875a
                boolean r1 = r7.m39826f(r1, r9)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r9 = p052d.C5706a.f16070x
            L11:
                r1 = r0
                r5 = r2
            L13:
                r0 = r4
                goto L4f
            L15:
                int[] r1 = r7.f1877c
                boolean r1 = r7.m39826f(r1, r9)
                if (r1 == 0) goto L20
                int r9 = p052d.C5706a.f16068v
                goto L11
            L20:
                int[] r1 = r7.f1878d
                boolean r1 = r7.m39826f(r1, r9)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L32
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L2d:
                r1 = r0
                r0 = r4
                r9 = r5
                r5 = r2
                goto L4f
            L32:
                int r1 = p052d.C5710e.f16136u
                if (r9 != r1) goto L46
                r9 = 1109603123(0x42233333, float:40.8)
                int r9 = java.lang.Math.round(r9)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r5 = r2
                r6 = r0
                r0 = r9
                r9 = r1
                r1 = r6
                goto L4f
            L46:
                int r1 = p052d.C5710e.f16127l
                if (r9 != r1) goto L4b
                goto L2d
            L4b:
                r1 = r0
                r9 = r3
                r5 = r9
                goto L13
            L4f:
                if (r5 == 0) goto L6c
                boolean r3 = androidx.appcompat.widget.C0550p0.m39770a(r10)
                if (r3 == 0) goto L5b
                android.graphics.drawable.Drawable r10 = r10.mutate()
            L5b:
                int r8 = androidx.appcompat.widget.C0528i1.m39844c(r8, r9)
                android.graphics.PorterDuffColorFilter r8 = androidx.appcompat.widget.C0529j.m39836e(r8, r1)
                r10.setColorFilter(r8)
                if (r0 == r4) goto L6b
                r10.setAlpha(r0)
            L6b:
                return r2
            L6c:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0529j.C0530a.mo39829c(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.C0492c1.InterfaceC0498f
        /* renamed from: d */
        public PorterDuff.Mode mo39828d(int i) {
            if (i == C5710e.f16104H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.C0492c1.InterfaceC0498f
        /* renamed from: e */
        public boolean mo39827e(Context context, int i, Drawable drawable) {
            if (i == C5710e.f16099C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int i2 = C5706a.f16070x;
                m39819m(findDrawableByLayerId, C0528i1.m39844c(context, i2), C0529j.f1872b);
                m39819m(layerDrawable.findDrawableByLayerId(16908303), C0528i1.m39844c(context, i2), C0529j.f1872b);
                m39819m(layerDrawable.findDrawableByLayerId(16908301), C0528i1.m39844c(context, C5706a.f16068v), C0529j.f1872b);
                return true;
            } else if (i != C5710e.f16140y && i != C5710e.f16139x && i != C5710e.f16141z) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m39819m(layerDrawable2.findDrawableByLayerId(16908288), C0528i1.m39845b(context, C5706a.f16070x), C0529j.f1872b);
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908303);
                int i3 = C5706a.f16068v;
                m39819m(findDrawableByLayerId2, C0528i1.m39844c(context, i3), C0529j.f1872b);
                m39819m(layerDrawable2.findDrawableByLayerId(16908301), C0528i1.m39844c(context, i3), C0529j.f1872b);
                return true;
            }
        }
    }

    /* renamed from: b */
    public static synchronized C0529j m39839b() {
        C0529j c0529j;
        synchronized (C0529j.class) {
            if (f1873c == null) {
                m39833h();
            }
            c0529j = f1873c;
        }
        return c0529j;
    }

    /* renamed from: e */
    public static synchronized PorterDuffColorFilter m39836e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter m39955l;
        synchronized (C0529j.class) {
            m39955l = C0492c1.m39955l(i, mode);
        }
        return m39955l;
    }

    /* renamed from: h */
    public static synchronized void m39833h() {
        synchronized (C0529j.class) {
            if (f1873c == null) {
                C0529j c0529j = new C0529j();
                f1873c = c0529j;
                c0529j.f1874a = C0492c1.m39959h();
                f1873c.f1874a.m39946u(new C0530a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static void m39832i(Drawable drawable, C0538l1 c0538l1, int[] iArr) {
        C0492c1.m39944w(drawable, c0538l1, iArr);
    }

    /* renamed from: c */
    public synchronized Drawable m39838c(Context context, int i) {
        return this.f1874a.m39957j(context, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized Drawable m39837d(Context context, int i, boolean z) {
        return this.f1874a.m39956k(context, i, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized ColorStateList m39835f(Context context, int i) {
        return this.f1874a.m39954m(context, i);
    }

    /* renamed from: g */
    public synchronized void m39834g(Context context) {
        this.f1874a.m39948s(context);
    }
}
