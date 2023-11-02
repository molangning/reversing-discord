package com.facebook.react.viewmanagers;

import android.view.View;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface DCDChatManagerInterface<T extends View> {
    void scrollIntoView(T t, int i, boolean z);

    void scrollTo(T t, int i, boolean z);

    void scrollToBottom(T t, boolean z);

    void setAlwaysRespectKeyboard(T t, boolean z);

    void setAnimateEmoji(T t, boolean z);

    void setHACK_fixModalInteraction(T t, boolean z);

    void setInverted(T t, boolean z);

    void setKeyboardResponderProxyTag(T t, int i);

    void setRoleStyle(T t, String str);

    void setScrollEnabled(T t, boolean z);

    void setShouldAnimateAndroid(T t, boolean z);
}
