package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import com.facebook.common.internal.Supplier;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.producers.C3859y;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imageutils.C3874a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p006a5.C0025b;
import p025b5.C2122a;
import p075e3.C6098a;
import p075e3.C6104f;
import p170j4.C8792b;
import p314r4.C12048a;
import p346t4.C12582f;
import p346t4.InterfaceC12579c;
import p346t4.InterfaceC12581e;
import p380v4.AbstractC13062b;
import p380v4.AbstractC13063c;
import p380v4.C13064d;
import p380v4.C13065e;
import p380v4.C13068h;
import p380v4.InterfaceC13069i;
import p394w2.C13372f;
import p394w2.C13379j;
import p455z2.InterfaceC14072a;

/* renamed from: com.facebook.imagepipeline.producers.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3811m implements InterfaceC3810l0<CloseableReference<AbstractC13063c>> {

    /* renamed from: a */
    private final InterfaceC14072a f10707a;

    /* renamed from: b */
    private final Executor f10708b;

    /* renamed from: c */
    private final InterfaceC12579c f10709c;

    /* renamed from: d */
    private final InterfaceC12581e f10710d;

    /* renamed from: e */
    private final InterfaceC3810l0<C13065e> f10711e;

    /* renamed from: f */
    private final boolean f10712f;

    /* renamed from: g */
    private final boolean f10713g;

    /* renamed from: h */
    private final boolean f10714h;

    /* renamed from: i */
    private final int f10715i;

    /* renamed from: j */
    private final C12048a f10716j;

    /* renamed from: k */
    private final Runnable f10717k;

    /* renamed from: l */
    private final Supplier<Boolean> f10718l;

    /* renamed from: com.facebook.imagepipeline.producers.m$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private class C3812a extends AbstractC3814c {
        public C3812a(Consumer<CloseableReference<AbstractC13063c>> consumer, ProducerContext producerContext, boolean z, int i) {
            super(consumer, producerContext, z, i);
        }

        @Override // com.facebook.imagepipeline.producers.C3811m.AbstractC3814c
        /* renamed from: H */
        protected synchronized boolean mo30708H(C13065e c13065e, int i) {
            if (AbstractC3761b.m30888e(i)) {
                return false;
            }
            return super.mo30708H(c13065e, i);
        }

        @Override // com.facebook.imagepipeline.producers.C3811m.AbstractC3814c
        /* renamed from: w */
        protected int mo30700w(C13065e c13065e) {
            return c13065e.m3344R();
        }

        @Override // com.facebook.imagepipeline.producers.C3811m.AbstractC3814c
        /* renamed from: x */
        protected InterfaceC13069i mo30699x() {
            return C13068h.m3324d(0, false, false);
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.m$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private class C3813b extends AbstractC3814c {

        /* renamed from: j */
        private final C12582f f10720j;

        /* renamed from: k */
        private final InterfaceC12581e f10721k;

        /* renamed from: l */
        private int f10722l;

        public C3813b(Consumer<CloseableReference<AbstractC13063c>> consumer, ProducerContext producerContext, C12582f c12582f, InterfaceC12581e interfaceC12581e, boolean z, int i) {
            super(consumer, producerContext, z, i);
            this.f10720j = (C12582f) C13379j.m2677g(c12582f);
            this.f10721k = (InterfaceC12581e) C13379j.m2677g(interfaceC12581e);
            this.f10722l = 0;
        }

        @Override // com.facebook.imagepipeline.producers.C3811m.AbstractC3814c
        /* renamed from: H */
        protected synchronized boolean mo30708H(C13065e c13065e, int i) {
            boolean mo30708H = super.mo30708H(c13065e, i);
            if ((AbstractC3761b.m30888e(i) || AbstractC3761b.m30884m(i, 8)) && !AbstractC3761b.m30884m(i, 4) && C13065e.m3333j0(c13065e) && c13065e.m3358A() == C8792b.f23081a) {
                if (!this.f10720j.m4760g(c13065e)) {
                    return false;
                }
                int m4763d = this.f10720j.m4763d();
                int i2 = this.f10722l;
                if (m4763d <= i2) {
                    return false;
                }
                if (m4763d < this.f10721k.mo4759a(i2) && !this.f10720j.m4762e()) {
                    return false;
                }
                this.f10722l = m4763d;
            }
            return mo30708H;
        }

        @Override // com.facebook.imagepipeline.producers.C3811m.AbstractC3814c
        /* renamed from: w */
        protected int mo30700w(C13065e c13065e) {
            return this.f10720j.m4764c();
        }

        @Override // com.facebook.imagepipeline.producers.C3811m.AbstractC3814c
        /* renamed from: x */
        protected InterfaceC13069i mo30699x() {
            return this.f10721k.mo4758b(this.f10720j.m4763d());
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.m$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private abstract class AbstractC3814c extends AbstractC3821o<C13065e, CloseableReference<AbstractC13063c>> {

        /* renamed from: c */
        private final String f10724c;

        /* renamed from: d */
        private final ProducerContext f10725d;

        /* renamed from: e */
        private final InterfaceC3820n0 f10726e;

        /* renamed from: f */
        private final ImageDecodeOptions f10727f;

        /* renamed from: g */
        private boolean f10728g;

        /* renamed from: h */
        private final C3859y f10729h;

        /* renamed from: com.facebook.imagepipeline.producers.m$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        class C3815a implements C3859y.InterfaceC3863d {

            /* renamed from: a */
            final /* synthetic */ C3811m f10731a;

            /* renamed from: b */
            final /* synthetic */ ProducerContext f10732b;

            /* renamed from: c */
            final /* synthetic */ int f10733c;

            C3815a(C3811m c3811m, ProducerContext producerContext, int i) {
                this.f10731a = c3811m;
                this.f10732b = producerContext;
                this.f10733c = i;
            }

            @Override // com.facebook.imagepipeline.producers.C3859y.InterfaceC3863d
            /* renamed from: a */
            public void mo30612a(C13065e c13065e, int i) {
                if (c13065e != null) {
                    AbstractC3814c.this.f10725d.mo30861b("image_format", c13065e.m3358A().m17233a());
                    if (C3811m.this.f10712f || !AbstractC3761b.m30884m(i, 16)) {
                        ImageRequest mo30851l = this.f10732b.mo30851l();
                        if (C3811m.this.f10713g || !C6104f.m23560m(mo30851l.getSourceUri())) {
                            c13065e.m3348H0(C2122a.m34168b(mo30851l.getRotationOptions(), mo30851l.getResizeOptions(), c13065e, this.f10733c));
                        }
                    }
                    if (this.f10732b.mo30859d().mo6448D().m31076z()) {
                        AbstractC3814c.this.m30711E(c13065e);
                    }
                    AbstractC3814c.this.m30702u(c13065e, i);
                }
            }
        }

        /* renamed from: com.facebook.imagepipeline.producers.m$c$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        class C3816b extends C3772e {

            /* renamed from: a */
            final /* synthetic */ C3811m f10735a;

            /* renamed from: b */
            final /* synthetic */ boolean f10736b;

            C3816b(C3811m c3811m, boolean z) {
                this.f10735a = c3811m;
                this.f10736b = z;
            }

            @Override // com.facebook.imagepipeline.producers.C3772e, com.facebook.imagepipeline.producers.InterfaceC3817m0
            /* renamed from: a */
            public void mo30662a() {
                if (AbstractC3814c.this.f10725d.mo30853j()) {
                    AbstractC3814c.this.f10729h.m30616h();
                }
            }

            @Override // com.facebook.imagepipeline.producers.InterfaceC3817m0
            /* renamed from: b */
            public void mo30638b() {
                if (this.f10736b) {
                    AbstractC3814c.this.m30698y();
                }
            }
        }

        public AbstractC3814c(Consumer<CloseableReference<AbstractC13063c>> consumer, ProducerContext producerContext, boolean z, int i) {
            super(consumer);
            this.f10724c = "ProgressiveDecoder";
            this.f10725d = producerContext;
            this.f10726e = producerContext.mo30854i();
            ImageDecodeOptions imageDecodeOptions = producerContext.mo30851l().getImageDecodeOptions();
            this.f10727f = imageDecodeOptions;
            this.f10728g = false;
            this.f10729h = new C3859y(C3811m.this.f10708b, new C3815a(C3811m.this, producerContext, i), imageDecodeOptions.f10285a);
            producerContext.mo30860c(new C3816b(C3811m.this, z));
        }

        /* renamed from: A */
        private void m30715A(AbstractC13063c abstractC13063c, int i) {
            CloseableReference<AbstractC13063c> m6467b = C3811m.this.f10716j.m6467b(abstractC13063c);
            try {
                m30712D(AbstractC3761b.m30889d(i));
                m30692o().mo30891b(m6467b, i);
            } finally {
                CloseableReference.m31715v(m6467b);
            }
        }

        /* renamed from: B */
        private AbstractC13063c m30714B(C13065e c13065e, int i, InterfaceC13069i interfaceC13069i) {
            boolean z;
            if (C3811m.this.f10717k != null && ((Boolean) C3811m.this.f10718l.get()).booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            try {
                return C3811m.this.f10709c.mo4767a(c13065e, i, interfaceC13069i, this.f10727f);
            } catch (OutOfMemoryError e) {
                if (z) {
                    C3811m.this.f10717k.run();
                    System.gc();
                    return C3811m.this.f10709c.mo4767a(c13065e, i, interfaceC13069i, this.f10727f);
                }
                throw e;
            }
        }

        /* renamed from: C */
        private synchronized boolean m30713C() {
            return this.f10728g;
        }

        /* renamed from: D */
        private void m30712D(boolean z) {
            synchronized (this) {
                if (z) {
                    if (!this.f10728g) {
                        m30692o().mo30890c(1.0f);
                        this.f10728g = true;
                        this.f10729h.m30621c();
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: E */
        public void m30711E(C13065e c13065e) {
            if (c13065e.m3358A() != C8792b.f23081a) {
                return;
            }
            c13065e.m3348H0(C2122a.m34167c(c13065e, C3874a.m30554c(this.f10727f.f10291g), 104857600));
        }

        /* renamed from: G */
        private void m30709G(C13065e c13065e, AbstractC13063c abstractC13063c) {
            Bitmap.Config config;
            this.f10725d.mo30861b("encoded_width", Integer.valueOf(c13065e.m3343S()));
            this.f10725d.mo30861b("encoded_height", Integer.valueOf(c13065e.m3326v()));
            this.f10725d.mo30861b("encoded_size", Integer.valueOf(c13065e.m3344R()));
            if (abstractC13063c instanceof AbstractC13062b) {
                Bitmap mo3363o = ((AbstractC13062b) abstractC13063c).mo3363o();
                if (mo3363o == null) {
                    config = null;
                } else {
                    config = mo3363o.getConfig();
                }
                this.f10725d.mo30861b("bitmap_config", String.valueOf(config));
            }
            if (abstractC13063c != null) {
                abstractC13063c.m3368m(this.f10725d.getExtras());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
        /* renamed from: u */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m30702u(p380v4.C13065e r21, int r22) {
            /*
                Method dump skipped, instructions count: 322
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C3811m.AbstractC3814c.m30702u(v4.e, int):void");
        }

        /* renamed from: v */
        private Map<String, String> m30701v(AbstractC13063c abstractC13063c, long j, InterfaceC13069i interfaceC13069i, boolean z, String str, String str2, String str3, String str4) {
            Bitmap mo3363o;
            if (!this.f10726e.mo1809f(this.f10725d, "DecodeProducer")) {
                return null;
            }
            String valueOf = String.valueOf(j);
            String valueOf2 = String.valueOf(interfaceC13069i.mo3322b());
            String valueOf3 = String.valueOf(z);
            if (abstractC13063c instanceof C13064d) {
                C13379j.m2677g(((C13064d) abstractC13063c).mo3363o());
                HashMap hashMap = new HashMap(8);
                hashMap.put("bitmapSize", mo3363o.getWidth() + "x" + mo3363o.getHeight());
                hashMap.put("queueTime", valueOf);
                hashMap.put("hasGoodQuality", valueOf2);
                hashMap.put("isFinal", valueOf3);
                hashMap.put("encodedImageSize", str2);
                hashMap.put("imageFormat", str);
                hashMap.put("requestedImageSize", str3);
                hashMap.put("sampleSize", str4);
                hashMap.put("byteCount", mo3363o.getByteCount() + "");
                return C13372f.m2696b(hashMap);
            }
            HashMap hashMap2 = new HashMap(7);
            hashMap2.put("queueTime", valueOf);
            hashMap2.put("hasGoodQuality", valueOf2);
            hashMap2.put("isFinal", valueOf3);
            hashMap2.put("encodedImageSize", str2);
            hashMap2.put("imageFormat", str);
            hashMap2.put("requestedImageSize", str3);
            hashMap2.put("sampleSize", str4);
            return C13372f.m2696b(hashMap2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y */
        public void m30698y() {
            m30712D(true);
            m30692o().mo30892a();
        }

        /* renamed from: z */
        private void m30697z(Throwable th2) {
            m30712D(true);
            m30692o().onFailure(th2);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3761b
        /* renamed from: F */
        public void mo30605h(C13065e c13065e, int i) {
            boolean m41375d;
            try {
                if (C0025b.m41375d()) {
                    C0025b.m41378a("DecodeProducer#onNewResultImpl");
                }
                boolean m30889d = AbstractC3761b.m30889d(i);
                if (m30889d) {
                    if (c13065e == null) {
                        m30697z(new C6098a("Encoded image is null."));
                        if (m41375d) {
                            return;
                        }
                        return;
                    } else if (!c13065e.m3337e0()) {
                        m30697z(new C6098a("Encoded image is not valid."));
                        if (C0025b.m41375d()) {
                            C0025b.m41377b();
                            return;
                        }
                        return;
                    }
                }
                if (!mo30708H(c13065e, i)) {
                    if (C0025b.m41375d()) {
                        C0025b.m41377b();
                        return;
                    }
                    return;
                }
                boolean m30884m = AbstractC3761b.m30884m(i, 4);
                if (m30889d || m30884m || this.f10725d.mo30853j()) {
                    this.f10729h.m30616h();
                }
                if (C0025b.m41375d()) {
                    C0025b.m41377b();
                }
            } finally {
                if (C0025b.m41375d()) {
                    C0025b.m41377b();
                }
            }
        }

        /* renamed from: H */
        protected boolean mo30708H(C13065e c13065e, int i) {
            return this.f10729h.m30613k(c13065e, i);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3821o, com.facebook.imagepipeline.producers.AbstractC3761b
        /* renamed from: f */
        public void mo30625f() {
            m30698y();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3821o, com.facebook.imagepipeline.producers.AbstractC3761b
        /* renamed from: g */
        public void mo30606g(Throwable th2) {
            m30697z(th2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC3821o, com.facebook.imagepipeline.producers.AbstractC3761b
        /* renamed from: i */
        public void mo30693i(float f) {
            super.mo30693i(f * 0.99f);
        }

        /* renamed from: w */
        protected abstract int mo30700w(C13065e c13065e);

        /* renamed from: x */
        protected abstract InterfaceC13069i mo30699x();
    }

    public C3811m(InterfaceC14072a interfaceC14072a, Executor executor, InterfaceC12579c interfaceC12579c, InterfaceC12581e interfaceC12581e, boolean z, boolean z2, boolean z3, InterfaceC3810l0<C13065e> interfaceC3810l0, int i, C12048a c12048a, Runnable runnable, Supplier<Boolean> supplier) {
        this.f10707a = (InterfaceC14072a) C13379j.m2677g(interfaceC14072a);
        this.f10708b = (Executor) C13379j.m2677g(executor);
        this.f10709c = (InterfaceC12579c) C13379j.m2677g(interfaceC12579c);
        this.f10710d = (InterfaceC12581e) C13379j.m2677g(interfaceC12581e);
        this.f10712f = z;
        this.f10713g = z2;
        this.f10711e = (InterfaceC3810l0) C13379j.m2677g(interfaceC3810l0);
        this.f10714h = z3;
        this.f10715i = i;
        this.f10716j = c12048a;
        this.f10717k = runnable;
        this.f10718l = supplier;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3810l0
    /* renamed from: b */
    public void mo30610b(Consumer<CloseableReference<AbstractC13063c>> consumer, ProducerContext producerContext) {
        Consumer<C13065e> c3813b;
        try {
            if (C0025b.m41375d()) {
                C0025b.m41378a("DecodeProducer#produceResults");
            }
            if (!C6104f.m23560m(producerContext.mo30851l().getSourceUri())) {
                c3813b = new C3812a(consumer, producerContext, this.f10714h, this.f10715i);
            } else {
                c3813b = new C3813b(consumer, producerContext, new C12582f(this.f10707a), this.f10710d, this.f10714h, this.f10715i);
            }
            this.f10711e.mo30610b(c3813b, producerContext);
        } finally {
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
        }
    }
}
