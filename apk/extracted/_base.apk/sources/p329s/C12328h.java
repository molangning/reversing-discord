package p329s;

import androidx.constraintlayout.solver.widgets.C0657e;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: s.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C12328h extends AbstractC12335m {
    public C12328h(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        constraintWidget.f2248e.mo5460f();
        constraintWidget.f2250f.mo5460f();
        this.f32170f = ((C0657e) constraintWidget).m39309H0();
    }

    /* renamed from: q */
    private void m5474q(C12325f c12325f) {
        this.f32172h.f32140k.add(c12325f);
        c12325f.f32141l.add(this.f32172h);
    }

    @Override // p329s.AbstractC12335m, p329s.InterfaceC12323d
    /* renamed from: a */
    public void mo5465a(InterfaceC12323d interfaceC12323d) {
        C12325f c12325f = this.f32172h;
        if (!c12325f.f32132c || c12325f.f32139j) {
            return;
        }
        this.f32172h.mo5475d((int) ((c12325f.f32141l.get(0).f32136g * ((C0657e) this.f32166b).m39306K0()) + 0.5f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p329s.AbstractC12335m
    /* renamed from: d */
    public void mo5462d() {
        C0657e c0657e = (C0657e) this.f32166b;
        int m39308I0 = c0657e.m39308I0();
        int m39307J0 = c0657e.m39307J0();
        c0657e.m39306K0();
        if (c0657e.m39309H0() == 1) {
            if (m39308I0 != -1) {
                this.f32172h.f32141l.add(this.f32166b.f2227N.f2248e.f32172h);
                this.f32166b.f2227N.f2248e.f32172h.f32140k.add(this.f32172h);
                this.f32172h.f32135f = m39308I0;
            } else if (m39307J0 != -1) {
                this.f32172h.f32141l.add(this.f32166b.f2227N.f2248e.f32173i);
                this.f32166b.f2227N.f2248e.f32173i.f32140k.add(this.f32172h);
                this.f32172h.f32135f = -m39307J0;
            } else {
                C12325f c12325f = this.f32172h;
                c12325f.f32131b = true;
                c12325f.f32141l.add(this.f32166b.f2227N.f2248e.f32173i);
                this.f32166b.f2227N.f2248e.f32173i.f32140k.add(this.f32172h);
            }
            m5474q(this.f32166b.f2248e.f32172h);
            m5474q(this.f32166b.f2248e.f32173i);
            return;
        }
        if (m39308I0 != -1) {
            this.f32172h.f32141l.add(this.f32166b.f2227N.f2250f.f32172h);
            this.f32166b.f2227N.f2250f.f32172h.f32140k.add(this.f32172h);
            this.f32172h.f32135f = m39308I0;
        } else if (m39307J0 != -1) {
            this.f32172h.f32141l.add(this.f32166b.f2227N.f2250f.f32173i);
            this.f32166b.f2227N.f2250f.f32173i.f32140k.add(this.f32172h);
            this.f32172h.f32135f = -m39307J0;
        } else {
            C12325f c12325f2 = this.f32172h;
            c12325f2.f32131b = true;
            c12325f2.f32141l.add(this.f32166b.f2227N.f2250f.f32173i);
            this.f32166b.f2227N.f2250f.f32173i.f32140k.add(this.f32172h);
        }
        m5474q(this.f32166b.f2250f.f32172h);
        m5474q(this.f32166b.f2250f.f32173i);
    }

    @Override // p329s.AbstractC12335m
    /* renamed from: e */
    public void mo5461e() {
        if (((C0657e) this.f32166b).m39309H0() == 1) {
            this.f32166b.m39428C0(this.f32172h.f32136g);
        } else {
            this.f32166b.m39426D0(this.f32172h.f32136g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p329s.AbstractC12335m
    /* renamed from: f */
    public void mo5460f() {
        this.f32172h.m5476c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p329s.AbstractC12335m
    /* renamed from: m */
    public boolean mo5453m() {
        return false;
    }
}
