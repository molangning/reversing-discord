package com.discord.chat.input;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.view.Window;
import com.discord.chat.input.bridge.ChatInputNode;
import com.discord.chat.input.bridge.ChatInputNode$$serializer;
import com.discord.chat.input.events.OnContentSizeChangeEvent;
import com.discord.chat.input.events.OnEndBlurEvent;
import com.discord.chat.input.events.OnFocusEvent;
import com.discord.chat.input.events.OnPasteImageEvent;
import com.discord.chat.input.events.OnRequestSendEvent;
import com.discord.chat.input.events.OnSelectionOrTextChangeEvent;
import com.discord.chat.input.views.ChatInputRootView;
import com.discord.keyboard.KeyboardManager;
import com.discord.misc.utilities.keyboard.KeyboardExtensionsKt;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.DCDChatInputManagerDelegate;
import com.facebook.react.viewmanagers.DCDChatInputManagerInterface;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.json.C9976l;
import kotlinx.serialization.json.Json;
import p045cj.C2581f;
import pf.C11591x;

@ReactModule(name = ChatInputViewManager.NAME)
@Metadata(m14358d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0007\u0018\u0000 C2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001CB\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J$\u0010\u001b\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006H\u0014J\u0014\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0016J\u0010\u0010 \u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0010\u0010!\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0010\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\"\u0010#\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010&H\u0016JB\u0010'\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0019H\u0016J\u0018\u00100\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u00101\u001a\u00020.H\u0017J\u0018\u00102\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u00103\u001a\u00020)H\u0017J\u001a\u00104\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u00105\u001a\u0004\u0018\u00010\u0019H\u0017J\u001a\u00106\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u00107\u001a\u0004\u0018\u00010\u0019H\u0017J\u001a\u00108\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u00109\u001a\u0004\u0018\u00010\u0019H\u0017J \u0010:\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)H\u0016J\u001a\u0010;\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010<\u001a\u0004\u0018\u00010\u0019H\u0017J\u0018\u0010=\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010>\u001a\u00020.H\u0017J\u001a\u0010?\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010@\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010A\u001a\u0004\u0018\u00010\u0019H\u0017J\"\u0010B\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010/\u001a\u0004\u0018\u00010\u0019H\u0016R*\u0010\u0005\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006D"}, m14357d2 = {"Lcom/discord/chat/input/ChatInputViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/discord/chat/input/views/ChatInputRootView;", "Lcom/facebook/react/viewmanagers/DCDChatInputManagerInterface;", "()V", "delegate", "Lcom/facebook/react/viewmanagers/DCDChatInputManagerDelegate;", "kotlin.jvm.PlatformType", "json", "Lkotlinx/serialization/json/Json;", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "getReactEvents$chat_input_release", "()Lcom/discord/reactevents/ReactEvents;", ChatInputViewManager.COMMAND_BACKSPACE, "", "view", ChatInputViewManager.COMMAND_BLUR, "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "decodeStyleBlocks", "", "Lcom/discord/chat/input/bridge/ChatInputNode;", "blocks", "", ChatInputViewManager.COMMAND_FOCUS, "getDelegate", "getExportedCustomDirectEventTypeConstants", "", "", "getName", "onDropViewInstance", ChatInputViewManager.COMMAND_OPEN_CUSTOM_KEYBOARD, ChatInputViewManager.COMMAND_OPEN_SYSTEM_KEYBOARD, "receiveCommand", "commandId", "args", "Lcom/facebook/react/bridge/ReadableArray;", ChatInputViewManager.COMMAND_REPLACE_RANGE, "location", "", "length", "text", "styleBlocks", "keepCursorPosition", "", "editId", "setEditable", "editable", "setKeyboardAppearance", "keyboardAppearance", "setMarkAsSpoilerTitle", "spoilerTitle", "setPlaceholder", ReactTextInputShadowNode.PROP_PLACEHOLDER, "setPlaceholderColor", "placeholderColor", ChatInputViewManager.COMMAND_SET_SELECTED_RANGE, "setSelectionColor", "selectionColor", "setShouldShowCursor", "shouldShowCursor", ChatInputViewManager.COMMAND_SET_TEXT, "setTextColor", "textColor", ChatInputViewManager.COMMAND_UPDATE_TEXT_BLOCKS, "Companion", "chat_input_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChatInputViewManager extends ViewGroupManager<ChatInputRootView> implements DCDChatInputManagerInterface<ChatInputRootView> {
    private static final String COMMAND_BACKSPACE = "backspace";
    private static final String COMMAND_BLUR = "blur";
    private static final String COMMAND_FOCUS = "focus";
    private static final String COMMAND_OPEN_CUSTOM_KEYBOARD = "openCustomKeyboard";
    private static final String COMMAND_OPEN_SYSTEM_KEYBOARD = "openSystemKeyboard";
    private static final String COMMAND_REPLACE_RANGE = "replaceRange";
    private static final String COMMAND_SET_SELECTED_RANGE = "setSelectedRange";
    private static final String COMMAND_SET_TEXT = "setText";
    private static final String COMMAND_UPDATE_TEXT_BLOCKS = "updateTextBlocks";
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "DCDChatInput";
    private final Json json = C9976l.m12702b(null, ChatInputViewManager$json$1.INSTANCE, 1, null);
    private final DCDChatInputManagerDelegate<ChatInputRootView, ChatInputViewManager> delegate = new DCDChatInputManagerDelegate<>(this);
    private final ReactEvents reactEvents = new ReactEvents(C11591x.m7577a("onChangeContentSize", C9591f0.m13969b(OnContentSizeChangeEvent.class)), C11591x.m7577a("onEndBlur", C9591f0.m13969b(OnEndBlurEvent.class)), C11591x.m7577a("onBeginFocus", C9591f0.m13969b(OnFocusEvent.class)), C11591x.m7577a("onSelectionOrTextChange", C9591f0.m13969b(OnSelectionOrTextChangeEvent.class)), C11591x.m7577a("onPasteImage", C9591f0.m13969b(OnPasteImageEvent.class)), C11591x.m7577a("onRequestSend", C9591f0.m13969b(OnRequestSendEvent.class)));

    @Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m14357d2 = {"Lcom/discord/chat/input/ChatInputViewManager$Companion;", "", "()V", "COMMAND_BACKSPACE", "", "COMMAND_BLUR", "COMMAND_FOCUS", "COMMAND_OPEN_CUSTOM_KEYBOARD", "COMMAND_OPEN_SYSTEM_KEYBOARD", "COMMAND_REPLACE_RANGE", "COMMAND_SET_SELECTED_RANGE", "COMMAND_SET_TEXT", "COMMAND_UPDATE_TEXT_BLOCKS", "NAME", "chat_input_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final List<ChatInputNode> decodeStyleBlocks(String str) {
        Json json = this.json;
        json.mo265a();
        return (List) json.mo232b(new C2581f(ChatInputNode$$serializer.INSTANCE), str);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return this.reactEvents.exportEventConstants();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public final ReactEvents getReactEvents$chat_input_release() {
        return this.reactEvents;
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    @ReactProp(name = "keyboardAppearance")
    public void setKeyboardAppearance(ChatInputRootView view, int i) {
        C9612q.m13917h(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    @ReactProp(name = "markAsSpoilerTitle")
    public void setMarkAsSpoilerTitle(ChatInputRootView view, String str) {
        C9612q.m13917h(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    @ReactProp(name = "selectionColor")
    public void setSelectionColor(ChatInputRootView view, String str) {
        C9612q.m13917h(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    public void backspace(ChatInputRootView view) {
        C9612q.m13917h(view, "view");
        view.backspace();
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    public void blur(ChatInputRootView view) {
        C9612q.m13917h(view, "view");
        view.clearInputFocus();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ChatInputRootView createViewInstance(final ThemedReactContext reactContext) {
        C9612q.m13917h(reactContext, "reactContext");
        final ChatInputRootView chatInputRootView = new ChatInputRootView(reactContext, null, 0, 6, null);
        chatInputRootView.setListener(new ChatInputRootView.ChatInputListener() { // from class: com.discord.chat.input.ChatInputViewManager$createViewInstance$1$1
            @Override // com.discord.chat.input.views.ChatInputRootView.ChatInputListener
            public void onContentSizeChange(int i, int i2) {
                ChatInputViewManager.this.getReactEvents$chat_input_release().emitEvent(reactContext, chatInputRootView, new OnContentSizeChangeEvent(i, i2));
            }

            @Override // com.discord.chat.input.views.ChatInputRootView.ChatInputListener
            public void onEndBlur(String text) {
                C9612q.m13917h(text, "text");
                ChatInputViewManager.this.getReactEvents$chat_input_release().emitEvent(reactContext, chatInputRootView, new OnEndBlurEvent(text));
            }

            @Override // com.discord.chat.input.views.ChatInputRootView.ChatInputListener
            public void onFocus(int i, int i2) {
                ChatInputViewManager.this.getReactEvents$chat_input_release().emitEvent(reactContext, chatInputRootView, new OnFocusEvent(i, i2, 0, 4, (DefaultConstructorMarker) null));
            }

            @Override // com.discord.chat.input.views.ChatInputRootView.ChatInputListener
            public void onImageInserted(Uri uri) {
                C9612q.m13917h(uri, "uri");
                ReactEvents reactEvents$chat_input_release = ChatInputViewManager.this.getReactEvents$chat_input_release();
                ThemedReactContext themedReactContext = reactContext;
                ChatInputRootView chatInputRootView2 = chatInputRootView;
                String uri2 = uri.toString();
                C9612q.m13918g(uri2, "uri.toString()");
                reactEvents$chat_input_release.emitEvent(themedReactContext, chatInputRootView2, new OnPasteImageEvent(uri2, reactContext.getContentResolver().getType(uri)));
            }

            @Override // com.discord.chat.input.views.ChatInputRootView.ChatInputListener
            public void onRequestSend() {
                ChatInputViewManager.this.getReactEvents$chat_input_release().emitEvent(reactContext, chatInputRootView, new OnRequestSendEvent());
            }

            @Override // com.discord.chat.input.views.ChatInputRootView.ChatInputListener
            public void onTextOrSelectionChanged(int i, int i2, String text, String editId) {
                C9612q.m13917h(text, "text");
                C9612q.m13917h(editId, "editId");
                ChatInputViewManager.this.getReactEvents$chat_input_release().emitEvent(reactContext, chatInputRootView, new OnSelectionOrTextChangeEvent(i, i2, text, editId));
            }
        });
        KeyboardManager.INSTANCE.addKeyboardListener(chatInputRootView);
        return chatInputRootView;
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    public void focus(ChatInputRootView view) {
        C9612q.m13917h(view, "view");
        view.requestInputFocus();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public DCDChatInputManagerDelegate<ChatInputRootView, ChatInputViewManager> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(ChatInputRootView view) {
        C9612q.m13917h(view, "view");
        KeyboardManager.INSTANCE.removeKeyboardListener(view);
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    public void openCustomKeyboard(ChatInputRootView view) {
        Window window;
        C9612q.m13917h(view, "view");
        Context context = view.getContext();
        C9612q.m13919f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        Activity currentActivity = ((ReactContext) context).getCurrentActivity();
        if (currentActivity == null || (window = currentActivity.getWindow()) == null) {
            return;
        }
        KeyboardExtensionsKt.hideKeyboard(view, window);
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    public void openSystemKeyboard(ChatInputRootView view) {
        Window window;
        C9612q.m13917h(view, "view");
        Context context = view.getContext();
        C9612q.m13919f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        Activity currentActivity = ((ReactContext) context).getCurrentActivity();
        if (currentActivity == null || (window = currentActivity.getWindow()) == null) {
            return;
        }
        view.showKeyboard(window);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ChatInputRootView view, String commandId, ReadableArray readableArray) {
        C9612q.m13917h(view, "view");
        C9612q.m13917h(commandId, "commandId");
        switch (commandId.hashCode()) {
            case -1505238496:
                if (commandId.equals(COMMAND_SET_SELECTED_RANGE) && readableArray != null) {
                    setSelectedRange(view, readableArray.getInt(0), readableArray.getInt(1));
                    return;
                }
                return;
            case -1482107872:
                if (commandId.equals(COMMAND_OPEN_SYSTEM_KEYBOARD)) {
                    openSystemKeyboard(view);
                    return;
                }
                return;
            case 3027047:
                if (commandId.equals(COMMAND_BLUR)) {
                    blur(view);
                    return;
                }
                return;
            case 73995964:
                if (commandId.equals(COMMAND_UPDATE_TEXT_BLOCKS) && readableArray != null) {
                    String string = readableArray.getString(0);
                    C9612q.m13918g(string, "args.getString(0)");
                    updateTextBlocks(view, string, readableArray.getString(1));
                    return;
                }
                return;
            case 97604824:
                if (commandId.equals(COMMAND_FOCUS)) {
                    focus(view);
                    return;
                }
                return;
            case 448538345:
                if (commandId.equals(COMMAND_REPLACE_RANGE) && readableArray != null) {
                    int i = readableArray.getInt(0);
                    int i2 = readableArray.getInt(1);
                    String string2 = readableArray.getString(2);
                    C9612q.m13918g(string2, "args.getString(2)");
                    String string3 = readableArray.getString(3);
                    C9612q.m13918g(string3, "args.getString(3)");
                    replaceRange(view, i, i2, string2, string3, readableArray.getBoolean(4), readableArray.getString(5));
                    return;
                }
                return;
            case 1353507967:
                if (commandId.equals(COMMAND_BACKSPACE)) {
                    backspace(view);
                    return;
                }
                return;
            case 1520339810:
                if (commandId.equals(COMMAND_OPEN_CUSTOM_KEYBOARD)) {
                    openCustomKeyboard(view);
                    return;
                }
                return;
            case 1984984239:
                if (commandId.equals(COMMAND_SET_TEXT) && readableArray != null) {
                    setText(view, readableArray.getString(0));
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    public void replaceRange(ChatInputRootView view, int i, int i2, String text, String styleBlocks, boolean z, String str) {
        C9612q.m13917h(view, "view");
        C9612q.m13917h(text, "text");
        C9612q.m13917h(styleBlocks, "styleBlocks");
        view.replaceRange(i, i2, text, decodeStyleBlocks(styleBlocks), z, str);
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    @ReactProp(name = "editable")
    public void setEditable(ChatInputRootView view, boolean z) {
        C9612q.m13917h(view, "view");
        view.setEditTextEnabled(z);
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    @ReactProp(name = ReactTextInputShadowNode.PROP_PLACEHOLDER)
    public void setPlaceholder(ChatInputRootView view, String str) {
        C9612q.m13917h(view, "view");
        view.setHint(str);
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    @ReactProp(name = "placeholderColor")
    public void setPlaceholderColor(ChatInputRootView view, String str) {
        C9612q.m13917h(view, "view");
        view.setHintTextColor(Color.parseColor(str));
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    public void setSelectedRange(ChatInputRootView view, int i, int i2) {
        C9612q.m13917h(view, "view");
        view.setSelection(i, i2 + i);
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    @ReactProp(name = "shouldShowCursor")
    public void setShouldShowCursor(ChatInputRootView view, boolean z) {
        C9612q.m13917h(view, "view");
        view.setCursorVisible(z);
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    public void setText(ChatInputRootView view, String str) {
        C9612q.m13917h(view, "view");
        if (str != null) {
            view.setText(str);
            ChatInputRootView.setSelection$default(view, str.length(), 0, 2, null);
        }
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    @ReactProp(name = "textColor")
    public void setTextColor(ChatInputRootView view, String str) {
        C9612q.m13917h(view, "view");
        view.setTextColor(Color.parseColor(str));
    }

    @Override // com.facebook.react.viewmanagers.DCDChatInputManagerInterface
    public void updateTextBlocks(ChatInputRootView view, String blocks, String str) {
        C9612q.m13917h(view, "view");
        C9612q.m13917h(blocks, "blocks");
        if (str == null) {
            str = "";
        }
        view.clearAndApplyChatNodes(str, decodeStyleBlocks(blocks));
    }
}