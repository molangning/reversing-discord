package hk;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import okio.Buffer;
import p122gk.C6828b;
import p122gk.C6843p;
import p122gk.C6851u;

@Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a0\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a\u0014\u0010\u000e\u001a\u00020\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001a\u001e\u0010\u0012\u001a\u00020\u0002*\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\bH\u0000\"\u001a\u0010\u0016\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0017"}, m14357d2 = {"Lgk/u;", "segment", "", "segmentPos", "", "bytes", "bytesOffset", "bytesLimit", "", "b", "Lokio/Buffer;", "", "newline", "", "c", "Lgk/p;", "options", "selectTruncated", "d", "a", "[B", "()[B", "HEX_DIGIT_BYTES", "okio"}, m14356k = 2, m14355mv = {1, 4, 0})
/* renamed from: hk.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C7358a {

    /* renamed from: a */
    private static final byte[] f19831a = C6828b.m21853a("0123456789abcdef");

    /* renamed from: a */
    public static final byte[] m20850a() {
        return f19831a;
    }

    /* renamed from: b */
    public static final boolean m20849b(C6851u segment, int i, byte[] bytes, int i2, int i3) {
        C9612q.m13917h(segment, "segment");
        C9612q.m13917h(bytes, "bytes");
        int i4 = segment.f19078c;
        byte[] bArr = segment.f19076a;
        while (i2 < i3) {
            if (i == i4) {
                segment = segment.f19081f;
                C9612q.m13920e(segment);
                byte[] bArr2 = segment.f19076a;
                bArr = bArr2;
                i = segment.f19077b;
                i4 = segment.f19078c;
            }
            if (bArr[i] != bytes[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    /* renamed from: c */
    public static final String m20848c(Buffer readUtf8Line, long j) {
        C9612q.m13917h(readUtf8Line, "$this$readUtf8Line");
        if (j > 0) {
            long j2 = j - 1;
            if (readUtf8Line.m8645D(j2) == ((byte) 13)) {
                String m8620j0 = readUtf8Line.m8620j0(j2);
                readUtf8Line.skip(2L);
                return m8620j0;
            }
        }
        String m8620j02 = readUtf8Line.m8620j0(j);
        readUtf8Line.skip(1L);
        return m8620j02;
    }

    /* renamed from: d */
    public static final int m20847d(Buffer selectPrefix, C6843p options, boolean z) {
        int i;
        int i2;
        boolean z2;
        int i3;
        int i4;
        C6851u c6851u;
        C9612q.m13917h(selectPrefix, "$this$selectPrefix");
        C9612q.m13917h(options, "options");
        C6851u c6851u2 = selectPrefix.f29470j;
        if (c6851u2 != null) {
            byte[] bArr = c6851u2.f19076a;
            int i5 = c6851u2.f19077b;
            int i6 = c6851u2.f19078c;
            int[] m21803k = options.m21803k();
            C6851u c6851u3 = c6851u2;
            int i7 = -1;
            int i8 = 0;
            loop0: while (true) {
                int i9 = i8 + 1;
                int i10 = m21803k[i8];
                int i11 = i9 + 1;
                int i12 = m21803k[i9];
                if (i12 != -1) {
                    i7 = i12;
                }
                if (c6851u3 == null) {
                    break;
                }
                if (i10 < 0) {
                    int i13 = i11 + (i10 * (-1));
                    while (true) {
                        int i14 = i5 + 1;
                        int i15 = i11 + 1;
                        if ((bArr[i5] & 255) != m21803k[i11]) {
                            return i7;
                        }
                        if (i15 == i13) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (i14 == i6) {
                            C9612q.m13920e(c6851u3);
                            C6851u c6851u4 = c6851u3.f19081f;
                            C9612q.m13920e(c6851u4);
                            i4 = c6851u4.f19077b;
                            byte[] bArr2 = c6851u4.f19076a;
                            i3 = c6851u4.f19078c;
                            if (c6851u4 == c6851u2) {
                                if (!z2) {
                                    break loop0;
                                }
                                bArr = bArr2;
                                c6851u = null;
                            } else {
                                c6851u = c6851u4;
                                bArr = bArr2;
                            }
                        } else {
                            C6851u c6851u5 = c6851u3;
                            i3 = i6;
                            i4 = i14;
                            c6851u = c6851u5;
                        }
                        if (z2) {
                            i2 = m21803k[i15];
                            i = i4;
                            i6 = i3;
                            c6851u3 = c6851u;
                            break;
                        }
                        i5 = i4;
                        i6 = i3;
                        i11 = i15;
                        c6851u3 = c6851u;
                    }
                } else {
                    i = i5 + 1;
                    int i16 = bArr[i5] & 255;
                    int i17 = i11 + i10;
                    while (i11 != i17) {
                        if (i16 == m21803k[i11]) {
                            i2 = m21803k[i11 + i10];
                            if (i == i6) {
                                c6851u3 = c6851u3.f19081f;
                                C9612q.m13920e(c6851u3);
                                i = c6851u3.f19077b;
                                bArr = c6851u3.f19076a;
                                i6 = c6851u3.f19078c;
                                if (c6851u3 == c6851u2) {
                                    c6851u3 = null;
                                }
                            }
                        } else {
                            i11++;
                        }
                    }
                    return i7;
                }
                if (i2 >= 0) {
                    return i2;
                }
                i8 = -i2;
                i5 = i;
            }
            if (z) {
                return -2;
            }
            return i7;
        } else if (z) {
            return -2;
        } else {
            return -1;
        }
    }

    /* renamed from: e */
    public static /* synthetic */ int m20846e(Buffer buffer, C6843p c6843p, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m20847d(buffer, c6843p, z);
    }
}