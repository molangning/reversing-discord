package p404wc;

import lc.C10119a;
import p136hc.C7064j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: wc.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13473e extends AbstractC13477i {

    /* renamed from: c */
    private final String f34703c;

    /* renamed from: d */
    private final String f34704d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13473e(C10119a c10119a, String str, String str2) {
        super(c10119a);
        this.f34703c = str2;
        this.f34704d = str;
    }

    /* renamed from: k */
    private void m2421k(StringBuilder sb2, int i) {
        int m2382f = m2413b().m2382f(i, 16);
        if (m2382f == 38400) {
            return;
        }
        sb2.append('(');
        sb2.append(this.f34703c);
        sb2.append(')');
        int i2 = m2382f % 32;
        int i3 = m2382f / 32;
        int i4 = (i3 % 12) + 1;
        int i5 = i3 / 12;
        if (i5 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(i5);
        if (i4 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(i4);
        if (i2 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(i2);
    }

    @Override // p404wc.AbstractC13478j
    /* renamed from: d */
    public String mo2411d() {
        if (m2412c().m12261j() == 84) {
            StringBuilder sb2 = new StringBuilder();
            m2419f(sb2, 8);
            m2415j(sb2, 48, 20);
            m2421k(sb2, 68);
            return sb2.toString();
        }
        throw C7064j.m21461a();
    }

    @Override // p404wc.AbstractC13477i
    /* renamed from: h */
    protected void mo2417h(StringBuilder sb2, int i) {
        sb2.append('(');
        sb2.append(this.f34704d);
        sb2.append(i / 100000);
        sb2.append(')');
    }

    @Override // p404wc.AbstractC13477i
    /* renamed from: i */
    protected int mo2416i(int i) {
        return i % 100000;
    }
}
