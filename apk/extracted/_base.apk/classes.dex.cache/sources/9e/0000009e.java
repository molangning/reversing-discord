package p013ah;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p070di.InterfaceC5950r;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11910d;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11936j1;
import ph.C11638f;
import th.AbstractC12764i;
import th.C12766k;

/* renamed from: ah.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C0158a {

    /* renamed from: ah.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static class C0159a extends AbstractC12764i {

        /* renamed from: a */
        final /* synthetic */ InterfaceC5950r f563a;

        /* renamed from: b */
        final /* synthetic */ Set f564b;

        /* renamed from: c */
        final /* synthetic */ boolean f565c;

        /* renamed from: ah.a$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        class C0160a implements Function1<InterfaceC11902b, Unit> {
            C0160a() {
                C0159a.this = r1;
            }

            /* renamed from: a */
            private static /* synthetic */ void m41045a(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b */
            public Unit invoke(InterfaceC11902b interfaceC11902b) {
                if (interfaceC11902b == null) {
                    m41045a(0);
                }
                C0159a.this.f563a.mo2841b(interfaceC11902b);
                return Unit.f25302a;
            }
        }

        C0159a(InterfaceC5950r interfaceC5950r, Set set, boolean z) {
            this.f563a = interfaceC5950r;
            this.f564b = set;
            this.f565c = z;
        }

        /* renamed from: f */
        private static /* synthetic */ void m41046f(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "fromSuper";
            } else if (i == 2) {
                objArr[0] = "fromCurrent";
            } else if (i == 3) {
                objArr[0] = "member";
            } else if (i != 4) {
                objArr[0] = "fakeOverride";
            } else {
                objArr[0] = "overridden";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
            if (i == 1 || i == 2) {
                objArr[2] = "conflict";
            } else if (i == 3 || i == 4) {
                objArr[2] = "setOverriddenDescriptors";
            } else {
                objArr[2] = "addFakeOverride";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // th.AbstractC12765j
        /* renamed from: a */
        public void mo4076a(InterfaceC11902b interfaceC11902b) {
            if (interfaceC11902b == null) {
                m41046f(0);
            }
            C12766k.m4062K(interfaceC11902b, new C0160a());
            this.f564b.add(interfaceC11902b);
        }

        @Override // th.AbstractC12765j
        /* renamed from: d */
        public void mo4073d(InterfaceC11902b interfaceC11902b, Collection<? extends InterfaceC11902b> collection) {
            if (interfaceC11902b == null) {
                m41046f(3);
            }
            if (collection == null) {
                m41046f(4);
            }
            if (this.f565c && interfaceC11902b.mo4305g() != InterfaceC11902b.EnumC11903a.FAKE_OVERRIDE) {
                return;
            }
            super.mo4073d(interfaceC11902b, collection);
        }

        @Override // th.AbstractC12764i
        /* renamed from: e */
        public void mo4077e(InterfaceC11902b interfaceC11902b, InterfaceC11902b interfaceC11902b2) {
            if (interfaceC11902b == null) {
                m41046f(1);
            }
            if (interfaceC11902b2 == null) {
                m41046f(2);
            }
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m41051a(int i) {
        String str = i != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 18 ? 3 : 2];
        switch (i) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = ZeroconfModule.KEY_SERVICE_NAME;
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 18) {
            throw new IllegalStateException(format);
        }
    }

    /* renamed from: b */
    public static InterfaceC11936j1 m41050b(C11638f c11638f, InterfaceC11914e interfaceC11914e) {
        if (c11638f == null) {
            m41051a(19);
        }
        if (interfaceC11914e == null) {
            m41051a(20);
        }
        Collection<InterfaceC11910d> mo4171l = interfaceC11914e.mo4171l();
        if (mo4171l.size() != 1) {
            return null;
        }
        for (InterfaceC11936j1 interfaceC11936j1 : mo4171l.iterator().next().mo4301i()) {
            if (interfaceC11936j1.getName().equals(c11638f)) {
                return interfaceC11936j1;
            }
        }
        return null;
    }

    /* renamed from: c */
    private static <D extends InterfaceC11902b> Collection<D> m41049c(C11638f c11638f, Collection<D> collection, Collection<D> collection2, InterfaceC11914e interfaceC11914e, InterfaceC5950r interfaceC5950r, C12766k c12766k, boolean z) {
        if (c11638f == null) {
            m41051a(12);
        }
        if (collection == null) {
            m41051a(13);
        }
        if (collection2 == null) {
            m41051a(14);
        }
        if (interfaceC11914e == null) {
            m41051a(15);
        }
        if (interfaceC5950r == null) {
            m41051a(16);
        }
        if (c12766k == null) {
            m41051a(17);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c12766k.m4039v(c11638f, collection, collection2, interfaceC11914e, new C0159a(interfaceC5950r, linkedHashSet, z));
        return linkedHashSet;
    }

    /* renamed from: d */
    public static <D extends InterfaceC11902b> Collection<D> m41048d(C11638f c11638f, Collection<D> collection, Collection<D> collection2, InterfaceC11914e interfaceC11914e, InterfaceC5950r interfaceC5950r, C12766k c12766k) {
        if (c11638f == null) {
            m41051a(0);
        }
        if (collection == null) {
            m41051a(1);
        }
        if (collection2 == null) {
            m41051a(2);
        }
        if (interfaceC11914e == null) {
            m41051a(3);
        }
        if (interfaceC5950r == null) {
            m41051a(4);
        }
        if (c12766k == null) {
            m41051a(5);
        }
        return m41049c(c11638f, collection, collection2, interfaceC11914e, interfaceC5950r, c12766k, false);
    }

    /* renamed from: e */
    public static <D extends InterfaceC11902b> Collection<D> m41047e(C11638f c11638f, Collection<D> collection, Collection<D> collection2, InterfaceC11914e interfaceC11914e, InterfaceC5950r interfaceC5950r, C12766k c12766k) {
        if (c11638f == null) {
            m41051a(6);
        }
        if (collection == null) {
            m41051a(7);
        }
        if (collection2 == null) {
            m41051a(8);
        }
        if (interfaceC11914e == null) {
            m41051a(9);
        }
        if (interfaceC5950r == null) {
            m41051a(10);
        }
        if (c12766k == null) {
            m41051a(11);
        }
        return m41049c(c11638f, collection, collection2, interfaceC11914e, interfaceC5950r, c12766k, true);
    }
}