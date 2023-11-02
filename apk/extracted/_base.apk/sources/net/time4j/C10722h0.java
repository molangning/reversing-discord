package net.time4j;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.base.C10616c;
import net.time4j.base.InterfaceC10614a;
import net.time4j.base.InterfaceC10620f;
import net.time4j.base.InterfaceC10621g;
import net.time4j.p249tz.AbstractC10809l;
import net.time4j.p249tz.C10835p;
import net.time4j.p249tz.InterfaceC10808k;
import net.time4j.p249tz.InterfaceC10834o;
import p162ij.AbstractC7638f0;
import p162ij.AbstractC7654k0;
import p162ij.AbstractC7665q;
import p162ij.C7644h0;
import p162ij.C7666r;
import p162ij.C7672x;
import p162ij.EnumC7627a0;
import p162ij.EnumC7630b0;
import p162ij.InterfaceC7631c;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7634d0;
import p162ij.InterfaceC7652j0;
import p162ij.InterfaceC7659m0;
import p162ij.InterfaceC7662o;
import p162ij.InterfaceC7664p;
import p162ij.InterfaceC7667s;
import p162ij.InterfaceC7669u;
import p162ij.InterfaceC7675y;
import p162ij.InterfaceC7676z;
import p184jj.C8969a;
import p184jj.C8972b;
import p184jj.EnumC8979e;
import p184jj.InterfaceC8977c;
import p184jj.InterfaceC8982h;
import p288pj.EnumC11651f;

@InterfaceC8977c("iso8601")
/* renamed from: net.time4j.h0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10722h0 extends AbstractC7654k0<InterfaceC10843w, C10722h0> implements InterfaceC10614a, InterfaceC10621g, InterfaceC7634d0<InterfaceC10843w>, InterfaceC8982h {

    /* renamed from: l */
    private static final C10722h0 f27985l;

    /* renamed from: m */
    private static final C10722h0 f27986m;

    /* renamed from: n */
    private static final Map<Object, InterfaceC7664p<?>> f27987n;

    /* renamed from: o */
    private static final C7644h0<InterfaceC10843w, C10722h0> f27988o;

    /* renamed from: p */
    private static final InterfaceC7652j0<InterfaceC10843w, C10778n<InterfaceC10843w>> f27989p;
    private static final long serialVersionUID = 7458380065762437714L;

    /* renamed from: j */
    private final transient C10697f0 f27990j;

    /* renamed from: k */
    private final transient C10711g0 f27991k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: net.time4j.h0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static /* synthetic */ class C10723a {

        /* renamed from: a */
        static final /* synthetic */ int[] f27992a;

        static {
            int[] iArr = new int[EnumC10704g.values().length];
            f27992a = iArr;
            try {
                iArr[EnumC10704g.f27924j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27992a[EnumC10704g.f27925k.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27992a[EnumC10704g.f27926l.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27992a[EnumC10704g.f27927m.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27992a[EnumC10704g.f27928n.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27992a[EnumC10704g.f27929o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: net.time4j.h0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10725c extends C10726d<BigDecimal> {
        C10725c(InterfaceC7664p<BigDecimal> interfaceC7664p) {
            super(interfaceC7664p, null);
        }

        @Override // net.time4j.C10722h0.C10726d
        /* renamed from: t */
        public boolean mo10464p(C10722h0 c10722h0, BigDecimal bigDecimal) {
            if (bigDecimal == null) {
                return false;
            }
            BigDecimal bigDecimal2 = (BigDecimal) ((C10726d) this).f27995j.mo9551e();
            if (((BigDecimal) ((C10726d) this).f27995j.mo9554U()).compareTo(bigDecimal) > 0 || bigDecimal.compareTo(bigDecimal2) > 0) {
                return false;
            }
            return true;
        }

        @Override // net.time4j.C10722h0.C10726d
        /* renamed from: u */
        public C10722h0 mo10461s(C10722h0 c10722h0, BigDecimal bigDecimal, boolean z) {
            if (mo10464p(c10722h0, bigDecimal)) {
                return C10722h0.m10489f0(c10722h0.f27990j, (C10711g0) c10722h0.f27991k.mo14419F(((C10726d) this).f27995j, bigDecimal));
            }
            throw new IllegalArgumentException("Out of range: " + bigDecimal);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: net.time4j.h0$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C10726d<V> implements InterfaceC7676z<C10722h0, V> {

        /* renamed from: j */
        private final InterfaceC7664p<V> f27995j;

        /* synthetic */ C10726d(InterfaceC7664p interfaceC7664p, C10723a c10723a) {
            this(interfaceC7664p);
        }

        /* renamed from: q */
        static <V> C10726d<V> m10463q(InterfaceC7664p<V> interfaceC7664p) {
            return new C10726d<>(interfaceC7664p);
        }

        /* renamed from: r */
        private long m10462r(V v) {
            return ((Number) Number.class.cast(v)).longValue();
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: d */
        public InterfaceC7664p<?> mo9926b(C10722h0 c10722h0) {
            return (InterfaceC7664p) C10722h0.f27987n.get(this.f27995j);
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: e */
        public InterfaceC7664p<?> mo9925c(C10722h0 c10722h0) {
            return (InterfaceC7664p) C10722h0.f27987n.get(this.f27995j);
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: h */
        public V mo9922f(C10722h0 c10722h0) {
            if (this.f27995j.mo9555M()) {
                return (V) c10722h0.f27990j.mo10211l(this.f27995j);
            }
            if (this.f27995j.mo9553V()) {
                return this.f27995j.mo9551e();
            }
            throw new C7666r("Missing rule for: " + this.f27995j.name());
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: j */
        public V mo9917l(C10722h0 c10722h0) {
            if (this.f27995j.mo9555M()) {
                return (V) c10722h0.f27990j.mo10215f(this.f27995j);
            }
            if (this.f27995j.mo9553V()) {
                return this.f27995j.mo9554U();
            }
            throw new C7666r("Missing rule for: " + this.f27995j.name());
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: k */
        public V mo9915o(C10722h0 c10722h0) {
            if (this.f27995j.mo9555M()) {
                return (V) c10722h0.f27990j.mo10212i(this.f27995j);
            }
            if (this.f27995j.mo9553V()) {
                return (V) c10722h0.f27991k.mo10212i(this.f27995j);
            }
            throw new C7666r("Missing rule for: " + this.f27995j.name());
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: p */
        public boolean mo9920i(C10722h0 c10722h0, V v) {
            if (v == null) {
                return false;
            }
            if (this.f27995j.mo9555M()) {
                return c10722h0.f27990j.mo14421C(this.f27995j, v);
            }
            if (this.f27995j.mo9553V()) {
                if (Number.class.isAssignableFrom(this.f27995j.getType())) {
                    long m10462r = m10462r(this.f27995j.mo9554U());
                    long m10462r2 = m10462r(this.f27995j.mo9551e());
                    long m10462r3 = m10462r(v);
                    if (m10462r > m10462r3 || m10462r2 < m10462r3) {
                        return false;
                    }
                    return true;
                } else if (this.f27995j.equals(C10711g0.f27966x) && C10711g0.f27965w.equals(v)) {
                    return false;
                } else {
                    return c10722h0.f27991k.mo14421C(this.f27995j, v);
                }
            }
            throw new C7666r("Missing rule for: " + this.f27995j.name());
        }

        @Override // p162ij.InterfaceC7676z
        /* renamed from: s */
        public C10722h0 mo9916n(C10722h0 c10722h0, V v, boolean z) {
            if (v != null) {
                if (v.equals(mo9915o(c10722h0))) {
                    return c10722h0;
                }
                if (z) {
                    return c10722h0.m20145L(C10616c.m11029m(m10462r(v), m10462r(mo9915o(c10722h0))), (InterfaceC10843w) C10722h0.f27988o.m20173K(this.f27995j));
                } else if (this.f27995j.mo9555M()) {
                    return C10722h0.m10489f0((C10697f0) c10722h0.f27990j.mo14419F(this.f27995j, v), c10722h0.f27991k);
                } else {
                    if (this.f27995j.mo9553V()) {
                        if (Number.class.isAssignableFrom(this.f27995j.getType())) {
                            long m10462r = m10462r(this.f27995j.mo9554U());
                            long m10462r2 = m10462r(this.f27995j.mo9551e());
                            long m10462r3 = m10462r(v);
                            if (m10462r > m10462r3 || m10462r2 < m10462r3) {
                                throw new IllegalArgumentException("Out of range: " + v);
                            }
                        } else if (this.f27995j.equals(C10711g0.f27966x) && v.equals(C10711g0.f27965w)) {
                            throw new IllegalArgumentException("Out of range: " + v);
                        }
                        return C10722h0.m10489f0(c10722h0.f27990j, (C10711g0) c10722h0.f27991k.mo14419F(this.f27995j, v));
                    }
                    throw new C7666r("Missing rule for: " + this.f27995j.name());
                }
            }
            throw new IllegalArgumentException("Missing element value.");
        }

        private C10726d(InterfaceC7664p<V> interfaceC7664p) {
            this.f27995j = interfaceC7664p;
        }
    }

    /* renamed from: net.time4j.h0$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C10727e implements InterfaceC7669u<C10722h0> {
        private C10727e() {
        }

        /* synthetic */ C10727e(C10723a c10723a) {
            this();
        }

        @Override // p162ij.InterfaceC7669u
        /* renamed from: a */
        public C10722h0 mo10453j(AbstractC7665q<?> abstractC7665q, InterfaceC7633d interfaceC7633d, boolean z, boolean z2) {
            boolean z3;
            C10697f0 mo10453j;
            C10711g0 mo10453j2;
            InterfaceC10808k interfaceC10808k;
            if (abstractC7665q instanceof InterfaceC10620f) {
                InterfaceC7631c<InterfaceC10808k> interfaceC7631c = C8969a.f23563d;
                if (interfaceC7633d.mo14442a(interfaceC7631c)) {
                    interfaceC10808k = (InterfaceC10808k) interfaceC7633d.mo14440c(interfaceC7631c);
                } else if (z) {
                    interfaceC10808k = C10835p.f28295t;
                } else {
                    throw new IllegalArgumentException("Missing timezone attribute for type conversion.");
                }
                return C10582a0.m11157e0((InterfaceC10620f) InterfaceC10620f.class.cast(abstractC7665q)).m11138x0(interfaceC10808k);
            }
            if (z2 && abstractC7665q.mo10218c(C10711g0.f27939H) == 60) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                abstractC7665q.mo14420D(C10711g0.f27939H, 59);
            }
            InterfaceC7664p<?> interfaceC7664p = C10697f0.f27906w;
            if (abstractC7665q.mo10210q(interfaceC7664p)) {
                mo10453j = (C10697f0) abstractC7665q.mo10212i(interfaceC7664p);
            } else {
                mo10453j = C10697f0.m10673w0().mo10453j(abstractC7665q, interfaceC7633d, z, false);
            }
            if (mo10453j == null) {
                return null;
            }
            InterfaceC7664p<?> interfaceC7664p2 = C10711g0.f27966x;
            if (abstractC7665q.mo10210q(interfaceC7664p2)) {
                mo10453j2 = (C10711g0) abstractC7665q.mo10212i(interfaceC7664p2);
            } else {
                mo10453j2 = C10711g0.m10581m0().mo10453j(abstractC7665q, interfaceC7633d, z, false);
                if (mo10453j2 == null && z) {
                    mo10453j2 = C10711g0.f27964v;
                }
            }
            if (mo10453j2 == null) {
                return null;
            }
            InterfaceC7664p<?> interfaceC7664p3 = C10845x.f28300p;
            if (abstractC7665q.mo10210q(interfaceC7664p3)) {
                mo10453j = (C10697f0) mo10453j.m20145L(((Long) abstractC7665q.mo10212i(interfaceC7664p3)).longValue(), EnumC10686f.f27878q);
            }
            if (z3) {
                EnumC7630b0 enumC7630b0 = EnumC7630b0.LEAP_SECOND;
                Boolean bool = Boolean.TRUE;
                if (abstractC7665q.mo14421C(enumC7630b0, bool)) {
                    abstractC7665q.mo14419F(enumC7630b0, bool);
                }
            }
            return C10722h0.m10489f0(mo10453j, mo10453j2);
        }

        @Override // p162ij.InterfaceC7669u
        /* renamed from: c */
        public AbstractC7638f0 mo10458c() {
            return AbstractC7638f0.f20937a;
        }

        @Override // p162ij.InterfaceC7669u
        /* renamed from: d */
        public InterfaceC7662o mo10459b(C10722h0 c10722h0, InterfaceC7633d interfaceC7633d) {
            return c10722h0;
        }

        @Override // p162ij.InterfaceC7669u
        /* renamed from: f */
        public C7672x<?> mo10456f() {
            return null;
        }

        @Override // p162ij.InterfaceC7669u
        /* renamed from: g */
        public int mo10455g() {
            return C10697f0.m10673w0().mo10455g();
        }

        @Override // p162ij.InterfaceC7669u
        /* renamed from: i */
        public String mo10454i(InterfaceC7675y interfaceC7675y, Locale locale) {
            EnumC8979e m16890b = EnumC8979e.m16890b(interfaceC7675y.mo16891a());
            return C8972b.m16897u(m16890b, m16890b, locale);
        }
    }

    static {
        C10722h0 c10722h0 = new C10722h0(C10697f0.f27896m, C10711g0.f27964v);
        f27985l = c10722h0;
        C10697f0 c10697f0 = C10697f0.f27897n;
        InterfaceC7664p<C10711g0> interfaceC7664p = C10711g0.f27966x;
        C10722h0 c10722h02 = new C10722h0(c10697f0, interfaceC7664p.mo9551e());
        f27986m = c10722h02;
        HashMap hashMap = new HashMap();
        InterfaceC7664p<C10697f0> interfaceC7664p2 = C10697f0.f27906w;
        hashMap.put(interfaceC7664p2, interfaceC7664p);
        InterfaceC10622c<Integer, C10697f0> interfaceC10622c = C10697f0.f27908y;
        InterfaceC10773k0<Integer, C10697f0> interfaceC10773k0 = C10697f0.f27887C;
        hashMap.put(interfaceC10622c, interfaceC10773k0);
        InterfaceC10622c<Integer, C10697f0> interfaceC10622c2 = C10697f0.f27909z;
        hashMap.put(interfaceC10622c2, C10852z0.f28326v.m9965n());
        InterfaceC10623c0<EnumC10777m0> interfaceC10623c0 = C10697f0.f27885A;
        InterfaceC10773k0<Integer, C10697f0> interfaceC10773k02 = C10697f0.f27891G;
        hashMap.put(interfaceC10623c0, interfaceC10773k02);
        InterfaceC10623c0<EnumC10612b0> interfaceC10623c02 = C10697f0.f27886B;
        InterfaceC10773k0<Integer, C10697f0> interfaceC10773k03 = C10697f0.f27888D;
        hashMap.put(interfaceC10623c02, interfaceC10773k03);
        hashMap.put(interfaceC10773k0, interfaceC10773k03);
        hashMap.put(interfaceC10773k03, interfaceC7664p);
        InterfaceC10623c0<EnumC10846x0> interfaceC10623c03 = C10697f0.f27889E;
        hashMap.put(interfaceC10623c03, interfaceC7664p);
        InterfaceC10773k0<Integer, C10697f0> interfaceC10773k04 = C10697f0.f27890F;
        hashMap.put(interfaceC10773k04, interfaceC7664p);
        hashMap.put(interfaceC10773k02, interfaceC7664p);
        InterfaceC10683d0 interfaceC10683d0 = C10697f0.f27892H;
        hashMap.put(interfaceC10683d0, interfaceC7664p);
        InterfaceC10624c1<EnumC10851z> interfaceC10624c1 = C10711g0.f27968z;
        InterfaceC10773k0<Integer, C10711g0> interfaceC10773k05 = C10711g0.f27934C;
        hashMap.put(interfaceC10624c1, interfaceC10773k05);
        InterfaceC10622c<Integer, C10711g0> interfaceC10622c3 = C10711g0.f27932A;
        InterfaceC10773k0<Integer, C10711g0> interfaceC10773k06 = C10711g0.f27937F;
        hashMap.put(interfaceC10622c3, interfaceC10773k06);
        InterfaceC10622c<Integer, C10711g0> interfaceC10622c4 = C10711g0.f27933B;
        hashMap.put(interfaceC10622c4, interfaceC10773k06);
        hashMap.put(interfaceC10773k05, interfaceC10773k06);
        InterfaceC10773k0<Integer, C10711g0> interfaceC10773k07 = C10711g0.f27935D;
        hashMap.put(interfaceC10773k07, interfaceC10773k06);
        InterfaceC10773k0<Integer, C10711g0> interfaceC10773k08 = C10711g0.f27936E;
        hashMap.put(interfaceC10773k08, interfaceC10773k06);
        InterfaceC10773k0<Integer, C10711g0> interfaceC10773k09 = C10711g0.f27939H;
        hashMap.put(interfaceC10773k06, interfaceC10773k09);
        InterfaceC10773k0<Integer, C10711g0> interfaceC10773k010 = C10711g0.f27938G;
        hashMap.put(interfaceC10773k010, interfaceC10773k09);
        InterfaceC10773k0<Integer, C10711g0> interfaceC10773k011 = C10711g0.f27943L;
        hashMap.put(interfaceC10773k09, interfaceC10773k011);
        InterfaceC10773k0<Integer, C10711g0> interfaceC10773k012 = C10711g0.f27940I;
        hashMap.put(interfaceC10773k012, interfaceC10773k011);
        f27987n = Collections.unmodifiableMap(hashMap);
        C7644h0.C7646b m20160k = C7644h0.C7646b.m20160k(InterfaceC10843w.class, C10722h0.class, new C10727e(null), c10722h0, c10722h02);
        C10726d m10463q = C10726d.m10463q(interfaceC7664p2);
        EnumC10686f enumC10686f = EnumC10686f.f27878q;
        C7644h0.C7646b m20166e = m20160k.m20166e(interfaceC7664p2, m10463q, enumC10686f);
        C10726d m10463q2 = C10726d.m10463q(interfaceC10622c);
        EnumC10686f enumC10686f2 = EnumC10686f.f27874m;
        C7644h0.C7646b m20166e2 = m20166e.m20166e(interfaceC10622c, m10463q2, enumC10686f2).m20166e(interfaceC10622c2, C10726d.m10463q(interfaceC10622c2), C10844w0.f28299j).m20166e(interfaceC10623c0, C10726d.m10463q(interfaceC10623c0), EnumC10686f.f27875n);
        C10726d m10463q3 = C10726d.m10463q(interfaceC10623c02);
        EnumC10686f enumC10686f3 = EnumC10686f.f27876o;
        C7644h0.C7646b m20167d = m20166e2.m20166e(interfaceC10623c02, m10463q3, enumC10686f3).m20166e(interfaceC10773k0, C10726d.m10463q(interfaceC10773k0), enumC10686f3).m20166e(interfaceC10773k03, C10726d.m10463q(interfaceC10773k03), enumC10686f).m20166e(interfaceC10623c03, C10726d.m10463q(interfaceC10623c03), enumC10686f).m20166e(interfaceC10773k04, C10726d.m10463q(interfaceC10773k04), enumC10686f).m20166e(interfaceC10773k02, C10726d.m10463q(interfaceC10773k02), enumC10686f).m20166e(interfaceC10683d0, C10726d.m10463q(interfaceC10683d0), EnumC10686f.f27877p).m20167d(interfaceC7664p, C10726d.m10463q(interfaceC7664p)).m20167d(interfaceC10624c1, C10726d.m10463q(interfaceC10624c1));
        C10726d m10463q4 = C10726d.m10463q(interfaceC10622c3);
        EnumC10704g enumC10704g = EnumC10704g.f27924j;
        C7644h0.C7646b m20166e3 = m20167d.m20166e(interfaceC10622c3, m10463q4, enumC10704g).m20166e(interfaceC10622c4, C10726d.m10463q(interfaceC10622c4), enumC10704g).m20166e(interfaceC10773k05, C10726d.m10463q(interfaceC10773k05), enumC10704g).m20166e(interfaceC10773k07, C10726d.m10463q(interfaceC10773k07), enumC10704g).m20166e(interfaceC10773k08, C10726d.m10463q(interfaceC10773k08), enumC10704g);
        C10726d m10463q5 = C10726d.m10463q(interfaceC10773k06);
        EnumC10704g enumC10704g2 = EnumC10704g.f27925k;
        C7644h0.C7646b m20166e4 = m20166e3.m20166e(interfaceC10773k06, m10463q5, enumC10704g2).m20166e(interfaceC10773k010, C10726d.m10463q(interfaceC10773k010), enumC10704g2);
        C10726d m10463q6 = C10726d.m10463q(interfaceC10773k09);
        EnumC10704g enumC10704g3 = EnumC10704g.f27926l;
        C7644h0.C7646b m20166e5 = m20166e4.m20166e(interfaceC10773k09, m10463q6, enumC10704g3).m20166e(interfaceC10773k012, C10726d.m10463q(interfaceC10773k012), enumC10704g3);
        InterfaceC10773k0<Integer, C10711g0> interfaceC10773k013 = C10711g0.f27941J;
        C10726d m10463q7 = C10726d.m10463q(interfaceC10773k013);
        EnumC10704g enumC10704g4 = EnumC10704g.f27927m;
        C7644h0.C7646b m20166e6 = m20166e5.m20166e(interfaceC10773k013, m10463q7, enumC10704g4);
        InterfaceC10773k0<Integer, C10711g0> interfaceC10773k014 = C10711g0.f27942K;
        C10726d m10463q8 = C10726d.m10463q(interfaceC10773k014);
        EnumC10704g enumC10704g5 = EnumC10704g.f27928n;
        C7644h0.C7646b m20166e7 = m20166e6.m20166e(interfaceC10773k014, m10463q8, enumC10704g5);
        C10726d m10463q9 = C10726d.m10463q(interfaceC10773k011);
        EnumC10704g enumC10704g6 = EnumC10704g.f27929o;
        C7644h0.C7646b m20166e8 = m20166e7.m20166e(interfaceC10773k011, m10463q9, enumC10704g6);
        InterfaceC10773k0<Integer, C10711g0> interfaceC10773k015 = C10711g0.f27944M;
        C7644h0.C7646b m20166e9 = m20166e8.m20166e(interfaceC10773k015, C10726d.m10463q(interfaceC10773k015), enumC10704g4);
        InterfaceC10773k0<Long, C10711g0> interfaceC10773k016 = C10711g0.f27945N;
        C7644h0.C7646b m20166e10 = m20166e9.m20166e(interfaceC10773k016, C10726d.m10463q(interfaceC10773k016), enumC10704g5);
        InterfaceC10773k0<Long, C10711g0> interfaceC10773k017 = C10711g0.f27946O;
        C7644h0.C7646b m20166e11 = m20166e10.m20166e(interfaceC10773k017, C10726d.m10463q(interfaceC10773k017), enumC10704g6);
        InterfaceC10624c1<BigDecimal> interfaceC10624c12 = C10711g0.f27947P;
        C7644h0.C7646b m20167d2 = m20166e11.m20167d(interfaceC10624c12, new C10725c(interfaceC10624c12));
        InterfaceC10624c1<BigDecimal> interfaceC10624c13 = C10711g0.f27948Q;
        C7644h0.C7646b m20167d3 = m20167d2.m20167d(interfaceC10624c13, new C10725c(interfaceC10624c13));
        InterfaceC10624c1<BigDecimal> interfaceC10624c14 = C10711g0.f27949R;
        C7644h0.C7646b m20167d4 = m20167d3.m20167d(interfaceC10624c14, new C10725c(interfaceC10624c14));
        InterfaceC7664p<EnumC10704g> interfaceC7664p3 = C10711g0.f27950S;
        C7644h0.C7646b m20167d5 = m20167d4.m20167d(interfaceC7664p3, C10726d.m10463q(interfaceC7664p3));
        m10488g0(m20167d5);
        m10486h0(m20167d5);
        m10485i0(m20167d5);
        f27988o = m20167d5.m20163h();
        f27989p = C10778n.m10252g(enumC10686f2, enumC10686f3, enumC10686f, enumC10704g, enumC10704g2, enumC10704g3, enumC10704g6);
    }

    private C10722h0(C10697f0 c10697f0, C10711g0 c10711g0) {
        if (c10711g0.mo10479s() == 24) {
            this.f27990j = (C10697f0) c10697f0.m20145L(1L, EnumC10686f.f27878q);
            this.f27991k = C10711g0.f27964v;
        } else if (c10697f0 != null) {
            this.f27990j = c10697f0;
            this.f27991k = c10711g0;
        } else {
            throw new NullPointerException("Missing date.");
        }
    }

    /* renamed from: W */
    public static C7644h0<InterfaceC10843w, C10722h0> m10499W() {
        return f27988o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public static C10722h0 m10497Y(InterfaceC10620f interfaceC10620f, C10835p c10835p) {
        long mo10164k = interfaceC10620f.mo10164k() + c10835p.m10026k();
        int mo10166a = interfaceC10620f.mo10166a() + c10835p.m10027i();
        if (mo10166a < 0) {
            mo10166a += 1000000000;
            mo10164k--;
        } else if (mo10166a >= 1000000000) {
            mo10166a -= 1000000000;
            mo10164k++;
        }
        C10697f0 m10707R0 = C10697f0.m10707R0(C10616c.m11040b(mo10164k, 86400), EnumC7627a0.UNIX);
        int m11038d = C10616c.m11038d(mo10164k, 86400);
        int i = m11038d % 60;
        int i2 = m11038d / 60;
        return m10489f0(m10707R0, C10711g0.m10609N0(i2 / 60, i2 % 60, i, mo10166a));
    }

    /* renamed from: e0 */
    public static C10722h0 m10490e0(int i, int i2, int i3, int i4, int i5, int i6) {
        return m10489f0(C10697f0.m10713M0(i, i2, i3), C10711g0.m10611M0(i4, i5, i6));
    }

    /* renamed from: f0 */
    public static C10722h0 m10489f0(C10697f0 c10697f0, C10711g0 c10711g0) {
        return new C10722h0(c10697f0, c10711g0);
    }

    /* renamed from: g0 */
    private static void m10488g0(C7644h0.C7646b<InterfaceC10843w, C10722h0> c7646b) {
        EnumC10686f[] values;
        Set<? extends InterfaceC10843w> set;
        Set<? extends InterfaceC10843w> range = EnumSet.range(EnumC10686f.f27871j, EnumC10686f.f27876o);
        Set<? extends InterfaceC10843w> range2 = EnumSet.range(EnumC10686f.f27877p, EnumC10686f.f27878q);
        for (EnumC10686f enumC10686f : EnumC10686f.values()) {
            InterfaceC7659m0<C10722h0> c10724b = new C10724b(enumC10686f);
            double length = enumC10686f.getLength();
            if (enumC10686f.compareTo(EnumC10686f.f27877p) < 0) {
                set = range;
            } else {
                set = range2;
            }
            c7646b.m20164g(enumC10686f, c10724b, length, set);
        }
    }

    /* renamed from: h0 */
    private static void m10486h0(C7644h0.C7646b<InterfaceC10843w, C10722h0> c7646b) {
        EnumC10704g[] values;
        for (EnumC10704g enumC10704g : EnumC10704g.values()) {
            c7646b.m20164g(enumC10704g, new C10724b(enumC10704g), enumC10704g.getLength(), EnumSet.allOf(EnumC10704g.class));
        }
    }

    /* renamed from: i0 */
    private static void m10485i0(C7644h0.C7646b<InterfaceC10843w, C10722h0> c7646b) {
        for (InterfaceC7667s interfaceC7667s : C10697f0.m10673w0().m20111s()) {
            c7646b.m20165f(interfaceC7667s);
        }
        for (InterfaceC7667s interfaceC7667s2 : C10711g0.m10581m0().m20111s()) {
            c7646b.m20165f(interfaceC7667s2);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p162ij.AbstractC7654k0, p162ij.AbstractC7665q
    /* renamed from: I */
    public C7644h0<InterfaceC10843w, C10722h0> mo10478v() {
        return f27988o;
    }

    /* renamed from: U */
    public C10582a0 m10501U(C10835p c10835p) {
        long m11033i = C10616c.m11033i(this.f27990j.m10718H0() + 730, 86400L) + (this.f27991k.mo10479s() * 3600) + (this.f27991k.mo10483m() * 60) + this.f27991k.mo10487h();
        int mo10495a = this.f27991k.mo10495a();
        long m10026k = m11033i - c10835p.m10026k();
        int m10027i = mo10495a - c10835p.m10027i();
        if (m10027i < 0) {
            m10027i += 1000000000;
            m10026k--;
        } else if (m10027i >= 1000000000) {
            m10027i -= 1000000000;
            m10026k++;
        }
        return C10582a0.m11146p0(m10026k, m10027i, EnumC11651f.POSIX);
    }

    /* renamed from: V */
    public C10582a0 m10500V() {
        return m10501U(C10835p.f28295t);
    }

    @Override // p162ij.AbstractC7654k0, java.lang.Comparable
    /* renamed from: X */
    public int compareTo(C10722h0 c10722h0) {
        if (this.f27990j.m20132S(c10722h0.f27990j)) {
            return 1;
        }
        if (this.f27990j.m20131U(c10722h0.f27990j)) {
            return -1;
        }
        return this.f27991k.compareTo(c10722h0.f27991k);
    }

    /* renamed from: Z */
    public C10697f0 m10496Z() {
        return this.f27990j;
    }

    @Override // net.time4j.base.InterfaceC10621g
    /* renamed from: a */
    public int mo10495a() {
        return this.f27991k.mo10495a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p162ij.AbstractC7665q
    /* renamed from: a0 */
    public C10722h0 mo10477w() {
        return this;
    }

    /* renamed from: b0 */
    public C10711g0 m10493b0() {
        return this.f27991k;
    }

    /* renamed from: c0 */
    public C10582a0 m10492c0(AbstractC10809l abstractC10809l) {
        if (abstractC10809l.mo10153J()) {
            return m10501U(abstractC10809l.mo10162A(this.f27990j, this.f27991k));
        }
        InterfaceC10834o mo10158E = abstractC10809l.mo10158E();
        long mo10036b = mo10158E.mo10036b(this.f27990j, this.f27991k, abstractC10809l);
        C10582a0 m11146p0 = C10582a0.m11146p0(mo10036b, this.f27991k.mo10495a(), EnumC11651f.POSIX);
        if (mo10158E == AbstractC10809l.f28232n) {
            C10582a0.m11161a0(mo10036b, this);
        }
        return m11146p0;
    }

    /* renamed from: d0 */
    public C10582a0 m10491d0(InterfaceC10808k interfaceC10808k) {
        return m10492c0(AbstractC10809l.m10149N(interfaceC10808k));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10722h0)) {
            return false;
        }
        C10722h0 c10722h0 = (C10722h0) obj;
        if (this.f27990j.equals(c10722h0.f27990j) && this.f27991k.equals(c10722h0.f27991k)) {
            return true;
        }
        return false;
    }

    @Override // net.time4j.base.InterfaceC10621g
    /* renamed from: h */
    public int mo10487h() {
        return this.f27991k.mo10487h();
    }

    public int hashCode() {
        return (this.f27990j.hashCode() * 13) + (this.f27991k.hashCode() * 37);
    }

    /* renamed from: j0 */
    public C10697f0 m10484j0() {
        return this.f27990j;
    }

    @Override // net.time4j.base.InterfaceC10621g
    /* renamed from: m */
    public int mo10483m() {
        return this.f27991k.mo10483m();
    }

    @Override // net.time4j.base.InterfaceC10614a
    /* renamed from: o */
    public int mo10482o() {
        return this.f27990j.mo10482o();
    }

    @Override // net.time4j.base.InterfaceC10614a
    /* renamed from: p */
    public int mo10481p() {
        return this.f27990j.mo10481p();
    }

    @Override // net.time4j.base.InterfaceC10614a
    /* renamed from: r */
    public int mo10480r() {
        return this.f27990j.mo10480r();
    }

    @Override // net.time4j.base.InterfaceC10621g
    /* renamed from: s */
    public int mo10479s() {
        return this.f27991k.mo10479s();
    }

    @Override // net.time4j.base.InterfaceC10614a
    public String toString() {
        return this.f27990j.toString() + this.f27991k.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: net.time4j.h0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C10724b implements InterfaceC7659m0<C10722h0> {

        /* renamed from: a */
        private final EnumC10686f f27993a;

        /* renamed from: b */
        private final EnumC10704g f27994b;

        C10724b(EnumC10686f enumC10686f) {
            this.f27993a = enumC10686f;
            this.f27994b = null;
        }

        @Override // p162ij.InterfaceC7659m0
        /* renamed from: c */
        public C10722h0 mo10475b(C10722h0 c10722h0, long j) {
            C10697f0 c10697f0;
            C10711g0 c10711g0;
            if (this.f27993a != null) {
                c10697f0 = (C10697f0) c10722h0.f27990j.m20145L(j, this.f27993a);
                c10711g0 = c10722h0.f27991k;
            } else {
                C10766j m10600T0 = c10722h0.f27991k.m10600T0(j, this.f27994b);
                C10711g0 m10307b = m10600T0.m10307b();
                c10697f0 = (C10697f0) c10722h0.f27990j.m20145L(m10600T0.m10308a(), EnumC10686f.f27878q);
                c10711g0 = m10307b;
            }
            return C10722h0.m10489f0(c10697f0, c10711g0);
        }

        @Override // p162ij.InterfaceC7659m0
        /* renamed from: d */
        public long mo10476a(C10722h0 c10722h0, C10722h0 c10722h02) {
            long m11036f;
            EnumC10686f enumC10686f = this.f27993a;
            if (enumC10686f != null) {
                long m10731c = enumC10686f.m10731c(c10722h0.f27990j, c10722h02.f27990j);
                int i = (m10731c > 0L ? 1 : (m10731c == 0L ? 0 : -1));
                if (i != 0) {
                    boolean z = true;
                    if (this.f27993a != EnumC10686f.f27878q && ((C10697f0) c10722h0.f27990j.m20145L(m10731c, this.f27993a)).mo10712N(c10722h02.f27990j) != 0) {
                        z = false;
                    }
                    if (z) {
                        C10711g0 c10711g0 = c10722h0.f27991k;
                        C10711g0 c10711g02 = c10722h02.f27991k;
                        if (i > 0 && c10711g0.m10622B0(c10711g02)) {
                            return m10731c - 1;
                        }
                        if (i < 0 && c10711g0.m10621C0(c10711g02)) {
                            return m10731c + 1;
                        }
                        return m10731c;
                    }
                    return m10731c;
                }
                return m10731c;
            } else if (c10722h0.f27990j.m20132S(c10722h02.f27990j)) {
                return -mo10476a(c10722h02, c10722h0);
            } else {
                long m20144M = c10722h0.f27990j.m20144M(c10722h02.f27990j, EnumC10686f.f27878q);
                if (m20144M == 0) {
                    return this.f27994b.m10624c(c10722h0.f27991k, c10722h02.f27991k);
                }
                if (this.f27994b.compareTo(EnumC10704g.f27926l) <= 0) {
                    long m11033i = C10616c.m11033i(m20144M, 86400L);
                    C10711g0 c10711g03 = c10722h02.f27991k;
                    InterfaceC10773k0<Integer, C10711g0> interfaceC10773k0 = C10711g0.f27940I;
                    long m11036f2 = C10616c.m11036f(m11033i, C10616c.m11029m(((Integer) c10711g03.mo10212i(interfaceC10773k0)).longValue(), ((Integer) c10722h0.f27991k.mo10212i(interfaceC10773k0)).longValue()));
                    if (c10722h0.f27991k.mo10495a() > c10722h02.f27991k.mo10495a()) {
                        m11036f2--;
                    }
                    m11036f = m11036f2;
                } else {
                    long m11033i2 = C10616c.m11033i(m20144M, 86400000000000L);
                    C10711g0 c10711g04 = c10722h02.f27991k;
                    InterfaceC10773k0<Long, C10711g0> interfaceC10773k02 = C10711g0.f27946O;
                    m11036f = C10616c.m11036f(m11033i2, C10616c.m11029m(((Long) c10711g04.mo10212i(interfaceC10773k02)).longValue(), ((Long) c10722h0.f27991k.mo10212i(interfaceC10773k02)).longValue()));
                }
                switch (C10723a.f27992a[this.f27994b.ordinal()]) {
                    case 1:
                        return m11036f / 3600;
                    case 2:
                        return m11036f / 60;
                    case 3:
                    case 6:
                        return m11036f;
                    case 4:
                        return m11036f / 1000000;
                    case 5:
                        return m11036f / 1000;
                    default:
                        throw new UnsupportedOperationException(this.f27994b.name());
                }
            }
        }

        C10724b(EnumC10704g enumC10704g) {
            this.f27993a = null;
            this.f27994b = enumC10704g;
        }
    }
}
