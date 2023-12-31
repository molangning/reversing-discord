package com.discord.keyboard;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import com.discord.codegen.NativeKeyboardManagerSpec;
import com.discord.keyboard.KeyboardManagerModule;
import com.discord.misc.utilities.keyboard.KeyboardExtensionsKt;
import com.discord.misc.utilities.view.ViewUtilsKt;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, m14357d2 = {"Lcom/discord/keyboard/KeyboardManagerModule;", "Lcom/discord/codegen/NativeKeyboardManagerSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "clearCurrentFocusAndDismissKeyboard", "", "dismissGlobalKeyboard", "getName", "", "onKeyboardChanged", "opened", "", "showGlobalKeyboard", "Companion", "keyboard_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class KeyboardManagerModule extends NativeKeyboardManagerSpec {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "RTNKeyboardManager";

    @Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m14357d2 = {"Lcom/discord/keyboard/KeyboardManagerModule$Companion;", "", "()V", "NAME", "", "create", "Lcom/facebook/react/bridge/NativeModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "keyboard_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NativeModule create(ReactApplicationContext reactContext) {
            C9612q.m13917h(reactContext, "reactContext");
            return new KeyboardManagerModule(reactContext);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyboardManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
    }

    public static final void onKeyboardChanged$lambda$0(boolean z) {
        KeyboardManager.INSTANCE.onKeyboardChanged$keyboard_release(z);
    }

    @Override // com.discord.codegen.NativeKeyboardManagerSpec
    public void clearCurrentFocusAndDismissKeyboard() {
        View currentFocus;
        Window window = ViewUtilsKt.getWindow(getReactApplicationContext());
        if (window != null && (currentFocus = window.getCurrentFocus()) != null) {
            currentFocus.clearFocus();
        }
        dismissGlobalKeyboard();
    }

    @Override // com.discord.codegen.NativeKeyboardManagerSpec
    public void dismissGlobalKeyboard() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            KeyboardExtensionsKt.hideKeyboard(currentActivity);
        }
    }

    @Override // com.discord.codegen.NativeKeyboardManagerSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RTNKeyboardManager";
    }

    @Override // com.discord.codegen.NativeKeyboardManagerSpec
    public void onKeyboardChanged(final boolean z) {
        getReactApplicationContext().runOnUiQueueThread(new Runnable() { // from class: j2.a
            @Override // java.lang.Runnable
            public final void run() {
                KeyboardManagerModule.onKeyboardChanged$lambda$0(z);
            }
        });
    }

    @Override // com.discord.codegen.NativeKeyboardManagerSpec
    public void showGlobalKeyboard() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            KeyboardExtensionsKt.showKeyboard(currentActivity);
        }
    }
}