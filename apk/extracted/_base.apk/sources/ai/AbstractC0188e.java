package ai;

import ai.InterfaceC0200k;
import gi.C6820m;
import gi.InterfaceC6815i;
import gi.InterfaceC6821n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C9545j;
import kotlin.collections.C9550o;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9584c0;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KProperty;
import p142hi.AbstractC7264g0;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC11998y;
import p305qg.InterfaceC12005z0;
import p327ri.C12242a;
import p327ri.C12258e;
import p448yg.InterfaceC14020b;
import ph.C11638f;
import th.AbstractC12764i;
import th.C12766k;

/* renamed from: ai.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC0188e extends AbstractC0198i {

    /* renamed from: d */
    static final /* synthetic */ KProperty<Object>[] f636d = {C9591f0.m13964g(new C9584c0(C9591f0.m13969b(AbstractC0188e.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};

    /* renamed from: b */
    private final InterfaceC11914e f637b;

    /* renamed from: c */
    private final InterfaceC6815i f638c;

    /* renamed from: ai.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C0189a extends AbstractC9614s implements Function0<List<? extends InterfaceC11947m>> {
        C0189a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends InterfaceC11947m> invoke() {
            List<? extends InterfaceC11947m> m14036n0;
            List<InterfaceC11998y> mo7570i = AbstractC0188e.this.mo7570i();
            m14036n0 = C9553r.m14036n0(mo7570i, AbstractC0188e.this.m40978j(mo7570i));
            return m14036n0;
        }
    }

    /* renamed from: ai.e$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C0190b extends AbstractC12764i {

        /* renamed from: a */
        final /* synthetic */ ArrayList<InterfaceC11947m> f640a;

        /* renamed from: b */
        final /* synthetic */ AbstractC0188e f641b;

        C0190b(ArrayList<InterfaceC11947m> arrayList, AbstractC0188e abstractC0188e) {
            this.f640a = arrayList;
            this.f641b = abstractC0188e;
        }

        @Override // th.AbstractC12765j
        /* renamed from: a */
        public void mo4076a(InterfaceC11902b fakeOverride) {
            C9612q.m13917h(fakeOverride, "fakeOverride");
            C12766k.m4062K(fakeOverride, null);
            this.f640a.add(fakeOverride);
        }

        @Override // th.AbstractC12764i
        /* renamed from: e */
        protected void mo4077e(InterfaceC11902b fromSuper, InterfaceC11902b fromCurrent) {
            C9612q.m13917h(fromSuper, "fromSuper");
            C9612q.m13917h(fromCurrent, "fromCurrent");
            throw new IllegalStateException(("Conflict in scope of " + this.f641b.m40976l() + ": " + fromSuper + " vs " + fromCurrent).toString());
        }
    }

    public AbstractC0188e(InterfaceC6821n storageManager, InterfaceC11914e containingClass) {
        C9612q.m13917h(storageManager, "storageManager");
        C9612q.m13917h(containingClass, "containingClass");
        this.f637b = containingClass;
        this.f638c = storageManager.mo21867c(new C0189a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public final List<InterfaceC11947m> m40978j(List<? extends InterfaceC11998y> list) {
        Collection<? extends InterfaceC11902b> m14104i;
        ArrayList arrayList = new ArrayList(3);
        Collection<AbstractC7264g0> mo2791m = this.f637b.mo4173k().mo2791m();
        C9612q.m13918g(mo2791m, "containingClass.typeConstructor.supertypes");
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC7264g0 abstractC7264g0 : mo2791m) {
            C9550o.m14085y(arrayList2, InterfaceC0200k.C0201a.m40970a(abstractC7264g0.mo3553o(), null, null, 3, null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (obj instanceof InterfaceC11902b) {
                arrayList3.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList3) {
            C11638f name = ((InterfaceC11902b) obj2).getName();
            Object obj3 = linkedHashMap.get(name);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap.put(name, obj3);
            }
            ((List) obj3).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C11638f c11638f = (C11638f) entry.getKey();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj4 : (List) entry.getValue()) {
                Boolean valueOf = Boolean.valueOf(((InterfaceC11902b) obj4) instanceof InterfaceC11998y);
                Object obj5 = linkedHashMap2.get(valueOf);
                if (obj5 == null) {
                    obj5 = new ArrayList();
                    linkedHashMap2.put(valueOf, obj5);
                }
                ((List) obj5).add(obj4);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean booleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list2 = (List) entry2.getValue();
                C12766k c12766k = C12766k.f33113f;
                if (booleanValue) {
                    m14104i = new ArrayList<>();
                    for (Object obj6 : list) {
                        if (C9612q.m13922c(((InterfaceC11998y) obj6).getName(), c11638f)) {
                            m14104i.add(obj6);
                        }
                    }
                } else {
                    m14104i = C9545j.m14104i();
                }
                c12766k.m4039v(c11638f, list2, m14104i, this.f637b, new C0190b(arrayList, this));
            }
        }
        return C12242a.m5673c(arrayList);
    }

    /* renamed from: k */
    private final List<InterfaceC11947m> m40977k() {
        return (List) C6820m.m21871a(this.f638c, this, f636d[0]);
    }

    @Override // ai.AbstractC0198i, ai.InterfaceC0194h
    /* renamed from: a */
    public Collection<InterfaceC12005z0> mo4362a(C11638f name, InterfaceC14020b location) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        List<InterfaceC11947m> m40977k = m40977k();
        C12258e c12258e = new C12258e();
        for (Object obj : m40977k) {
            if ((obj instanceof InterfaceC12005z0) && C9612q.m13922c(((InterfaceC12005z0) obj).getName(), name)) {
                c12258e.add(obj);
            }
        }
        return c12258e;
    }

    @Override // ai.AbstractC0198i, ai.InterfaceC0194h
    /* renamed from: c */
    public Collection<InterfaceC11989u0> mo4360c(C11638f name, InterfaceC14020b location) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        List<InterfaceC11947m> m40977k = m40977k();
        C12258e c12258e = new C12258e();
        for (Object obj : m40977k) {
            if ((obj instanceof InterfaceC11989u0) && C9612q.m13922c(((InterfaceC11989u0) obj).getName(), name)) {
                c12258e.add(obj);
            }
        }
        return c12258e;
    }

    @Override // ai.AbstractC0198i, ai.InterfaceC0200k
    /* renamed from: e */
    public Collection<InterfaceC11947m> mo4358e(C0185d kindFilter, Function1<? super C11638f, Boolean> nameFilter) {
        List m14104i;
        C9612q.m13917h(kindFilter, "kindFilter");
        C9612q.m13917h(nameFilter, "nameFilter");
        if (!kindFilter.m41005a(C0185d.f621p.m40993m())) {
            m14104i = C9545j.m14104i();
            return m14104i;
        }
        return m40977k();
    }

    /* renamed from: i */
    protected abstract List<InterfaceC11998y> mo7570i();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public final InterfaceC11914e m40976l() {
        return this.f637b;
    }
}
