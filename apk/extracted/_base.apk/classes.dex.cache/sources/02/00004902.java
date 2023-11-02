package p283p9;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
import p461z8.AbstractC14124f;
import p461z8.InterfaceC14132k;

/* renamed from: p9.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C11474i extends AbstractC11478m {

    /* renamed from: c */
    final /* synthetic */ Credential f29809c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11474i(C11477l c11477l, AbstractC14124f abstractC14124f, Credential credential) {
        super(abstractC14124f);
        this.f29809c = credential;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ InterfaceC14132k createFailedResult(Status status) {
        return status;
    }

    @Override // p283p9.AbstractC11478m
    /* renamed from: g */
    protected final void mo8026g(Context context, C11484s c11484s) {
        c11484s.m8020h0(new BinderC11476k(this), new C11485t(this.f29809c));
    }
}