package p468zg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C9538f;
import kotlin.collections.C9553r;
import kotlin.collections.C9561x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng.C10884k;
import p141hh.C7169i;
import p141hh.EnumC7166f;
import p164j$.util.concurrent.ConcurrentHashMap;
import p325rg.EnumC12168n;
import ph.C11633c;

/* renamed from: zg.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class AbstractC14203a<TAnnotation> {

    /* renamed from: c */
    private static final C14204a f36514c = new C14204a(null);
    @Deprecated

    /* renamed from: d */
    private static final Map<String, EnumC14207b> f36515d;

    /* renamed from: a */
    private final C14262x f36516a;

    /* renamed from: b */
    private final ConcurrentHashMap<Object, TAnnotation> f36517b;

    /* renamed from: zg.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    private static final class C14204a {
        private C14204a() {
        }

        public /* synthetic */ C14204a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: zg.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C14205b extends AbstractC9614s implements Function1<TAnnotation, Boolean> {

        /* renamed from: j */
        public static final C14205b f36518j = new C14205b();

        C14205b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(TAnnotation extractNullability) {
            C9612q.m13917h(extractNullability, "$this$extractNullability");
            return Boolean.FALSE;
        }
    }

    static {
        EnumC14207b[] values;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EnumC14207b enumC14207b : EnumC14207b.values()) {
            String m444b = enumC14207b.m444b();
            if (linkedHashMap.get(m444b) == null) {
                linkedHashMap.put(m444b, enumC14207b);
            }
        }
        f36515d = linkedHashMap;
    }

    public AbstractC14203a(C14262x javaTypeEnhancementState) {
        C9612q.m13917h(javaTypeEnhancementState, "javaTypeEnhancementState");
        this.f36516a = javaTypeEnhancementState;
        this.f36517b = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private final Set<EnumC14207b> m468a(Set<? extends EnumC14207b> set) {
        Set m14240H0;
        Set m14000k;
        Set<EnumC14207b> m13999l;
        if (set.contains(EnumC14207b.TYPE_USE)) {
            m14240H0 = C9538f.m14240H0(EnumC14207b.values());
            m14000k = C9561x.m14000k(m14240H0, EnumC14207b.TYPE_PARAMETER_BOUNDS);
            m13999l = C9561x.m13999l(m14000k, set);
            return m13999l;
        }
        return set;
    }

    /* renamed from: d */
    private final C14251r m466d(TAnnotation tannotation) {
        C7169i m463g;
        C14251r m455r = m455r(tannotation);
        if (m455r != null) {
            return m455r;
        }
        Pair<TAnnotation, Set<EnumC14207b>> m453t = m453t(tannotation);
        if (m453t == null) {
            return null;
        }
        TAnnotation m14351a = m453t.m14351a();
        Set<EnumC14207b> m14350b = m453t.m14350b();
        EnumC14223g0 m456q = m456q(tannotation);
        if (m456q == null) {
            m456q = m457p(m14351a);
        }
        if (m456q.m387c() || (m463g = m463g(m14351a, C14205b.f36518j)) == null) {
            return null;
        }
        return new C14251r(C7169i.m21322b(m463g, null, m456q.m386d(), 1, null), m14350b, false, 4, null);
    }

    /* renamed from: g */
    private final C7169i m463g(TAnnotation tannotation, Function1<? super TAnnotation, Boolean> function1) {
        C7169i m459n;
        C7169i m459n2 = m459n(tannotation, function1.invoke(tannotation).booleanValue());
        if (m459n2 != null) {
            return m459n2;
        }
        TAnnotation m454s = m454s(tannotation);
        if (m454s == null) {
            return null;
        }
        EnumC14223g0 m457p = m457p(tannotation);
        if (m457p.m387c() || (m459n = m459n(m454s, function1.invoke(m454s).booleanValue())) == null) {
            return null;
        }
        return C7169i.m21322b(m459n, null, m457p.m386d(), 1, null);
    }

    /* renamed from: h */
    private final TAnnotation m462h(TAnnotation tannotation, C11633c c11633c) {
        for (TAnnotation tannotation2 : mo420k(tannotation)) {
            if (C9612q.m13922c(mo422i(tannotation2), c11633c)) {
                return tannotation2;
            }
        }
        return null;
    }

    /* renamed from: l */
    private final boolean m461l(TAnnotation tannotation, C11633c c11633c) {
        Iterable<TAnnotation> mo420k = mo420k(tannotation);
        if ((mo420k instanceof Collection) && ((Collection) mo420k).isEmpty()) {
            return false;
        }
        for (TAnnotation tannotation2 : mo420k) {
            if (C9612q.m13922c(mo422i(tannotation2), c11633c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0096, code lost:
        if (r6.equals("MAYBE") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0099, code lost:
        r6 = p141hh.EnumC7168h.NULLABLE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0078, code lost:
        if (r6.equals("ALWAYS") != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x008d, code lost:
        if (r6.equals("NEVER") == false) goto L42;
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final p141hh.C7169i m459n(TAnnotation r6, boolean r7) {
        /*
            r5 = this;
            ph.c r0 = r5.mo422i(r6)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            zg.x r2 = r5.f36516a
            kotlin.jvm.functions.Function1 r2 = r2.m283c()
            java.lang.Object r2 = r2.invoke(r0)
            zg.g0 r2 = (p468zg.EnumC14223g0) r2
            boolean r3 = r2.m387c()
            if (r3 == 0) goto L1b
            return r1
        L1b:
            java.util.List r3 = p468zg.C14210c0.m425l()
            boolean r3 = r3.contains(r0)
            r4 = 0
            if (r3 == 0) goto L2a
            hh.h r6 = p141hh.EnumC7168h.NULLABLE
            goto Ld3
        L2a:
            java.util.List r3 = p468zg.C14210c0.m426k()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L38
            hh.h r6 = p141hh.EnumC7168h.NOT_NULL
            goto Ld3
        L38:
            ph.c r3 = p468zg.C14210c0.m430g()
            boolean r3 = kotlin.jvm.internal.C9612q.m13922c(r0, r3)
            if (r3 == 0) goto L46
            hh.h r6 = p141hh.EnumC7168h.NULLABLE
            goto Ld3
        L46:
            ph.c r3 = p468zg.C14210c0.m429h()
            boolean r3 = kotlin.jvm.internal.C9612q.m13922c(r0, r3)
            if (r3 == 0) goto L54
            hh.h r6 = p141hh.EnumC7168h.FORCE_FLEXIBILITY
            goto Ld3
        L54:
            ph.c r3 = p468zg.C14210c0.m431f()
            boolean r3 = kotlin.jvm.internal.C9612q.m13922c(r0, r3)
            if (r3 == 0) goto La0
            java.lang.Iterable r6 = r5.mo423b(r6, r4)
            java.lang.Object r6 = kotlin.collections.C9543h.m14161U(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L9d
            int r0 = r6.hashCode()
            switch(r0) {
                case 73135176: goto L90;
                case 74175084: goto L87;
                case 433141802: goto L7b;
                case 1933739535: goto L72;
                default: goto L71;
            }
        L71:
            goto L9c
        L72:
            java.lang.String r0 = "ALWAYS"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L9c
            goto L9d
        L7b:
            java.lang.String r0 = "UNKNOWN"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L84
            goto L9c
        L84:
            hh.h r6 = p141hh.EnumC7168h.FORCE_FLEXIBILITY
            goto Ld3
        L87:
            java.lang.String r0 = "NEVER"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L99
            goto L9c
        L90:
            java.lang.String r0 = "MAYBE"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L99
            goto L9c
        L99:
            hh.h r6 = p141hh.EnumC7168h.NULLABLE
            goto Ld3
        L9c:
            return r1
        L9d:
            hh.h r6 = p141hh.EnumC7168h.NOT_NULL
            goto Ld3
        La0:
            ph.c r6 = p468zg.C14210c0.m433d()
            boolean r6 = kotlin.jvm.internal.C9612q.m13922c(r0, r6)
            if (r6 == 0) goto Lad
            hh.h r6 = p141hh.EnumC7168h.NULLABLE
            goto Ld3
        Lad:
            ph.c r6 = p468zg.C14210c0.m434c()
            boolean r6 = kotlin.jvm.internal.C9612q.m13922c(r0, r6)
            if (r6 == 0) goto Lba
            hh.h r6 = p141hh.EnumC7168h.NOT_NULL
            goto Ld3
        Lba:
            ph.c r6 = p468zg.C14210c0.m436a()
            boolean r6 = kotlin.jvm.internal.C9612q.m13922c(r0, r6)
            if (r6 == 0) goto Lc7
            hh.h r6 = p141hh.EnumC7168h.NOT_NULL
            goto Ld3
        Lc7:
            ph.c r6 = p468zg.C14210c0.m435b()
            boolean r6 = kotlin.jvm.internal.C9612q.m13922c(r0, r6)
            if (r6 == 0) goto Le2
            hh.h r6 = p141hh.EnumC7168h.NULLABLE
        Ld3:
            hh.i r0 = new hh.i
            boolean r1 = r2.m386d()
            if (r1 != 0) goto Ldd
            if (r7 == 0) goto Lde
        Ldd:
            r4 = 1
        Lde:
            r0.<init>(r6, r4)
            return r0
        Le2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p468zg.AbstractC14203a.m459n(java.lang.Object, boolean):hh.i");
    }

    /* renamed from: o */
    private final EnumC14223g0 m458o(TAnnotation tannotation) {
        C11633c mo422i = mo422i(tannotation);
        if (mo422i != null && C14209c.m441c().containsKey(mo422i)) {
            return this.f36516a.m283c().invoke(mo422i);
        }
        return m457p(tannotation);
    }

    /* renamed from: p */
    private final EnumC14223g0 m457p(TAnnotation tannotation) {
        EnumC14223g0 m456q = m456q(tannotation);
        if (m456q != null) {
            return m456q;
        }
        return this.f36516a.m282d().m277a();
    }

    /* renamed from: q */
    private final EnumC14223g0 m456q(TAnnotation tannotation) {
        Iterable<String> mo423b;
        Object m14055U;
        EnumC14223g0 enumC14223g0 = this.f36516a.m282d().m275c().get(mo422i(tannotation));
        if (enumC14223g0 != null) {
            return enumC14223g0;
        }
        TAnnotation m462h = m462h(tannotation, C14209c.m440d());
        if (m462h == null || (mo423b = mo423b(m462h, false)) == null) {
            return null;
        }
        m14055U = C9553r.m14055U(mo423b);
        String str = (String) m14055U;
        if (str == null) {
            return null;
        }
        EnumC14223g0 m276b = this.f36516a.m282d().m276b();
        if (m276b == null) {
            int hashCode = str.hashCode();
            if (hashCode != -2137067054) {
                if (hashCode != -1838656823) {
                    if (hashCode != 2656902 || !str.equals("WARN")) {
                        return null;
                    }
                    return EnumC14223g0.WARN;
                } else if (!str.equals("STRICT")) {
                    return null;
                } else {
                    return EnumC14223g0.STRICT;
                }
            } else if (!str.equals("IGNORE")) {
                return null;
            } else {
                return EnumC14223g0.IGNORE;
            }
        }
        return m276b;
    }

    /* renamed from: r */
    private final C14251r m455r(TAnnotation tannotation) {
        C14251r c14251r;
        boolean z;
        if (this.f36516a.m284b() || (c14251r = C14209c.m443a().get(mo422i(tannotation))) == null) {
            return null;
        }
        EnumC14223g0 m458o = m458o(tannotation);
        if (m458o != EnumC14223g0.IGNORE) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            m458o = null;
        }
        if (m458o == null) {
            return null;
        }
        return C14251r.m320b(c14251r, C7169i.m21322b(c14251r.m318d(), null, m458o.m386d(), 1, null), null, false, 6, null);
    }

    /* renamed from: t */
    private final Pair<TAnnotation, Set<EnumC14207b>> m453t(TAnnotation tannotation) {
        TAnnotation m462h;
        TAnnotation tannotation2;
        boolean z;
        if (this.f36516a.m282d().m274d() || (m462h = m462h(tannotation, C14209c.m439e())) == null) {
            return null;
        }
        Iterator<TAnnotation> it = mo420k(tannotation).iterator();
        while (true) {
            if (it.hasNext()) {
                tannotation2 = it.next();
                if (m454s(tannotation2) != null) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            } else {
                tannotation2 = null;
                break;
            }
        }
        if (tannotation2 == null) {
            return null;
        }
        Iterable<String> mo423b = mo423b(m462h, true);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : mo423b) {
            EnumC14207b enumC14207b = f36515d.get(str);
            if (enumC14207b != null) {
                linkedHashSet.add(enumC14207b);
            }
        }
        return new Pair<>(tannotation2, m468a(linkedHashSet));
    }

    /* renamed from: b */
    protected abstract Iterable<String> mo423b(TAnnotation tannotation, boolean z);

    /* renamed from: c */
    public final C14265y m467c(C14265y c14265y, Iterable<? extends TAnnotation> annotations) {
        EnumMap enumMap;
        EnumMap<EnumC14207b, C14251r> m278b;
        C9612q.m13917h(annotations, "annotations");
        if (this.f36516a.m284b()) {
            return c14265y;
        }
        ArrayList<C14251r> arrayList = new ArrayList();
        for (TAnnotation tannotation : annotations) {
            C14251r m466d = m466d(tannotation);
            if (m466d != null) {
                arrayList.add(m466d);
            }
        }
        if (arrayList.isEmpty()) {
            return c14265y;
        }
        if (c14265y != null && (m278b = c14265y.m278b()) != null) {
            enumMap = new EnumMap((EnumMap) m278b);
        } else {
            enumMap = new EnumMap(EnumC14207b.class);
        }
        boolean z = false;
        for (C14251r c14251r : arrayList) {
            for (EnumC14207b enumC14207b : c14251r.m317e()) {
                enumMap.put((EnumMap) enumC14207b, (EnumC14207b) c14251r);
                z = true;
            }
        }
        if (z) {
            return new C14265y(enumMap);
        }
        return c14265y;
    }

    /* renamed from: e */
    public final EnumC7166f m465e(Iterable<? extends TAnnotation> annotations) {
        EnumC7166f enumC7166f;
        C9612q.m13917h(annotations, "annotations");
        EnumC7166f enumC7166f2 = null;
        for (TAnnotation tannotation : annotations) {
            C11633c mo422i = mo422i(tannotation);
            if (C14210c0.m424m().contains(mo422i)) {
                enumC7166f = EnumC7166f.READ_ONLY;
            } else if (C14210c0.m427j().contains(mo422i)) {
                enumC7166f = EnumC7166f.MUTABLE;
            } else {
                continue;
            }
            if (enumC7166f2 != null && enumC7166f2 != enumC7166f) {
                return null;
            }
            enumC7166f2 = enumC7166f;
        }
        return enumC7166f2;
    }

    /* renamed from: f */
    public final C7169i m464f(Iterable<? extends TAnnotation> annotations, Function1<? super TAnnotation, Boolean> forceWarning) {
        C9612q.m13917h(annotations, "annotations");
        C9612q.m13917h(forceWarning, "forceWarning");
        C7169i c7169i = null;
        for (TAnnotation tannotation : annotations) {
            C7169i m463g = m463g(tannotation, forceWarning);
            if (c7169i != null) {
                if (m463g != null && !C9612q.m13922c(m463g, c7169i) && (!m463g.m21320d() || c7169i.m21320d())) {
                    if (m463g.m21320d() || !c7169i.m21320d()) {
                        return null;
                    }
                }
            }
            c7169i = m463g;
        }
        return c7169i;
    }

    /* renamed from: i */
    protected abstract C11633c mo422i(TAnnotation tannotation);

    /* renamed from: j */
    protected abstract Object mo421j(TAnnotation tannotation);

    /* renamed from: k */
    protected abstract Iterable<TAnnotation> mo420k(TAnnotation tannotation);

    /* renamed from: m */
    public final boolean m460m(TAnnotation annotation) {
        C9612q.m13917h(annotation, "annotation");
        TAnnotation m462h = m462h(annotation, C10884k.C10885a.f28448H);
        if (m462h == null) {
            return false;
        }
        Iterable<String> mo423b = mo423b(m462h, false);
        if ((mo423b instanceof Collection) && ((Collection) mo423b).isEmpty()) {
            return false;
        }
        for (String str : mo423b) {
            if (C9612q.m13922c(str, EnumC12168n.TYPE.name())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s */
    public final TAnnotation m454s(TAnnotation annotation) {
        boolean m14064L;
        TAnnotation tannotation;
        C9612q.m13917h(annotation, "annotation");
        if (this.f36516a.m282d().m274d()) {
            return null;
        }
        m14064L = C9553r.m14064L(C14209c.m442b(), mo422i(annotation));
        if (!m14064L && !m461l(annotation, C14209c.m438f())) {
            if (!m461l(annotation, C14209c.m437g())) {
                return null;
            }
            ConcurrentHashMap<Object, TAnnotation> concurrentHashMap = this.f36517b;
            Object mo421j = mo421j(annotation);
            TAnnotation tannotation2 = concurrentHashMap.get(mo421j);
            if (tannotation2 == null) {
                Iterator<TAnnotation> it = mo420k(annotation).iterator();
                while (true) {
                    if (it.hasNext()) {
                        tannotation = m454s(it.next());
                        if (tannotation != null) {
                            break;
                        }
                    } else {
                        tannotation = null;
                        break;
                    }
                }
                if (tannotation == null) {
                    return null;
                }
                TAnnotation putIfAbsent = concurrentHashMap.putIfAbsent(mo421j, tannotation);
                if (putIfAbsent != null) {
                    return putIfAbsent;
                }
                return tannotation;
            }
            return tannotation2;
        }
        return annotation;
    }
}