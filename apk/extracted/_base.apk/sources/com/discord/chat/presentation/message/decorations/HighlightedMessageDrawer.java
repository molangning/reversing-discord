package com.discord.chat.presentation.message.decorations;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.discord.chat.C2912R;
import com.discord.chat.presentation.list.item.ChatListItem;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0002\u0010\u000bJ*\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u0007J\u000e\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0006R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u000e\u0010\u0013\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006!"}, m14357d2 = {"Lcom/discord/chat/presentation/message/decorations/HighlightedMessageDrawer;", "", "context", "Landroid/content/Context;", "cellHighlightColor", "Lkotlin/Function1;", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "", "gutterColor", "shouldRenderHighlight", "", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "backgroundPaint", "Landroid/graphics/Paint;", "backgroundPaintColor", "Ljava/lang/Integer;", "getCellHighlightColor", "()Lkotlin/jvm/functions/Function1;", "getGutterColor", "gutterPaint", "gutterPaintColor", "gutterWidth", "getShouldRenderHighlight", "drawHighlight", "", "canvas", "Landroid/graphics/Canvas;", "child", "Landroid/view/View;", "topSpacing", "bottomSpacing", "setPaintStyles", "chatListItem", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public class HighlightedMessageDrawer {
    private final Paint backgroundPaint;
    private Integer backgroundPaintColor;
    private final Function1<ChatListItem, Integer> cellHighlightColor;
    private final Function1<ChatListItem, Integer> gutterColor;
    private final Paint gutterPaint;
    private Integer gutterPaintColor;
    private final int gutterWidth;
    private final Function1<ChatListItem, Boolean> shouldRenderHighlight;

    /* JADX WARN: Multi-variable type inference failed */
    public HighlightedMessageDrawer(Context context, Function1<? super ChatListItem, Integer> cellHighlightColor, Function1<? super ChatListItem, Integer> gutterColor, Function1<? super ChatListItem, Boolean> shouldRenderHighlight) {
        C9612q.m13917h(context, "context");
        C9612q.m13917h(cellHighlightColor, "cellHighlightColor");
        C9612q.m13917h(gutterColor, "gutterColor");
        C9612q.m13917h(shouldRenderHighlight, "shouldRenderHighlight");
        this.cellHighlightColor = cellHighlightColor;
        this.gutterColor = gutterColor;
        this.shouldRenderHighlight = shouldRenderHighlight;
        this.gutterWidth = context.getResources().getDimensionPixelSize(C2912R.dimen.message_gutter_width);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        this.backgroundPaint = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL);
        this.gutterPaint = paint2;
    }

    public static /* synthetic */ void drawHighlight$default(HighlightedMessageDrawer highlightedMessageDrawer, Canvas canvas, View view, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawHighlight");
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        highlightedMessageDrawer.drawHighlight(canvas, view, i, i2);
    }

    public final void drawHighlight(Canvas canvas, View child, int i, int i2) {
        float translatedLeft;
        float translatedRight;
        float translatedTop;
        float translatedBottom;
        C9612q.m13917h(canvas, "canvas");
        C9612q.m13917h(child, "child");
        translatedLeft = HighlightedMessageDrawerKt.getTranslatedLeft(child);
        translatedRight = HighlightedMessageDrawerKt.getTranslatedRight(child);
        translatedTop = HighlightedMessageDrawerKt.getTranslatedTop(child);
        float f = translatedTop - i;
        translatedBottom = HighlightedMessageDrawerKt.getTranslatedBottom(child);
        float f2 = translatedBottom + i2;
        Integer num = this.backgroundPaintColor;
        if (num != null) {
            this.backgroundPaint.setColor(num.intValue());
            canvas.drawRect(translatedLeft, f, translatedRight, f2, this.backgroundPaint);
        }
        Integer num2 = this.gutterPaintColor;
        if (num2 != null) {
            this.gutterPaint.setColor(num2.intValue());
            canvas.drawRect(translatedLeft, f, translatedLeft + this.gutterWidth, f2, this.gutterPaint);
        }
    }

    public final Function1<ChatListItem, Integer> getCellHighlightColor() {
        return this.cellHighlightColor;
    }

    public final Function1<ChatListItem, Integer> getGutterColor() {
        return this.gutterColor;
    }

    public final Function1<ChatListItem, Boolean> getShouldRenderHighlight() {
        return this.shouldRenderHighlight;
    }

    public final void setPaintStyles(ChatListItem chatListItem) {
        C9612q.m13917h(chatListItem, "chatListItem");
        this.backgroundPaintColor = this.cellHighlightColor.invoke(chatListItem);
        this.gutterPaintColor = this.gutterColor.invoke(chatListItem);
    }
}
