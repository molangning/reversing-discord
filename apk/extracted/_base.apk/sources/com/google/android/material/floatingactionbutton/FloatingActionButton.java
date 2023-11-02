package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageHelper;
import androidx.appcompat.widget.C0529j;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C1013a;
import androidx.core.util.C1138f;
import androidx.core.view.C1365w0;
import bb.C2239k;
import bb.InterfaceC2255n;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.C4867a;
import com.google.android.material.internal.C4892c;
import com.google.android.material.internal.C4917p;
import java.util.List;
import p012ab.InterfaceC0138b;
import p043cb.C2485a;
import p155ia.C7482d;
import p155ia.C7488j;
import p155ia.C7489k;
import p176ja.C8885h;
import p176ja.InterfaceC8888k;
import p352ta.InterfaceC12624a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class FloatingActionButton extends C4917p implements InterfaceC12624a, InterfaceC2255n, CoordinatorLayout.InterfaceC0681b {

    /* renamed from: y */
    private static final int f13553y = C7488j.f20269f;

    /* renamed from: k */
    private ColorStateList f13554k;

    /* renamed from: l */
    private PorterDuff.Mode f13555l;

    /* renamed from: m */
    private ColorStateList f13556m;

    /* renamed from: n */
    private PorterDuff.Mode f13557n;

    /* renamed from: o */
    private ColorStateList f13558o;

    /* renamed from: p */
    private int f13559p;

    /* renamed from: q */
    private int f13560q;

    /* renamed from: r */
    private int f13561r;

    /* renamed from: s */
    private int f13562s;

    /* renamed from: t */
    boolean f13563t;

    /* renamed from: u */
    final Rect f13564u;

    /* renamed from: v */
    private final Rect f13565v;

    /* renamed from: w */
    private final AppCompatImageHelper f13566w;

    /* renamed from: x */
    private C4867a f13567x;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: E */
        public /* bridge */ /* synthetic */ boolean mo27157E(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.mo27158b(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: H */
        public /* bridge */ /* synthetic */ boolean mo27156H(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.mo26482h(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: I */
        public /* bridge */ /* synthetic */ boolean mo27155I(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            return super.mo26481l(coordinatorLayout, floatingActionButton, i);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
        /* renamed from: g */
        public /* bridge */ /* synthetic */ void mo26458g(CoordinatorLayout.C0685f c0685f) {
            super.mo26458g(c0685f);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4863a implements C4867a.InterfaceC4878k {

        /* renamed from: a */
        final /* synthetic */ AbstractC4864b f13571a;

        C4863a(AbstractC4864b abstractC4864b) {
            this.f13571a = abstractC4864b;
        }

        @Override // com.google.android.material.floatingactionbutton.C4867a.InterfaceC4878k
        /* renamed from: a */
        public void mo27099a() {
            this.f13571a.mo27153b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.C4867a.InterfaceC4878k
        /* renamed from: b */
        public void mo27098b() {
            this.f13571a.mo27154a(FloatingActionButton.this);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC4864b {
        /* renamed from: a */
        public void mo27154a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo27153b(FloatingActionButton floatingActionButton) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4865c implements InterfaceC0138b {
        C4865c() {
        }

        @Override // p012ab.InterfaceC0138b
        /* renamed from: a */
        public void mo27152a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f13564u.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.f13561r, i2 + FloatingActionButton.this.f13561r, i3 + FloatingActionButton.this.f13561r, i4 + FloatingActionButton.this.f13561r);
        }

        @Override // p012ab.InterfaceC0138b
        /* renamed from: b */
        public void mo27151b(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // p012ab.InterfaceC0138b
        /* renamed from: c */
        public boolean mo27150c() {
            return FloatingActionButton.this.f13563t;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4866d<T extends FloatingActionButton> implements C4867a.InterfaceC4877j {
        C4866d(InterfaceC8888k<T> interfaceC8888k) {
        }

        @Override // com.google.android.material.floatingactionbutton.C4867a.InterfaceC4877j
        /* renamed from: a */
        public void mo27101a() {
            throw null;
        }

        @Override // com.google.android.material.floatingactionbutton.C4867a.InterfaceC4877j
        /* renamed from: b */
        public void mo27100b() {
            throw null;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C4866d)) {
                return false;
            }
            ((C4866d) obj).getClass();
            throw null;
        }

        public int hashCode() {
            throw null;
        }
    }

    private C4867a getImpl() {
        if (this.f13567x == null) {
            this.f13567x = m27177h();
        }
        return this.f13567x;
    }

    /* renamed from: h */
    private C4867a m27177h() {
        return new C4881b(this, new C4865c());
    }

    /* renamed from: k */
    private int m27174k(int i) {
        int i2 = this.f13560q;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i != 1) {
                return resources.getDimensionPixelSize(C7482d.f20155d);
            }
            return resources.getDimensionPixelSize(C7482d.f20154c);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return m27174k(1);
        } else {
            return m27174k(0);
        }
    }

    /* renamed from: p */
    private void m27169p(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f13564u;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    /* renamed from: q */
    private void m27168q() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f13556m;
        if (colorStateList == null) {
            C1013a.m38095c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f13557n;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C0529j.m39836e(colorForState, mode));
    }

    /* renamed from: r */
    private static int m27167r(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return size;
                }
                throw new IllegalArgumentException();
            }
            return i;
        }
        return Math.min(i, size);
    }

    /* renamed from: u */
    private C4867a.InterfaceC4878k m27164u(AbstractC4864b abstractC4864b) {
        if (abstractC4864b == null) {
            return null;
        }
        return new C4863a(abstractC4864b);
    }

    @Override // p352ta.InterfaceC12624a
    /* renamed from: a */
    public boolean mo4700a() {
        throw null;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo27095C(getDrawableState());
    }

    /* renamed from: e */
    public void m27180e(Animator.AnimatorListener animatorListener) {
        getImpl().m27122e(animatorListener);
    }

    /* renamed from: f */
    public void m27179f(Animator.AnimatorListener animatorListener) {
        getImpl().m27120f(animatorListener);
    }

    /* renamed from: g */
    public void m27178g(InterfaceC8888k<? extends FloatingActionButton> interfaceC8888k) {
        getImpl().m27119g(new C4866d(interfaceC8888k));
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f13554k;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f13555l;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0681b
    public CoordinatorLayout.AbstractC0682c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().mo27088m();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().m27111p();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().m27109s();
    }

    public Drawable getContentBackground() {
        return getImpl().m27114l();
    }

    public int getCustomSize() {
        return this.f13560q;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public C8885h getHideMotionSpec() {
        return getImpl().m27112o();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f13558o;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f13558o;
    }

    public C2239k getShapeAppearanceModel() {
        return (C2239k) C1138f.m37824f(getImpl().m27108t());
    }

    public C8885h getShowMotionSpec() {
        return getImpl().m27107u();
    }

    public int getSize() {
        return this.f13559p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSizeDimension() {
        return m27174k(this.f13559p);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f13556m;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f13557n;
    }

    public boolean getUseCompatPadding() {
        return this.f13563t;
    }

    @Deprecated
    /* renamed from: i */
    public boolean m27176i(Rect rect) {
        if (!C1365w0.m37224U(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        m27169p(rect);
        return true;
    }

    /* renamed from: j */
    public void m27175j(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m27169p(rect);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo27086y();
    }

    /* renamed from: l */
    public void m27173l(AbstractC4864b abstractC4864b) {
        m27172m(abstractC4864b, true);
    }

    /* renamed from: m */
    void m27172m(AbstractC4864b abstractC4864b, boolean z) {
        getImpl().m27106v(m27164u(abstractC4864b), z);
    }

    /* renamed from: n */
    public boolean m27171n() {
        return getImpl().m27105w();
    }

    /* renamed from: o */
    public boolean m27170o() {
        return getImpl().m27104x();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().m27103z();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().m27149B();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f13561r = (sizeDimension - this.f13562s) / 2;
        getImpl().m27125c0();
        int min = Math.min(m27167r(sizeDimension, i), m27167r(sizeDimension, i2));
        Rect rect = this.f13564u;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2485a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2485a c2485a = (C2485a) parcelable;
        super.onRestoreInstanceState(c2485a.m34884a());
        Bundle bundle = (Bundle) C1138f.m37824f(c2485a.f6843l.get("expandableWidgetHelper"));
        throw null;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        new C2485a(onSaveInstanceState);
        throw null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && m27176i(this.f13565v) && !this.f13565v.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: s */
    public void m27166s(AbstractC4864b abstractC4864b) {
        m27165t(abstractC4864b, true);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f13554k != colorStateList) {
            this.f13554k = colorStateList;
            getImpl().m27144J(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f13555l != mode) {
            this.f13555l = mode;
            getImpl().m27143K(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().m27142L(f);
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().m27139O(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().m27136R(f);
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i >= 0) {
            if (i != this.f13560q) {
                this.f13560q = i;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().m27123d0(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().m27113n()) {
            getImpl().m27141M(z);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        throw null;
    }

    public void setHideMotionSpec(C8885h c8885h) {
        getImpl().m27140N(c8885h);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C8885h.m17097c(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().m27127b0();
            if (this.f13556m != null) {
                m27168q();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f13566w.m40195i(i);
        m27168q();
    }

    public void setMaxImageSize(int i) {
        this.f13562s = i;
        getImpl().m27137Q(i);
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().m27146G();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().m27146G();
    }

    public void setShadowPaddingEnabled(boolean z) {
        getImpl().m27135T(z);
    }

    @Override // bb.InterfaceC2255n
    public void setShapeAppearanceModel(C2239k c2239k) {
        getImpl().m27134U(c2239k);
    }

    public void setShowMotionSpec(C8885h c8885h) {
        getImpl().m27133V(c8885h);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C8885h.m17097c(getContext(), i));
    }

    public void setSize(int i) {
        this.f13560q = 0;
        if (i != this.f13559p) {
            this.f13559p = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f13556m != colorStateList) {
            this.f13556m = colorStateList;
            m27168q();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f13557n != mode) {
            this.f13557n = mode;
            m27168q();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().m27145H();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().m27145H();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().m27145H();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f13563t != z) {
            this.f13563t = z;
            getImpl().mo27096A();
        }
    }

    @Override // com.google.android.material.internal.C4917p, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* renamed from: t */
    void m27165t(AbstractC4864b abstractC4864b, boolean z) {
        getImpl().m27130Z(m27164u(abstractC4864b), z);
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.AbstractC0682c<T> {

        /* renamed from: a */
        private Rect f13568a;

        /* renamed from: b */
        private AbstractC4864b f13569b;

        /* renamed from: c */
        private boolean f13570c;

        public BaseBehavior() {
            this.f13570c = true;
        }

        /* renamed from: F */
        private static boolean m27163F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0685f) {
                return ((CoordinatorLayout.C0685f) layoutParams).m39166f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: G */
        private void m27162G(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            int i;
            Rect rect = floatingActionButton.f13564u;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.C0685f c0685f = (CoordinatorLayout.C0685f) floatingActionButton.getLayoutParams();
                int i2 = 0;
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) c0685f).rightMargin) {
                    i = rect.right;
                } else if (floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) c0685f).leftMargin) {
                    i = -rect.left;
                } else {
                    i = 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) c0685f).bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) c0685f).topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    C1365w0.m37215b0(floatingActionButton, i2);
                }
                if (i != 0) {
                    C1365w0.m37217a0(floatingActionButton, i);
                }
            }
        }

        /* renamed from: J */
        private boolean m27161J(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.C0685f c0685f = (CoordinatorLayout.C0685f) floatingActionButton.getLayoutParams();
            if (!this.f13570c || c0685f.m39167e() != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            return true;
        }

        /* renamed from: K */
        private boolean m27160K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m27161J(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f13568a == null) {
                this.f13568a = new Rect();
            }
            Rect rect = this.f13568a;
            C4892c.m26986a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.m27172m(this.f13569b, false);
                return true;
            }
            floatingActionButton.m27165t(this.f13569b, false);
            return true;
        }

        /* renamed from: L */
        private boolean m27159L(View view, FloatingActionButton floatingActionButton) {
            if (!m27161J(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0685f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.m27172m(this.f13569b, false);
                return true;
            }
            floatingActionButton.m27165t(this.f13569b, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
        /* renamed from: E */
        public boolean mo27158b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f13564u;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
        /* renamed from: H */
        public boolean mo26482h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m27160K(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (m27163F(view)) {
                m27159L(view, floatingActionButton);
                return false;
            } else {
                return false;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
        /* renamed from: I */
        public boolean mo26481l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List<View> m39198l = coordinatorLayout.m39198l(floatingActionButton);
            int size = m39198l.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = m39198l.get(i2);
                if (view instanceof AppBarLayout) {
                    if (m27160K(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (m27163F(view) && m27159L(view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m39225C(floatingActionButton, i);
            m27162G(coordinatorLayout, floatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
        /* renamed from: g */
        public void mo26458g(CoordinatorLayout.C0685f c0685f) {
            if (c0685f.f2978h == 0) {
                c0685f.f2978h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7489k.f20400O1);
            this.f13570c = obtainStyledAttributes.getBoolean(C7489k.f20408P1, true);
            obtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f13558o != colorStateList) {
            this.f13558o = colorStateList;
            getImpl().mo27092S(this.f13558o);
        }
    }
}
