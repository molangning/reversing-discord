package p254o1;

import p073e1.C6062k;
import p188k1.C9038b;
import p188k1.C9048l;
import p206l1.C10019l;
import p275p1.AbstractC11368c;

/* renamed from: o1.e0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C10944e0 {

    /* renamed from: a */
    private static final AbstractC11368c.C11369a f28713a = AbstractC11368c.C11369a.m8241a("nm", "c", "o", "tr", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C10019l m9489a(AbstractC11368c abstractC11368c, C6062k c6062k) {
        String str = null;
        C9038b c9038b = null;
        C9038b c9038b2 = null;
        C9048l c9048l = null;
        boolean z = false;
        while (abstractC11368c.mo8216q()) {
            int mo8226R = abstractC11368c.mo8226R(f28713a);
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
                            c9048l = C10939c.m9505g(abstractC11368c, c6062k);
                        }
                    } else {
                        c9038b2 = C10941d.m9498f(abstractC11368c, c6062k, false);
                    }
                } else {
                    c9038b = C10941d.m9498f(abstractC11368c, c6062k, false);
                }
            } else {
                str = abstractC11368c.mo8234D();
            }
        }
        return new C10019l(str, c9038b, c9038b2, c9048l, z);
    }
}
