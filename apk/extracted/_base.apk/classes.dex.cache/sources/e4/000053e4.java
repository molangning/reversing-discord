package p468zg;

import java.util.Map;
import kotlin.jvm.internal.C9612q;
import p304qf.C11889v;
import p468zg.C14260w;
import pf.C11572k;
import pf.C11591x;
import ph.C11633c;

/* renamed from: zg.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C14259v {

    /* renamed from: a */
    private static final C11633c f36650a;

    /* renamed from: b */
    private static final C11633c f36651b;

    /* renamed from: c */
    private static final C11633c f36652c;

    /* renamed from: d */
    private static final String f36653d;

    /* renamed from: e */
    private static final C11633c[] f36654e;

    /* renamed from: f */
    private static final InterfaceC14212d0<C14260w> f36655f;

    /* renamed from: g */
    private static final C14260w f36656g;

    static {
        Map m6751k;
        C11633c c11633c = new C11633c("org.jspecify.nullness");
        f36650a = c11633c;
        C11633c c11633c2 = new C11633c("io.reactivex.rxjava3.annotations");
        f36651b = c11633c2;
        C11633c c11633c3 = new C11633c("org.checkerframework.checker.nullness.compatqual");
        f36652c = c11633c3;
        String m7458b = c11633c2.m7458b();
        C9612q.m13918g(m7458b, "RXJAVA3_ANNOTATIONS_PACKAGE.asString()");
        f36653d = m7458b;
        f36654e = new C11633c[]{new C11633c(m7458b + ".Nullable"), new C11633c(m7458b + ".NonNull")};
        C11633c c11633c4 = new C11633c("org.jetbrains.annotations");
        C14260w.C14261a c14261a = C14260w.f36657d;
        C11633c c11633c5 = new C11633c("androidx.annotation.RecentlyNullable");
        EnumC14223g0 enumC14223g0 = EnumC14223g0.WARN;
        C11572k c11572k = new C11572k(1, 9);
        EnumC14223g0 enumC14223g02 = EnumC14223g0.STRICT;
        m6751k = C11889v.m6751k(C11591x.m7577a(c11633c4, c14261a.m286a()), C11591x.m7577a(new C11633c("androidx.annotation"), c14261a.m286a()), C11591x.m7577a(new C11633c("android.support.annotation"), c14261a.m286a()), C11591x.m7577a(new C11633c("android.annotation"), c14261a.m286a()), C11591x.m7577a(new C11633c("com.android.annotations"), c14261a.m286a()), C11591x.m7577a(new C11633c("org.eclipse.jdt.annotation"), c14261a.m286a()), C11591x.m7577a(new C11633c("org.checkerframework.checker.nullness.qual"), c14261a.m286a()), C11591x.m7577a(c11633c3, c14261a.m286a()), C11591x.m7577a(new C11633c("javax.annotation"), c14261a.m286a()), C11591x.m7577a(new C11633c("edu.umd.cs.findbugs.annotations"), c14261a.m286a()), C11591x.m7577a(new C11633c("io.reactivex.annotations"), c14261a.m286a()), C11591x.m7577a(c11633c5, new C14260w(enumC14223g0, null, null, 4, null)), C11591x.m7577a(new C11633c("androidx.annotation.RecentlyNonNull"), new C14260w(enumC14223g0, null, null, 4, null)), C11591x.m7577a(new C11633c("lombok"), c14261a.m286a()), C11591x.m7577a(c11633c, new C14260w(enumC14223g0, c11572k, enumC14223g02)), C11591x.m7577a(c11633c2, new C14260w(enumC14223g0, new C11572k(1, 8), enumC14223g02)));
        f36655f = new C14216e0(m6751k);
        f36656g = new C14260w(enumC14223g0, null, null, 4, null);
    }

    /* renamed from: a */
    public static final C14266z m298a(C11572k configuredKotlinVersion) {
        EnumC14223g0 m288c;
        C9612q.m13917h(configuredKotlinVersion, "configuredKotlinVersion");
        C14260w c14260w = f36656g;
        if (c14260w.m287d() != null && c14260w.m287d().compareTo(configuredKotlinVersion) <= 0) {
            m288c = c14260w.m289b();
        } else {
            m288c = c14260w.m288c();
        }
        EnumC14223g0 enumC14223g0 = m288c;
        return new C14266z(enumC14223g0, m296c(enumC14223g0), null, 4, null);
    }

    /* renamed from: b */
    public static /* synthetic */ C14266z m297b(C11572k c11572k, int i, Object obj) {
        if ((i & 1) != 0) {
            c11572k = C11572k.f30079o;
        }
        return m298a(c11572k);
    }

    /* renamed from: c */
    public static final EnumC14223g0 m296c(EnumC14223g0 globalReportLevel) {
        C9612q.m13917h(globalReportLevel, "globalReportLevel");
        if (globalReportLevel == EnumC14223g0.WARN) {
            return null;
        }
        return globalReportLevel;
    }

    /* renamed from: d */
    public static final EnumC14223g0 m295d(C11633c annotationFqName) {
        C9612q.m13917h(annotationFqName, "annotationFqName");
        return m291h(annotationFqName, InterfaceC14212d0.f36577a.m414a(), null, 4, null);
    }

    /* renamed from: e */
    public static final C11633c m294e() {
        return f36650a;
    }

    /* renamed from: f */
    public static final C11633c[] m293f() {
        return f36654e;
    }

    /* renamed from: g */
    public static final EnumC14223g0 m292g(C11633c annotation, InterfaceC14212d0<? extends EnumC14223g0> configuredReportLevels, C11572k configuredKotlinVersion) {
        C9612q.m13917h(annotation, "annotation");
        C9612q.m13917h(configuredReportLevels, "configuredReportLevels");
        C9612q.m13917h(configuredKotlinVersion, "configuredKotlinVersion");
        EnumC14223g0 mo409a = configuredReportLevels.mo409a(annotation);
        if (mo409a != null) {
            return mo409a;
        }
        C14260w mo409a2 = f36655f.mo409a(annotation);
        if (mo409a2 == null) {
            return EnumC14223g0.IGNORE;
        }
        if (mo409a2.m287d() != null && mo409a2.m287d().compareTo(configuredKotlinVersion) <= 0) {
            return mo409a2.m289b();
        }
        return mo409a2.m288c();
    }

    /* renamed from: h */
    public static /* synthetic */ EnumC14223g0 m291h(C11633c c11633c, InterfaceC14212d0 interfaceC14212d0, C11572k c11572k, int i, Object obj) {
        if ((i & 4) != 0) {
            c11572k = new C11572k(1, 7, 20);
        }
        return m292g(c11633c, interfaceC14212d0, c11572k);
    }
}