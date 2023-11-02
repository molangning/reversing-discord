package com.google.android.exoplayer2.p049ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p195k8.C9149a;
import p195k8.C9191p0;
import p383v7.C13126a;
import p383v7.C13127b;

/* renamed from: com.google.android.exoplayer2.ui.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C4506f {

    /* renamed from: A */
    private int f12180A;

    /* renamed from: B */
    private int f12181B;

    /* renamed from: C */
    private int f12182C;

    /* renamed from: D */
    private int f12183D;

    /* renamed from: E */
    private StaticLayout f12184E;

    /* renamed from: F */
    private StaticLayout f12185F;

    /* renamed from: G */
    private int f12186G;

    /* renamed from: H */
    private int f12187H;

    /* renamed from: I */
    private int f12188I;

    /* renamed from: J */
    private Rect f12189J;

    /* renamed from: a */
    private final float f12190a;

    /* renamed from: b */
    private final float f12191b;

    /* renamed from: c */
    private final float f12192c;

    /* renamed from: d */
    private final float f12193d;

    /* renamed from: e */
    private final float f12194e;

    /* renamed from: f */
    private final TextPaint f12195f;

    /* renamed from: g */
    private final Paint f12196g;

    /* renamed from: h */
    private final Paint f12197h;

    /* renamed from: i */
    private CharSequence f12198i;

    /* renamed from: j */
    private Layout.Alignment f12199j;

    /* renamed from: k */
    private Bitmap f12200k;

    /* renamed from: l */
    private float f12201l;

    /* renamed from: m */
    private int f12202m;

    /* renamed from: n */
    private int f12203n;

    /* renamed from: o */
    private float f12204o;

    /* renamed from: p */
    private int f12205p;

    /* renamed from: q */
    private float f12206q;

    /* renamed from: r */
    private float f12207r;

    /* renamed from: s */
    private int f12208s;

    /* renamed from: t */
    private int f12209t;

    /* renamed from: u */
    private int f12210u;

    /* renamed from: v */
    private int f12211v;

    /* renamed from: w */
    private int f12212w;

    /* renamed from: x */
    private float f12213x;

    /* renamed from: y */
    private float f12214y;

    /* renamed from: z */
    private float f12215z;

    public C4506f(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16843287, 16843288}, 0, 0);
        this.f12194e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f12193d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f12190a = round;
        this.f12191b = round;
        this.f12192c = round;
        TextPaint textPaint = new TextPaint();
        this.f12195f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f12196g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f12197h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* renamed from: a */
    private static boolean m28806a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    @RequiresNonNull({"cueBitmap", "bitmapRect"})
    /* renamed from: c */
    private void m28804c(Canvas canvas) {
        canvas.drawBitmap(this.f12200k, (Rect) null, this.f12189J, this.f12197h);
    }

    /* renamed from: d */
    private void m28803d(Canvas canvas, boolean z) {
        if (z) {
            m28802e(canvas);
            return;
        }
        C9149a.m16448e(this.f12189J);
        C9149a.m16448e(this.f12200k);
        m28804c(canvas);
    }

    /* renamed from: e */
    private void m28802e(Canvas canvas) {
        int i;
        StaticLayout staticLayout = this.f12184E;
        StaticLayout staticLayout2 = this.f12185F;
        if (staticLayout != null && staticLayout2 != null) {
            int save = canvas.save();
            canvas.translate(this.f12186G, this.f12187H);
            if (Color.alpha(this.f12210u) > 0) {
                this.f12196g.setColor(this.f12210u);
                canvas.drawRect(-this.f12188I, 0.0f, staticLayout.getWidth() + this.f12188I, staticLayout.getHeight(), this.f12196g);
            }
            int i2 = this.f12212w;
            boolean z = true;
            if (i2 == 1) {
                this.f12195f.setStrokeJoin(Paint.Join.ROUND);
                this.f12195f.setStrokeWidth(this.f12190a);
                this.f12195f.setColor(this.f12211v);
                this.f12195f.setStyle(Paint.Style.FILL_AND_STROKE);
                staticLayout2.draw(canvas);
            } else if (i2 == 2) {
                TextPaint textPaint = this.f12195f;
                float f = this.f12191b;
                float f2 = this.f12192c;
                textPaint.setShadowLayer(f, f2, f2, this.f12211v);
            } else if (i2 == 3 || i2 == 4) {
                if (i2 != 3) {
                    z = false;
                }
                int i3 = -1;
                if (z) {
                    i = -1;
                } else {
                    i = this.f12211v;
                }
                if (z) {
                    i3 = this.f12211v;
                }
                float f3 = this.f12191b / 2.0f;
                this.f12195f.setColor(this.f12208s);
                this.f12195f.setStyle(Paint.Style.FILL);
                float f4 = -f3;
                this.f12195f.setShadowLayer(this.f12191b, f4, f4, i);
                staticLayout2.draw(canvas);
                this.f12195f.setShadowLayer(this.f12191b, f3, f3, i3);
            }
            this.f12195f.setColor(this.f12208s);
            this.f12195f.setStyle(Paint.Style.FILL);
            staticLayout.draw(canvas);
            this.f12195f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            canvas.restoreToCount(save);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"cueBitmap"})
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m28801f() {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.f12200k
            int r1 = r7.f12182C
            int r2 = r7.f12180A
            int r1 = r1 - r2
            int r3 = r7.f12183D
            int r4 = r7.f12181B
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r7.f12204o
            float r5 = r5 * r1
            float r2 = r2 + r5
            float r4 = (float) r4
            float r3 = (float) r3
            float r5 = r7.f12201l
            float r5 = r5 * r3
            float r4 = r4 + r5
            float r5 = r7.f12206q
            float r1 = r1 * r5
            int r1 = java.lang.Math.round(r1)
            float r5 = r7.f12207r
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L2e
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
            goto L3f
        L2e:
            float r3 = (float) r1
            int r5 = r0.getHeight()
            float r5 = (float) r5
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
        L3f:
            int r3 = r7.f12205p
            r5 = 1
            r6 = 2
            if (r3 != r6) goto L48
            float r3 = (float) r1
        L46:
            float r2 = r2 - r3
            goto L4e
        L48:
            if (r3 != r5) goto L4e
            int r3 = r1 / 2
            float r3 = (float) r3
            goto L46
        L4e:
            int r2 = java.lang.Math.round(r2)
            int r3 = r7.f12203n
            if (r3 != r6) goto L59
            float r3 = (float) r0
        L57:
            float r4 = r4 - r3
            goto L5f
        L59:
            if (r3 != r5) goto L5f
            int r3 = r0 / 2
            float r3 = (float) r3
            goto L57
        L5f:
            int r3 = java.lang.Math.round(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r1 = r1 + r2
            int r0 = r0 + r3
            r4.<init>(r2, r3, r1, r0)
            r7.f12189J = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p049ui.C4506f.m28801f():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a2  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"cueText"})
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m28800g() {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p049ui.C4506f.m28800g():void");
    }

    /* renamed from: b */
    public void m28805b(C13127b c13127b, C13126a c13126a, float f, float f2, float f3, Canvas canvas, int i, int i2, int i3, int i4) {
        boolean z;
        int i5;
        if (c13127b.f34104c == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (TextUtils.isEmpty(c13127b.f34102a)) {
                return;
            }
            if (c13127b.f34112k) {
                i5 = c13127b.f34113l;
            } else {
                i5 = c13126a.f34097c;
            }
        } else {
            i5 = -16777216;
        }
        if (m28806a(this.f12198i, c13127b.f34102a) && C9191p0.m16257c(this.f12199j, c13127b.f34103b) && this.f12200k == c13127b.f34104c && this.f12201l == c13127b.f34105d && this.f12202m == c13127b.f34106e && C9191p0.m16257c(Integer.valueOf(this.f12203n), Integer.valueOf(c13127b.f34107f)) && this.f12204o == c13127b.f34108g && C9191p0.m16257c(Integer.valueOf(this.f12205p), Integer.valueOf(c13127b.f34109h)) && this.f12206q == c13127b.f34110i && this.f12207r == c13127b.f34111j && this.f12208s == c13126a.f34095a && this.f12209t == c13126a.f34096b && this.f12210u == i5 && this.f12212w == c13126a.f34098d && this.f12211v == c13126a.f34099e && C9191p0.m16257c(this.f12195f.getTypeface(), c13126a.f34100f) && this.f12213x == f && this.f12214y == f2 && this.f12215z == f3 && this.f12180A == i && this.f12181B == i2 && this.f12182C == i3 && this.f12183D == i4) {
            m28803d(canvas, z);
            return;
        }
        this.f12198i = c13127b.f34102a;
        this.f12199j = c13127b.f34103b;
        this.f12200k = c13127b.f34104c;
        this.f12201l = c13127b.f34105d;
        this.f12202m = c13127b.f34106e;
        this.f12203n = c13127b.f34107f;
        this.f12204o = c13127b.f34108g;
        this.f12205p = c13127b.f34109h;
        this.f12206q = c13127b.f34110i;
        this.f12207r = c13127b.f34111j;
        this.f12208s = c13126a.f34095a;
        this.f12209t = c13126a.f34096b;
        this.f12210u = i5;
        this.f12212w = c13126a.f34098d;
        this.f12211v = c13126a.f34099e;
        this.f12195f.setTypeface(c13126a.f34100f);
        this.f12213x = f;
        this.f12214y = f2;
        this.f12215z = f3;
        this.f12180A = i;
        this.f12181B = i2;
        this.f12182C = i3;
        this.f12183D = i4;
        if (z) {
            C9149a.m16448e(this.f12198i);
            m28800g();
        } else {
            C9149a.m16448e(this.f12200k);
            m28801f();
        }
        m28803d(canvas, z);
    }
}
