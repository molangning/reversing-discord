package p223m1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import p073e1.C6059j0;
import p073e1.C6063k0;
import p073e1.InterfaceC6071o0;
import p092f1.C6303a;
import p125h1.AbstractC6861a;
import p125h1.C6885q;
import p291q1.C11680l;
import p311r1.C12022c;

/* renamed from: m1.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10235d extends AbstractC10231b {

    /* renamed from: D */
    private final Paint f26605D;

    /* renamed from: E */
    private final Rect f26606E;

    /* renamed from: F */
    private final Rect f26607F;

    /* renamed from: G */
    private final C6063k0 f26608G;

    /* renamed from: H */
    private AbstractC6861a<ColorFilter, ColorFilter> f26609H;

    /* renamed from: I */
    private AbstractC6861a<Bitmap, Bitmap> f26610I;

    public C10235d(C6059j0 c6059j0, C10236e c10236e) {
        super(c6059j0, c10236e);
        this.f26605D = new C6303a(3);
        this.f26606E = new Rect();
        this.f26607F = new Rect();
        this.f26608G = c6059j0.m23760O(c10236e.m12071m());
    }

    /* renamed from: P */
    private Bitmap m12084P() {
        Bitmap mo21712h;
        AbstractC6861a<Bitmap, Bitmap> abstractC6861a = this.f26610I;
        if (abstractC6861a != null && (mo21712h = abstractC6861a.mo21712h()) != null) {
            return mo21712h;
        }
        Bitmap m23776G = this.f26584p.m23776G(this.f26585q.m12071m());
        if (m23776G != null) {
            return m23776G;
        }
        C6063k0 c6063k0 = this.f26608G;
        if (c6063k0 != null) {
            return c6063k0.m23654a();
        }
        return null;
    }

    @Override // p223m1.AbstractC10231b, p111g1.InterfaceC6523e
    /* renamed from: e */
    public void mo12038e(RectF rectF, Matrix matrix, boolean z) {
        super.mo12038e(rectF, matrix, z);
        if (this.f26608G != null) {
            float m7188e = C11680l.m7188e();
            rectF.set(0.0f, 0.0f, this.f26608G.m23650e() * m7188e, this.f26608G.m23652c() * m7188e);
            this.f26583o.mapRect(rectF);
        }
    }

    @Override // p223m1.AbstractC10231b, p167j1.InterfaceC8785f
    /* renamed from: i */
    public <T> void mo12035i(T t, C12022c<T> c12022c) {
        super.mo12035i(t, c12022c);
        if (t == InterfaceC6071o0.f17256K) {
            if (c12022c == null) {
                this.f26609H = null;
            } else {
                this.f26609H = new C6885q(c12022c);
            }
        } else if (t == InterfaceC6071o0.f17259N) {
            if (c12022c == null) {
                this.f26610I = null;
            } else {
                this.f26610I = new C6885q(c12022c);
            }
        }
    }

    @Override // p223m1.AbstractC10231b
    /* renamed from: u */
    public void mo12034u(Canvas canvas, Matrix matrix, int i) {
        Bitmap m12084P = m12084P();
        if (m12084P != null && !m12084P.isRecycled() && this.f26608G != null) {
            float m7188e = C11680l.m7188e();
            this.f26605D.setAlpha(i);
            AbstractC6861a<ColorFilter, ColorFilter> abstractC6861a = this.f26609H;
            if (abstractC6861a != null) {
                this.f26605D.setColorFilter(abstractC6861a.mo21712h());
            }
            canvas.save();
            canvas.concat(matrix);
            this.f26606E.set(0, 0, m12084P.getWidth(), m12084P.getHeight());
            if (this.f26584p.m23758P()) {
                this.f26607F.set(0, 0, (int) (this.f26608G.m23650e() * m7188e), (int) (this.f26608G.m23652c() * m7188e));
            } else {
                this.f26607F.set(0, 0, (int) (m12084P.getWidth() * m7188e), (int) (m12084P.getHeight() * m7188e));
            }
            canvas.drawBitmap(m12084P, this.f26606E, this.f26607F, this.f26605D);
            canvas.restore();
        }
    }
}