package p254o1;

import java.util.ArrayList;
import p073e1.C6062k;
import p206l1.C10023p;
import p206l1.InterfaceC10007c;
import p275p1.AbstractC11368c;

/* renamed from: o1.j0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10954j0 {

    /* renamed from: a */
    private static final AbstractC11368c.C11369a f28729a = AbstractC11368c.C11369a.m8241a("nm", "hd", "it");

    /* renamed from: a */
    public static C10023p m9475a(AbstractC11368c abstractC11368c, C6062k c6062k) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (abstractC11368c.mo8216q()) {
            int mo8226R = abstractC11368c.mo8226R(f28729a);
            if (mo8226R != 0) {
                if (mo8226R != 1) {
                    if (mo8226R != 2) {
                        abstractC11368c.mo8224U();
                    } else {
                        abstractC11368c.mo8221h();
                        while (abstractC11368c.mo8216q()) {
                            InterfaceC10007c m9484a = C10949h.m9484a(abstractC11368c, c6062k);
                            if (m9484a != null) {
                                arrayList.add(m9484a);
                            }
                        }
                        abstractC11368c.mo8219j();
                    }
                } else {
                    z = abstractC11368c.mo8215s();
                }
            } else {
                str = abstractC11368c.mo8234D();
            }
        }
        return new C10023p(str, arrayList, z);
    }
}