package p445yc;

import p136hc.C7069o;

/* renamed from: yc.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13981h extends C13980g {

    /* renamed from: c */
    private final boolean f35983c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13981h(C13974c c13974c, boolean z) {
        super(c13974c);
        this.f35983c = z;
    }

    /* renamed from: h */
    private void m993h(C13972a c13972a) {
        C7069o m1036i;
        C7069o m1042c;
        C13974c m1000a = m1000a();
        if (this.f35983c) {
            m1036i = m1000a.m1037h();
        } else {
            m1036i = m1000a.m1036i();
        }
        if (this.f35983c) {
            m1042c = m1000a.m1043b();
        } else {
            m1042c = m1000a.m1042c();
        }
        int m996e = m996e((int) m1042c.m21454d());
        C13975d[] m997d = m997d();
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        for (int m996e2 = m996e((int) m1036i.m21454d()); m996e2 < m996e; m996e2++) {
            C13975d c13975d = m997d[m996e2];
            if (c13975d != null) {
                c13975d.m1025j();
                int m1032c = c13975d.m1032c() - i;
                if (m1032c == 0) {
                    i2++;
                } else {
                    if (m1032c == 1) {
                        i3 = Math.max(i3, i2);
                        i = c13975d.m1032c();
                    } else if (c13975d.m1032c() >= c13972a.m1049c()) {
                        m997d[m996e2] = null;
                    } else {
                        i = c13975d.m1032c();
                    }
                    i2 = 1;
                }
            }
        }
    }

    /* renamed from: l */
    private void m989l(C13975d[] c13975dArr, C13972a c13972a) {
        for (int i = 0; i < c13975dArr.length; i++) {
            C13975d c13975d = c13975dArr[i];
            if (c13975d != null) {
                int m1030e = c13975d.m1030e() % 30;
                int m1032c = c13975d.m1032c();
                if (m1032c > c13972a.m1049c()) {
                    c13975dArr[i] = null;
                } else {
                    if (!this.f35983c) {
                        m1032c += 2;
                    }
                    int i2 = m1032c % 3;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2 && m1030e + 1 != c13972a.m1051a()) {
                                c13975dArr[i] = null;
                            }
                        } else if (m1030e / 3 != c13972a.m1050b() || m1030e % 3 != c13972a.m1048d()) {
                            c13975dArr[i] = null;
                        }
                    } else if ((m1030e * 3) + 1 != c13972a.m1047e()) {
                        c13975dArr[i] = null;
                    }
                }
            }
        }
    }

    /* renamed from: m */
    private void m988m() {
        C13975d[] m997d;
        for (C13975d c13975d : m997d()) {
            if (c13975d != null) {
                c13975d.m1025j();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m994g(C13972a c13972a) {
        C7069o m1036i;
        C7069o m1042c;
        boolean z;
        C13975d[] m997d = m997d();
        m988m();
        m989l(m997d, c13972a);
        C13974c m1000a = m1000a();
        if (this.f35983c) {
            m1036i = m1000a.m1037h();
        } else {
            m1036i = m1000a.m1036i();
        }
        if (this.f35983c) {
            m1042c = m1000a.m1043b();
        } else {
            m1042c = m1000a.m1042c();
        }
        int m996e = m996e((int) m1042c.m21454d());
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        for (int m996e2 = m996e((int) m1036i.m21454d()); m996e2 < m996e; m996e2++) {
            C13975d c13975d = m997d[m996e2];
            if (c13975d != null) {
                int m1032c = c13975d.m1032c() - i;
                if (m1032c == 0) {
                    i2++;
                } else {
                    if (m1032c == 1) {
                        i3 = Math.max(i3, i2);
                        i = c13975d.m1032c();
                    } else if (m1032c >= 0 && c13975d.m1032c() < c13972a.m1049c() && m1032c <= m996e2) {
                        if (i3 > 2) {
                            m1032c *= i3 - 2;
                        }
                        if (m1032c >= m996e2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        for (int i4 = 1; i4 <= m1032c && !z; i4++) {
                            if (m997d[m996e2 - i4] != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z) {
                            m997d[m996e2] = null;
                        } else {
                            i = c13975d.m1032c();
                        }
                    } else {
                        m997d[m996e2] = null;
                    }
                    i2 = 1;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C13972a m992i() {
        C13975d[] m997d = m997d();
        C13973b c13973b = new C13973b();
        C13973b c13973b2 = new C13973b();
        C13973b c13973b3 = new C13973b();
        C13973b c13973b4 = new C13973b();
        for (C13975d c13975d : m997d) {
            if (c13975d != null) {
                c13975d.m1025j();
                int m1030e = c13975d.m1030e() % 30;
                int m1032c = c13975d.m1032c();
                if (!this.f35983c) {
                    m1032c += 2;
                }
                int i = m1032c % 3;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            c13973b.m1045b(m1030e + 1);
                        }
                    } else {
                        c13973b4.m1045b(m1030e / 3);
                        c13973b3.m1045b(m1030e % 3);
                    }
                } else {
                    c13973b2.m1045b((m1030e * 3) + 1);
                }
            }
        }
        if (c13973b.m1046a().length != 0 && c13973b2.m1046a().length != 0 && c13973b3.m1046a().length != 0 && c13973b4.m1046a().length != 0 && c13973b.m1046a()[0] > 0 && c13973b2.m1046a()[0] + c13973b3.m1046a()[0] >= 3 && c13973b2.m1046a()[0] + c13973b3.m1046a()[0] <= 90) {
            C13972a c13972a = new C13972a(c13973b.m1046a()[0], c13973b2.m1046a()[0], c13973b3.m1046a()[0], c13973b4.m1046a()[0]);
            m989l(m997d, c13972a);
            return c13972a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int[] m991j() {
        C13975d[] m997d;
        int m1032c;
        C13972a m992i = m992i();
        if (m992i == null) {
            return null;
        }
        m993h(m992i);
        int m1049c = m992i.m1049c();
        int[] iArr = new int[m1049c];
        for (C13975d c13975d : m997d()) {
            if (c13975d != null && (m1032c = c13975d.m1032c()) < m1049c) {
                iArr[m1032c] = iArr[m1032c] + 1;
            }
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean m990k() {
        return this.f35983c;
    }

    @Override // p445yc.C13980g
    public String toString() {
        return "IsLeft: " + this.f35983c + '\n' + super.toString();
    }
}
