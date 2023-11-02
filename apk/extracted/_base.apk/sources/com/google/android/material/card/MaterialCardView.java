package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import bb.C2236h;
import bb.C2239k;
import bb.InterfaceC2255n;
import p071e.C6029a;
import p155ia.C7480b;
import p155ia.C7488j;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class MaterialCardView extends CardView implements Checkable, InterfaceC2255n {

    /* renamed from: n */
    private static final int[] f13264n = {16842911};

    /* renamed from: o */
    private static final int[] f13265o = {16842912};

    /* renamed from: p */
    private static final int[] f13266p = {C7480b.f20091F};

    /* renamed from: q */
    private static final int f13267q = C7488j.f20274k;

    /* renamed from: j */
    private final C4793a f13268j;

    /* renamed from: k */
    private boolean f13269k;

    /* renamed from: l */
    private boolean f13270l;

    /* renamed from: m */
    private boolean f13271m;

    /* renamed from: com.google.android.material.card.MaterialCardView$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4792a {
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7480b.f20119v);
    }

    /* renamed from: d */
    private void m27595d() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f13268j.m27549i();
        }
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f13268j.m27548j().getBounds());
        return rectF;
    }

    /* renamed from: e */
    public boolean m27594e() {
        C4793a c4793a = this.f13268j;
        return c4793a != null && c4793a.m27588D();
    }

    /* renamed from: f */
    public boolean m27593f() {
        return this.f13271m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m27592g(int i, int i2, int i3, int i4) {
        super.setContentPadding(i, i2, i3, i4);
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.f13268j.m27547k();
    }

    public ColorStateList getCardForegroundColor() {
        return this.f13268j.m27546l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f13268j.m27545m();
    }

    public int getCheckedIconGravity() {
        return this.f13268j.m27544n();
    }

    public int getCheckedIconMargin() {
        return this.f13268j.m27543o();
    }

    public int getCheckedIconSize() {
        return this.f13268j.m27542p();
    }

    public ColorStateList getCheckedIconTint() {
        return this.f13268j.m27541q();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f13268j.m27591A().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f13268j.m27591A().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f13268j.m27591A().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f13268j.m27591A().top;
    }

    public float getProgress() {
        return this.f13268j.m27537u();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f13268j.m27539s();
    }

    public ColorStateList getRippleColor() {
        return this.f13268j.m27536v();
    }

    public C2239k getShapeAppearanceModel() {
        return this.f13268j.m27535w();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.f13268j.m27534x();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f13268j.m27533y();
    }

    public int getStrokeWidth() {
        return this.f13268j.m27532z();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f13270l;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2236h.m33877f(this, this.f13268j.m27548j());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (m27594e()) {
            View.mergeDrawableStates(onCreateDrawableState, f13264n);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f13265o);
        }
        if (m27593f()) {
            View.mergeDrawableStates(onCreateDrawableState, f13266p);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(m27594e());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f13268j.m27584H(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f13269k) {
            if (!this.f13268j.m27589C()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f13268j.m27583I(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        this.f13268j.m27582J(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.f13268j.m27558d0();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.f13268j.m27581K(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.f13268j.m27580L(z);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f13270l != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f13268j.m27578N(drawable);
    }

    public void setCheckedIconGravity(int i) {
        if (this.f13268j.m27544n() != i) {
            this.f13268j.m27577O(i);
        }
    }

    public void setCheckedIconMargin(int i) {
        this.f13268j.m27576P(i);
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.f13268j.m27576P(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconResource(int i) {
        this.f13268j.m27578N(C6029a.m23853b(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.f13268j.m27575Q(i);
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.f13268j.m27575Q(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f13268j.m27574R(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        C4793a c4793a = this.f13268j;
        if (c4793a != null) {
            c4793a.m27562b0();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.f13268j.m27567Y(i, i2, i3, i4);
    }

    public void setDragged(boolean z) {
        if (this.f13271m != z) {
            this.f13271m = z;
            refreshDrawableState();
            m27595d();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f13268j.m27554f0();
    }

    public void setOnCheckedChangeListener(InterfaceC4792a interfaceC4792a) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.f13268j.m27554f0();
        this.f13268j.m27560c0();
    }

    public void setProgress(float f) {
        this.f13268j.m27572T(f);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        this.f13268j.m27573S(f);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f13268j.m27571U(colorStateList);
    }

    public void setRippleColorResource(int i) {
        this.f13268j.m27571U(C6029a.m23854a(getContext(), i));
    }

    @Override // bb.InterfaceC2255n
    public void setShapeAppearanceModel(C2239k c2239k) {
        setClipToOutline(c2239k.m33854u(getBoundsAsRectF()));
        this.f13268j.m27570V(c2239k);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(int i) {
        this.f13268j.m27568X(i);
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.f13268j.m27554f0();
        this.f13268j.m27560c0();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (m27594e() && isEnabled()) {
            this.f13270l = !this.f13270l;
            refreshDrawableState();
            m27595d();
            this.f13268j.m27579M(this.f13270l);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialCardView(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r6 = com.google.android.material.card.MaterialCardView.f13267q
            android.content.Context r8 = p064db.C5810a.m24498c(r8, r9, r10, r6)
            r7.<init>(r8, r9, r10)
            r8 = 0
            r7.f13270l = r8
            r7.f13271m = r8
            r0 = 1
            r7.f13269k = r0
            android.content.Context r0 = r7.getContext()
            int[] r2 = p155ia.C7489k.f20598n3
            int[] r5 = new int[r8]
            r1 = r9
            r3 = r10
            r4 = r6
            android.content.res.TypedArray r8 = com.google.android.material.internal.C4908m.m26945h(r0, r1, r2, r3, r4, r5)
            com.google.android.material.card.a r0 = new com.google.android.material.card.a
            r0.<init>(r7, r9, r10, r6)
            r7.f13268j = r0
            android.content.res.ColorStateList r9 = super.getCardBackgroundColor()
            r0.m27582J(r9)
            int r9 = super.getContentPaddingLeft()
            int r10 = super.getContentPaddingTop()
            int r1 = super.getContentPaddingRight()
            int r2 = super.getContentPaddingBottom()
            r0.m27567Y(r9, r10, r1, r2)
            r0.m27585G(r8)
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f13268j.m27582J(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f13268j.m27569W(colorStateList);
        invalidate();
    }
}
