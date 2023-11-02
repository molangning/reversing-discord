package p329s;

import androidx.constraintlayout.solver.widgets.C0651a;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import p329s.C12325f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: s.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C12329i extends AbstractC12335m {
    public C12329i(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    /* renamed from: q */
    private void m5473q(C12325f c12325f) {
        this.f32172h.f32140k.add(c12325f);
        c12325f.f32141l.add(this.f32172h);
    }

    @Override // p329s.AbstractC12335m, p329s.InterfaceC12323d
    /* renamed from: a */
    public void mo5465a(InterfaceC12323d interfaceC12323d) {
        C0651a c0651a = (C0651a) this.f32166b;
        int m39333I0 = c0651a.m39333I0();
        int i = 0;
        int i2 = -1;
        for (C12325f c12325f : this.f32172h.f32141l) {
            int i3 = c12325f.f32136g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (m39333I0 != 0 && m39333I0 != 2) {
            this.f32172h.mo5475d(i + c0651a.m39332J0());
        } else {
            this.f32172h.mo5475d(i2 + c0651a.m39332J0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p329s.AbstractC12335m
    /* renamed from: d */
    public void mo5462d() {
        ConstraintWidget constraintWidget = this.f32166b;
        if (constraintWidget instanceof C0651a) {
            this.f32172h.f32131b = true;
            C0651a c0651a = (C0651a) constraintWidget;
            int m39333I0 = c0651a.m39333I0();
            boolean m39334H0 = c0651a.m39334H0();
            int i = 0;
            if (m39333I0 != 0) {
                if (m39333I0 != 1) {
                    if (m39333I0 != 2) {
                        if (m39333I0 == 3) {
                            this.f32172h.f32134e = C12325f.EnumC12326a.BOTTOM;
                            while (i < c0651a.f31008x0) {
                                ConstraintWidget constraintWidget2 = c0651a.f31007w0[i];
                                if (m39334H0 || constraintWidget2.m39416M() != 8) {
                                    C12325f c12325f = constraintWidget2.f2250f.f32173i;
                                    c12325f.f32140k.add(this.f32172h);
                                    this.f32172h.f32141l.add(c12325f);
                                }
                                i++;
                            }
                            m5473q(this.f32166b.f2250f.f32172h);
                            m5473q(this.f32166b.f2250f.f32173i);
                            return;
                        }
                        return;
                    }
                    this.f32172h.f32134e = C12325f.EnumC12326a.TOP;
                    while (i < c0651a.f31008x0) {
                        ConstraintWidget constraintWidget3 = c0651a.f31007w0[i];
                        if (m39334H0 || constraintWidget3.m39416M() != 8) {
                            C12325f c12325f2 = constraintWidget3.f2250f.f32172h;
                            c12325f2.f32140k.add(this.f32172h);
                            this.f32172h.f32141l.add(c12325f2);
                        }
                        i++;
                    }
                    m5473q(this.f32166b.f2250f.f32172h);
                    m5473q(this.f32166b.f2250f.f32173i);
                    return;
                }
                this.f32172h.f32134e = C12325f.EnumC12326a.RIGHT;
                while (i < c0651a.f31008x0) {
                    ConstraintWidget constraintWidget4 = c0651a.f31007w0[i];
                    if (m39334H0 || constraintWidget4.m39416M() != 8) {
                        C12325f c12325f3 = constraintWidget4.f2248e.f32173i;
                        c12325f3.f32140k.add(this.f32172h);
                        this.f32172h.f32141l.add(c12325f3);
                    }
                    i++;
                }
                m5473q(this.f32166b.f2248e.f32172h);
                m5473q(this.f32166b.f2248e.f32173i);
                return;
            }
            this.f32172h.f32134e = C12325f.EnumC12326a.LEFT;
            while (i < c0651a.f31008x0) {
                ConstraintWidget constraintWidget5 = c0651a.f31007w0[i];
                if (m39334H0 || constraintWidget5.m39416M() != 8) {
                    C12325f c12325f4 = constraintWidget5.f2248e.f32172h;
                    c12325f4.f32140k.add(this.f32172h);
                    this.f32172h.f32141l.add(c12325f4);
                }
                i++;
            }
            m5473q(this.f32166b.f2248e.f32172h);
            m5473q(this.f32166b.f2248e.f32173i);
        }
    }

    @Override // p329s.AbstractC12335m
    /* renamed from: e */
    public void mo5461e() {
        ConstraintWidget constraintWidget = this.f32166b;
        if (constraintWidget instanceof C0651a) {
            int m39333I0 = ((C0651a) constraintWidget).m39333I0();
            if (m39333I0 != 0 && m39333I0 != 1) {
                this.f32166b.m39426D0(this.f32172h.f32136g);
            } else {
                this.f32166b.m39428C0(this.f32172h.f32136g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p329s.AbstractC12335m
    /* renamed from: f */
    public void mo5460f() {
        this.f32167c = null;
        this.f32172h.m5476c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p329s.AbstractC12335m
    /* renamed from: m */
    public boolean mo5453m() {
        return false;
    }
}
