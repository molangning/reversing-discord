package p153i8;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.C4515a;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import p195k8.C9149a;
import p195k8.C9191p0;

/* renamed from: i8.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7464r extends AbstractC7448f {

    /* renamed from: e */
    private RandomAccessFile f20052e;

    /* renamed from: f */
    private Uri f20053f;

    /* renamed from: g */
    private long f20054g;

    /* renamed from: h */
    private boolean f20055h;

    /* renamed from: i8.r$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C7465a extends IOException {
        public C7465a(IOException iOException) {
            super(iOException);
        }

        public C7465a(String str, IOException iOException) {
            super(str, iOException);
        }
    }

    public C7464r() {
        super(false);
    }

    /* renamed from: s */
    private static RandomAccessFile m20617s(Uri uri) {
        try {
            return new RandomAccessFile((String) C9149a.m16448e(uri.getPath()), "r");
        } catch (FileNotFoundException e) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new C7465a(e);
            }
            throw new C7465a(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: b */
    public long mo6322b(C4515a c4515a) {
        try {
            Uri uri = c4515a.f12257a;
            this.f20053f = uri;
            m20652q(c4515a);
            RandomAccessFile m20617s = m20617s(uri);
            this.f20052e = m20617s;
            m20617s.seek(c4515a.f12263g);
            long j = c4515a.f12264h;
            if (j == -1) {
                j = this.f20052e.length() - c4515a.f12263g;
            }
            this.f20054g = j;
            if (j >= 0) {
                this.f20055h = true;
                m20651r(c4515a);
                return this.f20054g;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new C7465a(e);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        this.f20053f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f20052e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new C7465a(e);
            }
        } finally {
            this.f20052e = null;
            if (this.f20055h) {
                this.f20055h = false;
                m20653p();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: m */
    public Uri mo6319m() {
        return this.f20053f;
    }

    @Override // p153i8.InterfaceC7451h
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.f20054g == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) C9191p0.m16243j(this.f20052e)).read(bArr, i, (int) Math.min(this.f20054g, i2));
            if (read > 0) {
                this.f20054g -= read;
                m20654o(read);
            }
            return read;
        } catch (IOException e) {
            throw new C7465a(e);
        }
    }
}