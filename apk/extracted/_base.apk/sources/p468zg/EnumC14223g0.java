package p468zg;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: zg.g0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public enum EnumC14223g0 {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");
    

    /* renamed from: k */
    public static final C14224a f36594k = new C14224a(null);

    /* renamed from: j */
    private final String f36599j;

    /* renamed from: zg.g0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C14224a {
        private C14224a() {
        }

        public /* synthetic */ C14224a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    EnumC14223g0(String str) {
        this.f36599j = str;
    }

    /* renamed from: b */
    public final String m388b() {
        return this.f36599j;
    }

    /* renamed from: c */
    public final boolean m387c() {
        return this == IGNORE;
    }

    /* renamed from: d */
    public final boolean m386d() {
        return this == WARN;
    }
}
