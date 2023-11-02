package p142hi;

import gi.InterfaceC6815i;
import gi.InterfaceC6821n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import li.InterfaceC10200i;
import p161ii.AbstractC7592g;

/* renamed from: hi.j0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7279j0 extends AbstractC7340x1 {

    /* renamed from: k */
    private final InterfaceC6821n f19706k;

    /* renamed from: l */
    private final Function0<AbstractC7264g0> f19707l;

    /* renamed from: m */
    private final InterfaceC6815i<AbstractC7264g0> f19708m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hi.j0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7280a extends AbstractC9614s implements Function0<AbstractC7264g0> {

        /* renamed from: j */
        final /* synthetic */ AbstractC7592g f19709j;

        /* renamed from: k */
        final /* synthetic */ C7279j0 f19710k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7280a(AbstractC7592g abstractC7592g, C7279j0 c7279j0) {
            super(0);
            this.f19709j = abstractC7592g;
            this.f19710k = c7279j0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final AbstractC7264g0 invoke() {
            return this.f19709j.mo20276h((InterfaceC10200i) this.f19710k.f19707l.invoke());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7279j0(InterfaceC6821n storageManager, Function0<? extends AbstractC7264g0> computation) {
        C9612q.m13917h(storageManager, "storageManager");
        C9612q.m13917h(computation, "computation");
        this.f19706k = storageManager;
        this.f19707l = computation;
        this.f19708m = storageManager.mo21867c(computation);
    }

    @Override // p142hi.AbstractC7340x1
    /* renamed from: R0 */
    protected AbstractC7264g0 mo20915R0() {
        return this.f19708m.invoke();
    }

    @Override // p142hi.AbstractC7340x1
    /* renamed from: S0 */
    public boolean mo20914S0() {
        return this.f19708m.m21875o();
    }

    @Override // p142hi.AbstractC7264g0
    /* renamed from: U0 */
    public C7279j0 mo3562P0(AbstractC7592g kotlinTypeRefiner) {
        C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new C7279j0(this.f19706k, new C7280a(kotlinTypeRefiner, this));
    }
}
