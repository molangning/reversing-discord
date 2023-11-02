package p254o1;

import p073e1.C6062k;
import p188k1.C9037a;
import p188k1.C9038b;
import p188k1.C9047k;
import p275p1.AbstractC11368c;

/* renamed from: o1.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10937b {

    /* renamed from: a */
    private static final AbstractC11368c.C11369a f28704a = AbstractC11368c.C11369a.m8241a("a");

    /* renamed from: b */
    private static final AbstractC11368c.C11369a f28705b = AbstractC11368c.C11369a.m8241a("fc", "sc", "sw", "t");

    /* renamed from: a */
    public static C9047k m9514a(AbstractC11368c abstractC11368c, C6062k c6062k) {
        abstractC11368c.mo8220i();
        C9047k c9047k = null;
        while (abstractC11368c.mo8216q()) {
            if (abstractC11368c.mo8226R(f28704a) != 0) {
                abstractC11368c.mo8225S();
                abstractC11368c.mo8224U();
            } else {
                c9047k = m9513b(abstractC11368c, c6062k);
            }
        }
        abstractC11368c.mo8217m();
        if (c9047k == null) {
            return new C9047k(null, null, null, null);
        }
        return c9047k;
    }

    /* renamed from: b */
    private static C9047k m9513b(AbstractC11368c abstractC11368c, C6062k c6062k) {
        abstractC11368c.mo8220i();
        C9037a c9037a = null;
        C9037a c9037a2 = null;
        C9038b c9038b = null;
        C9038b c9038b2 = null;
        while (abstractC11368c.mo8216q()) {
            int mo8226R = abstractC11368c.mo8226R(f28705b);
            if (mo8226R != 0) {
                if (mo8226R != 1) {
                    if (mo8226R != 2) {
                        if (mo8226R != 3) {
                            abstractC11368c.mo8225S();
                            abstractC11368c.mo8224U();
                        } else {
                            c9038b2 = C10941d.m9499e(abstractC11368c, c6062k);
                        }
                    } else {
                        c9038b = C10941d.m9499e(abstractC11368c, c6062k);
                    }
                } else {
                    c9037a2 = C10941d.m9501c(abstractC11368c, c6062k);
                }
            } else {
                c9037a = C10941d.m9501c(abstractC11368c, c6062k);
            }
        }
        abstractC11368c.mo8217m();
        return new C9047k(c9037a, c9037a2, c9038b, c9038b2);
    }
}