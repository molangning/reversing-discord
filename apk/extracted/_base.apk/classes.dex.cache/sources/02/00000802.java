package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1811l {
    /* renamed from: a */
    public static int m35343a(RecyclerView.State state, AbstractC1806j abstractC1806j, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z) {
        if (layoutManager.m35736U() != 0 && state.m35611b() != 0 && view != null && view2 != null) {
            if (!z) {
                return Math.abs(layoutManager.m35705o0(view) - layoutManager.m35705o0(view2)) + 1;
            }
            return Math.min(abstractC1806j.mo35354n(), abstractC1806j.mo35364d(view2) - abstractC1806j.mo35361g(view));
        }
        return 0;
    }

    /* renamed from: b */
    public static int m35342b(RecyclerView.State state, AbstractC1806j abstractC1806j, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z, boolean z2) {
        int max;
        if (layoutManager.m35736U() == 0 || state.m35611b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(layoutManager.m35705o0(view), layoutManager.m35705o0(view2));
        int max2 = Math.max(layoutManager.m35705o0(view), layoutManager.m35705o0(view2));
        if (z2) {
            max = Math.max(0, (state.m35611b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z) {
            return max;
        }
        return Math.round((max * (Math.abs(abstractC1806j.mo35364d(view2) - abstractC1806j.mo35361g(view)) / (Math.abs(layoutManager.m35705o0(view) - layoutManager.m35705o0(view2)) + 1))) + (abstractC1806j.mo35355m() - abstractC1806j.mo35361g(view)));
    }

    /* renamed from: c */
    public static int m35341c(RecyclerView.State state, AbstractC1806j abstractC1806j, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z) {
        if (layoutManager.m35736U() != 0 && state.m35611b() != 0 && view != null && view2 != null) {
            if (!z) {
                return state.m35611b();
            }
            return (int) (((abstractC1806j.mo35364d(view2) - abstractC1806j.mo35361g(view)) / (Math.abs(layoutManager.m35705o0(view) - layoutManager.m35705o0(view2)) + 1)) * state.m35611b());
        }
        return 0;
    }
}