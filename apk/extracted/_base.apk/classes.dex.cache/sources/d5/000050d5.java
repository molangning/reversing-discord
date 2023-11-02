package p404wc;

import lc.C10119a;

/* renamed from: wc.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC13477i extends AbstractC13476h {
    public AbstractC13477i(C10119a c10119a) {
        super(c10119a);
    }

    /* renamed from: h */
    protected abstract void mo2417h(StringBuilder sb2, int i);

    /* renamed from: i */
    protected abstract int mo2416i(int i);

    /* renamed from: j */
    public final void m2415j(StringBuilder sb2, int i, int i2) {
        int m2382f = m2413b().m2382f(i, i2);
        mo2417h(sb2, m2382f);
        int mo2416i = mo2416i(m2382f);
        int i3 = 100000;
        for (int i4 = 0; i4 < 5; i4++) {
            if (mo2416i / i3 == 0) {
                sb2.append('0');
            }
            i3 /= 10;
        }
        sb2.append(mo2416i);
    }
}