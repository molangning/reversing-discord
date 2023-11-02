package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.C1435k;
import androidx.core.widget.InterfaceC1446p;
import p052d.C5706a;
import p071e.C6029a;

/* renamed from: androidx.appcompat.widget.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0519g extends CheckedTextView implements InterfaceC1446p {

    /* renamed from: j */
    private final C0522h f1824j;

    /* renamed from: k */
    private final AppCompatBackgroundHelper f1825k;

    /* renamed from: l */
    private final AppCompatTextHelper f1826l;

    /* renamed from: m */
    private AppCompatEmojiTextHelper f1827m;

    public C0519g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5706a.f16065s);
    }

    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.f1827m == null) {
            this.f1827m = new AppCompatEmojiTextHelper(this);
        }
        return this.f1827m;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatTextHelper appCompatTextHelper = this.f1826l;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m40184b();
        }
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1825k;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40227b();
        }
        C0522h c0522h = this.f1824j;
        if (c0522h != null) {
            c0522h.m39884a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C1435k.m36865p(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1825k;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m40226c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1825k;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m40225d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0522h c0522h = this.f1824j;
        if (c0522h != null) {
            return c0522h.m39883b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0522h c0522h = this.f1824j;
        if (c0522h != null) {
            return c0522h.m39882c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1826l.m40176j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1826l.m40175k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0533k.m39809a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m40206d(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1825k;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40223f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1825k;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40222g(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0522h c0522h = this.f1824j;
        if (c0522h != null) {
            c0522h.m39880e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f1826l;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m40170p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f1826l;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m40170p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1435k.m36864q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m40205e(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1825k;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40220i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1825k;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40219j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0522h c0522h = this.f1824j;
        if (c0522h != null) {
            c0522h.m39879f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0522h c0522h = this.f1824j;
        if (c0522h != null) {
            c0522h.m39878g(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC1446p
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1826l.m40163w(colorStateList);
        this.f1826l.m40184b();
    }

    @Override // androidx.core.widget.InterfaceC1446p
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1826l.m40162x(mode);
        this.f1826l.m40184b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        AppCompatTextHelper appCompatTextHelper = this.f1826l;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m40169q(context, i);
        }
    }

    public C0519g(Context context, AttributeSet attributeSet, int i) {
        super(C0535k1.m39807b(context), attributeSet, i);
        C0528i1.m39846a(this, getContext());
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.f1826l = appCompatTextHelper;
        appCompatTextHelper.m40173m(attributeSet, i);
        appCompatTextHelper.m40184b();
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.f1825k = appCompatBackgroundHelper;
        appCompatBackgroundHelper.m40224e(attributeSet, i);
        C0522h c0522h = new C0522h(this);
        this.f1824j = c0522h;
        c0522h.m39881d(attributeSet, i);
        getEmojiTextViewHelper().m40207c(attributeSet, i);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C6029a.m23853b(getContext(), i));
    }
}
