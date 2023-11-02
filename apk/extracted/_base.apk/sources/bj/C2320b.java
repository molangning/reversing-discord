package bj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p045cj.C2650w1;
import p088ej.AbstractC6257c;

@Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0018\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000\"$\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, m14357d2 = {"Lej/c;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "b", "Lkotlin/reflect/KClass;", "context", "c", "a", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlin/reflect/KClass;", "getCapturedKClass$annotations", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "capturedKClass", "kotlinx-serialization-core"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: bj.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2320b {
    /* renamed from: a */
    public static final KClass<?> m33647a(SerialDescriptor serialDescriptor) {
        C9612q.m13917h(serialDescriptor, "<this>");
        if (serialDescriptor instanceof C2321c) {
            return ((C2321c) serialDescriptor).f6433b;
        }
        if (serialDescriptor instanceof C2650w1) {
            return m33647a(((C2650w1) serialDescriptor).m32780k());
        }
        return null;
    }

    /* renamed from: b */
    public static final SerialDescriptor m33646b(AbstractC6257c abstractC6257c, SerialDescriptor descriptor) {
        KSerializer m23143c;
        C9612q.m13917h(abstractC6257c, "<this>");
        C9612q.m13917h(descriptor, "descriptor");
        KClass<?> m33647a = m33647a(descriptor);
        if (m33647a == null || (m23143c = AbstractC6257c.m23143c(abstractC6257c, m33647a, null, 2, null)) == null) {
            return null;
        }
        return m23143c.getDescriptor();
    }

    /* renamed from: c */
    public static final SerialDescriptor m33645c(SerialDescriptor serialDescriptor, KClass<?> context) {
        C9612q.m13917h(serialDescriptor, "<this>");
        C9612q.m13917h(context, "context");
        return new C2321c(serialDescriptor, context);
    }
}
