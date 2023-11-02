package p153i8;

import com.google.android.exoplayer2.upstream.C4515a;
import com.google.android.exoplayer2.upstream.DataSource;
import java.io.InputStream;
import p195k8.C9149a;

/* renamed from: i8.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7456m extends InputStream {

    /* renamed from: j */
    private final DataSource f20006j;

    /* renamed from: k */
    private final C4515a f20007k;

    /* renamed from: o */
    private long f20011o;

    /* renamed from: m */
    private boolean f20009m = false;

    /* renamed from: n */
    private boolean f20010n = false;

    /* renamed from: l */
    private final byte[] f20008l = new byte[1];

    public C7456m(DataSource dataSource, C4515a c4515a) {
        this.f20006j = dataSource;
        this.f20007k = c4515a;
    }

    /* renamed from: a */
    private void m20647a() {
        if (!this.f20009m) {
            this.f20006j.mo6322b(this.f20007k);
            this.f20009m = true;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f20010n) {
            this.f20006j.close();
            this.f20010n = true;
        }
    }

    /* renamed from: h */
    public void m20646h() {
        m20647a();
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f20008l) == -1) {
            return -1;
        }
        return this.f20008l[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        C9149a.m16447f(!this.f20010n);
        m20647a();
        int read = this.f20006j.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        this.f20011o += read;
        return read;
    }
}