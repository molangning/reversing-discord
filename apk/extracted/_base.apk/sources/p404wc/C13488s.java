package p404wc;

import androidx.recyclerview.widget.ItemTouchHelper;
import lc.C10119a;
import p136hc.C7060f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: wc.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13488s {

    /* renamed from: a */
    private final C10119a f34727a;

    /* renamed from: b */
    private final C13481m f34728b = new C13481m();

    /* renamed from: c */
    private final StringBuilder f34729c = new StringBuilder();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13488s(C10119a c10119a) {
        this.f34727a = c10119a;
    }

    /* renamed from: b */
    private C13483n m2386b(int i) {
        char c;
        int m2382f = m2382f(i, 5);
        if (m2382f == 15) {
            return new C13483n(i + 5, '$');
        }
        if (m2382f >= 5 && m2382f < 15) {
            return new C13483n(i + 5, (char) ((m2382f + 48) - 5));
        }
        int m2382f2 = m2382f(i, 6);
        if (m2382f2 >= 32 && m2382f2 < 58) {
            return new C13483n(i + 6, (char) (m2382f2 + 33));
        }
        switch (m2382f2) {
            case 58:
                c = '*';
                break;
            case 59:
                c = ',';
                break;
            case 60:
                c = '-';
                break;
            case 61:
                c = '.';
                break;
            case 62:
                c = '/';
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: ".concat(String.valueOf(m2382f2)));
        }
        return new C13483n(i + 6, c);
    }

    /* renamed from: d */
    private C13483n m2384d(int i) {
        char c;
        int m2382f = m2382f(i, 5);
        if (m2382f == 15) {
            return new C13483n(i + 5, '$');
        }
        if (m2382f >= 5 && m2382f < 15) {
            return new C13483n(i + 5, (char) ((m2382f + 48) - 5));
        }
        int m2382f2 = m2382f(i, 7);
        if (m2382f2 >= 64 && m2382f2 < 90) {
            return new C13483n(i + 7, (char) (m2382f2 + 1));
        }
        if (m2382f2 >= 90 && m2382f2 < 116) {
            return new C13483n(i + 7, (char) (m2382f2 + 7));
        }
        switch (m2382f(i, 8)) {
            case 232:
                c = '!';
                break;
            case 233:
                c = '\"';
                break;
            case 234:
                c = '%';
                break;
            case 235:
                c = '&';
                break;
            case 236:
                c = '\'';
                break;
            case 237:
                c = '(';
                break;
            case 238:
                c = ')';
                break;
            case 239:
                c = '*';
                break;
            case 240:
                c = '+';
                break;
            case 241:
                c = ',';
                break;
            case 242:
                c = '-';
                break;
            case 243:
                c = '.';
                break;
            case 244:
                c = '/';
                break;
            case 245:
                c = ':';
                break;
            case 246:
                c = ';';
                break;
            case 247:
                c = '<';
                break;
            case 248:
                c = '=';
                break;
            case 249:
                c = '>';
                break;
            case ItemTouchHelper.AbstractC1746c.DEFAULT_SWIPE_ANIMATION_DURATION /* 250 */:
                c = '?';
                break;
            case 251:
                c = '_';
                break;
            case 252:
                c = ' ';
                break;
            default:
                throw C7060f.m21471a();
        }
        return new C13483n(i + 8, c);
    }

    /* renamed from: e */
    private C13485p m2383e(int i) {
        int i2 = i + 7;
        if (i2 > this.f34727a.m12261j()) {
            int m2382f = m2382f(i, 4);
            if (m2382f == 0) {
                return new C13485p(this.f34727a.m12261j(), 10, 10);
            }
            return new C13485p(this.f34727a.m12261j(), m2382f - 1, 10);
        }
        int m2382f2 = m2382f(i, 7) - 8;
        return new C13485p(i2, m2382f2 / 11, m2382f2 % 11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static int m2381g(C10119a c10119a, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (c10119a.m12265d(i + i4)) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }

    /* renamed from: h */
    private boolean m2380h(int i) {
        int i2 = i + 3;
        if (i2 > this.f34727a.m12261j()) {
            return false;
        }
        while (i < i2) {
            if (this.f34727a.m12265d(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: i */
    private boolean m2379i(int i) {
        int i2;
        if (i + 1 > this.f34727a.m12261j()) {
            return false;
        }
        for (int i3 = 0; i3 < 5 && (i2 = i3 + i) < this.f34727a.m12261j(); i3++) {
            if (i3 == 2) {
                if (!this.f34727a.m12265d(i + 2)) {
                    return false;
                }
            } else if (this.f34727a.m12265d(i2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    private boolean m2378j(int i) {
        int i2;
        if (i + 1 > this.f34727a.m12261j()) {
            return false;
        }
        for (int i3 = 0; i3 < 4 && (i2 = i3 + i) < this.f34727a.m12261j(); i3++) {
            if (this.f34727a.m12265d(i2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    private boolean m2377k(int i) {
        int m2382f;
        if (i + 5 > this.f34727a.m12261j()) {
            return false;
        }
        int m2382f2 = m2382f(i, 5);
        if (m2382f2 >= 5 && m2382f2 < 16) {
            return true;
        }
        if (i + 6 > this.f34727a.m12261j() || (m2382f = m2382f(i, 6)) < 16 || m2382f >= 63) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private boolean m2376l(int i) {
        int m2382f;
        if (i + 5 > this.f34727a.m12261j()) {
            return false;
        }
        int m2382f2 = m2382f(i, 5);
        if (m2382f2 >= 5 && m2382f2 < 16) {
            return true;
        }
        if (i + 7 > this.f34727a.m12261j()) {
            return false;
        }
        int m2382f3 = m2382f(i, 7);
        if (m2382f3 >= 64 && m2382f3 < 116) {
            return true;
        }
        if (i + 8 > this.f34727a.m12261j() || (m2382f = m2382f(i, 8)) < 232 || m2382f >= 253) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private boolean m2375m(int i) {
        if (i + 7 > this.f34727a.m12261j()) {
            if (i + 4 <= this.f34727a.m12261j()) {
                return true;
            }
            return false;
        }
        int i2 = i;
        while (true) {
            int i3 = i + 3;
            if (i2 < i3) {
                if (this.f34727a.m12265d(i2)) {
                    return true;
                }
                i2++;
            } else {
                return this.f34727a.m12265d(i3);
            }
        }
    }

    /* renamed from: n */
    private C13480l m2374n() {
        while (m2377k(this.f34728b.m2408a())) {
            C13483n m2386b = m2386b(this.f34728b.m2408a());
            this.f34728b.m2401h(m2386b.m2391a());
            if (m2386b.m2399c()) {
                return new C13480l(new C13484o(this.f34728b.m2408a(), this.f34729c.toString()), true);
            }
            this.f34729c.append(m2386b.m2400b());
        }
        if (m2380h(this.f34728b.m2408a())) {
            this.f34728b.m2407b(3);
            this.f34728b.m2402g();
        } else if (m2379i(this.f34728b.m2408a())) {
            if (this.f34728b.m2408a() + 5 < this.f34727a.m12261j()) {
                this.f34728b.m2407b(5);
            } else {
                this.f34728b.m2401h(this.f34727a.m12261j());
            }
            this.f34728b.m2403f();
        }
        return new C13480l(false);
    }

    /* renamed from: o */
    private C13484o m2373o() {
        C13480l m2371q;
        boolean m2409b;
        boolean z;
        do {
            int m2408a = this.f34728b.m2408a();
            if (this.f34728b.m2406c()) {
                m2371q = m2374n();
                m2409b = m2371q.m2409b();
            } else if (this.f34728b.m2405d()) {
                m2371q = m2372p();
                m2409b = m2371q.m2409b();
            } else {
                m2371q = m2371q();
                m2409b = m2371q.m2409b();
            }
            if (m2408a != this.f34728b.m2408a()) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !m2409b) {
                break;
            }
        } while (!m2409b);
        return m2371q.m2410a();
    }

    /* renamed from: p */
    private C13480l m2372p() {
        while (m2376l(this.f34728b.m2408a())) {
            C13483n m2384d = m2384d(this.f34728b.m2408a());
            this.f34728b.m2401h(m2384d.m2391a());
            if (m2384d.m2399c()) {
                return new C13480l(new C13484o(this.f34728b.m2408a(), this.f34729c.toString()), true);
            }
            this.f34729c.append(m2384d.m2400b());
        }
        if (m2380h(this.f34728b.m2408a())) {
            this.f34728b.m2407b(3);
            this.f34728b.m2402g();
        } else if (m2379i(this.f34728b.m2408a())) {
            if (this.f34728b.m2408a() + 5 < this.f34727a.m12261j()) {
                this.f34728b.m2407b(5);
            } else {
                this.f34728b.m2401h(this.f34727a.m12261j());
            }
            this.f34728b.m2404e();
        }
        return new C13480l(false);
    }

    /* renamed from: q */
    private C13480l m2371q() {
        C13484o c13484o;
        while (m2375m(this.f34728b.m2408a())) {
            C13485p m2383e = m2383e(this.f34728b.m2408a());
            this.f34728b.m2401h(m2383e.m2391a());
            if (m2383e.m2393d()) {
                if (m2383e.m2392e()) {
                    c13484o = new C13484o(this.f34728b.m2408a(), this.f34729c.toString());
                } else {
                    c13484o = new C13484o(this.f34728b.m2408a(), this.f34729c.toString(), m2383e.m2394c());
                }
                return new C13480l(c13484o, true);
            }
            this.f34729c.append(m2383e.m2395b());
            if (m2383e.m2392e()) {
                return new C13480l(new C13484o(this.f34728b.m2408a(), this.f34729c.toString()), true);
            }
            this.f34729c.append(m2383e.m2394c());
        }
        if (m2378j(this.f34728b.m2408a())) {
            this.f34728b.m2404e();
            this.f34728b.m2407b(4);
        }
        return new C13480l(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m2387a(StringBuilder sb2, int i) {
        String str;
        String str2 = null;
        while (true) {
            C13484o m2385c = m2385c(i, str2);
            String m2390a = C13487r.m2390a(m2385c.m2398b());
            if (m2390a != null) {
                sb2.append(m2390a);
            }
            if (m2385c.m2396d()) {
                str = String.valueOf(m2385c.m2397c());
            } else {
                str = null;
            }
            if (i != m2385c.m2391a()) {
                i = m2385c.m2391a();
                str2 = str;
            } else {
                return sb2.toString();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C13484o m2385c(int i, String str) {
        this.f34729c.setLength(0);
        if (str != null) {
            this.f34729c.append(str);
        }
        this.f34728b.m2401h(i);
        C13484o m2373o = m2373o();
        if (m2373o != null && m2373o.m2396d()) {
            return new C13484o(this.f34728b.m2408a(), this.f34729c.toString(), m2373o.m2397c());
        }
        return new C13484o(this.f34728b.m2408a(), this.f34729c.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m2382f(int i, int i2) {
        return m2381g(this.f34727a, i, i2);
    }
}
