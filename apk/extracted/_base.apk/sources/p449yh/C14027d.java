package p449yh;

import ph.C11632b;
import ph.C11633c;

/* renamed from: yh.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C14027d {

    /* renamed from: a */
    private final String f36043a;

    /* renamed from: b */
    private C11633c f36044b;

    private C14027d(String str) {
        if (str == null) {
            m887a(5);
        }
        this.f36043a = str;
    }

    /* renamed from: a */
    private static /* synthetic */ void m887a(int i) {
        String str = (i == 3 || i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 5:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i == 3) {
            objArr[1] = "byFqNameWithoutInnerClasses";
        } else if (i == 6) {
            objArr[1] = "getFqNameForClassNameWithoutDollars";
        } else if (i == 7) {
            objArr[1] = "getPackageFqName";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        } else {
            objArr[1] = "getInternalName";
        }
        switch (i) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 3 && i != 6 && i != 7 && i != 8) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* renamed from: b */
    public static C14027d m886b(C11632b c11632b) {
        if (c11632b == null) {
            m887a(1);
        }
        C11633c m7465h = c11632b.m7465h();
        String replace = c11632b.m7464i().m7458b().replace('.', '$');
        if (m7465h.m7456d()) {
            return new C14027d(replace);
        }
        return new C14027d(m7465h.m7458b().replace('.', '/') + "/" + replace);
    }

    /* renamed from: c */
    public static C14027d m885c(C11633c c11633c) {
        if (c11633c == null) {
            m887a(2);
        }
        C14027d c14027d = new C14027d(c11633c.m7458b().replace('.', '/'));
        c14027d.f36044b = c11633c;
        return c14027d;
    }

    /* renamed from: d */
    public static C14027d m884d(String str) {
        if (str == null) {
            m887a(0);
        }
        return new C14027d(str);
    }

    /* renamed from: e */
    public C11633c m883e() {
        return new C11633c(this.f36043a.replace('/', '.'));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f36043a.equals(((C14027d) obj).f36043a);
        }
        return false;
    }

    /* renamed from: f */
    public String m882f() {
        String str = this.f36043a;
        if (str == null) {
            m887a(8);
        }
        return str;
    }

    /* renamed from: g */
    public C11633c m881g() {
        int lastIndexOf = this.f36043a.lastIndexOf("/");
        if (lastIndexOf == -1) {
            C11633c c11633c = C11633c.f30202c;
            if (c11633c == null) {
                m887a(7);
            }
            return c11633c;
        }
        return new C11633c(this.f36043a.substring(0, lastIndexOf).replace('/', '.'));
    }

    public int hashCode() {
        return this.f36043a.hashCode();
    }

    public String toString() {
        return this.f36043a;
    }
}
