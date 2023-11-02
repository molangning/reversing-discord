package p407wg;

import gh.InterfaceC6762b;
import gh.InterfaceC6763b0;
import gh.InterfaceC6781r;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C9612q;
import p407wg.AbstractC13581z;

/* renamed from: wg.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C13576u extends AbstractC13575t implements InterfaceC6781r {

    /* renamed from: a */
    private final Method f34960a;

    public C13576u(Method member) {
        C9612q.m13917h(member, "member");
        this.f34960a = member;
    }

    @Override // gh.InterfaceC6781r
    /* renamed from: M */
    public boolean mo2172M() {
        return mo2169h() != null;
    }

    @Override // p407wg.AbstractC13575t
    /* renamed from: S */
    public Method mo2162Q() {
        return this.f34960a;
    }

    @Override // gh.InterfaceC6781r
    /* renamed from: T */
    public AbstractC13581z getReturnType() {
        AbstractC13581z.C13582a c13582a = AbstractC13581z.f34966a;
        Type genericReturnType = mo2162Q().getGenericReturnType();
        C9612q.m13918g(genericReturnType, "member.genericReturnType");
        return c13582a.m2158a(genericReturnType);
    }

    @Override // gh.InterfaceC6789z
    public List<C13541a0> getTypeParameters() {
        TypeVariable<Method>[] typeParameters = mo2162Q().getTypeParameters();
        C9612q.m13918g(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new C13541a0(typeVariable));
        }
        return arrayList;
    }

    @Override // gh.InterfaceC6781r
    /* renamed from: h */
    public InterfaceC6762b mo2169h() {
        Object defaultValue = mo2162Q().getDefaultValue();
        if (defaultValue != null) {
            return AbstractC13552f.f34936b.m2229a(defaultValue, null);
        }
        return null;
    }

    @Override // gh.InterfaceC6781r
    /* renamed from: i */
    public List<InterfaceC6763b0> mo2168i() {
        Type[] genericParameterTypes = mo2162Q().getGenericParameterTypes();
        C9612q.m13918g(genericParameterTypes, "member.genericParameterTypes");
        Annotation[][] parameterAnnotations = mo2162Q().getParameterAnnotations();
        C9612q.m13918g(parameterAnnotations, "member.parameterAnnotations");
        return m2175R(genericParameterTypes, parameterAnnotations, mo2162Q().isVarArgs());
    }
}
