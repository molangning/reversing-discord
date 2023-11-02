package com.facebook.drawee.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;
import p006a5.C0025b;

/* renamed from: com.facebook.drawee.drawable.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3618j extends AbstractC3622l {

    /* renamed from: M */
    private final Paint f9897M;

    /* renamed from: N */
    private final Paint f9898N;

    /* renamed from: O */
    private final Bitmap f9899O;

    /* renamed from: P */
    private WeakReference<Bitmap> f9900P;

    public C3618j(Resources resources, Bitmap bitmap, Paint paint) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.f9897M = paint2;
        Paint paint3 = new Paint(1);
        this.f9898N = paint3;
        this.f9899O = bitmap;
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: k */
    private void m31503k() {
        WeakReference<Bitmap> weakReference = this.f9900P;
        if (weakReference == null || weakReference.get() != this.f9899O) {
            this.f9900P = new WeakReference<>(this.f9899O);
            Paint paint = this.f9897M;
            Bitmap bitmap = this.f9899O;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            this.f9939o = true;
        }
        if (this.f9939o) {
            this.f9897M.getShader().setLocalMatrix(this.f9928G);
            this.f9939o = false;
        }
        this.f9897M.setFilterBitmap(m31494f());
    }

    @Override // com.facebook.drawee.drawable.AbstractC3622l, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (C0025b.m41375d()) {
            C0025b.m41378a("RoundedBitmapDrawable#draw");
        }
        if (!mo31492h()) {
            super.draw(canvas);
            if (C0025b.m41375d()) {
                C0025b.m41377b();
                return;
            }
            return;
        }
        m31490j();
        m31491i();
        m31503k();
        int save = canvas.save();
        canvas.concat(this.f9925D);
        canvas.drawPath(this.f9938n, this.f9897M);
        float f = this.f9937m;
        if (f > 0.0f) {
            this.f9898N.setStrokeWidth(f);
            this.f9898N.setColor(C3611d.m31525c(this.f9940p, this.f9897M.getAlpha()));
            canvas.drawPath(this.f9941q, this.f9898N);
        }
        canvas.restoreToCount(save);
        if (C0025b.m41375d()) {
            C0025b.m41377b();
        }
    }

    @Override // com.facebook.drawee.drawable.AbstractC3622l
    /* renamed from: h */
    public boolean mo31492h() {
        return super.mo31492h() && this.f9899O != null;
    }

    @Override // com.facebook.drawee.drawable.AbstractC3622l, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        super.setAlpha(i);
        if (i != this.f9897M.getAlpha()) {
            this.f9897M.setAlpha(i);
            super.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // com.facebook.drawee.drawable.AbstractC3622l, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f9897M.setColorFilter(colorFilter);
    }
}