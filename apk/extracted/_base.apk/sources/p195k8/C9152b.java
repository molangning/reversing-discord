package p195k8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: k8.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9152b {

    /* renamed from: a */
    private final File f24104a;

    /* renamed from: b */
    private final File f24105b;

    /* renamed from: k8.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C9153a extends OutputStream {

        /* renamed from: j */
        private final FileOutputStream f24106j;

        /* renamed from: k */
        private boolean f24107k = false;

        public C9153a(File file) {
            this.f24106j = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f24107k) {
                return;
            }
            this.f24107k = true;
            flush();
            try {
                this.f24106j.getFD().sync();
            } catch (IOException e) {
                C9197r.m16177i("AtomicFile", "Failed to sync file descriptor:", e);
            }
            this.f24106j.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            this.f24106j.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            this.f24106j.write(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            this.f24106j.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            this.f24106j.write(bArr, i, i2);
        }
    }

    public C9152b(File file) {
        this.f24104a = file;
        this.f24105b = new File(file.getPath() + ".bak");
    }

    /* renamed from: e */
    private void m16436e() {
        if (this.f24105b.exists()) {
            this.f24104a.delete();
            this.f24105b.renameTo(this.f24104a);
        }
    }

    /* renamed from: a */
    public void m16440a() {
        this.f24104a.delete();
        this.f24105b.delete();
    }

    /* renamed from: b */
    public void m16439b(OutputStream outputStream) {
        outputStream.close();
        this.f24105b.delete();
    }

    /* renamed from: c */
    public boolean m16438c() {
        return this.f24104a.exists() || this.f24105b.exists();
    }

    /* renamed from: d */
    public InputStream m16437d() {
        m16436e();
        return new FileInputStream(this.f24104a);
    }

    /* renamed from: f */
    public OutputStream m16435f() {
        if (this.f24104a.exists()) {
            if (!this.f24105b.exists()) {
                if (!this.f24104a.renameTo(this.f24105b)) {
                    C9197r.m16178h("AtomicFile", "Couldn't rename file " + this.f24104a + " to backup file " + this.f24105b);
                }
            } else {
                this.f24104a.delete();
            }
        }
        try {
            return new C9153a(this.f24104a);
        } catch (FileNotFoundException e) {
            File parentFile = this.f24104a.getParentFile();
            if (parentFile != null && parentFile.mkdirs()) {
                try {
                    return new C9153a(this.f24104a);
                } catch (FileNotFoundException e2) {
                    throw new IOException("Couldn't create " + this.f24104a, e2);
                }
            }
            throw new IOException("Couldn't create " + this.f24104a, e);
        }
    }
}
