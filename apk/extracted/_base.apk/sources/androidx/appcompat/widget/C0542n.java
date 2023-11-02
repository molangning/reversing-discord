package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import androidx.core.widget.InterfaceC1446p;
import p052d.C5706a;
import p071e.C6029a;

/* renamed from: androidx.appcompat.widget.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0542n extends MultiAutoCompleteTextView implements InterfaceC1446p {

    /* renamed from: m */
    private static final int[] f1893m = {16843126};

    /* renamed from: j */
    private final AppCompatBackgroundHelper f1894j;

    /* renamed from: k */
    private final AppCompatTextHelper f1895k;

    /* renamed from: l */
    private final AppCompatEmojiEditTextHelper f1896l;

    public C0542n(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5706a.f16062p);
    }

    /* renamed from: a */
    void m39803a(AppCompatEmojiEditTextHelper appCompatEmojiEditTextHelper) {
        KeyListener keyListener = getKeyListener();
        if (appCompatEmojiEditTextHelper.m40214b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener m40215a = appCompatEmojiEditTextHelper.m40215a(keyListener);
            if (m40215a == keyListener) {
                return;
            }
            super.setKeyListener(m40215a);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1894j;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40227b();
        }
        AppCompatTextHelper appCompatTextHelper = this.f1895k;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m40184b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1894j;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m40226c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1894j;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m40225d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1895k.m40176j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1895k.m40175k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f1896l.m40211e(C0533k.m39809a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1894j;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40223f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1894j;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40222g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f1895k;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m40170p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f1895k;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m40170p();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C6029a.m23853b(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f1896l.m40210f(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1896l.m40215a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1894j;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40220i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1894j;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40219j(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC1446p
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1895k.m40163w(colorStateList);
        this.f1895k.m40184b();
    }

    @Override // androidx.core.widget.InterfaceC1446p
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1895k.m40162x(mode);
        this.f1895k.m40184b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        AppCompatTextHelper appCompatTextHelper = this.f1895k;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m40169q(context, i);
        }
    }

    public C0542n(Context context, AttributeSet attributeSet, int i) {
        super(C0535k1.m39807b(context), attributeSet, i);
        C0528i1.m39846a(this, getContext());
        C0544n1 m39780v = C0544n1.m39780v(getContext(), attributeSet, f1893m, i, 0);
        if (m39780v.m39783s(0)) {
            setDropDownBackgroundDrawable(m39780v.m39795g(0));
        }
        m39780v.m39779w();
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.f1894j = appCompatBackgroundHelper;
        appCompatBackgroundHelper.m40224e(attributeSet, i);
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.f1895k = appCompatTextHelper;
        appCompatTextHelper.m40173m(attributeSet, i);
        appCompatTextHelper.m40184b();
        AppCompatEmojiEditTextHelper appCompatEmojiEditTextHelper = new AppCompatEmojiEditTextHelper(this);
        this.f1896l = appCompatEmojiEditTextHelper;
        appCompatEmojiEditTextHelper.m40212d(attributeSet, i);
        m39803a(appCompatEmojiEditTextHelper);
    }
}
