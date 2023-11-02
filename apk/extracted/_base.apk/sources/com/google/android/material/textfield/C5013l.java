package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0544n1;
import androidx.core.view.C1363w;
import androidx.core.view.C1365w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.C1435k;
import com.google.android.material.internal.C4911o;
import com.google.android.material.internal.CheckableImageButton;
import p155ia.C7482d;
import p155ia.C7484f;
import p155ia.C7486h;
import p155ia.C7489k;
import p443ya.C13957c;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* renamed from: com.google.android.material.textfield.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5013l extends LinearLayout {

    /* renamed from: j */
    private final TextInputLayout f14119j;

    /* renamed from: k */
    private final TextView f14120k;

    /* renamed from: l */
    private CharSequence f14121l;

    /* renamed from: m */
    private final CheckableImageButton f14122m;

    /* renamed from: n */
    private ColorStateList f14123n;

    /* renamed from: o */
    private PorterDuff.Mode f14124o;

    /* renamed from: p */
    private View.OnLongClickListener f14125p;

    /* renamed from: q */
    private boolean f14126q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5013l(TextInputLayout textInputLayout, C0544n1 c0544n1) {
        super(textInputLayout.getContext());
        this.f14119j = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C7486h.f20232c, (ViewGroup) this, false);
        this.f14122m = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f14120k = appCompatTextView;
        m26555g(c0544n1);
        m26556f(c0544n1);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    /* renamed from: f */
    private void m26556f(C0544n1 c0544n1) {
        this.f14120k.setVisibility(8);
        this.f14120k.setId(C7484f.f20199O);
        this.f14120k.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        C1365w0.m37181s0(this.f14120k, 1);
        m26550l(c0544n1.m39788n(C7489k.f20697z6, 0));
        int i = C7489k.f20293A6;
        if (c0544n1.m39783s(i)) {
            m26549m(c0544n1.m39799c(i));
        }
        m26551k(c0544n1.m39786p(C7489k.f20689y6));
    }

    /* renamed from: g */
    private void m26555g(C0544n1 c0544n1) {
        if (C13957c.m1083g(getContext())) {
            C1363w.m37270c((ViewGroup.MarginLayoutParams) this.f14122m.getLayoutParams(), 0);
        }
        m26545q(null);
        m26544r(null);
        int i = C7489k.f20325E6;
        if (c0544n1.m39783s(i)) {
            this.f14123n = C13957c.m1088b(getContext(), c0544n1, i);
        }
        int i2 = C7489k.f20333F6;
        if (c0544n1.m39783s(i2)) {
            this.f14124o = C4911o.m26932f(c0544n1.m39791k(i2, -1), null);
        }
        int i3 = C7489k.f20317D6;
        if (c0544n1.m39783s(i3)) {
            m26546p(c0544n1.m39795g(i3));
            int i4 = C7489k.f20309C6;
            if (c0544n1.m39783s(i4)) {
                m26547o(c0544n1.m39786p(i4));
            }
            m26548n(c0544n1.m39801a(C7489k.f20301B6, true));
        }
    }

    /* renamed from: x */
    private void m26538x() {
        int i;
        boolean z;
        int i2 = 8;
        if (this.f14121l != null && !this.f14126q) {
            i = 0;
        } else {
            i = 8;
        }
        if (this.f14122m.getVisibility() != 0 && i != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            i2 = 0;
        }
        setVisibility(i2);
        this.f14120k.setVisibility(i);
        this.f14119j.m26700q0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public CharSequence m26561a() {
        return this.f14121l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public ColorStateList m26560b() {
        return this.f14120k.getTextColors();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public TextView m26559c() {
        return this.f14120k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public CharSequence m26558d() {
        return this.f14122m.getContentDescription();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Drawable m26557e() {
        return this.f14122m.getDrawable();
    }

    /* renamed from: h */
    boolean m26554h() {
        return this.f14122m.getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m26553i(boolean z) {
        this.f14126q = z;
        m26538x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m26552j() {
        C5000g.m26620c(this.f14119j, this.f14122m, this.f14123n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m26551k(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.f14121l = charSequence2;
        this.f14120k.setText(charSequence);
        m26538x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m26550l(int i) {
        C1435k.m36867n(this.f14120k, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m26549m(ColorStateList colorStateList) {
        this.f14120k.setTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m26548n(boolean z) {
        this.f14122m.setCheckable(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m26547o(CharSequence charSequence) {
        if (m26558d() != charSequence) {
            this.f14122m.setContentDescription(charSequence);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m26539w();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m26546p(Drawable drawable) {
        this.f14122m.setImageDrawable(drawable);
        if (drawable != null) {
            C5000g.m26622a(this.f14119j, this.f14122m, this.f14123n, this.f14124o);
            m26541u(true);
            m26552j();
            return;
        }
        m26541u(false);
        m26545q(null);
        m26544r(null);
        m26547o(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m26545q(View.OnClickListener onClickListener) {
        C5000g.m26618e(this.f14122m, onClickListener, this.f14125p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m26544r(View.OnLongClickListener onLongClickListener) {
        this.f14125p = onLongClickListener;
        C5000g.m26617f(this.f14122m, onLongClickListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m26543s(ColorStateList colorStateList) {
        if (this.f14123n != colorStateList) {
            this.f14123n = colorStateList;
            C5000g.m26622a(this.f14119j, this.f14122m, colorStateList, this.f14124o);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m26542t(PorterDuff.Mode mode) {
        if (this.f14124o != mode) {
            this.f14124o = mode;
            C5000g.m26622a(this.f14119j, this.f14122m, this.f14123n, mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m26541u(boolean z) {
        int i;
        if (m26554h() != z) {
            CheckableImageButton checkableImageButton = this.f14122m;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            m26539w();
            m26538x();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m26540v(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (this.f14120k.getVisibility() == 0) {
            accessibilityNodeInfoCompat.m37566s0(this.f14120k);
            accessibilityNodeInfoCompat.m37622L0(this.f14120k);
            return;
        }
        accessibilityNodeInfoCompat.m37622L0(this.f14122m);
    }

    /* renamed from: w */
    void m26539w() {
        int m37248G;
        EditText editText = this.f14119j.f13986n;
        if (editText == null) {
            return;
        }
        if (m26554h()) {
            m37248G = 0;
        } else {
            m37248G = C1365w0.m37248G(editText);
        }
        C1365w0.m37249F0(this.f14120k, m37248G, editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(C7482d.f20173v), editText.getCompoundPaddingBottom());
    }
}
