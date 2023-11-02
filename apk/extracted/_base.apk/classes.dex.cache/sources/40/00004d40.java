package sj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9654p;
import okio.Buffer;

@Metadata(m14358d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\u001a\f\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u00020\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0000H\u0002\u001a\"\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002\u001a0\u0010\r\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0002¨\u0006\u000f"}, m14357d2 = {"", "e", "", "a", "input", "", "pos", "limit", "Ljava/net/InetAddress;", "c", "", "address", "addressOffset", "b", "d", "okhttp"}, m14356k = 2, m14355mv = {1, 4, 0})
/* renamed from: sj.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C12560a {
    /* renamed from: a */
    private static final boolean m4841a(String str) {
        int m13709Y;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (C9612q.m13915j(charAt, 31) <= 0 || C9612q.m13915j(charAt, 127) >= 0) {
                return true;
            }
            m13709Y = C9654p.m13709Y(" #%/:?@[\\]", charAt, 0, false, 6, null);
            if (m13709Y != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private static final boolean m4840b(String str, int i, int i2, byte[] bArr, int i3) {
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char charAt = str.charAt(i5);
                if (C9612q.m13915j(charAt, 48) < 0 || C9612q.m13915j(charAt, 57) > 0) {
                    break;
                } else if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                    return false;
                } else {
                    i5++;
                }
            }
            if (i5 - i == 0) {
                return false;
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        if (i4 != i3 + 4) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0099, code lost:
        if (r14 != (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x009b, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x009c, code lost:
        r0 = r13 - r14;
        java.lang.System.arraycopy(r9, r14, r9, 16 - r0, r0);
        java.util.Arrays.fill(r9, r14, (16 - r13) + r14, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00ae, code lost:
        return java.net.InetAddress.getByAddress(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0097, code lost:
        if (r13 == 16) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:88:0x006b  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.net.InetAddress m4839c(java.lang.String r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 175
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sj.C12560a.m4839c(java.lang.String, int, int):java.net.InetAddress");
    }

    /* renamed from: d */
    private static final String m4838d(byte[] bArr) {
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        Buffer buffer = new Buffer();
        while (i2 < bArr.length) {
            if (i2 == i) {
                buffer.writeByte(58);
                i2 += i4;
                if (i2 == 16) {
                    buffer.writeByte(58);
                }
            } else {
                if (i2 > 0) {
                    buffer.writeByte(58);
                }
                buffer.mo8603n0((C12562c.m4809b(bArr[i2], 255) << 8) | C12562c.m4809b(bArr[i2 + 1], 255));
                i2 += 2;
            }
        }
        return buffer.mo8584p0();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006d A[RETURN] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String m4837e(java.lang.String r5) {
        /*
            java.lang.String r0 = "$this$toCanonicalHost"
            kotlin.jvm.internal.C9612q.m13917h(r5, r0)
            java.lang.String r0 = ":"
            r1 = 0
            r2 = 2
            r3 = 0
            boolean r0 = kotlin.text.C9642f.m13829M(r5, r0, r1, r2, r3)
            r4 = 1
            if (r0 == 0) goto L6e
            java.lang.String r0 = "["
            boolean r0 = kotlin.text.C9642f.m13835H(r5, r0, r1, r2, r3)
            if (r0 == 0) goto L2b
            java.lang.String r0 = "]"
            boolean r0 = kotlin.text.C9642f.m13794s(r5, r0, r1, r2, r3)
            if (r0 == 0) goto L2b
            int r0 = r5.length()
            int r0 = r0 - r4
            java.net.InetAddress r0 = m4839c(r5, r4, r0)
            goto L33
        L2b:
            int r0 = r5.length()
            java.net.InetAddress r0 = m4839c(r5, r1, r0)
        L33:
            if (r0 == 0) goto L6d
            byte[] r1 = r0.getAddress()
            int r2 = r1.length
            r3 = 16
            if (r2 != r3) goto L48
            java.lang.String r5 = "address"
            kotlin.jvm.internal.C9612q.m13918g(r1, r5)
            java.lang.String r5 = m4838d(r1)
            return r5
        L48:
            int r1 = r1.length
            r2 = 4
            if (r1 != r2) goto L51
            java.lang.String r5 = r0.getHostAddress()
            return r5
        L51:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid IPv6 address: '"
            r1.append(r2)
            r1.append(r5)
            r5 = 39
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L6d:
            return r3
        L6e:
            java.lang.String r5 = java.net.IDN.toASCII(r5)     // Catch: java.lang.IllegalArgumentException -> La4
            java.lang.String r0 = "IDN.toASCII(host)"
            kotlin.jvm.internal.C9612q.m13918g(r5, r0)     // Catch: java.lang.IllegalArgumentException -> La4
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.IllegalArgumentException -> La4
            java.lang.String r2 = "Locale.US"
            kotlin.jvm.internal.C9612q.m13918g(r0, r2)     // Catch: java.lang.IllegalArgumentException -> La4
            if (r5 == 0) goto L9c
            java.lang.String r5 = r5.toLowerCase(r0)     // Catch: java.lang.IllegalArgumentException -> La4
            java.lang.String r0 = "(this as java.lang.String).toLowerCase(locale)"
            kotlin.jvm.internal.C9612q.m13918g(r5, r0)     // Catch: java.lang.IllegalArgumentException -> La4
            int r0 = r5.length()     // Catch: java.lang.IllegalArgumentException -> La4
            if (r0 != 0) goto L90
            r1 = r4
        L90:
            if (r1 == 0) goto L93
            return r3
        L93:
            boolean r0 = m4841a(r5)     // Catch: java.lang.IllegalArgumentException -> La4
            if (r0 == 0) goto L9a
            goto L9b
        L9a:
            r3 = r5
        L9b:
            return r3
        L9c:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch: java.lang.IllegalArgumentException -> La4
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            r5.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> La4
            throw r5     // Catch: java.lang.IllegalArgumentException -> La4
        La4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: sj.C12560a.m4837e(java.lang.String):java.lang.String");
    }
}