package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p010a9.AbstractC0122t;
import p461z8.C14118b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.d0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC4619d0<T> extends AbstractC0122t {

    /* renamed from: b */
    protected final TaskCompletionSource<T> f12697b;

    public AbstractC4619d0(int i, TaskCompletionSource<T> taskCompletionSource) {
        super(i);
        this.f12697b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4633j0
    /* renamed from: a */
    public final void mo28148a(Status status) {
        this.f12697b.m28010d(new C14118b(status));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4633j0
    /* renamed from: b */
    public final void mo28147b(Exception exc) {
        this.f12697b.m28010d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4633j0
    /* renamed from: c */
    public final void mo28146c(C4649t<?> c4649t) {
        try {
            mo28149h(c4649t);
        } catch (DeadObjectException e) {
            mo28148a(AbstractC4633j0.m28144e(e));
            throw e;
        } catch (RemoteException e2) {
            mo28148a(AbstractC4633j0.m28144e(e2));
        } catch (RuntimeException e3) {
            this.f12697b.m28010d(e3);
        }
    }

    /* renamed from: h */
    protected abstract void mo28149h(C4649t<?> c4649t);
}
