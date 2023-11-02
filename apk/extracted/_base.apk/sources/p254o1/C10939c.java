package p254o1;

import android.graphics.PointF;
import p073e1.C6062k;
import p188k1.C9038b;
import p188k1.C9040d;
import p188k1.C9041e;
import p188k1.C9043g;
import p188k1.C9045i;
import p188k1.C9048l;
import p188k1.InterfaceC9049m;
import p275p1.AbstractC11368c;
import p311r1.C12020a;
import p311r1.C12023d;

/* renamed from: o1.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10939c {

    /* renamed from: a */
    private static final AbstractC11368c.C11369a f28707a = AbstractC11368c.C11369a.m8241a("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* renamed from: b */
    private static final AbstractC11368c.C11369a f28708b = AbstractC11368c.C11369a.m8241a("k");

    /* renamed from: a */
    private static boolean m9511a(C9041e c9041e) {
        return c9041e == null || (c9041e.mo16815g() && c9041e.mo16816b().get(0).f31016b.equals(0.0f, 0.0f));
    }

    /* renamed from: b */
    private static boolean m9510b(InterfaceC9049m<PointF, PointF> interfaceC9049m) {
        if (interfaceC9049m != null && ((interfaceC9049m instanceof C9045i) || !interfaceC9049m.mo16815g() || !interfaceC9049m.mo16816b().get(0).f31016b.equals(0.0f, 0.0f))) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m9509c(C9038b c9038b) {
        return c9038b == null || (c9038b.mo16815g() && ((Float) ((C12020a) c9038b.mo16816b().get(0)).f31016b).floatValue() == 0.0f);
    }

    /* renamed from: d */
    private static boolean m9508d(C9043g c9043g) {
        return c9043g == null || (c9043g.mo16815g() && ((C12023d) ((C12020a) c9043g.mo16816b().get(0)).f31016b).m6565a(1.0f, 1.0f));
    }

    /* renamed from: e */
    private static boolean m9507e(C9038b c9038b) {
        return c9038b == null || (c9038b.mo16815g() && ((Float) ((C12020a) c9038b.mo16816b().get(0)).f31016b).floatValue() == 0.0f);
    }

    /* renamed from: f */
    private static boolean m9506f(C9038b c9038b) {
        return c9038b == null || (c9038b.mo16815g() && ((Float) ((C12020a) c9038b.mo16816b().get(0)).f31016b).floatValue() == 0.0f);
    }

    /* renamed from: g */
    public static C9048l m9505g(AbstractC11368c abstractC11368c, C6062k c6062k) {
        boolean z;
        C9041e c9041e;
        InterfaceC9049m<PointF, PointF> interfaceC9049m;
        C9038b c9038b;
        C9038b c9038b2;
        C9038b c9038b3;
        boolean z2;
        boolean z3 = false;
        if (abstractC11368c.mo8228I() == AbstractC11368c.EnumC11370b.BEGIN_OBJECT) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            abstractC11368c.mo8220i();
        }
        C9038b c9038b4 = null;
        C9041e c9041e2 = null;
        InterfaceC9049m<PointF, PointF> interfaceC9049m2 = null;
        C9043g c9043g = null;
        C9038b c9038b5 = null;
        C9038b c9038b6 = null;
        C9040d c9040d = null;
        C9038b c9038b7 = null;
        C9038b c9038b8 = null;
        while (abstractC11368c.mo8216q()) {
            switch (abstractC11368c.mo8226R(f28707a)) {
                case 0:
                    boolean z4 = z3;
                    abstractC11368c.mo8220i();
                    while (abstractC11368c.mo8216q()) {
                        if (abstractC11368c.mo8226R(f28708b) != 0) {
                            abstractC11368c.mo8225S();
                            abstractC11368c.mo8224U();
                        } else {
                            c9041e2 = C10935a.m9517a(abstractC11368c, c6062k);
                        }
                    }
                    abstractC11368c.mo8217m();
                    z3 = z4;
                    continue;
                case 1:
                    interfaceC9049m2 = C10935a.m9516b(abstractC11368c, c6062k);
                    continue;
                case 2:
                    c9043g = C10941d.m9494j(abstractC11368c, c6062k);
                    continue;
                case 3:
                    c6062k.m23676a("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    c9040d = C10941d.m9496h(abstractC11368c, c6062k);
                    continue;
                case 6:
                    c9038b7 = C10941d.m9498f(abstractC11368c, c6062k, z3);
                    continue;
                case 7:
                    c9038b8 = C10941d.m9498f(abstractC11368c, c6062k, z3);
                    continue;
                case 8:
                    c9038b5 = C10941d.m9498f(abstractC11368c, c6062k, z3);
                    continue;
                case 9:
                    c9038b6 = C10941d.m9498f(abstractC11368c, c6062k, z3);
                    continue;
                default:
                    abstractC11368c.mo8225S();
                    abstractC11368c.mo8224U();
                    continue;
            }
            C9038b m9498f = C10941d.m9498f(abstractC11368c, c6062k, z3);
            if (m9498f.mo16816b().isEmpty()) {
                m9498f.mo16816b().add(new C12020a(c6062k, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(c6062k.m23671f())));
            } else if (((C12020a) m9498f.mo16816b().get(0)).f31016b == 0) {
                z2 = false;
                m9498f.mo16816b().set(0, new C12020a(c6062k, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(c6062k.m23671f())));
                z3 = z2;
                c9038b4 = m9498f;
            }
            z2 = false;
            z3 = z2;
            c9038b4 = m9498f;
        }
        if (z) {
            abstractC11368c.mo8217m();
        }
        if (m9511a(c9041e2)) {
            c9041e = null;
        } else {
            c9041e = c9041e2;
        }
        if (m9510b(interfaceC9049m2)) {
            interfaceC9049m = null;
        } else {
            interfaceC9049m = interfaceC9049m2;
        }
        if (m9509c(c9038b4)) {
            c9038b = null;
        } else {
            c9038b = c9038b4;
        }
        if (m9508d(c9043g)) {
            c9043g = null;
        }
        if (m9506f(c9038b5)) {
            c9038b2 = null;
        } else {
            c9038b2 = c9038b5;
        }
        if (m9507e(c9038b6)) {
            c9038b3 = null;
        } else {
            c9038b3 = c9038b6;
        }
        return new C9048l(c9041e, interfaceC9049m, c9043g, c9038b, c9040d, c9038b7, c9038b8, c9038b2, c9038b3);
    }
}
