package p305qg;

import ai.InterfaceC0194h;
import gi.C6820m;
import gi.InterfaceC6815i;
import gi.InterfaceC6821n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9584c0;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import p142hi.InterfaceC7265g1;
import p161ii.AbstractC7592g;
import p429xh.C13801c;

/* renamed from: qg.y0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C12000y0<T extends InterfaceC0194h> {

    /* renamed from: a */
    private final InterfaceC11914e f30988a;

    /* renamed from: b */
    private final Function1<AbstractC7592g, T> f30989b;

    /* renamed from: c */
    private final AbstractC7592g f30990c;

    /* renamed from: d */
    private final InterfaceC6815i f30991d;

    /* renamed from: f */
    static final /* synthetic */ KProperty<Object>[] f30987f = {C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C12000y0.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: e */
    public static final C12001a f30986e = new C12001a(null);

    /* renamed from: qg.y0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C12001a {
        private C12001a() {
        }

        public /* synthetic */ C12001a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final <T extends InterfaceC0194h> C12000y0<T> m6642a(InterfaceC11914e classDescriptor, InterfaceC6821n storageManager, AbstractC7592g kotlinTypeRefinerForOwnerModule, Function1<? super AbstractC7592g, ? extends T> scopeFactory) {
            C9612q.m13917h(classDescriptor, "classDescriptor");
            C9612q.m13917h(storageManager, "storageManager");
            C9612q.m13917h(kotlinTypeRefinerForOwnerModule, "kotlinTypeRefinerForOwnerModule");
            C9612q.m13917h(scopeFactory, "scopeFactory");
            return new C12000y0<>(classDescriptor, storageManager, scopeFactory, kotlinTypeRefinerForOwnerModule, null);
        }
    }

    /* renamed from: qg.y0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C12002b extends AbstractC9614s implements Function0<T> {

        /* renamed from: j */
        final /* synthetic */ C12000y0<T> f30992j;

        /* renamed from: k */
        final /* synthetic */ AbstractC7592g f30993k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12002b(C12000y0<T> c12000y0, AbstractC7592g abstractC7592g) {
            super(0);
            this.f30992j = c12000y0;
            this.f30993k = abstractC7592g;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final T invoke() {
            return (T) ((C12000y0) this.f30992j).f30989b.invoke(this.f30993k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qg.y0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C12003c extends AbstractC9614s implements Function0<T> {

        /* renamed from: j */
        final /* synthetic */ C12000y0<T> f30994j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12003c(C12000y0<T> c12000y0) {
            super(0);
            this.f30994j = c12000y0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final T invoke() {
            return (T) ((C12000y0) this.f30994j).f30989b.invoke(((C12000y0) this.f30994j).f30990c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C12000y0(InterfaceC11914e interfaceC11914e, InterfaceC6821n interfaceC6821n, Function1<? super AbstractC7592g, ? extends T> function1, AbstractC7592g abstractC7592g) {
        this.f30988a = interfaceC11914e;
        this.f30989b = function1;
        this.f30990c = abstractC7592g;
        this.f30991d = interfaceC6821n.mo21867c(new C12003c(this));
    }

    public /* synthetic */ C12000y0(InterfaceC11914e interfaceC11914e, InterfaceC6821n interfaceC6821n, Function1 function1, AbstractC7592g abstractC7592g, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC11914e, interfaceC6821n, function1, abstractC7592g);
    }

    /* renamed from: d */
    private final T m6643d() {
        return (T) C6820m.m21871a(this.f30991d, this, f30987f[0]);
    }

    /* renamed from: c */
    public final T m6644c(AbstractC7592g kotlinTypeRefiner) {
        C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (!kotlinTypeRefiner.mo20280d(C13801c.m1499p(this.f30988a))) {
            return m6643d();
        }
        InterfaceC7265g1 mo4173k = this.f30988a.mo4173k();
        C9612q.m13918g(mo4173k, "classDescriptor.typeConstructor");
        if (!kotlinTypeRefiner.mo20279e(mo4173k)) {
            return m6643d();
        }
        return (T) kotlinTypeRefiner.mo20281c(this.f30988a, new C12002b(this, kotlinTypeRefiner));
    }
}