package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;
import p029b9.C2198p;
import p441y8.C13930a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.m0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class RunnableC4639m0 implements Runnable {

    /* renamed from: j */
    private final C4635k0 f12739j;

    /* renamed from: k */
    final /* synthetic */ AbstractDialogInterface$OnCancelListenerC4641n0 f12740k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4639m0(AbstractDialogInterface$OnCancelListenerC4641n0 abstractDialogInterface$OnCancelListenerC4641n0, C4635k0 c4635k0) {
        this.f12740k = abstractDialogInterface$OnCancelListenerC4641n0;
        this.f12739j = c4635k0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f12740k.f12743k) {
            return;
        }
        C13930a m28142b = this.f12739j.m28142b();
        if (m28142b.m1147G()) {
            AbstractDialogInterface$OnCancelListenerC4641n0 abstractDialogInterface$OnCancelListenerC4641n0 = this.f12740k;
            abstractDialogInterface$OnCancelListenerC4641n0.f12660j.startActivityForResult(GoogleApiActivity.m28246a(abstractDialogInterface$OnCancelListenerC4641n0.m28233b(), (PendingIntent) C2198p.m33985j(m28142b.m1148A()), this.f12739j.m28143a(), false), 1);
            return;
        }
        AbstractDialogInterface$OnCancelListenerC4641n0 abstractDialogInterface$OnCancelListenerC4641n02 = this.f12740k;
        if (abstractDialogInterface$OnCancelListenerC4641n02.f12746n.mo1125a(abstractDialogInterface$OnCancelListenerC4641n02.m28233b(), m28142b.m1144r(), null) != null) {
            AbstractDialogInterface$OnCancelListenerC4641n0 abstractDialogInterface$OnCancelListenerC4641n03 = this.f12740k;
            abstractDialogInterface$OnCancelListenerC4641n03.f12746n.m1127t(abstractDialogInterface$OnCancelListenerC4641n03.m28233b(), this.f12740k.f12660j, m28142b.m1144r(), 2, this.f12740k);
        } else if (m28142b.m1144r() == 18) {
            AbstractDialogInterface$OnCancelListenerC4641n0 abstractDialogInterface$OnCancelListenerC4641n04 = this.f12740k;
            Dialog m1132o = abstractDialogInterface$OnCancelListenerC4641n04.f12746n.m1132o(abstractDialogInterface$OnCancelListenerC4641n04.m28233b(), this.f12740k);
            AbstractDialogInterface$OnCancelListenerC4641n0 abstractDialogInterface$OnCancelListenerC4641n05 = this.f12740k;
            abstractDialogInterface$OnCancelListenerC4641n05.f12746n.m1131p(abstractDialogInterface$OnCancelListenerC4641n05.m28233b().getApplicationContext(), new C4637l0(this, m1132o));
        } else {
            this.f12740k.m28121l(m28142b, this.f12739j.m28143a());
        }
    }
}
