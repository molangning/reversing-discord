package p407wg;

import gh.InterfaceC6760a;
import gh.InterfaceC6763b0;
import gh.InterfaceC6780q;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9538f;
import kotlin.collections.C9545j;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import p305qg.AbstractC11963n1;
import p305qg.C11949m1;
import ph.C11633c;
import ph.C11638f;
import ph.C11640h;
import ug.C12970a;
import ug.C12971b;
import ug.C12972c;

/* renamed from: wg.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class AbstractC13575t extends AbstractC13571p implements InterfaceC13555h, InterfaceC13577v, InterfaceC6780q {
    @Override // gh.InterfaceC6766d
    /* renamed from: D */
    public boolean mo2164D() {
        return false;
    }

    @Override // gh.InterfaceC6780q
    /* renamed from: P */
    public C13559l mo2177O() {
        Class<?> declaringClass = mo2162Q().getDeclaringClass();
        C9612q.m13918g(declaringClass, "member.declaringClass");
        return new C13559l(declaringClass);
    }

    /* renamed from: Q */
    public abstract Member mo2162Q();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: R */
    public final List<InterfaceC6763b0> m2175R(Type[] parameterTypes, Annotation[][] parameterAnnotations, boolean z) {
        int i;
        String str;
        boolean z2;
        int m14239I;
        Object m14053W;
        C9612q.m13917h(parameterTypes, "parameterTypes");
        C9612q.m13917h(parameterAnnotations, "parameterAnnotations");
        ArrayList arrayList = new ArrayList(parameterTypes.length);
        List<String> m2253b = C13545c.f34922a.m2253b(mo2162Q());
        if (m2253b != null) {
            i = m2253b.size() - parameterTypes.length;
        } else {
            i = 0;
        }
        int length = parameterTypes.length;
        for (int i2 = 0; i2 < length; i2++) {
            AbstractC13581z m2158a = AbstractC13581z.f34966a.m2158a(parameterTypes[i2]);
            if (m2253b != null) {
                m14053W = C9553r.m14053W(m2253b, i2 + i);
                str = (String) m14053W;
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i2 + '+' + i + " (name=" + getName() + " type=" + m2158a + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            if (z) {
                m14239I = C9538f.m14239I(parameterTypes);
                if (i2 == m14239I) {
                    z2 = true;
                    arrayList.add(new C13544b0(m2158a, parameterAnnotations[i2], str, z2));
                }
            }
            z2 = false;
            arrayList.add(new C13544b0(m2158a, parameterAnnotations[i2], str, z2));
        }
        return arrayList;
    }

    @Override // gh.InterfaceC6766d
    /* renamed from: b */
    public /* bridge */ /* synthetic */ InterfaceC6760a mo2159b(C11633c c11633c) {
        return mo2159b(c11633c);
    }

    @Override // p407wg.InterfaceC13555h
    /* renamed from: c */
    public AnnotatedElement mo2174c() {
        Member mo2162Q = mo2162Q();
        C9612q.m13919f(mo2162Q, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        return (AnnotatedElement) mo2162Q;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC13575t) && C9612q.m13922c(mo2162Q(), ((AbstractC13575t) obj).mo2162Q());
    }

    @Override // gh.InterfaceC6782s
    /* renamed from: g */
    public boolean mo2173g() {
        return Modifier.isStatic(getModifiers());
    }

    @Override // gh.InterfaceC6766d
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // p407wg.InterfaceC13577v
    public int getModifiers() {
        return mo2162Q().getModifiers();
    }

    @Override // gh.InterfaceC6783t
    public C11638f getName() {
        String name = mo2162Q().getName();
        C11638f m7422f = name != null ? C11638f.m7422f(name) : null;
        return m7422f == null ? C11640h.f30218b : m7422f;
    }

    @Override // gh.InterfaceC6782s
    public AbstractC11963n1 getVisibility() {
        int modifiers = getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return C11949m1.C11957h.f30955c;
        }
        if (Modifier.isPrivate(modifiers)) {
            return C11949m1.C11954e.f30952c;
        }
        if (Modifier.isProtected(modifiers)) {
            if (Modifier.isStatic(modifiers)) {
                return C12972c.f33727c;
            }
            return C12971b.f33726c;
        }
        return C12970a.f33725c;
    }

    public int hashCode() {
        return mo2162Q().hashCode();
    }

    @Override // gh.InterfaceC6782s
    public boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // gh.InterfaceC6782s
    public boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    public String toString() {
        return getClass().getName() + ": " + mo2162Q();
    }

    @Override // p407wg.InterfaceC13555h, gh.InterfaceC6766d
    /* renamed from: b */
    public C13551e mo2159b(C11633c fqName) {
        Annotation[] declaredAnnotations;
        C9612q.m13917h(fqName, "fqName");
        AnnotatedElement mo2174c = mo2174c();
        if (mo2174c == null || (declaredAnnotations = mo2174c.getDeclaredAnnotations()) == null) {
            return null;
        }
        return C13556i.m2227a(declaredAnnotations, fqName);
    }

    @Override // p407wg.InterfaceC13555h, gh.InterfaceC6766d
    public List<C13551e> getAnnotations() {
        List<C13551e> m14104i;
        Annotation[] declaredAnnotations;
        List<C13551e> m2226b;
        AnnotatedElement mo2174c = mo2174c();
        if (mo2174c == null || (declaredAnnotations = mo2174c.getDeclaredAnnotations()) == null || (m2226b = C13556i.m2226b(declaredAnnotations)) == null) {
            m14104i = C9545j.m14104i();
            return m14104i;
        }
        return m2226b;
    }
}
