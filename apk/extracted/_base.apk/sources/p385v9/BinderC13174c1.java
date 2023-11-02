package p385v9;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4616d;
import p063da.AbstractBinderC5804q;

/* renamed from: v9.c1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class BinderC13174c1 extends AbstractBinderC5804q {

    /* renamed from: c */
    private final C4616d f34189c;

    /* renamed from: d */
    private boolean f34190d = false;

    public BinderC13174c1(C4616d c4616d) {
        this.f34189c = c4616d;
    }

    @Override // p063da.InterfaceC5805r
    /* renamed from: H */
    public final synchronized void mo3058H(Status status) {
        if (!this.f34190d) {
            this.f34189c.m28182c(new C13171b1(this, status));
            this.f34190d = true;
            return;
        }
        String valueOf = String.valueOf(status);
        Log.wtf("NearbyMessagesCallbackWrapper", "Received multiple statuses: ".concat(valueOf), new Exception());
    }
}
