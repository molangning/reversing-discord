package tg;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import gi.InterfaceC6816j;
import kotlin.jvm.functions.Function0;
import p142hi.AbstractC7264g0;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11947m;
import p325rg.InterfaceC12155g;
import p389vh.AbstractC13301g;
import ph.C11638f;

/* renamed from: tg.n0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class AbstractC12725n0 extends AbstractC12718m0 {

    /* renamed from: o */
    private final boolean f32987o;

    /* renamed from: p */
    protected InterfaceC6816j<AbstractC13301g<?>> f32988p;

    /* renamed from: q */
    protected Function0<InterfaceC6816j<AbstractC13301g<?>>> f32989q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12725n0(InterfaceC11947m interfaceC11947m, InterfaceC12155g interfaceC12155g, C11638f c11638f, AbstractC7264g0 abstractC7264g0, boolean z, InterfaceC11900a1 interfaceC11900a1) {
        super(interfaceC11947m, interfaceC12155g, c11638f, abstractC7264g0, interfaceC11900a1);
        if (interfaceC11947m == null) {
            m4340g0(0);
        }
        if (interfaceC12155g == null) {
            m4340g0(1);
        }
        if (c11638f == null) {
            m4340g0(2);
        }
        if (interfaceC11900a1 == null) {
            m4340g0(3);
        }
        this.f32987o = z;
    }

    /* renamed from: g0 */
    private static /* synthetic */ void m4340g0(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "annotations";
        } else if (i == 2) {
            objArr[0] = ZeroconfModule.KEY_SERVICE_NAME;
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: K0 */
    public void m4343K0(InterfaceC6816j<AbstractC13301g<?>> interfaceC6816j, Function0<InterfaceC6816j<AbstractC13301g<?>>> function0) {
        if (function0 == null) {
            m4340g0(5);
        }
        this.f32989q = function0;
        if (interfaceC6816j == null) {
            interfaceC6816j = function0.invoke();
        }
        this.f32988p = interfaceC6816j;
    }

    @Override // p305qg.InterfaceC11943k1
    /* renamed from: L */
    public boolean mo4342L() {
        return this.f32987o;
    }

    /* renamed from: L0 */
    public void m4341L0(Function0<InterfaceC6816j<AbstractC13301g<?>>> function0) {
        if (function0 == null) {
            m4340g0(4);
        }
        m4343K0(null, function0);
    }

    @Override // p305qg.InterfaceC11943k1
    /* renamed from: n0 */
    public AbstractC13301g<?> mo4339n0() {
        InterfaceC6816j<AbstractC13301g<?>> interfaceC6816j = this.f32988p;
        if (interfaceC6816j != null) {
            return interfaceC6816j.invoke();
        }
        return null;
    }
}
