package p329s;

import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;

/* renamed from: s.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C12332k {

    /* renamed from: h */
    public static int f32154h;

    /* renamed from: c */
    AbstractC12335m f32157c;

    /* renamed from: d */
    AbstractC12335m f32158d;

    /* renamed from: f */
    int f32160f;

    /* renamed from: g */
    int f32161g;

    /* renamed from: a */
    public int f32155a = 0;

    /* renamed from: b */
    public boolean f32156b = false;

    /* renamed from: e */
    ArrayList<AbstractC12335m> f32159e = new ArrayList<>();

    public C12332k(AbstractC12335m abstractC12335m, int i) {
        this.f32157c = null;
        this.f32158d = null;
        int i2 = f32154h;
        this.f32160f = i2;
        f32154h = i2 + 1;
        this.f32157c = abstractC12335m;
        this.f32158d = abstractC12335m;
        this.f32161g = i;
    }

    /* renamed from: c */
    private long m5468c(C12325f c12325f, long j) {
        AbstractC12335m abstractC12335m = c12325f.f32133d;
        if (abstractC12335m instanceof C12329i) {
            return j;
        }
        int size = c12325f.f32140k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            InterfaceC12323d interfaceC12323d = c12325f.f32140k.get(i);
            if (interfaceC12323d instanceof C12325f) {
                C12325f c12325f2 = (C12325f) interfaceC12323d;
                if (c12325f2.f32133d != abstractC12335m) {
                    j2 = Math.min(j2, m5468c(c12325f2, c12325f2.f32135f + j));
                }
            }
        }
        if (c12325f == abstractC12335m.f32173i) {
            long mo5456j = j - abstractC12335m.mo5456j();
            return Math.min(Math.min(j2, m5468c(abstractC12335m.f32172h, mo5456j)), mo5456j - abstractC12335m.f32172h.f32135f);
        }
        return j2;
    }

    /* renamed from: d */
    private long m5467d(C12325f c12325f, long j) {
        AbstractC12335m abstractC12335m = c12325f.f32133d;
        if (abstractC12335m instanceof C12329i) {
            return j;
        }
        int size = c12325f.f32140k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            InterfaceC12323d interfaceC12323d = c12325f.f32140k.get(i);
            if (interfaceC12323d instanceof C12325f) {
                C12325f c12325f2 = (C12325f) interfaceC12323d;
                if (c12325f2.f32133d != abstractC12335m) {
                    j2 = Math.max(j2, m5467d(c12325f2, c12325f2.f32135f + j));
                }
            }
        }
        if (c12325f == abstractC12335m.f32172h) {
            long mo5456j = j + abstractC12335m.mo5456j();
            return Math.max(Math.max(j2, m5467d(abstractC12335m.f32173i, mo5456j)), mo5456j - abstractC12335m.f32173i.f32135f);
        }
        return j2;
    }

    /* renamed from: a */
    public void m5470a(AbstractC12335m abstractC12335m) {
        this.f32159e.add(abstractC12335m);
        this.f32158d = abstractC12335m;
    }

    /* renamed from: b */
    public long m5469b(ConstraintWidgetContainer constraintWidgetContainer, int i) {
        AbstractC12335m abstractC12335m;
        AbstractC12335m abstractC12335m2;
        AbstractC12335m abstractC12335m3;
        long mo5456j;
        int i2;
        C12325f c12325f;
        C12325f c12325f2;
        AbstractC12335m abstractC12335m4;
        AbstractC12335m abstractC12335m5 = this.f32157c;
        long j = 0;
        if (abstractC12335m5 instanceof C12322c) {
            if (((C12322c) abstractC12335m5).f32170f != i) {
                return 0L;
            }
        } else if (i == 0) {
            if (!(abstractC12335m5 instanceof C12330j)) {
                return 0L;
            }
        } else if (!(abstractC12335m5 instanceof C12333l)) {
            return 0L;
        }
        if (i == 0) {
            abstractC12335m = constraintWidgetContainer.f2248e;
        } else {
            abstractC12335m = constraintWidgetContainer.f2250f;
        }
        C12325f c12325f3 = abstractC12335m.f32172h;
        if (i == 0) {
            abstractC12335m2 = constraintWidgetContainer.f2248e;
        } else {
            abstractC12335m2 = constraintWidgetContainer.f2250f;
        }
        C12325f c12325f4 = abstractC12335m2.f32173i;
        boolean contains = abstractC12335m5.f32172h.f32141l.contains(c12325f3);
        boolean contains2 = this.f32157c.f32173i.f32141l.contains(c12325f4);
        long mo5456j2 = this.f32157c.mo5456j();
        if (contains && contains2) {
            long m5467d = m5467d(this.f32157c.f32172h, 0L);
            long m5468c = m5468c(this.f32157c.f32173i, 0L);
            long j2 = m5467d - mo5456j2;
            AbstractC12335m abstractC12335m6 = this.f32157c;
            int i3 = abstractC12335m6.f32173i.f32135f;
            if (j2 >= (-i3)) {
                j2 += i3;
            }
            int i4 = abstractC12335m6.f32172h.f32135f;
            long j3 = ((-m5468c) - mo5456j2) - i4;
            if (j3 >= i4) {
                j3 -= i4;
            }
            float m39386m = abstractC12335m6.f32166b.m39386m(i);
            if (m39386m > 0.0f) {
                j = (((float) j3) / m39386m) + (((float) j2) / (1.0f - m39386m));
            }
            float f = (float) j;
            long j4 = (f * m39386m) + 0.5f + mo5456j2 + (f * (1.0f - m39386m)) + 0.5f;
            mo5456j = abstractC12335m4.f32172h.f32135f + j4;
            i2 = this.f32157c.f32173i.f32135f;
        } else if (contains) {
            return Math.max(m5467d(this.f32157c.f32172h, c12325f2.f32135f), this.f32157c.f32172h.f32135f + mo5456j2);
        } else if (contains2) {
            return Math.max(-m5468c(this.f32157c.f32173i, c12325f.f32135f), (-this.f32157c.f32173i.f32135f) + mo5456j2);
        } else {
            mo5456j = abstractC12335m3.f32172h.f32135f + this.f32157c.mo5456j();
            i2 = this.f32157c.f32173i.f32135f;
        }
        return mo5456j - i2;
    }
}