package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import p052d.C5706a;

/* renamed from: androidx.appcompat.widget.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0536l extends ImageButton {

    /* renamed from: j */
    private final AppCompatBackgroundHelper f1885j;

    /* renamed from: k */
    private final AppCompatImageHelper f1886k;

    /* renamed from: l */
    private boolean f1887l;

    public C0536l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5706a.f16034C);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1885j;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40227b();
        }
        AppCompatImageHelper appCompatImageHelper = this.f1886k;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.m40201c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1885j;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m40226c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1885j;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m40225d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        AppCompatImageHelper appCompatImageHelper = this.f1886k;
        if (appCompatImageHelper != null) {
            return appCompatImageHelper.m40200d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        AppCompatImageHelper appCompatImageHelper = this.f1886k;
        if (appCompatImageHelper != null) {
            return appCompatImageHelper.m40199e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f1886k.m40198f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1885j;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40223f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1885j;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40222g(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        AppCompatImageHelper appCompatImageHelper = this.f1886k;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.m40201c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        AppCompatImageHelper appCompatImageHelper = this.f1886k;
        if (appCompatImageHelper != null && drawable != null && !this.f1887l) {
            appCompatImageHelper.m40196h(drawable);
        }
        super.setImageDrawable(drawable);
        AppCompatImageHelper appCompatImageHelper2 = this.f1886k;
        if (appCompatImageHelper2 != null) {
            appCompatImageHelper2.m40201c();
            if (!this.f1887l) {
                this.f1886k.m40202b();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f1887l = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f1886k.m40195i(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        AppCompatImageHelper appCompatImageHelper = this.f1886k;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.m40201c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1885j;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40220i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1885j;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40219j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        AppCompatImageHelper appCompatImageHelper = this.f1886k;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.m40194j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        AppCompatImageHelper appCompatImageHelper = this.f1886k;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.m40193k(mode);
        }
    }

    public C0536l(Context context, AttributeSet attributeSet, int i) {
        super(C0535k1.m39807b(context), attributeSet, i);
        this.f1887l = false;
        C0528i1.m39846a(this, getContext());
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.f1885j = appCompatBackgroundHelper;
        appCompatBackgroundHelper.m40224e(attributeSet, i);
        AppCompatImageHelper appCompatImageHelper = new AppCompatImageHelper(this);
        this.f1886k = appCompatImageHelper;
        appCompatImageHelper.m40197g(attributeSet, i);
    }
}
