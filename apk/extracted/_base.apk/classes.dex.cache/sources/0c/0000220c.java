package com.facebook.fresco.animation.factory;

import android.content.Context;
import android.graphics.Rect;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import java.util.concurrent.ExecutorService;
import p057d4.C5742a;
import p191k4.C9059e;
import p191k4.InterfaceC9053a;
import p209l4.C10042e;
import p209l4.InterfaceC10038a;
import p209l4.InterfaceC10041d;
import p226m4.C10251a;
import p226m4.InterfaceC10252b;
import p241n4.C10500a;
import p278p4.InterfaceC11396i;
import p314r4.InterfaceC12053e;
import p346t4.InterfaceC12579c;
import p359u2.C12822c;
import p359u2.C12827h;
import p359u2.InterfaceExecutorServiceC12825f;
import p361u4.InterfaceC12830a;
import p380v4.AbstractC13063c;
import p380v4.C13065e;
import p380v4.InterfaceC13069i;
import p394w2.C13382m;
import p394w2.InterfaceC13370d;

@InterfaceC13370d
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class AnimatedFactoryV2Impl implements InterfaceC10038a {

    /* renamed from: a */
    private final PlatformBitmapFactory f10016a;

    /* renamed from: b */
    private final InterfaceC12053e f10017b;

    /* renamed from: c */
    private final InterfaceC11396i<CacheKey, AbstractC13063c> f10018c;

    /* renamed from: d */
    private final boolean f10019d;

    /* renamed from: e */
    private InterfaceC10041d f10020e;

    /* renamed from: f */
    private InterfaceC10252b f10021f;

    /* renamed from: g */
    private C10500a f10022g;

    /* renamed from: h */
    private InterfaceC12830a f10023h;

    /* renamed from: i */
    private InterfaceExecutorServiceC12825f f10024i;

    /* renamed from: com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C3638a implements InterfaceC12579c {
        C3638a() {
            AnimatedFactoryV2Impl.this = r1;
        }

        @Override // p346t4.InterfaceC12579c
        /* renamed from: a */
        public AbstractC13063c mo4767a(C13065e c13065e, int i, InterfaceC13069i interfaceC13069i, ImageDecodeOptions imageDecodeOptions) {
            return AnimatedFactoryV2Impl.this.m31339k().mo12494b(c13065e, imageDecodeOptions, imageDecodeOptions.f10292h);
        }
    }

    /* renamed from: com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C3639b implements InterfaceC12579c {
        C3639b() {
            AnimatedFactoryV2Impl.this = r1;
        }

        @Override // p346t4.InterfaceC12579c
        /* renamed from: a */
        public AbstractC13063c mo4767a(C13065e c13065e, int i, InterfaceC13069i interfaceC13069i, ImageDecodeOptions imageDecodeOptions) {
            return AnimatedFactoryV2Impl.this.m31339k().mo12495a(c13065e, imageDecodeOptions, imageDecodeOptions.f10292h);
        }
    }

    /* renamed from: com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C3640c implements Supplier<Integer> {
        C3640c() {
            AnimatedFactoryV2Impl.this = r1;
        }

        @Override // com.facebook.common.internal.Supplier
        /* renamed from: a */
        public Integer get() {
            return 2;
        }
    }

    /* renamed from: com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C3641d implements Supplier<Integer> {
        C3641d() {
            AnimatedFactoryV2Impl.this = r1;
        }

        @Override // com.facebook.common.internal.Supplier
        /* renamed from: a */
        public Integer get() {
            return 3;
        }
    }

    /* renamed from: com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C3642e implements InterfaceC10252b {
        C3642e() {
            AnimatedFactoryV2Impl.this = r1;
        }

        @Override // p226m4.InterfaceC10252b
        /* renamed from: a */
        public InterfaceC9053a mo12014a(C9059e c9059e, Rect rect) {
            return new C10251a(AnimatedFactoryV2Impl.this.m31340j(), c9059e, rect, AnimatedFactoryV2Impl.this.f10019d);
        }
    }

    /* renamed from: com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C3643f implements InterfaceC10252b {
        C3643f() {
            AnimatedFactoryV2Impl.this = r1;
        }

        @Override // p226m4.InterfaceC10252b
        /* renamed from: a */
        public InterfaceC9053a mo12014a(C9059e c9059e, Rect rect) {
            return new C10251a(AnimatedFactoryV2Impl.this.m31340j(), c9059e, rect, AnimatedFactoryV2Impl.this.f10019d);
        }
    }

    @InterfaceC13370d
    public AnimatedFactoryV2Impl(PlatformBitmapFactory platformBitmapFactory, InterfaceC12053e interfaceC12053e, InterfaceC11396i<CacheKey, AbstractC13063c> interfaceC11396i, boolean z, InterfaceExecutorServiceC12825f interfaceExecutorServiceC12825f) {
        this.f10016a = platformBitmapFactory;
        this.f10017b = interfaceC12053e;
        this.f10018c = interfaceC11396i;
        this.f10019d = z;
        this.f10024i = interfaceExecutorServiceC12825f;
    }

    /* renamed from: g */
    private InterfaceC10041d m31343g() {
        return new C10042e(new C3643f(), this.f10016a);
    }

    /* renamed from: h */
    private C5742a m31342h() {
        C3640c c3640c = new C3640c();
        ExecutorService executorService = this.f10024i;
        if (executorService == null) {
            executorService = new C12822c(this.f10017b.mo6456d());
        }
        C3641d c3641d = new C3641d();
        Supplier<Boolean> supplier = C13382m.f34465b;
        return new C5742a(m31341i(), C12827h.m3853g(), executorService, RealtimeSinceBootClock.get(), this.f10016a, this.f10018c, c3640c, c3641d, supplier);
    }

    /* renamed from: i */
    private InterfaceC10252b m31341i() {
        if (this.f10021f == null) {
            this.f10021f = new C3642e();
        }
        return this.f10021f;
    }

    /* renamed from: j */
    public C10500a m31340j() {
        if (this.f10022g == null) {
            this.f10022g = new C10500a();
        }
        return this.f10022g;
    }

    /* renamed from: k */
    public InterfaceC10041d m31339k() {
        if (this.f10020e == null) {
            this.f10020e = m31343g();
        }
        return this.f10020e;
    }

    @Override // p209l4.InterfaceC10038a
    /* renamed from: a */
    public InterfaceC12830a mo12501a(Context context) {
        if (this.f10023h == null) {
            this.f10023h = m31342h();
        }
        return this.f10023h;
    }

    @Override // p209l4.InterfaceC10038a
    /* renamed from: b */
    public InterfaceC12579c mo12500b() {
        return new C3639b();
    }

    @Override // p209l4.InterfaceC10038a
    /* renamed from: c */
    public InterfaceC12579c mo12499c() {
        return new C3638a();
    }
}