package p389vh;

import java.util.List;
import kotlin.collections.C9544i;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng.AbstractC10870h;
import ng.C10884k;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p142hi.C7226c1;
import p142hi.C7267h0;
import p142hi.C7276i0;
import p142hi.C7294m1;
import p142hi.EnumC7336w1;
import p142hi.InterfaceC7288k1;
import p183ji.C8967k;
import p183ji.EnumC8966j;
import p234mi.C10472a;
import p305qg.C11994x;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11928h0;
import p429xh.C13801c;
import pf.C11581q;
import ph.C11632b;

/* renamed from: vh.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C13320q extends AbstractC13301g<AbstractC13322b> {

    /* renamed from: b */
    public static final C13321a f34401b = new C13321a(null);

    /* renamed from: vh.q$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C13321a {
        private C13321a() {
        }

        public /* synthetic */ C13321a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AbstractC13301g<?> m2785a(AbstractC7264g0 argumentType) {
            Object m14033q0;
            C9612q.m13917h(argumentType, "argumentType");
            if (C7276i0.m21083a(argumentType)) {
                return null;
            }
            AbstractC7264g0 abstractC7264g0 = argumentType;
            int i = 0;
            while (AbstractC10870h.m9820c0(abstractC7264g0)) {
                m14033q0 = C9553r.m14033q0(abstractC7264g0.mo3566L0());
                abstractC7264g0 = ((InterfaceC7288k1) m14033q0).getType();
                C9612q.m13918g(abstractC7264g0, "type.arguments.single().type");
                i++;
            }
            InterfaceC11927h mo2788p = abstractC7264g0.mo3564N0().mo2788p();
            if (mo2788p instanceof InterfaceC11914e) {
                C11632b m1504k = C13801c.m1504k(mo2788p);
                if (m1504k == null) {
                    return new C13320q(new AbstractC13322b.C13323a(argumentType));
                }
                return new C13320q(m1504k, i);
            } else if (!(mo2788p instanceof InterfaceC11920f1)) {
                return null;
            } else {
                C11632b m7460m = C11632b.m7460m(C10884k.C10885a.f28472b.m7437l());
                C9612q.m13918g(m7460m, "topLevel(StandardNames.FqNames.any.toSafe())");
                return new C13320q(m7460m, 0);
            }
        }
    }

    /* renamed from: vh.q$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static abstract class AbstractC13322b {

        /* renamed from: vh.q$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C13323a extends AbstractC13322b {

            /* renamed from: a */
            private final AbstractC7264g0 f34402a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13323a(AbstractC7264g0 type) {
                super(null);
                C9612q.m13917h(type, "type");
                this.f34402a = type;
            }

            /* renamed from: a */
            public final AbstractC7264g0 m2784a() {
                return this.f34402a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13323a) && C9612q.m13922c(this.f34402a, ((C13323a) obj).f34402a);
            }

            public int hashCode() {
                return this.f34402a.hashCode();
            }

            public String toString() {
                return "LocalClass(type=" + this.f34402a + ')';
            }
        }

        /* renamed from: vh.q$b$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C13324b extends AbstractC13322b {

            /* renamed from: a */
            private final C13300f f34403a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13324b(C13300f value) {
                super(null);
                C9612q.m13917h(value, "value");
                this.f34403a = value;
            }

            /* renamed from: a */
            public final int m2783a() {
                return this.f34403a.m2822c();
            }

            /* renamed from: b */
            public final C11632b m2782b() {
                return this.f34403a.m2821d();
            }

            /* renamed from: c */
            public final C13300f m2781c() {
                return this.f34403a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13324b) && C9612q.m13922c(this.f34403a, ((C13324b) obj).f34403a);
            }

            public int hashCode() {
                return this.f34403a.hashCode();
            }

            public String toString() {
                return "NormalClass(value=" + this.f34403a + ')';
            }
        }

        private AbstractC13322b() {
        }

        public /* synthetic */ AbstractC13322b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13320q(AbstractC13322b value) {
        super(value);
        C9612q.m13917h(value, "value");
    }

    @Override // p389vh.AbstractC13301g
    /* renamed from: a */
    public AbstractC7264g0 mo2775a(InterfaceC11928h0 module) {
        List m14109d;
        C9612q.m13917h(module, "module");
        C7226c1 m21197h = C7226c1.f19622k.m21197h();
        InterfaceC11914e m9846E = module.mo4194n().m9846E();
        C9612q.m13918g(m9846E, "module.builtIns.kClass");
        m14109d = C9544i.m14109d(new C7294m1(m2786c(module)));
        return C7267h0.m21101g(m21197h, m9846E, m14109d);
    }

    /* renamed from: c */
    public final AbstractC7264g0 m2786c(InterfaceC11928h0 module) {
        C9612q.m13917h(module, "module");
        AbstractC13322b mo2813b = mo2813b();
        if (mo2813b instanceof AbstractC13322b.C13323a) {
            return ((AbstractC13322b.C13323a) mo2813b()).m2784a();
        }
        if (mo2813b instanceof AbstractC13322b.C13324b) {
            C13300f m2781c = ((AbstractC13322b.C13324b) mo2813b()).m2781c();
            C11632b m2824a = m2781c.m2824a();
            int m2823b = m2781c.m2823b();
            InterfaceC11914e m6652a = C11994x.m6652a(module, m2824a);
            if (m6652a == null) {
                EnumC8966j enumC8966j = EnumC8966j.UNRESOLVED_KCLASS_CONSTANT_VALUE;
                String c11632b = m2824a.toString();
                C9612q.m13918g(c11632b, "classId.toString()");
                return C8967k.m16945d(enumC8966j, c11632b, String.valueOf(m2823b));
            }
            AbstractC7302o0 mo4224p = m6652a.mo4224p();
            C9612q.m13918g(mo4224p, "descriptor.defaultType");
            AbstractC7264g0 m11435w = C10472a.m11435w(mo4224p);
            for (int i = 0; i < m2823b; i++) {
                m11435w = module.mo4194n().m9804l(EnumC7336w1.INVARIANT, m11435w);
                C9612q.m13918g(m11435w, "module.builtIns.getArray…Variance.INVARIANT, type)");
            }
            return m11435w;
        }
        throw new C11581q();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13320q(C13300f value) {
        this(new AbstractC13322b.C13324b(value));
        C9612q.m13917h(value, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13320q(C11632b classId, int i) {
        this(new C13300f(classId, i));
        C9612q.m13917h(classId, "classId");
    }
}