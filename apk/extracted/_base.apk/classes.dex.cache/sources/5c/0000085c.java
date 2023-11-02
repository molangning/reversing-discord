package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: androidx.transition.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C1890o implements InterfaceC1891p {

    /* renamed from: a */
    private final ViewGroupOverlay f5209a;

    public C1890o(ViewGroup viewGroup) {
        this.f5209a = viewGroup.getOverlay();
    }

    @Override // androidx.transition.InterfaceC1894s
    /* renamed from: a */
    public void mo35103a(Drawable drawable) {
        this.f5209a.add(drawable);
    }

    @Override // androidx.transition.InterfaceC1894s
    /* renamed from: b */
    public void mo35102b(Drawable drawable) {
        this.f5209a.remove(drawable);
    }

    @Override // androidx.transition.InterfaceC1891p
    /* renamed from: c */
    public void mo35108c(View view) {
        this.f5209a.add(view);
    }

    @Override // androidx.transition.InterfaceC1891p
    /* renamed from: d */
    public void mo35107d(View view) {
        this.f5209a.remove(view);
    }
}