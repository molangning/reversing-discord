package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import bb.C2232g;
import bb.C2239k;

/* renamed from: com.google.android.material.textfield.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C4983d extends C2232g {

    /* renamed from: I */
    private final Paint f14039I;

    /* renamed from: J */
    private final RectF f14040J;

    C4983d() {
        this(null);
    }

    /* renamed from: p0 */
    private void m26664p0() {
        this.f14039I.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f14039I.setColor(-1);
        this.f14039I.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l0 */
    public boolean m26668l0() {
        return !this.f14040J.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m0 */
    public void m26667m0() {
        m26666n0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: n0 */
    void m26666n0(float f, float f2, float f3, float f4) {
        RectF rectF = this.f14040J;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o0 */
    public void m26665o0(RectF rectF) {
        m26666n0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bb.C2232g
    /* renamed from: r */
    public void mo26663r(Canvas canvas) {
        if (this.f14040J.isEmpty()) {
            super.mo26663r(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f14040J);
        } else {
            canvas.clipRect(this.f14040J, Region.Op.DIFFERENCE);
        }
        super.mo26663r(canvas);
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4983d(C2239k c2239k) {
        super(c2239k == null ? new C2239k() : c2239k);
        this.f14039I = new Paint(1);
        m26664p0();
        this.f14040J = new RectF();
    }
}
