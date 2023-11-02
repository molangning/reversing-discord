package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import re.C12127d;
import re.C12128e;
import re.C12131h;
import se.InterfaceC12462c;
import se.InterfaceC12463d;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class UCropView extends FrameLayout {

    /* renamed from: j */
    private GestureCropImageView f15964j;

    /* renamed from: k */
    private final OverlayView f15965k;

    /* renamed from: com.yalantis.ucrop.view.UCropView$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5697a implements InterfaceC12462c {
        C5697a() {
            UCropView.this = r1;
        }

        @Override // se.InterfaceC12462c
        /* renamed from: a */
        public void mo5217a(float f) {
            UCropView.this.f15965k.setTargetAspectRatio(f);
        }
    }

    /* renamed from: com.yalantis.ucrop.view.UCropView$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5698b implements InterfaceC12463d {
        C5698b() {
            UCropView.this = r1;
        }

        @Override // se.InterfaceC12463d
        /* renamed from: a */
        public void mo5216a(RectF rectF) {
            UCropView.this.f15964j.setCropRect(rectF);
        }
    }

    public UCropView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    private void m24671c() {
        this.f15964j.setCropBoundsChangeListener(new C5697a());
        this.f15965k.setOverlayViewChangeListener(new C5698b());
    }

    public GestureCropImageView getCropImageView() {
        return this.f15964j;
    }

    public OverlayView getOverlayView() {
        return this.f15965k;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public UCropView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(C12128e.f31486d, (ViewGroup) this, true);
        this.f15964j = (GestureCropImageView) findViewById(C12127d.f31458b);
        OverlayView overlayView = (OverlayView) findViewById(C12127d.f31481y);
        this.f15965k = overlayView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12131h.f31512U);
        overlayView.m24677g(obtainStyledAttributes);
        this.f15964j.m24655y(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        m24671c();
    }
}