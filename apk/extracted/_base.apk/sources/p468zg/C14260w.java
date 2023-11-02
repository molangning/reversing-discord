package p468zg;

import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C11572k;

/* renamed from: zg.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C14260w {

    /* renamed from: d */
    public static final C14261a f36657d = new C14261a(null);

    /* renamed from: e */
    private static final C14260w f36658e = new C14260w(EnumC14223g0.STRICT, null, null, 6, null);

    /* renamed from: a */
    private final EnumC14223g0 f36659a;

    /* renamed from: b */
    private final C11572k f36660b;

    /* renamed from: c */
    private final EnumC14223g0 f36661c;

    /* renamed from: zg.w$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C14261a {
        private C14261a() {
        }

        public /* synthetic */ C14261a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C14260w m286a() {
            return C14260w.f36658e;
        }
    }

    public C14260w(EnumC14223g0 reportLevelBefore, C11572k c11572k, EnumC14223g0 reportLevelAfter) {
        C9612q.m13917h(reportLevelBefore, "reportLevelBefore");
        C9612q.m13917h(reportLevelAfter, "reportLevelAfter");
        this.f36659a = reportLevelBefore;
        this.f36660b = c11572k;
        this.f36661c = reportLevelAfter;
    }

    /* renamed from: b */
    public final EnumC14223g0 m289b() {
        return this.f36661c;
    }

    /* renamed from: c */
    public final EnumC14223g0 m288c() {
        return this.f36659a;
    }

    /* renamed from: d */
    public final C11572k m287d() {
        return this.f36660b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14260w) {
            C14260w c14260w = (C14260w) obj;
            return this.f36659a == c14260w.f36659a && C9612q.m13922c(this.f36660b, c14260w.f36660b) && this.f36661c == c14260w.f36661c;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f36659a.hashCode() * 31;
        C11572k c11572k = this.f36660b;
        return ((hashCode + (c11572k == null ? 0 : c11572k.hashCode())) * 31) + this.f36661c.hashCode();
    }

    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f36659a + ", sinceVersion=" + this.f36660b + ", reportLevelAfter=" + this.f36661c + ')';
    }

    public /* synthetic */ C14260w(EnumC14223g0 enumC14223g0, C11572k c11572k, EnumC14223g0 enumC14223g02, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC14223g0, (i & 2) != 0 ? new C11572k(1, 0) : c11572k, (i & 4) != 0 ? enumC14223g0 : enumC14223g02);
    }
}
