package p471zj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9653o;
import okio.ByteString;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J.\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004R\u0014\u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012¨\u0006\u0019"}, m14357d2 = {"Lzj/e;", "", "", "inbound", "", "streamId", "length", "type", "flags", "", "c", "b", "(I)Ljava/lang/String;", "a", "Lokio/ByteString;", "Lokio/ByteString;", "CONNECTION_PREFACE", "", "[Ljava/lang/String;", "FRAME_NAMES", "FLAGS", "d", "BINARY", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: zj.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C14298e {

    /* renamed from: d */
    private static final String[] f36742d;

    /* renamed from: e */
    public static final C14298e f36743e = new C14298e();

    /* renamed from: a */
    public static final ByteString f36739a = ByteString.f29482n.m8547d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b */
    private static final String[] f36740b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c */
    private static final String[] f36741c = new String[64];

    static {
        String m13763C;
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            C9612q.m13918g(binaryString, "Integer.toBinaryString(it)");
            m13763C = C9653o.m13763C(C12562c.m4794q("%8s", binaryString), ' ', '0', false, 4, null);
            strArr[i] = m13763C;
        }
        f36742d = strArr;
        String[] strArr2 = f36741c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        strArr2[1 | 8] = C9612q.m13909p("END_STREAM", "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr2[i2];
            int i4 = iArr[0];
            String[] strArr3 = f36741c;
            int i5 = i4 | i3;
            strArr3[i5] = strArr3[i4] + "|" + strArr3[i3];
            strArr3[i5 | 8] = strArr3[i4] + "|" + strArr3[i3] + "|PADDED";
        }
        int length = f36741c.length;
        for (int i6 = 0; i6 < length; i6++) {
            String[] strArr4 = f36741c;
            if (strArr4[i6] == null) {
                strArr4[i6] = f36742d[i6];
            }
        }
    }

    private C14298e() {
    }

    /* renamed from: a */
    public final String m197a(int i, int i2) {
        String str;
        String m13762D;
        String m13762D2;
        if (i2 == 0) {
            return "";
        }
        if (i != 2 && i != 3) {
            if (i != 4 && i != 6) {
                if (i != 7 && i != 8) {
                    String[] strArr = f36741c;
                    if (i2 < strArr.length) {
                        str = strArr[i2];
                        C9612q.m13920e(str);
                    } else {
                        str = f36742d[i2];
                    }
                    String str2 = str;
                    if (i == 5 && (i2 & 4) != 0) {
                        m13762D2 = C9653o.m13762D(str2, "HEADERS", "PUSH_PROMISE", false, 4, null);
                        return m13762D2;
                    } else if (i == 0 && (i2 & 32) != 0) {
                        m13762D = C9653o.m13762D(str2, "PRIORITY", "COMPRESSED", false, 4, null);
                        return m13762D;
                    } else {
                        return str2;
                    }
                }
            } else if (i2 == 1) {
                return "ACK";
            } else {
                return f36742d[i2];
            }
        }
        return f36742d[i2];
    }

    /* renamed from: b */
    public final String m196b(int i) {
        String[] strArr = f36740b;
        return i < strArr.length ? strArr[i] : C12562c.m4794q("0x%02x", Integer.valueOf(i));
    }

    /* renamed from: c */
    public final String m195c(boolean z, int i, int i2, int i3, int i4) {
        String str;
        String m196b = m196b(i3);
        String m197a = m197a(i3, i4);
        if (z) {
            str = "<<";
        } else {
            str = ">>";
        }
        return C12562c.m4794q("%s 0x%08x %5d %-13s %s", str, Integer.valueOf(i), Integer.valueOf(i2), m196b, m197a);
    }
}
