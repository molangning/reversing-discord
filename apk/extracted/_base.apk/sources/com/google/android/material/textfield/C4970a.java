package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p155ia.C7483e;
import p155ia.C7487i;
import p176ja.C8878a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.textfield.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4970a extends AbstractC4999f {

    /* renamed from: e */
    private final TextWatcher f14022e;

    /* renamed from: f */
    private final View.OnFocusChangeListener f14023f;

    /* renamed from: g */
    private final TextInputLayout.InterfaceC4966f f14024g;

    /* renamed from: h */
    private final TextInputLayout.InterfaceC4967g f14025h;

    /* renamed from: i */
    private AnimatorSet f14026i;

    /* renamed from: j */
    private ValueAnimator f14027j;

    /* renamed from: com.google.android.material.textfield.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4971a implements TextWatcher {
        C4971a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (C4970a.this.f14074a.getSuffixText() != null) {
                return;
            }
            C4970a c4970a = C4970a.this;
            c4970a.m26674i(c4970a.m26670m());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class View$OnFocusChangeListenerC4972b implements View.OnFocusChangeListener {
        View$OnFocusChangeListenerC4972b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            C4970a c4970a = C4970a.this;
            c4970a.m26674i(c4970a.m26670m());
        }
    }

    /* renamed from: com.google.android.material.textfield.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4973c implements TextInputLayout.InterfaceC4966f {
        C4973c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC4966f
        /* renamed from: a */
        public void mo26563a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(C4970a.this.m26670m());
            editText.setOnFocusChangeListener(C4970a.this.f14023f);
            C4970a c4970a = C4970a.this;
            c4970a.f14076c.setOnFocusChangeListener(c4970a.f14023f);
            editText.removeTextChangedListener(C4970a.this.f14022e);
            editText.addTextChangedListener(C4970a.this.f14022e);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4974d implements TextInputLayout.InterfaceC4967g {

        /* renamed from: com.google.android.material.textfield.a$d$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        class RunnableC4975a implements Runnable {

            /* renamed from: j */
            final /* synthetic */ EditText f14032j;

            RunnableC4975a(EditText editText) {
                this.f14032j = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f14032j.removeTextChangedListener(C4970a.this.f14022e);
                C4970a.this.m26674i(true);
            }
        }

        C4974d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC4967g
        /* renamed from: a */
        public void mo26562a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 2) {
                editText.post(new RunnableC4975a(editText));
                if (editText.getOnFocusChangeListener() == C4970a.this.f14023f) {
                    editText.setOnFocusChangeListener(null);
                }
                if (C4970a.this.f14076c.getOnFocusChangeListener() == C4970a.this.f14023f) {
                    C4970a.this.f14076c.setOnFocusChangeListener(null);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.a$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class View$OnClickListenerC4976e implements View.OnClickListener {
        View$OnClickListenerC4976e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = C4970a.this.f14074a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            C4970a.this.f14074a.m26739U();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.a$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4977f extends AnimatorListenerAdapter {
        C4977f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C4970a.this.f14074a.setEndIconVisible(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.a$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4978g extends AnimatorListenerAdapter {
        C4978g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C4970a.this.f14074a.setEndIconVisible(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.a$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4979h implements ValueAnimator.AnimatorUpdateListener {
        C4979h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C4970a.this.f14076c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.a$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4980i implements ValueAnimator.AnimatorUpdateListener {
        C4980i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C4970a.this.f14076c.setScaleX(floatValue);
            C4970a.this.f14076c.setScaleY(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4970a(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
        this.f14022e = new C4971a();
        this.f14023f = new View$OnFocusChangeListenerC4972b();
        this.f14024g = new C4973c();
        this.f14025h = new C4974d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m26674i(boolean z) {
        boolean z2;
        if (this.f14074a.m26749K() == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && !this.f14026i.isRunning()) {
            this.f14027j.cancel();
            this.f14026i.start();
            if (z2) {
                this.f14026i.end();
            }
        } else if (!z) {
            this.f14026i.cancel();
            this.f14027j.start();
            if (z2) {
                this.f14027j.end();
            }
        }
    }

    /* renamed from: j */
    private ValueAnimator m26673j(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C8878a.f23260a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new C4979h());
        return ofFloat;
    }

    /* renamed from: k */
    private ValueAnimator m26672k() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(C8878a.f23263d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new C4980i());
        return ofFloat;
    }

    /* renamed from: l */
    private void m26671l() {
        ValueAnimator m26672k = m26672k();
        ValueAnimator m26673j = m26673j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f14026i = animatorSet;
        animatorSet.playTogether(m26672k, m26673j);
        this.f14026i.addListener(new C4977f());
        ValueAnimator m26673j2 = m26673j(1.0f, 0.0f);
        this.f14027j = m26673j2;
        m26673j2.addListener(new C4978g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public boolean m26670m() {
        EditText editText = this.f14074a.getEditText();
        if (editText != null && ((editText.hasFocus() || this.f14076c.hasFocus()) && editText.getText().length() > 0)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC4999f
    /* renamed from: a */
    public void mo26568a() {
        TextInputLayout textInputLayout = this.f14074a;
        int i = this.f14077d;
        if (i == 0) {
            i = C7483e.f20183f;
        }
        textInputLayout.setEndIconDrawable(i);
        TextInputLayout textInputLayout2 = this.f14074a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(C7487i.f20252e));
        this.f14074a.setEndIconCheckable(false);
        this.f14074a.setEndIconOnClickListener(new View$OnClickListenerC4976e());
        this.f14074a.m26721g(this.f14024g);
        this.f14074a.m26719h(this.f14025h);
        m26671l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC4999f
    /* renamed from: c */
    public void mo26624c(boolean z) {
        if (this.f14074a.getSuffixText() == null) {
            return;
        }
        m26674i(z);
    }
}
