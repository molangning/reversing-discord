package p468zg;

import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import p160ih.C7575w;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11998y;
import p429xh.C13801c;
import p468zg.C14232i0;
import ph.C11638f;

/* renamed from: zg.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C14218f extends C14232i0 {

    /* renamed from: n */
    public static final C14218f f36586n = new C14218f();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zg.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C14219a extends AbstractC9614s implements Function1<InterfaceC11902b, Boolean> {

        /* renamed from: j */
        public static final C14219a f36587j = new C14219a();

        C14219a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(InterfaceC11902b it) {
            C9612q.m13917h(it, "it");
            return Boolean.valueOf(C14218f.f36586n.m405j(it));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zg.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C14220b extends AbstractC9614s implements Function1<InterfaceC11902b, Boolean> {

        /* renamed from: j */
        public static final C14220b f36588j = new C14220b();

        C14220b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(InterfaceC11902b it) {
            boolean z;
            C9612q.m13917h(it, "it");
            if ((it instanceof InterfaceC11998y) && C14218f.f36586n.m405j(it)) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    private C14218f() {
    }

    /* renamed from: j */
    public final boolean m405j(InterfaceC11902b interfaceC11902b) {
        boolean m14064L;
        m14064L = C9553r.m14064L(C14232i0.f36605a.m354e(), C7575w.m20384d(interfaceC11902b));
        return m14064L;
    }

    /* renamed from: k */
    public static final InterfaceC11998y m404k(InterfaceC11998y functionDescriptor) {
        C9612q.m13917h(functionDescriptor, "functionDescriptor");
        C14218f c14218f = f36586n;
        C11638f name = functionDescriptor.getName();
        C9612q.m13918g(name, "functionDescriptor.name");
        if (!c14218f.m403l(name)) {
            return null;
        }
        return (InterfaceC11998y) C13801c.m1509f(functionDescriptor, false, C14219a.f36587j, 1, null);
    }

    /* renamed from: m */
    public static final C14232i0.EnumC14235b m402m(InterfaceC11902b interfaceC11902b) {
        InterfaceC11902b m1509f;
        String m20384d;
        C9612q.m13917h(interfaceC11902b, "<this>");
        C14232i0.C14233a c14233a = C14232i0.f36605a;
        if (!c14233a.m355d().contains(interfaceC11902b.getName()) || (m1509f = C13801c.m1509f(interfaceC11902b, false, C14220b.f36588j, 1, null)) == null || (m20384d = C7575w.m20384d(m1509f)) == null) {
            return null;
        }
        return c14233a.m347l(m20384d);
    }

    /* renamed from: l */
    public final boolean m403l(C11638f c11638f) {
        C9612q.m13917h(c11638f, "<this>");
        return C14232i0.f36605a.m355d().contains(c11638f);
    }
}