package ng;

import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.C9560w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C11577n;
import pf.EnumC11580p;
import ph.C11633c;
import ph.C11638f;

/* renamed from: ng.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public enum EnumC10876i {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");
    

    /* renamed from: n */
    public static final C10877a f28376n = new C10877a(null);

    /* renamed from: o */
    public static final Set<EnumC10876i> f28377o;

    /* renamed from: j */
    private final C11638f f28387j;

    /* renamed from: k */
    private final C11638f f28388k;

    /* renamed from: l */
    private final Lazy f28389l;

    /* renamed from: m */
    private final Lazy f28390m;

    /* renamed from: ng.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C10877a {
        private C10877a() {
        }

        public /* synthetic */ C10877a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ng.i$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C10878b extends AbstractC9614s implements Function0<C11633c> {
        C10878b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final C11633c invoke() {
            C11633c m7457c = C10884k.f28428u.m7457c(EnumC10876i.this.m9768c());
            C9612q.m13918g(m7457c, "BUILT_INS_PACKAGE_FQ_NAME.child(arrayTypeName)");
            return m7457c;
        }
    }

    /* renamed from: ng.i$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C10879c extends AbstractC9614s implements Function0<C11633c> {
        C10879c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final C11633c invoke() {
            C11633c m7457c = C10884k.f28428u.m7457c(EnumC10876i.this.m9766e());
            C9612q.m13918g(m7457c, "BUILT_INS_PACKAGE_FQ_NAME.child(this.typeName)");
            return m7457c;
        }
    }

    static {
        EnumC10876i enumC10876i;
        EnumC10876i enumC10876i2;
        EnumC10876i enumC10876i3;
        EnumC10876i enumC10876i4;
        EnumC10876i enumC10876i5;
        EnumC10876i enumC10876i6;
        Set<EnumC10876i> m14002i;
        m14002i = C9560w.m14002i(r0, enumC10876i, enumC10876i2, enumC10876i3, enumC10876i4, enumC10876i5, enumC10876i6);
        f28377o = m14002i;
    }

    EnumC10876i(String str) {
        Lazy m7600b;
        Lazy m7600b2;
        C11638f m7422f = C11638f.m7422f(str);
        C9612q.m13918g(m7422f, "identifier(typeName)");
        this.f28387j = m7422f;
        C11638f m7422f2 = C11638f.m7422f(str + "Array");
        C9612q.m13918g(m7422f2, "identifier(\"${typeName}Array\")");
        this.f28388k = m7422f2;
        EnumC11580p enumC11580p = EnumC11580p.PUBLICATION;
        m7600b = C11577n.m7600b(enumC11580p, new C10879c());
        this.f28389l = m7600b;
        m7600b2 = C11577n.m7600b(enumC11580p, new C10878b());
        this.f28390m = m7600b2;
    }

    /* renamed from: b */
    public final C11633c m9769b() {
        return (C11633c) this.f28390m.getValue();
    }

    /* renamed from: c */
    public final C11638f m9768c() {
        return this.f28388k;
    }

    /* renamed from: d */
    public final C11633c m9767d() {
        return (C11633c) this.f28389l.getValue();
    }

    /* renamed from: e */
    public final C11638f m9766e() {
        return this.f28387j;
    }
}
