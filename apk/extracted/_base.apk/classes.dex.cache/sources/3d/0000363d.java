package p141hh;

import java.util.List;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import p142hi.AbstractC7264g0;
import p161ii.C7608q;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11927h;
import p325rg.C12163k;
import p325rg.InterfaceC12155g;
import p468zg.C14208b0;
import pg.C11601d;
import ph.C11633c;

/* renamed from: hh.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C7213r {

    /* renamed from: a */
    private static final InterfaceC12155g f19609a;

    /* renamed from: b */
    private static final C7160c f19610b;

    /* renamed from: hh.r$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public /* synthetic */ class C7214a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19611a;

        static {
            int[] iArr = new int[EnumC7168h.values().length];
            try {
                iArr[EnumC7168h.NULLABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7168h.NOT_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f19611a = iArr;
        }
    }

    static {
        C11633c ENHANCED_NULLABILITY_ANNOTATION = C14208b0.f36552u;
        C9612q.m13918g(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        f19609a = new C7160c(ENHANCED_NULLABILITY_ANNOTATION);
        C11633c ENHANCED_MUTABILITY_ANNOTATION = C14208b0.f36553v;
        C9612q.m13918g(ENHANCED_MUTABILITY_ANNOTATION, "ENHANCED_MUTABILITY_ANNOTATION");
        f19610b = new C7160c(ENHANCED_MUTABILITY_ANNOTATION);
    }

    /* renamed from: e */
    public static final InterfaceC12155g m21233e(List<? extends InterfaceC12155g> list) {
        Object m14033q0;
        List m14075C0;
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                m14075C0 = C9553r.m14075C0(list);
                return new C12163k(m14075C0);
            }
            m14033q0 = C9553r.m14033q0(list);
            return (InterfaceC12155g) m14033q0;
        }
        throw new IllegalStateException("At least one Annotations object expected".toString());
    }

    /* renamed from: f */
    public static final InterfaceC11927h m21232f(InterfaceC11927h interfaceC11927h, C7164e c7164e, EnumC7210o enumC7210o) {
        C11601d c11601d = C11601d.f30130a;
        if (!C7211p.m21239a(enumC7210o) || !(interfaceC11927h instanceof InterfaceC11914e)) {
            return null;
        }
        if (c7164e.m21332c() == EnumC7166f.READ_ONLY && enumC7210o == EnumC7210o.FLEXIBLE_LOWER) {
            InterfaceC11914e interfaceC11914e = (InterfaceC11914e) interfaceC11927h;
            if (c11601d.m7542c(interfaceC11914e)) {
                return c11601d.m7544a(interfaceC11914e);
            }
        }
        if (c7164e.m21332c() != EnumC7166f.MUTABLE || enumC7210o != EnumC7210o.FLEXIBLE_UPPER) {
            return null;
        }
        InterfaceC11914e interfaceC11914e2 = (InterfaceC11914e) interfaceC11927h;
        if (!c11601d.m7541d(interfaceC11914e2)) {
            return null;
        }
        return c11601d.m7543b(interfaceC11914e2);
    }

    /* renamed from: g */
    public static final InterfaceC12155g m21231g() {
        return f19609a;
    }

    /* renamed from: h */
    public static final Boolean m21230h(C7164e c7164e, EnumC7210o enumC7210o) {
        int i;
        if (!C7211p.m21239a(enumC7210o)) {
            return null;
        }
        EnumC7168h m21331d = c7164e.m21331d();
        if (m21331d == null) {
            i = -1;
        } else {
            i = C7214a.f19611a[m21331d.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    /* renamed from: i */
    public static final boolean m21229i(AbstractC7264g0 abstractC7264g0) {
        C9612q.m13917h(abstractC7264g0, "<this>");
        return C7215s.m21226c(C7608q.f20908a, abstractC7264g0);
    }
}