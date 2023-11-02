package p301qc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import lc.AbstractC10127i;
import lc.C10120b;
import lc.C10125g;
import mc.C10434a;
import mc.C10435b;
import p136hc.C7064j;
import p136hc.C7069o;

/* renamed from: qc.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11823a {

    /* renamed from: a */
    private final C10120b f30810a;

    /* renamed from: b */
    private final C10435b f30811b;

    /* renamed from: qc.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11825b {

        /* renamed from: a */
        private final C7069o f30812a;

        /* renamed from: b */
        private final C7069o f30813b;

        /* renamed from: c */
        private final int f30814c;

        /* renamed from: a */
        C7069o m6819a() {
            return this.f30812a;
        }

        /* renamed from: b */
        C7069o m6818b() {
            return this.f30813b;
        }

        /* renamed from: c */
        int m6817c() {
            return this.f30814c;
        }

        public String toString() {
            return this.f30812a + "/" + this.f30813b + '/' + this.f30814c;
        }

        private C11825b(C7069o c7069o, C7069o c7069o2, int i) {
            this.f30812a = c7069o;
            this.f30813b = c7069o2;
            this.f30814c = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qc.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11826c implements Serializable, Comparator<C11825b> {
        private C11826c() {
        }

        @Override // java.util.Comparator
        /* renamed from: b */
        public int compare(C11825b c11825b, C11825b c11825b2) {
            return c11825b.m6817c() - c11825b2.m6817c();
        }
    }

    public C11823a(C10120b c10120b) {
        this.f30810a = c10120b;
        this.f30811b = new C10435b(c10120b);
    }

    /* renamed from: a */
    private C7069o m6827a(C7069o c7069o, C7069o c7069o2, C7069o c7069o3, C7069o c7069o4, int i) {
        float f = i;
        float m6824d = m6824d(c7069o, c7069o2) / f;
        float m6824d2 = m6824d(c7069o3, c7069o4);
        C7069o c7069o5 = new C7069o(c7069o4.m21455c() + (((c7069o4.m21455c() - c7069o3.m21455c()) / m6824d2) * m6824d), c7069o4.m21454d() + (m6824d * ((c7069o4.m21454d() - c7069o3.m21454d()) / m6824d2)));
        float m6824d3 = m6824d(c7069o, c7069o3) / f;
        float m6824d4 = m6824d(c7069o2, c7069o4);
        C7069o c7069o6 = new C7069o(c7069o4.m21455c() + (((c7069o4.m21455c() - c7069o2.m21455c()) / m6824d4) * m6824d3), c7069o4.m21454d() + (m6824d3 * ((c7069o4.m21454d() - c7069o2.m21454d()) / m6824d4)));
        if (!m6822f(c7069o5)) {
            if (m6822f(c7069o6)) {
                return c7069o6;
            }
            return null;
        } else if (!m6822f(c7069o6)) {
            return c7069o5;
        } else {
            if (Math.abs(m6820h(c7069o3, c7069o5).m6817c() - m6820h(c7069o2, c7069o5).m6817c()) <= Math.abs(m6820h(c7069o3, c7069o6).m6817c() - m6820h(c7069o2, c7069o6).m6817c())) {
                return c7069o5;
            }
            return c7069o6;
        }
    }

    /* renamed from: b */
    private C7069o m6826b(C7069o c7069o, C7069o c7069o2, C7069o c7069o3, C7069o c7069o4, int i, int i2) {
        float m6824d = m6824d(c7069o, c7069o2) / i;
        float m6824d2 = m6824d(c7069o3, c7069o4);
        C7069o c7069o5 = new C7069o(c7069o4.m21455c() + (((c7069o4.m21455c() - c7069o3.m21455c()) / m6824d2) * m6824d), c7069o4.m21454d() + (m6824d * ((c7069o4.m21454d() - c7069o3.m21454d()) / m6824d2)));
        float m6824d3 = m6824d(c7069o, c7069o3) / i2;
        float m6824d4 = m6824d(c7069o2, c7069o4);
        C7069o c7069o6 = new C7069o(c7069o4.m21455c() + (((c7069o4.m21455c() - c7069o2.m21455c()) / m6824d4) * m6824d3), c7069o4.m21454d() + (m6824d3 * ((c7069o4.m21454d() - c7069o2.m21454d()) / m6824d4)));
        if (!m6822f(c7069o5)) {
            if (m6822f(c7069o6)) {
                return c7069o6;
            }
            return null;
        } else if (!m6822f(c7069o6)) {
            return c7069o5;
        } else {
            if (Math.abs(i - m6820h(c7069o3, c7069o5).m6817c()) + Math.abs(i2 - m6820h(c7069o2, c7069o5).m6817c()) <= Math.abs(i - m6820h(c7069o3, c7069o6).m6817c()) + Math.abs(i2 - m6820h(c7069o2, c7069o6).m6817c())) {
                return c7069o5;
            }
            return c7069o6;
        }
    }

    /* renamed from: d */
    private static int m6824d(C7069o c7069o, C7069o c7069o2) {
        return C10434a.m11569c(C7069o.m21456b(c7069o, c7069o2));
    }

    /* renamed from: e */
    private static void m6823e(Map<C7069o, Integer> map, C7069o c7069o) {
        Integer num = map.get(c7069o);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        map.put(c7069o, Integer.valueOf(i));
    }

    /* renamed from: f */
    private boolean m6822f(C7069o c7069o) {
        return c7069o.m21455c() >= 0.0f && c7069o.m21455c() < ((float) this.f30810a.m12246m()) && c7069o.m21454d() > 0.0f && c7069o.m21454d() < ((float) this.f30810a.m12249j());
    }

    /* renamed from: g */
    private static C10120b m6821g(C10120b c10120b, C7069o c7069o, C7069o c7069o2, C7069o c7069o3, C7069o c7069o4, int i, int i2) {
        float f = i - 0.5f;
        float f2 = i2 - 0.5f;
        return AbstractC10127i.m12216b().mo12215c(c10120b, i, i2, 0.5f, 0.5f, f, 0.5f, f, f2, 0.5f, f2, c7069o.m21455c(), c7069o.m21454d(), c7069o4.m21455c(), c7069o4.m21454d(), c7069o3.m21455c(), c7069o3.m21454d(), c7069o2.m21455c(), c7069o2.m21454d());
    }

    /* renamed from: h */
    private C11825b m6820h(C7069o c7069o, C7069o c7069o2) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int m21455c = (int) c7069o.m21455c();
        int m21454d = (int) c7069o.m21454d();
        int m21455c2 = (int) c7069o2.m21455c();
        int m21454d2 = (int) c7069o2.m21454d();
        int i6 = 0;
        int i7 = 1;
        if (Math.abs(m21454d2 - m21454d) > Math.abs(m21455c2 - m21455c)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m21454d = m21455c;
            m21455c = m21454d;
            m21454d2 = m21455c2;
            m21455c2 = m21454d2;
        }
        int abs = Math.abs(m21455c2 - m21455c);
        int abs2 = Math.abs(m21454d2 - m21454d);
        int i8 = (-abs) / 2;
        if (m21454d < m21454d2) {
            i = 1;
        } else {
            i = -1;
        }
        if (m21455c >= m21455c2) {
            i7 = -1;
        }
        C10120b c10120b = this.f30810a;
        if (z) {
            i2 = m21454d;
        } else {
            i2 = m21455c;
        }
        if (z) {
            i3 = m21455c;
        } else {
            i3 = m21454d;
        }
        boolean m12252e = c10120b.m12252e(i2, i3);
        while (m21455c != m21455c2) {
            C10120b c10120b2 = this.f30810a;
            if (z) {
                i4 = m21454d;
            } else {
                i4 = m21455c;
            }
            if (z) {
                i5 = m21455c;
            } else {
                i5 = m21454d;
            }
            boolean m12252e2 = c10120b2.m12252e(i4, i5);
            if (m12252e2 != m12252e) {
                i6++;
                m12252e = m12252e2;
            }
            i8 += abs2;
            if (i8 > 0) {
                if (m21454d == m21454d2) {
                    break;
                }
                m21454d += i;
                i8 -= abs;
            }
            m21455c += i7;
        }
        return new C11825b(c7069o, c7069o2, i6);
    }

    /* renamed from: c */
    public C10125g m6825c() {
        C7069o c7069o;
        C7069o c7069o2;
        C10120b m6821g;
        C7069o[] m11565c = this.f30811b.m11565c();
        C7069o c7069o3 = m11565c[0];
        C7069o c7069o4 = m11565c[1];
        C7069o c7069o5 = m11565c[2];
        C7069o c7069o6 = m11565c[3];
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(m6820h(c7069o3, c7069o4));
        arrayList.add(m6820h(c7069o3, c7069o5));
        arrayList.add(m6820h(c7069o4, c7069o6));
        arrayList.add(m6820h(c7069o5, c7069o6));
        C7069o c7069o7 = null;
        Collections.sort(arrayList, new C11826c());
        C11825b c11825b = (C11825b) arrayList.get(0);
        C11825b c11825b2 = (C11825b) arrayList.get(1);
        HashMap hashMap = new HashMap();
        m6823e(hashMap, c11825b.m6819a());
        m6823e(hashMap, c11825b.m6818b());
        m6823e(hashMap, c11825b2.m6819a());
        m6823e(hashMap, c11825b2.m6818b());
        C7069o c7069o8 = null;
        C7069o c7069o9 = null;
        for (Map.Entry entry : hashMap.entrySet()) {
            C7069o c7069o10 = (C7069o) entry.getKey();
            if (((Integer) entry.getValue()).intValue() == 2) {
                c7069o8 = c7069o10;
            } else if (c7069o7 == null) {
                c7069o7 = c7069o10;
            } else {
                c7069o9 = c7069o10;
            }
        }
        if (c7069o7 != null && c7069o8 != null && c7069o9 != null) {
            C7069o[] c7069oArr = {c7069o7, c7069o8, c7069o9};
            C7069o.m21453e(c7069oArr);
            C7069o c7069o11 = c7069oArr[0];
            C7069o c7069o12 = c7069oArr[1];
            C7069o c7069o13 = c7069oArr[2];
            if (!hashMap.containsKey(c7069o3)) {
                c7069o = c7069o3;
            } else if (!hashMap.containsKey(c7069o4)) {
                c7069o = c7069o4;
            } else if (!hashMap.containsKey(c7069o5)) {
                c7069o = c7069o5;
            } else {
                c7069o = c7069o6;
            }
            int m6817c = m6820h(c7069o13, c7069o).m6817c();
            int m6817c2 = m6820h(c7069o11, c7069o).m6817c();
            if ((m6817c & 1) == 1) {
                m6817c++;
            }
            int i = m6817c + 2;
            if ((m6817c2 & 1) == 1) {
                m6817c2++;
            }
            int i2 = m6817c2 + 2;
            if (i * 4 < i2 * 7 && i2 * 4 < i * 7) {
                C7069o m6827a = m6827a(c7069o12, c7069o11, c7069o13, c7069o, Math.min(i2, i));
                if (m6827a != null) {
                    c7069o = m6827a;
                }
                int max = Math.max(m6820h(c7069o13, c7069o).m6817c(), m6820h(c7069o11, c7069o).m6817c()) + 1;
                if ((max & 1) == 1) {
                    max++;
                }
                int i3 = max;
                m6821g = m6821g(this.f30810a, c7069o13, c7069o12, c7069o11, c7069o, i3, i3);
                c7069o2 = c7069o13;
            } else {
                c7069o2 = c7069o13;
                C7069o m6826b = m6826b(c7069o12, c7069o11, c7069o13, c7069o, i, i2);
                if (m6826b != null) {
                    c7069o = m6826b;
                }
                int m6817c3 = m6820h(c7069o2, c7069o).m6817c();
                int m6817c4 = m6820h(c7069o11, c7069o).m6817c();
                if ((m6817c3 & 1) == 1) {
                    m6817c3++;
                }
                int i4 = m6817c3;
                if ((m6817c4 & 1) == 1) {
                    m6817c4++;
                }
                m6821g = m6821g(this.f30810a, c7069o2, c7069o12, c7069o11, c7069o, i4, m6817c4);
            }
            return new C10125g(m6821g, new C7069o[]{c7069o2, c7069o12, c7069o11, c7069o});
        }
        throw C7064j.m21461a();
    }
}