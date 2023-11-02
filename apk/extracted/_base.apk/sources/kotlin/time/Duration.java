package kotlin.time;

import co.discord.media_engine.C2689b;
import com.reactnativecommunity.webview.RNCWebViewManager;
import gg.C6755g;
import gg.C6759j;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C9654p;
import p373ui.C12981b;
import p373ui.EnumC12982c;

@Metadata(m14358d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b&\b\u0087@\u0018\u0000 P2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001QB\u0014\b\u0000\u0012\u0006\u00100\u001a\u00020\u000bø\u0001\u0001¢\u0006\u0004\bO\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0016\u0010\u0006\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\r\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\r\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u001b\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0000H\u0096\u0002ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ?\u0010'\u001a\u00020&*\u00060 j\u0002`!2\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u0002H\u0002¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u001d¢\u0006\u0004\b)\u0010\u001fJ\u0010\u0010*\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0014\u00100\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u001bR\u0014\u00102\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0007R\u0014\u00105\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0017\u00107\u001a\u00020\u00008Fø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b6\u0010\u0007R\u001a\u0010;\u001a\u00020\u00138@X\u0081\u0004¢\u0006\f\u0012\u0004\b9\u0010:\u001a\u0004\b8\u0010+R\u001a\u0010>\u001a\u00020\u00138@X\u0081\u0004¢\u0006\f\u0012\u0004\b=\u0010:\u001a\u0004\b<\u0010+R\u001a\u0010A\u001a\u00020\u00138@X\u0081\u0004¢\u0006\f\u0012\u0004\b@\u0010:\u001a\u0004\b?\u0010+R\u001a\u0010D\u001a\u00020\u00138@X\u0081\u0004¢\u0006\f\u0012\u0004\bC\u0010:\u001a\u0004\bB\u0010+R\u0011\u0010F\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bE\u0010\u0007R\u0011\u0010H\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bG\u0010\u0007R\u0011\u0010J\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bI\u0010\u0007R\u0011\u0010L\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bK\u0010\u0007R\u0011\u0010N\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bM\u0010\u0007\u0088\u00010\u0092\u0001\u00020\u000bø\u0001\u0001\u0082\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006R"}, m14357d2 = {"Lkotlin/time/Duration;", "", "", "D", "(J)Z", "C", "L", "(J)J", "other", "G", "(JJ)J", "", "thisMillis", "otherNanos", "c", "(JJJ)J", "F", "E", "B", "", "g", "(JJ)I", "Lui/c;", "unit", "", "H", "(JLui/c;)D", "J", "(JLui/c;)J", "", "K", "(J)Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "", "d", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "I", "A", "(J)I", "", "i", "(JLjava/lang/Object;)Z", "j", "rawValue", "z", "value", "w", "(J)Lui/c;", "storageUnit", "l", "absoluteValue", "m", "getHoursComponent$annotations", "()V", "hoursComponent", "s", "getMinutesComponent$annotations", "minutesComponent", "v", "getSecondsComponent$annotations", "secondsComponent", "t", "getNanosecondsComponent$annotations", "nanosecondsComponent", "n", "inWholeDays", "o", "inWholeHours", "q", "inWholeMinutes", "r", "inWholeSeconds", "p", "inWholeMilliseconds", "h", "k", "a", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class Duration implements Comparable<Duration> {

    /* renamed from: k */
    public static final C9661a f25397k = new C9661a(null);

    /* renamed from: l */
    private static final long f25398l = m13640h(0);

    /* renamed from: m */
    private static final long f25399m;

    /* renamed from: n */
    private static final long f25400n;

    /* renamed from: j */
    private final long f25401j;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0007\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n\u0082\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006\u000f"}, m14357d2 = {"Lkotlin/time/Duration$a;", "", "", "value", "Lkotlin/time/Duration;", "c", "(Ljava/lang/String;)J", "ZERO", "J", "b", "()J", "INFINITE", "a", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kotlin.time.Duration$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9661a {
        private C9661a() {
        }

        public /* synthetic */ C9661a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long m13625a() {
            return Duration.f25399m;
        }

        /* renamed from: b */
        public final long m13624b() {
            return Duration.f25398l;
        }

        /* renamed from: c */
        public final long m13623c(String value) {
            long m13607p;
            C9612q.m13917h(value, "value");
            try {
                m13607p = C9662a.m13607p(value, true);
                return m13607p;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e);
            }
        }
    }

    static {
        long m13613j;
        long m13613j2;
        m13613j = C9662a.m13613j(4611686018427387903L);
        f25399m = m13613j;
        m13613j2 = C9662a.m13613j(-4611686018427387903L);
        f25400n = m13613j2;
    }

    private /* synthetic */ Duration(long j) {
        this.f25401j = j;
    }

    /* renamed from: A */
    public static int m13660A(long j) {
        return C2689b.m32716a(j);
    }

    /* renamed from: B */
    public static final boolean m13659B(long j) {
        return !m13656E(j);
    }

    /* renamed from: C */
    private static final boolean m13658C(long j) {
        return (((int) j) & 1) == 1;
    }

    /* renamed from: D */
    private static final boolean m13657D(long j) {
        return (((int) j) & 1) == 0;
    }

    /* renamed from: E */
    public static final boolean m13656E(long j) {
        return j == f25399m || j == f25400n;
    }

    /* renamed from: F */
    public static final boolean m13655F(long j) {
        return j < 0;
    }

    /* renamed from: G */
    public static final long m13654G(long j, long j2) {
        long m13612k;
        long m13610m;
        if (m13656E(j)) {
            if (!m13659B(j2) && (j2 ^ j) < 0) {
                throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
            }
            return j;
        } else if (m13656E(j2)) {
            return j2;
        } else {
            if ((((int) j) & 1) == (((int) j2) & 1)) {
                long m13626z = m13626z(j) + m13626z(j2);
                if (m13657D(j)) {
                    m13610m = C9662a.m13610m(m13626z);
                    return m13610m;
                }
                m13612k = C9662a.m13612k(m13626z);
                return m13612k;
            } else if (m13658C(j)) {
                return m13645c(j, m13626z(j), m13626z(j2));
            } else {
                return m13645c(j, m13626z(j2), m13626z(j));
            }
        }
    }

    /* renamed from: H */
    public static final double m13653H(long j, EnumC12982c unit) {
        C9612q.m13917h(unit, "unit");
        if (j == f25399m) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == f25400n) {
            return Double.NEGATIVE_INFINITY;
        }
        return C9663b.m13602a(m13626z(j), m13627w(j), unit);
    }

    /* renamed from: I */
    public static final String m13652I(long j) {
        boolean z;
        boolean z2;
        StringBuilder sb2 = new StringBuilder();
        if (m13655F(j)) {
            sb2.append('-');
        }
        sb2.append("PT");
        long m13637l = m13637l(j);
        long m13634o = m13634o(m13637l);
        int m13630s = m13630s(m13637l);
        int m13628v = m13628v(m13637l);
        int m13629t = m13629t(m13637l);
        if (m13656E(j)) {
            m13634o = 9999999999999L;
        }
        boolean z3 = true;
        if (m13634o != 0) {
            z = true;
        } else {
            z = false;
        }
        if (m13628v == 0 && m13629t == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (m13630s == 0 && (!z2 || !z)) {
            z3 = false;
        }
        if (z) {
            sb2.append(m13634o);
            sb2.append('H');
        }
        if (z3) {
            sb2.append(m13630s);
            sb2.append('M');
        }
        if (z2 || (!z && !z3)) {
            m13644d(j, sb2, m13628v, m13629t, 9, "S", true);
        }
        String sb3 = sb2.toString();
        C9612q.m13918g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: J */
    public static final long m13651J(long j, EnumC12982c unit) {
        C9612q.m13917h(unit, "unit");
        if (j == f25399m) {
            return Long.MAX_VALUE;
        }
        if (j == f25400n) {
            return Long.MIN_VALUE;
        }
        return C9663b.m13601b(m13626z(j), m13627w(j), unit);
    }

    /* renamed from: K */
    public static String m13650K(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (j == 0) {
            return "0s";
        }
        if (j == f25399m) {
            return "Infinity";
        }
        if (j == f25400n) {
            return "-Infinity";
        }
        boolean m13655F = m13655F(j);
        StringBuilder sb2 = new StringBuilder();
        if (m13655F) {
            sb2.append('-');
        }
        long m13637l = m13637l(j);
        long m13635n = m13635n(m13637l);
        int m13636m = m13636m(m13637l);
        int m13630s = m13630s(m13637l);
        int m13628v = m13628v(m13637l);
        int m13629t = m13629t(m13637l);
        int i = 0;
        if (m13635n != 0) {
            z = true;
        } else {
            z = false;
        }
        if (m13636m != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (m13630s != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (m13628v == 0 && m13629t == 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z) {
            sb2.append(m13635n);
            sb2.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb2.append(' ');
            }
            sb2.append(m13636m);
            sb2.append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb2.append(' ');
            }
            sb2.append(m13630s);
            sb2.append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb2.append(' ');
            }
            if (m13628v == 0 && !z && !z2 && !z3) {
                if (m13629t >= 1000000) {
                    m13644d(j, sb2, m13629t / 1000000, m13629t % 1000000, 6, "ms", false);
                } else if (m13629t >= 1000) {
                    m13644d(j, sb2, m13629t / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, m13629t % RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, 3, "us", false);
                } else {
                    sb2.append(m13629t);
                    sb2.append("ns");
                }
            } else {
                m13644d(j, sb2, m13628v, m13629t, 9, "s", false);
            }
            i = i4;
        }
        if (m13655F && i > 1) {
            sb2.insert(1, '(').append(')');
        }
        String sb3 = sb2.toString();
        C9612q.m13918g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: L */
    public static final long m13649L(long j) {
        long m13614i;
        m13614i = C9662a.m13614i(-m13626z(j), ((int) j) & 1);
        return m13614i;
    }

    /* renamed from: c */
    private static final long m13645c(long j, long j2, long j3) {
        long m13608o;
        long m21922k;
        long m13613j;
        long m13609n;
        long m13609n2;
        long m13611l;
        m13608o = C9662a.m13608o(j3);
        long j4 = j2 + m13608o;
        if (new C6755g(-4611686018426L, 4611686018426L).m21950o(j4)) {
            m13609n = C9662a.m13609n(m13608o);
            long j5 = j3 - m13609n;
            m13609n2 = C9662a.m13609n(j4);
            m13611l = C9662a.m13611l(m13609n2 + j5);
            return m13611l;
        }
        m21922k = C6759j.m21922k(j4, -4611686018427387903L, 4611686018427387903L);
        m13613j = C9662a.m13613j(m21922k);
        return m13613j;
    }

    /* renamed from: d */
    private static final void m13644d(long j, StringBuilder sb2, int i, int i2, int i3, String str, boolean z) {
        String m13698j0;
        boolean z2;
        sb2.append(i);
        if (i2 != 0) {
            sb2.append('.');
            m13698j0 = C9654p.m13698j0(String.valueOf(i2), i3, '0');
            int i4 = -1;
            int length = m13698j0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (m13698j0.charAt(length) != '0') {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (!z && i6 < 3) {
                sb2.append((CharSequence) m13698j0, 0, i6);
                C9612q.m13918g(sb2, "this.append(value, startIndex, endIndex)");
            } else {
                sb2.append((CharSequence) m13698j0, 0, ((i6 + 2) / 3) * 3);
                C9612q.m13918g(sb2, "this.append(value, startIndex, endIndex)");
            }
        }
        sb2.append(str);
    }

    /* renamed from: e */
    public static final /* synthetic */ Duration m13643e(long j) {
        return new Duration(j);
    }

    /* renamed from: g */
    public static int m13641g(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 >= 0 && (((int) j3) & 1) != 0) {
            int i = (((int) j) & 1) - (((int) j2) & 1);
            if (m13655F(j)) {
                return -i;
            }
            return i;
        }
        return C9612q.m13914k(j, j2);
    }

    /* renamed from: h */
    public static long m13640h(long j) {
        if (C12981b.m3537a()) {
            if (m13657D(j)) {
                if (!new C6755g(-4611686018426999999L, 4611686018426999999L).m21950o(m13626z(j))) {
                    throw new AssertionError(m13626z(j) + " ns is out of nanoseconds range");
                }
            } else if (new C6755g(-4611686018427387903L, 4611686018427387903L).m21950o(m13626z(j))) {
                if (new C6755g(-4611686018426L, 4611686018426L).m21950o(m13626z(j))) {
                    throw new AssertionError(m13626z(j) + " ms is denormalized");
                }
            } else {
                throw new AssertionError(m13626z(j) + " ms is out of milliseconds range");
            }
        }
        return j;
    }

    /* renamed from: i */
    public static boolean m13639i(long j, Object obj) {
        return (obj instanceof Duration) && j == ((Duration) obj).m13648M();
    }

    /* renamed from: k */
    public static final boolean m13638k(long j, long j2) {
        return j == j2;
    }

    /* renamed from: l */
    public static final long m13637l(long j) {
        return m13655F(j) ? m13649L(j) : j;
    }

    /* renamed from: m */
    public static final int m13636m(long j) {
        if (m13656E(j)) {
            return 0;
        }
        return (int) (m13634o(j) % 24);
    }

    /* renamed from: n */
    public static final long m13635n(long j) {
        return m13651J(j, EnumC12982c.DAYS);
    }

    /* renamed from: o */
    public static final long m13634o(long j) {
        return m13651J(j, EnumC12982c.HOURS);
    }

    /* renamed from: p */
    public static final long m13633p(long j) {
        return (m13658C(j) && m13659B(j)) ? m13626z(j) : m13651J(j, EnumC12982c.MILLISECONDS);
    }

    /* renamed from: q */
    public static final long m13632q(long j) {
        return m13651J(j, EnumC12982c.MINUTES);
    }

    /* renamed from: r */
    public static final long m13631r(long j) {
        return m13651J(j, EnumC12982c.SECONDS);
    }

    /* renamed from: s */
    public static final int m13630s(long j) {
        if (m13656E(j)) {
            return 0;
        }
        return (int) (m13632q(j) % 60);
    }

    /* renamed from: t */
    public static final int m13629t(long j) {
        long m13626z;
        if (m13656E(j)) {
            return 0;
        }
        if (m13658C(j)) {
            m13626z = C9662a.m13609n(m13626z(j) % ((long) RNCWebViewManager.COMMAND_CLEAR_FORM_DATA));
        } else {
            m13626z = m13626z(j) % 1000000000;
        }
        return (int) m13626z;
    }

    /* renamed from: v */
    public static final int m13628v(long j) {
        if (m13656E(j)) {
            return 0;
        }
        return (int) (m13631r(j) % 60);
    }

    /* renamed from: w */
    private static final EnumC12982c m13627w(long j) {
        return m13657D(j) ? EnumC12982c.NANOSECONDS : EnumC12982c.MILLISECONDS;
    }

    /* renamed from: z */
    private static final long m13626z(long j) {
        return j >> 1;
    }

    /* renamed from: M */
    public final /* synthetic */ long m13648M() {
        return this.f25401j;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Duration duration) {
        return m13642f(duration.m13648M());
    }

    public boolean equals(Object obj) {
        return m13639i(this.f25401j, obj);
    }

    /* renamed from: f */
    public int m13642f(long j) {
        return m13641g(this.f25401j, j);
    }

    public int hashCode() {
        return m13660A(this.f25401j);
    }

    public String toString() {
        return m13650K(this.f25401j);
    }
}
