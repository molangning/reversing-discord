package p254o1;

import android.graphics.Path;
import java.util.Collections;
import p073e1.C6062k;
import p188k1.C9037a;
import p188k1.C9040d;
import p206l1.C10022o;
import p275p1.AbstractC11368c;
import p311r1.C12020a;

/* renamed from: o1.i0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C10952i0 {

    /* renamed from: a */
    private static final AbstractC11368c.C11369a f28723a = AbstractC11368c.C11369a.m8241a("nm", "c", "o", "fillEnabled", "r", "hd");

    /* renamed from: a */
    public static C10022o m9481a(AbstractC11368c abstractC11368c, C6062k c6062k) {
        Path.FillType fillType;
        C9040d c9040d = null;
        String str = null;
        C9037a c9037a = null;
        boolean z = false;
        boolean z2 = false;
        int i = 1;
        while (abstractC11368c.mo8216q()) {
            int mo8226R = abstractC11368c.mo8226R(f28723a);
            if (mo8226R != 0) {
                if (mo8226R != 1) {
                    if (mo8226R != 2) {
                        if (mo8226R != 3) {
                            if (mo8226R != 4) {
                                if (mo8226R != 5) {
                                    abstractC11368c.mo8225S();
                                    abstractC11368c.mo8224U();
                                } else {
                                    z2 = abstractC11368c.mo8215s();
                                }
                            } else {
                                i = abstractC11368c.mo8212v();
                            }
                        } else {
                            z = abstractC11368c.mo8215s();
                        }
                    } else {
                        c9040d = C10941d.m9496h(abstractC11368c, c6062k);
                    }
                } else {
                    c9037a = C10941d.m9501c(abstractC11368c, c6062k);
                }
            } else {
                str = abstractC11368c.mo8234D();
            }
        }
        if (c9040d == null) {
            c9040d = new C9040d(Collections.singletonList(new C12020a(100)));
        }
        C9040d c9040d2 = c9040d;
        if (i == 1) {
            fillType = Path.FillType.WINDING;
        } else {
            fillType = Path.FillType.EVEN_ODD;
        }
        return new C10022o(str, z, fillType, c9037a, c9040d2, z2);
    }
}