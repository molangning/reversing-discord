package p021b1;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: b1.z0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2114z0 {

    /* renamed from: a */
    public boolean f5952a = false;

    /* renamed from: b */
    public boolean f5953b = false;

    /* renamed from: c */
    public String f5954c;

    /* renamed from: d */
    public String f5955d;

    /* renamed from: e */
    public String f5956e;

    /* renamed from: f */
    public JSONObject f5957f;

    /* renamed from: g */
    public EnumC2020b f5958g;

    /* renamed from: h */
    public EnumC2035f1 f5959h;

    /* renamed from: i */
    public C2036g f5960i;

    /* renamed from: j */
    public Long f5961j;

    /* renamed from: k */
    public Long f5962k;

    /* renamed from: l */
    public Long f5963l;

    /* renamed from: m */
    public C2024c f5964m;

    /* renamed from: n */
    public Map<String, String> f5965n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.z0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static /* synthetic */ class C2115a {

        /* renamed from: a */
        static final /* synthetic */ int[] f5966a;

        static {
            int[] iArr = new int[EnumC2020b.values().length];
            f5966a = iArr;
            try {
                iArr[EnumC2020b.SESSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5966a[EnumC2020b.CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5966a[EnumC2020b.ATTRIBUTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5966a[EnumC2020b.EVENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: a */
    public static C2114z0 m34179a(C2024c c2024c, Map<String, String> map) {
        C2114z0 c2029d1;
        EnumC2020b m34686a = c2024c.m34686a();
        int i = C2115a.f5966a[m34686a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        c2029d1 = new C2114z0();
                    } else {
                        c2029d1 = new C2108y(c2024c);
                    }
                } else {
                    c2029d1 = new C2095v();
                }
            } else {
                c2029d1 = new C2023b1();
            }
        } else {
            c2029d1 = new C2029d1(c2024c);
        }
        c2029d1.f5958g = m34686a;
        c2029d1.f5964m = c2024c;
        c2029d1.f5965n = map;
        return c2029d1;
    }

    public String toString() {
        return C2043h1.m34474l("message:%s timestamp:%s json:%s", this.f5955d, this.f5956e, this.f5957f);
    }
}