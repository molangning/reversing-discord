package p111g1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p073e1.C6059j0;
import p073e1.C6062k;
import p092f1.C6303a;
import p125h1.AbstractC6861a;
import p125h1.C6884p;
import p167j1.C8784e;
import p167j1.InterfaceC8785f;
import p188k1.C9048l;
import p206l1.C10023p;
import p206l1.InterfaceC10007c;
import p223m1.AbstractC10231b;
import p291q1.C11680l;
import p311r1.C12022c;

/* renamed from: g1.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6522d implements InterfaceC6523e, InterfaceC6532m, AbstractC6861a.InterfaceC6863b, InterfaceC8785f {

    /* renamed from: a */
    private final Paint f18442a;

    /* renamed from: b */
    private final RectF f18443b;

    /* renamed from: c */
    private final Matrix f18444c;

    /* renamed from: d */
    private final Path f18445d;

    /* renamed from: e */
    private final RectF f18446e;

    /* renamed from: f */
    private final String f18447f;

    /* renamed from: g */
    private final boolean f18448g;

    /* renamed from: h */
    private final List<InterfaceC6521c> f18449h;

    /* renamed from: i */
    private final C6059j0 f18450i;

    /* renamed from: j */
    private List<InterfaceC6532m> f18451j;

    /* renamed from: k */
    private C6884p f18452k;

    public C6522d(C6059j0 c6059j0, AbstractC10231b abstractC10231b, C10023p c10023p, C6062k c6062k) {
        this(c6059j0, abstractC10231b, c10023p.m12542c(), c10023p.m12541d(), m22455f(c6059j0, c6062k, abstractC10231b, c10023p.m12543b()), m22454j(c10023p.m12543b()));
    }

    /* renamed from: f */
    private static List<InterfaceC6521c> m22455f(C6059j0 c6059j0, C6062k c6062k, AbstractC10231b abstractC10231b, List<InterfaceC10007c> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            InterfaceC6521c mo12523a = list.get(i).mo12523a(c6059j0, c6062k, abstractC10231b);
            if (mo12523a != null) {
                arrayList.add(mo12523a);
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    static C9048l m22454j(List<InterfaceC10007c> list) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC10007c interfaceC10007c = list.get(i);
            if (interfaceC10007c instanceof C9048l) {
                return (C9048l) interfaceC10007c;
            }
        }
        return null;
    }

    /* renamed from: n */
    private boolean m22450n() {
        int i = 0;
        for (int i2 = 0; i2 < this.f18449h.size(); i2++) {
            if ((this.f18449h.get(i2) instanceof InterfaceC6523e) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // p125h1.AbstractC6861a.InterfaceC6863b
    /* renamed from: a */
    public void mo12107a() {
        this.f18450i.invalidateSelf();
    }

    @Override // p111g1.InterfaceC6521c
    /* renamed from: b */
    public void mo12106b(List<InterfaceC6521c> list, List<InterfaceC6521c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f18449h.size());
        arrayList.addAll(list);
        for (int size = this.f18449h.size() - 1; size >= 0; size--) {
            InterfaceC6521c interfaceC6521c = this.f18449h.get(size);
            interfaceC6521c.mo12106b(arrayList, this.f18449h.subList(0, size));
            arrayList.add(interfaceC6521c);
        }
    }

    @Override // p111g1.InterfaceC6532m
    /* renamed from: c */
    public Path mo22429c() {
        this.f18444c.reset();
        C6884p c6884p = this.f18452k;
        if (c6884p != null) {
            this.f18444c.set(c6884p.m21718f());
        }
        this.f18445d.reset();
        if (this.f18448g) {
            return this.f18445d;
        }
        for (int size = this.f18449h.size() - 1; size >= 0; size--) {
            InterfaceC6521c interfaceC6521c = this.f18449h.get(size);
            if (interfaceC6521c instanceof InterfaceC6532m) {
                this.f18445d.addPath(((InterfaceC6532m) interfaceC6521c).mo22429c(), this.f18444c);
            }
        }
        return this.f18445d;
    }

    @Override // p167j1.InterfaceC8785f
    /* renamed from: d */
    public void mo12105d(C8784e c8784e, int i, List<C8784e> list, C8784e c8784e2) {
        if (!c8784e.m17253g(getName(), i) && !"__container".equals(getName())) {
            return;
        }
        if (!"__container".equals(getName())) {
            c8784e2 = c8784e2.m17259a(getName());
            if (c8784e.m17257c(getName(), i)) {
                list.add(c8784e2.m17251i(this));
            }
        }
        if (c8784e.m17252h(getName(), i)) {
            int m17255e = i + c8784e.m17255e(getName(), i);
            for (int i2 = 0; i2 < this.f18449h.size(); i2++) {
                InterfaceC6521c interfaceC6521c = this.f18449h.get(i2);
                if (interfaceC6521c instanceof InterfaceC8785f) {
                    ((InterfaceC8785f) interfaceC6521c).mo12105d(c8784e, m17255e, list, c8784e2);
                }
            }
        }
    }

    @Override // p111g1.InterfaceC6523e
    /* renamed from: e */
    public void mo12038e(RectF rectF, Matrix matrix, boolean z) {
        this.f18444c.set(matrix);
        C6884p c6884p = this.f18452k;
        if (c6884p != null) {
            this.f18444c.preConcat(c6884p.m21718f());
        }
        this.f18446e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f18449h.size() - 1; size >= 0; size--) {
            InterfaceC6521c interfaceC6521c = this.f18449h.get(size);
            if (interfaceC6521c instanceof InterfaceC6523e) {
                ((InterfaceC6523e) interfaceC6521c).mo12038e(this.f18446e, this.f18444c, z);
                rectF.union(this.f18446e);
            }
        }
    }

    @Override // p111g1.InterfaceC6521c
    public String getName() {
        return this.f18447f;
    }

    @Override // p111g1.InterfaceC6523e
    /* renamed from: h */
    public void mo12103h(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        int intValue;
        if (this.f18448g) {
            return;
        }
        this.f18444c.set(matrix);
        C6884p c6884p = this.f18452k;
        if (c6884p != null) {
            this.f18444c.preConcat(c6884p.m21718f());
            if (this.f18452k.m21716h() == null) {
                intValue = 100;
            } else {
                intValue = this.f18452k.m21716h().mo21712h().intValue();
            }
            i = (int) ((((intValue / 100.0f) * i) / 255.0f) * 255.0f);
        }
        if (this.f18450i.m23726d0() && m22450n() && i != 255) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f18443b.set(0.0f, 0.0f, 0.0f, 0.0f);
            mo12038e(this.f18443b, this.f18444c, true);
            this.f18442a.setAlpha(i);
            C11680l.m7180m(canvas, this.f18443b, this.f18442a);
        }
        if (z) {
            i = 255;
        }
        for (int size = this.f18449h.size() - 1; size >= 0; size--) {
            InterfaceC6521c interfaceC6521c = this.f18449h.get(size);
            if (interfaceC6521c instanceof InterfaceC6523e) {
                ((InterfaceC6523e) interfaceC6521c).mo12103h(canvas, this.f18444c, i);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    @Override // p167j1.InterfaceC8785f
    /* renamed from: i */
    public <T> void mo12035i(T t, C12022c<T> c12022c) {
        C6884p c6884p = this.f18452k;
        if (c6884p != null) {
            c6884p.m21721c(t, c12022c);
        }
    }

    /* renamed from: k */
    public List<InterfaceC6521c> m22453k() {
        return this.f18449h;
    }

    /* renamed from: l */
    public List<InterfaceC6532m> m22452l() {
        if (this.f18451j == null) {
            this.f18451j = new ArrayList();
            for (int i = 0; i < this.f18449h.size(); i++) {
                InterfaceC6521c interfaceC6521c = this.f18449h.get(i);
                if (interfaceC6521c instanceof InterfaceC6532m) {
                    this.f18451j.add((InterfaceC6532m) interfaceC6521c);
                }
            }
        }
        return this.f18451j;
    }

    /* renamed from: m */
    public Matrix m22451m() {
        C6884p c6884p = this.f18452k;
        if (c6884p != null) {
            return c6884p.m21718f();
        }
        this.f18444c.reset();
        return this.f18444c;
    }

    public C6522d(C6059j0 c6059j0, AbstractC10231b abstractC10231b, String str, boolean z, List<InterfaceC6521c> list, C9048l c9048l) {
        this.f18442a = new C6303a();
        this.f18443b = new RectF();
        this.f18444c = new Matrix();
        this.f18445d = new Path();
        this.f18446e = new RectF();
        this.f18447f = str;
        this.f18450i = c6059j0;
        this.f18448g = z;
        this.f18449h = list;
        if (c9048l != null) {
            C6884p m16827b = c9048l.m16827b();
            this.f18452k = m16827b;
            m16827b.m21723a(abstractC10231b);
            this.f18452k.m21722b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            InterfaceC6521c interfaceC6521c = list.get(size);
            if (interfaceC6521c instanceof InterfaceC6528j) {
                arrayList.add((InterfaceC6528j) interfaceC6521c);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((InterfaceC6528j) arrayList.get(size2)).mo22434f(list.listIterator(list.size()));
        }
    }
}