package p122gk;

import hk.C7359b;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u00002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0000\u001a\f\u0010\t\u001a\u00020\b*\u00020\bH\u0000\u001a0\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0000\u001a\f\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0000\u001a\f\u0010\u0012\u001a\u00020\u0010*\u00020\bH\u0000¨\u0006\u0013"}, m14357d2 = {"", "size", "offset", "byteCount", "", "b", "", "d", "", "c", "", "a", "aOffset", "bOffset", "", "", "", "e", "f", "okio"}, m14356k = 2, m14355mv = {1, 4, 0})
/* renamed from: gk.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C6829c {
    /* renamed from: a */
    public static final boolean m21851a(byte[] a, int i, byte[] b, int i2, int i3) {
        C9612q.m13917h(a, "a");
        C9612q.m13917h(b, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (a[i4 + i] != b[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final void m21850b(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    /* renamed from: c */
    public static final int m21849c(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* renamed from: d */
    public static final short m21848d(short s) {
        int i = s & 65535;
        return (short) (((i & 255) << 8) | ((65280 & i) >>> 8));
    }

    /* renamed from: e */
    public static final String m21847e(byte b) {
        return new String(new char[]{C7359b.m20838h()[(b >> 4) & 15], C7359b.m20838h()[b & 15]});
    }

    /* renamed from: f */
    public static final String m21846f(int i) {
        if (i == 0) {
            return "0";
        }
        int i2 = 0;
        char[] cArr = {C7359b.m20838h()[(i >> 28) & 15], C7359b.m20838h()[(i >> 24) & 15], C7359b.m20838h()[(i >> 20) & 15], C7359b.m20838h()[(i >> 16) & 15], C7359b.m20838h()[(i >> 12) & 15], C7359b.m20838h()[(i >> 8) & 15], C7359b.m20838h()[(i >> 4) & 15], C7359b.m20838h()[i & 15]};
        while (i2 < 8 && cArr[i2] == '0') {
            i2++;
        }
        return new String(cArr, i2, 8 - i2);
    }
}