package okio;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import hk.C7359b;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C9536e;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C9653o;
import p122gk.C6827a;
import p122gk.C6828b;
import p122gk.C6829c;

@Metadata(m14358d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0016\u0018\u0000 \u00112\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0005B\u0011\b\u0000\u0012\u0006\u0010>\u001a\u00020\u0017¢\u0006\u0004\bA\u0010BJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0006\u0010\u0006\u001a\u00020\u0000J\u0006\u0010\u0007\u001a\u00020\u0000J\u0006\u0010\b\u001a\u00020\u0000J\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0000H\u0016J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000eH\u0087\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u000f\u0010\u0019\u001a\u00020\u0017H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J'\u0010#\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000eH\u0010¢\u0006\u0004\b#\u0010$J(\u0010(\u001a\u00020'2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000eH\u0016J(\u0010)\u001a\u00020'2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000eH\u0016J\u000e\u0010+\u001a\u00020'2\u0006\u0010*\u001a\u00020\u0000J\u0013\u0010-\u001a\u00020'2\b\u0010%\u001a\u0004\u0018\u00010,H\u0096\u0002J\b\u0010.\u001a\u00020\u000eH\u0016J\u0011\u0010/\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u0000H\u0096\u0002J\b\u00100\u001a\u00020\u0003H\u0016R\"\u0010.\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u0016\"\u0004\b4\u00105R$\u0010;\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b6\u00108\"\u0004\b9\u0010:R\u001a\u0010>\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010\u001aR\u0011\u0010@\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b?\u0010\u0016¨\u0006C"}, m14357d2 = {"Lokio/ByteString;", "Ljava/io/Serializable;", "", "", "D", "a", "o", "v", "w", "algorithm", "d", "(Ljava/lang/String;)Lokio/ByteString;", "l", "B", "", "pos", "", "n", "(I)B", "index", "f", "i", "()I", "", "C", "m", "()[B", "Ljava/io/OutputStream;", "out", "", "E", "Lokio/Buffer;", "buffer", "offset", "byteCount", "F", "(Lokio/Buffer;II)V", "other", "otherOffset", "", "q", "r", "prefix", "A", "", "equals", "hashCode", "b", "toString", "j", "I", "h", "s", "(I)V", "k", "Ljava/lang/String;", "()Ljava/lang/String;", "t", "(Ljava/lang/String;)V", "utf8", "[B", "g", "data", "z", "size", "<init>", "([B)V", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class ByteString implements Serializable, Comparable<ByteString> {

    /* renamed from: j */
    private transient int f29483j;

    /* renamed from: k */
    private transient String f29484k;

    /* renamed from: l */
    private final byte[] f29485l;

    /* renamed from: n */
    public static final C11214a f29482n = new C11214a(null);

    /* renamed from: m */
    public static final ByteString f29481m = new ByteString(new byte[0]);

    @Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00020\u0002\"\u00020\u0003H\u0007J'\u0010\n\u001a\u00020\u0005*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\f\u0010\r\u001a\u00020\u0005*\u00020\fH\u0007J\u001d\u0010\u0010\u001a\u00020\u0005*\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0012\u001a\u0004\u0018\u00010\u0005*\u00020\fH\u0007J\f\u0010\u0013\u001a\u00020\u0005*\u00020\fH\u0007R\u0014\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m14357d2 = {"Lokio/ByteString$a;", "", "", "", "data", "Lokio/ByteString;", "e", "", "offset", "byteCount", "f", "([BII)Lokio/ByteString;", "", "d", "Ljava/nio/charset/Charset;", "charset", "c", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lokio/ByteString;", "a", "b", "EMPTY", "Lokio/ByteString;", "", "serialVersionUID", "J", "<init>", "()V", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: okio.ByteString$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C11214a {
        private C11214a() {
        }

        public /* synthetic */ C11214a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: g */
        public static /* synthetic */ ByteString m8544g(C11214a c11214a, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = bArr.length;
            }
            return c11214a.m8545f(bArr, i, i2);
        }

        /* renamed from: a */
        public final ByteString m8550a(String decodeBase64) {
            C9612q.m13917h(decodeBase64, "$this$decodeBase64");
            byte[] m21856a = C6827a.m21856a(decodeBase64);
            if (m21856a != null) {
                return new ByteString(m21856a);
            }
            return null;
        }

        /* renamed from: b */
        public final ByteString m8549b(String decodeHex) {
            boolean z;
            int m20839g;
            int m20839g2;
            C9612q.m13917h(decodeHex, "$this$decodeHex");
            if (decodeHex.length() % 2 == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int length = decodeHex.length() / 2;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    m20839g = C7359b.m20839g(decodeHex.charAt(i2));
                    m20839g2 = C7359b.m20839g(decodeHex.charAt(i2 + 1));
                    bArr[i] = (byte) ((m20839g << 4) + m20839g2);
                }
                return new ByteString(bArr);
            }
            throw new IllegalArgumentException(("Unexpected hex string: " + decodeHex).toString());
        }

        /* renamed from: c */
        public final ByteString m8548c(String encode, Charset charset) {
            C9612q.m13917h(encode, "$this$encode");
            C9612q.m13917h(charset, "charset");
            byte[] bytes = encode.getBytes(charset);
            C9612q.m13918g(bytes, "(this as java.lang.String).getBytes(charset)");
            return new ByteString(bytes);
        }

        /* renamed from: d */
        public final ByteString m8547d(String encodeUtf8) {
            C9612q.m13917h(encodeUtf8, "$this$encodeUtf8");
            ByteString byteString = new ByteString(C6828b.m21853a(encodeUtf8));
            byteString.m8554t(encodeUtf8);
            return byteString;
        }

        /* renamed from: e */
        public final ByteString m8546e(byte... data) {
            C9612q.m13917h(data, "data");
            byte[] copyOf = Arrays.copyOf(data, data.length);
            C9612q.m13918g(copyOf, "java.util.Arrays.copyOf(this, size)");
            return new ByteString(copyOf);
        }

        /* renamed from: f */
        public final ByteString m8545f(byte[] toByteString, int i, int i2) {
            byte[] m14269i;
            C9612q.m13917h(toByteString, "$this$toByteString");
            C6829c.m21850b(toByteString.length, i, i2);
            m14269i = C9536e.m14269i(toByteString, i, i2 + i);
            return new ByteString(m14269i);
        }
    }

    public ByteString(byte[] data) {
        C9612q.m13917h(data, "data");
        this.f29485l = data;
    }

    /* renamed from: c */
    public static final ByteString m8570c(String str) {
        return f29482n.m8550a(str);
    }

    /* renamed from: e */
    public static final ByteString m8568e(String str) {
        return f29482n.m8547d(str);
    }

    /* renamed from: p */
    public static final ByteString m8558p(byte... bArr) {
        return f29482n.m8546e(bArr);
    }

    /* renamed from: A */
    public final boolean m8578A(ByteString prefix) {
        C9612q.m13917h(prefix, "prefix");
        return mo8557q(0, prefix, 0, prefix.m8551z());
    }

    /* renamed from: B */
    public ByteString mo8577B() {
        byte b;
        for (int i = 0; i < m8566g().length; i++) {
            byte b2 = m8566g()[i];
            byte b3 = (byte) 65;
            if (b2 >= b3 && b2 <= (b = (byte) 90)) {
                byte[] m8566g = m8566g();
                byte[] copyOf = Arrays.copyOf(m8566g, m8566g.length);
                C9612q.m13918g(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return this;
    }

    /* renamed from: C */
    public byte[] mo8576C() {
        byte[] m8566g = m8566g();
        byte[] copyOf = Arrays.copyOf(m8566g, m8566g.length);
        C9612q.m13918g(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    /* renamed from: D */
    public String m8575D() {
        String m8563k = m8563k();
        if (m8563k == null) {
            String m21852b = C6828b.m21852b(mo8561m());
            m8554t(m21852b);
            return m21852b;
        }
        return m8563k;
    }

    /* renamed from: E */
    public void mo8574E(OutputStream out) {
        C9612q.m13917h(out, "out");
        out.write(this.f29485l);
    }

    /* renamed from: F */
    public void mo8573F(Buffer buffer, int i, int i2) {
        C9612q.m13917h(buffer, "buffer");
        C7359b.m20840f(this, buffer, i, i2);
    }

    /* renamed from: a */
    public String mo8572a() {
        return C6827a.m21854c(m8566g(), null, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r0 < r1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (r7 < r8) goto L12;
     */
    @Override // java.lang.Comparable
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(okio.ByteString r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.C9612q.m13917h(r10, r0)
            int r0 = r9.m8551z()
            int r1 = r10.m8551z()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2b
            byte r7 = r9.m8567f(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.m8567f(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L32
            goto L30
        L2b:
            if (r0 != r1) goto L2e
            goto L33
        L2e:
            if (r0 >= r1) goto L32
        L30:
            r3 = r5
            goto L33
        L32:
            r3 = r6
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.compareTo(okio.ByteString):int");
    }

    /* renamed from: d */
    public ByteString mo8569d(String algorithm) {
        C9612q.m13917h(algorithm, "algorithm");
        return C7359b.m20842d(this, algorithm);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.m8551z() == m8566g().length && byteString.mo8556r(0, m8566g(), 0, m8566g().length)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final byte m8567f(int i) {
        return mo8560n(i);
    }

    /* renamed from: g */
    public final byte[] m8566g() {
        return this.f29485l;
    }

    /* renamed from: h */
    public final int m8565h() {
        return this.f29483j;
    }

    public int hashCode() {
        int m8565h = m8565h();
        if (m8565h == 0) {
            int hashCode = Arrays.hashCode(m8566g());
            m8555s(hashCode);
            return hashCode;
        }
        return m8565h;
    }

    /* renamed from: i */
    public int mo8564i() {
        return m8566g().length;
    }

    /* renamed from: k */
    public final String m8563k() {
        return this.f29484k;
    }

    /* renamed from: l */
    public String mo8562l() {
        byte[] m8566g;
        char[] cArr = new char[m8566g().length * 2];
        int i = 0;
        for (byte b : m8566g()) {
            int i2 = i + 1;
            cArr[i] = C7359b.m20838h()[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = C7359b.m20838h()[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: m */
    public byte[] mo8561m() {
        return m8566g();
    }

    /* renamed from: n */
    public byte mo8560n(int i) {
        return m8566g()[i];
    }

    /* renamed from: o */
    public final ByteString m8559o() {
        return mo8569d("MD5");
    }

    /* renamed from: q */
    public boolean mo8557q(int i, ByteString other, int i2, int i3) {
        C9612q.m13917h(other, "other");
        return other.mo8556r(i2, m8566g(), i, i3);
    }

    /* renamed from: r */
    public boolean mo8556r(int i, byte[] other, int i2, int i3) {
        C9612q.m13917h(other, "other");
        if (i >= 0 && i <= m8566g().length - i3 && i2 >= 0 && i2 <= other.length - i3 && C6829c.m21851a(m8566g(), i, other, i2, i3)) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final void m8555s(int i) {
        this.f29483j = i;
    }

    /* renamed from: t */
    public final void m8554t(String str) {
        this.f29484k = str;
    }

    public String toString() {
        boolean z;
        int m20843c;
        String m13762D;
        String m13762D2;
        String m13762D3;
        ByteString byteString;
        byte[] m14269i;
        boolean z2 = true;
        if (m8566g().length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "[size=0]";
        }
        m20843c = C7359b.m20843c(m8566g(), 64);
        if (m20843c == -1) {
            if (m8566g().length <= 64) {
                return "[hex=" + mo8562l() + ']';
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[size=");
            sb2.append(m8566g().length);
            sb2.append(" hex=");
            if (64 > m8566g().length) {
                z2 = false;
            }
            if (z2) {
                if (64 == m8566g().length) {
                    byteString = this;
                } else {
                    m14269i = C9536e.m14269i(m8566g(), 0, 64);
                    byteString = new ByteString(m14269i);
                }
                sb2.append(byteString.mo8562l());
                sb2.append("…]");
                return sb2.toString();
            }
            throw new IllegalArgumentException(("endIndex > length(" + m8566g().length + ')').toString());
        }
        String m8575D = m8575D();
        if (m8575D != null) {
            String substring = m8575D.substring(0, m20843c);
            C9612q.m13918g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            m13762D = C9653o.m13762D(substring, "\\", "\\\\", false, 4, null);
            m13762D2 = C9653o.m13762D(m13762D, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "\\n", false, 4, null);
            m13762D3 = C9653o.m13762D(m13762D2, "\r", "\\r", false, 4, null);
            if (m20843c < m8575D.length()) {
                return "[size=" + m8566g().length + " text=" + m13762D3 + "…]";
            }
            return "[text=" + m13762D3 + ']';
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: v */
    public final ByteString m8553v() {
        return mo8569d("SHA-1");
    }

    /* renamed from: w */
    public final ByteString m8552w() {
        return mo8569d("SHA-256");
    }

    /* renamed from: z */
    public final int m8551z() {
        return mo8564i();
    }
}
