package com.discord.chat.presentation.message.view;

import com.discord.chat.C2912R;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, m14357d2 = {"getEmbedBackgroundColor", "", "chat_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class GetEmbedBackgroundColorKt {
    public static final int getEmbedBackgroundColor() {
        return ThemeManagerKt.getTheme().getColorRes(C2912R.color.primary_130, C2912R.color.primary_630);
    }
}