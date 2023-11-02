package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.AbstractC1905b;
import java.util.ArrayList;
import java.util.List;
import p176ja.C8878a;
import p402wa.C13466a;

/* renamed from: com.google.android.material.progressindicator.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC4933g extends Drawable implements Animatable {

    /* renamed from: x */
    private static final Property<AbstractC4933g, Float> f13842x = new C4936c(Float.class, "growFraction");

    /* renamed from: j */
    final Context f13843j;

    /* renamed from: k */
    final AbstractC4923b f13844k;

    /* renamed from: m */
    private ValueAnimator f13846m;

    /* renamed from: n */
    private ValueAnimator f13847n;

    /* renamed from: o */
    private boolean f13848o;

    /* renamed from: p */
    private boolean f13849p;

    /* renamed from: q */
    private float f13850q;

    /* renamed from: r */
    private List<AbstractC1905b> f13851r;

    /* renamed from: s */
    private AbstractC1905b f13852s;

    /* renamed from: t */
    private boolean f13853t;

    /* renamed from: u */
    private float f13854u;

    /* renamed from: w */
    private int f13856w;

    /* renamed from: v */
    final Paint f13855v = new Paint();

    /* renamed from: l */
    C13466a f13845l = new C13466a();

    /* renamed from: com.google.android.material.progressindicator.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4934a extends AnimatorListenerAdapter {
        C4934a() {
            AbstractC4933g.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            AbstractC4933g.this.m26868e();
        }
    }

    /* renamed from: com.google.android.material.progressindicator.g$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4935b extends AnimatorListenerAdapter {
        C4935b() {
            AbstractC4933g.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            AbstractC4933g.super.setVisible(false, false);
            AbstractC4933g.this.m26869d();
        }
    }

    /* renamed from: com.google.android.material.progressindicator.g$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4936c extends Property<AbstractC4933g, Float> {
        C4936c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(AbstractC4933g abstractC4933g) {
            return Float.valueOf(abstractC4933g.m26866g());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(AbstractC4933g abstractC4933g, Float f) {
            abstractC4933g.m26864m(f.floatValue());
        }
    }

    public AbstractC4933g(Context context, AbstractC4923b abstractC4923b) {
        this.f13843j = context;
        this.f13844k = abstractC4923b;
        setAlpha(255);
    }

    /* renamed from: d */
    public void m26869d() {
        AbstractC1905b abstractC1905b = this.f13852s;
        if (abstractC1905b != null) {
            abstractC1905b.mo26908a(this);
        }
        List<AbstractC1905b> list = this.f13851r;
        if (list != null && !this.f13853t) {
            for (AbstractC1905b abstractC1905b2 : list) {
                abstractC1905b2.mo26908a(this);
            }
        }
    }

    /* renamed from: e */
    public void m26868e() {
        AbstractC1905b abstractC1905b = this.f13852s;
        if (abstractC1905b != null) {
            abstractC1905b.m35079b(this);
        }
        List<AbstractC1905b> list = this.f13851r;
        if (list != null && !this.f13853t) {
            for (AbstractC1905b abstractC1905b2 : list) {
                abstractC1905b2.m35079b(this);
            }
        }
    }

    /* renamed from: f */
    private void m26867f(ValueAnimator... valueAnimatorArr) {
        boolean z = this.f13853t;
        this.f13853t = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f13853t = z;
    }

    /* renamed from: k */
    private void m26865k() {
        if (this.f13846m == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f13842x, 0.0f, 1.0f);
            this.f13846m = ofFloat;
            ofFloat.setDuration(500L);
            this.f13846m.setInterpolator(C8878a.f23261b);
            m26862o(this.f13846m);
        }
        if (this.f13847n == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f13842x, 1.0f, 0.0f);
            this.f13847n = ofFloat2;
            ofFloat2.setDuration(500L);
            this.f13847n.setInterpolator(C8878a.f23261b);
            m26863n(this.f13847n);
        }
    }

    /* renamed from: n */
    private void m26863n(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f13847n;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.f13847n = valueAnimator;
        valueAnimator.addListener(new C4935b());
    }

    /* renamed from: o */
    private void m26862o(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f13846m;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.f13846m = valueAnimator;
        valueAnimator.addListener(new C4934a());
    }

    /* renamed from: g */
    public float m26866g() {
        if (!this.f13844k.m26906b() && !this.f13844k.m26907a()) {
            return 1.0f;
        }
        if (!this.f13849p && !this.f13848o) {
            return this.f13854u;
        }
        return this.f13850q;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f13856w;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public boolean mo26844h() {
        return mo26840p(false, false, false);
    }

    /* renamed from: i */
    public boolean mo26843i() {
        ValueAnimator valueAnimator = this.f13847n;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f13849p;
    }

    public boolean isRunning() {
        return mo26842j() || mo26843i();
    }

    /* renamed from: j */
    public boolean mo26842j() {
        ValueAnimator valueAnimator = this.f13846m;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f13848o;
    }

    /* renamed from: l */
    public void mo26841l(AbstractC1905b abstractC1905b) {
        if (this.f13851r == null) {
            this.f13851r = new ArrayList();
        }
        if (!this.f13851r.contains(abstractC1905b)) {
            this.f13851r.add(abstractC1905b);
        }
    }

    /* renamed from: m */
    public void m26864m(float f) {
        if (this.f13854u != f) {
            this.f13854u = f;
            invalidateSelf();
        }
    }

    /* renamed from: p */
    public boolean mo26840p(boolean z, boolean z2, boolean z3) {
        boolean z4;
        float m2425a = this.f13845l.m2425a(this.f13843j.getContentResolver());
        if (z3 && m2425a > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        return mo26839q(z, z2, z4);
    }

    /* renamed from: q */
    public boolean mo26839q(boolean z, boolean z2, boolean z3) {
        ValueAnimator valueAnimator;
        boolean z4;
        boolean m26907a;
        m26865k();
        if (!isVisible() && !z) {
            return false;
        }
        if (z) {
            valueAnimator = this.f13846m;
        } else {
            valueAnimator = this.f13847n;
        }
        if (!z3) {
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                m26867f(valueAnimator);
            }
            return super.setVisible(z, false);
        } else if (z3 && valueAnimator.isRunning()) {
            return false;
        } else {
            if (z && !super.setVisible(z, false)) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z) {
                m26907a = this.f13844k.m26906b();
            } else {
                m26907a = this.f13844k.m26907a();
            }
            if (!m26907a) {
                m26867f(valueAnimator);
                return z4;
            }
            if (!z2 && valueAnimator.isPaused()) {
                valueAnimator.resume();
            } else {
                valueAnimator.start();
            }
            return z4;
        }
    }

    /* renamed from: r */
    public boolean mo26838r(AbstractC1905b abstractC1905b) {
        List<AbstractC1905b> list = this.f13851r;
        if (list != null && list.contains(abstractC1905b)) {
            this.f13851r.remove(abstractC1905b);
            if (this.f13851r.isEmpty()) {
                this.f13851r = null;
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f13856w = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f13855v.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return mo26840p(z, z2, true);
    }

    public void start() {
        mo26839q(true, true, false);
    }

    public void stop() {
        mo26839q(false, true, false);
    }
}