package tg;

import ai.C0192g;
import ai.C0208n;
import ai.InterfaceC0194h;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import gi.InterfaceC6815i;
import gi.InterfaceC6821n;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import ng.AbstractC10870h;
import p142hi.AbstractC7253g;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p142hi.C7226c1;
import p142hi.C7267h0;
import p142hi.EnumC7336w1;
import p142hi.InterfaceC7265g1;
import p183ji.C8967k;
import p183ji.EnumC8966j;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11912d1;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11964o;
import p325rg.InterfaceC12155g;
import p429xh.C13801c;
import ph.C11638f;
import th.C12752c;

/* renamed from: tg.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class AbstractC12692e extends AbstractC12710k implements InterfaceC11920f1 {

    /* renamed from: n */
    private final EnumC7336w1 f32915n;

    /* renamed from: o */
    private final boolean f32916o;

    /* renamed from: p */
    private final int f32917p;

    /* renamed from: q */
    private final InterfaceC6815i<InterfaceC7265g1> f32918q;

    /* renamed from: r */
    private final InterfaceC6815i<AbstractC7302o0> f32919r;

    /* renamed from: s */
    private final InterfaceC6821n f32920s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: tg.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public class C12693a implements Function0<InterfaceC7265g1> {

        /* renamed from: j */
        final /* synthetic */ InterfaceC6821n f32921j;

        /* renamed from: k */
        final /* synthetic */ InterfaceC11912d1 f32922k;

        C12693a(InterfaceC6821n interfaceC6821n, InterfaceC11912d1 interfaceC11912d1) {
            AbstractC12692e.this = r1;
            this.f32921j = interfaceC6821n;
            this.f32922k = interfaceC11912d1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public InterfaceC7265g1 invoke() {
            return new C12696c(AbstractC12692e.this, this.f32921j, this.f32922k);
        }
    }

    /* renamed from: tg.e$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public class C12694b implements Function0<AbstractC7302o0> {

        /* renamed from: j */
        final /* synthetic */ C11638f f32924j;

        /* renamed from: tg.e$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public class C12695a implements Function0<InterfaceC0194h> {
            C12695a() {
                C12694b.this = r1;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public InterfaceC0194h invoke() {
                return C0208n.m40955j("Scope for type parameter " + C12694b.this.f32924j.m7426b(), AbstractC12692e.this.getUpperBounds());
            }
        }

        C12694b(C11638f c11638f) {
            AbstractC12692e.this = r1;
            this.f32924j = c11638f;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public AbstractC7302o0 invoke() {
            return C7267h0.m21097k(C7226c1.f19622k.m21197h(), AbstractC12692e.this.mo4173k(), Collections.emptyList(), false, new C0192g(new C12695a()));
        }
    }

    /* renamed from: tg.e$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public class C12696c extends AbstractC7253g {

        /* renamed from: d */
        private final InterfaceC11912d1 f32927d;

        /* renamed from: e */
        final /* synthetic */ AbstractC12692e f32928e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12696c(AbstractC12692e abstractC12692e, InterfaceC6821n interfaceC6821n, InterfaceC11912d1 interfaceC11912d1) {
            super(interfaceC6821n);
            if (interfaceC6821n == null) {
                m4453v(0);
            }
            this.f32928e = abstractC12692e;
            this.f32927d = interfaceC11912d1;
        }

        /* renamed from: v */
        private static /* synthetic */ void m4453v(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? 2 : 3];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i == 2) {
                objArr[1] = "getParameters";
            } else if (i == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 8) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @Override // p142hi.AbstractC7292m
        /* renamed from: e */
        protected boolean mo4459e(InterfaceC11927h interfaceC11927h) {
            if (interfaceC11927h == null) {
                m4453v(9);
            }
            if ((interfaceC11927h instanceof InterfaceC11920f1) && C12752c.f33094a.m4150h(this.f32928e, (InterfaceC11920f1) interfaceC11927h, true)) {
                return true;
            }
            return false;
        }

        @Override // p142hi.InterfaceC7265g1
        public List<InterfaceC11920f1> getParameters() {
            List<InterfaceC11920f1> emptyList = Collections.emptyList();
            if (emptyList == null) {
                m4453v(2);
            }
            return emptyList;
        }

        @Override // p142hi.AbstractC7253g
        /* renamed from: h */
        protected Collection<AbstractC7264g0> mo4458h() {
            List<AbstractC7264g0> mo4405L0 = this.f32928e.mo4405L0();
            if (mo4405L0 == null) {
                m4453v(1);
            }
            return mo4405L0;
        }

        @Override // p142hi.AbstractC7253g
        /* renamed from: i */
        protected AbstractC7264g0 mo4457i() {
            return C8967k.m16945d(EnumC8966j.CYCLIC_UPPER_BOUNDS, new String[0]);
        }

        @Override // p142hi.AbstractC7253g
        /* renamed from: l */
        protected InterfaceC11912d1 mo4456l() {
            InterfaceC11912d1 interfaceC11912d1 = this.f32927d;
            if (interfaceC11912d1 == null) {
                m4453v(5);
            }
            return interfaceC11912d1;
        }

        @Override // p142hi.InterfaceC7265g1
        /* renamed from: n */
        public AbstractC10870h mo2790n() {
            AbstractC10870h m1505j = C13801c.m1505j(this.f32928e);
            if (m1505j == null) {
                m4453v(4);
            }
            return m1505j;
        }

        @Override // p142hi.AbstractC7292m, p142hi.InterfaceC7265g1
        /* renamed from: p */
        public InterfaceC11927h mo2788p() {
            AbstractC12692e abstractC12692e = this.f32928e;
            if (abstractC12692e == null) {
                m4453v(3);
            }
            return abstractC12692e;
        }

        @Override // p142hi.InterfaceC7265g1
        /* renamed from: q */
        public boolean mo2787q() {
            return true;
        }

        @Override // p142hi.AbstractC7253g
        /* renamed from: s */
        protected List<AbstractC7264g0> mo4455s(List<AbstractC7264g0> list) {
            if (list == null) {
                m4453v(7);
            }
            List<AbstractC7264g0> mo4468G0 = this.f32928e.mo4468G0(list);
            if (mo4468G0 == null) {
                m4453v(8);
            }
            return mo4468G0;
        }

        public String toString() {
            return this.f32928e.getName().toString();
        }

        @Override // p142hi.AbstractC7253g
        /* renamed from: u */
        protected void mo4454u(AbstractC7264g0 abstractC7264g0) {
            if (abstractC7264g0 == null) {
                m4453v(6);
            }
            this.f32928e.mo4406K0(abstractC7264g0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12692e(InterfaceC6821n interfaceC6821n, InterfaceC11947m interfaceC11947m, InterfaceC12155g interfaceC12155g, C11638f c11638f, EnumC7336w1 enumC7336w1, boolean z, int i, InterfaceC11900a1 interfaceC11900a1, InterfaceC11912d1 interfaceC11912d1) {
        super(interfaceC11947m, interfaceC12155g, c11638f, interfaceC11900a1);
        if (interfaceC6821n == null) {
            m4465g0(0);
        }
        if (interfaceC11947m == null) {
            m4465g0(1);
        }
        if (interfaceC12155g == null) {
            m4465g0(2);
        }
        if (c11638f == null) {
            m4465g0(3);
        }
        if (enumC7336w1 == null) {
            m4465g0(4);
        }
        if (interfaceC11900a1 == null) {
            m4465g0(5);
        }
        if (interfaceC11912d1 == null) {
            m4465g0(6);
        }
        this.f32915n = enumC7336w1;
        this.f32916o = z;
        this.f32917p = i;
        this.f32918q = interfaceC6821n.mo21867c(new C12693a(interfaceC6821n, interfaceC11912d1));
        this.f32919r = interfaceC6821n.mo21867c(new C12694b(c11638f));
        this.f32920s = interfaceC6821n;
    }

    /* renamed from: g0 */
    private static /* synthetic */ void m4465g0(int i) {
        String str;
        int i2;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i2 = 2;
                break;
            case 12:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = ZeroconfModule.KEY_SERVICE_NAME;
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    /* renamed from: G0 */
    protected List<AbstractC7264g0> mo4468G0(List<AbstractC7264g0> list) {
        if (list == null) {
            m4465g0(12);
        }
        if (list == null) {
            m4465g0(13);
        }
        return list;
    }

    @Override // p305qg.InterfaceC11920f1
    /* renamed from: J */
    public InterfaceC6821n mo4467J() {
        InterfaceC6821n interfaceC6821n = this.f32920s;
        if (interfaceC6821n == null) {
            m4465g0(14);
        }
        return interfaceC6821n;
    }

    /* renamed from: K0 */
    protected abstract void mo4406K0(AbstractC7264g0 abstractC7264g0);

    /* renamed from: L0 */
    protected abstract List<AbstractC7264g0> mo4405L0();

    @Override // p305qg.InterfaceC11920f1
    /* renamed from: O */
    public boolean mo4466O() {
        return false;
    }

    @Override // p305qg.InterfaceC11947m
    /* renamed from: d0 */
    public <R, D> R mo4162d0(InterfaceC11964o<R, D> interfaceC11964o, D d) {
        return interfaceC11964o.mo4385j(this, d);
    }

    @Override // p305qg.InterfaceC11920f1
    public int getIndex() {
        return this.f32917p;
    }

    @Override // p305qg.InterfaceC11920f1
    public List<AbstractC7264g0> getUpperBounds() {
        List<AbstractC7264g0> mo2791m = ((C12696c) mo4173k()).mo2791m();
        if (mo2791m == null) {
            m4465g0(8);
        }
        return mo2791m;
    }

    @Override // p305qg.InterfaceC11920f1, p305qg.InterfaceC11927h
    /* renamed from: k */
    public final InterfaceC7265g1 mo4173k() {
        InterfaceC7265g1 invoke = this.f32918q.invoke();
        if (invoke == null) {
            m4465g0(9);
        }
        return invoke;
    }

    @Override // p305qg.InterfaceC11920f1
    /* renamed from: m */
    public EnumC7336w1 mo4464m() {
        EnumC7336w1 enumC7336w1 = this.f32915n;
        if (enumC7336w1 == null) {
            m4465g0(7);
        }
        return enumC7336w1;
    }

    @Override // p305qg.InterfaceC11927h
    /* renamed from: p */
    public AbstractC7302o0 mo4224p() {
        AbstractC7302o0 invoke = this.f32919r.invoke();
        if (invoke == null) {
            m4465g0(10);
        }
        return invoke;
    }

    @Override // p305qg.InterfaceC11920f1
    /* renamed from: x */
    public boolean mo4463x() {
        return this.f32916o;
    }

    @Override // tg.AbstractC12710k, tg.AbstractC12706j, p305qg.InterfaceC11947m
    /* renamed from: a */
    public InterfaceC11920f1 mo4221a() {
        InterfaceC11920f1 interfaceC11920f1 = (InterfaceC11920f1) super.mo4221a();
        if (interfaceC11920f1 == null) {
            m4465g0(11);
        }
        return interfaceC11920f1;
    }
}