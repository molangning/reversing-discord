package p254o1;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.animation.C1226a;
import java.lang.ref.WeakReference;
import p073e1.C6043e;
import p073e1.C6062k;
import p275p1.AbstractC11368c;
import p291q1.C11679k;
import p291q1.C11680l;
import p311r1.C12020a;

/* renamed from: o1.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C10969t {

    /* renamed from: b */
    private static SparseArrayCompat<WeakReference<Interpolator>> f28755b;

    /* renamed from: a */
    private static final Interpolator f28754a = new LinearInterpolator();

    /* renamed from: c */
    static AbstractC11368c.C11369a f28756c = AbstractC11368c.C11369a.m8241a("t", "s", "e", "o", "i", "h", "to", "ti");

    /* renamed from: d */
    static AbstractC11368c.C11369a f28757d = AbstractC11368c.C11369a.m8241a("x", "y");

    C10969t() {
    }

    /* renamed from: a */
    private static WeakReference<Interpolator> m9450a(int i) {
        WeakReference<Interpolator> m39516f;
        synchronized (C10969t.class) {
            m39516f = m9444g().m39516f(i);
        }
        return m39516f;
    }

    /* renamed from: b */
    private static Interpolator m9449b(PointF pointF, PointF pointF2) {
        WeakReference<Interpolator> m9450a;
        Interpolator linearInterpolator;
        pointF.x = C11679k.m7202b(pointF.x, -1.0f, 1.0f);
        pointF.y = C11679k.m7202b(pointF.y, -100.0f, 100.0f);
        pointF2.x = C11679k.m7202b(pointF2.x, -1.0f, 1.0f);
        float m7202b = C11679k.m7202b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = m7202b;
        int m7184i = C11680l.m7184i(pointF.x, pointF.y, pointF2.x, m7202b);
        Interpolator interpolator = null;
        if (C6043e.m23826d()) {
            m9450a = null;
        } else {
            m9450a = m9450a(m7184i);
        }
        if (m9450a != null) {
            interpolator = m9450a.get();
        }
        if (m9450a == null || interpolator == null) {
            try {
                linearInterpolator = C1226a.m37496a(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                    linearInterpolator = C1226a.m37496a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    linearInterpolator = new LinearInterpolator();
                }
            }
            interpolator = linearInterpolator;
            if (!C6043e.m23826d()) {
                try {
                    m9443h(m7184i, new WeakReference(interpolator));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return interpolator;
    }

    /* renamed from: c */
    public static <T> C12020a<T> m9448c(AbstractC11368c abstractC11368c, C6062k c6062k, float f, InterfaceC10962n0<T> interfaceC10962n0, boolean z, boolean z2) {
        if (z && z2) {
            return m9446e(c6062k, abstractC11368c, f, interfaceC10962n0);
        }
        if (z) {
            return m9447d(c6062k, abstractC11368c, f, interfaceC10962n0);
        }
        return m9445f(abstractC11368c, f, interfaceC10962n0);
    }

    /* renamed from: d */
    private static <T> C12020a<T> m9447d(C6062k c6062k, AbstractC11368c abstractC11368c, float f, InterfaceC10962n0<T> interfaceC10962n0) {
        Interpolator interpolator;
        Interpolator interpolator2;
        T t;
        abstractC11368c.mo8220i();
        PointF pointF = null;
        T t2 = null;
        T t3 = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        float f2 = 0.0f;
        boolean z = false;
        PointF pointF4 = null;
        while (abstractC11368c.mo8216q()) {
            switch (abstractC11368c.mo8226R(f28756c)) {
                case 0:
                    f2 = (float) abstractC11368c.mo8214t();
                    break;
                case 1:
                    t3 = interfaceC10962n0.mo9459a(abstractC11368c, f);
                    break;
                case 2:
                    t2 = interfaceC10962n0.mo9459a(abstractC11368c, f);
                    break;
                case 3:
                    pointF = C10967s.m9453e(abstractC11368c, 1.0f);
                    break;
                case 4:
                    pointF4 = C10967s.m9453e(abstractC11368c, 1.0f);
                    break;
                case 5:
                    if (abstractC11368c.mo8212v() == 1) {
                        z = true;
                        break;
                    } else {
                        z = false;
                        break;
                    }
                case 6:
                    pointF2 = C10967s.m9453e(abstractC11368c, f);
                    break;
                case 7:
                    pointF3 = C10967s.m9453e(abstractC11368c, f);
                    break;
                default:
                    abstractC11368c.mo8224U();
                    break;
            }
        }
        abstractC11368c.mo8217m();
        if (z) {
            interpolator2 = f28754a;
            t = t3;
        } else {
            if (pointF != null && pointF4 != null) {
                interpolator = m9449b(pointF, pointF4);
            } else {
                interpolator = f28754a;
            }
            interpolator2 = interpolator;
            t = t2;
        }
        C12020a<T> c12020a = new C12020a<>(c6062k, t3, t, interpolator2, f2, null);
        c12020a.f31029o = pointF2;
        c12020a.f31030p = pointF3;
        return c12020a;
    }

    /* renamed from: e */
    private static <T> C12020a<T> m9446e(C6062k c6062k, AbstractC11368c abstractC11368c, float f, InterfaceC10962n0<T> interfaceC10962n0) {
        Interpolator interpolator;
        Interpolator m9449b;
        Interpolator m9449b2;
        T t;
        PointF pointF;
        C12020a<T> c12020a;
        PointF pointF2;
        float f2;
        PointF pointF3;
        abstractC11368c.mo8220i();
        PointF pointF4 = null;
        boolean z = false;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointF7 = null;
        T t2 = null;
        PointF pointF8 = null;
        PointF pointF9 = null;
        PointF pointF10 = null;
        float f3 = 0.0f;
        PointF pointF11 = null;
        T t3 = null;
        while (abstractC11368c.mo8216q()) {
            switch (abstractC11368c.mo8226R(f28756c)) {
                case 0:
                    pointF2 = pointF4;
                    f3 = (float) abstractC11368c.mo8214t();
                    break;
                case 1:
                    pointF2 = pointF4;
                    t2 = interfaceC10962n0.mo9459a(abstractC11368c, f);
                    break;
                case 2:
                    pointF2 = pointF4;
                    t3 = interfaceC10962n0.mo9459a(abstractC11368c, f);
                    break;
                case 3:
                    pointF2 = pointF4;
                    f2 = f3;
                    PointF pointF12 = pointF11;
                    if (abstractC11368c.mo8228I() == AbstractC11368c.EnumC11370b.BEGIN_OBJECT) {
                        abstractC11368c.mo8220i();
                        float f4 = 0.0f;
                        float f5 = 0.0f;
                        float f6 = 0.0f;
                        float f7 = 0.0f;
                        while (abstractC11368c.mo8216q()) {
                            int mo8226R = abstractC11368c.mo8226R(f28757d);
                            if (mo8226R == 0) {
                                AbstractC11368c.EnumC11370b mo8228I = abstractC11368c.mo8228I();
                                AbstractC11368c.EnumC11370b enumC11370b = AbstractC11368c.EnumC11370b.NUMBER;
                                if (mo8228I == enumC11370b) {
                                    f6 = (float) abstractC11368c.mo8214t();
                                    f4 = f6;
                                } else {
                                    abstractC11368c.mo8221h();
                                    f4 = (float) abstractC11368c.mo8214t();
                                    f6 = abstractC11368c.mo8228I() == enumC11370b ? (float) abstractC11368c.mo8214t() : f4;
                                    abstractC11368c.mo8219j();
                                }
                            } else if (mo8226R != 1) {
                                abstractC11368c.mo8224U();
                            } else {
                                AbstractC11368c.EnumC11370b mo8228I2 = abstractC11368c.mo8228I();
                                AbstractC11368c.EnumC11370b enumC11370b2 = AbstractC11368c.EnumC11370b.NUMBER;
                                if (mo8228I2 == enumC11370b2) {
                                    f7 = (float) abstractC11368c.mo8214t();
                                    f5 = f7;
                                } else {
                                    abstractC11368c.mo8221h();
                                    f5 = (float) abstractC11368c.mo8214t();
                                    f7 = abstractC11368c.mo8228I() == enumC11370b2 ? (float) abstractC11368c.mo8214t() : f5;
                                    abstractC11368c.mo8219j();
                                }
                            }
                        }
                        PointF pointF13 = new PointF(f4, f5);
                        PointF pointF14 = new PointF(f6, f7);
                        abstractC11368c.mo8217m();
                        pointF8 = pointF14;
                        pointF7 = pointF13;
                        pointF11 = pointF12;
                        f3 = f2;
                        break;
                    } else {
                        pointF5 = C10967s.m9453e(abstractC11368c, f);
                        f3 = f2;
                        pointF11 = pointF12;
                        break;
                    }
                case 4:
                    if (abstractC11368c.mo8228I() == AbstractC11368c.EnumC11370b.BEGIN_OBJECT) {
                        abstractC11368c.mo8220i();
                        float f8 = 0.0f;
                        float f9 = 0.0f;
                        float f10 = 0.0f;
                        float f11 = 0.0f;
                        while (abstractC11368c.mo8216q()) {
                            PointF pointF15 = pointF11;
                            int mo8226R2 = abstractC11368c.mo8226R(f28757d);
                            if (mo8226R2 != 0) {
                                pointF3 = pointF4;
                                if (mo8226R2 != 1) {
                                    abstractC11368c.mo8224U();
                                } else {
                                    AbstractC11368c.EnumC11370b mo8228I3 = abstractC11368c.mo8228I();
                                    AbstractC11368c.EnumC11370b enumC11370b3 = AbstractC11368c.EnumC11370b.NUMBER;
                                    if (mo8228I3 == enumC11370b3) {
                                        f11 = (float) abstractC11368c.mo8214t();
                                        f3 = f3;
                                        f9 = f11;
                                    } else {
                                        float f12 = f3;
                                        abstractC11368c.mo8221h();
                                        float mo8214t = (float) abstractC11368c.mo8214t();
                                        float mo8214t2 = abstractC11368c.mo8228I() == enumC11370b3 ? (float) abstractC11368c.mo8214t() : mo8214t;
                                        abstractC11368c.mo8219j();
                                        f3 = f12;
                                        pointF11 = pointF15;
                                        pointF4 = pointF3;
                                        f11 = mo8214t2;
                                        f9 = mo8214t;
                                    }
                                }
                            } else {
                                pointF3 = pointF4;
                                float f13 = f3;
                                AbstractC11368c.EnumC11370b mo8228I4 = abstractC11368c.mo8228I();
                                AbstractC11368c.EnumC11370b enumC11370b4 = AbstractC11368c.EnumC11370b.NUMBER;
                                if (mo8228I4 == enumC11370b4) {
                                    f10 = (float) abstractC11368c.mo8214t();
                                    f3 = f13;
                                    f8 = f10;
                                } else {
                                    abstractC11368c.mo8221h();
                                    f8 = (float) abstractC11368c.mo8214t();
                                    f10 = abstractC11368c.mo8228I() == enumC11370b4 ? (float) abstractC11368c.mo8214t() : f8;
                                    abstractC11368c.mo8219j();
                                    f3 = f13;
                                }
                            }
                            pointF11 = pointF15;
                            pointF4 = pointF3;
                        }
                        pointF2 = pointF4;
                        f2 = f3;
                        PointF pointF16 = new PointF(f8, f9);
                        PointF pointF17 = new PointF(f10, f11);
                        abstractC11368c.mo8217m();
                        pointF10 = pointF17;
                        pointF9 = pointF16;
                        f3 = f2;
                        break;
                    } else {
                        pointF2 = pointF4;
                        pointF6 = C10967s.m9453e(abstractC11368c, f);
                        break;
                    }
                case 5:
                    if (abstractC11368c.mo8212v() == 1) {
                        z = true;
                    } else {
                        z = false;
                        continue;
                    }
                case 6:
                    pointF11 = C10967s.m9453e(abstractC11368c, f);
                    continue;
                case 7:
                    pointF4 = C10967s.m9453e(abstractC11368c, f);
                    continue;
                default:
                    pointF2 = pointF4;
                    abstractC11368c.mo8224U();
                    break;
            }
            pointF4 = pointF2;
        }
        PointF pointF18 = pointF4;
        float f14 = f3;
        PointF pointF19 = pointF11;
        abstractC11368c.mo8217m();
        if (z) {
            interpolator = f28754a;
            t = t2;
        } else {
            if (pointF5 != null && pointF6 != null) {
                interpolator = m9449b(pointF5, pointF6);
            } else if (pointF7 != null && pointF8 != null && pointF9 != null && pointF10 != null) {
                m9449b = m9449b(pointF7, pointF9);
                m9449b2 = m9449b(pointF8, pointF10);
                t = t3;
                interpolator = null;
                if (m9449b == null && m9449b2 != null) {
                    pointF = pointF19;
                    c12020a = new C12020a<>(c6062k, t2, t, m9449b, m9449b2, f14, null);
                } else {
                    pointF = pointF19;
                    c12020a = new C12020a<>(c6062k, t2, t, interpolator, f14, null);
                }
                c12020a.f31029o = pointF;
                c12020a.f31030p = pointF18;
                return c12020a;
            } else {
                interpolator = f28754a;
            }
            t = t3;
        }
        m9449b = null;
        m9449b2 = null;
        if (m9449b == null) {
        }
        pointF = pointF19;
        c12020a = new C12020a<>(c6062k, t2, t, interpolator, f14, null);
        c12020a.f31029o = pointF;
        c12020a.f31030p = pointF18;
        return c12020a;
    }

    /* renamed from: f */
    private static <T> C12020a<T> m9445f(AbstractC11368c abstractC11368c, float f, InterfaceC10962n0<T> interfaceC10962n0) {
        return new C12020a<>(interfaceC10962n0.mo9459a(abstractC11368c, f));
    }

    /* renamed from: g */
    private static SparseArrayCompat<WeakReference<Interpolator>> m9444g() {
        if (f28755b == null) {
            f28755b = new SparseArrayCompat<>();
        }
        return f28755b;
    }

    /* renamed from: h */
    private static void m9443h(int i, WeakReference<Interpolator> weakReference) {
        synchronized (C10969t.class) {
            f28755b.m39512l(i, weakReference);
        }
    }
}