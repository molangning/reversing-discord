package com.discord.chat.presentation.list;

import android.annotation.SuppressLint;
import android.view.View;
import com.discord.chat.listmanager.ListOperation;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.list.item.MessageItem;
import com.discord.chat.presentation.list.item.PortalViewChatListItem;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.discord.chat.presentation.root.ChatView;
import com.discord.misc.utilities.threading.ThreadUtilsKt;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C9545j;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.C9818l;
import kotlinx.coroutines.C9824m0;
import kotlinx.coroutines.Job;
import pf.C11581q;

@Metadata(m14358d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00016BS\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\t\u0012\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u000b0\u0003j\u0002`\f¢\u0006\u0002\u0010\rJ\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001bH\u0003J\u0006\u0010\u001e\u001a\u00020\u0011J\b\u0010\u001f\u001a\u00020\u0004H\u0007J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020!H\u0003J\b\u0010\"\u001a\u00020\u0004H\u0003J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001bH\u0003J\u0016\u0010&\u001a\u00020\u00042\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0017JB\u0010&\u001a\u00020\u00042\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010(2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007J*\u0010.\u001a\u00020\u00042\b\u0010/\u001a\u0004\u0018\u0001002\u0016\b\u0002\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u000102H\u0007J\u0016\u00103\u001a\u00020\u00132\f\u00104\u001a\b\u0012\u0004\u0012\u00020+0(H\u0002J\b\u00105\u001a\u00020\u0004H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, m14357d2 = {"Lcom/discord/chat/presentation/list/ChannelChatListAdapter;", "Lcom/discord/chat/presentation/list/BaseChatListAdapter;", "doLayout", "Lkotlin/Function0;", "", "enableAnimations", "disableAnimations", "eventHandlerProvider", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "Lcom/discord/chat/presentation/list/delegate/EventHandlerProvider;", "messageComponentProvider", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "Lcom/discord/chat/presentation/list/delegate/MessageComponentProvider;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getDoLayout", "()Lkotlin/jvm/functions/Function0;", "firstMessageItemPosition", "", "isProcessingUpdate", "", "portalChatListItem", "Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;", "processNextUpdateJob", "Lkotlinx/coroutines/Job;", "updateCount", "updateQueue", "Ljava/util/Queue;", "Lcom/discord/chat/presentation/list/ChannelChatListAdapterUpdate;", "enqueueUpdate", "update", "getFirstMessageItemPosition", "onHostDetached", "processChatListItemUpdate", "Lcom/discord/chat/presentation/list/ChatListItemUpdate;", "processNextUpdate", "processPortalViewUpdate", "Lcom/discord/chat/presentation/list/PortalViewUpdate;", "processUpdate", "setItems", "items", "", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "listOperations", "Lcom/discord/chat/listmanager/ListOperation;", "preCommit", "postCommit", "setPortalView", "portalView", "Landroid/view/View;", "measuredDimensions", "Lkotlin/Pair;", "shouldAnimateOperations", "operations", "syncFirstMessageItemPosition", "PortalViewUpdateType", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChannelChatListAdapter extends BaseChatListAdapter {
    private final Function0<Unit> disableAnimations;
    private final Function0<Unit> doLayout;
    private final Function0<Unit> enableAnimations;
    private int firstMessageItemPosition;
    private boolean isProcessingUpdate;
    private PortalViewChatListItem portalChatListItem;
    private Job processNextUpdateJob;
    private int updateCount;
    private final Queue<ChannelChatListAdapterUpdate> updateQueue;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/presentation/list/ChannelChatListAdapter$PortalViewUpdateType;", "", "(Ljava/lang/String;I)V", "ADD", "CHANGE", "REMOVE", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public enum PortalViewUpdateType {
        ADD,
        CHANGE,
        REMOVE
    }

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PortalViewUpdateType.values().length];
            try {
                iArr[PortalViewUpdateType.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PortalViewUpdateType.REMOVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PortalViewUpdateType.CHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelChatListAdapter(Function0<Unit> doLayout, Function0<Unit> enableAnimations, Function0<Unit> disableAnimations, Function0<? extends ChatEventHandler> eventHandlerProvider, Function0<ComponentProvider> messageComponentProvider) {
        super(eventHandlerProvider, messageComponentProvider);
        C9612q.m13917h(doLayout, "doLayout");
        C9612q.m13917h(enableAnimations, "enableAnimations");
        C9612q.m13917h(disableAnimations, "disableAnimations");
        C9612q.m13917h(eventHandlerProvider, "eventHandlerProvider");
        C9612q.m13917h(messageComponentProvider, "messageComponentProvider");
        this.doLayout = doLayout;
        this.enableAnimations = enableAnimations;
        this.disableAnimations = disableAnimations;
        this.firstMessageItemPosition = -1;
        this.updateQueue = new LinkedList();
    }

    private final void enqueueUpdate(ChannelChatListAdapterUpdate channelChatListAdapterUpdate) {
        if (ThreadUtilsKt.isOnMainThread()) {
            this.updateQueue.add(channelChatListAdapterUpdate);
            if (this.updateQueue.size() == 1 && !this.isProcessingUpdate) {
                processNextUpdate();
                return;
            }
            return;
        }
        Thread currentThread = Thread.currentThread();
        throw new IllegalStateException(("Expected to be on android main thread. Current: " + currentThread).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    @android.annotation.SuppressLint({"NotifyDataSetChanged"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void processChatListItemUpdate(com.discord.chat.presentation.list.ChatListItemUpdate r7) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.list.ChannelChatListAdapter.processChatListItemUpdate(com.discord.chat.presentation.list.ChatListItemUpdate):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processNextUpdate() {
        if (ThreadUtilsKt.isOnMainThread()) {
            if (!this.updateQueue.isEmpty()) {
                Object remove = this.updateQueue.remove();
                C9612q.m13918g(remove, "updateQueue.remove()");
                processUpdate((ChannelChatListAdapterUpdate) remove);
                return;
            }
            return;
        }
        Thread currentThread = Thread.currentThread();
        throw new IllegalStateException(("Expected to be on android main thread. Current: " + currentThread).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processPortalViewUpdate(PortalViewUpdate portalViewUpdate) {
        Object m14042h0;
        boolean z;
        PortalViewUpdateType portalViewUpdateType;
        List<? extends ChatListItem> m14035o0;
        int m14102k;
        int m14102k2;
        int m14102k3;
        int m14102k4;
        this.disableAnimations.invoke();
        m14042h0 = C9553r.m14042h0(getChatListItems$chat_release());
        boolean z2 = m14042h0 instanceof PortalViewChatListItem;
        if (portalViewUpdate.getPortalChatListItem() != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && !z2) {
            portalViewUpdateType = PortalViewUpdateType.ADD;
        } else if (z && z2) {
            portalViewUpdateType = PortalViewUpdateType.CHANGE;
        } else if (!z && z2) {
            portalViewUpdateType = PortalViewUpdateType.REMOVE;
        } else {
            return;
        }
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[portalViewUpdateType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    m14035o0 = C9553r.m14073E0(getChatListItems$chat_release());
                    m14102k4 = C9545j.m14102k(getChatListItems$chat_release());
                    PortalViewChatListItem portalChatListItem = portalViewUpdate.getPortalChatListItem();
                    C9612q.m13920e(portalChatListItem);
                    m14035o0.set(m14102k4, portalChatListItem);
                } else {
                    throw new C11581q();
                }
            } else {
                m14035o0 = C9553r.m14061O(getChatListItems$chat_release(), 1);
            }
        } else {
            List<ChatListItem> chatListItems$chat_release = getChatListItems$chat_release();
            PortalViewChatListItem portalChatListItem2 = portalViewUpdate.getPortalChatListItem();
            C9612q.m13920e(portalChatListItem2);
            m14035o0 = C9553r.m14035o0(chatListItems$chat_release, portalChatListItem2);
        }
        setChatListItems$chat_release(m14035o0);
        super.setItems((ChannelChatListAdapter) getChatListItems$chat_release());
        int i2 = iArr[portalViewUpdateType.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    m14102k3 = C9545j.m14102k(getChatListItems$chat_release());
                    notifyItemChanged(m14102k3);
                    return;
                }
                return;
            }
            m14102k2 = C9545j.m14102k(getChatListItems$chat_release());
            notifyItemRemoved(m14102k2 + 1);
            return;
        }
        m14102k = C9545j.m14102k(getChatListItems$chat_release());
        notifyItemInserted(m14102k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NotifyDataSetChanged"})
    public final void processUpdate(ChannelChatListAdapterUpdate channelChatListAdapterUpdate) {
        Job m13179d;
        if (ThreadUtilsKt.isOnMainThread()) {
            this.isProcessingUpdate = true;
            channelChatListAdapterUpdate.getPreCommit().invoke();
            if (channelChatListAdapterUpdate instanceof PortalViewUpdate) {
                processPortalViewUpdate((PortalViewUpdate) channelChatListAdapterUpdate);
            } else if (channelChatListAdapterUpdate instanceof ChatListItemUpdate) {
                processChatListItemUpdate((ChatListItemUpdate) channelChatListAdapterUpdate);
            }
            ChatView.Companion companion = ChatView.Companion;
            if (companion.getAreChatAnimationsEnabled()) {
                channelChatListAdapterUpdate.getPostCommit().invoke();
            }
            getDoLayout().invoke();
            syncFirstMessageItemPosition();
            if (!companion.getAreChatAnimationsEnabled()) {
                channelChatListAdapterUpdate.getPostCommit().invoke();
            }
            m13179d = C9818l.m13179d(C9824m0.m13173b(), null, null, new ChannelChatListAdapter$processUpdate$1$1(this, null), 3, null);
            this.processNextUpdateJob = m13179d;
            return;
        }
        Thread currentThread = Thread.currentThread();
        throw new IllegalStateException(("Expected to be on android main thread. Current: " + currentThread).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setPortalView$default(ChannelChatListAdapter channelChatListAdapter, View view, Pair pair, int i, Object obj) {
        if ((i & 2) != 0) {
            pair = null;
        }
        channelChatListAdapter.setPortalView(view, pair);
    }

    private final boolean shouldAnimateOperations(List<? extends ListOperation> list) {
        boolean z;
        Object m14056T;
        if (list.size() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m14056T = C9553r.m14056T(list);
            ListOperation listOperation = (ListOperation) m14056T;
            if (listOperation instanceof ListOperation.Change) {
                return false;
            }
            if ((listOperation instanceof ListOperation.ChangeRange) && ((ListOperation.ChangeRange) listOperation).getCount() <= 2) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncFirstMessageItemPosition() {
        int i;
        int i2;
        List<ChatListItem> chatListItems$chat_release = getChatListItems$chat_release();
        ListIterator<ChatListItem> listIterator = chatListItems$chat_release.listIterator(chatListItems$chat_release.size());
        while (true) {
            i = -1;
            if (listIterator.hasPrevious()) {
                if (listIterator.previous() instanceof MessageItem) {
                    i2 = listIterator.nextIndex();
                    break;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 != -1) {
            i = i2;
        }
        this.firstMessageItemPosition = i;
    }

    public final Function0<Unit> getDoLayout() {
        return this.doLayout;
    }

    public final int getFirstMessageItemPosition() {
        return this.firstMessageItemPosition;
    }

    public final void onHostDetached() {
        if (ThreadUtilsKt.isOnMainThread()) {
            Job job = this.processNextUpdateJob;
            if (job != null) {
                Job.C9668a.m13594a(job, null, 1, null);
            }
            this.processNextUpdateJob = null;
            this.isProcessingUpdate = false;
            return;
        }
        Thread currentThread = Thread.currentThread();
        throw new IllegalStateException(("Expected to be on android main thread. Current: " + currentThread).toString());
    }

    public final void setPortalView(View view, Pair<Integer, Integer> pair) {
        PortalViewChatListItem portalViewChatListItem;
        if (view != null) {
            String uuid = UUID.randomUUID().toString();
            C9612q.m13918g(uuid, "randomUUID().toString()");
            portalViewChatListItem = new PortalViewChatListItem(uuid, view, pair);
        } else {
            portalViewChatListItem = null;
        }
        this.portalChatListItem = portalViewChatListItem;
        int i = this.updateCount + 1;
        this.updateCount = i;
        enqueueUpdate(new PortalViewUpdate(portalViewChatListItem, i));
    }

    @Override // com.hannesdorfmann.adapterdelegates4.AbstractC5131a
    public void setItems(List<? extends ChatListItem> items) {
        C9612q.m13917h(items, "items");
        setItems(items, null, ChannelChatListAdapter$setItems$1.INSTANCE, ChannelChatListAdapter$setItems$2.INSTANCE);
    }

    public final void setItems(List<? extends ChatListItem> items, List<? extends ListOperation> list, Function0<Unit> preCommit, Function0<Unit> postCommit) {
        C9612q.m13917h(items, "items");
        C9612q.m13917h(preCommit, "preCommit");
        C9612q.m13917h(postCommit, "postCommit");
        int i = this.updateCount + 1;
        this.updateCount = i;
        enqueueUpdate(new ChatListItemUpdate(items, list, i, preCommit, postCommit));
    }
}
