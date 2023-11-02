package p142hi;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C9545j;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KClass;
import p164j$.util.concurrent.ConcurrentHashMap;
import p271oi.AbstractC11127c;
import p271oi.AbstractC11131e;
import p271oi.AbstractC11166s;
import p327ri.C12242a;

/* renamed from: hi.c1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7226c1 extends AbstractC11131e<AbstractC7218a1<?>, AbstractC7218a1<?>> {

    /* renamed from: k */
    public static final C7227a f19622k = new C7227a(null);

    /* renamed from: l */
    private static final C7226c1 f19623l;

    /* renamed from: hi.c1$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C7227a extends AbstractC11166s<AbstractC7218a1<?>, AbstractC7218a1<?>> {
        private C7227a() {
        }

        public /* synthetic */ C7227a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // p271oi.AbstractC11166s
        /* renamed from: b */
        public <T extends AbstractC7218a1<?>> int mo9085b(ConcurrentHashMap<KClass<? extends AbstractC7218a1<?>>, Integer> concurrentHashMap, KClass<T> kClass, Function1<? super KClass<? extends AbstractC7218a1<?>>, Integer> compute) {
            int intValue;
            C9612q.m13917h(concurrentHashMap, "<this>");
            C9612q.m13917h(kClass, "kClass");
            C9612q.m13917h(compute, "compute");
            Integer num = concurrentHashMap.get(kClass);
            if (num == null) {
                synchronized (concurrentHashMap) {
                    Integer num2 = concurrentHashMap.get(kClass);
                    if (num2 == null) {
                        Integer invoke = compute.invoke(kClass);
                        concurrentHashMap.putIfAbsent(kClass, Integer.valueOf(invoke.intValue()));
                        num2 = invoke;
                    }
                    C9612q.m13918g(num2, "this[kClass] ?: compute(…putIfAbsent(kClass, it) }");
                    intValue = num2.intValue();
                }
                return intValue;
            }
            return num.intValue();
        }

        /* renamed from: g */
        public final C7226c1 m21198g(List<? extends AbstractC7218a1<?>> attributes) {
            C9612q.m13917h(attributes, "attributes");
            if (attributes.isEmpty()) {
                return m21197h();
            }
            return new C7226c1(attributes, null);
        }

        /* renamed from: h */
        public final C7226c1 m21197h() {
            return C7226c1.f19623l;
        }
    }

    static {
        List m14104i;
        m14104i = C9545j.m14104i();
        f19623l = new C7226c1(m14104i);
    }

    private C7226c1(List<? extends AbstractC7218a1<?>> list) {
        for (AbstractC7218a1<?> abstractC7218a1 : list) {
            m9113h(abstractC7218a1.mo21078b(), abstractC7218a1);
        }
    }

    public /* synthetic */ C7226c1(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p271oi.AbstractC11124a
    /* renamed from: e */
    public AbstractC11166s<AbstractC7218a1<?>, AbstractC7218a1<?>> mo9119e() {
        return f19622k;
    }

    /* renamed from: k */
    public final C7226c1 m21204k(C7226c1 other) {
        Object mo21079a;
        C9612q.m13917h(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        for (Number number : f19622k.m9082e()) {
            int intValue = number.intValue();
            AbstractC7218a1<?> abstractC7218a1 = mo9114a().get(intValue);
            AbstractC7218a1<?> abstractC7218a12 = other.mo9114a().get(intValue);
            if (abstractC7218a1 == null) {
                if (abstractC7218a12 != null) {
                    mo21079a = abstractC7218a12.mo21079a(abstractC7218a1);
                } else {
                    mo21079a = null;
                }
            } else {
                mo21079a = abstractC7218a1.mo21079a(abstractC7218a12);
            }
            C12242a.m5675a(arrayList, mo21079a);
        }
        return f19622k.m21198g(arrayList);
    }

    /* renamed from: o */
    public final boolean m21203o(AbstractC7218a1<?> attribute) {
        C9612q.m13917h(attribute, "attribute");
        if (mo9114a().get(f19622k.m9083d(attribute.mo21078b())) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final C7226c1 m21202p(C7226c1 other) {
        Object mo21077c;
        C9612q.m13917h(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        for (Number number : f19622k.m9082e()) {
            int intValue = number.intValue();
            AbstractC7218a1<?> abstractC7218a1 = mo9114a().get(intValue);
            AbstractC7218a1<?> abstractC7218a12 = other.mo9114a().get(intValue);
            if (abstractC7218a1 == null) {
                if (abstractC7218a12 != null) {
                    mo21077c = abstractC7218a12.mo21077c(abstractC7218a1);
                } else {
                    mo21077c = null;
                }
            } else {
                mo21077c = abstractC7218a1.mo21077c(abstractC7218a12);
            }
            C12242a.m5675a(arrayList, mo21077c);
        }
        return f19622k.m21198g(arrayList);
    }

    /* renamed from: r */
    public final C7226c1 m21201r(AbstractC7218a1<?> attribute) {
        List m14075C0;
        List<? extends AbstractC7218a1<?>> m14035o0;
        C9612q.m13917h(attribute, "attribute");
        if (m21203o(attribute)) {
            return this;
        }
        if (isEmpty()) {
            return new C7226c1(attribute);
        }
        m14075C0 = C9553r.m14075C0(this);
        m14035o0 = C9553r.m14035o0(m14075C0, attribute);
        return f19622k.m21198g(m14035o0);
    }

    /* renamed from: s */
    public final C7226c1 m21200s(AbstractC7218a1<?> attribute) {
        C9612q.m13917h(attribute, "attribute");
        if (isEmpty()) {
            return this;
        }
        AbstractC11127c<AbstractC7218a1<?>> mo9114a = mo9114a();
        ArrayList arrayList = new ArrayList();
        for (AbstractC7218a1<?> abstractC7218a1 : mo9114a) {
            if (!C9612q.m13922c(abstractC7218a1, attribute)) {
                arrayList.add(abstractC7218a1);
            }
        }
        if (arrayList.size() == mo9114a().mo9100a()) {
            return this;
        }
        return f19622k.m21198g(arrayList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C7226c1(p142hi.AbstractC7218a1<?> r1) {
        /*
            r0 = this;
            java.util.List r1 = kotlin.collections.C9543h.m14153d(r1)
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p142hi.C7226c1.<init>(hi.a1):void");
    }
}