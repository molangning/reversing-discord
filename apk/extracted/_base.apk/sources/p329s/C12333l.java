package p329s;

import androidx.constraintlayout.solver.widgets.C0654d;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import p309r.InterfaceC12010a;
import p329s.AbstractC12335m;
import p329s.C12325f;

/* renamed from: s.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C12333l extends AbstractC12335m {

    /* renamed from: k */
    public C12325f f32162k;

    /* renamed from: l */
    C12327g f32163l;

    /* renamed from: s.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static /* synthetic */ class C12334a {

        /* renamed from: a */
        static final /* synthetic */ int[] f32164a;

        static {
            int[] iArr = new int[AbstractC12335m.EnumC12337b.values().length];
            f32164a = iArr;
            try {
                iArr[AbstractC12335m.EnumC12337b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32164a[AbstractC12335m.EnumC12337b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32164a[AbstractC12335m.EnumC12337b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C12333l(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        C12325f c12325f = new C12325f(this);
        this.f32162k = c12325f;
        this.f32163l = null;
        this.f32172h.f32134e = C12325f.EnumC12326a.TOP;
        this.f32173i.f32134e = C12325f.EnumC12326a.BOTTOM;
        c12325f.f32134e = C12325f.EnumC12326a.BASELINE;
        this.f32170f = 1;
    }

    @Override // p329s.AbstractC12335m, p329s.InterfaceC12323d
    /* renamed from: a */
    public void mo5465a(InterfaceC12323d interfaceC12323d) {
        C12327g c12327g;
        float f;
        float m39376r;
        float f2;
        int i;
        ConstraintWidget constraintWidget;
        int i2 = C12334a.f32164a[this.f32174j.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    ConstraintWidget constraintWidget2 = this.f32166b;
                    m5452n(interfaceC12323d, constraintWidget2.f2216C, constraintWidget2.f2218E, 1);
                    return;
                }
            } else {
                m5451o(interfaceC12323d);
            }
        } else {
            m5450p(interfaceC12323d);
        }
        C12327g c12327g2 = this.f32169e;
        if (c12327g2.f32132c && !c12327g2.f32139j && this.f32168d == ConstraintWidget.EnumC0650b.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget3 = this.f32166b;
            int i3 = constraintWidget3.f2264m;
            if (i3 != 2) {
                if (i3 == 3 && constraintWidget3.f2248e.f32169e.f32139j) {
                    int m39374s = constraintWidget3.m39374s();
                    if (m39374s != -1) {
                        if (m39374s != 0) {
                            if (m39374s != 1) {
                                i = 0;
                                this.f32169e.mo5475d(i);
                            } else {
                                ConstraintWidget constraintWidget4 = this.f32166b;
                                f = constraintWidget4.f2248e.f32169e.f32136g;
                                m39376r = constraintWidget4.m39376r();
                            }
                        } else {
                            f2 = constraintWidget.f2248e.f32169e.f32136g * this.f32166b.m39376r();
                            i = (int) (f2 + 0.5f);
                            this.f32169e.mo5475d(i);
                        }
                    } else {
                        ConstraintWidget constraintWidget5 = this.f32166b;
                        f = constraintWidget5.f2248e.f32169e.f32136g;
                        m39376r = constraintWidget5.m39376r();
                    }
                    f2 = f / m39376r;
                    i = (int) (f2 + 0.5f);
                    this.f32169e.mo5475d(i);
                }
            } else {
                ConstraintWidget m39425E = constraintWidget3.m39425E();
                if (m39425E != null) {
                    if (m39425E.f2250f.f32169e.f32139j) {
                        this.f32169e.mo5475d((int) ((c12327g.f32136g * this.f32166b.f2278t) + 0.5f));
                    }
                }
            }
        }
        C12325f c12325f = this.f32172h;
        if (c12325f.f32132c) {
            C12325f c12325f2 = this.f32173i;
            if (c12325f2.f32132c) {
                if (c12325f.f32139j && c12325f2.f32139j && this.f32169e.f32139j) {
                    return;
                }
                if (!this.f32169e.f32139j && this.f32168d == ConstraintWidget.EnumC0650b.MATCH_CONSTRAINT) {
                    ConstraintWidget constraintWidget6 = this.f32166b;
                    if (constraintWidget6.f2262l == 0 && !constraintWidget6.m39407V()) {
                        int i4 = this.f32172h.f32141l.get(0).f32136g;
                        C12325f c12325f3 = this.f32172h;
                        int i5 = i4 + c12325f3.f32135f;
                        int i6 = this.f32173i.f32141l.get(0).f32136g + this.f32173i.f32135f;
                        c12325f3.mo5475d(i5);
                        this.f32173i.mo5475d(i6);
                        this.f32169e.mo5475d(i6 - i5);
                        return;
                    }
                }
                if (!this.f32169e.f32139j && this.f32168d == ConstraintWidget.EnumC0650b.MATCH_CONSTRAINT && this.f32165a == 1 && this.f32172h.f32141l.size() > 0 && this.f32173i.f32141l.size() > 0) {
                    int i7 = (this.f32173i.f32141l.get(0).f32136g + this.f32173i.f32135f) - (this.f32172h.f32141l.get(0).f32136g + this.f32172h.f32135f);
                    C12327g c12327g3 = this.f32169e;
                    int i8 = c12327g3.f32151m;
                    if (i7 < i8) {
                        c12327g3.mo5475d(i7);
                    } else {
                        c12327g3.mo5475d(i8);
                    }
                }
                if (this.f32169e.f32139j && this.f32172h.f32141l.size() > 0 && this.f32173i.f32141l.size() > 0) {
                    C12325f c12325f4 = this.f32172h.f32141l.get(0);
                    C12325f c12325f5 = this.f32173i.f32141l.get(0);
                    int i9 = c12325f4.f32136g + this.f32172h.f32135f;
                    int i10 = c12325f5.f32136g + this.f32173i.f32135f;
                    float m39420I = this.f32166b.m39420I();
                    if (c12325f4 == c12325f5) {
                        i9 = c12325f4.f32136g;
                        i10 = c12325f5.f32136g;
                        m39420I = 0.5f;
                    }
                    this.f32172h.mo5475d((int) (i9 + 0.5f + (((i10 - i9) - this.f32169e.f32136g) * m39420I)));
                    this.f32173i.mo5475d(this.f32172h.f32136g + this.f32169e.f32136g);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p329s.AbstractC12335m
    /* renamed from: d */
    public void mo5462d() {
        ConstraintWidget m39425E;
        ConstraintWidget m39425E2;
        ConstraintWidget constraintWidget = this.f32166b;
        if (constraintWidget.f2240a) {
            this.f32169e.mo5475d(constraintWidget.m39372t());
        }
        if (!this.f32169e.f32139j) {
            this.f32168d = this.f32166b.m39418K();
            if (this.f32166b.m39412Q()) {
                this.f32163l = new C12318a(this);
            }
            ConstraintWidget.EnumC0650b enumC0650b = this.f32168d;
            if (enumC0650b != ConstraintWidget.EnumC0650b.MATCH_CONSTRAINT) {
                if (enumC0650b == ConstraintWidget.EnumC0650b.MATCH_PARENT && (m39425E2 = this.f32166b.m39425E()) != null && m39425E2.m39418K() == ConstraintWidget.EnumC0650b.FIXED) {
                    int m39372t = (m39425E2.m39372t() - this.f32166b.f2216C.m39321b()) - this.f32166b.f2218E.m39321b();
                    m5464b(this.f32172h, m39425E2.f2250f.f32172h, this.f32166b.f2216C.m39321b());
                    m5464b(this.f32173i, m39425E2.f2250f.f32173i, -this.f32166b.f2218E.m39321b());
                    this.f32169e.mo5475d(m39372t);
                    return;
                } else if (this.f32168d == ConstraintWidget.EnumC0650b.FIXED) {
                    this.f32169e.mo5475d(this.f32166b.m39372t());
                }
            }
        } else if (this.f32168d == ConstraintWidget.EnumC0650b.MATCH_PARENT && (m39425E = this.f32166b.m39425E()) != null && m39425E.m39418K() == ConstraintWidget.EnumC0650b.FIXED) {
            m5464b(this.f32172h, m39425E.f2250f.f32172h, this.f32166b.f2216C.m39321b());
            m5464b(this.f32173i, m39425E.f2250f.f32173i, -this.f32166b.f2218E.m39321b());
            return;
        }
        C12327g c12327g = this.f32169e;
        boolean z = c12327g.f32139j;
        if (z) {
            ConstraintWidget constraintWidget2 = this.f32166b;
            if (constraintWidget2.f2240a) {
                C0654d[] c0654dArr = constraintWidget2.f2223J;
                C0654d c0654d = c0654dArr[2];
                C0654d c0654d2 = c0654d.f2346d;
                if (c0654d2 != null && c0654dArr[3].f2346d != null) {
                    if (constraintWidget2.m39407V()) {
                        this.f32172h.f32135f = this.f32166b.f2223J[2].m39321b();
                        this.f32173i.f32135f = -this.f32166b.f2223J[3].m39321b();
                    } else {
                        C12325f m5458h = m5458h(this.f32166b.f2223J[2]);
                        if (m5458h != null) {
                            m5464b(this.f32172h, m5458h, this.f32166b.f2223J[2].m39321b());
                        }
                        C12325f m5458h2 = m5458h(this.f32166b.f2223J[3]);
                        if (m5458h2 != null) {
                            m5464b(this.f32173i, m5458h2, -this.f32166b.f2223J[3].m39321b());
                        }
                        this.f32172h.f32131b = true;
                        this.f32173i.f32131b = true;
                    }
                    if (this.f32166b.m39412Q()) {
                        m5464b(this.f32162k, this.f32172h, this.f32166b.m39388l());
                        return;
                    }
                    return;
                } else if (c0654d2 != null) {
                    C12325f m5458h3 = m5458h(c0654d);
                    if (m5458h3 != null) {
                        m5464b(this.f32172h, m5458h3, this.f32166b.f2223J[2].m39321b());
                        m5464b(this.f32173i, this.f32172h, this.f32169e.f32136g);
                        if (this.f32166b.m39412Q()) {
                            m5464b(this.f32162k, this.f32172h, this.f32166b.m39388l());
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    C0654d c0654d3 = c0654dArr[3];
                    if (c0654d3.f2346d != null) {
                        C12325f m5458h4 = m5458h(c0654d3);
                        if (m5458h4 != null) {
                            m5464b(this.f32173i, m5458h4, -this.f32166b.f2223J[3].m39321b());
                            m5464b(this.f32172h, this.f32173i, -this.f32169e.f32136g);
                        }
                        if (this.f32166b.m39412Q()) {
                            m5464b(this.f32162k, this.f32172h, this.f32166b.m39388l());
                            return;
                        }
                        return;
                    }
                    C0654d c0654d4 = c0654dArr[4];
                    if (c0654d4.f2346d != null) {
                        C12325f m5458h5 = m5458h(c0654d4);
                        if (m5458h5 != null) {
                            m5464b(this.f32162k, m5458h5, 0);
                            m5464b(this.f32172h, this.f32162k, -this.f32166b.m39388l());
                            m5464b(this.f32173i, this.f32172h, this.f32169e.f32136g);
                            return;
                        }
                        return;
                    } else if (!(constraintWidget2 instanceof InterfaceC12010a) && constraintWidget2.m39425E() != null && this.f32166b.mo39299k(C0654d.EnumC0656b.CENTER).f2346d == null) {
                        m5464b(this.f32172h, this.f32166b.m39425E().f2250f.f32172h, this.f32166b.m39413P());
                        m5464b(this.f32173i, this.f32172h, this.f32169e.f32136g);
                        if (this.f32166b.m39412Q()) {
                            m5464b(this.f32162k, this.f32172h, this.f32166b.m39388l());
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (!z && this.f32168d == ConstraintWidget.EnumC0650b.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget3 = this.f32166b;
            int i = constraintWidget3.f2264m;
            if (i != 2) {
                if (i == 3 && !constraintWidget3.m39407V()) {
                    ConstraintWidget constraintWidget4 = this.f32166b;
                    if (constraintWidget4.f2262l != 3) {
                        C12327g c12327g2 = constraintWidget4.f2248e.f32169e;
                        this.f32169e.f32141l.add(c12327g2);
                        c12327g2.f32140k.add(this.f32169e);
                        C12327g c12327g3 = this.f32169e;
                        c12327g3.f32131b = true;
                        c12327g3.f32140k.add(this.f32172h);
                        this.f32169e.f32140k.add(this.f32173i);
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
        } else {
            c12327g.m5477b(this);
        }
        ConstraintWidget constraintWidget5 = this.f32166b;
        C0654d[] c0654dArr2 = constraintWidget5.f2223J;
        C0654d c0654d5 = c0654dArr2[2];
        C0654d c0654d6 = c0654d5.f2346d;
        if (c0654d6 != null && c0654dArr2[3].f2346d != null) {
            if (constraintWidget5.m39407V()) {
                this.f32172h.f32135f = this.f32166b.f2223J[2].m39321b();
                this.f32173i.f32135f = -this.f32166b.f2223J[3].m39321b();
            } else {
                C12325f m5458h6 = m5458h(this.f32166b.f2223J[2]);
                C12325f m5458h7 = m5458h(this.f32166b.f2223J[3]);
                m5458h6.m5477b(this);
                m5458h7.m5477b(this);
                this.f32174j = AbstractC12335m.EnumC12337b.CENTER;
            }
            if (this.f32166b.m39412Q()) {
                m5463c(this.f32162k, this.f32172h, 1, this.f32163l);
            }
        } else if (c0654d6 != null) {
            C12325f m5458h8 = m5458h(c0654d5);
            if (m5458h8 != null) {
                m5464b(this.f32172h, m5458h8, this.f32166b.f2223J[2].m39321b());
                m5463c(this.f32173i, this.f32172h, 1, this.f32169e);
                if (this.f32166b.m39412Q()) {
                    m5463c(this.f32162k, this.f32172h, 1, this.f32163l);
                }
                ConstraintWidget.EnumC0650b enumC0650b2 = this.f32168d;
                ConstraintWidget.EnumC0650b enumC0650b3 = ConstraintWidget.EnumC0650b.MATCH_CONSTRAINT;
                if (enumC0650b2 == enumC0650b3 && this.f32166b.m39376r() > 0.0f) {
                    C12330j c12330j = this.f32166b.f2248e;
                    if (c12330j.f32168d == enumC0650b3) {
                        c12330j.f32169e.f32140k.add(this.f32169e);
                        this.f32169e.f32141l.add(this.f32166b.f2248e.f32169e);
                        this.f32169e.f32130a = this;
                    }
                }
            }
        } else {
            C0654d c0654d7 = c0654dArr2[3];
            if (c0654d7.f2346d != null) {
                C12325f m5458h9 = m5458h(c0654d7);
                if (m5458h9 != null) {
                    m5464b(this.f32173i, m5458h9, -this.f32166b.f2223J[3].m39321b());
                    m5463c(this.f32172h, this.f32173i, -1, this.f32169e);
                    if (this.f32166b.m39412Q()) {
                        m5463c(this.f32162k, this.f32172h, 1, this.f32163l);
                    }
                }
            } else {
                C0654d c0654d8 = c0654dArr2[4];
                if (c0654d8.f2346d != null) {
                    C12325f m5458h10 = m5458h(c0654d8);
                    if (m5458h10 != null) {
                        m5464b(this.f32162k, m5458h10, 0);
                        m5463c(this.f32172h, this.f32162k, -1, this.f32163l);
                        m5463c(this.f32173i, this.f32172h, 1, this.f32169e);
                    }
                } else if (!(constraintWidget5 instanceof InterfaceC12010a) && constraintWidget5.m39425E() != null) {
                    m5464b(this.f32172h, this.f32166b.m39425E().f2250f.f32172h, this.f32166b.m39413P());
                    m5463c(this.f32173i, this.f32172h, 1, this.f32169e);
                    if (this.f32166b.m39412Q()) {
                        m5463c(this.f32162k, this.f32172h, 1, this.f32163l);
                    }
                    ConstraintWidget.EnumC0650b enumC0650b4 = this.f32168d;
                    ConstraintWidget.EnumC0650b enumC0650b5 = ConstraintWidget.EnumC0650b.MATCH_CONSTRAINT;
                    if (enumC0650b4 == enumC0650b5 && this.f32166b.m39376r() > 0.0f) {
                        C12330j c12330j2 = this.f32166b.f2248e;
                        if (c12330j2.f32168d == enumC0650b5) {
                            c12330j2.f32169e.f32140k.add(this.f32169e);
                            this.f32169e.f32141l.add(this.f32166b.f2248e.f32169e);
                            this.f32169e.f32130a = this;
                        }
                    }
                }
            }
        }
        if (this.f32169e.f32141l.size() == 0) {
            this.f32169e.f32132c = true;
        }
    }

    @Override // p329s.AbstractC12335m
    /* renamed from: e */
    public void mo5461e() {
        C12325f c12325f = this.f32172h;
        if (c12325f.f32139j) {
            this.f32166b.m39426D0(c12325f.f32136g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p329s.AbstractC12335m
    /* renamed from: f */
    public void mo5460f() {
        this.f32167c = null;
        this.f32172h.m5476c();
        this.f32173i.m5476c();
        this.f32162k.m5476c();
        this.f32169e.m5476c();
        this.f32171g = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p329s.AbstractC12335m
    /* renamed from: m */
    public boolean mo5453m() {
        if (this.f32168d != ConstraintWidget.EnumC0650b.MATCH_CONSTRAINT || this.f32166b.f2264m == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m5466q() {
        this.f32171g = false;
        this.f32172h.m5476c();
        this.f32172h.f32139j = false;
        this.f32173i.m5476c();
        this.f32173i.f32139j = false;
        this.f32162k.m5476c();
        this.f32162k.f32139j = false;
        this.f32169e.f32139j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f32166b.m39380p();
    }
}
