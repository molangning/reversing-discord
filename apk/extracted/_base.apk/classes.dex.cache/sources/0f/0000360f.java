package p141hh;

import kotlin.jvm.internal.C9612q;
import p142hi.AbstractC7217a0;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p142hi.AbstractC7315r;
import p142hi.AbstractC7333v1;
import p142hi.C7226c1;
import p142hi.C7267h0;
import p142hi.C7320s1;
import p142hi.C7329u1;
import p142hi.InterfaceC7290l0;
import p234mi.C10472a;

/* renamed from: hh.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C7167g extends AbstractC7315r implements InterfaceC7290l0 {

    /* renamed from: k */
    private final AbstractC7302o0 f19539k;

    public C7167g(AbstractC7302o0 delegate) {
        C9612q.m13917h(delegate, "delegate");
        this.f19539k = delegate;
    }

    /* renamed from: Z0 */
    private final AbstractC7302o0 m21327Z0(AbstractC7302o0 abstractC7302o0) {
        AbstractC7302o0 mo3558U0 = abstractC7302o0.mo3558U0(false);
        if (!C10472a.m11440r(abstractC7302o0)) {
            return mo3558U0;
        }
        return new C7167g(mo3558U0);
    }

    @Override // p142hi.InterfaceC7295n
    /* renamed from: E0 */
    public boolean mo21041E0() {
        return true;
    }

    @Override // p142hi.AbstractC7315r, p142hi.AbstractC7264g0
    /* renamed from: O0 */
    public boolean mo3563O0() {
        return false;
    }

    @Override // p142hi.AbstractC7333v1
    /* renamed from: U0 */
    public AbstractC7302o0 mo3561R0(boolean z) {
        return z ? mo20971W0().mo3558U0(true) : this;
    }

    @Override // p142hi.AbstractC7315r
    /* renamed from: W0 */
    protected AbstractC7302o0 mo20971W0() {
        return this.f19539k;
    }

    @Override // p142hi.AbstractC7302o0
    /* renamed from: a1 */
    public C7167g mo3557V0(C7226c1 newAttributes) {
        C9612q.m13917h(newAttributes, "newAttributes");
        return new C7167g(mo20971W0().mo3557V0(newAttributes));
    }

    @Override // p142hi.AbstractC7315r
    /* renamed from: b1 */
    public C7167g mo20969Y0(AbstractC7302o0 delegate) {
        C9612q.m13917h(delegate, "delegate");
        return new C7167g(delegate);
    }

    @Override // p142hi.InterfaceC7295n
    /* renamed from: r0 */
    public AbstractC7264g0 mo21038r0(AbstractC7264g0 replacement) {
        C9612q.m13917h(replacement, "replacement");
        AbstractC7333v1 mo20916Q0 = replacement.mo20916Q0();
        if (!C10472a.m11440r(mo20916Q0) && !C7320s1.m20983l(mo20916Q0)) {
            return mo20916Q0;
        }
        if (mo20916Q0 instanceof AbstractC7302o0) {
            return m21327Z0((AbstractC7302o0) mo20916Q0);
        }
        if (mo20916Q0 instanceof AbstractC7217a0) {
            AbstractC7217a0 abstractC7217a0 = (AbstractC7217a0) mo20916Q0;
            return C7329u1.m20946d(C7267h0.m21104d(m21327Z0(abstractC7217a0.m21218V0()), m21327Z0(abstractC7217a0.m21217W0())), C7329u1.m20949a(mo20916Q0));
        }
        throw new IllegalStateException(("Incorrect type: " + mo20916Q0).toString());
    }
}