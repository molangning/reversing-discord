package p125h1;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;
import p073e1.InterfaceC6071o0;
import p125h1.AbstractC6861a;
import p188k1.C9048l;
import p223m1.AbstractC10231b;
import p311r1.C12020a;
import p311r1.C12022c;
import p311r1.C12023d;

/* renamed from: h1.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6884p {

    /* renamed from: a */
    private final Matrix f19161a = new Matrix();

    /* renamed from: b */
    private final Matrix f19162b;

    /* renamed from: c */
    private final Matrix f19163c;

    /* renamed from: d */
    private final Matrix f19164d;

    /* renamed from: e */
    private final float[] f19165e;

    /* renamed from: f */
    private AbstractC6861a<PointF, PointF> f19166f;

    /* renamed from: g */
    private AbstractC6861a<?, PointF> f19167g;

    /* renamed from: h */
    private AbstractC6861a<C12023d, C12023d> f19168h;

    /* renamed from: i */
    private AbstractC6861a<Float, Float> f19169i;

    /* renamed from: j */
    private AbstractC6861a<Integer, Integer> f19170j;

    /* renamed from: k */
    private C6871d f19171k;

    /* renamed from: l */
    private C6871d f19172l;

    /* renamed from: m */
    private AbstractC6861a<?, Float> f19173m;

    /* renamed from: n */
    private AbstractC6861a<?, Float> f19174n;

    public C6884p(C9048l c9048l) {
        AbstractC6861a<PointF, PointF> mo16817a;
        AbstractC6861a<PointF, PointF> mo16817a2;
        AbstractC6861a<C12023d, C12023d> mo16817a3;
        AbstractC6861a<Float, Float> mo16817a4;
        C6871d c6871d;
        C6871d c6871d2;
        if (c9048l.m16826c() == null) {
            mo16817a = null;
        } else {
            mo16817a = c9048l.m16826c().mo16817a();
        }
        this.f19166f = mo16817a;
        if (c9048l.m16823f() == null) {
            mo16817a2 = null;
        } else {
            mo16817a2 = c9048l.m16823f().mo16817a();
        }
        this.f19167g = mo16817a2;
        if (c9048l.m16821h() == null) {
            mo16817a3 = null;
        } else {
            mo16817a3 = c9048l.m16821h().mo16817a();
        }
        this.f19168h = mo16817a3;
        if (c9048l.m16822g() == null) {
            mo16817a4 = null;
        } else {
            mo16817a4 = c9048l.m16822g().mo16817a();
        }
        this.f19169i = mo16817a4;
        if (c9048l.m16820i() == null) {
            c6871d = null;
        } else {
            c6871d = (C6871d) c9048l.m16820i().mo16817a();
        }
        this.f19171k = c6871d;
        if (c6871d != null) {
            this.f19162b = new Matrix();
            this.f19163c = new Matrix();
            this.f19164d = new Matrix();
            this.f19165e = new float[9];
        } else {
            this.f19162b = null;
            this.f19163c = null;
            this.f19164d = null;
            this.f19165e = null;
        }
        if (c9048l.m16819j() == null) {
            c6871d2 = null;
        } else {
            c6871d2 = (C6871d) c9048l.m16819j().mo16817a();
        }
        this.f19172l = c6871d2;
        if (c9048l.m16824e() != null) {
            this.f19170j = c9048l.m16824e().mo16817a();
        }
        if (c9048l.m16818k() != null) {
            this.f19173m = c9048l.m16818k().mo16817a();
        } else {
            this.f19173m = null;
        }
        if (c9048l.m16825d() != null) {
            this.f19174n = c9048l.m16825d().mo16817a();
        } else {
            this.f19174n = null;
        }
    }

    /* renamed from: d */
    private void m21720d() {
        for (int i = 0; i < 9; i++) {
            this.f19165e[i] = 0.0f;
        }
    }

    /* renamed from: a */
    public void m21723a(AbstractC10231b abstractC10231b) {
        abstractC10231b.m12102j(this.f19170j);
        abstractC10231b.m12102j(this.f19173m);
        abstractC10231b.m12102j(this.f19174n);
        abstractC10231b.m12102j(this.f19166f);
        abstractC10231b.m12102j(this.f19167g);
        abstractC10231b.m12102j(this.f19168h);
        abstractC10231b.m12102j(this.f19169i);
        abstractC10231b.m12102j(this.f19171k);
        abstractC10231b.m12102j(this.f19172l);
    }

    /* renamed from: b */
    public void m21722b(AbstractC6861a.InterfaceC6863b interfaceC6863b) {
        AbstractC6861a<Integer, Integer> abstractC6861a = this.f19170j;
        if (abstractC6861a != null) {
            abstractC6861a.m21774a(interfaceC6863b);
        }
        AbstractC6861a<?, Float> abstractC6861a2 = this.f19173m;
        if (abstractC6861a2 != null) {
            abstractC6861a2.m21774a(interfaceC6863b);
        }
        AbstractC6861a<?, Float> abstractC6861a3 = this.f19174n;
        if (abstractC6861a3 != null) {
            abstractC6861a3.m21774a(interfaceC6863b);
        }
        AbstractC6861a<PointF, PointF> abstractC6861a4 = this.f19166f;
        if (abstractC6861a4 != null) {
            abstractC6861a4.m21774a(interfaceC6863b);
        }
        AbstractC6861a<?, PointF> abstractC6861a5 = this.f19167g;
        if (abstractC6861a5 != null) {
            abstractC6861a5.m21774a(interfaceC6863b);
        }
        AbstractC6861a<C12023d, C12023d> abstractC6861a6 = this.f19168h;
        if (abstractC6861a6 != null) {
            abstractC6861a6.m21774a(interfaceC6863b);
        }
        AbstractC6861a<Float, Float> abstractC6861a7 = this.f19169i;
        if (abstractC6861a7 != null) {
            abstractC6861a7.m21774a(interfaceC6863b);
        }
        C6871d c6871d = this.f19171k;
        if (c6871d != null) {
            c6871d.m21774a(interfaceC6863b);
        }
        C6871d c6871d2 = this.f19172l;
        if (c6871d2 != null) {
            c6871d2.m21774a(interfaceC6863b);
        }
    }

    /* renamed from: c */
    public <T> boolean m21721c(T t, C12022c<T> c12022c) {
        if (t == InterfaceC6071o0.f17266f) {
            AbstractC6861a<PointF, PointF> abstractC6861a = this.f19166f;
            if (abstractC6861a == null) {
                this.f19166f = new C6885q(c12022c, new PointF());
                return true;
            }
            abstractC6861a.m21767n(c12022c);
            return true;
        } else if (t == InterfaceC6071o0.f17267g) {
            AbstractC6861a<?, PointF> abstractC6861a2 = this.f19167g;
            if (abstractC6861a2 == null) {
                this.f19167g = new C6885q(c12022c, new PointF());
                return true;
            }
            abstractC6861a2.m21767n(c12022c);
            return true;
        } else {
            if (t == InterfaceC6071o0.f17268h) {
                AbstractC6861a<?, PointF> abstractC6861a3 = this.f19167g;
                if (abstractC6861a3 instanceof C6881n) {
                    ((C6881n) abstractC6861a3).m21728r(c12022c);
                    return true;
                }
            }
            if (t == InterfaceC6071o0.f17269i) {
                AbstractC6861a<?, PointF> abstractC6861a4 = this.f19167g;
                if (abstractC6861a4 instanceof C6881n) {
                    ((C6881n) abstractC6861a4).m21727s(c12022c);
                    return true;
                }
            }
            if (t == InterfaceC6071o0.f17275o) {
                AbstractC6861a<C12023d, C12023d> abstractC6861a5 = this.f19168h;
                if (abstractC6861a5 == null) {
                    this.f19168h = new C6885q(c12022c, new C12023d());
                    return true;
                }
                abstractC6861a5.m21767n(c12022c);
                return true;
            } else if (t == InterfaceC6071o0.f17276p) {
                AbstractC6861a<Float, Float> abstractC6861a6 = this.f19169i;
                if (abstractC6861a6 == null) {
                    this.f19169i = new C6885q(c12022c, Float.valueOf(0.0f));
                    return true;
                }
                abstractC6861a6.m21767n(c12022c);
                return true;
            } else if (t == InterfaceC6071o0.f17263c) {
                AbstractC6861a<Integer, Integer> abstractC6861a7 = this.f19170j;
                if (abstractC6861a7 == null) {
                    this.f19170j = new C6885q(c12022c, 100);
                    return true;
                }
                abstractC6861a7.m21767n(c12022c);
                return true;
            } else if (t == InterfaceC6071o0.f17248C) {
                AbstractC6861a<?, Float> abstractC6861a8 = this.f19173m;
                if (abstractC6861a8 == null) {
                    this.f19173m = new C6885q(c12022c, Float.valueOf(100.0f));
                    return true;
                }
                abstractC6861a8.m21767n(c12022c);
                return true;
            } else if (t == InterfaceC6071o0.f17249D) {
                AbstractC6861a<?, Float> abstractC6861a9 = this.f19174n;
                if (abstractC6861a9 == null) {
                    this.f19174n = new C6885q(c12022c, Float.valueOf(100.0f));
                    return true;
                }
                abstractC6861a9.m21767n(c12022c);
                return true;
            } else if (t == InterfaceC6071o0.f17277q) {
                if (this.f19171k == null) {
                    this.f19171k = new C6871d(Collections.singletonList(new C12020a(Float.valueOf(0.0f))));
                }
                this.f19171k.m21767n(c12022c);
                return true;
            } else if (t == InterfaceC6071o0.f17278r) {
                if (this.f19172l == null) {
                    this.f19172l = new C6871d(Collections.singletonList(new C12020a(Float.valueOf(0.0f))));
                }
                this.f19172l.m21767n(c12022c);
                return true;
            } else {
                return false;
            }
        }
    }

    /* renamed from: e */
    public AbstractC6861a<?, Float> m21719e() {
        return this.f19174n;
    }

    /* renamed from: f */
    public Matrix m21718f() {
        C6871d c6871d;
        PointF mo21712h;
        C6871d c6871d2;
        float cos;
        C6871d c6871d3;
        float sin;
        float m21749p;
        PointF mo21712h2;
        this.f19161a.reset();
        AbstractC6861a<?, PointF> abstractC6861a = this.f19167g;
        if (abstractC6861a != null && (mo21712h2 = abstractC6861a.mo21712h()) != null) {
            float f = mo21712h2.x;
            if (f != 0.0f || mo21712h2.y != 0.0f) {
                this.f19161a.preTranslate(f, mo21712h2.y);
            }
        }
        AbstractC6861a<Float, Float> abstractC6861a2 = this.f19169i;
        if (abstractC6861a2 != null) {
            if (abstractC6861a2 instanceof C6885q) {
                m21749p = abstractC6861a2.mo21712h().floatValue();
            } else {
                m21749p = ((C6871d) abstractC6861a2).m21749p();
            }
            if (m21749p != 0.0f) {
                this.f19161a.preRotate(m21749p);
            }
        }
        if (this.f19171k != null) {
            if (this.f19172l == null) {
                cos = 0.0f;
            } else {
                cos = (float) Math.cos(Math.toRadians((-c6871d2.m21749p()) + 90.0f));
            }
            if (this.f19172l == null) {
                sin = 1.0f;
            } else {
                sin = (float) Math.sin(Math.toRadians((-c6871d3.m21749p()) + 90.0f));
            }
            float tan = (float) Math.tan(Math.toRadians(c6871d.m21749p()));
            m21720d();
            float[] fArr = this.f19165e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f2 = -sin;
            fArr[3] = f2;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.f19162b.setValues(fArr);
            m21720d();
            float[] fArr2 = this.f19165e;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f19163c.setValues(fArr2);
            m21720d();
            float[] fArr3 = this.f19165e;
            fArr3[0] = cos;
            fArr3[1] = f2;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.f19164d.setValues(fArr3);
            this.f19163c.preConcat(this.f19162b);
            this.f19164d.preConcat(this.f19163c);
            this.f19161a.preConcat(this.f19164d);
        }
        AbstractC6861a<C12023d, C12023d> abstractC6861a3 = this.f19168h;
        if (abstractC6861a3 != null) {
            C12023d mo21712h3 = abstractC6861a3.mo21712h();
            if (mo21712h3.m6564b() != 1.0f || mo21712h3.m6563c() != 1.0f) {
                this.f19161a.preScale(mo21712h3.m6564b(), mo21712h3.m6563c());
            }
        }
        AbstractC6861a<PointF, PointF> abstractC6861a4 = this.f19166f;
        if (abstractC6861a4 != null && (((mo21712h = abstractC6861a4.mo21712h()) != null && mo21712h.x != 0.0f) || mo21712h.y != 0.0f)) {
            this.f19161a.preTranslate(-mo21712h.x, -mo21712h.y);
        }
        return this.f19161a;
    }

    /* renamed from: g */
    public Matrix m21717g(float f) {
        PointF mo21712h;
        C12023d mo21712h2;
        float f2;
        AbstractC6861a<?, PointF> abstractC6861a = this.f19167g;
        PointF pointF = null;
        if (abstractC6861a == null) {
            mo21712h = null;
        } else {
            mo21712h = abstractC6861a.mo21712h();
        }
        AbstractC6861a<C12023d, C12023d> abstractC6861a2 = this.f19168h;
        if (abstractC6861a2 == null) {
            mo21712h2 = null;
        } else {
            mo21712h2 = abstractC6861a2.mo21712h();
        }
        this.f19161a.reset();
        if (mo21712h != null) {
            this.f19161a.preTranslate(mo21712h.x * f, mo21712h.y * f);
        }
        if (mo21712h2 != null) {
            double d = f;
            this.f19161a.preScale((float) Math.pow(mo21712h2.m6564b(), d), (float) Math.pow(mo21712h2.m6563c(), d));
        }
        AbstractC6861a<Float, Float> abstractC6861a3 = this.f19169i;
        if (abstractC6861a3 != null) {
            float floatValue = abstractC6861a3.mo21712h().floatValue();
            AbstractC6861a<PointF, PointF> abstractC6861a4 = this.f19166f;
            if (abstractC6861a4 != null) {
                pointF = abstractC6861a4.mo21712h();
            }
            Matrix matrix = this.f19161a;
            float f3 = floatValue * f;
            float f4 = 0.0f;
            if (pointF == null) {
                f2 = 0.0f;
            } else {
                f2 = pointF.x;
            }
            if (pointF != null) {
                f4 = pointF.y;
            }
            matrix.preRotate(f3, f2, f4);
        }
        return this.f19161a;
    }

    /* renamed from: h */
    public AbstractC6861a<?, Integer> m21716h() {
        return this.f19170j;
    }

    /* renamed from: i */
    public AbstractC6861a<?, Float> m21715i() {
        return this.f19173m;
    }

    /* renamed from: j */
    public void m21714j(float f) {
        AbstractC6861a<Integer, Integer> abstractC6861a = this.f19170j;
        if (abstractC6861a != null) {
            abstractC6861a.mo21709m(f);
        }
        AbstractC6861a<?, Float> abstractC6861a2 = this.f19173m;
        if (abstractC6861a2 != null) {
            abstractC6861a2.mo21709m(f);
        }
        AbstractC6861a<?, Float> abstractC6861a3 = this.f19174n;
        if (abstractC6861a3 != null) {
            abstractC6861a3.mo21709m(f);
        }
        AbstractC6861a<PointF, PointF> abstractC6861a4 = this.f19166f;
        if (abstractC6861a4 != null) {
            abstractC6861a4.mo21709m(f);
        }
        AbstractC6861a<?, PointF> abstractC6861a5 = this.f19167g;
        if (abstractC6861a5 != null) {
            abstractC6861a5.mo21709m(f);
        }
        AbstractC6861a<C12023d, C12023d> abstractC6861a6 = this.f19168h;
        if (abstractC6861a6 != null) {
            abstractC6861a6.mo21709m(f);
        }
        AbstractC6861a<Float, Float> abstractC6861a7 = this.f19169i;
        if (abstractC6861a7 != null) {
            abstractC6861a7.mo21709m(f);
        }
        C6871d c6871d = this.f19171k;
        if (c6871d != null) {
            c6871d.mo21709m(f);
        }
        C6871d c6871d2 = this.f19172l;
        if (c6871d2 != null) {
            c6871d2.mo21709m(f);
        }
    }
}