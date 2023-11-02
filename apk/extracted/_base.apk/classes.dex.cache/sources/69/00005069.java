package p394w2;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: w2.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13369c extends FilterOutputStream {

    /* renamed from: j */
    private long f34456j;

    public C13369c(OutputStream outputStream) {
        super(outputStream);
        this.f34456j = 0L;
    }

    /* renamed from: a */
    public long m2698a() {
        return this.f34456j;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        this.f34456j += i2;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) {
        ((FilterOutputStream) this).out.write(i);
        this.f34456j++;
    }
}