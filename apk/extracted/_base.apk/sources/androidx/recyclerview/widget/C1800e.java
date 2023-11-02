package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;
import androidx.core.view.C1365w0;
import p222m0.C10228c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1800e implements ItemTouchUIUtil {

    /* renamed from: a */
    static final ItemTouchUIUtil f4951a = new C1800e();

    C1800e() {
    }

    /* renamed from: e */
    private static float m35384e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != view) {
                float m37174w = C1365w0.m37174w(childAt);
                if (m37174w > f) {
                    f = m37174w;
                }
            }
        }
        return f;
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    /* renamed from: a */
    public void mo35388a(View view) {
        int i = C10228c.f26546a;
        Object tag = view.getTag(i);
        if (tag instanceof Float) {
            C1365w0.m37169y0(view, ((Float) tag).floatValue());
        }
        view.setTag(i, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    /* renamed from: b */
    public void mo35387b(View view) {
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    /* renamed from: c */
    public void mo35386c(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
        if (z) {
            int i2 = C10228c.f26546a;
            if (view.getTag(i2) == null) {
                Float valueOf = Float.valueOf(C1365w0.m37174w(view));
                C1365w0.m37169y0(view, m35384e(recyclerView, view) + 1.0f);
                view.setTag(i2, valueOf);
            }
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    /* renamed from: d */
    public void mo35385d(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
    }
}
