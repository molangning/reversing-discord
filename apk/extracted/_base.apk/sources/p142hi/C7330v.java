package p142hi;

import kotlin.jvm.internal.C9612q;
import li.InterfaceC10197f;
import p161ii.AbstractC7592g;
import p234mi.C10472a;
import sh.AbstractC12485c;
import sh.InterfaceC12513f;

/* renamed from: hi.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7330v extends AbstractC7217a0 implements InterfaceC10197f {

    /* renamed from: m */
    private final C7226c1 f19768m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C7330v(ng.AbstractC10870h r3, p142hi.C7226c1 r4) {
        /*
            r2 = this;
            java.lang.String r0 = "builtIns"
            kotlin.jvm.internal.C9612q.m13917h(r3, r0)
            java.lang.String r0 = "attributes"
            kotlin.jvm.internal.C9612q.m13917h(r4, r0)
            hi.o0 r0 = r3.m9843H()
            java.lang.String r1 = "builtIns.nothingType"
            kotlin.jvm.internal.C9612q.m13918g(r0, r1)
            hi.o0 r3 = r3.m9842I()
            java.lang.String r1 = "builtIns.nullableAnyType"
            kotlin.jvm.internal.C9612q.m13918g(r3, r1)
            r2.<init>(r0, r3)
            r2.f19768m = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p142hi.C7330v.<init>(ng.h, hi.c1):void");
    }

    @Override // p142hi.AbstractC7217a0, p142hi.AbstractC7264g0
    /* renamed from: M0 */
    public C7226c1 mo3565M0() {
        return this.f19768m;
    }

    @Override // p142hi.AbstractC7217a0, p142hi.AbstractC7264g0
    /* renamed from: O0 */
    public boolean mo3563O0() {
        return false;
    }

    @Override // p142hi.AbstractC7217a0
    /* renamed from: U0 */
    public AbstractC7302o0 mo20945U0() {
        return m21217W0();
    }

    @Override // p142hi.AbstractC7217a0
    /* renamed from: X0 */
    public String mo20944X0(AbstractC12485c renderer, InterfaceC12513f options) {
        C9612q.m13917h(renderer, "renderer");
        C9612q.m13917h(options, "options");
        return "dynamic";
    }

    @Override // p142hi.AbstractC7333v1
    /* renamed from: Y0 */
    public C7330v mo3561R0(boolean z) {
        return this;
    }

    @Override // p142hi.AbstractC7333v1
    /* renamed from: Z0 */
    public C7330v mo3560S0(AbstractC7592g kotlinTypeRefiner) {
        C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // p142hi.AbstractC7333v1
    /* renamed from: a1 */
    public C7330v mo3559T0(C7226c1 newAttributes) {
        C9612q.m13917h(newAttributes, "newAttributes");
        return new C7330v(C10472a.m11449i(mo20945U0()), newAttributes);
    }
}
