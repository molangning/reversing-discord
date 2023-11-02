package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.InterfaceC9936c;
import p014aj.C0213a;
import p045cj.AbstractC2638s1;
import p045cj.C2595h2;
import pf.C11549b0;
import pf.C11552c0;

@Metadata(m14358d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u0005*\u00020\u0002H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u0002H\u0014ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0014J-\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0006H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aø\u0001\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001d"}, m14357d2 = {"Lkotlinx/serialization/internal/j;", "Lkotlinx/serialization/KSerializer;", "Lpf/c0;", "Lcj/s1;", "Lpf/b0;", "Lcj/h2;", "", "v", "([I)I", "y", "([I)Lcj/h2;", "w", "()[I", "Lkotlinx/serialization/encoding/c;", "decoder", "index", "builder", "", "checkIndex", "", "x", "Lkotlinx/serialization/encoding/CompositeEncoder;", "encoder", "content", "size", "z", "(Lkotlinx/serialization/encoding/CompositeEncoder;[II)V", "<init>", "()V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.internal.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9951j extends AbstractC2638s1<C11549b0, C11552c0, C2595h2> {

    /* renamed from: c */
    public static final C9951j f25827c = new C9951j();

    private C9951j() {
        super(C0213a.m40943H(C11549b0.f30055k));
    }

    @Override // p045cj.AbstractC2556a
    /* renamed from: e */
    public /* bridge */ /* synthetic */ int mo12791e(Object obj) {
        return m12801v(((C11552c0) obj).m7666z());
    }

    @Override // p045cj.AbstractC2556a
    /* renamed from: k */
    public /* bridge */ /* synthetic */ Object mo12789k(Object obj) {
        return m12798y(((C11552c0) obj).m7666z());
    }

    @Override // p045cj.AbstractC2638s1
    /* renamed from: r */
    public /* bridge */ /* synthetic */ C11552c0 mo12788r() {
        return C11552c0.m7681a(m12800w());
    }

    @Override // p045cj.AbstractC2638s1
    /* renamed from: u */
    public /* bridge */ /* synthetic */ void mo12787u(CompositeEncoder compositeEncoder, C11552c0 c11552c0, int i) {
        m12797z(compositeEncoder, c11552c0.m7666z(), i);
    }

    /* renamed from: v */
    protected int m12801v(int[] collectionSize) {
        C9612q.m13917h(collectionSize, "$this$collectionSize");
        return C11552c0.m7672t(collectionSize);
    }

    /* renamed from: w */
    protected int[] m12800w() {
        return C11552c0.m7680e(0);
    }

    @Override // p045cj.AbstractC2636s, p045cj.AbstractC2556a
    /* renamed from: x */
    public void mo12790h(InterfaceC9936c decoder, int i, C2595h2 builder, boolean z) {
        C9612q.m13917h(decoder, "decoder");
        C9612q.m13917h(builder, "builder");
        builder.m32894e(C11549b0.m7686b(decoder.mo12864r(getDescriptor(), i).mo12918h()));
    }

    /* renamed from: y */
    protected C2595h2 m12798y(int[] toBuilder) {
        C9612q.m13917h(toBuilder, "$this$toBuilder");
        return new C2595h2(toBuilder, null);
    }

    /* renamed from: z */
    protected void m12797z(CompositeEncoder encoder, int[] content, int i) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(content, "content");
        for (int i2 = 0; i2 < i; i2++) {
            encoder.mo12898e(getDescriptor(), i2).mo12908A(C11552c0.m7674r(content, i2));
        }
    }
}