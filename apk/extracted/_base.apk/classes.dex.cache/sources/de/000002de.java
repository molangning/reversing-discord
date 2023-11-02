package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.solver.widgets.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0653c {

    /* renamed from: a */
    protected ConstraintWidget f2321a;

    /* renamed from: b */
    protected ConstraintWidget f2322b;

    /* renamed from: c */
    protected ConstraintWidget f2323c;

    /* renamed from: d */
    protected ConstraintWidget f2324d;

    /* renamed from: e */
    protected ConstraintWidget f2325e;

    /* renamed from: f */
    protected ConstraintWidget f2326f;

    /* renamed from: g */
    protected ConstraintWidget f2327g;

    /* renamed from: h */
    protected ArrayList<ConstraintWidget> f2328h;

    /* renamed from: i */
    protected int f2329i;

    /* renamed from: j */
    protected int f2330j;

    /* renamed from: k */
    protected float f2331k = 0.0f;

    /* renamed from: l */
    int f2332l;

    /* renamed from: m */
    int f2333m;

    /* renamed from: n */
    int f2334n;

    /* renamed from: o */
    boolean f2335o;

    /* renamed from: p */
    private int f2336p;

    /* renamed from: q */
    private boolean f2337q;

    /* renamed from: r */
    protected boolean f2338r;

    /* renamed from: s */
    protected boolean f2339s;

    /* renamed from: t */
    protected boolean f2340t;

    /* renamed from: u */
    protected boolean f2341u;

    /* renamed from: v */
    private boolean f2342v;

    public C0653c(ConstraintWidget constraintWidget, int i, boolean z) {
        this.f2321a = constraintWidget;
        this.f2336p = i;
        this.f2337q = z;
    }

    /* renamed from: b */
    private void m39324b() {
        int i = this.f2336p * 2;
        ConstraintWidget constraintWidget = this.f2321a;
        boolean z = true;
        this.f2335o = true;
        ConstraintWidget constraintWidget2 = constraintWidget;
        boolean z2 = false;
        while (!z2) {
            this.f2329i++;
            ConstraintWidget[] constraintWidgetArr = constraintWidget.f2277s0;
            int i2 = this.f2336p;
            ConstraintWidget constraintWidget3 = null;
            constraintWidgetArr[i2] = null;
            constraintWidget.f2275r0[i2] = null;
            if (constraintWidget.m39416M() != 8) {
                this.f2332l++;
                ConstraintWidget.EnumC0650b m39378q = constraintWidget.m39378q(this.f2336p);
                ConstraintWidget.EnumC0650b enumC0650b = ConstraintWidget.EnumC0650b.MATCH_CONSTRAINT;
                if (m39378q != enumC0650b) {
                    this.f2333m += constraintWidget.m39362y(this.f2336p);
                }
                int m39321b = this.f2333m + constraintWidget.f2223J[i].m39321b();
                this.f2333m = m39321b;
                int i3 = i + 1;
                this.f2333m = m39321b + constraintWidget.f2223J[i3].m39321b();
                int m39321b2 = this.f2334n + constraintWidget.f2223J[i].m39321b();
                this.f2334n = m39321b2;
                this.f2334n = m39321b2 + constraintWidget.f2223J[i3].m39321b();
                if (this.f2322b == null) {
                    this.f2322b = constraintWidget;
                }
                this.f2324d = constraintWidget;
                ConstraintWidget.EnumC0650b[] enumC0650bArr = constraintWidget.f2226M;
                int i4 = this.f2336p;
                if (enumC0650bArr[i4] == enumC0650b) {
                    int i5 = constraintWidget.f2266n[i4];
                    if (i5 == 0 || i5 == 3 || i5 == 2) {
                        this.f2330j++;
                        float f = constraintWidget.f2273q0[i4];
                        if (f > 0.0f) {
                            this.f2331k += f;
                        }
                        if (m39323c(constraintWidget, i4)) {
                            if (f < 0.0f) {
                                this.f2338r = true;
                            } else {
                                this.f2339s = true;
                            }
                            if (this.f2328h == null) {
                                this.f2328h = new ArrayList<>();
                            }
                            this.f2328h.add(constraintWidget);
                        }
                        if (this.f2326f == null) {
                            this.f2326f = constraintWidget;
                        }
                        ConstraintWidget constraintWidget4 = this.f2327g;
                        if (constraintWidget4 != null) {
                            constraintWidget4.f2275r0[this.f2336p] = constraintWidget;
                        }
                        this.f2327g = constraintWidget;
                    }
                    if (this.f2336p == 0) {
                        if (constraintWidget.f2262l != 0) {
                            this.f2335o = false;
                        } else if (constraintWidget.f2268o != 0 || constraintWidget.f2270p != 0) {
                            this.f2335o = false;
                        }
                    } else if (constraintWidget.f2264m != 0) {
                        this.f2335o = false;
                    } else if (constraintWidget.f2274r != 0 || constraintWidget.f2276s != 0) {
                        this.f2335o = false;
                    }
                    if (constraintWidget.f2230Q != 0.0f) {
                        this.f2335o = false;
                        this.f2341u = true;
                    }
                }
            }
            if (constraintWidget2 != constraintWidget) {
                constraintWidget2.f2277s0[this.f2336p] = constraintWidget;
            }
            C0654d c0654d = constraintWidget.f2223J[i + 1].f2346d;
            if (c0654d != null) {
                ConstraintWidget constraintWidget5 = c0654d.f2344b;
                C0654d c0654d2 = constraintWidget5.f2223J[i].f2346d;
                if (c0654d2 != null && c0654d2.f2344b == constraintWidget) {
                    constraintWidget3 = constraintWidget5;
                }
            }
            if (constraintWidget3 == null) {
                constraintWidget3 = constraintWidget;
                z2 = true;
            }
            constraintWidget2 = constraintWidget;
            constraintWidget = constraintWidget3;
        }
        ConstraintWidget constraintWidget6 = this.f2322b;
        if (constraintWidget6 != null) {
            this.f2333m -= constraintWidget6.f2223J[i].m39321b();
        }
        ConstraintWidget constraintWidget7 = this.f2324d;
        if (constraintWidget7 != null) {
            this.f2333m -= constraintWidget7.f2223J[i + 1].m39321b();
        }
        this.f2323c = constraintWidget;
        if (this.f2336p == 0 && this.f2337q) {
            this.f2325e = constraintWidget;
        } else {
            this.f2325e = this.f2321a;
        }
        if (!this.f2339s || !this.f2338r) {
            z = false;
        }
        this.f2340t = z;
    }

    /* renamed from: c */
    private static boolean m39323c(ConstraintWidget constraintWidget, int i) {
        int i2;
        return constraintWidget.m39416M() != 8 && constraintWidget.f2226M[i] == ConstraintWidget.EnumC0650b.MATCH_CONSTRAINT && ((i2 = constraintWidget.f2266n[i]) == 0 || i2 == 3);
    }

    /* renamed from: a */
    public void m39325a() {
        if (!this.f2342v) {
            m39324b();
        }
        this.f2342v = true;
    }
}