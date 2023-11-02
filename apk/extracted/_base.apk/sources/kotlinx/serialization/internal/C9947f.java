package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.C9611p;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.InterfaceC9936c;
import p014aj.C0213a;
import p045cj.AbstractC2638s1;
import p045cj.C2611l0;

@Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\f\u0010\u0006\u001a\u00020\u0004*\u00020\u0002H\u0014J\f\u0010\u0007\u001a\u00020\u0005*\u00020\u0002H\u0014J\b\u0010\b\u001a\u00020\u0002H\u0014J(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0014J \u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0004H\u0014¨\u0006\u0018"}, m14357d2 = {"Lkotlinx/serialization/internal/f;", "Lkotlinx/serialization/KSerializer;", "", "Lcj/s1;", "", "Lcj/l0;", "v", "y", "w", "Lkotlinx/serialization/encoding/c;", "decoder", "index", "builder", "", "checkIndex", "", "x", "Lkotlinx/serialization/encoding/CompositeEncoder;", "encoder", "content", "size", "z", "<init>", "()V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.internal.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9947f extends AbstractC2638s1<Integer, int[], C2611l0> {

    /* renamed from: c */
    public static final C9947f f25823c = new C9947f();

    private C9947f() {
        super(C0213a.m40949B(C9611p.f25354a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p045cj.AbstractC2556a
    /* renamed from: v */
    public int mo12791e(int[] iArr) {
        C9612q.m13917h(iArr, "<this>");
        return iArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p045cj.AbstractC2638s1
    /* renamed from: w */
    public int[] mo12788r() {
        return new int[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p045cj.AbstractC2636s, p045cj.AbstractC2556a
    /* renamed from: x */
    public void mo12790h(InterfaceC9936c decoder, int i, C2611l0 builder, boolean z) {
        C9612q.m13917h(decoder, "decoder");
        C9612q.m13917h(builder, "builder");
        builder.m32870e(decoder.mo12870i(getDescriptor(), i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p045cj.AbstractC2556a
    /* renamed from: y */
    public C2611l0 mo12789k(int[] iArr) {
        C9612q.m13917h(iArr, "<this>");
        return new C2611l0(iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p045cj.AbstractC2638s1
    /* renamed from: z */
    public void mo12787u(CompositeEncoder encoder, int[] content, int i) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.mo12882w(getDescriptor(), i2, content[i2]);
        }
    }
}
