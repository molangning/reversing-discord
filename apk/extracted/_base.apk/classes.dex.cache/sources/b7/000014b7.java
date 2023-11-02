package com.discord.chat.presentation.textutils;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0002J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000fH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m14357d2 = {"Lcom/discord/chat/presentation/textutils/DiscordFontSpan;", "Landroid/text/style/MetricAffectingSpan;", "context", "Landroid/content/Context;", "discordFont", "Lcom/discord/fonts/DiscordFont;", "(Landroid/content/Context;Lcom/discord/fonts/DiscordFont;)V", "font", "Landroid/graphics/Typeface;", "applyCustomTypeFace", "", "paint", "Landroid/graphics/Paint;", "tf", "updateDrawState", "Landroid/text/TextPaint;", "updateMeasureState", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class DiscordFontSpan extends MetricAffectingSpan {
    private final Typeface font;

    public DiscordFontSpan(Context context, DiscordFont discordFont) {
        C9612q.m13917h(context, "context");
        C9612q.m13917h(discordFont, "discordFont");
        this.font = DiscordFontUtilsKt.getDiscordTypefaceFor(context, discordFont);
    }

    private final void applyCustomTypeFace(Paint paint, Typeface typeface) {
        int i;
        Typeface typeface2 = paint.getTypeface();
        if (typeface2 != null) {
            i = typeface2.getStyle();
        } else {
            i = 0;
        }
        int i2 = i & (~typeface.getStyle());
        if ((i2 & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((i2 & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(typeface);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint paint) {
        C9612q.m13917h(paint, "paint");
        applyCustomTypeFace(paint, this.font);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint paint) {
        C9612q.m13917h(paint, "paint");
        applyCustomTypeFace(paint, this.font);
    }
}