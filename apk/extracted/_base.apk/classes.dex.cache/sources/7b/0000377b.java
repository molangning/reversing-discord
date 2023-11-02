package p160ih;

import kh.C9425n;
import kotlin.jvm.internal.C9612q;
import mh.C10466e;
import mh.C10468g;
import mh.InterfaceC10463c;
import p160ih.C7572u;
import p250nh.C10890a;
import p270oh.AbstractC11112d;
import p270oh.C11122i;
import p326rh.AbstractC12188i;

/* renamed from: ih.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C7530c {
    /* renamed from: a */
    public static final C7572u m20486a(C9425n proto, InterfaceC10463c nameResolver, C10468g typeTable, boolean z, boolean z2, boolean z3) {
        C9612q.m13917h(proto, "proto");
        C9612q.m13917h(nameResolver, "nameResolver");
        C9612q.m13917h(typeTable, "typeTable");
        AbstractC12188i.C12195f<C9425n, C10890a.C10898d> propertySignature = C10890a.f28548d;
        C9612q.m13918g(propertySignature, "propertySignature");
        C10890a.C10898d c10898d = (C10890a.C10898d) C10466e.m11485a(proto, propertySignature);
        if (c10898d == null) {
            return null;
        }
        if (z) {
            AbstractC11112d.C11113a m9131c = C11122i.f29099a.m9131c(proto, nameResolver, typeTable, z3);
            if (m9131c == null) {
                return null;
            }
            return C7572u.f20873b.m20392b(m9131c);
        } else if (!z2 || !c10898d.m9674J()) {
            return null;
        } else {
            C7572u.C7573a c7573a = C7572u.f20873b;
            C10890a.C10895c m9679E = c10898d.m9679E();
            C9612q.m13918g(m9679E, "signature.syntheticMethod");
            return c7573a.m20391c(nameResolver, m9679E);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ C7572u m20485b(C9425n c9425n, InterfaceC10463c interfaceC10463c, C10468g c10468g, boolean z, boolean z2, boolean z3, int i, Object obj) {
        boolean z4 = (i & 8) != 0 ? false : z;
        boolean z5 = (i & 16) != 0 ? false : z2;
        if ((i & 32) != 0) {
            z3 = true;
        }
        return m20486a(c9425n, interfaceC10463c, c10468g, z4, z5, z3);
    }
}