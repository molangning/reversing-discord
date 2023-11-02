package p385v9;

import ca.AbstractC2469b;
import com.google.android.gms.common.api.internal.C4616d;
import com.google.android.gms.nearby.messages.internal.Update;
import java.util.Iterator;
import java.util.List;
import p063da.AbstractBinderC5802o;

/* renamed from: v9.a1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class BinderC13168a1 extends AbstractBinderC5802o {

    /* renamed from: c */
    private final C4616d f34181c;

    public BinderC13168a1(C4616d c4616d) {
        this.f34181c = c4616d;
    }

    /* renamed from: c */
    public static void m3066c(Iterable iterable, AbstractC2469b abstractC2469b) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Update update = (Update) it.next();
            if (update.m28045r(1)) {
                abstractC2469b.onFound(update.f12848l);
            }
            if (update.m28045r(2)) {
                abstractC2469b.onLost(update.f12848l);
            }
            if (update.m28045r(4)) {
                abstractC2469b.onDistanceChanged(update.f12848l, update.f12849m);
            }
            if (update.m28045r(8)) {
                abstractC2469b.onBleSignalChanged(update.f12848l, update.f12850n);
            }
            update.m28045r(16);
        }
    }

    @Override // p063da.InterfaceC5803p
    /* renamed from: C */
    public final void mo3067C(List list) {
        this.f34181c.m28182c(new C13226z0(this, list));
    }
}
