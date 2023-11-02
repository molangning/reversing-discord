package p254o1;

import p206l1.C10014i;
import p275p1.AbstractC11368c;

/* renamed from: o1.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C10975y {

    /* renamed from: a */
    private static final AbstractC11368c.C11369a f28767a = AbstractC11368c.C11369a.m8241a("nm", "mm", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C10014i m9431a(AbstractC11368c abstractC11368c) {
        String str = null;
        boolean z = false;
        C10014i.EnumC10015a enumC10015a = null;
        while (abstractC11368c.mo8216q()) {
            int mo8226R = abstractC11368c.mo8226R(f28767a);
            if (mo8226R != 0) {
                if (mo8226R != 1) {
                    if (mo8226R != 2) {
                        abstractC11368c.mo8225S();
                        abstractC11368c.mo8224U();
                    } else {
                        z = abstractC11368c.mo8215s();
                    }
                } else {
                    enumC10015a = C10014i.EnumC10015a.m12580b(abstractC11368c.mo8212v());
                }
            } else {
                str = abstractC11368c.mo8234D();
            }
        }
        return new C10014i(str, enumC10015a, z);
    }
}
