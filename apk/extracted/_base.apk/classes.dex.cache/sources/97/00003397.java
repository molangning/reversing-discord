package p111g1;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;
import p073e1.C6059j0;
import p073e1.InterfaceC6071o0;
import p125h1.AbstractC6861a;
import p125h1.C6871d;
import p167j1.C8784e;
import p206l1.C10018k;
import p206l1.C10029s;
import p223m1.AbstractC10231b;
import p291q1.C11679k;
import p311r1.C12022c;

/* renamed from: g1.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6535o implements AbstractC6861a.InterfaceC6863b, InterfaceC6529k, InterfaceC6532m {

    /* renamed from: c */
    private final String f18531c;

    /* renamed from: d */
    private final boolean f18532d;

    /* renamed from: e */
    private final C6059j0 f18533e;

    /* renamed from: f */
    private final AbstractC6861a<?, PointF> f18534f;

    /* renamed from: g */
    private final AbstractC6861a<?, PointF> f18535g;

    /* renamed from: h */
    private final AbstractC6861a<?, Float> f18536h;

    /* renamed from: k */
    private boolean f18539k;

    /* renamed from: a */
    private final Path f18529a = new Path();

    /* renamed from: b */
    private final RectF f18530b = new RectF();

    /* renamed from: i */
    private final C6520b f18537i = new C6520b();

    /* renamed from: j */
    private AbstractC6861a<Float, Float> f18538j = null;

    public C6535o(C6059j0 c6059j0, AbstractC10231b abstractC10231b, C10018k c10018k) {
        this.f18531c = c10018k.m12565c();
        this.f18532d = c10018k.m12562f();
        this.f18533e = c6059j0;
        AbstractC6861a<PointF, PointF> mo16817a = c10018k.m12564d().mo16817a();
        this.f18534f = mo16817a;
        AbstractC6861a<PointF, PointF> mo16817a2 = c10018k.m12563e().mo16817a();
        this.f18535g = mo16817a2;
        AbstractC6861a<Float, Float> mo16817a3 = c10018k.m12566b().mo16817a();
        this.f18536h = mo16817a3;
        abstractC10231b.m12102j(mo16817a);
        abstractC10231b.m12102j(mo16817a2);
        abstractC10231b.m12102j(mo16817a3);
        mo16817a.m21774a(this);
        mo16817a2.m21774a(this);
        mo16817a3.m21774a(this);
    }

    /* renamed from: f */
    private void m22435f() {
        this.f18539k = false;
        this.f18533e.invalidateSelf();
    }

    @Override // p125h1.AbstractC6861a.InterfaceC6863b
    /* renamed from: a */
    public void mo12107a() {
        m22435f();
    }

    @Override // p111g1.InterfaceC6521c
    /* renamed from: b */
    public void mo12106b(List<InterfaceC6521c> list, List<InterfaceC6521c> list2) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC6521c interfaceC6521c = list.get(i);
            if (interfaceC6521c instanceof C6541u) {
                C6541u c6541u = (C6541u) interfaceC6521c;
                if (c6541u.m22422k() == C10029s.EnumC10030a.SIMULTANEOUSLY) {
                    this.f18537i.m22457a(c6541u);
                    c6541u.m22426d(this);
                }
            }
            if (interfaceC6521c instanceof C6537q) {
                this.f18538j = ((C6537q) interfaceC6521c).m22431i();
            }
        }
    }

    @Override // p111g1.InterfaceC6532m
    /* renamed from: c */
    public Path mo22429c() {
        float m21749p;
        AbstractC6861a<Float, Float> abstractC6861a;
        if (this.f18539k) {
            return this.f18529a;
        }
        this.f18529a.reset();
        if (this.f18532d) {
            this.f18539k = true;
            return this.f18529a;
        }
        PointF mo21712h = this.f18535g.mo21712h();
        float f = mo21712h.x / 2.0f;
        float f2 = mo21712h.y / 2.0f;
        AbstractC6861a<?, Float> abstractC6861a2 = this.f18536h;
        if (abstractC6861a2 == null) {
            m21749p = 0.0f;
        } else {
            m21749p = ((C6871d) abstractC6861a2).m21749p();
        }
        if (m21749p == 0.0f && (abstractC6861a = this.f18538j) != null) {
            m21749p = Math.min(abstractC6861a.mo21712h().floatValue(), Math.min(f, f2));
        }
        float min = Math.min(f, f2);
        if (m21749p > min) {
            m21749p = min;
        }
        PointF mo21712h2 = this.f18534f.mo21712h();
        this.f18529a.moveTo(mo21712h2.x + f, (mo21712h2.y - f2) + m21749p);
        this.f18529a.lineTo(mo21712h2.x + f, (mo21712h2.y + f2) - m21749p);
        int i = (m21749p > 0.0f ? 1 : (m21749p == 0.0f ? 0 : -1));
        if (i > 0) {
            RectF rectF = this.f18530b;
            float f3 = mo21712h2.x;
            float f4 = m21749p * 2.0f;
            float f5 = mo21712h2.y;
            rectF.set((f3 + f) - f4, (f5 + f2) - f4, f3 + f, f5 + f2);
            this.f18529a.arcTo(this.f18530b, 0.0f, 90.0f, false);
        }
        this.f18529a.lineTo((mo21712h2.x - f) + m21749p, mo21712h2.y + f2);
        if (i > 0) {
            RectF rectF2 = this.f18530b;
            float f6 = mo21712h2.x;
            float f7 = mo21712h2.y;
            float f8 = m21749p * 2.0f;
            rectF2.set(f6 - f, (f7 + f2) - f8, (f6 - f) + f8, f7 + f2);
            this.f18529a.arcTo(this.f18530b, 90.0f, 90.0f, false);
        }
        this.f18529a.lineTo(mo21712h2.x - f, (mo21712h2.y - f2) + m21749p);
        if (i > 0) {
            RectF rectF3 = this.f18530b;
            float f9 = mo21712h2.x;
            float f10 = mo21712h2.y;
            float f11 = m21749p * 2.0f;
            rectF3.set(f9 - f, f10 - f2, (f9 - f) + f11, (f10 - f2) + f11);
            this.f18529a.arcTo(this.f18530b, 180.0f, 90.0f, false);
        }
        this.f18529a.lineTo((mo21712h2.x + f) - m21749p, mo21712h2.y - f2);
        if (i > 0) {
            RectF rectF4 = this.f18530b;
            float f12 = mo21712h2.x;
            float f13 = m21749p * 2.0f;
            float f14 = mo21712h2.y;
            rectF4.set((f12 + f) - f13, f14 - f2, f12 + f, (f14 - f2) + f13);
            this.f18529a.arcTo(this.f18530b, 270.0f, 90.0f, false);
        }
        this.f18529a.close();
        this.f18537i.m22456b(this.f18529a);
        this.f18539k = true;
        return this.f18529a;
    }

    @Override // p167j1.InterfaceC8785f
    /* renamed from: d */
    public void mo12105d(C8784e c8784e, int i, List<C8784e> list, C8784e c8784e2) {
        C11679k.m7193k(c8784e, i, list, c8784e2, this);
    }

    @Override // p111g1.InterfaceC6521c
    public String getName() {
        return this.f18531c;
    }

    @Override // p167j1.InterfaceC8785f
    /* renamed from: i */
    public <T> void mo12035i(T t, C12022c<T> c12022c) {
        if (t == InterfaceC6071o0.f17272l) {
            this.f18535g.m21767n(c12022c);
        } else if (t == InterfaceC6071o0.f17274n) {
            this.f18534f.m21767n(c12022c);
        } else if (t == InterfaceC6071o0.f17273m) {
            this.f18536h.m21767n(c12022c);
        }
    }
}