package p208l3;

import android.content.Context;
import com.facebook.common.internal.Supplier;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.imagepipeline.core.C3712b;
import com.facebook.imagepipeline.core.ImagePipeline;
import java.util.Set;
import p114g4.InterfaceC6545b;
import p240n3.InterfaceC10496f;
import p277p3.AbstractC11375a;
import p359u2.C12827h;

/* renamed from: l3.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10036d implements Supplier<PipelineDraweeControllerBuilder> {

    /* renamed from: a */
    private final Context f26082a;

    /* renamed from: b */
    private final ImagePipeline f26083b;

    /* renamed from: c */
    private final C10037e f26084c;

    /* renamed from: d */
    private final Set<ControllerListener> f26085d;

    /* renamed from: e */
    private final Set<InterfaceC6545b> f26086e;

    /* renamed from: f */
    private final InterfaceC10496f f26087f;

    public C10036d(Context context, C10034b c10034b) {
        this(context, C3712b.m31043l(), c10034b);
    }

    @Override // com.facebook.common.internal.Supplier
    /* renamed from: a */
    public PipelineDraweeControllerBuilder get() {
        return new PipelineDraweeControllerBuilder(this.f26082a, this.f26084c, this.f26083b, this.f26085d, this.f26086e).m31652M(this.f26087f);
    }

    public C10036d(Context context, C3712b c3712b, C10034b c10034b) {
        this(context, c3712b, null, null, c10034b);
    }

    public C10036d(Context context, C3712b c3712b, Set<ControllerListener> set, Set<InterfaceC6545b> set2, C10034b c10034b) {
        this.f26082a = context;
        ImagePipeline m31045j = c3712b.m31045j();
        this.f26083b = m31045j;
        C10037e c10037e = new C10037e();
        this.f26084c = c10037e;
        c10037e.m12504a(context.getResources(), AbstractC11375a.m8206b(), c3712b.m31053b(context), C12827h.m3853g(), m31045j.m31173j(), null, null);
        this.f26085d = set;
        this.f26086e = set2;
        this.f26087f = null;
    }
}