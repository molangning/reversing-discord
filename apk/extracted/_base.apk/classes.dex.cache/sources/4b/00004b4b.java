package p314r4;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.producers.C3756a;
import com.facebook.imagepipeline.producers.C3759a0;
import com.facebook.imagepipeline.producers.C3762b0;
import com.facebook.imagepipeline.producers.C3763b1;
import com.facebook.imagepipeline.producers.C3771d0;
import com.facebook.imagepipeline.producers.C3773e0;
import com.facebook.imagepipeline.producers.C3774f;
import com.facebook.imagepipeline.producers.C3775f0;
import com.facebook.imagepipeline.producers.C3778g;
import com.facebook.imagepipeline.producers.C3784h;
import com.facebook.imagepipeline.producers.C3786h0;
import com.facebook.imagepipeline.producers.C3788i;
import com.facebook.imagepipeline.producers.C3790i0;
import com.facebook.imagepipeline.producers.C3794j;
import com.facebook.imagepipeline.producers.C3796j0;
import com.facebook.imagepipeline.producers.C3798k;
import com.facebook.imagepipeline.producers.C3801k0;
import com.facebook.imagepipeline.producers.C3809l;
import com.facebook.imagepipeline.producers.C3811m;
import com.facebook.imagepipeline.producers.C3818n;
import com.facebook.imagepipeline.producers.C3823p;
import com.facebook.imagepipeline.producers.C3826p0;
import com.facebook.imagepipeline.producers.C3827q;
import com.facebook.imagepipeline.producers.C3830q0;
import com.facebook.imagepipeline.producers.C3834r;
import com.facebook.imagepipeline.producers.C3836s;
import com.facebook.imagepipeline.producers.C3839t;
import com.facebook.imagepipeline.producers.C3841t0;
import com.facebook.imagepipeline.producers.C3844u0;
import com.facebook.imagepipeline.producers.C3855x0;
import com.facebook.imagepipeline.producers.C3866y0;
import com.facebook.imagepipeline.producers.C3868z;
import com.facebook.imagepipeline.producers.InterfaceC3810l0;
import com.facebook.imagepipeline.producers.InterfaceC3851v0;
import com.facebook.imagepipeline.producers.InterfaceC3869z0;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import p025b5.InterfaceC2125d;
import p278p4.C11385d;
import p278p4.C11386e;
import p278p4.InterfaceC11392f;
import p278p4.InterfaceC11413s;
import p346t4.InterfaceC12579c;
import p346t4.InterfaceC12581e;
import p380v4.AbstractC13063c;
import p380v4.C13065e;
import p394w2.C13382m;
import p455z2.InterfaceC14072a;
import p455z2.InterfaceC14078g;
import p455z2.InterfaceC14080h;

/* renamed from: r4.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12059j {

    /* renamed from: a */
    protected ContentResolver f31145a;

    /* renamed from: b */
    protected Resources f31146b;

    /* renamed from: c */
    protected AssetManager f31147c;

    /* renamed from: d */
    protected final InterfaceC14072a f31148d;

    /* renamed from: e */
    protected final InterfaceC12579c f31149e;

    /* renamed from: f */
    protected final InterfaceC12581e f31150f;

    /* renamed from: g */
    protected final boolean f31151g;

    /* renamed from: h */
    protected final boolean f31152h;

    /* renamed from: i */
    protected final boolean f31153i;

    /* renamed from: j */
    protected final InterfaceC12053e f31154j;

    /* renamed from: k */
    protected final InterfaceC14080h f31155k;

    /* renamed from: l */
    protected final C11386e f31156l;

    /* renamed from: m */
    protected final C11386e f31157m;

    /* renamed from: n */
    protected final InterfaceC11413s<CacheKey, InterfaceC14078g> f31158n;

    /* renamed from: o */
    protected final InterfaceC11413s<CacheKey, AbstractC13063c> f31159o;

    /* renamed from: p */
    protected final InterfaceC11392f f31160p;

    /* renamed from: q */
    protected final C11385d<CacheKey> f31161q;

    /* renamed from: r */
    protected final C11385d<CacheKey> f31162r;

    /* renamed from: s */
    protected final PlatformBitmapFactory f31163s;

    /* renamed from: t */
    protected final int f31164t;

    /* renamed from: u */
    protected final int f31165u;

    /* renamed from: v */
    protected boolean f31166v;

    /* renamed from: w */
    protected final C12048a f31167w;

    /* renamed from: x */
    protected final int f31168x;

    /* renamed from: y */
    protected final boolean f31169y;

    public C12059j(Context context, InterfaceC14072a interfaceC14072a, InterfaceC12579c interfaceC12579c, InterfaceC12581e interfaceC12581e, boolean z, boolean z2, boolean z3, InterfaceC12053e interfaceC12053e, InterfaceC14080h interfaceC14080h, InterfaceC11413s<CacheKey, AbstractC13063c> interfaceC11413s, InterfaceC11413s<CacheKey, InterfaceC14078g> interfaceC11413s2, C11386e c11386e, C11386e c11386e2, InterfaceC11392f interfaceC11392f, PlatformBitmapFactory platformBitmapFactory, int i, int i2, boolean z4, int i3, C12048a c12048a, boolean z5, int i4) {
        this.f31145a = context.getApplicationContext().getContentResolver();
        this.f31146b = context.getApplicationContext().getResources();
        this.f31147c = context.getApplicationContext().getAssets();
        this.f31148d = interfaceC14072a;
        this.f31149e = interfaceC12579c;
        this.f31150f = interfaceC12581e;
        this.f31151g = z;
        this.f31152h = z2;
        this.f31153i = z3;
        this.f31154j = interfaceC12053e;
        this.f31155k = interfaceC14080h;
        this.f31159o = interfaceC11413s;
        this.f31158n = interfaceC11413s2;
        this.f31156l = c11386e;
        this.f31157m = c11386e2;
        this.f31160p = interfaceC11392f;
        this.f31163s = platformBitmapFactory;
        this.f31161q = new C11385d<>(i4);
        this.f31162r = new C11385d<>(i4);
        this.f31164t = i;
        this.f31165u = i2;
        this.f31166v = z4;
        this.f31168x = i3;
        this.f31167w = c12048a;
        this.f31169y = z5;
    }

    /* renamed from: a */
    public static C3756a m6409a(InterfaceC3810l0<C13065e> interfaceC3810l0) {
        return new C3756a(interfaceC3810l0);
    }

    /* renamed from: h */
    public static C3798k m6402h(InterfaceC3810l0<C13065e> interfaceC3810l0, InterfaceC3810l0<C13065e> interfaceC3810l02) {
        return new C3798k(interfaceC3810l0, interfaceC3810l02);
    }

    /* renamed from: A */
    public C3796j0 m6417A(InterfaceC3810l0<CloseableReference<AbstractC13063c>> interfaceC3810l0) {
        return new C3796j0(this.f31159o, this.f31160p, interfaceC3810l0);
    }

    /* renamed from: B */
    public C3801k0 m6416B(InterfaceC3810l0<CloseableReference<AbstractC13063c>> interfaceC3810l0) {
        return new C3801k0(interfaceC3810l0, this.f31163s, this.f31154j.mo6455e());
    }

    /* renamed from: C */
    public C3826p0 m6415C() {
        return new C3826p0(this.f31154j.mo6454f(), this.f31155k, this.f31145a);
    }

    /* renamed from: D */
    public C3830q0 m6414D(InterfaceC3810l0<C13065e> interfaceC3810l0, boolean z, InterfaceC2125d interfaceC2125d) {
        return new C3830q0(this.f31154j.mo6455e(), this.f31155k, interfaceC3810l0, z, interfaceC2125d);
    }

    /* renamed from: E */
    public <T> C3841t0<T> m6413E(InterfaceC3810l0<T> interfaceC3810l0) {
        return new C3841t0<>(interfaceC3810l0);
    }

    /* renamed from: F */
    public <T> C3855x0<T> m6412F(InterfaceC3810l0<T> interfaceC3810l0) {
        return new C3855x0<>(5, this.f31154j.mo6459a(), interfaceC3810l0);
    }

    /* renamed from: G */
    public C3866y0 m6411G(InterfaceC3869z0<C13065e>[] interfaceC3869z0Arr) {
        return new C3866y0(interfaceC3869z0Arr);
    }

    /* renamed from: H */
    public C3763b1 m6410H(InterfaceC3810l0<C13065e> interfaceC3810l0) {
        return new C3763b1(this.f31154j.mo6455e(), this.f31155k, interfaceC3810l0);
    }

    /* renamed from: b */
    public <T> InterfaceC3810l0<T> m6408b(InterfaceC3810l0<T> interfaceC3810l0, InterfaceC3851v0 interfaceC3851v0) {
        return new C3844u0(interfaceC3810l0, interfaceC3851v0);
    }

    /* renamed from: c */
    public C3774f m6407c(InterfaceC3810l0<CloseableReference<AbstractC13063c>> interfaceC3810l0) {
        return new C3774f(this.f31159o, this.f31160p, interfaceC3810l0);
    }

    /* renamed from: d */
    public C3778g m6406d(InterfaceC3810l0<CloseableReference<AbstractC13063c>> interfaceC3810l0) {
        return new C3778g(this.f31160p, interfaceC3810l0);
    }

    /* renamed from: e */
    public C3784h m6405e(InterfaceC3810l0<CloseableReference<AbstractC13063c>> interfaceC3810l0) {
        return new C3784h(this.f31159o, this.f31160p, interfaceC3810l0);
    }

    /* renamed from: f */
    public C3788i m6404f(InterfaceC3810l0<CloseableReference<AbstractC13063c>> interfaceC3810l0) {
        return new C3788i(interfaceC3810l0, this.f31164t, this.f31165u, this.f31166v);
    }

    /* renamed from: g */
    public C3794j m6403g(InterfaceC3810l0<CloseableReference<AbstractC13063c>> interfaceC3810l0) {
        return new C3794j(this.f31158n, this.f31156l, this.f31157m, this.f31160p, this.f31161q, this.f31162r, interfaceC3810l0);
    }

    /* renamed from: i */
    public InterfaceC3810l0<C13065e> m6401i(NetworkFetcher networkFetcher) {
        return null;
    }

    /* renamed from: j */
    public C3809l m6400j() {
        return new C3809l(this.f31155k);
    }

    /* renamed from: k */
    public C3811m m6399k(InterfaceC3810l0<C13065e> interfaceC3810l0) {
        return new C3811m(this.f31148d, this.f31154j.mo6456d(), this.f31149e, this.f31150f, this.f31151g, this.f31152h, this.f31153i, interfaceC3810l0, this.f31168x, this.f31167w, null, C13382m.f34465b);
    }

    /* renamed from: l */
    public C3818n m6398l(InterfaceC3810l0<CloseableReference<AbstractC13063c>> interfaceC3810l0) {
        return new C3818n(interfaceC3810l0, this.f31154j.mo6457c());
    }

    /* renamed from: m */
    public C3823p m6397m(InterfaceC3810l0<C13065e> interfaceC3810l0) {
        return new C3823p(this.f31156l, this.f31157m, this.f31160p, interfaceC3810l0);
    }

    /* renamed from: n */
    public C3827q m6396n(InterfaceC3810l0<C13065e> interfaceC3810l0) {
        return new C3827q(this.f31156l, this.f31157m, this.f31160p, interfaceC3810l0);
    }

    /* renamed from: o */
    public C3834r m6395o(InterfaceC3810l0<C13065e> interfaceC3810l0) {
        return new C3834r(this.f31160p, this.f31169y, interfaceC3810l0);
    }

    /* renamed from: p */
    public C3836s m6394p(InterfaceC3810l0<C13065e> interfaceC3810l0) {
        return new C3836s(this.f31158n, this.f31160p, interfaceC3810l0);
    }

    /* renamed from: q */
    public C3839t m6393q(InterfaceC3810l0<C13065e> interfaceC3810l0) {
        return new C3839t(this.f31156l, this.f31157m, this.f31160p, this.f31161q, this.f31162r, interfaceC3810l0);
    }

    /* renamed from: r */
    public C3868z m6392r() {
        return new C3868z(this.f31154j.mo6454f(), this.f31155k, this.f31147c);
    }

    /* renamed from: s */
    public C3759a0 m6391s() {
        return new C3759a0(this.f31154j.mo6454f(), this.f31155k, this.f31145a);
    }

    /* renamed from: t */
    public C3762b0 m6390t() {
        return new C3762b0(this.f31154j.mo6454f(), this.f31155k, this.f31145a);
    }

    /* renamed from: u */
    public LocalExifThumbnailProducer m6389u() {
        return new LocalExifThumbnailProducer(this.f31154j.mo6453g(), this.f31155k, this.f31145a);
    }

    /* renamed from: v */
    public C3771d0 m6388v() {
        return new C3771d0(this.f31154j.mo6454f(), this.f31155k);
    }

    /* renamed from: w */
    public C3773e0 m6387w() {
        return new C3773e0(this.f31154j.mo6454f(), this.f31155k, this.f31146b);
    }

    /* renamed from: x */
    public C3775f0 m6386x() {
        return new C3775f0(this.f31154j.mo6454f(), this.f31145a);
    }

    /* renamed from: y */
    public InterfaceC3810l0<C13065e> m6385y(NetworkFetcher networkFetcher) {
        return new C3786h0(this.f31155k, this.f31148d, networkFetcher);
    }

    /* renamed from: z */
    public C3790i0 m6384z(InterfaceC3810l0<C13065e> interfaceC3810l0) {
        return new C3790i0(this.f31156l, this.f31160p, this.f31155k, this.f31148d, interfaceC3810l0);
    }
}