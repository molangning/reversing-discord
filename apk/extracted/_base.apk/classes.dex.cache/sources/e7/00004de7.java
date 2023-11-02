package tg;

import bi.C2312d;
import bi.InterfaceC2314f;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function0;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7297n1;
import p142hi.C7307p1;
import p142hi.C7322t;
import p142hi.EnumC7336w1;
import p305qg.AbstractC11988u;
import p305qg.C11974t;
import p305qg.EnumC11915e0;
import p305qg.InterfaceC11897a;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11936j1;
import p305qg.InterfaceC11943k1;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11964o;
import p305qg.InterfaceC11997x0;
import p305qg.InterfaceC11998y;
import p325rg.C12160i;
import p325rg.InterfaceC12155g;
import p327ri.C12258e;
import ph.C11638f;
import tg.C12713l0;
import th.C12756d;

/* renamed from: tg.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class AbstractC12727p extends AbstractC12710k implements InterfaceC11998y {

    /* renamed from: A */
    private boolean f32991A;

    /* renamed from: B */
    private boolean f32992B;

    /* renamed from: C */
    private boolean f32993C;

    /* renamed from: D */
    private boolean f32994D;

    /* renamed from: E */
    private boolean f32995E;

    /* renamed from: F */
    private boolean f32996F;

    /* renamed from: G */
    private boolean f32997G;

    /* renamed from: H */
    private Collection<? extends InterfaceC11998y> f32998H;

    /* renamed from: I */
    private volatile Function0<Collection<InterfaceC11998y>> f32999I;

    /* renamed from: J */
    private final InterfaceC11998y f33000J;

    /* renamed from: K */
    private final InterfaceC11902b.EnumC11903a f33001K;

    /* renamed from: L */
    private InterfaceC11998y f33002L;

    /* renamed from: M */
    protected Map<InterfaceC11897a.InterfaceC11898a<?>, Object> f33003M;

    /* renamed from: n */
    private List<InterfaceC11920f1> f33004n;

    /* renamed from: o */
    private List<InterfaceC11936j1> f33005o;

    /* renamed from: p */
    private AbstractC7264g0 f33006p;

    /* renamed from: q */
    private List<InterfaceC11997x0> f33007q;

    /* renamed from: r */
    private InterfaceC11997x0 f33008r;

    /* renamed from: s */
    private InterfaceC11997x0 f33009s;

    /* renamed from: t */
    private EnumC11915e0 f33010t;

    /* renamed from: u */
    private AbstractC11988u f33011u;

    /* renamed from: v */
    private boolean f33012v;

    /* renamed from: w */
    private boolean f33013w;

    /* renamed from: x */
    private boolean f33014x;

    /* renamed from: y */
    private boolean f33015y;

    /* renamed from: z */
    private boolean f33016z;

    /* renamed from: tg.p$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public class C12728a implements Function0<Collection<InterfaceC11998y>> {

        /* renamed from: j */
        final /* synthetic */ C7307p1 f33017j;

        C12728a(C7307p1 c7307p1) {
            AbstractC12727p.this = r1;
            this.f33017j = c7307p1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public Collection<InterfaceC11998y> invoke() {
            C12258e c12258e = new C12258e();
            for (InterfaceC11998y interfaceC11998y : AbstractC12727p.this.mo4310d()) {
                c12258e.add(interfaceC11998y.mo4225c(this.f33017j));
            }
            return c12258e;
        }
    }

    /* renamed from: tg.p$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static class C12729b implements Function0<List<InterfaceC11943k1>> {

        /* renamed from: j */
        final /* synthetic */ List f33019j;

        C12729b(List list) {
            this.f33019j = list;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public List<InterfaceC11943k1> invoke() {
            return this.f33019j;
        }
    }

    /* renamed from: tg.p$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public class C12730c implements InterfaceC11998y.InterfaceC11999a<InterfaceC11998y> {

        /* renamed from: a */
        protected AbstractC7297n1 f33020a;

        /* renamed from: b */
        protected InterfaceC11947m f33021b;

        /* renamed from: c */
        protected EnumC11915e0 f33022c;

        /* renamed from: d */
        protected AbstractC11988u f33023d;

        /* renamed from: e */
        protected InterfaceC11998y f33024e;

        /* renamed from: f */
        protected InterfaceC11902b.EnumC11903a f33025f;

        /* renamed from: g */
        protected List<InterfaceC11936j1> f33026g;

        /* renamed from: h */
        protected List<InterfaceC11997x0> f33027h;

        /* renamed from: i */
        protected InterfaceC11997x0 f33028i;

        /* renamed from: j */
        protected InterfaceC11997x0 f33029j;

        /* renamed from: k */
        protected AbstractC7264g0 f33030k;

        /* renamed from: l */
        protected C11638f f33031l;

        /* renamed from: m */
        protected boolean f33032m;

        /* renamed from: n */
        protected boolean f33033n;

        /* renamed from: o */
        protected boolean f33034o;

        /* renamed from: p */
        protected boolean f33035p;

        /* renamed from: q */
        private boolean f33036q;

        /* renamed from: r */
        private List<InterfaceC11920f1> f33037r;

        /* renamed from: s */
        private InterfaceC12155g f33038s;

        /* renamed from: t */
        private boolean f33039t;

        /* renamed from: u */
        private Map<InterfaceC11897a.InterfaceC11898a<?>, Object> f33040u;

        /* renamed from: v */
        private Boolean f33041v;

        /* renamed from: w */
        protected boolean f33042w;

        /* renamed from: x */
        final /* synthetic */ AbstractC12727p f33043x;

        public C12730c(AbstractC12727p abstractC12727p, AbstractC7297n1 abstractC7297n1, InterfaceC11947m interfaceC11947m, EnumC11915e0 enumC11915e0, AbstractC11988u abstractC11988u, InterfaceC11902b.EnumC11903a enumC11903a, List<InterfaceC11936j1> list, List<InterfaceC11997x0> list2, InterfaceC11997x0 interfaceC11997x0, AbstractC7264g0 abstractC7264g0, C11638f c11638f) {
            if (abstractC7297n1 == null) {
                m4250u(0);
            }
            if (interfaceC11947m == null) {
                m4250u(1);
            }
            if (enumC11915e0 == null) {
                m4250u(2);
            }
            if (abstractC11988u == null) {
                m4250u(3);
            }
            if (enumC11903a == null) {
                m4250u(4);
            }
            if (list == null) {
                m4250u(5);
            }
            if (list2 == null) {
                m4250u(6);
            }
            if (abstractC7264g0 == null) {
                m4250u(7);
            }
            this.f33043x = abstractC12727p;
            this.f33024e = null;
            this.f33029j = abstractC12727p.f33009s;
            this.f33032m = true;
            this.f33033n = false;
            this.f33034o = false;
            this.f33035p = false;
            this.f33036q = abstractC12727p.mo4337C0();
            this.f33037r = null;
            this.f33038s = null;
            this.f33039t = abstractC12727p.mo4334F0();
            this.f33040u = new LinkedHashMap();
            this.f33041v = null;
            this.f33042w = false;
            this.f33020a = abstractC7297n1;
            this.f33021b = interfaceC11947m;
            this.f33022c = enumC11915e0;
            this.f33023d = abstractC11988u;
            this.f33025f = enumC11903a;
            this.f33026g = list;
            this.f33027h = list2;
            this.f33028i = interfaceC11997x0;
            this.f33030k = abstractC7264g0;
            this.f33031l = c11638f;
        }

        /* renamed from: u */
        private static /* synthetic */ void m4250u(int i) {
            String str;
            int i2;
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    i2 = 2;
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    i2 = 3;
                    break;
            }
            Object[] objArr = new Object[i2];
            switch (i) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 14:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newContextReceiverParameters";
                    break;
                case 7:
                    objArr[0] = "newReturnType";
                    break;
                case 8:
                    objArr[0] = "owner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 10:
                    objArr[0] = "modality";
                    break;
                case 12:
                    objArr[0] = "visibility";
                    break;
                case 17:
                    objArr[0] = ZeroconfModule.KEY_SERVICE_NAME;
                    break;
                case 19:
                case 21:
                    objArr[0] = "parameters";
                    break;
                case 23:
                    objArr[0] = "type";
                    break;
                case 25:
                    objArr[0] = "contextReceiverParameters";
                    break;
                case 35:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 37:
                default:
                    objArr[0] = "substitution";
                    break;
                case 39:
                    objArr[0] = "userDataKey";
                    break;
            }
            switch (i) {
                case 9:
                    objArr[1] = "setOwner";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 11:
                    objArr[1] = "setModality";
                    break;
                case 13:
                    objArr[1] = "setVisibility";
                    break;
                case 15:
                    objArr[1] = "setKind";
                    break;
                case 16:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 18:
                    objArr[1] = "setName";
                    break;
                case 20:
                    objArr[1] = "setValueParameters";
                    break;
                case 22:
                    objArr[1] = "setTypeParameters";
                    break;
                case 24:
                    objArr[1] = "setReturnType";
                    break;
                case 26:
                    objArr[1] = "setContextReceiverParameters";
                    break;
                case 27:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 28:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 29:
                    objArr[1] = "setOriginal";
                    break;
                case 30:
                    objArr[1] = "setSignatureChange";
                    break;
                case 31:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 32:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 33:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 34:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 36:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 38:
                    objArr[1] = "setSubstitution";
                    break;
                case 40:
                    objArr[1] = "putUserData";
                    break;
                case 41:
                    objArr[1] = "getSubstitution";
                    break;
                case 42:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
            }
            switch (i) {
                case 8:
                    objArr[2] = "setOwner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    break;
                case 10:
                    objArr[2] = "setModality";
                    break;
                case 12:
                    objArr[2] = "setVisibility";
                    break;
                case 14:
                    objArr[2] = "setKind";
                    break;
                case 17:
                    objArr[2] = "setName";
                    break;
                case 19:
                    objArr[2] = "setValueParameters";
                    break;
                case 21:
                    objArr[2] = "setTypeParameters";
                    break;
                case 23:
                    objArr[2] = "setReturnType";
                    break;
                case 25:
                    objArr[2] = "setContextReceiverParameters";
                    break;
                case 35:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 37:
                    objArr[2] = "setSubstitution";
                    break;
                case 39:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    throw new IllegalStateException(format);
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    throw new IllegalArgumentException(format);
            }
        }

        @Override // p305qg.InterfaceC11998y.InterfaceC11999a
        /* renamed from: B */
        public C12730c mo4255p(InterfaceC12155g interfaceC12155g) {
            if (interfaceC12155g == null) {
                m4250u(35);
            }
            this.f33038s = interfaceC12155g;
            return this;
        }

        @Override // p305qg.InterfaceC11998y.InterfaceC11999a
        /* renamed from: C */
        public C12730c mo4258m(boolean z) {
            this.f33032m = z;
            return this;
        }

        @Override // p305qg.InterfaceC11998y.InterfaceC11999a
        /* renamed from: D */
        public C12730c mo4262i(InterfaceC11997x0 interfaceC11997x0) {
            this.f33029j = interfaceC11997x0;
            return this;
        }

        @Override // p305qg.InterfaceC11998y.InterfaceC11999a
        /* renamed from: E */
        public C12730c mo4270a() {
            this.f33035p = true;
            return this;
        }

        @Override // p305qg.InterfaceC11998y.InterfaceC11999a
        /* renamed from: F */
        public C12730c mo4260k(InterfaceC11997x0 interfaceC11997x0) {
            this.f33028i = interfaceC11997x0;
            return this;
        }

        /* renamed from: G */
        public C12730c m4286G(boolean z) {
            this.f33041v = Boolean.valueOf(z);
            return this;
        }

        @Override // p305qg.InterfaceC11998y.InterfaceC11999a
        /* renamed from: H */
        public C12730c mo4265f() {
            this.f33039t = true;
            return this;
        }

        @Override // p305qg.InterfaceC11998y.InterfaceC11999a
        /* renamed from: I */
        public C12730c mo4263h() {
            this.f33036q = true;
            return this;
        }

        /* renamed from: J */
        public C12730c m4283J(boolean z) {
            this.f33042w = z;
            return this;
        }

        @Override // p305qg.InterfaceC11998y.InterfaceC11999a
        /* renamed from: K */
        public C12730c mo4253r(InterfaceC11902b.EnumC11903a enumC11903a) {
            if (enumC11903a == null) {
                m4250u(14);
            }
            this.f33025f = enumC11903a;
            return this;
        }

        @Override // p305qg.InterfaceC11998y.InterfaceC11999a
        /* renamed from: L */
        public C12730c mo4252s(EnumC11915e0 enumC11915e0) {
            if (enumC11915e0 == null) {
                m4250u(10);
            }
            this.f33022c = enumC11915e0;
            return this;
        }

        @Override // p305qg.InterfaceC11998y.InterfaceC11999a
        /* renamed from: M */
        public C12730c mo4267d(C11638f c11638f) {
            if (c11638f == null) {
                m4250u(17);
            }
            this.f33031l = c11638f;
            return this;
        }

        @Override // p305qg.InterfaceC11998y.InterfaceC11999a
        /* renamed from: N */
        public C12730c mo4268c(InterfaceC11902b interfaceC11902b) {
            this.f33024e = (InterfaceC11998y) interfaceC11902b;
            return this;
        }

        @Override // p305qg.InterfaceC11998y.InterfaceC11999a
        /* renamed from: O */
        public C12730c mo4266e(InterfaceC11947m interfaceC11947m) {
            if (interfaceC11947m == null) {
                m4250u(8);
            }
            this.f33021b = interfaceC11947m;
            return this;
        }

        @Override // p305qg.InterfaceC11998y.InterfaceC11999a
        /* renamed from: P */
        public C12730c mo4261j() {
            this.f33034o = true;
            return this;
        }

        @Override // p305qg.InterfaceC11998y.InterfaceC11999a
        /* renamed from: Q */
        public C12730c mo4259l(AbstractC7264g0 abstractC7264g0) {
            if (abstractC7264g0 == null) {
                m4250u(23);
            }
            this.f33030k = abstractC7264g0;
            return this;
        }

        @Override // p305qg.InterfaceC11998y.InterfaceC11999a
        /* renamed from: R */
        public C12730c mo4251t() {
            this.f33033n = true;
            return this;
        }

        @Override // p305qg.InterfaceC11998y.InterfaceC11999a
        /* renamed from: S */
        public C12730c mo4257n(AbstractC7297n1 abstractC7297n1) {
            if (abstractC7297n1 == null) {
                m4250u(37);
            }
            this.f33020a = abstractC7297n1;
            return this;
        }

        @Override // p305qg.InterfaceC11998y.InterfaceC11999a
        /* renamed from: T */
        public C12730c mo4256o(List<InterfaceC11920f1> list) {
            if (list == null) {
                m4250u(21);
            }
            this.f33037r = list;
            return this;
        }

        @Override // p305qg.InterfaceC11998y.InterfaceC11999a
        /* renamed from: U */
        public C12730c mo4269b(List<InterfaceC11936j1> list) {
            if (list == null) {
                m4250u(19);
            }
            this.f33026g = list;
            return this;
        }

        @Override // p305qg.InterfaceC11998y.InterfaceC11999a
        /* renamed from: V */
        public C12730c mo4264g(AbstractC11988u abstractC11988u) {
            if (abstractC11988u == null) {
                m4250u(12);
            }
            this.f33023d = abstractC11988u;
            return this;
        }

        @Override // p305qg.InterfaceC11998y.InterfaceC11999a
        public InterfaceC11998y build() {
            return this.f33043x.mo4328M0(this);
        }

        @Override // p305qg.InterfaceC11998y.InterfaceC11999a
        /* renamed from: q */
        public <V> InterfaceC11998y.InterfaceC11999a<InterfaceC11998y> mo4254q(InterfaceC11897a.InterfaceC11898a<V> interfaceC11898a, V v) {
            if (interfaceC11898a == null) {
                m4250u(39);
            }
            this.f33040u.put(interfaceC11898a, v);
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12727p(InterfaceC11947m interfaceC11947m, InterfaceC11998y interfaceC11998y, InterfaceC12155g interfaceC12155g, C11638f c11638f, InterfaceC11902b.EnumC11903a enumC11903a, InterfaceC11900a1 interfaceC11900a1) {
        super(interfaceC11947m, interfaceC12155g, c11638f, interfaceC11900a1);
        if (interfaceC11947m == null) {
            m4304g0(0);
        }
        if (interfaceC12155g == null) {
            m4304g0(1);
        }
        if (c11638f == null) {
            m4304g0(2);
        }
        if (enumC11903a == null) {
            m4304g0(3);
        }
        if (interfaceC11900a1 == null) {
            m4304g0(4);
        }
        this.f33011u = C11974t.f30974i;
        this.f33012v = false;
        this.f33013w = false;
        this.f33014x = false;
        this.f33015y = false;
        this.f33016z = false;
        this.f32991A = false;
        this.f32992B = false;
        this.f32993C = false;
        this.f32994D = false;
        this.f32995E = false;
        this.f32996F = true;
        this.f32997G = false;
        this.f32998H = null;
        this.f32999I = null;
        this.f33002L = null;
        this.f33003M = null;
        this.f33000J = interfaceC11998y == null ? this : interfaceC11998y;
        this.f33001K = enumC11903a;
    }

    /* renamed from: N0 */
    private InterfaceC11900a1 m4327N0(boolean z, InterfaceC11998y interfaceC11998y) {
        InterfaceC11900a1 interfaceC11900a1;
        if (z) {
            if (interfaceC11998y == null) {
                interfaceC11998y = mo4221a();
            }
            interfaceC11900a1 = interfaceC11998y.mo4160j();
        } else {
            interfaceC11900a1 = InterfaceC11900a1.f30901a;
        }
        if (interfaceC11900a1 == null) {
            m4304g0(27);
        }
        return interfaceC11900a1;
    }

    /* renamed from: O0 */
    public static List<InterfaceC11936j1> m4326O0(InterfaceC11998y interfaceC11998y, List<InterfaceC11936j1> list, C7307p1 c7307p1) {
        if (list == null) {
            m4304g0(28);
        }
        if (c7307p1 == null) {
            m4304g0(29);
        }
        return m4325P0(interfaceC11998y, list, c7307p1, false, false, null);
    }

    /* renamed from: P0 */
    public static List<InterfaceC11936j1> m4325P0(InterfaceC11998y interfaceC11998y, List<InterfaceC11936j1> list, C7307p1 c7307p1, boolean z, boolean z2, boolean[] zArr) {
        AbstractC7264g0 m21018p;
        C12729b c12729b;
        InterfaceC11936j1 interfaceC11936j1;
        InterfaceC11900a1 interfaceC11900a1;
        if (list == null) {
            m4304g0(30);
        }
        if (c7307p1 == null) {
            m4304g0(31);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (InterfaceC11936j1 interfaceC11936j12 : list) {
            AbstractC7264g0 type = interfaceC11936j12.getType();
            EnumC7336w1 enumC7336w1 = EnumC7336w1.IN_VARIANCE;
            AbstractC7264g0 m21018p2 = c7307p1.m21018p(type, enumC7336w1);
            AbstractC7264g0 mo4373v0 = interfaceC11936j12.mo4373v0();
            if (mo4373v0 == null) {
                m21018p = null;
            } else {
                m21018p = c7307p1.m21018p(mo4373v0, enumC7336w1);
            }
            if (m21018p2 == null) {
                return null;
            }
            if ((m21018p2 != interfaceC11936j12.getType() || mo4373v0 != m21018p) && zArr != null) {
                zArr[0] = true;
            }
            if (interfaceC11936j12 instanceof C12713l0.C12715b) {
                c12729b = new C12729b(((C12713l0.C12715b) interfaceC11936j12).m4371N0());
            } else {
                c12729b = null;
            }
            if (z) {
                interfaceC11936j1 = null;
            } else {
                interfaceC11936j1 = interfaceC11936j12;
            }
            int index = interfaceC11936j12.getIndex();
            InterfaceC12155g annotations = interfaceC11936j12.getAnnotations();
            C11638f name = interfaceC11936j12.getName();
            boolean mo4379A0 = interfaceC11936j12.mo4379A0();
            boolean mo4374q0 = interfaceC11936j12.mo4374q0();
            boolean mo4375o0 = interfaceC11936j12.mo4375o0();
            if (z2) {
                interfaceC11900a1 = interfaceC11936j12.mo4160j();
            } else {
                interfaceC11900a1 = InterfaceC11900a1.f30901a;
            }
            arrayList.add(C12713l0.m4378K0(interfaceC11998y, interfaceC11936j1, index, annotations, name, m21018p2, mo4379A0, mo4374q0, mo4375o0, m21018p, interfaceC11900a1, c12729b));
        }
        return arrayList;
    }

    /* renamed from: T0 */
    private void m4321T0() {
        Function0<Collection<InterfaceC11998y>> function0 = this.f32999I;
        if (function0 != null) {
            this.f32998H = function0.invoke();
            this.f32999I = null;
        }
    }

    /* renamed from: a1 */
    private void m4313a1(boolean z) {
        this.f32994D = z;
    }

    /* renamed from: b1 */
    private void m4312b1(boolean z) {
        this.f32993C = z;
    }

    /* renamed from: d1 */
    private void m4309d1(InterfaceC11998y interfaceC11998y) {
        this.f33002L = interfaceC11998y;
    }

    /* renamed from: g0 */
    private static /* synthetic */ void m4304g0(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i2 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = ZeroconfModule.KEY_SERVICE_NAME;
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(format);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    /* renamed from: B */
    public boolean mo4338B() {
        return this.f33016z;
    }

    @Override // p305qg.InterfaceC11998y
    /* renamed from: C0 */
    public boolean mo4337C0() {
        return this.f32993C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: D0 */
    public void mo4336D0(Collection<? extends InterfaceC11902b> collection) {
        if (collection == 0) {
            m4304g0(17);
        }
        this.f32998H = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((InterfaceC11998y) it.next()).mo4334F0()) {
                this.f32994D = true;
                return;
            }
        }
    }

    @Override // p305qg.InterfaceC11998y
    /* renamed from: F0 */
    public boolean mo4334F0() {
        return this.f32994D;
    }

    @Override // p305qg.InterfaceC11897a
    /* renamed from: I */
    public InterfaceC11997x0 mo4332I() {
        return this.f33009s;
    }

    @Override // p305qg.InterfaceC11902b
    /* renamed from: K0 */
    public InterfaceC11998y mo4317X(InterfaceC11947m interfaceC11947m, EnumC11915e0 enumC11915e0, AbstractC11988u abstractC11988u, InterfaceC11902b.EnumC11903a enumC11903a, boolean z) {
        InterfaceC11998y build = mo4296u().mo4266e(interfaceC11947m).mo4252s(enumC11915e0).mo4264g(abstractC11988u).mo4253r(enumC11903a).mo4258m(z).build();
        if (build == null) {
            m4304g0(26);
        }
        return build;
    }

    /* renamed from: L0 */
    protected abstract AbstractC12727p mo4330L0(InterfaceC11947m interfaceC11947m, InterfaceC11998y interfaceC11998y, InterfaceC11902b.EnumC11903a enumC11903a, C11638f c11638f, InterfaceC12155g interfaceC12155g, InterfaceC11900a1 interfaceC11900a1);

    @Override // p305qg.InterfaceC11897a
    /* renamed from: M */
    public InterfaceC11997x0 mo4329M() {
        return this.f33008r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: M0 */
    public InterfaceC11998y mo4328M0(C12730c c12730c) {
        InterfaceC12155g annotations;
        List<InterfaceC11920f1> list;
        C12699f0 c12699f0;
        InterfaceC11997x0 interfaceC11997x0;
        AbstractC7264g0 m21018p;
        boolean z;
        boolean z2;
        InterfaceC11998y interfaceC11998y;
        boolean z3;
        boolean z4;
        boolean z5;
        if (c12730c == null) {
            m4304g0(25);
        }
        boolean[] zArr = new boolean[1];
        if (c12730c.f33038s != null) {
            annotations = C12160i.m6033a(getAnnotations(), c12730c.f33038s);
        } else {
            annotations = getAnnotations();
        }
        InterfaceC11947m interfaceC11947m = c12730c.f33021b;
        InterfaceC11998y interfaceC11998y2 = c12730c.f33024e;
        AbstractC12727p mo4330L0 = mo4330L0(interfaceC11947m, interfaceC11998y2, c12730c.f33025f, c12730c.f33031l, annotations, m4327N0(c12730c.f33034o, interfaceC11998y2));
        if (c12730c.f33037r == null) {
            list = getTypeParameters();
        } else {
            list = c12730c.f33037r;
        }
        zArr[0] = zArr[0] | (!list.isEmpty());
        ArrayList arrayList = new ArrayList(list.size());
        C7307p1 m20964c = C7322t.m20964c(list, c12730c.f33020a, mo4330L0, arrayList, zArr);
        if (m20964c == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!c12730c.f33027h.isEmpty()) {
            for (InterfaceC11997x0 interfaceC11997x02 : c12730c.f33027h) {
                AbstractC7264g0 m21018p2 = m20964c.m21018p(interfaceC11997x02.getType(), EnumC7336w1.IN_VARIANCE);
                if (m21018p2 == null) {
                    return null;
                }
                arrayList2.add(C12756d.m4141b(mo4330L0, m21018p2, ((InterfaceC2314f) interfaceC11997x02.getValue()).mo33659a(), interfaceC11997x02.getAnnotations()));
                boolean z6 = zArr[0];
                if (m21018p2 != interfaceC11997x02.getType()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                zArr[0] = z5 | z6;
            }
        }
        InterfaceC11997x0 interfaceC11997x03 = c12730c.f33028i;
        if (interfaceC11997x03 != null) {
            AbstractC7264g0 m21018p3 = m20964c.m21018p(interfaceC11997x03.getType(), EnumC7336w1.IN_VARIANCE);
            if (m21018p3 == null) {
                return null;
            }
            C12699f0 c12699f02 = new C12699f0(mo4330L0, new C2312d(mo4330L0, m21018p3, c12730c.f33028i.getValue()), c12730c.f33028i.getAnnotations());
            boolean z7 = zArr[0];
            if (m21018p3 != c12730c.f33028i.getType()) {
                z4 = true;
            } else {
                z4 = false;
            }
            zArr[0] = z4 | z7;
            c12699f0 = c12699f02;
        } else {
            c12699f0 = null;
        }
        InterfaceC11997x0 interfaceC11997x04 = c12730c.f33029j;
        if (interfaceC11997x04 != 0) {
            InterfaceC11997x0 mo4225c = interfaceC11997x04.mo4225c(m20964c);
            if (mo4225c == null) {
                return null;
            }
            boolean z8 = zArr[0];
            if (mo4225c != c12730c.f33029j) {
                z3 = true;
            } else {
                z3 = false;
            }
            zArr[0] = z8 | z3;
            interfaceC11997x0 = mo4225c;
        } else {
            interfaceC11997x0 = null;
        }
        List<InterfaceC11936j1> m4325P0 = m4325P0(mo4330L0, c12730c.f33026g, m20964c, c12730c.f33035p, c12730c.f33034o, zArr);
        if (m4325P0 == null || (m21018p = m20964c.m21018p(c12730c.f33030k, EnumC7336w1.OUT_VARIANCE)) == null) {
            return null;
        }
        boolean z9 = zArr[0];
        if (m21018p != c12730c.f33030k) {
            z = true;
        } else {
            z = false;
        }
        boolean z10 = z9 | z;
        zArr[0] = z10;
        if (!z10 && c12730c.f33042w) {
            return this;
        }
        mo4330L0.mo4323R0(c12699f0, interfaceC11997x0, arrayList2, arrayList, m4325P0, m21018p, c12730c.f33022c, c12730c.f33023d);
        mo4330L0.m4306f1(this.f33012v);
        mo4330L0.m4311c1(this.f33013w);
        mo4330L0.m4316X0(this.f33014x);
        mo4330L0.m4308e1(this.f33015y);
        mo4330L0.m4299i1(this.f33016z);
        mo4330L0.m4302h1(this.f32995E);
        mo4330L0.m4318W0(this.f32991A);
        mo4330L0.m4319V0(this.f32992B);
        mo4330L0.mo4315Y0(this.f32996F);
        mo4330L0.m4312b1(c12730c.f33036q);
        mo4330L0.m4313a1(c12730c.f33039t);
        if (c12730c.f33041v != null) {
            z2 = c12730c.f33041v.booleanValue();
        } else {
            z2 = this.f32997G;
        }
        mo4330L0.mo4314Z0(z2);
        if (!c12730c.f33040u.isEmpty() || this.f33003M != null) {
            Map<InterfaceC11897a.InterfaceC11898a<?>, Object> map = c12730c.f33040u;
            Map<InterfaceC11897a.InterfaceC11898a<?>, Object> map2 = this.f33003M;
            if (map2 != null) {
                for (Map.Entry<InterfaceC11897a.InterfaceC11898a<?>, Object> entry : map2.entrySet()) {
                    if (!map.containsKey(entry.getKey())) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (map.size() == 1) {
                mo4330L0.f33003M = Collections.singletonMap(map.keySet().iterator().next(), map.values().iterator().next());
            } else {
                mo4330L0.f33003M = map;
            }
        }
        if (c12730c.f33033n || mo4297s0() != null) {
            if (mo4297s0() != null) {
                interfaceC11998y = mo4297s0();
            } else {
                interfaceC11998y = this;
            }
            mo4330L0.m4309d1(interfaceC11998y.mo4225c(m20964c));
        }
        if (c12730c.f33032m && !mo4221a().mo4310d().isEmpty()) {
            if (c12730c.f33020a.mo20959f()) {
                Function0<Collection<InterfaceC11998y>> function0 = this.f32999I;
                if (function0 != null) {
                    mo4330L0.f32999I = function0;
                } else {
                    mo4330L0.mo4336D0(mo4310d());
                }
            } else {
                mo4330L0.f32999I = new C12728a(m20964c);
            }
        }
        return mo4330L0;
    }

    /* renamed from: Q0 */
    public boolean mo4324Q0() {
        return this.f32996F;
    }

    /* renamed from: R0 */
    public AbstractC12727p mo4323R0(InterfaceC11997x0 interfaceC11997x0, InterfaceC11997x0 interfaceC11997x02, List<InterfaceC11997x0> list, List<? extends InterfaceC11920f1> list2, List<InterfaceC11936j1> list3, AbstractC7264g0 abstractC7264g0, EnumC11915e0 enumC11915e0, AbstractC11988u abstractC11988u) {
        List<InterfaceC11920f1> m14075C0;
        List<InterfaceC11936j1> m14075C02;
        if (list == null) {
            m4304g0(5);
        }
        if (list2 == null) {
            m4304g0(6);
        }
        if (list3 == null) {
            m4304g0(7);
        }
        if (abstractC11988u == null) {
            m4304g0(8);
        }
        m14075C0 = C9553r.m14075C0(list2);
        this.f33004n = m14075C0;
        m14075C02 = C9553r.m14075C0(list3);
        this.f33005o = m14075C02;
        this.f33006p = abstractC7264g0;
        this.f33010t = enumC11915e0;
        this.f33011u = abstractC11988u;
        this.f33008r = interfaceC11997x0;
        this.f33009s = interfaceC11997x02;
        this.f33007q = list;
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC11920f1 interfaceC11920f1 = list2.get(i);
            if (interfaceC11920f1.getIndex() != i) {
                throw new IllegalStateException(interfaceC11920f1 + " index is " + interfaceC11920f1.getIndex() + " but position is " + i);
            }
        }
        for (int i2 = 0; i2 < list3.size(); i2++) {
            InterfaceC11936j1 interfaceC11936j1 = list3.get(i2);
            if (interfaceC11936j1.getIndex() != i2 + 0) {
                throw new IllegalStateException(interfaceC11936j1 + "index is " + interfaceC11936j1.getIndex() + " but position is " + i2);
            }
        }
        return this;
    }

    /* renamed from: S0 */
    public C12730c m4322S0(C7307p1 c7307p1) {
        if (c7307p1 == null) {
            m4304g0(24);
        }
        return new C12730c(this, c7307p1.m21024j(), mo4163b(), mo4167r(), getVisibility(), mo4305g(), mo4301i(), mo4295x0(), mo4329M(), getReturnType(), null);
    }

    @Override // p305qg.InterfaceC11911d0
    /* renamed from: U */
    public boolean mo4178U() {
        return this.f32992B;
    }

    /* renamed from: U0 */
    public <V> void m4320U0(InterfaceC11897a.InterfaceC11898a<V> interfaceC11898a, Object obj) {
        if (this.f33003M == null) {
            this.f33003M = new LinkedHashMap();
        }
        this.f33003M.put(interfaceC11898a, obj);
    }

    /* renamed from: V0 */
    public void m4319V0(boolean z) {
        this.f32992B = z;
    }

    /* renamed from: W0 */
    public void m4318W0(boolean z) {
        this.f32991A = z;
    }

    /* renamed from: X0 */
    public void m4316X0(boolean z) {
        this.f33014x = z;
    }

    /* renamed from: Y0 */
    public void mo4315Y0(boolean z) {
        this.f32996F = z;
    }

    /* renamed from: Z0 */
    public void mo4314Z0(boolean z) {
        this.f32997G = z;
    }

    /* renamed from: c1 */
    public void m4311c1(boolean z) {
        this.f33013w = z;
    }

    /* renamed from: d */
    public Collection<? extends InterfaceC11998y> mo4310d() {
        m4321T0();
        Collection<? extends InterfaceC11998y> collection = this.f32998H;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection == null) {
            m4304g0(14);
        }
        return collection;
    }

    /* renamed from: d0 */
    public <R, D> R mo4162d0(InterfaceC11964o<R, D> interfaceC11964o, D d) {
        return interfaceC11964o.mo4387h(this, d);
    }

    /* renamed from: e1 */
    public void m4308e1(boolean z) {
        this.f33015y = z;
    }

    /* renamed from: f0 */
    public boolean mo4307f0() {
        return this.f32997G;
    }

    /* renamed from: f1 */
    public void m4306f1(boolean z) {
        this.f33012v = z;
    }

    @Override // p305qg.InterfaceC11902b
    /* renamed from: g */
    public InterfaceC11902b.EnumC11903a mo4305g() {
        InterfaceC11902b.EnumC11903a enumC11903a = this.f33001K;
        if (enumC11903a == null) {
            m4304g0(21);
        }
        return enumC11903a;
    }

    /* renamed from: g1 */
    public void m4303g1(AbstractC7264g0 abstractC7264g0) {
        if (abstractC7264g0 == null) {
            m4304g0(11);
        }
        this.f33006p = abstractC7264g0;
    }

    public AbstractC7264g0 getReturnType() {
        return this.f33006p;
    }

    @Override // p305qg.InterfaceC11897a
    public List<InterfaceC11920f1> getTypeParameters() {
        List<InterfaceC11920f1> list = this.f33004n;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // p305qg.InterfaceC11968q, p305qg.InterfaceC11911d0
    public AbstractC11988u getVisibility() {
        AbstractC11988u abstractC11988u = this.f33011u;
        if (abstractC11988u == null) {
            m4304g0(16);
        }
        return abstractC11988u;
    }

    /* renamed from: h1 */
    public void m4302h1(boolean z) {
        this.f32995E = z;
    }

    @Override // p305qg.InterfaceC11897a
    /* renamed from: i */
    public List<InterfaceC11936j1> mo4301i() {
        List<InterfaceC11936j1> list = this.f33005o;
        if (list == null) {
            m4304g0(19);
        }
        return list;
    }

    /* renamed from: i0 */
    public <V> V mo4300i0(InterfaceC11897a.InterfaceC11898a<V> interfaceC11898a) {
        Map<InterfaceC11897a.InterfaceC11898a<?>, Object> map = this.f33003M;
        if (map == null) {
            return null;
        }
        return (V) map.get(interfaceC11898a);
    }

    /* renamed from: i1 */
    public void m4299i1(boolean z) {
        this.f33016z = z;
    }

    public boolean isExternal() {
        return this.f33014x;
    }

    @Override // p305qg.InterfaceC11998y
    public boolean isInfix() {
        if (this.f33013w) {
            return true;
        }
        for (InterfaceC11998y interfaceC11998y : mo4221a().mo4310d()) {
            if (interfaceC11998y.isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInline() {
        return this.f33015y;
    }

    @Override // p305qg.InterfaceC11998y
    public boolean isOperator() {
        if (this.f33012v) {
            return true;
        }
        for (InterfaceC11998y interfaceC11998y : mo4221a().mo4310d()) {
            if (interfaceC11998y.isOperator()) {
                return true;
            }
        }
        return false;
    }

    public boolean isSuspend() {
        return this.f32995E;
    }

    /* renamed from: j1 */
    public void m4298j1(AbstractC11988u abstractC11988u) {
        if (abstractC11988u == null) {
            m4304g0(10);
        }
        this.f33011u = abstractC11988u;
    }

    @Override // p305qg.InterfaceC11911d0
    /* renamed from: k0 */
    public boolean mo4172k0() {
        return this.f32991A;
    }

    @Override // p305qg.InterfaceC11911d0
    /* renamed from: r */
    public EnumC11915e0 mo4167r() {
        EnumC11915e0 enumC11915e0 = this.f33010t;
        if (enumC11915e0 == null) {
            m4304g0(15);
        }
        return enumC11915e0;
    }

    @Override // p305qg.InterfaceC11998y
    /* renamed from: s0 */
    public InterfaceC11998y mo4297s0() {
        return this.f33002L;
    }

    /* renamed from: u */
    public InterfaceC11998y.InterfaceC11999a<? extends InterfaceC11998y> mo4296u() {
        C12730c m4322S0 = m4322S0(C7307p1.f19741b);
        if (m4322S0 == null) {
            m4304g0(23);
        }
        return m4322S0;
    }

    @Override // p305qg.InterfaceC11897a
    /* renamed from: x0 */
    public List<InterfaceC11997x0> mo4295x0() {
        List<InterfaceC11997x0> list = this.f33007q;
        if (list == null) {
            m4304g0(13);
        }
        return list;
    }

    @Override // p305qg.InterfaceC11998y, p305qg.InterfaceC11909c1
    /* renamed from: c */
    public InterfaceC11998y mo4225c(C7307p1 c7307p1) {
        if (c7307p1 == null) {
            m4304g0(22);
        }
        return c7307p1.m21023k() ? this : m4322S0(c7307p1).mo4268c(mo4221a()).mo4261j().m4283J(true).build();
    }

    @Override // tg.AbstractC12710k, tg.AbstractC12706j, p305qg.InterfaceC11947m
    /* renamed from: a */
    public InterfaceC11998y mo4221a() {
        InterfaceC11998y interfaceC11998y = this.f33000J;
        InterfaceC11998y mo4221a = interfaceC11998y == this ? this : interfaceC11998y.mo4221a();
        if (mo4221a == null) {
            m4304g0(20);
        }
        return mo4221a;
    }
}