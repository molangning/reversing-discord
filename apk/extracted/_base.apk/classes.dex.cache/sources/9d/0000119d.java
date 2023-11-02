package com.discord.chat.input.views;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m14357d2 = {"KEYBOARD_CLOSE_BLUR_DELAY", "", "isScreenReaderOn", "", "Landroid/content/Context;", "chat_input_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChatInputRootViewKt {
    public static final long KEYBOARD_CLOSE_BLUR_DELAY = 100;

    public static final boolean isScreenReaderOn(Context context) {
        C9612q.m13917h(context, "<this>");
        Object systemService = context.getSystemService("accessibility");
        C9612q.m13919f(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        if (accessibilityManager.isEnabled()) {
            return !accessibilityManager.getEnabledAccessibilityServiceList(1).isEmpty();
        }
        return false;
    }
}