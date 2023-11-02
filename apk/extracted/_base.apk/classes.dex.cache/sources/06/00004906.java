package p283p9;

import android.content.Context;
import com.google.android.gms.common.api.internal.AbstractC4612b;
import p298q8.C11793a;
import p461z8.AbstractC14124f;
import p461z8.C14107a;
import p461z8.InterfaceC14132k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: p9.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC11478m extends AbstractC4612b {
    public AbstractC11478m(AbstractC14124f abstractC14124f) {
        super(C11793a.f30771b, abstractC14124f);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4612b, p010a9.InterfaceC0095c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo3088a(Object obj) {
        super.setResult((InterfaceC14132k) obj);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4612b
    /* renamed from: c */
    protected final /* bridge */ /* synthetic */ void mo3089c(C14107a.InterfaceC14109b interfaceC14109b) {
        C11479n c11479n = (C11479n) interfaceC14109b;
        mo8026g(c11479n.m34075x(), (C11484s) c11479n.m34112C());
    }

    /* renamed from: g */
    protected abstract void mo8026g(Context context, C11484s c11484s);
}