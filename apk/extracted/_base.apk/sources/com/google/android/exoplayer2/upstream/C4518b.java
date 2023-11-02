package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p153i8.C7441c;
import p153i8.C7449g;
import p153i8.C7452i;
import p153i8.C7464r;
import p153i8.C7473y;
import p153i8.InterfaceC7472x;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9197r;

/* renamed from: com.google.android.exoplayer2.upstream.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4518b implements DataSource {

    /* renamed from: a */
    private final Context f12278a;

    /* renamed from: b */
    private final List<InterfaceC7472x> f12279b = new ArrayList();

    /* renamed from: c */
    private final DataSource f12280c;

    /* renamed from: d */
    private DataSource f12281d;

    /* renamed from: e */
    private DataSource f12282e;

    /* renamed from: f */
    private DataSource f12283f;

    /* renamed from: g */
    private DataSource f12284g;

    /* renamed from: h */
    private DataSource f12285h;

    /* renamed from: i */
    private DataSource f12286i;

    /* renamed from: j */
    private DataSource f12287j;

    /* renamed from: k */
    private DataSource f12288k;

    public C4518b(Context context, DataSource dataSource) {
        this.f12278a = context.getApplicationContext();
        this.f12280c = (DataSource) C9149a.m16448e(dataSource);
    }

    /* renamed from: o */
    private void m28754o(DataSource dataSource) {
        for (int i = 0; i < this.f12279b.size(); i++) {
            dataSource.mo6320f(this.f12279b.get(i));
        }
    }

    /* renamed from: p */
    private DataSource m28753p() {
        if (this.f12282e == null) {
            C7441c c7441c = new C7441c(this.f12278a);
            this.f12282e = c7441c;
            m28754o(c7441c);
        }
        return this.f12282e;
    }

    /* renamed from: q */
    private DataSource m28752q() {
        if (this.f12283f == null) {
            C7449g c7449g = new C7449g(this.f12278a);
            this.f12283f = c7449g;
            m28754o(c7449g);
        }
        return this.f12283f;
    }

    /* renamed from: r */
    private DataSource m28751r() {
        if (this.f12286i == null) {
            C7452i c7452i = new C7452i();
            this.f12286i = c7452i;
            m28754o(c7452i);
        }
        return this.f12286i;
    }

    /* renamed from: s */
    private DataSource m28750s() {
        if (this.f12281d == null) {
            C7464r c7464r = new C7464r();
            this.f12281d = c7464r;
            m28754o(c7464r);
        }
        return this.f12281d;
    }

    /* renamed from: t */
    private DataSource m28749t() {
        if (this.f12287j == null) {
            RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.f12278a);
            this.f12287j = rawResourceDataSource;
            m28754o(rawResourceDataSource);
        }
        return this.f12287j;
    }

    /* renamed from: u */
    private DataSource m28748u() {
        if (this.f12284g == null) {
            try {
                DataSource dataSource = (DataSource) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f12284g = dataSource;
                m28754o(dataSource);
            } catch (ClassNotFoundException unused) {
                C9197r.m16178h("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating RTMP extension", e);
            }
            if (this.f12284g == null) {
                this.f12284g = this.f12280c;
            }
        }
        return this.f12284g;
    }

    /* renamed from: v */
    private DataSource m28747v() {
        if (this.f12285h == null) {
            C7473y c7473y = new C7473y();
            this.f12285h = c7473y;
            m28754o(c7473y);
        }
        return this.f12285h;
    }

    /* renamed from: w */
    private void m28746w(DataSource dataSource, InterfaceC7472x interfaceC7472x) {
        if (dataSource != null) {
            dataSource.mo6320f(interfaceC7472x);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: b */
    public long mo6322b(C4515a c4515a) {
        boolean z;
        if (this.f12288k == null) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        String scheme = c4515a.f12257a.getScheme();
        if (C9191p0.m16226r0(c4515a.f12257a)) {
            String path = c4515a.f12257a.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                this.f12288k = m28753p();
            } else {
                this.f12288k = m28750s();
            }
        } else if ("asset".equals(scheme)) {
            this.f12288k = m28753p();
        } else if ("content".equals(scheme)) {
            this.f12288k = m28752q();
        } else if ("rtmp".equals(scheme)) {
            this.f12288k = m28748u();
        } else if ("udp".equals(scheme)) {
            this.f12288k = m28747v();
        } else if ("data".equals(scheme)) {
            this.f12288k = m28751r();
        } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
            this.f12288k = this.f12280c;
        } else {
            this.f12288k = m28749t();
        }
        return this.f12288k.mo6322b(c4515a);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        DataSource dataSource = this.f12288k;
        if (dataSource != null) {
            try {
                dataSource.close();
            } finally {
                this.f12288k = null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: d */
    public Map<String, List<String>> mo6321d() {
        DataSource dataSource = this.f12288k;
        return dataSource == null ? Collections.emptyMap() : dataSource.mo6321d();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: f */
    public void mo6320f(InterfaceC7472x interfaceC7472x) {
        C9149a.m16448e(interfaceC7472x);
        this.f12280c.mo6320f(interfaceC7472x);
        this.f12279b.add(interfaceC7472x);
        m28746w(this.f12281d, interfaceC7472x);
        m28746w(this.f12282e, interfaceC7472x);
        m28746w(this.f12283f, interfaceC7472x);
        m28746w(this.f12284g, interfaceC7472x);
        m28746w(this.f12285h, interfaceC7472x);
        m28746w(this.f12286i, interfaceC7472x);
        m28746w(this.f12287j, interfaceC7472x);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: m */
    public Uri mo6319m() {
        DataSource dataSource = this.f12288k;
        if (dataSource == null) {
            return null;
        }
        return dataSource.mo6319m();
    }

    @Override // p153i8.InterfaceC7451h
    public int read(byte[] bArr, int i, int i2) {
        return ((DataSource) C9149a.m16448e(this.f12288k)).read(bArr, i, i2);
    }
}
