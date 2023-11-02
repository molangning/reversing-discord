package gg;

import eg.AbstractC6221c;
import eg.C6223d;
import gg.C6752e;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.ranges.C9627a;
import kotlin.ranges.IntRange;

@Metadata(m14358d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\t\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0015\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\u0004\u001a\u0015\u0010\t\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0086\u0004\u001a\u0015\u0010\f\u001a\u00020\n*\u00020\n2\u0006\u0010\b\u001a\u00020\u000bH\u0086\u0004\u001a\u0015\u0010\r\u001a\u00020\u0000*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\u0004\u001a\u0015\u0010\u000f\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u000bH\u0086\u0004\u001a)\u0010\u0013\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\u0010*\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0012\u0010\u0015\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003\u001a\u0012\u0010\u0016\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b\u001a\u0012\u0010\u0018\u001a\u00020\u0017*\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0017\u001a\u0012\u0010\u001a\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003\u001a\u0012\u0010\u001b\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b\u001a\u0012\u0010\u001c\u001a\u00020\u0017*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017\u001a\u001a\u0010\u001d\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003\u001a\u001a\u0010\u001e\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b\u001a\u001a\u0010\u001f\u001a\u00020\u0017*\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017¨\u0006 "}, m14357d2 = {"Lkotlin/ranges/IntRange;", "Leg/c;", "random", "", "m", "to", "Lkotlin/ranges/a;", "l", "step", "o", "Lgg/e;", "", "n", "q", "Lgg/g;", "p", "", "T", "minimumValue", "e", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "c", "d", "", "b", "maximumValue", "g", "h", "f", "j", "k", "i", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/ranges/RangesKt")
/* renamed from: gg.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6759j extends C6758i {
    /* renamed from: b */
    public static float m21931b(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    /* renamed from: c */
    public static int m21930c(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    /* renamed from: d */
    public static long m21929d(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    /* renamed from: e */
    public static <T extends Comparable<? super T>> T m21928e(T t, T minimumValue) {
        C9612q.m13917h(t, "<this>");
        C9612q.m13917h(minimumValue, "minimumValue");
        if (t.compareTo(minimumValue) < 0) {
            return minimumValue;
        }
        return t;
    }

    /* renamed from: f */
    public static float m21927f(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    /* renamed from: g */
    public static int m21926g(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    /* renamed from: h */
    public static long m21925h(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    /* renamed from: i */
    public static float m21924i(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    /* renamed from: j */
    public static int m21923j(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    /* renamed from: k */
    public static long m21922k(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    /* renamed from: l */
    public static C9627a m21921l(int i, int i2) {
        return C9627a.f25362m.m13886a(i, i2, -1);
    }

    /* renamed from: m */
    public static int m21920m(IntRange intRange, AbstractC6221c random) {
        C9612q.m13917h(intRange, "<this>");
        C9612q.m13917h(random, "random");
        try {
            return C6223d.m23222d(random, intRange);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    /* renamed from: n */
    public static C6752e m21919n(C6752e c6752e, long j) {
        boolean z;
        C9612q.m13917h(c6752e, "<this>");
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        C6758i.m21932a(z, Long.valueOf(j));
        C6752e.C6753a c6753a = C6752e.f18985m;
        long m21956a = c6752e.m21956a();
        long m21955e = c6752e.m21955e();
        if (c6752e.m21954h() <= 0) {
            j = -j;
        }
        return c6753a.m21952a(m21956a, m21955e, j);
    }

    /* renamed from: o */
    public static C9627a m21918o(C9627a c9627a, int i) {
        boolean z;
        C9612q.m13917h(c9627a, "<this>");
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C6758i.m21932a(z, Integer.valueOf(i));
        C9627a.C9628a c9628a = C9627a.f25362m;
        int m13890a = c9627a.m13890a();
        int m13889e = c9627a.m13889e();
        if (c9627a.m13888h() <= 0) {
            i = -i;
        }
        return c9628a.m13886a(m13890a, m13889e, i);
    }

    /* renamed from: p */
    public static C6755g m21917p(int i, long j) {
        if (j <= Long.MIN_VALUE) {
            return C6755g.f18993n.m21949a();
        }
        return new C6755g(i, j - 1);
    }

    /* renamed from: q */
    public static IntRange m21916q(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return IntRange.f25360n.m13891a();
        }
        return new IntRange(i, i2 - 1);
    }
}