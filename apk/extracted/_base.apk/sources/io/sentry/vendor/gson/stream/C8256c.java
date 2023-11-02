package io.sentry.vendor.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* renamed from: io.sentry.vendor.gson.stream.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C8256c implements Closeable, Flushable {

    /* renamed from: s */
    private static final String[] f22199s = new String[128];

    /* renamed from: t */
    private static final String[] f22200t;

    /* renamed from: j */
    private final Writer f22201j;

    /* renamed from: k */
    private int[] f22202k = new int[32];

    /* renamed from: l */
    private int f22203l = 0;

    /* renamed from: m */
    private String f22204m;

    /* renamed from: n */
    private String f22205n;

    /* renamed from: o */
    private boolean f22206o;

    /* renamed from: p */
    private boolean f22207p;

    /* renamed from: q */
    private String f22208q;

    /* renamed from: r */
    private boolean f22209r;

    static {
        for (int i = 0; i <= 31; i++) {
            f22199s[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f22199s;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f22200t = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C8256c(Writer writer) {
        m18083H(6);
        this.f22205n = ":";
        this.f22209r = true;
        if (writer != null) {
            this.f22201j = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    /* renamed from: A */
    private C8256c m18085A(int i, char c) {
        m18072h();
        m18083H(i);
        this.f22201j.write(c);
        return this;
    }

    /* renamed from: D */
    private int m18084D() {
        int i = this.f22203l;
        if (i != 0) {
            return this.f22202k[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: H */
    private void m18083H(int i) {
        int i2 = this.f22203l;
        int[] iArr = this.f22202k;
        if (i2 == iArr.length) {
            this.f22202k = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.f22202k;
        int i3 = this.f22203l;
        this.f22203l = i3 + 1;
        iArr2[i3] = i;
    }

    /* renamed from: I */
    private void m18082I(int i) {
        this.f22202k[this.f22203l - 1] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m18080R(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.f22207p
            if (r0 == 0) goto L7
            java.lang.String[] r0 = io.sentry.vendor.gson.stream.C8256c.f22200t
            goto L9
        L7:
            java.lang.String[] r0 = io.sentry.vendor.gson.stream.C8256c.f22199s
        L9:
            java.io.Writer r1 = r8.f22201j
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f22201j
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f22201j
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f22201j
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f22201j
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.C8256c.m18080R(java.lang.String):void");
    }

    /* renamed from: a */
    private void m18075a() {
        int m18084D = m18084D();
        if (m18084D == 5) {
            this.f22201j.write(44);
        } else if (m18084D != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m18065t();
        m18082I(4);
    }

    /* renamed from: e0 */
    private void m18073e0() {
        if (this.f22208q != null) {
            m18075a();
            m18080R(this.f22208q);
            this.f22208q = null;
        }
    }

    /* renamed from: h */
    private void m18072h() {
        int m18084D = m18084D();
        if (m18084D != 1) {
            if (m18084D != 2) {
                if (m18084D != 4) {
                    if (m18084D != 6) {
                        if (m18084D == 7) {
                            if (!this.f22206o) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    m18082I(7);
                    return;
                }
                this.f22201j.append((CharSequence) this.f22205n);
                m18082I(5);
                return;
            }
            this.f22201j.append(',');
            m18065t();
            return;
        }
        m18082I(2);
        m18065t();
    }

    /* renamed from: m */
    private C8256c m18069m(int i, int i2, char c) {
        int m18084D = m18084D();
        if (m18084D != i2 && m18084D != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f22208q == null) {
            this.f22203l--;
            if (m18084D == i2) {
                m18065t();
            }
            this.f22201j.write(c);
            return this;
        }
        throw new IllegalStateException("Dangling name: " + this.f22208q);
    }

    /* renamed from: t */
    private void m18065t() {
        if (this.f22204m == null) {
            return;
        }
        this.f22201j.write(10);
        int i = this.f22203l;
        for (int i2 = 1; i2 < i; i2++) {
            this.f22201j.write(this.f22204m);
        }
    }

    /* renamed from: Q */
    public final void m18081Q(String str) {
        if (str.length() == 0) {
            this.f22204m = null;
            this.f22205n = ":";
            return;
        }
        this.f22204m = str;
        this.f22205n = ": ";
    }

    /* renamed from: S */
    public C8256c m18079S(long j) {
        m18073e0();
        m18072h();
        this.f22201j.write(Long.toString(j));
        return this;
    }

    /* renamed from: U */
    public C8256c m18078U(Boolean bool) {
        String str;
        if (bool == null) {
            return m18064v();
        }
        m18073e0();
        m18072h();
        Writer writer = this.f22201j;
        if (bool.booleanValue()) {
            str = "true";
        } else {
            str = "false";
        }
        writer.write(str);
        return this;
    }

    /* renamed from: V */
    public C8256c m18077V(Number number) {
        if (number == null) {
            return m18064v();
        }
        m18073e0();
        String obj = number.toString();
        if (!this.f22206o && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        m18072h();
        this.f22201j.append((CharSequence) obj);
        return this;
    }

    /* renamed from: Y */
    public C8256c m18076Y(String str) {
        if (str == null) {
            return m18064v();
        }
        m18073e0();
        m18072h();
        m18080R(str);
        return this;
    }

    /* renamed from: b0 */
    public C8256c m18074b0(boolean z) {
        String str;
        m18073e0();
        m18072h();
        Writer writer = this.f22201j;
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        writer.write(str);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f22201j.close();
        int i = this.f22203l;
        if (i <= 1 && (i != 1 || this.f22202k[i - 1] == 7)) {
            this.f22203l = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f22203l != 0) {
            this.f22201j.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: i */
    public C8256c m18071i() {
        m18073e0();
        return m18085A(1, '[');
    }

    /* renamed from: j */
    public C8256c m18070j() {
        m18073e0();
        return m18085A(3, '{');
    }

    /* renamed from: o */
    public C8256c m18068o() {
        return m18069m(1, 2, ']');
    }

    /* renamed from: q */
    public C8256c m18067q() {
        return m18069m(3, 5, '}');
    }

    /* renamed from: s */
    public C8256c m18066s(String str) {
        if (str != null) {
            if (this.f22208q == null) {
                if (this.f22203l != 0) {
                    this.f22208q = str;
                    return this;
                }
                throw new IllegalStateException("JsonWriter is closed.");
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    /* renamed from: v */
    public C8256c m18064v() {
        if (this.f22208q != null) {
            if (this.f22209r) {
                m18073e0();
            } else {
                this.f22208q = null;
                return this;
            }
        }
        m18072h();
        this.f22201j.write("null");
        return this;
    }
}
