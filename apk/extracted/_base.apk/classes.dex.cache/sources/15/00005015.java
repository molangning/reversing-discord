package vg;

import gh.InterfaceC6770g;
import java.io.InputStream;
import kotlin.jvm.internal.C9612q;
import ng.C10884k;
import p087ei.C6237a;
import p087ei.C6242d;
import p160ih.InterfaceC7559p;
import ph.C11632b;
import ph.C11633c;

/* renamed from: vg.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C13285g implements InterfaceC7559p {

    /* renamed from: a */
    private final ClassLoader f34365a;

    /* renamed from: b */
    private final C6242d f34366b;

    public C13285g(ClassLoader classLoader) {
        C9612q.m13917h(classLoader, "classLoader");
        this.f34365a = classLoader;
        this.f34366b = new C6242d();
    }

    /* renamed from: d */
    private final InterfaceC7559p.AbstractC7560a m2846d(String str) {
        C13283f m2850a;
        Class<?> m2857a = C13282e.m2857a(this.f34365a, str);
        if (m2857a == null || (m2850a = C13283f.f34362c.m2850a(m2857a)) == null) {
            return null;
        }
        return new InterfaceC7559p.AbstractC7560a.C7562b(m2850a, null, 2, null);
    }

    @Override // p160ih.InterfaceC7559p
    /* renamed from: a */
    public InterfaceC7559p.AbstractC7560a mo2849a(InterfaceC6770g javaClass) {
        String m7458b;
        C9612q.m13917h(javaClass, "javaClass");
        C11633c mo2210e = javaClass.mo2210e();
        if (mo2210e != null && (m7458b = mo2210e.m7458b()) != null) {
            return m2846d(m7458b);
        }
        return null;
    }

    @Override // p070di.InterfaceC5955u
    /* renamed from: b */
    public InputStream mo2848b(C11633c packageFqName) {
        C9612q.m13917h(packageFqName, "packageFqName");
        if (!packageFqName.m7451i(C10884k.f28427t)) {
            return null;
        }
        return this.f34366b.m23172a(C6237a.f17663n.m23177n(packageFqName));
    }

    @Override // p160ih.InterfaceC7559p
    /* renamed from: c */
    public InterfaceC7559p.AbstractC7560a mo2847c(C11632b classId) {
        String m2844b;
        C9612q.m13917h(classId, "classId");
        m2844b = C13286h.m2844b(classId);
        return m2846d(m2844b);
    }
}