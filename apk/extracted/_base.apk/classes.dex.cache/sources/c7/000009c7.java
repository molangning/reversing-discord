package bb;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p012ab.C0137a;

/* renamed from: bb.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C2247m {
    @Deprecated

    /* renamed from: a */
    public float f6325a;
    @Deprecated

    /* renamed from: b */
    public float f6326b;
    @Deprecated

    /* renamed from: c */
    public float f6327c;
    @Deprecated

    /* renamed from: d */
    public float f6328d;
    @Deprecated

    /* renamed from: e */
    public float f6329e;
    @Deprecated

    /* renamed from: f */
    public float f6330f;

    /* renamed from: g */
    private final List<AbstractC2253f> f6331g = new ArrayList();

    /* renamed from: h */
    private final List<AbstractC2254g> f6332h = new ArrayList();

    /* renamed from: i */
    private boolean f6333i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bb.m$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C2248a extends AbstractC2254g {

        /* renamed from: b */
        final /* synthetic */ List f6334b;

        /* renamed from: c */
        final /* synthetic */ Matrix f6335c;

        C2248a(List list, Matrix matrix) {
            C2247m.this = r1;
            this.f6334b = list;
            this.f6335c = matrix;
        }

        @Override // bb.C2247m.AbstractC2254g
        /* renamed from: b */
        public void mo33752b(Matrix matrix, C0137a c0137a, int i, Canvas canvas) {
            for (AbstractC2254g abstractC2254g : this.f6334b) {
                abstractC2254g.mo33752b(this.f6335c, c0137a, i, canvas);
            }
        }
    }

    /* renamed from: bb.m$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C2249b extends AbstractC2254g {

        /* renamed from: b */
        private final C2251d f6337b;

        public C2249b(C2251d c2251d) {
            this.f6337b = c2251d;
        }

        @Override // bb.C2247m.AbstractC2254g
        /* renamed from: b */
        public void mo33752b(Matrix matrix, C0137a c0137a, int i, Canvas canvas) {
            c0137a.m41115a(canvas, matrix, new RectF(this.f6337b.m33769k(), this.f6337b.m33765o(), this.f6337b.m33768l(), this.f6337b.m33770j()), i, this.f6337b.m33767m(), this.f6337b.m33766n());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bb.m$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C2250c extends AbstractC2254g {

        /* renamed from: b */
        private final C2252e f6338b;

        /* renamed from: c */
        private final float f6339c;

        /* renamed from: d */
        private final float f6340d;

        public C2250c(C2252e c2252e, float f, float f2) {
            this.f6338b = c2252e;
            this.f6339c = f;
            this.f6340d = f2;
        }

        @Override // bb.C2247m.AbstractC2254g
        /* renamed from: b */
        public void mo33752b(Matrix matrix, C0137a c0137a, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f6338b.f6349c - this.f6340d, this.f6338b.f6348b - this.f6339c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f6339c, this.f6340d);
            matrix2.preRotate(m33779c());
            c0137a.m41114b(canvas, matrix2, rectF, i);
        }

        /* renamed from: c */
        float m33779c() {
            return (float) Math.toDegrees(Math.atan((this.f6338b.f6349c - this.f6340d) / (this.f6338b.f6348b - this.f6339c)));
        }
    }

    /* renamed from: bb.m$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C2251d extends AbstractC2253f {

        /* renamed from: h */
        private static final RectF f6341h = new RectF();
        @Deprecated

        /* renamed from: b */
        public float f6342b;
        @Deprecated

        /* renamed from: c */
        public float f6343c;
        @Deprecated

        /* renamed from: d */
        public float f6344d;
        @Deprecated

        /* renamed from: e */
        public float f6345e;
        @Deprecated

        /* renamed from: f */
        public float f6346f;
        @Deprecated

        /* renamed from: g */
        public float f6347g;

        public C2251d(float f, float f2, float f3, float f4) {
            m33763q(f);
            m33759u(f2);
            m33762r(f3);
            m33764p(f4);
        }

        /* renamed from: j */
        public float m33770j() {
            return this.f6345e;
        }

        /* renamed from: k */
        public float m33769k() {
            return this.f6342b;
        }

        /* renamed from: l */
        public float m33768l() {
            return this.f6344d;
        }

        /* renamed from: m */
        public float m33767m() {
            return this.f6346f;
        }

        /* renamed from: n */
        public float m33766n() {
            return this.f6347g;
        }

        /* renamed from: o */
        public float m33765o() {
            return this.f6343c;
        }

        /* renamed from: p */
        private void m33764p(float f) {
            this.f6345e = f;
        }

        /* renamed from: q */
        private void m33763q(float f) {
            this.f6342b = f;
        }

        /* renamed from: r */
        private void m33762r(float f) {
            this.f6344d = f;
        }

        /* renamed from: s */
        public void m33761s(float f) {
            this.f6346f = f;
        }

        /* renamed from: t */
        public void m33760t(float f) {
            this.f6347g = f;
        }

        /* renamed from: u */
        private void m33759u(float f) {
            this.f6343c = f;
        }

        @Override // bb.C2247m.AbstractC2253f
        /* renamed from: a */
        public void mo33754a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f6350a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f6341h;
            rectF.set(m33769k(), m33765o(), m33768l(), m33770j());
            path.arcTo(rectF, m33767m(), m33766n(), false);
            path.transform(matrix);
        }
    }

    /* renamed from: bb.m$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C2252e extends AbstractC2253f {

        /* renamed from: b */
        private float f6348b;

        /* renamed from: c */
        private float f6349c;

        @Override // bb.C2247m.AbstractC2253f
        /* renamed from: a */
        public void mo33754a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f6350a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f6348b, this.f6349c);
            path.transform(matrix);
        }
    }

    /* renamed from: bb.m$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC2253f {

        /* renamed from: a */
        protected final Matrix f6350a = new Matrix();

        /* renamed from: a */
        public abstract void mo33754a(Matrix matrix, Path path);
    }

    /* renamed from: bb.m$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC2254g {

        /* renamed from: a */
        static final Matrix f6351a = new Matrix();

        AbstractC2254g() {
        }

        /* renamed from: a */
        public final void m33753a(C0137a c0137a, int i, Canvas canvas) {
            mo33752b(f6351a, c0137a, i, canvas);
        }

        /* renamed from: b */
        public abstract void mo33752b(Matrix matrix, C0137a c0137a, int i, Canvas canvas);
    }

    public C2247m() {
        m33787n(0.0f, 0.0f);
    }

    /* renamed from: b */
    private void m33799b(float f) {
        if (m33794g() == f) {
            return;
        }
        float m33794g = ((f - m33794g()) + 360.0f) % 360.0f;
        if (m33794g > 180.0f) {
            return;
        }
        C2251d c2251d = new C2251d(m33792i(), m33791j(), m33792i(), m33791j());
        c2251d.m33761s(m33794g());
        c2251d.m33760t(m33794g);
        this.f6332h.add(new C2249b(c2251d));
        m33785p(f);
    }

    /* renamed from: c */
    private void m33798c(AbstractC2254g abstractC2254g, float f, float f2) {
        m33799b(f);
        this.f6332h.add(abstractC2254g);
        m33785p(f2);
    }

    /* renamed from: g */
    private float m33794g() {
        return this.f6329e;
    }

    /* renamed from: h */
    private float m33793h() {
        return this.f6330f;
    }

    /* renamed from: p */
    private void m33785p(float f) {
        this.f6329e = f;
    }

    /* renamed from: q */
    private void m33784q(float f) {
        this.f6330f = f;
    }

    /* renamed from: r */
    private void m33783r(float f) {
        this.f6327c = f;
    }

    /* renamed from: s */
    private void m33782s(float f) {
        this.f6328d = f;
    }

    /* renamed from: t */
    private void m33781t(float f) {
        this.f6325a = f;
    }

    /* renamed from: u */
    private void m33780u(float f) {
        this.f6326b = f;
    }

    /* renamed from: a */
    public void m33800a(float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        float f7;
        C2251d c2251d = new C2251d(f, f2, f3, f4);
        c2251d.m33761s(f5);
        c2251d.m33760t(f6);
        this.f6331g.add(c2251d);
        C2249b c2249b = new C2249b(c2251d);
        float f8 = f5 + f6;
        if (f6 < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        if (z) {
            f7 = (180.0f + f8) % 360.0f;
        } else {
            f7 = f8;
        }
        m33798c(c2249b, f5, f7);
        double d = f8;
        m33783r(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))));
        m33782s(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))));
    }

    /* renamed from: d */
    public void m33797d(Matrix matrix, Path path) {
        int size = this.f6331g.size();
        for (int i = 0; i < size; i++) {
            this.f6331g.get(i).mo33754a(matrix, path);
        }
    }

    /* renamed from: e */
    public boolean m33796e() {
        return this.f6333i;
    }

    /* renamed from: f */
    public AbstractC2254g m33795f(Matrix matrix) {
        m33799b(m33793h());
        return new C2248a(new ArrayList(this.f6332h), new Matrix(matrix));
    }

    /* renamed from: i */
    public float m33792i() {
        return this.f6327c;
    }

    /* renamed from: j */
    public float m33791j() {
        return this.f6328d;
    }

    /* renamed from: k */
    public float m33790k() {
        return this.f6325a;
    }

    /* renamed from: l */
    public float m33789l() {
        return this.f6326b;
    }

    /* renamed from: m */
    public void m33788m(float f, float f2) {
        C2252e c2252e = new C2252e();
        c2252e.f6348b = f;
        c2252e.f6349c = f2;
        this.f6331g.add(c2252e);
        C2250c c2250c = new C2250c(c2252e, m33792i(), m33791j());
        m33798c(c2250c, c2250c.m33779c() + 270.0f, c2250c.m33779c() + 270.0f);
        m33783r(f);
        m33782s(f2);
    }

    /* renamed from: n */
    public void m33787n(float f, float f2) {
        m33786o(f, f2, 270.0f, 0.0f);
    }

    /* renamed from: o */
    public void m33786o(float f, float f2, float f3, float f4) {
        m33781t(f);
        m33780u(f2);
        m33783r(f);
        m33782s(f2);
        m33785p(f3);
        m33784q((f3 + f4) % 360.0f);
        this.f6331g.clear();
        this.f6332h.clear();
        this.f6333i = false;
    }
}