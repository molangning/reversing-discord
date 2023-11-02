package p206l1;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import p167j1.C8779a;
import p291q1.C11674f;
import p291q1.C11679k;

/* renamed from: l1.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10021n {

    /* renamed from: a */
    private final List<C8779a> f26031a;

    /* renamed from: b */
    private PointF f26032b;

    /* renamed from: c */
    private boolean f26033c;

    public C10021n(PointF pointF, boolean z, List<C8779a> list) {
        this.f26032b = pointF;
        this.f26033c = z;
        this.f26031a = new ArrayList(list);
    }

    /* renamed from: a */
    public List<C8779a> m12554a() {
        return this.f26031a;
    }

    /* renamed from: b */
    public PointF m12553b() {
        return this.f26032b;
    }

    /* renamed from: c */
    public void m12552c(C10021n c10021n, C10021n c10021n2, float f) {
        boolean z;
        if (this.f26032b == null) {
            this.f26032b = new PointF();
        }
        if (!c10021n.m12551d() && !c10021n2.m12551d()) {
            z = false;
        } else {
            z = true;
        }
        this.f26033c = z;
        if (c10021n.m12554a().size() != c10021n2.m12554a().size()) {
            C11674f.m7233c("Curves must have the same number of control points. Shape 1: " + c10021n.m12554a().size() + "\tShape 2: " + c10021n2.m12554a().size());
        }
        int min = Math.min(c10021n.m12554a().size(), c10021n2.m12554a().size());
        if (this.f26031a.size() < min) {
            for (int size = this.f26031a.size(); size < min; size++) {
                this.f26031a.add(new C8779a());
            }
        } else if (this.f26031a.size() > min) {
            for (int size2 = this.f26031a.size() - 1; size2 >= min; size2--) {
                List<C8779a> list = this.f26031a;
                list.remove(list.size() - 1);
            }
        }
        PointF m12553b = c10021n.m12553b();
        PointF m12553b2 = c10021n2.m12553b();
        m12549f(C11679k.m7195i(m12553b.x, m12553b2.x, f), C11679k.m7195i(m12553b.y, m12553b2.y, f));
        for (int size3 = this.f26031a.size() - 1; size3 >= 0; size3--) {
            C8779a c8779a = c10021n.m12554a().get(size3);
            C8779a c8779a2 = c10021n2.m12554a().get(size3);
            PointF m17275a = c8779a.m17275a();
            PointF m17274b = c8779a.m17274b();
            PointF m17273c = c8779a.m17273c();
            PointF m17275a2 = c8779a2.m17275a();
            PointF m17274b2 = c8779a2.m17274b();
            PointF m17273c2 = c8779a2.m17273c();
            this.f26031a.get(size3).m17272d(C11679k.m7195i(m17275a.x, m17275a2.x, f), C11679k.m7195i(m17275a.y, m17275a2.y, f));
            this.f26031a.get(size3).m17271e(C11679k.m7195i(m17274b.x, m17274b2.x, f), C11679k.m7195i(m17274b.y, m17274b2.y, f));
            this.f26031a.get(size3).m17270f(C11679k.m7195i(m17273c.x, m17273c2.x, f), C11679k.m7195i(m17273c.y, m17273c2.y, f));
        }
    }

    /* renamed from: d */
    public boolean m12551d() {
        return this.f26033c;
    }

    /* renamed from: e */
    public void m12550e(boolean z) {
        this.f26033c = z;
    }

    /* renamed from: f */
    public void m12549f(float f, float f2) {
        if (this.f26032b == null) {
            this.f26032b = new PointF();
        }
        this.f26032b.set(f, f2);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f26031a.size() + "closed=" + this.f26033c + '}';
    }

    public C10021n() {
        this.f26031a = new ArrayList();
    }
}