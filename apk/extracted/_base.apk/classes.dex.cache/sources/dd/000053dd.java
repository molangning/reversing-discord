package p468zg;

import bi.InterfaceC2315g;
import java.util.HashMap;
import java.util.Map;
import p305qg.AbstractC11963n1;
import p305qg.AbstractC11970r;
import p305qg.AbstractC11988u;
import p305qg.C11974t;
import p305qg.InterfaceC11945l0;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11968q;
import th.C12758e;
import ug.C12970a;
import ug.C12971b;
import ug.C12972c;

/* renamed from: zg.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public class C14252s {

    /* renamed from: a */
    public static final AbstractC11988u f36645a;

    /* renamed from: b */
    public static final AbstractC11988u f36646b;

    /* renamed from: c */
    public static final AbstractC11988u f36647c;

    /* renamed from: d */
    private static final Map<AbstractC11963n1, AbstractC11988u> f36648d;

    /* renamed from: zg.s$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static class C14253a extends AbstractC11970r {
        C14253a(AbstractC11963n1 abstractC11963n1) {
            super(abstractC11963n1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m309g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p305qg.AbstractC11988u
        /* renamed from: e */
        public boolean mo307e(InterfaceC2315g interfaceC2315g, InterfaceC11968q interfaceC11968q, InterfaceC11947m interfaceC11947m, boolean z) {
            if (interfaceC11968q == null) {
                m309g(0);
            }
            if (interfaceC11947m == null) {
                m309g(1);
            }
            return C14252s.m313d(interfaceC11968q, interfaceC11947m);
        }
    }

    /* renamed from: zg.s$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static class C14254b extends AbstractC11970r {
        C14254b(AbstractC11963n1 abstractC11963n1) {
            super(abstractC11963n1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m308g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p305qg.AbstractC11988u
        /* renamed from: e */
        public boolean mo307e(InterfaceC2315g interfaceC2315g, InterfaceC11968q interfaceC11968q, InterfaceC11947m interfaceC11947m, boolean z) {
            if (interfaceC11968q == null) {
                m308g(0);
            }
            if (interfaceC11947m == null) {
                m308g(1);
            }
            return C14252s.m312e(interfaceC2315g, interfaceC11968q, interfaceC11947m);
        }
    }

    /* renamed from: zg.s$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static class C14255c extends AbstractC11970r {
        C14255c(AbstractC11963n1 abstractC11963n1) {
            super(abstractC11963n1);
        }

        /* renamed from: g */
        private static /* synthetic */ void m306g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p305qg.AbstractC11988u
        /* renamed from: e */
        public boolean mo307e(InterfaceC2315g interfaceC2315g, InterfaceC11968q interfaceC11968q, InterfaceC11947m interfaceC11947m, boolean z) {
            if (interfaceC11968q == null) {
                m306g(0);
            }
            if (interfaceC11947m == null) {
                m306g(1);
            }
            return C14252s.m312e(interfaceC2315g, interfaceC11968q, interfaceC11947m);
        }
    }

    static {
        C14253a c14253a = new C14253a(C12970a.f33725c);
        f36645a = c14253a;
        C14254b c14254b = new C14254b(C12972c.f33727c);
        f36646b = c14254b;
        C14255c c14255c = new C14255c(C12971b.f33726c);
        f36647c = c14255c;
        f36648d = new HashMap();
        m311f(c14253a);
        m311f(c14254b);
        m311f(c14255c);
    }

    /* renamed from: a */
    private static /* synthetic */ void m316a(int i) {
        String str = (i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i == 5 || i == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i != 5 && i != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String format = String.format(str, objArr);
        if (i != 5 && i != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* renamed from: d */
    public static boolean m313d(InterfaceC11947m interfaceC11947m, InterfaceC11947m interfaceC11947m2) {
        if (interfaceC11947m == null) {
            m316a(2);
        }
        if (interfaceC11947m2 == null) {
            m316a(3);
        }
        InterfaceC11945l0 interfaceC11945l0 = (InterfaceC11945l0) C12758e.m4094r(interfaceC11947m, InterfaceC11945l0.class, false);
        InterfaceC11945l0 interfaceC11945l02 = (InterfaceC11945l0) C12758e.m4094r(interfaceC11947m2, InterfaceC11945l0.class, false);
        if (interfaceC11945l02 == null || interfaceC11945l0 == null || !interfaceC11945l0.mo4161e().equals(interfaceC11945l02.mo4161e())) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m312e(InterfaceC2315g interfaceC2315g, InterfaceC11968q interfaceC11968q, InterfaceC11947m interfaceC11947m) {
        if (interfaceC11968q == null) {
            m316a(0);
        }
        if (interfaceC11947m == null) {
            m316a(1);
        }
        if (m313d(C12758e.m4112M(interfaceC11968q), interfaceC11947m)) {
            return true;
        }
        return C11974t.f30968c.mo307e(interfaceC2315g, interfaceC11968q, interfaceC11947m, false);
    }

    /* renamed from: f */
    private static void m311f(AbstractC11988u abstractC11988u) {
        f36648d.put(abstractC11988u.mo6656b(), abstractC11988u);
    }

    /* renamed from: g */
    public static AbstractC11988u m310g(AbstractC11963n1 abstractC11963n1) {
        if (abstractC11963n1 == null) {
            m316a(4);
        }
        AbstractC11988u abstractC11988u = f36648d.get(abstractC11963n1);
        if (abstractC11988u == null) {
            AbstractC11988u m6669j = C11974t.m6669j(abstractC11963n1);
            if (m6669j == null) {
                m316a(5);
            }
            return m6669j;
        }
        return abstractC11988u;
    }
}