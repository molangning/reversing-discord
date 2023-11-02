package com.facebook.drawee.backends.pipeline;

import android.content.Context;
import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.util.Set;
import p006a5.C0025b;
import p114g4.InterfaceC6545b;
import p208l3.C10037e;
import p240n3.InterfaceC10492b;
import p240n3.InterfaceC10496f;
import p278p4.InterfaceC11392f;
import p361u4.InterfaceC12830a;
import p380v4.AbstractC13063c;
import p394w2.C13371e;
import p394w2.C13382m;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class PipelineDraweeControllerBuilder extends AbstractDraweeControllerBuilder<PipelineDraweeControllerBuilder, ImageRequest, CloseableReference<AbstractC13063c>, ImageInfo> {

    /* renamed from: s */
    private final ImagePipeline f9739s;

    /* renamed from: t */
    private final C10037e f9740t;

    /* renamed from: u */
    private C13371e<InterfaceC12830a> f9741u;

    /* renamed from: v */
    private InterfaceC10492b f9742v;

    /* renamed from: w */
    private InterfaceC10496f f9743w;

    /* renamed from: com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static /* synthetic */ class C3586a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9744a;

        static {
            int[] iArr = new int[AbstractDraweeControllerBuilder.EnumC3590c.values().length];
            f9744a = iArr;
            try {
                iArr[AbstractDraweeControllerBuilder.EnumC3590c.FULL_FETCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9744a[AbstractDraweeControllerBuilder.EnumC3590c.DISK_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9744a[AbstractDraweeControllerBuilder.EnumC3590c.BITMAP_MEMORY_CACHE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public PipelineDraweeControllerBuilder(Context context, C10037e c10037e, ImagePipeline imagePipeline, Set<ControllerListener> set, Set<InterfaceC6545b> set2) {
        super(context, set, set2);
        this.f9739s = imagePipeline;
        this.f9740t = c10037e;
    }

    /* renamed from: H */
    public static ImageRequest.RequestLevel m31657H(AbstractDraweeControllerBuilder.EnumC3590c enumC3590c) {
        int i = C3586a.f9744a[enumC3590c.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return ImageRequest.RequestLevel.BITMAP_MEMORY_CACHE;
                }
                throw new RuntimeException("Cache level" + enumC3590c + "is not supported. ");
            }
            return ImageRequest.RequestLevel.DISK_CACHE;
        }
        return ImageRequest.RequestLevel.FULL_FETCH;
    }

    /* renamed from: I */
    private CacheKey m31656I() {
        ImageRequest m31610n = m31610n();
        InterfaceC11392f m31172k = this.f9739s.m31172k();
        if (m31172k != null && m31610n != null) {
            if (m31610n.getPostprocessor() != null) {
                return m31172k.mo8150c(m31610n, m31618f());
            }
            return m31172k.mo8152a(m31610n, m31618f());
        }
        return null;
    }

    @Override // com.facebook.drawee.controller.AbstractDraweeControllerBuilder
    /* renamed from: J */
    public DataSource<CloseableReference<AbstractC13063c>> mo31615i(DraweeController draweeController, String str, ImageRequest imageRequest, Object obj, AbstractDraweeControllerBuilder.EnumC3590c enumC3590c) {
        return this.f9739s.m31176g(imageRequest, obj, m31657H(enumC3590c), m31654K(draweeController), str);
    }

    /* renamed from: K */
    protected RequestListener m31654K(DraweeController draweeController) {
        if (draweeController instanceof C3587a) {
            return ((C3587a) draweeController).m31642m0();
        }
        return null;
    }

    @Override // com.facebook.drawee.controller.AbstractDraweeControllerBuilder
    /* renamed from: L */
    public C3587a mo31601w() {
        C3587a m12502c;
        if (C0025b.m41375d()) {
            C0025b.m41378a("PipelineDraweeControllerBuilder#obtainController");
        }
        try {
            DraweeController m31608p = m31608p();
            String m31619e = AbstractDraweeControllerBuilder.m31619e();
            if (m31608p instanceof C3587a) {
                m12502c = (C3587a) m31608p;
            } else {
                m12502c = this.f9740t.m12502c();
            }
            m12502c.m31640o0(m31600x(m12502c, m31619e), m31619e, m31656I(), m31618f(), this.f9741u, this.f9742v);
            m12502c.m31639p0(this.f9743w, this, C13382m.f34465b);
            return m12502c;
        } finally {
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
        }
    }

    /* renamed from: M */
    public PipelineDraweeControllerBuilder m31652M(InterfaceC10496f interfaceC10496f) {
        this.f9743w = interfaceC10496f;
        return m31606r();
    }

    @Override // p379v3.InterfaceC13060b
    /* renamed from: N */
    public PipelineDraweeControllerBuilder mo3374a(Uri uri) {
        if (uri == null) {
            return (PipelineDraweeControllerBuilder) super.m31625D(null);
        }
        return (PipelineDraweeControllerBuilder) super.m31625D(ImageRequestBuilder.m30567s(uri).m30590F(RotationOptions.m31188b()).m30585a());
    }

    /* renamed from: O */
    public PipelineDraweeControllerBuilder m31650O(String str) {
        if (str != null && !str.isEmpty()) {
            return mo3374a(Uri.parse(str));
        }
        return (PipelineDraweeControllerBuilder) super.m31625D(ImageRequest.fromUri(str));
    }
}