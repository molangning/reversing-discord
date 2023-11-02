package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.C4616d;
import com.google.android.gms.tasks.TaskCompletionSource;
import p010a9.C0126x;
import p441y8.C13932c;

/* renamed from: com.google.android.gms.common.api.internal.g0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4626g0 extends AbstractC4619d0<Void> {

    /* renamed from: c */
    public final C0126x f12713c;

    public C4626g0(C0126x c0126x, TaskCompletionSource<Void> taskCompletionSource) {
        super(3, taskCompletionSource);
        this.f12713c = c0126x;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4633j0
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo28145d(C4636l c4636l, boolean z) {
    }

    @Override // p010a9.AbstractC0122t
    /* renamed from: f */
    public final boolean mo28151f(C4649t<?> c4649t) {
        return this.f12713c.f492a.m28173f();
    }

    @Override // p010a9.AbstractC0122t
    /* renamed from: g */
    public final C13932c[] mo28150g(C4649t<?> c4649t) {
        return this.f12713c.f492a.m28176c();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4619d0
    /* renamed from: h */
    public final void mo28149h(C4649t<?> c4649t) {
        this.f12713c.f492a.mo28175d(c4649t.m28075v(), this.f12697b);
        C4616d.C4617a<?> m28177b = this.f12713c.f492a.m28177b();
        if (m28177b != null) {
            c4649t.m28073x().put(m28177b, this.f12713c);
        }
    }
}