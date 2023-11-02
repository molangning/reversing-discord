package p445yc;

import java.util.Formatter;

/* renamed from: yc.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C13980g {

    /* renamed from: a */
    private final C13974c f35981a;

    /* renamed from: b */
    private final C13975d[] f35982b;

    public C13980g(C13974c c13974c) {
        this.f35981a = new C13974c(c13974c);
        this.f35982b = new C13975d[(c13974c.m1040e() - c13974c.m1038g()) + 1];
    }

    /* renamed from: a */
    public final C13974c m1000a() {
        return this.f35981a;
    }

    /* renamed from: b */
    public final C13975d m999b(int i) {
        return this.f35982b[m996e(i)];
    }

    /* renamed from: c */
    public final C13975d m998c(int i) {
        C13975d c13975d;
        C13975d c13975d2;
        C13975d m999b = m999b(i);
        if (m999b != null) {
            return m999b;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int m996e = m996e(i) - i2;
            if (m996e >= 0 && (c13975d2 = this.f35982b[m996e]) != null) {
                return c13975d2;
            }
            int m996e2 = m996e(i) + i2;
            C13975d[] c13975dArr = this.f35982b;
            if (m996e2 < c13975dArr.length && (c13975d = c13975dArr[m996e2]) != null) {
                return c13975d;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final C13975d[] m997d() {
        return this.f35982b;
    }

    /* renamed from: e */
    public final int m996e(int i) {
        return i - this.f35981a.m1038g();
    }

    /* renamed from: f */
    public final void m995f(int i, C13975d c13975d) {
        this.f35982b[m996e(i)] = c13975d;
    }

    public String toString() {
        C13975d[] c13975dArr;
        Formatter formatter = new Formatter();
        try {
            int i = 0;
            for (C13975d c13975d : this.f35982b) {
                if (c13975d == null) {
                    formatter.format("%3d:    |   %n", Integer.valueOf(i));
                    i++;
                } else {
                    formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i), Integer.valueOf(c13975d.m1032c()), Integer.valueOf(c13975d.m1030e()));
                    i++;
                }
            }
            String formatter2 = formatter.toString();
            formatter.close();
            return formatter2;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    formatter.close();
                } catch (Throwable th4) {
                    th2.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }
}