package p021b1;

import com.facebook.react.uimanager.ViewProps;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.Calendar;
import java.util.LinkedList;

/* renamed from: b1.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2027d implements Serializable, Cloneable {

    /* renamed from: L */
    private static final ObjectStreamField[] f5578L;

    /* renamed from: j */
    private transient InterfaceC2025c0 f5590j = C2055l.m34422j();

    /* renamed from: k */
    protected String f5591k = C2043h1.m34487d();

    /* renamed from: l */
    protected boolean f5592l = true;

    /* renamed from: m */
    protected boolean f5593m = false;

    /* renamed from: n */
    protected boolean f5594n = false;

    /* renamed from: o */
    protected boolean f5595o = false;

    /* renamed from: p */
    protected int f5596p = 0;

    /* renamed from: q */
    protected int f5597q = 0;

    /* renamed from: r */
    protected int f5598r = -1;

    /* renamed from: s */
    protected long f5599s = -1;

    /* renamed from: t */
    protected long f5600t = -1;

    /* renamed from: u */
    protected long f5601u = -1;

    /* renamed from: v */
    protected long f5602v = -1;

    /* renamed from: w */
    protected boolean f5603w = false;

    /* renamed from: x */
    protected LinkedList<String> f5604x = null;

    /* renamed from: y */
    protected String f5605y = null;

    /* renamed from: z */
    protected String f5606z = null;

    /* renamed from: A */
    protected long f5579A = 0;

    /* renamed from: B */
    protected long f5580B = 0;

    /* renamed from: C */
    protected String f5581C = null;

    /* renamed from: D */
    protected Boolean f5582D = null;

    /* renamed from: E */
    protected long f5583E = 0;

    /* renamed from: F */
    protected long f5584F = 0;

    /* renamed from: G */
    protected String f5585G = null;

    /* renamed from: H */
    protected long f5586H = 0;

    /* renamed from: I */
    protected long f5587I = 0;

    /* renamed from: J */
    protected String f5588J = null;

    /* renamed from: K */
    protected String f5589K = null;

    static {
        Class cls = Boolean.TYPE;
        Class cls2 = Integer.TYPE;
        Class cls3 = Long.TYPE;
        f5578L = new ObjectStreamField[]{new ObjectStreamField("uuid", String.class), new ObjectStreamField(ViewProps.ENABLED, cls), new ObjectStreamField("isGdprForgotten", cls), new ObjectStreamField("isThirdPartySharingDisabled", cls), new ObjectStreamField("askingAttribution", cls), new ObjectStreamField("eventCount", cls2), new ObjectStreamField("sessionCount", cls2), new ObjectStreamField("subsessionCount", cls2), new ObjectStreamField("sessionLength", cls3), new ObjectStreamField("timeSpent", cls3), new ObjectStreamField("lastActivity", cls3), new ObjectStreamField("lastInterval", cls3), new ObjectStreamField("updatePackages", cls), new ObjectStreamField("orderIds", LinkedList.class), new ObjectStreamField("pushToken", String.class), new ObjectStreamField("adid", String.class), new ObjectStreamField("clickTime", cls3), new ObjectStreamField("installBegin", cls3), new ObjectStreamField("installReferrer", String.class), new ObjectStreamField("googlePlayInstant", Boolean.class), new ObjectStreamField("clickTimeServer", cls3), new ObjectStreamField("installBeginServer", cls3), new ObjectStreamField("installVersion", String.class), new ObjectStreamField("clickTimeHuawei", cls3), new ObjectStreamField("installBeginHuawei", cls3), new ObjectStreamField("installReferrerHuawei", String.class), new ObjectStreamField("installReferrerHuaweiAppGallery", String.class)};
    }

    /* renamed from: e */
    private static String m34656e(long j) {
        Calendar.getInstance().setTimeInMillis(j);
        return C2043h1.m34474l("%02d:%02d:%02d", 11, 12, 13);
    }

    /* renamed from: b */
    public void m34659b(String str) {
        if (this.f5604x == null) {
            this.f5604x = new LinkedList<>();
        }
        if (this.f5604x.size() >= 10) {
            this.f5604x.removeLast();
        }
        this.f5604x.addFirst(str);
    }

    /* renamed from: c */
    public boolean m34658c(String str) {
        LinkedList<String> linkedList = this.f5604x;
        if (linkedList == null) {
            return false;
        }
        return linkedList.contains(str);
    }

    /* renamed from: d */
    public void m34657d(long j) {
        this.f5598r = 1;
        this.f5599s = 0L;
        this.f5600t = 0L;
        this.f5601u = j;
        this.f5602v = -1L;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2027d c2027d = (C2027d) obj;
        if (C2043h1.m34476j(this.f5591k, c2027d.f5591k) && C2043h1.m34485e(Boolean.valueOf(this.f5592l), Boolean.valueOf(c2027d.f5592l)) && C2043h1.m34485e(Boolean.valueOf(this.f5593m), Boolean.valueOf(c2027d.f5593m)) && C2043h1.m34485e(Boolean.valueOf(this.f5594n), Boolean.valueOf(c2027d.f5594n)) && C2043h1.m34485e(Boolean.valueOf(this.f5595o), Boolean.valueOf(c2027d.f5595o)) && C2043h1.m34481g(Integer.valueOf(this.f5596p), Integer.valueOf(c2027d.f5596p)) && C2043h1.m34481g(Integer.valueOf(this.f5597q), Integer.valueOf(c2027d.f5597q)) && C2043h1.m34481g(Integer.valueOf(this.f5598r), Integer.valueOf(c2027d.f5598r)) && C2043h1.m34479h(Long.valueOf(this.f5599s), Long.valueOf(c2027d.f5599s)) && C2043h1.m34479h(Long.valueOf(this.f5600t), Long.valueOf(c2027d.f5600t)) && C2043h1.m34479h(Long.valueOf(this.f5602v), Long.valueOf(c2027d.f5602v)) && C2043h1.m34485e(Boolean.valueOf(this.f5603w), Boolean.valueOf(c2027d.f5603w)) && C2043h1.m34477i(this.f5604x, c2027d.f5604x) && C2043h1.m34476j(this.f5605y, c2027d.f5605y) && C2043h1.m34476j(this.f5606z, c2027d.f5606z) && C2043h1.m34479h(Long.valueOf(this.f5579A), Long.valueOf(c2027d.f5579A)) && C2043h1.m34479h(Long.valueOf(this.f5580B), Long.valueOf(c2027d.f5580B)) && C2043h1.m34476j(this.f5581C, c2027d.f5581C) && C2043h1.m34485e(this.f5582D, c2027d.f5582D) && C2043h1.m34479h(Long.valueOf(this.f5583E), Long.valueOf(c2027d.f5583E)) && C2043h1.m34479h(Long.valueOf(this.f5584F), Long.valueOf(c2027d.f5584F)) && C2043h1.m34476j(this.f5585G, c2027d.f5585G) && C2043h1.m34479h(Long.valueOf(this.f5586H), Long.valueOf(c2027d.f5586H)) && C2043h1.m34479h(Long.valueOf(this.f5587I), Long.valueOf(c2027d.f5587I)) && C2043h1.m34476j(this.f5588J, c2027d.f5588J) && C2043h1.m34476j(this.f5589K, c2027d.f5589K)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((629 + C2043h1.m34504P(this.f5591k)) * 37) + C2043h1.m34509K(Boolean.valueOf(this.f5592l))) * 37) + C2043h1.m34509K(Boolean.valueOf(this.f5593m))) * 37) + C2043h1.m34509K(Boolean.valueOf(this.f5594n))) * 37) + C2043h1.m34509K(Boolean.valueOf(this.f5595o))) * 37) + this.f5596p) * 37) + this.f5597q) * 37) + this.f5598r) * 37) + C2043h1.m34506N(Long.valueOf(this.f5599s))) * 37) + C2043h1.m34506N(Long.valueOf(this.f5600t))) * 37) + C2043h1.m34506N(Long.valueOf(this.f5602v))) * 37) + C2043h1.m34509K(Boolean.valueOf(this.f5603w))) * 37) + C2043h1.m34505O(this.f5604x)) * 37) + C2043h1.m34504P(this.f5605y)) * 37) + C2043h1.m34504P(this.f5606z)) * 37) + C2043h1.m34506N(Long.valueOf(this.f5579A))) * 37) + C2043h1.m34506N(Long.valueOf(this.f5580B))) * 37) + C2043h1.m34504P(this.f5581C)) * 37) + C2043h1.m34509K(this.f5582D)) * 37) + C2043h1.m34506N(Long.valueOf(this.f5583E))) * 37) + C2043h1.m34506N(Long.valueOf(this.f5584F))) * 37) + C2043h1.m34504P(this.f5585G)) * 37) + C2043h1.m34506N(Long.valueOf(this.f5586H))) * 37) + C2043h1.m34506N(Long.valueOf(this.f5587I))) * 37) + C2043h1.m34504P(this.f5588J)) * 37) + C2043h1.m34504P(this.f5589K);
    }

    public String toString() {
        return C2043h1.m34474l("ec:%d sc:%d ssc:%d sl:%.1f ts:%.1f la:%s uuid:%s", Integer.valueOf(this.f5596p), Integer.valueOf(this.f5597q), Integer.valueOf(this.f5598r), Double.valueOf(this.f5599s / 1000.0d), Double.valueOf(this.f5600t / 1000.0d), m34656e(this.f5601u), this.f5591k);
    }
}