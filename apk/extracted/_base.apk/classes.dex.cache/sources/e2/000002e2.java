package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.C0654d;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import p289q.C11657d;
import p289q.C11665h;

/* renamed from: androidx.constraintlayout.solver.widgets.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0657e extends ConstraintWidget {

    /* renamed from: w0 */
    protected float f2363w0 = -1.0f;

    /* renamed from: x0 */
    protected int f2364x0 = -1;

    /* renamed from: y0 */
    protected int f2365y0 = -1;

    /* renamed from: z0 */
    private C0654d f2366z0 = this.f2216C;

    /* renamed from: A0 */
    private int f2361A0 = 0;

    /* renamed from: B0 */
    private int f2362B0 = 0;

    /* renamed from: androidx.constraintlayout.solver.widgets.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static /* synthetic */ class C0658a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2367a;

        static {
            int[] iArr = new int[C0654d.EnumC0656b.values().length];
            f2367a = iArr;
            try {
                iArr[C0654d.EnumC0656b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2367a[C0654d.EnumC0656b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2367a[C0654d.EnumC0656b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2367a[C0654d.EnumC0656b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2367a[C0654d.EnumC0656b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2367a[C0654d.EnumC0656b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2367a[C0654d.EnumC0656b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2367a[C0654d.EnumC0656b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2367a[C0654d.EnumC0656b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public C0657e() {
        this.f2224K.clear();
        this.f2224K.add(this.f2366z0);
        int length = this.f2223J.length;
        for (int i = 0; i < length; i++) {
            this.f2223J[i] = this.f2366z0;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: G0 */
    public void mo39310G0(C11657d c11657d) {
        if (m39425E() == null) {
            return;
        }
        int m7292y = c11657d.m7292y(this.f2366z0);
        if (this.f2361A0 == 1) {
            m39428C0(m7292y);
            m39426D0(0);
            m39398e0(m39425E().m39372t());
            m39430B0(0);
            return;
        }
        m39428C0(0);
        m39426D0(m7292y);
        m39430B0(m39425E().m39415N());
        m39398e0(0);
    }

    /* renamed from: H0 */
    public int m39309H0() {
        return this.f2361A0;
    }

    /* renamed from: I0 */
    public int m39308I0() {
        return this.f2364x0;
    }

    /* renamed from: J0 */
    public int m39307J0() {
        return this.f2365y0;
    }

    /* renamed from: K0 */
    public float m39306K0() {
        return this.f2363w0;
    }

    /* renamed from: L0 */
    public void m39305L0(int i) {
        if (i > -1) {
            this.f2363w0 = -1.0f;
            this.f2364x0 = i;
            this.f2365y0 = -1;
        }
    }

    /* renamed from: M0 */
    public void m39304M0(int i) {
        if (i > -1) {
            this.f2363w0 = -1.0f;
            this.f2364x0 = -1;
            this.f2365y0 = i;
        }
    }

    /* renamed from: N0 */
    public void m39303N0(float f) {
        if (f > -1.0f) {
            this.f2363w0 = f;
            this.f2364x0 = -1;
            this.f2365y0 = -1;
        }
    }

    /* renamed from: O0 */
    public void m39302O0(int i) {
        if (this.f2361A0 == i) {
            return;
        }
        this.f2361A0 = i;
        this.f2224K.clear();
        if (this.f2361A0 == 1) {
            this.f2366z0 = this.f2215B;
        } else {
            this.f2366z0 = this.f2216C;
        }
        this.f2224K.add(this.f2366z0);
        int length = this.f2223J.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f2223J[i2] = this.f2366z0;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: f */
    public void mo39301f(C11657d c11657d) {
        boolean z;
        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) m39425E();
        if (constraintWidgetContainer == null) {
            return;
        }
        C0654d mo39299k = constraintWidgetContainer.mo39299k(C0654d.EnumC0656b.LEFT);
        C0654d mo39299k2 = constraintWidgetContainer.mo39299k(C0654d.EnumC0656b.RIGHT);
        ConstraintWidget constraintWidget = this.f2227N;
        boolean z2 = true;
        if (constraintWidget != null && constraintWidget.f2226M[0] == ConstraintWidget.EnumC0650b.WRAP_CONTENT) {
            z = true;
        } else {
            z = false;
        }
        if (this.f2361A0 == 0) {
            mo39299k = constraintWidgetContainer.mo39299k(C0654d.EnumC0656b.TOP);
            mo39299k2 = constraintWidgetContainer.mo39299k(C0654d.EnumC0656b.BOTTOM);
            ConstraintWidget constraintWidget2 = this.f2227N;
            if (constraintWidget2 == null || constraintWidget2.f2226M[1] != ConstraintWidget.EnumC0650b.WRAP_CONTENT) {
                z2 = false;
            }
            z = z2;
        }
        if (this.f2364x0 != -1) {
            C11665h m7300q = c11657d.m7300q(this.f2366z0);
            c11657d.m7312e(m7300q, c11657d.m7300q(mo39299k), this.f2364x0, 8);
            if (z) {
                c11657d.m7309h(c11657d.m7300q(mo39299k2), m7300q, 0, 5);
            }
        } else if (this.f2365y0 != -1) {
            C11665h m7300q2 = c11657d.m7300q(this.f2366z0);
            C11665h m7300q3 = c11657d.m7300q(mo39299k2);
            c11657d.m7312e(m7300q2, m7300q3, -this.f2365y0, 8);
            if (z) {
                c11657d.m7309h(m7300q2, c11657d.m7300q(mo39299k), 0, 5);
                c11657d.m7309h(m7300q3, m7300q2, 0, 5);
            }
        } else if (this.f2363w0 != -1.0f) {
            c11657d.m7313d(C11657d.m7298s(c11657d, c11657d.m7300q(this.f2366z0), c11657d.m7300q(mo39299k2), this.f2363w0));
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: g */
    public boolean mo39300g() {
        return true;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: k */
    public C0654d mo39299k(C0654d.EnumC0656b enumC0656b) {
        switch (C0658a.f2367a[enumC0656b.ordinal()]) {
            case 1:
            case 2:
                if (this.f2361A0 == 1) {
                    return this.f2366z0;
                }
                break;
            case 3:
            case 4:
                if (this.f2361A0 == 0) {
                    return this.f2366z0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(enumC0656b.name());
    }
}