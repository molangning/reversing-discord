package p283p9;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
import p318r8.InterfaceC12107b;

/* renamed from: p9.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11471f implements InterfaceC12107b {

    /* renamed from: j */
    private final Status f29805j;

    /* renamed from: k */
    private final Credential f29806k;

    public C11471f(Status status, Credential credential) {
        this.f29805j = status;
        this.f29806k = credential;
    }

    @Override // p461z8.InterfaceC14132k
    /* renamed from: b */
    public final Status mo596b() {
        return this.f29805j;
    }

    @Override // p318r8.InterfaceC12107b
    /* renamed from: h */
    public final Credential mo6146h() {
        return this.f29806k;
    }
}
