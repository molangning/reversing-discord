package p111g1;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import p073e1.C6059j0;
import p073e1.InterfaceC6071o0;
import p125h1.AbstractC6861a;
import p167j1.C8784e;
import p206l1.C10006b;
import p206l1.C10029s;
import p223m1.AbstractC10231b;
import p291q1.C11679k;
import p311r1.C12022c;

/* renamed from: g1.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6524f implements InterfaceC6532m, AbstractC6861a.InterfaceC6863b, InterfaceC6529k {

    /* renamed from: b */
    private final String f18454b;

    /* renamed from: c */
    private final C6059j0 f18455c;

    /* renamed from: d */
    private final AbstractC6861a<?, PointF> f18456d;

    /* renamed from: e */
    private final AbstractC6861a<?, PointF> f18457e;

    /* renamed from: f */
    private final C10006b f18458f;

    /* renamed from: h */
    private boolean f18460h;

    /* renamed from: a */
    private final Path f18453a = new Path();

    /* renamed from: g */
    private final C6520b f18459g = new C6520b();

    public C6524f(C6059j0 c6059j0, AbstractC10231b abstractC10231b, C10006b c10006b) {
        this.f18454b = c10006b.m12622b();
        this.f18455c = c6059j0;
        AbstractC6861a<PointF, PointF> mo16817a = c10006b.m12620d().mo16817a();
        this.f18456d = mo16817a;
        AbstractC6861a<PointF, PointF> mo16817a2 = c10006b.m12621c().mo16817a();
        this.f18457e = mo16817a2;
        this.f18458f = c10006b;
        abstractC10231b.m12102j(mo16817a);
        abstractC10231b.m12102j(mo16817a2);
        mo16817a.m21774a(this);
        mo16817a2.m21774a(this);
    }

    /* renamed from: f */
    private void m22449f() {
        this.f18460h = false;
        this.f18455c.invalidateSelf();
    }

    @Override // p125h1.AbstractC6861a.InterfaceC6863b
    /* renamed from: a */
    public void mo12107a() {
        m22449f();
    }

    @Override // p111g1.InterfaceC6521c
    /* renamed from: b */
    public void mo12106b(List<InterfaceC6521c> list, List<InterfaceC6521c> list2) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC6521c interfaceC6521c = list.get(i);
            if (interfaceC6521c instanceof C6541u) {
                C6541u c6541u = (C6541u) interfaceC6521c;
                if (c6541u.m22422k() == C10029s.EnumC10030a.SIMULTANEOUSLY) {
                    this.f18459g.m22457a(c6541u);
                    c6541u.m22426d(this);
                }
            }
        }
    }

    @Override // p111g1.InterfaceC6532m
    /* renamed from: c */
    public Path mo22429c() {
        if (this.f18460h) {
            return this.f18453a;
        }
        this.f18453a.reset();
        if (this.f18458f.m12619e()) {
            this.f18460h = true;
            return this.f18453a;
        }
        PointF mo21712h = this.f18456d.mo21712h();
        float f = mo21712h.x / 2.0f;
        float f2 = mo21712h.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.f18453a.reset();
        if (this.f18458f.m12618f()) {
            float f5 = -f2;
            this.f18453a.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.f18453a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.f18453a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.f18453a.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.f18453a.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.f18453a.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            this.f18453a.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.f18453a.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            this.f18453a.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.f18453a.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF mo21712h2 = this.f18457e.mo21712h();
        this.f18453a.offset(mo21712h2.x, mo21712h2.y);
        this.f18453a.close();
        this.f18459g.m22456b(this.f18453a);
        this.f18460h = true;
        return this.f18453a;
    }

    @Override // p167j1.InterfaceC8785f
    /* renamed from: d */
    public void mo12105d(C8784e c8784e, int i, List<C8784e> list, C8784e c8784e2) {
        C11679k.m7193k(c8784e, i, list, c8784e2, this);
    }

    @Override // p111g1.InterfaceC6521c
    public String getName() {
        return this.f18454b;
    }

    @Override // p167j1.InterfaceC8785f
    /* renamed from: i */
    public <T> void mo12035i(T t, C12022c<T> c12022c) {
        if (t == InterfaceC6071o0.f17271k) {
            this.f18456d.m21767n(c12022c);
        } else if (t == InterfaceC6071o0.f17274n) {
            this.f18457e.m21767n(c12022c);
        }
    }
}