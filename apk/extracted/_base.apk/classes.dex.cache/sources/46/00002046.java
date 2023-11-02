package com.discord.span.utilities.spannable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0002Jh\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m14357d2 = {"Lcom/discord/span/utilities/spannable/OrderedListBulletSpan;", "Landroid/text/style/LeadingMarginSpan;", "listItemIndex", "", "trailingMargin", "", "largestListItemIndex", "paint", "Landroid/graphics/Paint;", "(JIJLandroid/graphics/Paint;)V", "largestBulletContentWidth", "", "calculateBulletContentWidth", "bulletContent", "", "drawLeadingMargin", "", "canvas", "Landroid/graphics/Canvas;", "x", "dir", ViewProps.TOP, "baseline", ViewProps.BOTTOM, "text", "", ViewProps.START, ViewProps.END, "first", "", "layout", "Landroid/text/Layout;", "getLeadingMargin", "span_utilities_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class OrderedListBulletSpan implements LeadingMarginSpan {
    private final float largestBulletContentWidth;
    private final long listItemIndex;
    private final int trailingMargin;

    public OrderedListBulletSpan(long j, int i, long j2, Paint paint) {
        C9612q.m13917h(paint, "paint");
        this.listItemIndex = j;
        this.trailingMargin = i;
        this.largestBulletContentWidth = calculateBulletContentWidth(paint, j2 + ".");
    }

    private final float calculateBulletContentWidth(Paint paint, String str) {
        Paint paint2 = new Paint(paint);
        paint2.setFontFeatureSettings("tnum");
        return paint2.measureText(str);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence text, int i6, int i7, boolean z, Layout layout) {
        C9612q.m13917h(canvas, "canvas");
        C9612q.m13917h(paint, "paint");
        C9612q.m13917h(text, "text");
        C9612q.m13917h(layout, "layout");
        if (((Spanned) text).getSpanStart(this) == i6) {
            String fontFeatureSettings = paint.getFontFeatureSettings();
            paint.setFontFeatureSettings("tnum");
            String str = this.listItemIndex + ".";
            canvas.drawText(str, i + (this.largestBulletContentWidth - calculateBulletContentWidth(paint, str)), i4, paint);
            paint.setFontFeatureSettings(fontFeatureSettings);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return ((int) this.largestBulletContentWidth) + this.trailingMargin;
    }
}