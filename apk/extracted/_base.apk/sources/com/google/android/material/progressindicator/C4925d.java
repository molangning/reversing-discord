package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.AbstractC1905b;
import com.reactnativecommunity.webview.RNCWebViewManager;
import p145i0.C7373b;
import p176ja.C8880c;
import pa.C11487a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.progressindicator.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4925d extends AbstractC4938i<ObjectAnimator> {

    /* renamed from: l */
    private static final int[] f13818l = {0, 1350, 2700, 4050};

    /* renamed from: m */
    private static final int[] f13819m = {667, 2017, 3367, 4717};

    /* renamed from: n */
    private static final int[] f13820n = {RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, 2350, 3700, 5050};

    /* renamed from: o */
    private static final Property<C4925d, Float> f13821o = new C4928c(Float.class, "animationFraction");

    /* renamed from: p */
    private static final Property<C4925d, Float> f13822p = new C4929d(Float.class, "completeEndFraction");

    /* renamed from: d */
    private ObjectAnimator f13823d;

    /* renamed from: e */
    private ObjectAnimator f13824e;

    /* renamed from: f */
    private final C7373b f13825f;

    /* renamed from: g */
    private final AbstractC4923b f13826g;

    /* renamed from: h */
    private int f13827h;

    /* renamed from: i */
    private float f13828i;

    /* renamed from: j */
    private float f13829j;

    /* renamed from: k */
    AbstractC1905b f13830k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.progressindicator.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4926a extends AnimatorListenerAdapter {
        C4926a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            C4925d c4925d = C4925d.this;
            c4925d.f13827h = (c4925d.f13827h + 4) % C4925d.this.f13826g.f13810c.length;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.progressindicator.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4927b extends AnimatorListenerAdapter {
        C4927b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C4925d.this.mo26852a();
            C4925d c4925d = C4925d.this;
            AbstractC1905b abstractC1905b = c4925d.f13830k;
            if (abstractC1905b != null) {
                abstractC1905b.mo26908a(c4925d.f13861a);
            }
        }
    }

    /* renamed from: com.google.android.material.progressindicator.d$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4928c extends Property<C4925d, Float> {
        C4928c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(C4925d c4925d) {
            return Float.valueOf(c4925d.m26895o());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C4925d c4925d, Float f) {
            c4925d.m26890t(f.floatValue());
        }
    }

    /* renamed from: com.google.android.material.progressindicator.d$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4929d extends Property<C4925d, Float> {
        C4929d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(C4925d c4925d) {
            return Float.valueOf(c4925d.m26894p());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C4925d c4925d, Float f) {
            c4925d.m26889u(f.floatValue());
        }
    }

    public C4925d(C4930e c4930e) {
        super(1);
        this.f13827h = 0;
        this.f13830k = null;
        this.f13826g = c4930e;
        this.f13825f = new C7373b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public float m26895o() {
        return this.f13828i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public float m26894p() {
        return this.f13829j;
    }

    /* renamed from: q */
    private void m26893q() {
        if (this.f13823d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f13821o, 0.0f, 1.0f);
            this.f13823d = ofFloat;
            ofFloat.setDuration(5400L);
            this.f13823d.setInterpolator(null);
            this.f13823d.setRepeatCount(-1);
            this.f13823d.addListener(new C4926a());
        }
        if (this.f13824e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f13822p, 0.0f, 1.0f);
            this.f13824e = ofFloat2;
            ofFloat2.setDuration(333L);
            this.f13824e.setInterpolator(this.f13825f);
            this.f13824e.addListener(new C4927b());
        }
    }

    /* renamed from: r */
    private void m26892r(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            float m26851b = m26851b(i, f13820n[i2], 333);
            if (m26851b >= 0.0f && m26851b <= 1.0f) {
                int i3 = i2 + this.f13827h;
                int[] iArr = this.f13826g.f13810c;
                int length = i3 % iArr.length;
                this.f13863c[0] = C8880c.m17107b().evaluate(this.f13825f.getInterpolation(m26851b), Integer.valueOf(C11487a.m8019a(iArr[length], this.f13861a.getAlpha())), Integer.valueOf(C11487a.m8019a(this.f13826g.f13810c[(length + 1) % iArr.length], this.f13861a.getAlpha()))).intValue();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public void m26889u(float f) {
        this.f13829j = f;
    }

    /* renamed from: v */
    private void m26888v(int i) {
        float[] fArr = this.f13862b;
        float f = this.f13828i;
        fArr[0] = (f * 1520.0f) - 20.0f;
        fArr[1] = f * 1520.0f;
        for (int i2 = 0; i2 < 4; i2++) {
            float m26851b = m26851b(i, f13818l[i2], 667);
            float[] fArr2 = this.f13862b;
            fArr2[1] = fArr2[1] + (this.f13825f.getInterpolation(m26851b) * 250.0f);
            float m26851b2 = m26851b(i, f13819m[i2], 667);
            float[] fArr3 = this.f13862b;
            fArr3[0] = fArr3[0] + (this.f13825f.getInterpolation(m26851b2) * 250.0f);
        }
        float[] fArr4 = this.f13862b;
        float f2 = fArr4[0];
        float f3 = fArr4[1];
        float f4 = f2 + ((f3 - f2) * this.f13829j);
        fArr4[0] = f4;
        fArr4[0] = f4 / 360.0f;
        fArr4[1] = f3 / 360.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.AbstractC4938i
    /* renamed from: a */
    public void mo26852a() {
        ObjectAnimator objectAnimator = this.f13823d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.AbstractC4938i
    /* renamed from: c */
    public void mo26850c() {
        m26891s();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4938i
    /* renamed from: d */
    public void mo26849d(AbstractC1905b abstractC1905b) {
        this.f13830k = abstractC1905b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.AbstractC4938i
    /* renamed from: f */
    public void mo26847f() {
        ObjectAnimator objectAnimator = this.f13824e;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            if (this.f13861a.isVisible()) {
                this.f13824e.start();
            } else {
                mo26852a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.AbstractC4938i
    /* renamed from: g */
    public void mo26846g() {
        m26893q();
        m26891s();
        this.f13823d.start();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4938i
    /* renamed from: h */
    public void mo26845h() {
        this.f13830k = null;
    }

    /* renamed from: s */
    void m26891s() {
        this.f13827h = 0;
        this.f13863c[0] = C11487a.m8019a(this.f13826g.f13810c[0], this.f13861a.getAlpha());
        this.f13829j = 0.0f;
    }

    /* renamed from: t */
    void m26890t(float f) {
        this.f13828i = f;
        int i = (int) (f * 5400.0f);
        m26888v(i);
        m26892r(i);
        this.f13861a.invalidateSelf();
    }
}
