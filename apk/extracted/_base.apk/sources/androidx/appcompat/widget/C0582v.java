package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.C1013a;
import androidx.core.view.C1365w0;
import p052d.C5715j;

/* renamed from: androidx.appcompat.widget.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C0582v extends C0548p {

    /* renamed from: d */
    private final SeekBar f1992d;

    /* renamed from: e */
    private Drawable f1993e;

    /* renamed from: f */
    private ColorStateList f1994f;

    /* renamed from: g */
    private PorterDuff.Mode f1995g;

    /* renamed from: h */
    private boolean f1996h;

    /* renamed from: i */
    private boolean f1997i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0582v(SeekBar seekBar) {
        super(seekBar);
        this.f1994f = null;
        this.f1995g = null;
        this.f1996h = false;
        this.f1997i = false;
        this.f1992d = seekBar;
    }

    /* renamed from: f */
    private void m39665f() {
        Drawable drawable = this.f1993e;
        if (drawable != null) {
            if (this.f1996h || this.f1997i) {
                Drawable m38080r = C1013a.m38080r(drawable.mutate());
                this.f1993e = m38080r;
                if (this.f1996h) {
                    C1013a.m38083o(m38080r, this.f1994f);
                }
                if (this.f1997i) {
                    C1013a.m38082p(this.f1993e, this.f1995g);
                }
                if (this.f1993e.isStateful()) {
                    this.f1993e.setState(this.f1992d.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.widget.C0548p
    /* renamed from: c */
    public void mo39666c(AttributeSet attributeSet, int i) {
        super.mo39666c(attributeSet, i);
        Context context = this.f1992d.getContext();
        int[] iArr = C5715j.f16317T;
        C0544n1 m39780v = C0544n1.m39780v(context, attributeSet, iArr, i, 0);
        SeekBar seekBar = this.f1992d;
        C1365w0.m37189o0(seekBar, seekBar.getContext(), iArr, attributeSet, m39780v.m39784r(), i, 0);
        Drawable m39794h = m39780v.m39794h(C5715j.f16321U);
        if (m39794h != null) {
            this.f1992d.setThumb(m39794h);
        }
        m39661j(m39780v.m39795g(C5715j.f16325V));
        int i2 = C5715j.f16333X;
        if (m39780v.m39783s(i2)) {
            this.f1995g = C0550p0.m39766e(m39780v.m39791k(i2, -1), this.f1995g);
            this.f1997i = true;
        }
        int i3 = C5715j.f16329W;
        if (m39780v.m39783s(i3)) {
            this.f1994f = m39780v.m39799c(i3);
            this.f1996h = true;
        }
        m39780v.m39779w();
        m39665f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m39664g(Canvas canvas) {
        int i;
        if (this.f1993e != null) {
            int max = this.f1992d.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1993e.getIntrinsicWidth();
                int intrinsicHeight = this.f1993e.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i = intrinsicWidth / 2;
                } else {
                    i = 1;
                }
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.f1993e.setBounds(-i, -i2, i, i2);
                float width = ((this.f1992d.getWidth() - this.f1992d.getPaddingLeft()) - this.f1992d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f1992d.getPaddingLeft(), this.f1992d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f1993e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m39663h() {
        Drawable drawable = this.f1993e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1992d.getDrawableState())) {
            this.f1992d.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m39662i() {
        Drawable drawable = this.f1993e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* renamed from: j */
    void m39661j(Drawable drawable) {
        Drawable drawable2 = this.f1993e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1993e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1992d);
            C1013a.m38085m(drawable, C1365w0.m37258B(this.f1992d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1992d.getDrawableState());
            }
            m39665f();
        }
        this.f1992d.invalidate();
    }
}
