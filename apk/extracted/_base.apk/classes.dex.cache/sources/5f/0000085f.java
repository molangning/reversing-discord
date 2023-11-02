package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: androidx.transition.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C1893r implements InterfaceC1894s {

    /* renamed from: a */
    private final ViewOverlay f5211a;

    public C1893r(View view) {
        this.f5211a = view.getOverlay();
    }

    @Override // androidx.transition.InterfaceC1894s
    /* renamed from: a */
    public void mo35103a(Drawable drawable) {
        this.f5211a.add(drawable);
    }

    @Override // androidx.transition.InterfaceC1894s
    /* renamed from: b */
    public void mo35102b(Drawable drawable) {
        this.f5211a.remove(drawable);
    }
}