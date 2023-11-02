package p385v9;

import com.google.android.gms.common.api.Status;
import p010a9.InterfaceC0095c;

/* renamed from: v9.b1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13171b1 extends AbstractC13177d1 {

    /* renamed from: a */
    final /* synthetic */ Status f34184a;

    public C13171b1(BinderC13174c1 binderC13174c1, Status status) {
        this.f34184a = status;
    }

    @Override // com.google.android.gms.common.api.internal.C4616d.InterfaceC4618b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo3008a(Object obj) {
        InterfaceC0095c interfaceC0095c = (InterfaceC0095c) obj;
        if (this.f34184a.m28240H()) {
            interfaceC0095c.mo3088a(this.f34184a);
        } else {
            interfaceC0095c.mo28029b(this.f34184a);
        }
    }
}