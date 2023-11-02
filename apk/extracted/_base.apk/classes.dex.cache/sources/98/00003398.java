package p111g1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import p073e1.C6059j0;
import p073e1.InterfaceC6071o0;
import p125h1.AbstractC6861a;
import p125h1.C6884p;
import p167j1.C8784e;
import p206l1.C10019l;
import p223m1.AbstractC10231b;
import p291q1.C11679k;
import p311r1.C12022c;

/* renamed from: g1.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6536p implements InterfaceC6523e, InterfaceC6532m, InterfaceC6528j, AbstractC6861a.InterfaceC6863b, InterfaceC6529k {

    /* renamed from: a */
    private final Matrix f18540a = new Matrix();

    /* renamed from: b */
    private final Path f18541b = new Path();

    /* renamed from: c */
    private final C6059j0 f18542c;

    /* renamed from: d */
    private final AbstractC10231b f18543d;

    /* renamed from: e */
    private final String f18544e;

    /* renamed from: f */
    private final boolean f18545f;

    /* renamed from: g */
    private final AbstractC6861a<Float, Float> f18546g;

    /* renamed from: h */
    private final AbstractC6861a<Float, Float> f18547h;

    /* renamed from: i */
    private final C6884p f18548i;

    /* renamed from: j */
    private C6522d f18549j;

    public C6536p(C6059j0 c6059j0, AbstractC10231b abstractC10231b, C10019l c10019l) {
        this.f18542c = c6059j0;
        this.f18543d = abstractC10231b;
        this.f18544e = c10019l.m12560c();
        this.f18545f = c10019l.m12557f();
        AbstractC6861a<Float, Float> mo16817a = c10019l.m12561b().mo16817a();
        this.f18546g = mo16817a;
        abstractC10231b.m12102j(mo16817a);
        mo16817a.m21774a(this);
        AbstractC6861a<Float, Float> mo16817a2 = c10019l.m12559d().mo16817a();
        this.f18547h = mo16817a2;
        abstractC10231b.m12102j(mo16817a2);
        mo16817a2.m21774a(this);
        C6884p m16827b = c10019l.m12558e().m16827b();
        this.f18548i = m16827b;
        m16827b.m21723a(abstractC10231b);
        m16827b.m21722b(this);
    }

    @Override // p125h1.AbstractC6861a.InterfaceC6863b
    /* renamed from: a */
    public void mo12107a() {
        this.f18542c.invalidateSelf();
    }

    @Override // p111g1.InterfaceC6521c
    /* renamed from: b */
    public void mo12106b(List<InterfaceC6521c> list, List<InterfaceC6521c> list2) {
        this.f18549j.mo12106b(list, list2);
    }

    @Override // p111g1.InterfaceC6532m
    /* renamed from: c */
    public Path mo22429c() {
        Path mo22429c = this.f18549j.mo22429c();
        this.f18541b.reset();
        float floatValue = this.f18546g.mo21712h().floatValue();
        float floatValue2 = this.f18547h.mo21712h().floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.f18540a.set(this.f18548i.m21717g(i + floatValue2));
            this.f18541b.addPath(mo22429c, this.f18540a);
        }
        return this.f18541b;
    }

    @Override // p167j1.InterfaceC8785f
    /* renamed from: d */
    public void mo12105d(C8784e c8784e, int i, List<C8784e> list, C8784e c8784e2) {
        C11679k.m7193k(c8784e, i, list, c8784e2, this);
        for (int i2 = 0; i2 < this.f18549j.m22453k().size(); i2++) {
            InterfaceC6521c interfaceC6521c = this.f18549j.m22453k().get(i2);
            if (interfaceC6521c instanceof InterfaceC6529k) {
                C11679k.m7193k(c8784e, i, list, c8784e2, (InterfaceC6529k) interfaceC6521c);
            }
        }
    }

    @Override // p111g1.InterfaceC6523e
    /* renamed from: e */
    public void mo12038e(RectF rectF, Matrix matrix, boolean z) {
        this.f18549j.mo12038e(rectF, matrix, z);
    }

    @Override // p111g1.InterfaceC6528j
    /* renamed from: f */
    public void mo22434f(ListIterator<InterfaceC6521c> listIterator) {
        if (this.f18549j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f18549j = new C6522d(this.f18542c, this.f18543d, "Repeater", this.f18545f, arrayList, null);
    }

    @Override // p111g1.InterfaceC6521c
    public String getName() {
        return this.f18544e;
    }

    @Override // p111g1.InterfaceC6523e
    /* renamed from: h */
    public void mo12103h(Canvas canvas, Matrix matrix, int i) {
        float floatValue = this.f18546g.mo21712h().floatValue();
        float floatValue2 = this.f18547h.mo21712h().floatValue();
        float floatValue3 = this.f18548i.m21715i().mo21712h().floatValue() / 100.0f;
        float floatValue4 = this.f18548i.m21719e().mo21712h().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.f18540a.set(matrix);
            float f = i2;
            this.f18540a.preConcat(this.f18548i.m21717g(f + floatValue2));
            this.f18549j.mo12103h(canvas, this.f18540a, (int) (i * C11679k.m7195i(floatValue3, floatValue4, f / floatValue)));
        }
    }

    @Override // p167j1.InterfaceC8785f
    /* renamed from: i */
    public <T> void mo12035i(T t, C12022c<T> c12022c) {
        if (this.f18548i.m21721c(t, c12022c)) {
            return;
        }
        if (t == InterfaceC6071o0.f17281u) {
            this.f18546g.m21767n(c12022c);
        } else if (t == InterfaceC6071o0.f17282v) {
            this.f18547h.m21767n(c12022c);
        }
    }
}