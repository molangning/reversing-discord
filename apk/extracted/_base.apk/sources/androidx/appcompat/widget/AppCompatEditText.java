package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.view.C1365w0;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.InterfaceC1338t0;
import androidx.core.widget.C1435k;
import androidx.core.widget.InterfaceC1446p;
import androidx.core.widget.TextViewOnReceiveContentListener;
import p052d.C5706a;
import p452z.C14046d;
import p452z.C14049f;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class AppCompatEditText extends EditText implements InterfaceC1338t0, InterfaceC1446p {
    private final AppCompatEmojiEditTextHelper mAppCompatEmojiEditTextHelper;
    private final AppCompatBackgroundHelper mBackgroundTintHelper;
    private final TextViewOnReceiveContentListener mDefaultOnReceiveContentListener;
    private SuperCaller mSuperCaller;
    private final AppCompatTextClassifierHelper mTextClassifierHelper;
    private final AppCompatTextHelper mTextHelper;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class SuperCaller {
        SuperCaller() {
        }

        /* renamed from: a */
        public TextClassifier m40217a() {
            return AppCompatEditText.super.getTextClassifier();
        }

        /* renamed from: b */
        public void m40216b(TextClassifier textClassifier) {
            AppCompatEditText.super.setTextClassifier(textClassifier);
        }
    }

    public AppCompatEditText(Context context) {
        this(context, null);
    }

    private SuperCaller getSuperCaller() {
        if (this.mSuperCaller == null) {
            this.mSuperCaller = new SuperCaller();
        }
        return this.mSuperCaller;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40227b();
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m40184b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C1435k.m36865p(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m40226c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m40225d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.m40176j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.m40175k();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        AppCompatTextClassifierHelper appCompatTextClassifierHelper;
        if (Build.VERSION.SDK_INT < 28 && (appCompatTextClassifierHelper = this.mTextClassifierHelper) != null) {
            return appCompatTextClassifierHelper.m40191a();
        }
        return getSuperCaller().m40217a();
    }

    void initEmojiKeyListener(AppCompatEmojiEditTextHelper appCompatEmojiEditTextHelper) {
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

    public boolean isEmojiCompatEnabled() {
        return this.mAppCompatEmojiEditTextHelper.m40213c();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] m37252E;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.m40168r(this, onCreateInputConnection, editorInfo);
        InputConnection m39809a = C0533k.m39809a(onCreateInputConnection, editorInfo, this);
        if (m39809a != null && Build.VERSION.SDK_INT <= 30 && (m37252E = C1365w0.m37252E(this)) != null) {
            C14046d.m824d(editorInfo, m37252E);
            m39809a = C14049f.m816c(this, m39809a, editorInfo);
        }
        return this.mAppCompatEmojiEditTextHelper.m40211e(m39809a, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (C0572t.m39700a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // androidx.core.view.InterfaceC1338t0
    public ContentInfoCompat onReceiveContent(ContentInfoCompat contentInfoCompat) {
        return this.mDefaultOnReceiveContentListener.mo32087a(this, contentInfoCompat);
    }

    @Override // android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (C0572t.m39699b(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40223f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40222g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m40170p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m40170p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1435k.m36864q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.mAppCompatEmojiEditTextHelper.m40210f(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.mAppCompatEmojiEditTextHelper.m40215a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40220i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m40219j(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC1446p
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.m40163w(colorStateList);
        this.mTextHelper.m40184b();
    }

    @Override // androidx.core.widget.InterfaceC1446p
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.m40162x(mode);
        this.mTextHelper.m40184b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m40169q(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        AppCompatTextClassifierHelper appCompatTextClassifierHelper;
        if (Build.VERSION.SDK_INT < 28 && (appCompatTextClassifierHelper = this.mTextClassifierHelper) != null) {
            appCompatTextClassifierHelper.m40190b(textClassifier);
        } else {
            getSuperCaller().m40216b(textClassifier);
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5706a.f16033B);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(C0535k1.m39807b(context), attributeSet, i);
        C0528i1.m39846a(this, getContext());
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.mBackgroundTintHelper = appCompatBackgroundHelper;
        appCompatBackgroundHelper.m40224e(attributeSet, i);
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.mTextHelper = appCompatTextHelper;
        appCompatTextHelper.m40173m(attributeSet, i);
        appCompatTextHelper.m40184b();
        this.mTextClassifierHelper = new AppCompatTextClassifierHelper(this);
        this.mDefaultOnReceiveContentListener = new TextViewOnReceiveContentListener();
        AppCompatEmojiEditTextHelper appCompatEmojiEditTextHelper = new AppCompatEmojiEditTextHelper(this);
        this.mAppCompatEmojiEditTextHelper = appCompatEmojiEditTextHelper;
        appCompatEmojiEditTextHelper.m40212d(attributeSet, i);
        initEmojiKeyListener(appCompatEmojiEditTextHelper);
    }
}
