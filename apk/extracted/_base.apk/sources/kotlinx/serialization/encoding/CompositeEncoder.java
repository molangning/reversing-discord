package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p470zi.InterfaceC14279h;

@Metadata(m14358d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0017J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH&J \u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\fH&J \u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000eH&J \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0010H&J \u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H&J \u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0013H&J \u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0015H&J \u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0017H&J \u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0019H&J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J;\u0010 \u001a\u00020\u0004\"\u0004\b\u0000\u0010\u001d2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010\n\u001a\u00028\u0000H&¢\u0006\u0004\b \u0010!JA\u0010\"\u001a\u00020\u0004\"\b\b\u0000\u0010\u001d*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\b\u0010\n\u001a\u0004\u0018\u00018\u0000H'¢\u0006\u0004\b\"\u0010!¨\u0006#"}, m14357d2 = {"Lkotlinx/serialization/encoding/CompositeEncoder;", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "c", "", "index", "", "z", "value", "x", "", "p", "", "B", "", "n", "w", "", "D", "", "s", "", "C", "", "y", "Lkotlinx/serialization/encoding/Encoder;", "e", "T", "Lzi/h;", "serializer", "i", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILzi/h;Ljava/lang/Object;)V", "E", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public interface CompositeEncoder {

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: kotlinx.serialization.encoding.CompositeEncoder$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9931a {
        /* renamed from: a */
        public static boolean m12934a(CompositeEncoder compositeEncoder, SerialDescriptor descriptor, int i) {
            C9612q.m13917h(descriptor, "descriptor");
            return true;
        }
    }

    /* renamed from: B */
    void mo12907B(SerialDescriptor serialDescriptor, int i, short s);

    /* renamed from: C */
    void mo12906C(SerialDescriptor serialDescriptor, int i, double d);

    /* renamed from: D */
    void mo12905D(SerialDescriptor serialDescriptor, int i, long j);

    /* renamed from: E */
    <T> void mo12904E(SerialDescriptor serialDescriptor, int i, InterfaceC14279h<? super T> interfaceC14279h, T t);

    /* renamed from: c */
    void mo12899c(SerialDescriptor serialDescriptor);

    /* renamed from: e */
    Encoder mo12898e(SerialDescriptor serialDescriptor, int i);

    /* renamed from: i */
    <T> void mo12894i(SerialDescriptor serialDescriptor, int i, InterfaceC14279h<? super T> interfaceC14279h, T t);

    /* renamed from: n */
    void mo12890n(SerialDescriptor serialDescriptor, int i, char c);

    /* renamed from: p */
    void mo12889p(SerialDescriptor serialDescriptor, int i, byte b);

    /* renamed from: s */
    void mo12886s(SerialDescriptor serialDescriptor, int i, float f);

    /* renamed from: w */
    void mo12882w(SerialDescriptor serialDescriptor, int i, int i2);

    /* renamed from: x */
    void mo12881x(SerialDescriptor serialDescriptor, int i, boolean z);

    /* renamed from: y */
    void mo12880y(SerialDescriptor serialDescriptor, int i, String str);

    /* renamed from: z */
    boolean mo12879z(SerialDescriptor serialDescriptor, int i);
}
