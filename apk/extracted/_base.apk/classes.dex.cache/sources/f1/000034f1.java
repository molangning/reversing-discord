package p125h1;

import android.graphics.PointF;
import java.util.Collections;
import p311r1.C12020a;
import p311r1.C12022c;

/* renamed from: h1.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6881n extends AbstractC6861a<PointF, PointF> {

    /* renamed from: i */
    private final PointF f19151i;

    /* renamed from: j */
    private final PointF f19152j;

    /* renamed from: k */
    private final AbstractC6861a<Float, Float> f19153k;

    /* renamed from: l */
    private final AbstractC6861a<Float, Float> f19154l;

    /* renamed from: m */
    protected C12022c<Float> f19155m;

    /* renamed from: n */
    protected C12022c<Float> f19156n;

    public C6881n(AbstractC6861a<Float, Float> abstractC6861a, AbstractC6861a<Float, Float> abstractC6861a2) {
        super(Collections.emptyList());
        this.f19151i = new PointF();
        this.f19152j = new PointF();
        this.f19153k = abstractC6861a;
        this.f19154l = abstractC6861a2;
        mo21709m(m21770f());
    }

    @Override // p125h1.AbstractC6861a
    /* renamed from: m */
    public void mo21709m(float f) {
        this.f19153k.mo21709m(f);
        this.f19154l.mo21709m(f);
        this.f19151i.set(this.f19153k.mo21712h().floatValue(), this.f19154l.mo21712h().floatValue());
        for (int i = 0; i < this.f19113a.size(); i++) {
            this.f19113a.get(i).mo12107a();
        }
    }

    @Override // p125h1.AbstractC6861a
    /* renamed from: p */
    public PointF mo21712h() {
        return mo21711i(null, 0.0f);
    }

    @Override // p125h1.AbstractC6861a
    /* renamed from: q */
    public PointF mo21711i(C12020a<PointF> c12020a, float f) {
        Float f2;
        C12020a<Float> m21773b;
        float floatValue;
        C12020a<Float> m21773b2;
        float floatValue2;
        Float f3 = null;
        if (this.f19155m != null && (m21773b2 = this.f19153k.m21773b()) != null) {
            float m21772d = this.f19153k.m21772d();
            Float f4 = m21773b2.f31022h;
            C12022c<Float> c12022c = this.f19155m;
            float f5 = m21773b2.f31021g;
            if (f4 == null) {
                floatValue2 = f5;
            } else {
                floatValue2 = f4.floatValue();
            }
            f2 = c12022c.m6567b(f5, floatValue2, m21773b2.f31016b, m21773b2.f31017c, f, f, m21772d);
        } else {
            f2 = null;
        }
        if (this.f19156n != null && (m21773b = this.f19154l.m21773b()) != null) {
            float m21772d2 = this.f19154l.m21772d();
            Float f6 = m21773b.f31022h;
            C12022c<Float> c12022c2 = this.f19156n;
            float f7 = m21773b.f31021g;
            if (f6 == null) {
                floatValue = f7;
            } else {
                floatValue = f6.floatValue();
            }
            f3 = c12022c2.m6567b(f7, floatValue, m21773b.f31016b, m21773b.f31017c, f, f, m21772d2);
        }
        if (f2 == null) {
            this.f19152j.set(this.f19151i.x, 0.0f);
        } else {
            this.f19152j.set(f2.floatValue(), 0.0f);
        }
        if (f3 == null) {
            PointF pointF = this.f19152j;
            pointF.set(pointF.x, this.f19151i.y);
        } else {
            PointF pointF2 = this.f19152j;
            pointF2.set(pointF2.x, f3.floatValue());
        }
        return this.f19152j;
    }

    /* renamed from: r */
    public void m21728r(C12022c<Float> c12022c) {
        C12022c<Float> c12022c2 = this.f19155m;
        if (c12022c2 != null) {
            c12022c2.m6566c(null);
        }
        this.f19155m = c12022c;
        if (c12022c != null) {
            c12022c.m6566c(this);
        }
    }

    /* renamed from: s */
    public void m21727s(C12022c<Float> c12022c) {
        C12022c<Float> c12022c2 = this.f19156n;
        if (c12022c2 != null) {
            c12022c2.m6566c(null);
        }
        this.f19156n = c12022c;
        if (c12022c != null) {
            c12022c.m6566c(this);
        }
    }
}