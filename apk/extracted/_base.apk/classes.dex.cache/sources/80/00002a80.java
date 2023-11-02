package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C1696m;
import java.util.concurrent.atomic.AtomicReference;
import p010a9.InterfaceC0101f;
import p319r9.HandlerC12118f;
import p441y8.C13930a;
import p441y8.C13934e;

/* renamed from: com.google.android.gms.common.api.internal.n0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractDialogInterface$OnCancelListenerC4641n0 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: k */
    protected volatile boolean f12743k;

    /* renamed from: l */
    protected final AtomicReference<C4635k0> f12744l;

    /* renamed from: m */
    private final Handler f12745m;

    /* renamed from: n */
    protected final C13934e f12746n;

    public AbstractDialogInterface$OnCancelListenerC4641n0(InterfaceC0101f interfaceC0101f, C13934e c13934e) {
        super(interfaceC0101f);
        this.f12744l = new AtomicReference<>(null);
        this.f12745m = new HandlerC12118f(Looper.getMainLooper());
        this.f12746n = c13934e;
    }

    /* renamed from: l */
    public final void m28121l(C13930a c13930a, int i) {
        this.f12744l.set(null);
        mo28120m(c13930a, i);
    }

    /* renamed from: o */
    public final void m28118o() {
        this.f12744l.set(null);
        mo28119n();
    }

    /* renamed from: p */
    private static final int m28117p(C4635k0 c4635k0) {
        if (c4635k0 == null) {
            return -1;
        }
        return c4635k0.m28143a();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: e */
    public final void mo28126e(int i, int i2, Intent intent) {
        C4635k0 c4635k0 = this.f12744l.get();
        if (i != 1) {
            if (i == 2) {
                int mo1121e = this.f12746n.mo1121e(m28233b());
                if (mo1121e == 0) {
                    m28118o();
                    return;
                } else if (c4635k0 == null) {
                    return;
                } else {
                    if (c4635k0.m28142b().m1144r() == 18 && mo1121e == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            m28118o();
            return;
        } else if (i2 == 0) {
            if (c4635k0 == null) {
                return;
            }
            int i3 = 13;
            if (intent != null) {
                i3 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
            }
            m28121l(new C13930a(i3, null, c4635k0.m28142b().toString()), m28117p(c4635k0));
            return;
        }
        if (c4635k0 != null) {
            m28121l(c4635k0.m28142b(), c4635k0.m28143a());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: f */
    public final void mo28125f(Bundle bundle) {
        C4635k0 c4635k0;
        super.mo28125f(bundle);
        if (bundle != null) {
            AtomicReference<C4635k0> atomicReference = this.f12744l;
            if (bundle.getBoolean("resolving_error", false)) {
                c4635k0 = new C4635k0(new C13930a(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                c4635k0 = null;
            }
            atomicReference.set(c4635k0);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: i */
    public final void mo28124i(Bundle bundle) {
        super.mo28124i(bundle);
        C4635k0 c4635k0 = this.f12744l.get();
        if (c4635k0 == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", c4635k0.m28143a());
        bundle.putInt("failed_status", c4635k0.m28142b().m1144r());
        bundle.putParcelable("failed_resolution", c4635k0.m28142b().m1148A());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: j */
    public void mo28123j() {
        super.mo28123j();
        this.f12743k = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: k */
    public void mo28122k() {
        super.mo28122k();
        this.f12743k = false;
    }

    /* renamed from: m */
    protected abstract void mo28120m(C13930a c13930a, int i);

    /* renamed from: n */
    protected abstract void mo28119n();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        m28121l(new C13930a(13, null), m28117p(this.f12744l.get()));
    }

    /* renamed from: s */
    public final void m28114s(C13930a c13930a, int i) {
        C4635k0 c4635k0 = new C4635k0(c13930a, i);
        if (C1696m.m36034a(this.f12744l, null, c4635k0)) {
            this.f12745m.post(new RunnableC4639m0(this, c4635k0));
        }
    }
}