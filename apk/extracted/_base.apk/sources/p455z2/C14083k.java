package p455z2;

import java.io.InputStream;
import java.io.OutputStream;
import p394w2.C13379j;

/* renamed from: z2.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C14083k {

    /* renamed from: a */
    private final int f36235a;

    /* renamed from: b */
    private final InterfaceC14072a f36236b;

    public C14083k(InterfaceC14072a interfaceC14072a) {
        this(interfaceC14072a, 16384);
    }

    /* renamed from: a */
    public long m715a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = this.f36236b.get(this.f36235a);
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, this.f36235a);
                if (read == -1) {
                    return j;
                }
                outputStream.write(bArr, 0, read);
                j += read;
            } finally {
                this.f36236b.release(bArr);
            }
        }
    }

    public C14083k(InterfaceC14072a interfaceC14072a, int i) {
        C13379j.m2682b(Boolean.valueOf(i > 0));
        this.f36235a = i;
        this.f36236b = interfaceC14072a;
    }
}
