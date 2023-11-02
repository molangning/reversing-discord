package p271oi;

import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import p271oi.AbstractC11134g;
import p305qg.InterfaceC11998y;
import ph.C11638f;

/* renamed from: oi.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C11138h {

    /* renamed from: a */
    private final C11638f f29113a;

    /* renamed from: b */
    private final Regex f29114b;

    /* renamed from: c */
    private final Collection<C11638f> f29115c;

    /* renamed from: d */
    private final Function1<InterfaceC11998y, String> f29116d;

    /* renamed from: e */
    private final InterfaceC11132f[] f29117e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oi.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C11139a extends AbstractC9614s implements Function1 {

        /* renamed from: j */
        public static final C11139a f29118j = new C11139a();

        C11139a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Void invoke(InterfaceC11998y interfaceC11998y) {
            C9612q.m13917h(interfaceC11998y, "$this$null");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oi.h$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C11140b extends AbstractC9614s implements Function1 {

        /* renamed from: j */
        public static final C11140b f29119j = new C11140b();

        C11140b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Void invoke(InterfaceC11998y interfaceC11998y) {
            C9612q.m13917h(interfaceC11998y, "$this$null");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oi.h$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C11141c extends AbstractC9614s implements Function1 {

        /* renamed from: j */
        public static final C11141c f29120j = new C11141c();

        C11141c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Void invoke(InterfaceC11998y interfaceC11998y) {
            C9612q.m13917h(interfaceC11998y, "$this$null");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C11138h(C11638f c11638f, Regex regex, Collection<C11638f> collection, Function1<? super InterfaceC11998y, String> function1, InterfaceC11132f... interfaceC11132fArr) {
        this.f29113a = c11638f;
        this.f29114b = regex;
        this.f29115c = collection;
        this.f29116d = function1;
        this.f29117e = interfaceC11132fArr;
    }

    /* renamed from: a */
    public final AbstractC11134g m9110a(InterfaceC11998y functionDescriptor) {
        C9612q.m13917h(functionDescriptor, "functionDescriptor");
        for (InterfaceC11132f interfaceC11132f : this.f29117e) {
            String mo9080b = interfaceC11132f.mo9080b(functionDescriptor);
            if (mo9080b != null) {
                return new AbstractC11134g.C11136b(mo9080b);
            }
        }
        String invoke = this.f29116d.invoke(functionDescriptor);
        if (invoke != null) {
            return new AbstractC11134g.C11136b(invoke);
        }
        return AbstractC11134g.C11137c.f29112b;
    }

    /* renamed from: b */
    public final boolean m9109b(InterfaceC11998y functionDescriptor) {
        C9612q.m13917h(functionDescriptor, "functionDescriptor");
        if (this.f29113a != null && !C9612q.m13922c(functionDescriptor.getName(), this.f29113a)) {
            return false;
        }
        if (this.f29114b != null) {
            String m7426b = functionDescriptor.getName().m7426b();
            C9612q.m13918g(m7426b, "functionDescriptor.name.asString()");
            if (!this.f29114b.m13868g(m7426b)) {
                return false;
            }
        }
        Collection<C11638f> collection = this.f29115c;
        if (collection != null && !collection.contains(functionDescriptor.getName())) {
            return false;
        }
        return true;
    }

    public /* synthetic */ C11138h(C11638f c11638f, InterfaceC11132f[] interfaceC11132fArr, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c11638f, interfaceC11132fArr, (i & 4) != 0 ? C11139a.f29118j : function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11138h(C11638f name, InterfaceC11132f[] checks, Function1<? super InterfaceC11998y, String> additionalChecks) {
        this(name, (Regex) null, (Collection<C11638f>) null, additionalChecks, (InterfaceC11132f[]) Arrays.copyOf(checks, checks.length));
        C9612q.m13917h(name, "name");
        C9612q.m13917h(checks, "checks");
        C9612q.m13917h(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ C11138h(Regex regex, InterfaceC11132f[] interfaceC11132fArr, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(regex, interfaceC11132fArr, (i & 4) != 0 ? C11140b.f29119j : function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11138h(Regex regex, InterfaceC11132f[] checks, Function1<? super InterfaceC11998y, String> additionalChecks) {
        this((C11638f) null, regex, (Collection<C11638f>) null, additionalChecks, (InterfaceC11132f[]) Arrays.copyOf(checks, checks.length));
        C9612q.m13917h(regex, "regex");
        C9612q.m13917h(checks, "checks");
        C9612q.m13917h(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ C11138h(Collection collection, InterfaceC11132f[] interfaceC11132fArr, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(collection, interfaceC11132fArr, (i & 4) != 0 ? C11141c.f29120j : function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11138h(Collection<C11638f> nameList, InterfaceC11132f[] checks, Function1<? super InterfaceC11998y, String> additionalChecks) {
        this((C11638f) null, (Regex) null, nameList, additionalChecks, (InterfaceC11132f[]) Arrays.copyOf(checks, checks.length));
        C9612q.m13917h(nameList, "nameList");
        C9612q.m13917h(checks, "checks");
        C9612q.m13917h(additionalChecks, "additionalChecks");
    }
}
