package com.google.android.exoplayer2.p049ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p118g8.C6576l;

/* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: j */
    private final RunnableC4487c f12003j;

    /* renamed from: k */
    private float f12004k;

    /* renamed from: l */
    private int f12005l;

    /* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4486b {
    }

    /* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private final class RunnableC4487c implements Runnable {

        /* renamed from: j */
        private float f12006j;

        /* renamed from: k */
        private float f12007k;

        /* renamed from: l */
        private boolean f12008l;

        /* renamed from: m */
        private boolean f12009m;

        private RunnableC4487c() {
        }

        /* renamed from: a */
        public void m28955a(float f, float f2, boolean z) {
            this.f12006j = f;
            this.f12007k = f2;
            this.f12008l = z;
            if (!this.f12009m) {
                this.f12009m = true;
                AspectRatioFrameLayout.this.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f12009m = false;
            AspectRatioFrameLayout.m28956a(AspectRatioFrameLayout.this);
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12005l = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C6576l.f18692a, 0, 0);
            try {
                this.f12005l = obtainStyledAttributes.getInt(C6576l.f18693b, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f12003j = new RunnableC4487c();
    }

    /* renamed from: a */
    static /* synthetic */ InterfaceC4486b m28956a(AspectRatioFrameLayout aspectRatioFrameLayout) {
        aspectRatioFrameLayout.getClass();
        return null;
    }

    public int getResizeMode() {
        return this.f12005l;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (this.f12004k <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = f3 / f4;
        float f6 = (this.f12004k / f5) - 1.0f;
        if (Math.abs(f6) <= 0.01f) {
            this.f12003j.m28955a(this.f12004k, f5, false);
            return;
        }
        int i3 = this.f12005l;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 4) {
                        if (f6 > 0.0f) {
                            f = this.f12004k;
                        } else {
                            f2 = this.f12004k;
                        }
                    }
                } else {
                    f = this.f12004k;
                }
                measuredWidth = (int) (f4 * f);
            } else {
                f2 = this.f12004k;
            }
            measuredHeight = (int) (f3 / f2);
        } else if (f6 > 0.0f) {
            f2 = this.f12004k;
            measuredHeight = (int) (f3 / f2);
        } else {
            f = this.f12004k;
            measuredWidth = (int) (f4 * f);
        }
        this.f12003j.m28955a(this.f12004k, f5, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f) {
        if (this.f12004k != f) {
            this.f12004k = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(InterfaceC4486b interfaceC4486b) {
    }

    public void setResizeMode(int i) {
        if (this.f12005l != i) {
            this.f12005l = i;
            requestLayout();
        }
    }
}
