package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.view.C1170a;
import androidx.core.view.C1365w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;
import p071e.C6029a;
import p155ia.C7480b;
import p155ia.C7481c;
import p155ia.C7482d;
import p155ia.C7484f;
import p155ia.C7486h;
import p155ia.C7488j;
import p155ia.C7489k;
import p443ya.C13957c;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class ClockFaceView extends C5032c implements ClockHandView.InterfaceC5022c {

    /* renamed from: m */
    private final ClockHandView f14133m;

    /* renamed from: n */
    private final Rect f14134n;

    /* renamed from: o */
    private final RectF f14135o;

    /* renamed from: p */
    private final SparseArray<TextView> f14136p;

    /* renamed from: q */
    private final C1170a f14137q;

    /* renamed from: r */
    private final int[] f14138r;

    /* renamed from: s */
    private final float[] f14139s;

    /* renamed from: t */
    private final int f14140t;

    /* renamed from: u */
    private final int f14141u;

    /* renamed from: v */
    private final int f14142v;

    /* renamed from: w */
    private final int f14143w;

    /* renamed from: x */
    private String[] f14144x;

    /* renamed from: y */
    private float f14145y;

    /* renamed from: z */
    private final ColorStateList f14146z;

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class ViewTreeObserver$OnPreDrawListenerC5018a implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserver$OnPreDrawListenerC5018a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.mo26494d(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f14133m.m26512g()) - ClockFaceView.this.f14140t);
            return true;
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C5019b extends C1170a {
        C5019b() {
        }

        @Override // androidx.core.view.C1170a
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            int intValue = ((Integer) view.getTag(C7484f.f20214n)).intValue();
            if (intValue > 0) {
                accessibilityNodeInfoCompat.m37622L0((View) ClockFaceView.this.f14136p.get(intValue - 1));
            }
            accessibilityNodeInfoCompat.m37584j0(AccessibilityNodeInfoCompat.C1181d.m37543b(0, 1, intValue, 1, false, view.isSelected()));
            accessibilityNodeInfoCompat.m37588h0(true);
            accessibilityNodeInfoCompat.m37601b(AccessibilityNodeInfoCompat.C1178a.f3610i);
        }

        @Override // androidx.core.view.C1170a
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (i == 16) {
                long uptimeMillis = SystemClock.uptimeMillis();
                float x = view.getX() + (view.getWidth() / 2.0f);
                float height = (view.getHeight() / 2.0f) + view.getY();
                ClockFaceView.this.f14133m.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, x, height, 0));
                ClockFaceView.this.f14133m.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, x, height, 0));
                return true;
            }
            return super.performAccessibilityAction(view, i, bundle);
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7480b.f20120w);
    }

    /* renamed from: k */
    private void m26523k() {
        RectF m26515d = this.f14133m.m26515d();
        for (int i = 0; i < this.f14136p.size(); i++) {
            TextView textView = this.f14136p.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.f14134n);
                offsetDescendantRectToMyCoords(textView, this.f14134n);
                textView.setSelected(m26515d.contains(this.f14134n.centerX(), this.f14134n.centerY()));
                textView.getPaint().setShader(m26522l(m26515d, this.f14134n, textView));
                textView.invalidate();
            }
        }
    }

    /* renamed from: l */
    private RadialGradient m26522l(RectF rectF, Rect rect, TextView textView) {
        this.f14135o.set(rect);
        this.f14135o.offset(textView.getPaddingLeft(), textView.getPaddingTop());
        if (!RectF.intersects(rectF, this.f14135o)) {
            return null;
        }
        return new RadialGradient(rectF.centerX() - this.f14135o.left, rectF.centerY() - this.f14135o.top, rectF.width() * 0.5f, this.f14138r, this.f14139s, Shader.TileMode.CLAMP);
    }

    /* renamed from: m */
    private static float m26521m(float f, float f2, float f3) {
        return Math.max(Math.max(f, f2), f3);
    }

    /* renamed from: o */
    private void m26519o(int i) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.f14136p.size();
        for (int i2 = 0; i2 < Math.max(this.f14144x.length, size); i2++) {
            TextView textView = this.f14136p.get(i2);
            if (i2 >= this.f14144x.length) {
                removeView(textView);
                this.f14136p.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(C7486h.f20233d, (ViewGroup) this, false);
                    this.f14136p.put(i2, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f14144x[i2]);
                textView.setTag(C7484f.f20214n, Integer.valueOf(i2));
                C1365w0.m37185q0(textView, this.f14137q);
                textView.setTextColor(this.f14146z);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, this.f14144x[i2]));
                }
            }
        }
    }

    @Override // com.google.android.material.timepicker.ClockHandView.InterfaceC5022c
    /* renamed from: a */
    public void mo26505a(float f, boolean z) {
        if (Math.abs(this.f14145y - f) > 0.001f) {
            this.f14145y = f;
            m26523k();
        }
    }

    @Override // com.google.android.material.timepicker.C5032c
    /* renamed from: d */
    public void mo26494d(int i) {
        if (i != m26495c()) {
            super.mo26494d(i);
            this.f14133m.m26509j(m26495c());
        }
    }

    /* renamed from: n */
    public void m26520n(String[] strArr, int i) {
        this.f14144x = strArr;
        m26519o(i);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.m37614P0(accessibilityNodeInfo).m37586i0(AccessibilityNodeInfoCompat.C1180c.m37545b(1, this.f14144x.length, false, 1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m26523k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int m26521m = (int) (this.f14143w / m26521m(this.f14141u / displayMetrics.heightPixels, this.f14142v / displayMetrics.widthPixels, 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(m26521m, 1073741824);
        setMeasuredDimension(m26521m, m26521m);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14134n = new Rect();
        this.f14135o = new RectF();
        this.f14136p = new SparseArray<>();
        this.f14139s = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7489k.f20612p1, i, C7488j.f20284u);
        Resources resources = getResources();
        ColorStateList m1089a = C13957c.m1089a(context, obtainStyledAttributes, C7489k.f20628r1);
        this.f14146z = m1089a;
        LayoutInflater.from(context).inflate(C7486h.f20234e, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(C7484f.f20209i);
        this.f14133m = clockHandView;
        this.f14140t = resources.getDimensionPixelSize(C7482d.f20161j);
        int colorForState = m1089a.getColorForState(new int[]{16842913}, m1089a.getDefaultColor());
        this.f14138r = new int[]{colorForState, colorForState, m1089a.getDefaultColor()};
        clockHandView.m26517b(this);
        int defaultColor = C6029a.m23854a(context, C7481c.f20125b).getDefaultColor();
        ColorStateList m1089a2 = C13957c.m1089a(context, obtainStyledAttributes, C7489k.f20620q1);
        setBackgroundColor(m1089a2 != null ? m1089a2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC5018a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f14137q = new C5019b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        m26520n(strArr, 0);
        this.f14141u = resources.getDimensionPixelSize(C7482d.f20174w);
        this.f14142v = resources.getDimensionPixelSize(C7482d.f20175x);
        this.f14143w = resources.getDimensionPixelSize(C7482d.f20163l);
    }
}
