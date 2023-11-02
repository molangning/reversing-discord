package p314r4;

import android.content.ContentResolver;
import android.net.Uri;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.producers.C3756a;
import com.facebook.imagepipeline.producers.C3823p;
import com.facebook.imagepipeline.producers.C3827q;
import com.facebook.imagepipeline.producers.C3836s;
import com.facebook.imagepipeline.producers.InterfaceC3810l0;
import com.facebook.imagepipeline.producers.InterfaceC3851v0;
import com.facebook.imagepipeline.producers.InterfaceC3869z0;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashMap;
import java.util.Map;
import p006a5.C0025b;
import p025b5.InterfaceC2125d;
import p094f3.C6308c;
import p380v4.AbstractC13063c;
import p380v4.C13065e;
import p394w2.C13379j;
import p435y2.C13869a;

/* renamed from: r4.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12060k {

    /* renamed from: A */
    InterfaceC3810l0<CloseableReference<AbstractC13063c>> f31170A;

    /* renamed from: B */
    InterfaceC3810l0<CloseableReference<AbstractC13063c>> f31171B;

    /* renamed from: C */
    Map<InterfaceC3810l0<CloseableReference<AbstractC13063c>>, InterfaceC3810l0<CloseableReference<AbstractC13063c>>> f31172C = new HashMap();

    /* renamed from: D */
    Map<InterfaceC3810l0<CloseableReference<AbstractC13063c>>, InterfaceC3810l0<Void>> f31173D = new HashMap();

    /* renamed from: E */
    Map<InterfaceC3810l0<CloseableReference<AbstractC13063c>>, InterfaceC3810l0<CloseableReference<AbstractC13063c>>> f31174E = new HashMap();

    /* renamed from: a */
    private final ContentResolver f31175a;

    /* renamed from: b */
    private final C12059j f31176b;

    /* renamed from: c */
    private final NetworkFetcher f31177c;

    /* renamed from: d */
    private final boolean f31178d;

    /* renamed from: e */
    private final boolean f31179e;

    /* renamed from: f */
    private final boolean f31180f;

    /* renamed from: g */
    private final InterfaceC3851v0 f31181g;

    /* renamed from: h */
    private final boolean f31182h;

    /* renamed from: i */
    private final boolean f31183i;

    /* renamed from: j */
    private final boolean f31184j;

    /* renamed from: k */
    private final InterfaceC2125d f31185k;

    /* renamed from: l */
    private final boolean f31186l;

    /* renamed from: m */
    private final boolean f31187m;

    /* renamed from: n */
    private final boolean f31188n;

    /* renamed from: o */
    private final boolean f31189o;

    /* renamed from: p */
    InterfaceC3810l0<CloseableReference<AbstractC13063c>> f31190p;

    /* renamed from: q */
    InterfaceC3810l0<C13065e> f31191q;

    /* renamed from: r */
    InterfaceC3810l0<C13065e> f31192r;

    /* renamed from: s */
    InterfaceC3810l0<Void> f31193s;

    /* renamed from: t */
    InterfaceC3810l0<Void> f31194t;

    /* renamed from: u */
    private InterfaceC3810l0<C13065e> f31195u;

    /* renamed from: v */
    InterfaceC3810l0<CloseableReference<AbstractC13063c>> f31196v;

    /* renamed from: w */
    InterfaceC3810l0<CloseableReference<AbstractC13063c>> f31197w;

    /* renamed from: x */
    InterfaceC3810l0<CloseableReference<AbstractC13063c>> f31198x;

    /* renamed from: y */
    InterfaceC3810l0<CloseableReference<AbstractC13063c>> f31199y;

    /* renamed from: z */
    InterfaceC3810l0<CloseableReference<AbstractC13063c>> f31200z;

    public C12060k(ContentResolver contentResolver, C12059j c12059j, NetworkFetcher networkFetcher, boolean z, boolean z2, InterfaceC3851v0 interfaceC3851v0, boolean z3, boolean z4, boolean z5, boolean z6, InterfaceC2125d interfaceC2125d, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.f31175a = contentResolver;
        this.f31176b = c12059j;
        this.f31177c = networkFetcher;
        this.f31178d = z;
        this.f31179e = z2;
        this.f31188n = z9;
        this.f31181g = interfaceC3851v0;
        this.f31182h = z3;
        this.f31183i = z4;
        this.f31180f = z5;
        this.f31184j = z6;
        this.f31185k = interfaceC2125d;
        this.f31186l = z7;
        this.f31187m = z8;
        this.f31189o = z10;
    }

    /* renamed from: A */
    private InterfaceC3810l0<C13065e> m6383A(InterfaceC3869z0<C13065e>[] interfaceC3869z0Arr) {
        return this.f31176b.m6414D(this.f31176b.m6411G(interfaceC3869z0Arr), true, this.f31185k);
    }

    /* renamed from: B */
    private InterfaceC3810l0<C13065e> m6382B(InterfaceC3810l0<C13065e> interfaceC3810l0, InterfaceC3869z0<C13065e>[] interfaceC3869z0Arr) {
        return C12059j.m6402h(m6383A(interfaceC3869z0Arr), this.f31176b.m6412F(this.f31176b.m6414D(C12059j.m6409a(interfaceC3810l0), true, this.f31185k)));
    }

    /* renamed from: C */
    private static void m6381C(ImageRequest imageRequest) {
        boolean z;
        C13379j.m2677g(imageRequest);
        if (imageRequest.getLowestPermittedRequestLevel().m30597b() <= ImageRequest.RequestLevel.ENCODED_MEMORY_CACHE.m30597b()) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2682b(Boolean.valueOf(z));
    }

    /* renamed from: a */
    private synchronized InterfaceC3810l0<C13065e> m6380a() {
        if (C0025b.m41375d()) {
            C0025b.m41378a("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence");
        }
        if (this.f31191q == null) {
            if (C0025b.m41375d()) {
                C0025b.m41378a("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence:init");
            }
            this.f31191q = this.f31176b.m6408b(m6355z(this.f31176b.m6388v()), this.f31181g);
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
        }
        if (C0025b.m41375d()) {
            C0025b.m41377b();
        }
        return this.f31191q;
    }

    /* renamed from: b */
    private synchronized InterfaceC3810l0<C13065e> m6379b() {
        if (C0025b.m41375d()) {
            C0025b.m41378a("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence");
        }
        if (this.f31192r == null) {
            if (C0025b.m41375d()) {
                C0025b.m41378a("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence:init");
            }
            this.f31192r = this.f31176b.m6408b(m6376e(), this.f31181g);
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
        }
        if (C0025b.m41375d()) {
            C0025b.m41377b();
        }
        return this.f31192r;
    }

    /* renamed from: c */
    private InterfaceC3810l0<CloseableReference<AbstractC13063c>> m6378c(ImageRequest imageRequest) {
        try {
            if (C0025b.m41375d()) {
                C0025b.m41378a("ProducerSequenceFactory#getBasicDecodedImageSequence");
            }
            C13379j.m2677g(imageRequest);
            Uri sourceUri = imageRequest.getSourceUri();
            C13379j.m2676h(sourceUri, "Uri is null.");
            int sourceUriType = imageRequest.getSourceUriType();
            if (sourceUriType != 0) {
                switch (sourceUriType) {
                    case 2:
                        InterfaceC3810l0<CloseableReference<AbstractC13063c>> m6366o = m6366o();
                        if (C0025b.m41375d()) {
                            C0025b.m41377b();
                        }
                        return m6366o;
                    case 3:
                        InterfaceC3810l0<CloseableReference<AbstractC13063c>> m6368m = m6368m();
                        if (C0025b.m41375d()) {
                            C0025b.m41377b();
                        }
                        return m6368m;
                    case 4:
                        if (C13869a.m1349c(this.f31175a.getType(sourceUri))) {
                            InterfaceC3810l0<CloseableReference<AbstractC13063c>> m6366o2 = m6366o();
                            if (C0025b.m41375d()) {
                                C0025b.m41377b();
                            }
                            return m6366o2;
                        }
                        InterfaceC3810l0<CloseableReference<AbstractC13063c>> m6370k = m6370k();
                        if (C0025b.m41375d()) {
                            C0025b.m41377b();
                        }
                        return m6370k;
                    case 5:
                        InterfaceC3810l0<CloseableReference<AbstractC13063c>> m6371j = m6371j();
                        if (C0025b.m41375d()) {
                            C0025b.m41377b();
                        }
                        return m6371j;
                    case 6:
                        InterfaceC3810l0<CloseableReference<AbstractC13063c>> m6367n = m6367n();
                        if (C0025b.m41375d()) {
                            C0025b.m41377b();
                        }
                        return m6367n;
                    case 7:
                        InterfaceC3810l0<CloseableReference<AbstractC13063c>> m6375f = m6375f();
                        if (C0025b.m41375d()) {
                            C0025b.m41377b();
                        }
                        return m6375f;
                    case 8:
                        return m6362s();
                    default:
                        throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + m6361t(sourceUri));
                }
            }
            InterfaceC3810l0<CloseableReference<AbstractC13063c>> m6365p = m6365p();
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
            return m6365p;
        } finally {
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
        }
    }

    /* renamed from: d */
    private synchronized InterfaceC3810l0<CloseableReference<AbstractC13063c>> m6377d(InterfaceC3810l0<CloseableReference<AbstractC13063c>> interfaceC3810l0) {
        InterfaceC3810l0<CloseableReference<AbstractC13063c>> interfaceC3810l02;
        interfaceC3810l02 = this.f31174E.get(interfaceC3810l0);
        if (interfaceC3810l02 == null) {
            interfaceC3810l02 = this.f31176b.m6404f(interfaceC3810l0);
            this.f31174E.put(interfaceC3810l0, interfaceC3810l02);
        }
        return interfaceC3810l02;
    }

    /* renamed from: e */
    private synchronized InterfaceC3810l0<C13065e> m6376e() {
        InterfaceC3810l0<C13065e> m6355z;
        boolean z;
        if (C0025b.m41375d()) {
            C0025b.m41378a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence");
        }
        if (this.f31195u == null) {
            if (C0025b.m41375d()) {
                C0025b.m41378a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence:init");
            }
            if (this.f31188n) {
                m6355z = this.f31176b.m6401i(this.f31177c);
            } else {
                m6355z = m6355z(this.f31176b.m6385y(this.f31177c));
            }
            C3756a m6409a = C12059j.m6409a((InterfaceC3810l0) C13379j.m2677g(m6355z));
            this.f31195u = m6409a;
            C12059j c12059j = this.f31176b;
            if (this.f31178d && !this.f31182h) {
                z = true;
            } else {
                z = false;
            }
            this.f31195u = c12059j.m6414D(m6409a, z, this.f31185k);
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
        }
        if (C0025b.m41375d()) {
            C0025b.m41377b();
        }
        return this.f31195u;
    }

    /* renamed from: f */
    private synchronized InterfaceC3810l0<CloseableReference<AbstractC13063c>> m6375f() {
        if (this.f31170A == null) {
            InterfaceC3810l0<C13065e> m6400j = this.f31176b.m6400j();
            if (C6308c.f17810a && (!this.f31179e || C6308c.f17813d == null)) {
                m6400j = this.f31176b.m6410H(m6400j);
            }
            this.f31170A = m6359v(this.f31176b.m6414D(C12059j.m6409a(m6400j), true, this.f31185k));
        }
        return this.f31170A;
    }

    /* renamed from: h */
    private synchronized InterfaceC3810l0<CloseableReference<AbstractC13063c>> m6373h(InterfaceC3810l0<CloseableReference<AbstractC13063c>> interfaceC3810l0) {
        return this.f31176b.m6398l(interfaceC3810l0);
    }

    /* renamed from: j */
    private synchronized InterfaceC3810l0<CloseableReference<AbstractC13063c>> m6371j() {
        if (this.f31200z == null) {
            this.f31200z = m6358w(this.f31176b.m6392r());
        }
        return this.f31200z;
    }

    /* renamed from: k */
    private synchronized InterfaceC3810l0<CloseableReference<AbstractC13063c>> m6370k() {
        if (this.f31198x == null) {
            this.f31198x = m6357x(this.f31176b.m6391s(), new InterfaceC3869z0[]{this.f31176b.m6390t(), this.f31176b.m6389u()});
        }
        return this.f31198x;
    }

    /* renamed from: l */
    private synchronized InterfaceC3810l0<Void> m6369l() {
        if (C0025b.m41375d()) {
            C0025b.m41378a("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence");
        }
        if (this.f31193s == null) {
            if (C0025b.m41375d()) {
                C0025b.m41378a("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence:init");
            }
            this.f31193s = this.f31176b.m6413E(m6380a());
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
        }
        if (C0025b.m41375d()) {
            C0025b.m41377b();
        }
        return this.f31193s;
    }

    /* renamed from: m */
    private synchronized InterfaceC3810l0<CloseableReference<AbstractC13063c>> m6368m() {
        if (this.f31196v == null) {
            this.f31196v = m6358w(this.f31176b.m6388v());
        }
        return this.f31196v;
    }

    /* renamed from: n */
    private synchronized InterfaceC3810l0<CloseableReference<AbstractC13063c>> m6367n() {
        if (this.f31199y == null) {
            this.f31199y = m6358w(this.f31176b.m6387w());
        }
        return this.f31199y;
    }

    /* renamed from: o */
    private synchronized InterfaceC3810l0<CloseableReference<AbstractC13063c>> m6366o() {
        if (this.f31197w == null) {
            this.f31197w = m6360u(this.f31176b.m6386x());
        }
        return this.f31197w;
    }

    /* renamed from: p */
    private synchronized InterfaceC3810l0<CloseableReference<AbstractC13063c>> m6365p() {
        if (C0025b.m41375d()) {
            C0025b.m41378a("ProducerSequenceFactory#getNetworkFetchSequence");
        }
        if (this.f31190p == null) {
            if (C0025b.m41375d()) {
                C0025b.m41378a("ProducerSequenceFactory#getNetworkFetchSequence:init");
            }
            this.f31190p = m6359v(m6376e());
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
        }
        if (C0025b.m41375d()) {
            C0025b.m41377b();
        }
        return this.f31190p;
    }

    /* renamed from: q */
    private synchronized InterfaceC3810l0<Void> m6364q() {
        if (C0025b.m41375d()) {
            C0025b.m41378a("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence");
        }
        if (this.f31194t == null) {
            if (C0025b.m41375d()) {
                C0025b.m41378a("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence:init");
            }
            this.f31194t = this.f31176b.m6413E(m6379b());
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
        }
        if (C0025b.m41375d()) {
            C0025b.m41377b();
        }
        return this.f31194t;
    }

    /* renamed from: r */
    private synchronized InterfaceC3810l0<CloseableReference<AbstractC13063c>> m6363r(InterfaceC3810l0<CloseableReference<AbstractC13063c>> interfaceC3810l0) {
        InterfaceC3810l0<CloseableReference<AbstractC13063c>> interfaceC3810l02;
        interfaceC3810l02 = this.f31172C.get(interfaceC3810l0);
        if (interfaceC3810l02 == null) {
            interfaceC3810l02 = this.f31176b.m6417A(this.f31176b.m6416B(interfaceC3810l0));
            this.f31172C.put(interfaceC3810l0, interfaceC3810l02);
        }
        return interfaceC3810l02;
    }

    /* renamed from: s */
    private synchronized InterfaceC3810l0<CloseableReference<AbstractC13063c>> m6362s() {
        if (this.f31171B == null) {
            this.f31171B = m6358w(this.f31176b.m6415C());
        }
        return this.f31171B;
    }

    /* renamed from: t */
    private static String m6361t(Uri uri) {
        String valueOf = String.valueOf(uri);
        if (valueOf.length() > 30) {
            return valueOf.substring(0, 30) + "...";
        }
        return valueOf;
    }

    /* renamed from: u */
    private InterfaceC3810l0<CloseableReference<AbstractC13063c>> m6360u(InterfaceC3810l0<CloseableReference<AbstractC13063c>> interfaceC3810l0) {
        InterfaceC3810l0<CloseableReference<AbstractC13063c>> m6408b = this.f31176b.m6408b(this.f31176b.m6406d(this.f31176b.m6405e(interfaceC3810l0)), this.f31181g);
        if (!this.f31186l && !this.f31187m) {
            return this.f31176b.m6407c(m6408b);
        }
        return this.f31176b.m6403g(this.f31176b.m6407c(m6408b));
    }

    /* renamed from: v */
    private InterfaceC3810l0<CloseableReference<AbstractC13063c>> m6359v(InterfaceC3810l0<C13065e> interfaceC3810l0) {
        if (C0025b.m41375d()) {
            C0025b.m41378a("ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence");
        }
        InterfaceC3810l0<CloseableReference<AbstractC13063c>> m6360u = m6360u(this.f31176b.m6399k(interfaceC3810l0));
        if (C0025b.m41375d()) {
            C0025b.m41377b();
        }
        return m6360u;
    }

    /* renamed from: w */
    private InterfaceC3810l0<CloseableReference<AbstractC13063c>> m6358w(InterfaceC3810l0<C13065e> interfaceC3810l0) {
        return m6357x(interfaceC3810l0, new InterfaceC3869z0[]{this.f31176b.m6389u()});
    }

    /* renamed from: x */
    private InterfaceC3810l0<CloseableReference<AbstractC13063c>> m6357x(InterfaceC3810l0<C13065e> interfaceC3810l0, InterfaceC3869z0<C13065e>[] interfaceC3869z0Arr) {
        return m6359v(m6382B(m6355z(interfaceC3810l0), interfaceC3869z0Arr));
    }

    /* renamed from: y */
    private InterfaceC3810l0<C13065e> m6356y(InterfaceC3810l0<C13065e> interfaceC3810l0) {
        C3827q m6396n;
        if (C0025b.m41375d()) {
            C0025b.m41378a("ProducerSequenceFactory#newDiskCacheSequence");
        }
        if (this.f31180f) {
            m6396n = this.f31176b.m6396n(this.f31176b.m6384z(interfaceC3810l0));
        } else {
            m6396n = this.f31176b.m6396n(interfaceC3810l0);
        }
        C3823p m6397m = this.f31176b.m6397m(m6396n);
        if (C0025b.m41375d()) {
            C0025b.m41377b();
        }
        return m6397m;
    }

    /* renamed from: z */
    private InterfaceC3810l0<C13065e> m6355z(InterfaceC3810l0<C13065e> interfaceC3810l0) {
        if (C6308c.f17810a && (!this.f31179e || C6308c.f17813d == null)) {
            interfaceC3810l0 = this.f31176b.m6410H(interfaceC3810l0);
        }
        if (this.f31184j) {
            interfaceC3810l0 = m6356y(interfaceC3810l0);
        }
        C3836s m6394p = this.f31176b.m6394p(interfaceC3810l0);
        if (this.f31187m) {
            return this.f31176b.m6395o(this.f31176b.m6393q(m6394p));
        }
        return this.f31176b.m6395o(m6394p);
    }

    /* renamed from: g */
    public InterfaceC3810l0<CloseableReference<AbstractC13063c>> m6374g(ImageRequest imageRequest) {
        if (C0025b.m41375d()) {
            C0025b.m41378a("ProducerSequenceFactory#getDecodedImageProducerSequence");
        }
        InterfaceC3810l0<CloseableReference<AbstractC13063c>> m6378c = m6378c(imageRequest);
        if (imageRequest.getPostprocessor() != null) {
            m6378c = m6363r(m6378c);
        }
        if (this.f31183i) {
            m6378c = m6377d(m6378c);
        }
        if (this.f31189o && imageRequest.getDelayMs() > 0) {
            m6378c = m6373h(m6378c);
        }
        if (C0025b.m41375d()) {
            C0025b.m41377b();
        }
        return m6378c;
    }

    /* renamed from: i */
    public InterfaceC3810l0<Void> m6372i(ImageRequest imageRequest) {
        m6381C(imageRequest);
        int sourceUriType = imageRequest.getSourceUriType();
        if (sourceUriType != 0) {
            if (sourceUriType != 2 && sourceUriType != 3) {
                Uri sourceUri = imageRequest.getSourceUri();
                throw new IllegalArgumentException("Unsupported uri scheme for encoded image fetch! Uri is: " + m6361t(sourceUri));
            }
            return m6369l();
        }
        return m6364q();
    }
}
