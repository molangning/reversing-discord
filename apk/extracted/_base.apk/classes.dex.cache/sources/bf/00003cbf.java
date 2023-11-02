package p170j4;

import java.io.UnsupportedEncodingException;
import p394w2.C13379j;

/* renamed from: j4.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C8796e {
    /* renamed from: a */
    public static byte[] m17224a(String str) {
        C13379j.m2677g(str);
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }

    /* renamed from: b */
    public static boolean m17223b(byte[] bArr, byte[] bArr2, int i) {
        C13379j.m2677g(bArr);
        C13379j.m2677g(bArr2);
        if (bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m17222c(byte[] bArr, byte[] bArr2) {
        return m17223b(bArr, bArr2, 0);
    }
}