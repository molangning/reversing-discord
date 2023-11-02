package p125h1;

import android.graphics.Path;
import android.graphics.PointF;
import p073e1.C6062k;
import p291q1.C11680l;
import p311r1.C12020a;

/* renamed from: h1.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6876i extends C12020a<PointF> {

    /* renamed from: q */
    private Path f19140q;

    /* renamed from: r */
    private final C12020a<PointF> f19141r;

    public C6876i(C6062k c6062k, C12020a<PointF> c12020a) {
        super(c6062k, c12020a.f31016b, c12020a.f31017c, c12020a.f31018d, c12020a.f31019e, c12020a.f31020f, c12020a.f31021g, c12020a.f31022h);
        this.f19141r = c12020a;
        m21739j();
    }

    /* renamed from: j */
    public void m21739j() {
        boolean z;
        T t;
        T t2;
        T t3 = this.f31017c;
        if (t3 != 0 && (t2 = this.f31016b) != 0 && ((PointF) t2).equals(((PointF) t3).x, ((PointF) t3).y)) {
            z = true;
        } else {
            z = false;
        }
        T t4 = this.f31016b;
        if (t4 != 0 && (t = this.f31017c) != 0 && !z) {
            C12020a<PointF> c12020a = this.f19141r;
            this.f19140q = C11680l.m7189d((PointF) t4, (PointF) t, c12020a.f31029o, c12020a.f31030p);
        }
    }

    /* renamed from: k */
    public Path m21738k() {
        return this.f19140q;
    }
}