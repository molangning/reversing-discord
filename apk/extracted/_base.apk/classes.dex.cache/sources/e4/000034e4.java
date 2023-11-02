package p125h1;

import java.util.List;
import p291q1.C11672d;
import p291q1.C11679k;
import p311r1.C12020a;
import p311r1.C12022c;

/* renamed from: h1.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6868b extends AbstractC6874g<Integer> {
    public C6868b(List<C12020a<Integer>> list) {
        super(list);
    }

    /* renamed from: p */
    public int m21759p() {
        return m21758q(m21773b(), m21772d());
    }

    /* renamed from: q */
    public int m21758q(C12020a<Integer> c12020a, float f) {
        Integer num;
        if (c12020a.f31016b != null && c12020a.f31017c != null) {
            C12022c<A> c12022c = this.f19117e;
            if (c12022c != 0 && (num = (Integer) c12022c.m6567b(c12020a.f31021g, c12020a.f31022h.floatValue(), c12020a.f31016b, c12020a.f31017c, f, m21771e(), m21770f())) != null) {
                return num.intValue();
            }
            return C11672d.m7241c(C11679k.m7202b(f, 0.0f, 1.0f), c12020a.f31016b.intValue(), c12020a.f31017c.intValue());
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    @Override // p125h1.AbstractC6861a
    /* renamed from: r */
    public Integer mo21711i(C12020a<Integer> c12020a, float f) {
        return Integer.valueOf(m21758q(c12020a, f));
    }
}