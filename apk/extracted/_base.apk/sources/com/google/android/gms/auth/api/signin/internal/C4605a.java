package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import androidx.loader.app.LoaderManager;
import p205l0.C9994b;
import p384v8.C13148g;
import p384v8.C13165x;
import p461z8.AbstractC14124f;

/* renamed from: com.google.android.gms.auth.api.signin.internal.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C4605a implements LoaderManager.InterfaceC1720a {

    /* renamed from: a */
    final /* synthetic */ SignInHubActivity f12643a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C4605a(SignInHubActivity signInHubActivity, C13165x c13165x) {
        this.f12643a = signInHubActivity;
    }

    @Override // androidx.loader.app.LoaderManager.InterfaceC1720a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28249a(C9994b c9994b, Object obj) {
        Void r3 = (Void) obj;
        SignInHubActivity signInHubActivity = this.f12643a;
        signInHubActivity.setResult(SignInHubActivity.m28254c(signInHubActivity), SignInHubActivity.m28253d(signInHubActivity));
        this.f12643a.finish();
    }

    @Override // androidx.loader.app.LoaderManager.InterfaceC1720a
    /* renamed from: b */
    public final void mo28248b(C9994b c9994b) {
    }

    @Override // androidx.loader.app.LoaderManager.InterfaceC1720a
    /* renamed from: c */
    public final C9994b mo28247c(int i, Bundle bundle) {
        return new C13148g(this.f12643a, AbstractC14124f.m605c());
    }
}
