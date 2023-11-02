package p034c1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p021b1.EnumC2020b;

/* renamed from: c1.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2383c {

    /* renamed from: a */
    private final String f6516a;

    /* renamed from: b */
    private final String f6517b;

    /* renamed from: c */
    private final String f6518c;

    /* renamed from: d */
    final List<String> f6519d;

    /* renamed from: e */
    final List<String> f6520e;

    /* renamed from: f */
    final List<String> f6521f;

    /* renamed from: g */
    boolean f6522g = false;

    /* renamed from: h */
    int f6523h = 0;

    /* renamed from: i */
    int f6524i = 0;

    /* renamed from: j */
    boolean f6525j = false;

    public C2383c(String str, String str2, String str3, String str4) {
        this.f6516a = str;
        this.f6517b = str2;
        this.f6518c = str3;
        this.f6519d = m33545a(str4);
        this.f6520e = m33544b(str4);
        this.f6521f = m33541e(str4);
    }

    /* renamed from: a */
    private static List<String> m33545a(String str) {
        if ("url_strategy_india".equals(str)) {
            return Arrays.asList("https://app.adjust.net.in", "https://app.adjust.com");
        }
        if ("url_strategy_china".equals(str)) {
            return Arrays.asList("https://app.adjust.world", "https://app.adjust.com");
        }
        if ("data_residency_eu".equals(str)) {
            return Collections.singletonList("https://app.eu.adjust.com");
        }
        if ("data_residency_tr".equals(str)) {
            return Collections.singletonList("https://app.tr.adjust.com");
        }
        if ("data_residency_us".equals(str)) {
            return Collections.singletonList("https://app.us.adjust.com");
        }
        return Arrays.asList("https://app.adjust.com", "https://app.adjust.net.in", "https://app.adjust.world");
    }

    /* renamed from: b */
    private static List<String> m33544b(String str) {
        if ("url_strategy_india".equals(str)) {
            return Arrays.asList("https://gdpr.adjust.net.in", "https://gdpr.adjust.com");
        }
        if ("url_strategy_china".equals(str)) {
            return Arrays.asList("https://gdpr.adjust.world", "https://gdpr.adjust.com");
        }
        if ("data_residency_eu".equals(str)) {
            return Collections.singletonList("https://gdpr.eu.adjust.com");
        }
        if ("data_residency_tr".equals(str)) {
            return Collections.singletonList("https://gdpr.tr.adjust.com");
        }
        if ("data_residency_us".equals(str)) {
            return Collections.singletonList("https://gdpr.us.adjust.com");
        }
        return Arrays.asList("https://gdpr.adjust.com", "https://gdpr.adjust.net.in", "https://gdpr.adjust.world");
    }

    /* renamed from: e */
    private static List<String> m33541e(String str) {
        if ("url_strategy_india".equals(str)) {
            return Arrays.asList("https://subscription.adjust.net.in", "https://subscription.adjust.com");
        }
        if ("url_strategy_china".equals(str)) {
            return Arrays.asList("https://subscription.adjust.world", "https://subscription.adjust.com");
        }
        if ("data_residency_eu".equals(str)) {
            return Collections.singletonList("https://subscription.eu.adjust.com");
        }
        if ("data_residency_tr".equals(str)) {
            return Collections.singletonList("https://subscription.tr.adjust.com");
        }
        if ("data_residency_us".equals(str)) {
            return Collections.singletonList("https://subscription.us.adjust.com");
        }
        return Arrays.asList("https://subscription.adjust.com", "https://subscription.adjust.net.in", "https://subscription.adjust.world");
    }

    /* renamed from: c */
    public void m33543c() {
        this.f6524i = this.f6523h;
        this.f6522g = true;
    }

    /* renamed from: d */
    public boolean m33542d(EnumC2020b enumC2020b) {
        int size;
        this.f6522g = false;
        if (this.f6525j) {
            return false;
        }
        if (enumC2020b == EnumC2020b.GDPR) {
            size = this.f6520e.size();
        } else if (enumC2020b == EnumC2020b.SUBSCRIPTION) {
            size = this.f6521f.size();
        } else {
            size = this.f6519d.size();
        }
        int i = (this.f6523h + 1) % size;
        this.f6523h = i;
        if (i == this.f6524i) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public String m33540f(EnumC2020b enumC2020b) {
        if (enumC2020b == EnumC2020b.GDPR) {
            String str = this.f6517b;
            if (str != null) {
                this.f6525j = true;
                return str;
            }
            this.f6525j = false;
            return this.f6520e.get(this.f6523h);
        } else if (enumC2020b == EnumC2020b.SUBSCRIPTION) {
            String str2 = this.f6518c;
            if (str2 != null) {
                this.f6525j = true;
                return str2;
            }
            this.f6525j = false;
            return this.f6521f.get(this.f6523h);
        } else {
            String str3 = this.f6516a;
            if (str3 != null) {
                this.f6525j = true;
                return str3;
            }
            this.f6525j = false;
            return this.f6519d.get(this.f6523h);
        }
    }
}
