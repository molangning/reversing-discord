package p142hi;

import ai.InterfaceC0194h;
import java.util.List;
import kotlin.jvm.internal.C9612q;

/* renamed from: hi.x1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC7340x1 extends AbstractC7264g0 {
    public AbstractC7340x1() {
        super(null);
    }

    @Override // p142hi.AbstractC7264g0
    /* renamed from: L0 */
    public List<InterfaceC7288k1> mo3566L0() {
        return mo20915R0().mo3566L0();
    }

    @Override // p142hi.AbstractC7264g0
    /* renamed from: M0 */
    public C7226c1 mo3565M0() {
        return mo20915R0().mo3565M0();
    }

    @Override // p142hi.AbstractC7264g0
    /* renamed from: N0 */
    public InterfaceC7265g1 mo3564N0() {
        return mo20915R0().mo3564N0();
    }

    @Override // p142hi.AbstractC7264g0
    /* renamed from: O0 */
    public boolean mo3563O0() {
        return mo20915R0().mo3563O0();
    }

    @Override // p142hi.AbstractC7264g0
    /* renamed from: Q0 */
    public final AbstractC7333v1 mo20916Q0() {
        AbstractC7264g0 mo20915R0 = mo20915R0();
        while (mo20915R0 instanceof AbstractC7340x1) {
            mo20915R0 = ((AbstractC7340x1) mo20915R0).mo20915R0();
        }
        C9612q.m13919f(mo20915R0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (AbstractC7333v1) mo20915R0;
    }

    /* renamed from: R0 */
    protected abstract AbstractC7264g0 mo20915R0();

    /* renamed from: S0 */
    public boolean mo20914S0() {
        return true;
    }

    @Override // p142hi.AbstractC7264g0
    /* renamed from: o */
    public InterfaceC0194h mo3553o() {
        return mo20915R0().mo3553o();
    }

    public String toString() {
        if (mo20914S0()) {
            return mo20915R0().toString();
        }
        return "<Not computed yet>";
    }
}
