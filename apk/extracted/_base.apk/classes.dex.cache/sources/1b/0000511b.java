package p407wg;

import gh.InterfaceC6760a;
import gh.InterfaceC6765c0;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9538f;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import p407wg.AbstractC13581z;

/* renamed from: wg.c0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C13547c0 extends AbstractC13581z implements InterfaceC6765c0 {

    /* renamed from: b */
    private final WildcardType f34926b;

    /* renamed from: c */
    private final Collection<InterfaceC6760a> f34927c;

    /* renamed from: d */
    private final boolean f34928d;

    public C13547c0(WildcardType reflectType) {
        List m14104i;
        C9612q.m13917h(reflectType, "reflectType");
        this.f34926b = reflectType;
        m14104i = C9545j.m14104i();
        this.f34927c = m14104i;
    }

    @Override // gh.InterfaceC6766d
    /* renamed from: D */
    public boolean mo2164D() {
        return this.f34928d;
    }

    @Override // gh.InterfaceC6765c0
    /* renamed from: L */
    public boolean mo2250L() {
        Object m14247E;
        Type[] upperBounds = mo2160P().getUpperBounds();
        C9612q.m13918g(upperBounds, "reflectType.upperBounds");
        m14247E = C9538f.m14247E(upperBounds);
        return !C9612q.m13922c(m14247E, Object.class);
    }

    @Override // gh.InterfaceC6765c0
    /* renamed from: Q */
    public AbstractC13581z mo2247w() {
        Object m14212h0;
        Object m14212h02;
        Type[] upperBounds = mo2160P().getUpperBounds();
        Type[] lowerBounds = mo2160P().getLowerBounds();
        if (upperBounds.length <= 1 && lowerBounds.length <= 1) {
            if (lowerBounds.length == 1) {
                AbstractC13581z.C13582a c13582a = AbstractC13581z.f34966a;
                C9612q.m13918g(lowerBounds, "lowerBounds");
                m14212h02 = C9538f.m14212h0(lowerBounds);
                C9612q.m13918g(m14212h02, "lowerBounds.single()");
                return c13582a.m2158a((Type) m14212h02);
            }
            if (upperBounds.length == 1) {
                C9612q.m13918g(upperBounds, "upperBounds");
                m14212h0 = C9538f.m14212h0(upperBounds);
                Type ub = (Type) m14212h0;
                if (!C9612q.m13922c(ub, Object.class)) {
                    AbstractC13581z.C13582a c13582a2 = AbstractC13581z.f34966a;
                    C9612q.m13918g(ub, "ub");
                    return c13582a2.m2158a(ub);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + mo2160P());
    }

    @Override // p407wg.AbstractC13581z
    /* renamed from: R */
    public WildcardType mo2160P() {
        return this.f34926b;
    }

    @Override // gh.InterfaceC6766d
    public Collection<InterfaceC6760a> getAnnotations() {
        return this.f34927c;
    }
}