package p329s;

import androidx.constraintlayout.solver.widgets.C0654d;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: s.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C12322c extends AbstractC12335m {

    /* renamed from: k */
    ArrayList<AbstractC12335m> f32119k;

    /* renamed from: l */
    private int f32120l;

    public C12322c(ConstraintWidget constraintWidget, int i) {
        super(constraintWidget);
        this.f32119k = new ArrayList<>();
        this.f32170f = i;
        m5494q();
    }

    /* renamed from: q */
    private void m5494q() {
        ConstraintWidget constraintWidget;
        boolean z;
        int m39419J;
        ConstraintWidget constraintWidget2 = this.f32166b;
        ConstraintWidget m39423F = constraintWidget2.m39423F(this.f32170f);
        while (true) {
            ConstraintWidget constraintWidget3 = m39423F;
            constraintWidget = constraintWidget2;
            constraintWidget2 = constraintWidget3;
            if (constraintWidget2 == null) {
                break;
            }
            m39423F = constraintWidget2.m39423F(this.f32170f);
        }
        this.f32166b = constraintWidget;
        this.f32119k.add(constraintWidget.m39421H(this.f32170f));
        ConstraintWidget m39427D = constraintWidget.m39427D(this.f32170f);
        while (m39427D != null) {
            this.f32119k.add(m39427D.m39421H(this.f32170f));
            m39427D = m39427D.m39427D(this.f32170f);
        }
        Iterator<AbstractC12335m> it = this.f32119k.iterator();
        while (it.hasNext()) {
            AbstractC12335m next = it.next();
            int i = this.f32170f;
            if (i == 0) {
                next.f32166b.f2244c = this;
            } else if (i == 1) {
                next.f32166b.f2246d = this;
            }
        }
        if (this.f32170f == 0 && ((ConstraintWidgetContainer) this.f32166b.m39425E()).m39344X0()) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.f32119k.size() > 1) {
            ArrayList<AbstractC12335m> arrayList = this.f32119k;
            this.f32166b = arrayList.get(arrayList.size() - 1).f32166b;
        }
        if (this.f32170f == 0) {
            m39419J = this.f32166b.m39368v();
        } else {
            m39419J = this.f32166b.m39419J();
        }
        this.f32120l = m39419J;
    }

    /* renamed from: r */
    private ConstraintWidget m5493r() {
        for (int i = 0; i < this.f32119k.size(); i++) {
            AbstractC12335m abstractC12335m = this.f32119k.get(i);
            if (abstractC12335m.f32166b.m39416M() != 8) {
                return abstractC12335m.f32166b;
            }
        }
        return null;
    }

    /* renamed from: s */
    private ConstraintWidget m5492s() {
        for (int size = this.f32119k.size() - 1; size >= 0; size--) {
            AbstractC12335m abstractC12335m = this.f32119k.get(size);
            if (abstractC12335m.f32166b.m39416M() != 8) {
                return abstractC12335m.f32166b;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:447:0x01a5, code lost:
        if (r1 != r7) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x01cb, code lost:
        if (r1 != r7) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x01cd, code lost:
        r13 = r13 + 1;
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x01d0, code lost:
        r9.f32169e.mo5475d(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x0418, code lost:
        r7 = r7 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:401:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x00eb  */
    @Override // p329s.AbstractC12335m, p329s.InterfaceC12323d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo5465a(p329s.InterfaceC12323d r26) {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p329s.C12322c.mo5465a(s.d):void");
    }

    @Override // p329s.AbstractC12335m
    /* renamed from: d */
    public void mo5462d() {
        Iterator<AbstractC12335m> it = this.f32119k.iterator();
        while (it.hasNext()) {
            it.next().mo5462d();
        }
        int size = this.f32119k.size();
        if (size < 1) {
            return;
        }
        ConstraintWidget constraintWidget = this.f32119k.get(0).f32166b;
        ConstraintWidget constraintWidget2 = this.f32119k.get(size - 1).f32166b;
        if (this.f32170f == 0) {
            C0654d c0654d = constraintWidget.f2215B;
            C0654d c0654d2 = constraintWidget2.f2217D;
            C12325f m5457i = m5457i(c0654d, 0);
            int m39321b = c0654d.m39321b();
            ConstraintWidget m5493r = m5493r();
            if (m5493r != null) {
                m39321b = m5493r.f2215B.m39321b();
            }
            if (m5457i != null) {
                m5464b(this.f32172h, m5457i, m39321b);
            }
            C12325f m5457i2 = m5457i(c0654d2, 0);
            int m39321b2 = c0654d2.m39321b();
            ConstraintWidget m5492s = m5492s();
            if (m5492s != null) {
                m39321b2 = m5492s.f2217D.m39321b();
            }
            if (m5457i2 != null) {
                m5464b(this.f32173i, m5457i2, -m39321b2);
            }
        } else {
            C0654d c0654d3 = constraintWidget.f2216C;
            C0654d c0654d4 = constraintWidget2.f2218E;
            C12325f m5457i3 = m5457i(c0654d3, 1);
            int m39321b3 = c0654d3.m39321b();
            ConstraintWidget m5493r2 = m5493r();
            if (m5493r2 != null) {
                m39321b3 = m5493r2.f2216C.m39321b();
            }
            if (m5457i3 != null) {
                m5464b(this.f32172h, m5457i3, m39321b3);
            }
            C12325f m5457i4 = m5457i(c0654d4, 1);
            int m39321b4 = c0654d4.m39321b();
            ConstraintWidget m5492s2 = m5492s();
            if (m5492s2 != null) {
                m39321b4 = m5492s2.f2218E.m39321b();
            }
            if (m5457i4 != null) {
                m5464b(this.f32173i, m5457i4, -m39321b4);
            }
        }
        this.f32172h.f32130a = this;
        this.f32173i.f32130a = this;
    }

    @Override // p329s.AbstractC12335m
    /* renamed from: e */
    public void mo5461e() {
        for (int i = 0; i < this.f32119k.size(); i++) {
            this.f32119k.get(i).mo5461e();
        }
    }

    @Override // p329s.AbstractC12335m
    /* renamed from: f */
    public void mo5460f() {
        this.f32167c = null;
        Iterator<AbstractC12335m> it = this.f32119k.iterator();
        while (it.hasNext()) {
            it.next().mo5460f();
        }
    }

    @Override // p329s.AbstractC12335m
    /* renamed from: j */
    public long mo5456j() {
        int size = this.f32119k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            AbstractC12335m abstractC12335m = this.f32119k.get(i);
            j = j + abstractC12335m.f32172h.f32135f + abstractC12335m.mo5456j() + abstractC12335m.f32173i.f32135f;
        }
        return j;
    }

    @Override // p329s.AbstractC12335m
    /* renamed from: m */
    public boolean mo5453m() {
        int size = this.f32119k.size();
        for (int i = 0; i < size; i++) {
            if (!this.f32119k.get(i).mo5453m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String str;
        Iterator<AbstractC12335m> it;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ChainRun ");
        if (this.f32170f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb2.append(str);
        String sb3 = sb2.toString();
        while (this.f32119k.iterator().hasNext()) {
            sb3 = ((sb3 + "<") + it.next()) + "> ";
        }
        return sb3;
    }
}