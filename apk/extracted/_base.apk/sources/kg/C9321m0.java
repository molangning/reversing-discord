package kg;

import bh.C2299b;
import bh.C2302e;
import bh.C2306f;
import fi.C6474j;
import fi.InterfaceC6427b;
import gh.InterfaceC6775l;
import java.lang.reflect.Method;
import kg.AbstractC9262j;
import kg.AbstractC9276k;
import kh.C9391d;
import kh.C9412i;
import kh.C9425n;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import mh.C10466e;
import ng.C10884k;
import ng.EnumC10876i;
import p108fh.InterfaceC6424a;
import p160ih.C7575w;
import p250nh.C10890a;
import p270oh.AbstractC11112d;
import p270oh.C11122i;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC11991v0;
import p305qg.InterfaceC11993w0;
import p305qg.InterfaceC11998y;
import p326rh.AbstractC12188i;
import p326rh.InterfaceC12210q;
import p407wg.C13548d;
import p407wg.C13559l;
import p407wg.C13570o;
import p407wg.C13573r;
import p407wg.C13576u;
import p429xh.C13801c;
import p449yh.EnumC14028e;
import p468zg.C14206a0;
import p468zg.C14226h0;
import pg.C11595a;
import pg.C11599c;
import ph.C11632b;
import ph.C11633c;
import th.C12756d;
import th.C12758e;
import th.C12762g;

@Metadata(m14358d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0002J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eJ\u0012\u0010\u0015\u001a\u00020\u00142\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0018*\u0006\u0012\u0002\b\u00030\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m14357d2 = {"Lkg/m0;", "", "Lqg/y;", "descriptor", "", "b", "Lkg/j$e;", "d", "Lqg/b;", "", "e", "possiblySubstitutedFunction", "Lkg/j;", "g", "Lqg/u0;", "possiblyOverriddenProperty", "Lkg/k;", "f", "Ljava/lang/Class;", "klass", "Lph/b;", "c", "Lph/b;", "JAVA_LANG_VOID", "Lng/i;", "getPrimitiveType", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "primitiveType", "<init>", "()V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kg.m0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C9321m0 {

    /* renamed from: a */
    public static final C9321m0 f24422a = new C9321m0();

    /* renamed from: b */
    private static final C11632b f24423b;

    static {
        C11632b m7460m = C11632b.m7460m(new C11633c("java.lang.Void"));
        C9612q.m13918g(m7460m, "topLevel(FqName(\"java.lang.Void\"))");
        f24423b = m7460m;
    }

    private C9321m0() {
    }

    /* renamed from: a */
    private final EnumC10876i m15896a(Class<?> cls) {
        if (cls.isPrimitive()) {
            return EnumC14028e.m879b(cls.getSimpleName()).m875f();
        }
        return null;
    }

    /* renamed from: b */
    private final boolean m15895b(InterfaceC11998y interfaceC11998y) {
        if (C12756d.m4127p(interfaceC11998y) || C12756d.m4126q(interfaceC11998y)) {
            return true;
        }
        if (C9612q.m13922c(interfaceC11998y.getName(), C11595a.f30106e.m7568a()) && interfaceC11998y.mo4301i().isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private final AbstractC9262j.C9270e m15893d(InterfaceC11998y interfaceC11998y) {
        return new AbstractC9262j.C9270e(new AbstractC11112d.C11114b(m15892e(interfaceC11998y), C7575w.m20385c(interfaceC11998y, false, false, 1, null)));
    }

    /* renamed from: e */
    private final String m15892e(InterfaceC11902b interfaceC11902b) {
        String m380b = C14226h0.m380b(interfaceC11902b);
        if (m380b == null) {
            if (interfaceC11902b instanceof InterfaceC11991v0) {
                String m7426b = C13801c.m1496s(interfaceC11902b).getName().m7426b();
                C9612q.m13918g(m7426b, "descriptor.propertyIfAccessor.name.asString()");
                return C14206a0.m450b(m7426b);
            } else if (interfaceC11902b instanceof InterfaceC11993w0) {
                String m7426b2 = C13801c.m1496s(interfaceC11902b).getName().m7426b();
                C9612q.m13918g(m7426b2, "descriptor.propertyIfAccessor.name.asString()");
                return C14206a0.m447e(m7426b2);
            } else {
                String m7426b3 = interfaceC11902b.getName().m7426b();
                C9612q.m13918g(m7426b3, "descriptor.name.asString()");
                return m7426b3;
            }
        }
        return m380b;
    }

    /* renamed from: c */
    public final C11632b m15894c(Class<?> klass) {
        C9612q.m13917h(klass, "klass");
        if (klass.isArray()) {
            Class<?> componentType = klass.getComponentType();
            C9612q.m13918g(componentType, "klass.componentType");
            EnumC10876i m15896a = m15896a(componentType);
            if (m15896a != null) {
                return new C11632b(C10884k.f28428u, m15896a.m9768c());
            }
            C11632b m7460m = C11632b.m7460m(C10884k.C10885a.f28486i.m7437l());
            C9612q.m13918g(m7460m, "topLevel(StandardNames.FqNames.array.toSafe())");
            return m7460m;
        } else if (C9612q.m13922c(klass, Void.TYPE)) {
            return f24423b;
        } else {
            EnumC10876i m15896a2 = m15896a(klass);
            if (m15896a2 != null) {
                return new C11632b(C10884k.f28428u, m15896a2.m9766e());
            }
            C11632b m2246a = C13548d.m2246a(klass);
            if (!m2246a.m7462k()) {
                C11599c c11599c = C11599c.f30110a;
                C11633c m7471b = m2246a.m7471b();
                C9612q.m13918g(m7471b, "classId.asSingleFqName()");
                C11632b m7552m = c11599c.m7552m(m7471b);
                if (m7552m != null) {
                    return m7552m;
                }
            }
            return m2246a;
        }
    }

    /* renamed from: f */
    public final AbstractC9276k m15891f(InterfaceC11989u0 possiblyOverriddenProperty) {
        InterfaceC6424a interfaceC6424a;
        InterfaceC6775l interfaceC6775l;
        InterfaceC11900a1 interfaceC11900a1;
        InterfaceC6424a interfaceC6424a2;
        InterfaceC6775l interfaceC6775l2;
        C13576u c13576u;
        C9612q.m13917h(possiblyOverriddenProperty, "possiblyOverriddenProperty");
        InterfaceC11989u0 mo4221a = ((InterfaceC11989u0) C12758e.m4113L(possiblyOverriddenProperty)).mo4221a();
        C9612q.m13918g(mo4221a, "unwrapFakeOverride(possi…rriddenProperty).original");
        Method method = null;
        AbstractC9262j.C9270e c9270e = null;
        if (mo4221a instanceof C6474j) {
            C6474j c6474j = (C6474j) mo4221a;
            C9425n mo22653e0 = c6474j.mo22653e0();
            AbstractC12188i.C12195f<C9425n, C10890a.C10898d> propertySignature = C10890a.f28548d;
            C9612q.m13918g(propertySignature, "propertySignature");
            C10890a.C10898d c10898d = (C10890a.C10898d) C10466e.m11485a(mo22653e0, propertySignature);
            if (c10898d != null) {
                return new AbstractC9276k.C9279c(mo4221a, mo22653e0, c10898d, c6474j.mo22649G(), c6474j.mo22650D());
            }
        } else if (mo4221a instanceof C2306f) {
            InterfaceC11900a1 mo4160j = ((C2306f) mo4221a).mo4160j();
            if (mo4160j instanceof InterfaceC6424a) {
                interfaceC6424a = (InterfaceC6424a) mo4160j;
            } else {
                interfaceC6424a = null;
            }
            if (interfaceC6424a != null) {
                interfaceC6775l = interfaceC6424a.mo2834c();
            } else {
                interfaceC6775l = null;
            }
            if (interfaceC6775l instanceof C13573r) {
                return new AbstractC9276k.C9277a(((C13573r) interfaceC6775l).mo2162Q());
            }
            if (interfaceC6775l instanceof C13576u) {
                Method mo2162Q = ((C13576u) interfaceC6775l).mo2162Q();
                InterfaceC11993w0 mo4507h = mo4221a.mo4507h();
                if (mo4507h != null) {
                    interfaceC11900a1 = mo4507h.mo4160j();
                } else {
                    interfaceC11900a1 = null;
                }
                if (interfaceC11900a1 instanceof InterfaceC6424a) {
                    interfaceC6424a2 = (InterfaceC6424a) interfaceC11900a1;
                } else {
                    interfaceC6424a2 = null;
                }
                if (interfaceC6424a2 != null) {
                    interfaceC6775l2 = interfaceC6424a2.mo2834c();
                } else {
                    interfaceC6775l2 = null;
                }
                if (interfaceC6775l2 instanceof C13576u) {
                    c13576u = (C13576u) interfaceC6775l2;
                } else {
                    c13576u = null;
                }
                if (c13576u != null) {
                    method = c13576u.mo2162Q();
                }
                return new AbstractC9276k.C9278b(mo2162Q, method);
            }
            throw new C9258h0("Incorrect resolution sequence for Java field " + mo4221a + " (source = " + interfaceC6775l + ')');
        }
        InterfaceC11991v0 mo4509f = mo4221a.mo4509f();
        C9612q.m13920e(mo4509f);
        AbstractC9262j.C9270e m15893d = m15893d(mo4509f);
        InterfaceC11993w0 mo4507h2 = mo4221a.mo4507h();
        if (mo4507h2 != null) {
            c9270e = m15893d(mo4507h2);
        }
        return new AbstractC9276k.C9280d(m15893d, c9270e);
    }

    /* renamed from: g */
    public final AbstractC9262j m15890g(InterfaceC11998y possiblySubstitutedFunction) {
        InterfaceC6424a interfaceC6424a;
        InterfaceC6424a interfaceC6424a2;
        InterfaceC6775l interfaceC6775l;
        Method mo2162Q;
        AbstractC11112d.C11114b m9132b;
        AbstractC11112d.C11114b m9129e;
        C9612q.m13917h(possiblySubstitutedFunction, "possiblySubstitutedFunction");
        InterfaceC11998y mo4221a = ((InterfaceC11998y) C12758e.m4113L(possiblySubstitutedFunction)).mo4221a();
        C9612q.m13918g(mo4221a, "unwrapFakeOverride(possi…titutedFunction).original");
        if (mo4221a instanceof InterfaceC6427b) {
            InterfaceC6427b interfaceC6427b = (InterfaceC6427b) mo4221a;
            InterfaceC12210q mo22653e0 = interfaceC6427b.mo22653e0();
            if ((mo22653e0 instanceof C9412i) && (m9129e = C11122i.f29099a.m9129e((C9412i) mo22653e0, interfaceC6427b.mo22649G(), interfaceC6427b.mo22650D())) != null) {
                return new AbstractC9262j.C9270e(m9129e);
            }
            if ((mo22653e0 instanceof C9391d) && (m9132b = C11122i.f29099a.m9132b((C9391d) mo22653e0, interfaceC6427b.mo22649G(), interfaceC6427b.mo22650D())) != null) {
                InterfaceC11947m mo4163b = possiblySubstitutedFunction.mo4163b();
                C9612q.m13918g(mo4163b, "possiblySubstitutedFunction.containingDeclaration");
                if (C12762g.m4084b(mo4163b)) {
                    return new AbstractC9262j.C9270e(m9132b);
                }
                return new AbstractC9262j.C9269d(m9132b);
            }
            return m15893d(mo4221a);
        }
        InterfaceC6775l interfaceC6775l2 = null;
        C13576u c13576u = null;
        if (mo4221a instanceof C2302e) {
            InterfaceC11900a1 mo4160j = ((C2302e) mo4221a).mo4160j();
            if (mo4160j instanceof InterfaceC6424a) {
                interfaceC6424a2 = (InterfaceC6424a) mo4160j;
            } else {
                interfaceC6424a2 = null;
            }
            if (interfaceC6424a2 != null) {
                interfaceC6775l = interfaceC6424a2.mo2834c();
            } else {
                interfaceC6775l = null;
            }
            if (interfaceC6775l instanceof C13576u) {
                c13576u = (C13576u) interfaceC6775l;
            }
            if (c13576u != null && (mo2162Q = c13576u.mo2162Q()) != null) {
                return new AbstractC9262j.C9268c(mo2162Q);
            }
            throw new C9258h0("Incorrect resolution sequence for Java method " + mo4221a);
        } else if (mo4221a instanceof C2299b) {
            InterfaceC11900a1 mo4160j2 = ((C2299b) mo4221a).mo4160j();
            if (mo4160j2 instanceof InterfaceC6424a) {
                interfaceC6424a = (InterfaceC6424a) mo4160j2;
            } else {
                interfaceC6424a = null;
            }
            if (interfaceC6424a != null) {
                interfaceC6775l2 = interfaceC6424a.mo2834c();
            }
            if (interfaceC6775l2 instanceof C13570o) {
                return new AbstractC9262j.C9266b(((C13570o) interfaceC6775l2).mo2162Q());
            }
            if (interfaceC6775l2 instanceof C13559l) {
                C13559l c13559l = (C13559l) interfaceC6775l2;
                if (c13559l.mo2205q()) {
                    return new AbstractC9262j.C9263a(c13559l.mo2174c());
                }
            }
            throw new C9258h0("Incorrect resolution sequence for Java constructor " + mo4221a + " (" + interfaceC6775l2 + ')');
        } else if (m15895b(mo4221a)) {
            return m15893d(mo4221a);
        } else {
            throw new C9258h0("Unknown origin of " + mo4221a + " (" + mo4221a.getClass() + ')');
        }
    }
}
