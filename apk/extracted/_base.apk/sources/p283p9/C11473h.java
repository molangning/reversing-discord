package p283p9;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.C4591a;
import com.google.android.gms.common.api.Status;
import p461z8.AbstractC14124f;
import p461z8.InterfaceC14132k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: p9.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11473h extends AbstractC11478m {

    /* renamed from: c */
    final /* synthetic */ C4591a f29808c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11473h(C11477l c11477l, AbstractC14124f abstractC14124f, C4591a c4591a) {
        super(abstractC14124f);
        this.f29808c = c4591a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ InterfaceC14132k createFailedResult(Status status) {
        return new C11471f(status, null);
    }

    @Override // p283p9.AbstractC11478m
    /* renamed from: g */
    protected final void mo8026g(Context context, C11484s c11484s) {
        c11484s.m8021g0(new BinderC11472g(this), this.f29808c);
    }
}
