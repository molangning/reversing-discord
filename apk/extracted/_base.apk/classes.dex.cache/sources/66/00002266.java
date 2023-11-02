package com.facebook.imagepipeline.core;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import p094f3.InterfaceC6306b;
import p278p4.C11386e;
import p278p4.InterfaceC11392f;
import p278p4.InterfaceC11413s;
import p314r4.C12048a;
import p314r4.C12059j;
import p314r4.InterfaceC12053e;
import p346t4.InterfaceC12579c;
import p346t4.InterfaceC12581e;
import p380v4.AbstractC13063c;
import p394w2.C13382m;
import p455z2.C14083k;
import p455z2.InterfaceC14072a;
import p455z2.InterfaceC14078g;
import p455z2.InterfaceC14080h;

/* renamed from: com.facebook.imagepipeline.core.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3707a {

    /* renamed from: A */
    private final boolean f10404A;

    /* renamed from: B */
    private final boolean f10405B;

    /* renamed from: a */
    private final boolean f10406a;

    /* renamed from: b */
    private final boolean f10407b;

    /* renamed from: c */
    private final InterfaceC6306b f10408c;

    /* renamed from: d */
    private final boolean f10409d;

    /* renamed from: e */
    private final boolean f10410e;

    /* renamed from: f */
    private final int f10411f;

    /* renamed from: g */
    private final int f10412g;

    /* renamed from: h */
    private boolean f10413h;

    /* renamed from: i */
    private final int f10414i;

    /* renamed from: j */
    private final boolean f10415j;

    /* renamed from: k */
    private final boolean f10416k;

    /* renamed from: l */
    private final InterfaceC3711d f10417l;

    /* renamed from: m */
    private final Supplier<Boolean> f10418m;

    /* renamed from: n */
    private final boolean f10419n;

    /* renamed from: o */
    private final boolean f10420o;

    /* renamed from: p */
    private final int f10421p;

    /* renamed from: q */
    private final Supplier<Boolean> f10422q;

    /* renamed from: r */
    private final boolean f10423r;

    /* renamed from: s */
    private final long f10424s;

    /* renamed from: t */
    private boolean f10425t;

    /* renamed from: u */
    private boolean f10426u;

    /* renamed from: v */
    private boolean f10427v;

    /* renamed from: w */
    private final boolean f10428w;

    /* renamed from: x */
    private final boolean f10429x;

    /* renamed from: y */
    private final boolean f10430y;

    /* renamed from: z */
    private final int f10431z;

    /* renamed from: com.facebook.imagepipeline.core.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C3709b {

        /* renamed from: a */
        private final ImagePipelineConfig.Builder f10435a;

        /* renamed from: d */
        private InterfaceC6306b f10438d;

        /* renamed from: m */
        private InterfaceC3711d f10447m;

        /* renamed from: n */
        public Supplier<Boolean> f10448n;

        /* renamed from: o */
        public boolean f10449o;

        /* renamed from: p */
        public boolean f10450p;

        /* renamed from: q */
        public int f10451q;

        /* renamed from: s */
        public boolean f10453s;

        /* renamed from: u */
        private boolean f10455u;

        /* renamed from: v */
        public boolean f10456v;

        /* renamed from: b */
        private boolean f10436b = false;

        /* renamed from: c */
        private boolean f10437c = false;

        /* renamed from: e */
        private boolean f10439e = false;

        /* renamed from: f */
        private boolean f10440f = false;

        /* renamed from: g */
        private int f10441g = 0;

        /* renamed from: h */
        private int f10442h = 0;

        /* renamed from: i */
        public boolean f10443i = false;

        /* renamed from: j */
        private int f10444j = RecyclerView.ItemAnimator.FLAG_MOVED;

        /* renamed from: k */
        private boolean f10445k = false;

        /* renamed from: l */
        private boolean f10446l = false;

        /* renamed from: r */
        public Supplier<Boolean> f10452r = C13382m.m2669a(Boolean.FALSE);

        /* renamed from: t */
        public long f10454t = 0;

        /* renamed from: w */
        public boolean f10457w = true;

        /* renamed from: x */
        public boolean f10458x = true;

        /* renamed from: y */
        private boolean f10459y = false;

        /* renamed from: z */
        private boolean f10460z = false;

        /* renamed from: A */
        private int f10432A = 20;

        /* renamed from: B */
        private boolean f10433B = false;

        /* renamed from: C */
        private boolean f10434C = false;

        public C3709b(ImagePipelineConfig.Builder builder) {
            this.f10435a = builder;
        }

        /* renamed from: b */
        static /* synthetic */ InterfaceC6306b.InterfaceC6307a m31074b(C3709b c3709b) {
            c3709b.getClass();
            return null;
        }

        /* renamed from: s */
        public C3707a m31057s() {
            return new C3707a(this);
        }

        /* renamed from: t */
        public ImagePipelineConfig.Builder m31056t(boolean z) {
            this.f10450p = z;
            return this.f10435a;
        }
    }

    /* renamed from: com.facebook.imagepipeline.core.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C3710c implements InterfaceC3711d {
        @Override // com.facebook.imagepipeline.core.C3707a.InterfaceC3711d
        /* renamed from: a */
        public C12059j mo31055a(Context context, InterfaceC14072a interfaceC14072a, InterfaceC12579c interfaceC12579c, InterfaceC12581e interfaceC12581e, boolean z, boolean z2, boolean z3, InterfaceC12053e interfaceC12053e, InterfaceC14080h interfaceC14080h, C14083k c14083k, InterfaceC11413s<CacheKey, AbstractC13063c> interfaceC11413s, InterfaceC11413s<CacheKey, InterfaceC14078g> interfaceC11413s2, C11386e c11386e, C11386e c11386e2, InterfaceC11392f interfaceC11392f, PlatformBitmapFactory platformBitmapFactory, int i, int i2, boolean z4, int i3, C12048a c12048a, boolean z5, int i4) {
            return new C12059j(context, interfaceC14072a, interfaceC12579c, interfaceC12581e, z, z2, z3, interfaceC12053e, interfaceC14080h, interfaceC11413s, interfaceC11413s2, c11386e, c11386e2, interfaceC11392f, platformBitmapFactory, i, i2, z4, i3, c12048a, z5, i4);
        }
    }

    /* renamed from: com.facebook.imagepipeline.core.a$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC3711d {
        /* renamed from: a */
        C12059j mo31055a(Context context, InterfaceC14072a interfaceC14072a, InterfaceC12579c interfaceC12579c, InterfaceC12581e interfaceC12581e, boolean z, boolean z2, boolean z3, InterfaceC12053e interfaceC12053e, InterfaceC14080h interfaceC14080h, C14083k c14083k, InterfaceC11413s<CacheKey, AbstractC13063c> interfaceC11413s, InterfaceC11413s<CacheKey, InterfaceC14078g> interfaceC11413s2, C11386e c11386e, C11386e c11386e2, InterfaceC11392f interfaceC11392f, PlatformBitmapFactory platformBitmapFactory, int i, int i2, boolean z4, int i3, C12048a c12048a, boolean z5, int i4);
    }

    /* renamed from: A */
    public boolean m31104A() {
        return this.f10420o;
    }

    /* renamed from: B */
    public boolean m31103B() {
        return this.f10425t;
    }

    /* renamed from: C */
    public boolean m31102C() {
        return this.f10404A;
    }

    /* renamed from: a */
    public boolean m31101a() {
        return this.f10405B;
    }

    /* renamed from: b */
    public int m31100b() {
        return this.f10421p;
    }

    /* renamed from: c */
    public boolean m31099c() {
        return this.f10413h;
    }

    /* renamed from: d */
    public int m31098d() {
        return this.f10412g;
    }

    /* renamed from: e */
    public int m31097e() {
        return this.f10411f;
    }

    /* renamed from: f */
    public int m31096f() {
        return this.f10414i;
    }

    /* renamed from: g */
    public long m31095g() {
        return this.f10424s;
    }

    /* renamed from: h */
    public InterfaceC3711d m31094h() {
        return this.f10417l;
    }

    /* renamed from: i */
    public Supplier<Boolean> m31093i() {
        return this.f10422q;
    }

    /* renamed from: j */
    public int m31092j() {
        return this.f10431z;
    }

    /* renamed from: k */
    public boolean m31091k() {
        return this.f10410e;
    }

    /* renamed from: l */
    public boolean m31090l() {
        return this.f10409d;
    }

    /* renamed from: m */
    public InterfaceC6306b m31089m() {
        return this.f10408c;
    }

    /* renamed from: n */
    public InterfaceC6306b.InterfaceC6307a m31088n() {
        return null;
    }

    /* renamed from: o */
    public boolean m31087o() {
        return this.f10407b;
    }

    /* renamed from: p */
    public boolean m31086p() {
        return this.f10430y;
    }

    /* renamed from: q */
    public boolean m31085q() {
        return this.f10427v;
    }

    /* renamed from: r */
    public boolean m31084r() {
        return this.f10429x;
    }

    /* renamed from: s */
    public boolean m31083s() {
        return this.f10428w;
    }

    /* renamed from: t */
    public boolean m31082t() {
        return this.f10423r;
    }

    /* renamed from: u */
    public boolean m31081u() {
        return this.f10419n;
    }

    /* renamed from: v */
    public Supplier<Boolean> m31080v() {
        return this.f10418m;
    }

    /* renamed from: w */
    public boolean m31079w() {
        return this.f10415j;
    }

    /* renamed from: x */
    public boolean m31078x() {
        return this.f10416k;
    }

    /* renamed from: y */
    public boolean m31077y() {
        return this.f10406a;
    }

    /* renamed from: z */
    public boolean m31076z() {
        return this.f10426u;
    }

    private C3707a(C3709b c3709b) {
        this.f10406a = c3709b.f10436b;
        C3709b.m31074b(c3709b);
        this.f10407b = c3709b.f10437c;
        this.f10408c = c3709b.f10438d;
        this.f10409d = c3709b.f10439e;
        this.f10410e = c3709b.f10440f;
        this.f10411f = c3709b.f10441g;
        this.f10412g = c3709b.f10442h;
        this.f10413h = c3709b.f10443i;
        this.f10414i = c3709b.f10444j;
        this.f10415j = c3709b.f10445k;
        this.f10416k = c3709b.f10446l;
        if (c3709b.f10447m == null) {
            this.f10417l = new C3710c();
        } else {
            this.f10417l = c3709b.f10447m;
        }
        this.f10418m = c3709b.f10448n;
        this.f10419n = c3709b.f10449o;
        this.f10420o = c3709b.f10450p;
        this.f10421p = c3709b.f10451q;
        this.f10422q = c3709b.f10452r;
        this.f10423r = c3709b.f10453s;
        this.f10424s = c3709b.f10454t;
        this.f10425t = c3709b.f10455u;
        this.f10426u = c3709b.f10456v;
        this.f10427v = c3709b.f10457w;
        this.f10428w = c3709b.f10458x;
        this.f10429x = c3709b.f10459y;
        this.f10430y = c3709b.f10460z;
        this.f10431z = c3709b.f10432A;
        this.f10404A = c3709b.f10433B;
        this.f10405B = c3709b.f10434C;
    }
}