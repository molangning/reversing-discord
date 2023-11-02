package p142hi;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import p161ii.AbstractC7592g;
import p305qg.InterfaceC11920f1;
import pf.C11577n;
import pf.EnumC11580p;

/* renamed from: hi.u0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7327u0 extends AbstractC7291l1 {

    /* renamed from: a */
    private final InterfaceC11920f1 f19765a;

    /* renamed from: b */
    private final Lazy f19766b;

    /* renamed from: hi.u0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C7328a extends AbstractC9614s implements Function0<AbstractC7264g0> {
        C7328a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final AbstractC7264g0 invoke() {
            return C7331v0.m20939b(C7327u0.this.f19765a);
        }
    }

    public C7327u0(InterfaceC11920f1 typeParameter) {
        Lazy m7600b;
        C9612q.m13917h(typeParameter, "typeParameter");
        this.f19765a = typeParameter;
        m7600b = C11577n.m7600b(EnumC11580p.PUBLICATION, new C7328a());
        this.f19766b = m7600b;
    }

    /* renamed from: d */
    private final AbstractC7264g0 m20952d() {
        return (AbstractC7264g0) this.f19766b.getValue();
    }

    @Override // p142hi.InterfaceC7288k1
    /* renamed from: a */
    public boolean mo20955a() {
        return true;
    }

    @Override // p142hi.InterfaceC7288k1
    /* renamed from: b */
    public EnumC7336w1 mo20954b() {
        return EnumC7336w1.OUT_VARIANCE;
    }

    @Override // p142hi.InterfaceC7288k1
    public AbstractC7264g0 getType() {
        return m20952d();
    }

    @Override // p142hi.InterfaceC7288k1
    /* renamed from: o */
    public InterfaceC7288k1 mo20951o(AbstractC7592g kotlinTypeRefiner) {
        C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }
}
