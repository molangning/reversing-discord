package kg;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0000\"\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\b¨\u0006\n"}, m14357d2 = {"", "V", "Lkotlin/Function1;", "Ljava/lang/Class;", "compute", "Lkg/a;", "a", "", "Z", "useClassValue", "kotlin-reflection"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: kg.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C9223b {

    /* renamed from: a */
    private static final boolean f24269a;

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
        f24269a = ((Boolean) m7596b2).booleanValue();
    }

    /* renamed from: a */
    public static final <V> AbstractC9221a<V> m16032a(Function1<? super Class<?>, ? extends V> compute) {
        C9612q.m13917h(compute, "compute");
        if (f24269a) {
            return new C9242d(compute);
        }
        return new C9251f(compute);
    }
}
