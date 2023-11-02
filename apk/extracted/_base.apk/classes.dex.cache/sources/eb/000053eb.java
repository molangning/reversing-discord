package p468zg;

import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.C9544i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p304qf.C11889v;
import pf.C11577n;
import ph.C11633c;

/* renamed from: zg.z */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C14266z {

    /* renamed from: a */
    private final EnumC14223g0 f36669a;

    /* renamed from: b */
    private final EnumC14223g0 f36670b;

    /* renamed from: c */
    private final Map<C11633c, EnumC14223g0> f36671c;

    /* renamed from: d */
    private final Lazy f36672d;

    /* renamed from: e */
    private final boolean f36673e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zg.z$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C14267a extends AbstractC9614s implements Function0<String[]> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14267a() {
            super(0);
            C14266z.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String[] invoke() {
            List m14110c;
            List m14112a;
            C14266z c14266z = C14266z.this;
            m14110c = C9544i.m14110c();
            m14110c.add(c14266z.m277a().m388b());
            EnumC14223g0 m276b = c14266z.m276b();
            if (m276b != null) {
                m14110c.add("under-migration:" + m276b.m388b());
            }
            for (Map.Entry<C11633c, EnumC14223g0> entry : c14266z.m275c().entrySet()) {
                m14110c.add('@' + entry.getKey() + ':' + entry.getValue().m388b());
            }
            m14112a = C9544i.m14112a(m14110c);
            return (String[]) m14112a.toArray(new String[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C14266z(EnumC14223g0 globalLevel, EnumC14223g0 enumC14223g0, Map<C11633c, ? extends EnumC14223g0> userDefinedLevelForSpecificAnnotation) {
        Lazy m7601a;
        C9612q.m13917h(globalLevel, "globalLevel");
        C9612q.m13917h(userDefinedLevelForSpecificAnnotation, "userDefinedLevelForSpecificAnnotation");
        this.f36669a = globalLevel;
        this.f36670b = enumC14223g0;
        this.f36671c = userDefinedLevelForSpecificAnnotation;
        m7601a = C11577n.m7601a(new C14267a());
        this.f36672d = m7601a;
        EnumC14223g0 enumC14223g02 = EnumC14223g0.IGNORE;
        this.f36673e = globalLevel == enumC14223g02 && enumC14223g0 == enumC14223g02 && userDefinedLevelForSpecificAnnotation.isEmpty();
    }

    /* renamed from: a */
    public final EnumC14223g0 m277a() {
        return this.f36669a;
    }

    /* renamed from: b */
    public final EnumC14223g0 m276b() {
        return this.f36670b;
    }

    /* renamed from: c */
    public final Map<C11633c, EnumC14223g0> m275c() {
        return this.f36671c;
    }

    /* renamed from: d */
    public final boolean m274d() {
        return this.f36673e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14266z) {
            C14266z c14266z = (C14266z) obj;
            return this.f36669a == c14266z.f36669a && this.f36670b == c14266z.f36670b && C9612q.m13922c(this.f36671c, c14266z.f36671c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f36669a.hashCode() * 31;
        EnumC14223g0 enumC14223g0 = this.f36670b;
        return ((hashCode + (enumC14223g0 == null ? 0 : enumC14223g0.hashCode())) * 31) + this.f36671c.hashCode();
    }

    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.f36669a + ", migrationLevel=" + this.f36670b + ", userDefinedLevelForSpecificAnnotation=" + this.f36671c + ')';
    }

    public /* synthetic */ C14266z(EnumC14223g0 enumC14223g0, EnumC14223g0 enumC14223g02, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC14223g0, (i & 2) != 0 ? null : enumC14223g02, (i & 4) != 0 ? C11889v.m6754h() : map);
    }
}