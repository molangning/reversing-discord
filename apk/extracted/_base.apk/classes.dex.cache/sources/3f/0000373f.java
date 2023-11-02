package p153i8;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.C4515a;
import com.google.android.exoplayer2.upstream.DataSource;
import java.util.List;
import java.util.Map;
import p195k8.C9149a;

/* renamed from: i8.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7471w implements DataSource {

    /* renamed from: a */
    private final DataSource f20063a;

    /* renamed from: b */
    private final InterfaceC7453j f20064b;

    /* renamed from: c */
    private boolean f20065c;

    /* renamed from: d */
    private long f20066d;

    public C7471w(DataSource dataSource, InterfaceC7453j interfaceC7453j) {
        this.f20063a = (DataSource) C9149a.m16448e(dataSource);
        this.f20064b = (InterfaceC7453j) C9149a.m16448e(interfaceC7453j);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: b */
    public long mo6322b(C4515a c4515a) {
        long mo6322b = this.f20063a.mo6322b(c4515a);
        this.f20066d = mo6322b;
        if (mo6322b == 0) {
            return 0L;
        }
        if (c4515a.f12264h == -1 && mo6322b != -1) {
            c4515a = c4515a.m28766f(0L, mo6322b);
        }
        this.f20065c = true;
        this.f20064b.mo20650b(c4515a);
        return this.f20066d;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        try {
            this.f20063a.close();
        } finally {
            if (this.f20065c) {
                this.f20065c = false;
                this.f20064b.close();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: d */
    public Map<String, List<String>> mo6321d() {
        return this.f20063a.mo6321d();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: f */
    public void mo6320f(InterfaceC7472x interfaceC7472x) {
        C9149a.m16448e(interfaceC7472x);
        this.f20063a.mo6320f(interfaceC7472x);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: m */
    public Uri mo6319m() {
        return this.f20063a.mo6319m();
    }

    @Override // p153i8.InterfaceC7451h
    public int read(byte[] bArr, int i, int i2) {
        if (this.f20066d == 0) {
            return -1;
        }
        int read = this.f20063a.read(bArr, i, i2);
        if (read > 0) {
            this.f20064b.write(bArr, i, read);
            long j = this.f20066d;
            if (j != -1) {
                this.f20066d = j - read;
            }
        }
        return read;
    }
}