package p283p9;

import com.google.android.gms.auth.api.credentials.C4591a;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
import p029b9.C2198p;
import p318r8.InterfaceC12107b;
import p318r8.InterfaceC12108c;
import p461z8.AbstractC14124f;
import p461z8.AbstractC14127g;

/* renamed from: p9.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11477l implements InterfaceC12108c {
    @Override // p318r8.InterfaceC12108c
    /* renamed from: a */
    public final AbstractC14127g<Status> mo6145a(AbstractC14124f abstractC14124f, Credential credential) {
        C2198p.m33984k(abstractC14124f, "client must not be null");
        C2198p.m33984k(credential, "credential must not be null");
        return abstractC14124f.mo606b(new C11474i(this, abstractC14124f, credential));
    }

    @Override // p318r8.InterfaceC12108c
    /* renamed from: b */
    public final AbstractC14127g<Status> mo6144b(AbstractC14124f abstractC14124f, Credential credential) {
        C2198p.m33984k(abstractC14124f, "client must not be null");
        C2198p.m33984k(credential, "credential must not be null");
        return abstractC14124f.mo606b(new C11475j(this, abstractC14124f, credential));
    }

    @Override // p318r8.InterfaceC12108c
    /* renamed from: c */
    public final AbstractC14127g<InterfaceC12107b> mo6143c(AbstractC14124f abstractC14124f, C4591a c4591a) {
        C2198p.m33984k(abstractC14124f, "client must not be null");
        C2198p.m33984k(c4591a, "request must not be null");
        return abstractC14124f.mo607a(new C11473h(this, abstractC14124f, c4591a));
    }
}
