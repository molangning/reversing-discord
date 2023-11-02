package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.C4515a;
import com.google.android.exoplayer2.upstream.C4539e;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.cache.InterfaceC4521a;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p153i8.C7455l;
import p153i8.C7469u;
import p153i8.C7471w;
import p153i8.InterfaceC7453j;
import p153i8.InterfaceC7472x;
import p174j8.C8868d;
import p174j8.C8869e;
import p174j8.C8871g;
import p174j8.InterfaceC8867c;
import p195k8.C9149a;
import p195k8.C9150a0;
import p195k8.C9191p0;

/* renamed from: com.google.android.exoplayer2.upstream.cache.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4526c implements DataSource {

    /* renamed from: a */
    private final InterfaceC4521a f12316a;

    /* renamed from: b */
    private final DataSource f12317b;

    /* renamed from: c */
    private final DataSource f12318c;

    /* renamed from: d */
    private final DataSource f12319d;

    /* renamed from: e */
    private final InterfaceC8867c f12320e;

    /* renamed from: f */
    private final boolean f12321f;

    /* renamed from: g */
    private final boolean f12322g;

    /* renamed from: h */
    private final boolean f12323h;

    /* renamed from: i */
    private Uri f12324i;

    /* renamed from: j */
    private C4515a f12325j;

    /* renamed from: k */
    private DataSource f12326k;

    /* renamed from: l */
    private boolean f12327l;

    /* renamed from: m */
    private long f12328m;

    /* renamed from: n */
    private long f12329n;

    /* renamed from: o */
    private C8868d f12330o;

    /* renamed from: p */
    private boolean f12331p;

    /* renamed from: q */
    private boolean f12332q;

    /* renamed from: r */
    private long f12333r;

    /* renamed from: s */
    private long f12334s;

    /* renamed from: com.google.android.exoplayer2.upstream.cache.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4527a {
    }

    public C4526c(InterfaceC4521a interfaceC4521a, DataSource dataSource, DataSource dataSource2, InterfaceC7453j interfaceC7453j, int i, InterfaceC4527a interfaceC4527a) {
        this(interfaceC4521a, dataSource, dataSource2, interfaceC7453j, i, interfaceC4527a, null);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [j8.d, com.google.android.exoplayer2.upstream.DataSource] */
    /* renamed from: o */
    private void m28716o() {
        DataSource dataSource = this.f12326k;
        if (dataSource == null) {
            return;
        }
        try {
            dataSource.close();
        } finally {
            this.f12326k = null;
            this.f12327l = false;
            C8868d c8868d = this.f12330o;
            if (c8868d != null) {
                this.f12316a.mo28721f(c8868d);
                this.f12330o = null;
            }
        }
    }

    /* renamed from: p */
    private static Uri m28715p(InterfaceC4521a interfaceC4521a, String str, Uri uri) {
        Uri m17141b = C8869e.m17141b(interfaceC4521a.mo28723d(str));
        return m17141b != null ? m17141b : uri;
    }

    /* renamed from: q */
    private void m28714q(Throwable th2) {
        if (m28712s() || (th2 instanceof InterfaceC4521a.C4522a)) {
            this.f12331p = true;
        }
    }

    /* renamed from: r */
    private boolean m28713r() {
        return this.f12326k == this.f12319d;
    }

    /* renamed from: s */
    private boolean m28712s() {
        return this.f12326k == this.f12317b;
    }

    /* renamed from: t */
    private boolean m28711t() {
        return !m28712s();
    }

    /* renamed from: u */
    private boolean m28710u() {
        return this.f12326k == this.f12318c;
    }

    /* renamed from: v */
    private void m28709v() {
    }

    /* renamed from: w */
    private void m28708w(int i) {
    }

    /* renamed from: x */
    private void m28707x(C4515a c4515a, boolean z) {
        C8868d mo28720g;
        long j;
        C4515a m28765a;
        DataSource dataSource;
        long j2;
        boolean z2;
        Uri mo6319m;
        String str = (String) C9191p0.m16243j(c4515a.f12265i);
        Uri uri = null;
        if (this.f12332q) {
            mo28720g = null;
        } else if (this.f12321f) {
            try {
                mo28720g = this.f12316a.mo28720g(str, this.f12328m, this.f12329n);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            mo28720g = this.f12316a.mo28722e(str, this.f12328m, this.f12329n);
        }
        if (mo28720g == null) {
            dataSource = this.f12319d;
            m28765a = c4515a.m28771a().m28758h(this.f12328m).m28759g(this.f12329n).m28765a();
        } else if (mo28720g.f23248m) {
            Uri fromFile = Uri.fromFile((File) C9191p0.m16243j(mo28720g.f23249n));
            long j3 = mo28720g.f23246k;
            long j4 = this.f12328m - j3;
            long j5 = mo28720g.f23247l - j4;
            long j6 = this.f12329n;
            if (j6 != -1) {
                j5 = Math.min(j5, j6);
            }
            m28765a = c4515a.m28771a().m28757i(fromFile).m28755k(j3).m28758h(j4).m28759g(j5).m28765a();
            dataSource = this.f12317b;
        } else {
            if (mo28720g.m17143c()) {
                j = this.f12329n;
            } else {
                j = mo28720g.f23247l;
                long j7 = this.f12329n;
                if (j7 != -1) {
                    j = Math.min(j, j7);
                }
            }
            m28765a = c4515a.m28771a().m28758h(this.f12328m).m28759g(j).m28765a();
            dataSource = this.f12318c;
            if (dataSource == null) {
                dataSource = this.f12319d;
                this.f12316a.mo28721f(mo28720g);
                mo28720g = null;
            }
        }
        if (!this.f12332q && dataSource == this.f12319d) {
            j2 = this.f12328m + 102400;
        } else {
            j2 = Long.MAX_VALUE;
        }
        this.f12334s = j2;
        if (z) {
            C9149a.m16447f(m28713r());
            if (dataSource == this.f12319d) {
                return;
            }
            try {
                m28716o();
            } catch (Throwable th2) {
                if (((C8868d) C9191p0.m16243j(mo28720g)).m17144b()) {
                    this.f12316a.mo28721f(mo28720g);
                }
                throw th2;
            }
        }
        if (mo28720g != null && mo28720g.m17144b()) {
            this.f12330o = mo28720g;
        }
        this.f12326k = dataSource;
        if (m28765a.f12264h == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f12327l = z2;
        long mo6322b = dataSource.mo6322b(m28765a);
        C8871g c8871g = new C8871g();
        if (this.f12327l && mo6322b != -1) {
            this.f12329n = mo6322b;
            C8871g.m17134g(c8871g, this.f12328m + mo6322b);
        }
        if (m28711t()) {
            this.f12324i = dataSource.mo6319m();
            if (!c4515a.f12257a.equals(mo6319m)) {
                uri = this.f12324i;
            }
            C8871g.m17133h(c8871g, uri);
        }
        if (m28710u()) {
            this.f12316a.mo28724c(str, c8871g);
        }
    }

    /* renamed from: y */
    private void m28706y(String str) {
        this.f12329n = 0L;
        if (m28710u()) {
            C8871g c8871g = new C8871g();
            C8871g.m17134g(c8871g, this.f12328m);
            this.f12316a.mo28724c(str, c8871g);
        }
    }

    /* renamed from: z */
    private int m28705z(C4515a c4515a) {
        if (this.f12322g && this.f12331p) {
            return 0;
        }
        if (this.f12323h && c4515a.f12264h == -1) {
            return 1;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: b */
    public long mo6322b(C4515a c4515a) {
        boolean z;
        try {
            String mo17146a = this.f12320e.mo17146a(c4515a);
            C4515a m28765a = c4515a.m28771a().m28760f(mo17146a).m28765a();
            this.f12325j = m28765a;
            this.f12324i = m28715p(this.f12316a, mo17146a, m28765a.f12257a);
            this.f12328m = c4515a.f12263g;
            int m28705z = m28705z(c4515a);
            if (m28705z != -1) {
                z = true;
            } else {
                z = false;
            }
            this.f12332q = z;
            if (z) {
                m28708w(m28705z);
            }
            long j = c4515a.f12264h;
            if (j == -1 && !this.f12332q) {
                long m17142a = C8869e.m17142a(this.f12316a.mo28723d(mo17146a));
                this.f12329n = m17142a;
                if (m17142a != -1) {
                    long j2 = m17142a - c4515a.f12263g;
                    this.f12329n = j2;
                    if (j2 <= 0) {
                        throw new C7455l(0);
                    }
                }
                m28707x(m28765a, false);
                return this.f12329n;
            }
            this.f12329n = j;
            m28707x(m28765a, false);
            return this.f12329n;
        } catch (Throwable th2) {
            m28714q(th2);
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        this.f12325j = null;
        this.f12324i = null;
        this.f12328m = 0L;
        m28709v();
        try {
            m28716o();
        } catch (Throwable th2) {
            m28714q(th2);
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: d */
    public Map<String, List<String>> mo6321d() {
        if (m28711t()) {
            return this.f12319d.mo6321d();
        }
        return Collections.emptyMap();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: f */
    public void mo6320f(InterfaceC7472x interfaceC7472x) {
        C9149a.m16448e(interfaceC7472x);
        this.f12317b.mo6320f(interfaceC7472x);
        this.f12319d.mo6320f(interfaceC7472x);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: m */
    public Uri mo6319m() {
        return this.f12324i;
    }

    @Override // p153i8.InterfaceC7451h
    public int read(byte[] bArr, int i, int i2) {
        C4515a c4515a = (C4515a) C9149a.m16448e(this.f12325j);
        if (i2 == 0) {
            return 0;
        }
        if (this.f12329n == 0) {
            return -1;
        }
        try {
            if (this.f12328m >= this.f12334s) {
                m28707x(c4515a, true);
            }
            int read = ((DataSource) C9149a.m16448e(this.f12326k)).read(bArr, i, i2);
            if (read != -1) {
                if (m28712s()) {
                    this.f12333r += read;
                }
                long j = read;
                this.f12328m += j;
                long j2 = this.f12329n;
                if (j2 != -1) {
                    this.f12329n = j2 - j;
                }
            } else if (this.f12327l) {
                m28706y((String) C9191p0.m16243j(c4515a.f12265i));
            } else {
                long j3 = this.f12329n;
                if (j3 <= 0) {
                    if (j3 == -1) {
                    }
                }
                m28716o();
                m28707x(c4515a, false);
                return read(bArr, i, i2);
            }
            return read;
        } catch (IOException e) {
            if (this.f12327l && C7455l.m20648a(e)) {
                m28706y((String) C9191p0.m16243j(c4515a.f12265i));
                return -1;
            }
            m28714q(e);
            throw e;
        } catch (Throwable th2) {
            m28714q(th2);
            throw th2;
        }
    }

    public C4526c(InterfaceC4521a interfaceC4521a, DataSource dataSource, DataSource dataSource2, InterfaceC7453j interfaceC7453j, int i, InterfaceC4527a interfaceC4527a, InterfaceC8867c interfaceC8867c) {
        this(interfaceC4521a, dataSource, dataSource2, interfaceC7453j, interfaceC8867c, i, null, 0, interfaceC4527a);
    }

    private C4526c(InterfaceC4521a interfaceC4521a, DataSource dataSource, DataSource dataSource2, InterfaceC7453j interfaceC7453j, InterfaceC8867c interfaceC8867c, int i, C9150a0 c9150a0, int i2, InterfaceC4527a interfaceC4527a) {
        this.f12316a = interfaceC4521a;
        this.f12317b = dataSource2;
        this.f12320e = interfaceC8867c == null ? InterfaceC8867c.f23244a : interfaceC8867c;
        this.f12321f = (i & 1) != 0;
        this.f12322g = (i & 2) != 0;
        this.f12323h = (i & 4) != 0;
        if (dataSource != null) {
            dataSource = c9150a0 != null ? new C7469u(dataSource, c9150a0, i2) : dataSource;
            this.f12319d = dataSource;
            this.f12318c = interfaceC7453j != null ? new C7471w(dataSource, interfaceC7453j) : null;
            return;
        }
        this.f12319d = C4539e.f12369a;
        this.f12318c = null;
    }
}