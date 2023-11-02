package io.sentry.vendor.gson.stream;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* renamed from: io.sentry.vendor.gson.stream.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C8254a implements Closeable {

    /* renamed from: j */
    private final Reader f22184j;

    /* renamed from: r */
    private long f22192r;

    /* renamed from: s */
    private int f22193s;

    /* renamed from: t */
    private String f22194t;

    /* renamed from: u */
    private int[] f22195u;

    /* renamed from: w */
    private String[] f22197w;

    /* renamed from: x */
    private int[] f22198x;

    /* renamed from: k */
    private boolean f22185k = false;

    /* renamed from: l */
    private final char[] f22186l = new char[1024];

    /* renamed from: m */
    private int f22187m = 0;

    /* renamed from: n */
    private int f22188n = 0;

    /* renamed from: o */
    private int f22189o = 0;

    /* renamed from: p */
    private int f22190p = 0;

    /* renamed from: q */
    int f22191q = 0;

    /* renamed from: v */
    private int f22196v = 0 + 1;

    public C8254a(Reader reader) {
        int[] iArr = new int[32];
        this.f22195u = iArr;
        iArr[0] = 6;
        this.f22197w = new String[32];
        this.f22198x = new int[32];
        if (reader != null) {
            this.f22184j = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    /* renamed from: A0 */
    private char m18116A0() {
        int i;
        int i2;
        if (this.f22187m == this.f22188n && !m18090s(1)) {
            throw m18109G0("Unterminated escape sequence");
        }
        char[] cArr = this.f22186l;
        int i3 = this.f22187m;
        int i4 = i3 + 1;
        this.f22187m = i4;
        char c = cArr[i3];
        if (c != '\n') {
            if (c != '\"' && c != '\'' && c != '/' && c != '\\') {
                if (c != 'b') {
                    if (c != 'f') {
                        if (c == 'n') {
                            return '\n';
                        }
                        if (c != 'r') {
                            if (c != 't') {
                                if (c == 'u') {
                                    if (i4 + 4 > this.f22188n && !m18090s(4)) {
                                        throw m18109G0("Unterminated escape sequence");
                                    }
                                    int i5 = this.f22187m;
                                    int i6 = i5 + 4;
                                    char c2 = 0;
                                    while (i5 < i6) {
                                        char c3 = this.f22186l[i5];
                                        char c4 = (char) (c2 << 4);
                                        if (c3 >= '0' && c3 <= '9') {
                                            i2 = c3 - '0';
                                        } else {
                                            if (c3 >= 'a' && c3 <= 'f') {
                                                i = c3 - 'a';
                                            } else if (c3 >= 'A' && c3 <= 'F') {
                                                i = c3 - 'A';
                                            } else {
                                                throw new NumberFormatException("\\u" + new String(this.f22186l, this.f22187m, 4));
                                            }
                                            i2 = i + 10;
                                        }
                                        c2 = (char) (c4 + i2);
                                        i5++;
                                    }
                                    this.f22187m += 4;
                                    return c2;
                                }
                                throw m18109G0("Invalid escape sequence");
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\f';
                }
                return '\b';
            }
        } else {
            this.f22189o++;
            this.f22190p = i4;
        }
        return c;
    }

    /* renamed from: B0 */
    private void m18115B0(char c) {
        char[] cArr = this.f22186l;
        do {
            int i = this.f22187m;
            int i2 = this.f22188n;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.f22187m = i3;
                    return;
                } else if (c2 == '\\') {
                    this.f22187m = i3;
                    m18116A0();
                    i = this.f22187m;
                    i2 = this.f22188n;
                } else {
                    if (c2 == '\n') {
                        this.f22189o++;
                        this.f22190p = i3;
                    }
                    i = i3;
                }
            }
            this.f22187m = i;
        } while (m18090s(1));
        throw m18109G0("Unterminated string");
    }

    /* renamed from: C0 */
    private boolean m18114C0(String str) {
        int length = str.length();
        while (true) {
            if (this.f22187m + length > this.f22188n && !m18090s(length)) {
                return false;
            }
            char[] cArr = this.f22186l;
            int i = this.f22187m;
            if (cArr[i] == '\n') {
                this.f22189o++;
                this.f22190p = i + 1;
            } else {
                for (int i2 = 0; i2 < length; i2++) {
                    if (this.f22186l[this.f22187m + i2] != str.charAt(i2)) {
                        break;
                    }
                }
                return true;
            }
            this.f22187m++;
        }
    }

    /* renamed from: D0 */
    private void m18112D0() {
        char c;
        do {
            if (this.f22187m < this.f22188n || m18090s(1)) {
                char[] cArr = this.f22186l;
                int i = this.f22187m;
                int i2 = i + 1;
                this.f22187m = i2;
                c = cArr[i];
                if (c == '\n') {
                    this.f22189o++;
                    this.f22190p = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
        m18096i();
     */
    /* renamed from: E0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m18111E0() {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f22187m
            int r2 = r1 + r0
            int r3 = r4.f22188n
            if (r2 >= r3) goto L51
            char[] r2 = r4.f22186l
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.m18096i()
        L4b:
            int r1 = r4.f22187m
            int r1 = r1 + r0
            r4.f22187m = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f22187m = r1
            r0 = 1
            boolean r0 = r4.m18090s(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.C8254a.m18111E0():void");
    }

    /* renamed from: G0 */
    private IOException m18109G0(String str) {
        throw new C8257d(str + m18117A());
    }

    /* renamed from: S */
    private int m18104S(boolean z) {
        char[] cArr = this.f22186l;
        int i = this.f22187m;
        int i2 = this.f22188n;
        while (true) {
            if (i == i2) {
                this.f22187m = i;
                if (!m18090s(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input" + m18117A());
                }
                i = this.f22187m;
                i2 = this.f22188n;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.f22189o++;
                this.f22190p = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.f22187m = i3;
                    if (i3 == i2) {
                        this.f22187m = i3 - 1;
                        boolean m18090s = m18090s(2);
                        this.f22187m++;
                        if (!m18090s) {
                            return c;
                        }
                    }
                    m18096i();
                    int i4 = this.f22187m;
                    char c2 = cArr[i4];
                    if (c2 != '*') {
                        if (c2 != '/') {
                            return c;
                        }
                        this.f22187m = i4 + 1;
                        m18112D0();
                        i = this.f22187m;
                        i2 = this.f22188n;
                    } else {
                        this.f22187m = i4 + 1;
                        if (m18114C0("*/")) {
                            i = this.f22187m + 2;
                            i2 = this.f22188n;
                        } else {
                            throw m18109G0("Unterminated comment");
                        }
                    }
                } else if (c == '#') {
                    this.f22187m = i3;
                    m18096i();
                    m18112D0();
                    i = this.f22187m;
                    i2 = this.f22188n;
                } else {
                    this.f22187m = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
        r1.append(r0, r3, r2 - r3);
        r9.f22187m = r2;
     */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m18102V(char r10) {
        /*
            r9 = this;
            char[] r0 = r9.f22186l
            r1 = 0
        L3:
            int r2 = r9.f22187m
            int r3 = r9.f22188n
        L7:
            r4 = r3
            r3 = r2
        L9:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L5c
            int r7 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r10) goto L28
            r9.f22187m = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L20
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r3, r7)
            return r10
        L20:
            r1.append(r0, r3, r7)
            java.lang.String r10 = r1.toString()
            return r10
        L28:
            r8 = 92
            if (r2 != r8) goto L4f
            r9.f22187m = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L40
            int r1 = r7 + 1
            int r1 = r1 * 2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r2.<init>(r1)
            r1 = r2
        L40:
            r1.append(r0, r3, r7)
            char r2 = r9.m18116A0()
            r1.append(r2)
            int r2 = r9.f22187m
            int r3 = r9.f22188n
            goto L7
        L4f:
            r5 = 10
            if (r2 != r5) goto L5a
            int r2 = r9.f22189o
            int r2 = r2 + r6
            r9.f22189o = r2
            r9.f22190p = r7
        L5a:
            r2 = r7
            goto L9
        L5c:
            if (r1 != 0) goto L6c
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L6c:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r9.f22187m = r2
            boolean r2 = r9.m18090s(r6)
            if (r2 == 0) goto L7a
            goto L3
        L7a:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.m18109G0(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.C8254a.m18102V(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
        m18096i();
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m18099b0() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r6.f22187m
            int r4 = r3 + r2
            int r5 = r6.f22188n
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f22186l
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.m18096i()
            goto L5c
        L4e:
            char[] r3 = r6.f22186l
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.m18090s(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r1 = r2
            goto L7e
        L5e:
            if (r0 != 0) goto L6b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L6b:
            char[] r3 = r6.f22186l
            int r4 = r6.f22187m
            r0.append(r3, r4, r2)
            int r3 = r6.f22187m
            int r3 = r3 + r2
            r6.f22187m = r3
            r2 = 1
            boolean r2 = r6.m18090s(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r0 != 0) goto L8a
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.f22186l
            int r3 = r6.f22187m
            r0.<init>(r2, r3, r1)
            goto L95
        L8a:
            char[] r2 = r6.f22186l
            int r3 = r6.f22187m
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L95:
            int r2 = r6.f22187m
            int r2 = r2 + r1
            r6.f22187m = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.C8254a.m18099b0():java.lang.String");
    }

    /* renamed from: i */
    private void m18096i() {
        if (this.f22185k) {
            return;
        }
        throw m18109G0("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    /* renamed from: j */
    private void m18095j() {
        m18104S(true);
        int i = this.f22187m - 1;
        this.f22187m = i;
        if (i + 5 > this.f22188n && !m18090s(5)) {
            return;
        }
        char[] cArr = this.f22186l;
        if (cArr[i] == ')' && cArr[i + 1] == ']' && cArr[i + 2] == '}' && cArr[i + 3] == '\'' && cArr[i + 4] == '\n') {
            this.f22187m += 5;
        }
    }

    /* renamed from: j0 */
    private int m18094j0() {
        String str;
        String str2;
        int i;
        char c = this.f22186l[this.f22187m];
        if (c != 't' && c != 'T') {
            if (c != 'f' && c != 'F') {
                if (c != 'n' && c != 'N') {
                    return 0;
                }
                str = "null";
                str2 = "NULL";
                i = 7;
            } else {
                str = "false";
                str2 = "FALSE";
                i = 6;
            }
        } else {
            str = "true";
            str2 = "TRUE";
            i = 5;
        }
        int length = str.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.f22187m + i2 >= this.f22188n && !m18090s(i2 + 1)) {
                return 0;
            }
            char c2 = this.f22186l[this.f22187m + i2];
            if (c2 != str.charAt(i2) && c2 != str2.charAt(i2)) {
                return 0;
            }
        }
        if ((this.f22187m + length < this.f22188n || m18090s(length + 1)) && m18087v(this.f22186l[this.f22187m + length])) {
            return 0;
        }
        this.f22187m += length;
        this.f22191q = i;
        return i;
    }

    /* renamed from: s */
    private boolean m18090s(int i) {
        int i2;
        int i3;
        char[] cArr = this.f22186l;
        int i4 = this.f22190p;
        int i5 = this.f22187m;
        this.f22190p = i4 - i5;
        int i6 = this.f22188n;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f22188n = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f22188n = 0;
        }
        this.f22187m = 0;
        do {
            Reader reader = this.f22184j;
            int i8 = this.f22188n;
            int read = reader.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.f22188n + read;
            this.f22188n = i2;
            if (this.f22189o == 0 && (i3 = this.f22190p) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f22187m++;
                this.f22190p = i3 + 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0091, code lost:
        if (m18087v(r14) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0093, code lost:
        if (r9 != 2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0095, code lost:
        if (r10 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009b, code lost:
        if (r11 != Long.MIN_VALUE) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009d, code lost:
        if (r13 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a3, code lost:
        if (r11 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a5, code lost:
        if (r13 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a7, code lost:
        if (r13 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00aa, code lost:
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ab, code lost:
        r18.f22192r = r11;
        r18.f22187m += r8;
        r18.f22191q = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b6, code lost:
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b7, code lost:
        if (r9 == 2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ba, code lost:
        if (r9 == 4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00bd, code lost:
        if (r9 != 7) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c0, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c2, code lost:
        r18.f22193s = r8;
        r18.f22191q = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c8, code lost:
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c9, code lost:
        return 0;
     */
    /* renamed from: t0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m18088t0() {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.C8254a.m18088t0():int");
    }

    /* renamed from: v */
    private boolean m18087v(char c) {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m18096i();
        return false;
    }

    /* renamed from: w0 */
    private void m18086w0(int i) {
        int i2 = this.f22196v;
        int[] iArr = this.f22195u;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.f22195u = Arrays.copyOf(iArr, i3);
            this.f22198x = Arrays.copyOf(this.f22198x, i3);
            this.f22197w = (String[]) Arrays.copyOf(this.f22197w, i3);
        }
        int[] iArr2 = this.f22195u;
        int i4 = this.f22196v;
        this.f22196v = i4 + 1;
        iArr2[i4] = i;
    }

    /* renamed from: A */
    String m18117A() {
        return " at line " + (this.f22189o + 1) + " column " + ((this.f22187m - this.f22190p) + 1) + " path " + m18089t();
    }

    /* renamed from: D */
    public boolean m18113D() {
        int i = this.f22191q;
        if (i == 0) {
            i = m18093m();
        }
        if (i == 5) {
            this.f22191q = 0;
            int[] iArr = this.f22198x;
            int i2 = this.f22196v - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f22191q = 0;
            int[] iArr2 = this.f22198x;
            int i3 = this.f22196v - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + m18098e0() + m18117A());
        }
    }

    /* renamed from: F0 */
    public void m18110F0() {
        int i = 0;
        do {
            int i2 = this.f22191q;
            if (i2 == 0) {
                i2 = m18093m();
            }
            if (i2 == 3) {
                m18086w0(1);
            } else if (i2 == 1) {
                m18086w0(3);
            } else {
                if (i2 == 4) {
                    this.f22196v--;
                } else if (i2 == 2) {
                    this.f22196v--;
                } else {
                    if (i2 != 14 && i2 != 10) {
                        if (i2 != 8 && i2 != 12) {
                            if (i2 != 9 && i2 != 13) {
                                if (i2 == 16) {
                                    this.f22187m += this.f22193s;
                                }
                            } else {
                                m18115B0('\"');
                            }
                        } else {
                            m18115B0('\'');
                        }
                    } else {
                        m18111E0();
                    }
                    this.f22191q = 0;
                }
                i--;
                this.f22191q = 0;
            }
            i++;
            this.f22191q = 0;
        } while (i != 0);
        int[] iArr = this.f22198x;
        int i3 = this.f22196v;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f22197w[i3 - 1] = "null";
    }

    /* renamed from: H */
    public double m18108H() {
        char c;
        int i = this.f22191q;
        if (i == 0) {
            i = m18093m();
        }
        if (i == 15) {
            this.f22191q = 0;
            int[] iArr = this.f22198x;
            int i2 = this.f22196v - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f22192r;
        }
        if (i == 16) {
            this.f22194t = new String(this.f22186l, this.f22187m, this.f22193s);
            this.f22187m += this.f22193s;
        } else if (i != 8 && i != 9) {
            if (i == 10) {
                this.f22194t = m18099b0();
            } else if (i != 11) {
                throw new IllegalStateException("Expected a double but was " + m18098e0() + m18117A());
            }
        } else {
            if (i == 8) {
                c = '\'';
            } else {
                c = '\"';
            }
            this.f22194t = m18102V(c);
        }
        this.f22191q = 11;
        double parseDouble = Double.parseDouble(this.f22194t);
        if (!this.f22185k && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new C8257d("JSON forbids NaN and infinities: " + parseDouble + m18117A());
        }
        this.f22194t = null;
        this.f22191q = 0;
        int[] iArr2 = this.f22198x;
        int i3 = this.f22196v - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    /* renamed from: I */
    public int m18107I() {
        char c;
        int i = this.f22191q;
        if (i == 0) {
            i = m18093m();
        }
        if (i == 15) {
            long j = this.f22192r;
            int i2 = (int) j;
            if (j == i2) {
                this.f22191q = 0;
                int[] iArr = this.f22198x;
                int i3 = this.f22196v - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.f22192r + m18117A());
        }
        if (i == 16) {
            this.f22194t = new String(this.f22186l, this.f22187m, this.f22193s);
            this.f22187m += this.f22193s;
        } else if (i != 8 && i != 9 && i != 10) {
            throw new IllegalStateException("Expected an int but was " + m18098e0() + m18117A());
        } else {
            if (i == 10) {
                this.f22194t = m18099b0();
            } else {
                if (i == 8) {
                    c = '\'';
                } else {
                    c = '\"';
                }
                this.f22194t = m18102V(c);
            }
            try {
                int parseInt = Integer.parseInt(this.f22194t);
                this.f22191q = 0;
                int[] iArr2 = this.f22198x;
                int i4 = this.f22196v - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f22191q = 11;
        double parseDouble = Double.parseDouble(this.f22194t);
        int i5 = (int) parseDouble;
        if (i5 == parseDouble) {
            this.f22194t = null;
            this.f22191q = 0;
            int[] iArr3 = this.f22198x;
            int i6 = this.f22196v - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.f22194t + m18117A());
    }

    /* renamed from: Q */
    public long m18106Q() {
        char c;
        int i = this.f22191q;
        if (i == 0) {
            i = m18093m();
        }
        if (i == 15) {
            this.f22191q = 0;
            int[] iArr = this.f22198x;
            int i2 = this.f22196v - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f22192r;
        }
        if (i == 16) {
            this.f22194t = new String(this.f22186l, this.f22187m, this.f22193s);
            this.f22187m += this.f22193s;
        } else if (i != 8 && i != 9 && i != 10) {
            throw new IllegalStateException("Expected a long but was " + m18098e0() + m18117A());
        } else {
            if (i == 10) {
                this.f22194t = m18099b0();
            } else {
                if (i == 8) {
                    c = '\'';
                } else {
                    c = '\"';
                }
                this.f22194t = m18102V(c);
            }
            try {
                long parseLong = Long.parseLong(this.f22194t);
                this.f22191q = 0;
                int[] iArr2 = this.f22198x;
                int i3 = this.f22196v - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f22191q = 11;
        double parseDouble = Double.parseDouble(this.f22194t);
        long j = (long) parseDouble;
        if (j == parseDouble) {
            this.f22194t = null;
            this.f22191q = 0;
            int[] iArr3 = this.f22198x;
            int i4 = this.f22196v - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        throw new NumberFormatException("Expected a long but was " + this.f22194t + m18117A());
    }

    /* renamed from: R */
    public String m18105R() {
        String m18102V;
        int i = this.f22191q;
        if (i == 0) {
            i = m18093m();
        }
        if (i == 14) {
            m18102V = m18099b0();
        } else if (i == 12) {
            m18102V = m18102V('\'');
        } else if (i == 13) {
            m18102V = m18102V('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + m18098e0() + m18117A());
        }
        this.f22191q = 0;
        this.f22197w[this.f22196v - 1] = m18102V;
        return m18102V;
    }

    /* renamed from: U */
    public void m18103U() {
        int i = this.f22191q;
        if (i == 0) {
            i = m18093m();
        }
        if (i == 7) {
            this.f22191q = 0;
            int[] iArr = this.f22198x;
            int i2 = this.f22196v - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + m18098e0() + m18117A());
    }

    /* renamed from: Y */
    public String m18101Y() {
        String str;
        int i = this.f22191q;
        if (i == 0) {
            i = m18093m();
        }
        if (i == 10) {
            str = m18099b0();
        } else if (i == 8) {
            str = m18102V('\'');
        } else if (i == 9) {
            str = m18102V('\"');
        } else if (i == 11) {
            str = this.f22194t;
            this.f22194t = null;
        } else if (i == 15) {
            str = Long.toString(this.f22192r);
        } else if (i == 16) {
            str = new String(this.f22186l, this.f22187m, this.f22193s);
            this.f22187m += this.f22193s;
        } else {
            throw new IllegalStateException("Expected a string but was " + m18098e0() + m18117A());
        }
        this.f22191q = 0;
        int[] iArr = this.f22198x;
        int i2 = this.f22196v - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: a */
    public void m18100a() {
        int i = this.f22191q;
        if (i == 0) {
            i = m18093m();
        }
        if (i == 3) {
            m18086w0(1);
            this.f22198x[this.f22196v - 1] = 0;
            this.f22191q = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + m18098e0() + m18117A());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f22191q = 0;
        this.f22195u[0] = 8;
        this.f22196v = 1;
        this.f22184j.close();
    }

    /* renamed from: e0 */
    public EnumC8255b m18098e0() {
        int i = this.f22191q;
        if (i == 0) {
            i = m18093m();
        }
        switch (i) {
            case 1:
                return EnumC8255b.BEGIN_OBJECT;
            case 2:
                return EnumC8255b.END_OBJECT;
            case 3:
                return EnumC8255b.BEGIN_ARRAY;
            case 4:
                return EnumC8255b.END_ARRAY;
            case 5:
            case 6:
                return EnumC8255b.BOOLEAN;
            case 7:
                return EnumC8255b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return EnumC8255b.STRING;
            case 12:
            case 13:
            case 14:
                return EnumC8255b.NAME;
            case 15:
            case 16:
                return EnumC8255b.NUMBER;
            case 17:
                return EnumC8255b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: h */
    public void m18097h() {
        int i = this.f22191q;
        if (i == 0) {
            i = m18093m();
        }
        if (i == 1) {
            m18086w0(3);
            this.f22191q = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + m18098e0() + m18117A());
    }

    /* renamed from: m */
    int m18093m() {
        int m18104S;
        int[] iArr = this.f22195u;
        int i = this.f22196v;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int m18104S2 = m18104S(true);
            if (m18104S2 != 44) {
                if (m18104S2 != 59) {
                    if (m18104S2 == 93) {
                        this.f22191q = 4;
                        return 4;
                    }
                    throw m18109G0("Unterminated array");
                }
                m18096i();
            }
        } else if (i2 != 3 && i2 != 5) {
            if (i2 == 4) {
                iArr[i - 1] = 5;
                int m18104S3 = m18104S(true);
                if (m18104S3 != 58) {
                    if (m18104S3 == 61) {
                        m18096i();
                        if (this.f22187m < this.f22188n || m18090s(1)) {
                            char[] cArr = this.f22186l;
                            int i3 = this.f22187m;
                            if (cArr[i3] == '>') {
                                this.f22187m = i3 + 1;
                            }
                        }
                    } else {
                        throw m18109G0("Expected ':'");
                    }
                }
            } else if (i2 == 6) {
                if (this.f22185k) {
                    m18095j();
                }
                this.f22195u[this.f22196v - 1] = 7;
            } else if (i2 == 7) {
                if (m18104S(false) == -1) {
                    this.f22191q = 17;
                    return 17;
                }
                m18096i();
                this.f22187m--;
            } else if (i2 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        } else {
            iArr[i - 1] = 4;
            if (i2 == 5 && (m18104S = m18104S(true)) != 44) {
                if (m18104S != 59) {
                    if (m18104S == 125) {
                        this.f22191q = 2;
                        return 2;
                    }
                    throw m18109G0("Unterminated object");
                }
                m18096i();
            }
            int m18104S4 = m18104S(true);
            if (m18104S4 != 34) {
                if (m18104S4 != 39) {
                    if (m18104S4 != 125) {
                        m18096i();
                        this.f22187m--;
                        if (m18087v((char) m18104S4)) {
                            this.f22191q = 14;
                            return 14;
                        }
                        throw m18109G0("Expected name");
                    } else if (i2 != 5) {
                        this.f22191q = 2;
                        return 2;
                    } else {
                        throw m18109G0("Expected name");
                    }
                }
                m18096i();
                this.f22191q = 12;
                return 12;
            }
            this.f22191q = 13;
            return 13;
        }
        int m18104S5 = m18104S(true);
        if (m18104S5 != 34) {
            if (m18104S5 != 39) {
                if (m18104S5 != 44 && m18104S5 != 59) {
                    if (m18104S5 != 91) {
                        if (m18104S5 != 93) {
                            if (m18104S5 != 123) {
                                this.f22187m--;
                                int m18094j0 = m18094j0();
                                if (m18094j0 != 0) {
                                    return m18094j0;
                                }
                                int m18088t0 = m18088t0();
                                if (m18088t0 != 0) {
                                    return m18088t0;
                                }
                                if (m18087v(this.f22186l[this.f22187m])) {
                                    m18096i();
                                    this.f22191q = 10;
                                    return 10;
                                }
                                throw m18109G0("Expected value");
                            }
                            this.f22191q = 1;
                            return 1;
                        } else if (i2 == 1) {
                            this.f22191q = 4;
                            return 4;
                        }
                    } else {
                        this.f22191q = 3;
                        return 3;
                    }
                }
                if (i2 != 1 && i2 != 2) {
                    throw m18109G0("Unexpected value");
                }
                m18096i();
                this.f22187m--;
                this.f22191q = 7;
                return 7;
            }
            m18096i();
            this.f22191q = 8;
            return 8;
        }
        this.f22191q = 9;
        return 9;
    }

    /* renamed from: o */
    public void m18092o() {
        int i = this.f22191q;
        if (i == 0) {
            i = m18093m();
        }
        if (i == 4) {
            int i2 = this.f22196v - 1;
            this.f22196v = i2;
            int[] iArr = this.f22198x;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f22191q = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + m18098e0() + m18117A());
    }

    /* renamed from: q */
    public void m18091q() {
        int i = this.f22191q;
        if (i == 0) {
            i = m18093m();
        }
        if (i == 2) {
            int i2 = this.f22196v - 1;
            this.f22196v = i2;
            this.f22197w[i2] = null;
            int[] iArr = this.f22198x;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f22191q = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + m18098e0() + m18117A());
    }

    /* renamed from: t */
    public String m18089t() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i = this.f22196v;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f22195u[i2];
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3 || i3 == 4 || i3 == 5) {
                    sb2.append('.');
                    String str = this.f22197w[i2];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
            } else {
                sb2.append('[');
                sb2.append(this.f22198x[i2]);
                sb2.append(']');
            }
        }
        return sb2.toString();
    }

    public String toString() {
        return getClass().getSimpleName() + m18117A();
    }
}
