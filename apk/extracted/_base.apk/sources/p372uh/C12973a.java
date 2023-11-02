package p372uh;

import ai.InterfaceC0194h;
import java.util.List;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import li.InterfaceC10195d;
import p142hi.AbstractC7302o0;
import p142hi.C7226c1;
import p142hi.InterfaceC7288k1;
import p161ii.AbstractC7592g;
import p183ji.C8967k;
import p183ji.EnumC8963g;

/* renamed from: uh.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C12973a extends AbstractC7302o0 implements InterfaceC10195d {

    /* renamed from: k */
    private final InterfaceC7288k1 f33728k;

    /* renamed from: l */
    private final InterfaceC12974b f33729l;

    /* renamed from: m */
    private final boolean f33730m;

    /* renamed from: n */
    private final C7226c1 f33731n;

    public /* synthetic */ C12973a(InterfaceC7288k1 interfaceC7288k1, InterfaceC12974b interfaceC12974b, boolean z, C7226c1 c7226c1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC7288k1, (i & 2) != 0 ? new C12975c(interfaceC7288k1) : interfaceC12974b, (i & 4) != 0 ? false : z, (i & 8) != 0 ? C7226c1.f19622k.m21197h() : c7226c1);
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
        return this.f33731n;
    }

    @Override // p142hi.AbstractC7264g0
    /* renamed from: O0 */
    public boolean mo3563O0() {
        return this.f33730m;
    }

    @Override // p142hi.AbstractC7333v1
    /* renamed from: V0 */
    public AbstractC7302o0 mo3559T0(C7226c1 newAttributes) {
        C9612q.m13917h(newAttributes, "newAttributes");
        return new C12973a(this.f33728k, mo3564N0(), mo3563O0(), newAttributes);
    }

    @Override // p142hi.AbstractC7264g0
    /* renamed from: W0 */
    public InterfaceC12974b mo3564N0() {
        return this.f33729l;
    }

    @Override // p142hi.AbstractC7302o0
    /* renamed from: X0 */
    public C12973a mo3558U0(boolean z) {
        if (z == mo3563O0()) {
            return this;
        }
        return new C12973a(this.f33728k, mo3564N0(), z, mo3565M0());
    }

    @Override // p142hi.AbstractC7333v1
    /* renamed from: Y0 */
    public C12973a mo3560S0(AbstractC7592g kotlinTypeRefiner) {
        C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
        InterfaceC7288k1 mo20951o = this.f33728k.mo20951o(kotlinTypeRefiner);
        C9612q.m13918g(mo20951o, "typeProjection.refine(kotlinTypeRefiner)");
        return new C12973a(mo20951o, mo3564N0(), mo3563O0(), mo3565M0());
    }

    @Override // p142hi.AbstractC7264g0
    /* renamed from: o */
    public InterfaceC0194h mo3553o() {
        return C8967k.m16948a(EnumC8963g.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // p142hi.AbstractC7302o0
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Captured(");
        sb2.append(this.f33728k);
        sb2.append(')');
        sb2.append(mo3563O0() ? "?" : "");
        return sb2.toString();
    }

    public C12973a(InterfaceC7288k1 typeProjection, InterfaceC12974b constructor, boolean z, C7226c1 attributes) {
        C9612q.m13917h(typeProjection, "typeProjection");
        C9612q.m13917h(constructor, "constructor");
        C9612q.m13917h(attributes, "attributes");
        this.f33728k = typeProjection;
        this.f33729l = constructor;
        this.f33730m = z;
        this.f33731n = attributes;
    }
}
