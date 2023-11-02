package p223m1;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p073e1.C6043e;
import p073e1.C6059j0;
import p073e1.C6062k;
import p092f1.C6303a;
import p111g1.InterfaceC6521c;
import p111g1.InterfaceC6523e;
import p125h1.AbstractC6861a;
import p125h1.C6871d;
import p125h1.C6875h;
import p125h1.C6884p;
import p167j1.C8784e;
import p167j1.InterfaceC8785f;
import p206l1.C10005a;
import p206l1.C10012h;
import p206l1.C10021n;
import p223m1.C10236e;
import p254o1.C10953j;
import p291q1.C11674f;
import p291q1.C11680l;
import p311r1.C12022c;

/* renamed from: m1.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class AbstractC10231b implements InterfaceC6523e, AbstractC6861a.InterfaceC6863b, InterfaceC8785f {

    /* renamed from: A */
    private Paint f26566A;

    /* renamed from: B */
    float f26567B;

    /* renamed from: C */
    BlurMaskFilter f26568C;

    /* renamed from: a */
    private final Path f26569a = new Path();

    /* renamed from: b */
    private final Matrix f26570b = new Matrix();

    /* renamed from: c */
    private final Matrix f26571c = new Matrix();

    /* renamed from: d */
    private final Paint f26572d = new C6303a(1);

    /* renamed from: e */
    private final Paint f26573e = new C6303a(1, PorterDuff.Mode.DST_IN);

    /* renamed from: f */
    private final Paint f26574f = new C6303a(1, PorterDuff.Mode.DST_OUT);

    /* renamed from: g */
    private final Paint f26575g;

    /* renamed from: h */
    private final Paint f26576h;

    /* renamed from: i */
    private final RectF f26577i;

    /* renamed from: j */
    private final RectF f26578j;

    /* renamed from: k */
    private final RectF f26579k;

    /* renamed from: l */
    private final RectF f26580l;

    /* renamed from: m */
    private final RectF f26581m;

    /* renamed from: n */
    private final String f26582n;

    /* renamed from: o */
    final Matrix f26583o;

    /* renamed from: p */
    final C6059j0 f26584p;

    /* renamed from: q */
    final C10236e f26585q;

    /* renamed from: r */
    private C6875h f26586r;

    /* renamed from: s */
    private C6871d f26587s;

    /* renamed from: t */
    private AbstractC10231b f26588t;

    /* renamed from: u */
    private AbstractC10231b f26589u;

    /* renamed from: v */
    private List<AbstractC10231b> f26590v;

    /* renamed from: w */
    private final List<AbstractC6861a<?, ?>> f26591w;

    /* renamed from: x */
    final C6884p f26592x;

    /* renamed from: y */
    private boolean f26593y;

    /* renamed from: z */
    private boolean f26594z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m1.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static /* synthetic */ class C10232a {

        /* renamed from: a */
        static final /* synthetic */ int[] f26595a;

        /* renamed from: b */
        static final /* synthetic */ int[] f26596b;

        static {
            int[] iArr = new int[C10012h.EnumC10013a.values().length];
            f26596b = iArr;
            try {
                iArr[C10012h.EnumC10013a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26596b[C10012h.EnumC10013a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26596b[C10012h.EnumC10013a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26596b[C10012h.EnumC10013a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[C10236e.EnumC10237a.values().length];
            f26595a = iArr2;
            try {
                iArr2[C10236e.EnumC10237a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26595a[C10236e.EnumC10237a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26595a[C10236e.EnumC10237a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26595a[C10236e.EnumC10237a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26595a[C10236e.EnumC10237a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f26595a[C10236e.EnumC10237a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f26595a[C10236e.EnumC10237a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10231b(C6059j0 c6059j0, C10236e c10236e) {
        C6303a c6303a = new C6303a(1);
        this.f26575g = c6303a;
        this.f26576h = new C6303a(PorterDuff.Mode.CLEAR);
        this.f26577i = new RectF();
        this.f26578j = new RectF();
        this.f26579k = new RectF();
        this.f26580l = new RectF();
        this.f26581m = new RectF();
        this.f26583o = new Matrix();
        this.f26591w = new ArrayList();
        this.f26593y = true;
        this.f26567B = 0.0f;
        this.f26584p = c6059j0;
        this.f26585q = c10236e;
        this.f26582n = c10236e.m12075i() + "#draw";
        if (c10236e.m12076h() == C10236e.EnumC10238b.INVERT) {
            c6303a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            c6303a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        C6884p m16827b = c10236e.m12061w().m16827b();
        this.f26592x = m16827b;
        m16827b.m21722b(this);
        if (c10236e.m12077g() != null && !c10236e.m12077g().isEmpty()) {
            C6875h c6875h = new C6875h(c10236e.m12077g());
            this.f26586r = c6875h;
            for (AbstractC6861a<C10021n, Path> abstractC6861a : c6875h.m21742a()) {
                abstractC6861a.m21774a(this);
            }
            for (AbstractC6861a<Integer, Integer> abstractC6861a2 : this.f26586r.m21740c()) {
                m12102j(abstractC6861a2);
                abstractC6861a2.m21774a(this);
            }
        }
        m12108O();
    }

    /* renamed from: C */
    private void m12117C(RectF rectF, Matrix matrix) {
        this.f26579k.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (!m12119A()) {
            return;
        }
        int size = this.f26586r.m21741b().size();
        for (int i = 0; i < size; i++) {
            C10012h c10012h = this.f26586r.m21741b().get(i);
            Path mo21712h = this.f26586r.m21742a().get(i).mo21712h();
            if (mo21712h != null) {
                this.f26569a.set(mo21712h);
                this.f26569a.transform(matrix);
                int i2 = C10232a.f26596b[c10012h.m12589a().ordinal()];
                if (i2 != 1 && i2 != 2) {
                    if ((i2 == 3 || i2 == 4) && c10012h.m12586d()) {
                        return;
                    }
                    this.f26569a.computeBounds(this.f26581m, false);
                    if (i == 0) {
                        this.f26579k.set(this.f26581m);
                    } else {
                        RectF rectF2 = this.f26579k;
                        rectF2.set(Math.min(rectF2.left, this.f26581m.left), Math.min(this.f26579k.top, this.f26581m.top), Math.max(this.f26579k.right, this.f26581m.right), Math.max(this.f26579k.bottom, this.f26581m.bottom));
                    }
                } else {
                    return;
                }
            }
        }
        if (!rectF.intersect(this.f26579k)) {
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* renamed from: D */
    private void m12116D(RectF rectF, Matrix matrix) {
        if (!m12118B() || this.f26585q.m12076h() == C10236e.EnumC10238b.INVERT) {
            return;
        }
        this.f26580l.set(0.0f, 0.0f, 0.0f, 0.0f);
        this.f26588t.mo12038e(this.f26580l, matrix, true);
        if (!rectF.intersect(this.f26580l)) {
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* renamed from: E */
    private void m12115E() {
        this.f26584p.invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ void m12114F() {
        m12109N(this.f26587s.m21749p() == 1.0f);
    }

    /* renamed from: G */
    private void m12113G(float f) {
        this.f26584p.m23772I().m23663n().m23593a(this.f26585q.m12075i(), f);
    }

    /* renamed from: N */
    private void m12109N(boolean z) {
        if (z != this.f26593y) {
            this.f26593y = z;
            m12115E();
        }
    }

    /* renamed from: O */
    private void m12108O() {
        boolean z = true;
        if (!this.f26585q.m12079e().isEmpty()) {
            C6871d c6871d = new C6871d(this.f26585q.m12079e());
            this.f26587s = c6871d;
            c6871d.m21768l();
            this.f26587s.m21774a(new AbstractC6861a.InterfaceC6863b() { // from class: m1.a
                @Override // p125h1.AbstractC6861a.InterfaceC6863b
                /* renamed from: a */
                public final void mo12107a() {
                    AbstractC10231b.this.m12114F();
                }
            });
            if (this.f26587s.mo21712h().floatValue() != 1.0f) {
                z = false;
            }
            m12109N(z);
            m12102j(this.f26587s);
            return;
        }
        m12109N(true);
    }

    /* renamed from: k */
    private void m12101k(Canvas canvas, Matrix matrix, AbstractC6861a<C10021n, Path> abstractC6861a, AbstractC6861a<Integer, Integer> abstractC6861a2) {
        this.f26569a.set(abstractC6861a.mo21712h());
        this.f26569a.transform(matrix);
        this.f26572d.setAlpha((int) (abstractC6861a2.mo21712h().intValue() * 2.55f));
        canvas.drawPath(this.f26569a, this.f26572d);
    }

    /* renamed from: l */
    private void m12100l(Canvas canvas, Matrix matrix, AbstractC6861a<C10021n, Path> abstractC6861a, AbstractC6861a<Integer, Integer> abstractC6861a2) {
        C11680l.m7180m(canvas, this.f26577i, this.f26573e);
        this.f26569a.set(abstractC6861a.mo21712h());
        this.f26569a.transform(matrix);
        this.f26572d.setAlpha((int) (abstractC6861a2.mo21712h().intValue() * 2.55f));
        canvas.drawPath(this.f26569a, this.f26572d);
        canvas.restore();
    }

    /* renamed from: m */
    private void m12099m(Canvas canvas, Matrix matrix, AbstractC6861a<C10021n, Path> abstractC6861a, AbstractC6861a<Integer, Integer> abstractC6861a2) {
        C11680l.m7180m(canvas, this.f26577i, this.f26572d);
        canvas.drawRect(this.f26577i, this.f26572d);
        this.f26569a.set(abstractC6861a.mo21712h());
        this.f26569a.transform(matrix);
        this.f26572d.setAlpha((int) (abstractC6861a2.mo21712h().intValue() * 2.55f));
        canvas.drawPath(this.f26569a, this.f26574f);
        canvas.restore();
    }

    /* renamed from: n */
    private void m12098n(Canvas canvas, Matrix matrix, AbstractC6861a<C10021n, Path> abstractC6861a, AbstractC6861a<Integer, Integer> abstractC6861a2) {
        C11680l.m7180m(canvas, this.f26577i, this.f26573e);
        canvas.drawRect(this.f26577i, this.f26572d);
        this.f26574f.setAlpha((int) (abstractC6861a2.mo21712h().intValue() * 2.55f));
        this.f26569a.set(abstractC6861a.mo21712h());
        this.f26569a.transform(matrix);
        canvas.drawPath(this.f26569a, this.f26574f);
        canvas.restore();
    }

    /* renamed from: o */
    private void m12097o(Canvas canvas, Matrix matrix, AbstractC6861a<C10021n, Path> abstractC6861a, AbstractC6861a<Integer, Integer> abstractC6861a2) {
        C11680l.m7180m(canvas, this.f26577i, this.f26574f);
        canvas.drawRect(this.f26577i, this.f26572d);
        this.f26574f.setAlpha((int) (abstractC6861a2.mo21712h().intValue() * 2.55f));
        this.f26569a.set(abstractC6861a.mo21712h());
        this.f26569a.transform(matrix);
        canvas.drawPath(this.f26569a, this.f26574f);
        canvas.restore();
    }

    /* renamed from: p */
    private void m12096p(Canvas canvas, Matrix matrix) {
        C6043e.m23828b("Layer#saveLayer");
        C11680l.m7179n(canvas, this.f26577i, this.f26573e, 19);
        if (Build.VERSION.SDK_INT < 28) {
            m12092t(canvas);
        }
        C6043e.m23827c("Layer#saveLayer");
        for (int i = 0; i < this.f26586r.m21741b().size(); i++) {
            C10012h c10012h = this.f26586r.m21741b().get(i);
            AbstractC6861a<C10021n, Path> abstractC6861a = this.f26586r.m21742a().get(i);
            AbstractC6861a<Integer, Integer> abstractC6861a2 = this.f26586r.m21740c().get(i);
            int i2 = C10232a.f26596b[c10012h.m12589a().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            if (c10012h.m12586d()) {
                                m12099m(canvas, matrix, abstractC6861a, abstractC6861a2);
                            } else {
                                m12101k(canvas, matrix, abstractC6861a, abstractC6861a2);
                            }
                        }
                    } else if (c10012h.m12586d()) {
                        m12098n(canvas, matrix, abstractC6861a, abstractC6861a2);
                    } else {
                        m12100l(canvas, matrix, abstractC6861a, abstractC6861a2);
                    }
                } else {
                    if (i == 0) {
                        this.f26572d.setColor(-16777216);
                        this.f26572d.setAlpha(255);
                        canvas.drawRect(this.f26577i, this.f26572d);
                    }
                    if (c10012h.m12586d()) {
                        m12097o(canvas, matrix, abstractC6861a, abstractC6861a2);
                    } else {
                        m12095q(canvas, matrix, abstractC6861a);
                    }
                }
            } else if (m12094r()) {
                this.f26572d.setAlpha(255);
                canvas.drawRect(this.f26577i, this.f26572d);
            }
        }
        C6043e.m23828b("Layer#restoreLayer");
        canvas.restore();
        C6043e.m23827c("Layer#restoreLayer");
    }

    /* renamed from: q */
    private void m12095q(Canvas canvas, Matrix matrix, AbstractC6861a<C10021n, Path> abstractC6861a) {
        this.f26569a.set(abstractC6861a.mo21712h());
        this.f26569a.transform(matrix);
        canvas.drawPath(this.f26569a, this.f26574f);
    }

    /* renamed from: r */
    private boolean m12094r() {
        if (this.f26586r.m21742a().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.f26586r.m21741b().size(); i++) {
            if (this.f26586r.m21741b().get(i).m12589a() != C10012h.EnumC10013a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    private void m12093s() {
        if (this.f26590v != null) {
            return;
        }
        if (this.f26589u == null) {
            this.f26590v = Collections.emptyList();
            return;
        }
        this.f26590v = new ArrayList();
        for (AbstractC10231b abstractC10231b = this.f26589u; abstractC10231b != null; abstractC10231b = abstractC10231b.f26589u) {
            this.f26590v.add(abstractC10231b);
        }
    }

    /* renamed from: t */
    private void m12092t(Canvas canvas) {
        C6043e.m23828b("Layer#clearLayer");
        RectF rectF = this.f26577i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f26576h);
        C6043e.m23827c("Layer#clearLayer");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static AbstractC10231b m12091v(C10233c c10233c, C10236e c10236e, C6059j0 c6059j0, C6062k c6062k) {
        switch (C10232a.f26595a[c10236e.m12078f().ordinal()]) {
            case 1:
                return new C10240g(c6059j0, c10236e, c10233c, c6062k);
            case 2:
                return new C10233c(c6059j0, c10236e, c6062k.m23662o(c10236e.m12071m()), c6062k);
            case 3:
                return new C10241h(c6059j0, c10236e);
            case 4:
                return new C10235d(c6059j0, c10236e);
            case 5:
                return new C10239f(c6059j0, c10236e);
            case 6:
                return new C10242i(c6059j0, c10236e);
            default:
                C11674f.m7233c("Unknown layer type " + c10236e.m12078f());
                return null;
        }
    }

    /* renamed from: A */
    boolean m12119A() {
        C6875h c6875h = this.f26586r;
        return (c6875h == null || c6875h.m21742a().isEmpty()) ? false : true;
    }

    /* renamed from: B */
    boolean m12118B() {
        return this.f26588t != null;
    }

    /* renamed from: H */
    public void m12112H(AbstractC6861a<?, ?> abstractC6861a) {
        this.f26591w.remove(abstractC6861a);
    }

    /* renamed from: I */
    void mo12056I(C8784e c8784e, int i, List<C8784e> list, C8784e c8784e2) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public void m12111J(AbstractC10231b abstractC10231b) {
        this.f26588t = abstractC10231b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo12088K(boolean z) {
        if (z && this.f26566A == null) {
            this.f26566A = new C6303a();
        }
        this.f26594z = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public void m12110L(AbstractC10231b abstractC10231b) {
        this.f26589u = abstractC10231b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo12087M(float f) {
        C6043e.m23828b("BaseLayer#setProgress");
        C6043e.m23828b("BaseLayer#setProgress.transform");
        this.f26592x.m21714j(f);
        C6043e.m23827c("BaseLayer#setProgress.transform");
        if (this.f26586r != null) {
            C6043e.m23828b("BaseLayer#setProgress.mask");
            for (int i = 0; i < this.f26586r.m21742a().size(); i++) {
                this.f26586r.m21742a().get(i).mo21709m(f);
            }
            C6043e.m23827c("BaseLayer#setProgress.mask");
        }
        if (this.f26587s != null) {
            C6043e.m23828b("BaseLayer#setProgress.inout");
            this.f26587s.mo21709m(f);
            C6043e.m23827c("BaseLayer#setProgress.inout");
        }
        if (this.f26588t != null) {
            C6043e.m23828b("BaseLayer#setProgress.matte");
            this.f26588t.mo12087M(f);
            C6043e.m23827c("BaseLayer#setProgress.matte");
        }
        C6043e.m23828b("BaseLayer#setProgress.animations." + this.f26591w.size());
        for (int i2 = 0; i2 < this.f26591w.size(); i2++) {
            this.f26591w.get(i2).mo21709m(f);
        }
        C6043e.m23827c("BaseLayer#setProgress.animations." + this.f26591w.size());
        C6043e.m23827c("BaseLayer#setProgress");
    }

    @Override // p125h1.AbstractC6861a.InterfaceC6863b
    /* renamed from: a */
    public void mo12107a() {
        m12115E();
    }

    @Override // p111g1.InterfaceC6521c
    /* renamed from: b */
    public void mo12106b(List<InterfaceC6521c> list, List<InterfaceC6521c> list2) {
    }

    @Override // p167j1.InterfaceC8785f
    /* renamed from: d */
    public void mo12105d(C8784e c8784e, int i, List<C8784e> list, C8784e c8784e2) {
        AbstractC10231b abstractC10231b = this.f26588t;
        if (abstractC10231b != null) {
            C8784e m17259a = c8784e2.m17259a(abstractC10231b.getName());
            if (c8784e.m17257c(this.f26588t.getName(), i)) {
                list.add(m17259a.m17251i(this.f26588t));
            }
            if (c8784e.m17252h(getName(), i)) {
                this.f26588t.mo12056I(c8784e, c8784e.m17255e(this.f26588t.getName(), i) + i, list, m17259a);
            }
        }
        if (!c8784e.m17253g(getName(), i)) {
            return;
        }
        if (!"__container".equals(getName())) {
            c8784e2 = c8784e2.m17259a(getName());
            if (c8784e.m17257c(getName(), i)) {
                list.add(c8784e2.m17251i(this));
            }
        }
        if (c8784e.m17252h(getName(), i)) {
            mo12056I(c8784e, i + c8784e.m17255e(getName(), i), list, c8784e2);
        }
    }

    @Override // p111g1.InterfaceC6523e
    /* renamed from: e */
    public void mo12038e(RectF rectF, Matrix matrix, boolean z) {
        this.f26577i.set(0.0f, 0.0f, 0.0f, 0.0f);
        m12093s();
        this.f26583o.set(matrix);
        if (z) {
            List<AbstractC10231b> list = this.f26590v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f26583o.preConcat(this.f26590v.get(size).f26592x.m21718f());
                }
            } else {
                AbstractC10231b abstractC10231b = this.f26589u;
                if (abstractC10231b != null) {
                    this.f26583o.preConcat(abstractC10231b.f26592x.m21718f());
                }
            }
        }
        this.f26583o.preConcat(this.f26592x.m21718f());
    }

    @Override // p111g1.InterfaceC6521c
    public String getName() {
        return this.f26585q.m12075i();
    }

    @Override // p111g1.InterfaceC6523e
    /* renamed from: h */
    public void mo12103h(Canvas canvas, Matrix matrix, int i) {
        int i2;
        Paint paint;
        Integer mo21712h;
        C6043e.m23828b(this.f26582n);
        if (this.f26593y && !this.f26585q.m12060x()) {
            m12093s();
            C6043e.m23828b("Layer#parentMatrix");
            this.f26570b.reset();
            this.f26570b.set(matrix);
            for (int size = this.f26590v.size() - 1; size >= 0; size--) {
                this.f26570b.preConcat(this.f26590v.get(size).f26592x.m21718f());
            }
            C6043e.m23827c("Layer#parentMatrix");
            AbstractC6861a<?, Integer> m21716h = this.f26592x.m21716h();
            if (m21716h != null && (mo21712h = m21716h.mo21712h()) != null) {
                i2 = mo21712h.intValue();
            } else {
                i2 = 100;
            }
            int i3 = (int) ((((i / 255.0f) * i2) / 100.0f) * 255.0f);
            if (!m12118B() && !m12119A()) {
                this.f26570b.preConcat(this.f26592x.m21718f());
                C6043e.m23828b("Layer#drawLayer");
                mo12034u(canvas, this.f26570b, i3);
                C6043e.m23827c("Layer#drawLayer");
                m12113G(C6043e.m23827c(this.f26582n));
                return;
            }
            C6043e.m23828b("Layer#computeBounds");
            mo12038e(this.f26577i, this.f26570b, false);
            m12116D(this.f26577i, matrix);
            this.f26570b.preConcat(this.f26592x.m21718f());
            m12117C(this.f26577i, this.f26570b);
            this.f26578j.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
            canvas.getMatrix(this.f26571c);
            if (!this.f26571c.isIdentity()) {
                Matrix matrix2 = this.f26571c;
                matrix2.invert(matrix2);
                this.f26571c.mapRect(this.f26578j);
            }
            if (!this.f26577i.intersect(this.f26578j)) {
                this.f26577i.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            C6043e.m23827c("Layer#computeBounds");
            if (this.f26577i.width() >= 1.0f && this.f26577i.height() >= 1.0f) {
                C6043e.m23828b("Layer#saveLayer");
                this.f26572d.setAlpha(255);
                C11680l.m7180m(canvas, this.f26577i, this.f26572d);
                C6043e.m23827c("Layer#saveLayer");
                m12092t(canvas);
                C6043e.m23828b("Layer#drawLayer");
                mo12034u(canvas, this.f26570b, i3);
                C6043e.m23827c("Layer#drawLayer");
                if (m12119A()) {
                    m12096p(canvas, this.f26570b);
                }
                if (m12118B()) {
                    C6043e.m23828b("Layer#drawMatte");
                    C6043e.m23828b("Layer#saveLayer");
                    C11680l.m7179n(canvas, this.f26577i, this.f26575g, 19);
                    C6043e.m23827c("Layer#saveLayer");
                    m12092t(canvas);
                    this.f26588t.mo12103h(canvas, matrix, i3);
                    C6043e.m23828b("Layer#restoreLayer");
                    canvas.restore();
                    C6043e.m23827c("Layer#restoreLayer");
                    C6043e.m23827c("Layer#drawMatte");
                }
                C6043e.m23828b("Layer#restoreLayer");
                canvas.restore();
                C6043e.m23827c("Layer#restoreLayer");
            }
            if (this.f26594z && (paint = this.f26566A) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.f26566A.setColor(-251901);
                this.f26566A.setStrokeWidth(4.0f);
                canvas.drawRect(this.f26577i, this.f26566A);
                this.f26566A.setStyle(Paint.Style.FILL);
                this.f26566A.setColor(1357638635);
                canvas.drawRect(this.f26577i, this.f26566A);
            }
            m12113G(C6043e.m23827c(this.f26582n));
            return;
        }
        C6043e.m23827c(this.f26582n);
    }

    @Override // p167j1.InterfaceC8785f
    /* renamed from: i */
    public <T> void mo12035i(T t, C12022c<T> c12022c) {
        this.f26592x.m21721c(t, c12022c);
    }

    /* renamed from: j */
    public void m12102j(AbstractC6861a<?, ?> abstractC6861a) {
        if (abstractC6861a == null) {
            return;
        }
        this.f26591w.add(abstractC6861a);
    }

    /* renamed from: u */
    abstract void mo12034u(Canvas canvas, Matrix matrix, int i);

    /* renamed from: w */
    public C10005a mo12055w() {
        return this.f26585q.m12083a();
    }

    /* renamed from: x */
    public BlurMaskFilter m12090x(float f) {
        if (this.f26567B == f) {
            return this.f26568C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.f26568C = blurMaskFilter;
        this.f26567B = f;
        return blurMaskFilter;
    }

    /* renamed from: y */
    public C10953j mo12054y() {
        return this.f26585q.m12081c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public C10236e m12089z() {
        return this.f26585q;
    }
}
