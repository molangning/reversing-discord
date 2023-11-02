package vg;

import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C9653o;
import p160ih.InterfaceC7564r;
import p182jh.C8942a;
import p182jh.C8945b;
import p407wg.C13548d;
import ph.C11632b;

/* renamed from: vg.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C13283f implements InterfaceC7564r {

    /* renamed from: c */
    public static final C13284a f34362c = new C13284a(null);

    /* renamed from: a */
    private final Class<?> f34363a;

    /* renamed from: b */
    private final C8942a f34364b;

    /* renamed from: vg.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C13284a {
        private C13284a() {
        }

        public /* synthetic */ C13284a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C13283f m2850a(Class<?> klass) {
            C9612q.m13917h(klass, "klass");
            C8945b c8945b = new C8945b();
            C13280c.f34360a.m2865b(klass, c8945b);
            C8942a m16991m = c8945b.m16991m();
            if (m16991m == null) {
                return null;
            }
            return new C13283f(klass, m16991m, null);
        }
    }

    private C13283f(Class<?> cls, C8942a c8942a) {
        this.f34363a = cls;
        this.f34364b = c8942a;
    }

    public /* synthetic */ C13283f(Class cls, C8942a c8942a, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, c8942a);
    }

    @Override // p160ih.InterfaceC7564r
    /* renamed from: a */
    public String mo2856a() {
        String m13763C;
        StringBuilder sb2 = new StringBuilder();
        String name = this.f34363a.getName();
        C9612q.m13918g(name, "klass.name");
        m13763C = C9653o.m13763C(name, '.', '/', false, 4, null);
        sb2.append(m13763C);
        sb2.append(".class");
        return sb2.toString();
    }

    @Override // p160ih.InterfaceC7564r
    /* renamed from: b */
    public void mo2855b(InterfaceC7564r.InterfaceC7568d visitor, byte[] bArr) {
        C9612q.m13917h(visitor, "visitor");
        C13280c.f34360a.m2858i(this.f34363a, visitor);
    }

    @Override // p160ih.InterfaceC7564r
    /* renamed from: c */
    public C8942a mo2854c() {
        return this.f34364b;
    }

    @Override // p160ih.InterfaceC7564r
    /* renamed from: d */
    public void mo2853d(InterfaceC7564r.InterfaceC7567c visitor, byte[] bArr) {
        C9612q.m13917h(visitor, "visitor");
        C13280c.f34360a.m2865b(this.f34363a, visitor);
    }

    /* renamed from: e */
    public final Class<?> m2852e() {
        return this.f34363a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C13283f) && C9612q.m13922c(this.f34363a, ((C13283f) obj).f34363a);
    }

    public int hashCode() {
        return this.f34363a.hashCode();
    }

    @Override // p160ih.InterfaceC7564r
    /* renamed from: n */
    public C11632b mo2851n() {
        return C13548d.m2246a(this.f34363a);
    }

    public String toString() {
        return C13283f.class.getName() + ": " + this.f34363a;
    }
}
