package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p052d.C5706a;

/* renamed from: androidx.appcompat.widget.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0578u extends SeekBar {

    /* renamed from: j */
    private final C0582v f1975j;

    public C0578u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5706a.f16041J);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1975j.m39663h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1975j.m39662i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1975j.m39664g(canvas);
    }

    public C0578u(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0528i1.m39846a(this, getContext());
        C0582v c0582v = new C0582v(this);
        this.f1975j = c0582v;
        c0582v.mo39666c(attributeSet, i);
    }
}
