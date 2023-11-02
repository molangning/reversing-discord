package com.swmansion.rnscreens;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.appbar.AppBarLayout;
import com.swmansion.rnscreens.C5651t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002?@B\u0011\b\u0017\u0012\u0006\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=B\t\b\u0016¢\u0006\u0004\b<\u0010>J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0004J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0002H\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u001cH\u0016J\u0006\u0010\u001e\u001a\u00020\u0004J\u0006\u0010\u001f\u001a\u00020\u0002R\u0018\u0010\"\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010#R\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010&R$\u00101\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R0\u00109\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0002\u0018\u0001028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006A"}, m14357d2 = {"Lcom/swmansion/rnscreens/q;", "Lcom/swmansion/rnscreens/n;", "", "E", "", "K", "Landroid/view/Menu;", "menu", "L", "F", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "H", ViewProps.HIDDEN, "I", "translucent", "J", "r", "s", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "onPrepareOptionsMenu", "Landroid/view/MenuInflater;", "onCreateOptionsMenu", "C", "dismiss", "Lcom/google/android/material/appbar/AppBarLayout;", "Lcom/google/android/material/appbar/AppBarLayout;", "mAppBarLayout", "Landroidx/appcompat/widget/Toolbar;", "mToolbar", "t", "Z", "mShadowHidden", "u", "mIsTranslucent", "Lcom/swmansion/rnscreens/c;", "v", "Lcom/swmansion/rnscreens/c;", "D", "()Lcom/swmansion/rnscreens/c;", "setSearchView", "(Lcom/swmansion/rnscreens/c;)V", "searchView", "Lkotlin/Function1;", "w", "Lkotlin/jvm/functions/Function1;", "getOnSearchViewCreate", "()Lkotlin/jvm/functions/Function1;", "G", "(Lkotlin/jvm/functions/Function1;)V", "onSearchViewCreate", "Lcom/swmansion/rnscreens/j;", "screenView", "<init>", "(Lcom/swmansion/rnscreens/j;)V", "()V", "a", "b", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.swmansion.rnscreens.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5644q extends C5634n {

    /* renamed from: r */
    private AppBarLayout f15761r;

    /* renamed from: s */
    private Toolbar f15762s;

    /* renamed from: t */
    private boolean f15763t;

    /* renamed from: u */
    private boolean f15764u;

    /* renamed from: v */
    private C5601c f15765v;

    /* renamed from: w */
    private Function1<? super C5601c, Unit> f15766w;

    @Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, m14357d2 = {"Lcom/swmansion/rnscreens/q$a;", "Landroid/view/animation/Animation;", "", "interpolatedTime", "Landroid/view/animation/Transformation;", "t", "", "applyTransformation", "Lcom/swmansion/rnscreens/n;", "j", "Lcom/swmansion/rnscreens/n;", "mFragment", "<init>", "(Lcom/swmansion/rnscreens/n;)V", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.q$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C5645a extends Animation {

        /* renamed from: j */
        private final C5634n f15767j;

        public C5645a(C5634n mFragment) {
            C9612q.m13917h(mFragment, "mFragment");
            this.f15767j = mFragment;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float f, Transformation t) {
            C9612q.m13917h(t, "t");
            super.applyTransformation(f, t);
            C5634n c5634n = this.f15767j;
            c5634n.m24885m(f, !c5634n.isResumed());
        }
    }

    @Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, m14357d2 = {"Lcom/swmansion/rnscreens/q$b;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Landroid/view/animation/Animation;", "animation", "", "startAnimation", "clearFocus", "Lcom/swmansion/rnscreens/n;", "I", "Lcom/swmansion/rnscreens/n;", "mFragment", "Landroid/view/animation/Animation$AnimationListener;", "J", "Landroid/view/animation/Animation$AnimationListener;", "mAnimationListener", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lcom/swmansion/rnscreens/n;)V", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.q$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C5646b extends CoordinatorLayout {

        /* renamed from: I */
        private final C5634n f15768I;

        /* renamed from: J */
        private final Animation.AnimationListener f15769J;

        @Metadata(m14358d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, m14357d2 = {"com/swmansion/rnscreens/q$b$a", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "animation", "", "onAnimationStart", "onAnimationEnd", "onAnimationRepeat", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
        /* renamed from: com.swmansion.rnscreens.q$b$a  reason: invalid class name */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public static final class animationAnimation$AnimationListenerC5647a implements Animation.AnimationListener {
            animationAnimation$AnimationListenerC5647a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                C9612q.m13917h(animation, "animation");
                C5646b.this.f15768I.mo24832s();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                C9612q.m13917h(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                C9612q.m13917h(animation, "animation");
                C5646b.this.f15768I.m24880t();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5646b(Context context, C5634n mFragment) {
            super(context);
            C9612q.m13917h(context, "context");
            C9612q.m13917h(mFragment, "mFragment");
            this.f15768I = mFragment;
            this.f15769J = new animationAnimation$AnimationListenerC5647a();
        }

        @Override // android.view.ViewGroup, android.view.View
        public void clearFocus() {
            if (getVisibility() != 4) {
                super.clearFocus();
            }
        }

        @Override // android.view.View
        public void startAnimation(Animation animation) {
            C9612q.m13917h(animation, "animation");
            C5645a c5645a = new C5645a(this.f15768I);
            c5645a.setDuration(animation.getDuration());
            if ((animation instanceof AnimationSet) && !this.f15768I.isRemoving()) {
                AnimationSet animationSet = (AnimationSet) animation;
                animationSet.addAnimation(c5645a);
                animationSet.setAnimationListener(this.f15769J);
                super.startAnimation(animationSet);
                return;
            }
            AnimationSet animationSet2 = new AnimationSet(true);
            animationSet2.addAnimation(animation);
            animationSet2.addAnimation(c5645a);
            animationSet2.setAnimationListener(this.f15769J);
            super.startAnimation(animationSet2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"ValidFragment"})
    public C5644q(C5623j screenView) {
        super(screenView);
        C9612q.m13917h(screenView, "screenView");
    }

    /* renamed from: E */
    private final void m24841E() {
        ViewParent viewParent;
        View view = getView();
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof C5640p) {
            ((C5640p) viewParent).m24867E();
        }
    }

    /* renamed from: K */
    private final boolean m24835K() {
        int i;
        C5649s headerConfig = m24881q().getHeaderConfig();
        if (headerConfig != null) {
            i = headerConfig.getConfigSubviewsCount();
        } else {
            i = 0;
        }
        if (headerConfig != null && i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                if (headerConfig.m24827d(i2).getType() == C5651t.EnumC5652a.SEARCH_BAR) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: L */
    private final void m24834L(Menu menu) {
        menu.clear();
        if (m24835K()) {
            Context context = getContext();
            if (this.f15765v == null && context != null) {
                C5601c c5601c = new C5601c(context, this);
                this.f15765v = c5601c;
                Function1<? super C5601c, Unit> function1 = this.f15766w;
                if (function1 != null) {
                    function1.invoke(c5601c);
                }
            }
            MenuItem add = menu.add("");
            add.setShowAsAction(2);
            add.setActionView(this.f15765v);
        }
    }

    /* renamed from: C */
    public final boolean m24843C() {
        C5631l<?> container = m24881q().getContainer();
        if (container instanceof C5640p) {
            if (C9612q.m13922c(((C5640p) container).getRootScreen(), m24881q())) {
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C5644q) {
                    return ((C5644q) parentFragment).m24843C();
                }
                return false;
            }
            return true;
        }
        throw new IllegalStateException("ScreenStackFragment added into a non-stack container".toString());
    }

    /* renamed from: D */
    public final C5601c m24842D() {
        return this.f15765v;
    }

    /* renamed from: F */
    public final void m24840F() {
        Toolbar toolbar;
        AppBarLayout appBarLayout = this.f15761r;
        if (appBarLayout != null && (toolbar = this.f15762s) != null && toolbar.getParent() == appBarLayout) {
            appBarLayout.removeView(toolbar);
        }
        this.f15762s = null;
    }

    /* renamed from: G */
    public final void m24839G(Function1<? super C5601c, Unit> function1) {
        this.f15766w = function1;
    }

    /* renamed from: H */
    public final void m24838H(Toolbar toolbar) {
        C9612q.m13917h(toolbar, "toolbar");
        AppBarLayout appBarLayout = this.f15761r;
        if (appBarLayout != null) {
            appBarLayout.addView(toolbar);
        }
        AppBarLayout.C4747f c4747f = new AppBarLayout.C4747f(-1, -2);
        c4747f.m27881g(0);
        toolbar.setLayoutParams(c4747f);
        this.f15762s = toolbar;
    }

    /* renamed from: I */
    public final void m24837I(boolean z) {
        float pixelFromDIP;
        if (this.f15763t != z) {
            AppBarLayout appBarLayout = this.f15761r;
            if (appBarLayout != null) {
                if (z) {
                    pixelFromDIP = 0.0f;
                } else {
                    pixelFromDIP = PixelUtil.toPixelFromDIP(4.0f);
                }
                appBarLayout.setTargetElevation(pixelFromDIP);
            }
            this.f15763t = z;
        }
    }

    /* renamed from: J */
    public final void m24836J(boolean z) {
        AppBarLayout.ScrollingViewBehavior scrollingViewBehavior;
        if (this.f15764u != z) {
            ViewGroup.LayoutParams layoutParams = m24881q().getLayoutParams();
            C9612q.m13919f(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            CoordinatorLayout.C0685f c0685f = (CoordinatorLayout.C0685f) layoutParams;
            if (z) {
                scrollingViewBehavior = null;
            } else {
                scrollingViewBehavior = new AppBarLayout.ScrollingViewBehavior();
            }
            c0685f.m39157o(scrollingViewBehavior);
            this.f15764u = z;
        }
    }

    public final void dismiss() {
        C5631l<?> container = m24881q().getContainer();
        if (container instanceof C5640p) {
            ((C5640p) container).m24855z(this);
            return;
        }
        throw new IllegalStateException("ScreenStackFragment added into a non-stack container".toString());
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        C9612q.m13917h(menu, "menu");
        C9612q.m13917h(inflater, "inflater");
        m24834L(menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override // com.swmansion.rnscreens.C5634n, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C5646b c5646b;
        AppBarLayout.ScrollingViewBehavior scrollingViewBehavior;
        AppBarLayout appBarLayout;
        AppBarLayout appBarLayout2;
        C9612q.m13917h(inflater, "inflater");
        Context context = getContext();
        AppBarLayout appBarLayout3 = null;
        if (context != null) {
            c5646b = new C5646b(context, this);
        } else {
            c5646b = null;
        }
        C5623j m24881q = m24881q();
        CoordinatorLayout.C0685f c0685f = new CoordinatorLayout.C0685f(-1, -1);
        if (this.f15764u) {
            scrollingViewBehavior = null;
        } else {
            scrollingViewBehavior = new AppBarLayout.ScrollingViewBehavior();
        }
        c0685f.m39157o(scrollingViewBehavior);
        m24881q.setLayoutParams(c0685f);
        if (c5646b != null) {
            c5646b.addView(C5634n.m24879u(m24881q()));
        }
        Context context2 = getContext();
        if (context2 != null) {
            appBarLayout3 = new AppBarLayout(context2);
            appBarLayout3.setBackgroundColor(0);
            appBarLayout3.setLayoutParams(new AppBarLayout.C4747f(-1, -2));
        }
        this.f15761r = appBarLayout3;
        if (c5646b != null) {
            c5646b.addView(appBarLayout3);
        }
        if (this.f15763t && (appBarLayout2 = this.f15761r) != null) {
            appBarLayout2.setTargetElevation(0.0f);
        }
        Toolbar toolbar = this.f15762s;
        if (toolbar != null && (appBarLayout = this.f15761r) != null) {
            appBarLayout.addView(C5634n.m24879u(toolbar));
        }
        setHasOptionsMenu(true);
        return c5646b;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        C9612q.m13917h(menu, "menu");
        m24834L(menu);
        super.onPrepareOptionsMenu(menu);
    }

    @Override // com.swmansion.rnscreens.C5634n
    /* renamed from: r */
    public void mo24833r() {
        C5649s headerConfig = m24881q().getHeaderConfig();
        if (headerConfig != null) {
            headerConfig.m24824g();
        }
    }

    @Override // com.swmansion.rnscreens.C5634n
    /* renamed from: s */
    public void mo24832s() {
        super.mo24832s();
        m24841E();
    }

    public C5644q() {
        throw new IllegalStateException("ScreenStack fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }
}
