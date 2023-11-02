package p407wg;

import gh.InterfaceC6760a;
import gh.InterfaceC6787x;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Iterator;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ph.C11632b;
import ph.C11633c;

/* renamed from: wg.z */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class AbstractC13581z implements InterfaceC6787x {

    /* renamed from: a */
    public static final C13582a f34966a = new C13582a(null);

    /* renamed from: wg.z$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C13582a {
        private C13582a() {
        }

        public /* synthetic */ C13582a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AbstractC13581z m2158a(Type type) {
            AbstractC13581z c13558k;
            C9612q.m13917h(type, "type");
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new C13579x(cls);
                }
            }
            if (!(type instanceof GenericArrayType) && (!z || !((Class) type).isArray())) {
                if (type instanceof WildcardType) {
                    c13558k = new C13547c0((WildcardType) type);
                } else {
                    c13558k = new C13569n(type);
                }
            } else {
                c13558k = new C13558k(type);
            }
            return c13558k;
        }
    }

    /* renamed from: P */
    protected abstract Type mo2160P();

    @Override // gh.InterfaceC6766d
    /* renamed from: b */
    public InterfaceC6760a mo2159b(C11633c fqName) {
        Object obj;
        C9612q.m13917h(fqName, "fqName");
        Iterator<T> it = getAnnotations().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            C11632b mo2230n = ((InterfaceC6760a) next).mo2230n();
            if (mo2230n != null) {
                obj = mo2230n.m7471b();
            }
            if (C9612q.m13922c(obj, fqName)) {
                obj = next;
                break;
            }
        }
        return (InterfaceC6760a) obj;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC13581z) && C9612q.m13922c(mo2160P(), ((AbstractC13581z) obj).mo2160P());
    }

    public int hashCode() {
        return mo2160P().hashCode();
    }

    public String toString() {
        return getClass().getName() + ": " + mo2160P();
    }
}