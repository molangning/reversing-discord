package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.C4616d;
import com.google.android.gms.tasks.TaskCompletionSource;
import p461z8.C14107a;
import p461z8.C14107a.InterfaceC14109b;

/* renamed from: com.google.android.gms.common.api.internal.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC4630i<A extends C14107a.InterfaceC14109b, L> {

    /* renamed from: a */
    private final C4616d.C4617a<L> f12724a;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC4630i(C4616d.C4617a<L> c4617a) {
        this.f12724a = c4617a;
    }

    /* renamed from: a */
    public C4616d.C4617a<L> m28153a() {
        return this.f12724a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo28152b(A a, TaskCompletionSource<Boolean> taskCompletionSource);
}
