package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.C1365w0;
import androidx.core.widget.C1435k;
import java.util.ArrayList;
import java.util.List;
import p155ia.C7482d;
import p155ia.C7484f;
import p176ja.C8878a;
import p176ja.C8879b;
import p443ya.C13957c;

/* renamed from: com.google.android.material.textfield.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5001h {

    /* renamed from: a */
    private final Context f14078a;

    /* renamed from: b */
    private final TextInputLayout f14079b;

    /* renamed from: c */
    private LinearLayout f14080c;

    /* renamed from: d */
    private int f14081d;

    /* renamed from: e */
    private FrameLayout f14082e;

    /* renamed from: f */
    private Animator f14083f;

    /* renamed from: g */
    private final float f14084g;

    /* renamed from: h */
    private int f14085h;

    /* renamed from: i */
    private int f14086i;

    /* renamed from: j */
    private CharSequence f14087j;

    /* renamed from: k */
    private boolean f14088k;

    /* renamed from: l */
    private TextView f14089l;

    /* renamed from: m */
    private CharSequence f14090m;

    /* renamed from: n */
    private int f14091n;

    /* renamed from: o */
    private ColorStateList f14092o;

    /* renamed from: p */
    private CharSequence f14093p;

    /* renamed from: q */
    private boolean f14094q;

    /* renamed from: r */
    private TextView f14095r;

    /* renamed from: s */
    private int f14096s;

    /* renamed from: t */
    private ColorStateList f14097t;

    /* renamed from: u */
    private Typeface f14098u;

    /* renamed from: com.google.android.material.textfield.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5002a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f14099a;

        /* renamed from: b */
        final /* synthetic */ TextView f14100b;

        /* renamed from: c */
        final /* synthetic */ int f14101c;

        /* renamed from: d */
        final /* synthetic */ TextView f14102d;

        C5002a(int i, TextView textView, int i2, TextView textView2) {
            C5001h.this = r1;
            this.f14099a = i;
            this.f14100b = textView;
            this.f14101c = i2;
            this.f14102d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C5001h.this.f14085h = this.f14099a;
            C5001h.this.f14083f = null;
            TextView textView = this.f14100b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f14101c == 1 && C5001h.this.f14089l != null) {
                    C5001h.this.f14089l.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f14102d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f14102d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f14102d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.h$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5003b extends View.AccessibilityDelegate {
        C5003b() {
            C5001h.this = r1;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = C5001h.this.f14079b.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public C5001h(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f14078a = context;
        this.f14079b = textInputLayout;
        this.f14084g = context.getResources().getDimensionPixelSize(C7482d.f20159h);
    }

    /* renamed from: C */
    private void m26614C(int i, int i2) {
        TextView m26587m;
        TextView m26587m2;
        if (i == i2) {
            return;
        }
        if (i2 != 0 && (m26587m2 = m26587m(i2)) != null) {
            m26587m2.setVisibility(0);
            m26587m2.setAlpha(1.0f);
        }
        if (i != 0 && (m26587m = m26587m(i)) != null) {
            m26587m.setVisibility(4);
            if (i == 1) {
                m26587m.setText((CharSequence) null);
            }
        }
        this.f14085h = i2;
    }

    /* renamed from: K */
    private void m26606K(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: M */
    private void m26604M(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: N */
    private boolean m26603N(TextView textView, CharSequence charSequence) {
        if (C1365w0.m37224U(this.f14079b) && this.f14079b.isEnabled() && (this.f14086i != this.f14085h || textView == null || !TextUtils.equals(textView.getText(), charSequence))) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    private void m26600Q(int i, int i2, boolean z) {
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f14083f = animatorSet;
            ArrayList arrayList = new ArrayList();
            m26591i(arrayList, this.f14094q, this.f14095r, 2, i, i2);
            m26591i(arrayList, this.f14088k, this.f14089l, 1, i, i2);
            C8879b.m17109a(animatorSet, arrayList);
            animatorSet.addListener(new C5002a(i2, m26587m(i), i, m26587m(i2)));
            animatorSet.start();
        } else {
            m26614C(i, i2);
        }
        this.f14079b.m26698r0();
        this.f14079b.m26688w0(z);
        this.f14079b.m26755E0();
    }

    /* renamed from: g */
    private boolean m26593g() {
        return (this.f14080c == null || this.f14079b.getEditText() == null) ? false : true;
    }

    /* renamed from: i */
    private void m26591i(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        boolean z2;
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                if (i3 == i) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                list.add(m26590j(textView, z2));
                if (i3 == i) {
                    list.add(m26589k(textView));
                }
            }
        }
    }

    /* renamed from: j */
    private ObjectAnimator m26590j(TextView textView, boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, f);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(C8878a.f23260a);
        return ofFloat;
    }

    /* renamed from: k */
    private ObjectAnimator m26589k(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.f14084g, 0.0f);
        ofFloat.setDuration(217L);
        ofFloat.setInterpolator(C8878a.f23263d);
        return ofFloat;
    }

    /* renamed from: m */
    private TextView m26587m(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return this.f14095r;
        }
        return this.f14089l;
    }

    /* renamed from: u */
    private int m26579u(boolean z, int i, int i2) {
        return z ? this.f14078a.getResources().getDimensionPixelSize(i) : i2;
    }

    /* renamed from: x */
    private boolean m26576x(int i) {
        if (i == 1 && this.f14089l != null && !TextUtils.isEmpty(this.f14087j)) {
            return true;
        }
        return false;
    }

    /* renamed from: A */
    public boolean m26616A() {
        return this.f14094q;
    }

    /* renamed from: B */
    public void m26615B(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.f14080c == null) {
            return;
        }
        if (m26575y(i) && (frameLayout = this.f14082e) != null) {
            frameLayout.removeView(textView);
        } else {
            this.f14080c.removeView(textView);
        }
        int i2 = this.f14081d - 1;
        this.f14081d = i2;
        m26604M(this.f14080c, i2);
    }

    /* renamed from: D */
    public void m26613D(CharSequence charSequence) {
        this.f14090m = charSequence;
        TextView textView = this.f14089l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* renamed from: E */
    public void m26612E(boolean z) {
        if (this.f14088k == z) {
            return;
        }
        m26592h();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f14078a);
            this.f14089l = appCompatTextView;
            appCompatTextView.setId(C7484f.f20196L);
            this.f14089l.setTextAlignment(5);
            Typeface typeface = this.f14098u;
            if (typeface != null) {
                this.f14089l.setTypeface(typeface);
            }
            m26611F(this.f14091n);
            m26610G(this.f14092o);
            m26613D(this.f14090m);
            this.f14089l.setVisibility(4);
            C1365w0.m37181s0(this.f14089l, 1);
            m26595e(this.f14089l, 0);
        } else {
            m26578v();
            m26615B(this.f14089l, 0);
            this.f14089l = null;
            this.f14079b.m26698r0();
            this.f14079b.m26755E0();
        }
        this.f14088k = z;
    }

    /* renamed from: F */
    public void m26611F(int i) {
        this.f14091n = i;
        TextView textView = this.f14089l;
        if (textView != null) {
            this.f14079b.m26726d0(textView, i);
        }
    }

    /* renamed from: G */
    public void m26610G(ColorStateList colorStateList) {
        this.f14092o = colorStateList;
        TextView textView = this.f14089l;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: H */
    public void m26609H(int i) {
        this.f14096s = i;
        TextView textView = this.f14095r;
        if (textView != null) {
            C1435k.m36867n(textView, i);
        }
    }

    /* renamed from: I */
    public void m26608I(boolean z) {
        if (this.f14094q == z) {
            return;
        }
        m26592h();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f14078a);
            this.f14095r = appCompatTextView;
            appCompatTextView.setId(C7484f.f20197M);
            this.f14095r.setTextAlignment(5);
            Typeface typeface = this.f14098u;
            if (typeface != null) {
                this.f14095r.setTypeface(typeface);
            }
            this.f14095r.setVisibility(4);
            C1365w0.m37181s0(this.f14095r, 1);
            m26609H(this.f14096s);
            m26607J(this.f14097t);
            m26595e(this.f14095r, 1);
            this.f14095r.setAccessibilityDelegate(new C5003b());
        } else {
            m26577w();
            m26615B(this.f14095r, 1);
            this.f14095r = null;
            this.f14079b.m26698r0();
            this.f14079b.m26755E0();
        }
        this.f14094q = z;
    }

    /* renamed from: J */
    public void m26607J(ColorStateList colorStateList) {
        this.f14097t = colorStateList;
        TextView textView = this.f14095r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: L */
    public void m26605L(Typeface typeface) {
        if (typeface != this.f14098u) {
            this.f14098u = typeface;
            m26606K(this.f14089l, typeface);
            m26606K(this.f14095r, typeface);
        }
    }

    /* renamed from: O */
    public void m26602O(CharSequence charSequence) {
        m26592h();
        this.f14087j = charSequence;
        this.f14089l.setText(charSequence);
        int i = this.f14085h;
        if (i != 1) {
            this.f14086i = 1;
        }
        m26600Q(i, this.f14086i, m26603N(this.f14089l, charSequence));
    }

    /* renamed from: P */
    public void m26601P(CharSequence charSequence) {
        m26592h();
        this.f14093p = charSequence;
        this.f14095r.setText(charSequence);
        int i = this.f14085h;
        if (i != 2) {
            this.f14086i = 2;
        }
        m26600Q(i, this.f14086i, m26603N(this.f14095r, charSequence));
    }

    /* renamed from: e */
    public void m26595e(TextView textView, int i) {
        if (this.f14080c == null && this.f14082e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f14078a);
            this.f14080c = linearLayout;
            linearLayout.setOrientation(0);
            this.f14079b.addView(this.f14080c, -1, -2);
            this.f14082e = new FrameLayout(this.f14078a);
            this.f14080c.addView(this.f14082e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f14079b.getEditText() != null) {
                m26594f();
            }
        }
        if (m26575y(i)) {
            this.f14082e.setVisibility(0);
            this.f14082e.addView(textView);
        } else {
            this.f14080c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f14080c.setVisibility(0);
        this.f14081d++;
    }

    /* renamed from: f */
    public void m26594f() {
        if (m26593g()) {
            EditText editText = this.f14079b.getEditText();
            boolean m1083g = C13957c.m1083g(this.f14078a);
            LinearLayout linearLayout = this.f14080c;
            int i = C7482d.f20171t;
            C1365w0.m37249F0(linearLayout, m26579u(m1083g, i, C1365w0.m37248G(editText)), m26579u(m1083g, C7482d.f20172u, this.f14078a.getResources().getDimensionPixelSize(C7482d.f20170s)), m26579u(m1083g, i, C1365w0.m37250F(editText)), 0);
        }
    }

    /* renamed from: h */
    void m26592h() {
        Animator animator = this.f14083f;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: l */
    public boolean m26588l() {
        return m26576x(this.f14086i);
    }

    /* renamed from: n */
    public CharSequence m26586n() {
        return this.f14090m;
    }

    /* renamed from: o */
    public CharSequence m26585o() {
        return this.f14087j;
    }

    /* renamed from: p */
    public int m26584p() {
        TextView textView = this.f14089l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* renamed from: q */
    public ColorStateList m26583q() {
        TextView textView = this.f14089l;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* renamed from: r */
    public CharSequence m26582r() {
        return this.f14093p;
    }

    /* renamed from: s */
    public View m26581s() {
        return this.f14095r;
    }

    /* renamed from: t */
    public int m26580t() {
        TextView textView = this.f14095r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* renamed from: v */
    public void m26578v() {
        this.f14087j = null;
        m26592h();
        if (this.f14085h == 1) {
            if (this.f14094q && !TextUtils.isEmpty(this.f14093p)) {
                this.f14086i = 2;
            } else {
                this.f14086i = 0;
            }
        }
        m26600Q(this.f14085h, this.f14086i, m26603N(this.f14089l, ""));
    }

    /* renamed from: w */
    void m26577w() {
        m26592h();
        int i = this.f14085h;
        if (i == 2) {
            this.f14086i = 0;
        }
        m26600Q(i, this.f14086i, m26603N(this.f14095r, ""));
    }

    /* renamed from: y */
    boolean m26575y(int i) {
        return i == 0 || i == 1;
    }

    /* renamed from: z */
    public boolean m26574z() {
        return this.f14088k;
    }
}