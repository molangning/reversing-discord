package dj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9653o;

@Metadata(m14358d1 = {"\u00008\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0005\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u0018\u0010\t\u001a\u00020\b*\u00060\u0004j\u0002`\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\f\"(\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\r8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\" \u0010\u0019\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0016\u0012\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u000e\u0010\u0017¨\u0006\u001a"}, m14357d2 = {"", "i", "", "e", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "value", "", "c", "", "d", "(Ljava/lang/String;)Ljava/lang/Boolean;", "", "a", "[Ljava/lang/String;", "b", "()[Ljava/lang/String;", "getESCAPE_STRINGS$annotations", "()V", "ESCAPE_STRINGS", "", "[B", "()[B", "getESCAPE_MARKERS$annotations", "ESCAPE_MARKERS", "kotlinx-serialization-json"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: dj.r0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C6014r0 {

    /* renamed from: a */
    private static final String[] f17083a;

    /* renamed from: b */
    private static final byte[] f17084b;

    static {
        String[] strArr = new String[93];
        for (int i = 0; i < 32; i++) {
            strArr[i] = "\\u" + m23871e(i >> 12) + m23871e(i >> 8) + m23871e(i >> 4) + m23871e(i);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f17083a = strArr;
        byte[] bArr = new byte[93];
        for (int i2 = 0; i2 < 32; i2++) {
            bArr[i2] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f17084b = bArr;
    }

    /* renamed from: a */
    public static final byte[] m23875a() {
        return f17084b;
    }

    /* renamed from: b */
    public static final String[] m23874b() {
        return f17083a;
    }

    /* renamed from: c */
    public static final void m23873c(StringBuilder sb2, String value) {
        C9612q.m13917h(sb2, "<this>");
        C9612q.m13917h(value, "value");
        sb2.append('\"');
        int length = value.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = value.charAt(i2);
            String[] strArr = f17083a;
            if (charAt < strArr.length && strArr[charAt] != null) {
                sb2.append((CharSequence) value, i, i2);
                sb2.append(strArr[charAt]);
                i = i2 + 1;
            }
        }
        if (i != 0) {
            sb2.append((CharSequence) value, i, value.length());
        } else {
            sb2.append(value);
        }
        sb2.append('\"');
    }

    /* renamed from: d */
    public static final Boolean m23872d(String str) {
        boolean m13754t;
        boolean m13754t2;
        C9612q.m13917h(str, "<this>");
        m13754t = C9653o.m13754t(str, "true", true);
        if (m13754t) {
            return Boolean.TRUE;
        }
        m13754t2 = C9653o.m13754t(str, "false", true);
        if (m13754t2) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* renamed from: e */
    private static final char m23871e(int i) {
        int i2 = i & 15;
        return (char) (i2 < 10 ? i2 + 48 : (i2 - 10) + 97);
    }
}
