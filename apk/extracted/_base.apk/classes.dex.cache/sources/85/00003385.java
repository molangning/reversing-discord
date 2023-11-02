package p111g1;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p073e1.C6043e;
import p073e1.C6059j0;
import p073e1.InterfaceC6071o0;
import p092f1.C6303a;
import p125h1.AbstractC6861a;
import p125h1.C6869c;
import p125h1.C6871d;
import p125h1.C6873f;
import p125h1.C6885q;
import p167j1.C8784e;
import p188k1.C9038b;
import p188k1.C9040d;
import p206l1.C10029s;
import p223m1.AbstractC10231b;
import p291q1.C11679k;
import p291q1.C11680l;
import p311r1.C12022c;

/* renamed from: g1.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class AbstractC6517a implements AbstractC6861a.InterfaceC6863b, InterfaceC6529k, InterfaceC6523e {

    /* renamed from: e */
    private final C6059j0 f18426e;

    /* renamed from: f */
    protected final AbstractC10231b f18427f;

    /* renamed from: h */
    private final float[] f18429h;

    /* renamed from: i */
    final Paint f18430i;

    /* renamed from: j */
    private final AbstractC6861a<?, Float> f18431j;

    /* renamed from: k */
    private final AbstractC6861a<?, Integer> f18432k;

    /* renamed from: l */
    private final List<AbstractC6861a<?, Float>> f18433l;

    /* renamed from: m */
    private final AbstractC6861a<?, Float> f18434m;

    /* renamed from: n */
    private AbstractC6861a<ColorFilter, ColorFilter> f18435n;

    /* renamed from: o */
    private AbstractC6861a<Float, Float> f18436o;

    /* renamed from: p */
    float f18437p;

    /* renamed from: q */
    private C6869c f18438q;

    /* renamed from: a */
    private final PathMeasure f18422a = new PathMeasure();

    /* renamed from: b */
    private final Path f18423b = new Path();

    /* renamed from: c */
    private final Path f18424c = new Path();

    /* renamed from: d */
    private final RectF f18425d = new RectF();

    /* renamed from: g */
    private final List<C6519b> f18428g = new ArrayList();

    /* renamed from: g1.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C6519b {

        /* renamed from: a */
        private final List<InterfaceC6532m> f18439a;

        /* renamed from: b */
        private final C6541u f18440b;

        private C6519b(C6541u c6541u) {
            this.f18439a = new ArrayList();
            this.f18440b = c6541u;
        }
    }

    public AbstractC6517a(C6059j0 c6059j0, AbstractC10231b abstractC10231b, Paint.Cap cap, Paint.Join join, float f, C9040d c9040d, C9038b c9038b, List<C9038b> list, C9038b c9038b2) {
        C6303a c6303a = new C6303a(1);
        this.f18430i = c6303a;
        this.f18437p = 0.0f;
        this.f18426e = c6059j0;
        this.f18427f = abstractC10231b;
        c6303a.setStyle(Paint.Style.STROKE);
        c6303a.setStrokeCap(cap);
        c6303a.setStrokeJoin(join);
        c6303a.setStrokeMiter(f);
        this.f18432k = c9040d.mo16817a();
        this.f18431j = c9038b.mo16817a();
        if (c9038b2 == null) {
            this.f18434m = null;
        } else {
            this.f18434m = c9038b2.mo16817a();
        }
        this.f18433l = new ArrayList(list.size());
        this.f18429h = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f18433l.add(list.get(i).mo16817a());
        }
        abstractC10231b.m12102j(this.f18432k);
        abstractC10231b.m12102j(this.f18431j);
        for (int i2 = 0; i2 < this.f18433l.size(); i2++) {
            abstractC10231b.m12102j(this.f18433l.get(i2));
        }
        AbstractC6861a<?, Float> abstractC6861a = this.f18434m;
        if (abstractC6861a != null) {
            abstractC10231b.m12102j(abstractC6861a);
        }
        this.f18432k.m21774a(this);
        this.f18431j.m21774a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f18433l.get(i3).m21774a(this);
        }
        AbstractC6861a<?, Float> abstractC6861a2 = this.f18434m;
        if (abstractC6861a2 != null) {
            abstractC6861a2.m21774a(this);
        }
        if (abstractC10231b.mo12055w() != null) {
            AbstractC6861a<Float, Float> mo16817a = abstractC10231b.mo12055w().m12623a().mo16817a();
            this.f18436o = mo16817a;
            mo16817a.m21774a(this);
            abstractC10231b.m12102j(this.f18436o);
        }
        if (abstractC10231b.mo12054y() != null) {
            this.f18438q = new C6869c(this, abstractC10231b, abstractC10231b.mo12054y());
        }
    }

    /* renamed from: f */
    private void m22461f(Matrix matrix) {
        float floatValue;
        C6043e.m23828b("StrokeContent#applyDashPattern");
        if (this.f18433l.isEmpty()) {
            C6043e.m23827c("StrokeContent#applyDashPattern");
            return;
        }
        float m7186g = C11680l.m7186g(matrix);
        for (int i = 0; i < this.f18433l.size(); i++) {
            this.f18429h[i] = this.f18433l.get(i).mo21712h().floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.f18429h;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f18429h;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.f18429h;
            fArr3[i] = fArr3[i] * m7186g;
        }
        AbstractC6861a<?, Float> abstractC6861a = this.f18434m;
        if (abstractC6861a == null) {
            floatValue = 0.0f;
        } else {
            floatValue = m7186g * abstractC6861a.mo21712h().floatValue();
        }
        this.f18430i.setPathEffect(new DashPathEffect(this.f18429h, floatValue));
        C6043e.m23827c("StrokeContent#applyDashPattern");
    }

    /* renamed from: j */
    private void m22460j(Canvas canvas, C6519b c6519b, Matrix matrix) {
        float f;
        float f2;
        float f3;
        C6043e.m23828b("StrokeContent#applyTrimPath");
        if (c6519b.f18440b == null) {
            C6043e.m23827c("StrokeContent#applyTrimPath");
            return;
        }
        this.f18423b.reset();
        for (int size = c6519b.f18439a.size() - 1; size >= 0; size--) {
            this.f18423b.addPath(((InterfaceC6532m) c6519b.f18439a.get(size)).mo22429c(), matrix);
        }
        float floatValue = c6519b.f18440b.m22423j().mo21712h().floatValue() / 100.0f;
        float floatValue2 = c6519b.f18440b.m22425f().mo21712h().floatValue() / 100.0f;
        float floatValue3 = c6519b.f18440b.m22424i().mo21712h().floatValue() / 360.0f;
        if (floatValue < 0.01f && floatValue2 > 0.99f) {
            canvas.drawPath(this.f18423b, this.f18430i);
            C6043e.m23827c("StrokeContent#applyTrimPath");
            return;
        }
        this.f18422a.setPath(this.f18423b, false);
        float length = this.f18422a.getLength();
        while (this.f18422a.nextContour()) {
            length += this.f18422a.getLength();
        }
        float f4 = floatValue3 * length;
        float f5 = (floatValue * length) + f4;
        float min = Math.min((floatValue2 * length) + f4, (f5 + length) - 1.0f);
        float f6 = 0.0f;
        for (int size2 = c6519b.f18439a.size() - 1; size2 >= 0; size2--) {
            this.f18424c.set(((InterfaceC6532m) c6519b.f18439a.get(size2)).mo22429c());
            this.f18424c.transform(matrix);
            this.f18422a.setPath(this.f18424c, false);
            float length2 = this.f18422a.getLength();
            if (min > length) {
                float f7 = min - length;
                if (f7 < f6 + length2 && f6 < f7) {
                    if (f5 > length) {
                        f3 = (f5 - length) / length2;
                    } else {
                        f3 = 0.0f;
                    }
                    C11680l.m7192a(this.f18424c, f3, Math.min(f7 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.f18424c, this.f18430i);
                    f6 += length2;
                }
            }
            float f8 = f6 + length2;
            if (f8 >= f5 && f6 <= min) {
                if (f8 <= min && f5 < f6) {
                    canvas.drawPath(this.f18424c, this.f18430i);
                } else {
                    if (f5 < f6) {
                        f = 0.0f;
                    } else {
                        f = (f5 - f6) / length2;
                    }
                    if (min > f8) {
                        f2 = 1.0f;
                    } else {
                        f2 = (min - f6) / length2;
                    }
                    C11680l.m7192a(this.f18424c, f, f2, 0.0f);
                    canvas.drawPath(this.f18424c, this.f18430i);
                }
            }
            f6 += length2;
        }
        C6043e.m23827c("StrokeContent#applyTrimPath");
    }

    @Override // p125h1.AbstractC6861a.InterfaceC6863b
    /* renamed from: a */
    public void mo12107a() {
        this.f18426e.invalidateSelf();
    }

    @Override // p111g1.InterfaceC6521c
    /* renamed from: b */
    public void mo12106b(List<InterfaceC6521c> list, List<InterfaceC6521c> list2) {
        C6541u c6541u = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            InterfaceC6521c interfaceC6521c = list.get(size);
            if (interfaceC6521c instanceof C6541u) {
                C6541u c6541u2 = (C6541u) interfaceC6521c;
                if (c6541u2.m22422k() == C10029s.EnumC10030a.INDIVIDUALLY) {
                    c6541u = c6541u2;
                }
            }
        }
        if (c6541u != null) {
            c6541u.m22426d(this);
        }
        C6519b c6519b = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            InterfaceC6521c interfaceC6521c2 = list2.get(size2);
            if (interfaceC6521c2 instanceof C6541u) {
                C6541u c6541u3 = (C6541u) interfaceC6521c2;
                if (c6541u3.m22422k() == C10029s.EnumC10030a.INDIVIDUALLY) {
                    if (c6519b != null) {
                        this.f18428g.add(c6519b);
                    }
                    c6519b = new C6519b(c6541u3);
                    c6541u3.m22426d(this);
                }
            }
            if (interfaceC6521c2 instanceof InterfaceC6532m) {
                if (c6519b == null) {
                    c6519b = new C6519b(c6541u);
                }
                c6519b.f18439a.add((InterfaceC6532m) interfaceC6521c2);
            }
        }
        if (c6519b != null) {
            this.f18428g.add(c6519b);
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
        C6043e.m23828b("StrokeContent#getBounds");
        this.f18423b.reset();
        for (int i = 0; i < this.f18428g.size(); i++) {
            C6519b c6519b = this.f18428g.get(i);
            for (int i2 = 0; i2 < c6519b.f18439a.size(); i2++) {
                this.f18423b.addPath(((InterfaceC6532m) c6519b.f18439a.get(i2)).mo22429c(), matrix);
            }
        }
        this.f18423b.computeBounds(this.f18425d, false);
        float m21749p = ((C6871d) this.f18431j).m21749p();
        RectF rectF2 = this.f18425d;
        float f = m21749p / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.f18425d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        C6043e.m23827c("StrokeContent#getBounds");
    }

    @Override // p111g1.InterfaceC6523e
    /* renamed from: h */
    public void mo12103h(Canvas canvas, Matrix matrix, int i) {
        C6043e.m23828b("StrokeContent#draw");
        if (C11680l.m7185h(matrix)) {
            C6043e.m23827c("StrokeContent#draw");
            return;
        }
        this.f18430i.setAlpha(C11679k.m7201c((int) ((((i / 255.0f) * ((C6873f) this.f18432k).m21745p()) / 100.0f) * 255.0f), 0, 255));
        this.f18430i.setStrokeWidth(((C6871d) this.f18431j).m21749p() * C11680l.m7186g(matrix));
        if (this.f18430i.getStrokeWidth() <= 0.0f) {
            C6043e.m23827c("StrokeContent#draw");
            return;
        }
        m22461f(matrix);
        AbstractC6861a<ColorFilter, ColorFilter> abstractC6861a = this.f18435n;
        if (abstractC6861a != null) {
            this.f18430i.setColorFilter(abstractC6861a.mo21712h());
        }
        AbstractC6861a<Float, Float> abstractC6861a2 = this.f18436o;
        if (abstractC6861a2 != null) {
            float floatValue = abstractC6861a2.mo21712h().floatValue();
            if (floatValue == 0.0f) {
                this.f18430i.setMaskFilter(null);
            } else if (floatValue != this.f18437p) {
                this.f18430i.setMaskFilter(this.f18427f.m12090x(floatValue));
            }
            this.f18437p = floatValue;
        }
        C6869c c6869c = this.f18438q;
        if (c6869c != null) {
            c6869c.m21756b(this.f18430i);
        }
        for (int i2 = 0; i2 < this.f18428g.size(); i2++) {
            C6519b c6519b = this.f18428g.get(i2);
            if (c6519b.f18440b != null) {
                m22460j(canvas, c6519b, matrix);
            } else {
                C6043e.m23828b("StrokeContent#buildPath");
                this.f18423b.reset();
                for (int size = c6519b.f18439a.size() - 1; size >= 0; size--) {
                    this.f18423b.addPath(((InterfaceC6532m) c6519b.f18439a.get(size)).mo22429c(), matrix);
                }
                C6043e.m23827c("StrokeContent#buildPath");
                C6043e.m23828b("StrokeContent#drawPath");
                canvas.drawPath(this.f18423b, this.f18430i);
                C6043e.m23827c("StrokeContent#drawPath");
            }
        }
        C6043e.m23827c("StrokeContent#draw");
    }

    @Override // p167j1.InterfaceC8785f
    /* renamed from: i */
    public <T> void mo12035i(T t, C12022c<T> c12022c) {
        C6869c c6869c;
        C6869c c6869c2;
        C6869c c6869c3;
        C6869c c6869c4;
        C6869c c6869c5;
        if (t == InterfaceC6071o0.f17264d) {
            this.f18432k.m21767n(c12022c);
        } else if (t == InterfaceC6071o0.f17279s) {
            this.f18431j.m21767n(c12022c);
        } else if (t == InterfaceC6071o0.f17256K) {
            AbstractC6861a<ColorFilter, ColorFilter> abstractC6861a = this.f18435n;
            if (abstractC6861a != null) {
                this.f18427f.m12112H(abstractC6861a);
            }
            if (c12022c == null) {
                this.f18435n = null;
                return;
            }
            C6885q c6885q = new C6885q(c12022c);
            this.f18435n = c6885q;
            c6885q.m21774a(this);
            this.f18427f.m12102j(this.f18435n);
        } else if (t == InterfaceC6071o0.f17270j) {
            AbstractC6861a<Float, Float> abstractC6861a2 = this.f18436o;
            if (abstractC6861a2 != null) {
                abstractC6861a2.m21767n(c12022c);
                return;
            }
            C6885q c6885q2 = new C6885q(c12022c);
            this.f18436o = c6885q2;
            c6885q2.m21774a(this);
            this.f18427f.m12102j(this.f18436o);
        } else if (t == InterfaceC6071o0.f17265e && (c6869c5 = this.f18438q) != null) {
            c6869c5.m21755c(c12022c);
        } else if (t == InterfaceC6071o0.f17252G && (c6869c4 = this.f18438q) != null) {
            c6869c4.m21752f(c12022c);
        } else if (t == InterfaceC6071o0.f17253H && (c6869c3 = this.f18438q) != null) {
            c6869c3.m21754d(c12022c);
        } else if (t == InterfaceC6071o0.f17254I && (c6869c2 = this.f18438q) != null) {
            c6869c2.m21753e(c12022c);
        } else if (t == InterfaceC6071o0.f17255J && (c6869c = this.f18438q) != null) {
            c6869c.m21751g(c12022c);
        }
    }
}