package p449yh;

import ai.InterfaceC0194h;
import ch.C2546f;
import gh.EnumC6767d0;
import gh.InterfaceC6770g;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import p013ah.InterfaceC0170g;
import p069dh.C5871h;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11927h;
import p448yg.EnumC14023d;
import ph.C11633c;

/* renamed from: yh.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C14026c {

    /* renamed from: a */
    private final C2546f f36041a;

    /* renamed from: b */
    private final InterfaceC0170g f36042b;

    public C14026c(C2546f packageFragmentProvider, InterfaceC0170g javaResolverCache) {
        C9612q.m13917h(packageFragmentProvider, "packageFragmentProvider");
        C9612q.m13917h(javaResolverCache, "javaResolverCache");
        this.f36041a = packageFragmentProvider;
        this.f36042b = javaResolverCache;
    }

    /* renamed from: a */
    public final C2546f m889a() {
        return this.f36041a;
    }

    /* renamed from: b */
    public final InterfaceC11914e m888b(InterfaceC6770g javaClass) {
        Object m14054V;
        InterfaceC0194h interfaceC0194h;
        InterfaceC11927h interfaceC11927h;
        C9612q.m13917h(javaClass, "javaClass");
        C11633c mo2210e = javaClass.mo2210e();
        if (mo2210e != null && javaClass.mo2219K() == EnumC6767d0.SOURCE) {
            return this.f36042b.mo41025d(mo2210e);
        }
        InterfaceC6770g mo2207o = javaClass.mo2207o();
        if (mo2207o != null) {
            InterfaceC11914e m888b = m888b(mo2207o);
            if (m888b != null) {
                interfaceC0194h = m888b.mo4228Q();
            } else {
                interfaceC0194h = null;
            }
            if (interfaceC0194h != null) {
                interfaceC11927h = interfaceC0194h.mo16932g(javaClass.getName(), EnumC14023d.FROM_JAVA_LOADER);
            } else {
                interfaceC11927h = null;
            }
            if (!(interfaceC11927h instanceof InterfaceC11914e)) {
                return null;
            }
            return (InterfaceC11914e) interfaceC11927h;
        } else if (mo2210e == null) {
            return null;
        } else {
            C2546f c2546f = this.f36041a;
            C11633c m7455e = mo2210e.m7455e();
            C9612q.m13918g(m7455e, "fqName.parent()");
            m14054V = C9553r.m14054V(c2546f.mo4427a(m7455e));
            C5871h c5871h = (C5871h) m14054V;
            if (c5871h == null) {
                return null;
            }
            return c5871h.m24275L0(javaClass);
        }
    }
}
