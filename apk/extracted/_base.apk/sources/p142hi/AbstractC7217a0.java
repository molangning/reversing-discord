package p142hi;

import ai.InterfaceC0194h;
import java.util.List;
import kotlin.jvm.internal.C9612q;
import li.InterfaceC10198g;
import sh.AbstractC12485c;
import sh.InterfaceC12513f;

/* renamed from: hi.a0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC7217a0 extends AbstractC7333v1 implements InterfaceC10198g {

    /* renamed from: k */
    private final AbstractC7302o0 f19614k;

    /* renamed from: l */
    private final AbstractC7302o0 f19615l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7217a0(AbstractC7302o0 lowerBound, AbstractC7302o0 upperBound) {
        super(null);
        C9612q.m13917h(lowerBound, "lowerBound");
        C9612q.m13917h(upperBound, "upperBound");
        this.f19614k = lowerBound;
        this.f19615l = upperBound;
    }

    @Override // p142hi.AbstractC7264g0
    /* renamed from: L0 */
    public List<InterfaceC7288k1> mo3566L0() {
        return mo20945U0().mo3566L0();
    }

    @Override // p142hi.AbstractC7264g0
    /* renamed from: M0 */
    public C7226c1 mo3565M0() {
        return mo20945U0().mo3565M0();
    }

    @Override // p142hi.AbstractC7264g0
    /* renamed from: N0 */
    public InterfaceC7265g1 mo3564N0() {
        return mo20945U0().mo3564N0();
    }

    @Override // p142hi.AbstractC7264g0
    /* renamed from: O0 */
    public boolean mo3563O0() {
        return mo20945U0().mo3563O0();
    }

    /* renamed from: U0 */
    public abstract AbstractC7302o0 mo20945U0();

    /* renamed from: V0 */
    public final AbstractC7302o0 m21218V0() {
        return this.f19614k;
    }

    /* renamed from: W0 */
    public final AbstractC7302o0 m21217W0() {
        return this.f19615l;
    }

    /* renamed from: X0 */
    public abstract String mo20944X0(AbstractC12485c abstractC12485c, InterfaceC12513f interfaceC12513f);

    @Override // p142hi.AbstractC7264g0
    /* renamed from: o */
    public InterfaceC0194h mo3553o() {
        return mo20945U0().mo3553o();
    }

    public String toString() {
        return AbstractC12485c.f32444j.mo5044w(this);
    }
}
