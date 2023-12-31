package com.discord.chat.bridge;

import android.content.Context;
import android.webkit.URLUtil;
import com.discord.react.utilities.ReactColorToAndroidColorKt;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0002\u001a\n\u0010\u0007\u001a\u00020\u0006*\u00020\u0002\u001a\n\u0010\b\u001a\u00020\u0006*\u00020\u0002\u001a\n\u0010\t\u001a\u00020\u0006*\u00020\u0002\u001a\n\u0010\n\u001a\u00020\u0006*\u00020\u0002\u001a\u0014\u0010\u000b\u001a\u00020\f*\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f\u001a\n\u0010\u000e\u001a\u00020\u0006*\u00020\u0002\u001a\n\u0010\u000f\u001a\u00020\u0006*\u00020\u0002\u001a\u0014\u0010\u0010\u001a\u00020\f*\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f¨\u0006\u0011"}, m14357d2 = {"avatarUrl", "", "Lcom/discord/chat/bridge/Message;", "context", "Landroid/content/Context;", "isAutomodSystemMessage", "", "isCallMessage", "isEphemeral", "isSurvey", "isSystemMessage", "roleDotColor", "", "defaultColor", "shouldAnimateEmoji", "shouldAutoPlayGifs", "usernameColor", "chat_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageKt {
    public static final String avatarUrl(Message message, Context context) {
        C9612q.m13917h(message, "<this>");
        C9612q.m13917h(context, "context");
        if (message.getAvatarURL$chat_release() == null) {
            return null;
        }
        if (URLUtil.isNetworkUrl(message.getAvatarURL$chat_release())) {
            return message.getAvatarURL$chat_release();
        }
        return ReactAssetUtilsKt.getReactImageUrl(context, message.getAvatarURL$chat_release());
    }

    public static final boolean isAutomodSystemMessage(Message message) {
        C9612q.m13917h(message, "<this>");
        return message.getType().isAutomodSystem();
    }

    public static final boolean isCallMessage(Message message) {
        C9612q.m13917h(message, "<this>");
        return message.getType().isCall();
    }

    public static final boolean isEphemeral(Message message) {
        C9612q.m13917h(message, "<this>");
        if (message.getEphemeralIndication() != null) {
            return true;
        }
        return false;
    }

    public static final boolean isSurvey(Message message) {
        C9612q.m13917h(message, "<this>");
        if (message.getSurveyIndication() != null) {
            return true;
        }
        return false;
    }

    public static final boolean isSystemMessage(Message message) {
        C9612q.m13917h(message, "<this>");
        return message.getType().isSystem();
    }

    public static final int roleDotColor(Message message, int i) {
        C9612q.m13917h(message, "<this>");
        Integer roleColor = message.getRoleColor();
        if (roleColor != null) {
            return ReactColorToAndroidColorKt.reactColorToAndroidColor(roleColor.intValue());
        }
        return i;
    }

    public static /* synthetic */ int roleDotColor$default(Message message, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = ThemeManagerKt.getTheme().getInteractiveActive();
        }
        return roleDotColor(message, i);
    }

    public static final boolean shouldAnimateEmoji(Message message) {
        C9612q.m13917h(message, "<this>");
        Boolean animateEmoji = message.getAnimateEmoji();
        if (animateEmoji != null) {
            return animateEmoji.booleanValue();
        }
        return false;
    }

    public static final boolean shouldAutoPlayGifs(Message message) {
        C9612q.m13917h(message, "<this>");
        Boolean gifAutoPlay = message.getGifAutoPlay();
        if (gifAutoPlay != null) {
            return gifAutoPlay.booleanValue();
        }
        return false;
    }

    public static final int usernameColor(Message message, int i) {
        C9612q.m13917h(message, "<this>");
        Integer usernameColor = message.getUsernameColor();
        if (usernameColor != null) {
            return ReactColorToAndroidColorKt.reactColorToAndroidColor(usernameColor.intValue());
        }
        return i;
    }

    public static /* synthetic */ int usernameColor$default(Message message, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = ThemeManagerKt.getTheme().getTextNormal();
        }
        return usernameColor(message, i);
    }
}
