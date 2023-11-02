package p254o1;

import java.util.ArrayList;
import java.util.Collections;
import p073e1.C6062k;
import p188k1.C9037a;
import p188k1.C9038b;
import p188k1.C9040d;
import p206l1.C10025r;
import p275p1.AbstractC11368c;
import p311r1.C12020a;

/* renamed from: o1.l0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10958l0 {

    /* renamed from: a */
    private static final AbstractC11368c.C11369a f28739a = AbstractC11368c.C11369a.m8241a("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b */
    private static final AbstractC11368c.C11369a f28740b = AbstractC11368c.C11369a.m8241a("n", "v");

    /* renamed from: a */
    public static C10025r m9470a(AbstractC11368c abstractC11368c, C6062k c6062k) {
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        boolean z = false;
        String str = null;
        C9038b c9038b = null;
        C9037a c9037a = null;
        C9038b c9038b2 = null;
        C9040d c9040d = null;
        C10025r.EnumC10027b enumC10027b = null;
        C10025r.EnumC10028c enumC10028c = null;
        while (abstractC11368c.mo8216q()) {
            switch (abstractC11368c.mo8226R(f28739a)) {
                case 0:
                    str = abstractC11368c.mo8234D();
                    break;
                case 1:
                    c9037a = C10941d.m9501c(abstractC11368c, c6062k);
                    break;
                case 2:
                    c9038b2 = C10941d.m9499e(abstractC11368c, c6062k);
                    break;
                case 3:
                    c9040d = C10941d.m9496h(abstractC11368c, c6062k);
                    break;
                case 4:
                    enumC10027b = C10025r.EnumC10027b.values()[abstractC11368c.mo8212v() - 1];
                    break;
                case 5:
                    enumC10028c = C10025r.EnumC10028c.values()[abstractC11368c.mo8212v() - 1];
                    break;
                case 6:
                    f = (float) abstractC11368c.mo8214t();
                    break;
                case 7:
                    z = abstractC11368c.mo8215s();
                    break;
                case 8:
                    abstractC11368c.mo8221h();
                    while (abstractC11368c.mo8216q()) {
                        abstractC11368c.mo8220i();
                        String str2 = null;
                        C9038b c9038b3 = null;
                        while (abstractC11368c.mo8216q()) {
                            int mo8226R = abstractC11368c.mo8226R(f28740b);
                            if (mo8226R != 0) {
                                if (mo8226R != 1) {
                                    abstractC11368c.mo8225S();
                                    abstractC11368c.mo8224U();
                                } else {
                                    c9038b3 = C10941d.m9499e(abstractC11368c, c6062k);
                                }
                            } else {
                                str2 = abstractC11368c.mo8234D();
                            }
                        }
                        abstractC11368c.mo8217m();
                        str2.hashCode();
                        char c = 65535;
                        switch (str2.hashCode()) {
                            case 100:
                                if (str2.equals("d")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 103:
                                if (str2.equals("g")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 111:
                                if (str2.equals("o")) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        switch (c) {
                            case 0:
                            case 1:
                                c6062k.m23656u(true);
                                arrayList.add(c9038b3);
                                break;
                            case 2:
                                c9038b = c9038b3;
                                break;
                        }
                    }
                    abstractC11368c.mo8219j();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add((C9038b) arrayList.get(0));
                        break;
                    }
                    break;
                default:
                    abstractC11368c.mo8224U();
                    break;
            }
        }
        if (c9040d == null) {
            c9040d = new C9040d(Collections.singletonList(new C12020a(100)));
        }
        if (enumC10027b == null) {
            enumC10027b = C10025r.EnumC10027b.BUTT;
        }
        if (enumC10028c == null) {
            enumC10028c = C10025r.EnumC10028c.MITER;
        }
        return new C10025r(str, c9038b, arrayList, c9037a, c9040d, c9038b2, enumC10027b, enumC10028c, f, z);
    }
}