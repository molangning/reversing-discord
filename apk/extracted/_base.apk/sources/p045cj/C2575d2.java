package p045cj;

import bj.C2319a;
import bj.C2340g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC9936c;
import p470zi.C14278g;
import pf.C11590w;

@Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00050\u0004B1\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\"\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\"\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J*\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005H\u0016J\"\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u001a\u0010\u001d\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, m14357d2 = {"Lcj/d2;", "A", "B", "C", "Lkotlinx/serialization/KSerializer;", "Lpf/w;", "Lkotlinx/serialization/encoding/c;", "composite", "d", "e", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "g", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "f", "a", "Lkotlinx/serialization/KSerializer;", "aSerializer", "b", "bSerializer", "c", "cSerializer", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.d2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2575d2<A, B, C> implements KSerializer<C11590w<? extends A, ? extends B, ? extends C>> {

    /* renamed from: a */
    private final KSerializer<A> f7033a;

    /* renamed from: b */
    private final KSerializer<B> f7034b;

    /* renamed from: c */
    private final KSerializer<C> f7035c;

    /* renamed from: d */
    private final SerialDescriptor f7036d;

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m14357d2 = {"A", "B", "C", "Lbj/a;", "", "a", "(Lbj/a;)V"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: cj.d2$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C2576a extends AbstractC9614s implements Function1<C2319a, Unit> {

        /* renamed from: j */
        final /* synthetic */ C2575d2<A, B, C> f7037j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2576a(C2575d2<A, B, C> c2575d2) {
            super(1);
            this.f7037j = c2575d2;
        }

        /* renamed from: a */
        public final void m32926a(C2319a buildClassSerialDescriptor) {
            C9612q.m13917h(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
            C2319a.m33654b(buildClassSerialDescriptor, "first", ((C2575d2) this.f7037j).f7033a.getDescriptor(), null, false, 12, null);
            C2319a.m33654b(buildClassSerialDescriptor, "second", ((C2575d2) this.f7037j).f7034b.getDescriptor(), null, false, 12, null);
            C2319a.m33654b(buildClassSerialDescriptor, "third", ((C2575d2) this.f7037j).f7035c.getDescriptor(), null, false, 12, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C2319a c2319a) {
            m32926a(c2319a);
            return Unit.f25302a;
        }
    }

    public C2575d2(KSerializer<A> aSerializer, KSerializer<B> bSerializer, KSerializer<C> cSerializer) {
        C9612q.m13917h(aSerializer, "aSerializer");
        C9612q.m13917h(bSerializer, "bSerializer");
        C9612q.m13917h(cSerializer, "cSerializer");
        this.f7033a = aSerializer;
        this.f7034b = bSerializer;
        this.f7035c = cSerializer;
        this.f7036d = C2340g.m33639b("kotlin.Triple", new SerialDescriptor[0], new C2576a(this));
    }

    /* renamed from: d */
    private final C11590w<A, B, C> m32930d(InterfaceC9936c interfaceC9936c) {
        Object m12859c = InterfaceC9936c.C9937a.m12859c(interfaceC9936c, getDescriptor(), 0, this.f7033a, null, 8, null);
        Object m12859c2 = InterfaceC9936c.C9937a.m12859c(interfaceC9936c, getDescriptor(), 1, this.f7034b, null, 8, null);
        Object m12859c3 = InterfaceC9936c.C9937a.m12859c(interfaceC9936c, getDescriptor(), 2, this.f7035c, null, 8, null);
        interfaceC9936c.mo12872c(getDescriptor());
        return new C11590w<>(m12859c, m12859c2, m12859c3);
    }

    /* renamed from: e */
    private final C11590w<A, B, C> m32929e(InterfaceC9936c interfaceC9936c) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        obj = C2580e2.f7043a;
        obj2 = C2580e2.f7043a;
        obj3 = C2580e2.f7043a;
        while (true) {
            int mo12866o = interfaceC9936c.mo12866o(getDescriptor());
            if (mo12866o != -1) {
                if (mo12866o != 0) {
                    if (mo12866o != 1) {
                        if (mo12866o == 2) {
                            obj3 = InterfaceC9936c.C9937a.m12859c(interfaceC9936c, getDescriptor(), 2, this.f7035c, null, 8, null);
                        } else {
                            throw new C14278g("Unexpected index " + mo12866o);
                        }
                    } else {
                        obj2 = InterfaceC9936c.C9937a.m12859c(interfaceC9936c, getDescriptor(), 1, this.f7034b, null, 8, null);
                    }
                } else {
                    obj = InterfaceC9936c.C9937a.m12859c(interfaceC9936c, getDescriptor(), 0, this.f7033a, null, 8, null);
                }
            } else {
                interfaceC9936c.mo12872c(getDescriptor());
                obj4 = C2580e2.f7043a;
                if (obj != obj4) {
                    obj5 = C2580e2.f7043a;
                    if (obj2 != obj5) {
                        obj6 = C2580e2.f7043a;
                        if (obj3 != obj6) {
                            return new C11590w<>(obj, obj2, obj3);
                        }
                        throw new C14278g("Element 'third' is missing");
                    }
                    throw new C14278g("Element 'second' is missing");
                }
                throw new C14278g("Element 'first' is missing");
            }
        }
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    /* renamed from: f */
    public C11590w<A, B, C> deserialize(Decoder decoder) {
        C9612q.m13917h(decoder, "decoder");
        InterfaceC9936c mo12920b = decoder.mo12920b(getDescriptor());
        if (mo12920b.mo12865p()) {
            return m32930d(mo12920b);
        }
        return m32929e(mo12920b);
    }

    @Override // p470zi.InterfaceC14279h
    /* renamed from: g */
    public void serialize(Encoder encoder, C11590w<? extends A, ? extends B, ? extends C> value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        CompositeEncoder mo12900b = encoder.mo12900b(getDescriptor());
        mo12900b.mo12894i(getDescriptor(), 0, this.f7033a, value.m7580d());
        mo12900b.mo12894i(getDescriptor(), 1, this.f7034b, value.m7579e());
        mo12900b.mo12894i(getDescriptor(), 2, this.f7035c, value.m7578f());
        mo12900b.mo12899c(getDescriptor());
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.f7036d;
    }
}
