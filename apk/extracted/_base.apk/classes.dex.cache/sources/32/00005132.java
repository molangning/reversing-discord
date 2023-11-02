package p407wg;

import gh.InterfaceC6763b0;
import gh.InterfaceC6774k;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C9536e;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;

/* renamed from: wg.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C13570o extends AbstractC13575t implements InterfaceC6774k {

    /* renamed from: a */
    private final Constructor<?> f34956a;

    public C13570o(Constructor<?> member) {
        C9612q.m13917h(member, "member");
        this.f34956a = member;
    }

    @Override // p407wg.AbstractC13575t
    /* renamed from: S */
    public Constructor<?> mo2162Q() {
        return this.f34956a;
    }

    @Override // gh.InterfaceC6789z
    public List<C13541a0> getTypeParameters() {
        TypeVariable<Constructor<?>>[] typeParameters = mo2162Q().getTypeParameters();
        C9612q.m13918g(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Constructor<?>> typeVariable : typeParameters) {
            arrayList.add(new C13541a0(typeVariable));
        }
        return arrayList;
    }

    @Override // gh.InterfaceC6774k
    /* renamed from: i */
    public List<InterfaceC6763b0> mo2184i() {
        boolean z;
        Object[] m14268j;
        Object[] m14268j2;
        List<InterfaceC6763b0> m14104i;
        Type[] realTypes = mo2162Q().getGenericParameterTypes();
        C9612q.m13918g(realTypes, "types");
        if (realTypes.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m14104i = C9545j.m14104i();
            return m14104i;
        }
        Class<?> declaringClass = mo2162Q().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            m14268j2 = C9536e.m14268j(realTypes, 1, realTypes.length);
            realTypes = (Type[]) m14268j2;
        }
        Annotation[][] realAnnotations = mo2162Q().getParameterAnnotations();
        if (realAnnotations.length >= realTypes.length) {
            if (realAnnotations.length > realTypes.length) {
                C9612q.m13918g(realAnnotations, "annotations");
                m14268j = C9536e.m14268j(realAnnotations, realAnnotations.length - realTypes.length, realAnnotations.length);
                realAnnotations = (Annotation[][]) m14268j;
            }
            C9612q.m13918g(realTypes, "realTypes");
            C9612q.m13918g(realAnnotations, "realAnnotations");
            return m2175R(realTypes, realAnnotations, mo2162Q().isVarArgs());
        }
        throw new IllegalStateException("Illegal generic signature: " + mo2162Q());
    }
}