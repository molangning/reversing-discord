package p444yb;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: yb.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13971f {

    /* renamed from: a */
    private static final byte f35944a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    private static final byte f35945b = Byte.parseByte("00001111", 2);

    /* renamed from: b */
    private static String m1053b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    /* renamed from: c */
    private static byte[] m1052c(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    /* renamed from: a */
    public String m1054a() {
        byte[] m1052c = m1052c(UUID.randomUUID(), new byte[17]);
        byte b = m1052c[0];
        m1052c[16] = b;
        m1052c[0] = (byte) ((b & f35945b) | f35944a);
        return m1053b(m1052c);
    }
}
