package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.appcompat.widget.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C0479b extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f1730a;

    /* renamed from: androidx.appcompat.widget.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static class C0480a {
        /* renamed from: a */
        public static void m40006a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public C0479b(ActionBarContainer actionBarContainer) {
        this.f1730a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1730a;
        if (actionBarContainer.f1451q) {
            Drawable drawable = actionBarContainer.f1450p;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1448n;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f1730a;
        Drawable drawable3 = actionBarContainer2.f1449o;
        if (drawable3 != null && actionBarContainer2.f1452r) {
            drawable3.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f1730a;
        if (actionBarContainer.f1451q) {
            if (actionBarContainer.f1450p != null) {
                C0480a.m40006a(actionBarContainer.f1448n, outline);
                return;
            }
            return;
        }
        Drawable drawable = actionBarContainer.f1448n;
        if (drawable != null) {
            C0480a.m40006a(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}