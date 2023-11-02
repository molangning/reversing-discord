package p111g1;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p073e1.C6043e;
import p073e1.C6059j0;
import p073e1.InterfaceC6071o0;
import p092f1.C6303a;
import p125h1.AbstractC6861a;
import p125h1.C6868b;
import p125h1.C6869c;
import p125h1.C6885q;
import p167j1.C8784e;
import p206l1.C10022o;
import p223m1.AbstractC10231b;
import p291q1.C11679k;
import p311r1.C12022c;

/* renamed from: g1.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6525g implements InterfaceC6523e, AbstractC6861a.InterfaceC6863b, InterfaceC6529k {

    /* renamed from: a */
    private final Path f18461a;

    /* renamed from: b */
    private final Paint f18462b;

    /* renamed from: c */
    private final AbstractC10231b f18463c;

    /* renamed from: d */
    private final String f18464d;

    /* renamed from: e */
    private final boolean f18465e;

    /* renamed from: f */
    private final List<InterfaceC6532m> f18466f;

    /* renamed from: g */
    private final AbstractC6861a<Integer, Integer> f18467g;

    /* renamed from: h */
    private final AbstractC6861a<Integer, Integer> f18468h;

    /* renamed from: i */
    private AbstractC6861a<ColorFilter, ColorFilter> f18469i;

    /* renamed from: j */
    private final C6059j0 f18470j;

    /* renamed from: k */
    private AbstractC6861a<Float, Float> f18471k;

    /* renamed from: l */
    float f18472l;

    /* renamed from: m */
    private C6869c f18473m;

    public C6525g(C6059j0 c6059j0, AbstractC10231b abstractC10231b, C10022o c10022o) {
        Path path = new Path();
        this.f18461a = path;
        this.f18462b = new C6303a(1);
        this.f18466f = new ArrayList();
        this.f18463c = abstractC10231b;
        this.f18464d = c10022o.m12546d();
        this.f18465e = c10022o.m12544f();
        this.f18470j = c6059j0;
        if (abstractC10231b.mo12055w() != null) {
            AbstractC6861a<Float, Float> mo16817a = abstractC10231b.mo12055w().m12623a().mo16817a();
            this.f18471k = mo16817a;
            mo16817a.m21774a(this);
            abstractC10231b.m12102j(this.f18471k);
        }
        if (abstractC10231b.mo12054y() != null) {
            this.f18473m = new C6869c(this, abstractC10231b, abstractC10231b.mo12054y());
        }
        if (c10022o.m12548b() != null && c10022o.m12545e() != null) {
            path.setFillType(c10022o.m12547c());
            AbstractC6861a<Integer, Integer> mo16817a2 = c10022o.m12548b().mo16817a();
            this.f18467g = mo16817a2;
            mo16817a2.m21774a(this);
            abstractC10231b.m12102j(mo16817a2);
            AbstractC6861a<Integer, Integer> mo16817a3 = c10022o.m12545e().mo16817a();
            this.f18468h = mo16817a3;
            mo16817a3.m21774a(this);
            abstractC10231b.m12102j(mo16817a3);
            return;
        }
        this.f18467g = null;
        this.f18468h = null;
    }

    @Override // p125h1.AbstractC6861a.InterfaceC6863b
    /* renamed from: a */
    public void mo12107a() {
        this.f18470j.invalidateSelf();
    }

    @Override // p111g1.InterfaceC6521c
    /* renamed from: b */
    public void mo12106b(List<InterfaceC6521c> list, List<InterfaceC6521c> list2) {
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC6521c interfaceC6521c = list2.get(i);
            if (interfaceC6521c instanceof InterfaceC6532m) {
                this.f18466f.add((InterfaceC6532m) interfaceC6521c);
            }
        }
    }

    @Override // p167j1.InterfaceC8785f
    /* renamed from: d */
    public void mo12105d(C8784e c8784e, int i, List<C8784e> list, C8784e c8784e2) {
        C11679k.m7193k(c8784e, i, list, c8784e2, this);
    }

    @Override // p111g1.InterfaceC6523e
    /* renamed from: e */
    public void mo12038e(RectF rectF, Matrix matrix, boolean z) {
        this.f18461a.reset();
        for (int i = 0; i < this.f18466f.size(); i++) {
            this.f18461a.addPath(this.f18466f.get(i).mo22429c(), matrix);
        }
        this.f18461a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // p111g1.InterfaceC6521c
    public String getName() {
        return this.f18464d;
    }

    @Override // p111g1.InterfaceC6523e
    /* renamed from: h */
    public void mo12103h(Canvas canvas, Matrix matrix, int i) {
        if (this.f18465e) {
            return;
        }
        C6043e.m23828b("FillContent#draw");
        this.f18462b.setColor((C11679k.m7201c((int) ((((i / 255.0f) * this.f18468h.mo21712h().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((C6868b) this.f18467g).m21759p() & 16777215));
        AbstractC6861a<ColorFilter, ColorFilter> abstractC6861a = this.f18469i;
        if (abstractC6861a != null) {
            this.f18462b.setColorFilter(abstractC6861a.mo21712h());
        }
        AbstractC6861a<Float, Float> abstractC6861a2 = this.f18471k;
        if (abstractC6861a2 != null) {
            float floatValue = abstractC6861a2.mo21712h().floatValue();
            if (floatValue == 0.0f) {
                this.f18462b.setMaskFilter(null);
            } else if (floatValue != this.f18472l) {
                this.f18462b.setMaskFilter(this.f18463c.m12090x(floatValue));
            }
            this.f18472l = floatValue;
        }
        C6869c c6869c = this.f18473m;
        if (c6869c != null) {
            c6869c.m21756b(this.f18462b);
        }
        this.f18461a.reset();
        for (int i2 = 0; i2 < this.f18466f.size(); i2++) {
            this.f18461a.addPath(this.f18466f.get(i2).mo22429c(), matrix);
        }
        canvas.drawPath(this.f18461a, this.f18462b);
        C6043e.m23827c("FillContent#draw");
    }

    @Override // p167j1.InterfaceC8785f
    /* renamed from: i */
    public <T> void mo12035i(T t, C12022c<T> c12022c) {
        C6869c c6869c;
        C6869c c6869c2;
        C6869c c6869c3;
        C6869c c6869c4;
        C6869c c6869c5;
        if (t == InterfaceC6071o0.f17261a) {
            this.f18467g.m21767n(c12022c);
        } else if (t == InterfaceC6071o0.f17264d) {
            this.f18468h.m21767n(c12022c);
        } else if (t == InterfaceC6071o0.f17256K) {
            AbstractC6861a<ColorFilter, ColorFilter> abstractC6861a = this.f18469i;
            if (abstractC6861a != null) {
                this.f18463c.m12112H(abstractC6861a);
            }
            if (c12022c == null) {
                this.f18469i = null;
                return;
            }
            C6885q c6885q = new C6885q(c12022c);
            this.f18469i = c6885q;
            c6885q.m21774a(this);
            this.f18463c.m12102j(this.f18469i);
        } else if (t == InterfaceC6071o0.f17270j) {
            AbstractC6861a<Float, Float> abstractC6861a2 = this.f18471k;
            if (abstractC6861a2 != null) {
                abstractC6861a2.m21767n(c12022c);
                return;
            }
            C6885q c6885q2 = new C6885q(c12022c);
            this.f18471k = c6885q2;
            c6885q2.m21774a(this);
            this.f18463c.m12102j(this.f18471k);
        } else if (t == InterfaceC6071o0.f17265e && (c6869c5 = this.f18473m) != null) {
            c6869c5.m21755c(c12022c);
        } else if (t == InterfaceC6071o0.f17252G && (c6869c4 = this.f18473m) != null) {
            c6869c4.m21752f(c12022c);
        } else if (t == InterfaceC6071o0.f17253H && (c6869c3 = this.f18473m) != null) {
            c6869c3.m21754d(c12022c);
        } else if (t == InterfaceC6071o0.f17254I && (c6869c2 = this.f18473m) != null) {
            c6869c2.m21753e(c12022c);
        } else if (t == InterfaceC6071o0.f17255J && (c6869c = this.f18473m) != null) {
            c6869c.m21751g(c12022c);
        }
    }
}
