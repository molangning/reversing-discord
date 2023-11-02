package p142hi;

import kotlin.jvm.internal.C9612q;

/* renamed from: hi.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC7318s extends AbstractC7315r {

    /* renamed from: k */
    private final AbstractC7302o0 f19755k;

    public AbstractC7318s(AbstractC7302o0 delegate) {
        C9612q.m13917h(delegate, "delegate");
        this.f19755k = delegate;
    }

    @Override // p142hi.AbstractC7333v1
    /* renamed from: U0 */
    public AbstractC7302o0 mo3561R0(boolean z) {
        if (z == mo3563O0()) {
            return this;
        }
        return mo20971W0().mo3558U0(z).mo3557V0(mo3565M0());
    }

    @Override // p142hi.AbstractC7333v1
    /* renamed from: V0 */
    public AbstractC7302o0 mo3559T0(C7226c1 newAttributes) {
        C9612q.m13917h(newAttributes, "newAttributes");
        if (newAttributes != mo3565M0()) {
            return new C7313q0(this, newAttributes);
        }
        return this;
    }

    @Override // p142hi.AbstractC7315r
    /* renamed from: W0 */
    protected AbstractC7302o0 mo20971W0() {
        return this.f19755k;
    }
}
