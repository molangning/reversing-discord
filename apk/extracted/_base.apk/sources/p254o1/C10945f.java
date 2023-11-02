package p254o1;

import android.graphics.PointF;
import p073e1.C6062k;
import p188k1.C9042f;
import p188k1.InterfaceC9049m;
import p206l1.C10006b;
import p275p1.AbstractC11368c;

/* renamed from: o1.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C10945f {

    /* renamed from: a */
    private static final AbstractC11368c.C11369a f28714a = AbstractC11368c.C11369a.m8241a("nm", "p", "s", "hd", "d");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C10006b m9488a(AbstractC11368c abstractC11368c, C6062k c6062k, int i) {
        boolean z;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        boolean z3 = false;
        String str = null;
        InterfaceC9049m<PointF, PointF> interfaceC9049m = null;
        C9042f c9042f = null;
        while (abstractC11368c.mo8216q()) {
            int mo8226R = abstractC11368c.mo8226R(f28714a);
            if (mo8226R != 0) {
                if (mo8226R != 1) {
                    if (mo8226R != 2) {
                        if (mo8226R != 3) {
                            if (mo8226R != 4) {
                                abstractC11368c.mo8225S();
                                abstractC11368c.mo8224U();
                            } else if (abstractC11368c.mo8212v() == 3) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z3 = abstractC11368c.mo8215s();
                        }
                    } else {
                        c9042f = C10941d.m9495i(abstractC11368c, c6062k);
                    }
                } else {
                    interfaceC9049m = C10935a.m9516b(abstractC11368c, c6062k);
                }
            } else {
                str = abstractC11368c.mo8234D();
            }
        }
        return new C10006b(str, interfaceC9049m, c9042f, z2, z3);
    }
}
