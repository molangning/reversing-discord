package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.C1365w0;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import p155ia.C7484f;
import p155ia.C7486h;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class TimePickerView extends ConstraintLayout {

    /* renamed from: j */
    private final Chip f14167j;

    /* renamed from: k */
    private final Chip f14168k;

    /* renamed from: l */
    private final ClockHandView f14169l;

    /* renamed from: m */
    private final ClockFaceView f14170m;

    /* renamed from: n */
    private final MaterialButtonToggleGroup f14171n;

    /* renamed from: o */
    private final View.OnClickListener f14172o;

    /* renamed from: com.google.android.material.timepicker.TimePickerView$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class View$OnClickListenerC5023a implements View.OnClickListener {
        View$OnClickListenerC5023a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView.m26504b(TimePickerView.this);
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C5024b implements MaterialButtonToggleGroup.InterfaceC4789d {
        C5024b() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.InterfaceC4789d
        /* renamed from: a */
        public void mo26498a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
            TimePickerView.m26503c(TimePickerView.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.timepicker.TimePickerView$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5025c extends GestureDetector.SimpleOnGestureListener {
        C5025c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TimePickerView.m26502d(TimePickerView.this);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.timepicker.TimePickerView$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class View$OnTouchListenerC5026d implements View.OnTouchListener {

        /* renamed from: j */
        final /* synthetic */ GestureDetector f14176j;

        View$OnTouchListenerC5026d(GestureDetector gestureDetector) {
            this.f14176j = gestureDetector;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f14176j.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    interface InterfaceC5027e {
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    interface InterfaceC5028f {
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    interface InterfaceC5029g {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    static /* synthetic */ InterfaceC5029g m26504b(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    /* renamed from: c */
    static /* synthetic */ InterfaceC5028f m26503c(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    /* renamed from: d */
    static /* synthetic */ InterfaceC5027e m26502d(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    /* renamed from: e */
    private void m26501e() {
        Chip chip = this.f14167j;
        int i = C7484f.f20191G;
        chip.setTag(i, 12);
        this.f14168k.setTag(i, 10);
        this.f14167j.setOnClickListener(this.f14172o);
        this.f14168k.setOnClickListener(this.f14172o);
        this.f14167j.setAccessibilityClassName("android.view.View");
        this.f14168k.setAccessibilityClassName("android.view.View");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: f */
    private void m26500f() {
        View$OnTouchListenerC5026d view$OnTouchListenerC5026d = new View$OnTouchListenerC5026d(new GestureDetector(getContext(), new C5025c()));
        this.f14167j.setOnTouchListener(view$OnTouchListenerC5026d);
        this.f14168k.setOnTouchListener(view$OnTouchListenerC5026d);
    }

    /* renamed from: g */
    private void m26499g() {
        boolean z;
        if (this.f14171n.getVisibility() == 0) {
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.m39277g(this);
            int i = 1;
            if (C1365w0.m37258B(this) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = 2;
            }
            constraintSet.m39279e(C7484f.f20207g, i);
            constraintSet.m39281c(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m26499g();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            m26499g();
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14172o = new View$OnClickListenerC5023a();
        LayoutInflater.from(context).inflate(C7486h.f20238i, this);
        this.f14170m = (ClockFaceView) findViewById(C7484f.f20208h);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(C7484f.f20210j);
        this.f14171n = materialButtonToggleGroup;
        materialButtonToggleGroup.m27657b(new C5024b());
        this.f14167j = (Chip) findViewById(C7484f.f20213m);
        this.f14168k = (Chip) findViewById(C7484f.f20211k);
        this.f14169l = (ClockHandView) findViewById(C7484f.f20209i);
        m26500f();
        m26501e();
    }
}
