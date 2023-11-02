package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;
import p006a5.C0025b;

/* renamed from: com.facebook.drawee.drawable.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3623m extends AbstractC3622l {
    public C3623m(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
    }

    @Override // com.facebook.drawee.drawable.AbstractC3622l, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (C0025b.m41375d()) {
            C0025b.m41378a("RoundedNinePatchDrawable#draw");
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
        canvas.clipPath(this.f9938n);
        super.draw(canvas);
        if (C0025b.m41375d()) {
            C0025b.m41377b();
        }
    }
}
