package p161ii;

import ai.InterfaceC0194h;
import java.util.List;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import li.EnumC10193b;
import li.InterfaceC10195d;
import p142hi.AbstractC7302o0;
import p142hi.AbstractC7333v1;
import p142hi.C7226c1;
import p142hi.InterfaceC7288k1;
import p183ji.C8967k;
import p183ji.EnumC8963g;
import p305qg.InterfaceC11920f1;

/* renamed from: ii.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7595i extends AbstractC7302o0 implements InterfaceC10195d {

    /* renamed from: k */
    private final EnumC10193b f20884k;

    /* renamed from: l */
    private final C7596j f20885l;

    /* renamed from: m */
    private final AbstractC7333v1 f20886m;

    /* renamed from: n */
    private final C7226c1 f20887n;

    /* renamed from: o */
    private final boolean f20888o;

    /* renamed from: p */
    private final boolean f20889p;

    public /* synthetic */ C7595i(EnumC10193b enumC10193b, C7596j c7596j, AbstractC7333v1 abstractC7333v1, C7226c1 c7226c1, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC10193b, c7596j, abstractC7333v1, (i & 8) != 0 ? C7226c1.f19622k.m21197h() : c7226c1, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2);
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
        return this.f20887n;
    }

    @Override // p142hi.AbstractC7264g0
    /* renamed from: O0 */
    public boolean mo3563O0() {
        return this.f20888o;
    }

    @Override // p142hi.AbstractC7333v1
    /* renamed from: V0 */
    public AbstractC7302o0 mo3559T0(C7226c1 newAttributes) {
        C9612q.m13917h(newAttributes, "newAttributes");
        return new C7595i(this.f20884k, mo3564N0(), this.f20886m, newAttributes, mo3563O0(), this.f20889p);
    }

    /* renamed from: W0 */
    public final EnumC10193b m20272W0() {
        return this.f20884k;
    }

    @Override // p142hi.AbstractC7264g0
    /* renamed from: X0 */
    public C7596j mo3564N0() {
        return this.f20885l;
    }

    /* renamed from: Y0 */
    public final AbstractC7333v1 m20270Y0() {
        return this.f20886m;
    }

    /* renamed from: Z0 */
    public final boolean m20269Z0() {
        return this.f20889p;
    }

    @Override // p142hi.AbstractC7302o0
    /* renamed from: a1 */
    public C7595i mo3558U0(boolean z) {
        return new C7595i(this.f20884k, mo3564N0(), this.f20886m, mo3565M0(), z, false, 32, null);
    }

    @Override // p142hi.AbstractC7333v1
    /* renamed from: b1 */
    public C7595i mo3560S0(AbstractC7592g kotlinTypeRefiner) {
        AbstractC7333v1 abstractC7333v1;
        C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
        EnumC10193b enumC10193b = this.f20884k;
        C7596j mo2789o = mo3564N0().mo2789o(kotlinTypeRefiner);
        AbstractC7333v1 abstractC7333v12 = this.f20886m;
        if (abstractC7333v12 != null) {
            abstractC7333v1 = kotlinTypeRefiner.mo20276h(abstractC7333v12).mo20916Q0();
        } else {
            abstractC7333v1 = null;
        }
        return new C7595i(enumC10193b, mo2789o, abstractC7333v1, mo3565M0(), mo3563O0(), false, 32, null);
    }

    @Override // p142hi.AbstractC7264g0
    /* renamed from: o */
    public InterfaceC0194h mo3553o() {
        return C8967k.m16948a(EnumC8963g.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public C7595i(EnumC10193b captureStatus, C7596j constructor, AbstractC7333v1 abstractC7333v1, C7226c1 attributes, boolean z, boolean z2) {
        C9612q.m13917h(captureStatus, "captureStatus");
        C9612q.m13917h(constructor, "constructor");
        C9612q.m13917h(attributes, "attributes");
        this.f20884k = captureStatus;
        this.f20885l = constructor;
        this.f20886m = abstractC7333v1;
        this.f20887n = attributes;
        this.f20888o = z;
        this.f20889p = z2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7595i(EnumC10193b captureStatus, AbstractC7333v1 abstractC7333v1, InterfaceC7288k1 projection, InterfaceC11920f1 typeParameter) {
        this(captureStatus, new C7596j(projection, null, null, typeParameter, 6, null), abstractC7333v1, null, false, false, 56, null);
        C9612q.m13917h(captureStatus, "captureStatus");
        C9612q.m13917h(projection, "projection");
        C9612q.m13917h(typeParameter, "typeParameter");
    }
}
