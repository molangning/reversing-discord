package p122gk;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import okio.ByteString;

@Metadata(m14358d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\n\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000\u001a\u0016\u0010\u0004\u001a\u00020\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0000\"\u001a\u0010\b\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u001a\u0010\n\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\t\u0010\u0007¨\u0006\u000b"}, m14357d2 = {"", "", "a", "map", "b", "[B", "getBASE64", "()[B", "BASE64", "getBASE64_URL_SAFE", "BASE64_URL_SAFE", "okio"}, m14356k = 2, m14355mv = {1, 4, 0})
/* renamed from: gk.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C6827a {

    /* renamed from: a */
    private static final byte[] f19034a;

    /* renamed from: b */
    private static final byte[] f19035b;

    static {
        ByteString.C11214a c11214a = ByteString.f29482n;
        f19034a = c11214a.m8547d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").m8566g();
        f19035b = c11214a.m8547d("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").m8566g();
    }

    /* renamed from: a */
    public static final byte[] m21856a(String decodeBase64ToArray) {
        int i;
        char charAt;
        C9612q.m13917h(decodeBase64ToArray, "$this$decodeBase64ToArray");
        int length = decodeBase64ToArray.length();
        while (length > 0 && ((charAt = decodeBase64ToArray.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i2 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            char charAt2 = decodeBase64ToArray.charAt(i6);
            if ('A' <= charAt2 && 'Z' >= charAt2) {
                i = charAt2 - 'A';
            } else if ('a' <= charAt2 && 'z' >= charAt2) {
                i = charAt2 - 'G';
            } else if ('0' <= charAt2 && '9' >= charAt2) {
                i = charAt2 + 4;
            } else if (charAt2 != '+' && charAt2 != '-') {
                if (charAt2 != '/' && charAt2 != '_') {
                    if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                        return null;
                    }
                } else {
                    i = 63;
                }
            } else {
                i = 62;
            }
            i4 = (i4 << 6) | i;
            i3++;
            if (i3 % 4 == 0) {
                int i7 = i5 + 1;
                bArr[i5] = (byte) (i4 >> 16);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (i4 >> 8);
                bArr[i8] = (byte) i4;
                i5 = i8 + 1;
            }
        }
        int i9 = i3 % 4;
        if (i9 == 1) {
            return null;
        }
        if (i9 != 2) {
            if (i9 == 3) {
                int i10 = i4 << 6;
                int i11 = i5 + 1;
                bArr[i5] = (byte) (i10 >> 16);
                i5 = i11 + 1;
                bArr[i11] = (byte) (i10 >> 8);
            }
        } else {
            bArr[i5] = (byte) ((i4 << 12) >> 16);
            i5++;
        }
        if (i5 == i2) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, i5);
        C9612q.m13918g(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }

    /* renamed from: b */
    public static final String m21855b(byte[] encodeBase64, byte[] map) {
        C9612q.m13917h(encodeBase64, "$this$encodeBase64");
        C9612q.m13917h(map, "map");
        byte[] bArr = new byte[((encodeBase64.length + 2) / 3) * 4];
        int length = encodeBase64.length - (encodeBase64.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            byte b = encodeBase64[i];
            int i4 = i3 + 1;
            byte b2 = encodeBase64[i3];
            int i5 = i4 + 1;
            byte b3 = encodeBase64[i4];
            int i6 = i2 + 1;
            bArr[i2] = map[(b & 255) >> 2];
            int i7 = i6 + 1;
            bArr[i6] = map[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i8 = i7 + 1;
            bArr[i7] = map[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 = i8 + 1;
            bArr[i8] = map[b3 & 63];
            i = i5;
        }
        int length2 = encodeBase64.length - length;
        if (length2 != 1) {
            if (length2 == 2) {
                int i9 = i + 1;
                byte b4 = encodeBase64[i];
                byte b5 = encodeBase64[i9];
                int i10 = i2 + 1;
                bArr[i2] = map[(b4 & 255) >> 2];
                int i11 = i10 + 1;
                bArr[i10] = map[((b4 & 3) << 4) | ((b5 & 255) >> 4)];
                bArr[i11] = map[(b5 & 15) << 2];
                bArr[i11 + 1] = (byte) 61;
            }
        } else {
            byte b6 = encodeBase64[i];
            int i12 = i2 + 1;
            bArr[i2] = map[(b6 & 255) >> 2];
            int i13 = i12 + 1;
            bArr[i12] = map[(b6 & 3) << 4];
            byte b7 = (byte) 61;
            bArr[i13] = b7;
            bArr[i13 + 1] = b7;
        }
        return C6828b.m21852b(bArr);
    }

    /* renamed from: c */
    public static /* synthetic */ String m21854c(byte[] bArr, byte[] bArr2, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr2 = f19034a;
        }
        return m21855b(bArr, bArr2);
    }
}
