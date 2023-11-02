package p161ii;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import li.C10208q;
import li.EnumC10193b;
import li.EnumC10213u;
import li.InterfaceC10194c;
import li.InterfaceC10195d;
import li.InterfaceC10196e;
import li.InterfaceC10197f;
import li.InterfaceC10198g;
import li.InterfaceC10200i;
import li.InterfaceC10201j;
import li.InterfaceC10202k;
import li.InterfaceC10203l;
import li.InterfaceC10204m;
import li.InterfaceC10205n;
import li.InterfaceC10206o;
import li.InterfaceC10210r;
import li.InterfaceC10212t;
import ng.AbstractC10870h;
import ng.C10884k;
import ng.EnumC10876i;
import p142hi.AbstractC7217a0;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7272h1;
import p142hi.AbstractC7302o0;
import p142hi.AbstractC7333v1;
import p142hi.C7239f0;
import p142hi.C7244f1;
import p142hi.C7267h0;
import p142hi.C7276i0;
import p142hi.C7304p;
import p142hi.C7307p1;
import p142hi.C7316r0;
import p142hi.C7320s1;
import p142hi.C7330v;
import p142hi.EnumC7336w1;
import p142hi.InterfaceC7265g1;
import p142hi.InterfaceC7288k1;
import p142hi.InterfaceC7290l0;
import p142hi.InterfaceC7296n0;
import p142hi.InterfaceC7314q1;
import p234mi.C10472a;
import p305qg.AbstractC11930h1;
import p305qg.C11919f0;
import p305qg.C12004z;
import p305qg.EnumC11918f;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11917e1;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;
import p372uh.C12973a;
import p389vh.C13312n;
import p429xh.C13801c;
import ph.C11633c;
import ph.C11634d;
import th.C12762g;

/* renamed from: ii.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public interface InterfaceC7582b extends InterfaceC7314q1, InterfaceC10210r {

    /* renamed from: ii.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7583a {

        /* renamed from: ii.b$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C7584a extends C7244f1.AbstractC7248c.AbstractC7249a {

            /* renamed from: a */
            final /* synthetic */ InterfaceC7582b f20878a;

            /* renamed from: b */
            final /* synthetic */ C7307p1 f20879b;

            C7584a(InterfaceC7582b interfaceC7582b, C7307p1 c7307p1) {
                this.f20878a = interfaceC7582b;
                this.f20879b = c7307p1;
            }

            @Override // p142hi.C7244f1.AbstractC7248c
            /* renamed from: a */
            public InterfaceC10202k mo20291a(C7244f1 state, InterfaceC10200i type) {
                C9612q.m13917h(state, "state");
                C9612q.m13917h(type, "type");
                InterfaceC7582b interfaceC7582b = this.f20878a;
                C7307p1 c7307p1 = this.f20879b;
                InterfaceC10202k mo3935z0 = interfaceC7582b.mo3935z0(type);
                C9612q.m13919f(mo3935z0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
                AbstractC7264g0 m21020n = c7307p1.m21020n((AbstractC7264g0) mo3935z0, EnumC7336w1.INVARIANT);
                C9612q.m13918g(m21020n, "substitutor.safeSubstitu…VARIANT\n                )");
                InterfaceC10202k mo3986a = interfaceC7582b.mo3986a(m21020n);
                C9612q.m13920e(mo3986a);
                return mo3986a;
            }
        }

        /* renamed from: A */
        public static EnumC10213u m20360A(InterfaceC7582b interfaceC7582b, InterfaceC10204m receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof InterfaceC7288k1) {
                EnumC7336w1 mo20954b = ((InterfaceC7288k1) receiver).mo20954b();
                C9612q.m13918g(mo20954b, "this.projectionKind");
                return C10208q.m12126a(mo20954b);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: B */
        public static EnumC10213u m20359B(InterfaceC7582b interfaceC7582b, InterfaceC10206o receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof InterfaceC11920f1) {
                EnumC7336w1 mo4464m = ((InterfaceC11920f1) receiver).mo4464m();
                C9612q.m13918g(mo4464m, "this.variance");
                return C10208q.m12126a(mo4464m);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: C */
        public static boolean m20358C(InterfaceC7582b interfaceC7582b, InterfaceC10200i receiver, C11633c fqName) {
            C9612q.m13917h(receiver, "$receiver");
            C9612q.m13917h(fqName, "fqName");
            if (receiver instanceof AbstractC7264g0) {
                return ((AbstractC7264g0) receiver).getAnnotations().mo6023q(fqName);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: D */
        public static boolean m20357D(InterfaceC7582b interfaceC7582b, InterfaceC10206o receiver, InterfaceC10205n interfaceC10205n) {
            boolean z;
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof InterfaceC11920f1) {
                if (interfaceC10205n == null) {
                    z = true;
                } else {
                    z = interfaceC10205n instanceof InterfaceC7265g1;
                }
                if (z) {
                    return C10472a.m11445m((InterfaceC11920f1) receiver, (InterfaceC7265g1) interfaceC10205n, null, 4, null);
                }
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: E */
        public static boolean m20356E(InterfaceC7582b interfaceC7582b, InterfaceC10202k a, InterfaceC10202k b) {
            C9612q.m13917h(a, "a");
            C9612q.m13917h(b, "b");
            if (a instanceof AbstractC7302o0) {
                if (b instanceof AbstractC7302o0) {
                    if (((AbstractC7302o0) a).mo3566L0() == ((AbstractC7302o0) b).mo3566L0()) {
                        return true;
                    }
                    return false;
                }
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + b + ", " + C9591f0.m13969b(b.getClass())).toString());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + a + ", " + C9591f0.m13969b(a.getClass())).toString());
        }

        /* renamed from: F */
        public static InterfaceC10200i m20355F(InterfaceC7582b interfaceC7582b, List<? extends InterfaceC10200i> types) {
            C9612q.m13917h(types, "types");
            return C7586d.m20288a(types);
        }

        /* renamed from: G */
        public static boolean m20354G(InterfaceC7582b interfaceC7582b, InterfaceC10205n receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof InterfaceC7265g1) {
                return AbstractC10870h.m9784v0((InterfaceC7265g1) receiver, C10884k.C10885a.f28472b);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: H */
        public static boolean m20353H(InterfaceC7582b interfaceC7582b, InterfaceC10205n receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof InterfaceC7265g1) {
                return ((InterfaceC7265g1) receiver).mo2788p() instanceof InterfaceC11914e;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: I */
        public static boolean m20352I(InterfaceC7582b interfaceC7582b, InterfaceC10205n receiver) {
            InterfaceC11914e interfaceC11914e;
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof InterfaceC7265g1) {
                InterfaceC11927h mo2788p = ((InterfaceC7265g1) receiver).mo2788p();
                if (mo2788p instanceof InterfaceC11914e) {
                    interfaceC11914e = (InterfaceC11914e) mo2788p;
                } else {
                    interfaceC11914e = null;
                }
                if (interfaceC11914e == null || !C11919f0.m6716a(interfaceC11914e) || interfaceC11914e.mo4175g() == EnumC11918f.ENUM_ENTRY || interfaceC11914e.mo4175g() == EnumC11918f.ANNOTATION_CLASS) {
                    return false;
                }
                return true;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: J */
        public static boolean m20351J(InterfaceC7582b interfaceC7582b, InterfaceC10205n receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof InterfaceC7265g1) {
                return ((InterfaceC7265g1) receiver).mo2787q();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: K */
        public static boolean m20350K(InterfaceC7582b interfaceC7582b, InterfaceC10200i receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof AbstractC7264g0) {
                return C7276i0.m21083a((AbstractC7264g0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: L */
        public static boolean m20349L(InterfaceC7582b interfaceC7582b, InterfaceC10205n receiver) {
            InterfaceC11914e interfaceC11914e;
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof InterfaceC7265g1) {
                InterfaceC11927h mo2788p = ((InterfaceC7265g1) receiver).mo2788p();
                AbstractC11930h1<AbstractC7302o0> abstractC11930h1 = null;
                if (mo2788p instanceof InterfaceC11914e) {
                    interfaceC11914e = (InterfaceC11914e) mo2788p;
                } else {
                    interfaceC11914e = null;
                }
                if (interfaceC11914e != null) {
                    abstractC11930h1 = interfaceC11914e.mo4179R();
                }
                return abstractC11930h1 instanceof C12004z;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: M */
        public static boolean m20348M(InterfaceC7582b interfaceC7582b, InterfaceC10205n receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof InterfaceC7265g1) {
                return receiver instanceof C13312n;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: N */
        public static boolean m20347N(InterfaceC7582b interfaceC7582b, InterfaceC10205n receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof InterfaceC7265g1) {
                return receiver instanceof C7239f0;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: O */
        public static boolean m20346O(InterfaceC7582b interfaceC7582b, InterfaceC10202k receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof AbstractC7302o0) {
                return ((AbstractC7302o0) receiver).mo3563O0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: P */
        public static boolean m20345P(InterfaceC7582b interfaceC7582b, InterfaceC10200i receiver) {
            C9612q.m13917h(receiver, "$receiver");
            return receiver instanceof InterfaceC7290l0;
        }

        /* renamed from: Q */
        public static boolean m20344Q(InterfaceC7582b interfaceC7582b, InterfaceC10205n receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof InterfaceC7265g1) {
                return AbstractC10870h.m9784v0((InterfaceC7265g1) receiver, C10884k.C10885a.f28474c);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: R */
        public static boolean m20343R(InterfaceC7582b interfaceC7582b, InterfaceC10200i receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof AbstractC7264g0) {
                return C7320s1.m20983l((AbstractC7264g0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: S */
        public static boolean m20342S(InterfaceC7582b interfaceC7582b, InterfaceC10195d receiver) {
            C9612q.m13917h(receiver, "$receiver");
            return receiver instanceof C12973a;
        }

        /* renamed from: T */
        public static boolean m20341T(InterfaceC7582b interfaceC7582b, InterfaceC10202k receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof AbstractC7264g0) {
                return AbstractC10870h.m9791r0((AbstractC7264g0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: U */
        public static boolean m20340U(InterfaceC7582b interfaceC7582b, InterfaceC10195d receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof C7595i) {
                return ((C7595i) receiver).m20269Z0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: V */
        public static boolean m20339V(InterfaceC7582b interfaceC7582b, InterfaceC10202k receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof AbstractC7302o0) {
                if (!C7276i0.m21083a((AbstractC7264g0) receiver)) {
                    AbstractC7302o0 abstractC7302o0 = (AbstractC7302o0) receiver;
                    if (!(abstractC7302o0.mo3564N0().mo2788p() instanceof InterfaceC11917e1) && (abstractC7302o0.mo3564N0().mo2788p() != null || (receiver instanceof C12973a) || (receiver instanceof C7595i) || (receiver instanceof C7304p) || (abstractC7302o0.mo3564N0() instanceof C13312n) || m20338W(interfaceC7582b, receiver))) {
                        return true;
                    }
                }
                return false;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: W */
        private static boolean m20338W(InterfaceC7582b interfaceC7582b, InterfaceC10202k interfaceC10202k) {
            return (interfaceC10202k instanceof C7316r0) && interfaceC7582b.mo3978e(((C7316r0) interfaceC10202k).mo20963G0());
        }

        /* renamed from: X */
        public static boolean m20337X(InterfaceC7582b interfaceC7582b, InterfaceC10204m receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof InterfaceC7288k1) {
                return ((InterfaceC7288k1) receiver).mo20955a();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: Y */
        public static boolean m20336Y(InterfaceC7582b interfaceC7582b, InterfaceC10202k receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof AbstractC7302o0) {
                return C10472a.m11444n((AbstractC7264g0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: Z */
        public static boolean m20335Z(InterfaceC7582b interfaceC7582b, InterfaceC10202k receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof AbstractC7302o0) {
                return C10472a.m11443o((AbstractC7264g0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: a */
        public static boolean m20334a(InterfaceC7582b interfaceC7582b, InterfaceC10205n c1, InterfaceC10205n c2) {
            C9612q.m13917h(c1, "c1");
            C9612q.m13917h(c2, "c2");
            if (c1 instanceof InterfaceC7265g1) {
                if (c2 instanceof InterfaceC7265g1) {
                    return C9612q.m13922c(c1, c2);
                }
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c2 + ", " + C9591f0.m13969b(c2.getClass())).toString());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c1 + ", " + C9591f0.m13969b(c1.getClass())).toString());
        }

        /* renamed from: a0 */
        public static boolean m20333a0(InterfaceC7582b interfaceC7582b, InterfaceC10200i receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if ((receiver instanceof AbstractC7333v1) && (((AbstractC7333v1) receiver).mo3564N0() instanceof InterfaceC7605n)) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public static int m20332b(InterfaceC7582b interfaceC7582b, InterfaceC10200i receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof AbstractC7264g0) {
                return ((AbstractC7264g0) receiver).mo3566L0().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: b0 */
        public static boolean m20331b0(InterfaceC7582b interfaceC7582b, InterfaceC10205n receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof InterfaceC7265g1) {
                InterfaceC11927h mo2788p = ((InterfaceC7265g1) receiver).mo2788p();
                if (mo2788p == null || !AbstractC10870h.m9853A0(mo2788p)) {
                    return false;
                }
                return true;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: c */
        public static InterfaceC10203l m20330c(InterfaceC7582b interfaceC7582b, InterfaceC10202k receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof AbstractC7302o0) {
                return (InterfaceC10203l) receiver;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: c0 */
        public static InterfaceC10202k m20329c0(InterfaceC7582b interfaceC7582b, InterfaceC10198g receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof AbstractC7217a0) {
                return ((AbstractC7217a0) receiver).m21218V0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: d */
        public static InterfaceC10195d m20328d(InterfaceC7582b interfaceC7582b, InterfaceC10202k receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof AbstractC7302o0) {
                if (receiver instanceof C7316r0) {
                    return interfaceC7582b.mo3976f(((C7316r0) receiver).mo20963G0());
                }
                if (receiver instanceof C7595i) {
                    return (C7595i) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: d0 */
        public static InterfaceC10200i m20327d0(InterfaceC7582b interfaceC7582b, InterfaceC10195d receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof C7595i) {
                return ((C7595i) receiver).m20270Y0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: e */
        public static InterfaceC10196e m20326e(InterfaceC7582b interfaceC7582b, InterfaceC10202k receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof AbstractC7302o0) {
                if (receiver instanceof C7304p) {
                    return (C7304p) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: e0 */
        public static InterfaceC10200i m20325e0(InterfaceC7582b interfaceC7582b, InterfaceC10200i receiver) {
            AbstractC7333v1 m20289b;
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof AbstractC7333v1) {
                m20289b = C7585c.m20289b((AbstractC7333v1) receiver);
                return m20289b;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: f */
        public static InterfaceC10197f m20324f(InterfaceC7582b interfaceC7582b, InterfaceC10198g receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof AbstractC7217a0) {
                if (receiver instanceof C7330v) {
                    return (C7330v) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: f0 */
        public static C7244f1 m20323f0(InterfaceC7582b interfaceC7582b, boolean z, boolean z2) {
            return C7581a.m20361b(z, z2, interfaceC7582b, null, null, 24, null);
        }

        /* renamed from: g */
        public static InterfaceC10198g m20322g(InterfaceC7582b interfaceC7582b, InterfaceC10200i receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof AbstractC7264g0) {
                AbstractC7333v1 mo20916Q0 = ((AbstractC7264g0) receiver).mo20916Q0();
                if (mo20916Q0 instanceof AbstractC7217a0) {
                    return (AbstractC7217a0) mo20916Q0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: g0 */
        public static InterfaceC10202k m20321g0(InterfaceC7582b interfaceC7582b, InterfaceC10196e receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof C7304p) {
                return ((C7304p) receiver).m21040Z0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: h */
        public static InterfaceC10201j m20320h(InterfaceC7582b interfaceC7582b, InterfaceC10198g receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof AbstractC7217a0) {
                if (receiver instanceof InterfaceC7296n0) {
                    return (InterfaceC7296n0) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: h0 */
        public static int m20319h0(InterfaceC7582b interfaceC7582b, InterfaceC10205n receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof InterfaceC7265g1) {
                return ((InterfaceC7265g1) receiver).getParameters().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: i */
        public static InterfaceC10202k m20318i(InterfaceC7582b interfaceC7582b, InterfaceC10200i receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof AbstractC7264g0) {
                AbstractC7333v1 mo20916Q0 = ((AbstractC7264g0) receiver).mo20916Q0();
                if (mo20916Q0 instanceof AbstractC7302o0) {
                    return (AbstractC7302o0) mo20916Q0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: i0 */
        public static Collection<InterfaceC10200i> m20317i0(InterfaceC7582b interfaceC7582b, InterfaceC10202k receiver) {
            C9612q.m13917h(receiver, "$receiver");
            InterfaceC10205n mo3974g = interfaceC7582b.mo3974g(receiver);
            if (mo3974g instanceof C13312n) {
                return ((C13312n) mo3974g).m2803g();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: j */
        public static InterfaceC10204m m20316j(InterfaceC7582b interfaceC7582b, InterfaceC10200i receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof AbstractC7264g0) {
                return C10472a.m11457a((AbstractC7264g0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: j0 */
        public static InterfaceC10204m m20315j0(InterfaceC7582b interfaceC7582b, InterfaceC10194c receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof C7596j) {
                return ((C7596j) receiver).mo3552b();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: k */
        public static InterfaceC10202k m20314k(InterfaceC7582b interfaceC7582b, InterfaceC10202k type, EnumC10193b status) {
            C9612q.m13917h(type, "type");
            C9612q.m13917h(status, "status");
            if (type instanceof AbstractC7302o0) {
                return C7601k.m20260b((AbstractC7302o0) type, status);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + type + ", " + C9591f0.m13969b(type.getClass())).toString());
        }

        /* renamed from: k0 */
        public static C7244f1.AbstractC7248c m20313k0(InterfaceC7582b interfaceC7582b, InterfaceC10202k type) {
            C9612q.m13917h(type, "type");
            if (type instanceof AbstractC7302o0) {
                return new C7584a(interfaceC7582b, AbstractC7272h1.f19700c.m21088a((AbstractC7264g0) type).m21051c());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + type + ", " + C9591f0.m13969b(type.getClass())).toString());
        }

        /* renamed from: l */
        public static EnumC10193b m20312l(InterfaceC7582b interfaceC7582b, InterfaceC10195d receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof C7595i) {
                return ((C7595i) receiver).m20272W0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: l0 */
        public static Collection<InterfaceC10200i> m20311l0(InterfaceC7582b interfaceC7582b, InterfaceC10205n receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof InterfaceC7265g1) {
                Collection<AbstractC7264g0> mo2791m = ((InterfaceC7265g1) receiver).mo2791m();
                C9612q.m13918g(mo2791m, "this.supertypes");
                return mo2791m;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: m */
        public static InterfaceC10200i m20310m(InterfaceC7582b interfaceC7582b, InterfaceC10202k lowerBound, InterfaceC10202k upperBound) {
            C9612q.m13917h(lowerBound, "lowerBound");
            C9612q.m13917h(upperBound, "upperBound");
            if (lowerBound instanceof AbstractC7302o0) {
                if (upperBound instanceof AbstractC7302o0) {
                    return C7267h0.m21104d((AbstractC7302o0) lowerBound, (AbstractC7302o0) upperBound);
                }
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC7582b + ", " + C9591f0.m13969b(interfaceC7582b.getClass())).toString());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + interfaceC7582b + ", " + C9591f0.m13969b(interfaceC7582b.getClass())).toString());
        }

        /* renamed from: m0 */
        public static InterfaceC10194c m20309m0(InterfaceC7582b interfaceC7582b, InterfaceC10195d receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof C7595i) {
                return ((C7595i) receiver).mo3564N0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: n */
        public static InterfaceC10204m m20308n(InterfaceC7582b interfaceC7582b, InterfaceC10200i receiver, int i) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof AbstractC7264g0) {
                return ((AbstractC7264g0) receiver).mo3566L0().get(i);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: n0 */
        public static InterfaceC10205n m20307n0(InterfaceC7582b interfaceC7582b, InterfaceC10202k receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof AbstractC7302o0) {
                return ((AbstractC7302o0) receiver).mo3564N0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: o */
        public static List<InterfaceC10204m> m20306o(InterfaceC7582b interfaceC7582b, InterfaceC10200i receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof AbstractC7264g0) {
                return ((AbstractC7264g0) receiver).mo3566L0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: o0 */
        public static InterfaceC10202k m20305o0(InterfaceC7582b interfaceC7582b, InterfaceC10198g receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof AbstractC7217a0) {
                return ((AbstractC7217a0) receiver).m21217W0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: p */
        public static C11634d m20304p(InterfaceC7582b interfaceC7582b, InterfaceC10205n receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof InterfaceC7265g1) {
                InterfaceC11927h mo2788p = ((InterfaceC7265g1) receiver).mo2788p();
                C9612q.m13919f(mo2788p, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return C13801c.m1502m((InterfaceC11914e) mo2788p);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: p0 */
        public static InterfaceC10200i m20303p0(InterfaceC7582b interfaceC7582b, InterfaceC10200i receiver, boolean z) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof InterfaceC10202k) {
                return interfaceC7582b.mo3980d((InterfaceC10202k) receiver, z);
            }
            if (receiver instanceof InterfaceC10198g) {
                InterfaceC10198g interfaceC10198g = (InterfaceC10198g) receiver;
                return interfaceC7582b.mo4015D(interfaceC7582b.mo3980d(interfaceC7582b.mo3984b(interfaceC10198g), z), interfaceC7582b.mo3980d(interfaceC7582b.mo3982c(interfaceC10198g), z));
            }
            throw new IllegalStateException("sealed".toString());
        }

        /* renamed from: q */
        public static InterfaceC10206o m20302q(InterfaceC7582b interfaceC7582b, InterfaceC10205n receiver, int i) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof InterfaceC7265g1) {
                InterfaceC11920f1 interfaceC11920f1 = ((InterfaceC7265g1) receiver).getParameters().get(i);
                C9612q.m13918g(interfaceC11920f1, "this.parameters[index]");
                return interfaceC11920f1;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: q0 */
        public static InterfaceC10202k m20301q0(InterfaceC7582b interfaceC7582b, InterfaceC10202k receiver, boolean z) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof AbstractC7302o0) {
                return ((AbstractC7302o0) receiver).mo3558U0(z);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: r */
        public static List<InterfaceC10206o> m20300r(InterfaceC7582b interfaceC7582b, InterfaceC10205n receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof InterfaceC7265g1) {
                List<InterfaceC11920f1> parameters = ((InterfaceC7265g1) receiver).getParameters();
                C9612q.m13918g(parameters, "this.parameters");
                return parameters;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: s */
        public static EnumC10876i m20299s(InterfaceC7582b interfaceC7582b, InterfaceC10205n receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof InterfaceC7265g1) {
                InterfaceC11927h mo2788p = ((InterfaceC7265g1) receiver).mo2788p();
                C9612q.m13919f(mo2788p, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return AbstractC10870h.m9836P((InterfaceC11914e) mo2788p);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: t */
        public static EnumC10876i m20298t(InterfaceC7582b interfaceC7582b, InterfaceC10205n receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof InterfaceC7265g1) {
                InterfaceC11927h mo2788p = ((InterfaceC7265g1) receiver).mo2788p();
                C9612q.m13919f(mo2788p, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return AbstractC10870h.m9833S((InterfaceC11914e) mo2788p);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: u */
        public static InterfaceC10200i m20297u(InterfaceC7582b interfaceC7582b, InterfaceC10206o receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof InterfaceC11920f1) {
                return C10472a.m11448j((InterfaceC11920f1) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: v */
        public static InterfaceC10200i m20296v(InterfaceC7582b interfaceC7582b, InterfaceC10204m receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof InterfaceC7288k1) {
                return ((InterfaceC7288k1) receiver).getType().mo20916Q0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: w */
        public static InterfaceC10206o m20295w(InterfaceC7582b interfaceC7582b, InterfaceC10212t receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof InterfaceC7605n) {
                return ((InterfaceC7605n) receiver).m20250a();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: x */
        public static InterfaceC10206o m20294x(InterfaceC7582b interfaceC7582b, InterfaceC10205n receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof InterfaceC7265g1) {
                InterfaceC11927h mo2788p = ((InterfaceC7265g1) receiver).mo2788p();
                if (mo2788p instanceof InterfaceC11920f1) {
                    return (InterfaceC11920f1) mo2788p;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: y */
        public static InterfaceC10200i m20293y(InterfaceC7582b interfaceC7582b, InterfaceC10200i receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof AbstractC7264g0) {
                return C12762g.m4081e((AbstractC7264g0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }

        /* renamed from: z */
        public static List<InterfaceC10200i> m20292z(InterfaceC7582b interfaceC7582b, InterfaceC10206o receiver) {
            C9612q.m13917h(receiver, "$receiver");
            if (receiver instanceof InterfaceC11920f1) {
                List<AbstractC7264g0> upperBounds = ((InterfaceC11920f1) receiver).getUpperBounds();
                C9612q.m13918g(upperBounds, "this.upperBounds");
                return upperBounds;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + C9591f0.m13969b(receiver.getClass())).toString());
        }
    }

    /* renamed from: D */
    InterfaceC10200i mo4015D(InterfaceC10202k interfaceC10202k, InterfaceC10202k interfaceC10202k2);

    @Override // li.InterfaceC10207p
    /* renamed from: a */
    InterfaceC10202k mo3986a(InterfaceC10200i interfaceC10200i);

    @Override // li.InterfaceC10207p
    /* renamed from: b */
    InterfaceC10202k mo3984b(InterfaceC10198g interfaceC10198g);

    @Override // li.InterfaceC10207p
    /* renamed from: c */
    InterfaceC10202k mo3982c(InterfaceC10198g interfaceC10198g);

    @Override // li.InterfaceC10207p
    /* renamed from: d */
    InterfaceC10202k mo3980d(InterfaceC10202k interfaceC10202k, boolean z);

    @Override // li.InterfaceC10207p
    /* renamed from: e */
    boolean mo3978e(InterfaceC10202k interfaceC10202k);

    @Override // li.InterfaceC10207p
    /* renamed from: f */
    InterfaceC10195d mo3976f(InterfaceC10202k interfaceC10202k);

    @Override // li.InterfaceC10207p
    /* renamed from: g */
    InterfaceC10205n mo3974g(InterfaceC10202k interfaceC10202k);
}
