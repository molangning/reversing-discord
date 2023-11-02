package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.graphics.C1024e;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.widget.C1435k;
import androidx.core.widget.InterfaceC1446p;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p071e.C6029a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class AppCompatTextView extends TextView implements InterfaceC1446p {
    private final AppCompatBackgroundHelper mBackgroundTintHelper;
    private AppCompatEmojiTextHelper mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<PrecomputedTextCompat> mPrecomputedTextFuture;
    private SuperCaller mSuperCaller;
    private final AppCompatTextClassifierHelper mTextClassifierHelper;
    private final AppCompatTextHelper mTextHelper;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface SuperCaller {
        /* renamed from: a */
        void mo40148a(int[] iArr, int i);

        /* renamed from: b */
        void mo40138b(int i);

        /* renamed from: c */
        int mo40147c();

        /* renamed from: d */
        int mo40146d();

        /* renamed from: e */
        int[] mo40145e();

        /* renamed from: f */
        TextClassifier mo40144f();

        /* renamed from: g */
        int mo40143g();

        /* renamed from: h */
        void mo40142h(TextClassifier textClassifier);

        /* renamed from: i */
        void mo40141i(int i, int i2, int i3, int i4);

        /* renamed from: j */
        void mo40137j(int i);

        /* renamed from: k */
        int mo40140k();

        /* renamed from: l */
        void mo40139l(int i);
    }

    /* renamed from: androidx.appcompat.widget.AppCompatTextView$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0436a implements SuperCaller {
        C0436a() {
            AppCompatTextView.this = r1;
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        /* renamed from: a */
        public void mo40148a(int[] iArr, int i) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        /* renamed from: b */
        public void mo40138b(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        /* renamed from: c */
        public int mo40147c() {
            return AppCompatTextView.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        /* renamed from: d */
        public int mo40146d() {
            return AppCompatTextView.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        /* renamed from: e */
        public int[] mo40145e() {
            return AppCompatTextView.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        /* renamed from: f */
        public TextClassifier mo40144f() {
            return AppCompatTextView.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        /* renamed from: g */
        public int mo40143g() {
            return AppCompatTextView.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        /* renamed from: h */
        public void mo40142h(TextClassifier textClassifier) {
            AppCompatTextView.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        /* renamed from: i */
        public void mo40141i(int i, int i2, int i3, int i4) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        /* renamed from: j */
        public void mo40137j(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        /* renamed from: k */
        public int mo40140k() {
            return AppCompatTextView.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        /* renamed from: l */
        public void mo40139l(int i) {
            AppCompatTextView.super.setAutoSizeTextTypeWithDefaults(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatTextView$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0437b extends C0436a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0437b() {
            super();
            AppCompatTextView.this = r1;
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.C0436a, androidx.appcompat.widget.AppCompatTextView.SuperCaller
        /* renamed from: b */
        public void mo40138b(int i) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.C0436a, androidx.appcompat.widget.AppCompatTextView.SuperCaller
        /* renamed from: j */
        public void mo40137j(int i) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i);
        }
    }

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    private void consumeTextFutureAndSetBlocking() {
        Future<PrecomputedTextCompat> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                C1435k.m36868m(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new AppCompatEmojiTextHelper(this);
        }
        return this.mEmojiTextViewHelper;
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
    public int getAutoSizeMaxTextSize() {
        if (C0616y1.f2091b) {
            return getSuperCaller().mo40143g();
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.m40181e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (C0616y1.f2091b) {
            return getSuperCaller().mo40146d();
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.m40180f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (C0616y1.f2091b) {
            return getSuperCaller().mo40140k();
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.m40179g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (C0616y1.f2091b) {
            return getSuperCaller().mo40145e();
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.m40178h();
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (C0616y1.f2091b) {
            if (getSuperCaller().mo40147c() != 1) {
                return 0;
            }
            return 1;
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper == null) {
            return 0;
        }
        return appCompatTextHelper.m40177i();
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C1435k.m36865p(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return C1435k.m36879b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return C1435k.m36878c(this);
    }

    SuperCaller getSuperCaller() {
        if (this.mSuperCaller == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                this.mSuperCaller = new C0437b();
            } else if (i >= 26) {
                this.mSuperCaller = new C0436a();
            }
        }
        return this.mSuperCaller;
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
    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        AppCompatTextClassifierHelper appCompatTextClassifierHelper;
        if (Build.VERSION.SDK_INT < 28 && (appCompatTextClassifierHelper = this.mTextClassifierHelper) != null) {
            return appCompatTextClassifierHelper.m40191a();
        }
        return getSuperCaller().mo40144f();
    }

    public PrecomputedTextCompat.Params getTextMetricsParamsCompat() {
        return C1435k.m36875f(this);
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().m40208b();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.m40168r(this, onCreateInputConnection, editorInfo);
        return C0533k.m39809a(onCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m40171o(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        super.onTextChanged(charSequence, i, i2, i3);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null && !C0616y1.f2091b && appCompatTextHelper.m40174l()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.mTextHelper.m40183c();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m40206d(z);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (C0616y1.f2091b) {
            getSuperCaller().mo40141i(i, i2, i3, i4);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m40166t(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C0616y1.f2091b) {
            getSuperCaller().mo40148a(iArr, i);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m40165u(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C0616y1.f2091b) {
            getSuperCaller().mo40139l(i);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m40164v(i);
        }
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
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m40170p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
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
        getEmojiTextViewHelper().m40205e(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m40209a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo40137j(i);
        } else {
            C1435k.m36871j(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo40138b(i);
        } else {
            C1435k.m36870k(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        C1435k.m36869l(this, i);
    }

    public void setPrecomputedText(PrecomputedTextCompat precomputedTextCompat) {
        C1435k.m36868m(this, precomputedTextCompat);
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
            getSuperCaller().mo40142h(textClassifier);
        }
    }

    public void setTextFuture(Future<PrecomputedTextCompat> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(PrecomputedTextCompat.Params params) {
        C1435k.m36866o(this, params);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (C0616y1.f2091b) {
            super.setTextSize(i, f);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m40188A(i, f);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        if (typeface != null && i > 0) {
            typeface2 = C1024e.m38055a(getContext(), typeface, i);
        } else {
            typeface2 = null;
        }
        this.mIsSetTypefaceProcessing = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0535k1.m39807b(context), attributeSet, i);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        C0528i1.m39846a(this, getContext());
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.mBackgroundTintHelper = appCompatBackgroundHelper;
        appCompatBackgroundHelper.m40224e(attributeSet, i);
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.mTextHelper = appCompatTextHelper;
        appCompatTextHelper.m40173m(attributeSet, i);
        appCompatTextHelper.m40184b();
        this.mTextClassifierHelper = new AppCompatTextClassifierHelper(this);
        getEmojiTextViewHelper().m40207c(attributeSet, i);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? C6029a.m23853b(context, i) : null, i2 != 0 ? C6029a.m23853b(context, i2) : null, i3 != 0 ? C6029a.m23853b(context, i3) : null, i4 != 0 ? C6029a.m23853b(context, i4) : null);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m40170p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? C6029a.m23853b(context, i) : null, i2 != 0 ? C6029a.m23853b(context, i2) : null, i3 != 0 ? C6029a.m23853b(context, i3) : null, i4 != 0 ? C6029a.m23853b(context, i4) : null);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m40170p();
        }
    }
}