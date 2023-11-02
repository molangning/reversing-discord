package p404wc;

import lc.C10119a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: wc.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC13476h extends AbstractC13478j {
    public AbstractC13476h(C10119a c10119a) {
        super(c10119a);
    }

    /* renamed from: e */
    private static void m2420e(StringBuilder sb2, int i) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 13; i4++) {
            int charAt = sb2.charAt(i4 + i) - '0';
            if ((i4 & 1) == 0) {
                charAt *= 3;
            }
            i3 += charAt;
        }
        int i5 = 10 - (i3 % 10);
        if (i5 != 10) {
            i2 = i5;
        }
        sb2.append(i2);
    }

    /* renamed from: f */
    public final void m2419f(StringBuilder sb2, int i) {
        sb2.append("(01)");
        int length = sb2.length();
        sb2.append('9');
        m2418g(sb2, i, length);
    }

    /* renamed from: g */
    public final void m2418g(StringBuilder sb2, int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            int m2382f = m2413b().m2382f((i3 * 10) + i, 10);
            if (m2382f / 100 == 0) {
                sb2.append('0');
            }
            if (m2382f / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(m2382f);
        }
        m2420e(sb2, i2);
    }
}