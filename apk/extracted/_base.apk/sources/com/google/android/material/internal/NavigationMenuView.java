package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.view.menu.C0389g;
import androidx.appcompat.view.menu.InterfaceC0407n;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC0407n {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0407n
    /* renamed from: a */
    public void mo27070a(C0389g c0389g) {
    }

    public int getWindowAnimations() {
        return 0;
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }
}
