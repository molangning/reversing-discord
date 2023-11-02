package p254o1;

import java.util.ArrayList;
import p073e1.C6062k;
import p167j1.C8783d;
import p206l1.C10023p;
import p275p1.AbstractC11368c;

/* renamed from: o1.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10959m {

    /* renamed from: a */
    private static final AbstractC11368c.C11369a f28741a = AbstractC11368c.C11369a.m8241a("ch", "size", "w", "style", "fFamily", "data");

    /* renamed from: b */
    private static final AbstractC11368c.C11369a f28742b = AbstractC11368c.C11369a.m8241a("shapes");

    /* renamed from: a */
    public static C8783d m9469a(AbstractC11368c abstractC11368c, C6062k c6062k) {
        ArrayList arrayList = new ArrayList();
        abstractC11368c.mo8220i();
        double d = 0.0d;
        String str = null;
        String str2 = null;
        char c = 0;
        double d2 = 0.0d;
        while (abstractC11368c.mo8216q()) {
            int mo8226R = abstractC11368c.mo8226R(f28741a);
            if (mo8226R != 0) {
                if (mo8226R != 1) {
                    if (mo8226R != 2) {
                        if (mo8226R != 3) {
                            if (mo8226R != 4) {
                                if (mo8226R != 5) {
                                    abstractC11368c.mo8225S();
                                    abstractC11368c.mo8224U();
                                } else {
                                    abstractC11368c.mo8220i();
                                    while (abstractC11368c.mo8216q()) {
                                        if (abstractC11368c.mo8226R(f28742b) != 0) {
                                            abstractC11368c.mo8225S();
                                            abstractC11368c.mo8224U();
                                        } else {
                                            abstractC11368c.mo8221h();
                                            while (abstractC11368c.mo8216q()) {
                                                arrayList.add((C10023p) C10949h.m9484a(abstractC11368c, c6062k));
                                            }
                                            abstractC11368c.mo8219j();
                                        }
                                    }
                                    abstractC11368c.mo8217m();
                                }
                            } else {
                                str2 = abstractC11368c.mo8234D();
                            }
                        } else {
                            str = abstractC11368c.mo8234D();
                        }
                    } else {
                        d = abstractC11368c.mo8214t();
                    }
                } else {
                    d2 = abstractC11368c.mo8214t();
                }
            } else {
                c = abstractC11368c.mo8234D().charAt(0);
            }
        }
        abstractC11368c.mo8217m();
        return new C8783d(arrayList, c, d2, d, str, str2);
    }
}