package p164j$.time;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;

/* renamed from: j$.time.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8297f implements Comparable, Serializable {

    /* renamed from: c */
    public static final C8297f f22295c = new C8297f(0, 0);

    /* renamed from: a */
    private final long f22296a;

    /* renamed from: b */
    private final int f22297b;

    static {
        BigInteger.valueOf(1000000000L);
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    }

    private C8297f(long j, int i) {
        this.f22296a = j;
        this.f22297b = i;
    }

    /* renamed from: a */
    private static C8297f m17896a(long j, int i) {
        return (((long) i) | j) == 0 ? f22295c : new C8297f(j, i);
    }

    /* renamed from: b */
    public static C8297f m17895b(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (i + 1000000000);
            j2--;
        }
        return m17896a(j2, i);
    }

    /* renamed from: c */
    public static C8297f m17894c() {
        return m17896a(AbstractC8284a.m17902d(Long.MAX_VALUE, AbstractC8284a.m17900f(999999999L, 1000000000L)), (int) AbstractC8284a.m17901e(999999999L, 1000000000L));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C8297f c8297f = (C8297f) obj;
        int compare = Long.compare(this.f22296a, c8297f.f22296a);
        return compare != 0 ? compare : this.f22297b - c8297f.f22297b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8297f) {
            C8297f c8297f = (C8297f) obj;
            return this.f22296a == c8297f.f22296a && this.f22297b == c8297f.f22297b;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f22296a;
        return (this.f22297b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        if (this == f22295c) {
            return "PT0S";
        }
        long j = this.f22296a;
        long j2 = j / 3600;
        int i = (int) ((j % 3600) / 60);
        int i2 = (int) (j % 60);
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("PT");
        if (j2 != 0) {
            sb2.append(j2);
            sb2.append('H');
        }
        if (i != 0) {
            sb2.append(i);
            sb2.append('M');
        }
        int i3 = this.f22297b;
        if (i2 == 0 && i3 == 0 && sb2.length() > 2) {
            return sb2.toString();
        }
        if (i2 >= 0 || i3 <= 0) {
            sb2.append(i2);
        } else if (i2 == -1) {
            sb2.append("-0");
        } else {
            sb2.append(i2 + 1);
        }
        if (i3 > 0) {
            int length = sb2.length();
            sb2.append(i2 < 0 ? 2000000000 - i3 : i3 + 1000000000);
            while (sb2.charAt(sb2.length() - 1) == '0') {
                sb2.setLength(sb2.length() - 1);
            }
            sb2.setCharAt(length, '.');
        }
        sb2.append('S');
        return sb2.toString();
    }
}
