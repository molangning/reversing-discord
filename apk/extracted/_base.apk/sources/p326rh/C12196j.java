package p326rh;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* renamed from: rh.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C12196j {

    /* renamed from: a */
    public static final byte[] f31748a;

    /* renamed from: b */
    public static final ByteBuffer f31749b;

    /* renamed from: rh.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public interface InterfaceC12197a {
        int getNumber();
    }

    /* renamed from: rh.j$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public interface InterfaceC12198b<T extends InterfaceC12197a> {
        /* renamed from: a */
        T mo5797a(int i);
    }

    static {
        byte[] bArr = new byte[0];
        f31748a = bArr;
        f31749b = ByteBuffer.wrap(bArr);
    }

    /* renamed from: a */
    public static boolean m5799a(byte[] bArr) {
        return C12233y.m5686e(bArr);
    }

    /* renamed from: b */
    public static String m5798b(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }
}
