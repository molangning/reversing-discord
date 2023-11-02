package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class Group extends AbstractC0673b {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.AbstractC0673b
    /* renamed from: g */
    public void mo39229g(AttributeSet attributeSet) {
        super.mo39229g(attributeSet);
        this.f2600n = false;
    }

    @Override // androidx.constraintlayout.widget.AbstractC0673b
    /* renamed from: i */
    public void mo39238i(ConstraintLayout constraintLayout) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f2438n0.m39430B0(0);
        layoutParams.f2438n0.m39398e0(0);
    }

    @Override // androidx.constraintlayout.widget.AbstractC0673b, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m39243c();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        m39243c();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        m39243c();
    }
}