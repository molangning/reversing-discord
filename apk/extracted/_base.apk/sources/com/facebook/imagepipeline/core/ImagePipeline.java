package com.facebook.imagepipeline.core;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.C3575c;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.datasource.C3717d;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.producers.C3835r0;
import com.facebook.imagepipeline.producers.C3854x;
import com.facebook.imagepipeline.producers.InterfaceC3810l0;
import com.facebook.imagepipeline.producers.InterfaceC3851v0;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import p278p4.C11386e;
import p278p4.InterfaceC11392f;
import p278p4.InterfaceC11413s;
import p314r4.C12060k;
import p314r4.InterfaceC12055g;
import p332s2.InterfaceC12393a;
import p380v4.AbstractC13063c;
import p394w2.InterfaceC13380k;
import p416x4.C13687b;
import p416x4.C13688c;
import p416x4.InterfaceC13689d;
import p455z2.InterfaceC14078g;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ImagePipeline {

    /* renamed from: o */
    private static final CancellationException f10314o = new CancellationException("Prefetching is not enabled");

    /* renamed from: a */
    private final C12060k f10315a;

    /* renamed from: b */
    private final RequestListener f10316b;

    /* renamed from: c */
    private final InterfaceC13689d f10317c;

    /* renamed from: d */
    private final Supplier<Boolean> f10318d;

    /* renamed from: e */
    private final InterfaceC11413s<CacheKey, AbstractC13063c> f10319e;

    /* renamed from: f */
    private final InterfaceC11413s<CacheKey, InterfaceC14078g> f10320f;

    /* renamed from: g */
    private final C11386e f10321g;

    /* renamed from: h */
    private final C11386e f10322h;

    /* renamed from: i */
    private final InterfaceC11392f f10323i;

    /* renamed from: j */
    private final InterfaceC3851v0 f10324j;

    /* renamed from: k */
    private final Supplier<Boolean> f10325k;

    /* renamed from: l */
    private AtomicLong f10326l = new AtomicLong();

    /* renamed from: m */
    private final Supplier<Boolean> f10327m;

    /* renamed from: n */
    private final InterfaceC12055g f10328n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.core.ImagePipeline$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C3702a implements InterfaceC13380k<CacheKey> {
        C3702a() {
        }

        @Override // p394w2.InterfaceC13380k
        /* renamed from: a */
        public boolean apply(CacheKey cacheKey) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.core.ImagePipeline$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C3703b implements InterfaceC13380k<CacheKey> {

        /* renamed from: a */
        final /* synthetic */ Uri f10330a;

        C3703b(Uri uri) {
            this.f10330a = uri;
        }

        @Override // p394w2.InterfaceC13380k
        /* renamed from: a */
        public boolean apply(CacheKey cacheKey) {
            return cacheKey.mo713b(this.f10330a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.core.ImagePipeline$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static /* synthetic */ class C3704c {

        /* renamed from: a */
        static final /* synthetic */ int[] f10332a;

        static {
            int[] iArr = new int[ImageRequest.CacheChoice.values().length];
            f10332a = iArr;
            try {
                iArr[ImageRequest.CacheChoice.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10332a[ImageRequest.CacheChoice.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ImagePipeline(C12060k c12060k, Set<RequestListener> set, Set<InterfaceC13689d> set2, Supplier<Boolean> supplier, InterfaceC11413s<CacheKey, AbstractC13063c> interfaceC11413s, InterfaceC11413s<CacheKey, InterfaceC14078g> interfaceC11413s2, C11386e c11386e, C11386e c11386e2, InterfaceC11392f interfaceC11392f, InterfaceC3851v0 interfaceC3851v0, Supplier<Boolean> supplier2, Supplier<Boolean> supplier3, InterfaceC12393a interfaceC12393a, InterfaceC12055g interfaceC12055g) {
        this.f10315a = c12060k;
        this.f10316b = new C13688c(set);
        this.f10317c = new C13687b(set2);
        this.f10318d = supplier;
        this.f10319e = interfaceC11413s;
        this.f10320f = interfaceC11413s2;
        this.f10321g = c11386e;
        this.f10322h = c11386e2;
        this.f10323i = interfaceC11392f;
        this.f10324j = interfaceC3851v0;
        this.f10325k = supplier2;
        this.f10327m = supplier3;
        this.f10328n = interfaceC12055g;
    }

    /* renamed from: r */
    private InterfaceC13380k<CacheKey> m31165r(Uri uri) {
        return new C3703b(uri);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <T> com.facebook.datasource.DataSource<com.facebook.common.references.CloseableReference<T>> m31161v(com.facebook.imagepipeline.producers.InterfaceC3810l0<com.facebook.common.references.CloseableReference<T>> r15, com.facebook.imagepipeline.request.ImageRequest r16, com.facebook.imagepipeline.request.ImageRequest.RequestLevel r17, java.lang.Object r18, com.facebook.imagepipeline.listener.RequestListener r19, java.lang.String r20) {
        /*
            r14 = this;
            r1 = r14
            boolean r0 = p006a5.C0025b.m41375d()
            if (r0 == 0) goto Lc
            java.lang.String r0 = "ImagePipeline#submitFetchRequest"
            p006a5.C0025b.m41378a(r0)
        Lc:
            com.facebook.imagepipeline.producers.x r0 = new com.facebook.imagepipeline.producers.x
            r3 = r16
            r2 = r19
            com.facebook.imagepipeline.listener.RequestListener r2 = r14.m31171l(r3, r2)
            x4.d r4 = r1.f10317c
            r0.<init>(r2, r4)
            com.facebook.imagepipeline.request.ImageRequest$RequestLevel r2 = r16.getLowestPermittedRequestLevel()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            r4 = r17
            com.facebook.imagepipeline.request.ImageRequest$RequestLevel r8 = com.facebook.imagepipeline.request.ImageRequest.RequestLevel.m30598a(r2, r4)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            com.facebook.imagepipeline.producers.r0 r13 = new com.facebook.imagepipeline.producers.r0     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            java.lang.String r4 = r14.m31174i()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            r9 = 0
            boolean r2 = r16.getProgressiveRenderingEnabled()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            if (r2 != 0) goto L3f
            android.net.Uri r2 = r16.getSourceUri()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            boolean r2 = p075e3.C6104f.m23560m(r2)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            if (r2 != 0) goto L3d
            goto L3f
        L3d:
            r2 = 0
            goto L40
        L3f:
            r2 = 1
        L40:
            r10 = r2
            com.facebook.imagepipeline.common.Priority r11 = r16.getPriority()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            r4.g r12 = r1.f10328n     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            r2 = r13
            r3 = r16
            r5 = r20
            r6 = r0
            r7 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            r2 = r15
            com.facebook.datasource.DataSource r0 = com.facebook.imagepipeline.datasource.C3716c.m31021I(r15, r13, r0)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            boolean r2 = p006a5.C0025b.m41375d()
            if (r2 == 0) goto L60
            p006a5.C0025b.m41377b()
        L60:
            return r0
        L61:
            r0 = move-exception
            goto L72
        L63:
            r0 = move-exception
            com.facebook.datasource.DataSource r0 = com.facebook.datasource.C3575c.m31692b(r0)     // Catch: java.lang.Throwable -> L61
            boolean r2 = p006a5.C0025b.m41375d()
            if (r2 == 0) goto L71
            p006a5.C0025b.m41377b()
        L71:
            return r0
        L72:
            boolean r2 = p006a5.C0025b.m41375d()
            if (r2 == 0) goto L7b
            p006a5.C0025b.m41377b()
        L7b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.core.ImagePipeline.m31161v(com.facebook.imagepipeline.producers.l0, com.facebook.imagepipeline.request.ImageRequest, com.facebook.imagepipeline.request.ImageRequest$RequestLevel, java.lang.Object, com.facebook.imagepipeline.listener.RequestListener, java.lang.String):com.facebook.datasource.DataSource");
    }

    /* renamed from: w */
    private DataSource<Void> m31160w(InterfaceC3810l0<Void> interfaceC3810l0, ImageRequest imageRequest, ImageRequest.RequestLevel requestLevel, Object obj, Priority priority, RequestListener requestListener) {
        C3854x c3854x = new C3854x(m31171l(imageRequest, requestListener), this.f10317c);
        try {
            return C3717d.m31016H(interfaceC3810l0, new C3835r0(imageRequest, m31174i(), c3854x, obj, ImageRequest.RequestLevel.m30598a(imageRequest.getLowestPermittedRequestLevel(), requestLevel), true, false, priority, this.f10328n), c3854x);
        } catch (Exception e) {
            return C3575c.m31692b(e);
        }
    }

    /* renamed from: a */
    public void m31182a() {
        m31180c();
        m31181b();
    }

    /* renamed from: b */
    public void m31181b() {
        this.f10321g.m8179j();
        this.f10322h.m8179j();
    }

    /* renamed from: c */
    public void m31180c() {
        C3702a c3702a = new C3702a();
        this.f10319e.mo8108d(c3702a);
        this.f10320f.mo8108d(c3702a);
    }

    /* renamed from: d */
    public DataSource<CloseableReference<AbstractC13063c>> m31179d(ImageRequest imageRequest, Object obj) {
        return m31178e(imageRequest, obj, ImageRequest.RequestLevel.FULL_FETCH);
    }

    /* renamed from: e */
    public DataSource<CloseableReference<AbstractC13063c>> m31178e(ImageRequest imageRequest, Object obj, ImageRequest.RequestLevel requestLevel) {
        return m31177f(imageRequest, obj, requestLevel, null);
    }

    /* renamed from: f */
    public DataSource<CloseableReference<AbstractC13063c>> m31177f(ImageRequest imageRequest, Object obj, ImageRequest.RequestLevel requestLevel, RequestListener requestListener) {
        return m31176g(imageRequest, obj, requestLevel, requestListener, null);
    }

    /* renamed from: g */
    public DataSource<CloseableReference<AbstractC13063c>> m31176g(ImageRequest imageRequest, Object obj, ImageRequest.RequestLevel requestLevel, RequestListener requestListener, String str) {
        try {
            return m31161v(this.f10315a.m6374g(imageRequest), imageRequest, requestLevel, obj, requestListener, str);
        } catch (Exception e) {
            return C3575c.m31692b(e);
        }
    }

    /* renamed from: h */
    public DataSource<CloseableReference<AbstractC13063c>> m31175h(ImageRequest imageRequest, Object obj) {
        return m31178e(imageRequest, obj, ImageRequest.RequestLevel.BITMAP_MEMORY_CACHE);
    }

    /* renamed from: i */
    public String m31174i() {
        return String.valueOf(this.f10326l.getAndIncrement());
    }

    /* renamed from: j */
    public InterfaceC11413s<CacheKey, AbstractC13063c> m31173j() {
        return this.f10319e;
    }

    /* renamed from: k */
    public InterfaceC11392f m31172k() {
        return this.f10323i;
    }

    /* renamed from: l */
    public RequestListener m31171l(ImageRequest imageRequest, RequestListener requestListener) {
        if (requestListener == null) {
            if (imageRequest.getRequestListener() == null) {
                return this.f10316b;
            }
            return new C13688c(this.f10316b, imageRequest.getRequestListener());
        } else if (imageRequest.getRequestListener() == null) {
            return new C13688c(this.f10316b, requestListener);
        } else {
            return new C13688c(this.f10316b, requestListener, imageRequest.getRequestListener());
        }
    }

    /* renamed from: m */
    public boolean m31170m(Uri uri) {
        if (uri == null) {
            return false;
        }
        return this.f10319e.mo8111a(m31165r(uri));
    }

    /* renamed from: n */
    public boolean m31169n(ImageRequest imageRequest) {
        if (imageRequest == null) {
            return false;
        }
        CloseableReference<AbstractC13063c> closeableReference = this.f10319e.get(this.f10323i.mo8152a(imageRequest, null));
        try {
            return CloseableReference.m31727Q(closeableReference);
        } finally {
            CloseableReference.m31715v(closeableReference);
        }
    }

    /* renamed from: o */
    public boolean m31168o(Uri uri) {
        if (!m31167p(uri, ImageRequest.CacheChoice.SMALL) && !m31167p(uri, ImageRequest.CacheChoice.DEFAULT)) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public boolean m31167p(Uri uri, ImageRequest.CacheChoice cacheChoice) {
        return m31166q(ImageRequestBuilder.m30567s(uri).m30564v(cacheChoice).m30585a());
    }

    /* renamed from: q */
    public boolean m31166q(ImageRequest imageRequest) {
        CacheKey mo8149d = this.f10323i.mo8149d(imageRequest, null);
        int i = C3704c.f10332a[imageRequest.getCacheChoice().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            return this.f10322h.m8177l(mo8149d);
        }
        return this.f10321g.m8177l(mo8149d);
    }

    /* renamed from: s */
    public DataSource<Void> m31164s(ImageRequest imageRequest, Object obj) {
        return m31163t(imageRequest, obj, Priority.MEDIUM);
    }

    /* renamed from: t */
    public DataSource<Void> m31163t(ImageRequest imageRequest, Object obj, Priority priority) {
        return m31162u(imageRequest, obj, priority, null);
    }

    /* renamed from: u */
    public DataSource<Void> m31162u(ImageRequest imageRequest, Object obj, Priority priority, RequestListener requestListener) {
        if (!this.f10318d.get().booleanValue()) {
            return C3575c.m31692b(f10314o);
        }
        try {
            return m31160w(this.f10315a.m6372i(imageRequest), imageRequest, ImageRequest.RequestLevel.FULL_FETCH, obj, priority, requestListener);
        } catch (Exception e) {
            return C3575c.m31692b(e);
        }
    }
}
