package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p088ej.AbstractC6257c;

@Metadata(m14358d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0006H\u0017J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bH&J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bH&J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bH&J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bH&J\u0018\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bH&J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bH&J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bH&J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bH&J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bH&J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bH&J?\u0010\"\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\"\u0010#JG\u0010$\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001e*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\b2\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00018\u0000H'¢\u0006\u0004\b$\u0010#R\u0014\u0010(\u001a\u00020%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, m14357d2 = {"Lkotlinx/serialization/encoding/c;", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "c", "", "p", "", "o", "k", "index", "C", "", "B", "", "A", "", "E", "i", "", "f", "", "u", "", "F", "", "m", "Lkotlinx/serialization/encoding/Decoder;", "r", "T", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "previousValue", "y", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;", "n", "Lej/c;", "a", "()Lej/c;", "serializersModule", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.encoding.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public interface InterfaceC9936c {

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: kotlinx.serialization.encoding.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9937a {
        /* renamed from: a */
        public static int m12861a(InterfaceC9936c interfaceC9936c, SerialDescriptor descriptor) {
            C9612q.m13917h(descriptor, "descriptor");
            return -1;
        }

        /* renamed from: b */
        public static boolean m12860b(InterfaceC9936c interfaceC9936c) {
            return false;
        }

        /* renamed from: c */
        public static /* synthetic */ Object m12859c(InterfaceC9936c interfaceC9936c, SerialDescriptor serialDescriptor, int i, DeserializationStrategy deserializationStrategy, Object obj, int i2, Object obj2) {
            if (obj2 == null) {
                if ((i2 & 8) != 0) {
                    obj = null;
                }
                return interfaceC9936c.mo12862y(serialDescriptor, i, deserializationStrategy, obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
        }
    }

    /* renamed from: A */
    char mo12878A(SerialDescriptor serialDescriptor, int i);

    /* renamed from: B */
    byte mo12877B(SerialDescriptor serialDescriptor, int i);

    /* renamed from: C */
    boolean mo12876C(SerialDescriptor serialDescriptor, int i);

    /* renamed from: E */
    short mo12875E(SerialDescriptor serialDescriptor, int i);

    /* renamed from: F */
    double mo12874F(SerialDescriptor serialDescriptor, int i);

    /* renamed from: a */
    AbstractC6257c mo12873a();

    /* renamed from: c */
    void mo12872c(SerialDescriptor serialDescriptor);

    /* renamed from: f */
    long mo12871f(SerialDescriptor serialDescriptor, int i);

    /* renamed from: i */
    int mo12870i(SerialDescriptor serialDescriptor, int i);

    /* renamed from: k */
    int mo12869k(SerialDescriptor serialDescriptor);

    /* renamed from: m */
    String mo12868m(SerialDescriptor serialDescriptor, int i);

    /* renamed from: n */
    <T> T mo12867n(SerialDescriptor serialDescriptor, int i, DeserializationStrategy<? extends T> deserializationStrategy, T t);

    /* renamed from: o */
    int mo12866o(SerialDescriptor serialDescriptor);

    /* renamed from: p */
    boolean mo12865p();

    /* renamed from: r */
    Decoder mo12864r(SerialDescriptor serialDescriptor, int i);

    /* renamed from: u */
    float mo12863u(SerialDescriptor serialDescriptor, int i);

    /* renamed from: y */
    <T> T mo12862y(SerialDescriptor serialDescriptor, int i, DeserializationStrategy<? extends T> deserializationStrategy, T t);
}