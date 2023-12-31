package com.discord.chat.presentation.root;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.discord.chat.ChatModule;
import com.discord.chat.listmanager.ChatListUpdate;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.ChatListView;
import com.discord.misc.utilities.threading.ThreadUtilsKt;
import com.discord.recycler_view.scroller.Scroller;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u000eH\u0003J(\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0007J\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\nH\u0007J\u0010\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m14357d2 = {"Lcom/discord/chat/presentation/root/ChatView;", "Lcom/facebook/react/views/view/ReactViewGroup;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "chatList", "Lcom/discord/chat/presentation/list/ChatListView;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "inverted", "", "addView", "", "child", "Landroid/view/View;", "index", "", "params", "Landroid/view/ViewGroup$LayoutParams;", "attachPortalViewToChatList", "portalView", "scrollTo", "targetScreenLocation", "Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment;", "animated", "isHighlight", "setAnimated", "setEventHandler", "setInverted", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChatView extends ReactViewGroup {
    public static final Companion Companion = new Companion(null);
    private static final int INDEX_CHAT_LIST = 0;
    private static final int INDEX_PORTAL_VIEW = 2;
    private static boolean areChatAnimationsEnabled;
    private ChatListView chatList;
    private ChatEventHandler eventHandler;
    private boolean inverted;

    @Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, m14357d2 = {"Lcom/discord/chat/presentation/root/ChatView$Companion;", "", "()V", "INDEX_CHAT_LIST", "", "INDEX_PORTAL_VIEW", "areChatAnimationsEnabled", "", "getAreChatAnimationsEnabled", "()Z", "setAreChatAnimationsEnabled", "(Z)V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean getAreChatAnimationsEnabled() {
            return ChatView.areChatAnimationsEnabled;
        }

        public final void setAreChatAnimationsEnabled(boolean z) {
            ChatView.areChatAnimationsEnabled = z;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatView(Context context) {
        super(context);
        C9612q.m13917h(context, "context");
    }

    private final void attachPortalViewToChatList(final View view) {
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.discord.chat.presentation.root.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                ChatView.attachPortalViewToChatList$lambda$5(view, this, view2, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
        view.setVisibility(4);
    }

    public static final void attachPortalViewToChatList$lambda$5(View portalView, ChatView this$0, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        Pair<Integer, Integer> pair;
        C9612q.m13917h(portalView, "$portalView");
        C9612q.m13917h(this$0, "this$0");
        boolean z2 = true;
        if (portalView.getMeasuredHeight() > 0 && portalView.getMeasuredWidth() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ChatListView chatListView = this$0.chatList;
            ChatListView chatListView2 = null;
            if (chatListView == null) {
                C9612q.m13900y("chatList");
                chatListView = null;
            }
            if (!chatListView.isComputingLayout()) {
                if (portalView.getMeasuredWidth() == portalView.getLayoutParams().width && portalView.getMeasuredHeight() == portalView.getLayoutParams().height) {
                    z2 = false;
                }
                if (z2) {
                    pair = C11591x.m7577a(Integer.valueOf(portalView.getMeasuredWidth()), Integer.valueOf(portalView.getMeasuredHeight()));
                } else {
                    pair = null;
                }
                if (portalView.getParent() instanceof ChatView) {
                    ViewParent parent = portalView.getParent();
                    C9612q.m13919f(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) parent).removeView(portalView);
                }
                ChatListView chatListView3 = this$0.chatList;
                if (chatListView3 == null) {
                    C9612q.m13900y("chatList");
                } else {
                    chatListView2 = chatListView3;
                }
                chatListView2.setPortalView(portalView, pair);
            }
        }
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup
    public void addView(View child, int i, ViewGroup.LayoutParams layoutParams) {
        C9612q.m13917h(child, "child");
        super.addView(child, i, layoutParams);
        if (i != 0) {
            if (i == 2) {
                attachPortalViewToChatList(child);
            }
        } else if (child instanceof ChatListView) {
            ChatListView chatListView = (ChatListView) child;
            ChatEventHandler chatEventHandler = this.eventHandler;
            if (chatEventHandler == null) {
                C9612q.m13900y("eventHandler");
                chatEventHandler = null;
            }
            chatListView.setEventHandler(chatEventHandler);
            chatListView.setInverted(this.inverted);
            child.setPadding(0, -1, 0, 0);
            ChatListView chatListView2 = (ChatListView) child;
            chatListView2.setClipToPadding(true);
            Context context = getContext();
            C9612q.m13919f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            NativeModule nativeModule = ((ReactContext) context).getNativeModule(ChatModule.class);
            C9612q.m13920e(nativeModule);
            final ChatModule chatModule = (ChatModule) nativeModule;
            chatListView2.setDataSource(new ChatListView.DataSource() { // from class: com.discord.chat.presentation.root.ChatView$addView$2
                @Override // com.discord.chat.presentation.list.ChatListView.DataSource
                public Flow<ChatListUpdate> getUpdatesFlow() {
                    return ChatModule.this.getChatListManager(this.getId()).observeUpdates();
                }
            });
            this.chatList = chatListView2;
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final void scrollTo(int i, Scroller.TargetAlignment targetScreenLocation, boolean z, boolean z2) {
        C9612q.m13917h(targetScreenLocation, "targetScreenLocation");
        if (ThreadUtilsKt.isOnMainThread()) {
            ChatListView chatListView = this.chatList;
            if (chatListView == null) {
                C9612q.m13900y("chatList");
                chatListView = null;
            }
            chatListView.scrollToPosition(i, targetScreenLocation, z, z2);
            return;
        }
        Thread currentThread = Thread.currentThread();
        throw new IllegalStateException(("Expected to be on android main thread. Current: " + currentThread).toString());
    }

    public final void setAnimated(boolean z) {
        if (ThreadUtilsKt.isOnMainThread()) {
            areChatAnimationsEnabled = z;
            return;
        }
        Thread currentThread = Thread.currentThread();
        throw new IllegalStateException(("Expected to be on android main thread. Current: " + currentThread).toString());
    }

    public final void setEventHandler(ChatEventHandler eventHandler) {
        C9612q.m13917h(eventHandler, "eventHandler");
        if (ThreadUtilsKt.isOnMainThread()) {
            this.eventHandler = eventHandler;
            return;
        }
        Thread currentThread = Thread.currentThread();
        throw new IllegalStateException(("Expected to be on android main thread. Current: " + currentThread).toString());
    }

    public final void setInverted(boolean z) {
        if (ThreadUtilsKt.isOnMainThread()) {
            this.inverted = z;
            return;
        }
        Thread currentThread = Thread.currentThread();
        throw new IllegalStateException(("Expected to be on android main thread. Current: " + currentThread).toString());
    }
}