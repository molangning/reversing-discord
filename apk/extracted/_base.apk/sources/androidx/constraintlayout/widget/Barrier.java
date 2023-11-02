package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.solver.widgets.C0651a;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class Barrier extends AbstractC0673b {

    /* renamed from: r */
    private int f2382r;

    /* renamed from: s */
    private int f2383s;

    /* renamed from: t */
    private C0651a f2384t;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* renamed from: o */
    private void m39293o(ConstraintWidget constraintWidget, int i, boolean z) {
        this.f2383s = i;
        if (z) {
            int i2 = this.f2382r;
            if (i2 == 5) {
                this.f2383s = 1;
            } else if (i2 == 6) {
                this.f2383s = 0;
            }
        } else {
            int i3 = this.f2382r;
            if (i3 == 5) {
                this.f2383s = 0;
            } else if (i3 == 6) {
                this.f2383s = 1;
            }
        }
        if (constraintWidget instanceof C0651a) {
            ((C0651a) constraintWidget).m39329M0(this.f2383s);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.AbstractC0673b
    /* renamed from: g */
    public void mo39229g(AttributeSet attributeSet) {
        super.mo39229g(attributeSet);
        this.f2384t = new C0651a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0678f.f2779a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0678f.f2842j1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0678f.f2835i1) {
                    this.f2384t.m39330L0(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == C0678f.f2848k1) {
                    this.f2384t.m39328N0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
        }
        this.f2599m = this.f2384t;
        m39234m();
    }

    public int getMargin() {
        return this.f2384t.m39332J0();
    }

    public int getType() {
        return this.f2382r;
    }

    @Override // androidx.constraintlayout.widget.AbstractC0673b
    /* renamed from: h */
    public void mo39239h(ConstraintWidget constraintWidget, boolean z) {
        m39293o(constraintWidget, this.f2382r, z);
    }

    /* renamed from: n */
    public boolean m39294n() {
        return this.f2384t.m39334H0();
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f2384t.m39330L0(z);
    }

    public void setDpMargin(int i) {
        C0651a c0651a = this.f2384t;
        c0651a.m39328N0((int) ((i * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.f2384t.m39328N0(i);
    }

    public void setType(int i) {
        this.f2382r = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
