package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import p394w2.C13379j;

/* renamed from: com.facebook.drawee.drawable.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class RunnableC3609b extends C3614f implements Runnable {

    /* renamed from: j */
    private int f9868j;

    /* renamed from: k */
    private boolean f9869k;

    /* renamed from: l */
    float f9870l;

    /* renamed from: m */
    private boolean f9871m;

    public RunnableC3609b(Drawable drawable, int i) {
        this(drawable, i, true);
    }

    /* renamed from: h */
    private int m31529h() {
        return (int) ((20.0f / this.f9868j) * 360.0f);
    }

    /* renamed from: i */
    private void m31528i() {
        if (!this.f9871m) {
            this.f9871m = true;
            scheduleSelf(this, SystemClock.uptimeMillis() + 20);
        }
    }

    @Override // com.facebook.drawee.drawable.C3614f, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = getBounds();
        int i = bounds.right;
        int i2 = bounds.left;
        int i3 = i - i2;
        int i4 = bounds.bottom;
        int i5 = bounds.top;
        int i6 = i4 - i5;
        float f = this.f9870l;
        if (!this.f9869k) {
            f = 360.0f - f;
        }
        canvas.rotate(f, i2 + (i3 / 2), i5 + (i6 / 2));
        super.draw(canvas);
        canvas.restoreToCount(save);
        m31528i();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f9871m = false;
        this.f9870l += m31529h();
        invalidateSelf();
    }

    public RunnableC3609b(Drawable drawable, int i, boolean z) {
        super((Drawable) C13379j.m2677g(drawable));
        this.f9870l = 0.0f;
        this.f9871m = false;
        this.f9868j = i;
        this.f9869k = z;
    }
}
