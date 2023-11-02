package p045cj;

import bj.AbstractC2345i;
import bj.C2319a;
import bj.C2340g;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9536e;
import kotlin.collections.C9545j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC9936c;
import p470zi.C14278g;
import pf.C11577n;
import pf.EnumC11580p;

@Metadata(m14358d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u001e\u0010\u001fB'\b\u0011\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u0010\u001a\u00028\u0000\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120 ¢\u0006\u0004\b\u001e\u0010\"J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006#"}, m14357d2 = {"Lcj/h1;", "", "T", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "a", "Ljava/lang/Object;", "objectInstance", "", "", "b", "Ljava/util/List;", "_annotations", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "Lkotlin/Lazy;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "serialName", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "classAnnotations", "(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.h1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2592h1<T> implements KSerializer<T> {

    /* renamed from: a */
    private final T f7058a;

    /* renamed from: b */
    private List<? extends Annotation> f7059b;

    /* renamed from: c */
    private final Lazy f7060c;

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"", "T", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: cj.h1$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C2593a extends AbstractC9614s implements Function0<SerialDescriptor> {

        /* renamed from: j */
        final /* synthetic */ String f7061j;

        /* renamed from: k */
        final /* synthetic */ C2592h1<T> f7062k;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"", "T", "Lbj/a;", "", "a", "(Lbj/a;)V"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: cj.h1$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C2594a extends AbstractC9614s implements Function1<C2319a, Unit> {

            /* renamed from: j */
            final /* synthetic */ C2592h1<T> f7063j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2594a(C2592h1<T> c2592h1) {
                super(1);
                this.f7063j = c2592h1;
            }

            /* renamed from: a */
            public final void m32895a(C2319a buildSerialDescriptor) {
                C9612q.m13917h(buildSerialDescriptor, "$this$buildSerialDescriptor");
                buildSerialDescriptor.m33648h(((C2592h1) this.f7063j).f7059b);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C2319a c2319a) {
                m32895a(c2319a);
                return Unit.f25302a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2593a(String str, C2592h1<T> c2592h1) {
            super(0);
            this.f7061j = str;
            this.f7062k = c2592h1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final SerialDescriptor invoke() {
            return C2340g.m33638c(this.f7061j, AbstractC2345i.C2349d.f6458a, new SerialDescriptor[0], new C2594a(this.f7062k));
        }
    }

    public C2592h1(String serialName, T objectInstance) {
        List<? extends Annotation> m14104i;
        Lazy m7600b;
        C9612q.m13917h(serialName, "serialName");
        C9612q.m13917h(objectInstance, "objectInstance");
        this.f7058a = objectInstance;
        m14104i = C9545j.m14104i();
        this.f7059b = m14104i;
        m7600b = C11577n.m7600b(EnumC11580p.PUBLICATION, new C2593a(serialName, this));
        this.f7060c = m7600b;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public T deserialize(Decoder decoder) {
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor);
        int mo12866o = mo12920b.mo12866o(getDescriptor());
        if (mo12866o == -1) {
            Unit unit = Unit.f25302a;
            mo12920b.mo12872c(descriptor);
            return this.f7058a;
        }
        throw new C14278g("Unexpected index " + mo12866o);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f7060c.getValue();
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, T value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        encoder.mo12900b(getDescriptor()).mo12899c(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2592h1(String serialName, T objectInstance, Annotation[] classAnnotations) {
        this(serialName, objectInstance);
        List<? extends Annotation> m14274d;
        C9612q.m13917h(serialName, "serialName");
        C9612q.m13917h(objectInstance, "objectInstance");
        C9612q.m13917h(classAnnotations, "classAnnotations");
        m14274d = C9536e.m14274d(classAnnotations);
        this.f7059b = m14274d;
    }
}
