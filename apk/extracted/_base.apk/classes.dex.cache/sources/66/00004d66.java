package p348t6;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p195k8.C9208y;
import p296q6.C11745h;

/* renamed from: t6.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C12598d extends AbstractC12599e {

    /* renamed from: b */
    private long f32686b;

    /* renamed from: c */
    private long[] f32687c;

    /* renamed from: d */
    private long[] f32688d;

    public C12598d() {
        super(new C11745h());
        this.f32686b = -9223372036854775807L;
        this.f32687c = new long[0];
        this.f32688d = new long[0];
    }

    /* renamed from: g */
    private static Boolean m4737g(C9208y c9208y) {
        return Boolean.valueOf(c9208y.m16111D() == 1);
    }

    /* renamed from: h */
    private static Object m4736h(C9208y c9208y, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 8) {
                            if (i != 10) {
                                if (i != 11) {
                                    return null;
                                }
                                return m4735i(c9208y);
                            }
                            return m4731m(c9208y);
                        }
                        return m4733k(c9208y);
                    }
                    return m4732l(c9208y);
                }
                return m4730n(c9208y);
            }
            return m4737g(c9208y);
        }
        return m4734j(c9208y);
    }

    /* renamed from: i */
    private static Date m4735i(C9208y c9208y) {
        Date date = new Date((long) m4734j(c9208y).doubleValue());
        c9208y.m16098Q(2);
        return date;
    }

    /* renamed from: j */
    private static Double m4734j(C9208y c9208y) {
        return Double.valueOf(Double.longBitsToDouble(c9208y.m16075w()));
    }

    /* renamed from: k */
    private static HashMap<String, Object> m4733k(C9208y c9208y) {
        int m16107H = c9208y.m16107H();
        HashMap<String, Object> hashMap = new HashMap<>(m16107H);
        for (int i = 0; i < m16107H; i++) {
            String m4730n = m4730n(c9208y);
            Object m4736h = m4736h(c9208y, m4729o(c9208y));
            if (m4736h != null) {
                hashMap.put(m4730n, m4736h);
            }
        }
        return hashMap;
    }

    /* renamed from: l */
    private static HashMap<String, Object> m4732l(C9208y c9208y) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String m4730n = m4730n(c9208y);
            int m4729o = m4729o(c9208y);
            if (m4729o == 9) {
                return hashMap;
            }
            Object m4736h = m4736h(c9208y, m4729o);
            if (m4736h != null) {
                hashMap.put(m4730n, m4736h);
            }
        }
    }

    /* renamed from: m */
    private static ArrayList<Object> m4731m(C9208y c9208y) {
        int m16107H = c9208y.m16107H();
        ArrayList<Object> arrayList = new ArrayList<>(m16107H);
        for (int i = 0; i < m16107H; i++) {
            Object m4736h = m4736h(c9208y, m4729o(c9208y));
            if (m4736h != null) {
                arrayList.add(m4736h);
            }
        }
        return arrayList;
    }

    /* renamed from: n */
    private static String m4730n(C9208y c9208y) {
        int m16105J = c9208y.m16105J();
        int m16093e = c9208y.m16093e();
        c9208y.m16098Q(m16105J);
        return new String(c9208y.m16094d(), m16093e, m16105J);
    }

    /* renamed from: o */
    private static int m4729o(C9208y c9208y) {
        return c9208y.m16111D();
    }

    @Override // p348t6.AbstractC12599e
    /* renamed from: b */
    protected boolean mo4727b(C9208y c9208y) {
        return true;
    }

    @Override // p348t6.AbstractC12599e
    /* renamed from: c */
    protected boolean mo4726c(C9208y c9208y, long j) {
        if (m4729o(c9208y) != 2 || !"onMetaData".equals(m4730n(c9208y)) || m4729o(c9208y) != 8) {
            return false;
        }
        HashMap<String, Object> m4733k = m4733k(c9208y);
        Object obj = m4733k.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f32686b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = m4733k.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f32687c = new long[size];
                this.f32688d = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                        this.f32687c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f32688d[i] = ((Double) obj5).longValue();
                    } else {
                        this.f32687c = new long[0];
                        this.f32688d = new long[0];
                        break;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public long m4740d() {
        return this.f32686b;
    }

    /* renamed from: e */
    public long[] m4739e() {
        return this.f32688d;
    }

    /* renamed from: f */
    public long[] m4738f() {
        return this.f32687c;
    }
}