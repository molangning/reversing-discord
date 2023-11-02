package p142hi;

import kotlin.jvm.internal.C9612q;
import p161ii.AbstractC7592g;

/* renamed from: hi.r0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7316r0 extends AbstractC7315r implements InterfaceC7324t1 {

    /* renamed from: k */
    private final AbstractC7302o0 f19750k;

    /* renamed from: l */
    private final AbstractC7264g0 f19751l;

    public C7316r0(AbstractC7302o0 delegate, AbstractC7264g0 enhancement) {
        C9612q.m13917h(delegate, "delegate");
        C9612q.m13917h(enhancement, "enhancement");
        this.f19750k = delegate;
        this.f19751l = enhancement;
    }

    @Override // p142hi.AbstractC7333v1
    /* renamed from: U0 */
    public AbstractC7302o0 mo3561R0(boolean z) {
        AbstractC7333v1 m20946d = C7329u1.m20946d(mo20963G0().mo3558U0(z), mo20962g0().mo20916Q0().mo3561R0(z));
        C9612q.m13919f(m20946d, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (AbstractC7302o0) m20946d;
    }

    @Override // p142hi.AbstractC7333v1
    /* renamed from: V0 */
    public AbstractC7302o0 mo3559T0(C7226c1 newAttributes) {
        C9612q.m13917h(newAttributes, "newAttributes");
        AbstractC7333v1 m20946d = C7329u1.m20946d(mo20963G0().mo3557V0(newAttributes), mo20962g0());
        C9612q.m13919f(m20946d, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (AbstractC7302o0) m20946d;
    }

    @Override // p142hi.AbstractC7315r
    /* renamed from: W0 */
    protected AbstractC7302o0 mo20971W0() {
        return this.f19750k;
    }

    @Override // p142hi.InterfaceC7324t1
    /* renamed from: Z0 */
    public AbstractC7302o0 mo20963G0() {
        return mo20971W0();
    }

    @Override // p142hi.AbstractC7315r
    /* renamed from: a1 */
    public C7316r0 mo20970X0(AbstractC7592g kotlinTypeRefiner) {
        C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC7264g0 mo20276h = kotlinTypeRefiner.mo20276h(mo20971W0());
        C9612q.m13919f(mo20276h, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C7316r0((AbstractC7302o0) mo20276h, kotlinTypeRefiner.mo20276h(mo20962g0()));
    }

    @Override // p142hi.AbstractC7315r
    /* renamed from: b1 */
    public C7316r0 mo20969Y0(AbstractC7302o0 delegate) {
        C9612q.m13917h(delegate, "delegate");
        return new C7316r0(delegate, mo20962g0());
    }

    @Override // p142hi.InterfaceC7324t1
    /* renamed from: g0 */
    public AbstractC7264g0 mo20962g0() {
        return this.f19751l;
    }

    @Override // p142hi.AbstractC7302o0
    public String toString() {
        return "[@EnhancedForWarnings(" + mo20962g0() + ")] " + mo20963G0();
    }
}