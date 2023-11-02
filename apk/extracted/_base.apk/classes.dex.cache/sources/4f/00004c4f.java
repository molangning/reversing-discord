package p329s;

import androidx.constraintlayout.solver.Metrics;
import androidx.constraintlayout.solver.widgets.C0654d;
import androidx.constraintlayout.solver.widgets.C0657e;
import androidx.constraintlayout.solver.widgets.C0659f;
import androidx.constraintlayout.solver.widgets.C0660g;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import p289q.C11657d;
import p309r.InterfaceC12010a;

/* renamed from: s.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C12319b {

    /* renamed from: a */
    private final ArrayList<ConstraintWidget> f32106a = new ArrayList<>();

    /* renamed from: b */
    private C12320a f32107b = new C12320a();

    /* renamed from: c */
    private ConstraintWidgetContainer f32108c;

    /* renamed from: s.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C12320a {

        /* renamed from: a */
        public ConstraintWidget.EnumC0650b f32109a;

        /* renamed from: b */
        public ConstraintWidget.EnumC0650b f32110b;

        /* renamed from: c */
        public int f32111c;

        /* renamed from: d */
        public int f32112d;

        /* renamed from: e */
        public int f32113e;

        /* renamed from: f */
        public int f32114f;

        /* renamed from: g */
        public int f32115g;

        /* renamed from: h */
        public boolean f32116h;

        /* renamed from: i */
        public boolean f32117i;

        /* renamed from: j */
        public boolean f32118j;
    }

    /* renamed from: s.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC12321b {
        /* renamed from: a */
        void mo5496a();

        /* renamed from: b */
        void mo5495b(ConstraintWidget constraintWidget, C12320a c12320a);
    }

    public C12319b(ConstraintWidgetContainer constraintWidgetContainer) {
        this.f32108c = constraintWidgetContainer;
    }

    /* renamed from: a */
    private boolean m5501a(InterfaceC12321b interfaceC12321b, ConstraintWidget constraintWidget, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        this.f32107b.f32109a = constraintWidget.m39366w();
        this.f32107b.f32110b = constraintWidget.m39418K();
        this.f32107b.f32111c = constraintWidget.m39415N();
        this.f32107b.f32112d = constraintWidget.m39372t();
        C12320a c12320a = this.f32107b;
        c12320a.f32117i = false;
        c12320a.f32118j = z;
        ConstraintWidget.EnumC0650b enumC0650b = c12320a.f32109a;
        ConstraintWidget.EnumC0650b enumC0650b2 = ConstraintWidget.EnumC0650b.MATCH_CONSTRAINT;
        if (enumC0650b == enumC0650b2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c12320a.f32110b == enumC0650b2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 && constraintWidget.f2230Q > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 && constraintWidget.f2230Q > 0.0f) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z4 && constraintWidget.f2266n[0] == 4) {
            c12320a.f32109a = ConstraintWidget.EnumC0650b.FIXED;
        }
        if (z5 && constraintWidget.f2266n[1] == 4) {
            c12320a.f32110b = ConstraintWidget.EnumC0650b.FIXED;
        }
        interfaceC12321b.mo5495b(constraintWidget, c12320a);
        constraintWidget.m39430B0(this.f32107b.f32113e);
        constraintWidget.m39398e0(this.f32107b.f32114f);
        constraintWidget.m39400d0(this.f32107b.f32116h);
        constraintWidget.m39406Y(this.f32107b.f32115g);
        C12320a c12320a2 = this.f32107b;
        c12320a2.f32118j = false;
        return c12320a2.f32117i;
    }

    /* renamed from: b */
    private void m5500b(ConstraintWidgetContainer constraintWidgetContainer) {
        int size = constraintWidgetContainer.f31009w0.size();
        InterfaceC12321b m39349S0 = constraintWidgetContainer.m39349S0();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = constraintWidgetContainer.f31009w0.get(i);
            if (!(constraintWidget instanceof C0657e) && (!constraintWidget.f2248e.f32169e.f32139j || !constraintWidget.f2250f.f32169e.f32139j)) {
                ConstraintWidget.EnumC0650b m39378q = constraintWidget.m39378q(0);
                boolean z = true;
                ConstraintWidget.EnumC0650b m39378q2 = constraintWidget.m39378q(1);
                ConstraintWidget.EnumC0650b enumC0650b = ConstraintWidget.EnumC0650b.MATCH_CONSTRAINT;
                if (!((m39378q != enumC0650b || constraintWidget.f2262l == 1 || m39378q2 != enumC0650b || constraintWidget.f2264m == 1) ? false : false)) {
                    m5501a(m39349S0, constraintWidget, false);
                    Metrics metrics = constraintWidgetContainer.f2295B0;
                    if (metrics != null) {
                        metrics.f2187a++;
                    }
                }
            }
        }
        m39349S0.mo5496a();
    }

    /* renamed from: c */
    private void m5499c(ConstraintWidgetContainer constraintWidgetContainer, String str, int i, int i2) {
        int m39429C = constraintWidgetContainer.m39429C();
        int m39431B = constraintWidgetContainer.m39431B();
        constraintWidgetContainer.m39375r0(0);
        constraintWidgetContainer.m39377q0(0);
        constraintWidgetContainer.m39430B0(i);
        constraintWidgetContainer.m39398e0(i2);
        constraintWidgetContainer.m39375r0(m39429C);
        constraintWidgetContainer.m39377q0(m39431B);
        this.f32108c.mo6612H0();
    }

    /* renamed from: d */
    public long m5498d(ConstraintWidgetContainer constraintWidgetContainer, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean z;
        int i10;
        boolean z2;
        boolean z3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z4;
        int i18;
        Metrics metrics;
        InterfaceC12321b m39349S0 = constraintWidgetContainer.m39349S0();
        int size = constraintWidgetContainer.f31009w0.size();
        int m39415N = constraintWidgetContainer.m39415N();
        int m39372t = constraintWidgetContainer.m39372t();
        boolean m39297b = C0659f.m39297b(i, 128);
        boolean z5 = m39297b || C0659f.m39297b(i, 64);
        if (z5) {
            for (int i19 = 0; i19 < size; i19++) {
                ConstraintWidget constraintWidget = constraintWidgetContainer.f31009w0.get(i19);
                ConstraintWidget.EnumC0650b m39366w = constraintWidget.m39366w();
                ConstraintWidget.EnumC0650b enumC0650b = ConstraintWidget.EnumC0650b.MATCH_CONSTRAINT;
                boolean z6 = (m39366w == enumC0650b) && (constraintWidget.m39418K() == enumC0650b) && constraintWidget.m39376r() > 0.0f;
                if ((constraintWidget.m39409T() && z6) || ((constraintWidget.m39407V() && z6) || (constraintWidget instanceof C0660g) || constraintWidget.m39409T() || constraintWidget.m39407V())) {
                    z5 = false;
                    break;
                }
            }
        }
        if (z5 && (metrics = C11657d.f30360r) != null) {
            metrics.f2189c++;
        }
        int i20 = 2;
        if (z5 && ((i4 == 1073741824 && i6 == 1073741824) || m39297b)) {
            int min = Math.min(constraintWidgetContainer.m39433A(), i5);
            int min2 = Math.min(constraintWidgetContainer.m39360z(), i7);
            if (i4 == 1073741824 && constraintWidgetContainer.m39415N() != min) {
                constraintWidgetContainer.m39430B0(min);
                constraintWidgetContainer.m39347U0();
            }
            if (i6 == 1073741824 && constraintWidgetContainer.m39372t() != min2) {
                constraintWidgetContainer.m39398e0(min2);
                constraintWidgetContainer.m39347U0();
            }
            if (i4 == 1073741824 && i6 == 1073741824) {
                z = constraintWidgetContainer.m39353O0(m39297b);
                i10 = 2;
            } else {
                boolean m39352P0 = constraintWidgetContainer.m39352P0(m39297b);
                if (i4 == 1073741824) {
                    z4 = m39352P0 & constraintWidgetContainer.m39351Q0(m39297b, 0);
                    i18 = 1;
                } else {
                    z4 = m39352P0;
                    i18 = 0;
                }
                if (i6 == 1073741824) {
                    boolean m39351Q0 = constraintWidgetContainer.m39351Q0(m39297b, 1) & z4;
                    i10 = i18 + 1;
                    z = m39351Q0;
                } else {
                    i10 = i18;
                    z = z4;
                }
            }
            if (z) {
                constraintWidgetContainer.mo39358F0(i4 == 1073741824, i6 == 1073741824);
            }
        } else {
            z = false;
            i10 = 0;
        }
        if (z && i10 == 2) {
            return 0L;
        }
        if (size > 0) {
            m5500b(constraintWidgetContainer);
        }
        int m39348T0 = constraintWidgetContainer.m39348T0();
        int size2 = this.f32106a.size();
        if (size > 0) {
            m5499c(constraintWidgetContainer, "First pass", m39415N, m39372t);
        }
        if (size2 > 0) {
            ConstraintWidget.EnumC0650b m39366w2 = constraintWidgetContainer.m39366w();
            ConstraintWidget.EnumC0650b enumC0650b2 = ConstraintWidget.EnumC0650b.WRAP_CONTENT;
            boolean z7 = m39366w2 == enumC0650b2;
            boolean z8 = constraintWidgetContainer.m39418K() == enumC0650b2;
            int max = Math.max(constraintWidgetContainer.m39415N(), this.f32108c.m39429C());
            int max2 = Math.max(constraintWidgetContainer.m39372t(), this.f32108c.m39431B());
            int i21 = 0;
            boolean z9 = false;
            while (i21 < size2) {
                ConstraintWidget constraintWidget2 = this.f32106a.get(i21);
                if (constraintWidget2 instanceof C0660g) {
                    int m39415N2 = constraintWidget2.m39415N();
                    int m39372t2 = constraintWidget2.m39372t();
                    i15 = m39348T0;
                    boolean m5501a = z9 | m5501a(m39349S0, constraintWidget2, true);
                    Metrics metrics2 = constraintWidgetContainer.f2295B0;
                    i16 = m39415N;
                    i17 = m39372t;
                    if (metrics2 != null) {
                        metrics2.f2188b++;
                    }
                    int m39415N3 = constraintWidget2.m39415N();
                    int m39372t3 = constraintWidget2.m39372t();
                    if (m39415N3 != m39415N2) {
                        constraintWidget2.m39430B0(m39415N3);
                        if (z7 && constraintWidget2.m39422G() > max) {
                            max = Math.max(max, constraintWidget2.m39422G() + constraintWidget2.mo39299k(C0654d.EnumC0656b.RIGHT).m39321b());
                        }
                        m5501a = true;
                    }
                    if (m39372t3 != m39372t2) {
                        constraintWidget2.m39398e0(m39372t3);
                        if (z8 && constraintWidget2.m39384n() > max2) {
                            max2 = Math.max(max2, constraintWidget2.m39384n() + constraintWidget2.mo39299k(C0654d.EnumC0656b.BOTTOM).m39321b());
                        }
                        m5501a = true;
                    }
                    z9 = m5501a | ((C0660g) constraintWidget2).m39295I0();
                } else {
                    i15 = m39348T0;
                    i16 = m39415N;
                    i17 = m39372t;
                }
                i21++;
                m39348T0 = i15;
                m39415N = i16;
                m39372t = i17;
                i20 = 2;
            }
            int i22 = m39348T0;
            int i23 = m39415N;
            int i24 = m39372t;
            int i25 = i20;
            int i26 = 0;
            while (i26 < i25) {
                int i27 = 0;
                while (i27 < size2) {
                    ConstraintWidget constraintWidget3 = this.f32106a.get(i27);
                    if (((constraintWidget3 instanceof InterfaceC12010a) && !(constraintWidget3 instanceof C0660g)) || (constraintWidget3 instanceof C0657e) || constraintWidget3.m39416M() == 8 || ((constraintWidget3.f2248e.f32169e.f32139j && constraintWidget3.f2250f.f32169e.f32139j) || (constraintWidget3 instanceof C0660g))) {
                        i13 = i26;
                        i14 = size2;
                    } else {
                        int m39415N4 = constraintWidget3.m39415N();
                        int m39372t4 = constraintWidget3.m39372t();
                        int m39388l = constraintWidget3.m39388l();
                        z9 |= m5501a(m39349S0, constraintWidget3, true);
                        Metrics metrics3 = constraintWidgetContainer.f2295B0;
                        i13 = i26;
                        i14 = size2;
                        if (metrics3 != null) {
                            metrics3.f2188b++;
                        }
                        int m39415N5 = constraintWidget3.m39415N();
                        int m39372t5 = constraintWidget3.m39372t();
                        if (m39415N5 != m39415N4) {
                            constraintWidget3.m39430B0(m39415N5);
                            if (z7 && constraintWidget3.m39422G() > max) {
                                max = Math.max(max, constraintWidget3.m39422G() + constraintWidget3.mo39299k(C0654d.EnumC0656b.RIGHT).m39321b());
                            }
                            z9 = true;
                        }
                        if (m39372t5 != m39372t4) {
                            constraintWidget3.m39398e0(m39372t5);
                            if (z8 && constraintWidget3.m39384n() > max2) {
                                max2 = Math.max(max2, constraintWidget3.m39384n() + constraintWidget3.mo39299k(C0654d.EnumC0656b.BOTTOM).m39321b());
                            }
                            z9 = true;
                        }
                        if (constraintWidget3.m39412Q() && m39388l != constraintWidget3.m39388l()) {
                            z9 = true;
                        }
                    }
                    i27++;
                    size2 = i14;
                    i26 = i13;
                }
                int i28 = i26;
                int i29 = size2;
                if (z9) {
                    i11 = i23;
                    i12 = i24;
                    m5499c(constraintWidgetContainer, "intermediate pass", i11, i12);
                    z9 = false;
                } else {
                    i11 = i23;
                    i12 = i24;
                }
                i26 = i28 + 1;
                i23 = i11;
                i24 = i12;
                i25 = 2;
                size2 = i29;
            }
            int i30 = i23;
            int i31 = i24;
            if (z9) {
                m5499c(constraintWidgetContainer, "2nd pass", i30, i31);
                if (constraintWidgetContainer.m39415N() < max) {
                    constraintWidgetContainer.m39430B0(max);
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (constraintWidgetContainer.m39372t() < max2) {
                    constraintWidgetContainer.m39398e0(max2);
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (z3) {
                    m5499c(constraintWidgetContainer, "3rd pass", i30, i31);
                }
            }
            m39348T0 = i22;
        }
        constraintWidgetContainer.m39338d1(m39348T0);
        return 0L;
    }

    /* renamed from: e */
    public void m5497e(ConstraintWidgetContainer constraintWidgetContainer) {
        this.f32106a.clear();
        int size = constraintWidgetContainer.f31009w0.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = constraintWidgetContainer.f31009w0.get(i);
            ConstraintWidget.EnumC0650b m39366w = constraintWidget.m39366w();
            ConstraintWidget.EnumC0650b enumC0650b = ConstraintWidget.EnumC0650b.MATCH_CONSTRAINT;
            if (m39366w != enumC0650b) {
                ConstraintWidget.EnumC0650b m39366w2 = constraintWidget.m39366w();
                ConstraintWidget.EnumC0650b enumC0650b2 = ConstraintWidget.EnumC0650b.MATCH_PARENT;
                if (m39366w2 != enumC0650b2 && constraintWidget.m39418K() != enumC0650b && constraintWidget.m39418K() != enumC0650b2) {
                }
            }
            this.f32106a.add(constraintWidget);
        }
        constraintWidgetContainer.m39347U0();
    }
}