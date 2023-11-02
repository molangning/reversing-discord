package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p088ej.AbstractC6257c;
import p470zi.InterfaceC14279h;

@Metadata(m14358d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0017J\b\u0010\u0004\u001a\u00020\u0002H'J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\bH&J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\nH&J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH&J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000eH&J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0010H&J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0012H&J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0014H&J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0016H&J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000eH&J\u0010\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0018H&J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u0018H&J\u0018\u0010!\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u000eH\u0016J+\u0010%\u001a\u00020\u0002\"\u0004\b\u0000\u0010\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, m14357d2 = {"Lkotlinx/serialization/encoding/Encoder;", "", "", "v", "o", "", "value", "r", "", "g", "", "q", "", "u", "", "A", "", "m", "", "t", "", "f", "", "F", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "enumDescriptor", "index", "k", "descriptor", "l", "Lkotlinx/serialization/encoding/CompositeEncoder;", "b", "collectionSize", "j", "T", "Lzi/h;", "serializer", "h", "(Lzi/h;Ljava/lang/Object;)V", "Lej/c;", "a", "()Lej/c;", "serializersModule", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public interface Encoder {

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: kotlinx.serialization.encoding.Encoder$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9933a {
        /* renamed from: a */
        public static CompositeEncoder m12929a(Encoder encoder, SerialDescriptor descriptor, int i) {
            C9612q.m13917h(descriptor, "descriptor");
            return encoder.mo12900b(descriptor);
        }

        /* renamed from: b */
        public static void m12928b(Encoder encoder) {
        }

        /* renamed from: c */
        public static <T> void m12927c(Encoder encoder, InterfaceC14279h<? super T> serializer, T t) {
            C9612q.m13917h(serializer, "serializer");
            if (serializer.getDescriptor().mo12689b()) {
                encoder.mo12895h(serializer, t);
            } else if (t == null) {
                encoder.mo12930o();
            } else {
                encoder.mo12883v();
                encoder.mo12895h(serializer, t);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: d */
        public static <T> void m12926d(Encoder encoder, InterfaceC14279h<? super T> serializer, T t) {
            C9612q.m13917h(serializer, "serializer");
            serializer.serialize(encoder, t);
        }
    }

    /* renamed from: A */
    void mo12908A(int i);

    /* renamed from: F */
    void mo12903F(String str);

    /* renamed from: a */
    AbstractC6257c mo12932a();

    /* renamed from: b */
    CompositeEncoder mo12900b(SerialDescriptor serialDescriptor);

    /* renamed from: f */
    void mo12897f(double d);

    /* renamed from: g */
    void mo12896g(byte b);

    /* renamed from: h */
    <T> void mo12895h(InterfaceC14279h<? super T> interfaceC14279h, T t);

    /* renamed from: j */
    CompositeEncoder mo12893j(SerialDescriptor serialDescriptor, int i);

    /* renamed from: k */
    void mo12931k(SerialDescriptor serialDescriptor, int i);

    /* renamed from: l */
    Encoder mo12892l(SerialDescriptor serialDescriptor);

    /* renamed from: m */
    void mo12891m(long j);

    /* renamed from: o */
    void mo12930o();

    /* renamed from: q */
    void mo12888q(short s);

    /* renamed from: r */
    void mo12887r(boolean z);

    /* renamed from: t */
    void mo12885t(float f);

    /* renamed from: u */
    void mo12884u(char c);

    /* renamed from: v */
    void mo12883v();
}
