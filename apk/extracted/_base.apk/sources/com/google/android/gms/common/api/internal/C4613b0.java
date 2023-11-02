package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.C4616d;
import com.google.android.gms.common.api.internal.C4624g;
import com.google.android.gms.tasks.TaskCompletionSource;
import p010a9.InterfaceC0107i;
import p461z8.C14107a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.b0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4613b0 extends AbstractC4630i {

    /* renamed from: b */
    final /* synthetic */ C4624g.C4625a f12669b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4613b0(C4624g.C4625a c4625a, C4616d.C4617a c4617a) {
        super(c4617a);
        this.f12669b = c4625a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.AbstractC4630i
    /* renamed from: b */
    public final void mo28152b(C14107a.InterfaceC14109b interfaceC14109b, TaskCompletionSource<Boolean> taskCompletionSource) {
        InterfaceC0107i interfaceC0107i;
        interfaceC0107i = this.f12669b.f12707b;
        interfaceC0107i.accept(interfaceC14109b, taskCompletionSource);
    }
}
