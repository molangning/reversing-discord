package com.facebook.imagepipeline.core;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.disk.DiskCacheConfig;
import com.facebook.common.internal.Supplier;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.cache.MemoryCacheParams;
import com.facebook.imagepipeline.core.C3707a;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.producers.C3847v;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p006a5.C0025b;
import p025b5.InterfaceC2125d;
import p094f3.C6308c;
import p094f3.InterfaceC6305a;
import p094f3.InterfaceC6306b;
import p257o4.C10984c;
import p278p4.C11384c;
import p278p4.C11393g;
import p278p4.C11399j;
import p278p4.C11400k;
import p278p4.C11401l;
import p278p4.C11417v;
import p278p4.InterfaceC11382a;
import p278p4.InterfaceC11392f;
import p278p4.InterfaceC11396i;
import p278p4.InterfaceC11406o;
import p278p4.InterfaceC11413s;
import p314r4.C12050b;
import p314r4.C12052d;
import p314r4.InterfaceC12053e;
import p314r4.InterfaceC12054f;
import p314r4.InterfaceC12055g;
import p332s2.InterfaceC12393a;
import p334s4.C12397b;
import p334s4.InterfaceC12396a;
import p346t4.C12580d;
import p346t4.C12583g;
import p346t4.InterfaceC12579c;
import p346t4.InterfaceC12581e;
import p359u2.InterfaceExecutorServiceC12825f;
import p380v4.AbstractC13063c;
import p394w2.C13379j;
import p416x4.InterfaceC13689d;
import p437y4.C13901x;
import p437y4.C13904y;
import p455z2.C14075d;
import p455z2.InterfaceC14074c;
import p455z2.InterfaceC14078g;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ImagePipelineConfig implements InterfaceC12055g {

    /* renamed from: I */
    private static C3706b f10333I = new C3706b(null);

    /* renamed from: A */
    private final DiskCacheConfig f10334A;

    /* renamed from: B */
    private final C3707a f10335B;

    /* renamed from: C */
    private final boolean f10336C;

    /* renamed from: D */
    private final InterfaceC12396a f10337D;

    /* renamed from: E */
    private final InterfaceC11413s<CacheKey, AbstractC13063c> f10338E;

    /* renamed from: F */
    private final InterfaceC11413s<CacheKey, InterfaceC14078g> f10339F;

    /* renamed from: G */
    private final InterfaceExecutorServiceC12825f f10340G;

    /* renamed from: H */
    private final InterfaceC11382a f10341H;

    /* renamed from: a */
    private final Bitmap.Config f10342a;

    /* renamed from: b */
    private final Supplier<MemoryCacheParams> f10343b;

    /* renamed from: c */
    private final InterfaceC11413s.InterfaceC11414a f10344c;

    /* renamed from: d */
    private final InterfaceC11396i.InterfaceC11398b<CacheKey> f10345d;

    /* renamed from: e */
    private final InterfaceC11392f f10346e;

    /* renamed from: f */
    private final Context f10347f;

    /* renamed from: g */
    private final boolean f10348g;

    /* renamed from: h */
    private final InterfaceC12054f f10349h;

    /* renamed from: i */
    private final Supplier<MemoryCacheParams> f10350i;

    /* renamed from: j */
    private final InterfaceC12053e f10351j;

    /* renamed from: k */
    private final InterfaceC11406o f10352k;

    /* renamed from: l */
    private final InterfaceC12579c f10353l;

    /* renamed from: m */
    private final InterfaceC2125d f10354m;

    /* renamed from: n */
    private final Integer f10355n;

    /* renamed from: o */
    private final Supplier<Boolean> f10356o;

    /* renamed from: p */
    private final DiskCacheConfig f10357p;

    /* renamed from: q */
    private final InterfaceC14074c f10358q;

    /* renamed from: r */
    private final int f10359r;

    /* renamed from: s */
    private final NetworkFetcher f10360s;

    /* renamed from: t */
    private final int f10361t;

    /* renamed from: u */
    private final PlatformBitmapFactory f10362u;

    /* renamed from: v */
    private final C13904y f10363v;

    /* renamed from: w */
    private final InterfaceC12581e f10364w;

    /* renamed from: x */
    private final Set<RequestListener> f10365x;

    /* renamed from: y */
    private final Set<InterfaceC13689d> f10366y;

    /* renamed from: z */
    private final boolean f10367z;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class Builder {

        /* renamed from: A */
        private int f10368A;

        /* renamed from: B */
        private final C3707a.C3709b f10369B;

        /* renamed from: C */
        private boolean f10370C;

        /* renamed from: D */
        private InterfaceC12396a f10371D;

        /* renamed from: E */
        private InterfaceC11413s<CacheKey, AbstractC13063c> f10372E;

        /* renamed from: F */
        private InterfaceC11413s<CacheKey, InterfaceC14078g> f10373F;

        /* renamed from: G */
        private InterfaceExecutorServiceC12825f f10374G;

        /* renamed from: H */
        private InterfaceC11382a f10375H;

        /* renamed from: a */
        private Bitmap.Config f10376a;

        /* renamed from: b */
        private Supplier<MemoryCacheParams> f10377b;

        /* renamed from: c */
        private InterfaceC11396i.InterfaceC11398b<CacheKey> f10378c;

        /* renamed from: d */
        private InterfaceC11413s.InterfaceC11414a f10379d;

        /* renamed from: e */
        private InterfaceC11392f f10380e;

        /* renamed from: f */
        private final Context f10381f;

        /* renamed from: g */
        private boolean f10382g;

        /* renamed from: h */
        private Supplier<MemoryCacheParams> f10383h;

        /* renamed from: i */
        private InterfaceC12053e f10384i;

        /* renamed from: j */
        private InterfaceC11406o f10385j;

        /* renamed from: k */
        private InterfaceC12579c f10386k;

        /* renamed from: l */
        private InterfaceC2125d f10387l;

        /* renamed from: m */
        private Integer f10388m;

        /* renamed from: n */
        private Supplier<Boolean> f10389n;

        /* renamed from: o */
        private DiskCacheConfig f10390o;

        /* renamed from: p */
        private InterfaceC14074c f10391p;

        /* renamed from: q */
        private Integer f10392q;

        /* renamed from: r */
        private NetworkFetcher f10393r;

        /* renamed from: s */
        private PlatformBitmapFactory f10394s;

        /* renamed from: t */
        private C13904y f10395t;

        /* renamed from: u */
        private InterfaceC12581e f10396u;

        /* renamed from: v */
        private Set<RequestListener> f10397v;

        /* renamed from: w */
        private Set<InterfaceC13689d> f10398w;

        /* renamed from: x */
        private boolean f10399x;

        /* renamed from: y */
        private DiskCacheConfig f10400y;

        /* renamed from: z */
        private InterfaceC12054f f10401z;

        /* synthetic */ Builder(Context context, C3705a c3705a) {
            this(context);
        }

        /* renamed from: s */
        static /* synthetic */ C12580d m31114s(Builder builder) {
            builder.getClass();
            return null;
        }

        /* renamed from: v */
        static /* synthetic */ InterfaceC12393a m31111v(Builder builder) {
            builder.getClass();
            return null;
        }

        /* renamed from: K */
        public ImagePipelineConfig m31141K() {
            return new ImagePipelineConfig(this, null);
        }

        /* renamed from: L */
        public C3707a.C3709b m31140L() {
            return this.f10369B;
        }

        /* renamed from: M */
        public Builder m31139M(Supplier<MemoryCacheParams> supplier) {
            this.f10377b = (Supplier) C13379j.m2677g(supplier);
            return this;
        }

        /* renamed from: N */
        public Builder m31138N(boolean z) {
            this.f10382g = z;
            return this;
        }

        /* renamed from: O */
        public Builder m31137O(DiskCacheConfig diskCacheConfig) {
            this.f10390o = diskCacheConfig;
            return this;
        }

        /* renamed from: P */
        public Builder m31136P(NetworkFetcher networkFetcher) {
            this.f10393r = networkFetcher;
            return this;
        }

        /* renamed from: Q */
        public Builder m31135Q(C13904y c13904y) {
            this.f10395t = c13904y;
            return this;
        }

        /* renamed from: R */
        public Builder m31134R(Set<RequestListener> set) {
            this.f10397v = set;
            return this;
        }

        /* renamed from: S */
        public Builder m31133S(DiskCacheConfig diskCacheConfig) {
            this.f10400y = diskCacheConfig;
            return this;
        }

        private Builder(Context context) {
            this.f10382g = false;
            this.f10388m = null;
            this.f10392q = null;
            this.f10399x = true;
            this.f10368A = -1;
            this.f10369B = new C3707a.C3709b(this);
            this.f10370C = true;
            this.f10371D = new C12397b();
            this.f10381f = (Context) C13379j.m2677g(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.core.ImagePipelineConfig$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C3705a implements Supplier<Boolean> {
        C3705a() {
        }

        @Override // com.facebook.common.internal.Supplier
        /* renamed from: a */
        public Boolean get() {
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.facebook.imagepipeline.core.ImagePipelineConfig$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C3706b {

        /* renamed from: a */
        private boolean f10403a;

        /* synthetic */ C3706b(C3705a c3705a) {
            this();
        }

        /* renamed from: a */
        public boolean m31105a() {
            return this.f10403a;
        }

        private C3706b() {
            this.f10403a = false;
        }
    }

    /* synthetic */ ImagePipelineConfig(Builder builder, C3705a c3705a) {
        this(builder);
    }

    /* renamed from: F */
    public static C3706b m31157F() {
        return f10333I;
    }

    /* renamed from: G */
    private static DiskCacheConfig m31156G(Context context) {
        try {
            if (C0025b.m41375d()) {
                C0025b.m41378a("DiskCacheConfig.getDefaultMainDiskCacheConfig");
            }
            return DiskCacheConfig.m31750m(context).m31735n();
        } finally {
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
        }
    }

    /* renamed from: H */
    private static InterfaceC2125d m31155H(Builder builder) {
        if (builder.f10387l != null && builder.f10388m != null) {
            throw new IllegalStateException("You can't define a custom ImageTranscoderFactory and provide an ImageTranscoderType");
        }
        if (builder.f10387l != null) {
            return builder.f10387l;
        }
        return null;
    }

    /* renamed from: I */
    private static int m31154I(Builder builder, C3707a c3707a) {
        if (builder.f10392q != null) {
            return builder.f10392q.intValue();
        }
        if (c3707a.m31095g() == 2 && Build.VERSION.SDK_INT >= 27) {
            return 2;
        }
        if (c3707a.m31095g() == 1) {
            return 1;
        }
        c3707a.m31095g();
        return 0;
    }

    /* renamed from: J */
    public static Builder m31153J(Context context) {
        return new Builder(context, null);
    }

    /* renamed from: K */
    private static void m31152K(InterfaceC6306b interfaceC6306b, C3707a c3707a, InterfaceC6305a interfaceC6305a) {
        C6308c.f17813d = interfaceC6306b;
        c3707a.m31088n();
        if (interfaceC6305a != null) {
            interfaceC6306b.mo23010b(interfaceC6305a);
        }
    }

    @Override // p314r4.InterfaceC12055g
    /* renamed from: A */
    public InterfaceC11406o mo6451A() {
        return this.f10352k;
    }

    @Override // p314r4.InterfaceC12055g
    /* renamed from: B */
    public InterfaceC14074c mo6450B() {
        return this.f10358q;
    }

    @Override // p314r4.InterfaceC12055g
    /* renamed from: C */
    public InterfaceC12393a mo6449C() {
        return null;
    }

    @Override // p314r4.InterfaceC12055g
    /* renamed from: D */
    public C3707a mo6448D() {
        return this.f10335B;
    }

    @Override // p314r4.InterfaceC12055g
    /* renamed from: E */
    public InterfaceC12053e mo6447E() {
        return this.f10351j;
    }

    @Override // p314r4.InterfaceC12055g
    /* renamed from: a */
    public Set<InterfaceC13689d> mo6446a() {
        return Collections.unmodifiableSet(this.f10366y);
    }

    @Override // p314r4.InterfaceC12055g
    /* renamed from: b */
    public Supplier<Boolean> mo6445b() {
        return this.f10356o;
    }

    @Override // p314r4.InterfaceC12055g
    /* renamed from: c */
    public NetworkFetcher mo6444c() {
        return this.f10360s;
    }

    @Override // p314r4.InterfaceC12055g
    /* renamed from: d */
    public InterfaceC11413s<CacheKey, InterfaceC14078g> mo6443d() {
        return this.f10339F;
    }

    @Override // p314r4.InterfaceC12055g
    /* renamed from: e */
    public DiskCacheConfig mo6442e() {
        return this.f10357p;
    }

    @Override // p314r4.InterfaceC12055g
    /* renamed from: f */
    public Set<RequestListener> mo6441f() {
        return Collections.unmodifiableSet(this.f10365x);
    }

    @Override // p314r4.InterfaceC12055g
    /* renamed from: g */
    public InterfaceC11413s.InterfaceC11414a mo6440g() {
        return this.f10344c;
    }

    @Override // p314r4.InterfaceC12055g
    public Context getContext() {
        return this.f10347f;
    }

    @Override // p314r4.InterfaceC12055g
    /* renamed from: h */
    public InterfaceC12581e mo6439h() {
        return this.f10364w;
    }

    @Override // p314r4.InterfaceC12055g
    /* renamed from: i */
    public DiskCacheConfig mo6438i() {
        return this.f10334A;
    }

    @Override // p314r4.InterfaceC12055g
    /* renamed from: j */
    public InterfaceC11396i.InterfaceC11398b<CacheKey> mo6437j() {
        return this.f10345d;
    }

    @Override // p314r4.InterfaceC12055g
    /* renamed from: k */
    public boolean mo6436k() {
        return this.f10348g;
    }

    @Override // p314r4.InterfaceC12055g
    /* renamed from: l */
    public InterfaceExecutorServiceC12825f mo6435l() {
        return this.f10340G;
    }

    @Override // p314r4.InterfaceC12055g
    /* renamed from: m */
    public Integer mo6434m() {
        return this.f10355n;
    }

    @Override // p314r4.InterfaceC12055g
    /* renamed from: n */
    public InterfaceC2125d mo6433n() {
        return this.f10354m;
    }

    @Override // p314r4.InterfaceC12055g
    /* renamed from: o */
    public C12580d mo6432o() {
        return null;
    }

    @Override // p314r4.InterfaceC12055g
    /* renamed from: p */
    public boolean mo6431p() {
        return this.f10336C;
    }

    @Override // p314r4.InterfaceC12055g
    /* renamed from: q */
    public Supplier<MemoryCacheParams> mo6430q() {
        return this.f10343b;
    }

    @Override // p314r4.InterfaceC12055g
    /* renamed from: r */
    public InterfaceC12579c mo6429r() {
        return this.f10353l;
    }

    @Override // p314r4.InterfaceC12055g
    /* renamed from: s */
    public Supplier<MemoryCacheParams> mo6428s() {
        return this.f10350i;
    }

    @Override // p314r4.InterfaceC12055g
    /* renamed from: t */
    public C13904y mo6427t() {
        return this.f10363v;
    }

    @Override // p314r4.InterfaceC12055g
    /* renamed from: u */
    public int mo6426u() {
        return this.f10359r;
    }

    @Override // p314r4.InterfaceC12055g
    /* renamed from: v */
    public InterfaceC12054f mo6425v() {
        return this.f10349h;
    }

    @Override // p314r4.InterfaceC12055g
    /* renamed from: w */
    public InterfaceC12396a mo6424w() {
        return this.f10337D;
    }

    @Override // p314r4.InterfaceC12055g
    /* renamed from: x */
    public InterfaceC11382a mo6423x() {
        return this.f10341H;
    }

    @Override // p314r4.InterfaceC12055g
    /* renamed from: y */
    public InterfaceC11392f mo6422y() {
        return this.f10346e;
    }

    @Override // p314r4.InterfaceC12055g
    /* renamed from: z */
    public boolean mo6421z() {
        return this.f10367z;
    }

    private ImagePipelineConfig(Builder builder) {
        Supplier<MemoryCacheParams> supplier;
        InterfaceC11392f interfaceC11392f;
        InterfaceC11406o interfaceC11406o;
        DiskCacheConfig diskCacheConfig;
        InterfaceC14074c interfaceC14074c;
        C13904y c13904y;
        InterfaceC6306b m23001i;
        if (C0025b.m41375d()) {
            C0025b.m41378a("ImagePipelineConfig()");
        }
        C3707a m31057s = builder.f10369B.m31057s();
        this.f10335B = m31057s;
        if (builder.f10377b == null) {
            supplier = new C11399j((ActivityManager) C13379j.m2677g(builder.f10381f.getSystemService("activity")));
        } else {
            supplier = builder.f10377b;
        }
        this.f10343b = supplier;
        this.f10344c = builder.f10379d == null ? new C11384c() : builder.f10379d;
        this.f10345d = builder.f10378c;
        this.f10342a = builder.f10376a == null ? Bitmap.Config.ARGB_8888 : builder.f10376a;
        if (builder.f10380e == null) {
            interfaceC11392f = C11400k.m8147f();
        } else {
            interfaceC11392f = builder.f10380e;
        }
        this.f10346e = interfaceC11392f;
        this.f10347f = (Context) C13379j.m2677g(builder.f10381f);
        this.f10349h = builder.f10401z == null ? new C12050b(new C12052d()) : builder.f10401z;
        this.f10348g = builder.f10382g;
        this.f10350i = builder.f10383h == null ? new C11401l() : builder.f10383h;
        if (builder.f10385j == null) {
            interfaceC11406o = C11417v.m8090o();
        } else {
            interfaceC11406o = builder.f10385j;
        }
        this.f10352k = interfaceC11406o;
        this.f10353l = builder.f10386k;
        this.f10354m = m31155H(builder);
        this.f10355n = builder.f10388m;
        this.f10356o = builder.f10389n == null ? new C3705a() : builder.f10389n;
        if (builder.f10390o == null) {
            diskCacheConfig = m31156G(builder.f10381f);
        } else {
            diskCacheConfig = builder.f10390o;
        }
        this.f10357p = diskCacheConfig;
        if (builder.f10391p == null) {
            interfaceC14074c = C14075d.m728b();
        } else {
            interfaceC14074c = builder.f10391p;
        }
        this.f10358q = interfaceC14074c;
        this.f10359r = m31154I(builder, m31057s);
        int i = builder.f10368A < 0 ? 30000 : builder.f10368A;
        this.f10361t = i;
        if (C0025b.m41375d()) {
            C0025b.m41378a("ImagePipelineConfig->mNetworkFetcher");
        }
        this.f10360s = builder.f10393r == null ? new C3847v(i) : builder.f10393r;
        if (C0025b.m41375d()) {
            C0025b.m41377b();
        }
        this.f10362u = builder.f10394s;
        if (builder.f10395t == null) {
            c13904y = new C13904y(C13901x.m1251n().m1238m());
        } else {
            c13904y = builder.f10395t;
        }
        this.f10363v = c13904y;
        this.f10364w = builder.f10396u == null ? new C12583g() : builder.f10396u;
        this.f10365x = builder.f10397v == null ? new HashSet<>() : builder.f10397v;
        this.f10366y = builder.f10398w == null ? new HashSet<>() : builder.f10398w;
        this.f10367z = builder.f10399x;
        this.f10334A = builder.f10400y != null ? builder.f10400y : diskCacheConfig;
        Builder.m31114s(builder);
        this.f10351j = builder.f10384i == null ? new DefaultExecutorSupplier(c13904y.m1232e()) : builder.f10384i;
        this.f10336C = builder.f10370C;
        Builder.m31111v(builder);
        this.f10337D = builder.f10371D;
        this.f10338E = builder.f10372E;
        this.f10341H = builder.f10375H == null ? new C11393g() : builder.f10375H;
        this.f10339F = builder.f10373F;
        this.f10340G = builder.f10374G;
        InterfaceC6306b m31089m = m31057s.m31089m();
        if (m31089m != null) {
            m31152K(m31089m, m31057s, new C10984c(mo6427t()));
        } else if (m31057s.m31077y() && C6308c.f17810a && (m23001i = C6308c.m23001i()) != null) {
            m31152K(m23001i, m31057s, new C10984c(mo6427t()));
        }
        if (C0025b.m41375d()) {
            C0025b.m41377b();
        }
    }
}
