package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p010a9.AbstractC0122t;
import p010a9.InterfaceC0111k;
import p441y8.C13932c;
import p461z8.C14107a;

/* renamed from: com.google.android.gms.common.api.internal.h0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4629h0<ResultT> extends AbstractC0122t {

    /* renamed from: b */
    private final AbstractC4627h<C14107a.InterfaceC14109b, ResultT> f12721b;

    /* renamed from: c */
    private final TaskCompletionSource<ResultT> f12722c;

    /* renamed from: d */
    private final InterfaceC0111k f12723d;

    public C4629h0(int i, AbstractC4627h<C14107a.InterfaceC14109b, ResultT> abstractC4627h, TaskCompletionSource<ResultT> taskCompletionSource, InterfaceC0111k interfaceC0111k) {
        super(i);
        this.f12722c = taskCompletionSource;
        this.f12721b = abstractC4627h;
        this.f12723d = interfaceC0111k;
        if (i == 2 && abstractC4627h.m28162c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4633j0
    /* renamed from: a */
    public final void mo28148a(Status status) {
        this.f12722c.m28010d(this.f12723d.mo41133a(status));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4633j0
    /* renamed from: b */
    public final void mo28147b(Exception exc) {
        this.f12722c.m28010d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4633j0
    /* renamed from: c */
    public final void mo28146c(C4649t<?> c4649t) {
        try {
            this.f12721b.mo28163b(c4649t.m28075v(), this.f12722c);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo28148a(AbstractC4633j0.m28144e(e2));
        } catch (RuntimeException e3) {
            this.f12722c.m28010d(e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4633j0
    /* renamed from: d */
    public final void mo28145d(C4636l c4636l, boolean z) {
        c4636l.m28138d(this.f12722c, z);
    }

    @Override // p010a9.AbstractC0122t
    /* renamed from: f */
    public final boolean mo28151f(C4649t<?> c4649t) {
        return this.f12721b.m28162c();
    }

    @Override // p010a9.AbstractC0122t
    /* renamed from: g */
    public final C13932c[] mo28150g(C4649t<?> c4649t) {
        return this.f12721b.m28160e();
    }
}