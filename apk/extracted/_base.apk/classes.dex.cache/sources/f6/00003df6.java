package p193k6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: k6.l0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C9106l0 {
    /* renamed from: a */
    public static List<byte[]> m16645a(byte[] bArr) {
        long m16641e = m16641e(m16642d(bArr));
        long m16641e2 = m16641e(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(m16644b(m16641e));
        arrayList.add(m16644b(m16641e2));
        return arrayList;
    }

    /* renamed from: b */
    private static byte[] m16644b(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }

    /* renamed from: c */
    public static int m16643c(byte[] bArr) {
        return bArr[9] & 255;
    }

    /* renamed from: d */
    private static int m16642d(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    /* renamed from: e */
    private static long m16641e(long j) {
        return (j * 1000000000) / 48000;
    }
}