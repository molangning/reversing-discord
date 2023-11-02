package p229m7;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.upstream.C4515a;
import com.google.android.exoplayer2.upstream.C4538d;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.InterfaceC4548g;
import java.util.Collections;
import p153i8.InterfaceC7440b;
import p153i8.InterfaceC7472x;
import p195k8.C9149a;
import p229m7.InterfaceC10341s;

/* renamed from: m7.r0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10338r0 extends AbstractC10277a {

    /* renamed from: p */
    private final C4515a f27042p;

    /* renamed from: q */
    private final DataSource.Factory f27043q;

    /* renamed from: r */
    private final Format f27044r;

    /* renamed from: s */
    private final long f27045s;

    /* renamed from: t */
    private final InterfaceC4548g f27046t;

    /* renamed from: u */
    private final boolean f27047u;

    /* renamed from: v */
    private final Timeline f27048v;

    /* renamed from: w */
    private final MediaItem f27049w;

    /* renamed from: x */
    private InterfaceC7472x f27050x;

    /* renamed from: m7.r0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C10340b {

        /* renamed from: a */
        private final DataSource.Factory f27051a;

        /* renamed from: b */
        private InterfaceC4548g f27052b = new C4538d();

        /* renamed from: c */
        private boolean f27053c = true;

        /* renamed from: d */
        private Object f27054d;

        /* renamed from: e */
        private String f27055e;

        public C10340b(DataSource.Factory factory) {
            this.f27051a = (DataSource.Factory) C9149a.m16448e(factory);
        }

        @Deprecated
        /* renamed from: a */
        public C10338r0 m11737a(Uri uri, Format format, long j) {
            String str = format.f11186j;
            if (str == null) {
                str = this.f27055e;
            }
            return new C10338r0(str, new MediaItem.C4370h(uri, (String) C9149a.m16448e(format.f11197u), format.f11188l, format.f11189m), this.f27051a, j, this.f27052b, this.f27053c, this.f27054d);
        }
    }

    @Override // p229m7.AbstractC10277a
    /* renamed from: A */
    protected void mo11739A(InterfaceC7472x interfaceC7472x) {
        this.f27050x = interfaceC7472x;
        m11958B(this.f27048v);
    }

    @Override // p229m7.AbstractC10277a
    /* renamed from: C */
    protected void mo11738C() {
    }

    @Override // p229m7.InterfaceC10341s
    /* renamed from: e */
    public MediaItem mo11732e() {
        return this.f27049w;
    }

    @Override // p229m7.InterfaceC10341s
    /* renamed from: g */
    public InterfaceC10329p mo11731g(InterfaceC10341s.C10342a c10342a, InterfaceC7440b interfaceC7440b, long j) {
        return new C10333q0(this.f27042p, this.f27043q, this.f27050x, this.f27044r, this.f27045s, this.f27046t, m11954v(c10342a), this.f27047u);
    }

    @Override // p229m7.InterfaceC10341s
    /* renamed from: m */
    public void mo11728m() {
    }

    @Override // p229m7.InterfaceC10341s
    /* renamed from: q */
    public void mo11725q(InterfaceC10329p interfaceC10329p) {
        ((C10333q0) interfaceC10329p).m11746s();
    }

    private C10338r0(String str, MediaItem.C4370h c4370h, DataSource.Factory factory, long j, InterfaceC4548g interfaceC4548g, boolean z, Object obj) {
        this.f27043q = factory;
        this.f27045s = j;
        this.f27046t = interfaceC4548g;
        this.f27047u = z;
        MediaItem m29854a = new MediaItem.C4365c().m29846i(Uri.EMPTY).m29851d(c4370h.f11295a.toString()).m29848g(Collections.singletonList(c4370h)).m29847h(obj).m29854a();
        this.f27049w = m29854a;
        this.f27044r = new Format.C4362b().m29900S(str).m29883e0(c4370h.f11296b).m29897V(c4370h.f11297c).m29879g0(c4370h.f11298d).m29887c0(c4370h.f11299e).m29898U(c4370h.f11300f).m29914E();
        this.f27042p = new C4515a.C4517b().m28757i(c4370h.f11295a).m28764b(1).m28765a();
        this.f27048v = new C10331p0(j, true, false, false, null, m29854a);
    }
}
