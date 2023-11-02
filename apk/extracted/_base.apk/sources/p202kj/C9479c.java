package p202kj;

import com.facebook.react.uimanager.ViewDefaults;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import net.time4j.C10582a0;
import net.time4j.C10697f0;
import net.time4j.C10711g0;
import net.time4j.C10768k;
import net.time4j.C10790r;
import net.time4j.base.InterfaceC10620f;
import net.time4j.history.C10736d;
import net.time4j.p249tz.AbstractC10809l;
import net.time4j.p249tz.C10835p;
import net.time4j.p249tz.EnumC10803f;
import net.time4j.p249tz.EnumC10804g;
import net.time4j.p249tz.InterfaceC10808k;
import net.time4j.p249tz.InterfaceC10834o;
import p162ij.AbstractC7638f0;
import p162ij.AbstractC7655l;
import p162ij.AbstractC7658m;
import p162ij.AbstractC7665q;
import p162ij.C7644h0;
import p162ij.C7651j;
import p162ij.C7666r;
import p162ij.C7672x;
import p162ij.EnumC7630b0;
import p162ij.EnumC7661n0;
import p162ij.InterfaceC7631c;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7660n;
import p162ij.InterfaceC7662o;
import p162ij.InterfaceC7663o0;
import p162ij.InterfaceC7664p;
import p162ij.InterfaceC7667s;
import p162ij.InterfaceC7668t;
import p162ij.InterfaceC7669u;
import p162ij.InterfaceC7675y;
import p184jj.C8969a;
import p184jj.EnumC8979e;
import p184jj.EnumC8981g;
import p184jj.EnumC9016v;
import p184jj.InterfaceC9014t;
import p251nj.C10915a;

/* renamed from: kj.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C9479c<T> implements InterfaceC9491e<T>, InterfaceC9488d<T> {

    /* renamed from: r */
    public static final C9479c<C10582a0> f25091r = m14651L();

    /* renamed from: a */
    private final C7672x<T> f25092a;

    /* renamed from: b */
    private final C9485e<?> f25093b;

    /* renamed from: c */
    private final C9476b f25094c;

    /* renamed from: d */
    private final List<C9501i> f25095d;

    /* renamed from: e */
    private final Map<InterfaceC7664p<?>, Object> f25096e;

    /* renamed from: f */
    private final C9502j f25097f;

    /* renamed from: g */
    private final boolean f25098g;

    /* renamed from: h */
    private final boolean f25099h;

    /* renamed from: i */
    private final boolean f25100i;

    /* renamed from: j */
    private final int f25101j;

    /* renamed from: k */
    private final EnumC8981g f25102k;

    /* renamed from: l */
    private final boolean f25103l;

    /* renamed from: m */
    private final boolean f25104m;

    /* renamed from: n */
    private final boolean f25105n;

    /* renamed from: o */
    private final C7672x<?> f25106o;

    /* renamed from: p */
    private final int f25107p;

    /* renamed from: q */
    private final boolean f25108q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kj.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class C9480a implements InterfaceC9491e<InterfaceC10808k> {
        C9480a() {
        }

        @Override // p202kj.InterfaceC9491e
        /* renamed from: b */
        public <R> R mo14472a(InterfaceC10808k interfaceC10808k, Appendable appendable, InterfaceC7633d interfaceC7633d, InterfaceC7668t<InterfaceC7662o, R> interfaceC7668t) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kj.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class C9481b implements InterfaceC9488d<InterfaceC10808k> {

        /* renamed from: a */
        final /* synthetic */ Map f25109a;

        C9481b(Map map) {
            this.f25109a = map;
        }

        @Override // p202kj.InterfaceC9488d
        /* renamed from: a */
        public InterfaceC10808k mo14469b(CharSequence charSequence, C9518s c9518s, InterfaceC7633d interfaceC7633d) {
            int m14430f = c9518s.m14430f();
            int i = m14430f + 3;
            if (i <= charSequence.length()) {
                InterfaceC10808k interfaceC10808k = (InterfaceC10808k) this.f25109a.get(charSequence.subSequence(m14430f, i).toString());
                if (interfaceC10808k != null) {
                    c9518s.m14424l(i);
                    return interfaceC10808k;
                }
                c9518s.m14425k(m14430f, "No time zone information found.");
                return null;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kj.c$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static /* synthetic */ class C9482c {

        /* renamed from: a */
        static final /* synthetic */ int[] f25110a;

        static {
            int[] iArr = new int[EnumC9525w.values().length];
            f25110a = iArr;
            try {
                iArr[EnumC9525w.CLDR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25110a[EnumC9525w.CLDR_24.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25110a[EnumC9525w.CLDR_DATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25110a[EnumC9525w.SIMPLE_DATE_FORMAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: kj.c$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C9483d<T> {

        /* renamed from: n */
        private static final InterfaceC7631c<C10768k> f25111n = C8969a.m16928e("CUSTOM_DAY_PERIOD", C10768k.class);

        /* renamed from: a */
        private final C7672x<T> f25112a;

        /* renamed from: b */
        private final C7672x<?> f25113b;

        /* renamed from: c */
        private final Locale f25114c;

        /* renamed from: d */
        private List<C9501i> f25115d;

        /* renamed from: e */
        private LinkedList<C9476b> f25116e;

        /* renamed from: f */
        private int f25117f;

        /* renamed from: g */
        private int f25118g;

        /* renamed from: h */
        private int f25119h;

        /* renamed from: i */
        private String f25120i;

        /* renamed from: j */
        private C10768k f25121j;

        /* renamed from: k */
        private Map<InterfaceC7664p<?>, Object> f25122k;

        /* renamed from: l */
        private C7672x<?> f25123l;

        /* renamed from: m */
        private int f25124m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: kj.c$d$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        public class C9484a implements InterfaceC7660n<InterfaceC7662o> {

            /* renamed from: j */
            final /* synthetic */ InterfaceC7660n f25125j;

            /* renamed from: k */
            final /* synthetic */ InterfaceC7660n f25126k;

            C9484a(InterfaceC7660n interfaceC7660n, InterfaceC7660n interfaceC7660n2) {
                this.f25125j = interfaceC7660n;
                this.f25126k = interfaceC7660n2;
            }

            @Override // p162ij.InterfaceC7660n
            /* renamed from: a */
            public boolean test(InterfaceC7662o interfaceC7662o) {
                if (this.f25125j.test(interfaceC7662o) && this.f25126k.test(interfaceC7662o)) {
                    return true;
                }
                return false;
            }
        }

        /* synthetic */ C9483d(C7672x c7672x, Locale locale, C9480a c9480a) {
            this(c7672x, locale);
        }

        /* renamed from: H */
        private C9501i m14607H(InterfaceC7664p<?> interfaceC7664p) {
            List<C9501i> list;
            C9501i c9501i;
            if (this.f25115d.isEmpty()) {
                c9501i = null;
            } else {
                c9501i = this.f25115d.get(list.size() - 1);
            }
            if (c9501i == null) {
                return null;
            }
            if (c9501i.m14510g() && !c9501i.m14508i()) {
                throw new IllegalStateException(interfaceC7664p.name() + " can't be inserted after an element with decimal digits.");
            }
            return c9501i;
        }

        /* renamed from: I */
        private static void m14606I(InterfaceC7631c<?> interfaceC7631c) {
            if (interfaceC7631c.name().charAt(0) != '_') {
                return;
            }
            throw new IllegalArgumentException("Internal attribute not allowed: " + interfaceC7631c.name());
        }

        /* renamed from: J */
        private void m14605J(InterfaceC7664p<?> interfaceC7664p) {
            C7672x<?> m14633j = C9479c.m14633j(this.f25112a, this.f25113b, interfaceC7664p);
            int m14624s = C9479c.m14624s(m14633j, this.f25112a, this.f25113b);
            if (m14624s >= this.f25124m) {
                this.f25123l = m14633j;
                this.f25124m = m14624s;
            }
        }

        /* renamed from: K */
        private void m14604K() {
            if (m14597R(this.f25112a)) {
                return;
            }
            throw new IllegalStateException("Timezone names in specific non-location format can only be reliably combined with instant-like types, for example \"Moment\".");
        }

        /* renamed from: M */
        private void m14602M() {
            for (int size = this.f25115d.size() - 1; size >= 0; size--) {
                C9501i c9501i = this.f25115d.get(size);
                if (c9501i.m14508i()) {
                    return;
                }
                if (c9501i.m14510g()) {
                    throw new IllegalArgumentException("Cannot define more than one element with decimal digits.");
                }
            }
        }

        /* renamed from: N */
        private void m14601N(boolean z, boolean z2) {
            m14602M();
            if (!z && !z2 && this.f25118g != -1) {
                throw new IllegalArgumentException("Cannot add fractional element with variable width after another numerical element with variable width.");
            }
        }

        /* renamed from: O */
        private InterfaceC9014t<?> m14600O(boolean z, C10768k c10768k) {
            C9476b last;
            C8969a m16926a = new C8969a.C8971b(m14599P()).m16926a();
            C9476b c9476b = m16926a;
            if (c10768k != null) {
                if (this.f25116e.isEmpty()) {
                    last = new C9476b(m16926a, this.f25114c);
                } else {
                    last = this.f25116e.getLast();
                }
                c9476b = last.m14672m(f25111n, c10768k);
            }
            for (InterfaceC7667s interfaceC7667s : C10711g0.m10581m0().m20111s()) {
                for (InterfaceC7664p<?> interfaceC7664p : interfaceC7667s.mo9074b(this.f25114c, c9476b)) {
                    if (z && interfaceC7664p.mo9552a() == 'b' && m14596S(interfaceC7664p)) {
                        return (InterfaceC9014t) C9479c.m14635h(interfaceC7664p);
                    }
                    if (!z && interfaceC7664p.mo9552a() == 'B' && m14596S(interfaceC7664p)) {
                        return (InterfaceC9014t) C9479c.m14635h(interfaceC7664p);
                    }
                }
            }
            throw new IllegalStateException("Day periods are not supported: " + m14599P().m20113p());
        }

        /* renamed from: Q */
        private static int m14598Q(C9476b c9476b) {
            if (c9476b == null) {
                return 0;
            }
            return c9476b.m14678g();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: R */
        public static boolean m14597R(C7672x<?> c7672x) {
            while (!InterfaceC10620f.class.isAssignableFrom(c7672x.m20113p())) {
                c7672x = c7672x.mo10456f();
                if (c7672x == null) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: S */
        private boolean m14596S(InterfaceC7664p<?> interfaceC7664p) {
            if (!interfaceC7664p.name().endsWith("_DAY_PERIOD")) {
                return false;
            }
            if (this.f25113b != null || this.f25112a.mo20106x(interfaceC7664p)) {
                return true;
            }
            C7672x<T> c7672x = this.f25112a;
            do {
                c7672x = (C7672x<T>) c7672x.mo10456f();
                if (c7672x == null) {
                    return false;
                }
            } while (!c7672x.mo20106x(interfaceC7664p));
            return true;
        }

        /* renamed from: T */
        private static boolean m14595T(char c) {
            return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
        }

        /* renamed from: V */
        private void m14593V() {
            this.f25119h = 0;
        }

        /* renamed from: o */
        private void m14572o(StringBuilder sb2) {
            if (sb2.length() > 0) {
                m14573n(sb2.toString());
                sb2.setLength(0);
            }
        }

        /* renamed from: s */
        private <V> C9483d<T> m14568s(InterfaceC7664p<V> interfaceC7664p, boolean z, int i, int i2, EnumC9527x enumC9527x) {
            return m14567t(interfaceC7664p, z, i, i2, enumC9527x, false);
        }

        /* renamed from: t */
        private <V> C9483d<T> m14567t(InterfaceC7664p<V> interfaceC7664p, boolean z, int i, int i2, EnumC9527x enumC9527x, boolean z2) {
            m14605J(interfaceC7664p);
            C9501i m14607H = m14607H(interfaceC7664p);
            C9516r c9516r = new C9516r(interfaceC7664p, z, i, i2, enumC9527x, z2);
            if (z) {
                int i3 = this.f25118g;
                if (i3 == -1) {
                    m14564w(c9516r);
                } else {
                    C9501i c9501i = this.f25115d.get(i3);
                    m14564w(c9516r);
                    List<C9501i> list = this.f25115d;
                    if (c9501i.m14511f() == list.get(list.size() - 1).m14511f()) {
                        this.f25118g = i3;
                        this.f25115d.set(i3, c9501i.m14497t(i));
                    }
                }
            } else if (m14607H != null && m14607H.m14507j() && !m14607H.m14508i()) {
                throw new IllegalStateException("Numerical element with variable width can't be inserted after another numerical element. Consider \"addFixedXXX()\" instead.");
            } else {
                m14564w(c9516r);
                this.f25118g = this.f25115d.size() - 1;
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public void m14564w(InterfaceC9500h<?> interfaceC9500h) {
            C9476b c9476b;
            int i;
            int i2;
            this.f25118g = -1;
            if (!this.f25116e.isEmpty()) {
                c9476b = this.f25116e.getLast();
                i = c9476b.m14678g();
                i2 = c9476b.m14676i();
            } else {
                c9476b = null;
                i = 0;
                i2 = 0;
            }
            C9501i c9501i = new C9501i(interfaceC9500h, i, i2, c9476b);
            int i3 = this.f25119h;
            if (i3 > 0) {
                c9501i = c9501i.m14503n(i3, 0);
                this.f25119h = 0;
            }
            this.f25115d.add(c9501i);
        }

        /* renamed from: A */
        public C9483d<T> m14614A(InterfaceC9014t<?> interfaceC9014t) {
            m14605J(interfaceC9014t);
            m14564w(C9475a0.m14683a(interfaceC9014t));
            return this;
        }

        /* renamed from: B */
        public C9483d<T> m14613B() {
            if (m14597R(this.f25112a)) {
                m14564w(EnumC9487c0.INSTANCE);
                return this;
            }
            throw new IllegalStateException("Only unix timestamps can have a timezone id.");
        }

        /* renamed from: C */
        public C9483d<T> m14612C(EnumC8979e enumC8979e, boolean z, List<String> list) {
            m14564w(new C9492e0(enumC8979e, z, list));
            return this;
        }

        /* renamed from: D */
        public C9483d<T> m14611D(InterfaceC7664p<Integer> interfaceC7664p) {
            m14605J(interfaceC7664p);
            m14607H(interfaceC7664p);
            C9495f0 c9495f0 = new C9495f0(interfaceC7664p);
            int i = this.f25118g;
            if (i == -1) {
                m14564w(c9495f0);
                this.f25118g = this.f25115d.size() - 1;
            } else {
                C9501i c9501i = this.f25115d.get(i);
                m14585b0(C8969a.f23565f, EnumC8981g.STRICT);
                m14564w(c9495f0);
                m14603L();
                List<C9501i> list = this.f25115d;
                if (c9501i.m14511f() == list.get(list.size() - 1).m14511f()) {
                    this.f25118g = i;
                    this.f25115d.set(i, c9501i.m14497t(2));
                }
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: E */
        public C9483d<T> m14610E(InterfaceC7664p<Integer> interfaceC7664p, int i, boolean z) {
            C9501i c9501i;
            if (this.f25115d.isEmpty()) {
                c9501i = null;
            } else {
                List<C9501i> list = this.f25115d;
                c9501i = list.get(list.size() - 1);
            }
            if (c9501i != null && !c9501i.m14508i() && c9501i.m14507j() && i == 4) {
                return m14567t(interfaceC7664p, true, 4, 4, EnumC9527x.SHOW_NEVER, z);
            }
            return m14567t(interfaceC7664p, false, i, 10, EnumC9527x.SHOW_WHEN_NEGATIVE, z);
        }

        /* renamed from: F */
        public C9479c<T> m14609F() {
            return m14608G(C8969a.m16927f());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: G */
        public C9479c<T> m14608G(C8969a c8969a) {
            boolean z;
            if (c8969a != null) {
                int size = this.f25115d.size();
                HashMap hashMap = null;
                for (int i = 0; i < size; i++) {
                    C9501i c9501i = this.f25115d.get(i);
                    if (c9501i.m14508i()) {
                        int m14511f = c9501i.m14511f();
                        int i2 = size - 1;
                        while (true) {
                            if (i2 > i) {
                                if (this.f25115d.get(i2).m14511f() == m14511f) {
                                    if (hashMap == null) {
                                        hashMap = new HashMap();
                                    }
                                    hashMap.put(Integer.valueOf(i), c9501i.m14504m(i2));
                                    z = true;
                                } else {
                                    i2--;
                                }
                            } else {
                                z = false;
                                break;
                            }
                        }
                        if (!z) {
                            throw new IllegalStateException("Missing format processor after or-operator.");
                        }
                    }
                }
                if (hashMap != null) {
                    for (Integer num : hashMap.keySet()) {
                        this.f25115d.set(num.intValue(), hashMap.get(num));
                    }
                }
                C9479c<T> c9479c = new C9479c<>(this.f25112a, this.f25113b, this.f25114c, this.f25115d, this.f25122k, c8969a, this.f25123l, null);
                String str = this.f25120i;
                if (str == null) {
                    str = "";
                }
                if (this.f25121j != null || !str.isEmpty()) {
                    C9476b c9476b = ((C9479c) c9479c).f25094c;
                    if (!str.isEmpty()) {
                        c9476b = c9476b.m14672m(C8969a.f23583x, str);
                    }
                    C10768k c10768k = this.f25121j;
                    if (c10768k != null) {
                        c9476b = c9476b.m14672m(f25111n, c10768k);
                    }
                    return new C9479c<>(c9479c, c9476b, (C9480a) null);
                }
                return c9479c;
            }
            throw new NullPointerException("Missing format attributes.");
        }

        /* renamed from: L */
        public C9483d<T> m14603L() {
            this.f25116e.removeLast();
            m14593V();
            return this;
        }

        /* renamed from: P */
        public C7672x<?> m14599P() {
            C7672x<?> c7672x = this.f25113b;
            return c7672x == null ? (C7672x<T>) this.f25112a : c7672x;
        }

        /* renamed from: U */
        public C9483d<T> m14594U() {
            int i;
            C9501i c9501i;
            int i2;
            int i3;
            if (!this.f25116e.isEmpty()) {
                i = this.f25116e.getLast().m14676i();
            } else {
                i = 0;
            }
            if (!this.f25115d.isEmpty()) {
                i2 = this.f25115d.size() - 1;
                c9501i = this.f25115d.get(i2);
                i3 = c9501i.m14511f();
            } else {
                c9501i = null;
                i2 = -1;
                i3 = -1;
            }
            if (i == i3) {
                this.f25115d.set(i2, c9501i.m14495v());
                m14593V();
                this.f25118g = -1;
                return this;
            }
            throw new IllegalStateException("Cannot start or-block without any previous step in current section.");
        }

        /* renamed from: W */
        public C9483d<T> m14592W(InterfaceC7660n<Character> interfaceC7660n, int i) {
            m14564w(new C9528y(interfaceC7660n, i));
            return this;
        }

        /* renamed from: X */
        public C9483d<T> m14591X() {
            return m14590Y(null);
        }

        /* renamed from: Y */
        public C9483d<T> m14590Y(InterfaceC7660n<InterfaceC7662o> interfaceC7660n) {
            C9476b c9476b;
            InterfaceC7660n<InterfaceC7662o> interfaceC7660n2;
            C9484a c9484a;
            m14593V();
            C8969a.C8971b c8971b = new C8969a.C8971b();
            if (!this.f25116e.isEmpty()) {
                c9476b = this.f25116e.getLast();
                c8971b.m16921f(c9476b.m14680e());
                interfaceC7660n2 = c9476b.m14679f();
            } else {
                c9476b = null;
                interfaceC7660n2 = null;
            }
            int m14598Q = m14598Q(c9476b) + 1;
            int i = this.f25117f + 1;
            this.f25117f = i;
            if (interfaceC7660n != null) {
                if (interfaceC7660n2 == null) {
                    c9484a = interfaceC7660n;
                } else {
                    c9484a = new C9484a(interfaceC7660n2, interfaceC7660n);
                }
            } else {
                c9484a = interfaceC7660n2;
            }
            this.f25116e.addLast(new C9476b(c8971b.m16926a(), this.f25114c, m14598Q, i, c9484a));
            return this;
        }

        /* renamed from: Z */
        public C9483d<T> m14589Z(InterfaceC7631c<Character> interfaceC7631c, char c) {
            C9476b m14673l;
            m14606I(interfaceC7631c);
            m14593V();
            if (this.f25116e.isEmpty()) {
                m14673l = new C9476b(new C8969a.C8971b().m16925b(interfaceC7631c, c).m16926a(), this.f25114c);
            } else {
                C9476b last = this.f25116e.getLast();
                C8969a.C8971b c8971b = new C8969a.C8971b();
                c8971b.m16921f(last.m14680e());
                c8971b.m16925b(interfaceC7631c, c);
                m14673l = last.m14673l(c8971b.m16926a());
            }
            this.f25116e.addLast(m14673l);
            return this;
        }

        /* renamed from: a0 */
        public C9483d<T> m14587a0(InterfaceC7631c<Integer> interfaceC7631c, int i) {
            C9476b m14673l;
            m14606I(interfaceC7631c);
            m14593V();
            if (this.f25116e.isEmpty()) {
                m14673l = new C9476b(new C8969a.C8971b().m16924c(interfaceC7631c, i).m16926a(), this.f25114c);
            } else {
                C9476b last = this.f25116e.getLast();
                C8969a.C8971b c8971b = new C8969a.C8971b();
                c8971b.m16921f(last.m14680e());
                c8971b.m16924c(interfaceC7631c, i);
                m14673l = last.m14673l(c8971b.m16926a());
            }
            this.f25116e.addLast(m14673l);
            return this;
        }

        /* renamed from: b0 */
        public <A extends Enum<A>> C9483d<T> m14585b0(InterfaceC7631c<A> interfaceC7631c, A a) {
            C9476b m14673l;
            m14606I(interfaceC7631c);
            m14593V();
            if (this.f25116e.isEmpty()) {
                m14673l = new C9476b(new C8969a.C8971b().m16923d(interfaceC7631c, a).m16926a(), this.f25114c);
            } else {
                C9476b last = this.f25116e.getLast();
                C8969a.C8971b c8971b = new C8969a.C8971b();
                c8971b.m16921f(last.m14680e());
                c8971b.m16923d(interfaceC7631c, a);
                m14673l = last.m14673l(c8971b.m16926a());
            }
            this.f25116e.addLast(m14673l);
            return this;
        }

        /* renamed from: d */
        public <V> C9483d<T> m14583d(InterfaceC7664p<V> interfaceC7664p, InterfaceC9491e<V> interfaceC9491e, InterfaceC9488d<V> interfaceC9488d) {
            m14605J(interfaceC7664p);
            m14564w(new C9493f(interfaceC7664p, interfaceC9491e, interfaceC9488d));
            return this;
        }

        /* renamed from: e */
        public C9483d<T> m14582e() {
            return m14614A(m14600O(false, null));
        }

        /* renamed from: f */
        public C9483d<T> m14581f() {
            return m14614A(m14600O(true, null));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        public C9483d<T> m14580g(InterfaceC7664p<Integer> interfaceC7664p, int i) {
            return m14568s(interfaceC7664p, true, i, i, EnumC9527x.SHOW_NEVER);
        }

        /* renamed from: h */
        public <V extends Enum<V>> C9483d<T> m14579h(InterfaceC7664p<V> interfaceC7664p, int i) {
            return m14568s(interfaceC7664p, true, i, i, EnumC9527x.SHOW_NEVER);
        }

        /* renamed from: i */
        public C9483d<T> m14578i(InterfaceC7664p<Integer> interfaceC7664p, int i, int i2, boolean z) {
            boolean z2;
            m14605J(interfaceC7664p);
            if (!z && i == i2) {
                z2 = true;
            } else {
                z2 = false;
            }
            m14601N(z2, z);
            C9502j c9502j = new C9502j(interfaceC7664p, i, i2, z);
            int i3 = this.f25118g;
            if (i3 != -1 && z2) {
                C9501i c9501i = this.f25115d.get(i3);
                m14564w(c9502j);
                List<C9501i> list = this.f25115d;
                if (c9501i.m14511f() == list.get(list.size() - 1).m14511f()) {
                    this.f25118g = i3;
                    this.f25115d.set(i3, c9501i.m14497t(i));
                }
            } else {
                m14564w(c9502j);
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: j */
        public C9483d<T> m14577j(InterfaceC7664p<Integer> interfaceC7664p, int i, int i2) {
            return m14568s(interfaceC7664p, false, i, i2, EnumC9527x.SHOW_NEVER);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: k */
        public C9483d<T> m14576k(InterfaceC7664p<Integer> interfaceC7664p, int i, int i2, EnumC9527x enumC9527x) {
            return m14568s(interfaceC7664p, false, i, i2, enumC9527x);
        }

        /* renamed from: l */
        public C9483d<T> m14575l(char c) {
            return m14573n(String.valueOf(c));
        }

        /* renamed from: m */
        public C9483d<T> m14574m(char c, char c2) {
            m14564w(new C9510m(c, c2));
            return this;
        }

        /* renamed from: n */
        public C9483d<T> m14573n(String str) {
            int i;
            C9501i c9501i;
            C9510m c9510m = new C9510m(str);
            int m14463b = c9510m.m14463b();
            if (m14463b > 0) {
                if (this.f25115d.isEmpty()) {
                    c9501i = null;
                } else {
                    List<C9501i> list = this.f25115d;
                    c9501i = list.get(list.size() - 1);
                }
                if (c9501i != null && c9501i.m14510g() && !c9501i.m14508i()) {
                    throw new IllegalStateException("Numerical literal can't be inserted after an element with decimal digits.");
                }
            }
            if (m14463b != 0 && (i = this.f25118g) != -1) {
                C9501i c9501i2 = this.f25115d.get(i);
                m14564w(c9510m);
                int m14511f = c9501i2.m14511f();
                List<C9501i> list2 = this.f25115d;
                if (m14511f == list2.get(list2.size() - 1).m14511f()) {
                    this.f25118g = i;
                    this.f25115d.set(i, c9501i2.m14497t(m14463b));
                }
            } else {
                m14564w(c9510m);
            }
            return this;
        }

        /* renamed from: p */
        public C9483d<T> m14571p() {
            m14564w(new C9511n(false));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: q */
        public C9483d<T> m14570q(InterfaceC7664p<Long> interfaceC7664p, int i, int i2, EnumC9527x enumC9527x) {
            return m14568s(interfaceC7664p, false, i, i2, enumC9527x);
        }

        /* renamed from: r */
        public C9483d<T> m14569r() {
            m14604K();
            m14564w(new C9489d0(false));
            return this;
        }

        /* renamed from: u */
        public <V extends Enum<V>> C9483d<T> m14566u(InterfaceC7664p<V> interfaceC7664p, int i, int i2) {
            return m14568s(interfaceC7664p, false, i, i2, EnumC9527x.SHOW_NEVER);
        }

        /* renamed from: v */
        public C9483d<T> m14565v(String str, EnumC9525w enumC9525w) {
            if (enumC9525w != null) {
                Map<InterfaceC7664p<?>, InterfaceC7664p<?>> emptyMap = Collections.emptyMap();
                int length = str.length();
                Locale locale = this.f25114c;
                StringBuilder sb2 = new StringBuilder();
                if (!this.f25116e.isEmpty()) {
                    locale = this.f25116e.getLast().m14677h();
                }
                int i = 0;
                while (i < length) {
                    char charAt = str.charAt(i);
                    if (m14595T(charAt)) {
                        m14572o(sb2);
                        int i2 = i + 1;
                        while (i2 < length && str.charAt(i2) == charAt) {
                            i2++;
                        }
                        Map<InterfaceC7664p<?>, InterfaceC7664p<?>> m14390C = enumC9525w.m14390C(this, locale, charAt, i2 - i);
                        if (!m14390C.isEmpty()) {
                            if (emptyMap.isEmpty()) {
                                emptyMap = m14390C;
                            } else {
                                HashMap hashMap = new HashMap(emptyMap);
                                hashMap.putAll(m14390C);
                                emptyMap = hashMap;
                            }
                        }
                        i = i2 - 1;
                    } else if (charAt == '\'') {
                        m14572o(sb2);
                        int i3 = i + 1;
                        int i4 = i3;
                        while (i4 < length) {
                            if (str.charAt(i4) == '\'') {
                                int i5 = i4 + 1;
                                if (i5 >= length || str.charAt(i5) != '\'') {
                                    break;
                                }
                                i4 = i5;
                            }
                            i4++;
                        }
                        if (i4 < length) {
                            if (i3 == i4) {
                                m14575l('\'');
                            } else {
                                m14573n(str.substring(i3, i4).replace("''", "'"));
                            }
                            i = i4;
                        } else {
                            throw new IllegalArgumentException("String literal in pattern not closed: " + str);
                        }
                    } else if (charAt == '[') {
                        m14572o(sb2);
                        m14591X();
                    } else if (charAt == ']') {
                        m14572o(sb2);
                        m14603L();
                    } else if (charAt == '|') {
                        try {
                            m14572o(sb2);
                            m14594U();
                        } catch (IllegalStateException e) {
                            throw new IllegalArgumentException(e);
                        }
                    } else if (charAt != '#' && charAt != '{' && charAt != '}') {
                        sb2.append(charAt);
                    } else {
                        throw new IllegalArgumentException("Pattern contains reserved character: '" + charAt + "'");
                    }
                    i++;
                }
                m14572o(sb2);
                if (!emptyMap.isEmpty()) {
                    int size = this.f25115d.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        C9501i c9501i = this.f25115d.get(i6);
                        InterfaceC7664p<?> mo14365c = c9501i.m14513d().mo14365c();
                        if (emptyMap.containsKey(mo14365c)) {
                            this.f25115d.set(i6, c9501i.m14493x(emptyMap.get(mo14365c)));
                        }
                    }
                }
                if (this.f25120i != null) {
                    str = "";
                }
                this.f25120i = str;
                return this;
            }
            throw new NullPointerException("Missing pattern type.");
        }

        /* renamed from: x */
        public C9483d<T> m14563x() {
            m14564w(new C9511n(true));
            return this;
        }

        /* renamed from: y */
        public C9483d<T> m14562y() {
            m14604K();
            m14564w(new C9489d0(true));
            return this;
        }

        /* renamed from: z */
        public <V extends Enum<V>> C9483d<T> m14561z(InterfaceC7664p<V> interfaceC7664p) {
            V[] enumConstants;
            m14605J(interfaceC7664p);
            if (interfaceC7664p instanceof InterfaceC9014t) {
                m14564w(C9475a0.m14683a((InterfaceC9014t) InterfaceC9014t.class.cast(interfaceC7664p)));
            } else {
                HashMap hashMap = new HashMap();
                for (V v : interfaceC7664p.getType().getEnumConstants()) {
                    hashMap.put(v, v.toString());
                }
                m14564w(new C9513o(interfaceC7664p, hashMap));
            }
            return this;
        }

        private C9483d(C7672x<T> c7672x, Locale locale) {
            this(c7672x, locale, (C7672x<?>) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private C9483d(C7672x<T> c7672x, Locale locale, C7672x<?> c7672x2) {
            if (c7672x == 0) {
                throw new NullPointerException("Missing chronology.");
            }
            if (locale != null) {
                this.f25112a = c7672x;
                this.f25113b = c7672x2;
                this.f25114c = locale;
                this.f25115d = new ArrayList();
                this.f25116e = new LinkedList<>();
                this.f25117f = 0;
                this.f25118g = -1;
                this.f25119h = 0;
                this.f25120i = null;
                this.f25121j = null;
                this.f25122k = new HashMap();
                this.f25123l = c7672x;
                this.f25124m = 0;
                return;
            }
            throw new NullPointerException("Missing locale.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kj.c$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class C9485e<C> implements InterfaceC7669u<C10790r<C>> {

        /* renamed from: j */
        private final C7672x<C> f25128j;

        /* renamed from: k */
        private final List<InterfaceC7667s> f25129k;

        private C9485e(C7672x<C> c7672x) {
            this.f25128j = c7672x;
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(c7672x.m20111s());
            arrayList.addAll(C10711g0.m10581m0().m20111s());
            this.f25129k = Collections.unmodifiableList(arrayList);
        }

        /* renamed from: h */
        static <C> C9485e<C> m14556h(C7672x<C> c7672x) {
            if (c7672x == null) {
                return null;
            }
            return new C9485e<>(c7672x);
        }

        @Override // p162ij.InterfaceC7669u
        /* renamed from: a */
        public C10790r<C> mo10453j(AbstractC7665q<?> abstractC7665q, InterfaceC7633d interfaceC7633d, boolean z, boolean z2) {
            C10790r m10216e;
            C mo10453j = this.f25128j.mo10453j(abstractC7665q, interfaceC7633d, z, z2);
            C10711g0 mo10453j2 = C10711g0.m10581m0().mo10453j(abstractC7665q, interfaceC7633d, z, z2);
            if (mo10453j instanceof AbstractC7655l) {
                m10216e = C10790r.m10219b((AbstractC7655l) AbstractC7655l.class.cast(mo10453j), mo10453j2);
            } else if (mo10453j instanceof AbstractC7658m) {
                m10216e = C10790r.m10216e((AbstractC7658m) AbstractC7658m.class.cast(mo10453j), mo10453j2);
            } else {
                throw new IllegalStateException("Cannot determine calendar type: " + mo10453j);
            }
            return (C10790r) C9479c.m14635h(m10216e);
        }

        @Override // p162ij.InterfaceC7669u
        /* renamed from: c */
        public AbstractC7638f0 mo10458c() {
            return this.f25128j.mo10458c();
        }

        /* renamed from: d */
        public C7672x<?> m14558d() {
            return (C7672x<C>) this.f25128j;
        }

        /* renamed from: e */
        public List<InterfaceC7667s> m14557e() {
            return this.f25129k;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9485e) {
                return this.f25128j.equals(((C9485e) obj).f25128j);
            }
            return false;
        }

        @Override // p162ij.InterfaceC7669u
        /* renamed from: f */
        public C7672x<?> mo10456f() {
            throw new UnsupportedOperationException("Not used.");
        }

        @Override // p162ij.InterfaceC7669u
        /* renamed from: g */
        public int mo10455g() {
            return this.f25128j.mo10455g();
        }

        public int hashCode() {
            return this.f25128j.hashCode();
        }

        @Override // p162ij.InterfaceC7669u
        /* renamed from: i */
        public String mo10454i(InterfaceC7675y interfaceC7675y, Locale locale) {
            throw new UnsupportedOperationException("Not used.");
        }

        @Override // p162ij.InterfaceC7669u
        /* renamed from: k */
        public InterfaceC7662o mo10459b(C10790r<C> c10790r, InterfaceC7633d interfaceC7633d) {
            throw new UnsupportedOperationException("Not used.");
        }

        public String toString() {
            return this.f25128j.m20113p().getName();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kj.c$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class C9486f implements InterfaceC7662o, InterfaceC7663o0, InterfaceC10620f {

        /* renamed from: j */
        private final C10790r<?> f25130j;

        /* renamed from: k */
        private final String f25131k;

        /* renamed from: l */
        private final InterfaceC10808k f25132l;

        /* synthetic */ C9486f(C10790r c10790r, String str, InterfaceC10808k interfaceC10808k, C9480a c9480a) {
            this(c10790r, str, interfaceC10808k);
        }

        /* renamed from: b */
        private InterfaceC10620f m14554b() {
            AbstractC7638f0 abstractC7638f0;
            try {
                abstractC7638f0 = C7672x.m20105y(this.f25130j.m10214g().getClass()).mo10458c();
            } catch (RuntimeException unused) {
                abstractC7638f0 = AbstractC7638f0.f20937a;
            }
            return this.f25130j.m10220a(AbstractC10809l.m10149N(this.f25132l), abstractC7638f0);
        }

        @Override // net.time4j.base.InterfaceC10620f
        /* renamed from: a */
        public int mo10166a() {
            return m14554b().mo10166a();
        }

        @Override // p162ij.InterfaceC7662o
        /* renamed from: c */
        public int mo10218c(InterfaceC7664p<Integer> interfaceC7664p) {
            return this.f25130j.mo10218c(interfaceC7664p);
        }

        @Override // p162ij.InterfaceC7662o
        /* renamed from: d */
        public boolean mo10217d() {
            return true;
        }

        @Override // p162ij.InterfaceC7662o
        /* renamed from: f */
        public <V> V mo10215f(InterfaceC7664p<V> interfaceC7664p) {
            return (V) this.f25130j.mo10215f(interfaceC7664p);
        }

        @Override // p162ij.InterfaceC7662o
        /* renamed from: i */
        public <V> V mo10212i(InterfaceC7664p<V> interfaceC7664p) {
            return (V) this.f25130j.mo10212i(interfaceC7664p);
        }

        @Override // net.time4j.base.InterfaceC10620f
        /* renamed from: k */
        public long mo10164k() {
            return m14554b().mo10164k();
        }

        @Override // p162ij.InterfaceC7662o
        /* renamed from: l */
        public <V> V mo10211l(InterfaceC7664p<V> interfaceC7664p) {
            return (V) this.f25130j.mo10211l(interfaceC7664p);
        }

        @Override // p162ij.InterfaceC7662o
        /* renamed from: q */
        public boolean mo10210q(InterfaceC7664p<?> interfaceC7664p) {
            return this.f25130j.mo10210q(interfaceC7664p);
        }

        @Override // p162ij.InterfaceC7662o
        /* renamed from: t */
        public InterfaceC10808k mo10209t() {
            return this.f25132l;
        }

        private C9486f(C10790r<?> c10790r, String str, InterfaceC10808k interfaceC10808k) {
            this.f25130j = c10790r;
            this.f25131k = str;
            this.f25132l = interfaceC10808k;
        }
    }

    /* synthetic */ C9479c(C7672x c7672x, C7672x c7672x2, Locale locale, List list, Map map, C8969a c8969a, C7672x c7672x3, C9480a c9480a) {
        this(c7672x, c7672x2, locale, list, map, c8969a, c7672x3);
    }

    /* renamed from: A */
    private static boolean m14662A(C7672x<?> c7672x, C7672x<?> c7672x2, InterfaceC7664p<?> interfaceC7664p) {
        for (InterfaceC7667s interfaceC7667s : c7672x.m20111s()) {
            if (interfaceC7667s.mo9075a(interfaceC7664p)) {
                return true;
            }
        }
        if (c7672x2 != null) {
            if (interfaceC7664p.mo9555M()) {
                for (InterfaceC7667s interfaceC7667s2 : c7672x2.m20111s()) {
                    if (interfaceC7667s2.mo9075a(interfaceC7664p)) {
                        return true;
                    }
                }
                return false;
            } else if (interfaceC7664p.mo9553V() && C10711g0.m10581m0().mo20106x(interfaceC7664p)) {
                for (InterfaceC7667s interfaceC7667s3 : C10711g0.m10581m0().m20111s()) {
                    if (interfaceC7667s3.mo9075a(interfaceC7664p)) {
                        return true;
                    }
                }
                return false;
            } else {
                return false;
            }
        }
        while (true) {
            c7672x = c7672x.mo10456f();
            if (c7672x != null) {
                for (InterfaceC7667s interfaceC7667s4 : c7672x.m20111s()) {
                    if (interfaceC7667s4.mo9075a(interfaceC7664p)) {
                        return true;
                    }
                }
            } else {
                return false;
            }
        }
    }

    /* renamed from: B */
    public static C9479c<C10582a0> m14661B(EnumC8979e enumC8979e, EnumC8979e enumC8979e2, Locale locale, InterfaceC10808k interfaceC10808k) {
        C9483d c9483d = new C9483d(C10582a0.m11164X(), locale, (C9480a) null);
        c9483d.m14564w(new C9529z(enumC8979e, enumC8979e2));
        return (C9479c<T>) c9483d.m14609F().m14641V(interfaceC10808k);
    }

    /* renamed from: C */
    public static <T> C9479c<T> m14660C(String str, EnumC9525w enumC9525w, Locale locale, C7672x<T> c7672x) {
        C9483d c9483d = new C9483d(c7672x, locale, (C9480a) null);
        m14636g(c9483d, str, enumC9525w);
        try {
            return c9483d.m14609F();
        } catch (IllegalStateException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static <T> T m14657F(p202kj.C9479c<?> r15, p162ij.InterfaceC7669u<T> r16, java.util.List<p162ij.InterfaceC7667s> r17, java.lang.CharSequence r18, p202kj.C9518s r19, p162ij.InterfaceC7633d r20, p184jj.EnumC8981g r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p202kj.C9479c.m14657F(kj.c, ij.u, java.util.List, java.lang.CharSequence, kj.s, ij.d, jj.g, boolean, boolean):java.lang.Object");
    }

    /* renamed from: G */
    private static <C> C m14656G(C9479c<?> c9479c, C7672x<C> c7672x, int i, CharSequence charSequence, C9518s c9518s, InterfaceC7633d interfaceC7633d, EnumC8981g enumC8981g, boolean z) {
        C7672x<?> c7672x2;
        Object m14656G;
        C7672x<?> mo10456f = c7672x.mo10456f();
        if (mo10456f == null || c7672x == (c7672x2 = ((C9479c) c9479c).f25106o)) {
            return (C) m14657F(c9479c, c7672x, c7672x.m20111s(), charSequence, c9518s, interfaceC7633d, enumC8981g, i > 0, z);
        }
        if (mo10456f == c7672x2) {
            m14656G = m14657F(c9479c, mo10456f, mo10456f.m20111s(), charSequence, c9518s, interfaceC7633d, enumC8981g, true, z);
        } else {
            m14656G = m14656G(c9479c, mo10456f, i + 1, charSequence, c9518s, interfaceC7633d, enumC8981g, z);
        }
        if (c9518s.m14427i()) {
            return null;
        }
        if (m14656G == null) {
            AbstractC7665q<?> m14429g = c9518s.m14429g();
            int length = charSequence.length();
            c9518s.m14425k(length, m14621v(m14429g) + m14623t(m14429g));
            return null;
        }
        AbstractC7665q<?> m14428h = c9518s.m14428h();
        try {
            if (mo10456f instanceof C7644h0) {
                m14646Q(m14428h, ((C7644h0) C7644h0.class.cast(mo10456f)).m20174I(), m14656G);
                C mo10453j = c7672x.mo10453j(m14428h, interfaceC7633d, enumC8981g.m16889a(), false);
                if (mo10453j != null) {
                    return enumC8981g.m16887c() ? (C) m14634i(m14428h, mo10453j, charSequence, c9518s) : mo10453j;
                }
                if (!c9518s.m14427i()) {
                    int length2 = charSequence.length();
                    c9518s.m14425k(length2, m14621v(m14428h) + m14623t(m14428h));
                }
                return null;
            }
            try {
                throw new IllegalStateException("Unsupported chronology or preparser: " + c7672x);
            } catch (RuntimeException e) {
                e = e;
                int length3 = charSequence.length();
                c9518s.m14425k(length3, e.getMessage() + m14623t(m14428h));
                return null;
            }
        } catch (RuntimeException e2) {
            e = e2;
        }
    }

    /* renamed from: H */
    private AbstractC7665q<?> m14655H(CharSequence charSequence, C9518s c9518s, InterfaceC7633d interfaceC7633d, boolean z, int i) {
        LinkedList linkedList;
        C9521v c9521v;
        int i2;
        C9521v c9521v2;
        int i3;
        InterfaceC7664p<?> mo14365c;
        C9521v c9521v3 = new C9521v(i, this.f25103l);
        c9521v3.m14395h0(c9518s.m14430f());
        if (this.f25098g) {
            LinkedList linkedList2 = new LinkedList();
            linkedList2.push(c9521v3);
            linkedList = linkedList2;
        } else {
            linkedList = null;
        }
        int size = this.f25095d.size();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i6 < size) {
            C9501i c9501i = this.f25095d.get(i6);
            if (linkedList == null) {
                c9521v2 = c9521v3;
                c9521v = c9521v2;
                i2 = i4;
            } else {
                int m14515b = c9501i.m14515b();
                int i7 = m14515b;
                while (i7 > i5) {
                    c9521v3 = new C9521v(i >>> 1, this.f25103l);
                    c9521v3.m14395h0(c9518s.m14430f());
                    linkedList.push(c9521v3);
                    i7--;
                }
                while (i7 < i5) {
                    c9521v3 = (C9521v) linkedList.pop();
                    ((C9521v) linkedList.peek()).m14401b0(c9521v3);
                    i7++;
                }
                c9521v = c9521v3;
                i2 = m14515b;
                c9521v2 = (C9521v) linkedList.peek();
            }
            c9518s.m14434b();
            c9501i.m14500q(charSequence, c9518s, interfaceC7633d, c9521v2, z);
            if (c9518s.m14426j() && (mo14365c = c9501i.m14513d().mo14365c()) != null && this.f25096e.containsKey(mo14365c)) {
                c9521v2.mo14414J(mo14365c, this.f25096e.get(mo14365c));
                c9521v2.mo14419F(EnumC7661n0.ERROR_MESSAGE, null);
                c9518s.m14435a();
                c9518s.m14434b();
            }
            if (c9518s.m14427i()) {
                int m14511f = c9501i.m14511f();
                if (!c9501i.m14508i()) {
                    i3 = i6 + 1;
                    while (i3 < size) {
                        C9501i c9501i2 = this.f25095d.get(i3);
                        if (c9501i2.m14508i() && c9501i2.m14511f() == m14511f) {
                            break;
                        }
                        i3++;
                    }
                }
                i3 = i6;
                if (i3 <= i6 && !c9501i.m14508i()) {
                    if (i2 == 0) {
                        if (linkedList != null) {
                            c9521v = (C9521v) linkedList.peek();
                        }
                        c9521v.m14396g0();
                        return c9521v;
                    }
                    int m14515b2 = c9501i.m14515b();
                    int i8 = i3;
                    for (int i9 = i6 + 1; i9 < size && this.f25095d.get(i9).m14515b() > m14515b2; i9++) {
                        i8 = i9;
                    }
                    int i10 = size - 1;
                    while (true) {
                        if (i10 <= i8) {
                            break;
                        } else if (this.f25095d.get(i10).m14511f() == m14511f) {
                            i8 = i10;
                            break;
                        } else {
                            i10--;
                        }
                    }
                    i2--;
                    c9521v3 = (C9521v) linkedList.pop();
                    c9518s.m14435a();
                    c9518s.m14424l(c9521v3.m14406W());
                    i6 = i8;
                    i5 = i2;
                    i6++;
                    i4 = i5;
                } else {
                    if (linkedList != null) {
                        c9521v = (C9521v) linkedList.pop();
                    }
                    c9518s.m14435a();
                    c9518s.m14424l(c9521v.m14406W());
                    c9521v.m14397f0();
                    if (linkedList != null) {
                        linkedList.push(c9521v);
                    }
                    i6 = i3;
                }
            } else if (c9501i.m14508i()) {
                i6 = c9501i.m14496u();
            }
            c9521v3 = c9521v;
            i5 = i2;
            i6++;
            i4 = i5;
        }
        while (i4 > 0) {
            c9521v3 = (C9521v) linkedList.pop();
            ((C9521v) linkedList.peek()).m14401b0(c9521v3);
            i4--;
        }
        if (linkedList != null) {
            c9521v3 = (C9521v) linkedList.peek();
        }
        c9521v3.m14396g0();
        return c9521v3;
    }

    /* renamed from: L */
    private static C9479c<C10582a0> m14651L() {
        C9483d m14649N = m14649N(C10582a0.class, Locale.ENGLISH);
        m14650M(m14649N);
        m14649N.m14612C(EnumC8979e.MEDIUM, false, Arrays.asList("GMT", "UT", "Z"));
        m14649N.m14594U();
        m14650M(m14649N);
        HashMap hashMap = new HashMap();
        EnumC10803f enumC10803f = EnumC10803f.BEHIND_UTC;
        hashMap.put("EST", C10835p.m10022o(enumC10803f, 5));
        hashMap.put("EDT", C10835p.m10022o(enumC10803f, 4));
        hashMap.put("CST", C10835p.m10022o(enumC10803f, 6));
        hashMap.put("CDT", C10835p.m10022o(enumC10803f, 5));
        hashMap.put("MST", C10835p.m10022o(enumC10803f, 7));
        hashMap.put("MDT", C10835p.m10022o(enumC10803f, 6));
        hashMap.put("PST", C10835p.m10022o(enumC10803f, 8));
        hashMap.put("PDT", C10835p.m10022o(enumC10803f, 7));
        m14649N.m14564w(new C9493f(EnumC9478b0.TIMEZONE_OFFSET, new C9480a(), new C9481b(hashMap)));
        return (C9479c<T>) m14649N.m14609F().m14641V(C10835p.f28295t);
    }

    /* renamed from: M */
    private static void m14650M(C9483d<C10582a0> c9483d) {
        C9483d<C10582a0> m14591X = c9483d.m14591X();
        InterfaceC7631c<EnumC9016v> interfaceC7631c = C8969a.f23566g;
        EnumC9016v enumC9016v = EnumC9016v.ABBREVIATED;
        m14591X.m14585b0(interfaceC7631c, enumC9016v).m14561z(C10697f0.f27889E).m14603L().m14573n(", ").m14603L().m14577j(C10697f0.f27888D, 1, 2).m14575l(' ').m14585b0(interfaceC7631c, enumC9016v).m14561z(C10697f0.f27886B).m14603L().m14575l(' ').m14580g(C10697f0.f27908y, 4).m14575l(' ').m14580g(C10711g0.f27935D, 2).m14575l(':').m14580g(C10711g0.f27937F, 2).m14591X().m14575l(':').m14580g(C10711g0.f27939H, 2).m14603L().m14575l(' ');
    }

    /* renamed from: N */
    public static <T extends AbstractC7665q<T>> C9483d<T> m14649N(Class<T> cls, Locale locale) {
        if (cls != null) {
            C7672x m20105y = C7672x.m20105y(cls);
            if (m20105y != null) {
                return new C9483d<>(m20105y, locale, (C9480a) null);
            }
            throw new IllegalArgumentException("Not formattable: " + cls);
        }
        throw new NullPointerException("Missing chronological type.");
    }

    /* renamed from: O */
    private static <V> void m14648O(AbstractC7665q<?> abstractC7665q, InterfaceC7664p<V> interfaceC7664p, Object obj) {
        abstractC7665q.mo14419F(interfaceC7664p, interfaceC7664p.getType().cast(obj));
    }

    /* renamed from: P */
    private static String m14647P(int i, CharSequence charSequence) {
        int length = charSequence.length();
        if (length - i <= 10) {
            return charSequence.subSequence(i, length).toString();
        }
        return charSequence.subSequence(i, i + 10).toString() + "...";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Q */
    private static <T> void m14646Q(AbstractC7665q<?> abstractC7665q, InterfaceC7664p<T> interfaceC7664p, Object obj) {
        abstractC7665q.mo14419F(interfaceC7664p, interfaceC7664p.getType().cast(obj));
    }

    /* renamed from: g */
    private static <T> void m14636g(C9483d<T> c9483d, String str, EnumC9525w enumC9525w) {
        boolean z;
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == '\'') {
                int i2 = i + 1;
                if (str.charAt(i2) == 'Z') {
                    z = true;
                } else {
                    z = false;
                }
                while (i2 < length) {
                    if (str.charAt(i2) == '\'') {
                        int i3 = i2 + 1;
                        if (i3 < length && str.charAt(i3) == '\'') {
                            i2 = i3;
                        } else {
                            if (z && i2 == i + 2 && C9483d.m14597R(((C9483d) c9483d).f25112a)) {
                                throw new IllegalArgumentException("Z-literal (=UTC+00) should not be escaped: " + str);
                            }
                            i = i2;
                        }
                    }
                    i2++;
                }
                i = i2;
            } else {
                sb2.append(charAt);
            }
            i++;
        }
        String sb3 = sb2.toString();
        int i4 = C9482c.f25110a[enumC9525w.ordinal()];
        if (i4 == 1 || i4 == 2 || i4 == 3 || i4 == 4) {
            if ((sb3.contains("h") || sb3.contains("K")) && !sb3.contains("a") && !sb3.contains("b") && !sb3.contains("B")) {
                throw new IllegalArgumentException("12-hour-clock requires am/pm-marker or dayperiod: " + str);
            } else if (sb3.contains("Y") && ((sb3.contains("M") || sb3.contains("L")) && !sb3.contains("w"))) {
                throw new IllegalArgumentException("Y as week-based-year requires a week-date-format: " + str);
            } else if (sb3.contains("D") && ((sb3.contains("M") || sb3.contains("L")) && !sb3.contains("d"))) {
                throw new IllegalArgumentException("D is the day of year but not the day of month: " + str);
            }
        }
        c9483d.m14565v(str, enumC9525w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public static <T> T m14635h(Object obj) {
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0107, code lost:
        if (((net.time4j.C10711g0) r10.mo10212i(r6)).mo10479s() == 24) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012b  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static <T> T m14634i(p162ij.AbstractC7665q<?> r10, T r11, java.lang.CharSequence r12, p202kj.C9518s r13) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p202kj.C9479c.m14634i(ij.q, java.lang.Object, java.lang.CharSequence, kj.s):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static C7672x<?> m14633j(C7672x<?> c7672x, C7672x<?> c7672x2, InterfaceC7664p<?> interfaceC7664p) {
        if (c7672x.mo20106x(interfaceC7664p)) {
            return c7672x;
        }
        if (c7672x2 == null) {
            do {
                c7672x = c7672x.mo10456f();
                if (c7672x != null) {
                }
            } while (!c7672x.mo20106x(interfaceC7664p));
            return c7672x;
        } else if (interfaceC7664p.mo9555M() && c7672x2.mo20106x(interfaceC7664p)) {
            return c7672x2;
        } else {
            if (interfaceC7664p.mo9553V() && C10711g0.m10581m0().mo20106x(interfaceC7664p)) {
                return C10711g0.m10581m0();
            }
        }
        throw new IllegalArgumentException("Unsupported element: " + interfaceC7664p.name());
    }

    /* renamed from: k */
    private InterfaceC7662o m14632k(T t, InterfaceC7633d interfaceC7633d) {
        C10790r m11141u0;
        C9485e<?> c9485e = this.f25093b;
        if (c9485e == null) {
            return this.f25092a.mo10459b(t, interfaceC7633d);
        }
        try {
            Class<?> m20113p = c9485e.m14558d().m20113p();
            AbstractC7638f0 abstractC7638f0 = (AbstractC7638f0) interfaceC7633d.mo14441b(C8969a.f23580u, this.f25093b.mo10458c());
            C10582a0 c10582a0 = (C10582a0) C10582a0.class.cast(t);
            InterfaceC10808k interfaceC10808k = (InterfaceC10808k) interfaceC7633d.mo14440c(C8969a.f23563d);
            String str = "";
            if (AbstractC7655l.class.isAssignableFrom(m20113p)) {
                str = (String) interfaceC7633d.mo14440c(C8969a.f23579t);
                m11141u0 = c10582a0.m11142t0((C7651j) m14635h(this.f25093b.m14558d()), str, interfaceC10808k, abstractC7638f0);
            } else if (AbstractC7658m.class.isAssignableFrom(m20113p)) {
                m11141u0 = c10582a0.m11141u0(this.f25093b.m14558d(), interfaceC10808k, abstractC7638f0);
            } else {
                throw new IllegalStateException("Unexpected calendar override: " + m20113p);
            }
            return new C9486f(m11141u0, str, interfaceC10808k, null);
        } catch (ClassCastException e) {
            throw new IllegalArgumentException("Not formattable: " + t, e);
        } catch (NoSuchElementException e2) {
            throw new IllegalArgumentException(e2.getMessage(), e2);
        }
    }

    /* renamed from: m */
    private String m14630m(InterfaceC7662o interfaceC7662o) {
        StringBuilder sb2 = new StringBuilder(this.f25095d.size() * 8);
        try {
            m14653J(interfaceC7662o, sb2, this.f25094c, false);
            return sb2.toString();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: n */
    private List<C9501i> m14629n(List<C9501i> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C9501i c9501i : list) {
            arrayList.add(c9501i.m14498s(this));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static int m14624s(C7672x<?> c7672x, C7672x<?> c7672x2, C7672x<?> c7672x3) {
        if (c7672x3 != null) {
            return -1;
        }
        int i = 0;
        if (c7672x.equals(c7672x2)) {
            return 0;
        }
        do {
            c7672x2 = c7672x2.mo10456f();
            if (c7672x2 != null) {
                i++;
            } else {
                return ViewDefaults.NUMBER_OF_LINES;
            }
        } while (!c7672x.equals(c7672x2));
        return i;
    }

    /* renamed from: t */
    private static String m14623t(AbstractC7665q<?> abstractC7665q) {
        Set<InterfaceC7664p<?>> mo14394z = abstractC7665q.mo14394z();
        StringBuilder sb2 = new StringBuilder(mo14394z.size() * 16);
        sb2.append(" [parsed={");
        boolean z = true;
        for (InterfaceC7664p<?> interfaceC7664p : mo14394z) {
            if (z) {
                z = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(interfaceC7664p.name());
            sb2.append('=');
            sb2.append(abstractC7665q.mo10212i(interfaceC7664p));
        }
        sb2.append("}]");
        return sb2.toString();
    }

    /* renamed from: v */
    private static String m14621v(AbstractC7665q<?> abstractC7665q) {
        EnumC7661n0 enumC7661n0 = EnumC7661n0.ERROR_MESSAGE;
        if (abstractC7665q.mo10210q(enumC7661n0)) {
            String str = "Validation failed => " + ((String) abstractC7665q.mo10212i(enumC7661n0));
            abstractC7665q.mo14419F(enumC7661n0, null);
            return str;
        }
        return "Insufficient data:";
    }

    /* renamed from: w */
    private boolean m14620w() {
        boolean m14617z = m14617z();
        if (m14617z) {
            InterfaceC9500h<?> m14513d = this.f25095d.get(0).m14513d();
            if (m14513d instanceof C9493f) {
                return ((C9493f) C9493f.class.cast(m14513d)).m14543b();
            }
            if (!(m14513d instanceof C9529z)) {
                return false;
            }
            return m14617z;
        }
        return m14617z;
    }

    /* renamed from: x */
    private boolean m14619x() {
        return this.f25092a.mo10456f() == null && this.f25093b == null;
    }

    /* renamed from: y */
    private static boolean m14618y(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: D */
    public T m14659D(CharSequence charSequence) {
        C9518s c9518s = new C9518s();
        T m14658E = m14658E(charSequence, c9518s);
        if (m14658E != null) {
            int m14430f = c9518s.m14430f();
            if (!this.f25104m && m14430f < charSequence.length()) {
                throw new ParseException("Unparsed trailing characters: " + m14647P(m14430f, charSequence), m14430f);
            }
            return m14658E;
        }
        throw new ParseException(c9518s.m14432d(), c9518s.m14433c());
    }

    /* renamed from: E */
    public T m14658E(CharSequence charSequence, C9518s c9518s) {
        if (this.f25105n) {
            C7672x<T> c7672x = this.f25092a;
            return (T) m14657F(this, c7672x, c7672x.m20111s(), charSequence, c9518s, this.f25094c, this.f25102k, false, true);
        }
        return mo14469b(charSequence, c9518s, this.f25094c);
    }

    /* renamed from: I */
    public String m14654I(T t) {
        return m14630m(m14632k(t, this.f25094c));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public Set<C9496g> m14653J(InterfaceC7662o interfaceC7662o, Appendable appendable, InterfaceC7633d interfaceC7633d, boolean z) {
        boolean z2;
        Set<C9496g> set;
        LinkedList linkedList;
        int i;
        LinkedList linkedList2;
        LinkedList linkedList3;
        int i2;
        int i3;
        if (appendable != null) {
            int size = this.f25095d.size();
            int i4 = 0;
            if (interfaceC7633d == this.f25094c) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                set = new LinkedHashSet<>(size);
            } else {
                set = null;
            }
            if (this.f25099h) {
                LinkedList linkedList4 = new LinkedList();
                linkedList4.push(new StringBuilder(size << 2));
                if (z) {
                    LinkedList linkedList5 = new LinkedList();
                    linkedList5.push(set);
                    linkedList = linkedList5;
                } else {
                    linkedList = null;
                }
                int i5 = 0;
                while (i5 < size) {
                    C9501i c9501i = this.f25095d.get(i5);
                    int m14515b = c9501i.m14515b();
                    int i6 = m14515b;
                    while (i6 > i4) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append((CharSequence) linkedList4.peek());
                        linkedList4.push(sb2);
                        if (z) {
                            set = new LinkedHashSet<>();
                            set.addAll((Collection) linkedList.peek());
                            linkedList.push(set);
                        }
                        i6--;
                    }
                    while (i6 < i4) {
                        linkedList4.pop();
                        linkedList4.push((StringBuilder) linkedList4.pop());
                        if (z) {
                            set = (Set) linkedList.pop();
                            linkedList.pop();
                            linkedList.push(set);
                        }
                        i6++;
                    }
                    StringBuilder sb3 = (StringBuilder) linkedList4.peek();
                    if (z) {
                        set = (Set) linkedList.peek();
                    }
                    Set<C9496g> set2 = set;
                    int i7 = i5;
                    LinkedList linkedList6 = linkedList;
                    LinkedList linkedList7 = linkedList4;
                    try {
                        i = c9501i.m14499r(interfaceC7662o, sb3, interfaceC7633d, set2, z2);
                        e = null;
                    } catch (C7666r | IllegalArgumentException e) {
                        e = e;
                        i = -1;
                    }
                    if (i == -1) {
                        int m14511f = c9501i.m14511f();
                        if (!c9501i.m14508i()) {
                            i3 = i7;
                            i2 = i3 + 1;
                            while (i2 < size) {
                                C9501i c9501i2 = this.f25095d.get(i2);
                                if (c9501i2.m14508i() && c9501i2.m14511f() == m14511f) {
                                    break;
                                }
                                i2++;
                            }
                        } else {
                            i3 = i7;
                        }
                        i2 = i3;
                        if (i2 <= i3 && !c9501i.m14508i()) {
                            if (e == null) {
                                throw new IllegalArgumentException("Not formattable: " + interfaceC7662o);
                            }
                            throw new IllegalArgumentException("Not formattable: " + interfaceC7662o, e);
                        }
                        linkedList7.pop();
                        StringBuilder sb4 = new StringBuilder();
                        if (!linkedList7.isEmpty()) {
                            sb4.append((CharSequence) linkedList7.peek());
                        }
                        linkedList3 = linkedList7;
                        linkedList3.push(sb4);
                        if (z) {
                            linkedList6.pop();
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            if (!linkedList6.isEmpty()) {
                                linkedHashSet.addAll((Collection) linkedList6.peek());
                            }
                            linkedList2 = linkedList6;
                            linkedList2.push(linkedHashSet);
                        } else {
                            linkedList2 = linkedList6;
                        }
                    } else {
                        linkedList2 = linkedList6;
                        linkedList3 = linkedList7;
                        if (c9501i.m14508i()) {
                            i2 = c9501i.m14496u();
                        } else {
                            i2 = i7;
                        }
                    }
                    i5 = i2 + 1;
                    linkedList4 = linkedList3;
                    linkedList = linkedList2;
                    set = set2;
                    i4 = m14515b;
                }
                LinkedList linkedList8 = linkedList;
                LinkedList linkedList9 = linkedList4;
                linkedList9.clear();
                appendable.append((StringBuilder) linkedList9.peek());
                if (z) {
                    set = (Set) linkedList8.peek();
                    linkedList8.clear();
                }
            } else {
                int i8 = 0;
                while (i8 < size) {
                    try {
                        C9501i c9501i3 = this.f25095d.get(i8);
                        c9501i3.m14499r(interfaceC7662o, appendable, interfaceC7633d, set, z2);
                        if (c9501i3.m14508i()) {
                            i8 = c9501i3.m14496u();
                        }
                        i8++;
                    } catch (C7666r e2) {
                        throw new IllegalArgumentException("Not formattable: " + interfaceC7662o, e2);
                    }
                }
            }
            if (z) {
                return Collections.unmodifiableSet(set);
            }
            return null;
        }
        throw new NullPointerException("Missing text result buffer.");
    }

    /* renamed from: K */
    public Set<C9496g> m14652K(T t, Appendable appendable, InterfaceC7633d interfaceC7633d) {
        return m14653J(m14632k(t, interfaceC7633d), appendable, interfaceC7633d, true);
    }

    /* renamed from: R */
    public <A extends Enum<A>> C9479c<T> m14645R(InterfaceC7631c<A> interfaceC7631c, A a) {
        return new C9479c<>(this, new C8969a.C8971b().m16921f(this.f25094c.m14680e()).m16923d(interfaceC7631c, a).m16926a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public C9479c<T> m14644S(Map<InterfaceC7664p<?>, Object> map, C9476b c9476b) {
        C9476b m14674k = C9476b.m14674k(c9476b, this.f25094c);
        return new C9479c<>(new C9479c(this, map), m14674k, (C10736d) m14674k.mo14441b(C10915a.f28643a, null));
    }

    /* renamed from: T */
    public C9479c<T> m14643T(EnumC8981g enumC8981g) {
        return m14645R(C8969a.f23565f, enumC8981g);
    }

    /* renamed from: U */
    public C9479c<T> m14642U(AbstractC10809l abstractC10809l) {
        if (abstractC10809l != null) {
            return new C9479c<>(this, this.f25094c.m14673l(new C8969a.C8971b().m16921f(this.f25094c.m14680e()).m16918i(abstractC10809l.mo10125z()).m16926a()).m14672m(C8969a.f23564e, abstractC10809l.mo10158E()));
        }
        throw new NullPointerException("Missing timezone id.");
    }

    /* renamed from: V */
    public C9479c<T> m14641V(InterfaceC10808k interfaceC10808k) {
        return m14642U(AbstractC10809l.m10149N(interfaceC10808k));
    }

    @Override // p202kj.InterfaceC9491e
    /* renamed from: a */
    public <R> R mo14472a(T t, Appendable appendable, InterfaceC7633d interfaceC7633d, InterfaceC7668t<InterfaceC7662o, R> interfaceC7668t) {
        InterfaceC7662o m14632k = m14632k(t, interfaceC7633d);
        m14653J(m14632k, appendable, interfaceC7633d, false);
        return interfaceC7668t.apply(m14632k);
    }

    @Override // p202kj.InterfaceC9488d
    /* renamed from: b */
    public T mo14469b(CharSequence charSequence, C9518s c9518s, InterfaceC7633d interfaceC7633d) {
        EnumC8981g enumC8981g;
        boolean z;
        C9514p c9514p;
        InterfaceC10808k interfaceC10808k;
        C10582a0 c10582a0;
        EnumC10804g enumC10804g;
        EnumC8981g enumC8981g2 = this.f25102k;
        C9476b c9476b = this.f25094c;
        if (interfaceC7633d != c9476b) {
            C9514p c9514p2 = new C9514p(interfaceC7633d, c9476b);
            c9514p = c9514p2;
            enumC8981g = (EnumC8981g) c9514p2.mo14441b(C8969a.f23565f, EnumC8981g.SMART);
            z = false;
        } else {
            enumC8981g = enumC8981g2;
            z = true;
            c9514p = interfaceC7633d;
        }
        C9485e<?> c9485e = this.f25093b;
        if (c9485e != null) {
            List<InterfaceC7667s> m14557e = c9485e.m14557e();
            C9485e<?> c9485e2 = this.f25093b;
            C10790r c10790r = (C10790r) m14657F(this, c9485e2, m14557e, charSequence, c9518s, c9514p, enumC8981g, true, z);
            if (c9518s.m14427i()) {
                return null;
            }
            AbstractC7665q<?> m14428h = c9518s.m14428h();
            if (m14428h.mo10217d()) {
                interfaceC10808k = m14428h.mo10209t();
            } else {
                InterfaceC7631c<InterfaceC10808k> interfaceC7631c = C8969a.f23563d;
                if (c9514p.mo14442a(interfaceC7631c)) {
                    interfaceC10808k = (InterfaceC10808k) c9514p.mo14440c(interfaceC7631c);
                } else {
                    interfaceC10808k = null;
                }
            }
            if (interfaceC10808k != null) {
                AbstractC7638f0 abstractC7638f0 = (AbstractC7638f0) interfaceC7633d.mo14441b(C8969a.f23580u, c9485e2.mo10458c());
                EnumC7630b0 enumC7630b0 = EnumC7630b0.DAYLIGHT_SAVING;
                if (m14428h.mo10210q(enumC7630b0)) {
                    boolean booleanValue = ((Boolean) m14428h.mo10212i(enumC7630b0)).booleanValue();
                    InterfaceC10834o interfaceC10834o = (InterfaceC10834o) c9514p.mo14441b(C8969a.f23564e, AbstractC10809l.f28231m);
                    if (booleanValue) {
                        enumC10804g = EnumC10804g.EARLIER_OFFSET;
                    } else {
                        enumC10804g = EnumC10804g.LATER_OFFSET;
                    }
                    c10582a0 = c10790r.m10220a(AbstractC10809l.m10149N(interfaceC10808k).mo10146Q(interfaceC10834o.mo10037a(enumC10804g)), abstractC7638f0);
                } else {
                    InterfaceC7631c<InterfaceC10834o> interfaceC7631c2 = C8969a.f23564e;
                    if (c9514p.mo14442a(interfaceC7631c2)) {
                        c10582a0 = c10790r.m10220a(AbstractC10809l.m10149N(interfaceC10808k).mo10146Q((InterfaceC10834o) c9514p.mo14440c(interfaceC7631c2)), abstractC7638f0);
                    } else {
                        c10582a0 = c10790r.m10220a(AbstractC10809l.m10149N(interfaceC10808k), abstractC7638f0);
                    }
                }
            } else {
                c10582a0 = null;
            }
            if (c10582a0 == null) {
                c9518s.m14425k(charSequence.length(), "Missing timezone or offset.");
                return null;
            }
            m14428h.mo14419F(C10582a0.m11164X().m20174I(), c10582a0);
            T t = (T) m14635h(c10582a0);
            if (enumC8981g.m16887c()) {
                m14634i(m14428h, t, charSequence, c9518s);
            }
            return t;
        }
        return (T) m14656G(this, this.f25092a, 0, charSequence, c9518s, c9514p, enumC8981g, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9479c)) {
            return false;
        }
        C9479c c9479c = (C9479c) obj;
        if (this.f25092a.equals(c9479c.f25092a) && m14618y(this.f25093b, c9479c.f25093b) && this.f25094c.equals(c9479c.f25094c) && this.f25096e.equals(c9479c.f25096e) && this.f25095d.equals(c9479c.f25095d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f25092a.hashCode() * 7) + (this.f25094c.hashCode() * 31) + (this.f25095d.hashCode() * 37);
    }

    /* renamed from: l */
    public String m14631l(T t) {
        return m14654I(t);
    }

    /* renamed from: o */
    public InterfaceC7633d m14628o() {
        return this.f25094c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public C9476b m14627p() {
        return this.f25094c;
    }

    /* renamed from: q */
    public C7672x<T> m14626q() {
        return this.f25092a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public Map<InterfaceC7664p<?>, Object> m14625r() {
        return this.f25096e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(256);
        sb2.append("net.time4j.format.ChronoFormatter[chronology=");
        sb2.append(this.f25092a.m20113p().getName());
        if (this.f25093b != null) {
            sb2.append(", override=");
            sb2.append(this.f25093b);
        }
        sb2.append(", default-attributes=");
        sb2.append(this.f25094c);
        sb2.append(", default-values=");
        sb2.append(this.f25096e);
        sb2.append(", processors=");
        boolean z = true;
        for (C9501i c9501i : this.f25095d) {
            if (z) {
                sb2.append('{');
                z = false;
            } else {
                sb2.append('|');
            }
            sb2.append(c9501i);
        }
        sb2.append("}]");
        return sb2.toString();
    }

    /* renamed from: u */
    public Locale m14622u() {
        return this.f25094c.m14677h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean m14617z() {
        return this.f25107p == 1 && !this.f25098g;
    }

    /* synthetic */ C9479c(C9479c c9479c, C9476b c9476b, C9480a c9480a) {
        this(c9479c, c9476b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C9479c(C7672x<T> c7672x, C7672x<?> c7672x2, Locale locale, List<C9501i> list, Map<InterfaceC7664p<?>, Object> map, C8969a c8969a, C7672x<?> c7672x3) {
        if (c7672x != null) {
            if (!list.isEmpty()) {
                this.f25092a = c7672x;
                this.f25093b = C9485e.m14556h(c7672x2);
                this.f25106o = c7672x3;
                C9476b m14681d = C9476b.m14681d(c7672x2 == 0 ? c7672x : c7672x2, c8969a, locale);
                this.f25094c = m14681d;
                this.f25102k = (EnumC8981g) m14681d.mo14441b(C8969a.f23565f, EnumC8981g.SMART);
                this.f25096e = Collections.unmodifiableMap(map);
                C9502j c9502j = null;
                boolean z = true;
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                int i = 0;
                for (C9501i c9501i : list) {
                    z3 = c9501i.m14508i() ? true : z3;
                    if (c9502j == null && (c9501i.m14513d() instanceof C9502j)) {
                        c9502j = (C9502j) C9502j.class.cast(c9501i.m14513d());
                    }
                    if (!z2 && c9501i.m14515b() > 0) {
                        z2 = true;
                    }
                    InterfaceC7664p<?> mo14365c = c9501i.m14513d().mo14365c();
                    if (mo14365c != null) {
                        i++;
                        if (z && !C9521v.m14405X(mo14365c)) {
                            z = false;
                        }
                        if (!z4) {
                            z4 = m14662A(c7672x, c7672x2, mo14365c);
                        }
                    }
                }
                this.f25097f = c9502j;
                this.f25098g = z2;
                this.f25099h = z3;
                this.f25100i = z4;
                this.f25101j = i;
                this.f25103l = z;
                this.f25104m = ((Boolean) this.f25094c.mo14441b(C8969a.f23577r, Boolean.FALSE)).booleanValue();
                this.f25105n = m14619x();
                this.f25107p = list.size();
                this.f25095d = m14629n(list);
                this.f25108q = m14620w();
                return;
            }
            throw new IllegalStateException("No format processors defined.");
        }
        throw new NullPointerException("Missing chronology.");
    }

    private C9479c(C9479c<T> c9479c, C8969a c8969a) {
        this(c9479c, c9479c.f25094c.m14673l(c8969a), (C10736d) null);
    }

    private C9479c(C9479c<T> c9479c, C9476b c9476b) {
        this(c9479c, c9476b, (C10736d) null);
    }

    private C9479c(C9479c<T> c9479c, C9476b c9476b, C10736d c10736d) {
        InterfaceC7664p<Integer> m10431C;
        if (c9476b != null) {
            this.f25092a = c9479c.f25092a;
            this.f25093b = c9479c.f25093b;
            this.f25106o = c9479c.f25106o;
            this.f25094c = c9476b;
            this.f25102k = (EnumC8981g) c9476b.mo14441b(C8969a.f23565f, EnumC8981g.SMART);
            this.f25096e = Collections.unmodifiableMap(new C9515q(c9479c.f25096e));
            this.f25097f = c9479c.f25097f;
            this.f25098g = c9479c.f25098g;
            this.f25099h = c9479c.f25099h;
            this.f25100i = c9479c.f25100i || c10736d != null;
            this.f25101j = c9479c.f25101j;
            int size = c9479c.f25095d.size();
            ArrayList arrayList = new ArrayList(c9479c.f25095d);
            boolean z = c9479c.f25103l;
            for (int i = 0; i < size; i++) {
                C9501i c9501i = arrayList.get(i);
                InterfaceC7664p<?> mo14365c = c9501i.m14513d().mo14365c();
                C7672x c7672x = this.f25092a;
                c7672x = c7672x == C10582a0.m11164X() ? c7672x.mo10456f() : c7672x;
                if (mo14365c != null && !c7672x.m20107w(mo14365c)) {
                    Iterator<InterfaceC7667s> it = c7672x.m20111s().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        InterfaceC7667s next = it.next();
                        if (next.mo9074b(c9479c.m14622u(), c9479c.f25094c).contains(mo14365c)) {
                            Iterator<InterfaceC7664p<?>> it2 = next.mo9074b(c9476b.m14677h(), c9476b).iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                InterfaceC7664p<?> next2 = it2.next();
                                if (next2.name().equals(mo14365c.name())) {
                                    if (next2 != mo14365c) {
                                        arrayList.set(i, c9501i.m14493x(next2));
                                        z = false;
                                    }
                                }
                            }
                        }
                    }
                }
                if (c10736d != null) {
                    if (mo14365c == C10697f0.f27908y) {
                        m10431C = c10736d.m10421M();
                    } else if (mo14365c != C10697f0.f27886B && mo14365c != C10697f0.f27887C) {
                        if (mo14365c == C10697f0.f27888D) {
                            m10431C = c10736d.m10414g();
                        } else {
                            m10431C = mo14365c == C10697f0.f27890F ? c10736d.m10413h() : null;
                        }
                    } else {
                        m10431C = c10736d.m10431C();
                    }
                    if (m10431C != null) {
                        arrayList.set(i, c9501i.m14493x(m10431C));
                    }
                    z = false;
                }
            }
            this.f25103l = z;
            this.f25104m = ((Boolean) this.f25094c.mo14441b(C8969a.f23577r, Boolean.FALSE)).booleanValue();
            this.f25105n = m14619x();
            this.f25107p = arrayList.size();
            this.f25095d = m14629n(arrayList);
            this.f25108q = m14620w();
            return;
        }
        throw new NullPointerException("Missing global format attributes.");
    }

    private C9479c(C9479c<T> c9479c, Map<InterfaceC7664p<?>, Object> map) {
        C9485e<?> c9485e = c9479c.f25093b;
        C7672x<?> m14558d = c9485e == null ? null : c9485e.m14558d();
        for (InterfaceC7664p<?> interfaceC7664p : map.keySet()) {
            m14633j(c9479c.f25092a, m14558d, interfaceC7664p);
        }
        this.f25092a = c9479c.f25092a;
        this.f25093b = c9479c.f25093b;
        this.f25106o = c9479c.f25106o;
        this.f25094c = c9479c.f25094c;
        this.f25102k = c9479c.f25102k;
        this.f25097f = c9479c.f25097f;
        this.f25098g = c9479c.f25098g;
        this.f25099h = c9479c.f25099h;
        this.f25100i = c9479c.f25100i;
        this.f25101j = c9479c.f25101j;
        this.f25104m = c9479c.f25104m;
        HashMap hashMap = new HashMap(c9479c.f25096e);
        boolean z = c9479c.f25103l;
        for (InterfaceC7664p<?> interfaceC7664p2 : map.keySet()) {
            Object obj = map.get(interfaceC7664p2);
            if (obj == null) {
                hashMap.remove(interfaceC7664p2);
            } else {
                hashMap.put(interfaceC7664p2, obj);
                z = z && C9521v.m14405X(interfaceC7664p2);
            }
        }
        this.f25096e = Collections.unmodifiableMap(hashMap);
        this.f25103l = z;
        this.f25105n = m14619x();
        this.f25107p = c9479c.f25107p;
        this.f25095d = m14629n(c9479c.f25095d);
        this.f25108q = m14620w();
    }
}
