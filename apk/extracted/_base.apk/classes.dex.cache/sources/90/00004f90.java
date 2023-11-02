package p384v8;

import com.google.android.gms.common.api.Status;
import p461z8.AbstractC14124f;
import p461z8.C14107a;
import p461z8.InterfaceC14132k;

/* renamed from: v8.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13152k extends AbstractC13155n {
    public C13152k(AbstractC14124f abstractC14124f) {
        super(abstractC14124f);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC4612b
    /* renamed from: c */
    protected final /* bridge */ /* synthetic */ void mo3089c(C14107a.InterfaceC14109b interfaceC14109b) {
        C13150i c13150i = (C13150i) interfaceC14109b;
        ((C13162u) c13150i.m34112C()).m3075g0(new BinderC13151j(this), c13150i.m3090k0());
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ InterfaceC14132k createFailedResult(Status status) {
        return status;
    }
}