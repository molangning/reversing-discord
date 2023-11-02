package p470zi;

import kotlin.Metadata;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC9936c;
import p045cj.AbstractC2561b;
import p045cj.C2568c;
import pf.C11568i;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a4\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007\u001a9\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m14357d2 = {"", "T", "Lcj/b;", "Lkotlinx/serialization/encoding/c;", "decoder", "", "klassName", "Lkotlinx/serialization/DeserializationStrategy;", "a", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzi/h;", "b", "(Lcj/b;Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)Lzi/h;", "kotlinx-serialization-core"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: zi.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C14275d {
    /* renamed from: a */
    public static final <T> DeserializationStrategy<T> m267a(AbstractC2561b<T> abstractC2561b, InterfaceC9936c decoder, String str) {
        C9612q.m13917h(abstractC2561b, "<this>");
        C9612q.m13917h(decoder, "decoder");
        DeserializationStrategy<T> mo12947c = abstractC2561b.mo12947c(decoder, str);
        if (mo12947c != null) {
            return mo12947c;
        }
        C2568c.m32961a(str, abstractC2561b.mo271e());
        throw new C11568i();
    }

    /* renamed from: b */
    public static final <T> InterfaceC14279h<T> m266b(AbstractC2561b<T> abstractC2561b, Encoder encoder, T value) {
        C9612q.m13917h(abstractC2561b, "<this>");
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        InterfaceC14279h<T> mo12946d = abstractC2561b.mo12946d(encoder, value);
        if (mo12946d != null) {
            return mo12946d;
        }
        C2568c.m32960b(C9591f0.m13969b(value.getClass()), abstractC2561b.mo271e());
        throw new C11568i();
    }
}
