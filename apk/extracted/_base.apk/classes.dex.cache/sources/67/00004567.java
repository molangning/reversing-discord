package p254o1;

import android.graphics.PointF;
import p073e1.C6062k;
import p188k1.C9038b;
import p188k1.C9042f;
import p188k1.InterfaceC9049m;
import p206l1.C10018k;
import p275p1.AbstractC11368c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o1.d0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10942d0 {

    /* renamed from: a */
    private static final AbstractC11368c.C11369a f28710a = AbstractC11368c.C11369a.m8241a("nm", "p", "s", "r", "hd");

    /* renamed from: a */
    public static C10018k m9492a(AbstractC11368c abstractC11368c, C6062k c6062k) {
        String str = null;
        InterfaceC9049m<PointF, PointF> interfaceC9049m = null;
        C9042f c9042f = null;
        C9038b c9038b = null;
        boolean z = false;
        while (abstractC11368c.mo8216q()) {
            int mo8226R = abstractC11368c.mo8226R(f28710a);
            if (mo8226R != 0) {
                if (mo8226R != 1) {
                    if (mo8226R != 2) {
                        if (mo8226R != 3) {
                            if (mo8226R != 4) {
                                abstractC11368c.mo8224U();
                            } else {
                                z = abstractC11368c.mo8215s();
                            }
                        } else {
                            c9038b = C10941d.m9499e(abstractC11368c, c6062k);
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
        return new C10018k(str, interfaceC9049m, c9042f, c9038b, z);
    }
}