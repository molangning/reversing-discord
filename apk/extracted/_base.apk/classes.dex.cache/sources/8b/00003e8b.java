package kg;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9612q;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC11998y;
import tg.C12712l;

@Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m14357d2 = {"Lkg/g;", "Ltg/l;", "Lkg/l;", "", "Lqg/y;", "descriptor", "data", "visitFunctionDescriptor", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Lkotlin/Unit;)Lkg/l;", "Lqg/u0;", "visitPropertyDescriptor", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lkotlin/Unit;)Lkg/l;", "Lkg/p;", "a", "Lkg/p;", "container", "<init>", "(Lkg/p;)V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kg.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public class C9255g extends C12712l<AbstractC9282l<?>, Unit> {

    /* renamed from: a */
    private final AbstractC9327p f24324a;

    public C9255g(AbstractC9327p container) {
        C9612q.m13917h(container, "container");
        this.f24324a = container;
    }

    @Override // tg.C12712l, p305qg.InterfaceC11964o
    /* renamed from: p */
    public AbstractC9282l<?> mo4387h(InterfaceC11998y descriptor, Unit data) {
        C9612q.m13917h(descriptor, "descriptor");
        C9612q.m13917h(data, "data");
        return new C9338q(this.f24324a, descriptor);
    }

    @Override // p305qg.InterfaceC11964o
    /* renamed from: q */
    public AbstractC9282l<?> mo5032b(InterfaceC11989u0 descriptor, Unit data) {
        int i;
        C9612q.m13917h(descriptor, "descriptor");
        C9612q.m13917h(data, "data");
        int i2 = 0;
        if (descriptor.mo4332I() != null) {
            i = 1;
        } else {
            i = 0;
        }
        if (descriptor.mo4329M() != null) {
            i2 = 1;
        }
        int i3 = i + i2;
        if (descriptor.mo4342L()) {
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        return new C9349t(this.f24324a, descriptor);
                    }
                } else {
                    return new C9346s(this.f24324a, descriptor);
                }
            } else {
                return new C9343r(this.f24324a, descriptor);
            }
        } else if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return new C9372z(this.f24324a, descriptor);
                }
            } else {
                return new C9368y(this.f24324a, descriptor);
            }
        } else {
            return new C9364x(this.f24324a, descriptor);
        }
        throw new C9258h0("Unsupported property: " + descriptor);
    }
}