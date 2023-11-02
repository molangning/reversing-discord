package p407wg;

import gh.InterfaceC6760a;
import gh.InterfaceC6769f;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import p407wg.AbstractC13581z;

/* renamed from: wg.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C13558k extends AbstractC13581z implements InterfaceC6769f {

    /* renamed from: b */
    private final Type f34940b;

    /* renamed from: c */
    private final AbstractC13581z f34941c;

    /* renamed from: d */
    private final Collection<InterfaceC6760a> f34942d;

    /* renamed from: e */
    private final boolean f34943e;

    public C13558k(Type reflectType) {
        AbstractC13581z m2158a;
        List m14104i;
        C9612q.m13917h(reflectType, "reflectType");
        this.f34940b = reflectType;
        Type mo2160P = mo2160P();
        if (mo2160P instanceof GenericArrayType) {
            AbstractC13581z.C13582a c13582a = AbstractC13581z.f34966a;
            Type genericComponentType = ((GenericArrayType) mo2160P).getGenericComponentType();
            C9612q.m13918g(genericComponentType, "genericComponentType");
            m2158a = c13582a.m2158a(genericComponentType);
        } else {
            if (mo2160P instanceof Class) {
                Class cls = (Class) mo2160P;
                if (cls.isArray()) {
                    AbstractC13581z.C13582a c13582a2 = AbstractC13581z.f34966a;
                    Class<?> componentType = cls.getComponentType();
                    C9612q.m13918g(componentType, "getComponentType()");
                    m2158a = c13582a2.m2158a(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + mo2160P().getClass() + "): " + mo2160P());
        }
        this.f34941c = m2158a;
        m14104i = C9545j.m14104i();
        this.f34942d = m14104i;
    }

    @Override // gh.InterfaceC6766d
    /* renamed from: D */
    public boolean mo2164D() {
        return this.f34943e;
    }

    @Override // p407wg.AbstractC13581z
    /* renamed from: P */
    protected Type mo2160P() {
        return this.f34940b;
    }

    @Override // gh.InterfaceC6769f
    /* renamed from: Q */
    public AbstractC13581z getComponentType() {
        return this.f34941c;
    }

    @Override // gh.InterfaceC6766d
    public Collection<InterfaceC6760a> getAnnotations() {
        return this.f34942d;
    }
}