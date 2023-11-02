package p183ji;

import ai.InterfaceC0194h;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9602k0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p142hi.AbstractC7302o0;
import p142hi.C7226c1;
import p142hi.InterfaceC7265g1;
import p142hi.InterfaceC7288k1;
import p161ii.AbstractC7592g;

/* renamed from: ji.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C8964h extends AbstractC7302o0 {

    /* renamed from: k */
    private final InterfaceC7265g1 f23457k;

    /* renamed from: l */
    private final InterfaceC0194h f23458l;

    /* renamed from: m */
    private final EnumC8966j f23459m;

    /* renamed from: n */
    private final List<InterfaceC7288k1> f23460n;

    /* renamed from: o */
    private final boolean f23461o;

    /* renamed from: p */
    private final String[] f23462p;

    /* renamed from: q */
    private final String f23463q;

    public /* synthetic */ C8964h(InterfaceC7265g1 interfaceC7265g1, InterfaceC0194h interfaceC0194h, EnumC8966j enumC8966j, List list, boolean z, String[] strArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC7265g1, interfaceC0194h, enumC8966j, (i & 8) != 0 ? C9545j.m14104i() : list, (i & 16) != 0 ? false : z, strArr);
    }

    @Override // p142hi.AbstractC7264g0
    /* renamed from: L0 */
    public List<InterfaceC7288k1> mo3566L0() {
        return this.f23460n;
    }

    @Override // p142hi.AbstractC7264g0
    /* renamed from: M0 */
    public C7226c1 mo3565M0() {
        return C7226c1.f19622k.m21197h();
    }

    @Override // p142hi.AbstractC7264g0
    /* renamed from: N0 */
    public InterfaceC7265g1 mo3564N0() {
        return this.f23457k;
    }

    @Override // p142hi.AbstractC7264g0
    /* renamed from: O0 */
    public boolean mo3563O0() {
        return this.f23461o;
    }

    @Override // p142hi.AbstractC7333v1
    /* renamed from: U0 */
    public AbstractC7302o0 mo3561R0(boolean z) {
        InterfaceC7265g1 mo3564N0 = mo3564N0();
        InterfaceC0194h mo3553o = mo3553o();
        EnumC8966j enumC8966j = this.f23459m;
        List<InterfaceC7288k1> mo3566L0 = mo3566L0();
        String[] strArr = this.f23462p;
        return new C8964h(mo3564N0, mo3553o, enumC8966j, mo3566L0, z, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // p142hi.AbstractC7333v1
    /* renamed from: V0 */
    public AbstractC7302o0 mo3559T0(C7226c1 newAttributes) {
        C9612q.m13917h(newAttributes, "newAttributes");
        return this;
    }

    /* renamed from: W0 */
    public final String m16956W0() {
        return this.f23463q;
    }

    /* renamed from: X0 */
    public final EnumC8966j m16955X0() {
        return this.f23459m;
    }

    @Override // p142hi.AbstractC7333v1
    /* renamed from: Y0 */
    public C8964h mo3560S0(AbstractC7592g kotlinTypeRefiner) {
        C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // p142hi.AbstractC7264g0
    /* renamed from: o */
    public InterfaceC0194h mo3553o() {
        return this.f23458l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8964h(InterfaceC7265g1 constructor, InterfaceC0194h memberScope, EnumC8966j kind, List<? extends InterfaceC7288k1> arguments, boolean z, String... formatParams) {
        C9612q.m13917h(constructor, "constructor");
        C9612q.m13917h(memberScope, "memberScope");
        C9612q.m13917h(kind, "kind");
        C9612q.m13917h(arguments, "arguments");
        C9612q.m13917h(formatParams, "formatParams");
        this.f23457k = constructor;
        this.f23458l = memberScope;
        this.f23459m = kind;
        this.f23460n = arguments;
        this.f23461o = z;
        this.f23462p = formatParams;
        C9602k0 c9602k0 = C9602k0.f25351a;
        String m16950b = kind.m16950b();
        Object[] copyOf = Arrays.copyOf(formatParams, formatParams.length);
        String format = String.format(m16950b, Arrays.copyOf(copyOf, copyOf.length));
        C9612q.m13918g(format, "format(format, *args)");
        this.f23463q = format;
    }
}