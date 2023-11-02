package p381v5;

import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p381v5.C13078b;

@AutoValue
/* renamed from: v5.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC13093i {

    @AutoValue.Builder
    /* renamed from: v5.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC13094a {
        /* renamed from: a */
        public final AbstractC13094a m3293a(String str, int i) {
            mo3289e().put(str, String.valueOf(i));
            return this;
        }

        /* renamed from: b */
        public final AbstractC13094a m3292b(String str, long j) {
            mo3289e().put(str, String.valueOf(j));
            return this;
        }

        /* renamed from: c */
        public final AbstractC13094a m3291c(String str, String str2) {
            mo3289e().put(str, str2);
            return this;
        }

        /* renamed from: d */
        public abstract AbstractC13093i mo3290d();

        /* renamed from: e */
        protected abstract Map<String, String> mo3289e();

        /* renamed from: f */
        protected abstract AbstractC13094a mo3288f(Map<String, String> map);

        /* renamed from: g */
        public abstract AbstractC13094a mo3287g(Integer num);

        /* renamed from: h */
        public abstract AbstractC13094a mo3286h(C13092h c13092h);

        /* renamed from: i */
        public abstract AbstractC13094a mo3285i(long j);

        /* renamed from: j */
        public abstract AbstractC13094a mo3284j(String str);

        /* renamed from: k */
        public abstract AbstractC13094a mo3283k(long j);
    }

    /* renamed from: a */
    public static AbstractC13094a m3305a() {
        return new C13078b.C13080b().mo3288f(new HashMap());
    }

    /* renamed from: b */
    public final String m3304b(String str) {
        String str2 = mo3303c().get(str);
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Map<String, String> mo3303c();

    /* renamed from: d */
    public abstract Integer mo3302d();

    /* renamed from: e */
    public abstract C13092h mo3301e();

    /* renamed from: f */
    public abstract long mo3300f();

    /* renamed from: g */
    public final int m3299g(String str) {
        String str2 = mo3303c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: h */
    public final long m3298h(String str) {
        String str2 = mo3303c().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    /* renamed from: i */
    public final Map<String, String> m3297i() {
        return Collections.unmodifiableMap(mo3303c());
    }

    /* renamed from: j */
    public abstract String mo3296j();

    /* renamed from: k */
    public abstract long mo3295k();

    /* renamed from: l */
    public AbstractC13094a m3294l() {
        return new C13078b.C13080b().mo3284j(mo3296j()).mo3287g(mo3302d()).mo3286h(mo3301e()).mo3285i(mo3300f()).mo3283k(mo3295k()).mo3288f(new HashMap(mo3303c()));
    }
}
