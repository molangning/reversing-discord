package p407wg;

import gh.InterfaceC6760a;
import gh.InterfaceC6788y;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9545j;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import ph.C11633c;
import ph.C11638f;

/* renamed from: wg.a0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C13541a0 extends AbstractC13571p implements InterfaceC13555h, InterfaceC6788y {

    /* renamed from: a */
    private final TypeVariable<?> f34911a;

    public C13541a0(TypeVariable<?> typeVariable) {
        C9612q.m13917h(typeVariable, "typeVariable");
        this.f34911a = typeVariable;
    }

    @Override // gh.InterfaceC6766d
    /* renamed from: D */
    public boolean mo2164D() {
        return false;
    }

    @Override // gh.InterfaceC6788y
    /* renamed from: P */
    public List<C13569n> getUpperBounds() {
        Object m14031s0;
        Type type;
        List<C13569n> m14104i;
        Type[] bounds = this.f34911a.getBounds();
        C9612q.m13918g(bounds, "typeVariable.bounds");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type2 : bounds) {
            arrayList.add(new C13569n(type2));
        }
        m14031s0 = C9553r.m14031s0(arrayList);
        C13569n c13569n = (C13569n) m14031s0;
        if (c13569n != null) {
            type = c13569n.mo2160P();
        } else {
            type = null;
        }
        if (C9612q.m13922c(type, Object.class)) {
            m14104i = C9545j.m14104i();
            return m14104i;
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
        TypeVariable<?> typeVariable = this.f34911a;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C13541a0) && C9612q.m13922c(this.f34911a, ((C13541a0) obj).f34911a);
    }

    @Override // gh.InterfaceC6766d
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // gh.InterfaceC6783t
    public C11638f getName() {
        C11638f m7422f = C11638f.m7422f(this.f34911a.getName());
        C9612q.m13918g(m7422f, "identifier(typeVariable.name)");
        return m7422f;
    }

    public int hashCode() {
        return this.f34911a.hashCode();
    }

    public String toString() {
        return C13541a0.class.getName() + ": " + this.f34911a;
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
