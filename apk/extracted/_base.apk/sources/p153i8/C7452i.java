package p153i8;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.upstream.C4515a;
import java.net.URLDecoder;
import p102fb.C6374d;
import p151i6.C7402m;
import p195k8.C9191p0;

/* renamed from: i8.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7452i extends AbstractC7448f {

    /* renamed from: e */
    private C4515a f20001e;

    /* renamed from: f */
    private byte[] f20002f;

    /* renamed from: g */
    private int f20003g;

    /* renamed from: h */
    private int f20004h;

    public C7452i() {
        super(false);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: b */
    public long mo6322b(C4515a c4515a) {
        int length;
        m20652q(c4515a);
        this.f20001e = c4515a;
        this.f20004h = (int) c4515a.f12263g;
        Uri uri = c4515a.f12257a;
        String scheme = uri.getScheme();
        if ("data".equals(scheme)) {
            String[] m16286N0 = C9191p0.m16286N0(uri.getSchemeSpecificPart(), ",");
            if (m16286N0.length == 2) {
                String str = m16286N0[1];
                if (m16286N0[0].contains(";base64")) {
                    try {
                        this.f20002f = Base64.decode(str, 0);
                    } catch (IllegalArgumentException e) {
                        throw new C7402m("Error while parsing Base64 encoded string: " + str, e);
                    }
                } else {
                    this.f20002f = C9191p0.m16238l0(URLDecoder.decode(str, C6374d.f18021a.name()));
                }
                long j = c4515a.f12264h;
                if (j != -1) {
                    length = ((int) j) + this.f20004h;
                } else {
                    length = this.f20002f.length;
                }
                this.f20003g = length;
                if (length <= this.f20002f.length && this.f20004h <= length) {
                    m20651r(c4515a);
                    return this.f20003g - this.f20004h;
                }
                this.f20002f = null;
                throw new C7455l(0);
            }
            throw new C7402m("Unexpected URI format: " + uri);
        }
        throw new C7402m("Unsupported scheme: " + scheme);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        if (this.f20002f != null) {
            this.f20002f = null;
            m20653p();
        }
        this.f20001e = null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: m */
    public Uri mo6319m() {
        C4515a c4515a = this.f20001e;
        if (c4515a != null) {
            return c4515a.f12257a;
        }
        return null;
    }

    @Override // p153i8.InterfaceC7451h
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f20003g - this.f20004h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(C9191p0.m16243j(this.f20002f), this.f20004h, bArr, i, min);
        this.f20004h += min;
        m20654o(min);
        return min;
    }
}
