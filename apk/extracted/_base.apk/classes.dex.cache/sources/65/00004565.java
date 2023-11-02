package p254o1;

import android.graphics.PointF;
import p073e1.C6062k;
import p188k1.C9038b;
import p188k1.InterfaceC9049m;
import p206l1.C10016j;
import p275p1.AbstractC11368c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o1.c0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10940c0 {

    /* renamed from: a */
    private static final AbstractC11368c.C11369a f28709a = AbstractC11368c.C11369a.m8241a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd", "d");

    /* renamed from: a */
    public static C10016j m9504a(AbstractC11368c abstractC11368c, C6062k c6062k, int i) {
        boolean z;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = false;
        boolean z3 = z;
        String str = null;
        C10016j.EnumC10017a enumC10017a = null;
        C9038b c9038b = null;
        InterfaceC9049m<PointF, PointF> interfaceC9049m = null;
        C9038b c9038b2 = null;
        C9038b c9038b3 = null;
        C9038b c9038b4 = null;
        C9038b c9038b5 = null;
        C9038b c9038b6 = null;
        while (abstractC11368c.mo8216q()) {
            switch (abstractC11368c.mo8226R(f28709a)) {
                case 0:
                    str = abstractC11368c.mo8234D();
                    break;
                case 1:
                    enumC10017a = C10016j.EnumC10017a.m12567b(abstractC11368c.mo8212v());
                    break;
                case 2:
                    c9038b = C10941d.m9498f(abstractC11368c, c6062k, false);
                    break;
                case 3:
                    interfaceC9049m = C10935a.m9516b(abstractC11368c, c6062k);
                    break;
                case 4:
                    c9038b2 = C10941d.m9498f(abstractC11368c, c6062k, false);
                    break;
                case 5:
                    c9038b4 = C10941d.m9499e(abstractC11368c, c6062k);
                    break;
                case 6:
                    c9038b6 = C10941d.m9498f(abstractC11368c, c6062k, false);
                    break;
                case 7:
                    c9038b3 = C10941d.m9499e(abstractC11368c, c6062k);
                    break;
                case 8:
                    c9038b5 = C10941d.m9498f(abstractC11368c, c6062k, false);
                    break;
                case 9:
                    z2 = abstractC11368c.mo8215s();
                    break;
                case 10:
                    if (abstractC11368c.mo8212v() == 3) {
                        z3 = true;
                        break;
                    } else {
                        z3 = false;
                        break;
                    }
                default:
                    abstractC11368c.mo8225S();
                    abstractC11368c.mo8224U();
                    break;
            }
        }
        return new C10016j(str, enumC10017a, c9038b, interfaceC9049m, c9038b2, c9038b3, c9038b4, c9038b5, c9038b6, z2, z3);
    }
}