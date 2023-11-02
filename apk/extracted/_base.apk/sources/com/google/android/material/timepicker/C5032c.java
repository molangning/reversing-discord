package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.C1365w0;
import bb.C2232g;
import bb.C2237i;
import p155ia.C7484f;
import p155ia.C7486h;
import p155ia.C7489k;

/* renamed from: com.google.android.material.timepicker.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C5032c extends ConstraintLayout {

    /* renamed from: j */
    private final Runnable f14179j;

    /* renamed from: k */
    private int f14180k;

    /* renamed from: l */
    private C2232g f14181l;

    /* renamed from: com.google.android.material.timepicker.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class RunnableC5033a implements Runnable {
        RunnableC5033a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5032c.this.m26492f();
        }
    }

    public C5032c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    private Drawable m26496b() {
        C2232g c2232g = new C2232g();
        this.f14181l = c2232g;
        c2232g.m33921W(new C2237i(0.5f));
        this.f14181l.m33919Y(ColorStateList.valueOf(-1));
        return this.f14181l;
    }

    /* renamed from: e */
    private static boolean m26493e(View view) {
        return "skip".equals(view.getTag());
    }

    /* renamed from: g */
    private void m26491g() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f14179j);
            handler.post(this.f14179j);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(C1365w0.m37198k());
        }
        m26491g();
    }

    /* renamed from: c */
    public int m26495c() {
        return this.f14180k;
    }

    /* renamed from: d */
    public void mo26494d(int i) {
        this.f14180k = i;
        m26492f();
    }

    /* renamed from: f */
    protected void m26492f() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if (m26493e(getChildAt(i2))) {
                i++;
            }
        }
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.m39277g(this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id2 = childAt.getId();
            int i4 = C7484f.f20202b;
            if (id2 != i4 && !m26493e(childAt)) {
                constraintSet.m39275i(childAt.getId(), i4, this.f14180k, f);
                f += 360.0f / (childCount - i);
            }
        }
        constraintSet.m39281c(this);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        m26492f();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        m26491g();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f14181l.m33919Y(ColorStateList.valueOf(i));
    }

    public C5032c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(C7486h.f20235f, this);
        C1365w0.m37177u0(this, m26496b());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7489k.f20623q4, i, 0);
        this.f14180k = obtainStyledAttributes.getDimensionPixelSize(C7489k.f20631r4, 0);
        this.f14179j = new RunnableC5033a();
        obtainStyledAttributes.recycle();
    }
}
