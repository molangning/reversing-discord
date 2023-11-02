package p142hi;

import ai.InterfaceC0194h;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import p161ii.AbstractC7592g;
import p183ji.C8962f;
import p183ji.C8968l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: hi.p0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7306p0 extends AbstractC7302o0 {

    /* renamed from: k */
    private final InterfaceC7265g1 f19736k;

    /* renamed from: l */
    private final List<InterfaceC7288k1> f19737l;

    /* renamed from: m */
    private final boolean f19738m;

    /* renamed from: n */
    private final InterfaceC0194h f19739n;

    /* renamed from: o */
    private final Function1<AbstractC7592g, AbstractC7302o0> f19740o;

    /* JADX WARN: Multi-variable type inference failed */
    public C7306p0(InterfaceC7265g1 constructor, List<? extends InterfaceC7288k1> arguments, boolean z, InterfaceC0194h memberScope, Function1<? super AbstractC7592g, ? extends AbstractC7302o0> refinedTypeFactory) {
        C9612q.m13917h(constructor, "constructor");
        C9612q.m13917h(arguments, "arguments");
        C9612q.m13917h(memberScope, "memberScope");
        C9612q.m13917h(refinedTypeFactory, "refinedTypeFactory");
        this.f19736k = constructor;
        this.f19737l = arguments;
        this.f19738m = z;
        this.f19739n = memberScope;
        this.f19740o = refinedTypeFactory;
        if ((mo3553o() instanceof C8962f) && !(mo3553o() instanceof C8968l)) {
            throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + mo3553o() + '\n' + mo3564N0());
        }
    }

    @Override // p142hi.AbstractC7264g0
    /* renamed from: L0 */
    public List<InterfaceC7288k1> mo3566L0() {
        return this.f19737l;
    }

    @Override // p142hi.AbstractC7264g0
    /* renamed from: M0 */
    public C7226c1 mo3565M0() {
        return C7226c1.f19622k.m21197h();
    }

    @Override // p142hi.AbstractC7264g0
    /* renamed from: N0 */
    public InterfaceC7265g1 mo3564N0() {
        return this.f19736k;
    }

    @Override // p142hi.AbstractC7264g0
    /* renamed from: O0 */
    public boolean mo3563O0() {
        return this.f19738m;
    }

    @Override // p142hi.AbstractC7333v1
    /* renamed from: U0 */
    public AbstractC7302o0 mo3561R0(boolean z) {
        if (z == mo3563O0()) {
            return this;
        }
        if (z) {
            return new C7293m0(this);
        }
        return new C7287k0(this);
    }

    @Override // p142hi.AbstractC7333v1
    /* renamed from: V0 */
    public AbstractC7302o0 mo3559T0(C7226c1 newAttributes) {
        C9612q.m13917h(newAttributes, "newAttributes");
        if (newAttributes.isEmpty()) {
            return this;
        }
        return new C7313q0(this, newAttributes);
    }

    @Override // p142hi.AbstractC7333v1
    /* renamed from: W0 */
    public AbstractC7302o0 mo3560S0(AbstractC7592g kotlinTypeRefiner) {
        C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC7302o0 invoke = this.f19740o.invoke(kotlinTypeRefiner);
        if (invoke == null) {
            return this;
        }
        return invoke;
    }

    @Override // p142hi.AbstractC7264g0
    /* renamed from: o */
    public InterfaceC0194h mo3553o() {
        return this.f19739n;
    }
}
