package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1365w0;
import java.util.List;
import p352ta.InterfaceC12624a;

@Deprecated
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.AbstractC0682c<View> {

    /* renamed from: a */
    private int f14190a;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class ViewTreeObserver$OnPreDrawListenerC5036a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: j */
        final /* synthetic */ View f14191j;

        /* renamed from: k */
        final /* synthetic */ int f14192k;

        /* renamed from: l */
        final /* synthetic */ InterfaceC12624a f14193l;

        ViewTreeObserver$OnPreDrawListenerC5036a(View view, int i, InterfaceC12624a interfaceC12624a) {
            ExpandableBehavior.this = r1;
            this.f14191j = view;
            this.f14192k = i;
            this.f14193l = interfaceC12624a;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f14191j.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f14190a == this.f14192k) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                InterfaceC12624a interfaceC12624a = this.f14193l;
                expandableBehavior.mo26453H((View) interfaceC12624a, this.f14191j, interfaceC12624a.mo4700a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f14190a = 0;
    }

    /* renamed from: F */
    private boolean m26484F(boolean z) {
        if (z) {
            int i = this.f14190a;
            if (i != 0 && i != 2) {
                return false;
            }
            return true;
        } else if (this.f14190a != 1) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: G */
    protected InterfaceC12624a m26483G(CoordinatorLayout coordinatorLayout, View view) {
        List<View> m39198l = coordinatorLayout.m39198l(view);
        int size = m39198l.size();
        for (int i = 0; i < size; i++) {
            View view2 = m39198l.get(i);
            if (mo26454e(coordinatorLayout, view, view2)) {
                return (InterfaceC12624a) view2;
            }
        }
        return null;
    }

    /* renamed from: H */
    protected abstract boolean mo26453H(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
    /* renamed from: e */
    public abstract boolean mo26454e(CoordinatorLayout coordinatorLayout, View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
    /* renamed from: h */
    public boolean mo26482h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i;
        InterfaceC12624a interfaceC12624a = (InterfaceC12624a) view2;
        if (m26484F(interfaceC12624a.mo4700a())) {
            if (interfaceC12624a.mo4700a()) {
                i = 1;
            } else {
                i = 2;
            }
            this.f14190a = i;
            return mo26453H((View) interfaceC12624a, view, interfaceC12624a.mo4700a(), true);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
    /* renamed from: l */
    public boolean mo26481l(CoordinatorLayout coordinatorLayout, View view, int i) {
        InterfaceC12624a m26483G;
        int i2;
        if (!C1365w0.m37224U(view) && (m26483G = m26483G(coordinatorLayout, view)) != null && m26484F(m26483G.mo4700a())) {
            if (m26483G.mo4700a()) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            this.f14190a = i2;
            view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC5036a(view, i2, m26483G));
            return false;
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14190a = 0;
    }
}