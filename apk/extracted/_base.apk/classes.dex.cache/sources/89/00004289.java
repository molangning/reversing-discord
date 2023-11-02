package p220lj;

import p184jj.EnumC8985j;

/* renamed from: lj.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class C10215b {
    /* renamed from: a */
    public static String m12124a(EnumC8985j enumC8985j, char c, int i) {
        if (enumC8985j.mo16872m()) {
            int i2 = c - '0';
            String num = Integer.toString(i);
            if (i2 == 0) {
                return num;
            }
            StringBuilder sb2 = new StringBuilder();
            int length = num.length();
            for (int i3 = 0; i3 < length; i3++) {
                sb2.append((char) (num.charAt(i3) + i2));
            }
            return sb2.toString();
        }
        return enumC8985j.mo16870q(i);
    }
}