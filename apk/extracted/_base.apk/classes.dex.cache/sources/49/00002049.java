package com.discord.span.utilities.spannable;

import android.graphics.Paint;
import android.text.Spanned;
import android.text.style.LineHeightSpan;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J8\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\t¨\u0006\u001b"}, m14357d2 = {"Lcom/discord/span/utilities/spannable/VerticalPaddingSpan;", "Landroid/text/style/LineHeightSpan;", ViewProps.PADDING, "", "(I)V", ViewProps.TOP, ViewProps.BOTTOM, "(II)V", "getBottom", "()I", "initialized", "", "origAscent", "origBottom", "origDescent", "origTop", "getTop", "chooseHeight", "", "text", "", ViewProps.START, ViewProps.END, "spanstartv", "v", "fontMetrics", "Landroid/graphics/Paint$FontMetricsInt;", "span_utilities_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class VerticalPaddingSpan implements LineHeightSpan {
    private final int bottom;
    private boolean initialized;
    private int origAscent;
    private int origBottom;
    private int origDescent;
    private int origTop;
    private final int top;

    public VerticalPaddingSpan(int i, int i2) {
        this.top = i;
        this.bottom = i2;
        this.origTop = -1;
        this.origAscent = -1;
        this.origBottom = -1;
        this.origDescent = -1;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence text, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetrics) {
        C9612q.m13917h(text, "text");
        C9612q.m13917h(fontMetrics, "fontMetrics");
        if (!(text instanceof Spanned)) {
            return;
        }
        if (!this.initialized) {
            this.origTop = fontMetrics.top;
            this.origAscent = fontMetrics.ascent;
            this.origBottom = fontMetrics.bottom;
            this.origDescent = fontMetrics.descent;
            this.initialized = true;
        }
        Spanned spanned = (Spanned) text;
        if (spanned.getSpanStart(this) == i) {
            int i5 = fontMetrics.top;
            int i6 = this.top;
            fontMetrics.top = i5 - i6;
            fontMetrics.ascent -= i6;
        } else {
            fontMetrics.top = this.origTop;
            fontMetrics.ascent = this.origAscent;
        }
        if (spanned.getSpanEnd(this) == i2) {
            int i7 = fontMetrics.bottom;
            int i8 = this.bottom;
            fontMetrics.bottom = i7 + i8;
            fontMetrics.descent += i8;
            return;
        }
        fontMetrics.bottom = this.origBottom;
        fontMetrics.descent = this.origDescent;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getTop() {
        return this.top;
    }

    public VerticalPaddingSpan(int i) {
        this(i, i);
    }
}