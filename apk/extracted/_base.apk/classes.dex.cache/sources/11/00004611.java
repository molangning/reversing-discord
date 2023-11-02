package p270oh;

import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: oh.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC11112d {

    /* renamed from: oh.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C11113a extends AbstractC11112d {

        /* renamed from: a */
        private final String f29082a;

        /* renamed from: b */
        private final String f29083b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11113a(String name, String desc) {
            super(null);
            C9612q.m13917h(name, "name");
            C9612q.m13917h(desc, "desc");
            this.f29082a = name;
            this.f29083b = desc;
        }

        @Override // p270oh.AbstractC11112d
        /* renamed from: a */
        public String mo9140a() {
            return mo9138c() + ':' + mo9139b();
        }

        @Override // p270oh.AbstractC11112d
        /* renamed from: b */
        public String mo9139b() {
            return this.f29083b;
        }

        @Override // p270oh.AbstractC11112d
        /* renamed from: c */
        public String mo9138c() {
            return this.f29082a;
        }

        /* renamed from: d */
        public final String m9142d() {
            return mo9138c();
        }

        /* renamed from: e */
        public final String m9141e() {
            return mo9139b();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C11113a) {
                C11113a c11113a = (C11113a) obj;
                return C9612q.m13922c(mo9138c(), c11113a.mo9138c()) && C9612q.m13922c(mo9139b(), c11113a.mo9139b());
            }
            return false;
        }

        public int hashCode() {
            return (mo9138c().hashCode() * 31) + mo9139b().hashCode();
        }
    }

    /* renamed from: oh.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C11114b extends AbstractC11112d {

        /* renamed from: a */
        private final String f29084a;

        /* renamed from: b */
        private final String f29085b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11114b(String name, String desc) {
            super(null);
            C9612q.m13917h(name, "name");
            C9612q.m13917h(desc, "desc");
            this.f29084a = name;
            this.f29085b = desc;
        }

        @Override // p270oh.AbstractC11112d
        /* renamed from: a */
        public String mo9140a() {
            return mo9138c() + mo9139b();
        }

        @Override // p270oh.AbstractC11112d
        /* renamed from: b */
        public String mo9139b() {
            return this.f29085b;
        }

        @Override // p270oh.AbstractC11112d
        /* renamed from: c */
        public String mo9138c() {
            return this.f29084a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C11114b) {
                C11114b c11114b = (C11114b) obj;
                return C9612q.m13922c(mo9138c(), c11114b.mo9138c()) && C9612q.m13922c(mo9139b(), c11114b.mo9139b());
            }
            return false;
        }

        public int hashCode() {
            return (mo9138c().hashCode() * 31) + mo9139b().hashCode();
        }
    }

    private AbstractC11112d() {
    }

    public /* synthetic */ AbstractC11112d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract String mo9140a();

    /* renamed from: b */
    public abstract String mo9139b();

    /* renamed from: c */
    public abstract String mo9138c();

    public final String toString() {
        return mo9140a();
    }
}