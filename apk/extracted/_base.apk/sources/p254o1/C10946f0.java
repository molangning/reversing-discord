package p254o1;

import p073e1.C6062k;
import p188k1.C9038b;
import p206l1.C10020m;
import p275p1.AbstractC11368c;

/* renamed from: o1.f0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10946f0 {

    /* renamed from: a */
    private static final AbstractC11368c.C11369a f28715a = AbstractC11368c.C11369a.m8241a("nm", "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C10020m m9487a(AbstractC11368c abstractC11368c, C6062k c6062k) {
        boolean z = false;
        String str = null;
        C9038b c9038b = null;
        while (abstractC11368c.mo8216q()) {
            int mo8226R = abstractC11368c.mo8226R(f28715a);
            if (mo8226R != 0) {
                if (mo8226R != 1) {
                    if (mo8226R != 2) {
                        abstractC11368c.mo8224U();
                    } else {
                        z = abstractC11368c.mo8215s();
                    }
                } else {
                    c9038b = C10941d.m9498f(abstractC11368c, c6062k, true);
                }
            } else {
                str = abstractC11368c.mo8234D();
            }
        }
        if (z) {
            return null;
        }
        return new C10020m(str, c9038b);
    }
}
