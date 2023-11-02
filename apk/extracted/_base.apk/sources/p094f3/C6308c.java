package p094f3;

import com.facebook.webpsupport.WebpBitmapFactoryImpl;
import java.io.UnsupportedEncodingException;

/* renamed from: f3.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6308c {

    /* renamed from: a */
    public static final boolean f17810a = false;

    /* renamed from: b */
    public static final boolean f17811b = true;

    /* renamed from: c */
    public static final boolean f17812c = m23005e();

    /* renamed from: d */
    public static InterfaceC6306b f17813d = null;

    /* renamed from: e */
    private static boolean f17814e = false;

    /* renamed from: f */
    private static final byte[] f17815f = m23009a("RIFF");

    /* renamed from: g */
    private static final byte[] f17816g = m23009a("WEBP");

    /* renamed from: h */
    private static final byte[] f17817h = m23009a("VP8 ");

    /* renamed from: i */
    private static final byte[] f17818i = m23009a("VP8L");

    /* renamed from: j */
    private static final byte[] f17819j = m23009a("VP8X");

    /* renamed from: a */
    private static byte[] m23009a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }

    /* renamed from: b */
    public static boolean m23008b(byte[] bArr, int i) {
        boolean z;
        boolean m23000j = m23000j(bArr, i + 12, f17819j);
        if ((bArr[i + 20] & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        if (m23000j && z) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m23007c(byte[] bArr, int i, int i2) {
        if (i2 >= 21 && m23000j(bArr, i + 12, f17819j)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m23006d(byte[] bArr, int i) {
        boolean z;
        boolean m23000j = m23000j(bArr, i + 12, f17819j);
        if ((bArr[i + 20] & 16) == 16) {
            z = true;
        } else {
            z = false;
        }
        if (m23000j && z) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m23005e() {
        return true;
    }

    /* renamed from: f */
    public static boolean m23004f(byte[] bArr, int i) {
        return m23000j(bArr, i + 12, f17818i);
    }

    /* renamed from: g */
    public static boolean m23003g(byte[] bArr, int i) {
        return m23000j(bArr, i + 12, f17817h);
    }

    /* renamed from: h */
    public static boolean m23002h(byte[] bArr, int i, int i2) {
        if (i2 >= 20 && m23000j(bArr, i, f17815f) && m23000j(bArr, i + 8, f17816g)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static InterfaceC6306b m23001i() {
        InterfaceC6306b interfaceC6306b;
        if (f17814e) {
            return f17813d;
        }
        try {
            boolean z = WebpBitmapFactoryImpl.f11018a;
            interfaceC6306b = (InterfaceC6306b) WebpBitmapFactoryImpl.class.newInstance();
        } catch (Throwable unused) {
            interfaceC6306b = null;
        }
        f17814e = true;
        return interfaceC6306b;
    }

    /* renamed from: j */
    private static boolean m23000j(byte[] bArr, int i, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2 + i] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }
}
