package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.drawee.drawable.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3615g extends C3614f {

    /* renamed from: j */
    private Matrix f9888j;

    /* renamed from: k */
    private Matrix f9889k;

    /* renamed from: l */
    private int f9890l;

    /* renamed from: m */
    private int f9891m;

    /* renamed from: h */
    private void m31505h() {
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f9890l = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f9891m = intrinsicHeight;
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            this.f9889k = this.f9888j;
            return;
        }
        current.setBounds(bounds);
        this.f9889k = null;
    }

    /* renamed from: i */
    private void m31504i() {
        if (this.f9890l != getCurrent().getIntrinsicWidth() || this.f9891m != getCurrent().getIntrinsicHeight()) {
            m31505h();
        }
    }

    @Override // com.facebook.drawee.drawable.C3614f, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        m31504i();
        if (this.f9889k != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.f9889k);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    @Override // com.facebook.drawee.drawable.C3614f, com.facebook.drawee.drawable.TransformCallback
    public void getTransform(Matrix matrix) {
        super.getTransform(matrix);
        Matrix matrix2 = this.f9889k;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    @Override // com.facebook.drawee.drawable.C3614f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m31505h();
    }

    @Override // com.facebook.drawee.drawable.C3614f
    public Drawable setCurrent(Drawable drawable) {
        Drawable current = super.setCurrent(drawable);
        m31505h();
        return current;
    }
}