package p271oi;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng.AbstractC10870h;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p271oi.InterfaceC11132f;
import p305qg.InterfaceC11998y;
import p429xh.C13801c;

/* renamed from: oi.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC11159r implements InterfaceC11132f {

    /* renamed from: a */
    private final String f29186a;

    /* renamed from: b */
    private final Function1<AbstractC10870h, AbstractC7264g0> f29187b;

    /* renamed from: c */
    private final String f29188c;

    /* renamed from: oi.r$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C11160a extends AbstractC11159r {

        /* renamed from: d */
        public static final C11160a f29189d = new C11160a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: oi.r$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C11161a extends AbstractC9614s implements Function1<AbstractC10870h, AbstractC7264g0> {

            /* renamed from: j */
            public static final C11161a f29190j = new C11161a();

            C11161a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final AbstractC7264g0 invoke(AbstractC10870h abstractC10870h) {
                C9612q.m13917h(abstractC10870h, "$this$null");
                AbstractC7302o0 booleanType = abstractC10870h.m9800n();
                C9612q.m13918g(booleanType, "booleanType");
                return booleanType;
            }
        }

        private C11160a() {
            super("Boolean", C11161a.f29190j, null);
        }
    }

    /* renamed from: oi.r$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C11162b extends AbstractC11159r {

        /* renamed from: d */
        public static final C11162b f29191d = new C11162b();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: oi.r$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C11163a extends AbstractC9614s implements Function1<AbstractC10870h, AbstractC7264g0> {

            /* renamed from: j */
            public static final C11163a f29192j = new C11163a();

            C11163a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final AbstractC7264g0 invoke(AbstractC10870h abstractC10870h) {
                C9612q.m13917h(abstractC10870h, "$this$null");
                AbstractC7302o0 intType = abstractC10870h.m9848D();
                C9612q.m13918g(intType, "intType");
                return intType;
            }
        }

        private C11162b() {
            super("Int", C11163a.f29192j, null);
        }
    }

    /* renamed from: oi.r$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C11164c extends AbstractC11159r {

        /* renamed from: d */
        public static final C11164c f29193d = new C11164c();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: oi.r$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C11165a extends AbstractC9614s implements Function1<AbstractC10870h, AbstractC7264g0> {

            /* renamed from: j */
            public static final C11165a f29194j = new C11165a();

            C11165a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final AbstractC7264g0 invoke(AbstractC10870h abstractC10870h) {
                C9612q.m13917h(abstractC10870h, "$this$null");
                AbstractC7302o0 unitType = abstractC10870h.m9826Z();
                C9612q.m13918g(unitType, "unitType");
                return unitType;
            }
        }

        private C11164c() {
            super("Unit", C11165a.f29194j, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AbstractC11159r(String str, Function1<? super AbstractC10870h, ? extends AbstractC7264g0> function1) {
        this.f29186a = str;
        this.f29187b = function1;
        this.f29188c = "must return " + str;
    }

    public /* synthetic */ AbstractC11159r(String str, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, function1);
    }

    @Override // p271oi.InterfaceC11132f
    /* renamed from: a */
    public boolean mo9079a(InterfaceC11998y functionDescriptor) {
        C9612q.m13917h(functionDescriptor, "functionDescriptor");
        return C9612q.m13922c(functionDescriptor.getReturnType(), this.f29187b.invoke(C13801c.m1505j(functionDescriptor)));
    }

    @Override // p271oi.InterfaceC11132f
    /* renamed from: b */
    public String mo9080b(InterfaceC11998y interfaceC11998y) {
        return InterfaceC11132f.C11133a.m9112a(this, interfaceC11998y);
    }

    @Override // p271oi.InterfaceC11132f
    public String getDescription() {
        return this.f29188c;
    }
}