package p142hi;

import ai.InterfaceC0194h;
import java.util.List;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p161ii.AbstractC7592g;
import p161ii.InterfaceC7605n;
import p183ji.C8967k;
import p183ji.EnumC8963g;

/* renamed from: hi.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC7231e extends AbstractC7302o0 {

    /* renamed from: n */
    public static final C7232a f19625n = new C7232a(null);

    /* renamed from: k */
    private final InterfaceC7605n f19626k;

    /* renamed from: l */
    private final boolean f19627l;

    /* renamed from: m */
    private final InterfaceC0194h f19628m;

    /* renamed from: hi.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7232a {
        private C7232a() {
        }

        public /* synthetic */ C7232a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AbstractC7231e(InterfaceC7605n originalTypeVariable, boolean z) {
        C9612q.m13917h(originalTypeVariable, "originalTypeVariable");
        this.f19626k = originalTypeVariable;
        this.f19627l = z;
        this.f19628m = C8967k.m16947b(EnumC8963g.STUB_TYPE_SCOPE, originalTypeVariable.toString());
    }

    @Override // p142hi.AbstractC7264g0
    /* renamed from: L0 */
    public List<InterfaceC7288k1> mo3566L0() {
        List<InterfaceC7288k1> m14104i;
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    @Override // p142hi.AbstractC7264g0
    /* renamed from: M0 */
    public C7226c1 mo3565M0() {
        return C7226c1.f19622k.m21197h();
    }

    @Override // p142hi.AbstractC7264g0
    /* renamed from: O0 */
    public boolean mo3563O0() {
        return this.f19627l;
    }

    @Override // p142hi.AbstractC7333v1
    /* renamed from: U0 */
    public AbstractC7302o0 mo3561R0(boolean z) {
        return z == mo3563O0() ? this : mo20937X0(z);
    }

    @Override // p142hi.AbstractC7333v1
    /* renamed from: V0 */
    public AbstractC7302o0 mo3559T0(C7226c1 newAttributes) {
        C9612q.m13917h(newAttributes, "newAttributes");
        return this;
    }

    /* renamed from: W0 */
    public final InterfaceC7605n m21187W0() {
        return this.f19626k;
    }

    /* renamed from: X0 */
    public abstract AbstractC7231e mo20937X0(boolean z);

    @Override // p142hi.AbstractC7333v1
    /* renamed from: Y0 */
    public AbstractC7231e mo3560S0(AbstractC7592g kotlinTypeRefiner) {
        C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // p142hi.AbstractC7264g0
    /* renamed from: o */
    public InterfaceC0194h mo3553o() {
        return this.f19628m;
    }
}