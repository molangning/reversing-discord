package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(m14358d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H'J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'J\b\u0010\u0006\u001a\u00020\u0002H&J\b\u0010\b\u001a\u00020\u0007H&J\b\u0010\n\u001a\u00020\tH&J\b\u0010\f\u001a\u00020\u000bH&J\b\u0010\u000e\u001a\u00020\rH&J\b\u0010\u0010\u001a\u00020\u000fH&J\b\u0010\u0012\u001a\u00020\u0011H&J\b\u0010\u0014\u001a\u00020\u0013H&J\b\u0010\u0016\u001a\u00020\u0015H&J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H&J\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0017H&J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u0017H&J#\u0010!\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016¢\u0006\u0004\b!\u0010\"¨\u0006#"}, m14357d2 = {"Lkotlinx/serialization/encoding/Decoder;", "", "", "D", "", "j", "w", "", "H", "", "s", "", "x", "", "h", "", "l", "", "t", "", "v", "", "z", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "enumDescriptor", "e", "descriptor", "q", "Lkotlinx/serialization/encoding/c;", "b", "T", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "G", "(Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public interface Decoder {

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: kotlinx.serialization.encoding.Decoder$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9932a {
        /* renamed from: a */
        public static <T> T m12933a(Decoder decoder, DeserializationStrategy<? extends T> deserializer) {
            C9612q.m13917h(deserializer, "deserializer");
            return deserializer.deserialize(decoder);
        }
    }

    /* renamed from: D */
    boolean mo12925D();

    /* renamed from: G */
    <T> T mo12924G(DeserializationStrategy<? extends T> deserializationStrategy);

    /* renamed from: H */
    byte mo12923H();

    /* renamed from: b */
    InterfaceC9936c mo12920b(SerialDescriptor serialDescriptor);

    /* renamed from: e */
    int mo12919e(SerialDescriptor serialDescriptor);

    /* renamed from: h */
    int mo12918h();

    /* renamed from: j */
    Void mo12917j();

    /* renamed from: l */
    long mo12916l();

    /* renamed from: q */
    Decoder mo12915q(SerialDescriptor serialDescriptor);

    /* renamed from: s */
    short mo12914s();

    /* renamed from: t */
    float mo12913t();

    /* renamed from: v */
    double mo12912v();

    /* renamed from: w */
    boolean mo12911w();

    /* renamed from: x */
    char mo12910x();

    /* renamed from: z */
    String mo12909z();
}