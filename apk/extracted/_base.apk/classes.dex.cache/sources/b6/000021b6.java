package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.Arrays;
import p394w2.C13379j;

/* renamed from: com.facebook.drawee.drawable.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3612e extends C3607a {

    /* renamed from: A */
    int f9872A;

    /* renamed from: B */
    boolean[] f9873B;

    /* renamed from: C */
    int f9874C;

    /* renamed from: D */
    private InterfaceC3613a f9875D;

    /* renamed from: E */
    private boolean f9876E;

    /* renamed from: F */
    private boolean f9877F;

    /* renamed from: G */
    private boolean f9878G;

    /* renamed from: r */
    private final Drawable[] f9879r;

    /* renamed from: s */
    private final boolean f9880s;

    /* renamed from: t */
    private final int f9881t;

    /* renamed from: u */
    private final int f9882u;

    /* renamed from: v */
    int f9883v;

    /* renamed from: w */
    int f9884w;

    /* renamed from: x */
    long f9885x;

    /* renamed from: y */
    int[] f9886y;

    /* renamed from: z */
    int[] f9887z;

    /* renamed from: com.facebook.drawee.drawable.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC3613a {
        /* renamed from: a */
        void m31508a();

        /* renamed from: b */
        void m31507b();

        /* renamed from: c */
        void m31506c();
    }

    public C3612e(Drawable[] drawableArr, boolean z, int i) {
        super(drawableArr);
        this.f9878G = true;
        C13379j.m2674j(drawableArr.length >= 1, "At least one layer required!");
        this.f9879r = drawableArr;
        this.f9886y = new int[drawableArr.length];
        this.f9887z = new int[drawableArr.length];
        this.f9872A = 255;
        this.f9873B = new boolean[drawableArr.length];
        this.f9874C = 0;
        this.f9880s = z;
        this.f9881t = z ? 255 : 0;
        this.f9882u = i;
        m31511q();
    }

    /* renamed from: g */
    private void m31521g(Canvas canvas, Drawable drawable, int i) {
        if (drawable != null && i > 0) {
            this.f9874C++;
            if (this.f9878G) {
                drawable.mutate();
            }
            drawable.setAlpha(i);
            this.f9874C--;
            drawable.draw(canvas);
        }
    }

    /* renamed from: n */
    private void m31514n() {
        if (!this.f9876E) {
            return;
        }
        this.f9876E = false;
        InterfaceC3613a interfaceC3613a = this.f9875D;
        if (interfaceC3613a != null) {
            interfaceC3613a.m31506c();
        }
    }

    /* renamed from: o */
    private void m31513o() {
        int i;
        if (!this.f9876E && (i = this.f9882u) >= 0) {
            boolean[] zArr = this.f9873B;
            if (i >= zArr.length || !zArr[i]) {
                return;
            }
            this.f9876E = true;
            InterfaceC3613a interfaceC3613a = this.f9875D;
            if (interfaceC3613a != null) {
                interfaceC3613a.m31508a();
            }
        }
    }

    /* renamed from: p */
    private void m31512p() {
        if (this.f9877F && this.f9883v == 2 && this.f9873B[this.f9882u]) {
            InterfaceC3613a interfaceC3613a = this.f9875D;
            if (interfaceC3613a != null) {
                interfaceC3613a.m31507b();
            }
            this.f9877F = false;
        }
    }

    /* renamed from: q */
    private void m31511q() {
        this.f9883v = 2;
        Arrays.fill(this.f9886y, this.f9881t);
        this.f9886y[0] = 255;
        Arrays.fill(this.f9887z, this.f9881t);
        this.f9887z[0] = 255;
        Arrays.fill(this.f9873B, this.f9880s);
        this.f9873B[0] = true;
    }

    /* renamed from: s */
    private boolean m31509s(float f) {
        int i;
        boolean z = true;
        for (int i2 = 0; i2 < this.f9879r.length; i2++) {
            boolean z2 = this.f9873B[i2];
            if (z2) {
                i = 1;
            } else {
                i = -1;
            }
            int[] iArr = this.f9887z;
            int i3 = (int) (this.f9886y[i2] + (i * 255 * f));
            iArr[i2] = i3;
            if (i3 < 0) {
                iArr[i2] = 0;
            }
            if (iArr[i2] > 255) {
                iArr[i2] = 255;
            }
            if (z2 && iArr[i2] < 255) {
                z = false;
            }
            if (!z2 && iArr[i2] > 0) {
                z = false;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0056 A[LOOP:0: B:60:0x0051->B:62:0x0056, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0071 A[EDGE_INSN: B:67:0x0071->B:63:0x0071 ?: BREAK  , SYNTHETIC] */
    @Override // com.facebook.drawee.drawable.C3607a, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r9) {
        /*
            r8 = this;
            int r0 = r8.f9883v
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L2b
            if (r0 == r3) goto La
            goto L51
        La:
            int r0 = r8.f9884w
            if (r0 <= 0) goto L10
            r0 = r3
            goto L11
        L10:
            r0 = r2
        L11:
            p394w2.C13379j.m2675i(r0)
            long r4 = r8.m31515m()
            long r6 = r8.f9885x
            long r4 = r4 - r6
            float r0 = (float) r4
            int r4 = r8.f9884w
            float r4 = (float) r4
            float r0 = r0 / r4
            boolean r0 = r8.m31509s(r0)
            if (r0 == 0) goto L27
            goto L28
        L27:
            r1 = r3
        L28:
            r8.f9883v = r1
            goto L50
        L2b:
            int[] r0 = r8.f9887z
            int[] r4 = r8.f9886y
            android.graphics.drawable.Drawable[] r5 = r8.f9879r
            int r5 = r5.length
            java.lang.System.arraycopy(r0, r2, r4, r2, r5)
            long r4 = r8.m31515m()
            r8.f9885x = r4
            int r0 = r8.f9884w
            if (r0 != 0) goto L42
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L43
        L42:
            r0 = 0
        L43:
            boolean r0 = r8.m31509s(r0)
            r8.m31513o()
            if (r0 == 0) goto L4d
            goto L4e
        L4d:
            r1 = r3
        L4e:
            r8.f9883v = r1
        L50:
            r3 = r0
        L51:
            android.graphics.drawable.Drawable[] r0 = r8.f9879r
            int r1 = r0.length
            if (r2 >= r1) goto L71
            r0 = r0[r2]
            int[] r1 = r8.f9887z
            r1 = r1[r2]
            int r4 = r8.f9872A
            int r1 = r1 * r4
            double r4 = (double) r1
            r6 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r4 = r4 / r6
            double r4 = java.lang.Math.ceil(r4)
            int r1 = (int) r4
            r8.m31521g(r9, r0, r1)
            int r2 = r2 + 1
            goto L51
        L71:
            if (r3 == 0) goto L7a
            r8.m31514n()
            r8.m31512p()
            goto L7d
        L7a:
            r8.invalidateSelf()
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.drawable.C3612e.draw(android.graphics.Canvas):void");
    }

    /* renamed from: f */
    public void m31522f() {
        this.f9874C++;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f9872A;
    }

    /* renamed from: h */
    public void m31520h() {
        this.f9874C--;
        invalidateSelf();
    }

    /* renamed from: i */
    public void m31519i() {
        this.f9883v = 0;
        Arrays.fill(this.f9873B, true);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.f9874C == 0) {
            super.invalidateSelf();
        }
    }

    /* renamed from: j */
    public void m31518j(int i) {
        this.f9883v = 0;
        this.f9873B[i] = true;
        invalidateSelf();
    }

    /* renamed from: k */
    public void m31517k(int i) {
        this.f9883v = 0;
        this.f9873B[i] = false;
        invalidateSelf();
    }

    /* renamed from: l */
    public void m31516l() {
        int i;
        this.f9883v = 2;
        for (int i2 = 0; i2 < this.f9879r.length; i2++) {
            int[] iArr = this.f9887z;
            if (this.f9873B[i2]) {
                i = 255;
            } else {
                i = 0;
            }
            iArr[i2] = i;
        }
        invalidateSelf();
    }

    /* renamed from: m */
    protected long m31515m() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: r */
    public void m31510r(int i) {
        this.f9884w = i;
        if (this.f9883v == 1) {
            this.f9883v = 0;
        }
    }

    @Override // com.facebook.drawee.drawable.C3607a, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f9872A != i) {
            this.f9872A = i;
            invalidateSelf();
        }
    }
}