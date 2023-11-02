package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC4612b;
import p029b9.C2198p;
import p461z8.C14107a;
import p461z8.InterfaceC14132k;

/* renamed from: com.google.android.gms.common.api.internal.f0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4623f0<A extends AbstractC4612b<? extends InterfaceC14132k, C14107a.InterfaceC14109b>> extends AbstractC4633j0 {

    /* renamed from: b */
    protected final A f12702b;

    public C4623f0(int i, A a) {
        super(i);
        this.f12702b = (A) C2198p.m33984k(a, "Null methods are not runnable.");
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4633j0
    /* renamed from: a */
    public final void mo28148a(Status status) {
        try {
            this.f12702b.mo28029b(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4633j0
    /* renamed from: b */
    public final void mo28147b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb2 = new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length());
        sb2.append(simpleName);
        sb2.append(": ");
        sb2.append(localizedMessage);
        try {
            this.f12702b.mo28029b(new Status(10, sb2.toString()));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4633j0
    /* renamed from: c */
    public final void mo28146c(C4649t<?> c4649t) {
        try {
            this.f12702b.m28222e(c4649t.m28075v());
        } catch (RuntimeException e) {
            mo28147b(e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4633j0
    /* renamed from: d */
    public final void mo28145d(C4636l c4636l, boolean z) {
        c4636l.m28139c(this.f12702b, z);
    }
}