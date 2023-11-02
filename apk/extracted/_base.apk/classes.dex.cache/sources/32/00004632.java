package p271oi;

import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p271oi.InterfaceC11132f;
import p305qg.InterfaceC11998y;

/* renamed from: oi.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC11145k implements InterfaceC11132f {

    /* renamed from: a */
    private final String f29124a;

    /* renamed from: oi.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C11146a extends AbstractC11145k {

        /* renamed from: b */
        public static final C11146a f29125b = new C11146a();

        private C11146a() {
            super("must be a member function", null);
        }

        @Override // p271oi.InterfaceC11132f
        /* renamed from: a */
        public boolean mo9079a(InterfaceC11998y functionDescriptor) {
            C9612q.m13917h(functionDescriptor, "functionDescriptor");
            if (functionDescriptor.mo4332I() != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: oi.k$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C11147b extends AbstractC11145k {

        /* renamed from: b */
        public static final C11147b f29126b = new C11147b();

        private C11147b() {
            super("must be a member or an extension function", null);
        }

        @Override // p271oi.InterfaceC11132f
        /* renamed from: a */
        public boolean mo9079a(InterfaceC11998y functionDescriptor) {
            C9612q.m13917h(functionDescriptor, "functionDescriptor");
            if (functionDescriptor.mo4332I() == null && functionDescriptor.mo4329M() == null) {
                return false;
            }
            return true;
        }
    }

    private AbstractC11145k(String str) {
        this.f29124a = str;
    }

    public /* synthetic */ AbstractC11145k(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // p271oi.InterfaceC11132f
    /* renamed from: b */
    public String mo9080b(InterfaceC11998y interfaceC11998y) {
        return InterfaceC11132f.C11133a.m9112a(this, interfaceC11998y);
    }

    @Override // p271oi.InterfaceC11132f
    public String getDescription() {
        return this.f29124a;
    }
}