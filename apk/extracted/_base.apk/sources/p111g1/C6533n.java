package p111g1;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import p073e1.C6059j0;
import p073e1.InterfaceC6071o0;
import p125h1.AbstractC6861a;
import p167j1.C8784e;
import p206l1.C10016j;
import p206l1.C10029s;
import p223m1.AbstractC10231b;
import p291q1.C11679k;
import p311r1.C12022c;

/* renamed from: g1.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6533n implements InterfaceC6532m, AbstractC6861a.InterfaceC6863b, InterfaceC6529k {

    /* renamed from: b */
    private final String f18514b;

    /* renamed from: c */
    private final C6059j0 f18515c;

    /* renamed from: d */
    private final C10016j.EnumC10017a f18516d;

    /* renamed from: e */
    private final boolean f18517e;

    /* renamed from: f */
    private final boolean f18518f;

    /* renamed from: g */
    private final AbstractC6861a<?, Float> f18519g;

    /* renamed from: h */
    private final AbstractC6861a<?, PointF> f18520h;

    /* renamed from: i */
    private final AbstractC6861a<?, Float> f18521i;

    /* renamed from: j */
    private final AbstractC6861a<?, Float> f18522j;

    /* renamed from: k */
    private final AbstractC6861a<?, Float> f18523k;

    /* renamed from: l */
    private final AbstractC6861a<?, Float> f18524l;

    /* renamed from: m */
    private final AbstractC6861a<?, Float> f18525m;

    /* renamed from: o */
    private boolean f18527o;

    /* renamed from: a */
    private final Path f18513a = new Path();

    /* renamed from: n */
    private final C6520b f18526n = new C6520b();

    /* renamed from: g1.n$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static /* synthetic */ class C6534a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18528a;

        static {
            int[] iArr = new int[C10016j.EnumC10017a.values().length];
            f18528a = iArr;
            try {
                iArr[C10016j.EnumC10017a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18528a[C10016j.EnumC10017a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C6533n(C6059j0 c6059j0, AbstractC10231b abstractC10231b, C10016j c10016j) {
        this.f18515c = c6059j0;
        this.f18514b = c10016j.m12577d();
        C10016j.EnumC10017a m12571j = c10016j.m12571j();
        this.f18516d = m12571j;
        this.f18517e = c10016j.m12570k();
        this.f18518f = c10016j.m12569l();
        AbstractC6861a<Float, Float> mo16817a = c10016j.m12574g().mo16817a();
        this.f18519g = mo16817a;
        AbstractC6861a<PointF, PointF> mo16817a2 = c10016j.m12573h().mo16817a();
        this.f18520h = mo16817a2;
        AbstractC6861a<Float, Float> mo16817a3 = c10016j.m12572i().mo16817a();
        this.f18521i = mo16817a3;
        AbstractC6861a<Float, Float> mo16817a4 = c10016j.m12576e().mo16817a();
        this.f18523k = mo16817a4;
        AbstractC6861a<Float, Float> mo16817a5 = c10016j.m12575f().mo16817a();
        this.f18525m = mo16817a5;
        C10016j.EnumC10017a enumC10017a = C10016j.EnumC10017a.STAR;
        if (m12571j == enumC10017a) {
            this.f18522j = c10016j.m12579b().mo16817a();
            this.f18524l = c10016j.m12578c().mo16817a();
        } else {
            this.f18522j = null;
            this.f18524l = null;
        }
        abstractC10231b.m12102j(mo16817a);
        abstractC10231b.m12102j(mo16817a2);
        abstractC10231b.m12102j(mo16817a3);
        abstractC10231b.m12102j(mo16817a4);
        abstractC10231b.m12102j(mo16817a5);
        if (m12571j == enumC10017a) {
            abstractC10231b.m12102j(this.f18522j);
            abstractC10231b.m12102j(this.f18524l);
        }
        mo16817a.m21774a(this);
        mo16817a2.m21774a(this);
        mo16817a3.m21774a(this);
        mo16817a4.m21774a(this);
        mo16817a5.m21774a(this);
        if (m12571j == enumC10017a) {
            this.f18522j.m21774a(this);
            this.f18524l.m21774a(this);
        }
    }

    /* renamed from: f */
    private void m22438f() {
        double floatValue;
        int i;
        double d;
        double d2;
        double d3;
        int floor = (int) Math.floor(this.f18519g.mo21712h().floatValue());
        AbstractC6861a<?, Float> abstractC6861a = this.f18521i;
        if (abstractC6861a == null) {
            floatValue = 0.0d;
        } else {
            floatValue = abstractC6861a.mo21712h().floatValue();
        }
        double radians = Math.toRadians(floatValue - 90.0d);
        double d4 = floor;
        float floatValue2 = this.f18525m.mo21712h().floatValue() / 100.0f;
        float floatValue3 = this.f18523k.mo21712h().floatValue();
        double d5 = floatValue3;
        float cos = (float) (Math.cos(radians) * d5);
        float sin = (float) (Math.sin(radians) * d5);
        this.f18513a.moveTo(cos, sin);
        double d6 = (float) (6.283185307179586d / d4);
        double d7 = radians + d6;
        double ceil = Math.ceil(d4);
        int i2 = 0;
        while (i2 < ceil) {
            float cos2 = (float) (Math.cos(d7) * d5);
            double d8 = ceil;
            float sin2 = (float) (d5 * Math.sin(d7));
            if (floatValue2 != 0.0f) {
                d2 = d5;
                i = i2;
                d = d7;
                double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                float cos3 = (float) Math.cos(atan2);
                d3 = d6;
                double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                float f = floatValue3 * floatValue2 * 0.25f;
                this.f18513a.cubicTo(cos - (cos3 * f), sin - (((float) Math.sin(atan2)) * f), cos2 + (((float) Math.cos(atan22)) * f), sin2 + (f * ((float) Math.sin(atan22))), cos2, sin2);
            } else {
                i = i2;
                d = d7;
                d2 = d5;
                d3 = d6;
                this.f18513a.lineTo(cos2, sin2);
            }
            d7 = d + d3;
            i2 = i + 1;
            sin = sin2;
            cos = cos2;
            ceil = d8;
            d5 = d2;
            d6 = d3;
        }
        PointF mo21712h = this.f18520h.mo21712h();
        this.f18513a.offset(mo21712h.x, mo21712h.y);
        this.f18513a.close();
    }

    /* renamed from: j */
    private void m22437j() {
        double floatValue;
        float f;
        float f2;
        int i;
        float f3;
        float f4;
        double d;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        double d2;
        float f10;
        float f11;
        float f12;
        double d3;
        float f13;
        float f14;
        float f15;
        float f16;
        float floatValue2 = this.f18519g.mo21712h().floatValue();
        AbstractC6861a<?, Float> abstractC6861a = this.f18521i;
        if (abstractC6861a == null) {
            floatValue = 0.0d;
        } else {
            floatValue = abstractC6861a.mo21712h().floatValue();
        }
        double radians = Math.toRadians(floatValue - 90.0d);
        double d4 = floatValue2;
        float f17 = (float) (6.283185307179586d / d4);
        if (this.f18518f) {
            f17 *= -1.0f;
        }
        float f18 = f17 / 2.0f;
        float f19 = floatValue2 - ((int) floatValue2);
        int i2 = (f19 > 0.0f ? 1 : (f19 == 0.0f ? 0 : -1));
        if (i2 != 0) {
            radians += (1.0f - f19) * f18;
        }
        float floatValue3 = this.f18523k.mo21712h().floatValue();
        float floatValue4 = this.f18522j.mo21712h().floatValue();
        AbstractC6861a<?, Float> abstractC6861a2 = this.f18524l;
        if (abstractC6861a2 != null) {
            f = abstractC6861a2.mo21712h().floatValue() / 100.0f;
        } else {
            f = 0.0f;
        }
        AbstractC6861a<?, Float> abstractC6861a3 = this.f18525m;
        if (abstractC6861a3 != null) {
            f2 = abstractC6861a3.mo21712h().floatValue() / 100.0f;
        } else {
            f2 = 0.0f;
        }
        if (i2 != 0) {
            f6 = ((floatValue3 - floatValue4) * f19) + floatValue4;
            i = i2;
            double d5 = f6;
            float cos = (float) (d5 * Math.cos(radians));
            f5 = (float) (d5 * Math.sin(radians));
            this.f18513a.moveTo(cos, f5);
            d = radians + ((f17 * f19) / 2.0f);
            f3 = cos;
            f4 = f18;
        } else {
            i = i2;
            double d6 = floatValue3;
            float cos2 = (float) (Math.cos(radians) * d6);
            float sin = (float) (d6 * Math.sin(radians));
            this.f18513a.moveTo(cos2, sin);
            f3 = cos2;
            f4 = f18;
            d = radians + f4;
            f5 = sin;
            f6 = 0.0f;
        }
        double ceil = Math.ceil(d4) * 2.0d;
        int i3 = 0;
        float f20 = f4;
        float f21 = f3;
        boolean z = false;
        while (true) {
            double d7 = i3;
            if (d7 < ceil) {
                if (z) {
                    f7 = floatValue3;
                } else {
                    f7 = floatValue4;
                }
                int i4 = (f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1));
                if (i4 != 0 && d7 == ceil - 2.0d) {
                    f8 = f17;
                    f9 = (f17 * f19) / 2.0f;
                } else {
                    f8 = f17;
                    f9 = f20;
                }
                if (i4 != 0 && d7 == ceil - 1.0d) {
                    d2 = d7;
                    f10 = f6;
                } else {
                    d2 = d7;
                    f10 = f6;
                    f6 = f7;
                }
                double d8 = f6;
                double d9 = ceil;
                float cos3 = (float) (d8 * Math.cos(d));
                float sin2 = (float) (d8 * Math.sin(d));
                if (f == 0.0f && f2 == 0.0f) {
                    this.f18513a.lineTo(cos3, sin2);
                    d3 = d;
                    f11 = f;
                    f12 = f2;
                } else {
                    f11 = f;
                    double atan2 = (float) (Math.atan2(f5, f21) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    f12 = f2;
                    d3 = d;
                    double atan22 = (float) (Math.atan2(sin2, cos3) - 1.5707963267948966d);
                    float cos5 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    if (z) {
                        f13 = f11;
                    } else {
                        f13 = f12;
                    }
                    if (z) {
                        f14 = f12;
                    } else {
                        f14 = f11;
                    }
                    if (z) {
                        f15 = floatValue4;
                    } else {
                        f15 = floatValue3;
                    }
                    if (z) {
                        f16 = floatValue3;
                    } else {
                        f16 = floatValue4;
                    }
                    float f22 = f15 * f13 * 0.47829f;
                    float f23 = cos4 * f22;
                    float f24 = f22 * sin3;
                    float f25 = f16 * f14 * 0.47829f;
                    float f26 = cos5 * f25;
                    float f27 = f25 * sin4;
                    if (i != 0) {
                        if (i3 == 0) {
                            f23 *= f19;
                            f24 *= f19;
                        } else if (d2 == d9 - 1.0d) {
                            f26 *= f19;
                            f27 *= f19;
                        }
                    }
                    this.f18513a.cubicTo(f21 - f23, f5 - f24, cos3 + f26, sin2 + f27, cos3, sin2);
                }
                d = d3 + f9;
                z = !z;
                i3++;
                f21 = cos3;
                f5 = sin2;
                f2 = f12;
                f = f11;
                f6 = f10;
                f17 = f8;
                ceil = d9;
            } else {
                PointF mo21712h = this.f18520h.mo21712h();
                this.f18513a.offset(mo21712h.x, mo21712h.y);
                this.f18513a.close();
                return;
            }
        }
    }

    /* renamed from: k */
    private void m22436k() {
        this.f18527o = false;
        this.f18515c.invalidateSelf();
    }

    @Override // p125h1.AbstractC6861a.InterfaceC6863b
    /* renamed from: a */
    public void mo12107a() {
        m22436k();
    }

    @Override // p111g1.InterfaceC6521c
    /* renamed from: b */
    public void mo12106b(List<InterfaceC6521c> list, List<InterfaceC6521c> list2) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC6521c interfaceC6521c = list.get(i);
            if (interfaceC6521c instanceof C6541u) {
                C6541u c6541u = (C6541u) interfaceC6521c;
                if (c6541u.m22422k() == C10029s.EnumC10030a.SIMULTANEOUSLY) {
                    this.f18526n.m22457a(c6541u);
                    c6541u.m22426d(this);
                }
            }
        }
    }

    @Override // p111g1.InterfaceC6532m
    /* renamed from: c */
    public Path mo22429c() {
        if (this.f18527o) {
            return this.f18513a;
        }
        this.f18513a.reset();
        if (this.f18517e) {
            this.f18527o = true;
            return this.f18513a;
        }
        int i = C6534a.f18528a[this.f18516d.ordinal()];
        if (i != 1) {
            if (i == 2) {
                m22438f();
            }
        } else {
            m22437j();
        }
        this.f18513a.close();
        this.f18526n.m22456b(this.f18513a);
        this.f18527o = true;
        return this.f18513a;
    }

    @Override // p167j1.InterfaceC8785f
    /* renamed from: d */
    public void mo12105d(C8784e c8784e, int i, List<C8784e> list, C8784e c8784e2) {
        C11679k.m7193k(c8784e, i, list, c8784e2, this);
    }

    @Override // p111g1.InterfaceC6521c
    public String getName() {
        return this.f18514b;
    }

    @Override // p167j1.InterfaceC8785f
    /* renamed from: i */
    public <T> void mo12035i(T t, C12022c<T> c12022c) {
        AbstractC6861a<?, Float> abstractC6861a;
        AbstractC6861a<?, Float> abstractC6861a2;
        if (t == InterfaceC6071o0.f17283w) {
            this.f18519g.m21767n(c12022c);
        } else if (t == InterfaceC6071o0.f17284x) {
            this.f18521i.m21767n(c12022c);
        } else if (t == InterfaceC6071o0.f17274n) {
            this.f18520h.m21767n(c12022c);
        } else if (t == InterfaceC6071o0.f17285y && (abstractC6861a2 = this.f18522j) != null) {
            abstractC6861a2.m21767n(c12022c);
        } else if (t == InterfaceC6071o0.f17286z) {
            this.f18523k.m21767n(c12022c);
        } else if (t == InterfaceC6071o0.f17246A && (abstractC6861a = this.f18524l) != null) {
            abstractC6861a.m21767n(c12022c);
        } else if (t == InterfaceC6071o0.f17247B) {
            this.f18525m.m21767n(c12022c);
        }
    }
}
