package p142hi;

import ai.InterfaceC0194h;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import li.InterfaceC10200i;
import p161ii.AbstractC7592g;
import p161ii.C7609r;
import p325rg.InterfaceC12147a;
import p325rg.InterfaceC12155g;

/* renamed from: hi.g0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC7264g0 implements InterfaceC12147a, InterfaceC10200i {

    /* renamed from: j */
    private int f19685j;

    private AbstractC7264g0() {
    }

    public /* synthetic */ AbstractC7264g0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: K0 */
    private final int m21108K0() {
        if (C7276i0.m21083a(this)) {
            return super.hashCode();
        }
        return (((mo3564N0().hashCode() * 31) + mo3566L0().hashCode()) * 31) + (mo3563O0() ? 1 : 0);
    }

    /* renamed from: L0 */
    public abstract List<InterfaceC7288k1> mo3566L0();

    /* renamed from: M0 */
    public abstract C7226c1 mo3565M0();

    /* renamed from: N0 */
    public abstract InterfaceC7265g1 mo3564N0();

    /* renamed from: O0 */
    public abstract boolean mo3563O0();

    /* renamed from: P0 */
    public abstract AbstractC7264g0 mo3562P0(AbstractC7592g abstractC7592g);

    /* renamed from: Q0 */
    public abstract AbstractC7333v1 mo20916Q0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC7264g0)) {
            return false;
        }
        AbstractC7264g0 abstractC7264g0 = (AbstractC7264g0) obj;
        if (mo3563O0() == abstractC7264g0.mo3563O0() && C7609r.f20909a.m20246a(mo20916Q0(), abstractC7264g0.mo20916Q0())) {
            return true;
        }
        return false;
    }

    @Override // p325rg.InterfaceC12147a
    public InterfaceC12155g getAnnotations() {
        return C7286k.m21059a(mo3565M0());
    }

    public final int hashCode() {
        int i = this.f19685j;
        if (i != 0) {
            return i;
        }
        int m21108K0 = m21108K0();
        this.f19685j = m21108K0;
        return m21108K0;
    }

    /* renamed from: o */
    public abstract InterfaceC0194h mo3553o();
}
