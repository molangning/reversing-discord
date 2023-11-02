package p070di;

import kh.C9386c;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.C10458b;
import mh.C10468g;
import mh.InterfaceC10463c;
import p305qg.InterfaceC11900a1;
import ph.C11632b;
import ph.C11633c;

/* renamed from: di.z */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC5969z {

    /* renamed from: a */
    private final InterfaceC10463c f16995a;

    /* renamed from: b */
    private final C10468g f16996b;

    /* renamed from: c */
    private final InterfaceC11900a1 f16997c;

    /* renamed from: di.z$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C5970a extends AbstractC5969z {

        /* renamed from: d */
        private final C9386c f16998d;

        /* renamed from: e */
        private final C5970a f16999e;

        /* renamed from: f */
        private final C11632b f17000f;

        /* renamed from: g */
        private final C9386c.EnumC9389c f17001g;

        /* renamed from: h */
        private final boolean f17002h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5970a(C9386c classProto, InterfaceC10463c nameResolver, C10468g typeTable, InterfaceC11900a1 interfaceC11900a1, C5970a c5970a) {
            super(nameResolver, typeTable, interfaceC11900a1, null);
            C9612q.m13917h(classProto, "classProto");
            C9612q.m13917h(nameResolver, "nameResolver");
            C9612q.m13917h(typeTable, "typeTable");
            this.f16998d = classProto;
            this.f16999e = c5970a;
            this.f17000f = C5967x.m24062a(nameResolver, classProto.m15640F0());
            C9386c.EnumC9389c mo11488d = C10458b.f27322f.mo11488d(classProto.m15642E0());
            this.f17001g = mo11488d == null ? C9386c.EnumC9389c.CLASS : mo11488d;
            Boolean mo11488d2 = C10458b.f27323g.mo11488d(classProto.m15642E0());
            C9612q.m13918g(mo11488d2, "IS_INNER.get(classProto.flags)");
            this.f17002h = mo11488d2.booleanValue();
        }

        @Override // p070di.AbstractC5969z
        /* renamed from: a */
        public C11633c mo24051a() {
            C11633c m7471b = this.f17000f.m7471b();
            C9612q.m13918g(m7471b, "classId.asSingleFqName()");
            return m7471b;
        }

        /* renamed from: e */
        public final C11632b m24056e() {
            return this.f17000f;
        }

        /* renamed from: f */
        public final C9386c m24055f() {
            return this.f16998d;
        }

        /* renamed from: g */
        public final C9386c.EnumC9389c m24054g() {
            return this.f17001g;
        }

        /* renamed from: h */
        public final C5970a m24053h() {
            return this.f16999e;
        }

        /* renamed from: i */
        public final boolean m24052i() {
            return this.f17002h;
        }
    }

    /* renamed from: di.z$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C5971b extends AbstractC5969z {

        /* renamed from: d */
        private final C11633c f17003d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5971b(C11633c fqName, InterfaceC10463c nameResolver, C10468g typeTable, InterfaceC11900a1 interfaceC11900a1) {
            super(nameResolver, typeTable, interfaceC11900a1, null);
            C9612q.m13917h(fqName, "fqName");
            C9612q.m13917h(nameResolver, "nameResolver");
            C9612q.m13917h(typeTable, "typeTable");
            this.f17003d = fqName;
        }

        @Override // p070di.AbstractC5969z
        /* renamed from: a */
        public C11633c mo24051a() {
            return this.f17003d;
        }
    }

    private AbstractC5969z(InterfaceC10463c interfaceC10463c, C10468g c10468g, InterfaceC11900a1 interfaceC11900a1) {
        this.f16995a = interfaceC10463c;
        this.f16996b = c10468g;
        this.f16997c = interfaceC11900a1;
    }

    public /* synthetic */ AbstractC5969z(InterfaceC10463c interfaceC10463c, C10468g c10468g, InterfaceC11900a1 interfaceC11900a1, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC10463c, c10468g, interfaceC11900a1);
    }

    /* renamed from: a */
    public abstract C11633c mo24051a();

    /* renamed from: b */
    public final InterfaceC10463c m24059b() {
        return this.f16995a;
    }

    /* renamed from: c */
    public final InterfaceC11900a1 m24058c() {
        return this.f16997c;
    }

    /* renamed from: d */
    public final C10468g m24057d() {
        return this.f16996b;
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + mo24051a();
    }
}
