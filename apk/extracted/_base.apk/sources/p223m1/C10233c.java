package p223m1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.collection.C0629d;
import java.util.ArrayList;
import java.util.List;
import p073e1.C6043e;
import p073e1.C6059j0;
import p073e1.C6062k;
import p073e1.InterfaceC6071o0;
import p125h1.AbstractC6861a;
import p125h1.C6885q;
import p167j1.C8784e;
import p188k1.C9038b;
import p223m1.C10236e;
import p291q1.C11680l;
import p311r1.C12022c;

/* renamed from: m1.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10233c extends AbstractC10231b {

    /* renamed from: D */
    private AbstractC6861a<Float, Float> f26597D;

    /* renamed from: E */
    private final List<AbstractC10231b> f26598E;

    /* renamed from: F */
    private final RectF f26599F;

    /* renamed from: G */
    private final RectF f26600G;

    /* renamed from: H */
    private final Paint f26601H;

    /* renamed from: I */
    private float f26602I;

    /* renamed from: J */
    private boolean f26603J;

    /* renamed from: m1.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static /* synthetic */ class C10234a {

        /* renamed from: a */
        static final /* synthetic */ int[] f26604a;

        static {
            int[] iArr = new int[C10236e.EnumC10238b.values().length];
            f26604a = iArr;
            try {
                iArr[C10236e.EnumC10238b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26604a[C10236e.EnumC10238b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C10233c(C6059j0 c6059j0, C10236e c10236e, List<C10236e> list, C6062k c6062k) {
        super(c6059j0, c10236e);
        int i;
        AbstractC10231b abstractC10231b;
        this.f26598E = new ArrayList();
        this.f26599F = new RectF();
        this.f26600G = new RectF();
        this.f26601H = new Paint();
        this.f26603J = true;
        C9038b m12063u = c10236e.m12063u();
        if (m12063u != null) {
            AbstractC6861a<Float, Float> mo16817a = m12063u.mo16817a();
            this.f26597D = mo16817a;
            m12102j(mo16817a);
            this.f26597D.m21774a(this);
        } else {
            this.f26597D = null;
        }
        C0629d c0629d = new C0629d(c6062k.m23666k().size());
        int size = list.size() - 1;
        AbstractC10231b abstractC10231b2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            C10236e c10236e2 = list.get(size);
            AbstractC10231b m12091v = AbstractC10231b.m12091v(this, c10236e2, c6059j0, c6062k);
            if (m12091v != null) {
                c0629d.m39484m(m12091v.m12089z().m12080d(), m12091v);
                if (abstractC10231b2 != null) {
                    abstractC10231b2.m12111J(m12091v);
                    abstractC10231b2 = null;
                } else {
                    this.f26598E.add(0, m12091v);
                    int i2 = C10234a.f26604a[c10236e2.m12076h().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        abstractC10231b2 = m12091v;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < c0629d.m39481q(); i++) {
            AbstractC10231b abstractC10231b3 = (AbstractC10231b) c0629d.m39488g(c0629d.m39485l(i));
            if (abstractC10231b3 != null && (abstractC10231b = (AbstractC10231b) c0629d.m39488g(abstractC10231b3.m12089z().m12074j())) != null) {
                abstractC10231b3.m12110L(abstractC10231b);
            }
        }
    }

    @Override // p223m1.AbstractC10231b
    /* renamed from: I */
    protected void mo12056I(C8784e c8784e, int i, List<C8784e> list, C8784e c8784e2) {
        for (int i2 = 0; i2 < this.f26598E.size(); i2++) {
            this.f26598E.get(i2).mo12105d(c8784e, i, list, c8784e2);
        }
    }

    @Override // p223m1.AbstractC10231b
    /* renamed from: K */
    public void mo12088K(boolean z) {
        super.mo12088K(z);
        for (AbstractC10231b abstractC10231b : this.f26598E) {
            abstractC10231b.mo12088K(z);
        }
    }

    @Override // p223m1.AbstractC10231b
    /* renamed from: M */
    public void mo12087M(float f) {
        C6043e.m23828b("CompositionLayer#setProgress");
        this.f26602I = f;
        super.mo12087M(f);
        if (this.f26597D != null) {
            f = ((this.f26597D.mo21712h().floatValue() * this.f26585q.m12082b().m23668i()) - this.f26585q.m12082b().m23661p()) / (this.f26584p.m23772I().m23672e() + 0.01f);
        }
        if (this.f26597D == null) {
            f -= this.f26585q.m12066r();
        }
        if (this.f26585q.m12062v() != 0.0f && !"__container".equals(this.f26585q.m12075i())) {
            f /= this.f26585q.m12062v();
        }
        for (int size = this.f26598E.size() - 1; size >= 0; size--) {
            this.f26598E.get(size).mo12087M(f);
        }
        C6043e.m23827c("CompositionLayer#setProgress");
    }

    /* renamed from: P */
    public float m12086P() {
        return this.f26602I;
    }

    /* renamed from: Q */
    public void m12085Q(boolean z) {
        this.f26603J = z;
    }

    @Override // p223m1.AbstractC10231b, p111g1.InterfaceC6523e
    /* renamed from: e */
    public void mo12038e(RectF rectF, Matrix matrix, boolean z) {
        super.mo12038e(rectF, matrix, z);
        for (int size = this.f26598E.size() - 1; size >= 0; size--) {
            this.f26599F.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f26598E.get(size).mo12038e(this.f26599F, this.f26583o, true);
            rectF.union(this.f26599F);
        }
    }

    @Override // p223m1.AbstractC10231b, p167j1.InterfaceC8785f
    /* renamed from: i */
    public <T> void mo12035i(T t, C12022c<T> c12022c) {
        super.mo12035i(t, c12022c);
        if (t == InterfaceC6071o0.f17250E) {
            if (c12022c == null) {
                AbstractC6861a<Float, Float> abstractC6861a = this.f26597D;
                if (abstractC6861a != null) {
                    abstractC6861a.m21767n(null);
                    return;
                }
                return;
            }
            C6885q c6885q = new C6885q(c12022c);
            this.f26597D = c6885q;
            c6885q.m21774a(this);
            m12102j(this.f26597D);
        }
    }

    @Override // p223m1.AbstractC10231b
    /* renamed from: u */
    void mo12034u(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        C6043e.m23828b("CompositionLayer#draw");
        this.f26600G.set(0.0f, 0.0f, this.f26585q.m12072l(), this.f26585q.m12073k());
        matrix.mapRect(this.f26600G);
        if (this.f26584p.m23726d0() && this.f26598E.size() > 1 && i != 255) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f26601H.setAlpha(i);
            C11680l.m7180m(canvas, this.f26600G, this.f26601H);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.f26598E.size() - 1; size >= 0; size--) {
            if (!this.f26603J && "__container".equals(this.f26585q.m12075i())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 && !this.f26600G.isEmpty()) {
                z3 = canvas.clipRect(this.f26600G);
            } else {
                z3 = true;
            }
            if (z3) {
                this.f26598E.get(size).mo12103h(canvas, matrix, i);
            }
        }
        canvas.restore();
        C6043e.m23827c("CompositionLayer#draw");
    }
}
