package com.discord.chat.presentation.list;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.listmanager.ChatListAction;
import com.discord.chat.listmanager.ChatListUpdate;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.delegate.RegularMessageDelegate;
import com.discord.chat.presentation.list.delegate.SeparatorDelegate;
import com.discord.chat.presentation.list.delegate.SystemMessageDelegate;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.threading.ThreadUtilsKt;
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration;
import com.discord.recycler_view.scroller.Scroller;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.uimanager.ViewProps;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.C9818l;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import p304qf.C11889v;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001<B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\"H\u0007J\b\u0010$\u001a\u00020\"H\u0002J\b\u0010%\u001a\u00020\"H\u0002J\b\u0010&\u001a\u00020\"H\u0014J\u0010\u0010'\u001a\u00020\"2\u0006\u0010(\u001a\u00020)H\u0003J\b\u0010*\u001a\u00020\"H\u0014J\b\u0010+\u001a\u00020\"H\u0002J(\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00142\u0006\u00101\u001a\u00020\u0014H\u0007J\u000e\u00102\u001a\u00020\"2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u00103\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u00104\u001a\u00020\"2\u0006\u00105\u001a\u00020\u0014H\u0007J&\u00106\u001a\u00020\"2\u0006\u00107\u001a\u0002082\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010:H\u0007J\b\u0010;\u001a\u00020\"H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, m14357d2 = {"Lcom/discord/chat/presentation/list/ChatListView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "changeItemAnimators", "Landroidx/recyclerview/widget/DefaultItemAnimator;", "chatListAdapter", "Lcom/discord/chat/presentation/list/ChannelChatListAdapter;", "componentProvider", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "dataSource", "Lcom/discord/chat/presentation/list/ChatListView$DataSource;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "isFirstLayout", "", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "scrollStateObserver", "Lcom/discord/chat/presentation/list/ChatScrollStateObserver;", "scroller", "Lcom/discord/recycler_view/scroller/Scroller;", "swipeHelper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "updateSubscriptionJob", "Lkotlinx/coroutines/Job;", "verticalSpacingItemDecoration", "Lcom/discord/recycler_view/decorations/VerticalSpacingItemDecoration;", "addScrollStateListener", "", "cleanup", "configureRecycledViewPoolSizes", "measureAndLayout", "onAttachedToWindow", "onChatListUpdate", "update", "Lcom/discord/chat/listmanager/ChatListUpdate;", "onDetachedFromWindow", "removeScrollStateListener", "scrollToPosition", ViewProps.POSITION, "targetAlignment", "Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment;", "animated", "isHighlight", "setDataSource", "setEventHandler", "setInverted", "inverted", "setPortalView", "portalView", "Landroid/view/View;", "measuredDimensions", "Lkotlin/Pair;", BaseJavaModule.METHOD_TYPE_SYNC, "DataSource", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChatListView extends RecyclerView {
    private final DefaultItemAnimator changeItemAnimators;
    private final ChannelChatListAdapter chatListAdapter;
    private final ComponentProvider componentProvider;
    private DataSource dataSource;
    private ChatEventHandler eventHandler;
    private boolean isFirstLayout;
    private final LinearLayoutManager linearLayoutManager;
    private final ChatScrollStateObserver scrollStateObserver;
    private final Scroller scroller;
    private ItemTouchHelper swipeHelper;
    private Job updateSubscriptionJob;
    private final VerticalSpacingItemDecoration verticalSpacingItemDecoration;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m14357d2 = {"Lcom/discord/chat/presentation/list/ChatListView$DataSource;", "", "updatesFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/discord/chat/listmanager/ChatListUpdate;", "getUpdatesFlow", "()Lkotlinx/coroutines/flow/Flow;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public interface DataSource {
        Flow<ChatListUpdate> getUpdatesFlow();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatListView(Context context) {
        this(context, null, 0, 6, null);
        C9612q.m13917h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ ChatListView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void addScrollStateListener() {
        addOnScrollListener(this.scrollStateObserver);
    }

    private final void configureRecycledViewPoolSizes() {
        Map m6751k;
        m6751k = C11889v.m6751k(C11591x.m7577a(RegularMessageDelegate.class, 50), C11591x.m7577a(SystemMessageDelegate.class, 25), C11591x.m7577a(SeparatorDelegate.class, 25));
        for (Map.Entry entry : m6751k.entrySet()) {
            int intValue = ((Number) entry.getValue()).intValue();
            Integer num = this.chatListAdapter.getDelegateViewTypes().get((Class) entry.getKey());
            C9612q.m13920e(num);
            getRecycledViewPool().m35666k(num.intValue(), intValue);
        }
    }

    public final void measureAndLayout() {
        C9612q.m13919f(this, "null cannot be cast to non-null type android.view.View");
        ViewMeasureExtensionsKt.measureAndLayout(this);
    }

    public final void onChatListUpdate(ChatListUpdate chatListUpdate) {
        if (ThreadUtilsKt.isOnMainThread()) {
            if (chatListUpdate.getAction() instanceof ChatListAction.Clear) {
                this.isFirstLayout = true;
            }
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            this.chatListAdapter.setItems(chatListUpdate.getItems(), chatListUpdate.getListOperations(), new ChatListView$onChatListUpdate$1$1(ref$BooleanRef, this, chatListUpdate), new ChatListView$onChatListUpdate$1$2(chatListUpdate, this, ref$BooleanRef));
            return;
        }
        Thread currentThread = Thread.currentThread();
        throw new IllegalStateException(("Expected to be on android main thread. Current: " + currentThread).toString());
    }

    private final void removeScrollStateListener() {
        removeOnScrollListener(this.scrollStateObserver);
    }

    private final void sync() {
        Job m13179d;
        Job job = this.updateSubscriptionJob;
        if (job != null) {
            Job.C9668a.m13594a(job, null, 1, null);
        }
        m13179d = C9818l.m13179d(CoroutineViewUtilsKt.attachedScope(this, true), null, null, new ChatListView$sync$1(this, null), 3, null);
        this.updateSubscriptionJob = m13179d;
    }

    public final void cleanup() {
        removeScrollStateListener();
        stopScroll();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        sync();
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.discord.chat.presentation.list.ChatListView$onAttachedToWindow$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                ChatEventHandler chatEventHandler;
                C9612q.m13917h(view, "view");
                view.removeOnLayoutChangeListener(this);
                chatEventHandler = ChatListView.this.eventHandler;
                if (chatEventHandler == null) {
                    C9612q.m13900y("eventHandler");
                    chatEventHandler = null;
                }
                chatEventHandler.onCompleteFirstLayout();
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.chatListAdapter.onHostDetached();
    }

    public final void scrollToPosition(int i, Scroller.TargetAlignment targetAlignment, boolean z, boolean z2) {
        C9612q.m13917h(targetAlignment, "targetAlignment");
        this.scroller.scrollToPosition(i, targetAlignment, z, new ChatListView$scrollToPosition$1(this), new ChatListView$scrollToPosition$2(this, z, z2, i), new ChatListView$scrollToPosition$3(this));
    }

    public final void setDataSource(DataSource dataSource) {
        C9612q.m13917h(dataSource, "dataSource");
        this.dataSource = dataSource;
    }

    public final void setEventHandler(ChatEventHandler eventHandler) {
        C9612q.m13917h(eventHandler, "eventHandler");
        this.eventHandler = eventHandler;
    }

    public final void setInverted(boolean z) {
        this.verticalSpacingItemDecoration.setRecyclerLayoutReversed(z);
        this.linearLayoutManager.m35843M2(z);
    }

    public final void setPortalView(View portalView, Pair<Integer, Integer> pair) {
        C9612q.m13917h(portalView, "portalView");
        this.chatListAdapter.setPortalView(portalView, pair);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9612q.m13917h(context, "context");
        RecyclerView.ItemAnimator itemAnimator = getItemAnimator();
        DefaultItemAnimator defaultItemAnimator = null;
        if (itemAnimator != null) {
            defaultItemAnimator = (DefaultItemAnimator) (itemAnimator instanceof DefaultItemAnimator ? itemAnimator : null);
        }
        C9612q.m13920e(defaultItemAnimator);
        this.changeItemAnimators = defaultItemAnimator;
        ChannelChatListAdapter channelChatListAdapter = new ChannelChatListAdapter(new ChatListView$chatListAdapter$1(this), new ChatListView$chatListAdapter$2(this), new ChatListView$chatListAdapter$3(this), new ChatListView$chatListAdapter$4(this), new ChatListView$chatListAdapter$5(this));
        this.chatListAdapter = channelChatListAdapter;
        this.componentProvider = new ComponentProvider(context);
        this.scroller = new Scroller(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        this.linearLayoutManager = linearLayoutManager;
        VerticalSpacingItemDecoration verticalSpacingItemDecoration = new VerticalSpacingItemDecoration(SizeUtilsKt.getDpToPx(16), SizeUtilsKt.getDpToPx(16), SizeUtilsKt.getDpToPx(30), false, 8, null);
        this.verticalSpacingItemDecoration = verticalSpacingItemDecoration;
        this.scrollStateObserver = new ChatScrollStateObserver(new ChatListView$scrollStateObserver$1(this));
        this.isFirstLayout = true;
        ChatListUtilsKt.configureMessageRecyclerView(this, context, verticalSpacingItemDecoration);
        setLayoutManager(linearLayoutManager);
        setAdapter(channelChatListAdapter);
        addScrollStateListener();
        configureRecycledViewPoolSizes();
        setItemAnimator(defaultItemAnimator);
        new ChatListItemTouchHelper(new SwipeHelper(context, new ChatListView$swipeHelper$1(this), new ChatListView$swipeHelper$2(this))).attachToRecyclerView(this);
    }
}