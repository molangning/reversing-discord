package p142hi;

import kotlin.jvm.internal.C9612q;

/* renamed from: hi.q0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7313q0 extends AbstractC7318s {

    /* renamed from: l */
    private final C7226c1 f19749l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7313q0(AbstractC7302o0 delegate, C7226c1 attributes) {
        super(delegate);
        C9612q.m13917h(delegate, "delegate");
        C9612q.m13917h(attributes, "attributes");
        this.f19749l = attributes;
    }

    @Override // p142hi.AbstractC7315r, p142hi.AbstractC7264g0
    /* renamed from: M0 */
    public C7226c1 mo3565M0() {
        return this.f19749l;
    }

    @Override // p142hi.AbstractC7315r
    /* renamed from: Z0 */
    public C7313q0 mo20969Y0(AbstractC7302o0 delegate) {
        C9612q.m13917h(delegate, "delegate");
        return new C7313q0(delegate, mo3565M0());
    }
}