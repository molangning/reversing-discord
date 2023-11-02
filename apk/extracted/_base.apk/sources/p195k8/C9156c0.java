package p195k8;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* renamed from: k8.c0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9156c0 extends BufferedOutputStream {

    /* renamed from: j */
    private boolean f24109j;

    public C9156c0(OutputStream outputStream) {
        super(outputStream);
    }

    /* renamed from: a */
    public void m16432a(OutputStream outputStream) {
        C9149a.m16447f(this.f24109j);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f24109j = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f24109j = true;
        try {
            flush();
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        if (th != null) {
            C9191p0.m16290L0(th);
        }
    }

    public C9156c0(OutputStream outputStream, int i) {
        super(outputStream, i);
    }
}
