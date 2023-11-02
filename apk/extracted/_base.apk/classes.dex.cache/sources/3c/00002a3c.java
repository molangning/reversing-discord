package com.google.android.gms.auth.api.credentials;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import p010a9.C0091a;
import p029b9.C2194o;
import p298q8.C11793a;
import p318r8.C12106a;
import p461z8.AbstractC14121e;

@Deprecated
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class CredentialsClient extends AbstractC14121e<C11793a.C11794a> {
    public CredentialsClient(Context context, C11793a.C11794a c11794a) {
        super(context, C11793a.f30771b, c11794a, new C0091a());
    }

    @Deprecated
    /* renamed from: C */
    public Task<Void> m28316C(Credential credential) {
        return C2194o.m33998c(C11793a.f30774e.mo6144b(m629h(), credential));
    }

    @Deprecated
    /* renamed from: D */
    public Task<C12106a> m28315D(C4591a c4591a) {
        return C2194o.m34000a(C11793a.f30774e.mo6143c(m629h(), c4591a), new C12106a());
    }

    @Deprecated
    /* renamed from: E */
    public Task<Void> m28314E(Credential credential) {
        return C2194o.m33998c(C11793a.f30774e.mo6145a(m629h(), credential));
    }
}