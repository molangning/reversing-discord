package p171j5;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;

/* renamed from: j5.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C8797a extends ReplacementSpan {

    /* renamed from: j */
    private int f23100j;

    /* renamed from: k */
    private int f23101k;

    /* renamed from: l */
    private Rect f23102l;

    /* renamed from: m */
    private final int f23103m;

    /* renamed from: n */
    private final Paint.FontMetricsInt f23104n = new Paint.FontMetricsInt();

    /* renamed from: o */
    private final Drawable f23105o;

    public C8797a(Drawable drawable, int i) {
        this.f23105o = drawable;
        this.f23103m = i;
        m17220b();
    }

    /* renamed from: a */
    private int m17221a(Paint.FontMetricsInt fontMetricsInt) {
        int i = this.f23103m;
        if (i != 0) {
            if (i != 2) {
                return -this.f23101k;
            }
            int i2 = fontMetricsInt.descent;
            int i3 = fontMetricsInt.ascent;
            return i3 + (((i2 - i3) - this.f23101k) / 2);
        }
        return fontMetricsInt.descent - this.f23101k;
    }

    /* renamed from: b */
    public void m17220b() {
        Rect bounds = this.f23105o.getBounds();
        this.f23102l = bounds;
        this.f23100j = bounds.width();
        this.f23101k = this.f23102l.height();
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        paint.getFontMetricsInt(this.f23104n);
        int m17221a = i4 + m17221a(this.f23104n);
        canvas.translate(f, m17221a);
        this.f23105o.draw(canvas);
        canvas.translate(-f, -m17221a);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        m17220b();
        if (fontMetricsInt == null) {
            return this.f23100j;
        }
        int m17221a = m17221a(fontMetricsInt);
        int i3 = this.f23101k + m17221a;
        if (m17221a < fontMetricsInt.ascent) {
            fontMetricsInt.ascent = m17221a;
        }
        if (m17221a < fontMetricsInt.top) {
            fontMetricsInt.top = m17221a;
        }
        if (i3 > fontMetricsInt.descent) {
            fontMetricsInt.descent = i3;
        }
        if (i3 > fontMetricsInt.bottom) {
            fontMetricsInt.bottom = i3;
        }
        return this.f23100j;
    }
}
