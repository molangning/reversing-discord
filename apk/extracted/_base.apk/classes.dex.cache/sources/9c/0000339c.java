package p111g1;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import p073e1.C6059j0;
import p073e1.InterfaceC6071o0;
import p125h1.AbstractC6861a;
import p125h1.C6868b;
import p125h1.C6885q;
import p206l1.C10025r;
import p223m1.AbstractC10231b;
import p311r1.C12022c;

/* renamed from: g1.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6540t extends AbstractC6517a {

    /* renamed from: r */
    private final AbstractC10231b f18561r;

    /* renamed from: s */
    private final String f18562s;

    /* renamed from: t */
    private final boolean f18563t;

    /* renamed from: u */
    private final AbstractC6861a<Integer, Integer> f18564u;

    /* renamed from: v */
    private AbstractC6861a<ColorFilter, ColorFilter> f18565v;

    public C6540t(C6059j0 c6059j0, AbstractC10231b abstractC10231b, C10025r c10025r) {
        super(c6059j0, abstractC10231b, c10025r.m12537b().m12526b(), c10025r.m12534e().m12524b(), c10025r.m12532g(), c10025r.m12530i(), c10025r.m12529j(), c10025r.m12533f(), c10025r.m12535d());
        this.f18561r = abstractC10231b;
        this.f18562s = c10025r.m12531h();
        this.f18563t = c10025r.m12528k();
        AbstractC6861a<Integer, Integer> mo16817a = c10025r.m12536c().mo16817a();
        this.f18564u = mo16817a;
        mo16817a.m21774a(this);
        abstractC10231b.m12102j(mo16817a);
    }

    @Override // p111g1.InterfaceC6521c
    public String getName() {
        return this.f18562s;
    }

    @Override // p111g1.AbstractC6517a, p111g1.InterfaceC6523e
    /* renamed from: h */
    public void mo12103h(Canvas canvas, Matrix matrix, int i) {
        if (this.f18563t) {
            return;
        }
        this.f18430i.setColor(((C6868b) this.f18564u).m21759p());
        AbstractC6861a<ColorFilter, ColorFilter> abstractC6861a = this.f18565v;
        if (abstractC6861a != null) {
            this.f18430i.setColorFilter(abstractC6861a.mo21712h());
        }
        super.mo12103h(canvas, matrix, i);
    }

    @Override // p111g1.AbstractC6517a, p167j1.InterfaceC8785f
    /* renamed from: i */
    public <T> void mo12035i(T t, C12022c<T> c12022c) {
        super.mo12035i(t, c12022c);
        if (t == InterfaceC6071o0.f17262b) {
            this.f18564u.m21767n(c12022c);
        } else if (t == InterfaceC6071o0.f17256K) {
            AbstractC6861a<ColorFilter, ColorFilter> abstractC6861a = this.f18565v;
            if (abstractC6861a != null) {
                this.f18561r.m12112H(abstractC6861a);
            }
            if (c12022c == null) {
                this.f18565v = null;
                return;
            }
            C6885q c6885q = new C6885q(c12022c);
            this.f18565v = c6885q;
            c6885q.m21774a(this);
            this.f18561r.m12102j(this.f18564u);
        }
    }
}