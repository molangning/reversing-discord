package p404wc;

import lc.C10119a;
import p136hc.C7064j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: wc.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13472d extends AbstractC13476h {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C13472d(C10119a c10119a) {
        super(c10119a);
    }

    @Override // p404wc.AbstractC13478j
    /* renamed from: d */
    public String mo2411d() {
        if (m2412c().m12261j() >= 48) {
            StringBuilder sb2 = new StringBuilder();
            m2419f(sb2, 8);
            int m2382f = m2413b().m2382f(48, 2);
            sb2.append("(393");
            sb2.append(m2382f);
            sb2.append(')');
            int m2382f2 = m2413b().m2382f(50, 10);
            if (m2382f2 / 100 == 0) {
                sb2.append('0');
            }
            if (m2382f2 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(m2382f2);
            sb2.append(m2413b().m2385c(60, null).m2398b());
            return sb2.toString();
        }
        throw C7064j.m21461a();
    }
}
