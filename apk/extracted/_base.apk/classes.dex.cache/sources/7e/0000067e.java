package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.core.util.C1138f;

/* renamed from: androidx.emoji2.text.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class AbstractC1516i extends ReplacementSpan {

    /* renamed from: k */
    private final C1512g f3956k;

    /* renamed from: j */
    private final Paint.FontMetricsInt f3955j = new Paint.FontMetricsInt();

    /* renamed from: l */
    private short f3957l = -1;

    /* renamed from: m */
    private short f3958m = -1;

    /* renamed from: n */
    private float f3959n = 1.0f;

    public AbstractC1516i(C1512g c1512g) {
        C1138f.m37823g(c1512g, "metadata cannot be null");
        this.f3956k = c1512g;
    }

    /* renamed from: a */
    public final C1512g m36596a() {
        return this.f3956k;
    }

    /* renamed from: b */
    public final int m36595b() {
        return this.f3957l;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f3955j);
        Paint.FontMetricsInt fontMetricsInt2 = this.f3955j;
        this.f3959n = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f3956k.m36621e();
        this.f3958m = (short) (this.f3956k.m36621e() * this.f3959n);
        short m36617i = (short) (this.f3956k.m36617i() * this.f3959n);
        this.f3957l = m36617i;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f3955j;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return m36617i;
    }
}