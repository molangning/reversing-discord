package com.discord.chat.presentation.textutils;

import com.discord.fonts.DiscordFont;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m14357d2 = {"Lcom/discord/chat/presentation/textutils/LinkStyle;", "", "font", "Lcom/discord/fonts/DiscordFont;", "linkColor", "", "(Lcom/discord/fonts/DiscordFont;I)V", "getFont", "()Lcom/discord/fonts/DiscordFont;", "getLinkColor", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class LinkStyle {
    private final DiscordFont font;
    private final int linkColor;

    public LinkStyle() {
        this(null, 0, 3, null);
    }

    public LinkStyle(DiscordFont font, int i) {
        C9612q.m13917h(font, "font");
        this.font = font;
        this.linkColor = i;
    }

    public static /* synthetic */ LinkStyle copy$default(LinkStyle linkStyle, DiscordFont discordFont, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            discordFont = linkStyle.font;
        }
        if ((i2 & 2) != 0) {
            i = linkStyle.linkColor;
        }
        return linkStyle.copy(discordFont, i);
    }

    public final DiscordFont component1() {
        return this.font;
    }

    public final int component2() {
        return this.linkColor;
    }

    public final LinkStyle copy(DiscordFont font, int i) {
        C9612q.m13917h(font, "font");
        return new LinkStyle(font, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LinkStyle) {
            LinkStyle linkStyle = (LinkStyle) obj;
            return this.font == linkStyle.font && this.linkColor == linkStyle.linkColor;
        }
        return false;
    }

    public final DiscordFont getFont() {
        return this.font;
    }

    public final int getLinkColor() {
        return this.linkColor;
    }

    public int hashCode() {
        return (this.font.hashCode() * 31) + this.linkColor;
    }

    public String toString() {
        DiscordFont discordFont = this.font;
        int i = this.linkColor;
        return "LinkStyle(font=" + discordFont + ", linkColor=" + i + ")";
    }

    public /* synthetic */ LinkStyle(DiscordFont discordFont, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? DiscordFont.PrimaryNormal : discordFont, (i2 & 2) != 0 ? ThemeManagerKt.getTheme().getTextLink() : i);
    }
}
