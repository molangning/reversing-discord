package p153i8;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.google.android.exoplayer2.upstream.C4515a;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import p195k8.C9149a;
import p195k8.C9191p0;

/* renamed from: i8.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7441c extends AbstractC7448f {

    /* renamed from: e */
    private final AssetManager f19978e;

    /* renamed from: f */
    private Uri f19979f;

    /* renamed from: g */
    private InputStream f19980g;

    /* renamed from: h */
    private long f19981h;

    /* renamed from: i */
    private boolean f19982i;

    /* renamed from: i8.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C7442a extends IOException {
        public C7442a(IOException iOException) {
            super(iOException);
        }
    }

    public C7441c(Context context) {
        super(false);
        this.f19978e = context.getAssets();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: b */
    public long mo6322b(C4515a c4515a) {
        try {
            Uri uri = c4515a.f12257a;
            this.f19979f = uri;
            String str = (String) C9149a.m16448e(uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith("/")) {
                str = str.substring(1);
            }
            m20652q(c4515a);
            InputStream open = this.f19978e.open(str, 1);
            this.f19980g = open;
            if (open.skip(c4515a.f12263g) >= c4515a.f12263g) {
                long j = c4515a.f12264h;
                if (j != -1) {
                    this.f19981h = j;
                } else {
                    long available = this.f19980g.available();
                    this.f19981h = available;
                    if (available == 2147483647L) {
                        this.f19981h = -1L;
                    }
                }
                this.f19982i = true;
                m20651r(c4515a);
                return this.f19981h;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new C7442a(e);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        this.f19979f = null;
        try {
            try {
                InputStream inputStream = this.f19980g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new C7442a(e);
            }
        } finally {
            this.f19980g = null;
            if (this.f19982i) {
                this.f19982i = false;
                m20653p();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: m */
    public Uri mo6319m() {
        return this.f19979f;
    }

    @Override // p153i8.InterfaceC7451h
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f19981h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C7442a(e);
            }
        }
        int read = ((InputStream) C9191p0.m16243j(this.f19980g)).read(bArr, i, i2);
        if (read == -1) {
            if (this.f19981h == -1) {
                return -1;
            }
            throw new C7442a(new EOFException());
        }
        long j2 = this.f19981h;
        if (j2 != -1) {
            this.f19981h = j2 - read;
        }
        m20654o(read);
        return read;
    }
}
