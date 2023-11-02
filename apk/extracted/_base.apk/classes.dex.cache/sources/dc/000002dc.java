package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import p289q.C11657d;
import p289q.C11665h;
import p309r.C12011b;

/* renamed from: androidx.constraintlayout.solver.widgets.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0651a extends C12011b {

    /* renamed from: y0 */
    private int f2319y0 = 0;

    /* renamed from: z0 */
    private boolean f2320z0 = true;

    /* renamed from: A0 */
    private int f2318A0 = 0;

    /* renamed from: H0 */
    public boolean m39334H0() {
        return this.f2320z0;
    }

    /* renamed from: I0 */
    public int m39333I0() {
        return this.f2319y0;
    }

    /* renamed from: J0 */
    public int m39332J0() {
        return this.f2318A0;
    }

    /* renamed from: K0 */
    public void m39331K0() {
        for (int i = 0; i < this.f31008x0; i++) {
            ConstraintWidget constraintWidget = this.f31007w0[i];
            int i2 = this.f2319y0;
            if (i2 != 0 && i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    constraintWidget.m39387l0(1, true);
                }
            } else {
                constraintWidget.m39387l0(0, true);
            }
        }
    }

    /* renamed from: L0 */
    public void m39330L0(boolean z) {
        this.f2320z0 = z;
    }

    /* renamed from: M0 */
    public void m39329M0(int i) {
        this.f2319y0 = i;
    }

    /* renamed from: N0 */
    public void m39328N0(int i) {
        this.f2318A0 = i;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: f */
    public void mo39301f(C11657d c11657d) {
        C0654d[] c0654dArr;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C0654d[] c0654dArr2 = this.f2223J;
        c0654dArr2[0] = this.f2215B;
        c0654dArr2[2] = this.f2216C;
        c0654dArr2[1] = this.f2217D;
        c0654dArr2[3] = this.f2218E;
        int i6 = 0;
        while (true) {
            c0654dArr = this.f2223J;
            if (i6 >= c0654dArr.length) {
                break;
            }
            C0654d c0654d = c0654dArr[i6];
            c0654d.f2349g = c11657d.m7300q(c0654d);
            i6++;
        }
        int i7 = this.f2319y0;
        if (i7 >= 0 && i7 < 4) {
            C0654d c0654d2 = c0654dArr[i7];
            for (int i8 = 0; i8 < this.f31008x0; i8++) {
                ConstraintWidget constraintWidget = this.f31007w0[i8];
                if ((this.f2320z0 || constraintWidget.mo39300g()) && ((((i4 = this.f2319y0) == 0 || i4 == 1) && constraintWidget.m39366w() == ConstraintWidget.EnumC0650b.MATCH_CONSTRAINT && constraintWidget.f2215B.f2346d != null && constraintWidget.f2217D.f2346d != null) || (((i5 = this.f2319y0) == 2 || i5 == 3) && constraintWidget.m39418K() == ConstraintWidget.EnumC0650b.MATCH_CONSTRAINT && constraintWidget.f2216C.f2346d != null && constraintWidget.f2218E.f2346d != null))) {
                    z = true;
                    break;
                }
            }
            z = false;
            if (!this.f2215B.m39315h() && !this.f2217D.m39315h()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!this.f2216C.m39315h() && !this.f2218E.m39315h()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z && (((i3 = this.f2319y0) == 0 && z2) || ((i3 == 2 && z3) || ((i3 == 1 && z2) || (i3 == 3 && z3))))) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                i = 4;
            } else {
                i = 5;
            }
            for (int i9 = 0; i9 < this.f31008x0; i9++) {
                ConstraintWidget constraintWidget2 = this.f31007w0[i9];
                if (this.f2320z0 || constraintWidget2.mo39300g()) {
                    C11665h m7300q = c11657d.m7300q(constraintWidget2.f2223J[this.f2319y0]);
                    C0654d[] c0654dArr3 = constraintWidget2.f2223J;
                    int i10 = this.f2319y0;
                    C0654d c0654d3 = c0654dArr3[i10];
                    c0654d3.f2349g = m7300q;
                    C0654d c0654d4 = c0654d3.f2346d;
                    if (c0654d4 != null && c0654d4.f2344b == this) {
                        i2 = c0654d3.f2347e + 0;
                    } else {
                        i2 = 0;
                    }
                    if (i10 != 0 && i10 != 2) {
                        c11657d.m7310g(c0654d2.f2349g, m7300q, this.f2318A0 + i2, z);
                    } else {
                        c11657d.m7308i(c0654d2.f2349g, m7300q, this.f2318A0 - i2, z);
                    }
                    c11657d.m7312e(c0654d2.f2349g, m7300q, this.f2318A0 + i2, i);
                }
            }
            int i11 = this.f2319y0;
            if (i11 == 0) {
                c11657d.m7312e(this.f2217D.f2349g, this.f2215B.f2349g, 0, 8);
                c11657d.m7312e(this.f2215B.f2349g, this.f2227N.f2217D.f2349g, 0, 4);
                c11657d.m7312e(this.f2215B.f2349g, this.f2227N.f2215B.f2349g, 0, 0);
            } else if (i11 == 1) {
                c11657d.m7312e(this.f2215B.f2349g, this.f2217D.f2349g, 0, 8);
                c11657d.m7312e(this.f2215B.f2349g, this.f2227N.f2215B.f2349g, 0, 4);
                c11657d.m7312e(this.f2215B.f2349g, this.f2227N.f2217D.f2349g, 0, 0);
            } else if (i11 == 2) {
                c11657d.m7312e(this.f2218E.f2349g, this.f2216C.f2349g, 0, 8);
                c11657d.m7312e(this.f2216C.f2349g, this.f2227N.f2218E.f2349g, 0, 4);
                c11657d.m7312e(this.f2216C.f2349g, this.f2227N.f2216C.f2349g, 0, 0);
            } else if (i11 == 3) {
                c11657d.m7312e(this.f2216C.f2349g, this.f2218E.f2349g, 0, 8);
                c11657d.m7312e(this.f2216C.f2349g, this.f2227N.f2216C.f2349g, 0, 4);
                c11657d.m7312e(this.f2216C.f2349g, this.f2227N.f2218E.f2349g, 0, 0);
            }
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: g */
    public boolean mo39300g() {
        return true;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public String toString() {
        String str = "[Barrier] " + m39380p() + " {";
        for (int i = 0; i < this.f31008x0; i++) {
            ConstraintWidget constraintWidget = this.f31007w0[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + constraintWidget.m39380p();
        }
        return str + "}";
    }
}