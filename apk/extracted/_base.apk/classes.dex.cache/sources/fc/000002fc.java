package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: androidx.constraintlayout.widget.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0674c extends ViewGroup {

    /* renamed from: j */
    ConstraintSet f2604j;

    @Override // android.view.ViewGroup
    /* renamed from: a */
    public C0675a generateDefaultLayoutParams() {
        return new C0675a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b */
    public C0675a generateLayoutParams(AttributeSet attributeSet) {
        return new C0675a(getContext(), attributeSet);
    }

    public ConstraintSet getConstraintSet() {
        if (this.f2604j == null) {
            this.f2604j = new ConstraintSet();
        }
        this.f2604j.m39276h(this);
        return this.f2604j;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }

    /* renamed from: androidx.constraintlayout.widget.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0675a extends ConstraintLayout.LayoutParams {

        /* renamed from: A0 */
        public float f2605A0;

        /* renamed from: B0 */
        public float f2606B0;

        /* renamed from: p0 */
        public float f2607p0;

        /* renamed from: q0 */
        public boolean f2608q0;

        /* renamed from: r0 */
        public float f2609r0;

        /* renamed from: s0 */
        public float f2610s0;

        /* renamed from: t0 */
        public float f2611t0;

        /* renamed from: u0 */
        public float f2612u0;

        /* renamed from: v0 */
        public float f2613v0;

        /* renamed from: w0 */
        public float f2614w0;

        /* renamed from: x0 */
        public float f2615x0;

        /* renamed from: y0 */
        public float f2616y0;

        /* renamed from: z0 */
        public float f2617z0;

        public C0675a(int i, int i2) {
            super(i, i2);
            this.f2607p0 = 1.0f;
            this.f2608q0 = false;
            this.f2609r0 = 0.0f;
            this.f2610s0 = 0.0f;
            this.f2611t0 = 0.0f;
            this.f2612u0 = 0.0f;
            this.f2613v0 = 1.0f;
            this.f2614w0 = 1.0f;
            this.f2615x0 = 0.0f;
            this.f2616y0 = 0.0f;
            this.f2617z0 = 0.0f;
            this.f2605A0 = 0.0f;
            this.f2606B0 = 0.0f;
        }

        public C0675a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2607p0 = 1.0f;
            this.f2608q0 = false;
            this.f2609r0 = 0.0f;
            this.f2610s0 = 0.0f;
            this.f2611t0 = 0.0f;
            this.f2612u0 = 0.0f;
            this.f2613v0 = 1.0f;
            this.f2614w0 = 1.0f;
            this.f2615x0 = 0.0f;
            this.f2616y0 = 0.0f;
            this.f2617z0 = 0.0f;
            this.f2605A0 = 0.0f;
            this.f2606B0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0678f.f2873o2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0678f.f2879p2) {
                    this.f2607p0 = obtainStyledAttributes.getFloat(index, this.f2607p0);
                } else if (index == C0678f.f2624A2) {
                    this.f2609r0 = obtainStyledAttributes.getFloat(index, this.f2609r0);
                    this.f2608q0 = true;
                } else if (index == C0678f.f2927x2) {
                    this.f2611t0 = obtainStyledAttributes.getFloat(index, this.f2611t0);
                } else if (index == C0678f.f2933y2) {
                    this.f2612u0 = obtainStyledAttributes.getFloat(index, this.f2612u0);
                } else if (index == C0678f.f2921w2) {
                    this.f2610s0 = obtainStyledAttributes.getFloat(index, this.f2610s0);
                } else if (index == C0678f.f2909u2) {
                    this.f2613v0 = obtainStyledAttributes.getFloat(index, this.f2613v0);
                } else if (index == C0678f.f2915v2) {
                    this.f2614w0 = obtainStyledAttributes.getFloat(index, this.f2614w0);
                } else if (index == C0678f.f2885q2) {
                    this.f2615x0 = obtainStyledAttributes.getFloat(index, this.f2615x0);
                } else if (index == C0678f.f2891r2) {
                    this.f2616y0 = obtainStyledAttributes.getFloat(index, this.f2616y0);
                } else if (index == C0678f.f2897s2) {
                    this.f2617z0 = obtainStyledAttributes.getFloat(index, this.f2617z0);
                } else if (index == C0678f.f2903t2) {
                    this.f2605A0 = obtainStyledAttributes.getFloat(index, this.f2605A0);
                } else if (index == C0678f.f2939z2) {
                    this.f2606B0 = obtainStyledAttributes.getFloat(index, this.f2606B0);
                }
            }
        }
    }
}