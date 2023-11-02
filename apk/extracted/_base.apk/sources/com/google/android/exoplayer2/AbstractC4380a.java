package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.Timeline;
import p195k8.C9149a;
import p229m7.InterfaceC10327o0;

/* renamed from: com.google.android.exoplayer2.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC4380a extends Timeline {

    /* renamed from: b */
    private final int f11396b;

    /* renamed from: c */
    private final InterfaceC10327o0 f11397c;

    /* renamed from: d */
    private final boolean f11398d;

    public AbstractC4380a(boolean z, InterfaceC10327o0 interfaceC10327o0) {
        this.f11398d = z;
        this.f11397c = interfaceC10327o0;
        this.f11396b = interfaceC10327o0.getLength();
    }

    /* renamed from: B */
    private int m29713B(int i, boolean z) {
        if (z) {
            return this.f11397c.mo11765c(i);
        }
        if (i < this.f11396b - 1) {
            return i + 1;
        }
        return -1;
    }

    /* renamed from: C */
    private int m29712C(int i, boolean z) {
        if (z) {
            return this.f11397c.mo11766b(i);
        }
        if (i > 0) {
            return i - 1;
        }
        return -1;
    }

    /* renamed from: v */
    public static Object m29710v(Object obj) {
        return ((Pair) obj).second;
    }

    /* renamed from: w */
    public static Object m29709w(Object obj) {
        return ((Pair) obj).first;
    }

    /* renamed from: y */
    public static Object m29708y(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    /* renamed from: A */
    protected abstract int mo28977A(int i);

    /* renamed from: D */
    protected abstract Timeline mo28976D(int i);

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: a */
    public int mo11844a(boolean z) {
        if (this.f11396b == 0) {
            return -1;
        }
        int i = 0;
        if (this.f11398d) {
            z = false;
        }
        if (z) {
            i = this.f11397c.mo11762f();
        }
        while (mo28976D(i).m29737q()) {
            i = m29713B(i, z);
            if (i == -1) {
                return -1;
            }
        }
        return mo28977A(i) + mo28976D(i).mo11844a(z);
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: b */
    public final int mo11758b(Object obj) {
        int mo11758b;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object m29709w = m29709w(obj);
        Object m29710v = m29710v(obj);
        int mo28974s = mo28974s(m29709w);
        if (mo28974s == -1 || (mo11758b = mo28976D(mo28974s).mo11758b(m29710v)) == -1) {
            return -1;
        }
        return mo28970z(mo28974s) + mo11758b;
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: c */
    public int mo11843c(boolean z) {
        int i;
        int i2 = this.f11396b;
        if (i2 == 0) {
            return -1;
        }
        if (this.f11398d) {
            z = false;
        }
        if (z) {
            i = this.f11397c.mo11764d();
        } else {
            i = i2 - 1;
        }
        while (mo28976D(i).m29737q()) {
            i = m29712C(i, z);
            if (i == -1) {
                return -1;
            }
        }
        return mo28977A(i) + mo28976D(i).mo11843c(z);
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: e */
    public int mo11842e(int i, int i2, boolean z) {
        int i3 = 0;
        if (this.f11398d) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int mo28972u = mo28972u(i);
        int mo28977A = mo28977A(mo28972u);
        Timeline mo28976D = mo28976D(mo28972u);
        int i4 = i - mo28977A;
        if (i2 != 2) {
            i3 = i2;
        }
        int mo11842e = mo28976D.mo11842e(i4, i3, z);
        if (mo11842e != -1) {
            return mo28977A + mo11842e;
        }
        int m29713B = m29713B(mo28972u, z);
        while (m29713B != -1 && mo28976D(m29713B).m29737q()) {
            m29713B = m29713B(m29713B, z);
        }
        if (m29713B != -1) {
            return mo28977A(m29713B) + mo28976D(m29713B).mo11844a(z);
        }
        if (i2 != 2) {
            return -1;
        }
        return mo11844a(z);
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: g */
    public final Timeline.C4378b mo11757g(int i, Timeline.C4378b c4378b, boolean z) {
        int mo28973t = mo28973t(i);
        int mo28977A = mo28977A(mo28973t);
        mo28976D(mo28973t).mo11757g(i - mo28970z(mo28973t), c4378b, z);
        c4378b.f11373c += mo28977A;
        if (z) {
            c4378b.f11372b = m29708y(mo28971x(mo28973t), C9149a.m16448e(c4378b.f11372b));
        }
        return c4378b;
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: h */
    public final Timeline.C4378b mo29711h(Object obj, Timeline.C4378b c4378b) {
        Object m29709w = m29709w(obj);
        Object m29710v = m29710v(obj);
        int mo28974s = mo28974s(m29709w);
        int mo28977A = mo28977A(mo28974s);
        mo28976D(mo28974s).mo29711h(m29710v, c4378b);
        c4378b.f11373c += mo28977A;
        c4378b.f11372b = obj;
        return c4378b;
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: l */
    public int mo11841l(int i, int i2, boolean z) {
        int i3 = 0;
        if (this.f11398d) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int mo28972u = mo28972u(i);
        int mo28977A = mo28977A(mo28972u);
        Timeline mo28976D = mo28976D(mo28972u);
        int i4 = i - mo28977A;
        if (i2 != 2) {
            i3 = i2;
        }
        int mo11841l = mo28976D.mo11841l(i4, i3, z);
        if (mo11841l != -1) {
            return mo28977A + mo11841l;
        }
        int m29712C = m29712C(mo28972u, z);
        while (m29712C != -1 && mo28976D(m29712C).m29737q()) {
            m29712C = m29712C(m29712C, z);
        }
        if (m29712C != -1) {
            return mo28977A(m29712C) + mo28976D(m29712C).mo11843c(z);
        }
        if (i2 != 2) {
            return -1;
        }
        return mo11843c(z);
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: m */
    public final Object mo11755m(int i) {
        int mo28973t = mo28973t(i);
        return m29708y(mo28971x(mo28973t), mo28976D(mo28973t).mo11755m(i - mo28970z(mo28973t)));
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: o */
    public final Timeline.C4379c mo11754o(int i, Timeline.C4379c c4379c, long j) {
        int mo28972u = mo28972u(i);
        int mo28977A = mo28977A(mo28972u);
        int mo28970z = mo28970z(mo28972u);
        mo28976D(mo28972u).mo11754o(i - mo28977A, c4379c, j);
        Object mo28971x = mo28971x(mo28972u);
        if (!Timeline.C4379c.f11377r.equals(c4379c.f11379a)) {
            mo28971x = m29708y(mo28971x, c4379c.f11379a);
        }
        c4379c.f11379a = mo28971x;
        c4379c.f11391m += mo28970z;
        c4379c.f11392n += mo28970z;
        return c4379c;
    }

    /* renamed from: s */
    protected abstract int mo28974s(Object obj);

    /* renamed from: t */
    protected abstract int mo28973t(int i);

    /* renamed from: u */
    protected abstract int mo28972u(int i);

    /* renamed from: x */
    protected abstract Object mo28971x(int i);

    /* renamed from: z */
    protected abstract int mo28970z(int i);
}
