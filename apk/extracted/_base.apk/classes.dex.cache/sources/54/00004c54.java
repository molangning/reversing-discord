package p329s;

import androidx.constraintlayout.solver.widgets.C0654d;
import androidx.constraintlayout.solver.widgets.C0657e;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p309r.C12011b;
import p329s.C12319b;

/* renamed from: s.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C12324e {

    /* renamed from: a */
    private ConstraintWidgetContainer f32121a;

    /* renamed from: d */
    private ConstraintWidgetContainer f32124d;

    /* renamed from: b */
    private boolean f32122b = true;

    /* renamed from: c */
    private boolean f32123c = true;

    /* renamed from: e */
    private ArrayList<AbstractC12335m> f32125e = new ArrayList<>();

    /* renamed from: f */
    private ArrayList<C12332k> f32126f = new ArrayList<>();

    /* renamed from: g */
    private C12319b.InterfaceC12321b f32127g = null;

    /* renamed from: h */
    private C12319b.C12320a f32128h = new C12319b.C12320a();

    /* renamed from: i */
    ArrayList<C12332k> f32129i = new ArrayList<>();

    public C12324e(ConstraintWidgetContainer constraintWidgetContainer) {
        this.f32121a = constraintWidgetContainer;
        this.f32124d = constraintWidgetContainer;
    }

    /* renamed from: a */
    private void m5491a(C12325f c12325f, int i, int i2, C12325f c12325f2, ArrayList<C12332k> arrayList, C12332k c12332k) {
        AbstractC12335m abstractC12335m = c12325f.f32133d;
        if (abstractC12335m.f32167c == null) {
            ConstraintWidgetContainer constraintWidgetContainer = this.f32121a;
            if (abstractC12335m != constraintWidgetContainer.f2248e && abstractC12335m != constraintWidgetContainer.f2250f) {
                if (c12332k == null) {
                    c12332k = new C12332k(abstractC12335m, i2);
                    arrayList.add(c12332k);
                }
                abstractC12335m.f32167c = c12332k;
                c12332k.m5470a(abstractC12335m);
                for (InterfaceC12323d interfaceC12323d : abstractC12335m.f32172h.f32140k) {
                    if (interfaceC12323d instanceof C12325f) {
                        m5491a((C12325f) interfaceC12323d, i, 0, c12325f2, arrayList, c12332k);
                    }
                }
                for (InterfaceC12323d interfaceC12323d2 : abstractC12335m.f32173i.f32140k) {
                    if (interfaceC12323d2 instanceof C12325f) {
                        m5491a((C12325f) interfaceC12323d2, i, 1, c12325f2, arrayList, c12332k);
                    }
                }
                if (i == 1 && (abstractC12335m instanceof C12333l)) {
                    for (InterfaceC12323d interfaceC12323d3 : ((C12333l) abstractC12335m).f32162k.f32140k) {
                        if (interfaceC12323d3 instanceof C12325f) {
                            m5491a((C12325f) interfaceC12323d3, i, 2, c12325f2, arrayList, c12332k);
                        }
                    }
                }
                for (C12325f c12325f3 : abstractC12335m.f32172h.f32141l) {
                    if (c12325f3 == c12325f2) {
                        c12332k.f32156b = true;
                    }
                    m5491a(c12325f3, i, 0, c12325f2, arrayList, c12332k);
                }
                for (C12325f c12325f4 : abstractC12335m.f32173i.f32141l) {
                    if (c12325f4 == c12325f2) {
                        c12332k.f32156b = true;
                    }
                    m5491a(c12325f4, i, 1, c12325f2, arrayList, c12332k);
                }
                if (i == 1 && (abstractC12335m instanceof C12333l)) {
                    for (C12325f c12325f5 : ((C12333l) abstractC12335m).f32162k.f32141l) {
                        m5491a(c12325f5, i, 2, c12325f2, arrayList, c12332k);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m5490b(ConstraintWidgetContainer constraintWidgetContainer) {
        int i;
        ConstraintWidget.EnumC0650b enumC0650b;
        int i2;
        ConstraintWidget.EnumC0650b enumC0650b2;
        ConstraintWidget.EnumC0650b[] enumC0650bArr;
        ConstraintWidget.EnumC0650b enumC0650b3;
        ConstraintWidget.EnumC0650b enumC0650b4;
        ConstraintWidget.EnumC0650b enumC0650b5;
        ConstraintWidget.EnumC0650b enumC0650b6;
        Iterator<ConstraintWidget> it = constraintWidgetContainer.f31009w0.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            ConstraintWidget.EnumC0650b[] enumC0650bArr2 = next.f2226M;
            ConstraintWidget.EnumC0650b enumC0650b7 = enumC0650bArr2[0];
            ConstraintWidget.EnumC0650b enumC0650b8 = enumC0650bArr2[1];
            if (next.m39416M() == 8) {
                next.f2240a = true;
            } else {
                if (next.f2272q < 1.0f && enumC0650b7 == ConstraintWidget.EnumC0650b.MATCH_CONSTRAINT) {
                    next.f2262l = 2;
                }
                if (next.f2278t < 1.0f && enumC0650b8 == ConstraintWidget.EnumC0650b.MATCH_CONSTRAINT) {
                    next.f2264m = 2;
                }
                if (next.m39376r() > 0.0f) {
                    ConstraintWidget.EnumC0650b enumC0650b9 = ConstraintWidget.EnumC0650b.MATCH_CONSTRAINT;
                    if (enumC0650b7 == enumC0650b9 && (enumC0650b8 == ConstraintWidget.EnumC0650b.WRAP_CONTENT || enumC0650b8 == ConstraintWidget.EnumC0650b.FIXED)) {
                        next.f2262l = 3;
                    } else if (enumC0650b8 == enumC0650b9 && (enumC0650b7 == ConstraintWidget.EnumC0650b.WRAP_CONTENT || enumC0650b7 == ConstraintWidget.EnumC0650b.FIXED)) {
                        next.f2264m = 3;
                    } else if (enumC0650b7 == enumC0650b9 && enumC0650b8 == enumC0650b9) {
                        if (next.f2262l == 0) {
                            next.f2262l = 3;
                        }
                        if (next.f2264m == 0) {
                            next.f2264m = 3;
                        }
                    }
                }
                ConstraintWidget.EnumC0650b enumC0650b10 = ConstraintWidget.EnumC0650b.MATCH_CONSTRAINT;
                if (enumC0650b7 == enumC0650b10 && next.f2262l == 1 && (next.f2215B.f2346d == null || next.f2217D.f2346d == null)) {
                    enumC0650b7 = ConstraintWidget.EnumC0650b.WRAP_CONTENT;
                }
                ConstraintWidget.EnumC0650b enumC0650b11 = enumC0650b7;
                if (enumC0650b8 == enumC0650b10 && next.f2264m == 1 && (next.f2216C.f2346d == null || next.f2218E.f2346d == null)) {
                    enumC0650b8 = ConstraintWidget.EnumC0650b.WRAP_CONTENT;
                }
                ConstraintWidget.EnumC0650b enumC0650b12 = enumC0650b8;
                C12330j c12330j = next.f2248e;
                c12330j.f32168d = enumC0650b11;
                int i3 = next.f2262l;
                c12330j.f32165a = i3;
                C12333l c12333l = next.f2250f;
                c12333l.f32168d = enumC0650b12;
                int i4 = next.f2264m;
                c12333l.f32165a = i4;
                ConstraintWidget.EnumC0650b enumC0650b13 = ConstraintWidget.EnumC0650b.MATCH_PARENT;
                if ((enumC0650b11 != enumC0650b13 && enumC0650b11 != ConstraintWidget.EnumC0650b.FIXED && enumC0650b11 != ConstraintWidget.EnumC0650b.WRAP_CONTENT) || (enumC0650b12 != enumC0650b13 && enumC0650b12 != ConstraintWidget.EnumC0650b.FIXED && enumC0650b12 != ConstraintWidget.EnumC0650b.WRAP_CONTENT)) {
                    if (enumC0650b11 == enumC0650b10 && (enumC0650b12 == (enumC0650b6 = ConstraintWidget.EnumC0650b.WRAP_CONTENT) || enumC0650b12 == ConstraintWidget.EnumC0650b.FIXED)) {
                        if (i3 == 3) {
                            if (enumC0650b12 == enumC0650b6) {
                                m5480l(next, enumC0650b6, 0, enumC0650b6, 0);
                            }
                            int m39372t = next.m39372t();
                            ConstraintWidget.EnumC0650b enumC0650b14 = ConstraintWidget.EnumC0650b.FIXED;
                            m5480l(next, enumC0650b14, (int) ((m39372t * next.f2230Q) + 0.5f), enumC0650b14, m39372t);
                            next.f2248e.f32169e.mo5475d(next.m39415N());
                            next.f2250f.f32169e.mo5475d(next.m39372t());
                            next.f2240a = true;
                        } else if (i3 == 1) {
                            m5480l(next, enumC0650b6, 0, enumC0650b12, 0);
                            next.f2248e.f32169e.f32151m = next.m39415N();
                        } else if (i3 == 2) {
                            ConstraintWidget.EnumC0650b enumC0650b15 = constraintWidgetContainer.f2226M[0];
                            ConstraintWidget.EnumC0650b enumC0650b16 = ConstraintWidget.EnumC0650b.FIXED;
                            if (enumC0650b15 == enumC0650b16 || enumC0650b15 == enumC0650b13) {
                                m5480l(next, enumC0650b16, (int) ((next.f2272q * constraintWidgetContainer.m39415N()) + 0.5f), enumC0650b12, next.m39372t());
                                next.f2248e.f32169e.mo5475d(next.m39415N());
                                next.f2250f.f32169e.mo5475d(next.m39372t());
                                next.f2240a = true;
                            }
                        } else {
                            C0654d[] c0654dArr = next.f2223J;
                            if (c0654dArr[0].f2346d == null || c0654dArr[1].f2346d == null) {
                                m5480l(next, enumC0650b6, 0, enumC0650b12, 0);
                                next.f2248e.f32169e.mo5475d(next.m39415N());
                                next.f2250f.f32169e.mo5475d(next.m39372t());
                                next.f2240a = true;
                            }
                        }
                    }
                    if (enumC0650b12 == enumC0650b10 && (enumC0650b11 == (enumC0650b5 = ConstraintWidget.EnumC0650b.WRAP_CONTENT) || enumC0650b11 == ConstraintWidget.EnumC0650b.FIXED)) {
                        if (i4 == 3) {
                            if (enumC0650b11 == enumC0650b5) {
                                m5480l(next, enumC0650b5, 0, enumC0650b5, 0);
                            }
                            int m39415N = next.m39415N();
                            float f = next.f2230Q;
                            if (next.m39374s() == -1) {
                                f = 1.0f / f;
                            }
                            ConstraintWidget.EnumC0650b enumC0650b17 = ConstraintWidget.EnumC0650b.FIXED;
                            m5480l(next, enumC0650b17, m39415N, enumC0650b17, (int) ((m39415N * f) + 0.5f));
                            next.f2248e.f32169e.mo5475d(next.m39415N());
                            next.f2250f.f32169e.mo5475d(next.m39372t());
                            next.f2240a = true;
                        } else if (i4 == 1) {
                            m5480l(next, enumC0650b11, 0, enumC0650b5, 0);
                            next.f2250f.f32169e.f32151m = next.m39372t();
                        } else if (i4 == 2) {
                            ConstraintWidget.EnumC0650b enumC0650b18 = constraintWidgetContainer.f2226M[1];
                            ConstraintWidget.EnumC0650b enumC0650b19 = ConstraintWidget.EnumC0650b.FIXED;
                            if (enumC0650b18 == enumC0650b19 || enumC0650b18 == enumC0650b13) {
                                m5480l(next, enumC0650b11, next.m39415N(), enumC0650b19, (int) ((next.f2278t * constraintWidgetContainer.m39372t()) + 0.5f));
                                next.f2248e.f32169e.mo5475d(next.m39415N());
                                next.f2250f.f32169e.mo5475d(next.m39372t());
                                next.f2240a = true;
                            }
                        } else {
                            C0654d[] c0654dArr2 = next.f2223J;
                            if (c0654dArr2[2].f2346d == null || c0654dArr2[3].f2346d == null) {
                                m5480l(next, enumC0650b5, 0, enumC0650b12, 0);
                                next.f2248e.f32169e.mo5475d(next.m39415N());
                                next.f2250f.f32169e.mo5475d(next.m39372t());
                                next.f2240a = true;
                            }
                        }
                    }
                    if (enumC0650b11 == enumC0650b10 && enumC0650b12 == enumC0650b10) {
                        if (i3 != 1 && i4 != 1) {
                            if (i4 == 2 && i3 == 2 && ((enumC0650b3 = (enumC0650bArr = constraintWidgetContainer.f2226M)[0]) == (enumC0650b4 = ConstraintWidget.EnumC0650b.FIXED) || enumC0650b3 == enumC0650b4)) {
                                ConstraintWidget.EnumC0650b enumC0650b20 = enumC0650bArr[1];
                                if (enumC0650b20 == enumC0650b4 || enumC0650b20 == enumC0650b4) {
                                    m5480l(next, enumC0650b4, (int) ((next.f2272q * constraintWidgetContainer.m39415N()) + 0.5f), enumC0650b4, (int) ((next.f2278t * constraintWidgetContainer.m39372t()) + 0.5f));
                                    next.f2248e.f32169e.mo5475d(next.m39415N());
                                    next.f2250f.f32169e.mo5475d(next.m39372t());
                                    next.f2240a = true;
                                }
                            }
                        } else {
                            ConstraintWidget.EnumC0650b enumC0650b21 = ConstraintWidget.EnumC0650b.WRAP_CONTENT;
                            m5480l(next, enumC0650b21, 0, enumC0650b21, 0);
                            next.f2248e.f32169e.f32151m = next.m39415N();
                            next.f2250f.f32169e.f32151m = next.m39372t();
                        }
                    }
                } else {
                    int m39415N2 = next.m39415N();
                    if (enumC0650b11 == enumC0650b13) {
                        i = (constraintWidgetContainer.m39415N() - next.f2215B.f2347e) - next.f2217D.f2347e;
                        enumC0650b = ConstraintWidget.EnumC0650b.FIXED;
                    } else {
                        i = m39415N2;
                        enumC0650b = enumC0650b11;
                    }
                    int m39372t2 = next.m39372t();
                    if (enumC0650b12 == enumC0650b13) {
                        i2 = (constraintWidgetContainer.m39372t() - next.f2216C.f2347e) - next.f2218E.f2347e;
                        enumC0650b2 = ConstraintWidget.EnumC0650b.FIXED;
                    } else {
                        i2 = m39372t2;
                        enumC0650b2 = enumC0650b12;
                    }
                    m5480l(next, enumC0650b, i, enumC0650b2, i2);
                    next.f2248e.f32169e.mo5475d(next.m39415N());
                    next.f2250f.f32169e.mo5475d(next.m39372t());
                    next.f2240a = true;
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    private int m5487e(ConstraintWidgetContainer constraintWidgetContainer, int i) {
        int size = this.f32129i.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, this.f32129i.get(i2).m5469b(constraintWidgetContainer, i));
        }
        return (int) j;
    }

    /* renamed from: i */
    private void m5483i(AbstractC12335m abstractC12335m, int i, ArrayList<C12332k> arrayList) {
        for (InterfaceC12323d interfaceC12323d : abstractC12335m.f32172h.f32140k) {
            if (interfaceC12323d instanceof C12325f) {
                m5491a((C12325f) interfaceC12323d, i, 0, abstractC12335m.f32173i, arrayList, null);
            } else if (interfaceC12323d instanceof AbstractC12335m) {
                m5491a(((AbstractC12335m) interfaceC12323d).f32172h, i, 0, abstractC12335m.f32173i, arrayList, null);
            }
        }
        for (InterfaceC12323d interfaceC12323d2 : abstractC12335m.f32173i.f32140k) {
            if (interfaceC12323d2 instanceof C12325f) {
                m5491a((C12325f) interfaceC12323d2, i, 1, abstractC12335m.f32172h, arrayList, null);
            } else if (interfaceC12323d2 instanceof AbstractC12335m) {
                m5491a(((AbstractC12335m) interfaceC12323d2).f32173i, i, 1, abstractC12335m.f32172h, arrayList, null);
            }
        }
        if (i == 1) {
            for (InterfaceC12323d interfaceC12323d3 : ((C12333l) abstractC12335m).f32162k.f32140k) {
                if (interfaceC12323d3 instanceof C12325f) {
                    m5491a((C12325f) interfaceC12323d3, i, 2, null, arrayList, null);
                }
            }
        }
    }

    /* renamed from: l */
    private void m5480l(ConstraintWidget constraintWidget, ConstraintWidget.EnumC0650b enumC0650b, int i, ConstraintWidget.EnumC0650b enumC0650b2, int i2) {
        C12319b.C12320a c12320a = this.f32128h;
        c12320a.f32109a = enumC0650b;
        c12320a.f32110b = enumC0650b2;
        c12320a.f32111c = i;
        c12320a.f32112d = i2;
        this.f32127g.mo5495b(constraintWidget, c12320a);
        constraintWidget.m39430B0(this.f32128h.f32113e);
        constraintWidget.m39398e0(this.f32128h.f32114f);
        constraintWidget.m39400d0(this.f32128h.f32116h);
        constraintWidget.m39406Y(this.f32128h.f32115g);
    }

    /* renamed from: c */
    public void m5489c() {
        m5488d(this.f32125e);
        this.f32129i.clear();
        C12332k.f32154h = 0;
        m5483i(this.f32121a.f2248e, 0, this.f32129i);
        m5483i(this.f32121a.f2250f, 1, this.f32129i);
        this.f32122b = false;
    }

    /* renamed from: d */
    public void m5488d(ArrayList<AbstractC12335m> arrayList) {
        arrayList.clear();
        this.f32124d.f2248e.mo5460f();
        this.f32124d.f2250f.mo5460f();
        arrayList.add(this.f32124d.f2248e);
        arrayList.add(this.f32124d.f2250f);
        Iterator<ConstraintWidget> it = this.f32124d.f31009w0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (next instanceof C0657e) {
                arrayList.add(new C12328h(next));
            } else {
                if (next.m39409T()) {
                    if (next.f2244c == null) {
                        next.f2244c = new C12322c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f2244c);
                } else {
                    arrayList.add(next.f2248e);
                }
                if (next.m39407V()) {
                    if (next.f2246d == null) {
                        next.f2246d = new C12322c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f2246d);
                } else {
                    arrayList.add(next.f2250f);
                }
                if (next instanceof C12011b) {
                    arrayList.add(new C12329i(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<AbstractC12335m> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().mo5460f();
        }
        Iterator<AbstractC12335m> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC12335m next2 = it3.next();
            if (next2.f32166b != this.f32124d) {
                next2.mo5462d();
            }
        }
    }

    /* renamed from: f */
    public boolean m5486f(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.f32122b || this.f32123c) {
            Iterator<ConstraintWidget> it = this.f32121a.f31009w0.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.f2240a = false;
                next.f2248e.m5471r();
                next.f2250f.m5466q();
            }
            ConstraintWidgetContainer constraintWidgetContainer = this.f32121a;
            constraintWidgetContainer.f2240a = false;
            constraintWidgetContainer.f2248e.m5471r();
            this.f32121a.f2250f.m5466q();
            this.f32123c = false;
        }
        if (m5490b(this.f32124d)) {
            return false;
        }
        this.f32121a.m39428C0(0);
        this.f32121a.m39426D0(0);
        ConstraintWidget.EnumC0650b m39378q = this.f32121a.m39378q(0);
        ConstraintWidget.EnumC0650b m39378q2 = this.f32121a.m39378q(1);
        if (this.f32122b) {
            m5489c();
        }
        int m39414O = this.f32121a.m39414O();
        int m39413P = this.f32121a.m39413P();
        this.f32121a.f2248e.f32172h.mo5475d(m39414O);
        this.f32121a.f2250f.f32172h.mo5475d(m39413P);
        m5479m();
        ConstraintWidget.EnumC0650b enumC0650b = ConstraintWidget.EnumC0650b.WRAP_CONTENT;
        if (m39378q == enumC0650b || m39378q2 == enumC0650b) {
            if (z4) {
                Iterator<AbstractC12335m> it2 = this.f32125e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (!it2.next().mo5453m()) {
                        z4 = false;
                        break;
                    }
                }
            }
            if (z4 && m39378q == ConstraintWidget.EnumC0650b.WRAP_CONTENT) {
                this.f32121a.m39392i0(ConstraintWidget.EnumC0650b.FIXED);
                ConstraintWidgetContainer constraintWidgetContainer2 = this.f32121a;
                constraintWidgetContainer2.m39430B0(m5487e(constraintWidgetContainer2, 0));
                ConstraintWidgetContainer constraintWidgetContainer3 = this.f32121a;
                constraintWidgetContainer3.f2248e.f32169e.mo5475d(constraintWidgetContainer3.m39415N());
            }
            if (z4 && m39378q2 == ConstraintWidget.EnumC0650b.WRAP_CONTENT) {
                this.f32121a.m39363x0(ConstraintWidget.EnumC0650b.FIXED);
                ConstraintWidgetContainer constraintWidgetContainer4 = this.f32121a;
                constraintWidgetContainer4.m39398e0(m5487e(constraintWidgetContainer4, 1));
                ConstraintWidgetContainer constraintWidgetContainer5 = this.f32121a;
                constraintWidgetContainer5.f2250f.f32169e.mo5475d(constraintWidgetContainer5.m39372t());
            }
        }
        ConstraintWidgetContainer constraintWidgetContainer6 = this.f32121a;
        ConstraintWidget.EnumC0650b enumC0650b2 = constraintWidgetContainer6.f2226M[0];
        ConstraintWidget.EnumC0650b enumC0650b3 = ConstraintWidget.EnumC0650b.FIXED;
        if (enumC0650b2 != enumC0650b3 && enumC0650b2 != ConstraintWidget.EnumC0650b.MATCH_PARENT) {
            z2 = false;
        } else {
            int m39415N = constraintWidgetContainer6.m39415N() + m39414O;
            this.f32121a.f2248e.f32173i.mo5475d(m39415N);
            this.f32121a.f2248e.f32169e.mo5475d(m39415N - m39414O);
            m5479m();
            ConstraintWidgetContainer constraintWidgetContainer7 = this.f32121a;
            ConstraintWidget.EnumC0650b enumC0650b4 = constraintWidgetContainer7.f2226M[1];
            if (enumC0650b4 == enumC0650b3 || enumC0650b4 == ConstraintWidget.EnumC0650b.MATCH_PARENT) {
                int m39372t = constraintWidgetContainer7.m39372t() + m39413P;
                this.f32121a.f2250f.f32173i.mo5475d(m39372t);
                this.f32121a.f2250f.f32169e.mo5475d(m39372t - m39413P);
            }
            m5479m();
            z2 = true;
        }
        Iterator<AbstractC12335m> it3 = this.f32125e.iterator();
        while (it3.hasNext()) {
            AbstractC12335m next2 = it3.next();
            if (next2.f32166b != this.f32121a || next2.f32171g) {
                next2.mo5461e();
            }
        }
        Iterator<AbstractC12335m> it4 = this.f32125e.iterator();
        while (it4.hasNext()) {
            AbstractC12335m next3 = it4.next();
            if (z2 || next3.f32166b != this.f32121a) {
                if (!next3.f32172h.f32139j || ((!next3.f32173i.f32139j && !(next3 instanceof C12328h)) || (!next3.f32169e.f32139j && !(next3 instanceof C12322c) && !(next3 instanceof C12328h)))) {
                    z3 = false;
                    break;
                }
            }
        }
        this.f32121a.m39392i0(m39378q);
        this.f32121a.m39363x0(m39378q2);
        return z3;
    }

    /* renamed from: g */
    public boolean m5485g(boolean z) {
        if (this.f32122b) {
            Iterator<ConstraintWidget> it = this.f32121a.f31009w0.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.f2240a = false;
                C12330j c12330j = next.f2248e;
                c12330j.f32169e.f32139j = false;
                c12330j.f32171g = false;
                c12330j.m5471r();
                C12333l c12333l = next.f2250f;
                c12333l.f32169e.f32139j = false;
                c12333l.f32171g = false;
                c12333l.m5466q();
            }
            ConstraintWidgetContainer constraintWidgetContainer = this.f32121a;
            constraintWidgetContainer.f2240a = false;
            C12330j c12330j2 = constraintWidgetContainer.f2248e;
            c12330j2.f32169e.f32139j = false;
            c12330j2.f32171g = false;
            c12330j2.m5471r();
            C12333l c12333l2 = this.f32121a.f2250f;
            c12333l2.f32169e.f32139j = false;
            c12333l2.f32171g = false;
            c12333l2.m5466q();
            m5489c();
        }
        if (m5490b(this.f32124d)) {
            return false;
        }
        this.f32121a.m39428C0(0);
        this.f32121a.m39426D0(0);
        this.f32121a.f2248e.f32172h.mo5475d(0);
        this.f32121a.f2250f.f32172h.mo5475d(0);
        return true;
    }

    /* renamed from: h */
    public boolean m5484h(boolean z, int i) {
        boolean z2;
        ConstraintWidget.EnumC0650b enumC0650b;
        boolean z3 = true;
        boolean z4 = z & true;
        ConstraintWidget.EnumC0650b m39378q = this.f32121a.m39378q(0);
        ConstraintWidget.EnumC0650b m39378q2 = this.f32121a.m39378q(1);
        int m39414O = this.f32121a.m39414O();
        int m39413P = this.f32121a.m39413P();
        if (z4 && (m39378q == (enumC0650b = ConstraintWidget.EnumC0650b.WRAP_CONTENT) || m39378q2 == enumC0650b)) {
            Iterator<AbstractC12335m> it = this.f32125e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC12335m next = it.next();
                if (next.f32170f == i && !next.mo5453m()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && m39378q == ConstraintWidget.EnumC0650b.WRAP_CONTENT) {
                    this.f32121a.m39392i0(ConstraintWidget.EnumC0650b.FIXED);
                    ConstraintWidgetContainer constraintWidgetContainer = this.f32121a;
                    constraintWidgetContainer.m39430B0(m5487e(constraintWidgetContainer, 0));
                    ConstraintWidgetContainer constraintWidgetContainer2 = this.f32121a;
                    constraintWidgetContainer2.f2248e.f32169e.mo5475d(constraintWidgetContainer2.m39415N());
                }
            } else if (z4 && m39378q2 == ConstraintWidget.EnumC0650b.WRAP_CONTENT) {
                this.f32121a.m39363x0(ConstraintWidget.EnumC0650b.FIXED);
                ConstraintWidgetContainer constraintWidgetContainer3 = this.f32121a;
                constraintWidgetContainer3.m39398e0(m5487e(constraintWidgetContainer3, 1));
                ConstraintWidgetContainer constraintWidgetContainer4 = this.f32121a;
                constraintWidgetContainer4.f2250f.f32169e.mo5475d(constraintWidgetContainer4.m39372t());
            }
        }
        if (i == 0) {
            ConstraintWidgetContainer constraintWidgetContainer5 = this.f32121a;
            ConstraintWidget.EnumC0650b enumC0650b2 = constraintWidgetContainer5.f2226M[0];
            if (enumC0650b2 == ConstraintWidget.EnumC0650b.FIXED || enumC0650b2 == ConstraintWidget.EnumC0650b.MATCH_PARENT) {
                int m39415N = constraintWidgetContainer5.m39415N() + m39414O;
                this.f32121a.f2248e.f32173i.mo5475d(m39415N);
                this.f32121a.f2248e.f32169e.mo5475d(m39415N - m39414O);
                z2 = true;
            }
            z2 = false;
        } else {
            ConstraintWidgetContainer constraintWidgetContainer6 = this.f32121a;
            ConstraintWidget.EnumC0650b enumC0650b3 = constraintWidgetContainer6.f2226M[1];
            if (enumC0650b3 == ConstraintWidget.EnumC0650b.FIXED || enumC0650b3 == ConstraintWidget.EnumC0650b.MATCH_PARENT) {
                int m39372t = constraintWidgetContainer6.m39372t() + m39413P;
                this.f32121a.f2250f.f32173i.mo5475d(m39372t);
                this.f32121a.f2250f.f32169e.mo5475d(m39372t - m39413P);
                z2 = true;
            }
            z2 = false;
        }
        m5479m();
        Iterator<AbstractC12335m> it2 = this.f32125e.iterator();
        while (it2.hasNext()) {
            AbstractC12335m next2 = it2.next();
            if (next2.f32170f == i && (next2.f32166b != this.f32121a || next2.f32171g)) {
                next2.mo5461e();
            }
        }
        Iterator<AbstractC12335m> it3 = this.f32125e.iterator();
        while (it3.hasNext()) {
            AbstractC12335m next3 = it3.next();
            if (next3.f32170f == i && (z2 || next3.f32166b != this.f32121a)) {
                if (!next3.f32172h.f32139j || !next3.f32173i.f32139j || (!(next3 instanceof C12322c) && !next3.f32169e.f32139j)) {
                    z3 = false;
                    break;
                }
            }
        }
        this.f32121a.m39392i0(m39378q);
        this.f32121a.m39363x0(m39378q2);
        return z3;
    }

    /* renamed from: j */
    public void m5482j() {
        this.f32122b = true;
    }

    /* renamed from: k */
    public void m5481k() {
        this.f32123c = true;
    }

    /* renamed from: m */
    public void m5479m() {
        boolean z;
        C12327g c12327g;
        Iterator<ConstraintWidget> it = this.f32121a.f31009w0.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (!next.f2240a) {
                ConstraintWidget.EnumC0650b[] enumC0650bArr = next.f2226M;
                boolean z2 = false;
                ConstraintWidget.EnumC0650b enumC0650b = enumC0650bArr[0];
                ConstraintWidget.EnumC0650b enumC0650b2 = enumC0650bArr[1];
                int i = next.f2262l;
                int i2 = next.f2264m;
                ConstraintWidget.EnumC0650b enumC0650b3 = ConstraintWidget.EnumC0650b.WRAP_CONTENT;
                if (enumC0650b != enumC0650b3 && (enumC0650b != ConstraintWidget.EnumC0650b.MATCH_CONSTRAINT || i != 1)) {
                    z = false;
                } else {
                    z = true;
                }
                if (enumC0650b2 == enumC0650b3 || (enumC0650b2 == ConstraintWidget.EnumC0650b.MATCH_CONSTRAINT && i2 == 1)) {
                    z2 = true;
                }
                C12327g c12327g2 = next.f2248e.f32169e;
                boolean z3 = c12327g2.f32139j;
                C12327g c12327g3 = next.f2250f.f32169e;
                boolean z4 = c12327g3.f32139j;
                if (z3 && z4) {
                    ConstraintWidget.EnumC0650b enumC0650b4 = ConstraintWidget.EnumC0650b.FIXED;
                    m5480l(next, enumC0650b4, c12327g2.f32136g, enumC0650b4, c12327g3.f32136g);
                    next.f2240a = true;
                } else if (z3 && z2) {
                    m5480l(next, ConstraintWidget.EnumC0650b.FIXED, c12327g2.f32136g, enumC0650b3, c12327g3.f32136g);
                    if (enumC0650b2 == ConstraintWidget.EnumC0650b.MATCH_CONSTRAINT) {
                        next.f2250f.f32169e.f32151m = next.m39372t();
                    } else {
                        next.f2250f.f32169e.mo5475d(next.m39372t());
                        next.f2240a = true;
                    }
                } else if (z4 && z) {
                    m5480l(next, enumC0650b3, c12327g2.f32136g, ConstraintWidget.EnumC0650b.FIXED, c12327g3.f32136g);
                    if (enumC0650b == ConstraintWidget.EnumC0650b.MATCH_CONSTRAINT) {
                        next.f2248e.f32169e.f32151m = next.m39415N();
                    } else {
                        next.f2248e.f32169e.mo5475d(next.m39415N());
                        next.f2240a = true;
                    }
                }
                if (next.f2240a && (c12327g = next.f2250f.f32163l) != null) {
                    c12327g.mo5475d(next.m39388l());
                }
            }
        }
    }

    /* renamed from: n */
    public void m5478n(C12319b.InterfaceC12321b interfaceC12321b) {
        this.f32127g = interfaceC12321b;
    }
}