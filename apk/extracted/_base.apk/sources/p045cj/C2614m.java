package p045cj;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a4\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u001e\u0010\u0004\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00030\u0001H\u0000\u001aB\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002,\u0010\u0004\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00030\u0007H\u0000\"\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000e¨\u0006\u0010"}, m14357d2 = {"T", "Lkotlin/Function1;", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/KSerializer;", "factory", "Lcj/x1;", "a", "Lkotlin/Function2;", "", "", "Lkotlin/reflect/KType;", "Lcj/k1;", "b", "", "Z", "useClassValue", "kotlinx-serialization-core"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: cj.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2614m {

    /* renamed from: a */
    private static final boolean f7087a;

    static {
        Object m7596b;
        try {
            C11583s.C11584a c11584a = C11583s.f30090k;
            m7596b = C11583s.m7596b(Class.forName("java.lang.ClassValue"));
        } catch (Throwable th2) {
            C11583s.C11584a c11584a2 = C11583s.f30090k;
            m7596b = C11583s.m7596b(C11586t.m7587a(th2));
        }
        if (C11583s.m7590h(m7596b)) {
            Class cls = (Class) m7596b;
            m7596b = Boolean.TRUE;
        }
        Object m7596b2 = C11583s.m7596b(m7596b);
        Boolean bool = Boolean.FALSE;
        if (C11583s.m7591g(m7596b2)) {
            m7596b2 = bool;
        }
        f7087a = ((Boolean) m7596b2).booleanValue();
    }

    /* renamed from: a */
    public static final <T> InterfaceC2655x1<T> m32852a(Function1<? super KClass<?>, ? extends KSerializer<T>> factory) {
        C9612q.m13917h(factory, "factory");
        if (f7087a) {
            return new C2625p(factory);
        }
        return new C2642u(factory);
    }

    /* renamed from: b */
    public static final <T> InterfaceC2608k1<T> m32851b(Function2<? super KClass<Object>, ? super List<? extends KType>, ? extends KSerializer<T>> factory) {
        C9612q.m13917h(factory, "factory");
        if (f7087a) {
            return new C2629q(factory);
        }
        return new C2645v(factory);
    }
}
