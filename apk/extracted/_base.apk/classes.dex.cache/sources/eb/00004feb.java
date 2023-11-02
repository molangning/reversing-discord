package vc;

import java.util.List;
import lc.C10119a;

/* renamed from: vc.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13243a {
    /* renamed from: a */
    public static C10119a m2971a(List<C13244b> list) {
        int size = (list.size() << 1) - 1;
        if (list.get(list.size() - 1).m2967d() == null) {
            size--;
        }
        C10119a c10119a = new C10119a(size * 12);
        int i = 0;
        int m3623b = list.get(0).m2967d().m3623b();
        for (int i2 = 11; i2 >= 0; i2--) {
            if (((1 << i2) & m3623b) != 0) {
                c10119a.m12257n(i);
            }
            i++;
        }
        for (int i3 = 1; i3 < list.size(); i3++) {
            C13244b c13244b = list.get(i3);
            int m3623b2 = c13244b.m2968c().m3623b();
            for (int i4 = 11; i4 >= 0; i4--) {
                if (((1 << i4) & m3623b2) != 0) {
                    c10119a.m12257n(i);
                }
                i++;
            }
            if (c13244b.m2967d() != null) {
                int m3623b3 = c13244b.m2967d().m3623b();
                for (int i5 = 11; i5 >= 0; i5--) {
                    if (((1 << i5) & m3623b3) != 0) {
                        c10119a.m12257n(i);
                    }
                    i++;
                }
            }
        }
        return c10119a;
    }
}