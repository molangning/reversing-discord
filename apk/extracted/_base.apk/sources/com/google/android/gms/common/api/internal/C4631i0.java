package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.C4616d;
import com.google.android.gms.tasks.TaskCompletionSource;
import p010a9.C0126x;
import p441y8.C13932c;

/* renamed from: com.google.android.gms.common.api.internal.i0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4631i0 extends AbstractC4619d0<Boolean> {

    /* renamed from: c */
    public final C4616d.C4617a<?> f12725c;

    public C4631i0(C4616d.C4617a<?> c4617a, TaskCompletionSource<Boolean> taskCompletionSource) {
        super(4, taskCompletionSource);
        this.f12725c = c4617a;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4633j0
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo28145d(C4636l c4636l, boolean z) {
    }

    @Override // p010a9.AbstractC0122t
    /* renamed from: f */
    public final boolean mo28151f(C4649t<?> c4649t) {
        C0126x c0126x = c4649t.m28073x().get(this.f12725c);
        if (c0126x != null && c0126x.f492a.m28173f()) {
            return true;
        }
        return false;
    }

    @Override // p010a9.AbstractC0122t
    /* renamed from: g */
    public final C13932c[] mo28150g(C4649t<?> c4649t) {
        C0126x c0126x = c4649t.m28073x().get(this.f12725c);
        if (c0126x == null) {
            return null;
        }
        return c0126x.f492a.m28176c();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4619d0
    /* renamed from: h */
    public final void mo28149h(C4649t<?> c4649t) {
        C0126x remove = c4649t.m28073x().remove(this.f12725c);
        if (remove != null) {
            remove.f493b.mo28152b(c4649t.m28075v(), this.f12697b);
            remove.f492a.m28178a();
            return;
        }
        this.f12697b.m28009e(Boolean.FALSE);
    }
}
