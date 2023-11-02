package p407wg;

import ag.C0156a;
import gh.InterfaceC6760a;
import gh.InterfaceC6762b;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.C9612q;
import p407wg.AbstractC13552f;
import ph.C11632b;
import ph.C11638f;

/* renamed from: wg.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C13551e extends AbstractC13571p implements InterfaceC6760a {

    /* renamed from: a */
    private final Annotation f34935a;

    public C13551e(Annotation annotation) {
        C9612q.m13917h(annotation, "annotation");
        this.f34935a = annotation;
    }

    @Override // gh.InterfaceC6760a
    /* renamed from: G */
    public boolean mo2236G() {
        return false;
    }

    /* renamed from: P */
    public final Annotation m2235P() {
        return this.f34935a;
    }

    @Override // gh.InterfaceC6760a
    /* renamed from: Q */
    public C13559l mo2233d() {
        return new C13559l(C0156a.m41055b(C0156a.m41056a(this.f34935a)));
    }

    public boolean equals(Object obj) {
        return (obj instanceof C13551e) && this.f34935a == ((C13551e) obj).f34935a;
    }

    @Override // gh.InterfaceC6760a
    /* renamed from: f */
    public boolean mo2232f() {
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(this.f34935a);
    }

    @Override // gh.InterfaceC6760a
    /* renamed from: k */
    public Collection<InterfaceC6762b> mo2231k() {
        Method[] declaredMethods = C0156a.m41055b(C0156a.m41056a(this.f34935a)).getDeclaredMethods();
        C9612q.m13918g(declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            AbstractC13552f.C13553a c13553a = AbstractC13552f.f34936b;
            Object invoke = method.invoke(this.f34935a, new Object[0]);
            C9612q.m13918g(invoke, "method.invoke(annotation)");
            arrayList.add(c13553a.m2229a(invoke, C11638f.m7422f(method.getName())));
        }
        return arrayList;
    }

    @Override // gh.InterfaceC6760a
    /* renamed from: n */
    public C11632b mo2230n() {
        return C13548d.m2246a(C0156a.m41055b(C0156a.m41056a(this.f34935a)));
    }

    public String toString() {
        return C13551e.class.getName() + ": " + this.f34935a;
    }
}