package com.facebook.imagepipeline.producers;

import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.nativecode.C3744j;
import com.facebook.imagepipeline.nativecode.InterfaceC3743i;
import java.io.InputStream;
import java.util.concurrent.Executor;
import p075e3.EnumC6102e;
import p170j4.C8792b;
import p170j4.C8793c;
import p170j4.C8795d;
import p380v4.C13065e;
import p394w2.C13379j;
import p455z2.AbstractC14082j;
import p455z2.InterfaceC14080h;

/* renamed from: com.facebook.imagepipeline.producers.b1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3763b1 implements InterfaceC3810l0<C13065e> {

    /* renamed from: a */
    private final Executor f10570a;

    /* renamed from: b */
    private final InterfaceC14080h f10571b;

    /* renamed from: c */
    private final InterfaceC3810l0<C13065e> f10572c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.producers.b1$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C3764a extends AbstractC3838s0<C13065e> {

        /* renamed from: o */
        final /* synthetic */ C13065e f10573o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3764a(Consumer consumer, InterfaceC3820n0 interfaceC3820n0, ProducerContext producerContext, String str, C13065e c13065e) {
            super(consumer, interfaceC3820n0, producerContext, str);
            this.f10573o = c13065e;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC3838s0, p359u2.AbstractRunnableC12826g
        /* renamed from: d */
        public void mo3856d() {
            C13065e.m3335i(this.f10573o);
            super.mo3856d();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC3838s0, p359u2.AbstractRunnableC12826g
        /* renamed from: e */
        public void mo3855e(Exception exc) {
            C13065e.m3335i(this.f10573o);
            super.mo3855e(exc);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p359u2.AbstractRunnableC12826g
        /* renamed from: j */
        public void mo3858b(C13065e c13065e) {
            C13065e.m3335i(c13065e);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p359u2.AbstractRunnableC12826g
        /* renamed from: k */
        public C13065e mo3857c() {
            AbstractC14082j mo719c = C3763b1.this.f10571b.mo719c();
            try {
                C3763b1.m30873g(this.f10573o, mo719c);
                CloseableReference m31726R = CloseableReference.m31726R(mo719c.mo716a());
                C13065e c13065e = new C13065e(m31726R);
                c13065e.m3334j(this.f10573o);
                CloseableReference.m31715v(m31726R);
                return c13065e;
            } finally {
                mo719c.close();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC3838s0, p359u2.AbstractRunnableC12826g
        /* renamed from: l */
        public void mo3854f(C13065e c13065e) {
            C13065e.m3335i(this.f10573o);
            super.mo3854f(c13065e);
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.b1$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private class C3765b extends AbstractC3821o<C13065e, C13065e> {

        /* renamed from: c */
        private final ProducerContext f10575c;

        /* renamed from: d */
        private EnumC6102e f10576d;

        public C3765b(Consumer<C13065e> consumer, ProducerContext producerContext) {
            super(consumer);
            this.f10575c = producerContext;
            this.f10576d = EnumC6102e.UNSET;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC3761b
        /* renamed from: p */
        public void mo30605h(C13065e c13065e, int i) {
            if (this.f10576d == EnumC6102e.UNSET && c13065e != null) {
                this.f10576d = C3763b1.m30872h(c13065e);
            }
            if (this.f10576d == EnumC6102e.NO) {
                m30692o().mo30891b(c13065e, i);
            } else if (AbstractC3761b.m30889d(i)) {
                if (this.f10576d == EnumC6102e.YES && c13065e != null) {
                    C3763b1.this.m30871i(c13065e, m30692o(), this.f10575c);
                } else {
                    m30692o().mo30891b(c13065e, i);
                }
            }
        }
    }

    public C3763b1(Executor executor, InterfaceC14080h interfaceC14080h, InterfaceC3810l0<C13065e> interfaceC3810l0) {
        this.f10570a = (Executor) C13379j.m2677g(executor);
        this.f10571b = (InterfaceC14080h) C13379j.m2677g(interfaceC14080h);
        this.f10572c = (InterfaceC3810l0) C13379j.m2677g(interfaceC3810l0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static void m30873g(C13065e c13065e, AbstractC14082j abstractC14082j) {
        InputStream inputStream = (InputStream) C13379j.m2677g(c13065e.m3354D());
        C8793c m17228c = C8795d.m17228c(inputStream);
        if (m17228c != C8792b.f23086f && m17228c != C8792b.f23088h) {
            if (m17228c != C8792b.f23087g && m17228c != C8792b.f23089i) {
                throw new IllegalArgumentException("Wrong image format");
            }
            C3744j.m30936a().mo30939a(inputStream, abstractC14082j);
            c13065e.m3351F0(C8792b.f23082b);
            return;
        }
        C3744j.m30936a().mo30938b(inputStream, abstractC14082j, 80);
        c13065e.m3351F0(C8792b.f23081a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static EnumC6102e m30872h(C13065e c13065e) {
        C13379j.m2677g(c13065e);
        C8793c m17228c = C8795d.m17228c((InputStream) C13379j.m2677g(c13065e.m3354D()));
        if (C8792b.m17235a(m17228c)) {
            InterfaceC3743i m30936a = C3744j.m30936a();
            if (m30936a == null) {
                return EnumC6102e.NO;
            }
            return EnumC6102e.m23573c(!m30936a.mo30937c(m17228c));
        } else if (m17228c == C8793c.f23093c) {
            return EnumC6102e.UNSET;
        } else {
            return EnumC6102e.NO;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m30871i(C13065e c13065e, Consumer<C13065e> consumer, ProducerContext producerContext) {
        C13379j.m2677g(c13065e);
        this.f10570a.execute(new C3764a(consumer, producerContext.mo30854i(), producerContext, "WebpTranscodeProducer", C13065e.m3336h(c13065e)));
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3810l0
    /* renamed from: b */
    public void mo30610b(Consumer<C13065e> consumer, ProducerContext producerContext) {
        this.f10572c.mo30610b(new C3765b(consumer, producerContext), producerContext);
    }
}
