package p045cj;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.collections.C9538f;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(m14358d1 = {"\u0000\"\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aa\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0014\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00040\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m14357d2 = {"", "T", "", "serialName", "", "values", "names", "", "annotations", "Lkotlinx/serialization/KSerializer;", "a", "(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;)Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: cj.c0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2569c0 {
    /* renamed from: a */
    public static final <T extends Enum<T>> KSerializer<T> m32959a(String serialName, T[] values, String[] names, Annotation[][] annotations) {
        Object m14235K;
        Object m14235K2;
        C9612q.m13917h(serialName, "serialName");
        C9612q.m13917h(values, "values");
        C9612q.m13917h(names, "names");
        C9612q.m13917h(annotations, "annotations");
        C2557a0 c2557a0 = new C2557a0(serialName, values.length);
        int length = values.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            T t = values[i];
            int i3 = i2 + 1;
            m14235K = C9538f.m14235K(names, i2);
            String str = (String) m14235K;
            if (str == null) {
                str = t.name();
            }
            PluginGeneratedSerialDescriptor.m12855m(c2557a0, str, false, 2, null);
            m14235K2 = C9538f.m14235K(annotations, i2);
            Annotation[] annotationArr = (Annotation[]) m14235K2;
            if (annotationArr != null) {
                for (Annotation annotation : annotationArr) {
                    c2557a0.m12850r(annotation);
                }
            }
            i++;
            i2 = i3;
        }
        return new C2562b0(serialName, values, c2557a0);
    }
}
