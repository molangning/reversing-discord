package p283p9;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: p9.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class BinderC11472g extends BinderC11470e {

    /* renamed from: c */
    final /* synthetic */ C11473h f29807c;

    public BinderC11472g(C11473h c11473h) {
        this.f29807c = c11473h;
    }

    @Override // p283p9.BinderC11470e, p283p9.InterfaceC11483r
    /* renamed from: A */
    public final void mo8025A(Status status, Credential credential) {
        this.f29807c.setResult(new C11471f(status, credential));
    }

    @Override // p283p9.InterfaceC11483r
    /* renamed from: d */
    public final void mo8024d(Status status) {
        this.f29807c.setResult(new C11471f(status, null));
    }
}