package p213l8;

import p195k8.C9208y;

/* renamed from: l8.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10066c {

    /* renamed from: a */
    public final int f26170a;

    /* renamed from: b */
    public final int f26171b;

    /* renamed from: c */
    public final String f26172c;

    private C10066c(int i, int i2, String str) {
        this.f26170a = i;
        this.f26171b = i2;
        this.f26172c = str;
    }

    /* renamed from: a */
    public static C10066c m12430a(C9208y c9208y) {
        String str;
        c9208y.m16098Q(2);
        int m16111D = c9208y.m16111D();
        int i = m16111D >> 1;
        int m16111D2 = ((c9208y.m16111D() >> 3) & 31) | ((m16111D & 1) << 5);
        if (i != 4 && i != 5 && i != 7) {
            if (i == 8) {
                str = "hev1";
            } else if (i == 9) {
                str = "avc3";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String str2 = ".0";
        sb2.append(".0");
        sb2.append(i);
        if (m16111D2 >= 10) {
            str2 = ".";
        }
        sb2.append(str2);
        sb2.append(m16111D2);
        return new C10066c(i, m16111D2, sb2.toString());
    }
}
