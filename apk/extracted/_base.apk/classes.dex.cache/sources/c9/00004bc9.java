package p326rh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p326rh.C12185h.InterfaceC12187b;
import p326rh.C12196j;
import p326rh.C12200l;
import p326rh.C12234z;
import p326rh.InterfaceC12210q;

/* renamed from: rh.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C12185h<FieldDescriptorType extends InterfaceC12187b<FieldDescriptorType>> {

    /* renamed from: d */
    private static final C12185h f31722d = new C12185h(true);

    /* renamed from: b */
    private boolean f31724b;

    /* renamed from: c */
    private boolean f31725c = false;

    /* renamed from: a */
    private final C12221v<FieldDescriptorType, Object> f31723a = C12221v.m5714o(16);

    /* renamed from: rh.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static /* synthetic */ class C12186a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31726a;

        /* renamed from: b */
        static final /* synthetic */ int[] f31727b;

        static {
            int[] iArr = new int[C12234z.EnumC12236b.values().length];
            f31727b = iArr;
            try {
                iArr[C12234z.EnumC12236b.f31816l.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31727b[C12234z.EnumC12236b.f31817m.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31727b[C12234z.EnumC12236b.f31818n.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31727b[C12234z.EnumC12236b.f31819o.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31727b[C12234z.EnumC12236b.f31820p.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31727b[C12234z.EnumC12236b.f31821q.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31727b[C12234z.EnumC12236b.f31822r.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f31727b[C12234z.EnumC12236b.f31823s.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f31727b[C12234z.EnumC12236b.f31824t.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f31727b[C12234z.EnumC12236b.f31827w.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f31727b[C12234z.EnumC12236b.f31828x.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f31727b[C12234z.EnumC12236b.f31830z.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f31727b[C12234z.EnumC12236b.f31812A.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f31727b[C12234z.EnumC12236b.f31813B.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f31727b[C12234z.EnumC12236b.f31814C.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f31727b[C12234z.EnumC12236b.f31825u.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f31727b[C12234z.EnumC12236b.f31826v.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f31727b[C12234z.EnumC12236b.f31829y.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[C12234z.EnumC12241c.values().length];
            f31726a = iArr2;
            try {
                iArr2[C12234z.EnumC12241c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f31726a[C12234z.EnumC12241c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f31726a[C12234z.EnumC12241c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f31726a[C12234z.EnumC12241c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f31726a[C12234z.EnumC12241c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f31726a[C12234z.EnumC12241c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f31726a[C12234z.EnumC12241c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f31726a[C12234z.EnumC12241c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f31726a[C12234z.EnumC12241c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* renamed from: rh.h$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public interface InterfaceC12187b<T extends InterfaceC12187b<T>> extends Comparable<T> {
        /* renamed from: O */
        C12234z.EnumC12241c mo5812O();

        /* renamed from: P */
        boolean mo5811P();

        int getNumber();

        /* renamed from: u */
        boolean mo5808u();

        /* renamed from: x */
        C12234z.EnumC12236b mo5807x();

        /* renamed from: y */
        InterfaceC12210q.InterfaceC12211a mo5806y(InterfaceC12210q.InterfaceC12211a interfaceC12211a, InterfaceC12210q interfaceC12210q);
    }

    private C12185h() {
    }

    /* renamed from: c */
    private Object m5862c(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    /* renamed from: d */
    private static int m5861d(C12234z.EnumC12236b enumC12236b, int i, Object obj) {
        int m5943D = C12181f.m5943D(i);
        if (enumC12236b == C12234z.EnumC12236b.f31825u) {
            m5943D *= 2;
        }
        return m5943D + m5860e(enumC12236b, obj);
    }

    /* renamed from: e */
    private static int m5860e(C12234z.EnumC12236b enumC12236b, Object obj) {
        switch (C12186a.f31727b[enumC12236b.ordinal()]) {
            case 1:
                return C12181f.m5908g(((Double) obj).doubleValue());
            case 2:
                return C12181f.m5896m(((Float) obj).floatValue());
            case 3:
                return C12181f.m5888q(((Long) obj).longValue());
            case 4:
                return C12181f.m5941F(((Long) obj).longValue());
            case 5:
                return C12181f.m5890p(((Integer) obj).intValue());
            case 6:
                return C12181f.m5900k(((Long) obj).longValue());
            case 7:
                return C12181f.m5902j(((Integer) obj).intValue());
            case 8:
                return C12181f.m5918b(((Boolean) obj).booleanValue());
            case 9:
                return C12181f.m5944C((String) obj);
            case 10:
                if (obj instanceof AbstractC12177d) {
                    return C12181f.m5912e((AbstractC12177d) obj);
                }
                return C12181f.m5916c((byte[]) obj);
            case 11:
                return C12181f.m5942E(((Integer) obj).intValue());
            case 12:
                return C12181f.m5874x(((Integer) obj).intValue());
            case 13:
                return C12181f.m5872y(((Long) obj).longValue());
            case 14:
                return C12181f.m5870z(((Integer) obj).intValue());
            case 15:
                return C12181f.m5945B(((Long) obj).longValue());
            case 16:
                return C12181f.m5894n((InterfaceC12210q) obj);
            case 17:
                if (obj instanceof C12200l) {
                    return C12181f.m5886r((C12200l) obj);
                }
                return C12181f.m5882t((InterfaceC12210q) obj);
            case 18:
                if (obj instanceof C12196j.InterfaceC12197a) {
                    return C12181f.m5904i(((C12196j.InterfaceC12197a) obj).getNumber());
                }
                return C12181f.m5904i(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: f */
    public static int m5859f(InterfaceC12187b<?> interfaceC12187b, Object obj) {
        C12234z.EnumC12236b mo5807x = interfaceC12187b.mo5807x();
        int number = interfaceC12187b.getNumber();
        if (interfaceC12187b.mo5808u()) {
            int i = 0;
            if (interfaceC12187b.mo5811P()) {
                for (Object obj2 : (List) obj) {
                    i += m5860e(mo5807x, obj2);
                }
                return C12181f.m5943D(number) + i + C12181f.m5878v(i);
            }
            for (Object obj3 : (List) obj) {
                i += m5861d(mo5807x, number, obj3);
            }
            return i;
        }
        return m5861d(mo5807x, number, obj);
    }

    /* renamed from: g */
    public static <T extends InterfaceC12187b<T>> C12185h<T> m5858g() {
        return f31722d;
    }

    /* renamed from: l */
    public static int m5853l(C12234z.EnumC12236b enumC12236b, boolean z) {
        if (z) {
            return 2;
        }
        return enumC12236b.m5677b();
    }

    /* renamed from: o */
    private boolean m5850o(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.mo5812O() == C12234z.EnumC12241c.MESSAGE) {
            if (key.mo5808u()) {
                for (InterfaceC12210q interfaceC12210q : (List) entry.getValue()) {
                    if (!interfaceC12210q.mo5761j()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof InterfaceC12210q) {
                    if (!((InterfaceC12210q) value).mo5761j()) {
                        return false;
                    }
                } else if (value instanceof C12200l) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: s */
    private void m5846s(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C12200l) {
            value = ((C12200l) value).m5785e();
        }
        if (key.mo5808u()) {
            Object m5857h = m5857h(key);
            if (m5857h == null) {
                m5857h = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) m5857h).add(m5862c(obj));
            }
            this.f31723a.m5713p(key, m5857h);
        } else if (key.mo5812O() == C12234z.EnumC12241c.MESSAGE) {
            Object m5857h2 = m5857h(key);
            if (m5857h2 == null) {
                this.f31723a.m5713p(key, m5862c(value));
                return;
            }
            this.f31723a.m5713p(key, key.mo5806y(((InterfaceC12210q) m5857h2).mo5768b(), (InterfaceC12210q) value).build());
        } else {
            this.f31723a.m5713p(key, m5862c(value));
        }
    }

    /* renamed from: t */
    public static <T extends InterfaceC12187b<T>> C12185h<T> m5845t() {
        return new C12185h<>();
    }

    /* renamed from: u */
    public static Object m5844u(C12180e c12180e, C12234z.EnumC12236b enumC12236b, boolean z) {
        switch (C12186a.f31727b[enumC12236b.ordinal()]) {
            case 1:
                return Double.valueOf(c12180e.m5960m());
            case 2:
                return Float.valueOf(c12180e.m5956q());
            case 3:
                return Long.valueOf(c12180e.m5953t());
            case 4:
                return Long.valueOf(c12180e.m5980M());
            case 5:
                return Integer.valueOf(c12180e.m5954s());
            case 6:
                return Long.valueOf(c12180e.m5957p());
            case 7:
                return Integer.valueOf(c12180e.m5958o());
            case 8:
                return Boolean.valueOf(c12180e.m5962k());
            case 9:
                if (z) {
                    return c12180e.m5983J();
                }
                return c12180e.m5984I();
            case 10:
                return c12180e.m5961l();
            case 11:
                return Integer.valueOf(c12180e.m5981L());
            case 12:
                return Integer.valueOf(c12180e.m5988E());
            case 13:
                return Long.valueOf(c12180e.m5987F());
            case 14:
                return Integer.valueOf(c12180e.m5986G());
            case 15:
                return Long.valueOf(c12180e.m5985H());
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x001b, code lost:
        if ((r3 instanceof p326rh.C12200l) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0024, code lost:
        if ((r3 instanceof p326rh.C12196j.InterfaceC12197a) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x002d, code lost:
        if ((r3 instanceof byte[]) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0030, code lost:
        r0 = false;
     */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m5842w(p326rh.C12234z.EnumC12236b r2, java.lang.Object r3) {
        /*
            r3.getClass()
            int[] r0 = p326rh.C12185h.C12186a.f31726a
            rh.z$c r2 = r2.m5678a()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L42;
                case 2: goto L3f;
                case 3: goto L3c;
                case 4: goto L39;
                case 5: goto L36;
                case 6: goto L33;
                case 7: goto L27;
                case 8: goto L1e;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            goto L44
        L15:
            boolean r2 = r3 instanceof p326rh.InterfaceC12210q
            if (r2 != 0) goto L31
            boolean r2 = r3 instanceof p326rh.C12200l
            if (r2 == 0) goto L30
            goto L31
        L1e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L31
            boolean r2 = r3 instanceof p326rh.C12196j.InterfaceC12197a
            if (r2 == 0) goto L30
            goto L31
        L27:
            boolean r2 = r3 instanceof p326rh.AbstractC12177d
            if (r2 != 0) goto L31
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L30
            goto L31
        L30:
            r0 = r1
        L31:
            r1 = r0
            goto L44
        L33:
            boolean r1 = r3 instanceof java.lang.String
            goto L44
        L36:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L44
        L39:
            boolean r1 = r3 instanceof java.lang.Double
            goto L44
        L3c:
            boolean r1 = r3 instanceof java.lang.Float
            goto L44
        L3f:
            boolean r1 = r3 instanceof java.lang.Long
            goto L44
        L42:
            boolean r1 = r3 instanceof java.lang.Integer
        L44:
            if (r1 == 0) goto L47
            return
        L47:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p326rh.C12185h.m5842w(rh.z$b, java.lang.Object):void");
    }

    /* renamed from: x */
    private static void m5841x(C12181f c12181f, C12234z.EnumC12236b enumC12236b, int i, Object obj) {
        if (enumC12236b == C12234z.EnumC12236b.f31825u) {
            c12181f.m5922Y(i, (InterfaceC12210q) obj);
            return;
        }
        c12181f.m5875w0(i, m5853l(enumC12236b, false));
        m5840y(c12181f, enumC12236b, obj);
    }

    /* renamed from: y */
    private static void m5840y(C12181f c12181f, C12234z.EnumC12236b enumC12236b, Object obj) {
        switch (C12186a.f31727b[enumC12236b.ordinal()]) {
            case 1:
                c12181f.m5929R(((Double) obj).doubleValue());
                return;
            case 2:
                c12181f.m5923X(((Float) obj).floatValue());
                return;
            case 3:
                c12181f.m5915c0(((Long) obj).longValue());
                return;
            case 4:
                c12181f.m5869z0(((Long) obj).longValue());
                return;
            case 5:
                c12181f.m5917b0(((Integer) obj).intValue());
                return;
            case 6:
                c12181f.m5925V(((Long) obj).longValue());
                return;
            case 7:
                c12181f.m5926U(((Integer) obj).intValue());
                return;
            case 8:
                c12181f.m5934M(((Boolean) obj).booleanValue());
                return;
            case 9:
                c12181f.m5877v0((String) obj);
                return;
            case 10:
                if (obj instanceof AbstractC12177d) {
                    c12181f.m5931P((AbstractC12177d) obj);
                    return;
                } else {
                    c12181f.m5933N((byte[]) obj);
                    return;
                }
            case 11:
                c12181f.m5871y0(((Integer) obj).intValue());
                return;
            case 12:
                c12181f.m5887q0(((Integer) obj).intValue());
                return;
            case 13:
                c12181f.m5885r0(((Long) obj).longValue());
                return;
            case 14:
                c12181f.m5883s0(((Integer) obj).intValue());
                return;
            case 15:
                c12181f.m5879u0(((Long) obj).longValue());
                return;
            case 16:
                c12181f.m5921Z((InterfaceC12210q) obj);
                return;
            case 17:
                c12181f.m5911e0((InterfaceC12210q) obj);
                return;
            case 18:
                if (obj instanceof C12196j.InterfaceC12197a) {
                    c12181f.m5927T(((C12196j.InterfaceC12197a) obj).getNumber());
                    return;
                } else {
                    c12181f.m5927T(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: z */
    public static void m5839z(InterfaceC12187b<?> interfaceC12187b, Object obj, C12181f c12181f) {
        C12234z.EnumC12236b mo5807x = interfaceC12187b.mo5807x();
        int number = interfaceC12187b.getNumber();
        if (interfaceC12187b.mo5808u()) {
            List<Object> list = (List) obj;
            if (interfaceC12187b.mo5811P()) {
                c12181f.m5875w0(number, 2);
                int i = 0;
                for (Object obj2 : list) {
                    i += m5860e(mo5807x, obj2);
                }
                c12181f.m5891o0(i);
                for (Object obj3 : list) {
                    m5840y(c12181f, mo5807x, obj3);
                }
                return;
            }
            for (Object obj4 : list) {
                m5841x(c12181f, mo5807x, number, obj4);
            }
        } else if (obj instanceof C12200l) {
            m5841x(c12181f, mo5807x, number, ((C12200l) obj).m5785e());
        } else {
            m5841x(c12181f, mo5807x, number, obj);
        }
    }

    /* renamed from: a */
    public void m5864a(FieldDescriptorType fielddescriptortype, Object obj) {
        List list;
        if (fielddescriptortype.mo5808u()) {
            m5842w(fielddescriptortype.mo5807x(), obj);
            Object m5857h = m5857h(fielddescriptortype);
            if (m5857h == null) {
                list = new ArrayList();
                this.f31723a.m5713p(fielddescriptortype, list);
            } else {
                list = (List) m5857h;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public C12185h<FieldDescriptorType> clone() {
        C12185h<FieldDescriptorType> m5845t = m5845t();
        for (int i = 0; i < this.f31723a.m5718j(); i++) {
            Map.Entry<FieldDescriptorType, Object> m5719i = this.f31723a.m5719i(i);
            m5845t.m5843v(m5719i.getKey(), m5719i.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f31723a.m5717k()) {
            m5845t.m5843v(entry.getKey(), entry.getValue());
        }
        m5845t.f31725c = this.f31725c;
        return m5845t;
    }

    /* renamed from: h */
    public Object m5857h(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f31723a.get(fielddescriptortype);
        if (obj instanceof C12200l) {
            return ((C12200l) obj).m5785e();
        }
        return obj;
    }

    /* renamed from: i */
    public Object m5856i(FieldDescriptorType fielddescriptortype, int i) {
        if (fielddescriptortype.mo5808u()) {
            Object m5857h = m5857h(fielddescriptortype);
            if (m5857h != null) {
                return ((List) m5857h).get(i);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: j */
    public int m5855j(FieldDescriptorType fielddescriptortype) {
        if (fielddescriptortype.mo5808u()) {
            Object m5857h = m5857h(fielddescriptortype);
            if (m5857h == null) {
                return 0;
            }
            return ((List) m5857h).size();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: k */
    public int m5854k() {
        int i = 0;
        for (int i2 = 0; i2 < this.f31723a.m5718j(); i2++) {
            Map.Entry<FieldDescriptorType, Object> m5719i = this.f31723a.m5719i(i2);
            i += m5859f(m5719i.getKey(), m5719i.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f31723a.m5717k()) {
            i += m5859f(entry.getKey(), entry.getValue());
        }
        return i;
    }

    /* renamed from: m */
    public boolean m5852m(FieldDescriptorType fielddescriptortype) {
        if (!fielddescriptortype.mo5808u()) {
            if (this.f31723a.get(fielddescriptortype) != null) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }

    /* renamed from: n */
    public boolean m5851n() {
        for (int i = 0; i < this.f31723a.m5718j(); i++) {
            if (!m5850o(this.f31723a.m5719i(i))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.f31723a.m5717k()) {
            if (!m5850o(entry)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    public Iterator<Map.Entry<FieldDescriptorType, Object>> m5849p() {
        if (this.f31725c) {
            return new C12200l.C12203c(this.f31723a.entrySet().iterator());
        }
        return this.f31723a.entrySet().iterator();
    }

    /* renamed from: q */
    public void m5848q() {
        if (this.f31724b) {
            return;
        }
        this.f31723a.mo5711n();
        this.f31724b = true;
    }

    /* renamed from: r */
    public void m5847r(C12185h<FieldDescriptorType> c12185h) {
        for (int i = 0; i < c12185h.f31723a.m5718j(); i++) {
            m5846s(c12185h.f31723a.m5719i(i));
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : c12185h.f31723a.m5717k()) {
            m5846s(entry);
        }
    }

    /* renamed from: v */
    public void m5843v(FieldDescriptorType fielddescriptortype, Object obj) {
        if (fielddescriptortype.mo5808u()) {
            if (obj instanceof List) {
                ArrayList<Object> arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                for (Object obj2 : arrayList) {
                    m5842w(fielddescriptortype.mo5807x(), obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            m5842w(fielddescriptortype.mo5807x(), obj);
        }
        if (obj instanceof C12200l) {
            this.f31725c = true;
        }
        this.f31723a.m5713p(fielddescriptortype, obj);
    }

    private C12185h(boolean z) {
        m5848q();
    }
}