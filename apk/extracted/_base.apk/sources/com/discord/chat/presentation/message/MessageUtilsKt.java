package com.discord.chat.presentation.message;

import android.content.Context;
import com.discord.react.FontManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m14357d2 = {"getChatTextSizeSp", "", "Landroid/content/Context;", "chat_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageUtilsKt {
    public static final int getChatTextSizeSp(Context context) {
        C9612q.m13917h(context, "<this>");
        if (FontManager.INSTANCE.getIsClassicChatFontScaleEnabled(context)) {
            return 14;
        }
        return 16;
    }
}
