package p461z8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import p461z8.InterfaceC14132k;

/* renamed from: z8.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C14137p<R extends InterfaceC14132k> extends BasePendingResult<R> {

    /* renamed from: a */
    private final R f36324a;

    public C14137p(AbstractC14124f abstractC14124f, R r) {
        super(abstractC14124f);
        this.f36324a = r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R createFailedResult(Status status) {
        return this.f36324a;
    }
}
