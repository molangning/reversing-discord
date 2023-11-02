package p296q6;

/* renamed from: q6.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C11750l {
    /* renamed from: a */
    public static int m7007a(InterfaceC11747j interfaceC11747j, byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int mo6966j = interfaceC11747j.mo6966j(bArr, i + i3, i2 - i3);
            if (mo6966j == -1) {
                break;
            }
            i3 += mo6966j;
        }
        return i3;
    }
}
