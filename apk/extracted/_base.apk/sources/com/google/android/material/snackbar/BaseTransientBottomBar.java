package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C1013a;
import androidx.core.view.C1365w0;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.C4911o;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.C4957b;
import java.util.List;
import p064db.C5810a;
import p155ia.C7480b;
import p155ia.C7482d;
import p155ia.C7489k;
import p176ja.C8878a;
import p443ya.C13957c;
import pa.C11487a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a */
    private final ViewGroup f13870a;

    /* renamed from: b */
    protected final C4954o f13871b;

    /* renamed from: c */
    private final InterfaceC4956a f13872c;

    /* renamed from: d */
    private boolean f13873d;

    /* renamed from: e */
    private final Runnable f13874e;

    /* renamed from: f */
    private int f13875f;

    /* renamed from: g */
    private int f13876g;

    /* renamed from: h */
    private int f13877h;

    /* renamed from: i */
    private int f13878i;

    /* renamed from: j */
    private int f13879j;

    /* renamed from: k */
    private boolean f13880k;

    /* renamed from: l */
    private List<AbstractC4952m<B>> f13881l;

    /* renamed from: m */
    private Behavior f13882m;

    /* renamed from: n */
    private final AccessibilityManager f13883n;

    /* renamed from: o */
    C4957b.InterfaceC4959b f13884o;

    /* renamed from: q */
    private static final boolean f13867q = false;

    /* renamed from: r */
    private static final int[] f13868r = {C7480b.f20088C};

    /* renamed from: s */
    private static final String f13869s = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: p */
    static final Handler f13866p = new Handler(Looper.getMainLooper(), new C4947h());

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: k */
        private final C4953n f13885k = new C4953n(this);

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: P */
        public void m26797P(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f13885k.m26789c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        /* renamed from: E */
        public boolean mo26799E(View view) {
            return this.f13885k.m26791a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
        /* renamed from: k */
        public boolean mo26796k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f13885k.m26790b(coordinatorLayout, view, motionEvent);
            return super.mo26796k(coordinatorLayout, view, motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4940a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f13886a;

        C4940a(int i) {
            this.f13886a = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m26805u(this.f13886a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4941b implements ValueAnimator.AnimatorUpdateListener {
        C4941b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f13871b.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4942c implements ValueAnimator.AnimatorUpdateListener {
        C4942c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f13871b.setScaleX(floatValue);
            BaseTransientBottomBar.this.f13871b.setScaleY(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4943d extends AnimatorListenerAdapter {
        C4943d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m26804v();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f13872c.mo26782a(70, 180);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4944e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private int f13891a;

        /* renamed from: b */
        final /* synthetic */ int f13892b;

        C4944e(int i) {
            this.f13892b = i;
            this.f13891a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f13867q) {
                C1365w0.m37215b0(BaseTransientBottomBar.this.f13871b, intValue - this.f13891a);
            } else {
                BaseTransientBottomBar.this.f13871b.setTranslationY(intValue);
            }
            this.f13891a = intValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4945f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f13894a;

        C4945f(int i) {
            this.f13894a = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m26805u(this.f13894a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f13872c.mo26781b(0, 180);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4946g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private int f13896a = 0;

        C4946g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f13867q) {
                C1365w0.m37215b0(BaseTransientBottomBar.this.f13871b, intValue - this.f13896a);
            } else {
                BaseTransientBottomBar.this.f13871b.setTranslationY(intValue);
            }
            this.f13896a = intValue;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4947h implements Handler.Callback {
        C4947h() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    return false;
                }
                ((BaseTransientBottomBar) message.obj).m26811o(message.arg1);
                return true;
            }
            ((BaseTransientBottomBar) message.obj).m26832A();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class RunnableC4948i implements Runnable {
        RunnableC4948i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar.this.m26805u(3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4949j implements SwipeDismissBehavior.InterfaceC4758c {
        C4949j() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.InterfaceC4758c
        /* renamed from: a */
        public void mo26795a(View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.m26817i(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.InterfaceC4758c
        /* renamed from: b */
        public void mo26794b(int i) {
            if (i != 0) {
                if (i == 1 || i == 2) {
                    C4957b.m26778c().m26771j(BaseTransientBottomBar.this.f13884o);
                    return;
                }
                return;
            }
            C4957b.m26778c().m26770k(BaseTransientBottomBar.this.f13884o);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$k */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class RunnableC4950k implements Runnable {
        RunnableC4950k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4954o c4954o = BaseTransientBottomBar.this.f13871b;
            if (c4954o == null) {
                return;
            }
            if (c4954o.getParent() != null) {
                BaseTransientBottomBar.this.f13871b.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.f13871b.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.m26830C();
            } else {
                BaseTransientBottomBar.this.m26828E();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$l */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4951l extends AnimatorListenerAdapter {
        C4951l() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.m26804v();
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$m */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC4952m<B> {
        /* renamed from: a */
        public void m26793a(B b, int i) {
        }

        /* renamed from: b */
        public void m26792b(B b) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$n */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4953n {

        /* renamed from: a */
        private C4957b.InterfaceC4959b f13902a;

        public C4953n(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.m27828L(0.1f);
            swipeDismissBehavior.m27830J(0.6f);
            swipeDismissBehavior.m27827M(0);
        }

        /* renamed from: a */
        public boolean m26791a(View view) {
            return view instanceof C4954o;
        }

        /* renamed from: b */
        public void m26790b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    C4957b.m26778c().m26770k(this.f13902a);
                }
            } else if (coordinatorLayout.m39188v(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                C4957b.m26778c().m26771j(this.f13902a);
            }
        }

        /* renamed from: c */
        public void m26789c(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f13902a = baseTransientBottomBar.f13884o;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$o */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4954o extends FrameLayout {

        /* renamed from: t */
        private static final View.OnTouchListener f13903t = new View$OnTouchListenerC4955a();

        /* renamed from: j */
        private BaseTransientBottomBar<?> f13904j;

        /* renamed from: k */
        private int f13905k;

        /* renamed from: l */
        private final float f13906l;

        /* renamed from: m */
        private final float f13907m;

        /* renamed from: n */
        private final int f13908n;

        /* renamed from: o */
        private final int f13909o;

        /* renamed from: p */
        private ColorStateList f13910p;

        /* renamed from: q */
        private PorterDuff.Mode f13911q;

        /* renamed from: r */
        private Rect f13912r;

        /* renamed from: s */
        private boolean f13913s;

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$o$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        class View$OnTouchListenerC4955a implements View.OnTouchListener {
            View$OnTouchListenerC4955a() {
            }

            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public C4954o(Context context, AttributeSet attributeSet) {
            super(C5810a.m24498c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C7489k.f20395N4);
            int i = C7489k.f20451U4;
            if (obtainStyledAttributes.hasValue(i)) {
                C1365w0.m37169y0(this, obtainStyledAttributes.getDimensionPixelSize(i, 0));
            }
            this.f13905k = obtainStyledAttributes.getInt(C7489k.f20419Q4, 0);
            this.f13906l = obtainStyledAttributes.getFloat(C7489k.f20427R4, 1.0f);
            setBackgroundTintList(C13957c.m1089a(context2, obtainStyledAttributes, C7489k.f20435S4));
            setBackgroundTintMode(C4911o.m26932f(obtainStyledAttributes.getInt(C7489k.f20443T4, -1), PorterDuff.Mode.SRC_IN));
            this.f13907m = obtainStyledAttributes.getFloat(C7489k.f20411P4, 1.0f);
            this.f13908n = obtainStyledAttributes.getDimensionPixelSize(C7489k.f20403O4, -1);
            this.f13909o = obtainStyledAttributes.getDimensionPixelSize(C7489k.f20459V4, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f13903t);
            setFocusable(true);
            if (getBackground() == null) {
                C1365w0.m37177u0(this, m26786c());
            }
        }

        /* renamed from: c */
        private Drawable m26786c() {
            float dimension = getResources().getDimension(C7482d.f20147R);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(C11487a.m8011i(this, C7480b.f20110m, C7480b.f20107j, getBackgroundOverlayColorAlpha()));
            if (this.f13910p != null) {
                Drawable m38080r = C1013a.m38080r(gradientDrawable);
                C1013a.m38083o(m38080r, this.f13910p);
                return m38080r;
            }
            return C1013a.m38080r(gradientDrawable);
        }

        /* renamed from: d */
        private void m26785d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f13912r = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f13904j = baseTransientBottomBar;
        }

        /* renamed from: b */
        void m26787b(ViewGroup viewGroup) {
            this.f13913s = true;
            viewGroup.addView(this);
            this.f13913s = false;
        }

        float getActionTextColorAlpha() {
            return this.f13907m;
        }

        int getAnimationMode() {
            return this.f13905k;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f13906l;
        }

        int getMaxInlineActionWidth() {
            return this.f13909o;
        }

        int getMaxWidth() {
            return this.f13908n;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f13904j;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.m26808r();
            }
            C1365w0.m37191n0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f13904j;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.m26807s();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f13904j;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.m26806t();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (this.f13908n > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = this.f13908n;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        void setAnimationMode(int i) {
            this.f13905k = i;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f13910p != null) {
                drawable = C1013a.m38080r(drawable.mutate());
                C1013a.m38083o(drawable, this.f13910p);
                C1013a.m38082p(drawable, this.f13911q);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f13910p = colorStateList;
            if (getBackground() != null) {
                Drawable m38080r = C1013a.m38080r(getBackground().mutate());
                C1013a.m38083o(m38080r, colorStateList);
                C1013a.m38082p(m38080r, this.f13911q);
                if (m38080r != getBackground()) {
                    super.setBackgroundDrawable(m38080r);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f13911q = mode;
            if (getBackground() != null) {
                Drawable m38080r = C1013a.m38080r(getBackground().mutate());
                C1013a.m38082p(m38080r, mode);
                if (m38080r != getBackground()) {
                    super.setBackgroundDrawable(m38080r);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (!this.f13913s && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                m26785d((ViewGroup.MarginLayoutParams) layoutParams);
                BaseTransientBottomBar<?> baseTransientBottomBar = this.f13904j;
                if (baseTransientBottomBar != null) {
                    baseTransientBottomBar.m26826G();
                }
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            View.OnTouchListener onTouchListener;
            if (onClickListener != null) {
                onTouchListener = null;
            } else {
                onTouchListener = f13903t;
            }
            setOnTouchListener(onTouchListener);
            super.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: B */
    private void m26831B() {
        if (m26801y()) {
            m26820f();
            return;
        }
        if (this.f13871b.getParent() != null) {
            this.f13871b.setVisibility(0);
        }
        m26804v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public void m26830C() {
        ValueAnimator m26816j = m26816j(0.0f, 1.0f);
        ValueAnimator m26813m = m26813m(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(m26816j, m26813m);
        animatorSet.setDuration(150L);
        animatorSet.addListener(new C4951l());
        animatorSet.start();
    }

    /* renamed from: D */
    private void m26829D(int i) {
        ValueAnimator m26816j = m26816j(1.0f, 0.0f);
        m26816j.setDuration(75L);
        m26816j.addListener(new C4940a(i));
        m26816j.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public void m26828E() {
        int m26812n = m26812n();
        if (f13867q) {
            C1365w0.m37215b0(this.f13871b, m26812n);
        } else {
            this.f13871b.setTranslationY(m26812n);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(m26812n, 0);
        valueAnimator.setInterpolator(C8878a.f23261b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new C4943d());
        valueAnimator.addUpdateListener(new C4944e(m26812n));
        valueAnimator.start();
    }

    /* renamed from: F */
    private void m26827F(int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, m26812n());
        valueAnimator.setInterpolator(C8878a.f23261b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new C4945f(i));
        valueAnimator.addUpdateListener(new C4946g());
        valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public void m26826G() {
        int i;
        ViewGroup.LayoutParams layoutParams = this.f13871b.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && this.f13871b.f13912r != null) {
            if (this.f13871b.getParent() == null) {
                return;
            }
            if (m26815k() != null) {
                i = this.f13879j;
            } else {
                i = this.f13875f;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = this.f13871b.f13912r.bottom + i;
            marginLayoutParams.leftMargin = this.f13871b.f13912r.left + this.f13876g;
            marginLayoutParams.rightMargin = this.f13871b.f13912r.right + this.f13877h;
            marginLayoutParams.topMargin = this.f13871b.f13912r.top;
            this.f13871b.requestLayout();
            if (Build.VERSION.SDK_INT >= 29 && m26800z()) {
                this.f13871b.removeCallbacks(this.f13874e);
                this.f13871b.post(this.f13874e);
                return;
            }
            return;
        }
        Log.w(f13869s, "Unable to update margins because layout params are not MarginLayoutParams");
    }

    /* renamed from: g */
    private void m26819g(int i) {
        if (this.f13871b.getAnimationMode() == 1) {
            m26829D(i);
        } else {
            m26827F(i);
        }
    }

    /* renamed from: h */
    private int m26818h() {
        if (m26815k() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        m26815k().getLocationOnScreen(iArr);
        int i = iArr[1];
        int[] iArr2 = new int[2];
        this.f13870a.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f13870a.getHeight()) - i;
    }

    /* renamed from: j */
    private ValueAnimator m26816j(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C8878a.f23260a);
        ofFloat.addUpdateListener(new C4941b());
        return ofFloat;
    }

    /* renamed from: m */
    private ValueAnimator m26813m(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C8878a.f23263d);
        ofFloat.addUpdateListener(new C4942c());
        return ofFloat;
    }

    /* renamed from: n */
    private int m26812n() {
        int height = this.f13871b.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f13871b.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return height;
    }

    /* renamed from: q */
    private boolean m26809q() {
        ViewGroup.LayoutParams layoutParams = this.f13871b.getLayoutParams();
        if ((layoutParams instanceof CoordinatorLayout.C0685f) && (((CoordinatorLayout.C0685f) layoutParams).m39166f() instanceof SwipeDismissBehavior)) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    private void m26803w() {
        this.f13879j = m26818h();
        m26826G();
    }

    /* renamed from: x */
    private void m26802x(CoordinatorLayout.C0685f c0685f) {
        SwipeDismissBehavior<? extends View> swipeDismissBehavior = this.f13882m;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = m26814l();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).m26797P(this);
        }
        swipeDismissBehavior.m27829K(new C4949j());
        c0685f.m39157o(swipeDismissBehavior);
        if (m26815k() == null) {
            c0685f.f2977g = 80;
        }
    }

    /* renamed from: z */
    private boolean m26800z() {
        return this.f13878i > 0 && !this.f13873d && m26809q();
    }

    /* renamed from: A */
    final void m26832A() {
        if (this.f13871b.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f13871b.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0685f) {
                m26802x((CoordinatorLayout.C0685f) layoutParams);
            }
            this.f13871b.m26787b(this.f13870a);
            m26803w();
            this.f13871b.setVisibility(4);
        }
        if (C1365w0.m37224U(this.f13871b)) {
            m26831B();
        } else {
            this.f13880k = true;
        }
    }

    /* renamed from: f */
    void m26820f() {
        this.f13871b.post(new RunnableC4950k());
    }

    /* renamed from: i */
    protected void m26817i(int i) {
        C4957b.m26778c().m26779b(this.f13884o, i);
    }

    /* renamed from: k */
    public View m26815k() {
        return null;
    }

    /* renamed from: l */
    protected SwipeDismissBehavior<? extends View> m26814l() {
        return new Behavior();
    }

    /* renamed from: o */
    final void m26811o(int i) {
        if (m26801y() && this.f13871b.getVisibility() == 0) {
            m26819g(i);
        } else {
            m26805u(i);
        }
    }

    /* renamed from: p */
    public boolean m26810p() {
        return C4957b.m26778c().m26776e(this.f13884o);
    }

    /* renamed from: r */
    void m26808r() {
        WindowInsets rootWindowInsets;
        Insets mandatorySystemGestureInsets;
        int i;
        if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = this.f13871b.getRootWindowInsets()) != null) {
            mandatorySystemGestureInsets = rootWindowInsets.getMandatorySystemGestureInsets();
            i = mandatorySystemGestureInsets.bottom;
            this.f13878i = i;
            m26826G();
        }
    }

    /* renamed from: s */
    void m26807s() {
        if (m26810p()) {
            f13866p.post(new RunnableC4948i());
        }
    }

    /* renamed from: t */
    void m26806t() {
        if (this.f13880k) {
            m26831B();
            this.f13880k = false;
        }
    }

    /* renamed from: u */
    void m26805u(int i) {
        C4957b.m26778c().m26773h(this.f13884o);
        List<AbstractC4952m<B>> list = this.f13881l;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f13881l.get(size).m26793a(this, i);
            }
        }
        ViewParent parent = this.f13871b.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f13871b);
        }
    }

    /* renamed from: v */
    void m26804v() {
        C4957b.m26778c().m26772i(this.f13884o);
        List<AbstractC4952m<B>> list = this.f13881l;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f13881l.get(size).m26792b(this);
            }
        }
    }

    /* renamed from: y */
    boolean m26801y() {
        AccessibilityManager accessibilityManager = this.f13883n;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty()) {
            return true;
        }
        return false;
    }
}
