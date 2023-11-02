package p142hi;

import kotlin.jvm.internal.C9612q;
import p161ii.AbstractC7592g;
import sh.AbstractC12485c;
import sh.InterfaceC12513f;

/* renamed from: hi.c0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7225c0 extends AbstractC7217a0 implements InterfaceC7324t1 {

    /* renamed from: m */
    private final AbstractC7217a0 f19620m;

    /* renamed from: n */
    private final AbstractC7264g0 f19621n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7225c0(AbstractC7217a0 origin, AbstractC7264g0 enhancement) {
        super(origin.m21218V0(), origin.m21217W0());
        C9612q.m13917h(origin, "origin");
        C9612q.m13917h(enhancement, "enhancement");
        this.f19620m = origin;
        this.f19621n = enhancement;
    }

    @Override // p142hi.AbstractC7333v1
    /* renamed from: R0 */
    public AbstractC7333v1 mo3561R0(boolean z) {
        return C7329u1.m20946d(mo20963G0().mo3561R0(z), mo20962g0().mo20916Q0().mo3561R0(z));
    }

    @Override // p142hi.AbstractC7333v1
    /* renamed from: T0 */
    public AbstractC7333v1 mo3559T0(C7226c1 newAttributes) {
        C9612q.m13917h(newAttributes, "newAttributes");
        return C7329u1.m20946d(mo20963G0().mo3559T0(newAttributes), mo20962g0());
    }

    @Override // p142hi.AbstractC7217a0
    /* renamed from: U0 */
    public AbstractC7302o0 mo20945U0() {
        return mo20963G0().mo20945U0();
    }

    @Override // p142hi.AbstractC7217a0
    /* renamed from: X0 */
    public String mo20944X0(AbstractC12485c renderer, InterfaceC12513f options) {
        C9612q.m13917h(renderer, "renderer");
        C9612q.m13917h(options, "options");
        if (options.mo4974e()) {
            return renderer.mo5044w(mo20962g0());
        }
        return mo20963G0().mo20944X0(renderer, options);
    }

    @Override // p142hi.InterfaceC7324t1
    /* renamed from: Y0 */
    public AbstractC7217a0 mo20963G0() {
        return this.f19620m;
    }

    @Override // p142hi.AbstractC7333v1
    /* renamed from: Z0 */
    public C7225c0 mo3560S0(AbstractC7592g kotlinTypeRefiner) {
        C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC7264g0 mo20276h = kotlinTypeRefiner.mo20276h(mo20963G0());
        C9612q.m13919f(mo20276h, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new C7225c0((AbstractC7217a0) mo20276h, kotlinTypeRefiner.mo20276h(mo20962g0()));
    }

    @Override // p142hi.InterfaceC7324t1
    /* renamed from: g0 */
    public AbstractC7264g0 mo20962g0() {
        return this.f19621n;
    }

    @Override // p142hi.AbstractC7217a0
    public String toString() {
        return "[@EnhancedForWarnings(" + mo20962g0() + ")] " + mo20963G0();
    }
}
