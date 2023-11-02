package p291q1;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: q1.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class AbstractC11671c extends ValueAnimator {

    /* renamed from: j */
    private final Set<ValueAnimator.AnimatorUpdateListener> f30435j = new CopyOnWriteArraySet();

    /* renamed from: k */
    private final Set<Animator.AnimatorListener> f30436k = new CopyOnWriteArraySet();

    /* renamed from: l */
    private final Set<Animator.AnimatorPauseListener> f30437l = new CopyOnWriteArraySet();

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f30436k.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f30437l.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f30435j.add(animatorUpdateListener);
    }

    /* renamed from: b */
    public void mo7220b() {
        for (Animator.AnimatorListener animatorListener : this.f30436k) {
            animatorListener.onAnimationCancel(this);
        }
    }

    /* renamed from: c */
    public void m7249c(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.f30436k) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    /* renamed from: d */
    public void m7248d() {
        for (Animator.AnimatorPauseListener animatorPauseListener : this.f30437l) {
            animatorPauseListener.onAnimationPause(this);
        }
    }

    /* renamed from: e */
    public void m7247e() {
        for (Animator.AnimatorListener animatorListener : this.f30436k) {
            animatorListener.onAnimationRepeat(this);
        }
    }

    /* renamed from: f */
    public void m7246f() {
        for (Animator.AnimatorPauseListener animatorPauseListener : this.f30437l) {
            animatorPauseListener.onAnimationResume(this);
        }
    }

    /* renamed from: g */
    public void m7245g(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.f30436k) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    /* renamed from: j */
    public void m7244j() {
        for (ValueAnimator.AnimatorUpdateListener animatorUpdateListener : this.f30435j) {
            animatorUpdateListener.onAnimationUpdate(this);
        }
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.f30436k.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.f30435j.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f30436k.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f30437l.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f30435j.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}