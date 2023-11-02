package p125h1;

import java.util.List;
import p291q1.C11679k;
import p311r1.C12020a;
import p311r1.C12022c;
import p311r1.C12023d;

/* renamed from: h1.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6879l extends AbstractC6874g<C12023d> {

    /* renamed from: i */
    private final C12023d f19147i;

    public C6879l(List<C12020a<C12023d>> list) {
        super(list);
        this.f19147i = new C12023d();
    }

    @Override // p125h1.AbstractC6861a
    /* renamed from: p */
    public C12023d mo21711i(C12020a<C12023d> c12020a, float f) {
        C12023d c12023d;
        C12023d c12023d2;
        C12023d c12023d3 = c12020a.f31016b;
        if (c12023d3 != null && (c12023d = c12020a.f31017c) != null) {
            C12023d c12023d4 = c12023d3;
            C12023d c12023d5 = c12023d;
            C12022c<A> c12022c = this.f19117e;
            if (c12022c != 0 && (c12023d2 = (C12023d) c12022c.m6567b(c12020a.f31021g, c12020a.f31022h.floatValue(), c12023d4, c12023d5, f, m21771e(), m21770f())) != null) {
                return c12023d2;
            }
            this.f19147i.m6562d(C11679k.m7195i(c12023d4.m6564b(), c12023d5.m6564b(), f), C11679k.m7195i(c12023d4.m6563c(), c12023d5.m6563c(), f));
            return this.f19147i;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}