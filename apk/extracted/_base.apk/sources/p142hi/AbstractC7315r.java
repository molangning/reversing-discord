package p142hi;

import ai.InterfaceC0194h;
import java.util.List;
import kotlin.jvm.internal.C9612q;
import p161ii.AbstractC7592g;

/* renamed from: hi.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC7315r extends AbstractC7302o0 {
    @Override // p142hi.AbstractC7264g0
    /* renamed from: L0 */
    public List<InterfaceC7288k1> mo3566L0() {
        return mo20971W0().mo3566L0();
    }

    @Override // p142hi.AbstractC7264g0
    /* renamed from: M0 */
    public C7226c1 mo3565M0() {
        return mo20971W0().mo3565M0();
    }

    @Override // p142hi.AbstractC7264g0
    /* renamed from: N0 */
    public InterfaceC7265g1 mo3564N0() {
        return mo20971W0().mo3564N0();
    }

    @Override // p142hi.AbstractC7264g0
    /* renamed from: O0 */
    public boolean mo3563O0() {
        return mo20971W0().mo3563O0();
    }

    /* renamed from: W0 */
    protected abstract AbstractC7302o0 mo20971W0();

    @Override // p142hi.AbstractC7333v1
    /* renamed from: X0 */
    public AbstractC7302o0 mo3560S0(AbstractC7592g kotlinTypeRefiner) {
        C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC7264g0 mo20276h = kotlinTypeRefiner.mo20276h(mo20971W0());
        C9612q.m13919f(mo20276h, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return mo20969Y0((AbstractC7302o0) mo20276h);
    }

    /* renamed from: Y0 */
    public abstract AbstractC7315r mo20969Y0(AbstractC7302o0 abstractC7302o0);

    @Override // p142hi.AbstractC7264g0
    /* renamed from: o */
    public InterfaceC0194h mo3553o() {
        return mo20971W0().mo3553o();
    }
}
