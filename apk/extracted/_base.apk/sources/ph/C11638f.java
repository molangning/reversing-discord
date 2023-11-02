package ph;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;

/* renamed from: ph.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C11638f implements Comparable<C11638f> {

    /* renamed from: j */
    private final String f30213j;

    /* renamed from: k */
    private final boolean f30214k;

    private C11638f(String str, boolean z) {
        if (str == null) {
            m7427a(0);
        }
        this.f30213j = str;
        this.f30214k = z;
    }

    /* renamed from: a */
    private static /* synthetic */ void m7427a(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = ZeroconfModule.KEY_SERVICE_NAME;
        }
        if (i == 1) {
            objArr[1] = "asString";
        } else if (i == 2) {
            objArr[1] = "getIdentifier";
        } else if (i == 3 || i == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "special";
                break;
            case 8:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    /* renamed from: e */
    public static C11638f m7423e(String str) {
        if (str == null) {
            m7427a(8);
        }
        if (str.startsWith("<")) {
            return m7419i(str);
        }
        return m7422f(str);
    }

    /* renamed from: f */
    public static C11638f m7422f(String str) {
        if (str == null) {
            m7427a(5);
        }
        return new C11638f(str, false);
    }

    /* renamed from: h */
    public static boolean m7420h(String str) {
        if (str == null) {
            m7427a(6);
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '.' || charAt == '/' || charAt == '\\') {
                return false;
            }
        }
        return true;
    }

    /* renamed from: i */
    public static C11638f m7419i(String str) {
        if (str == null) {
            m7427a(7);
        }
        if (str.startsWith("<")) {
            return new C11638f(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': " + str);
    }

    /* renamed from: b */
    public String m7426b() {
        String str = this.f30213j;
        if (str == null) {
            m7427a(1);
        }
        return str;
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public int compareTo(C11638f c11638f) {
        return this.f30213j.compareTo(c11638f.f30213j);
    }

    /* renamed from: d */
    public String m7424d() {
        if (!this.f30214k) {
            String m7426b = m7426b();
            if (m7426b == null) {
                m7427a(2);
            }
            return m7426b;
        }
        throw new IllegalStateException("not identifier: " + this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11638f)) {
            return false;
        }
        C11638f c11638f = (C11638f) obj;
        if (this.f30214k == c11638f.f30214k && this.f30213j.equals(c11638f.f30213j)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean m7421g() {
        return this.f30214k;
    }

    public int hashCode() {
        return (this.f30213j.hashCode() * 31) + (this.f30214k ? 1 : 0);
    }

    public String toString() {
        return this.f30213j;
    }
}
