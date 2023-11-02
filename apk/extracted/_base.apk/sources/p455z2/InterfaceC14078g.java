package p455z2;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: z2.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC14078g extends Closeable {

    /* renamed from: z2.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C14079a extends RuntimeException {
        public C14079a() {
            super("Invalid bytebuf. Already closed");
        }
    }

    /* renamed from: e */
    int mo725e(int i, byte[] bArr, int i2, int i3);

    /* renamed from: f */
    ByteBuffer mo724f();

    boolean isClosed();

    /* renamed from: k */
    byte mo723k(int i);

    /* renamed from: l */
    long mo722l();

    int size();
}
