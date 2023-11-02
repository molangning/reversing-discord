package net.time4j.p249tz;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.concurrent.ConcurrentMap;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: net.time4j.tz.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C10835p implements Comparable<C10835p>, InterfaceC10808k, Serializable {

    /* renamed from: m */
    private static final ConcurrentMap<Integer, C10835p> f28288m;

    /* renamed from: n */
    private static final BigDecimal f28289n;

    /* renamed from: o */
    private static final BigDecimal f28290o;

    /* renamed from: p */
    private static final BigDecimal f28291p;

    /* renamed from: q */
    private static final BigDecimal f28292q;

    /* renamed from: r */
    private static final BigDecimal f28293r;

    /* renamed from: s */
    private static final BigDecimal f28294s;
    private static final long serialVersionUID = -1410512619471503090L;

    /* renamed from: t */
    public static final C10835p f28295t;

    /* renamed from: j */
    private final transient int f28296j;

    /* renamed from: k */
    private final transient int f28297k;

    /* renamed from: l */
    private final transient String f28298l;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f28288m = concurrentHashMap;
        f28289n = new BigDecimal(60);
        f28290o = new BigDecimal(3600);
        f28291p = new BigDecimal(-180);
        f28292q = new BigDecimal(180);
        f28293r = new BigDecimal(240);
        f28294s = new BigDecimal(1000000000);
        C10835p c10835p = new C10835p(0, 0);
        f28295t = c10835p;
        concurrentHashMap.put(0, c10835p);
    }

    private C10835p(int i, int i2) {
        boolean z;
        char c;
        if (i2 == 0) {
            if (i < -64800 || i > 64800) {
                throw new IllegalArgumentException("Total seconds out of range: " + i);
            }
        } else if (Math.abs(i2) <= 999999999) {
            if (i >= -39600 && i <= 39600) {
                if ((i < 0 && i2 > 0) || (i > 0 && i2 < 0)) {
                    throw new IllegalArgumentException("Different signs: offset=" + i + ", fraction=" + i2);
                }
            } else {
                throw new IllegalArgumentException("Total seconds out of range while fraction is non-zero: " + i);
            }
        } else {
            throw new IllegalArgumentException("Fraction out of range: " + i2);
        }
        if (i >= 0 && i2 >= 0) {
            z = false;
        } else {
            z = true;
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            c = '-';
        } else {
            c = '+';
        }
        sb2.append(c);
        int abs = Math.abs(i);
        int i3 = abs / 3600;
        int i4 = (abs / 60) % 60;
        int i5 = abs % 60;
        if (i3 < 10) {
            sb2.append('0');
        }
        sb2.append(i3);
        sb2.append(':');
        if (i4 < 10) {
            sb2.append('0');
        }
        sb2.append(i4);
        if (i5 != 0 || i2 != 0) {
            sb2.append(':');
            if (i5 < 10) {
                sb2.append('0');
            }
            sb2.append(i5);
            if (i2 != 0) {
                sb2.append('.');
                String valueOf = String.valueOf(Math.abs(i2));
                int length = 9 - valueOf.length();
                for (int i6 = 0; i6 < length; i6++) {
                    sb2.append('0');
                }
                sb2.append(valueOf);
            }
        }
        this.f28298l = sb2.toString();
        this.f28296j = i;
        this.f28297k = i2;
    }

    /* renamed from: b */
    public static C10835p m10034b(BigDecimal bigDecimal) {
        if (bigDecimal.compareTo(f28292q) <= 0 && bigDecimal.compareTo(f28291p) >= 0) {
            BigDecimal multiply = bigDecimal.multiply(f28293r);
            BigDecimal scale = multiply.setScale(0, RoundingMode.DOWN);
            BigDecimal multiply2 = multiply.subtract(scale).setScale(9, RoundingMode.HALF_UP).multiply(f28294s);
            int intValueExact = scale.intValueExact();
            int intValueExact2 = multiply2.intValueExact();
            if (intValueExact2 == 0) {
                return m10020q(intValueExact);
            }
            if (intValueExact2 == 1000000000) {
                return m10020q(intValueExact + 1);
            }
            if (intValueExact2 == -1000000000) {
                return m10020q(intValueExact - 1);
            }
            return new C10835p(intValueExact, intValueExact2);
        }
        throw new IllegalArgumentException("Out of range: " + bigDecimal);
    }

    /* renamed from: c */
    public static C10835p m10033c(EnumC10803f enumC10803f, int i, int i2, double d) {
        if (enumC10803f != null) {
            if (i >= 0 && i <= 180) {
                if (i2 >= 0 && i2 <= 59) {
                    if (Double.compare(d, 0.0d) >= 0 && Double.compare(d, 60.0d) < 0) {
                        BigDecimal valueOf = BigDecimal.valueOf(i);
                        if (i2 != 0) {
                            valueOf = valueOf.add(BigDecimal.valueOf(i2).setScale(15, RoundingMode.UNNECESSARY).divide(f28289n, RoundingMode.HALF_UP));
                        }
                        if (d != 0.0d) {
                            valueOf = valueOf.add(BigDecimal.valueOf(d).setScale(15, RoundingMode.FLOOR).divide(f28290o, RoundingMode.HALF_UP));
                        }
                        if (enumC10803f == EnumC10803f.BEHIND_UTC) {
                            valueOf = valueOf.negate();
                        }
                        return m10034b(valueOf);
                    }
                    throw new IllegalArgumentException("Arc second out of range (0.0 <= arcSeconds < 60.0).");
                }
                throw new IllegalArgumentException("Arc minute out of range (0 <= arcMinutes <= 59).");
            }
            throw new IllegalArgumentException("Degrees of longitude out of range (0 <= degrees <= 180).");
        }
        throw new NullPointerException("Missing sign.");
    }

    /* renamed from: e */
    private static String m10031e(int i, int i2) {
        return "[hours=" + i + ",minutes=" + i2 + ']';
    }

    /* renamed from: o */
    public static C10835p m10022o(EnumC10803f enumC10803f, int i) {
        return m10021p(enumC10803f, i, 0);
    }

    /* renamed from: p */
    public static C10835p m10021p(EnumC10803f enumC10803f, int i, int i2) {
        if (enumC10803f != null) {
            if (i >= 0 && i <= 18) {
                if (i2 >= 0 && i2 <= 59) {
                    if (i == 18 && i2 != 0) {
                        throw new IllegalArgumentException("Time zone offset out of range (-18:00:00 <= offset <= 18:00:00) in: " + m10031e(i, i2));
                    }
                    int i3 = (i * 3600) + (i2 * 60);
                    if (enumC10803f == EnumC10803f.BEHIND_UTC) {
                        i3 = -i3;
                    }
                    return m10020q(i3);
                }
                throw new IllegalArgumentException("Minute part out of range (0 <= minutes <= 59) in: " + m10031e(i, i2));
            }
            throw new IllegalArgumentException("Hour part out of range (0 <= hours <= 18) in: " + m10031e(i, i2));
        }
        throw new NullPointerException("Missing sign.");
    }

    /* renamed from: q */
    public static C10835p m10020q(int i) {
        return m10019r(i, 0);
    }

    /* renamed from: r */
    public static C10835p m10019r(int i, int i2) {
        if (i2 != 0) {
            return new C10835p(i, i2);
        }
        if (i == 0) {
            return f28295t;
        }
        if (i % 900 == 0) {
            Integer valueOf = Integer.valueOf(i);
            ConcurrentMap<Integer, C10835p> concurrentMap = f28288m;
            C10835p c10835p = concurrentMap.get(valueOf);
            if (c10835p == null) {
                concurrentMap.putIfAbsent(valueOf, new C10835p(i, 0));
                return concurrentMap.get(valueOf);
            }
            return c10835p;
        }
        return new C10835p(i, 0);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    /* renamed from: s */
    private static int m10018s(String str, int i, int i2) {
        int min = Math.min(str.length() - i, i2);
        int i3 = -1;
        for (int i4 = 0; i4 < min; i4++) {
            char charAt = str.charAt(i + i4);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            i3 = i3 == -1 ? charAt - '0' : (i3 * 10) + (charAt - '0');
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0048  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static net.time4j.p249tz.C10835p m10017t(java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.p249tz.C10835p.m10017t(java.lang.String, boolean):net.time4j.tz.p");
    }

    private Object writeReplace() {
        return new SPX(this, 15);
    }

    @Override // net.time4j.p249tz.InterfaceC10808k
    /* renamed from: a */
    public String mo10035a() {
        if (this.f28296j == 0 && this.f28297k == 0) {
            return "Z";
        }
        return "UTC" + this.f28298l;
    }

    @Override // java.lang.Comparable
    /* renamed from: d */
    public int compareTo(C10835p c10835p) {
        int i = this.f28296j;
        int i2 = c10835p.f28296j;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = this.f28297k - c10835p.f28297k;
        if (i3 < 0) {
            return -1;
        }
        if (i3 != 0) {
            return 1;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10835p)) {
            return false;
        }
        C10835p c10835p = (C10835p) obj;
        if (this.f28296j == c10835p.f28296j && this.f28297k == c10835p.f28297k) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int m10030f() {
        return Math.abs(this.f28296j) / 3600;
    }

    /* renamed from: g */
    public int m10029g() {
        return (Math.abs(this.f28296j) / 60) % 60;
    }

    /* renamed from: h */
    public int m10028h() {
        return Math.abs(this.f28296j) % 60;
    }

    public int hashCode() {
        return (~this.f28296j) + (this.f28297k % 64000);
    }

    /* renamed from: i */
    public int m10027i() {
        return this.f28297k;
    }

    /* renamed from: k */
    public int m10026k() {
        return this.f28296j;
    }

    /* renamed from: l */
    public C10807j m10025l() {
        return C10807j.m10163R(this);
    }

    /* renamed from: m */
    public EnumC10803f m10024m() {
        return (this.f28296j < 0 || this.f28297k < 0) ? EnumC10803f.BEHIND_UTC : EnumC10803f.AHEAD_OF_UTC;
    }

    /* renamed from: n */
    public String m10023n(Locale locale) {
        boolean z;
        if (this.f28296j == 0 && this.f28297k == 0) {
            z = true;
        } else {
            z = false;
        }
        try {
            return AbstractC10809l.f28226C.mo6618e(z, locale);
        } catch (Throwable unused) {
            if (z) {
                return "GMT";
            }
            return "GMT±hh:mm";
        }
    }

    public String toString() {
        return this.f28298l;
    }
}