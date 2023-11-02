package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.C9598i0;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.InterfaceC9936c;
import p014aj.C0213a;
import p045cj.AbstractC2638s1;
import p045cj.C2658y1;

@Metadata(m14358d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0017\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0014J\f\u0010\b\u001a\u00020\u0005*\u00020\u0002H\u0014J\b\u0010\t\u001a\u00020\u0002H\u0014J(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0014J \u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0014¨\u0006\u0019"}, m14357d2 = {"Lkotlinx/serialization/internal/h;", "Lkotlinx/serialization/KSerializer;", "", "Lcj/s1;", "", "Lcj/y1;", "", "v", "y", "w", "Lkotlinx/serialization/encoding/c;", "decoder", "index", "builder", "", "checkIndex", "", "x", "Lkotlinx/serialization/encoding/CompositeEncoder;", "encoder", "content", "size", "z", "<init>", "()V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.internal.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9949h extends AbstractC2638s1<Short, short[], C2658y1> {

    /* renamed from: c */
    public static final C9949h f25825c = new C9949h();

    private C9949h() {
        super(C0213a.m40947D(C9598i0.f25347a));
    }

    @Override // p045cj.AbstractC2556a
    /* renamed from: v */
    public int mo12791e(short[] sArr) {
        C9612q.m13917h(sArr, "<this>");
        return sArr.length;
    }

    @Override // p045cj.AbstractC2638s1
    /* renamed from: w */
    public short[] mo12788r() {
        return new short[0];
    }

    @Override // p045cj.AbstractC2636s, p045cj.AbstractC2556a
    /* renamed from: x */
    public void mo12790h(InterfaceC9936c decoder, int i, C2658y1 builder, boolean z) {
        C9612q.m13917h(decoder, "decoder");
        C9612q.m13917h(builder, "builder");
        builder.m32764e(decoder.mo12875E(getDescriptor(), i));
    }

    @Override // p045cj.AbstractC2556a
    /* renamed from: y */
    public C2658y1 mo12789k(short[] sArr) {
        C9612q.m13917h(sArr, "<this>");
        return new C2658y1(sArr);
    }

    @Override // p045cj.AbstractC2638s1
    /* renamed from: z */
    public void mo12787u(CompositeEncoder encoder, short[] content, int i) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.mo12907B(getDescriptor(), i2, content[i2]);
        }
    }
}