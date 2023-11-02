package tg;

import ai.C0191f;
import ai.C0205m;
import ai.InterfaceC0194h;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import gi.InterfaceC6815i;
import gi.InterfaceC6821n;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import p142hi.AbstractC7297n1;
import p142hi.AbstractC7302o0;
import p142hi.C7267h0;
import p142hi.C7307p1;
import p142hi.C7320s1;
import p161ii.AbstractC7592g;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11917e1;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11964o;
import p305qg.InterfaceC11997x0;
import p429xh.C13801c;
import ph.C11638f;
import th.C12758e;

/* renamed from: tg.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class AbstractC12674a extends AbstractC12739t {

    /* renamed from: k */
    private final C11638f f32854k;

    /* renamed from: l */
    protected final InterfaceC6815i<AbstractC7302o0> f32855l;

    /* renamed from: m */
    private final InterfaceC6815i<InterfaceC0194h> f32856m;

    /* renamed from: n */
    private final InterfaceC6815i<InterfaceC11997x0> f32857n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: tg.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public class C12675a implements Function0<AbstractC7302o0> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: tg.a$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public class C12676a implements Function1<AbstractC7592g, AbstractC7302o0> {
            C12676a() {
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public AbstractC7302o0 invoke(AbstractC7592g abstractC7592g) {
                InterfaceC11927h mo20278f = abstractC7592g.mo20278f(AbstractC12674a.this);
                if (mo20278f == null) {
                    return AbstractC12674a.this.f32855l.invoke();
                }
                if (mo20278f instanceof InterfaceC11917e1) {
                    return C7267h0.m21106b((InterfaceC11917e1) mo20278f, C7320s1.m20988g(mo20278f.mo4173k().getParameters()));
                }
                if (mo20278f instanceof AbstractC12739t) {
                    return C7320s1.m20974u(mo20278f.mo4173k().mo2789o(abstractC7592g), ((AbstractC12739t) mo20278f).mo4166r0(abstractC7592g), this);
                }
                return mo20278f.mo4224p();
            }
        }

        C12675a() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public AbstractC7302o0 invoke() {
            AbstractC12674a abstractC12674a = AbstractC12674a.this;
            return C7320s1.m20973v(abstractC12674a, abstractC12674a.mo4227T(), new C12676a());
        }
    }

    /* renamed from: tg.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    class C12677b implements Function0<InterfaceC0194h> {
        C12677b() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public InterfaceC0194h invoke() {
            return new C0191f(AbstractC12674a.this.mo4227T());
        }
    }

    /* renamed from: tg.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    class C12678c implements Function0<InterfaceC11997x0> {
        C12678c() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public InterfaceC11997x0 invoke() {
            return new C12731q(AbstractC12674a.this);
        }
    }

    public AbstractC12674a(InterfaceC6821n interfaceC6821n, C11638f c11638f) {
        if (interfaceC6821n == null) {
            m4550E0(0);
        }
        if (c11638f == null) {
            m4550E0(1);
        }
        this.f32854k = c11638f;
        this.f32855l = interfaceC6821n.mo21867c(new C12675a());
        this.f32856m = interfaceC6821n.mo21867c(new C12677b());
        this.f32857n = interfaceC6821n.mo21867c(new C12678c());
    }

    /* renamed from: E0 */
    private static /* synthetic */ void m4550E0(int i) {
        String str = (i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = ZeroconfModule.KEY_SERVICE_NAME;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i == 9 || i == 12 || i == 14 || i == 16) {
            objArr[1] = "getMemberScope";
        } else if (i == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i == 19) {
            objArr[1] = "substitute";
        } else if (i != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 9 && i != 12 && i != 14 && i != 16 && i != 17 && i != 19 && i != 20) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // p305qg.InterfaceC11909c1
    /* renamed from: G0 */
    public InterfaceC11914e mo4225c(C7307p1 c7307p1) {
        if (c7307p1 == null) {
            m4550E0(18);
        }
        if (c7307p1.m21023k()) {
            return this;
        }
        return new C12736s(this, c7307p1);
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: J0 */
    public InterfaceC11997x0 mo4233J0() {
        InterfaceC11997x0 invoke = this.f32857n.invoke();
        if (invoke == null) {
            m4550E0(5);
        }
        return invoke;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: K */
    public InterfaceC0194h mo4232K(AbstractC7297n1 abstractC7297n1) {
        if (abstractC7297n1 == null) {
            m4550E0(15);
        }
        InterfaceC0194h mo4220g0 = mo4220g0(abstractC7297n1, C13801c.m1500o(C12758e.m4105g(this)));
        if (mo4220g0 == null) {
            m4550E0(16);
        }
        return mo4220g0;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: Q */
    public InterfaceC0194h mo4228Q() {
        InterfaceC0194h invoke = this.f32856m.invoke();
        if (invoke == null) {
            m4550E0(4);
        }
        return invoke;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: T */
    public InterfaceC0194h mo4227T() {
        InterfaceC0194h mo4166r0 = mo4166r0(C13801c.m1500o(C12758e.m4105g(this)));
        if (mo4166r0 == null) {
            m4550E0(17);
        }
        return mo4166r0;
    }

    @Override // p305qg.InterfaceC11914e
    /* renamed from: V */
    public List<InterfaceC11997x0> mo4226V() {
        List<InterfaceC11997x0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m4550E0(6);
        }
        return emptyList;
    }

    @Override // tg.AbstractC12739t, p305qg.InterfaceC11947m
    /* renamed from: a */
    public InterfaceC11914e mo4221a() {
        return this;
    }

    @Override // p305qg.InterfaceC11947m
    /* renamed from: d0 */
    public <R, D> R mo4162d0(InterfaceC11964o<R, D> interfaceC11964o, D d) {
        return interfaceC11964o.mo4386i(this, d);
    }

    @Override // tg.AbstractC12739t
    /* renamed from: g0 */
    public InterfaceC0194h mo4220g0(AbstractC7297n1 abstractC7297n1, AbstractC7592g abstractC7592g) {
        if (abstractC7297n1 == null) {
            m4550E0(10);
        }
        if (abstractC7592g == null) {
            m4550E0(11);
        }
        if (abstractC7297n1.mo20959f()) {
            InterfaceC0194h mo4166r0 = mo4166r0(abstractC7592g);
            if (mo4166r0 == null) {
                m4550E0(12);
            }
            return mo4166r0;
        }
        return new C0205m(mo4166r0(abstractC7592g), C7307p1.m21027g(abstractC7297n1));
    }

    @Override // p305qg.InterfaceC11935j0
    public C11638f getName() {
        C11638f c11638f = this.f32854k;
        if (c11638f == null) {
            m4550E0(2);
        }
        return c11638f;
    }

    @Override // p305qg.InterfaceC11914e, p305qg.InterfaceC11927h
    /* renamed from: p */
    public AbstractC7302o0 mo4224p() {
        AbstractC7302o0 invoke = this.f32855l.invoke();
        if (invoke == null) {
            m4550E0(20);
        }
        return invoke;
    }
}
