package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.C9601k;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.InterfaceC9936c;
import p014aj.C0213a;
import p045cj.AbstractC2638s1;
import p045cj.C2573d0;

@Metadata(m14358d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0014J\f\u0010\b\u001a\u00020\u0005*\u00020\u0002H\u0014J\b\u0010\t\u001a\u00020\u0002H\u0014J(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0014J \u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0014¨\u0006\u0019"}, m14357d2 = {"Lkotlinx/serialization/internal/e;", "Lkotlinx/serialization/KSerializer;", "", "Lcj/s1;", "", "Lcj/d0;", "", "v", "y", "w", "Lkotlinx/serialization/encoding/c;", "decoder", "index", "builder", "", "checkIndex", "", "x", "Lkotlinx/serialization/encoding/CompositeEncoder;", "encoder", "content", "size", "z", "<init>", "()V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.internal.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9946e extends AbstractC2638s1<Float, float[], C2573d0> {

    /* renamed from: c */
    public static final C9946e f25822c = new C9946e();

    private C9946e() {
        super(C0213a.m40950A(C9601k.f25350a));
    }

    @Override // p045cj.AbstractC2556a
    /* renamed from: v */
    public int mo12791e(float[] fArr) {
        C9612q.m13917h(fArr, "<this>");
        return fArr.length;
    }

    @Override // p045cj.AbstractC2638s1
    /* renamed from: w */
    public float[] mo12788r() {
        return new float[0];
    }

    @Override // p045cj.AbstractC2636s, p045cj.AbstractC2556a
    /* renamed from: x */
    public void mo12790h(InterfaceC9936c decoder, int i, C2573d0 builder, boolean z) {
        C9612q.m13917h(decoder, "decoder");
        C9612q.m13917h(builder, "builder");
        builder.m32935e(decoder.mo12863u(getDescriptor(), i));
    }

    @Override // p045cj.AbstractC2556a
    /* renamed from: y */
    public C2573d0 mo12789k(float[] fArr) {
        C9612q.m13917h(fArr, "<this>");
        return new C2573d0(fArr);
    }

    @Override // p045cj.AbstractC2638s1
    /* renamed from: z */
    public void mo12787u(CompositeEncoder encoder, float[] content, int i) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.mo12886s(getDescriptor(), i2, content[i2]);
        }
    }
}