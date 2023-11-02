package p470zi;

import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import p088ej.AbstractC6257c;

@Metadata(m14358d1 = {"zi/k", "zi/l"}, m14357d2 = {}, m14356k = 4, m14355mv = {1, 8, 0})
/* renamed from: zi.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C14285j {
    /* renamed from: a */
    public static final KSerializer<? extends Object> m258a(KClass<Object> kClass, List<? extends KType> list, List<? extends KSerializer<Object>> list2) {
        return C14287l.m238d(kClass, list, list2);
    }

    /* renamed from: b */
    public static final KSerializer<Object> m257b(AbstractC6257c abstractC6257c, Type type) {
        return C14286k.m247d(abstractC6257c, type);
    }

    /* renamed from: c */
    public static final KSerializer<Object> m256c(AbstractC6257c abstractC6257c, KType kType) {
        return C14287l.m237e(abstractC6257c, kType);
    }

    /* renamed from: d */
    public static final KSerializer<Object> m255d(Type type) {
        return C14286k.m246e(type);
    }

    /* renamed from: e */
    public static final KSerializer<Object> m254e(AbstractC6257c abstractC6257c, Type type) {
        return C14286k.m243h(abstractC6257c, type);
    }

    /* renamed from: f */
    public static final KSerializer<Object> m253f(AbstractC6257c abstractC6257c, KType kType) {
        return C14287l.m235g(abstractC6257c, kType);
    }

    /* renamed from: g */
    public static final <T> KSerializer<T> m252g(KClass<T> kClass) {
        return C14287l.m234h(kClass);
    }

    /* renamed from: h */
    public static final List<KSerializer<Object>> m251h(AbstractC6257c abstractC6257c, List<? extends KType> list, boolean z) {
        return C14287l.m233i(abstractC6257c, list, z);
    }
}
