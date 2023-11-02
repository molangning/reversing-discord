package p111g1;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import p073e1.C6059j0;
import p125h1.AbstractC6861a;
import p167j1.C8779a;
import p206l1.C10020m;
import p206l1.C10021n;
import p223m1.AbstractC10231b;

/* renamed from: g1.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6537q implements InterfaceC6539s, AbstractC6861a.InterfaceC6863b {

    /* renamed from: a */
    private final C6059j0 f18550a;

    /* renamed from: b */
    private final String f18551b;

    /* renamed from: c */
    private final AbstractC6861a<Float, Float> f18552c;

    /* renamed from: d */
    private C10021n f18553d;

    public C6537q(C6059j0 c6059j0, AbstractC10231b abstractC10231b, C10020m c10020m) {
        this.f18550a = c6059j0;
        this.f18551b = c10020m.m12555c();
        AbstractC6861a<Float, Float> mo16817a = c10020m.m12556b().mo16817a();
        this.f18552c = mo16817a;
        abstractC10231b.m12102j(mo16817a);
        mo16817a.m21774a(this);
    }

    /* renamed from: d */
    private static int m22433d(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) >= 0 || i2 * i3 == i) ? i3 : i3 - 1;
    }

    /* renamed from: f */
    private static int m22432f(int i, int i2) {
        return i - (m22433d(i, i2) * i2);
    }

    /* renamed from: j */
    private C10021n m22430j(C10021n c10021n) {
        PointF m17273c;
        PointF m17274b;
        boolean z;
        List<C8779a> m12554a = c10021n.m12554a();
        boolean m12551d = c10021n.m12551d();
        int i = 0;
        for (int size = m12554a.size() - 1; size >= 0; size--) {
            C8779a c8779a = m12554a.get(size);
            C8779a c8779a2 = m12554a.get(m22432f(size - 1, m12554a.size()));
            if (size == 0 && !m12551d) {
                m17273c = c10021n.m12553b();
            } else {
                m17273c = c8779a2.m17273c();
            }
            if (size == 0 && !m12551d) {
                m17274b = m17273c;
            } else {
                m17274b = c8779a2.m17274b();
            }
            PointF m17275a = c8779a.m17275a();
            if (!c10021n.m12551d() && size == 0 && size == m12554a.size() - 1) {
                z = true;
            } else {
                z = false;
            }
            if (m17274b.equals(m17273c) && m17275a.equals(m17273c) && !z) {
                i += 2;
            } else {
                i++;
            }
        }
        C10021n c10021n2 = this.f18553d;
        if (c10021n2 == null || c10021n2.m12554a().size() != i) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new C8779a());
            }
            this.f18553d = new C10021n(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.f18553d.m12550e(m12551d);
        return this.f18553d;
    }

    @Override // p125h1.AbstractC6861a.InterfaceC6863b
    /* renamed from: a */
    public void mo12107a() {
        this.f18550a.invalidateSelf();
    }

    @Override // p111g1.InterfaceC6521c
    /* renamed from: b */
    public void mo12106b(List<InterfaceC6521c> list, List<InterfaceC6521c> list2) {
    }

    @Override // p111g1.InterfaceC6539s
    /* renamed from: g */
    public C10021n mo22427g(C10021n c10021n) {
        PointF m17273c;
        PointF m17274b;
        boolean z;
        List<C8779a> list;
        List<C8779a> m12554a = c10021n.m12554a();
        if (m12554a.size() <= 2) {
            return c10021n;
        }
        float floatValue = this.f18552c.mo21712h().floatValue();
        if (floatValue == 0.0f) {
            return c10021n;
        }
        C10021n m22430j = m22430j(c10021n);
        m22430j.m12549f(c10021n.m12553b().x, c10021n.m12553b().y);
        List<C8779a> m12554a2 = m22430j.m12554a();
        boolean m12551d = c10021n.m12551d();
        int i = 0;
        int i2 = 0;
        while (i < m12554a.size()) {
            C8779a c8779a = m12554a.get(i);
            C8779a c8779a2 = m12554a.get(m22432f(i - 1, m12554a.size()));
            C8779a c8779a3 = m12554a.get(m22432f(i - 2, m12554a.size()));
            if (i == 0 && !m12551d) {
                m17273c = c10021n.m12553b();
            } else {
                m17273c = c8779a2.m17273c();
            }
            if (i == 0 && !m12551d) {
                m17274b = m17273c;
            } else {
                m17274b = c8779a2.m17274b();
            }
            PointF m17275a = c8779a.m17275a();
            PointF m17273c2 = c8779a3.m17273c();
            PointF m17273c3 = c8779a.m17273c();
            if (!c10021n.m12551d() && i == 0 && i == m12554a.size() - 1) {
                z = true;
            } else {
                z = false;
            }
            if (m17274b.equals(m17273c) && m17275a.equals(m17273c) && !z) {
                float f = m17273c.x;
                float f2 = f - m17273c2.x;
                float f3 = m17273c.y;
                float f4 = m17273c3.x - f;
                list = m12554a;
                float min = Math.min(floatValue / ((float) Math.hypot(f2, f3 - m17273c2.y)), 0.5f);
                float min2 = Math.min(floatValue / ((float) Math.hypot(f4, m17273c3.y - f3)), 0.5f);
                float f5 = m17273c.x;
                float f6 = ((m17273c2.x - f5) * min) + f5;
                float f7 = m17273c.y;
                float f8 = ((m17273c2.y - f7) * min) + f7;
                float f9 = ((m17273c3.x - f5) * min2) + f5;
                float f10 = ((m17273c3.y - f7) * min2) + f7;
                float f11 = f6 - ((f6 - f5) * 0.5519f);
                float f12 = f8 - ((f8 - f7) * 0.5519f);
                float f13 = f9 - ((f9 - f5) * 0.5519f);
                float f14 = f10 - ((f10 - f7) * 0.5519f);
                C8779a c8779a4 = m12554a2.get(m22432f(i2 - 1, m12554a2.size()));
                C8779a c8779a5 = m12554a2.get(i2);
                c8779a4.m17271e(f6, f8);
                c8779a4.m17270f(f6, f8);
                if (i == 0) {
                    m22430j.m12549f(f6, f8);
                }
                c8779a5.m17272d(f11, f12);
                i2++;
                c8779a5.m17271e(f13, f14);
                c8779a5.m17270f(f9, f10);
                m12554a2.get(i2).m17272d(f9, f10);
            } else {
                list = m12554a;
                C8779a c8779a6 = m12554a2.get(m22432f(i2 - 1, m12554a2.size()));
                c8779a6.m17271e(c8779a2.m17274b().x, c8779a2.m17274b().y);
                c8779a6.m17270f(c8779a2.m17273c().x, c8779a2.m17273c().y);
                m12554a2.get(i2).m17272d(c8779a.m17275a().x, c8779a.m17275a().y);
            }
            i2++;
            i++;
            m12554a = list;
        }
        return m22430j;
    }

    /* renamed from: i */
    public AbstractC6861a<Float, Float> m22431i() {
        return this.f18552c;
    }
}
