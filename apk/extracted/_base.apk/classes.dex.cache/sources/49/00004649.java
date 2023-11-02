package p271oi;

import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p271oi.InterfaceC11132f;
import p305qg.InterfaceC11998y;

/* renamed from: oi.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC11168t implements InterfaceC11132f {

    /* renamed from: a */
    private final String f29198a;

    /* renamed from: oi.t$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C11169a extends AbstractC11168t {

        /* renamed from: b */
        private final int f29199b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C11169a(int r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "must have at least "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " value parameter"
                r0.append(r1)
                r1 = 1
                if (r3 <= r1) goto L18
                java.lang.String r1 = "s"
                goto L1a
            L18:
                java.lang.String r1 = ""
            L1a:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 0
                r2.<init>(r0, r1)
                r2.f29199b = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p271oi.AbstractC11168t.C11169a.<init>(int):void");
        }

        @Override // p271oi.InterfaceC11132f
        /* renamed from: a */
        public boolean mo9079a(InterfaceC11998y functionDescriptor) {
            C9612q.m13917h(functionDescriptor, "functionDescriptor");
            if (functionDescriptor.mo4301i().size() >= this.f29199b) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: oi.t$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C11170b extends AbstractC11168t {

        /* renamed from: b */
        private final int f29200b;

        public C11170b(int i) {
            super("must have exactly " + i + " value parameters", null);
            this.f29200b = i;
        }

        @Override // p271oi.InterfaceC11132f
        /* renamed from: a */
        public boolean mo9079a(InterfaceC11998y functionDescriptor) {
            C9612q.m13917h(functionDescriptor, "functionDescriptor");
            if (functionDescriptor.mo4301i().size() == this.f29200b) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: oi.t$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C11171c extends AbstractC11168t {

        /* renamed from: b */
        public static final C11171c f29201b = new C11171c();

        private C11171c() {
            super("must have no value parameters", null);
        }

        @Override // p271oi.InterfaceC11132f
        /* renamed from: a */
        public boolean mo9079a(InterfaceC11998y functionDescriptor) {
            C9612q.m13917h(functionDescriptor, "functionDescriptor");
            return functionDescriptor.mo4301i().isEmpty();
        }
    }

    /* renamed from: oi.t$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C11172d extends AbstractC11168t {

        /* renamed from: b */
        public static final C11172d f29202b = new C11172d();

        private C11172d() {
            super("must have a single value parameter", null);
        }

        @Override // p271oi.InterfaceC11132f
        /* renamed from: a */
        public boolean mo9079a(InterfaceC11998y functionDescriptor) {
            C9612q.m13917h(functionDescriptor, "functionDescriptor");
            if (functionDescriptor.mo4301i().size() == 1) {
                return true;
            }
            return false;
        }
    }

    private AbstractC11168t(String str) {
        this.f29198a = str;
    }

    public /* synthetic */ AbstractC11168t(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // p271oi.InterfaceC11132f
    /* renamed from: b */
    public String mo9080b(InterfaceC11998y interfaceC11998y) {
        return InterfaceC11132f.C11133a.m9112a(this, interfaceC11998y);
    }

    @Override // p271oi.InterfaceC11132f
    public String getDescription() {
        return this.f29198a;
    }
}