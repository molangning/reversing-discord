package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.graphics.drawable.C1013a;
import androidx.core.util.C1138f;
import androidx.core.view.C1365w0;
import bb.C2232g;
import bb.C2236h;
import bb.C2239k;
import bb.InterfaceC2255n;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.internal.C4899i;
import java.util.ArrayList;
import java.util.Iterator;
import p012ab.InterfaceC0138b;
import p155ia.C7480b;
import p155ia.C7485g;
import p176ja.C8878a;
import p176ja.C8879b;
import p176ja.C8883f;
import p176ja.C8884g;
import p176ja.C8885h;
import va.C13227a;
import za.C14143b;

/* renamed from: com.google.android.material.floatingactionbutton.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4867a {

    /* renamed from: C */
    static final TimeInterpolator f13575C = C8878a.f23262c;

    /* renamed from: D */
    static final int[] f13576D = {16842919, 16842910};

    /* renamed from: E */
    static final int[] f13577E = {16843623, 16842908, 16842910};

    /* renamed from: F */
    static final int[] f13578F = {16842908, 16842910};

    /* renamed from: G */
    static final int[] f13579G = {16843623, 16842910};

    /* renamed from: H */
    static final int[] f13580H = {16842910};

    /* renamed from: I */
    static final int[] f13581I = new int[0];

    /* renamed from: B */
    private ViewTreeObserver.OnPreDrawListener f13583B;

    /* renamed from: a */
    C2239k f13584a;

    /* renamed from: b */
    C2232g f13585b;

    /* renamed from: c */
    Drawable f13586c;

    /* renamed from: d */
    Drawable f13587d;

    /* renamed from: e */
    boolean f13588e;

    /* renamed from: g */
    float f13590g;

    /* renamed from: h */
    float f13591h;

    /* renamed from: i */
    float f13592i;

    /* renamed from: j */
    int f13593j;

    /* renamed from: k */
    private final C4899i f13594k;

    /* renamed from: l */
    private Animator f13595l;

    /* renamed from: m */
    private C8885h f13596m;

    /* renamed from: n */
    private C8885h f13597n;

    /* renamed from: o */
    private float f13598o;

    /* renamed from: q */
    private int f13600q;

    /* renamed from: s */
    private ArrayList<Animator.AnimatorListener> f13602s;

    /* renamed from: t */
    private ArrayList<Animator.AnimatorListener> f13603t;

    /* renamed from: u */
    private ArrayList<InterfaceC4877j> f13604u;

    /* renamed from: v */
    final FloatingActionButton f13605v;

    /* renamed from: w */
    final InterfaceC0138b f13606w;

    /* renamed from: f */
    boolean f13589f = true;

    /* renamed from: p */
    private float f13599p = 1.0f;

    /* renamed from: r */
    private int f13601r = 0;

    /* renamed from: x */
    private final Rect f13607x = new Rect();

    /* renamed from: y */
    private final RectF f13608y = new RectF();

    /* renamed from: z */
    private final RectF f13609z = new RectF();

    /* renamed from: A */
    private final Matrix f13582A = new Matrix();

    /* renamed from: com.google.android.material.floatingactionbutton.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4868a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f13610a;

        /* renamed from: b */
        final /* synthetic */ boolean f13611b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC4878k f13612c;

        C4868a(boolean z, InterfaceC4878k interfaceC4878k) {
            C4867a.this = r1;
            this.f13611b = z;
            this.f13612c = interfaceC4878k;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f13610a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i;
            C4867a.this.f13601r = 0;
            C4867a.this.f13595l = null;
            if (!this.f13610a) {
                FloatingActionButton floatingActionButton = C4867a.this.f13605v;
                boolean z = this.f13611b;
                if (z) {
                    i = 8;
                } else {
                    i = 4;
                }
                floatingActionButton.m26928b(i, z);
                InterfaceC4878k interfaceC4878k = this.f13612c;
                if (interfaceC4878k != null) {
                    interfaceC4878k.mo27098b();
                }
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C4867a.this.f13605v.m26928b(0, this.f13611b);
            C4867a.this.f13601r = 1;
            C4867a.this.f13595l = animator;
            this.f13610a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4869b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f13614a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC4878k f13615b;

        C4869b(boolean z, InterfaceC4878k interfaceC4878k) {
            C4867a.this = r1;
            this.f13614a = z;
            this.f13615b = interfaceC4878k;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C4867a.this.f13601r = 0;
            C4867a.this.f13595l = null;
            InterfaceC4878k interfaceC4878k = this.f13615b;
            if (interfaceC4878k != null) {
                interfaceC4878k.mo27099a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C4867a.this.f13605v.m26928b(0, this.f13614a);
            C4867a.this.f13601r = 2;
            C4867a.this.f13595l = animator;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4870c extends C8884g {
        C4870c() {
            C4867a.this = r1;
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            C4867a.this.f13599p = f;
            return super.mo17100a(f, matrix, matrix2);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4871d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ float f13618a;

        /* renamed from: b */
        final /* synthetic */ float f13619b;

        /* renamed from: c */
        final /* synthetic */ float f13620c;

        /* renamed from: d */
        final /* synthetic */ float f13621d;

        /* renamed from: e */
        final /* synthetic */ float f13622e;

        /* renamed from: f */
        final /* synthetic */ float f13623f;

        /* renamed from: g */
        final /* synthetic */ float f13624g;

        /* renamed from: h */
        final /* synthetic */ Matrix f13625h;

        C4871d(float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix) {
            C4867a.this = r1;
            this.f13618a = f;
            this.f13619b = f2;
            this.f13620c = f3;
            this.f13621d = f4;
            this.f13622e = f5;
            this.f13623f = f6;
            this.f13624g = f7;
            this.f13625h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C4867a.this.f13605v.setAlpha(C8878a.m17111b(this.f13618a, this.f13619b, 0.0f, 0.2f, floatValue));
            C4867a.this.f13605v.setScaleX(C8878a.m17112a(this.f13620c, this.f13621d, floatValue));
            C4867a.this.f13605v.setScaleY(C8878a.m17112a(this.f13622e, this.f13621d, floatValue));
            C4867a.this.f13599p = C8878a.m17112a(this.f13623f, this.f13624g, floatValue);
            C4867a.this.m27118h(C8878a.m17112a(this.f13623f, this.f13624g, floatValue), this.f13625h);
            C4867a.this.f13605v.setImageMatrix(this.f13625h);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4872e implements TypeEvaluator<Float> {

        /* renamed from: a */
        FloatEvaluator f13627a = new FloatEvaluator();

        C4872e() {
            C4867a.this = r1;
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Float evaluate(float f, Float f2, Float f3) {
            float floatValue = this.f13627a.evaluate(f, (Number) f2, (Number) f3).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class ViewTreeObserver$OnPreDrawListenerC4873f implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserver$OnPreDrawListenerC4873f() {
            C4867a.this = r1;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            C4867a.this.m27147F();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.floatingactionbutton.a$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4874g extends AbstractC4880m {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4874g() {
            super(r2, null);
            C4867a.this = r2;
        }

        @Override // com.google.android.material.floatingactionbutton.C4867a.AbstractC4880m
        /* renamed from: a */
        protected float mo27097a() {
            return 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.floatingactionbutton.a$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4875h extends AbstractC4880m {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4875h() {
            super(r2, null);
            C4867a.this = r2;
        }

        @Override // com.google.android.material.floatingactionbutton.C4867a.AbstractC4880m
        /* renamed from: a */
        protected float mo27097a() {
            C4867a c4867a = C4867a.this;
            return c4867a.f13590g + c4867a.f13591h;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.floatingactionbutton.a$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4876i extends AbstractC4880m {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4876i() {
            super(r2, null);
            C4867a.this = r2;
        }

        @Override // com.google.android.material.floatingactionbutton.C4867a.AbstractC4880m
        /* renamed from: a */
        protected float mo27097a() {
            C4867a c4867a = C4867a.this;
            return c4867a.f13590g + c4867a.f13592i;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4877j {
        /* renamed from: a */
        void mo27101a();

        /* renamed from: b */
        void mo27100b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$k */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4878k {
        /* renamed from: a */
        void mo27099a();

        /* renamed from: b */
        void mo27098b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.floatingactionbutton.a$l */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4879l extends AbstractC4880m {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4879l() {
            super(r2, null);
            C4867a.this = r2;
        }

        @Override // com.google.android.material.floatingactionbutton.C4867a.AbstractC4880m
        /* renamed from: a */
        protected float mo27097a() {
            return C4867a.this.f13590g;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.floatingactionbutton.a$m */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public abstract class AbstractC4880m extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private boolean f13634a;

        /* renamed from: b */
        private float f13635b;

        /* renamed from: c */
        private float f13636c;

        private AbstractC4880m() {
            C4867a.this = r1;
        }

        /* renamed from: a */
        protected abstract float mo27097a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C4867a.this.m27123d0((int) this.f13636c);
            this.f13634a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float m33886w;
            if (!this.f13634a) {
                C2232g c2232g = C4867a.this.f13585b;
                if (c2232g == null) {
                    m33886w = 0.0f;
                } else {
                    m33886w = c2232g.m33886w();
                }
                this.f13635b = m33886w;
                this.f13636c = mo27097a();
                this.f13634a = true;
            }
            C4867a c4867a = C4867a.this;
            float f = this.f13635b;
            c4867a.m27123d0((int) (f + ((this.f13636c - f) * valueAnimator.getAnimatedFraction())));
        }

        /* synthetic */ AbstractC4880m(C4867a c4867a, C4868a c4868a) {
            this();
        }
    }

    public C4867a(FloatingActionButton floatingActionButton, InterfaceC0138b interfaceC0138b) {
        this.f13605v = floatingActionButton;
        this.f13606w = interfaceC0138b;
        C4899i c4899i = new C4899i();
        this.f13594k = c4899i;
        c4899i.m26973a(f13576D, m27115k(new C4876i()));
        c4899i.m26973a(f13577E, m27115k(new C4875h()));
        c4899i.m26973a(f13578F, m27115k(new C4875h()));
        c4899i.m26973a(f13579G, m27115k(new C4875h()));
        c4899i.m26973a(f13580H, m27115k(new C4879l()));
        c4899i.m26973a(f13581I, m27115k(new C4874g()));
        this.f13598o = floatingActionButton.getRotation();
    }

    /* renamed from: X */
    private boolean m27132X() {
        return C1365w0.m37224U(this.f13605v) && !this.f13605v.isInEditMode();
    }

    /* renamed from: e0 */
    private void m27121e0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new C4872e());
    }

    /* renamed from: h */
    public void m27118h(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f13605v.getDrawable();
        if (drawable != null && this.f13600q != 0) {
            RectF rectF = this.f13608y;
            RectF rectF2 = this.f13609z;
            rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            int i = this.f13600q;
            rectF2.set(0.0f, 0.0f, i, i);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i2 = this.f13600q;
            matrix.postScale(f, f, i2 / 2.0f, i2 / 2.0f);
        }
    }

    /* renamed from: i */
    private AnimatorSet m27117i(C8885h c8885h, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f13605v, View.ALPHA, f);
        c8885h.m17095e(ViewProps.OPACITY).m17090a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f13605v, View.SCALE_X, f2);
        c8885h.m17095e("scale").m17090a(ofFloat2);
        m27121e0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f13605v, View.SCALE_Y, f2);
        c8885h.m17095e("scale").m17090a(ofFloat3);
        m27121e0(ofFloat3);
        arrayList.add(ofFloat3);
        m27118h(f3, this.f13582A);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f13605v, new C8883f(), new C4870c(), new Matrix(this.f13582A));
        c8885h.m17095e("iconScale").m17090a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C8879b.m17109a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: j */
    private AnimatorSet m27116j(float f, float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C4871d(this.f13605v.getAlpha(), f, this.f13605v.getScaleX(), f2, this.f13605v.getScaleY(), this.f13599p, f3, new Matrix(this.f13582A)));
        arrayList.add(ofFloat);
        C8879b.m17109a(animatorSet, arrayList);
        animatorSet.setDuration(C13227a.m3004d(this.f13605v.getContext(), C7480b.f20122y, this.f13605v.getContext().getResources().getInteger(C7485g.f20228b)));
        animatorSet.setInterpolator(C13227a.m3003e(this.f13605v.getContext(), C7480b.f20123z, C8878a.f23261b));
        return animatorSet;
    }

    /* renamed from: k */
    private ValueAnimator m27115k(AbstractC4880m abstractC4880m) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f13575C);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(abstractC4880m);
        valueAnimator.addUpdateListener(abstractC4880m);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* renamed from: q */
    private ViewTreeObserver.OnPreDrawListener m27110q() {
        if (this.f13583B == null) {
            this.f13583B = new ViewTreeObserver$OnPreDrawListenerC4873f();
        }
        return this.f13583B;
    }

    /* renamed from: A */
    public void mo27096A() {
        throw null;
    }

    /* renamed from: B */
    public void m27149B() {
        ViewTreeObserver viewTreeObserver = this.f13605v.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f13583B;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f13583B = null;
        }
    }

    /* renamed from: C */
    public void mo27095C(int[] iArr) {
        throw null;
    }

    /* renamed from: D */
    void mo27094D(float f, float f2, float f3) {
        throw null;
    }

    /* renamed from: E */
    void m27148E(Rect rect) {
        C1138f.m37823g(this.f13587d, "Didn't initialize content background");
        if (mo27091W()) {
            this.f13606w.mo27151b(new InsetDrawable(this.f13587d, rect.left, rect.top, rect.right, rect.bottom));
            return;
        }
        this.f13606w.mo27151b(this.f13587d);
    }

    /* renamed from: F */
    void m27147F() {
        float rotation = this.f13605v.getRotation();
        if (this.f13598o != rotation) {
            this.f13598o = rotation;
            mo27090a0();
        }
    }

    /* renamed from: G */
    public void m27146G() {
        ArrayList<InterfaceC4877j> arrayList = this.f13604u;
        if (arrayList != null) {
            Iterator<InterfaceC4877j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo27100b();
            }
        }
    }

    /* renamed from: H */
    public void m27145H() {
        ArrayList<InterfaceC4877j> arrayList = this.f13604u;
        if (arrayList != null) {
            Iterator<InterfaceC4877j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo27101a();
            }
        }
    }

    /* renamed from: I */
    boolean mo27093I() {
        throw null;
    }

    /* renamed from: J */
    public void m27144J(ColorStateList colorStateList) {
        C2232g c2232g = this.f13585b;
        if (c2232g != null) {
            c2232g.setTintList(colorStateList);
        }
    }

    /* renamed from: K */
    public void m27143K(PorterDuff.Mode mode) {
        C2232g c2232g = this.f13585b;
        if (c2232g != null) {
            c2232g.setTintMode(mode);
        }
    }

    /* renamed from: L */
    public final void m27142L(float f) {
        if (this.f13590g != f) {
            this.f13590g = f;
            mo27094D(f, this.f13591h, this.f13592i);
        }
    }

    /* renamed from: M */
    public void m27141M(boolean z) {
        this.f13588e = z;
    }

    /* renamed from: N */
    public final void m27140N(C8885h c8885h) {
        this.f13597n = c8885h;
    }

    /* renamed from: O */
    public final void m27139O(float f) {
        if (this.f13591h != f) {
            this.f13591h = f;
            mo27094D(this.f13590g, f, this.f13592i);
        }
    }

    /* renamed from: P */
    final void m27138P(float f) {
        this.f13599p = f;
        Matrix matrix = this.f13582A;
        m27118h(f, matrix);
        this.f13605v.setImageMatrix(matrix);
    }

    /* renamed from: Q */
    public final void m27137Q(int i) {
        if (this.f13600q != i) {
            this.f13600q = i;
            m27127b0();
        }
    }

    /* renamed from: R */
    public final void m27136R(float f) {
        if (this.f13592i != f) {
            this.f13592i = f;
            mo27094D(this.f13590g, this.f13591h, f);
        }
    }

    /* renamed from: S */
    public void mo27092S(ColorStateList colorStateList) {
        Drawable drawable = this.f13586c;
        if (drawable != null) {
            C1013a.m38083o(drawable, C14143b.m590a(colorStateList));
        }
    }

    /* renamed from: T */
    public void m27135T(boolean z) {
        this.f13589f = z;
        m27125c0();
    }

    /* renamed from: U */
    public final void m27134U(C2239k c2239k) {
        this.f13584a = c2239k;
        C2232g c2232g = this.f13585b;
        if (c2232g != null) {
            c2232g.setShapeAppearanceModel(c2239k);
        }
        Drawable drawable = this.f13586c;
        if (drawable instanceof InterfaceC2255n) {
            ((InterfaceC2255n) drawable).setShapeAppearanceModel(c2239k);
        }
    }

    /* renamed from: V */
    public final void m27133V(C8885h c8885h) {
        this.f13596m = c8885h;
    }

    /* renamed from: W */
    boolean mo27091W() {
        throw null;
    }

    /* renamed from: Y */
    public final boolean m27131Y() {
        return !this.f13588e || this.f13605v.getSizeDimension() >= this.f13593j;
    }

    /* renamed from: Z */
    public void m27130Z(InterfaceC4878k interfaceC4878k, boolean z) {
        boolean z2;
        AnimatorSet m27116j;
        float f;
        float f2;
        if (m27104x()) {
            return;
        }
        Animator animator = this.f13595l;
        if (animator != null) {
            animator.cancel();
        }
        if (this.f13596m == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (m27132X()) {
            if (this.f13605v.getVisibility() != 0) {
                float f3 = 0.0f;
                this.f13605v.setAlpha(0.0f);
                FloatingActionButton floatingActionButton = this.f13605v;
                if (z2) {
                    f = 0.4f;
                } else {
                    f = 0.0f;
                }
                floatingActionButton.setScaleY(f);
                FloatingActionButton floatingActionButton2 = this.f13605v;
                if (z2) {
                    f2 = 0.4f;
                } else {
                    f2 = 0.0f;
                }
                floatingActionButton2.setScaleX(f2);
                if (z2) {
                    f3 = 0.4f;
                }
                m27138P(f3);
            }
            C8885h c8885h = this.f13596m;
            if (c8885h != null) {
                m27116j = m27117i(c8885h, 1.0f, 1.0f, 1.0f);
            } else {
                m27116j = m27116j(1.0f, 1.0f, 1.0f);
            }
            m27116j.addListener(new C4869b(z, interfaceC4878k));
            ArrayList<Animator.AnimatorListener> arrayList = this.f13602s;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    m27116j.addListener(it.next());
                }
            }
            m27116j.start();
            return;
        }
        this.f13605v.m26928b(0, z);
        this.f13605v.setAlpha(1.0f);
        this.f13605v.setScaleY(1.0f);
        this.f13605v.setScaleX(1.0f);
        m27138P(1.0f);
        if (interfaceC4878k != null) {
            interfaceC4878k.mo27099a();
        }
    }

    /* renamed from: a0 */
    void mo27090a0() {
        throw null;
    }

    /* renamed from: b0 */
    public final void m27127b0() {
        m27138P(this.f13599p);
    }

    /* renamed from: c0 */
    public final void m27125c0() {
        Rect rect = this.f13607x;
        mo27087r(rect);
        m27148E(rect);
        this.f13606w.mo27152a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: d0 */
    public void m27123d0(float f) {
        C2232g c2232g = this.f13585b;
        if (c2232g != null) {
            c2232g.m33920X(f);
        }
    }

    /* renamed from: e */
    public void m27122e(Animator.AnimatorListener animatorListener) {
        if (this.f13603t == null) {
            this.f13603t = new ArrayList<>();
        }
        this.f13603t.add(animatorListener);
    }

    /* renamed from: f */
    public void m27120f(Animator.AnimatorListener animatorListener) {
        if (this.f13602s == null) {
            this.f13602s = new ArrayList<>();
        }
        this.f13602s.add(animatorListener);
    }

    /* renamed from: g */
    public void m27119g(InterfaceC4877j interfaceC4877j) {
        if (this.f13604u == null) {
            this.f13604u = new ArrayList<>();
        }
        this.f13604u.add(interfaceC4877j);
    }

    /* renamed from: l */
    public final Drawable m27114l() {
        return this.f13587d;
    }

    /* renamed from: m */
    public float mo27088m() {
        throw null;
    }

    /* renamed from: n */
    public boolean m27113n() {
        return this.f13588e;
    }

    /* renamed from: o */
    public final C8885h m27112o() {
        return this.f13597n;
    }

    /* renamed from: p */
    public float m27111p() {
        return this.f13591h;
    }

    /* renamed from: r */
    public void mo27087r(Rect rect) {
        int i;
        float f;
        if (this.f13588e) {
            i = (this.f13593j - this.f13605v.getSizeDimension()) / 2;
        } else {
            i = 0;
        }
        if (this.f13589f) {
            f = mo27088m() + this.f13592i;
        } else {
            f = 0.0f;
        }
        int max = Math.max(i, (int) Math.ceil(f));
        int max2 = Math.max(i, (int) Math.ceil(f * 1.5f));
        rect.set(max, max2, max, max2);
    }

    /* renamed from: s */
    public float m27109s() {
        return this.f13592i;
    }

    /* renamed from: t */
    public final C2239k m27108t() {
        return this.f13584a;
    }

    /* renamed from: u */
    public final C8885h m27107u() {
        return this.f13596m;
    }

    /* renamed from: v */
    public void m27106v(InterfaceC4878k interfaceC4878k, boolean z) {
        int i;
        AnimatorSet m27116j;
        if (m27105w()) {
            return;
        }
        Animator animator = this.f13595l;
        if (animator != null) {
            animator.cancel();
        }
        if (m27132X()) {
            C8885h c8885h = this.f13597n;
            if (c8885h != null) {
                m27116j = m27117i(c8885h, 0.0f, 0.0f, 0.0f);
            } else {
                m27116j = m27116j(0.0f, 0.4f, 0.4f);
            }
            m27116j.addListener(new C4868a(z, interfaceC4878k));
            ArrayList<Animator.AnimatorListener> arrayList = this.f13603t;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                while (it.hasNext()) {
                    m27116j.addListener(it.next());
                }
            }
            m27116j.start();
            return;
        }
        FloatingActionButton floatingActionButton = this.f13605v;
        if (z) {
            i = 8;
        } else {
            i = 4;
        }
        floatingActionButton.m26928b(i, z);
        if (interfaceC4878k != null) {
            interfaceC4878k.mo27098b();
        }
    }

    /* renamed from: w */
    public boolean m27105w() {
        if (this.f13605v.getVisibility() == 0) {
            if (this.f13601r != 1) {
                return false;
            }
            return true;
        } else if (this.f13601r == 2) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: x */
    public boolean m27104x() {
        if (this.f13605v.getVisibility() != 0) {
            if (this.f13601r != 2) {
                return false;
            }
            return true;
        } else if (this.f13601r == 1) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: y */
    public void mo27086y() {
        throw null;
    }

    /* renamed from: z */
    public void m27103z() {
        C2232g c2232g = this.f13585b;
        if (c2232g != null) {
            C2236h.m33877f(this.f13605v, c2232g);
        }
        if (mo27093I()) {
            this.f13605v.getViewTreeObserver().addOnPreDrawListener(m27110q());
        }
    }
}