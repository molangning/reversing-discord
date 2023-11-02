package dj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.json.InterfaceC9974j;
import kotlinx.serialization.json.Json;
import p470zi.InterfaceC14279h;

@Metadata(m14358d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a7\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m14357d2 = {"T", "Lkotlinx/serialization/json/Json;", "Ldj/k0;", "writer", "Lzi/h;", "serializer", "value", "", "a", "(Lkotlinx/serialization/json/Json;Ldj/k0;Lzi/h;Ljava/lang/Object;)V", "kotlinx-serialization-json"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: dj.e0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C5983e0 {
    /* renamed from: a */
    public static final <T> void m23962a(Json json, InterfaceC5997k0 writer, InterfaceC14279h<? super T> serializer, T t) {
        C9612q.m13917h(json, "<this>");
        C9612q.m13917h(writer, "writer");
        C9612q.m13917h(serializer, "serializer");
        new C6007o0(writer, json, EnumC6018t0.OBJ, new InterfaceC9974j[EnumC6018t0.values().length]).mo12895h(serializer, t);
    }
}
