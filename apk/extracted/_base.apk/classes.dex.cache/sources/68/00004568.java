package p254o1;

import p073e1.C6062k;
import p206l1.C10005a;
import p275p1.AbstractC11368c;

/* renamed from: o1.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10943e {

    /* renamed from: a */
    private static final AbstractC11368c.C11369a f28711a = AbstractC11368c.C11369a.m8241a("ef");

    /* renamed from: b */
    private static final AbstractC11368c.C11369a f28712b = AbstractC11368c.C11369a.m8241a("ty", "v");

    /* renamed from: a */
    private static C10005a m9491a(AbstractC11368c abstractC11368c, C6062k c6062k) {
        abstractC11368c.mo8220i();
        C10005a c10005a = null;
        while (true) {
            boolean z = false;
            while (abstractC11368c.mo8216q()) {
                int mo8226R = abstractC11368c.mo8226R(f28712b);
                if (mo8226R != 0) {
                    if (mo8226R != 1) {
                        abstractC11368c.mo8225S();
                        abstractC11368c.mo8224U();
                    } else if (z) {
                        c10005a = new C10005a(C10941d.m9499e(abstractC11368c, c6062k));
                    } else {
                        abstractC11368c.mo8224U();
                    }
                } else if (abstractC11368c.mo8212v() == 0) {
                    z = true;
                }
            }
            abstractC11368c.mo8217m();
            return c10005a;
        }
    }

    /* renamed from: b */
    public static C10005a m9490b(AbstractC11368c abstractC11368c, C6062k c6062k) {
        C10005a c10005a = null;
        while (abstractC11368c.mo8216q()) {
            if (abstractC11368c.mo8226R(f28711a) != 0) {
                abstractC11368c.mo8225S();
                abstractC11368c.mo8224U();
            } else {
                abstractC11368c.mo8221h();
                while (abstractC11368c.mo8216q()) {
                    C10005a m9491a = m9491a(abstractC11368c, c6062k);
                    if (m9491a != null) {
                        c10005a = m9491a;
                    }
                }
                abstractC11368c.mo8219j();
            }
        }
        return c10005a;
    }
}