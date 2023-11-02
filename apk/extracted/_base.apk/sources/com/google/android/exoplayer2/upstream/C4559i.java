package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.upstream.C4515a;
import com.google.android.exoplayer2.upstream.C4550h;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import p153i8.C7456m;
import p153i8.C7470v;
import p195k8.C9149a;
import p195k8.C9191p0;

/* renamed from: com.google.android.exoplayer2.upstream.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4559i<T> implements C4550h.InterfaceC4555e {

    /* renamed from: a */
    public final long f12405a;

    /* renamed from: b */
    public final C4515a f12406b;

    /* renamed from: c */
    public final int f12407c;

    /* renamed from: d */
    private final C7470v f12408d;

    /* renamed from: e */
    private final InterfaceC4560a<? extends T> f12409e;

    /* renamed from: f */
    private volatile T f12410f;

    /* renamed from: com.google.android.exoplayer2.upstream.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4560a<T> {
        /* renamed from: a */
        T mo3724a(Uri uri, InputStream inputStream);
    }

    public C4559i(DataSource dataSource, Uri uri, int i, InterfaceC4560a<? extends T> interfaceC4560a) {
        this(dataSource, new C4515a.C4517b().m28757i(uri).m28764b(1).m28765a(), i, interfaceC4560a);
    }

    @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4555e
    /* renamed from: a */
    public final void mo6277a() {
        this.f12408d.m20611r();
        C7456m c7456m = new C7456m(this.f12408d, this.f12406b);
        try {
            c7456m.m20646h();
            this.f12410f = this.f12409e.mo3724a((Uri) C9149a.m16448e(this.f12408d.mo6319m()), c7456m);
        } finally {
            C9191p0.m16233o(c7456m);
        }
    }

    /* renamed from: b */
    public long m28605b() {
        return this.f12408d.m20614o();
    }

    @Override // com.google.android.exoplayer2.upstream.C4550h.InterfaceC4555e
    /* renamed from: c */
    public final void mo6276c() {
    }

    /* renamed from: d */
    public Map<String, List<String>> m28604d() {
        return this.f12408d.m20612q();
    }

    /* renamed from: e */
    public final T m28603e() {
        return this.f12410f;
    }

    /* renamed from: f */
    public Uri m28602f() {
        return this.f12408d.m20613p();
    }

    public C4559i(DataSource dataSource, C4515a c4515a, int i, InterfaceC4560a<? extends T> interfaceC4560a) {
        this.f12408d = new C7470v(dataSource);
        this.f12406b = c4515a;
        this.f12407c = i;
        this.f12409e = interfaceC4560a;
        this.f12405a = LoadEventInfo.m29145a();
    }
}
