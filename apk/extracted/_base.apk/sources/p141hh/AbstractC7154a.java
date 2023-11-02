package p141hh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C9538f;
import kotlin.collections.C9546k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import li.InterfaceC10198g;
import li.InterfaceC10200i;
import li.InterfaceC10201j;
import li.InterfaceC10204m;
import li.InterfaceC10205n;
import li.InterfaceC10206o;
import li.InterfaceC10207p;
import p468zg.AbstractC14203a;
import p468zg.C14265y;
import p468zg.EnumC14207b;
import pg.C11599c;
import ph.C11634d;

/* renamed from: hh.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class AbstractC7154a<TAnnotation> {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hh.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C7155a {

        /* renamed from: a */
        private final InterfaceC10200i f19514a;

        /* renamed from: b */
        private final C14265y f19515b;

        /* renamed from: c */
        private final InterfaceC10206o f19516c;

        public C7155a(InterfaceC10200i interfaceC10200i, C14265y c14265y, InterfaceC10206o interfaceC10206o) {
            this.f19514a = interfaceC10200i;
            this.f19515b = c14265y;
            this.f19516c = interfaceC10206o;
        }

        /* renamed from: a */
        public final C14265y m21352a() {
            return this.f19515b;
        }

        /* renamed from: b */
        public final InterfaceC10200i m21351b() {
            return this.f19514a;
        }

        /* renamed from: c */
        public final InterfaceC10206o m21350c() {
            return this.f19516c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hh.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C7156b extends AbstractC9614s implements Function1<Integer, C7164e> {

        /* renamed from: j */
        final /* synthetic */ C7212q f19517j;

        /* renamed from: k */
        final /* synthetic */ C7164e[] f19518k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7156b(C7212q c7212q, C7164e[] c7164eArr) {
            super(1);
            this.f19517j = c7212q;
            this.f19518k = c7164eArr;
        }

        /* renamed from: a */
        public final C7164e m21349a(int i) {
            int m14239I;
            Map<Integer, C7164e> m21238a;
            C7164e c7164e;
            C7212q c7212q = this.f19517j;
            if (c7212q == null || (m21238a = c7212q.m21238a()) == null || (c7164e = m21238a.get(Integer.valueOf(i))) == null) {
                C7164e[] c7164eArr = this.f19518k;
                if (i >= 0) {
                    m14239I = C9538f.m14239I(c7164eArr);
                    if (i <= m14239I) {
                        return c7164eArr[i];
                    }
                }
                return C7164e.f19530e.m21329a();
            }
            return c7164e;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C7164e invoke(Integer num) {
            return m21349a(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hh.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C7157c extends AbstractC9614s implements Function1<TAnnotation, Boolean> {

        /* renamed from: j */
        final /* synthetic */ AbstractC7154a<TAnnotation> f19519j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7157c(AbstractC7154a<TAnnotation> abstractC7154a) {
            super(1);
            this.f19519j = abstractC7154a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(TAnnotation extractNullability) {
            C9612q.m13917h(extractNullability, "$this$extractNullability");
            return Boolean.valueOf(this.f19519j.mo21248r(extractNullability));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hh.a$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C7158d extends AbstractC9614s implements Function1<C7155a, Iterable<? extends C7155a>> {

        /* renamed from: j */
        final /* synthetic */ AbstractC7154a<TAnnotation> f19520j;

        /* renamed from: k */
        final /* synthetic */ InterfaceC10207p f19521k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7158d(AbstractC7154a<TAnnotation> abstractC7154a, InterfaceC10207p interfaceC10207p) {
            super(1);
            this.f19520j = abstractC7154a;
            this.f19521k = interfaceC10207p;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Iterable<C7155a> invoke(C7155a it) {
            InterfaceC10205n mo3950s;
            List<InterfaceC10206o> mo3979d0;
            int m14093t;
            int m14093t2;
            C7155a c7155a;
            InterfaceC10201j interfaceC10201j;
            InterfaceC10198g mo4002K;
            C9612q.m13917h(it, "it");
            if (this.f19520j.mo21246u()) {
                InterfaceC10200i m21351b = it.m21351b();
                if (m21351b != null && (mo4002K = this.f19521k.mo4002K(m21351b)) != null) {
                    interfaceC10201j = this.f19521k.mo3962m(mo4002K);
                } else {
                    interfaceC10201j = null;
                }
                if (interfaceC10201j != null) {
                    return null;
                }
            }
            InterfaceC10200i m21351b2 = it.m21351b();
            if (m21351b2 == null || (mo3950s = this.f19521k.mo3950s(m21351b2)) == null || (mo3979d0 = this.f19521k.mo3979d0(mo3950s)) == null) {
                return null;
            }
            List<InterfaceC10204m> mo3990W = this.f19521k.mo3990W(it.m21351b());
            InterfaceC10207p interfaceC10207p = this.f19521k;
            AbstractC7154a<TAnnotation> abstractC7154a = this.f19520j;
            Iterator<T> it2 = mo3979d0.iterator();
            Iterator<T> it3 = mo3990W.iterator();
            m14093t = C9546k.m14093t(mo3979d0, 10);
            m14093t2 = C9546k.m14093t(mo3990W, 10);
            ArrayList arrayList = new ArrayList(Math.min(m14093t, m14093t2));
            while (it2.hasNext() && it3.hasNext()) {
                Object next = it2.next();
                InterfaceC10204m interfaceC10204m = (InterfaceC10204m) it3.next();
                InterfaceC10206o interfaceC10206o = (InterfaceC10206o) next;
                if (interfaceC10207p.mo3971h0(interfaceC10204m)) {
                    c7155a = new C7155a(null, it.m21352a(), interfaceC10206o);
                } else {
                    InterfaceC10200i mo3958o = interfaceC10207p.mo3958o(interfaceC10204m);
                    c7155a = new C7155a(mo3958o, abstractC7154a.m21360c(mo3958o, it.m21352a()), interfaceC10206o);
                }
                arrayList.add(c7155a);
            }
            return arrayList;
        }
    }

    /* renamed from: B */
    private final C7169i m21364B(C7169i c7169i, C7169i c7169i2) {
        if (c7169i == null) {
            return c7169i2;
        }
        if (c7169i2 == null) {
            return c7169i;
        }
        if (c7169i.m21320d() && !c7169i2.m21320d()) {
            return c7169i2;
        }
        if (!c7169i.m21320d() && c7169i2.m21320d()) {
            return c7169i;
        }
        if (c7169i.m21321c().compareTo(c7169i2.m21321c()) < 0) {
            return c7169i2;
        }
        if (c7169i.m21321c().compareTo(c7169i2.m21321c()) > 0) {
            return c7169i;
        }
        return c7169i2;
    }

    /* renamed from: C */
    private final List<C7155a> m21363C(InterfaceC10200i interfaceC10200i) {
        return m21357f(new C7155a(interfaceC10200i, m21360c(interfaceC10200i, mo21252m()), null), new C7158d(this, mo21245v()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final C14265y m21360c(InterfaceC10200i interfaceC10200i, C14265y c14265y) {
        return mo21256h().m467c(c14265y, mo21255i(interfaceC10200i));
    }

    /* renamed from: d */
    private final C7164e m21359d(InterfaceC10200i interfaceC10200i) {
        EnumC7168h enumC7168h;
        boolean z;
        EnumC7168h m21353t = m21353t(interfaceC10200i);
        EnumC7166f enumC7166f = null;
        if (m21353t == null) {
            InterfaceC10200i mo21249p = mo21249p(interfaceC10200i);
            if (mo21249p != null) {
                enumC7168h = m21353t(mo21249p);
            } else {
                enumC7168h = null;
            }
        } else {
            enumC7168h = m21353t;
        }
        InterfaceC10207p mo21245v = mo21245v();
        C11599c c11599c = C11599c.f30110a;
        if (c11599c.m7553l(mo21247s(mo21245v.mo3935z0(interfaceC10200i)))) {
            enumC7166f = EnumC7166f.READ_ONLY;
        } else if (c11599c.m7554k(mo21247s(mo21245v.mo4013E(interfaceC10200i)))) {
            enumC7166f = EnumC7166f.MUTABLE;
        }
        boolean z2 = false;
        if (!mo21245v().mo3994S(interfaceC10200i) && !mo21261A(interfaceC10200i)) {
            z = false;
        } else {
            z = true;
        }
        if (enumC7168h != m21353t) {
            z2 = true;
        }
        return new C7164e(enumC7168h, enumC7166f, z, z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x012a, code lost:
        if (r0 != false) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0154  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final p141hh.C7164e m21358e(p141hh.AbstractC7154a.C7155a r12) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p141hh.AbstractC7154a.m21358e(hh.a$a):hh.e");
    }

    /* renamed from: f */
    private final <T> List<T> m21357f(T t, Function1<? super T, ? extends Iterable<? extends T>> function1) {
        ArrayList arrayList = new ArrayList(1);
        m21356g(t, arrayList, function1);
        return arrayList;
    }

    /* renamed from: g */
    private final <T> void m21356g(T t, List<T> list, Function1<? super T, ? extends Iterable<? extends T>> function1) {
        list.add(t);
        Iterable<? extends T> invoke = function1.invoke(t);
        if (invoke != null) {
            for (T t2 : invoke) {
                m21356g(t2, list, function1);
            }
        }
    }

    /* renamed from: j */
    private final C7169i m21355j(InterfaceC10206o interfaceC10206o) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        List<InterfaceC10200i> arrayList;
        boolean z6;
        EnumC7168h enumC7168h;
        InterfaceC10207p mo21245v = mo21245v();
        C7169i c7169i = null;
        if (!mo21241z(interfaceC10206o)) {
            return null;
        }
        List<InterfaceC10200i> mo3975f0 = mo21245v.mo3975f0(interfaceC10206o);
        boolean z7 = mo3975f0 instanceof Collection;
        boolean z8 = false;
        if (!z7 || !mo3975f0.isEmpty()) {
            for (InterfaceC10200i interfaceC10200i : mo3975f0) {
                if (!mo21245v.mo3957o0(interfaceC10200i)) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return null;
        }
        if (!z7 || !mo3975f0.isEmpty()) {
            for (InterfaceC10200i interfaceC10200i2 : mo3975f0) {
                if (m21353t(interfaceC10200i2) != null) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    z3 = true;
                    break;
                }
            }
        }
        z3 = false;
        if (z3) {
            arrayList = mo3975f0;
        } else {
            if (!z7 || !mo3975f0.isEmpty()) {
                for (InterfaceC10200i interfaceC10200i3 : mo3975f0) {
                    if (mo21249p(interfaceC10200i3) != null) {
                        z4 = true;
                        continue;
                    } else {
                        z4 = false;
                        continue;
                    }
                    if (z4) {
                        z5 = true;
                        break;
                    }
                }
            }
            z5 = false;
            if (z5) {
                arrayList = new ArrayList<>();
                for (InterfaceC10200i interfaceC10200i4 : mo3975f0) {
                    InterfaceC10200i mo21249p = mo21249p(interfaceC10200i4);
                    if (mo21249p != null) {
                        arrayList.add(mo21249p);
                    }
                }
            }
            return c7169i;
        }
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            for (InterfaceC10200i interfaceC10200i5 : arrayList) {
                if (!mo21245v.mo3942w(interfaceC10200i5)) {
                    z6 = false;
                    break;
                }
            }
        }
        z6 = true;
        if (z6) {
            enumC7168h = EnumC7168h.NULLABLE;
        } else {
            enumC7168h = EnumC7168h.NOT_NULL;
        }
        if (arrayList != mo3975f0) {
            z8 = true;
        }
        c7169i = new C7169i(enumC7168h, z8);
        return c7169i;
    }

    /* renamed from: t */
    private final EnumC7168h m21353t(InterfaceC10200i interfaceC10200i) {
        InterfaceC10207p mo21245v = mo21245v();
        if (mo21245v.mo3941w0(mo21245v.mo3935z0(interfaceC10200i))) {
            return EnumC7168h.NULLABLE;
        }
        if (!mo21245v.mo3941w0(mo21245v.mo4013E(interfaceC10200i))) {
            return EnumC7168h.NOT_NULL;
        }
        return null;
    }

    /* renamed from: A */
    public abstract boolean mo21261A(InterfaceC10200i interfaceC10200i);

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
        if (r10 != false) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.jvm.functions.Function1<java.lang.Integer, p141hh.C7164e> m21361b(li.InterfaceC10200i r10, java.lang.Iterable<? extends li.InterfaceC10200i> r11, p141hh.C7212q r12, boolean r13) {
        /*
            r9 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C9612q.m13917h(r10, r0)
            java.lang.String r0 = "overrides"
            kotlin.jvm.internal.C9612q.m13917h(r11, r0)
            java.util.List r0 = r9.m21363C(r10)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.C9543h.m14124t(r11, r2)
            r1.<init>(r2)
            java.util.Iterator r2 = r11.iterator()
        L1d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L31
            java.lang.Object r3 = r2.next()
            li.i r3 = (li.InterfaceC10200i) r3
            java.util.List r3 = r9.m21363C(r3)
            r1.add(r3)
            goto L1d
        L31:
            boolean r2 = r9.m21354q()
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L6b
            boolean r2 = r9.mo21243x()
            if (r2 == 0) goto L69
            boolean r2 = r11 instanceof java.util.Collection
            if (r2 == 0) goto L4e
            r2 = r11
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L4e
        L4c:
            r10 = r3
            goto L66
        L4e:
            java.util.Iterator r11 = r11.iterator()
        L52:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L4c
            java.lang.Object r2 = r11.next()
            li.i r2 = (li.InterfaceC10200i) r2
            boolean r2 = r9.mo21242y(r10, r2)
            r2 = r2 ^ r4
            if (r2 == 0) goto L52
            r10 = r4
        L66:
            if (r10 == 0) goto L69
            goto L6b
        L69:
            r10 = r3
            goto L6c
        L6b:
            r10 = r4
        L6c:
            if (r10 == 0) goto L70
            r10 = r4
            goto L74
        L70:
            int r10 = r0.size()
        L74:
            hh.e[] r11 = new p141hh.C7164e[r10]
            r2 = r3
        L77:
            if (r2 >= r10) goto Ld1
            java.lang.Object r5 = r0.get(r2)
            hh.a$a r5 = (p141hh.AbstractC7154a.C7155a) r5
            hh.e r5 = r9.m21358e(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r1.iterator()
        L8c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lb2
            java.lang.Object r8 = r7.next()
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = kotlin.collections.C9543h.m14159W(r8, r2)
            hh.a$a r8 = (p141hh.AbstractC7154a.C7155a) r8
            if (r8 == 0) goto Lab
            li.i r8 = r8.m21351b()
            if (r8 == 0) goto Lab
            hh.e r8 = r9.m21359d(r8)
            goto Lac
        Lab:
            r8 = 0
        Lac:
            if (r8 == 0) goto L8c
            r6.add(r8)
            goto L8c
        Lb2:
            if (r2 != 0) goto Lbc
            boolean r7 = r9.mo21243x()
            if (r7 == 0) goto Lbc
            r7 = r4
            goto Lbd
        Lbc:
            r7 = r3
        Lbd:
            if (r2 != 0) goto Lc7
            boolean r8 = r9.mo21251n()
            if (r8 == 0) goto Lc7
            r8 = r4
            goto Lc8
        Lc7:
            r8 = r3
        Lc8:
            hh.e r5 = p141hh.C7215s.m21228a(r5, r6, r7, r8, r13)
            r11[r2] = r5
            int r2 = r2 + 1
            goto L77
        Ld1:
            hh.a$b r10 = new hh.a$b
            r10.<init>(r12, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p141hh.AbstractC7154a.m21361b(li.i, java.lang.Iterable, hh.q, boolean):kotlin.jvm.functions.Function1");
    }

    /* renamed from: h */
    public abstract AbstractC14203a<TAnnotation> mo21256h();

    /* renamed from: i */
    public abstract Iterable<TAnnotation> mo21255i(InterfaceC10200i interfaceC10200i);

    /* renamed from: k */
    public abstract Iterable<TAnnotation> mo21254k();

    /* renamed from: l */
    public abstract EnumC14207b mo21253l();

    /* renamed from: m */
    public abstract C14265y mo21252m();

    /* renamed from: n */
    public abstract boolean mo21251n();

    /* renamed from: o */
    public abstract boolean mo21250o();

    /* renamed from: p */
    public abstract InterfaceC10200i mo21249p(InterfaceC10200i interfaceC10200i);

    /* renamed from: q */
    public boolean m21354q() {
        return false;
    }

    /* renamed from: r */
    public abstract boolean mo21248r(TAnnotation tannotation);

    /* renamed from: s */
    public abstract C11634d mo21247s(InterfaceC10200i interfaceC10200i);

    /* renamed from: u */
    public abstract boolean mo21246u();

    /* renamed from: v */
    public abstract InterfaceC10207p mo21245v();

    /* renamed from: w */
    public abstract boolean mo21244w(InterfaceC10200i interfaceC10200i);

    /* renamed from: x */
    public abstract boolean mo21243x();

    /* renamed from: y */
    public abstract boolean mo21242y(InterfaceC10200i interfaceC10200i, InterfaceC10200i interfaceC10200i2);

    /* renamed from: z */
    public abstract boolean mo21241z(InterfaceC10206o interfaceC10206o);
}
