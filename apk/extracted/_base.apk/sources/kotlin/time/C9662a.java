package kotlin.time;

import gg.C6755g;
import gg.C6759j;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p068dg.C5838c;
import p373ui.EnumC12982c;

@Metadata(m14358d1 = {"\u00000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\u001a\u001e\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001e\u0010\u0007\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001e\u0010\n\u001a\u00020\u0003*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\"\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002\u001a\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0002\u001a\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0002\u001a\u001a\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001a\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0019\u001a\"\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001a\u0010 \u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010\u0019\u001a\u001a\u0010!\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, m14357d2 = {"", "Lui/c;", "unit", "Lkotlin/time/Duration;", "s", "(ILui/c;)J", "", "t", "(JLui/c;)J", "", "r", "(DLui/c;)J", "", "value", "", "strictIso", "p", "(Ljava/lang/String;Z)J", "q", "nanos", "o", "millis", "n", "normalNanos", "l", "(J)J", "normalMillis", "j", "normalValue", "unitDiscriminator", "i", "(JI)J", "m", "k", "kotlin-stdlib"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: kotlin.time.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9662a {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final long m13614i(long j, int i) {
        return Duration.m13640h((j << 1) + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final long m13613j(long j) {
        return Duration.m13640h((j << 1) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final long m13612k(long j) {
        long m21922k;
        if (new C6755g(-4611686018426L, 4611686018426L).m21950o(j)) {
            return m13611l(m13609n(j));
        }
        m21922k = C6759j.m21922k(j, -4611686018427387903L, 4611686018427387903L);
        return m13613j(m21922k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final long m13611l(long j) {
        return Duration.m13640h(j << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final long m13610m(long j) {
        if (new C6755g(-4611686018426999999L, 4611686018426999999L).m21950o(j)) {
            return m13611l(j);
        }
        return m13613j(m13608o(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final long m13609n(long j) {
        return j * 1000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final long m13608o(long j) {
        return j / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00a6 A[EDGE_INSN: B:170:0x00a6->B:49:0x00a6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009a A[LOOP:1: B:36:0x006c->B:47:0x009a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ae  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long m13607p(java.lang.String r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 727
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.time.C9662a.m13607p(java.lang.String, boolean):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final long m13606q(java.lang.String r9) {
        /*
            int r0 = r9.length()
            r1 = 0
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 <= 0) goto L18
            java.lang.String r5 = "+-"
            char r6 = r9.charAt(r4)
            boolean r5 = kotlin.text.C9642f.m13831L(r5, r6, r4, r2, r1)
            if (r5 == 0) goto L18
            r5 = r3
            goto L19
        L18:
            r5 = r4
        L19:
            int r0 = r0 - r5
            r6 = 16
            if (r0 <= r6) goto L6e
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r6 = kotlin.text.C9642f.m13822T(r9)
            r0.<init>(r5, r6)
            boolean r5 = r0 instanceof java.util.Collection
            if (r5 == 0) goto L36
            r5 = r0
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L36
        L34:
            r0 = r3
            goto L5b
        L36:
            java.util.Iterator r0 = r0.iterator()
        L3a:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L34
            r5 = r0
            qf.p r5 = (p304qf.AbstractC11883p) r5
            int r5 = r5.nextInt()
            gg.c r6 = new gg.c
            r7 = 48
            r8 = 57
            r6.<init>(r7, r8)
            char r5 = r9.charAt(r5)
            boolean r5 = r6.m21957i(r5)
            if (r5 != 0) goto L3a
            r0 = r4
        L5b:
            if (r0 == 0) goto L6e
            char r9 = r9.charAt(r4)
            r0 = 45
            if (r9 != r0) goto L68
            r0 = -9223372036854775808
            goto L6d
        L68:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L6d:
            return r0
        L6e:
            java.lang.String r0 = "+"
            boolean r0 = kotlin.text.C9642f.m13835H(r9, r0, r4, r2, r1)
            if (r0 == 0) goto L7a
            java.lang.String r9 = kotlin.text.C9642f.m13818W0(r9, r3)
        L7a:
            long r0 = java.lang.Long.parseLong(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.time.C9662a.m13606q(java.lang.String):long");
    }

    /* renamed from: r */
    public static final long m13605r(double d, EnumC12982c unit) {
        long m24387c;
        long m24387c2;
        C9612q.m13917h(unit, "unit");
        double m13602a = C9663b.m13602a(d, unit, EnumC12982c.NANOSECONDS);
        if (!Double.isNaN(m13602a)) {
            m24387c = C5838c.m24387c(m13602a);
            if (new C6755g(-4611686018426999999L, 4611686018426999999L).m21950o(m24387c)) {
                return m13611l(m24387c);
            }
            m24387c2 = C5838c.m24387c(C9663b.m13602a(d, unit, EnumC12982c.MILLISECONDS));
            return m13612k(m24387c2);
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
    }

    /* renamed from: s */
    public static final long m13604s(int i, EnumC12982c unit) {
        C9612q.m13917h(unit, "unit");
        if (unit.compareTo(EnumC12982c.SECONDS) <= 0) {
            return m13611l(C9663b.m13600c(i, unit, EnumC12982c.NANOSECONDS));
        }
        return m13603t(i, unit);
    }

    /* renamed from: t */
    public static final long m13603t(long j, EnumC12982c unit) {
        long m21922k;
        C9612q.m13917h(unit, "unit");
        EnumC12982c enumC12982c = EnumC12982c.NANOSECONDS;
        long m13600c = C9663b.m13600c(4611686018426999999L, enumC12982c, unit);
        if (new C6755g(-m13600c, m13600c).m21950o(j)) {
            return m13611l(C9663b.m13600c(j, unit, enumC12982c));
        }
        m21922k = C6759j.m21922k(C9663b.m13601b(j, unit, EnumC12982c.MILLISECONDS), -4611686018427387903L, 4611686018427387903L);
        return m13613j(m21922k);
    }
}
