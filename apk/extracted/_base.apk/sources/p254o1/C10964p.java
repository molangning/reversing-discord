package p254o1;

import android.graphics.Path;
import java.util.Collections;
import p073e1.C6062k;
import p188k1.C9039c;
import p188k1.C9040d;
import p188k1.C9042f;
import p206l1.C10009e;
import p206l1.EnumC10011g;
import p275p1.AbstractC11368c;
import p311r1.C12020a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o1.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10964p {

    /* renamed from: a */
    private static final AbstractC11368c.C11369a f28746a = AbstractC11368c.C11369a.m8241a("nm", "g", "o", "t", "s", "e", "r", "hd");

    /* renamed from: b */
    private static final AbstractC11368c.C11369a f28747b = AbstractC11368c.C11369a.m8241a("p", "k");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C10009e m9461a(AbstractC11368c abstractC11368c, C6062k c6062k) {
        C9040d c9040d;
        EnumC10011g enumC10011g;
        Path.FillType fillType;
        C9040d c9040d2 = null;
        Path.FillType fillType2 = Path.FillType.WINDING;
        String str = null;
        EnumC10011g enumC10011g2 = null;
        C9039c c9039c = null;
        C9042f c9042f = null;
        C9042f c9042f2 = null;
        boolean z = false;
        while (abstractC11368c.mo8216q()) {
            switch (abstractC11368c.mo8226R(f28746a)) {
                case 0:
                    str = abstractC11368c.mo8234D();
                    break;
                case 1:
                    abstractC11368c.mo8220i();
                    int i = -1;
                    while (abstractC11368c.mo8216q()) {
                        int mo8226R = abstractC11368c.mo8226R(f28747b);
                        if (mo8226R != 0) {
                            if (mo8226R != 1) {
                                abstractC11368c.mo8225S();
                                abstractC11368c.mo8224U();
                            } else {
                                c9039c = C10941d.m9497g(abstractC11368c, c6062k, i);
                            }
                        } else {
                            i = abstractC11368c.mo8212v();
                        }
                    }
                    abstractC11368c.mo8217m();
                    break;
                case 2:
                    c9040d2 = C10941d.m9496h(abstractC11368c, c6062k);
                    break;
                case 3:
                    if (abstractC11368c.mo8212v() == 1) {
                        enumC10011g = EnumC10011g.LINEAR;
                    } else {
                        enumC10011g = EnumC10011g.RADIAL;
                    }
                    enumC10011g2 = enumC10011g;
                    break;
                case 4:
                    c9042f = C10941d.m9495i(abstractC11368c, c6062k);
                    break;
                case 5:
                    c9042f2 = C10941d.m9495i(abstractC11368c, c6062k);
                    break;
                case 6:
                    if (abstractC11368c.mo8212v() == 1) {
                        fillType = Path.FillType.WINDING;
                    } else {
                        fillType = Path.FillType.EVEN_ODD;
                    }
                    fillType2 = fillType;
                    break;
                case 7:
                    z = abstractC11368c.mo8215s();
                    break;
                default:
                    abstractC11368c.mo8225S();
                    abstractC11368c.mo8224U();
                    break;
            }
        }
        if (c9040d2 == null) {
            c9040d = new C9040d(Collections.singletonList(new C12020a(100)));
        } else {
            c9040d = c9040d2;
        }
        return new C10009e(str, enumC10011g2, fillType2, c9039c, c9040d, c9042f, c9042f2, null, null, z);
    }
}
