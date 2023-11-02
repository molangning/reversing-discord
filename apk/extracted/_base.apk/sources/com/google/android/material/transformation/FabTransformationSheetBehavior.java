package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1365w0;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
import p155ia.C7479a;
import p176ja.C8885h;
import p176ja.C8887j;

@Deprecated
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i */
    private Map<View, Integer> f14221i;

    public FabTransformationSheetBehavior() {
    }

    /* renamed from: g0 */
    private void m26451g0(View view, boolean z) {
        boolean z2;
        ViewParent parent = view.getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (z) {
            this.f14221i = new HashMap(childCount);
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = coordinatorLayout.getChildAt(i);
            if ((childAt.getLayoutParams() instanceof CoordinatorLayout.C0685f) && (((CoordinatorLayout.C0685f) childAt.getLayoutParams()).m39166f() instanceof FabTransformationScrimBehavior)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (childAt != view && !z2) {
                if (!z) {
                    Map<View, Integer> map = this.f14221i;
                    if (map != null && map.containsKey(childAt)) {
                        C1365w0.m37259A0(childAt, this.f14221i.get(childAt).intValue());
                    }
                } else {
                    this.f14221i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    C1365w0.m37259A0(childAt, 4);
                }
            }
        }
        if (!z) {
            this.f14221i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: H */
    public boolean mo26453H(View view, View view2, boolean z, boolean z2) {
        m26451g0(view2, z);
        return super.mo26453H(view, view2, z, z2);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    /* renamed from: e0 */
    protected FabTransformationBehavior.C5042e mo26452e0(Context context, boolean z) {
        int i;
        if (z) {
            i = C7479a.f20085d;
        } else {
            i = C7479a.f20084c;
        }
        FabTransformationBehavior.C5042e c5042e = new FabTransformationBehavior.C5042e();
        c5042e.f14214a = C8885h.m17097c(context, i);
        c5042e.f14215b = new C8887j(17, 0.0f, 0.0f);
        return c5042e;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
