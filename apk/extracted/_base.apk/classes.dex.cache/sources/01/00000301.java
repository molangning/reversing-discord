package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.solver.widgets.C0660g;

/* renamed from: androidx.constraintlayout.widget.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class AbstractC0679g extends AbstractC0673b {

    /* renamed from: r */
    private boolean f2942r;

    /* renamed from: s */
    private boolean f2943s;

    @Override // androidx.constraintlayout.widget.AbstractC0673b
    /* renamed from: g */
    public void mo39229g(AttributeSet attributeSet) {
        super.mo39229g(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0678f.f2779a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0678f.f2793c1) {
                    this.f2942r = true;
                } else if (index == C0678f.f2828h1) {
                    this.f2943s = true;
                }
            }
        }
    }

    /* renamed from: n */
    public void m39228n(C0660g c0660g, int i, int i2) {
    }

    @Override // androidx.constraintlayout.widget.AbstractC0673b, android.view.View
    public void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f2942r || this.f2943s) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f2597k; i++) {
                View viewById = constraintLayout.getViewById(this.f2596j[i]);
                if (viewById != null) {
                    if (this.f2942r) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.f2943s && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
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