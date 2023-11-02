package kg;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.collections.C9538f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import p407wg.C13548d;

@Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m14357d2 = {"Ljava/lang/reflect/Method;", "", "b", "(Ljava/lang/reflect/Method;)Ljava/lang/String;", "signature", "kotlin-reflection"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: kg.n0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C9323n0 {

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"Ljava/lang/Class;", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/lang/Class;)Ljava/lang/CharSequence;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kg.n0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C9324a extends AbstractC9614s implements Function1<Class<?>, CharSequence> {

        /* renamed from: j */
        public static final C9324a f24424j = new C9324a();

        C9324a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(Class<?> it) {
            C9612q.m13918g(it, "it");
            return C13548d.m2245b(it);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ String m15889a(Method method) {
        return m15888b(method);
    }

    /* renamed from: b */
    public static final String m15888b(Method method) {
        String m14217c0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        C9612q.m13918g(parameterTypes, "parameterTypes");
        m14217c0 = C9538f.m14217c0(parameterTypes, "", "(", ")", 0, null, C9324a.f24424j, 24, null);
        sb2.append(m14217c0);
        Class<?> returnType = method.getReturnType();
        C9612q.m13918g(returnType, "returnType");
        sb2.append(C13548d.m2245b(returnType));
        return sb2.toString();
    }
}
