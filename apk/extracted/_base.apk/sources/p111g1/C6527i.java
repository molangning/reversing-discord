package p111g1;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.C0629d;
import p073e1.C6059j0;
import p073e1.InterfaceC6071o0;
import p125h1.AbstractC6861a;
import p125h1.C6885q;
import p206l1.C10008d;
import p206l1.C10010f;
import p206l1.EnumC10011g;
import p223m1.AbstractC10231b;
import p311r1.C12022c;

/* renamed from: g1.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6527i extends AbstractC6517a {

    /* renamed from: A */
    private final AbstractC6861a<PointF, PointF> f18495A;

    /* renamed from: B */
    private C6885q f18496B;

    /* renamed from: r */
    private final String f18497r;

    /* renamed from: s */
    private final boolean f18498s;

    /* renamed from: t */
    private final C0629d<LinearGradient> f18499t;

    /* renamed from: u */
    private final C0629d<RadialGradient> f18500u;

    /* renamed from: v */
    private final RectF f18501v;

    /* renamed from: w */
    private final EnumC10011g f18502w;

    /* renamed from: x */
    private final int f18503x;

    /* renamed from: y */
    private final AbstractC6861a<C10008d, C10008d> f18504y;

    /* renamed from: z */
    private final AbstractC6861a<PointF, PointF> f18505z;

    public C6527i(C6059j0 c6059j0, AbstractC10231b abstractC10231b, C10010f c10010f) {
        super(c6059j0, abstractC10231b, c10010f.m12603b().m12526b(), c10010f.m12598g().m12524b(), c10010f.m12596i(), c10010f.m12594k(), c10010f.m12592m(), c10010f.m12597h(), c10010f.m12602c());
        this.f18499t = new C0629d<>();
        this.f18500u = new C0629d<>();
        this.f18501v = new RectF();
        this.f18497r = c10010f.m12595j();
        this.f18502w = c10010f.m12599f();
        this.f18498s = c10010f.m12591n();
        this.f18503x = (int) (c6059j0.m23772I().m23673d() / 32.0f);
        AbstractC6861a<C10008d, C10008d> mo16817a = c10010f.m12600e().mo16817a();
        this.f18504y = mo16817a;
        mo16817a.m21774a(this);
        abstractC10231b.m12102j(mo16817a);
        AbstractC6861a<PointF, PointF> mo16817a2 = c10010f.m12593l().mo16817a();
        this.f18505z = mo16817a2;
        mo16817a2.m21774a(this);
        abstractC10231b.m12102j(mo16817a2);
        AbstractC6861a<PointF, PointF> mo16817a3 = c10010f.m12601d().mo16817a();
        this.f18495A = mo16817a3;
        mo16817a3.m21774a(this);
        abstractC10231b.m12102j(mo16817a3);
    }

    /* renamed from: k */
    private int[] m22444k(int[] iArr) {
        C6885q c6885q = this.f18496B;
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

    /* renamed from: l */
    private int m22443l() {
        int i;
        int round = Math.round(this.f18505z.m21770f() * this.f18503x);
        int round2 = Math.round(this.f18495A.m21770f() * this.f18503x);
        int round3 = Math.round(this.f18504y.m21770f() * this.f18503x);
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

    /* renamed from: m */
    private LinearGradient m22442m() {
        long m22443l = m22443l();
        LinearGradient m39488g = this.f18499t.m39488g(m22443l);
        if (m39488g != null) {
            return m39488g;
        }
        PointF mo21712h = this.f18505z.mo21712h();
        PointF mo21712h2 = this.f18495A.mo21712h();
        C10008d mo21712h3 = this.f18504y.mo21712h();
        LinearGradient linearGradient = new LinearGradient(mo21712h.x, mo21712h.y, mo21712h2.x, mo21712h2.y, m22444k(mo21712h3.m12615c()), mo21712h3.m12614d(), Shader.TileMode.CLAMP);
        this.f18499t.m39484m(m22443l, linearGradient);
        return linearGradient;
    }

    /* renamed from: n */
    private RadialGradient m22441n() {
        float f;
        float f2;
        long m22443l = m22443l();
        RadialGradient m39488g = this.f18500u.m39488g(m22443l);
        if (m39488g != null) {
            return m39488g;
        }
        PointF mo21712h = this.f18505z.mo21712h();
        PointF mo21712h2 = this.f18495A.mo21712h();
        C10008d mo21712h3 = this.f18504y.mo21712h();
        int[] m22444k = m22444k(mo21712h3.m12615c());
        float[] m12614d = mo21712h3.m12614d();
        RadialGradient radialGradient = new RadialGradient(mo21712h.x, mo21712h.y, (float) Math.hypot(mo21712h2.x - f, mo21712h2.y - f2), m22444k, m12614d, Shader.TileMode.CLAMP);
        this.f18500u.m39484m(m22443l, radialGradient);
        return radialGradient;
    }

    @Override // p111g1.InterfaceC6521c
    public String getName() {
        return this.f18497r;
    }

    @Override // p111g1.AbstractC6517a, p111g1.InterfaceC6523e
    /* renamed from: h */
    public void mo12103h(Canvas canvas, Matrix matrix, int i) {
        Shader m22441n;
        if (this.f18498s) {
            return;
        }
        mo12038e(this.f18501v, matrix, false);
        if (this.f18502w == EnumC10011g.LINEAR) {
            m22441n = m22442m();
        } else {
            m22441n = m22441n();
        }
        m22441n.setLocalMatrix(matrix);
        this.f18430i.setShader(m22441n);
        super.mo12103h(canvas, matrix, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p111g1.AbstractC6517a, p167j1.InterfaceC8785f
    /* renamed from: i */
    public <T> void mo12035i(T t, C12022c<T> c12022c) {
        super.mo12035i(t, c12022c);
        if (t == InterfaceC6071o0.f17257L) {
            C6885q c6885q = this.f18496B;
            if (c6885q != null) {
                this.f18427f.m12112H(c6885q);
            }
            if (c12022c == null) {
                this.f18496B = null;
                return;
            }
            C6885q c6885q2 = new C6885q(c12022c);
            this.f18496B = c6885q2;
            c6885q2.m21774a(this);
            this.f18427f.m12102j(this.f18496B);
        }
    }
}
