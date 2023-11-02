package p080e8;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p195k8.C9191p0;

/* renamed from: e8.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6173d {

    /* renamed from: f */
    private int f17458f;

    /* renamed from: h */
    private int f17460h;

    /* renamed from: o */
    private float f17467o;

    /* renamed from: a */
    private String f17453a = "";

    /* renamed from: b */
    private String f17454b = "";

    /* renamed from: c */
    private Set<String> f17455c = Collections.emptySet();

    /* renamed from: d */
    private String f17456d = "";

    /* renamed from: e */
    private String f17457e = null;

    /* renamed from: g */
    private boolean f17459g = false;

    /* renamed from: i */
    private boolean f17461i = false;

    /* renamed from: j */
    private int f17462j = -1;

    /* renamed from: k */
    private int f17463k = -1;

    /* renamed from: l */
    private int f17464l = -1;

    /* renamed from: m */
    private int f17465m = -1;

    /* renamed from: n */
    private int f17466n = -1;

    /* renamed from: p */
    private int f17468p = -1;

    /* renamed from: q */
    private boolean f17469q = false;

    /* renamed from: z */
    private static int m23369z(int i, String str, String str2, int i2) {
        if (!str.isEmpty() && i != -1) {
            if (!str.equals(str2)) {
                return -1;
            }
            return i + i2;
        }
        return i;
    }

    /* renamed from: a */
    public int m23394a() {
        if (this.f17461i) {
            return this.f17460h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    /* renamed from: b */
    public boolean m23393b() {
        return this.f17469q;
    }

    /* renamed from: c */
    public int m23392c() {
        if (this.f17459g) {
            return this.f17458f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    /* renamed from: d */
    public String m23391d() {
        return this.f17457e;
    }

    /* renamed from: e */
    public float m23390e() {
        return this.f17467o;
    }

    /* renamed from: f */
    public int m23389f() {
        return this.f17466n;
    }

    /* renamed from: g */
    public int m23388g() {
        return this.f17468p;
    }

    /* renamed from: h */
    public int m23387h(String str, String str2, Set<String> set, String str3) {
        if (this.f17453a.isEmpty() && this.f17454b.isEmpty() && this.f17455c.isEmpty() && this.f17456d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int m23369z = m23369z(m23369z(m23369z(0, this.f17453a, str, 1073741824), this.f17454b, str2, 2), this.f17456d, str3, 4);
        if (m23369z == -1 || !set.containsAll(this.f17455c)) {
            return 0;
        }
        return m23369z + (this.f17455c.size() * 4);
    }

    /* renamed from: i */
    public int m23386i() {
        int i;
        int i2 = this.f17464l;
        if (i2 == -1 && this.f17465m == -1) {
            return -1;
        }
        int i3 = 0;
        if (i2 == 1) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.f17465m == 1) {
            i3 = 2;
        }
        return i | i3;
    }

    /* renamed from: j */
    public boolean m23385j() {
        return this.f17461i;
    }

    /* renamed from: k */
    public boolean m23384k() {
        return this.f17459g;
    }

    /* renamed from: l */
    public boolean m23383l() {
        return this.f17462j == 1;
    }

    /* renamed from: m */
    public boolean m23382m() {
        return this.f17463k == 1;
    }

    /* renamed from: n */
    public C6173d m23381n(int i) {
        this.f17460h = i;
        this.f17461i = true;
        return this;
    }

    /* renamed from: o */
    public C6173d m23380o(boolean z) {
        this.f17464l = z ? 1 : 0;
        return this;
    }

    /* renamed from: p */
    public C6173d m23379p(boolean z) {
        this.f17469q = z;
        return this;
    }

    /* renamed from: q */
    public C6173d m23378q(int i) {
        this.f17458f = i;
        this.f17459g = true;
        return this;
    }

    /* renamed from: r */
    public C6173d m23377r(String str) {
        this.f17457e = C9191p0.m16272U0(str);
        return this;
    }

    /* renamed from: s */
    public C6173d m23376s(boolean z) {
        this.f17465m = z ? 1 : 0;
        return this;
    }

    /* renamed from: t */
    public C6173d m23375t(int i) {
        this.f17468p = i;
        return this;
    }

    /* renamed from: u */
    public void m23374u(String[] strArr) {
        this.f17455c = new HashSet(Arrays.asList(strArr));
    }

    /* renamed from: v */
    public void m23373v(String str) {
        this.f17453a = str;
    }

    /* renamed from: w */
    public void m23372w(String str) {
        this.f17454b = str;
    }

    /* renamed from: x */
    public void m23371x(String str) {
        this.f17456d = str;
    }

    /* renamed from: y */
    public C6173d m23370y(boolean z) {
        this.f17463k = z ? 1 : 0;
        return this;
    }
}
