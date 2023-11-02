package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\n\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0000H\u0000¨\u0006\u000f"}, m14357d2 = {"", "", "m", "(Ljava/lang/String;)Ljava/lang/Integer;", "radix", "n", "(Ljava/lang/String;I)Ljava/lang/Integer;", "", "o", "(Ljava/lang/String;)Ljava/lang/Long;", "p", "(Ljava/lang/String;I)Ljava/lang/Long;", "input", "", "l", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/text/StringsKt")
/* renamed from: kotlin.text.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C9652n extends C9651m {
    /* renamed from: l */
    public static final Void m13770l(String input) {
        C9612q.m13917h(input, "input");
        throw new NumberFormatException("Invalid number format: '" + input + '\'');
    }

    /* renamed from: m */
    public static Integer m13769m(String str) {
        C9612q.m13917h(str, "<this>");
        return m13768n(str, 10);
    }

    /* renamed from: n */
    public static final Integer m13768n(String str, int i) {
        boolean z;
        int i2;
        int i3;
        C9612q.m13917h(str, "<this>");
        C9637b.m13854a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char charAt = str.charAt(0);
        int i5 = -2147483647;
        if (C9612q.m13915j(charAt, 48) < 0) {
            i2 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                i5 = Integer.MIN_VALUE;
                z = true;
            } else if (charAt != '+') {
                return null;
            } else {
                z = false;
            }
        } else {
            z = false;
            i2 = 0;
        }
        int i6 = -59652323;
        while (i2 < length) {
            int m13853b = C9637b.m13853b(str.charAt(i2), i);
            if (m13853b < 0) {
                return null;
            }
            if ((i4 < i6 && (i6 != -59652323 || i4 < (i6 = i5 / i))) || (i3 = i4 * i) < i5 + m13853b) {
                return null;
            }
            i4 = i3 - m13853b;
            i2++;
        }
        if (z) {
            return Integer.valueOf(i4);
        }
        return Integer.valueOf(-i4);
    }

    /* renamed from: o */
    public static Long m13767o(String str) {
        C9612q.m13917h(str, "<this>");
        return m13766p(str, 10);
    }

    /* renamed from: p */
    public static final Long m13766p(String str, int i) {
        boolean z;
        C9612q.m13917h(str, "<this>");
        C9637b.m13854a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (C9612q.m13915j(charAt, 48) < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                j = Long.MIN_VALUE;
                i2 = 1;
            } else if (charAt != '+') {
                return null;
            } else {
                z = false;
                i2 = 1;
            }
        } else {
            z = false;
        }
        long j2 = -256204778801521550L;
        long j3 = 0;
        long j4 = -256204778801521550L;
        while (i2 < length) {
            int m13853b = C9637b.m13853b(str.charAt(i2), i);
            if (m13853b < 0) {
                return null;
            }
            if (j3 < j4) {
                if (j4 == j2) {
                    j4 = j / i;
                    if (j3 < j4) {
                    }
                }
                return null;
            }
            long j5 = j3 * i;
            long j6 = m13853b;
            if (j5 < j + j6) {
                return null;
            }
            j3 = j5 - j6;
            i2++;
            j2 = -256204778801521550L;
        }
        if (z) {
            return Long.valueOf(j3);
        }
        return Long.valueOf(-j3);
    }
}
