package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.j0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC4633j0 {

    /* renamed from: a */
    public final int f12728a;

    public AbstractC4633j0(int i) {
        this.f12728a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static /* bridge */ /* synthetic */ Status m28144e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    /* renamed from: a */
    public abstract void mo28148a(Status status);

    /* renamed from: b */
    public abstract void mo28147b(Exception exc);

    /* renamed from: c */
    public abstract void mo28146c(C4649t<?> c4649t);

    /* renamed from: d */
    public abstract void mo28145d(C4636l c4636l, boolean z);
}
