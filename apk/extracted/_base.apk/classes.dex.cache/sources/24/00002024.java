package com.discord.span.utilities;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.SpannedString;
import android.text.style.LineBackgroundSpan;
import android.widget.TextView;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.span.utilities.common.BackgroundStyle;
import com.discord.span.utilities.spannable.BackgroundSpan;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J`\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m14357d2 = {"Lcom/discord/span/utilities/BackgroundSpanDrawer;", "Landroid/text/style/LineBackgroundSpan;", "provider", "Landroid/widget/TextView;", "(Landroid/widget/TextView;)V", "drawBackground", "", "canvas", "Landroid/graphics/Canvas;", "paint", "Landroid/graphics/Paint;", ViewProps.LEFT, "", ViewProps.RIGHT, ViewProps.TOP, "baseline", ViewProps.BOTTOM, "text", "", ViewProps.START, ViewProps.END, "lineNumber", "span_utilities_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class BackgroundSpanDrawer implements LineBackgroundSpan {
    private final TextView provider;

    public BackgroundSpanDrawer(TextView provider) {
        C9612q.m13917h(provider, "provider");
        this.provider = provider;
    }

    @Override // android.text.style.LineBackgroundSpan
    public void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence text, int i6, int i7, int i8) {
        int i9;
        int i10;
        Layout layout;
        SpannedString spannedString;
        boolean z;
        float lineRight;
        int i11;
        C9612q.m13917h(canvas, "canvas");
        C9612q.m13917h(paint, "paint");
        C9612q.m13917h(text, "text");
        SpannedString valueOf = SpannedString.valueOf(text);
        C9612q.m13918g(valueOf, "valueOf(this)");
        BackgroundSpan[] backgroundSpans = (BackgroundSpan[]) valueOf.getSpans(0, text.length(), BackgroundSpan.class);
        Layout layout2 = this.provider.getLayout();
        C9612q.m13918g(layout2, "provider.layout");
        C9612q.m13918g(backgroundSpans, "backgroundSpans");
        int length = backgroundSpans.length;
        int i12 = 0;
        while (i12 < length) {
            BackgroundSpan backgroundSpan = backgroundSpans[i12];
            int spanStart = valueOf.getSpanStart(backgroundSpan);
            int spanEnd = valueOf.getSpanEnd(backgroundSpan);
            BackgroundStyle style = backgroundSpan.getStyle();
            float dpToPx = SizeUtilsKt.getDpToPx(style.getCornerRadius());
            int lineForOffset = layout2.getLineForOffset(spanStart);
            int i13 = i12;
            int lineForOffset2 = layout2.getLineForOffset(spanEnd);
            if (lineForOffset <= i8 && i8 <= lineForOffset2) {
                int primaryHorizontal = lineForOffset == i8 ? (int) layout2.getPrimaryHorizontal(spanStart) : i;
                if (lineForOffset2 == i8) {
                    i10 = length;
                    lineRight = layout2.getPrimaryHorizontal(Math.min(spanEnd, layout2.getLineEnd(i8)));
                } else {
                    i10 = length;
                    lineRight = layout2.getLineRight(i8);
                }
                int i14 = (int) lineRight;
                int color = paint.getColor();
                paint.setColor(style.getBackgroundColor());
                if (lineForOffset == lineForOffset2) {
                    i9 = i13;
                    spannedString = valueOf;
                    i11 = color;
                    layout = layout2;
                    canvas.drawRoundRect(primaryHorizontal, i3, i14, i5, SizeUtilsKt.getDpToPx(style.getCornerRadius()), SizeUtilsKt.getDpToPx(style.getCornerRadius()), paint);
                } else {
                    i9 = i13;
                    layout = layout2;
                    spannedString = valueOf;
                    i11 = color;
                    if (lineForOffset == i8) {
                        paint.setColor(style.getBackgroundColor());
                        Path path = new Path();
                        path.addRoundRect(primaryHorizontal, i3, i14, i5, new float[]{dpToPx, dpToPx, 0.0f, 0.0f, 0.0f, 0.0f, dpToPx, dpToPx}, Path.Direction.CW);
                        canvas.drawPath(path, paint);
                    } else {
                        if (lineForOffset2 == i8) {
                            paint.setColor(style.getBackgroundColor());
                            Path path2 = new Path();
                            z = false;
                            path2.addRoundRect(primaryHorizontal, i3, i14, i5, new float[]{0.0f, 0.0f, dpToPx, dpToPx, dpToPx, dpToPx, 0.0f, 0.0f}, Path.Direction.CW);
                            canvas.drawPath(path2, paint);
                        } else {
                            z = false;
                            canvas.drawRect(primaryHorizontal, i3, i14, i5, paint);
                        }
                        paint.setColor(i11);
                    }
                }
                z = false;
                paint.setColor(i11);
            } else {
                i9 = i13;
                i10 = length;
                layout = layout2;
                spannedString = valueOf;
                z = false;
            }
            i12 = i9 + 1;
            valueOf = spannedString;
            length = i10;
            layout2 = layout;
        }
    }
}