package com.discord.theme;

import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m14357d2 = {"Theme", "Lcom/discord/theme/DiscordTheme;", "getTheme", "()Lcom/discord/theme/DiscordTheme;", "theme_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class ThemeManagerKt {
    public static final DiscordTheme getTheme() {
        ThemeManager themeManager = ThemeManager.INSTANCE;
        DiscordTheme themeOverride = themeManager.getThemeOverride();
        return themeOverride == null ? themeManager.getCurrentTheme$theme_release() : themeOverride;
    }
}