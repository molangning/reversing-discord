package p125h1;

import java.util.List;
import p291q1.C11679k;
import p311r1.C12020a;
import p311r1.C12022c;

/* renamed from: h1.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6873f extends AbstractC6874g<Integer> {
    public C6873f(List<C12020a<Integer>> list) {
        super(list);
    }

    /* renamed from: p */
    public int m21745p() {
        return m21744q(m21773b(), m21772d());
    }

    /* renamed from: q */
    int m21744q(C12020a<Integer> c12020a, float f) {
        Integer num;
        if (c12020a.f31016b != null && c12020a.f31017c != null) {
            C12022c<A> c12022c = this.f19117e;
            if (c12022c != 0 && (num = (Integer) c12022c.m6567b(c12020a.f31021g, c12020a.f31022h.floatValue(), c12020a.f31016b, c12020a.f31017c, f, m21771e(), m21770f())) != null) {
                return num.intValue();
            }
            return C11679k.m7194j(c12020a.m6578h(), c12020a.m6581e(), f);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    @Override // p125h1.AbstractC6861a
    /* renamed from: r */
    public Integer mo21711i(C12020a<Integer> c12020a, float f) {
        return Integer.valueOf(m21744q(c12020a, f));
    }
}