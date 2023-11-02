package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p010a9.InterfaceC0095c;
import p029b9.C2198p;
import p461z8.AbstractC14124f;
import p461z8.C14107a;
import p461z8.C14107a.InterfaceC14109b;
import p461z8.InterfaceC14132k;

/* renamed from: com.google.android.gms.common.api.internal.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC4612b<R extends InterfaceC14132k, A extends C14107a.InterfaceC14109b> extends BasePendingResult<R> implements InterfaceC0095c<R> {

    /* renamed from: a */
    private final C14107a.C14110c<A> f12667a;

    /* renamed from: b */
    private final C14107a<?> f12668b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC4612b(C14107a<?> c14107a, AbstractC14124f abstractC14124f) {
        super((AbstractC14124f) C2198p.m33984k(abstractC14124f, "GoogleApiClient must not be null"));
        C2198p.m33984k(c14107a, "Api must not be null");
        this.f12667a = (C14107a.C14110c<A>) c14107a.m654b();
        this.f12668b = c14107a;
    }

    /* renamed from: f */
    private void m28221f(RemoteException remoteException) {
        mo28029b(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p010a9.InterfaceC0095c
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo3088a(Object obj) {
        super.setResult((InterfaceC14132k) obj);
    }

    @Override // p010a9.InterfaceC0095c
    /* renamed from: b */
    public final void mo28029b(Status status) {
        C2198p.m33993b(!status.m28240H(), "Failed result must not be success");
        R createFailedResult = createFailedResult(status);
        setResult(createFailedResult);
        m28223d(createFailedResult);
    }

    /* renamed from: c */
    protected abstract void mo3089c(A a);

    /* renamed from: d */
    protected void m28223d(R r) {
    }

    /* renamed from: e */
    public final void m28222e(A a) {
        try {
            mo3089c(a);
        } catch (DeadObjectException e) {
            m28221f(e);
            throw e;
        } catch (RemoteException e2) {
            m28221f(e2);
        }
    }
}
