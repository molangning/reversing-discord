package p404wc;

import lc.C10119a;
import p136hc.C7064j;

/* renamed from: wc.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13471c extends AbstractC13476h {
    public C13471c(C10119a c10119a) {
        super(c10119a);
    }

    @Override // p404wc.AbstractC13478j
    /* renamed from: d */
    public String mo2411d() {
        if (m2412c().m12261j() >= 48) {
            StringBuilder sb2 = new StringBuilder();
            m2419f(sb2, 8);
            int m2382f = m2413b().m2382f(48, 2);
            sb2.append("(392");
            sb2.append(m2382f);
            sb2.append(')');
            sb2.append(m2413b().m2385c(50, null).m2398b());
            return sb2.toString();
        }
        throw C7064j.m21461a();
    }
}