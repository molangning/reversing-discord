package p070di;

import ai.InterfaceC0194h;
import fi.AbstractC6451h;
import gi.InterfaceC6821n;
import kotlin.jvm.internal.C9612q;
import p305qg.InterfaceC11928h0;
import ph.C11633c;
import ph.C11638f;
import tg.AbstractC12748z;

/* renamed from: di.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC5946p extends AbstractC12748z {

    /* renamed from: p */
    private final InterfaceC6821n f16946p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5946p(C11633c fqName, InterfaceC6821n storageManager, InterfaceC11928h0 module) {
        super(module, fqName);
        C9612q.m13917h(fqName, "fqName");
        C9612q.m13917h(storageManager, "storageManager");
        C9612q.m13917h(module, "module");
        this.f16946p = storageManager;
    }

    /* renamed from: G0 */
    public abstract InterfaceC5931h mo24089G0();

    /* renamed from: K0 */
    public boolean m24090K0(C11638f name) {
        C9612q.m13917h(name, "name");
        InterfaceC0194h mo4368o = mo4368o();
        if ((mo4368o instanceof AbstractC6451h) && ((AbstractC6451h) mo4368o).m22723q().contains(name)) {
            return true;
        }
        return false;
    }

    /* renamed from: L0 */
    public abstract void mo24088L0(C5939k c5939k);
}