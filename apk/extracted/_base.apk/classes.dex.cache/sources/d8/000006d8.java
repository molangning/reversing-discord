package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.p018os.C1056f;
import androidx.core.view.ViewTreeObserver$OnPreDrawListenerC1354u0;
import androidx.fragment.app.C1616o;
import p124h0.C6858a;
import p124h0.C6859b;

/* renamed from: androidx.fragment.app.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1592d {

    /* renamed from: androidx.fragment.app.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1593a implements C1056f.InterfaceC1058b {

        /* renamed from: a */
        final /* synthetic */ Fragment f4208a;

        C1593a(Fragment fragment) {
            this.f4208a = fragment;
        }

        @Override // androidx.core.p018os.C1056f.InterfaceC1058b
        public void onCancel() {
            if (this.f4208a.getAnimatingAway() != null) {
                View animatingAway = this.f4208a.getAnimatingAway();
                this.f4208a.setAnimatingAway(null);
                animatingAway.clearAnimation();
            }
            this.f4208a.setAnimator(null);
        }
    }

    /* renamed from: androidx.fragment.app.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class animationAnimation$AnimationListenerC1594b implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f4209a;

        /* renamed from: b */
        final /* synthetic */ Fragment f4210b;

        /* renamed from: c */
        final /* synthetic */ C1616o.InterfaceC1623g f4211c;

        /* renamed from: d */
        final /* synthetic */ C1056f f4212d;

        /* renamed from: androidx.fragment.app.d$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class RunnableC1595a implements Runnable {
            RunnableC1595a() {
                animationAnimation$AnimationListenerC1594b.this = r1;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (animationAnimation$AnimationListenerC1594b.this.f4210b.getAnimatingAway() != null) {
                    animationAnimation$AnimationListenerC1594b.this.f4210b.setAnimatingAway(null);
                    animationAnimation$AnimationListenerC1594b animationanimation_animationlistenerc1594b = animationAnimation$AnimationListenerC1594b.this;
                    animationanimation_animationlistenerc1594b.f4211c.mo36185a(animationanimation_animationlistenerc1594b.f4210b, animationanimation_animationlistenerc1594b.f4212d);
                }
            }
        }

        animationAnimation$AnimationListenerC1594b(ViewGroup viewGroup, Fragment fragment, C1616o.InterfaceC1623g interfaceC1623g, C1056f c1056f) {
            this.f4209a = viewGroup;
            this.f4210b = fragment;
            this.f4211c = interfaceC1623g;
            this.f4212d = c1056f;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f4209a.post(new RunnableC1595a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.fragment.app.d$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1596c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f4214a;

        /* renamed from: b */
        final /* synthetic */ View f4215b;

        /* renamed from: c */
        final /* synthetic */ Fragment f4216c;

        /* renamed from: d */
        final /* synthetic */ C1616o.InterfaceC1623g f4217d;

        /* renamed from: e */
        final /* synthetic */ C1056f f4218e;

        C1596c(ViewGroup viewGroup, View view, Fragment fragment, C1616o.InterfaceC1623g interfaceC1623g, C1056f c1056f) {
            this.f4214a = viewGroup;
            this.f4215b = view;
            this.f4216c = fragment;
            this.f4217d = interfaceC1623g;
            this.f4218e = c1056f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4214a.endViewTransition(this.f4215b);
            Animator animator2 = this.f4216c.getAnimator();
            this.f4216c.setAnimator(null);
            if (animator2 != null && this.f4214a.indexOfChild(this.f4215b) < 0) {
                this.f4217d.mo36185a(this.f4216c, this.f4218e);
            }
        }
    }

    /* renamed from: a */
    public static void m36298a(Fragment fragment, C1597d c1597d, C1616o.InterfaceC1623g interfaceC1623g) {
        View view = fragment.mView;
        ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        C1056f c1056f = new C1056f();
        c1056f.m37975c(new C1593a(fragment));
        interfaceC1623g.mo36184b(fragment, c1056f);
        if (c1597d.f4219a != null) {
            RunnableC1598e runnableC1598e = new RunnableC1598e(c1597d.f4219a, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            runnableC1598e.setAnimationListener(new animationAnimation$AnimationListenerC1594b(viewGroup, fragment, interfaceC1623g, c1056f));
            fragment.mView.startAnimation(runnableC1598e);
            return;
        }
        Animator animator = c1597d.f4220b;
        fragment.setAnimator(animator);
        animator.addListener(new C1596c(viewGroup, view, fragment, interfaceC1623g, c1056f));
        animator.setTarget(fragment.mView);
        animator.start();
    }

    /* renamed from: b */
    private static int m36297b(Fragment fragment, boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return fragment.getPopEnterAnim();
            }
            return fragment.getPopExitAnim();
        } else if (z) {
            return fragment.getEnterAnim();
        } else {
            return fragment.getExitAnim();
        }
    }

    /* renamed from: c */
    public static C1597d m36296c(Context context, Fragment fragment, boolean z, boolean z2) {
        int nextTransition = fragment.getNextTransition();
        int m36297b = m36297b(fragment, z, z2);
        boolean z3 = false;
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int i = C6859b.f19100c;
            if (viewGroup.getTag(i) != null) {
                fragment.mContainer.setTag(i, null);
            }
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z, m36297b);
        if (onCreateAnimation != null) {
            return new C1597d(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z, m36297b);
        if (onCreateAnimator != null) {
            return new C1597d(onCreateAnimator);
        }
        if (m36297b == 0 && nextTransition != 0) {
            m36297b = m36295d(nextTransition, z);
        }
        if (m36297b != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(m36297b));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, m36297b);
                    if (loadAnimation != null) {
                        return new C1597d(loadAnimation);
                    }
                    z3 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, m36297b);
                    if (loadAnimator != null) {
                        return new C1597d(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, m36297b);
                        if (loadAnimation2 != null) {
                            return new C1597d(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    private static int m36295d(int i, boolean z) {
        if (i != 4097) {
            if (i != 4099) {
                if (i != 8194) {
                    return -1;
                }
                if (z) {
                    return C6858a.f19092a;
                }
                return C6858a.f19093b;
            } else if (z) {
                return C6858a.f19094c;
            } else {
                return C6858a.f19095d;
            }
        } else if (z) {
            return C6858a.f19096e;
        } else {
            return C6858a.f19097f;
        }
    }

    /* renamed from: androidx.fragment.app.d$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1597d {

        /* renamed from: a */
        public final Animation f4219a;

        /* renamed from: b */
        public final Animator f4220b;

        C1597d(Animation animation) {
            this.f4219a = animation;
            this.f4220b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        C1597d(Animator animator) {
            this.f4219a = null;
            this.f4220b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class RunnableC1598e extends AnimationSet implements Runnable {

        /* renamed from: j */
        private final ViewGroup f4221j;

        /* renamed from: k */
        private final View f4222k;

        /* renamed from: l */
        private boolean f4223l;

        /* renamed from: m */
        private boolean f4224m;

        /* renamed from: n */
        private boolean f4225n;

        public RunnableC1598e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f4225n = true;
            this.f4221j = viewGroup;
            this.f4222k = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            this.f4225n = true;
            if (this.f4223l) {
                return !this.f4224m;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f4223l = true;
                ViewTreeObserver$OnPreDrawListenerC1354u0.m37280a(this.f4221j, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f4223l && this.f4225n) {
                this.f4225n = false;
                this.f4221j.post(this);
                return;
            }
            this.f4221j.endViewTransition(this.f4222k);
            this.f4224m = true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f4225n = true;
            if (this.f4223l) {
                return !this.f4224m;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f4223l = true;
                ViewTreeObserver$OnPreDrawListenerC1354u0.m37280a(this.f4221j, this);
            }
            return true;
        }
    }
}