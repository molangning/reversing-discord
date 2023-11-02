package p254o1;

import p073e1.C6062k;
import p188k1.C9044h;
import p206l1.C10024q;
import p275p1.AbstractC11368c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o1.k0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10956k0 {

    /* renamed from: a */
    static AbstractC11368c.C11369a f28737a = AbstractC11368c.C11369a.m8241a("nm", "ind", "ks", "hd");

    /* renamed from: a */
    public static C10024q m9472a(AbstractC11368c abstractC11368c, C6062k c6062k) {
        String str = null;
        int i = 0;
        boolean z = false;
        C9044h c9044h = null;
        while (abstractC11368c.mo8216q()) {
            int mo8226R = abstractC11368c.mo8226R(f28737a);
            if (mo8226R != 0) {
                if (mo8226R != 1) {
                    if (mo8226R != 2) {
                        if (mo8226R != 3) {
                            abstractC11368c.mo8224U();
                        } else {
                            z = abstractC11368c.mo8215s();
                        }
                    } else {
                        c9044h = C10941d.m9493k(abstractC11368c, c6062k);
                    }
                } else {
                    i = abstractC11368c.mo8212v();
                }
            } else {
                str = abstractC11368c.mo8234D();
            }
        }
        return new C10024q(str, i, c9044h, z);
    }
}