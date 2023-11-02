package ph;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.util.List;

/* renamed from: ph.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C11633c {

    /* renamed from: c */
    public static final C11633c f30202c = new C11633c("");

    /* renamed from: a */
    private final C11634d f30203a;

    /* renamed from: b */
    private transient C11633c f30204b;

    public C11633c(String str) {
        if (str == null) {
            m7459a(1);
        }
        this.f30203a = new C11634d(str, this);
    }

    /* renamed from: a */
    private static /* synthetic */ void m7459a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i2 = 2;
                break;
            case 8:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = ZeroconfModule.KEY_SERVICE_NAME;
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
                objArr[2] = "startsWith";
                break;
            case 13:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(format);
            case 8:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    /* renamed from: k */
    public static C11633c m7449k(C11638f c11638f) {
        if (c11638f == null) {
            m7459a(13);
        }
        return new C11633c(C11634d.m7436m(c11638f));
    }

    /* renamed from: b */
    public String m7458b() {
        String m7447b = this.f30203a.m7447b();
        if (m7447b == null) {
            m7459a(4);
        }
        return m7447b;
    }

    /* renamed from: c */
    public C11633c m7457c(C11638f c11638f) {
        if (c11638f == null) {
            m7459a(8);
        }
        return new C11633c(this.f30203a.m7446c(c11638f), this);
    }

    /* renamed from: d */
    public boolean m7456d() {
        return this.f30203a.m7444e();
    }

    /* renamed from: e */
    public C11633c m7455e() {
        C11633c c11633c = this.f30204b;
        if (c11633c != null) {
            if (c11633c == null) {
                m7459a(6);
            }
            return c11633c;
        } else if (!m7456d()) {
            C11633c c11633c2 = new C11633c(this.f30203a.m7442g());
            this.f30204b = c11633c2;
            return c11633c2;
        } else {
            throw new IllegalStateException("root");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C11633c) && this.f30203a.equals(((C11633c) obj).f30203a)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public List<C11638f> m7454f() {
        List<C11638f> m7441h = this.f30203a.m7441h();
        if (m7441h == null) {
            m7459a(11);
        }
        return m7441h;
    }

    /* renamed from: g */
    public C11638f m7453g() {
        C11638f m7440i = this.f30203a.m7440i();
        if (m7440i == null) {
            m7459a(9);
        }
        return m7440i;
    }

    /* renamed from: h */
    public C11638f m7452h() {
        C11638f m7439j = this.f30203a.m7439j();
        if (m7439j == null) {
            m7459a(10);
        }
        return m7439j;
    }

    public int hashCode() {
        return this.f30203a.hashCode();
    }

    /* renamed from: i */
    public boolean m7451i(C11638f c11638f) {
        if (c11638f == null) {
            m7459a(12);
        }
        return this.f30203a.m7438k(c11638f);
    }

    /* renamed from: j */
    public C11634d m7450j() {
        C11634d c11634d = this.f30203a;
        if (c11634d == null) {
            m7459a(5);
        }
        return c11634d;
    }

    public String toString() {
        return this.f30203a.toString();
    }

    public C11633c(C11634d c11634d) {
        if (c11634d == null) {
            m7459a(2);
        }
        this.f30203a = c11634d;
    }

    private C11633c(C11634d c11634d, C11633c c11633c) {
        if (c11634d == null) {
            m7459a(3);
        }
        this.f30203a = c11634d;
        this.f30204b = c11633c;
    }
}
