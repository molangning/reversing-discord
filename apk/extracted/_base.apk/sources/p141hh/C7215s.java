package p141hh;

import java.util.Set;
import kotlin.collections.C9553r;
import kotlin.collections.C9561x;
import kotlin.jvm.internal.C9612q;
import li.InterfaceC10200i;
import p142hi.InterfaceC7314q1;
import p468zg.C14208b0;
import ph.C11633c;

/* renamed from: hh.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C7215s {
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d2, code lost:
        if (r6 != false) goto L63;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p141hh.C7164e m21228a(p141hh.C7164e r6, java.util.Collection<p141hh.C7164e> r7, boolean r8, boolean r9, boolean r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C9612q.m13917h(r6, r0)
            java.lang.String r0 = "superQualifiers"
            kotlin.jvm.internal.C9612q.m13917h(r7, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r7.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r1.next()
            hh.e r2 = (p141hh.C7164e) r2
            hh.h r2 = m21227b(r2)
            if (r2 == 0) goto L13
            r0.add(r2)
            goto L13
        L29:
            java.util.Set r0 = kotlin.collections.C9543h.m14176G0(r0)
            hh.h r1 = m21227b(r6)
            hh.h r0 = m21225d(r0, r1, r8)
            if (r0 != 0) goto L63
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r7.iterator()
        L40:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L56
            java.lang.Object r3 = r2.next()
            hh.e r3 = (p141hh.C7164e) r3
            hh.h r3 = r3.m21331d()
            if (r3 == 0) goto L40
            r1.add(r3)
            goto L40
        L56:
            java.util.Set r1 = kotlin.collections.C9543h.m14176G0(r1)
            hh.h r2 = r6.m21331d()
            hh.h r1 = m21225d(r1, r2, r8)
            goto L64
        L63:
            r1 = r0
        L64:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r7.iterator()
        L6d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L83
            java.lang.Object r4 = r3.next()
            hh.e r4 = (p141hh.C7164e) r4
            hh.f r4 = r4.m21332c()
            if (r4 == 0) goto L6d
            r2.add(r4)
            goto L6d
        L83:
            java.util.Set r2 = kotlin.collections.C9543h.m14176G0(r2)
            hh.f r3 = p141hh.EnumC7166f.MUTABLE
            hh.f r4 = p141hh.EnumC7166f.READ_ONLY
            hh.f r5 = r6.m21332c()
            java.lang.Object r8 = m21224e(r2, r3, r4, r5, r8)
            hh.f r8 = (p141hh.EnumC7166f) r8
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto La9
            if (r10 != 0) goto La5
            if (r9 == 0) goto La3
            hh.h r9 = p141hh.EnumC7168h.NULLABLE
            if (r1 != r9) goto La3
            goto La5
        La3:
            r9 = r4
            goto La6
        La5:
            r9 = r3
        La6:
            if (r9 != 0) goto La9
            r2 = r1
        La9:
            hh.h r9 = p141hh.EnumC7168h.NOT_NULL
            if (r2 != r9) goto Ld6
            boolean r6 = r6.m21333b()
            if (r6 != 0) goto Ld4
            boolean r6 = r7.isEmpty()
            if (r6 == 0) goto Lbb
        Lb9:
            r6 = r4
            goto Ld2
        Lbb:
            java.util.Iterator r6 = r7.iterator()
        Lbf:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lb9
            java.lang.Object r7 = r6.next()
            hh.e r7 = (p141hh.C7164e) r7
            boolean r7 = r7.m21333b()
            if (r7 == 0) goto Lbf
            r6 = r3
        Ld2:
            if (r6 == 0) goto Ld6
        Ld4:
            r6 = r3
            goto Ld7
        Ld6:
            r6 = r4
        Ld7:
            if (r2 == 0) goto Ldc
            if (r0 == r1) goto Ldc
            goto Ldd
        Ldc:
            r3 = r4
        Ldd:
            hh.e r7 = new hh.e
            r7.<init>(r2, r8, r6, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p141hh.C7215s.m21228a(hh.e, java.util.Collection, boolean, boolean, boolean):hh.e");
    }

    /* renamed from: b */
    private static final EnumC7168h m21227b(C7164e c7164e) {
        if (c7164e.m21330e()) {
            return null;
        }
        return c7164e.m21331d();
    }

    /* renamed from: c */
    public static final boolean m21226c(InterfaceC7314q1 interfaceC7314q1, InterfaceC10200i type) {
        C9612q.m13917h(interfaceC7314q1, "<this>");
        C9612q.m13917h(type, "type");
        C11633c ENHANCED_NULLABILITY_ANNOTATION = C14208b0.f36552u;
        C9612q.m13918g(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        return interfaceC7314q1.mo3970i(type, ENHANCED_NULLABILITY_ANNOTATION);
    }

    /* renamed from: d */
    private static final EnumC7168h m21225d(Set<? extends EnumC7168h> set, EnumC7168h enumC7168h, boolean z) {
        EnumC7168h enumC7168h2 = EnumC7168h.FORCE_FLEXIBILITY;
        if (enumC7168h != enumC7168h2) {
            return (EnumC7168h) m21224e(set, EnumC7168h.NOT_NULL, EnumC7168h.NULLABLE, enumC7168h, z);
        }
        return enumC7168h2;
    }

    /* renamed from: e */
    private static final <T> T m21224e(Set<? extends T> set, T t, T t2, T t3, boolean z) {
        Set m13998m;
        Set<? extends T> m14071G0;
        T t4;
        Object m14032r0;
        if (z) {
            if (set.contains(t)) {
                t4 = t;
            } else if (set.contains(t2)) {
                t4 = t2;
            } else {
                t4 = null;
            }
            if (C9612q.m13922c(t4, t) && C9612q.m13922c(t3, t2)) {
                return null;
            }
            if (t3 == null) {
                return t4;
            }
            return t3;
        }
        if (t3 != null) {
            m13998m = C9561x.m13998m(set, t3);
            m14071G0 = C9553r.m14071G0(m13998m);
            if (m14071G0 != null) {
                set = m14071G0;
            }
        }
        m14032r0 = C9553r.m14032r0(set);
        return (T) m14032r0;
    }
}
