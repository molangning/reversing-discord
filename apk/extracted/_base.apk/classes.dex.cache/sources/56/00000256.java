package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import androidx.core.widget.InterfaceC1446p;

/* renamed from: androidx.appcompat.widget.i0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0527i0 extends ToggleButton implements InterfaceC1446p {

    /* renamed from: j */
    private final AppCompatBackgroundHelper f1859j;

    /* renamed from: k */
    private final AppCompatTextHelper f1860k;

    /* renamed from: l */
    private AppCompatEmojiTextHelper f1861l;

    public C0527i0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.f1861l == null) {
            this.f1861l = new AppCompatEmojiTextHelper(this);
        }
        return this.f1861l;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1859j;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40227b();
        }
        AppCompatTextHelper appCompatTextHelper = this.f1860k;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m40184b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1859j;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m40226c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1859j;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m40225d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1860k.m40176j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1860k.m40175k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m40206d(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1859j;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40223f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1859j;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40222g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f1860k;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m40170p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f1860k;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m40170p();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m40205e(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m40209a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1859j;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40220i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1859j;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40219j(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC1446p
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1860k.m40163w(colorStateList);
        this.f1860k.m40184b();
    }

    @Override // androidx.core.widget.InterfaceC1446p
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1860k.m40162x(mode);
        this.f1860k.m40184b();
    }

    public C0527i0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0528i1.m39846a(this, getContext());
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.f1859j = appCompatBackgroundHelper;
        appCompatBackgroundHelper.m40224e(attributeSet, i);
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.f1860k = appCompatTextHelper;
        appCompatTextHelper.m40173m(attributeSet, i);
        getEmojiTextViewHelper().m40207c(attributeSet, i);
    }
}