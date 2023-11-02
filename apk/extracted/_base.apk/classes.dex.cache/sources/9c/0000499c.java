package pg;

import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9545j;
import kotlin.collections.C9550o;
import kotlin.collections.C9561x;
import kotlin.jvm.internal.C9612q;
import ng.C10884k;
import p160ih.C7578y;
import p449yh.EnumC14028e;
import ph.C11632b;
import ph.C11634d;

/* renamed from: pg.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C11628k {

    /* renamed from: a */
    public static final C11628k f30185a;

    /* renamed from: b */
    private static final Set<String> f30186b;

    /* renamed from: c */
    private static final Set<String> f30187c;

    /* renamed from: d */
    private static final Set<String> f30188d;

    /* renamed from: e */
    private static final Set<String> f30189e;

    /* renamed from: f */
    private static final Set<String> f30190f;

    /* renamed from: g */
    private static final Set<String> f30191g;

    static {
        Set<String> m13998m;
        Set m13999l;
        Set m13999l2;
        Set m13999l3;
        Set m13999l4;
        Set m13999l5;
        Set<String> m13999l6;
        Set m13999l7;
        Set m13999l8;
        Set m13999l9;
        Set m13999l10;
        Set m13999l11;
        Set<String> m13999l12;
        Set m13999l13;
        Set<String> m13999l14;
        Set m13999l15;
        Set<String> m13999l16;
        C11628k c11628k = new C11628k();
        f30185a = c11628k;
        C7578y c7578y = C7578y.f20876a;
        m13998m = C9561x.m13998m(c7578y.m20374f("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        f30186b = m13998m;
        m13999l = C9561x.m13999l(c11628k.m7482b(), c7578y.m20374f("List", "sort(Ljava/util/Comparator;)V"));
        m13999l2 = C9561x.m13999l(m13999l, c7578y.m20375e("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;"));
        m13999l3 = C9561x.m13999l(m13999l2, c7578y.m20375e("Double", "isInfinite()Z", "isNaN()Z"));
        m13999l4 = C9561x.m13999l(m13999l3, c7578y.m20375e("Float", "isInfinite()Z", "isNaN()Z"));
        m13999l5 = C9561x.m13999l(m13999l4, c7578y.m20375e("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V"));
        m13999l6 = C9561x.m13999l(m13999l5, c7578y.m20375e("CharSequence", "isEmpty()Z"));
        f30187c = m13999l6;
        m13999l7 = C9561x.m13999l(c7578y.m20375e("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), c7578y.m20374f("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V"));
        m13999l8 = C9561x.m13999l(m13999l7, c7578y.m20375e("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;"));
        m13999l9 = C9561x.m13999l(m13999l8, c7578y.m20375e("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V"));
        m13999l10 = C9561x.m13999l(m13999l9, c7578y.m20374f("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z"));
        m13999l11 = C9561x.m13999l(m13999l10, c7578y.m20374f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V"));
        m13999l12 = C9561x.m13999l(m13999l11, c7578y.m20374f("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f30188d = m13999l12;
        m13999l13 = C9561x.m13999l(c7578y.m20374f("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), c7578y.m20374f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V"));
        m13999l14 = C9561x.m13999l(m13999l13, c7578y.m20374f("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        f30189e = m13999l14;
        Set<String> m7483a = c11628k.m7483a();
        String[] m20378b = c7578y.m20378b("D");
        m13999l15 = C9561x.m13999l(m7483a, c7578y.m20375e("Float", (String[]) Arrays.copyOf(m20378b, m20378b.length)));
        String[] m20378b2 = c7578y.m20378b("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        m13999l16 = C9561x.m13999l(m13999l15, c7578y.m20375e("String", (String[]) Arrays.copyOf(m20378b2, m20378b2.length)));
        f30190f = m13999l16;
        String[] m20378b3 = c7578y.m20378b("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f30191g = c7578y.m20375e("Throwable", (String[]) Arrays.copyOf(m20378b3, m20378b3.length));
    }

    private C11628k() {
    }

    /* renamed from: a */
    private final Set<String> m7483a() {
        List<EnumC14028e> m14101l;
        C7578y c7578y = C7578y.f20876a;
        EnumC14028e enumC14028e = EnumC14028e.BYTE;
        m14101l = C9545j.m14101l(EnumC14028e.BOOLEAN, enumC14028e, EnumC14028e.DOUBLE, EnumC14028e.FLOAT, enumC14028e, EnumC14028e.INT, EnumC14028e.LONG, EnumC14028e.SHORT);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC14028e enumC14028e2 : m14101l) {
            String m7426b = enumC14028e2.m874g().m7453g().m7426b();
            C9612q.m13918g(m7426b, "it.wrapperFqName.shortName().asString()");
            String[] m20378b = c7578y.m20378b("Ljava/lang/String;");
            C9550o.m14085y(linkedHashSet, c7578y.m20375e(m7426b, (String[]) Arrays.copyOf(m20378b, m20378b.length)));
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    private final Set<String> m7482b() {
        List<EnumC14028e> m14101l;
        C7578y c7578y = C7578y.f20876a;
        m14101l = C9545j.m14101l(EnumC14028e.BOOLEAN, EnumC14028e.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC14028e enumC14028e : m14101l) {
            String m7426b = enumC14028e.m874g().m7453g().m7426b();
            C9612q.m13918g(m7426b, "it.wrapperFqName.shortName().asString()");
            C9550o.m14085y(linkedHashSet, c7578y.m20375e(m7426b, enumC14028e.m876e() + "Value()" + enumC14028e.m877d()));
        }
        return linkedHashSet;
    }

    /* renamed from: c */
    public final Set<String> m7481c() {
        return f30186b;
    }

    /* renamed from: d */
    public final Set<String> m7480d() {
        return f30190f;
    }

    /* renamed from: e */
    public final Set<String> m7479e() {
        return f30187c;
    }

    /* renamed from: f */
    public final Set<String> m7478f() {
        return f30189e;
    }

    /* renamed from: g */
    public final Set<String> m7477g() {
        return f30191g;
    }

    /* renamed from: h */
    public final Set<String> m7476h() {
        return f30188d;
    }

    /* renamed from: i */
    public final boolean m7475i(C11634d fqName) {
        C9612q.m13917h(fqName, "fqName");
        if (!C9612q.m13922c(fqName, C10884k.C10885a.f28486i) && !C10884k.m9752e(fqName)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final boolean m7474j(C11634d fqName) {
        C9612q.m13917h(fqName, "fqName");
        if (m7475i(fqName)) {
            return true;
        }
        C11632b m7551n = C11599c.f30110a.m7551n(fqName);
        if (m7551n == null) {
            return false;
        }
        try {
            return Serializable.class.isAssignableFrom(Class.forName(m7551n.m7471b().m7458b()));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}