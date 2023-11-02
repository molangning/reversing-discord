package p468zg;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C9544i;
import kotlin.collections.C9545j;
import kotlin.collections.C9560w;
import p141hh.C7169i;
import p141hh.EnumC7168h;
import p304qf.C11888u;
import p304qf.C11889v;
import pf.C11591x;
import ph.C11633c;

/* renamed from: zg.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C14209c {

    /* renamed from: a */
    private static final C11633c f36554a = new C11633c("javax.annotation.meta.TypeQualifierNickname");

    /* renamed from: b */
    private static final C11633c f36555b = new C11633c("javax.annotation.meta.TypeQualifier");

    /* renamed from: c */
    private static final C11633c f36556c = new C11633c("javax.annotation.meta.TypeQualifierDefault");

    /* renamed from: d */
    private static final C11633c f36557d = new C11633c("kotlin.annotations.jvm.UnderMigration");

    /* renamed from: e */
    private static final List<EnumC14207b> f36558e;

    /* renamed from: f */
    private static final Map<C11633c, C14251r> f36559f;

    /* renamed from: g */
    private static final Map<C11633c, C14251r> f36560g;

    /* renamed from: h */
    private static final Set<C11633c> f36561h;

    static {
        List<EnumC14207b> m14101l;
        Map<C11633c, C14251r> m6757e;
        List m14109d;
        List m14109d2;
        Map m6751k;
        Map<C11633c, C14251r> m6747o;
        Set<C11633c> m14002i;
        EnumC14207b enumC14207b = EnumC14207b.VALUE_PARAMETER;
        m14101l = C9545j.m14101l(EnumC14207b.FIELD, EnumC14207b.METHOD_RETURN_TYPE, enumC14207b, EnumC14207b.TYPE_PARAMETER_BOUNDS, EnumC14207b.TYPE_USE);
        f36558e = m14101l;
        C11633c m428i = C14210c0.m428i();
        EnumC7168h enumC7168h = EnumC7168h.NOT_NULL;
        m6757e = C11888u.m6757e(C11591x.m7577a(m428i, new C14251r(new C7169i(enumC7168h, false, 2, null), m14101l, false)));
        f36559f = m6757e;
        C11633c c11633c = new C11633c("javax.annotation.ParametersAreNullableByDefault");
        C7169i c7169i = new C7169i(EnumC7168h.NULLABLE, false, 2, null);
        m14109d = C9544i.m14109d(enumC14207b);
        C11633c c11633c2 = new C11633c("javax.annotation.ParametersAreNonnullByDefault");
        C7169i c7169i2 = new C7169i(enumC7168h, false, 2, null);
        m14109d2 = C9544i.m14109d(enumC14207b);
        m6751k = C11889v.m6751k(C11591x.m7577a(c11633c, new C14251r(c7169i, m14109d, false, 4, null)), C11591x.m7577a(c11633c2, new C14251r(c7169i2, m14109d2, false, 4, null)));
        m6747o = C11889v.m6747o(m6751k, m6757e);
        f36560g = m6747o;
        m14002i = C9560w.m14002i(C14210c0.m431f(), C14210c0.m432e());
        f36561h = m14002i;
    }

    /* renamed from: a */
    public static final Map<C11633c, C14251r> m443a() {
        return f36560g;
    }

    /* renamed from: b */
    public static final Set<C11633c> m442b() {
        return f36561h;
    }

    /* renamed from: c */
    public static final Map<C11633c, C14251r> m441c() {
        return f36559f;
    }

    /* renamed from: d */
    public static final C11633c m440d() {
        return f36557d;
    }

    /* renamed from: e */
    public static final C11633c m439e() {
        return f36556c;
    }

    /* renamed from: f */
    public static final C11633c m438f() {
        return f36555b;
    }

    /* renamed from: g */
    public static final C11633c m437g() {
        return f36554a;
    }
}