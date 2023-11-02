package p013ah;

import gh.InterfaceC6781r;
import java.util.Collections;
import java.util.List;
import p142hi.AbstractC7264g0;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11936j1;

/* renamed from: ah.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public interface InterfaceC0176j {

    /* renamed from: a */
    public static final InterfaceC0176j f595a = new C0177a();

    /* renamed from: ah.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static class C0177a implements InterfaceC0176j {
        C0177a() {
        }

        /* renamed from: c */
        private static /* synthetic */ void m41018c(int i) {
            Object[] objArr = new Object[3];
            switch (i) {
                case 1:
                    objArr[0] = "owner";
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = "method";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i == 5 || i == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p013ah.InterfaceC0176j
        /* renamed from: a */
        public C0178b mo41020a(InterfaceC6781r interfaceC6781r, InterfaceC11914e interfaceC11914e, AbstractC7264g0 abstractC7264g0, AbstractC7264g0 abstractC7264g02, List<InterfaceC11936j1> list, List<InterfaceC11920f1> list2) {
            if (interfaceC6781r == null) {
                m41018c(0);
            }
            if (interfaceC11914e == null) {
                m41018c(1);
            }
            if (abstractC7264g0 == null) {
                m41018c(2);
            }
            if (list == null) {
                m41018c(3);
            }
            if (list2 == null) {
                m41018c(4);
            }
            return new C0178b(abstractC7264g0, abstractC7264g02, list, list2, Collections.emptyList(), false);
        }

        @Override // p013ah.InterfaceC0176j
        /* renamed from: b */
        public void mo41019b(InterfaceC11902b interfaceC11902b, List<String> list) {
            if (interfaceC11902b == null) {
                m41018c(5);
            }
            if (list == null) {
                m41018c(6);
            }
            throw new UnsupportedOperationException("Should not be called");
        }
    }

    /* renamed from: ah.j$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static class C0178b {

        /* renamed from: a */
        private final AbstractC7264g0 f596a;

        /* renamed from: b */
        private final AbstractC7264g0 f597b;

        /* renamed from: c */
        private final List<InterfaceC11936j1> f598c;

        /* renamed from: d */
        private final List<InterfaceC11920f1> f599d;

        /* renamed from: e */
        private final List<String> f600e;

        /* renamed from: f */
        private final boolean f601f;

        public C0178b(AbstractC7264g0 abstractC7264g0, AbstractC7264g0 abstractC7264g02, List<InterfaceC11936j1> list, List<InterfaceC11920f1> list2, List<String> list3, boolean z) {
            if (abstractC7264g0 == null) {
                m41017a(0);
            }
            if (list == null) {
                m41017a(1);
            }
            if (list2 == null) {
                m41017a(2);
            }
            if (list3 == null) {
                m41017a(3);
            }
            this.f596a = abstractC7264g0;
            this.f597b = abstractC7264g02;
            this.f598c = list;
            this.f599d = list2;
            this.f600e = list3;
            this.f601f = z;
        }

        /* renamed from: a */
        private static /* synthetic */ void m41017a(int i) {
            String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
            switch (i) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i == 4) {
                objArr[1] = "getReturnType";
            } else if (i == 5) {
                objArr[1] = "getValueParameters";
            } else if (i == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (i != 4 && i != 5 && i != 6 && i != 7) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i != 4 && i != 5 && i != 6 && i != 7) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        /* renamed from: b */
        public List<String> m41016b() {
            List<String> list = this.f600e;
            if (list == null) {
                m41017a(7);
            }
            return list;
        }

        /* renamed from: c */
        public AbstractC7264g0 m41015c() {
            return this.f597b;
        }

        /* renamed from: d */
        public AbstractC7264g0 m41014d() {
            AbstractC7264g0 abstractC7264g0 = this.f596a;
            if (abstractC7264g0 == null) {
                m41017a(4);
            }
            return abstractC7264g0;
        }

        /* renamed from: e */
        public List<InterfaceC11920f1> m41013e() {
            List<InterfaceC11920f1> list = this.f599d;
            if (list == null) {
                m41017a(6);
            }
            return list;
        }

        /* renamed from: f */
        public List<InterfaceC11936j1> m41012f() {
            List<InterfaceC11936j1> list = this.f598c;
            if (list == null) {
                m41017a(5);
            }
            return list;
        }

        /* renamed from: g */
        public boolean m41011g() {
            return this.f601f;
        }
    }

    /* renamed from: a */
    C0178b mo41020a(InterfaceC6781r interfaceC6781r, InterfaceC11914e interfaceC11914e, AbstractC7264g0 abstractC7264g0, AbstractC7264g0 abstractC7264g02, List<InterfaceC11936j1> list, List<InterfaceC11920f1> list2);

    /* renamed from: b */
    void mo41019b(InterfaceC11902b interfaceC11902b, List<String> list);
}
