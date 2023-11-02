package p021b1;

import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: b1.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2024c implements Serializable {

    /* renamed from: z */
    private static final ObjectStreamField[] f5559z = {new ObjectStreamField("path", String.class), new ObjectStreamField("clientSdk", String.class), new ObjectStreamField("parameters", Map.class), new ObjectStreamField("activityKind", EnumC2020b.class), new ObjectStreamField("suffix", String.class), new ObjectStreamField("callbackParameters", Map.class), new ObjectStreamField("partnerParameters", Map.class)};

    /* renamed from: j */
    private transient int f5560j;

    /* renamed from: k */
    private String f5561k;

    /* renamed from: l */
    private String f5562l;

    /* renamed from: m */
    private Map<String, String> f5563m;

    /* renamed from: n */
    private EnumC2020b f5564n;

    /* renamed from: o */
    private String f5565o;

    /* renamed from: p */
    private Map<String, String> f5566p;

    /* renamed from: q */
    private Map<String, String> f5567q;

    /* renamed from: r */
    private int f5568r;

    /* renamed from: s */
    private long f5569s;

    /* renamed from: t */
    private long f5570t;

    /* renamed from: u */
    private long f5571u;

    /* renamed from: v */
    private long f5572v;

    /* renamed from: w */
    private long f5573w;

    /* renamed from: x */
    private String f5574x;

    /* renamed from: y */
    private Boolean f5575y;

    public C2024c(EnumC2020b enumC2020b) {
        EnumC2020b enumC2020b2 = EnumC2020b.UNKNOWN;
        this.f5564n = enumC2020b;
    }

    /* renamed from: A */
    public void m34691A(String str) {
        this.f5574x = str;
    }

    /* renamed from: B */
    public void m34690B(Map<String, String> map) {
        this.f5563m = map;
    }

    /* renamed from: C */
    public void m34689C(Map<String, String> map) {
        this.f5567q = map;
    }

    /* renamed from: D */
    public void m34688D(String str) {
        this.f5561k = str;
    }

    /* renamed from: E */
    public void m34687E(String str) {
        this.f5565o = str;
    }

    /* renamed from: a */
    public EnumC2020b m34686a() {
        return this.f5564n;
    }

    /* renamed from: b */
    public Map<String, String> m34685b() {
        return this.f5566p;
    }

    /* renamed from: c */
    public long m34684c() {
        return this.f5569s;
    }

    /* renamed from: d */
    public long m34683d() {
        return this.f5570t;
    }

    /* renamed from: e */
    public long m34682e() {
        return this.f5572v;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2024c c2024c = (C2024c) obj;
        if (C2043h1.m34476j(this.f5561k, c2024c.f5561k) && C2043h1.m34476j(this.f5562l, c2024c.f5562l) && C2043h1.m34477i(this.f5563m, c2024c.f5563m) && C2043h1.m34483f(this.f5564n, c2024c.f5564n) && C2043h1.m34476j(this.f5565o, c2024c.f5565o) && C2043h1.m34477i(this.f5566p, c2024c.f5566p) && C2043h1.m34477i(this.f5567q, c2024c.f5567q)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public String m34681f() {
        return this.f5562l;
    }

    /* renamed from: g */
    public String m34680g() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C2043h1.m34474l("Path:      %s\n", this.f5561k));
        sb2.append(C2043h1.m34474l("ClientSdk: %s\n", this.f5562l));
        if (this.f5563m != null) {
            sb2.append("Parameters:");
            TreeMap treeMap = new TreeMap(this.f5563m);
            List asList = Arrays.asList("app_secret", "secret_id", "event_callback_id");
            for (Map.Entry entry : treeMap.entrySet()) {
                String str = (String) entry.getKey();
                if (!asList.contains(str)) {
                    sb2.append(C2043h1.m34474l("\n\t%-16s %s", str, entry.getValue()));
                }
            }
        }
        return sb2.toString();
    }

    /* renamed from: h */
    public String m34679h() {
        return C2043h1.m34474l("Failed to track %s%s", this.f5564n.toString(), this.f5565o);
    }

    public int hashCode() {
        if (this.f5560j == 0) {
            this.f5560j = 17;
            int m34504P = (17 * 37) + C2043h1.m34504P(this.f5561k);
            this.f5560j = m34504P;
            int m34504P2 = (m34504P * 37) + C2043h1.m34504P(this.f5562l);
            this.f5560j = m34504P2;
            int m34505O = (m34504P2 * 37) + C2043h1.m34505O(this.f5563m);
            this.f5560j = m34505O;
            int m34507M = (m34505O * 37) + C2043h1.m34507M(this.f5564n);
            this.f5560j = m34507M;
            int m34504P3 = (m34507M * 37) + C2043h1.m34504P(this.f5565o);
            this.f5560j = m34504P3;
            int m34505O2 = (m34504P3 * 37) + C2043h1.m34505O(this.f5566p);
            this.f5560j = m34505O2;
            this.f5560j = (m34505O2 * 37) + C2043h1.m34505O(this.f5567q);
        }
        return this.f5560j;
    }

    /* renamed from: i */
    public Boolean m34678i() {
        return this.f5575y;
    }

    /* renamed from: j */
    public long m34677j() {
        return this.f5571u;
    }

    /* renamed from: k */
    public long m34676k() {
        return this.f5573w;
    }

    /* renamed from: l */
    public String m34675l() {
        return this.f5574x;
    }

    /* renamed from: m */
    public Map<String, String> m34674m() {
        return this.f5563m;
    }

    /* renamed from: n */
    public Map<String, String> m34673n() {
        return this.f5567q;
    }

    /* renamed from: o */
    public String m34672o() {
        return this.f5561k;
    }

    /* renamed from: p */
    public int m34671p() {
        return this.f5568r;
    }

    /* renamed from: q */
    public String m34670q() {
        return this.f5565o;
    }

    /* renamed from: r */
    public int m34669r() {
        int i = this.f5568r + 1;
        this.f5568r = i;
        return i;
    }

    /* renamed from: s */
    public void m34668s(Map<String, String> map) {
        this.f5566p = map;
    }

    /* renamed from: t */
    public void m34667t(long j) {
        this.f5569s = j;
    }

    public String toString() {
        return C2043h1.m34474l("%s%s", this.f5564n.toString(), this.f5565o);
    }

    /* renamed from: u */
    public void m34666u(long j) {
        this.f5570t = j;
    }

    /* renamed from: v */
    public void m34665v(long j) {
        this.f5572v = j;
    }

    /* renamed from: w */
    public void m34664w(String str) {
        this.f5562l = str;
    }

    /* renamed from: x */
    public void m34663x(Boolean bool) {
        this.f5575y = bool;
    }

    /* renamed from: y */
    public void m34662y(long j) {
        this.f5571u = j;
    }

    /* renamed from: z */
    public void m34661z(long j) {
        this.f5573w = j;
    }
}
