package com.facebook.imagepipeline.producers;

import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.producers.C3859y;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p025b5.C2123b;
import p025b5.C2126e;
import p025b5.InterfaceC2124c;
import p025b5.InterfaceC2125d;
import p075e3.EnumC6102e;
import p170j4.C8792b;
import p170j4.C8793c;
import p380v4.C13065e;
import p394w2.C13372f;
import p394w2.C13379j;
import p455z2.AbstractC14082j;
import p455z2.InterfaceC14080h;

/* renamed from: com.facebook.imagepipeline.producers.q0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3830q0 implements InterfaceC3810l0<C13065e> {

    /* renamed from: a */
    private final Executor f10763a;

    /* renamed from: b */
    private final InterfaceC14080h f10764b;

    /* renamed from: c */
    private final InterfaceC3810l0<C13065e> f10765c;

    /* renamed from: d */
    private final boolean f10766d;

    /* renamed from: e */
    private final InterfaceC2125d f10767e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.imagepipeline.producers.q0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C3831a extends AbstractC3821o<C13065e, C13065e> {

        /* renamed from: c */
        private final boolean f10768c;

        /* renamed from: d */
        private final InterfaceC2125d f10769d;

        /* renamed from: e */
        private final ProducerContext f10770e;

        /* renamed from: f */
        private boolean f10771f;

        /* renamed from: g */
        private final C3859y f10772g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.facebook.imagepipeline.producers.q0$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public class C3832a implements C3859y.InterfaceC3863d {

            /* renamed from: a */
            final /* synthetic */ C3830q0 f10774a;

            C3832a(C3830q0 c3830q0) {
                C3831a.this = r1;
                this.f10774a = c3830q0;
            }

            @Override // com.facebook.imagepipeline.producers.C3859y.InterfaceC3863d
            /* renamed from: a */
            public void mo30612a(C13065e c13065e, int i) {
                C3831a c3831a = C3831a.this;
                c3831a.m30667v(c13065e, i, (InterfaceC2124c) C13379j.m2677g(c3831a.f10769d.createImageTranscoder(c13065e.m3358A(), C3831a.this.f10768c)));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.facebook.imagepipeline.producers.q0$a$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public class C3833b extends C3772e {

            /* renamed from: a */
            final /* synthetic */ C3830q0 f10776a;

            /* renamed from: b */
            final /* synthetic */ Consumer f10777b;

            C3833b(C3830q0 c3830q0, Consumer consumer) {
                C3831a.this = r1;
                this.f10776a = c3830q0;
                this.f10777b = consumer;
            }

            @Override // com.facebook.imagepipeline.producers.C3772e, com.facebook.imagepipeline.producers.InterfaceC3817m0
            /* renamed from: a */
            public void mo30662a() {
                if (C3831a.this.f10770e.mo30853j()) {
                    C3831a.this.f10772g.m30616h();
                }
            }

            @Override // com.facebook.imagepipeline.producers.InterfaceC3817m0
            /* renamed from: b */
            public void mo30638b() {
                C3831a.this.f10772g.m30621c();
                C3831a.this.f10771f = true;
                this.f10777b.mo30892a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3831a(Consumer<C13065e> consumer, ProducerContext producerContext, boolean z, InterfaceC2125d interfaceC2125d) {
            super(consumer);
            C3830q0.this = r3;
            this.f10771f = false;
            this.f10770e = producerContext;
            Boolean resizingAllowedOverride = producerContext.mo30851l().getResizingAllowedOverride();
            this.f10768c = resizingAllowedOverride != null ? resizingAllowedOverride.booleanValue() : z;
            this.f10769d = interfaceC2125d;
            this.f10772g = new C3859y(r3.f10763a, new C3832a(r3), 100);
            producerContext.mo30860c(new C3833b(r3, consumer));
        }

        /* renamed from: A */
        private C13065e m30675A(C13065e c13065e) {
            if (!this.f10770e.mo30851l().getRotationOptions().m31187c() && c13065e.m3347I() != 0 && c13065e.m3347I() != -1) {
                return m30665x(c13065e, 0);
            }
            return c13065e;
        }

        /* renamed from: v */
        public void m30667v(C13065e c13065e, int i, InterfaceC2124c interfaceC2124c) {
            this.f10770e.mo30854i().mo1810d(this.f10770e, "ResizeAndRotateProducer");
            ImageRequest mo30851l = this.f10770e.mo30851l();
            AbstractC14082j mo719c = C3830q0.this.f10764b.mo719c();
            try {
                C2123b mo30950d = interfaceC2124c.mo30950d(c13065e, mo719c, mo30851l.getRotationOptions(), mo30851l.getResizeOptions(), null, 85);
                if (mo30950d.m34163a() != 2) {
                    Map<String, String> m30664y = m30664y(c13065e, mo30851l.getResizeOptions(), mo30950d, interfaceC2124c.mo30953a());
                    CloseableReference m31726R = CloseableReference.m31726R(mo719c.mo716a());
                    try {
                        C13065e c13065e2 = new C13065e(m31726R);
                        c13065e2.m3351F0(C8792b.f23081a);
                        c13065e2.m3327t0();
                        this.f10770e.mo30854i().mo1807j(this.f10770e, "ResizeAndRotateProducer", m30664y);
                        if (mo30950d.m34163a() != 1) {
                            i |= 16;
                        }
                        m30692o().mo30891b(c13065e2, i);
                        C13065e.m3335i(c13065e2);
                        return;
                    } finally {
                        CloseableReference.m31715v(m31726R);
                    }
                }
                throw new RuntimeException("Error while transcoding the image");
            } catch (Exception e) {
                this.f10770e.mo30854i().mo1806k(this.f10770e, "ResizeAndRotateProducer", e, null);
                if (AbstractC3761b.m30889d(i)) {
                    m30692o().onFailure(e);
                }
            } finally {
                mo719c.close();
            }
        }

        /* renamed from: w */
        private void m30666w(C13065e c13065e, int i, C8793c c8793c) {
            C13065e m30675A;
            if (c8793c != C8792b.f23081a && c8793c != C8792b.f23091k) {
                m30675A = m30663z(c13065e);
            } else {
                m30675A = m30675A(c13065e);
            }
            m30692o().mo30891b(m30675A, i);
        }

        /* renamed from: x */
        private C13065e m30665x(C13065e c13065e, int i) {
            C13065e m3336h = C13065e.m3336h(c13065e);
            if (m3336h != null) {
                m3336h.m3350G0(i);
            }
            return m3336h;
        }

        /* renamed from: y */
        private Map<String, String> m30664y(C13065e c13065e, ResizeOptions resizeOptions, C2123b c2123b, String str) {
            String str2;
            if (!this.f10770e.mo30854i().mo1809f(this.f10770e, "ResizeAndRotateProducer")) {
                return null;
            }
            String str3 = c13065e.m3343S() + "x" + c13065e.m3326v();
            if (resizeOptions != null) {
                str2 = resizeOptions.f10300a + "x" + resizeOptions.f10301b;
            } else {
                str2 = "Unspecified";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("Image format", String.valueOf(c13065e.m3358A()));
            hashMap.put("Original size", str3);
            hashMap.put("Requested size", str2);
            hashMap.put("queueTime", String.valueOf(this.f10772g.m30618f()));
            hashMap.put("Transcoder id", str);
            hashMap.put("Transcoding result", String.valueOf(c2123b));
            return C13372f.m2696b(hashMap);
        }

        /* renamed from: z */
        private C13065e m30663z(C13065e c13065e) {
            RotationOptions rotationOptions = this.f10770e.mo30851l().getRotationOptions();
            if (!rotationOptions.m31183g() && rotationOptions.m31184f()) {
                return m30665x(c13065e, rotationOptions.m31185e());
            }
            return c13065e;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3761b
        /* renamed from: B */
        public void mo30605h(C13065e c13065e, int i) {
            if (this.f10771f) {
                return;
            }
            boolean m30889d = AbstractC3761b.m30889d(i);
            if (c13065e == null) {
                if (m30889d) {
                    m30692o().mo30891b(null, 1);
                    return;
                }
                return;
            }
            C8793c m3358A = c13065e.m3358A();
            EnumC6102e m30676h = C3830q0.m30676h(this.f10770e.mo30851l(), c13065e, (InterfaceC2124c) C13379j.m2677g(this.f10769d.createImageTranscoder(m3358A, this.f10768c)));
            if (!m30889d && m30676h == EnumC6102e.UNSET) {
                return;
            }
            if (m30676h != EnumC6102e.YES) {
                m30666w(c13065e, i, m3358A);
            } else if (!this.f10772g.m30613k(c13065e, i)) {
            } else {
                if (m30889d || this.f10770e.mo30853j()) {
                    this.f10772g.m30616h();
                }
            }
        }
    }

    public C3830q0(Executor executor, InterfaceC14080h interfaceC14080h, InterfaceC3810l0<C13065e> interfaceC3810l0, boolean z, InterfaceC2125d interfaceC2125d) {
        this.f10763a = (Executor) C13379j.m2677g(executor);
        this.f10764b = (InterfaceC14080h) C13379j.m2677g(interfaceC14080h);
        this.f10765c = (InterfaceC3810l0) C13379j.m2677g(interfaceC3810l0);
        this.f10767e = (InterfaceC2125d) C13379j.m2677g(interfaceC2125d);
        this.f10766d = z;
    }

    /* renamed from: f */
    private static boolean m30678f(RotationOptions rotationOptions, C13065e c13065e) {
        if (!rotationOptions.m31187c() && (C2126e.m34158e(rotationOptions, c13065e) != 0 || m30677g(rotationOptions, c13065e))) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private static boolean m30677g(RotationOptions rotationOptions, C13065e c13065e) {
        if (rotationOptions.m31184f() && !rotationOptions.m31187c()) {
            return C2126e.f5989a.contains(Integer.valueOf(c13065e.m3329s()));
        }
        c13065e.m3353D0(0);
        return false;
    }

    /* renamed from: h */
    public static EnumC6102e m30676h(ImageRequest imageRequest, C13065e c13065e, InterfaceC2124c interfaceC2124c) {
        boolean z;
        if (c13065e != null && c13065e.m3358A() != C8793c.f23093c) {
            if (!interfaceC2124c.mo30951c(c13065e.m3358A())) {
                return EnumC6102e.NO;
            }
            if (!m30678f(imageRequest.getRotationOptions(), c13065e) && !interfaceC2124c.mo30952b(c13065e, imageRequest.getRotationOptions(), imageRequest.getResizeOptions())) {
                z = false;
            } else {
                z = true;
            }
            return EnumC6102e.m23573c(z);
        }
        return EnumC6102e.UNSET;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3810l0
    /* renamed from: b */
    public void mo30610b(Consumer<C13065e> consumer, ProducerContext producerContext) {
        this.f10765c.mo30610b(new C3831a(consumer, producerContext, this.f10766d, this.f10767e), producerContext);
    }
}