package p329s;

import androidx.constraintlayout.solver.widgets.C0654d;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import p309r.InterfaceC12010a;
import p329s.AbstractC12335m;
import p329s.C12325f;

/* renamed from: s.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C12330j extends AbstractC12335m {

    /* renamed from: k */
    private static int[] f32152k = new int[2];

    /* renamed from: s.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static /* synthetic */ class C12331a {

        /* renamed from: a */
        static final /* synthetic */ int[] f32153a;

        static {
            int[] iArr = new int[AbstractC12335m.EnumC12337b.values().length];
            f32153a = iArr;
            try {
                iArr[AbstractC12335m.EnumC12337b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32153a[AbstractC12335m.EnumC12337b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32153a[AbstractC12335m.EnumC12337b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C12330j(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.f32172h.f32134e = C12325f.EnumC12326a.LEFT;
        this.f32173i.f32134e = C12325f.EnumC12326a.RIGHT;
        this.f32170f = 0;
    }

    /* renamed from: q */
    private void m5472q(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    iArr[0] = i6;
                    iArr[1] = (int) ((i6 * f) + 0.5f);
                    return;
                }
                return;
            }
            iArr[0] = (int) ((i7 * f) + 0.5f);
            iArr[1] = i7;
            return;
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x02b9, code lost:
        if (r14 != 1) goto L131;
     */
    @Override // p329s.AbstractC12335m, p329s.InterfaceC12323d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo5465a(p329s.InterfaceC12323d r17) {
        /*
            Method dump skipped, instructions count: 1087
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p329s.C12330j.mo5465a(s.d):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p329s.AbstractC12335m
    /* renamed from: d */
    public void mo5462d() {
        ConstraintWidget m39425E;
        ConstraintWidget m39425E2;
        ConstraintWidget constraintWidget = this.f32166b;
        if (constraintWidget.f2240a) {
            this.f32169e.mo5475d(constraintWidget.m39415N());
        }
        if (!this.f32169e.f32139j) {
            ConstraintWidget.EnumC0650b m39366w = this.f32166b.m39366w();
            this.f32168d = m39366w;
            if (m39366w != ConstraintWidget.EnumC0650b.MATCH_CONSTRAINT) {
                ConstraintWidget.EnumC0650b enumC0650b = ConstraintWidget.EnumC0650b.MATCH_PARENT;
                if (m39366w == enumC0650b && (((m39425E2 = this.f32166b.m39425E()) != null && m39425E2.m39366w() == ConstraintWidget.EnumC0650b.FIXED) || m39425E2.m39366w() == enumC0650b)) {
                    int m39415N = (m39425E2.m39415N() - this.f32166b.f2215B.m39321b()) - this.f32166b.f2217D.m39321b();
                    m5464b(this.f32172h, m39425E2.f2248e.f32172h, this.f32166b.f2215B.m39321b());
                    m5464b(this.f32173i, m39425E2.f2248e.f32173i, -this.f32166b.f2217D.m39321b());
                    this.f32169e.mo5475d(m39415N);
                    return;
                } else if (this.f32168d == ConstraintWidget.EnumC0650b.FIXED) {
                    this.f32169e.mo5475d(this.f32166b.m39415N());
                }
            }
        } else {
            ConstraintWidget.EnumC0650b enumC0650b2 = this.f32168d;
            ConstraintWidget.EnumC0650b enumC0650b3 = ConstraintWidget.EnumC0650b.MATCH_PARENT;
            if (enumC0650b2 == enumC0650b3 && (((m39425E = this.f32166b.m39425E()) != null && m39425E.m39366w() == ConstraintWidget.EnumC0650b.FIXED) || m39425E.m39366w() == enumC0650b3)) {
                m5464b(this.f32172h, m39425E.f2248e.f32172h, this.f32166b.f2215B.m39321b());
                m5464b(this.f32173i, m39425E.f2248e.f32173i, -this.f32166b.f2217D.m39321b());
                return;
            }
        }
        C12327g c12327g = this.f32169e;
        if (c12327g.f32139j) {
            ConstraintWidget constraintWidget2 = this.f32166b;
            if (constraintWidget2.f2240a) {
                C0654d[] c0654dArr = constraintWidget2.f2223J;
                C0654d c0654d = c0654dArr[0];
                C0654d c0654d2 = c0654d.f2346d;
                if (c0654d2 != null && c0654dArr[1].f2346d != null) {
                    if (constraintWidget2.m39409T()) {
                        this.f32172h.f32135f = this.f32166b.f2223J[0].m39321b();
                        this.f32173i.f32135f = -this.f32166b.f2223J[1].m39321b();
                        return;
                    }
                    C12325f m5458h = m5458h(this.f32166b.f2223J[0]);
                    if (m5458h != null) {
                        m5464b(this.f32172h, m5458h, this.f32166b.f2223J[0].m39321b());
                    }
                    C12325f m5458h2 = m5458h(this.f32166b.f2223J[1]);
                    if (m5458h2 != null) {
                        m5464b(this.f32173i, m5458h2, -this.f32166b.f2223J[1].m39321b());
                    }
                    this.f32172h.f32131b = true;
                    this.f32173i.f32131b = true;
                    return;
                } else if (c0654d2 != null) {
                    C12325f m5458h3 = m5458h(c0654d);
                    if (m5458h3 != null) {
                        m5464b(this.f32172h, m5458h3, this.f32166b.f2223J[0].m39321b());
                        m5464b(this.f32173i, this.f32172h, this.f32169e.f32136g);
                        return;
                    }
                    return;
                } else {
                    C0654d c0654d3 = c0654dArr[1];
                    if (c0654d3.f2346d != null) {
                        C12325f m5458h4 = m5458h(c0654d3);
                        if (m5458h4 != null) {
                            m5464b(this.f32173i, m5458h4, -this.f32166b.f2223J[1].m39321b());
                            m5464b(this.f32172h, this.f32173i, -this.f32169e.f32136g);
                            return;
                        }
                        return;
                    } else if (!(constraintWidget2 instanceof InterfaceC12010a) && constraintWidget2.m39425E() != null && this.f32166b.mo39299k(C0654d.EnumC0656b.CENTER).f2346d == null) {
                        m5464b(this.f32172h, this.f32166b.m39425E().f2248e.f32172h, this.f32166b.m39414O());
                        m5464b(this.f32173i, this.f32172h, this.f32169e.f32136g);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (this.f32168d == ConstraintWidget.EnumC0650b.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget3 = this.f32166b;
            int i = constraintWidget3.f2262l;
            if (i != 2) {
                if (i == 3) {
                    if (constraintWidget3.f2264m == 3) {
                        this.f32172h.f32130a = this;
                        this.f32173i.f32130a = this;
                        C12333l c12333l = constraintWidget3.f2250f;
                        c12333l.f32172h.f32130a = this;
                        c12333l.f32173i.f32130a = this;
                        c12327g.f32130a = this;
                        if (constraintWidget3.m39407V()) {
                            this.f32169e.f32141l.add(this.f32166b.f2250f.f32169e);
                            this.f32166b.f2250f.f32169e.f32140k.add(this.f32169e);
                            C12333l c12333l2 = this.f32166b.f2250f;
                            c12333l2.f32169e.f32130a = this;
                            this.f32169e.f32141l.add(c12333l2.f32172h);
                            this.f32169e.f32141l.add(this.f32166b.f2250f.f32173i);
                            this.f32166b.f2250f.f32172h.f32140k.add(this.f32169e);
                            this.f32166b.f2250f.f32173i.f32140k.add(this.f32169e);
                        } else if (this.f32166b.m39409T()) {
                            this.f32166b.f2250f.f32169e.f32141l.add(this.f32169e);
                            this.f32169e.f32140k.add(this.f32166b.f2250f.f32169e);
                        } else {
                            this.f32166b.f2250f.f32169e.f32141l.add(this.f32169e);
                        }
                    } else {
                        C12327g c12327g2 = constraintWidget3.f2250f.f32169e;
                        c12327g.f32141l.add(c12327g2);
                        c12327g2.f32140k.add(this.f32169e);
                        this.f32166b.f2250f.f32172h.f32140k.add(this.f32169e);
                        this.f32166b.f2250f.f32173i.f32140k.add(this.f32169e);
                        C12327g c12327g3 = this.f32169e;
                        c12327g3.f32131b = true;
                        c12327g3.f32140k.add(this.f32172h);
                        this.f32169e.f32140k.add(this.f32173i);
                        this.f32172h.f32141l.add(this.f32169e);
                        this.f32173i.f32141l.add(this.f32169e);
                    }
                }
            } else {
                ConstraintWidget m39425E3 = constraintWidget3.m39425E();
                if (m39425E3 != null) {
                    C12327g c12327g4 = m39425E3.f2250f.f32169e;
                    this.f32169e.f32141l.add(c12327g4);
                    c12327g4.f32140k.add(this.f32169e);
                    C12327g c12327g5 = this.f32169e;
                    c12327g5.f32131b = true;
                    c12327g5.f32140k.add(this.f32172h);
                    this.f32169e.f32140k.add(this.f32173i);
                }
            }
        }
        ConstraintWidget constraintWidget4 = this.f32166b;
        C0654d[] c0654dArr2 = constraintWidget4.f2223J;
        C0654d c0654d4 = c0654dArr2[0];
        C0654d c0654d5 = c0654d4.f2346d;
        if (c0654d5 != null && c0654dArr2[1].f2346d != null) {
            if (constraintWidget4.m39409T()) {
                this.f32172h.f32135f = this.f32166b.f2223J[0].m39321b();
                this.f32173i.f32135f = -this.f32166b.f2223J[1].m39321b();
                return;
            }
            C12325f m5458h5 = m5458h(this.f32166b.f2223J[0]);
            C12325f m5458h6 = m5458h(this.f32166b.f2223J[1]);
            m5458h5.m5477b(this);
            m5458h6.m5477b(this);
            this.f32174j = AbstractC12335m.EnumC12337b.CENTER;
        } else if (c0654d5 != null) {
            C12325f m5458h7 = m5458h(c0654d4);
            if (m5458h7 != null) {
                m5464b(this.f32172h, m5458h7, this.f32166b.f2223J[0].m39321b());
                m5463c(this.f32173i, this.f32172h, 1, this.f32169e);
            }
        } else {
            C0654d c0654d6 = c0654dArr2[1];
            if (c0654d6.f2346d != null) {
                C12325f m5458h8 = m5458h(c0654d6);
                if (m5458h8 != null) {
                    m5464b(this.f32173i, m5458h8, -this.f32166b.f2223J[1].m39321b());
                    m5463c(this.f32172h, this.f32173i, -1, this.f32169e);
                }
            } else if (!(constraintWidget4 instanceof InterfaceC12010a) && constraintWidget4.m39425E() != null) {
                m5464b(this.f32172h, this.f32166b.m39425E().f2248e.f32172h, this.f32166b.m39414O());
                m5463c(this.f32173i, this.f32172h, 1, this.f32169e);
            }
        }
    }

    @Override // p329s.AbstractC12335m
    /* renamed from: e */
    public void mo5461e() {
        C12325f c12325f = this.f32172h;
        if (c12325f.f32139j) {
            this.f32166b.m39428C0(c12325f.f32136g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p329s.AbstractC12335m
    /* renamed from: f */
    public void mo5460f() {
        this.f32167c = null;
        this.f32172h.m5476c();
        this.f32173i.m5476c();
        this.f32169e.m5476c();
        this.f32171g = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p329s.AbstractC12335m
    /* renamed from: m */
    public boolean mo5453m() {
        if (this.f32168d != ConstraintWidget.EnumC0650b.MATCH_CONSTRAINT || this.f32166b.f2262l == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m5471r() {
        this.f32171g = false;
        this.f32172h.m5476c();
        this.f32172h.f32139j = false;
        this.f32173i.m5476c();
        this.f32173i.f32139j = false;
        this.f32169e.f32139j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f32166b.m39380p();
    }
}
