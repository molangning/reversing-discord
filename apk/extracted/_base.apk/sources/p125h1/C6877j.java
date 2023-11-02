package p125h1;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;
import p311r1.C12020a;
import p311r1.C12022c;

/* renamed from: h1.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6877j extends AbstractC6874g<PointF> {

    /* renamed from: i */
    private final PointF f19142i;

    /* renamed from: j */
    private final float[] f19143j;

    /* renamed from: k */
    private final PathMeasure f19144k;

    /* renamed from: l */
    private C6876i f19145l;

    public C6877j(List<? extends C12020a<PointF>> list) {
        super(list);
        this.f19142i = new PointF();
        this.f19143j = new float[2];
        this.f19144k = new PathMeasure();
    }

    @Override // p125h1.AbstractC6861a
    /* renamed from: p */
    public PointF mo21711i(C12020a<PointF> c12020a, float f) {
        PointF pointF;
        C6876i c6876i = (C6876i) c12020a;
        Path m21738k = c6876i.m21738k();
        if (m21738k == null) {
            return c12020a.f31016b;
        }
        C12022c<A> c12022c = this.f19117e;
        if (c12022c != 0 && (pointF = (PointF) c12022c.m6567b(c6876i.f31021g, c6876i.f31022h.floatValue(), (PointF) c6876i.f31016b, (PointF) c6876i.f31017c, m21771e(), f, m21770f())) != null) {
            return pointF;
        }
        if (this.f19145l != c6876i) {
            this.f19144k.setPath(m21738k, false);
            this.f19145l = c6876i;
        }
        PathMeasure pathMeasure = this.f19144k;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.f19143j, null);
        PointF pointF2 = this.f19142i;
        float[] fArr = this.f19143j;
        pointF2.set(fArr[0], fArr[1]);
        return this.f19142i;
    }
}
