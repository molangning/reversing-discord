package p385v9;

import com.google.android.gms.common.api.internal.C4616d;
import java.util.Set;

/* renamed from: v9.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class BinderC13201n extends AbstractBinderC13223y {

    /* renamed from: c */
    private final C4616d f34227c;

    /* renamed from: d */
    private final Set f34228d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public static boolean m3033g0(C13179e0 c13179e0) {
        if (c13179e0.m3054r() == null) {
            return false;
        }
        if (c13179e0.m3053z() != null && !"__UNRECOGNIZED_BLUETOOTH_DEVICE__".equals(c13179e0.m3053z())) {
            return false;
        }
        return true;
    }

    @Override // p385v9.InterfaceC13225z
    /* renamed from: P */
    public final synchronized void mo3011P(C13173c0 c13173c0) {
        this.f34227c.m28182c(new C13193j(this, c13173c0));
    }

    @Override // p385v9.InterfaceC13225z
    /* renamed from: U */
    public final synchronized void mo3010U(C13185g0 c13185g0) {
        this.f34228d.remove(c13185g0.m3051r());
        this.f34227c.m28182c(new C13197l(this, c13185g0));
    }

    @Override // p385v9.InterfaceC13225z
    /* renamed from: Z */
    public final synchronized void mo3009Z(C13179e0 c13179e0) {
        if (!m3033g0(c13179e0)) {
            this.f34228d.add(c13179e0.m3053z());
        }
        this.f34227c.m28182c(new C13195k(this, c13179e0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void m3035c() {
        for (String str : this.f34228d) {
            this.f34227c.m28182c(new C13199m(this, str));
        }
        this.f34228d.clear();
    }
}
