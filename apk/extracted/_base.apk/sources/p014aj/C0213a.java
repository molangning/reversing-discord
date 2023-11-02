package p014aj;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.C9583c;
import kotlin.jvm.internal.C9585d;
import kotlin.jvm.internal.C9590f;
import kotlin.jvm.internal.C9598i0;
import kotlin.jvm.internal.C9599j;
import kotlin.jvm.internal.C9601k;
import kotlin.jvm.internal.C9602k0;
import kotlin.jvm.internal.C9611p;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.C9615t;
import kotlin.reflect.KClass;
import kotlin.time.Duration;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.C9942a;
import kotlinx.serialization.internal.C9943b;
import kotlinx.serialization.internal.C9944c;
import kotlinx.serialization.internal.C9945d;
import kotlinx.serialization.internal.C9946e;
import kotlinx.serialization.internal.C9947f;
import kotlinx.serialization.internal.C9948g;
import kotlinx.serialization.internal.C9949h;
import kotlinx.serialization.internal.C9950i;
import kotlinx.serialization.internal.C9951j;
import kotlinx.serialization.internal.C9952k;
import kotlinx.serialization.internal.C9953l;
import p045cj.C2560a2;
import p045cj.C2575d2;
import p045cj.C2578e0;
import p045cj.C2581f;
import p045cj.C2584f1;
import p045cj.C2588g1;
import p045cj.C2589g2;
import p045cj.C2590h;
import p045cj.C2598i1;
import p045cj.C2600i2;
import p045cj.C2601j;
import p045cj.C2609k2;
import p045cj.C2615m0;
import p045cj.C2617m2;
import p045cj.C2621n2;
import p045cj.C2622o;
import p045cj.C2634r0;
import p045cj.C2640t0;
import p045cj.C2647v1;
import p045cj.C2649w0;
import p045cj.C2651x;
import p045cj.C2652x0;
import p045cj.C2656y;
import p045cj.C2662z1;
import pf.C11546a0;
import pf.C11549b0;
import pf.C11552c0;
import pf.C11555d0;
import pf.C11558e0;
import pf.C11563g0;
import pf.C11566h0;
import pf.C11590w;
import pf.C11593z;

@Metadata(m14358d1 = {"\u0000¦\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010&\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0007\u001a@\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u001a@\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u001aZ\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f0\u0002\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\n\"\u0004\b\u0002\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\u0002\u001a\u0010\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002*\u00020\u0011\u001a\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0002\u001a\u0010\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0002*\u00020\u0016\u001a\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0002\u001a\u0011\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0002H\u0007ø\u0001\u0000\u001a\u0010\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0002*\u00020\u001d\u001a\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0002\u001a\u0011\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0002H\u0007ø\u0001\u0000\u001a\u0010\u0010\n\u001a\b\u0012\u0004\u0012\u00020%0\u0002*\u00020$\u001a\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0002\u001a\u0011\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u0002H\u0007ø\u0001\u0000\u001a\u0010\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020+0\u0002*\u00020*\u001a\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u0002\u001a\u0011\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u0002H\u0007ø\u0001\u0000\u001a\u0010\u0010\t\u001a\b\u0012\u0004\u0012\u0002010\u0002*\u000200\u001a\f\u00103\u001a\b\u0012\u0004\u0012\u0002020\u0002\u001a\u0010\u00106\u001a\b\u0012\u0004\u0012\u0002050\u0002*\u000204\u001a\f\u00108\u001a\b\u0012\u0004\u0012\u0002070\u0002\u001a\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u0002*\u000209¢\u0006\u0004\b;\u0010<\u001a\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u0002\u001a\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u0002*\u00020?¢\u0006\u0004\b@\u0010A\u001a\u0010\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u0002*\u00020B\u001aF\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010J0\u0002\"\b\b\u0000\u0010F*\u00020E\"\n\b\u0001\u0010D*\u0004\u0018\u00018\u00002\f\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000G2\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0007\u001a&\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000L0\u0002\"\u0004\b\u0000\u0010F2\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a&\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000N0\u0002\"\u0004\b\u0000\u0010F2\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a@\u0010Q\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010P0\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u001a\u0013\u0010T\u001a\b\u0012\u0004\u0012\u00020S0\u0002*\u00020Rø\u0001\u0000\u001a\u0013\u0010W\u001a\b\u0012\u0004\u0012\u00020V0\u0002*\u00020Uø\u0001\u0000\u001a\u0013\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0\u0002*\u00020Xø\u0001\u0000\u001a\u0013\u0010]\u001a\b\u0012\u0004\u0012\u00020\\0\u0002*\u00020[ø\u0001\u0000\u001a\u0013\u0010`\u001a\b\u0012\u0004\u0012\u00020_0\u0002*\u00020^ø\u0001\u0000\u001a\u000e\u0010b\u001a\b\u0012\u0004\u0012\u00020a0\u0002H\u0007\"3\u0010g\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002\"\b\b\u0000\u0010F*\u00020E*\b\u0012\u0004\u0012\u00028\u00000\u00028F¢\u0006\f\u0012\u0004\be\u0010f\u001a\u0004\bc\u0010d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006h"}, m14357d2 = {"K", "V", "Lkotlinx/serialization/KSerializer;", "keySerializer", "valueSerializer", "Lkotlin/Pair;", "m", "", "j", "A", "B", "C", "aSerializer", "bSerializer", "cSerializer", "Lpf/w;", "p", "Lkotlin/Char$Companion;", "", "y", "", "d", "Lkotlin/Byte$Companion;", "", "x", "", "c", "Lpf/a0;", "q", "Lkotlin/Short$Companion;", "", "D", "", "o", "Lpf/h0;", "t", "Lkotlin/Int$Companion;", "", "", "g", "Lpf/c0;", "r", "Lkotlin/Long$Companion;", "", "", "i", "Lpf/e0;", "s", "Lkotlin/Float$Companion;", "", "", "f", "Lkotlin/Double$Companion;", "", "z", "", "e", "Lkotlin/Boolean$Companion;", "", "w", "(Lkotlin/jvm/internal/c;)Lkotlinx/serialization/KSerializer;", "", "b", "", "v", "(Lkotlin/Unit;)Lkotlinx/serialization/KSerializer;", "Lkotlin/String$Companion;", "", "E", "", "T", "Lkotlin/reflect/KClass;", "kClass", "elementSerializer", "", "a", "", "h", "", "n", "", "k", "Lpf/b0$a;", "Lpf/b0;", "H", "Lpf/d0$a;", "Lpf/d0;", "I", "Lpf/z$a;", "Lpf/z;", "G", "Lpf/g0$a;", "Lpf/g0;", "J", "Lkotlin/time/Duration$a;", "Lkotlin/time/Duration;", "F", "", "l", "u", "(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "getNullable$annotations", "(Lkotlinx/serialization/KSerializer;)V", "nullable", "kotlinx-serialization-core"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: aj.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C0213a {
    /* renamed from: A */
    public static final KSerializer<Float> m40950A(C9601k c9601k) {
        C9612q.m13917h(c9601k, "<this>");
        return C2578e0.f7038a;
    }

    /* renamed from: B */
    public static final KSerializer<Integer> m40949B(C9611p c9611p) {
        C9612q.m13917h(c9611p, "<this>");
        return C2615m0.f7088a;
    }

    /* renamed from: C */
    public static final KSerializer<Long> m40948C(C9615t c9615t) {
        C9612q.m13917h(c9615t, "<this>");
        return C2649w0.f7129a;
    }

    /* renamed from: D */
    public static final KSerializer<Short> m40947D(C9598i0 c9598i0) {
        C9612q.m13917h(c9598i0, "<this>");
        return C2662z1.f7157a;
    }

    /* renamed from: E */
    public static final KSerializer<String> m40946E(C9602k0 c9602k0) {
        C9612q.m13917h(c9602k0, "<this>");
        return C2560a2.f7013a;
    }

    /* renamed from: F */
    public static final KSerializer<Duration> m40945F(Duration.C9661a c9661a) {
        C9612q.m13917h(c9661a, "<this>");
        return C2656y.f7141a;
    }

    /* renamed from: G */
    public static final KSerializer<C11593z> m40944G(C11593z.C11594a c11594a) {
        C9612q.m13917h(c11594a, "<this>");
        return C2589g2.f7053a;
    }

    /* renamed from: H */
    public static final KSerializer<C11549b0> m40943H(C11549b0.C11550a c11550a) {
        C9612q.m13917h(c11550a, "<this>");
        return C2600i2.f7071a;
    }

    /* renamed from: I */
    public static final KSerializer<C11555d0> m40942I(C11555d0.C11556a c11556a) {
        C9612q.m13917h(c11556a, "<this>");
        return C2609k2.f7081a;
    }

    /* renamed from: J */
    public static final KSerializer<C11563g0> m40941J(C11563g0.C11564a c11564a) {
        C9612q.m13917h(c11564a, "<this>");
        return C2617m2.f7091a;
    }

    /* renamed from: a */
    public static final <T, E extends T> KSerializer<E[]> m40940a(KClass<T> kClass, KSerializer<E> elementSerializer) {
        C9612q.m13917h(kClass, "kClass");
        C9612q.m13917h(elementSerializer, "elementSerializer");
        return new C2647v1(kClass, elementSerializer);
    }

    /* renamed from: b */
    public static final KSerializer<boolean[]> m40939b() {
        return C9942a.f25818c;
    }

    /* renamed from: c */
    public static final KSerializer<byte[]> m40938c() {
        return C9943b.f25819c;
    }

    /* renamed from: d */
    public static final KSerializer<char[]> m40937d() {
        return C9944c.f25820c;
    }

    /* renamed from: e */
    public static final KSerializer<double[]> m40936e() {
        return C9945d.f25821c;
    }

    /* renamed from: f */
    public static final KSerializer<float[]> m40935f() {
        return C9946e.f25822c;
    }

    /* renamed from: g */
    public static final KSerializer<int[]> m40934g() {
        return C9947f.f25823c;
    }

    /* renamed from: h */
    public static final <T> KSerializer<List<T>> m40933h(KSerializer<T> elementSerializer) {
        C9612q.m13917h(elementSerializer, "elementSerializer");
        return new C2581f(elementSerializer);
    }

    /* renamed from: i */
    public static final KSerializer<long[]> m40932i() {
        return C9948g.f25824c;
    }

    /* renamed from: j */
    public static final <K, V> KSerializer<Map.Entry<K, V>> m40931j(KSerializer<K> keySerializer, KSerializer<V> valueSerializer) {
        C9612q.m13917h(keySerializer, "keySerializer");
        C9612q.m13917h(valueSerializer, "valueSerializer");
        return new C2652x0(keySerializer, valueSerializer);
    }

    /* renamed from: k */
    public static final <K, V> KSerializer<Map<K, V>> m40930k(KSerializer<K> keySerializer, KSerializer<V> valueSerializer) {
        C9612q.m13917h(keySerializer, "keySerializer");
        C9612q.m13917h(valueSerializer, "valueSerializer");
        return new C2634r0(keySerializer, valueSerializer);
    }

    /* renamed from: l */
    public static final KSerializer m40929l() {
        return C2584f1.f7045a;
    }

    /* renamed from: m */
    public static final <K, V> KSerializer<Pair<K, V>> m40928m(KSerializer<K> keySerializer, KSerializer<V> valueSerializer) {
        C9612q.m13917h(keySerializer, "keySerializer");
        C9612q.m13917h(valueSerializer, "valueSerializer");
        return new C2598i1(keySerializer, valueSerializer);
    }

    /* renamed from: n */
    public static final <T> KSerializer<Set<T>> m40927n(KSerializer<T> elementSerializer) {
        C9612q.m13917h(elementSerializer, "elementSerializer");
        return new C2640t0(elementSerializer);
    }

    /* renamed from: o */
    public static final KSerializer<short[]> m40926o() {
        return C9949h.f25825c;
    }

    /* renamed from: p */
    public static final <A, B, C> KSerializer<C11590w<A, B, C>> m40925p(KSerializer<A> aSerializer, KSerializer<B> bSerializer, KSerializer<C> cSerializer) {
        C9612q.m13917h(aSerializer, "aSerializer");
        C9612q.m13917h(bSerializer, "bSerializer");
        C9612q.m13917h(cSerializer, "cSerializer");
        return new C2575d2(aSerializer, bSerializer, cSerializer);
    }

    /* renamed from: q */
    public static final KSerializer<C11546a0> m40924q() {
        return C9950i.f25826c;
    }

    /* renamed from: r */
    public static final KSerializer<C11552c0> m40923r() {
        return C9951j.f25827c;
    }

    /* renamed from: s */
    public static final KSerializer<C11558e0> m40922s() {
        return C9952k.f25828c;
    }

    /* renamed from: t */
    public static final KSerializer<C11566h0> m40921t() {
        return C9953l.f25829c;
    }

    /* renamed from: u */
    public static final <T> KSerializer<T> m40920u(KSerializer<T> kSerializer) {
        C9612q.m13917h(kSerializer, "<this>");
        if (!kSerializer.getDescriptor().mo12689b()) {
            return new C2588g1(kSerializer);
        }
        return kSerializer;
    }

    /* renamed from: v */
    public static final KSerializer<Unit> m40919v(Unit unit) {
        C9612q.m13917h(unit, "<this>");
        return C2621n2.f7095b;
    }

    /* renamed from: w */
    public static final KSerializer<Boolean> m40918w(C9583c c9583c) {
        C9612q.m13917h(c9583c, "<this>");
        return C2590h.f7055a;
    }

    /* renamed from: x */
    public static final KSerializer<Byte> m40917x(C9585d c9585d) {
        C9612q.m13917h(c9585d, "<this>");
        return C2601j.f7073a;
    }

    /* renamed from: y */
    public static final KSerializer<Character> m40916y(C9590f c9590f) {
        C9612q.m13917h(c9590f, "<this>");
        return C2622o.f7097a;
    }

    /* renamed from: z */
    public static final KSerializer<Double> m40915z(C9599j c9599j) {
        C9612q.m13917h(c9599j, "<this>");
        return C2651x.f7134a;
    }
}
