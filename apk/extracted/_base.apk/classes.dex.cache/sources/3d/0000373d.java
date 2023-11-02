package p153i8;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.C4515a;
import com.google.android.exoplayer2.upstream.DataSource;
import java.util.List;
import java.util.Map;
import p195k8.C9149a;
import p195k8.C9150a0;

/* renamed from: i8.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7469u implements DataSource {

    /* renamed from: a */
    private final DataSource f20056a;

    /* renamed from: b */
    private final C9150a0 f20057b;

    /* renamed from: c */
    private final int f20058c;

    public C7469u(DataSource dataSource, C9150a0 c9150a0, int i) {
        this.f20056a = (DataSource) C9149a.m16448e(dataSource);
        this.f20057b = (C9150a0) C9149a.m16448e(c9150a0);
        this.f20058c = i;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: b */
    public long mo6322b(C4515a c4515a) {
        this.f20057b.m16442b(this.f20058c);
        return this.f20056a.mo6322b(c4515a);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        this.f20056a.close();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: d */
    public Map<String, List<String>> mo6321d() {
        return this.f20056a.mo6321d();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: f */
    public void mo6320f(InterfaceC7472x interfaceC7472x) {
        C9149a.m16448e(interfaceC7472x);
        this.f20056a.mo6320f(interfaceC7472x);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: m */
    public Uri mo6319m() {
        return this.f20056a.mo6319m();
    }

    @Override // p153i8.InterfaceC7451h
    public int read(byte[] bArr, int i, int i2) {
        this.f20057b.m16442b(this.f20058c);
        return this.f20056a.read(bArr, i, i2);
    }
}