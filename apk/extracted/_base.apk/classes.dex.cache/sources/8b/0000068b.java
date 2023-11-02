package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;

/* renamed from: androidx.emoji2.text.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1529o extends AbstractC1516i {

    /* renamed from: o */
    private static Paint f3985o;

    public C1529o(C1512g c1512g) {
        super(c1512g);
    }

    /* renamed from: c */
    private static Paint m36553c() {
        if (f3985o == null) {
            TextPaint textPaint = new TextPaint();
            f3985o = textPaint;
            textPaint.setColor(C1500e.m36656b().m36655c());
            f3985o.setStyle(Paint.Style.FILL);
        }
        return f3985o;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (C1500e.m36656b().m36649i()) {
            canvas.drawRect(f, i3, f + m36595b(), i5, m36553c());
        }
        m36596a().m36625a(canvas, f, i4, paint);
    }
}