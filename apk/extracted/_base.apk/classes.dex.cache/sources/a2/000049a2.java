package ph;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.C9538f;
import kotlin.jvm.functions.Function1;

/* renamed from: ph.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C11634d {

    /* renamed from: e */
    private static final C11638f f30205e = C11638f.m7419i("<root>");

    /* renamed from: f */
    private static final Pattern f30206f = Pattern.compile("\\.");

    /* renamed from: g */
    private static final Function1<String, C11638f> f30207g = new C11635a();

    /* renamed from: a */
    private final String f30208a;

    /* renamed from: b */
    private transient C11633c f30209b;

    /* renamed from: c */
    private transient C11634d f30210c;

    /* renamed from: d */
    private transient C11638f f30211d;

    /* renamed from: ph.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static class C11635a implements Function1<String, C11638f> {
        C11635a() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public C11638f invoke(String str) {
            return C11638f.m7423e(str);
        }
    }

    public C11634d(String str, C11633c c11633c) {
        if (str == null) {
            m7448a(0);
        }
        if (c11633c == null) {
            m7448a(1);
        }
        this.f30208a = str;
        this.f30209b = c11633c;
    }

    /* renamed from: a */
    private static /* synthetic */ void m7448a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                i2 = 2;
                break;
            case 9:
            case 15:
            case 16:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        if (i != 1) {
            switch (i) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = ZeroconfModule.KEY_SERVICE_NAME;
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 17:
                objArr[1] = "toString";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
                objArr[2] = "startsWith";
                break;
            case 16:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                throw new IllegalStateException(format);
            case 9:
            case 15:
            case 16:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    /* renamed from: d */
    private void m7445d() {
        int lastIndexOf = this.f30208a.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.f30211d = C11638f.m7423e(this.f30208a.substring(lastIndexOf + 1));
            this.f30210c = new C11634d(this.f30208a.substring(0, lastIndexOf));
            return;
        }
        this.f30211d = C11638f.m7423e(this.f30208a);
        this.f30210c = C11633c.f30202c.m7450j();
    }

    /* renamed from: m */
    public static C11634d m7436m(C11638f c11638f) {
        if (c11638f == null) {
            m7448a(16);
        }
        return new C11634d(c11638f.m7426b(), C11633c.f30202c.m7450j(), c11638f);
    }

    /* renamed from: b */
    public String m7447b() {
        String str = this.f30208a;
        if (str == null) {
            m7448a(4);
        }
        return str;
    }

    /* renamed from: c */
    public C11634d m7446c(C11638f c11638f) {
        String str;
        if (c11638f == null) {
            m7448a(9);
        }
        if (m7444e()) {
            str = c11638f.m7426b();
        } else {
            str = this.f30208a + "." + c11638f.m7426b();
        }
        return new C11634d(str, this, c11638f);
    }

    /* renamed from: e */
    public boolean m7444e() {
        return this.f30208a.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C11634d) && this.f30208a.equals(((C11634d) obj).f30208a)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean m7443f() {
        return this.f30209b != null || m7447b().indexOf(60) < 0;
    }

    /* renamed from: g */
    public C11634d m7442g() {
        C11634d c11634d = this.f30210c;
        if (c11634d != null) {
            if (c11634d == null) {
                m7448a(7);
            }
            return c11634d;
        } else if (!m7444e()) {
            m7445d();
            C11634d c11634d2 = this.f30210c;
            if (c11634d2 == null) {
                m7448a(8);
            }
            return c11634d2;
        } else {
            throw new IllegalStateException("root");
        }
    }

    /* renamed from: h */
    public List<C11638f> m7441h() {
        List<C11638f> emptyList = m7444e() ? Collections.emptyList() : C9538f.m14214f0(f30206f.split(this.f30208a), f30207g);
        if (emptyList == null) {
            m7448a(14);
        }
        return emptyList;
    }

    public int hashCode() {
        return this.f30208a.hashCode();
    }

    /* renamed from: i */
    public C11638f m7440i() {
        C11638f c11638f = this.f30211d;
        if (c11638f != null) {
            if (c11638f == null) {
                m7448a(10);
            }
            return c11638f;
        } else if (!m7444e()) {
            m7445d();
            C11638f c11638f2 = this.f30211d;
            if (c11638f2 == null) {
                m7448a(11);
            }
            return c11638f2;
        } else {
            throw new IllegalStateException("root");
        }
    }

    /* renamed from: j */
    public C11638f m7439j() {
        if (m7444e()) {
            C11638f c11638f = f30205e;
            if (c11638f == null) {
                m7448a(12);
            }
            return c11638f;
        }
        C11638f m7440i = m7440i();
        if (m7440i == null) {
            m7448a(13);
        }
        return m7440i;
    }

    /* renamed from: k */
    public boolean m7438k(C11638f c11638f) {
        if (c11638f == null) {
            m7448a(15);
        }
        if (m7444e()) {
            return false;
        }
        int indexOf = this.f30208a.indexOf(46);
        String str = this.f30208a;
        String m7426b = c11638f.m7426b();
        if (indexOf == -1) {
            indexOf = this.f30208a.length();
        }
        return str.regionMatches(0, m7426b, 0, indexOf);
    }

    /* renamed from: l */
    public C11633c m7437l() {
        C11633c c11633c = this.f30209b;
        if (c11633c != null) {
            if (c11633c == null) {
                m7448a(5);
            }
            return c11633c;
        }
        C11633c c11633c2 = new C11633c(this);
        this.f30209b = c11633c2;
        return c11633c2;
    }

    public String toString() {
        String m7426b = m7444e() ? f30205e.m7426b() : this.f30208a;
        if (m7426b == null) {
            m7448a(17);
        }
        return m7426b;
    }

    public C11634d(String str) {
        if (str == null) {
            m7448a(2);
        }
        this.f30208a = str;
    }

    private C11634d(String str, C11634d c11634d, C11638f c11638f) {
        if (str == null) {
            m7448a(3);
        }
        this.f30208a = str;
        this.f30210c = c11634d;
        this.f30211d = c11638f;
    }
}