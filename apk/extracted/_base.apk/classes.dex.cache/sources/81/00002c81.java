package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.C1365w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.C1197c;
import bb.C2232g;
import bb.C2239k;
import com.google.android.material.internal.C4907l;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import p155ia.C7480b;
import p155ia.C7482d;
import p155ia.C7483e;
import p155ia.C7487i;
import p176ja.C8878a;
import pa.C11487a;

/* renamed from: com.google.android.material.textfield.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4984e extends AbstractC4999f {

    /* renamed from: t */
    private static final boolean f14041t = true;

    /* renamed from: e */
    private final TextWatcher f14042e;

    /* renamed from: f */
    private final View.OnFocusChangeListener f14043f;

    /* renamed from: g */
    private final TextInputLayout.C4965e f14044g;

    /* renamed from: h */
    private final TextInputLayout.InterfaceC4966f f14045h;
    @SuppressLint({"ClickableViewAccessibility"})

    /* renamed from: i */
    private final TextInputLayout.InterfaceC4967g f14046i;

    /* renamed from: j */
    private final View.OnAttachStateChangeListener f14047j;

    /* renamed from: k */
    private final C1197c.InterfaceC1199b f14048k;

    /* renamed from: l */
    private boolean f14049l;

    /* renamed from: m */
    private boolean f14050m;

    /* renamed from: n */
    private long f14051n;

    /* renamed from: o */
    private StateListDrawable f14052o;

    /* renamed from: p */
    private C2232g f14053p;

    /* renamed from: q */
    private AccessibilityManager f14054q;

    /* renamed from: r */
    private ValueAnimator f14055r;

    /* renamed from: s */
    private ValueAnimator f14056s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4985a extends C4907l {

        /* renamed from: com.google.android.material.textfield.e$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        class RunnableC4986a implements Runnable {

            /* renamed from: j */
            final /* synthetic */ AutoCompleteTextView f14058j;

            RunnableC4986a(AutoCompleteTextView autoCompleteTextView) {
                C4985a.this = r1;
                this.f14058j = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean isPopupShowing = this.f14058j.isPopupShowing();
                C4984e.this.m26653J(isPopupShowing);
                C4984e.this.f14049l = isPopupShowing;
            }
        }

        C4985a() {
            C4984e.this = r1;
        }

        @Override // com.google.android.material.internal.C4907l, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView m26660C = C4984e.m26660C(C4984e.this.f14074a.getEditText());
            if (C4984e.this.f14054q.isTouchExplorationEnabled() && C4984e.m26655H(m26660C) && !C4984e.this.f14076c.hasFocus()) {
                m26660C.dismissDropDown();
            }
            m26660C.post(new RunnableC4986a(m26660C));
        }
    }

    /* renamed from: com.google.android.material.textfield.e$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4987b implements AutoCompleteTextView.OnDismissListener {
        C4987b() {
            C4984e.this = r1;
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            C4984e.this.m26649N();
            C4984e.this.m26653J(false);
        }
    }

    /* renamed from: com.google.android.material.textfield.e$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4988c extends AnimatorListenerAdapter {
        C4988c() {
            C4984e.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C4984e c4984e = C4984e.this;
            c4984e.f14076c.setChecked(c4984e.f14050m);
            C4984e.this.f14056s.start();
        }
    }

    /* renamed from: com.google.android.material.textfield.e$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4989d implements ValueAnimator.AnimatorUpdateListener {
        C4989d() {
            C4984e.this = r1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C4984e.this.f14076c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.e$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class View$OnFocusChangeListenerC4990e implements View.OnFocusChangeListener {
        View$OnFocusChangeListenerC4990e() {
            C4984e.this = r1;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            C4984e.this.f14074a.setEndIconActivated(z);
            if (!z) {
                C4984e.this.m26653J(false);
                C4984e.this.f14049l = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.e$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4991f extends TextInputLayout.C4965e {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4991f(TextInputLayout textInputLayout) {
            super(textInputLayout);
            C4984e.this = r1;
        }

        @Override // com.google.android.material.textfield.TextInputLayout.C4965e, androidx.core.view.C1170a
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            if (!C4984e.m26655H(C4984e.this.f14074a.getEditText())) {
                accessibilityNodeInfoCompat.m37590g0(Spinner.class.getName());
            }
            if (accessibilityNodeInfoCompat.m37612R()) {
                accessibilityNodeInfoCompat.m37570q0(null);
            }
        }

        @Override // androidx.core.view.C1170a
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            AutoCompleteTextView m26660C = C4984e.m26660C(C4984e.this.f14074a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && C4984e.this.f14054q.isEnabled() && !C4984e.m26655H(C4984e.this.f14074a.getEditText())) {
                C4984e.this.m26650M(m26660C);
                C4984e.this.m26649N();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.e$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4992g implements TextInputLayout.InterfaceC4966f {
        C4992g() {
            C4984e.this = r1;
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC4966f
        /* renamed from: a */
        public void mo26563a(TextInputLayout textInputLayout) {
            AutoCompleteTextView m26660C = C4984e.m26660C(textInputLayout.getEditText());
            C4984e.this.m26652K(m26660C);
            C4984e.this.m26627y(m26660C);
            C4984e.this.m26651L(m26660C);
            m26660C.setThreshold(0);
            m26660C.removeTextChangedListener(C4984e.this.f14042e);
            m26660C.addTextChangedListener(C4984e.this.f14042e);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!C4984e.m26655H(m26660C) && C4984e.this.f14054q.isTouchExplorationEnabled()) {
                C1365w0.m37259A0(C4984e.this.f14076c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(C4984e.this.f14044g);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.e$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4993h implements TextInputLayout.InterfaceC4967g {

        /* renamed from: com.google.android.material.textfield.e$h$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        class RunnableC4994a implements Runnable {

            /* renamed from: j */
            final /* synthetic */ AutoCompleteTextView f14067j;

            RunnableC4994a(AutoCompleteTextView autoCompleteTextView) {
                C4993h.this = r1;
                this.f14067j = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f14067j.removeTextChangedListener(C4984e.this.f14042e);
            }
        }

        C4993h() {
            C4984e.this = r1;
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC4967g
        /* renamed from: a */
        public void mo26562a(TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i == 3) {
                autoCompleteTextView.post(new RunnableC4994a(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == C4984e.this.f14043f) {
                    autoCompleteTextView.setOnFocusChangeListener(null);
                }
                autoCompleteTextView.setOnTouchListener(null);
                if (C4984e.f14041t) {
                    autoCompleteTextView.setOnDismissListener(null);
                }
            }
            if (i == 3) {
                textInputLayout.removeOnAttachStateChangeListener(C4984e.this.f14047j);
                C4984e.this.m26654I();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.e$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class View$OnAttachStateChangeListenerC4995i implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC4995i() {
            C4984e.this = r1;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            C4984e.this.m26661B();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            C4984e.this.m26654I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.e$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4996j implements C1197c.InterfaceC1199b {
        C4996j() {
            C4984e.this = r1;
        }

        @Override // androidx.core.view.accessibility.C1197c.InterfaceC1199b
        public void onTouchExplorationStateChanged(boolean z) {
            AutoCompleteTextView autoCompleteTextView;
            int i;
            TextInputLayout textInputLayout = C4984e.this.f14074a;
            if (textInputLayout != null && (autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText()) != null && !C4984e.m26655H(autoCompleteTextView)) {
                CheckableImageButton checkableImageButton = C4984e.this.f14076c;
                if (z) {
                    i = 2;
                } else {
                    i = 1;
                }
                C1365w0.m37259A0(checkableImageButton, i);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.e$k */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class View$OnClickListenerC4997k implements View.OnClickListener {
        View$OnClickListenerC4997k() {
            C4984e.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C4984e.this.m26650M((AutoCompleteTextView) C4984e.this.f14074a.getEditText());
        }
    }

    /* renamed from: com.google.android.material.textfield.e$l */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class View$OnTouchListenerC4998l implements View.OnTouchListener {

        /* renamed from: j */
        final /* synthetic */ AutoCompleteTextView f14072j;

        View$OnTouchListenerC4998l(AutoCompleteTextView autoCompleteTextView) {
            C4984e.this = r1;
            this.f14072j = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (C4984e.this.m26656G()) {
                    C4984e.this.f14049l = false;
                }
                C4984e.this.m26650M(this.f14072j);
                C4984e.this.m26649N();
            }
            return false;
        }
    }

    public C4984e(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
        this.f14042e = new C4985a();
        this.f14043f = new View$OnFocusChangeListenerC4990e();
        this.f14044g = new C4991f(this.f14074a);
        this.f14045h = new C4992g();
        this.f14046i = new C4993h();
        this.f14047j = new View$OnAttachStateChangeListenerC4995i();
        this.f14048k = new C4996j();
        this.f14049l = false;
        this.f14050m = false;
        this.f14051n = Long.MAX_VALUE;
    }

    /* renamed from: A */
    private void m26662A(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, C2232g c2232g) {
        LayerDrawable layerDrawable;
        int m8016d = C11487a.m8016d(autoCompleteTextView, C7480b.f20110m);
        C2232g c2232g2 = new C2232g(c2232g.m33939E());
        int m8012h = C11487a.m8012h(i, m8016d, 0.1f);
        c2232g2.m33919Y(new ColorStateList(iArr, new int[]{m8012h, 0}));
        if (f14041t) {
            c2232g2.setTint(m8016d);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{m8012h, m8016d});
            C2232g c2232g3 = new C2232g(c2232g.m33939E());
            c2232g3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c2232g2, c2232g3), c2232g});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{c2232g2, c2232g});
        }
        C1365w0.m37177u0(autoCompleteTextView, layerDrawable);
    }

    /* renamed from: B */
    public void m26661B() {
        TextInputLayout textInputLayout;
        if (this.f14054q != null && (textInputLayout = this.f14074a) != null && C1365w0.m37225T(textInputLayout)) {
            C1197c.m37530a(this.f14054q, this.f14048k);
        }
    }

    /* renamed from: C */
    public static AutoCompleteTextView m26660C(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: D */
    private ValueAnimator m26659D(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C8878a.f23260a);
        ofFloat.setDuration(i);
        ofFloat.addUpdateListener(new C4989d());
        return ofFloat;
    }

    /* renamed from: E */
    private C2232g m26658E(float f, float f2, float f3, int i) {
        C2239k m33831m = C2239k.m33874a().m33849A(f).m33845E(f).m33825s(f2).m33821w(f2).m33831m();
        C2232g m33895m = C2232g.m33895m(this.f14075b, f3);
        m33895m.setShapeAppearanceModel(m33831m);
        m33895m.m33917a0(0, i, 0, i);
        return m33895m;
    }

    /* renamed from: F */
    private void m26657F() {
        this.f14056s = m26659D(67, 0.0f, 1.0f);
        ValueAnimator m26659D = m26659D(50, 1.0f, 0.0f);
        this.f14055r = m26659D;
        m26659D.addListener(new C4988c());
    }

    /* renamed from: G */
    public boolean m26656G() {
        long currentTimeMillis = System.currentTimeMillis() - this.f14051n;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* renamed from: H */
    public static boolean m26655H(EditText editText) {
        return editText.getKeyListener() != null;
    }

    /* renamed from: I */
    public void m26654I() {
        AccessibilityManager accessibilityManager = this.f14054q;
        if (accessibilityManager != null) {
            C1197c.m37529b(accessibilityManager, this.f14048k);
        }
    }

    /* renamed from: J */
    public void m26653J(boolean z) {
        if (this.f14050m != z) {
            this.f14050m = z;
            this.f14056s.cancel();
            this.f14055r.start();
        }
    }

    /* renamed from: K */
    public void m26652K(AutoCompleteTextView autoCompleteTextView) {
        if (f14041t) {
            int boxBackgroundMode = this.f14074a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f14053p);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f14052o);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: L */
    public void m26651L(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new View$OnTouchListenerC4998l(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f14043f);
        if (f14041t) {
            autoCompleteTextView.setOnDismissListener(new C4987b());
        }
    }

    /* renamed from: M */
    public void m26650M(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (m26656G()) {
            this.f14049l = false;
        }
        if (!this.f14049l) {
            if (f14041t) {
                m26653J(!this.f14050m);
            } else {
                this.f14050m = !this.f14050m;
                this.f14076c.toggle();
            }
            if (this.f14050m) {
                autoCompleteTextView.requestFocus();
                autoCompleteTextView.showDropDown();
                return;
            }
            autoCompleteTextView.dismissDropDown();
            return;
        }
        this.f14049l = false;
    }

    /* renamed from: N */
    public void m26649N() {
        this.f14049l = true;
        this.f14051n = System.currentTimeMillis();
    }

    /* renamed from: y */
    public void m26627y(AutoCompleteTextView autoCompleteTextView) {
        if (m26655H(autoCompleteTextView)) {
            return;
        }
        int boxBackgroundMode = this.f14074a.getBoxBackgroundMode();
        C2232g boxBackground = this.f14074a.getBoxBackground();
        int m8016d = C11487a.m8016d(autoCompleteTextView, C7480b.f20106i);
        int[][] iArr = {new int[]{16842919}, new int[0]};
        if (boxBackgroundMode == 2) {
            m26662A(autoCompleteTextView, m8016d, iArr, boxBackground);
        } else if (boxBackgroundMode == 1) {
            m26626z(autoCompleteTextView, m8016d, iArr, boxBackground);
        }
    }

    /* renamed from: z */
    private void m26626z(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, C2232g c2232g) {
        int boxBackgroundColor = this.f14074a.getBoxBackgroundColor();
        int[] iArr2 = {C11487a.m8012h(i, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f14041t) {
            C1365w0.m37177u0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), c2232g, c2232g));
            return;
        }
        C2232g c2232g2 = new C2232g(c2232g.m33939E());
        c2232g2.m33919Y(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c2232g, c2232g2});
        int m37248G = C1365w0.m37248G(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int m37250F = C1365w0.m37250F(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        C1365w0.m37177u0(autoCompleteTextView, layerDrawable);
        C1365w0.m37249F0(autoCompleteTextView, m37248G, paddingTop, m37250F, paddingBottom);
    }

    /* renamed from: O */
    public void m26648O(AutoCompleteTextView autoCompleteTextView) {
        if (!m26655H(autoCompleteTextView) && this.f14074a.getBoxBackgroundMode() == 2 && (autoCompleteTextView.getBackground() instanceof LayerDrawable)) {
            m26627y(autoCompleteTextView);
        }
    }

    @Override // com.google.android.material.textfield.AbstractC4999f
    /* renamed from: a */
    public void mo26568a() {
        float dimensionPixelOffset = this.f14075b.getResources().getDimensionPixelOffset(C7482d.f20146Q);
        float dimensionPixelOffset2 = this.f14075b.getResources().getDimensionPixelOffset(C7482d.f20140K);
        int dimensionPixelOffset3 = this.f14075b.getResources().getDimensionPixelOffset(C7482d.f20141L);
        C2232g m26658E = m26658E(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C2232g m26658E2 = m26658E(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f14053p = m26658E;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f14052o = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, m26658E);
        this.f14052o.addState(new int[0], m26658E2);
        int i = this.f14077d;
        if (i == 0) {
            if (f14041t) {
                i = C7483e.f20181d;
            } else {
                i = C7483e.f20182e;
            }
        }
        this.f14074a.setEndIconDrawable(i);
        TextInputLayout textInputLayout = this.f14074a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C7487i.f20254g));
        this.f14074a.setEndIconOnClickListener(new View$OnClickListenerC4997k());
        this.f14074a.m26721g(this.f14045h);
        this.f14074a.m26719h(this.f14046i);
        m26657F();
        this.f14054q = (AccessibilityManager) this.f14075b.getSystemService("accessibility");
        this.f14074a.addOnAttachStateChangeListener(this.f14047j);
        m26661B();
    }

    @Override // com.google.android.material.textfield.AbstractC4999f
    /* renamed from: b */
    public boolean mo26625b(int i) {
        return i != 0;
    }

    @Override // com.google.android.material.textfield.AbstractC4999f
    /* renamed from: d */
    public boolean mo26623d() {
        return true;
    }
}