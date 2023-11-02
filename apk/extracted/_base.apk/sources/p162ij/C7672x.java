package p162ij;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: ij.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C7672x<T> implements InterfaceC7669u<T> {

    /* renamed from: o */
    private static final List<C7674b> f20973o = new CopyOnWriteArrayList();

    /* renamed from: p */
    private static final ReferenceQueue<C7672x<?>> f20974p = new ReferenceQueue<>();

    /* renamed from: j */
    private final Class<T> f20975j;

    /* renamed from: k */
    private final InterfaceC7669u<T> f20976k;

    /* renamed from: l */
    private final Map<InterfaceC7664p<?>, InterfaceC7676z<T, ?>> f20977l;

    /* renamed from: m */
    private final List<InterfaceC7667s> f20978m;

    /* renamed from: n */
    private final Map<InterfaceC7664p<?>, InterfaceC7632c0<T>> f20979n;

    /* renamed from: ij.x$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C7673a<T extends AbstractC7665q<T>> {

        /* renamed from: a */
        final Class<T> f20980a;

        /* renamed from: b */
        final boolean f20981b;

        /* renamed from: c */
        final InterfaceC7669u<T> f20982c;

        /* renamed from: d */
        final Map<InterfaceC7664p<?>, InterfaceC7676z<T, ?>> f20983d;

        /* renamed from: e */
        final List<InterfaceC7667s> f20984e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C7673a(Class<T> cls, InterfaceC7669u<T> interfaceC7669u) {
            if (interfaceC7669u != null) {
                this.f20980a = cls;
                this.f20981b = cls.getName().startsWith("net.time4j.");
                this.f20982c = interfaceC7669u;
                this.f20983d = new HashMap();
                this.f20984e = new ArrayList();
                return;
            }
            throw new NullPointerException("Missing chronological merger.");
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void m20102c(p162ij.InterfaceC7664p<?> r5) {
            /*
                r4 = this;
                boolean r0 = r4.f20981b
                if (r0 == 0) goto L5
                return
            L5:
                if (r5 == 0) goto L4a
                java.lang.String r0 = r5.name()
                java.util.Map<ij.p<?>, ij.z<T extends ij.q<T>, ?>> r1 = r4.f20983d
                java.util.Set r1 = r1.keySet()
                java.util.Iterator r1 = r1.iterator()
            L15:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L49
                java.lang.Object r2 = r1.next()
                ij.p r2 = (p162ij.InterfaceC7664p) r2
                boolean r3 = r2.equals(r5)
                if (r3 != 0) goto L32
                java.lang.String r2 = r2.name()
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L32
                goto L15
            L32:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Element duplicate found: "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r5.<init>(r0)
                throw r5
            L49:
                return
            L4a:
                java.lang.NullPointerException r5 = new java.lang.NullPointerException
                java.lang.String r0 = "Static initialization problem: Check if given element statically refer to any chronology causing premature class loading."
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p162ij.C7672x.C7673a.m20102c(ij.p):void");
        }

        /* renamed from: a */
        public <V> C7673a<T> m20104a(InterfaceC7664p<V> interfaceC7664p, InterfaceC7676z<T, V> interfaceC7676z) {
            m20102c(interfaceC7664p);
            this.f20983d.put(interfaceC7664p, interfaceC7676z);
            return this;
        }

        /* renamed from: b */
        public C7673a<T> m20103b(InterfaceC7667s interfaceC7667s) {
            if (interfaceC7667s != null) {
                if (!this.f20984e.contains(interfaceC7667s)) {
                    this.f20984e.add(interfaceC7667s);
                }
                return this;
            }
            throw new NullPointerException("Missing chronological extension.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ij.x$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C7674b extends WeakReference<C7672x<?>> {

        /* renamed from: a */
        private final String f20985a;

        C7674b(C7672x<?> c7672x, ReferenceQueue<C7672x<?>> referenceQueue) {
            super(c7672x, referenceQueue);
            this.f20985a = ((C7672x) c7672x).f20975j.getName();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7672x(Class<T> cls, InterfaceC7669u<T> interfaceC7669u, Map<InterfaceC7664p<?>, InterfaceC7676z<T, ?>> map, List<InterfaceC7667s> list) {
        if (cls != null) {
            if (interfaceC7669u != null) {
                this.f20975j = cls;
                this.f20976k = interfaceC7669u;
                Map<InterfaceC7664p<?>, InterfaceC7676z<T, ?>> unmodifiableMap = Collections.unmodifiableMap(map);
                this.f20977l = unmodifiableMap;
                this.f20978m = Collections.unmodifiableList(list);
                HashMap hashMap = new HashMap();
                for (InterfaceC7664p<?> interfaceC7664p : unmodifiableMap.keySet()) {
                    if (interfaceC7664p.getType() == Integer.class) {
                        InterfaceC7676z<T, ?> interfaceC7676z = this.f20977l.get(interfaceC7664p);
                        if (interfaceC7676z instanceof InterfaceC7632c0) {
                            hashMap.put(interfaceC7664p, (InterfaceC7632c0) interfaceC7676z);
                        }
                    }
                }
                this.f20979n = Collections.unmodifiableMap(hashMap);
                return;
            }
            throw new NullPointerException("Missing chronological merger.");
        }
        throw new NullPointerException("Missing chronological type.");
    }

    /* renamed from: B */
    private static void m20119B() {
        while (true) {
            C7674b c7674b = (C7674b) f20974p.poll();
            if (c7674b != null) {
                Iterator<C7674b> it = f20973o.iterator();
                while (true) {
                    if (it.hasNext()) {
                        C7674b next = it.next();
                        if (next.f20985a.equals(c7674b.f20985a)) {
                            f20973o.remove(next);
                            break;
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static void m20118C(C7672x<?> c7672x) {
        f20973o.add(new C7674b(c7672x, f20974p));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    private static <T> T m20116m(Object obj) {
        return obj;
    }

    /* renamed from: q */
    private InterfaceC7676z<T, ?> m20112q(InterfaceC7664p<?> interfaceC7664p, boolean z) {
        String str = null;
        if (!(interfaceC7664p instanceof AbstractC7635e) || !AbstractC7665q.class.isAssignableFrom(m20113p())) {
            return null;
        }
        AbstractC7635e abstractC7635e = (AbstractC7635e) AbstractC7635e.class.cast(interfaceC7664p);
        if (z) {
            str = abstractC7635e.mo20151t(this);
        }
        if (str == null) {
            return (InterfaceC7676z) m20116m(abstractC7635e.mo9901p((C7672x) m20116m(this)));
        }
        throw new C7636e0(str);
    }

    /* renamed from: y */
    public static <T> C7672x<T> m20105y(Class<T> cls) {
        C7672x<?> c7672x;
        try {
            Class.forName(cls.getName(), true, cls.getClassLoader());
            Iterator<C7674b> it = f20973o.iterator();
            boolean z = false;
            while (true) {
                if (it.hasNext()) {
                    c7672x = it.next().get();
                    if (c7672x == null) {
                        z = true;
                    } else if (c7672x.m20113p() == cls) {
                        break;
                    }
                } else {
                    c7672x = null;
                    break;
                }
            }
            if (z) {
                m20119B();
            }
            return (C7672x) m20116m(c7672x);
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // p162ij.InterfaceC7669u
    /* renamed from: b */
    public InterfaceC7662o mo10459b(T t, InterfaceC7633d interfaceC7633d) {
        return this.f20976k.mo10459b(t, interfaceC7633d);
    }

    @Override // p162ij.InterfaceC7669u
    /* renamed from: c */
    public AbstractC7638f0 mo10458c() {
        return this.f20976k.mo10458c();
    }

    @Override // p162ij.InterfaceC7669u
    /* renamed from: f */
    public C7672x<?> mo10456f() {
        return this.f20976k.mo10456f();
    }

    @Override // p162ij.InterfaceC7669u
    /* renamed from: g */
    public int mo10455g() {
        return this.f20976k.mo10455g();
    }

    @Override // p162ij.InterfaceC7669u
    /* renamed from: i */
    public String mo10454i(InterfaceC7675y interfaceC7675y, Locale locale) {
        return this.f20976k.mo10454i(interfaceC7675y, locale);
    }

    @Override // p162ij.InterfaceC7669u
    /* renamed from: j */
    public T mo10453j(AbstractC7665q<?> abstractC7665q, InterfaceC7633d interfaceC7633d, boolean z, boolean z2) {
        return this.f20976k.mo10453j(abstractC7665q, interfaceC7633d, z, z2);
    }

    /* renamed from: n */
    public InterfaceC7653k<T> mo20115n() {
        throw new C7666r("Calendar system is not available.");
    }

    /* renamed from: o */
    public InterfaceC7653k<T> mo20114o(String str) {
        throw new C7666r("Calendar variant is not available: " + str);
    }

    /* renamed from: p */
    public Class<T> m20113p() {
        return this.f20975j;
    }

    /* renamed from: s */
    public List<InterfaceC7667s> m20111s() {
        return this.f20978m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public InterfaceC7632c0<T> m20110t(InterfaceC7664p<Integer> interfaceC7664p) {
        return this.f20979n.get(interfaceC7664p);
    }

    /* renamed from: u */
    public Set<InterfaceC7664p<?>> m20109u() {
        return this.f20977l.keySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public <V> InterfaceC7676z<T, V> m20108v(InterfaceC7664p<V> interfaceC7664p) {
        if (interfaceC7664p != null) {
            InterfaceC7676z<T, ?> interfaceC7676z = this.f20977l.get(interfaceC7664p);
            if (interfaceC7676z == null && (interfaceC7676z = m20112q(interfaceC7664p, true)) == null) {
                throw new C7636e0((C7672x<?>) this, (InterfaceC7664p<?>) interfaceC7664p);
            }
            return (InterfaceC7676z) m20116m(interfaceC7676z);
        }
        throw new NullPointerException("Missing chronological element.");
    }

    /* renamed from: w */
    public boolean m20107w(InterfaceC7664p<?> interfaceC7664p) {
        return interfaceC7664p != null && this.f20977l.containsKey(interfaceC7664p);
    }

    /* renamed from: x */
    public boolean mo20106x(InterfaceC7664p<?> interfaceC7664p) {
        if (interfaceC7664p == null) {
            return false;
        }
        if (!m20107w(interfaceC7664p) && m20112q(interfaceC7664p, false) == null) {
            return false;
        }
        return true;
    }
}
