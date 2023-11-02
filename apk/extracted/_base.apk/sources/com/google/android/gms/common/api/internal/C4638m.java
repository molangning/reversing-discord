package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.collection.C0626b;
import p010a9.C0093b;
import p010a9.InterfaceC0101f;
import p029b9.C2198p;
import p441y8.C13930a;
import p441y8.C13934e;

/* renamed from: com.google.android.gms.common.api.internal.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4638m extends AbstractDialogInterface$OnCancelListenerC4641n0 {

    /* renamed from: o */
    private final C0626b<C0093b<?>> f12737o;

    /* renamed from: p */
    private final C4614c f12738p;

    C4638m(InterfaceC0101f interfaceC0101f, C4614c c4614c, C13934e c13934e) {
        super(interfaceC0101f, c13934e);
        this.f12737o = new C0626b<>();
        this.f12738p = c4614c;
        this.f12660j.mo41132a("ConnectionlessLifecycleHelper", this);
    }

    /* renamed from: u */
    public static void m28130u(Activity activity, C4614c c4614c, C0093b<?> c0093b) {
        InterfaceC0101f m28231d = LifecycleCallback.m28231d(activity);
        C4638m c4638m = (C4638m) m28231d.mo41131b("ConnectionlessLifecycleHelper", C4638m.class);
        if (c4638m == null) {
            c4638m = new C4638m(m28231d, c4614c, C13934e.m1136k());
        }
        C2198p.m33984k(c0093b, "ApiKey cannot be null");
        c4638m.f12737o.add(c0093b);
        c4614c.m28207d(c4638m);
    }

    /* renamed from: v */
    private final void m28129v() {
        if (!this.f12737o.isEmpty()) {
            this.f12738p.m28207d(this);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: h */
    public final void mo28132h() {
        super.mo28132h();
        m28129v();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterface$OnCancelListenerC4641n0, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: j */
    public final void mo28123j() {
        super.mo28123j();
        m28129v();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterface$OnCancelListenerC4641n0, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: k */
    public final void mo28122k() {
        super.mo28122k();
        this.f12738p.m28206e(this);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterface$OnCancelListenerC4641n0
    /* renamed from: m */
    protected final void mo28120m(C13930a c13930a, int i) {
        this.f12738p.m28211J(c13930a, i);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterface$OnCancelListenerC4641n0
    /* renamed from: n */
    protected final void mo28119n() {
        this.f12738p.m28209b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final C0626b<C0093b<?>> m28131t() {
        return this.f12737o;
    }
}
