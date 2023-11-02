package p270oh;

import kotlin.jvm.internal.C9612q;

/* renamed from: oh.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C11123j {
    /* renamed from: a */
    public static final byte[] m9120a(String[] strings) {
        C9612q.m13917h(strings, "strings");
        int i = 0;
        for (String str : strings) {
            i += str.length();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (String str2 : strings) {
            int length = str2.length();
            int i3 = 0;
            while (i3 < length) {
                bArr[i2] = (byte) str2.charAt(i3);
                i3++;
                i2++;
            }
        }
        return bArr;
    }
}
