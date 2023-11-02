package p153i8;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.C4515a;
import com.google.android.exoplayer2.upstream.DataSource;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p195k8.C9149a;

/* renamed from: i8.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7470v implements DataSource {

    /* renamed from: a */
    private final DataSource f20059a;

    /* renamed from: b */
    private long f20060b;

    /* renamed from: c */
    private Uri f20061c = Uri.EMPTY;

    /* renamed from: d */
    private Map<String, List<String>> f20062d = Collections.emptyMap();

    public C7470v(DataSource dataSource) {
        this.f20059a = (DataSource) C9149a.m16448e(dataSource);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: b */
    public long mo6322b(C4515a c4515a) {
        this.f20061c = c4515a.f12257a;
        this.f20062d = Collections.emptyMap();
        long mo6322b = this.f20059a.mo6322b(c4515a);
        this.f20061c = (Uri) C9149a.m16448e(mo6319m());
        this.f20062d = mo6321d();
        return mo6322b;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        this.f20059a.close();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: d */
    public Map<String, List<String>> mo6321d() {
        return this.f20059a.mo6321d();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: f */
    public void mo6320f(InterfaceC7472x interfaceC7472x) {
        C9149a.m16448e(interfaceC7472x);
        this.f20059a.mo6320f(interfaceC7472x);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: m */
    public Uri mo6319m() {
        return this.f20059a.mo6319m();
    }

    /* renamed from: o */
    public long m20614o() {
        return this.f20060b;
    }

    /* renamed from: p */
    public Uri m20613p() {
        return this.f20061c;
    }

    /* renamed from: q */
    public Map<String, List<String>> m20612q() {
        return this.f20062d;
    }

    /* renamed from: r */
    public void m20611r() {
        this.f20060b = 0L;
    }

    @Override // p153i8.InterfaceC7451h
    public int read(byte[] bArr, int i, int i2) {
        int read = this.f20059a.read(bArr, i, i2);
        if (read != -1) {
            this.f20060b += read;
        }
        return read;
    }
}