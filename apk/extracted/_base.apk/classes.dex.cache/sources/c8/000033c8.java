package p119g9;

/* renamed from: g9.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6584g {

    /* renamed from: a */
    private static final char[] f18723a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b */
    private static final char[] f18724b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m22373a(byte[] bArr) {
        return m22372b(bArr, false);
    }

    /* renamed from: b */
    public static String m22372b(byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (int i = 0; i < length && (!z || i != length - 1 || (bArr[i] & 255) != 0); i++) {
            char[] cArr = f18723a;
            sb2.append(cArr[(bArr[i] & 240) >>> 4]);
            sb2.append(cArr[bArr[i] & 15]);
        }
        return sb2.toString();
    }
}