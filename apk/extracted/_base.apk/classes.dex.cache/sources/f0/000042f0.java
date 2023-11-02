package p229m7;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.C4515a;
import com.google.android.exoplayer2.upstream.DataSource;
import java.util.List;
import java.util.Map;
import p153i8.InterfaceC7472x;
import p195k8.C9149a;
import p195k8.C9208y;

/* renamed from: m7.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C10318m implements DataSource {

    /* renamed from: a */
    private final DataSource f26974a;

    /* renamed from: b */
    private final int f26975b;

    /* renamed from: c */
    private final InterfaceC10319a f26976c;

    /* renamed from: d */
    private final byte[] f26977d;

    /* renamed from: e */
    private int f26978e;

    /* renamed from: m7.m$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC10319a {
        /* renamed from: b */
        void mo11789b(C9208y c9208y);
    }

    public C10318m(DataSource dataSource, int i, InterfaceC10319a interfaceC10319a) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16452a(z);
        this.f26974a = dataSource;
        this.f26975b = i;
        this.f26976c = interfaceC10319a;
        this.f26977d = new byte[1];
        this.f26978e = i;
    }

    /* renamed from: o */
    private boolean m11790o() {
        if (this.f26974a.read(this.f26977d, 0, 1) == -1) {
            return false;
        }
        int i = (this.f26977d[0] & 255) << 4;
        if (i == 0) {
            return true;
        }
        byte[] bArr = new byte[i];
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int read = this.f26974a.read(bArr, i3, i2);
            if (read == -1) {
                return false;
            }
            i3 += read;
            i2 -= read;
        }
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        if (i > 0) {
            this.f26976c.mo11789b(new C9208y(bArr, i));
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: b */
    public long mo6322b(C4515a c4515a) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: d */
    public Map<String, List<String>> mo6321d() {
        return this.f26974a.mo6321d();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: f */
    public void mo6320f(InterfaceC7472x interfaceC7472x) {
        C9149a.m16448e(interfaceC7472x);
        this.f26974a.mo6320f(interfaceC7472x);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: m */
    public Uri mo6319m() {
        return this.f26974a.mo6319m();
    }

    @Override // p153i8.InterfaceC7451h
    public int read(byte[] bArr, int i, int i2) {
        if (this.f26978e == 0) {
            if (!m11790o()) {
                return -1;
            }
            this.f26978e = this.f26975b;
        }
        int read = this.f26974a.read(bArr, i, Math.min(this.f26978e, i2));
        if (read != -1) {
            this.f26978e -= read;
        }
        return read;
    }
}