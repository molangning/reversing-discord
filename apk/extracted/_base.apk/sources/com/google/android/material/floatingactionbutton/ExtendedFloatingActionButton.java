package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1365w0;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C4892c;
import java.util.List;
import p155ia.C7488j;
import p155ia.C7489k;
import p176ja.C8885h;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.InterfaceC0681b {

    /* renamed from: L */
    private static final int f13534L = C7488j.f20280q;

    /* renamed from: M */
    static final Property<View, Float> f13535M = new C4858b(Float.class, "width");

    /* renamed from: N */
    static final Property<View, Float> f13536N = new C4859c(Float.class, "height");

    /* renamed from: O */
    static final Property<View, Float> f13537O = new C4860d(Float.class, ViewProps.PADDING_START);

    /* renamed from: P */
    static final Property<View, Float> f13538P = new C4861e(Float.class, ViewProps.PADDING_END);

    /* renamed from: C */
    private int f13539C;

    /* renamed from: D */
    private final int f13540D;

    /* renamed from: E */
    private int f13541E;

    /* renamed from: F */
    private int f13542F;

    /* renamed from: G */
    private final CoordinatorLayout.AbstractC0682c<ExtendedFloatingActionButton> f13543G;

    /* renamed from: H */
    private boolean f13544H;

    /* renamed from: I */
    private boolean f13545I;

    /* renamed from: J */
    private boolean f13546J;

    /* renamed from: K */
    protected ColorStateList f13547K;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4857a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f13551a;

        C4857a(InterfaceC4882c interfaceC4882c, AbstractC4862f abstractC4862f) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f13551a = true;
            throw null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            throw null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            throw null;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4858b extends Property<View, Float> {
        C4858b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4859c extends Property<View, Float> {
        C4859c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4860d extends Property<View, Float> {
        C4860d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C1365w0.m37248G(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            C1365w0.m37249F0(view, f.intValue(), view.getPaddingTop(), C1365w0.m37250F(view), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4861e extends Property<View, Float> {
        C4861e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C1365w0.m37250F(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            C1365w0.m37249F0(view, C1365w0.m37248G(view), view.getPaddingTop(), f.intValue(), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC4862f {
    }

    /* renamed from: j */
    static /* synthetic */ InterfaceC4882c m27208j(ExtendedFloatingActionButton extendedFloatingActionButton) {
        extendedFloatingActionButton.getClass();
        return null;
    }

    /* renamed from: k */
    static /* synthetic */ InterfaceC4882c m27207k(ExtendedFloatingActionButton extendedFloatingActionButton) {
        extendedFloatingActionButton.getClass();
        return null;
    }

    /* renamed from: m */
    static /* synthetic */ InterfaceC4882c m27205m(ExtendedFloatingActionButton extendedFloatingActionButton) {
        extendedFloatingActionButton.getClass();
        return null;
    }

    /* renamed from: n */
    static /* synthetic */ InterfaceC4882c m27204n(ExtendedFloatingActionButton extendedFloatingActionButton) {
        extendedFloatingActionButton.getClass();
        return null;
    }

    /* renamed from: o */
    private boolean m27203o() {
        if (getVisibility() != 0) {
            if (this.f13539C != 2) {
                return false;
            }
            return true;
        } else if (this.f13539C == 1) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m27202p(InterfaceC4882c interfaceC4882c, AbstractC4862f abstractC4862f) {
        if (interfaceC4882c.m27084b()) {
            return;
        }
        if (!m27200r()) {
            interfaceC4882c.m27085a();
            interfaceC4882c.m27081e(abstractC4862f);
            return;
        }
        measure(0, 0);
        AnimatorSet m27083c = interfaceC4882c.m27083c();
        m27083c.addListener(new C4857a(interfaceC4882c, abstractC4862f));
        for (Animator.AnimatorListener animatorListener : interfaceC4882c.m27082d()) {
            m27083c.addListener(animatorListener);
        }
        m27083c.start();
    }

    /* renamed from: q */
    private void m27201q() {
        this.f13547K = getTextColors();
    }

    /* renamed from: r */
    private boolean m27200r() {
        if ((C1365w0.m37224U(this) || (!m27203o() && this.f13546J)) && !isInEditMode()) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0681b
    public CoordinatorLayout.AbstractC0682c<ExtendedFloatingActionButton> getBehavior() {
        return this.f13543G;
    }

    int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    int getCollapsedSize() {
        int i = this.f13540D;
        if (i < 0) {
            return (Math.min(C1365w0.m37248G(this), C1365w0.m37250F(this)) * 2) + getIconSize();
        }
        return i;
    }

    public C8885h getExtendMotionSpec() {
        throw null;
    }

    public C8885h getHideMotionSpec() {
        throw null;
    }

    public C8885h getShowMotionSpec() {
        throw null;
    }

    public C8885h getShrinkMotionSpec() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f13544H && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f13544H = false;
            throw null;
        }
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.f13546J = z;
    }

    public void setExtendMotionSpec(C8885h c8885h) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(C8885h.m17097c(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.f13544H == z) {
            return;
        }
        throw null;
    }

    public void setHideMotionSpec(C8885h c8885h) {
        throw null;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C8885h.m17097c(getContext(), i));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (this.f13544H && !this.f13545I) {
            this.f13541E = C1365w0.m37248G(this);
            this.f13542F = C1365w0.m37250F(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (this.f13544H && !this.f13545I) {
            this.f13541E = i;
            this.f13542F = i3;
        }
    }

    public void setShowMotionSpec(C8885h c8885h) {
        throw null;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C8885h.m17097c(getContext(), i));
    }

    public void setShrinkMotionSpec(C8885h c8885h) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(C8885h.m17097c(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        m27201q();
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.AbstractC0682c<T> {

        /* renamed from: a */
        private Rect f13548a;

        /* renamed from: b */
        private boolean f13549b;

        /* renamed from: c */
        private boolean f13550c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f13549b = false;
            this.f13550c = true;
        }

        /* renamed from: G */
        private static boolean m27197G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0685f) {
                return ((CoordinatorLayout.C0685f) layoutParams).m39166f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: J */
        private boolean m27194J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.C0685f c0685f = (CoordinatorLayout.C0685f) extendedFloatingActionButton.getLayoutParams();
            if ((!this.f13549b && !this.f13550c) || c0685f.m39167e() != view.getId()) {
                return false;
            }
            return true;
        }

        /* renamed from: L */
        private boolean m27192L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m27194J(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f13548a == null) {
                this.f13548a = new Rect();
            }
            Rect rect = this.f13548a;
            C4892c.m26986a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                m27193K(extendedFloatingActionButton);
                return true;
            }
            m27199E(extendedFloatingActionButton);
            return true;
        }

        /* renamed from: M */
        private boolean m27191M(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m27194J(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0685f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                m27193K(extendedFloatingActionButton);
                return true;
            }
            m27199E(extendedFloatingActionButton);
            return true;
        }

        /* renamed from: E */
        protected void m27199E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (this.f13550c) {
                ExtendedFloatingActionButton.m27205m(extendedFloatingActionButton);
            } else {
                ExtendedFloatingActionButton.m27204n(extendedFloatingActionButton);
            }
            extendedFloatingActionButton.m27202p(null, null);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
        /* renamed from: F */
        public boolean mo27158b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.mo27158b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
        /* renamed from: H */
        public boolean mo26482h(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m27192L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (m27197G(view)) {
                m27191M(view, extendedFloatingActionButton);
                return false;
            } else {
                return false;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
        /* renamed from: I */
        public boolean mo26481l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> m39198l = coordinatorLayout.m39198l(extendedFloatingActionButton);
            int size = m39198l.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = m39198l.get(i2);
                if (view instanceof AppBarLayout) {
                    if (m27192L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (m27197G(view) && m27191M(view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m39225C(extendedFloatingActionButton, i);
            return true;
        }

        /* renamed from: K */
        protected void m27193K(ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (this.f13550c) {
                ExtendedFloatingActionButton.m27208j(extendedFloatingActionButton);
            } else {
                ExtendedFloatingActionButton.m27207k(extendedFloatingActionButton);
            }
            extendedFloatingActionButton.m27202p(null, null);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
        /* renamed from: g */
        public void mo26458g(CoordinatorLayout.C0685f c0685f) {
            if (c0685f.f2978h == 0) {
                c0685f.f2978h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7489k.f20368K1);
            this.f13549b = obtainStyledAttributes.getBoolean(C7489k.f20376L1, false);
            this.f13550c = obtainStyledAttributes.getBoolean(C7489k.f20384M1, true);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        m27201q();
    }
}
