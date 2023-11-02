package com.discord.chat.input;

import android.view.View;
import com.discord.chat.input.views.ChatInputRootView;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.common.ViewUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, m14357d2 = {"Lcom/discord/chat/input/ChatInputManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "getText", "", "tag", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "chat_input_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChatInputManagerModule extends ReactContextBaseJavaModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatInputManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
    }

    public static final void getText$lambda$0(int i, ChatInputManagerModule this$0, Promise promise) {
        C9612q.m13917h(this$0, "this$0");
        C9612q.m13917h(promise, "$promise");
        int uIManagerType = ViewUtil.getUIManagerType(i);
        UIManager uIManager = UIManagerHelper.getUIManager(this$0.getReactApplicationContext(), uIManagerType);
        try {
            C9612q.m13920e(uIManager);
            View resolveView = uIManager.resolveView(i);
            if (resolveView == null) {
                promise.reject(new Exception("View not found for tag " + i + " of UIManagerType " + uIManagerType));
            } else {
                promise.resolve(((ChatInputRootView) resolveView).getText());
            }
        } catch (IllegalViewOperationException e) {
            promise.reject(e);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DCDChatInputManager";
    }

    @ReactMethod
    public final void getText(final int i, final Promise promise) {
        C9612q.m13917h(promise, "promise");
        getReactApplicationContext().runOnUiQueueThread(new Runnable() { // from class: com.discord.chat.input.a
            @Override // java.lang.Runnable
            public final void run() {
                ChatInputManagerModule.getText$lambda$0(i, this, promise);
            }
        });
    }
}