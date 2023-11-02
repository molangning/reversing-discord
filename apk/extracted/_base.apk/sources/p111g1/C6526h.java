package p111g1;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.C0629d;
import java.util.ArrayList;
import java.util.List;
import p073e1.C6043e;
import p073e1.C6059j0;
import p073e1.C6062k;
import p073e1.InterfaceC6071o0;
import p092f1.C6303a;
import p125h1.AbstractC6861a;
import p125h1.C6869c;
import p125h1.C6885q;
import p167j1.C8784e;
import p206l1.C10008d;
import p206l1.C10009e;
import p206l1.EnumC10011g;
import p223m1.AbstractC10231b;
import p291q1.C11679k;
import p311r1.C12022c;

/* renamed from: g1.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6526h implements InterfaceC6523e, AbstractC6861a.InterfaceC6863b, InterfaceC6529k {

    /* renamed from: a */
    private final String f18474a;

    /* renamed from: b */
    private final boolean f18475b;

    /* renamed from: c */
    private final AbstractC10231b f18476c;

    /* renamed from: d */
    private final C0629d<LinearGradient> f18477d = new C0629d<>();

    /* renamed from: e */
    private final C0629d<RadialGradient> f18478e = new C0629d<>();

    /* renamed from: f */
    private final Path f18479f;

    /* renamed from: g */
    private final Paint f18480g;

    /* renamed from: h */
    private final RectF f18481h;

    /* renamed from: i */
    private final List<InterfaceC6532m> f18482i;

    /* renamed from: j */
    private final EnumC10011g f18483j;

    /* renamed from: k */
    private final AbstractC6861a<C10008d, C10008d> f18484k;

    /* renamed from: l */
    private final AbstractC6861a<Integer, Integer> f18485l;

    /* renamed from: m */
    private final AbstractC6861a<PointF, PointF> f18486m;

    /* renamed from: n */
    private final AbstractC6861a<PointF, PointF> f18487n;

    /* renamed from: o */
    private AbstractC6861a<ColorFilter, ColorFilter> f18488o;

    /* renamed from: p */
    private C6885q f18489p;

    /* renamed from: q */
    private final C6059j0 f18490q;

    /* renamed from: r */
    private final int f18491r;

    /* renamed from: s */
    private AbstractC6861a<Float, Float> f18492s;

    /* renamed from: t */
    float f18493t;

    /* renamed from: u */
    private C6869c f18494u;

    public C6526h(C6059j0 c6059j0, C6062k c6062k, AbstractC10231b abstractC10231b, C10009e c10009e) {
        Path path = new Path();
        this.f18479f = path;
        this.f18480g = new C6303a(1);
        this.f18481h = new RectF();
        this.f18482i = new ArrayList();
        this.f18493t = 0.0f;
        this.f18476c = abstractC10231b;
        this.f18474a = c10009e.m12607f();
        this.f18475b = c10009e.m12604i();
        this.f18490q = c6059j0;
        this.f18483j = c10009e.m12608e();
        path.setFillType(c10009e.m12610c());
        this.f18491r = (int) (c6062k.m23673d() / 32.0f);
        AbstractC6861a<C10008d, C10008d> mo16817a = c10009e.m12609d().mo16817a();
        this.f18484k = mo16817a;
        mo16817a.m21774a(this);
        abstractC10231b.m12102j(mo16817a);
        AbstractC6861a<Integer, Integer> mo16817a2 = c10009e.m12606g().mo16817a();
        this.f18485l = mo16817a2;
        mo16817a2.m21774a(this);
        abstractC10231b.m12102j(mo16817a2);
        AbstractC6861a<PointF, PointF> mo16817a3 = c10009e.m12605h().mo16817a();
        this.f18486m = mo16817a3;
        mo16817a3.m21774a(this);
        abstractC10231b.m12102j(mo16817a3);
        AbstractC6861a<PointF, PointF> mo16817a4 = c10009e.m12611b().mo16817a();
        this.f18487n = mo16817a4;
        mo16817a4.m21774a(this);
        abstractC10231b.m12102j(mo16817a4);
        if (abstractC10231b.mo12055w() != null) {
            AbstractC6861a<Float, Float> mo16817a5 = abstractC10231b.mo12055w().m12623a().mo16817a();
            this.f18492s = mo16817a5;
            mo16817a5.m21774a(this);
            abstractC10231b.m12102j(this.f18492s);
        }
        if (abstractC10231b.mo12054y() != null) {
            this.f18494u = new C6869c(this, abstractC10231b, abstractC10231b.mo12054y());
        }
    }

    /* renamed from: f */
    private int[] m22448f(int[] iArr) {
        C6885q c6885q = this.f18489p;
        if (c6885q != null) {
            Integer[] numArr = (Integer[]) c6885q.mo21712h();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    /* renamed from: j */
    private int m22447j() {
        int i;
        int round = Math.round(this.f18486m.m21770f() * this.f18491r);
        int round2 = Math.round(this.f18487n.m21770f() * this.f18491r);
        int round3 = Math.round(this.f18484k.m21770f() * this.f18491r);
        if (round != 0) {
            i = 527 * round;
        } else {
            i = 17;
        }
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        if (round3 != 0) {
            return i * 31 * round3;
        }
        return i;
    }

    /* renamed from: k */
    private LinearGradient m22446k() {
        long m22447j = m22447j();
        LinearGradient m39488g = this.f18477d.m39488g(m22447j);
        if (m39488g != null) {
            return m39488g;
        }
        PointF mo21712h = this.f18486m.mo21712h();
        PointF mo21712h2 = this.f18487n.mo21712h();
        C10008d mo21712h3 = this.f18484k.mo21712h();
        LinearGradient linearGradient = new LinearGradient(mo21712h.x, mo21712h.y, mo21712h2.x, mo21712h2.y, m22448f(mo21712h3.m12615c()), mo21712h3.m12614d(), Shader.TileMode.CLAMP);
        this.f18477d.m39484m(m22447j, linearGradient);
        return linearGradient;
    }

    /* renamed from: l */
    private RadialGradient m22445l() {
        long m22447j = m22447j();
        RadialGradient m39488g = this.f18478e.m39488g(m22447j);
        if (m39488g != null) {
            return m39488g;
        }
        PointF mo21712h = this.f18486m.mo21712h();
        PointF mo21712h2 = this.f18487n.mo21712h();
        C10008d mo21712h3 = this.f18484k.mo21712h();
        int[] m22448f = m22448f(mo21712h3.m12615c());
        float[] m12614d = mo21712h3.m12614d();
        float f = mo21712h.x;
        float f2 = mo21712h.y;
        float hypot = (float) Math.hypot(mo21712h2.x - f, mo21712h2.y - f2);
        if (hypot <= 0.0f) {
            hypot = 0.001f;
        }
        RadialGradient radialGradient = new RadialGradient(f, f2, hypot, m22448f, m12614d, Shader.TileMode.CLAMP);
        this.f18478e.m39484m(m22447j, radialGradient);
        return radialGradient;
    }

    @Override // p125h1.AbstractC6861a.InterfaceC6863b
    /* renamed from: a */
    public void mo12107a() {
        this.f18490q.invalidateSelf();
    }

    @Override // p111g1.InterfaceC6521c
    /* renamed from: b */
    public void mo12106b(List<InterfaceC6521c> list, List<InterfaceC6521c> list2) {
        for (int i = 0; i < list2.size(); i++) {
            InterfaceC6521c interfaceC6521c = list2.get(i);
            if (interfaceC6521c instanceof InterfaceC6532m) {
                this.f18482i.add((InterfaceC6532m) interfaceC6521c);
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
        this.f18479f.reset();
        for (int i = 0; i < this.f18482i.size(); i++) {
            this.f18479f.addPath(this.f18482i.get(i).mo22429c(), matrix);
        }
        this.f18479f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // p111g1.InterfaceC6521c
    public String getName() {
        return this.f18474a;
    }

    @Override // p111g1.InterfaceC6523e
    /* renamed from: h */
    public void mo12103h(Canvas canvas, Matrix matrix, int i) {
        Shader m22445l;
        if (this.f18475b) {
            return;
        }
        C6043e.m23828b("GradientFillContent#draw");
        this.f18479f.reset();
        for (int i2 = 0; i2 < this.f18482i.size(); i2++) {
            this.f18479f.addPath(this.f18482i.get(i2).mo22429c(), matrix);
        }
        this.f18479f.computeBounds(this.f18481h, false);
        if (this.f18483j == EnumC10011g.LINEAR) {
            m22445l = m22446k();
        } else {
            m22445l = m22445l();
        }
        m22445l.setLocalMatrix(matrix);
        this.f18480g.setShader(m22445l);
        AbstractC6861a<ColorFilter, ColorFilter> abstractC6861a = this.f18488o;
        if (abstractC6861a != null) {
            this.f18480g.setColorFilter(abstractC6861a.mo21712h());
        }
        AbstractC6861a<Float, Float> abstractC6861a2 = this.f18492s;
        if (abstractC6861a2 != null) {
            float floatValue = abstractC6861a2.mo21712h().floatValue();
            if (floatValue == 0.0f) {
                this.f18480g.setMaskFilter(null);
            } else if (floatValue != this.f18493t) {
                this.f18480g.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f18493t = floatValue;
        }
        C6869c c6869c = this.f18494u;
        if (c6869c != null) {
            c6869c.m21756b(this.f18480g);
        }
        this.f18480g.setAlpha(C11679k.m7201c((int) ((((i / 255.0f) * this.f18485l.mo21712h().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f18479f, this.f18480g);
        C6043e.m23827c("GradientFillContent#draw");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p167j1.InterfaceC8785f
    /* renamed from: i */
    public <T> void mo12035i(T t, C12022c<T> c12022c) {
        C6869c c6869c;
        C6869c c6869c2;
        C6869c c6869c3;
        C6869c c6869c4;
        C6869c c6869c5;
        if (t == InterfaceC6071o0.f17264d) {
            this.f18485l.m21767n(c12022c);
        } else if (t == InterfaceC6071o0.f17256K) {
            AbstractC6861a<ColorFilter, ColorFilter> abstractC6861a = this.f18488o;
            if (abstractC6861a != null) {
                this.f18476c.m12112H(abstractC6861a);
            }
            if (c12022c == null) {
                this.f18488o = null;
                return;
            }
            C6885q c6885q = new C6885q(c12022c);
            this.f18488o = c6885q;
            c6885q.m21774a(this);
            this.f18476c.m12102j(this.f18488o);
        } else if (t == InterfaceC6071o0.f17257L) {
            C6885q c6885q2 = this.f18489p;
            if (c6885q2 != null) {
                this.f18476c.m12112H(c6885q2);
            }
            if (c12022c == null) {
                this.f18489p = null;
                return;
            }
            this.f18477d.m39492c();
            this.f18478e.m39492c();
            C6885q c6885q3 = new C6885q(c12022c);
            this.f18489p = c6885q3;
            c6885q3.m21774a(this);
            this.f18476c.m12102j(this.f18489p);
        } else if (t == InterfaceC6071o0.f17270j) {
            AbstractC6861a<Float, Float> abstractC6861a2 = this.f18492s;
            if (abstractC6861a2 != null) {
                abstractC6861a2.m21767n(c12022c);
                return;
            }
            C6885q c6885q4 = new C6885q(c12022c);
            this.f18492s = c6885q4;
            c6885q4.m21774a(this);
            this.f18476c.m12102j(this.f18492s);
        } else if (t == InterfaceC6071o0.f17265e && (c6869c5 = this.f18494u) != null) {
            c6869c5.m21755c(c12022c);
        } else if (t == InterfaceC6071o0.f17252G && (c6869c4 = this.f18494u) != null) {
            c6869c4.m21752f(c12022c);
        } else if (t == InterfaceC6071o0.f17253H && (c6869c3 = this.f18494u) != null) {
            c6869c3.m21754d(c12022c);
        } else if (t == InterfaceC6071o0.f17254I && (c6869c2 = this.f18494u) != null) {
            c6869c2.m21753e(c12022c);
        } else if (t == InterfaceC6071o0.f17255J && (c6869c = this.f18494u) != null) {
            c6869c.m21751g(c12022c);
        }
    }
}
