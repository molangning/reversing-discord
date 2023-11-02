package p223m1;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import p073e1.C6059j0;
import p073e1.InterfaceC6071o0;
import p092f1.C6303a;
import p125h1.AbstractC6861a;
import p125h1.C6885q;
import p311r1.C12022c;

/* renamed from: m1.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10241h extends AbstractC10231b {

    /* renamed from: D */
    private final RectF f26652D;

    /* renamed from: E */
    private final Paint f26653E;

    /* renamed from: F */
    private final float[] f26654F;

    /* renamed from: G */
    private final Path f26655G;

    /* renamed from: H */
    private final C10236e f26656H;

    /* renamed from: I */
    private AbstractC6861a<ColorFilter, ColorFilter> f26657I;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10241h(C6059j0 c6059j0, C10236e c10236e) {
        super(c6059j0, c10236e);
        this.f26652D = new RectF();
        C6303a c6303a = new C6303a();
        this.f26653E = c6303a;
        this.f26654F = new float[8];
        this.f26655G = new Path();
        this.f26656H = c10236e;
        c6303a.setAlpha(0);
        c6303a.setStyle(Paint.Style.FILL);
        c6303a.setColor(c10236e.m12069o());
    }

    @Override // p223m1.AbstractC10231b, p111g1.InterfaceC6523e
    /* renamed from: e */
    public void mo12038e(RectF rectF, Matrix matrix, boolean z) {
        super.mo12038e(rectF, matrix, z);
        this.f26652D.set(0.0f, 0.0f, this.f26656H.m12067q(), this.f26656H.m12068p());
        this.f26583o.mapRect(this.f26652D);
        rectF.set(this.f26652D);
    }

    @Override // p223m1.AbstractC10231b, p167j1.InterfaceC8785f
    /* renamed from: i */
    public <T> void mo12035i(T t, C12022c<T> c12022c) {
        super.mo12035i(t, c12022c);
        if (t == InterfaceC6071o0.f17256K) {
            if (c12022c == null) {
                this.f26657I = null;
            } else {
                this.f26657I = new C6885q(c12022c);
            }
        }
    }

    @Override // p223m1.AbstractC10231b
    /* renamed from: u */
    public void mo12034u(Canvas canvas, Matrix matrix, int i) {
        int intValue;
        int alpha = Color.alpha(this.f26656H.m12069o());
        if (alpha == 0) {
            return;
        }
        if (this.f26592x.m21716h() == null) {
            intValue = 100;
        } else {
            intValue = this.f26592x.m21716h().mo21712h().intValue();
        }
        int i2 = (int) ((i / 255.0f) * (((alpha / 255.0f) * intValue) / 100.0f) * 255.0f);
        this.f26653E.setAlpha(i2);
        AbstractC6861a<ColorFilter, ColorFilter> abstractC6861a = this.f26657I;
        if (abstractC6861a != null) {
            this.f26653E.setColorFilter(abstractC6861a.mo21712h());
        }
        if (i2 > 0) {
            float[] fArr = this.f26654F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.f26656H.m12067q();
            float[] fArr2 = this.f26654F;
            fArr2[3] = 0.0f;
            fArr2[4] = this.f26656H.m12067q();
            this.f26654F[5] = this.f26656H.m12068p();
            float[] fArr3 = this.f26654F;
            fArr3[6] = 0.0f;
            fArr3[7] = this.f26656H.m12068p();
            matrix.mapPoints(this.f26654F);
            this.f26655G.reset();
            Path path = this.f26655G;
            float[] fArr4 = this.f26654F;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.f26655G;
            float[] fArr5 = this.f26654F;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.f26655G;
            float[] fArr6 = this.f26654F;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.f26655G;
            float[] fArr7 = this.f26654F;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.f26655G;
            float[] fArr8 = this.f26654F;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.f26655G.close();
            canvas.drawPath(this.f26655G, this.f26653E);
        }
    }
}
