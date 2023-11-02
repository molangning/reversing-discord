package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.AbstractC4627h;
import com.google.android.gms.tasks.TaskCompletionSource;
import p010a9.InterfaceC0107i;
import p441y8.C13932c;
import p461z8.C14107a;

/* renamed from: com.google.android.gms.common.api.internal.c0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4615c0 extends AbstractC4627h {

    /* renamed from: d */
    final /* synthetic */ AbstractC4627h.C4628a f12691d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4615c0(AbstractC4627h.C4628a c4628a, C13932c[] c13932cArr, boolean z, int i) {
        super(c13932cArr, z, i);
        this.f12691d = c4628a;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4627h
    /* renamed from: b */
    public final void mo28163b(C14107a.InterfaceC14109b interfaceC14109b, TaskCompletionSource taskCompletionSource) {
        InterfaceC0107i interfaceC0107i;
        interfaceC0107i = this.f12691d.f12717a;
        interfaceC0107i.accept(interfaceC14109b, taskCompletionSource);
    }
}