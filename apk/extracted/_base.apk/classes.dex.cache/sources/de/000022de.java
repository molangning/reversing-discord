package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.request.InterfaceC3872a;
import com.facebook.imagepipeline.request.InterfaceC3873b;
import com.facebook.imagepipeline.request.Postprocessor;
import java.util.Map;
import java.util.concurrent.Executor;
import p380v4.AbstractC13063c;
import p380v4.C13064d;
import p394w2.C13372f;
import p394w2.C13379j;

/* renamed from: com.facebook.imagepipeline.producers.k0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3801k0 implements InterfaceC3810l0<CloseableReference<AbstractC13063c>> {

    /* renamed from: a */
    private final InterfaceC3810l0<CloseableReference<AbstractC13063c>> f10686a;

    /* renamed from: b */
    private final PlatformBitmapFactory f10687b;

    /* renamed from: c */
    private final Executor f10688c;

    /* renamed from: com.facebook.imagepipeline.producers.k0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C3803b extends AbstractC3821o<CloseableReference<AbstractC13063c>, CloseableReference<AbstractC13063c>> {

        /* renamed from: c */
        private final InterfaceC3820n0 f10689c;

        /* renamed from: d */
        private final ProducerContext f10690d;

        /* renamed from: e */
        private final Postprocessor f10691e;

        /* renamed from: f */
        private boolean f10692f;

        /* renamed from: g */
        private CloseableReference<AbstractC13063c> f10693g;

        /* renamed from: h */
        private int f10694h;

        /* renamed from: i */
        private boolean f10695i;

        /* renamed from: j */
        private boolean f10696j;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.facebook.imagepipeline.producers.k0$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public class C3804a extends C3772e {

            /* renamed from: a */
            final /* synthetic */ C3801k0 f10698a;

            C3804a(C3801k0 c3801k0) {
                C3803b.this = r1;
                this.f10698a = c3801k0;
            }

            @Override // com.facebook.imagepipeline.producers.InterfaceC3817m0
            /* renamed from: b */
            public void mo30638b() {
                C3803b.this.m30750B();
            }
        }

        /* renamed from: com.facebook.imagepipeline.producers.k0$b$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public class RunnableC3805b implements Runnable {
            RunnableC3805b() {
                C3803b.this = r1;
            }

            @Override // java.lang.Runnable
            public void run() {
                CloseableReference closeableReference;
                int i;
                synchronized (C3803b.this) {
                    closeableReference = C3803b.this.f10693g;
                    i = C3803b.this.f10694h;
                    C3803b.this.f10693g = null;
                    C3803b.this.f10695i = false;
                }
                if (CloseableReference.m31727Q(closeableReference)) {
                    try {
                        C3803b.this.m30732y(closeableReference, i);
                    } finally {
                        CloseableReference.m31715v(closeableReference);
                    }
                }
                C3803b.this.m30734w();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3803b(Consumer<CloseableReference<AbstractC13063c>> consumer, InterfaceC3820n0 interfaceC3820n0, Postprocessor postprocessor, ProducerContext producerContext) {
            super(consumer);
            C3801k0.this = r1;
            this.f10693g = null;
            this.f10694h = 0;
            this.f10695i = false;
            this.f10696j = false;
            this.f10689c = interfaceC3820n0;
            this.f10691e = postprocessor;
            this.f10690d = producerContext;
            producerContext.mo30860c(new C3804a(r1));
        }

        /* renamed from: A */
        private synchronized boolean m30751A() {
            return this.f10692f;
        }

        /* renamed from: B */
        public void m30750B() {
            if (m30733x()) {
                m30692o().mo30892a();
            }
        }

        /* renamed from: C */
        private void m30749C(Throwable th2) {
            if (m30733x()) {
                m30692o().onFailure(th2);
            }
        }

        /* renamed from: D */
        private void m30748D(CloseableReference<AbstractC13063c> closeableReference, int i) {
            boolean m30889d = AbstractC3761b.m30889d(i);
            if ((!m30889d && !m30751A()) || (m30889d && m30733x())) {
                m30692o().mo30891b(closeableReference, i);
            }
        }

        /* renamed from: F */
        private CloseableReference<AbstractC13063c> m30746F(AbstractC13063c abstractC13063c) {
            C13064d c13064d = (C13064d) abstractC13063c;
            CloseableReference<Bitmap> process = this.f10691e.process(c13064d.mo3363o(), C3801k0.this.f10687b);
            try {
                C13064d c13064d2 = new C13064d(process, abstractC13063c.mo3365a(), c13064d.m3366D(), c13064d.m3367A());
                c13064d2.m3368m(c13064d.getExtras());
                return CloseableReference.m31726R(c13064d2);
            } finally {
                CloseableReference.m31715v(process);
            }
        }

        /* renamed from: G */
        private synchronized boolean m30745G() {
            if (!this.f10692f && this.f10695i && !this.f10696j && CloseableReference.m31727Q(this.f10693g)) {
                this.f10696j = true;
                return true;
            }
            return false;
        }

        /* renamed from: H */
        private boolean m30744H(AbstractC13063c abstractC13063c) {
            return abstractC13063c instanceof C13064d;
        }

        /* renamed from: I */
        private void m30743I() {
            C3801k0.this.f10688c.execute(new RunnableC3805b());
        }

        /* renamed from: J */
        private void m30742J(CloseableReference<AbstractC13063c> closeableReference, int i) {
            synchronized (this) {
                if (this.f10692f) {
                    return;
                }
                CloseableReference<AbstractC13063c> closeableReference2 = this.f10693g;
                this.f10693g = CloseableReference.m31717s(closeableReference);
                this.f10694h = i;
                this.f10695i = true;
                boolean m30745G = m30745G();
                CloseableReference.m31715v(closeableReference2);
                if (m30745G) {
                    m30743I();
                }
            }
        }

        /* renamed from: w */
        public void m30734w() {
            boolean m30745G;
            synchronized (this) {
                this.f10696j = false;
                m30745G = m30745G();
            }
            if (m30745G) {
                m30743I();
            }
        }

        /* renamed from: x */
        private boolean m30733x() {
            synchronized (this) {
                if (this.f10692f) {
                    return false;
                }
                CloseableReference<AbstractC13063c> closeableReference = this.f10693g;
                this.f10693g = null;
                this.f10692f = true;
                CloseableReference.m31715v(closeableReference);
                return true;
            }
        }

        /* renamed from: y */
        public void m30732y(CloseableReference<AbstractC13063c> closeableReference, int i) {
            C13379j.m2682b(Boolean.valueOf(CloseableReference.m31727Q(closeableReference)));
            if (!m30744H(closeableReference.m31730D())) {
                m30748D(closeableReference, i);
                return;
            }
            this.f10689c.mo1810d(this.f10690d, "PostprocessorProducer");
            try {
                try {
                    CloseableReference<AbstractC13063c> m30746F = m30746F(closeableReference.m31730D());
                    InterfaceC3820n0 interfaceC3820n0 = this.f10689c;
                    ProducerContext producerContext = this.f10690d;
                    interfaceC3820n0.mo1807j(producerContext, "PostprocessorProducer", m30731z(interfaceC3820n0, producerContext, this.f10691e));
                    m30748D(m30746F, i);
                    CloseableReference.m31715v(m30746F);
                } catch (Exception e) {
                    InterfaceC3820n0 interfaceC3820n02 = this.f10689c;
                    ProducerContext producerContext2 = this.f10690d;
                    interfaceC3820n02.mo1806k(producerContext2, "PostprocessorProducer", e, m30731z(interfaceC3820n02, producerContext2, this.f10691e));
                    m30749C(e);
                    CloseableReference.m31715v(null);
                }
            } catch (Throwable th2) {
                CloseableReference.m31715v(null);
                throw th2;
            }
        }

        /* renamed from: z */
        private Map<String, String> m30731z(InterfaceC3820n0 interfaceC3820n0, ProducerContext producerContext, Postprocessor postprocessor) {
            if (!interfaceC3820n0.mo1809f(producerContext, "PostprocessorProducer")) {
                return null;
            }
            return C13372f.m2695of("Postprocessor", postprocessor.getName());
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3761b
        /* renamed from: E */
        public void mo30605h(CloseableReference<AbstractC13063c> closeableReference, int i) {
            if (!CloseableReference.m31727Q(closeableReference)) {
                if (AbstractC3761b.m30889d(i)) {
                    m30748D(null, i);
                    return;
                }
                return;
            }
            m30742J(closeableReference, i);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3821o, com.facebook.imagepipeline.producers.AbstractC3761b
        /* renamed from: f */
        protected void mo30625f() {
            m30750B();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3821o, com.facebook.imagepipeline.producers.AbstractC3761b
        /* renamed from: g */
        protected void mo30606g(Throwable th2) {
            m30749C(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.producers.k0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C3806c extends AbstractC3821o<CloseableReference<AbstractC13063c>, CloseableReference<AbstractC13063c>> implements InterfaceC3873b {

        /* renamed from: c */
        private boolean f10701c;

        /* renamed from: d */
        private CloseableReference<AbstractC13063c> f10702d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.facebook.imagepipeline.producers.k0$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public class C3807a extends C3772e {

            /* renamed from: a */
            final /* synthetic */ C3801k0 f10704a;

            C3807a(C3801k0 c3801k0) {
                C3806c.this = r1;
                this.f10704a = c3801k0;
            }

            @Override // com.facebook.imagepipeline.producers.InterfaceC3817m0
            /* renamed from: b */
            public void mo30638b() {
                if (C3806c.this.m30729q()) {
                    C3806c.this.m30692o().mo30892a();
                }
            }
        }

        /* renamed from: q */
        public boolean m30729q() {
            synchronized (this) {
                if (this.f10701c) {
                    return false;
                }
                CloseableReference<AbstractC13063c> closeableReference = this.f10702d;
                this.f10702d = null;
                this.f10701c = true;
                CloseableReference.m31715v(closeableReference);
                return true;
            }
        }

        /* renamed from: s */
        private void m30727s(CloseableReference<AbstractC13063c> closeableReference) {
            synchronized (this) {
                if (this.f10701c) {
                    return;
                }
                CloseableReference<AbstractC13063c> closeableReference2 = this.f10702d;
                this.f10702d = CloseableReference.m31717s(closeableReference);
                CloseableReference.m31715v(closeableReference2);
            }
        }

        /* renamed from: t */
        private void m30726t() {
            synchronized (this) {
                if (this.f10701c) {
                    return;
                }
                CloseableReference<AbstractC13063c> m31717s = CloseableReference.m31717s(this.f10702d);
                try {
                    m30692o().mo30891b(m31717s, 0);
                } finally {
                    CloseableReference.m31715v(m31717s);
                }
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3821o, com.facebook.imagepipeline.producers.AbstractC3761b
        /* renamed from: f */
        protected void mo30625f() {
            if (m30729q()) {
                m30692o().mo30892a();
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3821o, com.facebook.imagepipeline.producers.AbstractC3761b
        /* renamed from: g */
        protected void mo30606g(Throwable th2) {
            if (m30729q()) {
                m30692o().onFailure(th2);
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3761b
        /* renamed from: r */
        public void mo30605h(CloseableReference<AbstractC13063c> closeableReference, int i) {
            if (AbstractC3761b.m30888e(i)) {
                return;
            }
            m30727s(closeableReference);
            m30726t();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private C3806c(C3803b c3803b, InterfaceC3872a interfaceC3872a, ProducerContext producerContext) {
            super(c3803b);
            C3801k0.this = r1;
            this.f10701c = false;
            this.f10702d = null;
            interfaceC3872a.m30559a(this);
            producerContext.mo30860c(new C3807a(r1));
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.k0$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C3808d extends AbstractC3821o<CloseableReference<AbstractC13063c>, CloseableReference<AbstractC13063c>> {
        @Override // com.facebook.imagepipeline.producers.AbstractC3761b
        /* renamed from: p */
        public void mo30605h(CloseableReference<AbstractC13063c> closeableReference, int i) {
            if (AbstractC3761b.m30888e(i)) {
                return;
            }
            m30692o().mo30891b(closeableReference, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private C3808d(C3803b c3803b) {
            super(c3803b);
            C3801k0.this = r1;
        }
    }

    public C3801k0(InterfaceC3810l0<CloseableReference<AbstractC13063c>> interfaceC3810l0, PlatformBitmapFactory platformBitmapFactory, Executor executor) {
        this.f10686a = (InterfaceC3810l0) C13379j.m2677g(interfaceC3810l0);
        this.f10687b = platformBitmapFactory;
        this.f10688c = (Executor) C13379j.m2677g(executor);
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3810l0
    /* renamed from: b */
    public void mo30610b(Consumer<CloseableReference<AbstractC13063c>> consumer, ProducerContext producerContext) {
        Consumer<CloseableReference<AbstractC13063c>> c3808d;
        InterfaceC3820n0 mo30854i = producerContext.mo30854i();
        Postprocessor postprocessor = producerContext.mo30851l().getPostprocessor();
        C3803b c3803b = new C3803b(consumer, mo30854i, postprocessor, producerContext);
        if (postprocessor instanceof InterfaceC3872a) {
            c3808d = new C3806c(c3803b, (InterfaceC3872a) postprocessor, producerContext);
        } else {
            c3808d = new C3808d(c3803b);
        }
        this.f10686a.mo30610b(c3808d, producerContext);
    }
}