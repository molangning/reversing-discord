package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p052d.C5706a;

/* renamed from: androidx.appcompat.widget.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0559r extends RatingBar {

    /* renamed from: j */
    private final C0548p f1942j;

    public C0559r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5706a.f16039H);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap m39774b = this.f1942j.m39774b();
        if (m39774b != null) {
            setMeasuredDimension(View.resolveSizeAndState(m39774b.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public C0559r(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0528i1.m39846a(this, getContext());
        C0548p c0548p = new C0548p(this);
        this.f1942j = c0548p;
        c0548p.mo39666c(attributeSet, i);
    }
}