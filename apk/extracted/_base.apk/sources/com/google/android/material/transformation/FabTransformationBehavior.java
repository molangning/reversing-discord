package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1365w0;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import na.C10517a;
import na.C10520c;
import na.InterfaceC10521d;
import p083eb.C6194a;
import p083eb.C6195b;
import p155ia.C7484f;
import p176ja.C8878a;
import p176ja.C8879b;
import p176ja.C8880c;
import p176ja.C8881d;
import p176ja.C8882e;
import p176ja.C8885h;
import p176ja.C8886i;
import p176ja.C8887j;
import ua.C12941a;

@Deprecated
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final Rect f14197c;

    /* renamed from: d */
    private final RectF f14198d;

    /* renamed from: e */
    private final RectF f14199e;

    /* renamed from: f */
    private final int[] f14200f;

    /* renamed from: g */
    private float f14201g;

    /* renamed from: h */
    private float f14202h;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C5038a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f14203a;

        /* renamed from: b */
        final /* synthetic */ View f14204b;

        /* renamed from: c */
        final /* synthetic */ View f14205c;

        C5038a(boolean z, View view, View view2) {
            this.f14203a = z;
            this.f14204b = view;
            this.f14205c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f14203a) {
                this.f14204b.setVisibility(4);
                this.f14205c.setAlpha(1.0f);
                this.f14205c.setVisibility(0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f14203a) {
                this.f14204b.setVisibility(0);
                this.f14205c.setAlpha(0.0f);
                this.f14205c.setVisibility(4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5039b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f14207a;

        C5039b(View view) {
            this.f14207a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f14207a.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5040c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ InterfaceC10521d f14209a;

        /* renamed from: b */
        final /* synthetic */ Drawable f14210b;

        C5040c(InterfaceC10521d interfaceC10521d, Drawable drawable) {
            this.f14209a = interfaceC10521d;
            this.f14210b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f14209a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f14209a.setCircularRevealOverlayDrawable(this.f14210b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5041d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ InterfaceC10521d f14212a;

        C5041d(InterfaceC10521d interfaceC10521d) {
            this.f14212a = interfaceC10521d;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            InterfaceC10521d.C10526e revealInfo = this.f14212a.getRevealInfo();
            revealInfo.f27503c = Float.MAX_VALUE;
            this.f14212a.setRevealInfo(revealInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C5042e {

        /* renamed from: a */
        public C8885h f14214a;

        /* renamed from: b */
        public C8887j f14215b;
    }

    public FabTransformationBehavior() {
        this.f14197c = new Rect();
        this.f14198d = new RectF();
        this.f14199e = new RectF();
        this.f14200f = new int[2];
    }

    /* renamed from: K */
    private ViewGroup m26479K(View view) {
        View findViewById = view.findViewById(C7484f.f20185A);
        if (findViewById != null) {
            return m26459f0(findViewById);
        }
        if (!(view instanceof C6195b) && !(view instanceof C6194a)) {
            return m26459f0(view);
        }
        return m26459f0(((ViewGroup) view).getChildAt(0));
    }

    /* renamed from: L */
    private void m26478L(View view, C5042e c5042e, C8886i c8886i, C8886i c8886i2, float f, float f2, float f3, float f4, RectF rectF) {
        float m26471S = m26471S(c5042e, c8886i, f, f3);
        float m26471S2 = m26471S(c5042e, c8886i2, f2, f4);
        Rect rect = this.f14197c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f14198d;
        rectF2.set(rect);
        RectF rectF3 = this.f14199e;
        m26470T(view, rectF3);
        rectF3.offset(m26471S, m26471S2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* renamed from: M */
    private void m26477M(View view, RectF rectF) {
        m26470T(view, rectF);
        rectF.offset(this.f14201g, this.f14202h);
    }

    /* renamed from: N */
    private Pair<C8886i, C8886i> m26476N(float f, float f2, boolean z, C5042e c5042e) {
        C8886i m17095e;
        C8886i m17095e2;
        int i;
        if (f != 0.0f && f2 != 0.0f) {
            if ((z && f2 < 0.0f) || (!z && i > 0)) {
                m17095e = c5042e.f14214a.m17095e("translationXCurveUpwards");
                m17095e2 = c5042e.f14214a.m17095e("translationYCurveUpwards");
            } else {
                m17095e = c5042e.f14214a.m17095e("translationXCurveDownwards");
                m17095e2 = c5042e.f14214a.m17095e("translationYCurveDownwards");
            }
        } else {
            m17095e = c5042e.f14214a.m17095e("translationXLinear");
            m17095e2 = c5042e.f14214a.m17095e("translationYLinear");
        }
        return new Pair<>(m17095e, m17095e2);
    }

    /* renamed from: O */
    private float m26475O(View view, View view2, C8887j c8887j) {
        RectF rectF = this.f14198d;
        RectF rectF2 = this.f14199e;
        m26477M(view, rectF);
        m26470T(view2, rectF2);
        rectF2.offset(-m26473Q(view, view2, c8887j), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    /* renamed from: P */
    private float m26474P(View view, View view2, C8887j c8887j) {
        RectF rectF = this.f14198d;
        RectF rectF2 = this.f14199e;
        m26477M(view, rectF);
        m26470T(view2, rectF2);
        rectF2.offset(0.0f, -m26472R(view, view2, c8887j));
        return rectF.centerY() - rectF2.top;
    }

    /* renamed from: Q */
    private float m26473Q(View view, View view2, C8887j c8887j) {
        float centerX;
        float centerX2;
        float f;
        RectF rectF = this.f14198d;
        RectF rectF2 = this.f14199e;
        m26477M(view, rectF);
        m26470T(view2, rectF2);
        int i = c8887j.f23280a & 7;
        if (i != 1) {
            if (i != 3) {
                if (i != 5) {
                    f = 0.0f;
                    return f + c8887j.f23281b;
                }
                centerX = rectF2.right;
                centerX2 = rectF.right;
            } else {
                centerX = rectF2.left;
                centerX2 = rectF.left;
            }
        } else {
            centerX = rectF2.centerX();
            centerX2 = rectF.centerX();
        }
        f = centerX - centerX2;
        return f + c8887j.f23281b;
    }

    /* renamed from: R */
    private float m26472R(View view, View view2, C8887j c8887j) {
        float centerY;
        float centerY2;
        float f;
        RectF rectF = this.f14198d;
        RectF rectF2 = this.f14199e;
        m26477M(view, rectF);
        m26470T(view2, rectF2);
        int i = c8887j.f23280a & 112;
        if (i != 16) {
            if (i != 48) {
                if (i != 80) {
                    f = 0.0f;
                    return f + c8887j.f23282c;
                }
                centerY = rectF2.bottom;
                centerY2 = rectF.bottom;
            } else {
                centerY = rectF2.top;
                centerY2 = rectF.top;
            }
        } else {
            centerY = rectF2.centerY();
            centerY2 = rectF.centerY();
        }
        f = centerY - centerY2;
        return f + c8887j.f23282c;
    }

    /* renamed from: S */
    private float m26471S(C5042e c5042e, C8886i c8886i, float f, float f2) {
        long m17088c = c8886i.m17088c();
        long m17087d = c8886i.m17087d();
        C8886i m17095e = c5042e.f14214a.m17095e("expansion");
        return C8878a.m17112a(f, f2, c8886i.m17086e().getInterpolation(((float) (((m17095e.m17088c() + m17095e.m17087d()) + 17) - m17088c)) / ((float) m17087d)));
    }

    /* renamed from: T */
    private void m26470T(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f14200f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    /* renamed from: U */
    private void m26469U(View view, View view2, boolean z, boolean z2, C5042e c5042e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup m26479K;
        ObjectAnimator ofFloat;
        if (!(view2 instanceof ViewGroup)) {
            return;
        }
        if (((view2 instanceof InterfaceC10521d) && C10520c.f27496a == 0) || (m26479K = m26479K(view2)) == null) {
            return;
        }
        if (z) {
            if (!z2) {
                C8881d.f23266a.set(m26479K, Float.valueOf(0.0f));
            }
            ofFloat = ObjectAnimator.ofFloat(m26479K, C8881d.f23266a, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(m26479K, C8881d.f23266a, 0.0f);
        }
        c5042e.f14214a.m17095e("contentFade").m17090a(ofFloat);
        list.add(ofFloat);
    }

    /* renamed from: V */
    private void m26468V(View view, View view2, boolean z, boolean z2, C5042e c5042e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if (!(view2 instanceof InterfaceC10521d)) {
            return;
        }
        InterfaceC10521d interfaceC10521d = (InterfaceC10521d) view2;
        int m26460d0 = m26460d0(view);
        int i = 16777215 & m26460d0;
        if (z) {
            if (!z2) {
                interfaceC10521d.setCircularRevealScrimColor(m26460d0);
            }
            ofInt = ObjectAnimator.ofInt(interfaceC10521d, InterfaceC10521d.C10525d.f27500a, i);
        } else {
            ofInt = ObjectAnimator.ofInt(interfaceC10521d, InterfaceC10521d.C10525d.f27500a, m26460d0);
        }
        ofInt.setEvaluator(C8880c.m17107b());
        c5042e.f14214a.m17095e(ViewProps.COLOR).m17090a(ofInt);
        list.add(ofInt);
    }

    /* renamed from: W */
    private void m26467W(View view, View view2, boolean z, C5042e c5042e, List<Animator> list) {
        float m26473Q = m26473Q(view, view2, c5042e.f14215b);
        float m26472R = m26472R(view, view2, c5042e.f14215b);
        Pair<C8886i, C8886i> m26476N = m26476N(m26473Q, m26472R, z, c5042e);
        C8886i c8886i = (C8886i) m26476N.first;
        C8886i c8886i2 = (C8886i) m26476N.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            m26473Q = this.f14201g;
        }
        fArr[0] = m26473Q;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            m26472R = this.f14202h;
        }
        fArr2[0] = m26472R;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        c8886i.m17090a(ofFloat);
        c8886i2.m17090a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    @TargetApi(21)
    /* renamed from: X */
    private void m26466X(View view, View view2, boolean z, boolean z2, C5042e c5042e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofFloat;
        float m37174w = C1365w0.m37174w(view2) - C1365w0.m37174w(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-m37174w);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -m37174w);
        }
        c5042e.f14214a.m17095e(ViewProps.ELEVATION).m17090a(ofFloat);
        list.add(ofFloat);
    }

    /* renamed from: Y */
    private void m26465Y(View view, View view2, boolean z, boolean z2, C5042e c5042e, float f, float f2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        if (!(view2 instanceof InterfaceC10521d)) {
            return;
        }
        InterfaceC10521d interfaceC10521d = (InterfaceC10521d) view2;
        float m26475O = m26475O(view, view2, c5042e.f14215b);
        float m26474P = m26474P(view, view2, c5042e.f14215b);
        ((FloatingActionButton) view).m27176i(this.f14197c);
        float width = this.f14197c.width() / 2.0f;
        C8886i m17095e = c5042e.f14214a.m17095e("expansion");
        if (z) {
            if (!z2) {
                interfaceC10521d.setRevealInfo(new InterfaceC10521d.C10526e(m26475O, m26474P, width));
            }
            if (z2) {
                width = interfaceC10521d.getRevealInfo().f27503c;
            }
            animator = C10517a.m11328a(interfaceC10521d, m26475O, m26474P, C12941a.m3640b(m26475O, m26474P, 0.0f, 0.0f, f, f2));
            animator.addListener(new C5041d(interfaceC10521d));
            m26462b0(view2, m17095e.m17088c(), (int) m26475O, (int) m26474P, width, list);
        } else {
            float f3 = interfaceC10521d.getRevealInfo().f27503c;
            Animator m11328a = C10517a.m11328a(interfaceC10521d, m26475O, m26474P, width);
            int i = (int) m26475O;
            int i2 = (int) m26474P;
            m26462b0(view2, m17095e.m17088c(), i, i2, f3, list);
            m26463a0(view2, m17095e.m17088c(), m17095e.m17087d(), c5042e.f14214a.m17094f(), i, i2, width, list);
            animator = m11328a;
        }
        m17095e.m17090a(animator);
        list.add(animator);
        list2.add(C10517a.m11327b(interfaceC10521d));
    }

    /* renamed from: Z */
    private void m26464Z(View view, View view2, boolean z, boolean z2, C5042e c5042e, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator ofInt;
        if ((view2 instanceof InterfaceC10521d) && (view instanceof ImageView)) {
            InterfaceC10521d interfaceC10521d = (InterfaceC10521d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z) {
                if (!z2) {
                    drawable.setAlpha(255);
                }
                ofInt = ObjectAnimator.ofInt(drawable, C8882e.f23267b, 0);
            } else {
                ofInt = ObjectAnimator.ofInt(drawable, C8882e.f23267b, 255);
            }
            ofInt.addUpdateListener(new C5039b(view2));
            c5042e.f14214a.m17095e("iconFade").m17090a(ofInt);
            list.add(ofInt);
            list2.add(new C5040c(interfaceC10521d, drawable));
        }
    }

    /* renamed from: a0 */
    private void m26463a0(View view, long j, long j2, long j3, int i, int i2, float f, List<Animator> list) {
        long j4 = j + j2;
        if (j4 < j3) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(j4);
            createCircularReveal.setDuration(j3 - j4);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: b0 */
    private void m26462b0(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0L);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: c0 */
    private void m26461c0(View view, View view2, boolean z, boolean z2, C5042e c5042e, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float m26473Q = m26473Q(view, view2, c5042e.f14215b);
        float m26472R = m26472R(view, view2, c5042e.f14215b);
        Pair<C8886i, C8886i> m26476N = m26476N(m26473Q, m26472R, z, c5042e);
        C8886i c8886i = (C8886i) m26476N.first;
        C8886i c8886i2 = (C8886i) m26476N.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-m26473Q);
                view2.setTranslationY(-m26472R);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, 0.0f);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f);
            m26478L(view2, c5042e, c8886i, c8886i2, -m26473Q, -m26472R, 0.0f, 0.0f, rectF);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, -m26473Q);
            ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, -m26472R);
        }
        c8886i.m17090a(ofFloat);
        c8886i2.m17090a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    /* renamed from: d0 */
    private int m26460d0(View view) {
        ColorStateList m37182s = C1365w0.m37182s(view);
        if (m37182s != null) {
            return m37182s.getColorForState(view.getDrawableState(), m37182s.getDefaultColor());
        }
        return 0;
    }

    /* renamed from: f0 */
    private ViewGroup m26459f0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: J */
    protected AnimatorSet mo26456J(View view, View view2, boolean z, boolean z2) {
        C5042e mo26452e0 = mo26452e0(view2.getContext(), z);
        if (z) {
            this.f14201g = view.getTranslationX();
            this.f14202h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m26466X(view, view2, z, z2, mo26452e0, arrayList, arrayList2);
        RectF rectF = this.f14198d;
        m26461c0(view, view2, z, z2, mo26452e0, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        m26467W(view, view2, z, mo26452e0, arrayList);
        m26464Z(view, view2, z, z2, mo26452e0, arrayList, arrayList2);
        m26465Y(view, view2, z, z2, mo26452e0, width, height, arrayList, arrayList2);
        m26468V(view, view2, z, z2, mo26452e0, arrayList, arrayList2);
        m26469U(view, view2, z, z2, mo26452e0, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        C8879b.m17109a(animatorSet, arrayList);
        animatorSet.addListener(new C5038a(z, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener(arrayList2.get(i));
        }
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
    /* renamed from: e */
    public boolean mo26454e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            if (!(view2 instanceof FloatingActionButton)) {
                return false;
            }
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint != 0 && expandedComponentIdHint != view.getId()) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    /* renamed from: e0 */
    protected abstract C5042e mo26452e0(Context context, boolean z);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
    /* renamed from: g */
    public void mo26458g(CoordinatorLayout.C0685f c0685f) {
        if (c0685f.f2978h == 0) {
            c0685f.f2978h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14197c = new Rect();
        this.f14198d = new RectF();
        this.f14199e = new RectF();
        this.f14200f = new int[2];
    }
}
