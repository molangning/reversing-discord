package p125h1;

import android.graphics.PointF;
import java.util.List;
import p311r1.C12020a;
import p311r1.C12022c;

/* renamed from: h1.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6878k extends AbstractC6874g<PointF> {

    /* renamed from: i */
    private final PointF f19146i;

    public C6878k(List<C12020a<PointF>> list) {
        super(list);
        this.f19146i = new PointF();
    }

    @Override // p125h1.AbstractC6861a
    /* renamed from: p */
    public PointF mo21711i(C12020a<PointF> c12020a, float f) {
        return mo21736j(c12020a, f, f, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p125h1.AbstractC6861a
    /* renamed from: q */
    public PointF mo21736j(C12020a<PointF> c12020a, float f, float f2, float f3) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = c12020a.f31016b;
        if (pointF3 != null && (pointF = c12020a.f31017c) != null) {
            PointF pointF4 = pointF3;
            PointF pointF5 = pointF;
            C12022c<A> c12022c = this.f19117e;
            if (c12022c != 0 && (pointF2 = (PointF) c12022c.m6567b(c12020a.f31021g, c12020a.f31022h.floatValue(), pointF4, pointF5, f, m21771e(), m21770f())) != null) {
                return pointF2;
            }
            PointF pointF6 = this.f19146i;
            float f4 = pointF4.x;
            float f5 = f4 + (f2 * (pointF5.x - f4));
            float f6 = pointF4.y;
            pointF6.set(f5, f6 + (f3 * (pointF5.y - f6)));
            return this.f19146i;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
