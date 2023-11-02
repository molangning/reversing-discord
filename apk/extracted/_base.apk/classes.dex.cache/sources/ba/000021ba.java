package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.drawee.drawable.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3616h extends C3614f {

    /* renamed from: j */
    final Matrix f9892j;

    /* renamed from: k */
    private int f9893k;

    /* renamed from: l */
    private int f9894l;

    /* renamed from: m */
    private final Matrix f9895m;

    /* renamed from: n */
    private final RectF f9896n;

    public C3616h(Drawable drawable, int i, int i2) {
        super(drawable);
        this.f9895m = new Matrix();
        this.f9896n = new RectF();
        this.f9892j = new Matrix();
        this.f9893k = i - (i % 90);
        this.f9894l = (i2 < 0 || i2 > 8) ? 0 : 0;
    }

    @Override // com.facebook.drawee.drawable.C3614f, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        if (this.f9893k <= 0 && ((i = this.f9894l) == 0 || i == 1)) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.concat(this.f9892j);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // com.facebook.drawee.drawable.C3614f, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i = this.f9894l;
        if (i != 5 && i != 7 && this.f9893k % 180 == 0) {
            return super.getIntrinsicHeight();
        }
        return super.getIntrinsicWidth();
    }

    @Override // com.facebook.drawee.drawable.C3614f, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i = this.f9894l;
        if (i != 5 && i != 7 && this.f9893k % 180 == 0) {
            return super.getIntrinsicWidth();
        }
        return super.getIntrinsicHeight();
    }

    @Override // com.facebook.drawee.drawable.C3614f, com.facebook.drawee.drawable.TransformCallback
    public void getTransform(Matrix matrix) {
        getParentTransform(matrix);
        if (!this.f9892j.isIdentity()) {
            matrix.preConcat(this.f9892j);
        }
    }

    @Override // com.facebook.drawee.drawable.C3614f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        int i;
        Drawable current = getCurrent();
        int i2 = this.f9893k;
        if (i2 <= 0 && ((i = this.f9894l) == 0 || i == 1)) {
            current.setBounds(rect);
            return;
        }
        int i3 = this.f9894l;
        if (i3 != 2) {
            if (i3 != 7) {
                if (i3 != 4) {
                    if (i3 != 5) {
                        this.f9892j.setRotate(i2, rect.centerX(), rect.centerY());
                    } else {
                        this.f9892j.setRotate(270.0f, rect.centerX(), rect.centerY());
                        this.f9892j.postScale(1.0f, -1.0f);
                    }
                } else {
                    this.f9892j.setScale(1.0f, -1.0f);
                }
            } else {
                this.f9892j.setRotate(270.0f, rect.centerX(), rect.centerY());
                this.f9892j.postScale(-1.0f, 1.0f);
            }
        } else {
            this.f9892j.setScale(-1.0f, 1.0f);
        }
        this.f9895m.reset();
        this.f9892j.invert(this.f9895m);
        this.f9896n.set(rect);
        this.f9895m.mapRect(this.f9896n);
        RectF rectF = this.f9896n;
        current.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}