package com.discord.chat;

import com.discord.chat.listmanager.ChatListManager;
import com.discord.chatreplay.logger.ReleaseRowLogger;
import com.discord.chatreplay.logger.RowLogger;
import com.discord.tti_manager.TTIMetrics;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.C9673a2;
import kotlinx.coroutines.C9810j;
import kotlinx.coroutines.C9824m0;
import kotlinx.coroutines.C9840p1;
import kotlinx.coroutines.C9897t2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.InterfaceC9919z;
import kotlinx.serialization.json.C9976l;
import kotlinx.serialization.json.Json;

@ReactModule(name = "DCDChatManager")
@Metadata(m14358d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b&\u0010'J>\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0007H\u0016J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J \u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, m14357d2 = {"Lcom/discord/chat/ChatModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "", "tag", "Lkotlin/Function2;", "Lcom/discord/chat/listmanager/ChatListManager;", "Lkotlin/coroutines/Continuation;", "", "", "block", "withChatManager", "(ILkotlin/jvm/functions/Function2;)V", "Lcom/discord/chatreplay/logger/RowLogger;", "rowUpdateLoggerFor", "", "getName", "invalidate", "getChatListManager", "rowsJSON", "", "isLoadingAtTop", "updateRows", "clearRows", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/Json;", "Lkotlinx/coroutines/CoroutineScope;", "moduleScope", "Lkotlinx/coroutines/CoroutineScope;", "", "listManagers", "Ljava/util/Map;", "previousRowUpdateTag", "I", "rowUpdateLoggers", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChatModule extends ReactContextBaseJavaModule {
    private final Json json;
    private final Map<Integer, ChatListManager> listManagers;
    private final CoroutineScope moduleScope;
    private int previousRowUpdateTag;
    private final ReactApplicationContext reactContext;
    private final Map<Integer, RowLogger> rowUpdateLoggers;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.json = C9976l.m12702b(null, ChatModule$json$1.INSTANCE, 1, null);
        InterfaceC9919z m12990b = C9897t2.m12990b(null, 1, null);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        C9612q.m13918g(newSingleThreadExecutor, "newSingleThreadExecutor()");
        this.moduleScope = C9824m0.m13174a(m12990b.mo1459e0(C9840p1.m13116b(newSingleThreadExecutor)));
        this.listManagers = new LinkedHashMap();
        this.previousRowUpdateTag = -1;
        this.rowUpdateLoggers = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RowLogger rowUpdateLoggerFor(int i) {
        Map<Integer, RowLogger> map = this.rowUpdateLoggers;
        Integer valueOf = Integer.valueOf(i);
        RowLogger rowLogger = map.get(valueOf);
        if (rowLogger == null) {
            rowLogger = new ReleaseRowLogger();
            map.put(valueOf, rowLogger);
        }
        return rowLogger;
    }

    private final void withChatManager(int i, Function2<? super ChatListManager, ? super Continuation<? super Unit>, ? extends Object> function2) {
        C9810j.m13193d(this.moduleScope, null, null, new ChatModule$withChatManager$1(function2, getChatListManager(i), null), 3, null);
    }

    @ReactMethod
    public final void clearRows(int i) {
        withChatManager(i, new ChatModule$clearRows$1(this, i, null));
    }

    public final synchronized ChatListManager getChatListManager(int i) {
        ChatListManager chatListManager;
        Map<Integer, ChatListManager> map = this.listManagers;
        Integer valueOf = Integer.valueOf(i);
        chatListManager = map.get(valueOf);
        if (chatListManager == null) {
            chatListManager = new ChatListManager(this.moduleScope);
            map.put(valueOf, chatListManager);
        }
        return chatListManager;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DCDChatManager";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        super.invalidate();
        CoroutineContext coroutineContext = this.moduleScope.getCoroutineContext();
        String simpleName = ChatModule.class.getSimpleName();
        C9673a2.m13579e(coroutineContext, new CancellationException(simpleName + " invalidate()"));
    }

    @ReactMethod
    public final void updateRows(int i, String rowsJSON, boolean z) {
        C9612q.m13917h(rowsJSON, "rowsJSON");
        TTIMetrics.record$default(TTIMetrics.INSTANCE, "ChatModule.updateRows() Start", 0L, null, false, 14, null);
        withChatManager(i, new ChatModule$updateRows$1(this, i, rowsJSON, null));
    }
}
