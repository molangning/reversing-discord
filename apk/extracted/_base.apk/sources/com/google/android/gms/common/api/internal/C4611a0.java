package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.C4624g;
import com.google.android.gms.tasks.TaskCompletionSource;
import p010a9.InterfaceC0107i;
import p441y8.C13932c;
import p461z8.C14107a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.a0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4611a0 extends AbstractC4622f {

    /* renamed from: e */
    final /* synthetic */ C4624g.C4625a f12666e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4611a0(C4624g.C4625a c4625a, C4616d c4616d, C13932c[] c13932cArr, boolean z, int i) {
        super(c4616d, c13932cArr, z, i);
        this.f12666e = c4625a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.AbstractC4622f
    /* renamed from: d */
    public final void mo28175d(C14107a.InterfaceC14109b interfaceC14109b, TaskCompletionSource<Void> taskCompletionSource) {
        InterfaceC0107i interfaceC0107i;
        interfaceC0107i = this.f12666e.f12706a;
        interfaceC0107i.accept(interfaceC14109b, taskCompletionSource);
    }
}
