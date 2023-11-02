package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C1802g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.google.android.material.datepicker.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C4849q extends LinearLayoutManager {

    /* renamed from: com.google.android.material.datepicker.q$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4850a extends C1802g {
        C4850a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C1802g
        protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4849q(Context context, int i, boolean z) {
        super(context, i, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: R1 */
    public void mo27232R1(RecyclerView recyclerView, RecyclerView.State state, int i) {
        C4850a c4850a = new C4850a(recyclerView.getContext());
        c4850a.setTargetPosition(i);
        m35740S1(c4850a);
    }
}
