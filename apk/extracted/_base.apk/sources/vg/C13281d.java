package vg;

import gh.InterfaceC6770g;
import gh.InterfaceC6784u;
import java.util.Set;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9653o;
import p407wg.C13559l;
import p407wg.C13578w;
import p468zg.InterfaceC14247p;
import ph.C11632b;
import ph.C11633c;

/* renamed from: vg.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C13281d implements InterfaceC14247p {

    /* renamed from: a */
    private final ClassLoader f34361a;

    public C13281d(ClassLoader classLoader) {
        C9612q.m13917h(classLoader, "classLoader");
        this.f34361a = classLoader;
    }

    @Override // p468zg.InterfaceC14247p
    /* renamed from: a */
    public InterfaceC6784u mo326a(C11633c fqName, boolean z) {
        C9612q.m13917h(fqName, "fqName");
        return new C13578w(fqName);
    }

    @Override // p468zg.InterfaceC14247p
    /* renamed from: b */
    public Set<String> mo325b(C11633c packageFqName) {
        C9612q.m13917h(packageFqName, "packageFqName");
        return null;
    }

    @Override // p468zg.InterfaceC14247p
    /* renamed from: c */
    public InterfaceC6770g mo324c(InterfaceC14247p.C14248a request) {
        String m13763C;
        C9612q.m13917h(request, "request");
        C11632b m323a = request.m323a();
        C11633c m7465h = m323a.m7465h();
        C9612q.m13918g(m7465h, "classId.packageFqName");
        String m7458b = m323a.m7464i().m7458b();
        C9612q.m13918g(m7458b, "classId.relativeClassName.asString()");
        m13763C = C9653o.m13763C(m7458b, '.', '$', false, 4, null);
        if (!m7465h.m7456d()) {
            m13763C = m7465h.m7458b() + '.' + m13763C;
        }
        Class<?> m2857a = C13282e.m2857a(this.f34361a, m13763C);
        if (m2857a != null) {
            return new C13559l(m2857a);
        }
        return null;
    }
}
