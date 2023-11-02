package com.facebook.drawee.backends.pipeline;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.controller.AbstractC3591a;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.drawable.C3624n;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p006a5.C0025b;
import p114g4.AbstractC6549e;
import p169j3.InterfaceC8790a;
import p208l3.C10033a;
import p225m3.C10249a;
import p225m3.C10250b;
import p240n3.C10491a;
import p240n3.C10493c;
import p240n3.C10494d;
import p240n3.C10497g;
import p240n3.InterfaceC10492b;
import p240n3.InterfaceC10496f;
import p277p3.AbstractC11375a;
import p278p4.InterfaceC11413s;
import p313r3.C12047a;
import p333s3.C12394a;
import p361u4.InterfaceC12830a;
import p380v4.AbstractC13063c;
import p394w2.C13371e;
import p394w2.C13375i;
import p394w2.C13379j;
import p414x2.C13677a;
import p416x4.C13688c;

/* renamed from: com.facebook.drawee.backends.pipeline.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3587a extends AbstractC3591a<CloseableReference<AbstractC13063c>, ImageInfo> {

    /* renamed from: N */
    private static final Class<?> f9745N = C3587a.class;

    /* renamed from: A */
    private final C13371e<InterfaceC12830a> f9746A;

    /* renamed from: B */
    private final InterfaceC11413s<CacheKey, AbstractC13063c> f9747B;

    /* renamed from: C */
    private CacheKey f9748C;

    /* renamed from: D */
    private Supplier<DataSource<CloseableReference<AbstractC13063c>>> f9749D;

    /* renamed from: E */
    private boolean f9750E;

    /* renamed from: F */
    private C13371e<InterfaceC12830a> f9751F;

    /* renamed from: G */
    private C10497g f9752G;

    /* renamed from: H */
    private Set<RequestListener> f9753H;

    /* renamed from: I */
    private InterfaceC10492b f9754I;

    /* renamed from: J */
    private C10250b f9755J;

    /* renamed from: K */
    private ImageRequest f9756K;

    /* renamed from: L */
    private ImageRequest[] f9757L;

    /* renamed from: M */
    private ImageRequest f9758M;

    /* renamed from: y */
    private final Resources f9759y;

    /* renamed from: z */
    private final InterfaceC12830a f9760z;

    public C3587a(Resources resources, AbstractC11375a abstractC11375a, InterfaceC12830a interfaceC12830a, Executor executor, InterfaceC11413s<CacheKey, AbstractC13063c> interfaceC11413s, C13371e<InterfaceC12830a> c13371e) {
        super(abstractC11375a, executor, null, null);
        this.f9759y = resources;
        this.f9760z = new C10033a(resources, interfaceC12830a);
        this.f9746A = c13371e;
        this.f9747B = interfaceC11413s;
    }

    /* renamed from: n0 */
    private void m31641n0(Supplier<DataSource<CloseableReference<AbstractC13063c>>> supplier) {
        this.f9749D = supplier;
        m31637r0(null);
    }

    /* renamed from: q0 */
    private Drawable m31638q0(C13371e<InterfaceC12830a> c13371e, AbstractC13063c abstractC13063c) {
        Drawable mo3844b;
        if (c13371e == null) {
            return null;
        }
        Iterator<InterfaceC12830a> it = c13371e.iterator();
        while (it.hasNext()) {
            InterfaceC12830a next = it.next();
            if (next.mo3845a(abstractC13063c) && (mo3844b = next.mo3844b(abstractC13063c)) != null) {
                return mo3844b;
            }
        }
        return null;
    }

    /* renamed from: r0 */
    private void m31637r0(AbstractC13063c abstractC13063c) {
        if (!this.f9750E) {
            return;
        }
        if (m31554r() == null) {
            C12047a c12047a = new C12047a();
            C12394a c12394a = new C12394a(c12047a);
            this.f9755J = new C10250b();
            m31562j(c12394a);
            m31572Y(c12047a);
        }
        if (this.f9754I == null) {
            m31649f0(this.f9755J);
        }
        if (m31554r() instanceof C12047a) {
            m31629z0(abstractC13063c, (C12047a) m31554r());
        }
    }

    @Override // com.facebook.drawee.controller.AbstractC3591a
    /* renamed from: N */
    protected void mo31583N(Drawable drawable) {
        if (drawable instanceof InterfaceC8790a) {
            ((InterfaceC8790a) drawable).mo17244a();
        }
    }

    @Override // com.facebook.drawee.controller.AbstractC3591a, com.facebook.drawee.interfaces.DraweeController
    /* renamed from: d */
    public void mo31387d(DraweeHierarchy draweeHierarchy) {
        super.mo31387d(draweeHierarchy);
        m31637r0(null);
    }

    /* renamed from: f0 */
    public synchronized void m31649f0(InterfaceC10492b interfaceC10492b) {
        InterfaceC10492b interfaceC10492b2 = this.f9754I;
        if (interfaceC10492b2 instanceof C10491a) {
            ((C10491a) interfaceC10492b2).m11399b(interfaceC10492b);
        } else if (interfaceC10492b2 != null) {
            this.f9754I = new C10491a(interfaceC10492b2, interfaceC10492b);
        } else {
            this.f9754I = interfaceC10492b;
        }
    }

    /* renamed from: g0 */
    public synchronized void m31648g0(RequestListener requestListener) {
        if (this.f9753H == null) {
            this.f9753H = new HashSet();
        }
        this.f9753H.add(requestListener);
    }

    /* renamed from: h0 */
    protected void m31647h0() {
        synchronized (this) {
            this.f9754I = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.drawee.controller.AbstractC3591a
    /* renamed from: i0 */
    public Drawable mo31560l(CloseableReference<AbstractC13063c> closeableReference) {
        try {
            if (C0025b.m41375d()) {
                C0025b.m41378a("PipelineDraweeController#createDrawable");
            }
            C13379j.m2675i(CloseableReference.m31727Q(closeableReference));
            AbstractC13063c m31730D = closeableReference.m31730D();
            m31637r0(m31730D);
            Drawable m31638q0 = m31638q0(this.f9751F, m31730D);
            if (m31638q0 != null) {
                return m31638q0;
            }
            Drawable m31638q02 = m31638q0(this.f9746A, m31730D);
            if (m31638q02 != null) {
                if (C0025b.m41375d()) {
                    C0025b.m41377b();
                }
                return m31638q02;
            }
            Drawable mo3844b = this.f9760z.mo3844b(m31730D);
            if (mo3844b != null) {
                if (C0025b.m41375d()) {
                    C0025b.m41377b();
                }
                return mo3844b;
            }
            throw new UnsupportedOperationException("Unrecognized image class: " + m31730D);
        } finally {
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.drawee.controller.AbstractC3591a
    /* renamed from: j0 */
    public CloseableReference<AbstractC13063c> mo31558n() {
        CacheKey cacheKey;
        if (C0025b.m41375d()) {
            C0025b.m41378a("PipelineDraweeController#getCachedImage");
        }
        try {
            InterfaceC11413s<CacheKey, AbstractC13063c> interfaceC11413s = this.f9747B;
            if (interfaceC11413s != null && (cacheKey = this.f9748C) != null) {
                CloseableReference<AbstractC13063c> closeableReference = interfaceC11413s.get(cacheKey);
                if (closeableReference != null && !closeableReference.m31730D().mo3365a().mo3323a()) {
                    closeableReference.close();
                    return null;
                }
                if (C0025b.m41375d()) {
                    C0025b.m41377b();
                }
                return closeableReference;
            }
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
            return null;
        } finally {
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.drawee.controller.AbstractC3591a
    /* renamed from: k0 */
    public int mo31548x(CloseableReference<AbstractC13063c> closeableReference) {
        if (closeableReference != null) {
            return closeableReference.m31729H();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.drawee.controller.AbstractC3591a
    /* renamed from: l0 */
    public ImageInfo mo31547y(CloseableReference<AbstractC13063c> closeableReference) {
        C13379j.m2675i(CloseableReference.m31727Q(closeableReference));
        return closeableReference.m31730D();
    }

    /* renamed from: m0 */
    public synchronized RequestListener m31642m0() {
        C10493c c10493c;
        if (this.f9754I != null) {
            c10493c = new C10493c(m31550v(), this.f9754I);
        } else {
            c10493c = null;
        }
        Set<RequestListener> set = this.f9753H;
        if (set != null) {
            C13688c c13688c = new C13688c(set);
            if (c10493c != null) {
                c13688c.m1804a(c10493c);
            }
            return c13688c;
        }
        return c10493c;
    }

    /* renamed from: o0 */
    public void m31640o0(Supplier<DataSource<CloseableReference<AbstractC13063c>>> supplier, String str, CacheKey cacheKey, Object obj, C13371e<InterfaceC12830a> c13371e, InterfaceC10492b interfaceC10492b) {
        if (C0025b.m41375d()) {
            C0025b.m41378a("PipelineDraweeController#initialize");
        }
        super.m31594C(str, obj);
        m31641n0(supplier);
        this.f9748C = cacheKey;
        m31631x0(c13371e);
        m31647h0();
        m31637r0(null);
        m31649f0(interfaceC10492b);
        if (C0025b.m41375d()) {
            C0025b.m41377b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p0 */
    public synchronized void m31639p0(InterfaceC10496f interfaceC10496f, AbstractDraweeControllerBuilder<PipelineDraweeControllerBuilder, ImageRequest, CloseableReference<AbstractC13063c>, ImageInfo> abstractDraweeControllerBuilder, Supplier<Boolean> supplier) {
        C10497g c10497g = this.f9752G;
        if (c10497g != null) {
            c10497g.m11389f();
        }
        if (interfaceC10496f != null) {
            if (this.f9752G == null) {
                this.f9752G = new C10497g(AwakeTimeSinceBootClock.get(), this, supplier);
            }
            this.f9752G.m11392c(interfaceC10496f);
            this.f9752G.m11388g(true);
            this.f9752G.m11386i(abstractDraweeControllerBuilder);
        }
        this.f9756K = abstractDraweeControllerBuilder.m31610n();
        this.f9757L = abstractDraweeControllerBuilder.m31611m();
        this.f9758M = abstractDraweeControllerBuilder.m31609o();
    }

    @Override // com.facebook.drawee.controller.AbstractC3591a
    /* renamed from: s */
    protected DataSource<CloseableReference<AbstractC13063c>> mo31553s() {
        if (C0025b.m41375d()) {
            C0025b.m41378a("PipelineDraweeController#getDataSource");
        }
        if (C13677a.m1842v(2)) {
            C13677a.m1840x(f9745N, "controller %x: getDataSource", Integer.valueOf(System.identityHashCode(this)));
        }
        DataSource<CloseableReference<AbstractC13063c>> dataSource = this.f9749D.get();
        if (C0025b.m41375d()) {
            C0025b.m41377b();
        }
        return dataSource;
    }

    @Override // com.facebook.drawee.controller.AbstractC3591a
    /* renamed from: s0 */
    public Map<String, Object> mo31588I(ImageInfo imageInfo) {
        if (imageInfo == null) {
            return null;
        }
        return imageInfo.getExtras();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.drawee.controller.AbstractC3591a
    /* renamed from: t0 */
    public void mo31586K(String str, CloseableReference<AbstractC13063c> closeableReference) {
        super.mo31586K(str, closeableReference);
        synchronized (this) {
            InterfaceC10492b interfaceC10492b = this.f9754I;
            if (interfaceC10492b != null) {
                interfaceC10492b.mo9414a(str, 6, true, "PipelineDraweeController");
            }
        }
    }

    @Override // com.facebook.drawee.controller.AbstractC3591a
    public String toString() {
        return C13375i.m2689c(this).m2687b("super", super.toString()).m2687b("dataSourceSupplier", this.f9749D).toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.drawee.controller.AbstractC3591a
    /* renamed from: u0 */
    public void mo31581P(CloseableReference<AbstractC13063c> closeableReference) {
        CloseableReference.m31715v(closeableReference);
    }

    /* renamed from: v0 */
    public synchronized void m31633v0(InterfaceC10492b interfaceC10492b) {
        InterfaceC10492b interfaceC10492b2 = this.f9754I;
        if (interfaceC10492b2 instanceof C10491a) {
            ((C10491a) interfaceC10492b2).m11398c(interfaceC10492b);
            return;
        }
        if (interfaceC10492b2 == interfaceC10492b) {
            this.f9754I = null;
        }
    }

    /* renamed from: w0 */
    public synchronized void m31632w0(RequestListener requestListener) {
        Set<RequestListener> set = this.f9753H;
        if (set == null) {
            return;
        }
        set.remove(requestListener);
    }

    /* renamed from: x0 */
    public void m31631x0(C13371e<InterfaceC12830a> c13371e) {
        this.f9751F = c13371e;
    }

    /* renamed from: y0 */
    public void m31630y0(boolean z) {
        this.f9750E = z;
    }

    @Override // com.facebook.drawee.controller.AbstractC3591a
    /* renamed from: z */
    protected Uri mo31546z() {
        return AbstractC6549e.m22416a(this.f9756K, this.f9758M, this.f9757L, ImageRequest.REQUEST_TO_URI_FN);
    }

    /* renamed from: z0 */
    protected void m31629z0(AbstractC13063c abstractC13063c, C12047a c12047a) {
        C3624n m31535a;
        c12047a.m6473i(m31550v());
        DraweeHierarchy mo31385f = mo31385f();
        ScalingUtils.ScaleType scaleType = null;
        if (mo31385f != null && (m31535a = ScalingUtils.m31535a(mo31385f.mo31384d())) != null) {
            scaleType = m31535a.m31486k();
        }
        c12047a.m6469m(scaleType);
        int m12029b = this.f9755J.m12029b();
        c12047a.m6470l(C10494d.m11395b(m12029b), C10249a.m12030a(m12029b));
        if (abstractC13063c != null) {
            c12047a.m6472j(abstractC13063c.getWidth(), abstractC13063c.getHeight());
            c12047a.m6471k(abstractC13063c.mo3364h());
            return;
        }
        c12047a.m6474h();
    }
}
