package p176ja;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: ja.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C8886i {

    /* renamed from: a */
    private long f23275a;

    /* renamed from: b */
    private long f23276b;

    /* renamed from: c */
    private TimeInterpolator f23277c;

    /* renamed from: d */
    private int f23278d;

    /* renamed from: e */
    private int f23279e;

    public C8886i(long j, long j2) {
        this.f23277c = null;
        this.f23278d = 0;
        this.f23279e = 1;
        this.f23275a = j;
        this.f23276b = j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C8886i m17089b(ValueAnimator valueAnimator) {
        C8886i c8886i = new C8886i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m17085f(valueAnimator));
        c8886i.f23278d = valueAnimator.getRepeatCount();
        c8886i.f23279e = valueAnimator.getRepeatMode();
        return c8886i;
    }

    /* renamed from: f */
    private static TimeInterpolator m17085f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
            if (interpolator instanceof AccelerateInterpolator) {
                return C8878a.f23262c;
            }
            if (interpolator instanceof DecelerateInterpolator) {
                return C8878a.f23263d;
            }
            return interpolator;
        }
        return C8878a.f23261b;
    }

    /* renamed from: a */
    public void m17090a(Animator animator) {
        animator.setStartDelay(m17088c());
        animator.setDuration(m17087d());
        animator.setInterpolator(m17086e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(m17084g());
            valueAnimator.setRepeatMode(m17083h());
        }
    }

    /* renamed from: c */
    public long m17088c() {
        return this.f23275a;
    }

    /* renamed from: d */
    public long m17087d() {
        return this.f23276b;
    }

    /* renamed from: e */
    public TimeInterpolator m17086e() {
        TimeInterpolator timeInterpolator = this.f23277c;
        return timeInterpolator != null ? timeInterpolator : C8878a.f23261b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8886i)) {
            return false;
        }
        C8886i c8886i = (C8886i) obj;
        if (m17088c() != c8886i.m17088c() || m17087d() != c8886i.m17087d() || m17084g() != c8886i.m17084g() || m17083h() != c8886i.m17083h()) {
            return false;
        }
        return m17086e().getClass().equals(c8886i.m17086e().getClass());
    }

    /* renamed from: g */
    public int m17084g() {
        return this.f23278d;
    }

    /* renamed from: h */
    public int m17083h() {
        return this.f23279e;
    }

    public int hashCode() {
        return (((((((((int) (m17088c() ^ (m17088c() >>> 32))) * 31) + ((int) (m17087d() ^ (m17087d() >>> 32)))) * 31) + m17086e().getClass().hashCode()) * 31) + m17084g()) * 31) + m17083h();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + m17088c() + " duration: " + m17087d() + " interpolator: " + m17086e().getClass() + " repeatCount: " + m17084g() + " repeatMode: " + m17083h() + "}\n";
    }

    public C8886i(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f23278d = 0;
        this.f23279e = 1;
        this.f23275a = j;
        this.f23276b = j2;
        this.f23277c = timeInterpolator;
    }
}
