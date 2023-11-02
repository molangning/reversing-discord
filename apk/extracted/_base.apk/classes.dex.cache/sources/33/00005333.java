package p455z2;

import java.io.IOException;
import java.io.OutputStream;
import p394w2.C13386n;

/* renamed from: z2.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC14082j extends OutputStream {
    /* renamed from: a */
    public abstract InterfaceC14078g mo716a();

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e) {
            C13386n.m2666a(e);
        }
    }

    public abstract int size();
}