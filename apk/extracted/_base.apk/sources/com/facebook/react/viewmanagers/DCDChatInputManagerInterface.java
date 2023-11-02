package com.facebook.react.viewmanagers;

import android.view.View;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface DCDChatInputManagerInterface<T extends View> {
    void backspace(T t);

    void blur(T t);

    void focus(T t);

    void openCustomKeyboard(T t);

    void openSystemKeyboard(T t);

    void replaceRange(T t, int i, int i2, String str, String str2, boolean z, String str3);

    void setEditable(T t, boolean z);

    void setKeyboardAppearance(T t, int i);

    void setMarkAsSpoilerTitle(T t, String str);

    void setPlaceholder(T t, String str);

    void setPlaceholderColor(T t, String str);

    void setSelectedRange(T t, int i, int i2);

    void setSelectionColor(T t, String str);

    void setShouldShowCursor(T t, boolean z);

    void setText(T t, String str);

    void setTextColor(T t, String str);

    void updateTextBlocks(T t, String str, String str2);
}
