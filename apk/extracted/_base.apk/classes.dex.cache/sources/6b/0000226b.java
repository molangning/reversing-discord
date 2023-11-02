package com.facebook.imagepipeline.core;

import android.content.Context;
import android.os.Build;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.platform.C3752h;
import com.facebook.imagepipeline.platform.InterfaceC3751g;
import com.facebook.imagepipeline.producers.C3843u;
import com.facebook.imagepipeline.producers.C3853w0;
import com.facebook.imagepipeline.producers.InterfaceC3851v0;
import java.util.Set;
import p006a5.C0025b;
import p025b5.C2127f;
import p025b5.C2129h;
import p025b5.InterfaceC2125d;
import p209l4.C10039b;
import p209l4.InterfaceC10038a;
import p257o4.C10985d;
import p278p4.C11386e;
import p278p4.C11402m;
import p278p4.C11404n;
import p278p4.C11407p;
import p278p4.C11408q;
import p278p4.InterfaceC11392f;
import p278p4.InterfaceC11396i;
import p278p4.InterfaceC11413s;
import p312r2.InterfaceC12045h;
import p314r4.C12048a;
import p314r4.C12059j;
import p314r4.C12060k;
import p314r4.InterfaceC12055g;
import p346t4.C12577b;
import p346t4.InterfaceC12579c;
import p361u4.InterfaceC12830a;
import p380v4.AbstractC13063c;
import p394w2.C13379j;
import p414x2.C13677a;
import p416x4.InterfaceC13689d;
import p455z2.InterfaceC14078g;

/* renamed from: com.facebook.imagepipeline.core.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3712b {

    /* renamed from: t */
    private static final Class<?> f10461t = C3712b.class;

    /* renamed from: u */
    private static C3712b f10462u;

    /* renamed from: v */
    private static boolean f10463v;

    /* renamed from: w */
    private static ImagePipeline f10464w;

    /* renamed from: a */
    private final InterfaceC3851v0 f10465a;

    /* renamed from: b */
    private final InterfaceC12055g f10466b;

    /* renamed from: c */
    private final C12048a f10467c;

    /* renamed from: d */
    private InterfaceC11396i<CacheKey, AbstractC13063c> f10468d;

    /* renamed from: e */
    private C11407p<CacheKey, AbstractC13063c> f10469e;

    /* renamed from: f */
    private InterfaceC11396i<CacheKey, InterfaceC14078g> f10470f;

    /* renamed from: g */
    private C11407p<CacheKey, InterfaceC14078g> f10471g;

    /* renamed from: h */
    private C11386e f10472h;

    /* renamed from: i */
    private InterfaceC12045h f10473i;

    /* renamed from: j */
    private InterfaceC12579c f10474j;

    /* renamed from: k */
    private ImagePipeline f10475k;

    /* renamed from: l */
    private InterfaceC2125d f10476l;

    /* renamed from: m */
    private C12059j f10477m;

    /* renamed from: n */
    private C12060k f10478n;

    /* renamed from: o */
    private C11386e f10479o;

    /* renamed from: p */
    private InterfaceC12045h f10480p;

    /* renamed from: q */
    private PlatformBitmapFactory f10481q;

    /* renamed from: r */
    private InterfaceC3751g f10482r;

    /* renamed from: s */
    private InterfaceC10038a f10483s;

    public C3712b(InterfaceC12055g interfaceC12055g) {
        InterfaceC3851v0 c3853w0;
        if (C0025b.m41375d()) {
            C0025b.m41378a("ImagePipelineConfig()");
        }
        InterfaceC12055g interfaceC12055g2 = (InterfaceC12055g) C13379j.m2677g(interfaceC12055g);
        this.f10466b = interfaceC12055g2;
        if (interfaceC12055g2.mo6448D().m31082t()) {
            c3853w0 = new C3843u(interfaceC12055g.mo6447E().mo6459a());
        } else {
            c3853w0 = new C3853w0(interfaceC12055g.mo6447E().mo6459a());
        }
        this.f10465a = c3853w0;
        CloseableReference.m31721b0(interfaceC12055g.mo6448D().m31100b());
        this.f10467c = new C12048a(interfaceC12055g.mo6424w());
        if (C0025b.m41375d()) {
            C0025b.m41377b();
        }
    }

    /* renamed from: a */
    private ImagePipeline m31054a() {
        C12060k m31037r = m31037r();
        Set<RequestListener> mo6441f = this.f10466b.mo6441f();
        Set<InterfaceC13689d> mo6446a = this.f10466b.mo6446a();
        Supplier<Boolean> mo6445b = this.f10466b.mo6445b();
        C11407p<CacheKey, AbstractC13063c> m31050e = m31050e();
        C11407p<CacheKey, InterfaceC14078g> m31047h = m31047h();
        C11386e m31042m = m31042m();
        C11386e m31036s = m31036s();
        InterfaceC11392f mo6422y = this.f10466b.mo6422y();
        InterfaceC3851v0 interfaceC3851v0 = this.f10465a;
        Supplier<Boolean> m31093i = this.f10466b.mo6448D().m31093i();
        Supplier<Boolean> m31080v = this.f10466b.mo6448D().m31080v();
        this.f10466b.mo6449C();
        return new ImagePipeline(m31037r, mo6441f, mo6446a, mo6445b, m31050e, m31047h, m31042m, m31036s, mo6422y, interfaceC3851v0, m31093i, m31080v, null, this.f10466b);
    }

    /* renamed from: c */
    private InterfaceC10038a m31052c() {
        if (this.f10483s == null) {
            this.f10483s = C10039b.m12498a(m31040o(), this.f10466b.mo6447E(), m31051d(), this.f10466b.mo6448D().m31104A(), this.f10466b.mo6435l());
        }
        return this.f10483s;
    }

    /* renamed from: i */
    private InterfaceC12579c m31046i() {
        InterfaceC12579c interfaceC12579c;
        InterfaceC12579c interfaceC12579c2;
        if (this.f10474j == null) {
            if (this.f10466b.mo6429r() != null) {
                this.f10474j = this.f10466b.mo6429r();
            } else {
                InterfaceC10038a m31052c = m31052c();
                if (m31052c != null) {
                    interfaceC12579c = m31052c.mo12499c();
                    interfaceC12579c2 = m31052c.mo12500b();
                } else {
                    interfaceC12579c = null;
                    interfaceC12579c2 = null;
                }
                this.f10466b.mo6432o();
                this.f10474j = new C12577b(interfaceC12579c, interfaceC12579c2, m31039p());
            }
        }
        return this.f10474j;
    }

    /* renamed from: k */
    private InterfaceC2125d m31044k() {
        if (this.f10476l == null) {
            if (this.f10466b.mo6433n() == null && this.f10466b.mo6434m() == null && this.f10466b.mo6448D().m31079w()) {
                this.f10476l = new C2129h(this.f10466b.mo6448D().m31096f());
            } else {
                this.f10476l = new C2127f(this.f10466b.mo6448D().m31096f(), this.f10466b.mo6448D().m31090l(), this.f10466b.mo6433n(), this.f10466b.mo6434m(), this.f10466b.mo6448D().m31083s());
            }
        }
        return this.f10476l;
    }

    /* renamed from: l */
    public static C3712b m31043l() {
        return (C3712b) C13379j.m2676h(f10462u, "ImagePipelineFactory was not initialized!");
    }

    /* renamed from: q */
    private C12059j m31038q() {
        if (this.f10477m == null) {
            this.f10477m = this.f10466b.mo6448D().m31094h().mo31055a(this.f10466b.getContext(), this.f10466b.mo6427t().m1226k(), m31046i(), this.f10466b.mo6439h(), this.f10466b.mo6436k(), this.f10466b.mo6421z(), this.f10466b.mo6448D().m31087o(), this.f10466b.mo6447E(), this.f10466b.mo6427t().m1228i(this.f10466b.mo6426u()), this.f10466b.mo6427t().m1227j(), m31050e(), m31047h(), m31042m(), m31036s(), this.f10466b.mo6422y(), m31040o(), this.f10466b.mo6448D().m31097e(), this.f10466b.mo6448D().m31098d(), this.f10466b.mo6448D().m31099c(), this.f10466b.mo6448D().m31096f(), m31049f(), this.f10466b.mo6448D().m31103B(), this.f10466b.mo6448D().m31092j());
        }
        return this.f10477m;
    }

    /* renamed from: r */
    private C12060k m31037r() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 24 && this.f10466b.mo6448D().m31091k()) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        if (this.f10478n == null) {
            this.f10478n = new C12060k(this.f10466b.getContext().getApplicationContext().getContentResolver(), m31038q(), this.f10466b.mo6444c(), this.f10466b.mo6421z(), this.f10466b.mo6448D().m31077y(), this.f10465a, this.f10466b.mo6436k(), z2, this.f10466b.mo6448D().m31078x(), this.f10466b.mo6431p(), m31044k(), this.f10466b.mo6448D().m31084r(), this.f10466b.mo6448D().m31086p(), this.f10466b.mo6448D().m31102C(), this.f10466b.mo6448D().m31101a());
        }
        return this.f10478n;
    }

    /* renamed from: s */
    private C11386e m31036s() {
        if (this.f10479o == null) {
            this.f10479o = new C11386e(m31035t(), this.f10466b.mo6427t().m1228i(this.f10466b.mo6426u()), this.f10466b.mo6427t().m1227j(), this.f10466b.mo6447E().mo6454f(), this.f10466b.mo6447E().mo6458b(), this.f10466b.mo6451A());
        }
        return this.f10479o;
    }

    /* renamed from: u */
    public static synchronized void m31034u(Context context) {
        synchronized (C3712b.class) {
            if (C0025b.m41375d()) {
                C0025b.m41378a("ImagePipelineFactory#initialize");
            }
            m31033v(ImagePipelineConfig.m31153J(context).m31141K());
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
        }
    }

    /* renamed from: v */
    public static synchronized void m31033v(InterfaceC12055g interfaceC12055g) {
        synchronized (C3712b.class) {
            if (f10462u != null) {
                C13677a.m1874D(f10461t, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
            }
            f10462u = new C3712b(interfaceC12055g);
        }
    }

    /* renamed from: b */
    public InterfaceC12830a m31053b(Context context) {
        InterfaceC10038a m31052c = m31052c();
        if (m31052c == null) {
            return null;
        }
        return m31052c.mo12501a(context);
    }

    /* renamed from: d */
    public InterfaceC11396i<CacheKey, AbstractC13063c> m31051d() {
        if (this.f10468d == null) {
            this.f10468d = this.f10466b.mo6423x().mo8166a(this.f10466b.mo6430q(), this.f10466b.mo6450B(), this.f10466b.mo6440g(), this.f10466b.mo6437j());
        }
        return this.f10468d;
    }

    /* renamed from: e */
    public C11407p<CacheKey, AbstractC13063c> m31050e() {
        if (this.f10469e == null) {
            this.f10469e = C11408q.m8138a(m31051d(), this.f10466b.mo6451A());
        }
        return this.f10469e;
    }

    /* renamed from: f */
    public C12048a m31049f() {
        return this.f10467c;
    }

    /* renamed from: g */
    public InterfaceC11396i<CacheKey, InterfaceC14078g> m31048g() {
        if (this.f10470f == null) {
            this.f10470f = C11402m.m8144a(this.f10466b.mo6428s(), this.f10466b.mo6450B());
        }
        return this.f10470f;
    }

    /* renamed from: h */
    public C11407p<CacheKey, InterfaceC14078g> m31047h() {
        InterfaceC11413s<CacheKey, InterfaceC14078g> m31048g;
        if (this.f10471g == null) {
            if (this.f10466b.mo6443d() != null) {
                m31048g = this.f10466b.mo6443d();
            } else {
                m31048g = m31048g();
            }
            this.f10471g = C11404n.m8142a(m31048g, this.f10466b.mo6451A());
        }
        return this.f10471g;
    }

    /* renamed from: j */
    public ImagePipeline m31045j() {
        if (f10463v) {
            if (f10464w == null) {
                ImagePipeline m31054a = m31054a();
                f10464w = m31054a;
                this.f10475k = m31054a;
            }
            return f10464w;
        }
        if (this.f10475k == null) {
            this.f10475k = m31054a();
        }
        return this.f10475k;
    }

    /* renamed from: m */
    public C11386e m31042m() {
        if (this.f10472h == null) {
            this.f10472h = new C11386e(m31041n(), this.f10466b.mo6427t().m1228i(this.f10466b.mo6426u()), this.f10466b.mo6427t().m1227j(), this.f10466b.mo6447E().mo6454f(), this.f10466b.mo6447E().mo6458b(), this.f10466b.mo6451A());
        }
        return this.f10472h;
    }

    /* renamed from: n */
    public InterfaceC12045h m31041n() {
        if (this.f10473i == null) {
            this.f10473i = this.f10466b.mo6425v().mo6452a(this.f10466b.mo6442e());
        }
        return this.f10473i;
    }

    /* renamed from: o */
    public PlatformBitmapFactory m31040o() {
        if (this.f10481q == null) {
            this.f10481q = C10985d.m9409a(this.f10466b.mo6427t(), m31039p(), m31049f());
        }
        return this.f10481q;
    }

    /* renamed from: p */
    public InterfaceC3751g m31039p() {
        if (this.f10482r == null) {
            this.f10482r = C3752h.m30919a(this.f10466b.mo6427t(), this.f10466b.mo6448D().m31081u());
        }
        return this.f10482r;
    }

    /* renamed from: t */
    public InterfaceC12045h m31035t() {
        if (this.f10480p == null) {
            this.f10480p = this.f10466b.mo6425v().mo6452a(this.f10466b.mo6438i());
        }
        return this.f10480p;
    }
}