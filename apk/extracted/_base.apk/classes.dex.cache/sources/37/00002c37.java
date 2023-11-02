package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: com.google.android.material.internal.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4917p extends ImageButton {

    /* renamed from: j */
    private int f13787j;

    /* renamed from: b */
    public final void m26928b(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f13787j = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f13787j;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        m26928b(i, true);
    }
}