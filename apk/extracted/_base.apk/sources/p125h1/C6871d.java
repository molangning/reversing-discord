package p125h1;

import java.util.List;
import p291q1.C11679k;
import p311r1.C12020a;
import p311r1.C12022c;

/* renamed from: h1.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6871d extends AbstractC6874g<Float> {
    public C6871d(List<C12020a<Float>> list) {
        super(list);
    }

    /* renamed from: p */
    public float m21749p() {
        return m21748q(m21773b(), m21772d());
    }

    /* renamed from: q */
    float m21748q(C12020a<Float> c12020a, float f) {
        Float f2;
        if (c12020a.f31016b != null && c12020a.f31017c != null) {
            C12022c<A> c12022c = this.f19117e;
            if (c12022c != 0 && (f2 = (Float) c12022c.m6567b(c12020a.f31021g, c12020a.f31022h.floatValue(), c12020a.f31016b, c12020a.f31017c, f, m21771e(), m21770f())) != null) {
                return f2.floatValue();
            }
            return C11679k.m7195i(c12020a.m6579g(), c12020a.m6582d(), f);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p125h1.AbstractC6861a
    /* renamed from: r */
    public Float mo21711i(C12020a<Float> c12020a, float f) {
        return Float.valueOf(m21748q(c12020a, f));
    }
}
