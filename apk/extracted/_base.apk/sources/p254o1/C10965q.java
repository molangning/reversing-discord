package p254o1;

import java.util.ArrayList;
import java.util.Collections;
import p073e1.C6062k;
import p188k1.C9038b;
import p188k1.C9039c;
import p188k1.C9040d;
import p188k1.C9042f;
import p206l1.C10010f;
import p206l1.C10025r;
import p206l1.EnumC10011g;
import p275p1.AbstractC11368c;
import p311r1.C12020a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o1.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10965q {

    /* renamed from: a */
    private static final AbstractC11368c.C11369a f28748a = AbstractC11368c.C11369a.m8241a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b */
    private static final AbstractC11368c.C11369a f28749b = AbstractC11368c.C11369a.m8241a("p", "k");

    /* renamed from: c */
    private static final AbstractC11368c.C11369a f28750c = AbstractC11368c.C11369a.m8241a("n", "v");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C10010f m9460a(AbstractC11368c abstractC11368c, C6062k c6062k) {
        String str;
        C9039c c9039c;
        EnumC10011g enumC10011g;
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        String str2 = null;
        EnumC10011g enumC10011g2 = null;
        C9039c c9039c2 = null;
        C9042f c9042f = null;
        C9042f c9042f2 = null;
        C9038b c9038b = null;
        C10025r.EnumC10027b enumC10027b = null;
        C10025r.EnumC10028c enumC10028c = null;
        C9038b c9038b2 = null;
        boolean z = false;
        C9040d c9040d = null;
        while (abstractC11368c.mo8216q()) {
            switch (abstractC11368c.mo8226R(f28748a)) {
                case 0:
                    str2 = abstractC11368c.mo8234D();
                    continue;
                case 1:
                    str = str2;
                    abstractC11368c.mo8220i();
                    int i = -1;
                    while (abstractC11368c.mo8216q()) {
                        int mo8226R = abstractC11368c.mo8226R(f28749b);
                        if (mo8226R != 0) {
                            c9039c = c9039c2;
                            if (mo8226R != 1) {
                                abstractC11368c.mo8225S();
                                abstractC11368c.mo8224U();
                            } else {
                                c9039c2 = C10941d.m9497g(abstractC11368c, c6062k, i);
                            }
                        } else {
                            c9039c = c9039c2;
                            i = abstractC11368c.mo8212v();
                        }
                        c9039c2 = c9039c;
                    }
                    abstractC11368c.mo8217m();
                    break;
                case 2:
                    c9040d = C10941d.m9496h(abstractC11368c, c6062k);
                    continue;
                case 3:
                    str = str2;
                    if (abstractC11368c.mo8212v() == 1) {
                        enumC10011g = EnumC10011g.LINEAR;
                    } else {
                        enumC10011g = EnumC10011g.RADIAL;
                    }
                    enumC10011g2 = enumC10011g;
                    break;
                case 4:
                    c9042f = C10941d.m9495i(abstractC11368c, c6062k);
                    continue;
                case 5:
                    c9042f2 = C10941d.m9495i(abstractC11368c, c6062k);
                    continue;
                case 6:
                    c9038b = C10941d.m9499e(abstractC11368c, c6062k);
                    continue;
                case 7:
                    str = str2;
                    enumC10027b = C10025r.EnumC10027b.values()[abstractC11368c.mo8212v() - 1];
                    break;
                case 8:
                    str = str2;
                    enumC10028c = C10025r.EnumC10028c.values()[abstractC11368c.mo8212v() - 1];
                    break;
                case 9:
                    str = str2;
                    f = (float) abstractC11368c.mo8214t();
                    break;
                case 10:
                    z = abstractC11368c.mo8215s();
                    continue;
                case 11:
                    abstractC11368c.mo8221h();
                    while (abstractC11368c.mo8216q()) {
                        abstractC11368c.mo8220i();
                        String str3 = null;
                        C9038b c9038b3 = null;
                        while (abstractC11368c.mo8216q()) {
                            int mo8226R2 = abstractC11368c.mo8226R(f28750c);
                            if (mo8226R2 != 0) {
                                C9038b c9038b4 = c9038b2;
                                if (mo8226R2 != 1) {
                                    abstractC11368c.mo8225S();
                                    abstractC11368c.mo8224U();
                                } else {
                                    c9038b3 = C10941d.m9499e(abstractC11368c, c6062k);
                                }
                                c9038b2 = c9038b4;
                            } else {
                                str3 = abstractC11368c.mo8234D();
                            }
                        }
                        C9038b c9038b5 = c9038b2;
                        abstractC11368c.mo8217m();
                        if (str3.equals("o")) {
                            c9038b2 = c9038b3;
                        } else {
                            if (str3.equals("d") || str3.equals("g")) {
                                c6062k.m23656u(true);
                                arrayList.add(c9038b3);
                            }
                            c9038b2 = c9038b5;
                        }
                    }
                    C9038b c9038b6 = c9038b2;
                    abstractC11368c.mo8219j();
                    if (arrayList.size() == 1) {
                        arrayList.add((C9038b) arrayList.get(0));
                    }
                    c9038b2 = c9038b6;
                    continue;
                    break;
                default:
                    abstractC11368c.mo8225S();
                    abstractC11368c.mo8224U();
                    continue;
            }
            str2 = str;
        }
        String str4 = str2;
        if (c9040d == null) {
            c9040d = new C9040d(Collections.singletonList(new C12020a(100)));
        }
        return new C10010f(str4, enumC10011g2, c9039c2, c9040d, c9042f, c9042f2, c9038b, enumC10027b, enumC10028c, f, arrayList, c9038b2, z);
    }
}
