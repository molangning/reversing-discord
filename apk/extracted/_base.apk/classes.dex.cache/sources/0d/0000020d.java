package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C1013a;
import androidx.core.view.C1365w0;
import androidx.core.widget.C1435k;
import androidx.emoji2.text.C1500e;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import p052d.C5706a;
import p052d.C5713h;
import p052d.C5715j;
import p071e.C6029a;
import p123h.C6857a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class SwitchCompat extends CompoundButton {
    private static final String ACCESSIBILITY_EVENT_CLASS_NAME = "android.widget.Switch";
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int THUMB_ANIMATION_DURATION = 250;
    private static final int TOUCH_MODE_DOWN = 1;
    private static final int TOUCH_MODE_DRAGGING = 2;
    private static final int TOUCH_MODE_IDLE = 0;
    private AppCompatEmojiTextHelper mAppCompatEmojiTextHelper;
    private EmojiCompatInitCallback mEmojiCompatInitCallback;
    private boolean mEnforceSwitchWidth;
    private boolean mHasThumbTint;
    private boolean mHasThumbTintMode;
    private boolean mHasTrackTint;
    private boolean mHasTrackTintMode;
    private int mMinFlingVelocity;
    private Layout mOffLayout;
    private Layout mOnLayout;
    ObjectAnimator mPositionAnimator;
    private boolean mShowText;
    private boolean mSplitTrack;
    private int mSwitchBottom;
    private int mSwitchHeight;
    private int mSwitchLeft;
    private int mSwitchMinWidth;
    private int mSwitchPadding;
    private int mSwitchRight;
    private int mSwitchTop;
    private TransformationMethod mSwitchTransformationMethod;
    private int mSwitchWidth;
    private final Rect mTempRect;
    private ColorStateList mTextColors;
    private final AppCompatTextHelper mTextHelper;
    private CharSequence mTextOff;
    private CharSequence mTextOffTransformed;
    private CharSequence mTextOn;
    private CharSequence mTextOnTransformed;
    private final TextPaint mTextPaint;
    private Drawable mThumbDrawable;
    float mThumbPosition;
    private int mThumbTextPadding;
    private ColorStateList mThumbTintList;
    private PorterDuff.Mode mThumbTintMode;
    private int mThumbWidth;
    private int mTouchMode;
    private int mTouchSlop;
    private float mTouchX;
    private float mTouchY;
    private Drawable mTrackDrawable;
    private ColorStateList mTrackTintList;
    private PorterDuff.Mode mTrackTintMode;
    private VelocityTracker mVelocityTracker;
    private static final Property<SwitchCompat, Float> THUMB_POS = new C0458a(Float.class, "thumbPos");
    private static final int[] CHECKED_STATE_SET = {16842912};

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class EmojiCompatInitCallback extends C1500e.AbstractC1506e {

        /* renamed from: a */
        private final Reference<SwitchCompat> f1652a;

        EmojiCompatInitCallback(SwitchCompat switchCompat) {
            this.f1652a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.C1500e.AbstractC1506e
        /* renamed from: a */
        public void mo36629a(Throwable th2) {
            SwitchCompat switchCompat = this.f1652a.get();
            if (switchCompat != null) {
                switchCompat.onEmojiCompatInitializedForSwitchText();
            }
        }

        @Override // androidx.emoji2.text.C1500e.AbstractC1506e
        /* renamed from: b */
        public void mo23013b() {
            SwitchCompat switchCompat = this.f1652a.get();
            if (switchCompat != null) {
                switchCompat.onEmojiCompatInitializedForSwitchText();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SwitchCompat$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C0458a extends Property<SwitchCompat, Float> {
        C0458a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.mThumbPosition);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    /* renamed from: androidx.appcompat.widget.SwitchCompat$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0459b {
        /* renamed from: a */
        static void m40080a(ObjectAnimator objectAnimator, boolean z) {
            objectAnimator.setAutoCancel(z);
        }
    }

    public SwitchCompat(Context context) {
        this(context, null);
    }

    private void animateThumbToCheckedState(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, THUMB_POS, f);
        this.mPositionAnimator = ofFloat;
        ofFloat.setDuration(250L);
        C0459b.m40080a(this.mPositionAnimator, true);
        this.mPositionAnimator.start();
    }

    private void applyThumbTint() {
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            if (this.mHasThumbTint || this.mHasThumbTintMode) {
                Drawable mutate = C1013a.m38080r(drawable).mutate();
                this.mThumbDrawable = mutate;
                if (this.mHasThumbTint) {
                    C1013a.m38083o(mutate, this.mThumbTintList);
                }
                if (this.mHasThumbTintMode) {
                    C1013a.m38082p(this.mThumbDrawable, this.mThumbTintMode);
                }
                if (this.mThumbDrawable.isStateful()) {
                    this.mThumbDrawable.setState(getDrawableState());
                }
            }
        }
    }

    private void applyTrackTint() {
        Drawable drawable = this.mTrackDrawable;
        if (drawable != null) {
            if (this.mHasTrackTint || this.mHasTrackTintMode) {
                Drawable mutate = C1013a.m38080r(drawable).mutate();
                this.mTrackDrawable = mutate;
                if (this.mHasTrackTint) {
                    C1013a.m38083o(mutate, this.mTrackTintList);
                }
                if (this.mHasTrackTintMode) {
                    C1013a.m38082p(this.mTrackDrawable, this.mTrackTintMode);
                }
                if (this.mTrackDrawable.isStateful()) {
                    this.mTrackDrawable.setState(getDrawableState());
                }
            }
        }
    }

    private void cancelPositionAnimator() {
        ObjectAnimator objectAnimator = this.mPositionAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void cancelSuperTouch(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    private static float constrain(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    private CharSequence doTransformForOnOffText(CharSequence charSequence) {
        TransformationMethod m40204f = getEmojiTextViewHelper().m40204f(this.mSwitchTransformationMethod);
        if (m40204f != null) {
            return m40204f.getTransformation(charSequence, this);
        }
        return charSequence;
    }

    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new AppCompatEmojiTextHelper(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    private boolean getTargetCheckedState() {
        return this.mThumbPosition > 0.5f;
    }

    private int getThumbOffset() {
        float f;
        if (C0616y1.m39572b(this)) {
            f = 1.0f - this.mThumbPosition;
        } else {
            f = this.mThumbPosition;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.mTrackDrawable;
        if (drawable != null) {
            Rect rect2 = this.mTempRect;
            drawable.getPadding(rect2);
            Drawable drawable2 = this.mThumbDrawable;
            if (drawable2 != null) {
                rect = C0550p0.m39767d(drawable2);
            } else {
                rect = C0550p0.f1908c;
            }
            return ((((this.mSwitchWidth - this.mThumbWidth) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    private boolean hitThumb(float f, float f2) {
        if (this.mThumbDrawable == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.mThumbDrawable.getPadding(this.mTempRect);
        int i = this.mSwitchTop;
        int i2 = this.mTouchSlop;
        int i3 = i - i2;
        int i4 = (this.mSwitchLeft + thumbOffset) - i2;
        Rect rect = this.mTempRect;
        int i5 = this.mThumbWidth + i4 + rect.left + rect.right + i2;
        int i6 = this.mSwitchBottom + i2;
        if (f <= i4 || f >= i5 || f2 <= i3 || f2 >= i6) {
            return false;
        }
        return true;
    }

    private Layout makeLayout(CharSequence charSequence) {
        int i;
        TextPaint textPaint = this.mTextPaint;
        if (charSequence != null) {
            i = (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
        } else {
            i = 0;
        }
        return new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void setOffStateDescriptionOnRAndAbove() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.mTextOff;
            if (charSequence == null) {
                charSequence = getResources().getString(C5713h.f16206b);
            }
            C1365w0.m37243I0(this, charSequence);
        }
    }

    private void setOnStateDescriptionOnRAndAbove() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.mTextOn;
            if (charSequence == null) {
                charSequence = getResources().getString(C5713h.f16207c);
            }
            C1365w0.m37243I0(this, charSequence);
        }
    }

    private void setSwitchTypefaceByIndex(int i, int i2) {
        Typeface typeface;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    typeface = null;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
            } else {
                typeface = Typeface.SERIF;
            }
        } else {
            typeface = Typeface.SANS_SERIF;
        }
        setSwitchTypeface(typeface, i2);
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.mTextOff = charSequence;
        this.mTextOffTransformed = doTransformForOnOffText(charSequence);
        this.mOffLayout = null;
        if (this.mShowText) {
            setupEmojiCompatLoadCallback();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.mTextOn = charSequence;
        this.mTextOnTransformed = doTransformForOnOffText(charSequence);
        this.mOnLayout = null;
        if (this.mShowText) {
            setupEmojiCompatLoadCallback();
        }
    }

    private void setupEmojiCompatLoadCallback() {
        if (this.mEmojiCompatInitCallback == null && this.mAppCompatEmojiTextHelper.m40208b() && C1500e.m36650h()) {
            C1500e m36656b = C1500e.m36656b();
            int m36654d = m36656b.m36654d();
            if (m36654d == 3 || m36654d == 0) {
                EmojiCompatInitCallback emojiCompatInitCallback = new EmojiCompatInitCallback(this);
                this.mEmojiCompatInitCallback = emojiCompatInitCallback;
                m36656b.m36639s(emojiCompatInitCallback);
            }
        }
    }

    private void stopDrag(MotionEvent motionEvent) {
        boolean z;
        this.mTouchMode = 0;
        boolean z2 = true;
        if (motionEvent.getAction() == 1 && isEnabled()) {
            z = true;
        } else {
            z = false;
        }
        boolean isChecked = isChecked();
        if (z) {
            this.mVelocityTracker.computeCurrentVelocity(RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
            float xVelocity = this.mVelocityTracker.getXVelocity();
            if (Math.abs(xVelocity) > this.mMinFlingVelocity) {
                if (!C0616y1.m39572b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                    z2 = false;
                }
            } else {
                z2 = getTargetCheckedState();
            }
        } else {
            z2 = isChecked;
        }
        if (z2 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z2);
        cancelSuperTouch(motionEvent);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        Rect rect2 = this.mTempRect;
        int i3 = this.mSwitchLeft;
        int i4 = this.mSwitchTop;
        int i5 = this.mSwitchRight;
        int i6 = this.mSwitchBottom;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            rect = C0550p0.m39767d(drawable);
        } else {
            rect = C0550p0.f1908c;
        }
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i7 = rect2.left;
            thumbOffset += i7;
            if (rect != null) {
                int i8 = rect.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rect.top;
                int i10 = rect2.top;
                if (i9 > i10) {
                    i = (i9 - i10) + i4;
                } else {
                    i = i4;
                }
                int i11 = rect.right;
                int i12 = rect2.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rect.bottom;
                int i14 = rect2.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.mTrackDrawable.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.mTrackDrawable.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.mThumbDrawable;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i15 = thumbOffset - rect2.left;
            int i16 = thumbOffset + this.mThumbWidth + rect2.right;
            this.mThumbDrawable.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                C1013a.m38086l(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            C1013a.m38087k(drawable, f, f2);
        }
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            C1013a.m38087k(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mThumbDrawable;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!C0616y1.m39572b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.mSwitchWidth;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.mSwitchPadding;
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (C0616y1.m39572b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.mSwitchWidth;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.mSwitchPadding;
        }
        return compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C1435k.m36865p(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.mShowText;
    }

    public boolean getSplitTrack() {
        return this.mSplitTrack;
    }

    public int getSwitchMinWidth() {
        return this.mSwitchMinWidth;
    }

    public int getSwitchPadding() {
        return this.mSwitchPadding;
    }

    public CharSequence getTextOff() {
        return this.mTextOff;
    }

    public CharSequence getTextOn() {
        return this.mTextOn;
    }

    public Drawable getThumbDrawable() {
        return this.mThumbDrawable;
    }

    protected final float getThumbPosition() {
        return this.mThumbPosition;
    }

    public int getThumbTextPadding() {
        return this.mThumbTextPadding;
    }

    public ColorStateList getThumbTintList() {
        return this.mThumbTintList;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.mThumbTintMode;
    }

    public Drawable getTrackDrawable() {
        return this.mTrackDrawable;
    }

    public ColorStateList getTrackTintList() {
        return this.mTrackTintList;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.mTrackTintMode;
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().m40208b();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.mPositionAnimator;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.mPositionAnimator.end();
            this.mPositionAnimator = null;
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Layout layout;
        int width;
        super.onDraw(canvas);
        Rect rect = this.mTempRect;
        Drawable drawable = this.mTrackDrawable;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.mSwitchTop;
        int i2 = this.mSwitchBottom;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.mThumbDrawable;
        if (drawable != null) {
            if (this.mSplitTrack && drawable2 != null) {
                Rect m39767d = C0550p0.m39767d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += m39767d.left;
                rect.right -= m39767d.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            layout = this.mOnLayout;
        } else {
            layout = this.mOffLayout;
        }
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.mTextColors;
            if (colorStateList != null) {
                this.mTextPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.mTextPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    void onEmojiCompatInitializedForSwitchText() {
        setTextOnInternal(this.mTextOn);
        setTextOffInternal(this.mTextOff);
        requestLayout();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_EVENT_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_EVENT_CLASS_NAME);
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.mTextOn;
            } else {
                charSequence = this.mTextOff;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(text);
                sb2.append(' ');
                sb2.append(charSequence);
                accessibilityNodeInfo.setText(sb2);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        super.onLayout(z, i, i2, i3, i4);
        int i9 = 0;
        if (this.mThumbDrawable != null) {
            Rect rect = this.mTempRect;
            Drawable drawable = this.mTrackDrawable;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect m39767d = C0550p0.m39767d(this.mThumbDrawable);
            i5 = Math.max(0, m39767d.left - rect.left);
            i9 = Math.max(0, m39767d.right - rect.right);
        } else {
            i5 = 0;
        }
        if (C0616y1.m39572b(this)) {
            i6 = getPaddingLeft() + i5;
            width = ((this.mSwitchWidth + i6) - i5) - i9;
        } else {
            width = (getWidth() - getPaddingRight()) - i9;
            i6 = (width - this.mSwitchWidth) + i5 + i9;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                paddingTop = getPaddingTop();
                i7 = this.mSwitchHeight;
            } else {
                i8 = getHeight() - getPaddingBottom();
                paddingTop = i8 - this.mSwitchHeight;
                this.mSwitchLeft = i6;
                this.mSwitchTop = paddingTop;
                this.mSwitchBottom = i8;
                this.mSwitchRight = width;
            }
        } else {
            i7 = this.mSwitchHeight;
            paddingTop = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i7 / 2);
        }
        i8 = i7 + paddingTop;
        this.mSwitchLeft = i6;
        this.mSwitchTop = paddingTop;
        this.mSwitchBottom = i8;
        this.mSwitchRight = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.mShowText) {
            if (this.mOnLayout == null) {
                this.mOnLayout = makeLayout(this.mTextOnTransformed);
            }
            if (this.mOffLayout == null) {
                this.mOffLayout = makeLayout(this.mTextOffTransformed);
            }
        }
        Rect rect = this.mTempRect;
        Drawable drawable = this.mThumbDrawable;
        int i7 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.mThumbDrawable.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.mThumbDrawable.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (this.mShowText) {
            i5 = Math.max(this.mOnLayout.getWidth(), this.mOffLayout.getWidth()) + (this.mThumbTextPadding * 2);
        } else {
            i5 = 0;
        }
        this.mThumbWidth = Math.max(i5, i3);
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i7 = this.mTrackDrawable.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i8 = rect.left;
        int i9 = rect.right;
        Drawable drawable3 = this.mThumbDrawable;
        if (drawable3 != null) {
            Rect m39767d = C0550p0.m39767d(drawable3);
            i8 = Math.max(i8, m39767d.left);
            i9 = Math.max(i9, m39767d.right);
        }
        if (this.mEnforceSwitchWidth) {
            i6 = Math.max(this.mSwitchMinWidth, (this.mThumbWidth * 2) + i8 + i9);
        } else {
            i6 = this.mSwitchMinWidth;
        }
        int max = Math.max(i7, i4);
        this.mSwitchWidth = i6;
        this.mSwitchHeight = max;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.mTextOn;
        } else {
            charSequence = this.mTextOff;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0012, code lost:
        if (r0 != 3) goto L8;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9d
            r2 = 2
            if (r0 == r1) goto L89
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L89
            goto Lb7
        L16:
            int r0 = r6.mTouchMode
            if (r0 == r1) goto L55
            if (r0 == r2) goto L1e
            goto Lb7
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.mTouchX
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3b
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L38
            r2 = r3
            goto L3b
        L38:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = r0
        L3b:
            boolean r0 = androidx.appcompat.widget.C0616y1.m39572b(r6)
            if (r0 == 0) goto L42
            float r2 = -r2
        L42:
            float r0 = r6.mThumbPosition
            float r0 = r0 + r2
            float r0 = constrain(r0, r4, r3)
            float r2 = r6.mThumbPosition
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L54
            r6.mTouchX = r7
            r6.setThumbPosition(r0)
        L54:
            return r1
        L55:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.mTouchX
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.mTouchSlop
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7b
            float r4 = r6.mTouchY
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.mTouchSlop
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb7
        L7b:
            r6.mTouchMode = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.mTouchX = r0
            r6.mTouchY = r3
            return r1
        L89:
            int r0 = r6.mTouchMode
            if (r0 != r2) goto L94
            r6.stopDrag(r7)
            super.onTouchEvent(r7)
            return r1
        L94:
            r0 = 0
            r6.mTouchMode = r0
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.clear()
            goto Lb7
        L9d:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb7
            boolean r3 = r6.hitThumb(r0, r2)
            if (r3 == 0) goto Lb7
            r6.mTouchMode = r1
            r6.mTouchX = r0
            r6.mTouchY = r2
        Lb7:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m40206d(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        float f;
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            setOnStateDescriptionOnRAndAbove();
        } else {
            setOffStateDescriptionOnRAndAbove();
        }
        if (getWindowToken() != null && C1365w0.m37224U(this)) {
            animateThumbToCheckedState(isChecked);
            return;
        }
        cancelPositionAnimator();
        if (isChecked) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        setThumbPosition(f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1435k.m36864q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m40205e(z);
        setTextOnInternal(this.mTextOn);
        setTextOffInternal(this.mTextOff);
        requestLayout();
    }

    protected final void setEnforceSwitchWidth(boolean z) {
        this.mEnforceSwitchWidth = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m40209a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.mShowText != z) {
            this.mShowText = z;
            requestLayout();
            if (z) {
                setupEmojiCompatLoadCallback();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.mSplitTrack = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.mSwitchMinWidth = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.mSwitchPadding = i;
        requestLayout();
    }

    public void setSwitchTextAppearance(Context context, int i) {
        C0544n1 m39782t = C0544n1.m39782t(context, i, C5715j.f16316S2);
        ColorStateList m39799c = m39782t.m39799c(C5715j.f16332W2);
        if (m39799c != null) {
            this.mTextColors = m39799c;
        } else {
            this.mTextColors = getTextColors();
        }
        int m39796f = m39782t.m39796f(C5715j.f16320T2, 0);
        if (m39796f != 0) {
            float f = m39796f;
            if (f != this.mTextPaint.getTextSize()) {
                this.mTextPaint.setTextSize(f);
                requestLayout();
            }
        }
        setSwitchTypefaceByIndex(m39782t.m39791k(C5715j.f16324U2, -1), m39782t.m39791k(C5715j.f16328V2, -1));
        if (m39782t.m39801a(C5715j.f16354b3, false)) {
            this.mSwitchTransformationMethod = new C6857a(getContext());
        } else {
            this.mSwitchTransformationMethod = null;
        }
        setTextOnInternal(this.mTextOn);
        setTextOffInternal(this.mTextOff);
        m39782t.m39779w();
    }

    public void setSwitchTypeface(Typeface typeface, int i) {
        Typeface create;
        if (i > 0) {
            if (typeface == null) {
                create = Typeface.defaultFromStyle(i);
            } else {
                create = Typeface.create(typeface, i);
            }
            setSwitchTypeface(create);
            int i2 = (~(create != null ? create.getStyle() : 0)) & i;
            this.mTextPaint.setFakeBoldText((i2 & 1) != 0);
            this.mTextPaint.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
            return;
        }
        this.mTextPaint.setFakeBoldText(false);
        this.mTextPaint.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked()) {
            setOffStateDescriptionOnRAndAbove();
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            setOnStateDescriptionOnRAndAbove();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.mThumbDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.mThumbDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f) {
        this.mThumbPosition = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C6029a.m23853b(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.mThumbTextPadding = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.mThumbTintList = colorStateList;
        this.mHasThumbTint = true;
        applyThumbTint();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.mThumbTintMode = mode;
        this.mHasThumbTintMode = true;
        applyThumbTint();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.mTrackDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C6029a.m23853b(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.mTrackTintList = colorStateList;
        this.mHasTrackTint = true;
        applyTrackTint();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.mTrackTintMode = mode;
        this.mHasTrackTintMode = true;
        applyTrackTint();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mThumbDrawable || drawable == this.mTrackDrawable;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5706a.f16043L);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mThumbTintList = null;
        this.mThumbTintMode = null;
        this.mHasThumbTint = false;
        this.mHasThumbTintMode = false;
        this.mTrackTintList = null;
        this.mTrackTintMode = null;
        this.mHasTrackTint = false;
        this.mHasTrackTintMode = false;
        this.mVelocityTracker = VelocityTracker.obtain();
        this.mEnforceSwitchWidth = true;
        this.mTempRect = new Rect();
        C0528i1.m39846a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.mTextPaint = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = C5715j.f16241D2;
        C0544n1 m39780v = C0544n1.m39780v(context, attributeSet, iArr, i, 0);
        C1365w0.m37189o0(this, context, iArr, attributeSet, m39780v.m39784r(), i, 0);
        Drawable m39795g = m39780v.m39795g(C5715j.f16256G2);
        this.mThumbDrawable = m39795g;
        if (m39795g != null) {
            m39795g.setCallback(this);
        }
        Drawable m39795g2 = m39780v.m39795g(C5715j.f16301P2);
        this.mTrackDrawable = m39795g2;
        if (m39795g2 != null) {
            m39795g2.setCallback(this);
        }
        setTextOnInternal(m39780v.m39786p(C5715j.f16246E2));
        setTextOffInternal(m39780v.m39786p(C5715j.f16251F2));
        this.mShowText = m39780v.m39801a(C5715j.f16261H2, true);
        this.mThumbTextPadding = m39780v.m39796f(C5715j.f16286M2, 0);
        this.mSwitchMinWidth = m39780v.m39796f(C5715j.f16271J2, 0);
        this.mSwitchPadding = m39780v.m39796f(C5715j.f16276K2, 0);
        this.mSplitTrack = m39780v.m39801a(C5715j.f16266I2, false);
        ColorStateList m39799c = m39780v.m39799c(C5715j.f16291N2);
        if (m39799c != null) {
            this.mThumbTintList = m39799c;
            this.mHasThumbTint = true;
        }
        PorterDuff.Mode m39766e = C0550p0.m39766e(m39780v.m39791k(C5715j.f16296O2, -1), null);
        if (this.mThumbTintMode != m39766e) {
            this.mThumbTintMode = m39766e;
            this.mHasThumbTintMode = true;
        }
        if (this.mHasThumbTint || this.mHasThumbTintMode) {
            applyThumbTint();
        }
        ColorStateList m39799c2 = m39780v.m39799c(C5715j.f16306Q2);
        if (m39799c2 != null) {
            this.mTrackTintList = m39799c2;
            this.mHasTrackTint = true;
        }
        PorterDuff.Mode m39766e2 = C0550p0.m39766e(m39780v.m39791k(C5715j.f16311R2, -1), null);
        if (this.mTrackTintMode != m39766e2) {
            this.mTrackTintMode = m39766e2;
            this.mHasTrackTintMode = true;
        }
        if (this.mHasTrackTint || this.mHasTrackTintMode) {
            applyTrackTint();
        }
        int m39788n = m39780v.m39788n(C5715j.f16281L2, 0);
        if (m39788n != 0) {
            setSwitchTextAppearance(context, m39788n);
        }
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.mTextHelper = appCompatTextHelper;
        appCompatTextHelper.m40173m(attributeSet, i);
        m39780v.m39779w();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().m40207c(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.mTextPaint.getTypeface() == null || this.mTextPaint.getTypeface().equals(typeface)) && (this.mTextPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        this.mTextPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }
}