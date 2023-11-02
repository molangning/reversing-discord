package vg;

import kotlin.Unit;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p070di.C5939k;
import p160ih.C7539f;
import p305qg.InterfaceC11928h0;

/* renamed from: vg.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C13289k {

    /* renamed from: c */
    public static final C13290a f34369c = new C13290a(null);

    /* renamed from: a */
    private final C5939k f34370a;

    /* renamed from: b */
    private final C13278a f34371b;

    /* renamed from: vg.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C13290a {
        private C13290a() {
        }

        public /* synthetic */ C13290a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C13289k m2837a(ClassLoader classLoader) {
            C9612q.m13917h(classLoader, "classLoader");
            C13285g c13285g = new C13285g(classLoader);
            C7539f.C7540a c7540a = C7539f.f20829b;
            ClassLoader classLoader2 = Unit.class.getClassLoader();
            C9612q.m13918g(classLoader2, "Unit::class.java.classLoader");
            C13285g c13285g2 = new C13285g(classLoader2);
            C13281d c13281d = new C13281d(classLoader);
            C7539f.C7540a.C7541a m20463a = c7540a.m20463a(c13285g, c13285g2, c13281d, "runtime module for " + classLoader, C13288j.f34368b, C13291l.f34372a);
            return new C13289k(m20463a.m20462a().m20464a(), new C13278a(m20463a.m20461b(), c13285g), null);
        }
    }

    private C13289k(C5939k c5939k, C13278a c13278a) {
        this.f34370a = c5939k;
        this.f34371b = c13278a;
    }

    public /* synthetic */ C13289k(C5939k c5939k, C13278a c13278a, DefaultConstructorMarker defaultConstructorMarker) {
        this(c5939k, c13278a);
    }

    /* renamed from: a */
    public final C5939k m2840a() {
        return this.f34370a;
    }

    /* renamed from: b */
    public final InterfaceC11928h0 m2839b() {
        return this.f34370a.m24116p();
    }

    /* renamed from: c */
    public final C13278a m2838c() {
        return this.f34371b;
    }
}
