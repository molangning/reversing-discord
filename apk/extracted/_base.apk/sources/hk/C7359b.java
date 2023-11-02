package hk;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import okio.Buffer;
import okio.ByteString;
import p122gk.C6854w;

@Metadata(m14358d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0006\u001a\u0014\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0000*\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a$\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0000\u001a\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u001a\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\bH\u0002\"\u001a\u0010\u0018\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m14357d2 = {"Lokio/ByteString;", "", "algorithm", "d", "Lgk/w;", "e", "Lokio/Buffer;", "buffer", "", "offset", "byteCount", "", "f", "", "c", "g", "", "s", "codePointCount", "", "a", "[C", "h", "()[C", "HEX_DIGIT_CHARS", "okio"}, m14356k = 2, m14355mv = {1, 4, 0})
/* renamed from: hk.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C7359b {

    /* renamed from: a */
    private static final char[] f19832a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0069, code lost:
        return -1;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int m20843c(byte[] r19, int r20) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hk.C7359b.m20843c(byte[], int):int");
    }

    /* renamed from: d */
    public static final ByteString m20842d(ByteString commonDigest, String algorithm) {
        C9612q.m13917h(commonDigest, "$this$commonDigest");
        C9612q.m13917h(algorithm, "algorithm");
        InterfaceC7360c m20837a = C7361d.m20837a(algorithm);
        m20837a.update(commonDigest.m8566g(), 0, commonDigest.m8551z());
        return new ByteString(m20837a.mo20836a());
    }

    /* renamed from: e */
    public static final ByteString m20841e(C6854w commonSegmentDigest, String algorithm) {
        C9612q.m13917h(commonSegmentDigest, "$this$commonSegmentDigest");
        C9612q.m13917h(algorithm, "algorithm");
        InterfaceC7360c m20837a = C7361d.m20837a(algorithm);
        int length = commonSegmentDigest.m21778H().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = commonSegmentDigest.m21779G()[length + i];
            int i4 = commonSegmentDigest.m21779G()[i];
            m20837a.update(commonSegmentDigest.m21778H()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        return new ByteString(m20837a.mo20836a());
    }

    /* renamed from: f */
    public static final void m20840f(ByteString commonWrite, Buffer buffer, int i, int i2) {
        C9612q.m13917h(commonWrite, "$this$commonWrite");
        C9612q.m13917h(buffer, "buffer");
        buffer.write(commonWrite.m8566g(), i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final int m20839g(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' > c || 'f' < c) {
            c2 = 'A';
            if ('A' > c || 'F' < c) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c);
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: h */
    public static final char[] m20838h() {
        return f19832a;
    }
}
