package p013ah;

import gh.InterfaceC6770g;
import gh.InterfaceC6775l;
import gh.InterfaceC6777n;
import gh.InterfaceC6780q;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11944l;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC12005z0;
import ph.C11633c;

/* renamed from: ah.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public interface InterfaceC0170g {

    /* renamed from: a */
    public static final InterfaceC0170g f588a = new C0171a();

    /* renamed from: ah.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static class C0171a implements InterfaceC0170g {
        C0171a() {
        }

        /* renamed from: f */
        private static /* synthetic */ void m41023f(int i) {
            Object[] objArr = new Object[3];
            switch (i) {
                case 1:
                    objArr[0] = "member";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = "descriptor";
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p013ah.InterfaceC0170g
        /* renamed from: a */
        public void mo41028a(InterfaceC6770g interfaceC6770g, InterfaceC11914e interfaceC11914e) {
            if (interfaceC6770g == null) {
                m41023f(7);
            }
            if (interfaceC11914e == null) {
                m41023f(8);
            }
        }

        @Override // p013ah.InterfaceC0170g
        /* renamed from: b */
        public void mo41027b(InterfaceC6775l interfaceC6775l, InterfaceC11944l interfaceC11944l) {
            if (interfaceC6775l == null) {
                m41023f(3);
            }
            if (interfaceC11944l == null) {
                m41023f(4);
            }
        }

        @Override // p013ah.InterfaceC0170g
        /* renamed from: c */
        public void mo41026c(InterfaceC6780q interfaceC6780q, InterfaceC12005z0 interfaceC12005z0) {
            if (interfaceC6780q == null) {
                m41023f(1);
            }
            if (interfaceC12005z0 == null) {
                m41023f(2);
            }
        }

        @Override // p013ah.InterfaceC0170g
        /* renamed from: d */
        public InterfaceC11914e mo41025d(C11633c c11633c) {
            if (c11633c == null) {
                m41023f(0);
                return null;
            }
            return null;
        }

        @Override // p013ah.InterfaceC0170g
        /* renamed from: e */
        public void mo41024e(InterfaceC6777n interfaceC6777n, InterfaceC11989u0 interfaceC11989u0) {
            if (interfaceC6777n == null) {
                m41023f(5);
            }
            if (interfaceC11989u0 == null) {
                m41023f(6);
            }
        }
    }

    /* renamed from: a */
    void mo41028a(InterfaceC6770g interfaceC6770g, InterfaceC11914e interfaceC11914e);

    /* renamed from: b */
    void mo41027b(InterfaceC6775l interfaceC6775l, InterfaceC11944l interfaceC11944l);

    /* renamed from: c */
    void mo41026c(InterfaceC6780q interfaceC6780q, InterfaceC12005z0 interfaceC12005z0);

    /* renamed from: d */
    InterfaceC11914e mo41025d(C11633c c11633c);

    /* renamed from: e */
    void mo41024e(InterfaceC6777n interfaceC6777n, InterfaceC11989u0 interfaceC11989u0);
}
