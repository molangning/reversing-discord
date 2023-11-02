package ph;

import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C9653o;

/* renamed from: ph.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C11630a {

    /* renamed from: e */
    private static final C11631a f30192e = new C11631a(null);
    @Deprecated

    /* renamed from: f */
    private static final C11638f f30193f;
    @Deprecated

    /* renamed from: g */
    private static final C11633c f30194g;

    /* renamed from: a */
    private final C11633c f30195a;

    /* renamed from: b */
    private final C11633c f30196b;

    /* renamed from: c */
    private final C11638f f30197c;

    /* renamed from: d */
    private final C11633c f30198d;

    /* renamed from: ph.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static final class C11631a {
        private C11631a() {
        }

        public /* synthetic */ C11631a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        C11638f c11638f = C11640h.f30229m;
        f30193f = c11638f;
        C11633c m7449k = C11633c.m7449k(c11638f);
        C9612q.m13918g(m7449k, "topLevel(LOCAL_NAME)");
        f30194g = m7449k;
    }

    public C11630a(C11633c packageName, C11633c c11633c, C11638f callableName, C11633c c11633c2) {
        C9612q.m13917h(packageName, "packageName");
        C9612q.m13917h(callableName, "callableName");
        this.f30195a = packageName;
        this.f30196b = c11633c;
        this.f30197c = callableName;
        this.f30198d = c11633c2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11630a) {
            C11630a c11630a = (C11630a) obj;
            return C9612q.m13922c(this.f30195a, c11630a.f30195a) && C9612q.m13922c(this.f30196b, c11630a.f30196b) && C9612q.m13922c(this.f30197c, c11630a.f30197c) && C9612q.m13922c(this.f30198d, c11630a.f30198d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f30195a.hashCode() * 31;
        C11633c c11633c = this.f30196b;
        int hashCode2 = (((hashCode + (c11633c == null ? 0 : c11633c.hashCode())) * 31) + this.f30197c.hashCode()) * 31;
        C11633c c11633c2 = this.f30198d;
        return hashCode2 + (c11633c2 != null ? c11633c2.hashCode() : 0);
    }

    public String toString() {
        String m13763C;
        StringBuilder sb2 = new StringBuilder();
        String m7458b = this.f30195a.m7458b();
        C9612q.m13918g(m7458b, "packageName.asString()");
        m13763C = C9653o.m13763C(m7458b, '.', '/', false, 4, null);
        sb2.append(m13763C);
        sb2.append("/");
        C11633c c11633c = this.f30196b;
        if (c11633c != null) {
            sb2.append(c11633c);
            sb2.append(".");
        }
        sb2.append(this.f30197c);
        String sb3 = sb2.toString();
        C9612q.m13918g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public /* synthetic */ C11630a(C11633c c11633c, C11633c c11633c2, C11638f c11638f, C11633c c11633c3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c11633c, c11633c2, c11638f, (i & 8) != 0 ? null : c11633c3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11630a(C11633c packageName, C11638f callableName) {
        this(packageName, null, callableName, null, 8, null);
        C9612q.m13917h(packageName, "packageName");
        C9612q.m13917h(callableName, "callableName");
    }
}