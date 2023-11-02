package p329s;

import androidx.constraintlayout.solver.widgets.C0654d;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;

/* renamed from: s.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class AbstractC12335m implements InterfaceC12323d {

    /* renamed from: a */
    public int f32165a;

    /* renamed from: b */
    ConstraintWidget f32166b;

    /* renamed from: c */
    C12332k f32167c;

    /* renamed from: d */
    protected ConstraintWidget.EnumC0650b f32168d;

    /* renamed from: e */
    C12327g f32169e = new C12327g(this);

    /* renamed from: f */
    public int f32170f = 0;

    /* renamed from: g */
    boolean f32171g = false;

    /* renamed from: h */
    public C12325f f32172h = new C12325f(this);

    /* renamed from: i */
    public C12325f f32173i = new C12325f(this);

    /* renamed from: j */
    protected EnumC12337b f32174j = EnumC12337b.NONE;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s.m$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static /* synthetic */ class C12336a {

        /* renamed from: a */
        static final /* synthetic */ int[] f32175a;

        static {
            int[] iArr = new int[C0654d.EnumC0656b.values().length];
            f32175a = iArr;
            try {
                iArr[C0654d.EnumC0656b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32175a[C0654d.EnumC0656b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32175a[C0654d.EnumC0656b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32175a[C0654d.EnumC0656b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32175a[C0654d.EnumC0656b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: s.m$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    enum EnumC12337b {
        NONE,
        START,
        END,
        CENTER
    }

    public AbstractC12335m(ConstraintWidget constraintWidget) {
        this.f32166b = constraintWidget;
    }

    /* renamed from: l */
    private void m5454l(int i, int i2) {
        AbstractC12335m abstractC12335m;
        float f;
        int i3;
        int i4 = this.f32165a;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        ConstraintWidget constraintWidget = this.f32166b;
                        AbstractC12335m abstractC12335m2 = constraintWidget.f2248e;
                        ConstraintWidget.EnumC0650b enumC0650b = abstractC12335m2.f32168d;
                        ConstraintWidget.EnumC0650b enumC0650b2 = ConstraintWidget.EnumC0650b.MATCH_CONSTRAINT;
                        if (enumC0650b == enumC0650b2 && abstractC12335m2.f32165a == 3) {
                            C12333l c12333l = constraintWidget.f2250f;
                            if (c12333l.f32168d == enumC0650b2 && c12333l.f32165a == 3) {
                                return;
                            }
                        }
                        if (i == 0) {
                            abstractC12335m2 = constraintWidget.f2250f;
                        }
                        if (abstractC12335m2.f32169e.f32139j) {
                            float m39376r = constraintWidget.m39376r();
                            if (i == 1) {
                                i3 = (int) ((abstractC12335m2.f32169e.f32136g / m39376r) + 0.5f);
                            } else {
                                i3 = (int) ((m39376r * abstractC12335m2.f32169e.f32136g) + 0.5f);
                            }
                            this.f32169e.mo5475d(i3);
                            return;
                        }
                        return;
                    }
                    return;
                }
                ConstraintWidget m39425E = this.f32166b.m39425E();
                if (m39425E != null) {
                    if (i == 0) {
                        abstractC12335m = m39425E.f2248e;
                    } else {
                        abstractC12335m = m39425E.f2250f;
                    }
                    C12327g c12327g = abstractC12335m.f32169e;
                    if (c12327g.f32139j) {
                        ConstraintWidget constraintWidget2 = this.f32166b;
                        if (i == 0) {
                            f = constraintWidget2.f2272q;
                        } else {
                            f = constraintWidget2.f2278t;
                        }
                        this.f32169e.mo5475d(m5459g((int) ((c12327g.f32136g * f) + 0.5f), i));
                        return;
                    }
                    return;
                }
                return;
            }
            this.f32169e.mo5475d(Math.min(m5459g(this.f32169e.f32151m, i), i2));
            return;
        }
        this.f32169e.mo5475d(m5459g(i2, i));
    }

    @Override // p329s.InterfaceC12323d
    /* renamed from: a */
    public void mo5465a(InterfaceC12323d interfaceC12323d) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final void m5464b(C12325f c12325f, C12325f c12325f2, int i) {
        c12325f.f32141l.add(c12325f2);
        c12325f.f32135f = i;
        c12325f2.f32140k.add(c12325f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final void m5463c(C12325f c12325f, C12325f c12325f2, int i, C12327g c12327g) {
        c12325f.f32141l.add(c12325f2);
        c12325f.f32141l.add(this.f32169e);
        c12325f.f32137h = i;
        c12325f.f32138i = c12327g;
        c12325f2.f32140k.add(c12325f);
        c12327g.f32140k.add(c12325f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo5462d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo5461e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract void mo5460f();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final int m5459g(int i, int i2) {
        int max;
        if (i2 == 0) {
            ConstraintWidget constraintWidget = this.f32166b;
            int i3 = constraintWidget.f2270p;
            max = Math.max(constraintWidget.f2268o, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.f32166b;
            int i4 = constraintWidget2.f2276s;
            max = Math.max(constraintWidget2.f2274r, i);
            if (i4 > 0) {
                max = Math.min(i4, i);
            }
            if (max == i) {
                return i;
            }
        }
        return max;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final C12325f m5458h(C0654d c0654d) {
        C0654d c0654d2 = c0654d.f2346d;
        if (c0654d2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = c0654d2.f2344b;
        int i = C12336a.f32175a[c0654d2.f2345c.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        return constraintWidget.f2250f.f32173i;
                    }
                    return constraintWidget.f2250f.f32162k;
                }
                return constraintWidget.f2250f.f32172h;
            }
            return constraintWidget.f2248e.f32173i;
        }
        return constraintWidget.f2248e.f32172h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final C12325f m5457i(C0654d c0654d, int i) {
        AbstractC12335m abstractC12335m;
        C0654d c0654d2 = c0654d.f2346d;
        if (c0654d2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = c0654d2.f2344b;
        if (i == 0) {
            abstractC12335m = constraintWidget.f2248e;
        } else {
            abstractC12335m = constraintWidget.f2250f;
        }
        int i2 = C12336a.f32175a[c0654d2.f2345c.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return abstractC12335m.f32173i;
        }
        return abstractC12335m.f32172h;
    }

    /* renamed from: j */
    public long mo5456j() {
        C12327g c12327g = this.f32169e;
        if (c12327g.f32139j) {
            return c12327g.f32136g;
        }
        return 0L;
    }

    /* renamed from: k */
    public boolean m5455k() {
        return this.f32171g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public abstract boolean mo5453m();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public void m5452n(InterfaceC12323d interfaceC12323d, C0654d c0654d, C0654d c0654d2, int i) {
        float m39420I;
        C12325f m5458h = m5458h(c0654d);
        C12325f m5458h2 = m5458h(c0654d2);
        if (m5458h.f32139j && m5458h2.f32139j) {
            int m39321b = m5458h.f32136g + c0654d.m39321b();
            int m39321b2 = m5458h2.f32136g - c0654d2.m39321b();
            int i2 = m39321b2 - m39321b;
            if (!this.f32169e.f32139j && this.f32168d == ConstraintWidget.EnumC0650b.MATCH_CONSTRAINT) {
                m5454l(i, i2);
            }
            C12327g c12327g = this.f32169e;
            if (!c12327g.f32139j) {
                return;
            }
            if (c12327g.f32136g == i2) {
                this.f32172h.mo5475d(m39321b);
                this.f32173i.mo5475d(m39321b2);
                return;
            }
            ConstraintWidget constraintWidget = this.f32166b;
            if (i == 0) {
                m39420I = constraintWidget.m39370u();
            } else {
                m39420I = constraintWidget.m39420I();
            }
            if (m5458h == m5458h2) {
                m39321b = m5458h.f32136g;
                m39321b2 = m5458h2.f32136g;
                m39420I = 0.5f;
            }
            this.f32172h.mo5475d((int) (m39321b + 0.5f + (((m39321b2 - m39321b) - this.f32169e.f32136g) * m39420I)));
            this.f32173i.mo5475d(this.f32172h.f32136g + this.f32169e.f32136g);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public void m5451o(InterfaceC12323d interfaceC12323d) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public void m5450p(InterfaceC12323d interfaceC12323d) {
    }
}
