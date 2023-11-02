package p254o1;

import p073e1.C6062k;
import p188k1.C9038b;
import p206l1.C10029s;
import p275p1.AbstractC11368c;

/* renamed from: o1.m0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C10960m0 {

    /* renamed from: a */
    private static final AbstractC11368c.C11369a f28743a = AbstractC11368c.C11369a.m8241a("s", "e", "o", "nm", "m", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C10029s m9468a(AbstractC11368c abstractC11368c, C6062k c6062k) {
        String str = null;
        C10029s.EnumC10030a enumC10030a = null;
        C9038b c9038b = null;
        C9038b c9038b2 = null;
        C9038b c9038b3 = null;
        boolean z = false;
        while (abstractC11368c.mo8216q()) {
            int mo8226R = abstractC11368c.mo8226R(f28743a);
            if (mo8226R != 0) {
                if (mo8226R != 1) {
                    if (mo8226R != 2) {
                        if (mo8226R != 3) {
                            if (mo8226R != 4) {
                                if (mo8226R != 5) {
                                    abstractC11368c.mo8224U();
                                } else {
                                    z = abstractC11368c.mo8215s();
                                }
                            } else {
                                enumC10030a = C10029s.EnumC10030a.m12515b(abstractC11368c.mo8212v());
                            }
                        } else {
                            str = abstractC11368c.mo8234D();
                        }
                    } else {
                        c9038b3 = C10941d.m9498f(abstractC11368c, c6062k, false);
                    }
                } else {
                    c9038b2 = C10941d.m9498f(abstractC11368c, c6062k, false);
                }
            } else {
                c9038b = C10941d.m9498f(abstractC11368c, c6062k, false);
            }
        }
        return new C10029s(str, enumC10030a, c9038b, c9038b2, c9038b3, z);
    }
}
