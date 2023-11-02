package p254o1;

import p167j1.C8782c;
import p275p1.AbstractC11368c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o1.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10961n {

    /* renamed from: a */
    private static final AbstractC11368c.C11369a f28744a = AbstractC11368c.C11369a.m8241a("fFamily", "fName", "fStyle", "ascent");

    /* renamed from: a */
    public static C8782c m9467a(AbstractC11368c abstractC11368c) {
        abstractC11368c.mo8220i();
        String str = null;
        String str2 = null;
        float f = 0.0f;
        String str3 = null;
        while (abstractC11368c.mo8216q()) {
            int mo8226R = abstractC11368c.mo8226R(f28744a);
            if (mo8226R != 0) {
                if (mo8226R != 1) {
                    if (mo8226R != 2) {
                        if (mo8226R != 3) {
                            abstractC11368c.mo8225S();
                            abstractC11368c.mo8224U();
                        } else {
                            f = (float) abstractC11368c.mo8214t();
                        }
                    } else {
                        str2 = abstractC11368c.mo8234D();
                    }
                } else {
                    str3 = abstractC11368c.mo8234D();
                }
            } else {
                str = abstractC11368c.mo8234D();
            }
        }
        abstractC11368c.mo8217m();
        return new C8782c(str, str3, str2, f);
    }
}