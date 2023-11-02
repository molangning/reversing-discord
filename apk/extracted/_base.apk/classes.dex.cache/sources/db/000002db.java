package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.Metrics;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Arrays;
import p289q.C11657d;
import p309r.C12012c;
import p329s.C12319b;
import p329s.C12324e;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class ConstraintWidgetContainer extends C12012c {

    /* renamed from: B0 */
    public Metrics f2295B0;

    /* renamed from: D0 */
    int f2297D0;

    /* renamed from: E0 */
    int f2298E0;

    /* renamed from: F0 */
    int f2299F0;

    /* renamed from: G0 */
    int f2300G0;

    /* renamed from: x0 */
    C12319b f2315x0 = new C12319b(this);

    /* renamed from: y0 */
    public C12324e f2316y0 = new C12324e(this);

    /* renamed from: z0 */
    protected C12319b.InterfaceC12321b f2317z0 = null;

    /* renamed from: A0 */
    private boolean f2294A0 = false;

    /* renamed from: C0 */
    protected C11657d f2296C0 = new C11657d();

    /* renamed from: H0 */
    int f2301H0 = 0;

    /* renamed from: I0 */
    int f2302I0 = 0;

    /* renamed from: J0 */
    C0653c[] f2303J0 = new C0653c[4];

    /* renamed from: K0 */
    C0653c[] f2304K0 = new C0653c[4];

    /* renamed from: L0 */
    public boolean f2305L0 = false;

    /* renamed from: M0 */
    public boolean f2306M0 = false;

    /* renamed from: N0 */
    public boolean f2307N0 = false;

    /* renamed from: O0 */
    public int f2308O0 = 0;

    /* renamed from: P0 */
    public int f2309P0 = 0;

    /* renamed from: Q0 */
    private int f2310Q0 = 263;

    /* renamed from: R0 */
    public boolean f2311R0 = false;

    /* renamed from: S0 */
    private boolean f2312S0 = false;

    /* renamed from: T0 */
    private boolean f2313T0 = false;

    /* renamed from: U0 */
    int f2314U0 = 0;

    /* renamed from: M0 */
    private void m39355M0(ConstraintWidget constraintWidget) {
        int i = this.f2301H0 + 1;
        C0653c[] c0653cArr = this.f2304K0;
        if (i >= c0653cArr.length) {
            this.f2304K0 = (C0653c[]) Arrays.copyOf(c0653cArr, c0653cArr.length * 2);
        }
        this.f2304K0[this.f2301H0] = new C0653c(constraintWidget, 0, m39344X0());
        this.f2301H0++;
    }

    /* renamed from: N0 */
    private void m39354N0(ConstraintWidget constraintWidget) {
        int i = this.f2302I0 + 1;
        C0653c[] c0653cArr = this.f2303J0;
        if (i >= c0653cArr.length) {
            this.f2303J0 = (C0653c[]) Arrays.copyOf(c0653cArr, c0653cArr.length * 2);
        }
        this.f2303J0[this.f2302I0] = new C0653c(constraintWidget, 1, m39344X0());
        this.f2302I0++;
    }

    /* renamed from: b1 */
    private void m39340b1() {
        this.f2301H0 = 0;
        this.f2302I0 = 0;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: F0 */
    public void mo39358F0(boolean z, boolean z2) {
        super.mo39358F0(z, z2);
        int size = this.f31009w0.size();
        for (int i = 0; i < size; i++) {
            this.f31009w0.get(i).mo39358F0(z, z2);
        }
    }

    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [boolean] */
    @Override // p309r.C12012c
    /* renamed from: H0 */
    public void mo6612H0() {
        boolean z;
        boolean z2;
        boolean z3;
        ?? r11;
        boolean z4;
        this.f2232S = 0;
        this.f2233T = 0;
        int max = Math.max(0, m39415N());
        int max2 = Math.max(0, m39372t());
        this.f2312S0 = false;
        this.f2313T0 = false;
        if (!m39341a1(64) && !m39341a1(128)) {
            z = false;
        } else {
            z = true;
        }
        C11657d c11657d = this.f2296C0;
        c11657d.f30370g = false;
        c11657d.f30371h = false;
        if (this.f2310Q0 != 0 && z) {
            c11657d.f30371h = true;
        }
        ConstraintWidget.EnumC0650b[] enumC0650bArr = this.f2226M;
        ConstraintWidget.EnumC0650b enumC0650b = enumC0650bArr[1];
        ConstraintWidget.EnumC0650b enumC0650b2 = enumC0650bArr[0];
        ArrayList<ConstraintWidget> arrayList = this.f31009w0;
        ConstraintWidget.EnumC0650b m39366w = m39366w();
        ConstraintWidget.EnumC0650b enumC0650b3 = ConstraintWidget.EnumC0650b.WRAP_CONTENT;
        if (m39366w != enumC0650b3 && m39418K() != enumC0650b3) {
            z2 = false;
        } else {
            z2 = true;
        }
        m39340b1();
        int size = this.f31009w0.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.f31009w0.get(i);
            if (constraintWidget instanceof C12012c) {
                ((C12012c) constraintWidget).mo6612H0();
            }
        }
        int i2 = 0;
        boolean z5 = false;
        boolean z6 = true;
        while (z6) {
            int i3 = i2 + 1;
            try {
                this.f2296C0.m7317E();
                m39340b1();
                m39391j(this.f2296C0);
                for (int i4 = 0; i4 < size; i4++) {
                    this.f31009w0.get(i4).m39391j(this.f2296C0);
                }
                z6 = m39356L0(this.f2296C0);
                if (z6) {
                    this.f2296C0.m7321A();
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("EXCEPTION : " + e);
            }
            if (z6) {
                m39336f1(this.f2296C0, C0659f.f2368a);
            } else {
                mo39310G0(this.f2296C0);
                for (int i5 = 0; i5 < size; i5++) {
                    this.f31009w0.get(i5).mo39310G0(this.f2296C0);
                }
            }
            if (z2 && i3 < 8 && C0659f.f2368a[2]) {
                int i6 = 0;
                int i7 = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    ConstraintWidget constraintWidget2 = this.f31009w0.get(i8);
                    i6 = Math.max(i6, constraintWidget2.f2232S + constraintWidget2.m39415N());
                    i7 = Math.max(i7, constraintWidget2.f2233T + constraintWidget2.m39372t());
                }
                int max3 = Math.max(this.f2239Z, i6);
                int max4 = Math.max(this.f2241a0, i7);
                ConstraintWidget.EnumC0650b enumC0650b4 = ConstraintWidget.EnumC0650b.WRAP_CONTENT;
                if (enumC0650b2 == enumC0650b4 && m39415N() < max3) {
                    m39430B0(max3);
                    this.f2226M[0] = enumC0650b4;
                    z3 = true;
                    z5 = true;
                } else {
                    z3 = false;
                }
                if (enumC0650b == enumC0650b4 && m39372t() < max4) {
                    m39398e0(max4);
                    this.f2226M[1] = enumC0650b4;
                    z3 = true;
                    z5 = true;
                }
            } else {
                z3 = false;
            }
            int max5 = Math.max(this.f2239Z, m39415N());
            if (max5 > m39415N()) {
                m39430B0(max5);
                this.f2226M[0] = ConstraintWidget.EnumC0650b.FIXED;
                z3 = true;
                z5 = true;
            }
            int max6 = Math.max(this.f2241a0, m39372t());
            if (max6 > m39372t()) {
                m39398e0(max6);
                r11 = 1;
                this.f2226M[1] = ConstraintWidget.EnumC0650b.FIXED;
                z3 = true;
                z4 = true;
            } else {
                r11 = 1;
                z4 = z5;
            }
            if (!z4) {
                ConstraintWidget.EnumC0650b enumC0650b5 = this.f2226M[0];
                ConstraintWidget.EnumC0650b enumC0650b6 = ConstraintWidget.EnumC0650b.WRAP_CONTENT;
                if (enumC0650b5 == enumC0650b6 && max > 0 && m39415N() > max) {
                    this.f2312S0 = r11;
                    this.f2226M[0] = ConstraintWidget.EnumC0650b.FIXED;
                    m39430B0(max);
                    z3 = r11;
                    z4 = z3;
                }
                if (this.f2226M[r11] == enumC0650b6 && max2 > 0 && m39372t() > max2) {
                    this.f2313T0 = r11;
                    this.f2226M[r11] = ConstraintWidget.EnumC0650b.FIXED;
                    m39398e0(max2);
                    z6 = true;
                    z5 = true;
                    i2 = i3;
                }
            }
            z6 = z3;
            z5 = z4;
            i2 = i3;
        }
        this.f31009w0 = arrayList;
        if (z5) {
            ConstraintWidget.EnumC0650b[] enumC0650bArr2 = this.f2226M;
            enumC0650bArr2[0] = enumC0650b2;
            enumC0650bArr2[1] = enumC0650b;
        }
        mo6608X(this.f2296C0.m7294w());
    }

    /* renamed from: K0 */
    public void m39357K0(ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            m39355M0(constraintWidget);
        } else if (i == 1) {
            m39354N0(constraintWidget);
        }
    }

    /* renamed from: L0 */
    public boolean m39356L0(C11657d c11657d) {
        mo39301f(c11657d);
        int size = this.f31009w0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.f31009w0.get(i);
            constraintWidget.m39387l0(0, false);
            constraintWidget.m39387l0(1, false);
            if (constraintWidget instanceof C0651a) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                ConstraintWidget constraintWidget2 = this.f31009w0.get(i2);
                if (constraintWidget2 instanceof C0651a) {
                    ((C0651a) constraintWidget2).m39331K0();
                }
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            ConstraintWidget constraintWidget3 = this.f31009w0.get(i3);
            if (constraintWidget3.m39399e()) {
                constraintWidget3.mo39301f(c11657d);
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            ConstraintWidget constraintWidget4 = this.f31009w0.get(i4);
            if (constraintWidget4 instanceof ConstraintWidgetContainer) {
                ConstraintWidget.EnumC0650b[] enumC0650bArr = constraintWidget4.f2226M;
                ConstraintWidget.EnumC0650b enumC0650b = enumC0650bArr[0];
                ConstraintWidget.EnumC0650b enumC0650b2 = enumC0650bArr[1];
                ConstraintWidget.EnumC0650b enumC0650b3 = ConstraintWidget.EnumC0650b.WRAP_CONTENT;
                if (enumC0650b == enumC0650b3) {
                    constraintWidget4.m39392i0(ConstraintWidget.EnumC0650b.FIXED);
                }
                if (enumC0650b2 == enumC0650b3) {
                    constraintWidget4.m39363x0(ConstraintWidget.EnumC0650b.FIXED);
                }
                constraintWidget4.mo39301f(c11657d);
                if (enumC0650b == enumC0650b3) {
                    constraintWidget4.m39392i0(enumC0650b);
                }
                if (enumC0650b2 == enumC0650b3) {
                    constraintWidget4.m39363x0(enumC0650b2);
                }
            } else {
                C0659f.m39298a(this, c11657d, constraintWidget4);
                if (!constraintWidget4.m39399e()) {
                    constraintWidget4.mo39301f(c11657d);
                }
            }
        }
        if (this.f2301H0 > 0) {
            C0652b.m39327a(this, c11657d, 0);
        }
        if (this.f2302I0 > 0) {
            C0652b.m39327a(this, c11657d, 1);
        }
        return true;
    }

    /* renamed from: O0 */
    public boolean m39353O0(boolean z) {
        return this.f2316y0.m5486f(z);
    }

    /* renamed from: P0 */
    public boolean m39352P0(boolean z) {
        return this.f2316y0.m5485g(z);
    }

    /* renamed from: Q0 */
    public boolean m39351Q0(boolean z, int i) {
        return this.f2316y0.m5484h(z, i);
    }

    /* renamed from: R0 */
    public void m39350R0(Metrics metrics) {
        this.f2295B0 = metrics;
        this.f2296C0.m7295v(metrics);
    }

    /* renamed from: S0 */
    public C12319b.InterfaceC12321b m39349S0() {
        return this.f2317z0;
    }

    /* renamed from: T0 */
    public int m39348T0() {
        return this.f2310Q0;
    }

    /* renamed from: U0 */
    public void m39347U0() {
        this.f2316y0.m5482j();
    }

    /* renamed from: V0 */
    public void m39346V0() {
        this.f2316y0.m5481k();
    }

    @Override // p309r.C12012c, androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: W */
    public void mo6609W() {
        this.f2296C0.m7317E();
        this.f2297D0 = 0;
        this.f2299F0 = 0;
        this.f2298E0 = 0;
        this.f2300G0 = 0;
        this.f2311R0 = false;
        super.mo6609W();
    }

    /* renamed from: W0 */
    public boolean m39345W0() {
        return this.f2313T0;
    }

    /* renamed from: X0 */
    public boolean m39344X0() {
        return this.f2294A0;
    }

    /* renamed from: Y0 */
    public boolean m39343Y0() {
        return this.f2312S0;
    }

    /* renamed from: Z0 */
    public long m39342Z0(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f2297D0 = i8;
        this.f2298E0 = i9;
        return this.f2315x0.m5498d(this, i, i8, i9, i2, i3, i4, i5, i6, i7);
    }

    /* renamed from: a1 */
    public boolean m39341a1(int i) {
        return (this.f2310Q0 & i) == i;
    }

    /* renamed from: c1 */
    public void m39339c1(C12319b.InterfaceC12321b interfaceC12321b) {
        this.f2317z0 = interfaceC12321b;
        this.f2316y0.m5478n(interfaceC12321b);
    }

    /* renamed from: d1 */
    public void m39338d1(int i) {
        this.f2310Q0 = i;
        C11657d.f30361s = C0659f.m39297b(i, 256);
    }

    /* renamed from: e1 */
    public void m39337e1(boolean z) {
        this.f2294A0 = z;
    }

    /* renamed from: f1 */
    public void m39336f1(C11657d c11657d, boolean[] zArr) {
        zArr[2] = false;
        mo39310G0(c11657d);
        int size = this.f31009w0.size();
        for (int i = 0; i < size; i++) {
            this.f31009w0.get(i).mo39310G0(c11657d);
        }
    }

    /* renamed from: g1 */
    public void m39335g1() {
        this.f2315x0.m5497e(this);
    }
}