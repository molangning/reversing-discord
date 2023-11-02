package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.C0506f;
import androidx.core.view.C1365w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import bb.C2236h;
import bb.C2239k;
import bb.InterfaceC2255n;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.material.chip.C4805a;
import com.google.android.material.internal.C4908m;
import com.google.android.material.internal.C4911o;
import com.google.android.material.internal.InterfaceC4897h;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.List;
import p155ia.C7480b;
import p155ia.C7487i;
import p155ia.C7488j;
import p155ia.C7489k;
import p176ja.C8885h;
import p443ya.AbstractC13962f;
import p443ya.C13958d;
import za.C14143b;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class Chip extends C0506f implements C4805a.InterfaceC4806a, InterfaceC2255n, InterfaceC4897h<Chip> {

    /* renamed from: G */
    private static final int f13295G = C7488j.f20276m;

    /* renamed from: H */
    private static final Rect f13296H = new Rect();

    /* renamed from: I */
    private static final int[] f13297I = {16842913};

    /* renamed from: J */
    private static final int[] f13298J = {16842911};

    /* renamed from: A */
    private CharSequence f13299A;

    /* renamed from: B */
    private final C4798d f13300B;

    /* renamed from: C */
    private boolean f13301C;

    /* renamed from: D */
    private final Rect f13302D;

    /* renamed from: E */
    private final RectF f13303E;

    /* renamed from: F */
    private final AbstractC13962f f13304F;

    /* renamed from: n */
    private C4805a f13305n;

    /* renamed from: o */
    private InsetDrawable f13306o;

    /* renamed from: p */
    private RippleDrawable f13307p;

    /* renamed from: q */
    private View.OnClickListener f13308q;

    /* renamed from: r */
    private CompoundButton.OnCheckedChangeListener f13309r;

    /* renamed from: s */
    private InterfaceC4897h.InterfaceC4898a<Chip> f13310s;

    /* renamed from: t */
    private boolean f13311t;

    /* renamed from: u */
    private boolean f13312u;

    /* renamed from: v */
    private boolean f13313v;

    /* renamed from: w */
    private boolean f13314w;

    /* renamed from: x */
    private boolean f13315x;

    /* renamed from: y */
    private int f13316y;

    /* renamed from: z */
    private int f13317z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.chip.Chip$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4795a extends AbstractC13962f {
        C4795a() {
            Chip.this = r1;
        }

        @Override // p443ya.AbstractC13962f
        /* renamed from: a */
        public void mo1062a(int i) {
        }

        @Override // p443ya.AbstractC13962f
        /* renamed from: b */
        public void mo1061b(Typeface typeface, boolean z) {
            CharSequence text;
            Chip chip = Chip.this;
            if (chip.f13305n.m27458M2()) {
                text = Chip.this.f13305n.m27409i1();
            } else {
                text = Chip.this.getText();
            }
            chip.setText(text);
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.chip.Chip$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4796b implements CompoundButton.OnCheckedChangeListener {
        C4796b() {
            Chip.this = r1;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (Chip.this.f13310s != null) {
                Chip.this.f13310s.mo26974a(Chip.this, z);
            }
            if (Chip.this.f13309r != null) {
                Chip.this.f13309r.onCheckedChanged(compoundButton, z);
            }
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4797c extends ViewOutlineProvider {
        C4797c() {
            Chip.this = r1;
        }

        @Override // android.view.ViewOutlineProvider
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f13305n != null) {
                Chip.this.f13305n.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4798d extends ExploreByTouchHelper {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4798d(Chip chip) {
            super(chip);
            Chip.this = r1;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected int getVirtualViewAt(float f, float f2) {
            return (Chip.this.m27514o() && Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected void getVisibleVirtualViews(List<Integer> list) {
            list.add(0);
            if (Chip.this.m27514o() && Chip.this.m27509t() && Chip.this.f13308q != null) {
                list.add(1);
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            if (i2 == 16) {
                if (i == 0) {
                    return Chip.this.performClick();
                }
                if (i == 1) {
                    return Chip.this.m27508u();
                }
                return false;
            }
            return false;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected void onPopulateNodeForHost(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.m37594e0(Chip.this.m27510s());
            accessibilityNodeInfoCompat.m37588h0(Chip.this.isClickable());
            accessibilityNodeInfoCompat.m37590g0(Chip.this.getAccessibilityClassName());
            accessibilityNodeInfoCompat.m37626J0(Chip.this.getText());
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            String str = "";
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    accessibilityNodeInfoCompat.m37582k0(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i2 = C7487i.f20255h;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        str = text;
                    }
                    objArr[0] = str;
                    accessibilityNodeInfoCompat.m37582k0(context.getString(i2, objArr).trim());
                }
                accessibilityNodeInfoCompat.m37598c0(Chip.this.getCloseIconTouchBoundsInt());
                accessibilityNodeInfoCompat.m37601b(AccessibilityNodeInfoCompat.C1178a.f3610i);
                accessibilityNodeInfoCompat.m37580l0(Chip.this.isEnabled());
                return;
            }
            accessibilityNodeInfoCompat.m37582k0("");
            accessibilityNodeInfoCompat.m37598c0(Chip.f13296H);
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected void onVirtualViewKeyboardFocusChanged(int i, boolean z) {
            if (i == 1) {
                Chip.this.f13314w = z;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7480b.f20103f);
    }

    /* renamed from: A */
    private void m27531A() {
        this.f13307p = new RippleDrawable(C14143b.m590a(this.f13305n.m27413g1()), getBackgroundDrawable(), null);
        this.f13305n.m27461L2(false);
        C1365w0.m37177u0(this, this.f13307p);
        m27530B();
    }

    /* renamed from: B */
    private void m27530B() {
        C4805a c4805a;
        if (!TextUtils.isEmpty(getText()) && (c4805a = this.f13305n) != null) {
            int m27466K0 = (int) (c4805a.m27466K0() + this.f13305n.m27405k1() + this.f13305n.m27385r0());
            int m27451P0 = (int) (this.f13305n.m27451P0() + this.f13305n.m27402l1() + this.f13305n.m27397n0());
            if (this.f13306o != null) {
                Rect rect = new Rect();
                this.f13306o.getPadding(rect);
                m27451P0 += rect.left;
                m27466K0 += rect.right;
            }
            C1365w0.m37249F0(this, m27451P0, getPaddingTop(), m27466K0, getPaddingBottom());
        }
    }

    /* renamed from: C */
    private void m27529C() {
        TextPaint paint = getPaint();
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            paint.drawableState = c4805a.getState();
        }
        C13958d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m1068n(getContext(), paint, this.f13304F);
        }
    }

    /* renamed from: D */
    private void m27528D(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", AppStateModule.APP_STATE_BACKGROUND) != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                        if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                Log.w("Chip", "Chip text must be vertically center and start aligned");
                                return;
                            }
                            return;
                        }
                        throw new UnsupportedOperationException("Chip does not support multi-line text");
                    }
                    throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                }
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
    }

    public RectF getCloseIconTouchBounds() {
        this.f13303E.setEmpty();
        if (m27514o() && this.f13308q != null) {
            this.f13305n.m27427Z0(this.f13303E);
        }
        return this.f13303E;
    }

    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f13302D.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f13302D;
    }

    private C13958d getTextAppearance() {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            return c4805a.m27407j1();
        }
        return null;
    }

    /* renamed from: k */
    private void m27518k(C4805a c4805a) {
        c4805a.m27386q2(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    /* renamed from: l */
    private int[] m27517l() {
        ?? isEnabled = isEnabled();
        int i = isEnabled;
        if (this.f13314w) {
            i = isEnabled + 1;
        }
        int i2 = i;
        if (this.f13313v) {
            i2 = i + 1;
        }
        int i3 = i2;
        if (this.f13312u) {
            i3 = i2 + 1;
        }
        int i4 = i3;
        if (isChecked()) {
            i4 = i3 + 1;
        }
        int[] iArr = new int[i4];
        int i5 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i5 = 1;
        }
        if (this.f13314w) {
            iArr[i5] = 16842908;
            i5++;
        }
        if (this.f13313v) {
            iArr[i5] = 16843623;
            i5++;
        }
        if (this.f13312u) {
            iArr[i5] = 16842919;
            i5++;
        }
        if (isChecked()) {
            iArr[i5] = 16842913;
        }
        return iArr;
    }

    /* renamed from: n */
    private void m27515n() {
        if (getBackgroundDrawable() == this.f13306o && this.f13305n.getCallback() == null) {
            this.f13305n.setCallback(this.f13306o);
        }
    }

    /* renamed from: o */
    public boolean m27514o() {
        C4805a c4805a = this.f13305n;
        return (c4805a == null || c4805a.m27442S0() == null) ? false : true;
    }

    /* renamed from: p */
    private void m27513p(Context context, AttributeSet attributeSet, int i) {
        TypedArray m26945h = C4908m.m26945h(context, attributeSet, C7489k.f20603o0, i, f13295G, new int[0]);
        this.f13315x = m26945h.getBoolean(C7489k.f20447U0, false);
        this.f13317z = (int) Math.ceil(m26945h.getDimension(C7489k.f20351I0, (float) Math.ceil(C4911o.m26936b(getContext(), 48))));
        m26945h.recycle();
    }

    /* renamed from: q */
    private void m27512q() {
        setOutlineProvider(new C4797c());
    }

    /* renamed from: r */
    private void m27511r(int i, int i2, int i3, int i4) {
        this.f13306o = new InsetDrawable((Drawable) this.f13305n, i, i2, i3, i4);
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f13313v != z) {
            this.f13313v = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f13312u != z) {
            this.f13312u = z;
            refreshDrawableState();
        }
    }

    /* renamed from: v */
    private void m27507v() {
        if (this.f13306o != null) {
            this.f13306o = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            m27503z();
        }
    }

    /* renamed from: x */
    private void m27505x(C4805a c4805a) {
        if (c4805a != null) {
            c4805a.m27386q2(null);
        }
    }

    /* renamed from: y */
    private void m27504y() {
        if (m27514o() && m27509t() && this.f13308q != null) {
            C1365w0.m37185q0(this, this.f13300B);
            this.f13301C = true;
            return;
        }
        C1365w0.m37185q0(this, null);
        this.f13301C = false;
    }

    /* renamed from: z */
    private void m27503z() {
        if (C14143b.f36375a) {
            m27531A();
            return;
        }
        this.f13305n.m27461L2(true);
        C1365w0.m37177u0(this, getBackgroundDrawable());
        m27530B();
        m27515n();
    }

    @Override // com.google.android.material.chip.C4805a.InterfaceC4806a
    /* renamed from: a */
    public void mo27358a() {
        m27516m(this.f13317z);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.f13301C) {
            return super.dispatchHoverEvent(motionEvent);
        }
        if (!this.f13300B.dispatchHoverEvent(motionEvent) && !super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f13301C) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (this.f13300B.dispatchKeyEvent(keyEvent) && this.f13300B.getKeyboardFocusedVirtualViewId() != Integer.MIN_VALUE) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.appcompat.widget.C0506f, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        boolean z;
        super.drawableStateChanged();
        C4805a c4805a = this.f13305n;
        if (c4805a != null && c4805a.m27387q1()) {
            z = this.f13305n.m27398m2(m27517l());
        } else {
            z = false;
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f13299A)) {
            return this.f13299A;
        }
        if (m27510s()) {
            ViewParent parent = getParent();
            if ((parent instanceof ChipGroup) && ((ChipGroup) parent).m27499h()) {
                return "android.widget.RadioButton";
            }
            return "android.widget.CompoundButton";
        } else if (isClickable()) {
            return "android.widget.Button";
        } else {
            return "android.view.View";
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f13306o;
        if (insetDrawable == null) {
            return this.f13305n;
        }
        return insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            return c4805a.m27478G0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            return c4805a.m27475H0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            return c4805a.m27472I0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            return Math.max(0.0f, c4805a.m27469J0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f13305n;
    }

    public float getChipEndPadding() {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            return c4805a.m27466K0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            return c4805a.m27463L0();
        }
        return null;
    }

    public float getChipIconSize() {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            return c4805a.m27460M0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            return c4805a.m27457N0();
        }
        return null;
    }

    public float getChipMinHeight() {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            return c4805a.m27454O0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            return c4805a.m27451P0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            return c4805a.m27448Q0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            return c4805a.m27445R0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            return c4805a.m27442S0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            return c4805a.m27439T0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            return c4805a.m27437U0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            return c4805a.m27435V0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            return c4805a.m27433W0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            return c4805a.m27429Y0();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            return c4805a.m27421c1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f13301C && (this.f13300B.getKeyboardFocusedVirtualViewId() == 1 || this.f13300B.getAccessibilityFocusedVirtualViewId() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C8885h getHideMotionSpec() {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            return c4805a.m27419d1();
        }
        return null;
    }

    public float getIconEndPadding() {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            return c4805a.m27417e1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            return c4805a.m27415f1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            return c4805a.m27413g1();
        }
        return null;
    }

    public C2239k getShapeAppearanceModel() {
        return this.f13305n.m33939E();
    }

    public C8885h getShowMotionSpec() {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            return c4805a.m27411h1();
        }
        return null;
    }

    public float getTextEndPadding() {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            return c4805a.m27405k1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            return c4805a.m27402l1();
        }
        return 0.0f;
    }

    /* renamed from: m */
    public boolean m27516m(int i) {
        int i2;
        this.f13317z = i;
        int i3 = 0;
        if (!m27506w()) {
            if (this.f13306o != null) {
                m27507v();
            } else {
                m27503z();
            }
            return false;
        }
        int max = Math.max(0, i - this.f13305n.getIntrinsicHeight());
        int max2 = Math.max(0, i - this.f13305n.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.f13306o != null) {
                m27507v();
            } else {
                m27503z();
            }
            return false;
        }
        if (max2 > 0) {
            i2 = max2 / 2;
        } else {
            i2 = 0;
        }
        if (max > 0) {
            i3 = max / 2;
        }
        if (this.f13306o != null) {
            Rect rect = new Rect();
            this.f13306o.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                m27503z();
                return true;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        m27511r(i2, i3, i2, i3);
        m27503z();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2236h.m33877f(this, this.f13305n);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f13297I);
        }
        if (m27510s()) {
            View.mergeDrawableStates(onCreateDrawableState, f13298J);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f13301C) {
            this.f13300B.onFocusChanged(z, i, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                setCloseIconHovered(false);
            }
        } else {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(m27510s());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            AccessibilityNodeInfoCompat m37614P0 = AccessibilityNodeInfoCompat.m37614P0(accessibilityNodeInfo);
            if (chipGroup.mo26977c()) {
                i = chipGroup.m27500g(this);
            } else {
                i = -1;
            }
            m37614P0.m37584j0(AccessibilityNodeInfoCompat.C1181d.m37543b(chipGroup.m26978b(this), 1, i, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        PointerIcon systemIcon;
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            systemIcon = PointerIcon.getSystemIcon(getContext(), RNCWebViewManager.COMMAND_CLEAR_HISTORY);
            return systemIcon;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f13316y != i) {
            this.f13316y = i;
            m27530B();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x001e, code lost:
        if (r0 != 3) goto L18;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L39
            if (r0 == r2) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L34
            goto L40
        L21:
            boolean r0 = r5.f13312u
            if (r0 == 0) goto L40
            if (r1 != 0) goto L3e
            r5.setCloseIconPressed(r3)
            goto L3e
        L2b:
            boolean r0 = r5.f13312u
            if (r0 == 0) goto L34
            r5.m27508u()
            r0 = r2
            goto L35
        L34:
            r0 = r3
        L35:
            r5.setCloseIconPressed(r3)
            goto L41
        L39:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r2)
        L3e:
            r0 = r2
            goto L41
        L40:
            r0 = r3
        L41:
            if (r0 != 0) goto L4b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
            goto L4b
        L4a:
            r2 = r3
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: s */
    public boolean m27510s() {
        C4805a c4805a = this.f13305n;
        return c4805a != null && c4805a.m27390p1();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f13299A = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f13307p) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.C0506f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f13307p) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.C0506f, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27363y1(z);
        }
    }

    public void setCheckableResource(int i) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27360z1(i);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        C4805a c4805a = this.f13305n;
        if (c4805a == null) {
            this.f13311t = z;
        } else if (c4805a.m27390p1()) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27495A1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27492B1(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27489C1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27486D1(i);
        }
    }

    public void setCheckedIconVisible(int i) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27483E1(i);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27477G1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27474H1(i);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27471I1(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27468J1(i);
        }
    }

    public void setChipDrawable(C4805a c4805a) {
        C4805a c4805a2 = this.f13305n;
        if (c4805a2 != c4805a) {
            m27505x(c4805a2);
            this.f13305n = c4805a;
            c4805a.m27491B2(false);
            m27518k(this.f13305n);
            m27516m(this.f13317z);
        }
    }

    public void setChipEndPadding(float f) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27465K1(f);
        }
    }

    public void setChipEndPaddingResource(int i) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27462L1(i);
        }
    }

    public void setChipIcon(Drawable drawable) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27459M1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27456N1(i);
        }
    }

    public void setChipIconSize(float f) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27453O1(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27450P1(i);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27447Q1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27444R1(i);
        }
    }

    public void setChipIconVisible(int i) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27441S1(i);
        }
    }

    public void setChipMinHeight(float f) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27436U1(f);
        }
    }

    public void setChipMinHeightResource(int i) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27434V1(i);
        }
    }

    public void setChipStartPadding(float f) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27432W1(f);
        }
    }

    public void setChipStartPaddingResource(int i) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27430X1(i);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27428Y1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27426Z1(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27424a2(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27422b2(i);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27418d2(drawable);
        }
        m27504y();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27416e2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27414f2(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27412g2(i);
        }
    }

    public void setCloseIconResource(int i) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27410h2(i);
        }
        m27504y();
    }

    public void setCloseIconSize(float f) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27408i2(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27406j2(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27404k2(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27401l2(i);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27395n2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27392o2(i);
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // androidx.appcompat.widget.C0506f, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // androidx.appcompat.widget.C0506f, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m33920X(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f13305n == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            C4805a c4805a = this.f13305n;
            if (c4805a != null) {
                c4805a.m27383r2(truncateAt);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f13315x = z;
        m27516m(this.f13317z);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C8885h c8885h) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27380s2(c8885h);
        }
    }

    public void setHideMotionSpecResource(int i) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27377t2(i);
        }
    }

    public void setIconEndPadding(float f) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27374u2(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27371v2(i);
        }
    }

    public void setIconStartPadding(float f) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27368w2(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27365x2(i);
        }
    }

    @Override // com.google.android.material.internal.InterfaceC4897h
    public void setInternalOnCheckedChangeListener(InterfaceC4897h.InterfaceC4898a<Chip> interfaceC4898a) {
        this.f13310s = interfaceC4898a;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f13305n == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27362y2(i);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f13309r = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f13308q = onClickListener;
        m27504y();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27359z2(colorStateList);
        }
        if (!this.f13305n.m27396n1()) {
            m27531A();
        }
    }

    public void setRippleColorResource(int i) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27494A2(i);
            if (!this.f13305n.m27396n1()) {
                m27531A();
            }
        }
    }

    @Override // bb.InterfaceC2255n
    public void setShapeAppearanceModel(C2239k c2239k) {
        this.f13305n.setShapeAppearanceModel(c2239k);
    }

    public void setShowMotionSpec(C8885h c8885h) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27488C2(c8885h);
        }
    }

    public void setShowMotionSpecResource(int i) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27485D2(i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        C4805a c4805a = this.f13305n;
        if (c4805a == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (c4805a.m27458M2()) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        super.setText(charSequence2, bufferType);
        C4805a c4805a2 = this.f13305n;
        if (c4805a2 != null) {
            c4805a2.m27482E2(charSequence);
        }
    }

    public void setTextAppearance(C13958d c13958d) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27479F2(c13958d);
        }
        m27529C();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27473H2(f);
        }
    }

    public void setTextEndPaddingResource(int i) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27470I2(i);
        }
    }

    public void setTextStartPadding(float f) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27467J2(f);
        }
    }

    public void setTextStartPaddingResource(int i) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27464K2(i);
        }
    }

    /* renamed from: t */
    public boolean m27509t() {
        C4805a c4805a = this.f13305n;
        return c4805a != null && c4805a.m27384r1();
    }

    /* renamed from: u */
    public boolean m27508u() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f13308q;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        if (this.f13301C) {
            this.f13300B.sendEventForVirtualView(1, 1);
        }
        return z;
    }

    /* renamed from: w */
    public boolean m27506w() {
        return this.f13315x;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Chip(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.chip.Chip.f13295G
            android.content.Context r7 = p064db.C5810a.m24498c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r6.f13302D = r7
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>()
            r6.f13303E = r7
            com.google.android.material.chip.Chip$a r7 = new com.google.android.material.chip.Chip$a
            r7.<init>()
            r6.f13304F = r7
            android.content.Context r0 = r6.getContext()
            r6.m27528D(r8)
            com.google.android.material.chip.a r7 = com.google.android.material.chip.C4805a.m27370w0(r0, r8, r9, r4)
            r6.m27513p(r0, r8, r9)
            r6.setChipDrawable(r7)
            float r1 = androidx.core.view.C1365w0.m37174w(r6)
            r7.m33920X(r1)
            int[] r2 = p155ia.C7489k.f20603o0
            r1 = 0
            int[] r5 = new int[r1]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.C4908m.m26945h(r0, r1, r2, r3, r4, r5)
            int r9 = p155ia.C7489k.f20484Z0
            boolean r9 = r8.hasValue(r9)
            r8.recycle()
            com.google.android.material.chip.Chip$d r8 = new com.google.android.material.chip.Chip$d
            r8.<init>(r6)
            r6.f13300B = r8
            r6.m27504y()
            if (r9 != 0) goto L59
            r6.m27512q()
        L59:
            boolean r8 = r6.f13311t
            r6.setChecked(r8)
            java.lang.CharSequence r8 = r7.m27409i1()
            r6.setText(r8)
            android.text.TextUtils$TruncateAt r7 = r7.m27421c1()
            r6.setEllipsize(r7)
            r6.m27529C()
            com.google.android.material.chip.a r7 = r6.f13305n
            boolean r7 = r7.m27458M2()
            if (r7 != 0) goto L7e
            r7 = 1
            r6.setLines(r7)
            r6.setHorizontallyScrolling(r7)
        L7e:
            r7 = 8388627(0x800013, float:1.175497E-38)
            r6.setGravity(r7)
            r6.m27530B()
            boolean r7 = r6.m27506w()
            if (r7 == 0) goto L92
            int r7 = r6.f13317z
            r6.setMinHeight(r7)
        L92:
            int r7 = androidx.core.view.C1365w0.m37258B(r6)
            r6.f13316y = r7
            com.google.android.material.chip.Chip$b r7 = new com.google.android.material.chip.Chip$b
            r7.<init>()
            super.setOnCheckedChangeListener(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCloseIconVisible(boolean z) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27389p2(z);
        }
        m27504y();
    }

    public void setCheckedIconVisible(boolean z) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27480F1(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27438T1(z);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27476G2(i);
        }
        m27529C();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C4805a c4805a = this.f13305n;
        if (c4805a != null) {
            c4805a.m27476G2(i);
        }
        m27529C();
    }
}