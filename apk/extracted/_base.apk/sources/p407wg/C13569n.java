package p407wg;

import gh.InterfaceC6760a;
import gh.InterfaceC6772i;
import gh.InterfaceC6773j;
import gh.InterfaceC6787x;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.jvm.internal.C9612q;
import p407wg.AbstractC13581z;
import ph.C11633c;

/* renamed from: wg.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C13569n extends AbstractC13581z implements InterfaceC6773j {

    /* renamed from: b */
    private final Type f34954b;

    /* renamed from: c */
    private final InterfaceC6772i f34955c;

    public C13569n(Type reflectType) {
        InterfaceC6772i c13559l;
        C9612q.m13917h(reflectType, "reflectType");
        this.f34954b = reflectType;
        Type mo2160P = mo2160P();
        if (mo2160P instanceof Class) {
            c13559l = new C13559l((Class) mo2160P);
        } else if (mo2160P instanceof TypeVariable) {
            c13559l = new C13541a0((TypeVariable) mo2160P);
        } else if (mo2160P instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) mo2160P).getRawType();
            C9612q.m13919f(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            c13559l = new C13559l((Class) rawType);
        } else {
            throw new IllegalStateException("Not a classifier type (" + mo2160P.getClass() + "): " + mo2160P);
        }
        this.f34955c = c13559l;
    }

    @Override // gh.InterfaceC6766d
    /* renamed from: D */
    public boolean mo2164D() {
        return false;
    }

    @Override // gh.InterfaceC6773j
    /* renamed from: E */
    public String mo2190E() {
        return mo2160P().toString();
    }

    @Override // gh.InterfaceC6773j
    /* renamed from: H */
    public String mo2189H() {
        throw new UnsupportedOperationException("Type not found: " + mo2160P());
    }

    @Override // p407wg.AbstractC13581z
    /* renamed from: P */
    public Type mo2160P() {
        return this.f34954b;
    }

    @Override // p407wg.AbstractC13581z, gh.InterfaceC6766d
    /* renamed from: b */
    public InterfaceC6760a mo2159b(C11633c fqName) {
        C9612q.m13917h(fqName, "fqName");
        return null;
    }

    @Override // gh.InterfaceC6766d
    public Collection<InterfaceC6760a> getAnnotations() {
        List m14104i;
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    @Override // gh.InterfaceC6773j
    /* renamed from: j */
    public InterfaceC6772i mo2188j() {
        return this.f34955c;
    }

    @Override // gh.InterfaceC6773j
    /* renamed from: t */
    public boolean mo2187t() {
        Type mo2160P = mo2160P();
        if (mo2160P instanceof Class) {
            TypeVariable[] typeParameters = ((Class) mo2160P).getTypeParameters();
            C9612q.m13918g(typeParameters, "getTypeParameters()");
            return (typeParameters.length == 0) ^ true;
        }
        return false;
    }

    @Override // gh.InterfaceC6773j
    /* renamed from: z */
    public List<InterfaceC6787x> mo2186z() {
        int m14093t;
        List<Type> m2243d = C13548d.m2243d(mo2160P());
        AbstractC13581z.C13582a c13582a = AbstractC13581z.f34966a;
        m14093t = C9546k.m14093t(m2243d, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (Type type : m2243d) {
            arrayList.add(c13582a.m2158a(type));
        }
        return arrayList;
    }
}
