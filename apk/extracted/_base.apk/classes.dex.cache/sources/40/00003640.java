package p142hi;

import kotlin.jvm.internal.C9612q;
import p161ii.AbstractC7592g;

/* renamed from: hi.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7216a extends AbstractC7315r {

    /* renamed from: k */
    private final AbstractC7302o0 f19612k;

    /* renamed from: l */
    private final AbstractC7302o0 f19613l;

    public C7216a(AbstractC7302o0 delegate, AbstractC7302o0 abbreviation) {
        C9612q.m13917h(delegate, "delegate");
        C9612q.m13917h(abbreviation, "abbreviation");
        this.f19612k = delegate;
        this.f19613l = abbreviation;
    }

    /* renamed from: F */
    public final AbstractC7302o0 m21223F() {
        return mo20971W0();
    }

    @Override // p142hi.AbstractC7333v1
    /* renamed from: V0 */
    public AbstractC7302o0 mo3559T0(C7226c1 newAttributes) {
        C9612q.m13917h(newAttributes, "newAttributes");
        return new C7216a(mo20971W0().mo3557V0(newAttributes), this.f19613l);
    }

    @Override // p142hi.AbstractC7315r
    /* renamed from: W0 */
    protected AbstractC7302o0 mo20971W0() {
        return this.f19612k;
    }

    /* renamed from: Z0 */
    public final AbstractC7302o0 m21222Z0() {
        return this.f19613l;
    }

    @Override // p142hi.AbstractC7302o0
    /* renamed from: a1 */
    public C7216a mo3558U0(boolean z) {
        return new C7216a(mo20971W0().mo3558U0(z), this.f19613l.mo3558U0(z));
    }

    @Override // p142hi.AbstractC7315r
    /* renamed from: b1 */
    public C7216a mo20970X0(AbstractC7592g kotlinTypeRefiner) {
        C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC7264g0 mo20276h = kotlinTypeRefiner.mo20276h(mo20971W0());
        C9612q.m13919f(mo20276h, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        AbstractC7264g0 mo20276h2 = kotlinTypeRefiner.mo20276h(this.f19613l);
        C9612q.m13919f(mo20276h2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C7216a((AbstractC7302o0) mo20276h, (AbstractC7302o0) mo20276h2);
    }

    @Override // p142hi.AbstractC7315r
    /* renamed from: c1 */
    public C7216a mo20969Y0(AbstractC7302o0 delegate) {
        C9612q.m13917h(delegate, "delegate");
        return new C7216a(delegate, this.f19613l);
    }
}