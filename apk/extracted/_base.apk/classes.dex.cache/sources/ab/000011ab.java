package com.discord.chat.listmanager;

import com.discord.chat.bridge.ChangeType;
import com.discord.chat.bridge.row.BlockedGroupContent;
import com.discord.chat.bridge.row.BlockedGroupRow;
import com.discord.chat.bridge.row.DeleteRow;
import com.discord.chat.bridge.row.EmbeddedActivityRow;
import com.discord.chat.bridge.row.LoadingActionType;
import com.discord.chat.bridge.row.LoadingRow;
import com.discord.chat.bridge.row.MessageRow;
import com.discord.chat.bridge.row.MessageRowKt;
import com.discord.chat.bridge.row.Row;
import com.discord.chat.bridge.row.SeparatorRow;
import com.discord.chat.bridge.row.SeparatorRowKt;
import com.discord.chat.bridge.row.UploadProgressRow;
import com.discord.chat.bridge.spoiler.SpoilerManager;
import com.discord.chat.listmanager.ChatListAction;
import com.discord.chat.listmanager.ListOperation;
import com.discord.chat.presentation.list.item.BlockedGroupChatListItem;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.chat.presentation.list.item.DeserializationErrorChatListItem;
import com.discord.chat.presentation.list.item.EmbeddedActivityChatListItem;
import com.discord.chat.presentation.list.item.LoadingChatListItem;
import com.discord.chat.presentation.list.item.MessageItem;
import com.discord.chat.presentation.root.MessageContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.collections.C9551p;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.C9677b1;
import kotlinx.coroutines.C9818l;
import kotlinx.coroutines.C9824m0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C9731m;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import p409wi.EnumC13603e;

@Metadata(m14358d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001$B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0002J\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J\u0016\u0010\u001a\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0002J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u001cJ\u0010\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\rH\u0002J\u0014\u0010\u001f\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0013J\u001a\u0010 \u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010!\u001a\u00020\nH\u0002J\f\u0010\"\u001a\u00020#*\u00020\nH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m14357d2 = {"Lcom/discord/chat/listmanager/ChatListManager;", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "isDisabled", "", "publishScope", "rows", "", "Lcom/discord/chat/bridge/row/Row;", "updatesFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/discord/chat/listmanager/ChatListUpdate;", "clearRows", "", "createNewRows", "Lcom/discord/chat/listmanager/ChatListManager$RowsModificationResult;", "updates", "", "getRowCount", "", "handleError", "errorJson", "", "causeMessage", "modifyExistingRows", "observeUpdates", "Lkotlinx/coroutines/flow/Flow;", "publishUpdate", "update", "updateRows", "insert", "row", "toChatListItem", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "RowsModificationResult", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChatListManager {
    private boolean isDisabled;
    private final CoroutineScope publishScope;
    private List<Row> rows;
    private final MutableSharedFlow<ChatListUpdate> updatesFlow;

    @Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, m14357d2 = {"Lcom/discord/chat/listmanager/ChatListManager$RowsModificationResult;", "", "rows", "", "Lcom/discord/chat/bridge/row/Row;", "didInsertAtBottom", "", "listOperations", "Lcom/discord/chat/listmanager/ListOperation;", "(Ljava/util/List;ZLjava/util/List;)V", "getDidInsertAtBottom", "()Z", "getListOperations", "()Ljava/util/List;", "getRows", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class RowsModificationResult {
        private final boolean didInsertAtBottom;
        private final List<ListOperation> listOperations;
        private final List<Row> rows;

        /* JADX WARN: Multi-variable type inference failed */
        public RowsModificationResult(List<? extends Row> rows, boolean z, List<? extends ListOperation> list) {
            C9612q.m13917h(rows, "rows");
            this.rows = rows;
            this.didInsertAtBottom = z;
            this.listOperations = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RowsModificationResult copy$default(RowsModificationResult rowsModificationResult, List list, boolean z, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = rowsModificationResult.rows;
            }
            if ((i & 2) != 0) {
                z = rowsModificationResult.didInsertAtBottom;
            }
            if ((i & 4) != 0) {
                list2 = rowsModificationResult.listOperations;
            }
            return rowsModificationResult.copy(list, z, list2);
        }

        public final List<Row> component1() {
            return this.rows;
        }

        public final boolean component2() {
            return this.didInsertAtBottom;
        }

        public final List<ListOperation> component3() {
            return this.listOperations;
        }

        public final RowsModificationResult copy(List<? extends Row> rows, boolean z, List<? extends ListOperation> list) {
            C9612q.m13917h(rows, "rows");
            return new RowsModificationResult(rows, z, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RowsModificationResult) {
                RowsModificationResult rowsModificationResult = (RowsModificationResult) obj;
                return C9612q.m13922c(this.rows, rowsModificationResult.rows) && this.didInsertAtBottom == rowsModificationResult.didInsertAtBottom && C9612q.m13922c(this.listOperations, rowsModificationResult.listOperations);
            }
            return false;
        }

        public final boolean getDidInsertAtBottom() {
            return this.didInsertAtBottom;
        }

        public final List<ListOperation> getListOperations() {
            return this.listOperations;
        }

        public final List<Row> getRows() {
            return this.rows;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.rows.hashCode() * 31;
            boolean z = this.didInsertAtBottom;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (hashCode + i) * 31;
            List<ListOperation> list = this.listOperations;
            return i2 + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            List<Row> list = this.rows;
            boolean z = this.didInsertAtBottom;
            List<ListOperation> list2 = this.listOperations;
            return "RowsModificationResult(rows=" + list + ", didInsertAtBottom=" + z + ", listOperations=" + list2 + ")";
        }
    }

    public ChatListManager(CoroutineScope coroutineScope) {
        C9612q.m13917h(coroutineScope, "coroutineScope");
        this.updatesFlow = C9731m.m13407a(1, 3, EnumC13603e.SUSPEND);
        this.publishScope = C9824m0.m13166i(coroutineScope, C9677b1.m13570a());
    }

    private final RowsModificationResult createNewRows(List<? extends Row> list) {
        boolean z;
        List<Row> m14073E0;
        boolean z2 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((Row) it.next()).getChangeType() == ChangeType.DELETE) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    z2 = true;
                    break;
                }
            }
        }
        if (!z2) {
            m14073E0 = C9553r.m14073E0(list);
            this.rows = m14073E0;
            return new RowsModificationResult(list, true, null);
        }
        throw new IllegalArgumentException("Deletes are not expected or allowed during syncs.".toString());
    }

    private final void insert(List<Row> list, Row row) {
        if (!(row instanceof DeleteRow)) {
            list.add(row.getIndex(), row);
            return;
        }
        throw new IllegalStateException("Unexpected delete during insert.".toString());
    }

    private final RowsModificationResult modifyExistingRows(List<? extends Row> list) {
        boolean z;
        List<Row> m14081F;
        boolean z2;
        Object m14056T;
        boolean z3;
        boolean z4;
        boolean z5;
        List<Row> list2 = this.rows;
        C9612q.m13920e(list2);
        ListOperationsBuilder listOperationsBuilder = new ListOperationsBuilder();
        ArrayList<Row> arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z6 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((Row) next).getChangeType() != ChangeType.INSERT) {
                z6 = false;
            }
            if (z6) {
                arrayList.add(next);
            }
        }
        loop1: while (true) {
            z = false;
            for (Row row : arrayList) {
                insert(list2, row);
                listOperationsBuilder.add(new ListOperation.Insert(row.getIndex()));
                if (z || row.getIndex() == 0) {
                    z = true;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            Row row2 = (Row) obj;
            if (row2.getChangeType() != ChangeType.DELETE && row2.getChangeType() != ChangeType.UPDATE) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (z5) {
                arrayList2.add(obj);
            }
        }
        m14081F = C9551p.m14081F(arrayList2);
        for (Row row3 : m14081F) {
            if (row3 instanceof DeleteRow) {
                list2.remove(row3.getIndex());
                listOperationsBuilder.add(new ListOperation.Remove(row3.getIndex()));
            } else {
                if ((row3 instanceof LoadingRow) && ((LoadingRow) row3).getButton().getAction().getType() == LoadingActionType.LOAD_MORE_AFTER && row3.getIndex() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                m14056T = C9553r.m14056T(list2);
                Row row4 = (Row) m14056T;
                if ((row4 instanceof LoadingRow) && ((LoadingRow) row4).isLoading()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2 && z3) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    list2.add(1, row3);
                    list2.remove(0);
                    listOperationsBuilder.add(new ListOperation.Insert(1));
                    listOperationsBuilder.add(new ListOperation.Remove(0));
                } else {
                    list2.set(row3.getIndex(), row3);
                    listOperationsBuilder.add(new ListOperation.Change(row3.getIndex()));
                }
            }
        }
        return new RowsModificationResult(list2, z, listOperationsBuilder.build());
    }

    private final void publishUpdate(ChatListUpdate chatListUpdate) {
        C9818l.m13179d(this.publishScope, null, null, new ChatListManager$publishUpdate$1(this, chatListUpdate, null), 3, null);
    }

    private final ChatListItem toChatListItem(Row row) {
        int m14093t;
        List m14081F;
        ChatListItem chatListMessageItem;
        ChatListItem loadingChatListItem;
        if (row instanceof MessageRow) {
            return MessageRowKt.toChatListMessageItem((MessageRow) row);
        }
        if (row instanceof UploadProgressRow) {
            loadingChatListItem = new MessageItem(((UploadProgressRow) row).getMessage(), null, null, false, false, null, null, false, 254, null);
        } else if (row instanceof EmbeddedActivityRow) {
            EmbeddedActivityRow embeddedActivityRow = (EmbeddedActivityRow) row;
            loadingChatListItem = new EmbeddedActivityChatListItem(embeddedActivityRow.getContent(), embeddedActivityRow.getAvatarUrls(), embeddedActivityRow.getButtonText(), embeddedActivityRow.getEmbeddedActivityKey(), embeddedActivityRow.getDismissButtonAccessibilityLabel());
        } else if (row instanceof LoadingRow) {
            LoadingRow loadingRow = (LoadingRow) row;
            loadingChatListItem = new LoadingChatListItem(loadingRow.getButton(), loadingRow.isLoading());
        } else if (row instanceof SeparatorRow) {
            return SeparatorRowKt.toSeparatorChatListItem((SeparatorRow) row);
        } else {
            if (row instanceof BlockedGroupRow) {
                BlockedGroupRow blockedGroupRow = (BlockedGroupRow) row;
                String text = blockedGroupRow.getText();
                String context = blockedGroupRow.getButton().getAction().getContext();
                int color = blockedGroupRow.getColor();
                int backgroundColor = blockedGroupRow.getBackgroundColor();
                int borderColor = blockedGroupRow.getBorderColor();
                boolean revealed = blockedGroupRow.getRevealed();
                List<BlockedGroupContent> content = blockedGroupRow.getContent();
                if (content == null) {
                    content = C9545j.m14104i();
                }
                m14093t = C9546k.m14093t(content, 10);
                ArrayList arrayList = new ArrayList(m14093t);
                for (BlockedGroupContent blockedGroupContent : content) {
                    chatListMessageItem = MessageRowKt.toChatListMessageItem(blockedGroupContent.getMessage(), (r18 & 1) != 0 ? null : null, new MessageContext(false, false, null, null, null, null, null, false, false, false, false, false, null, 8191, null), (r18 & 4) != 0, (r18 & 8) != 0 ? false : false, (r18 & 16) != 0 ? false : false, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null);
                    arrayList.add(chatListMessageItem);
                }
                m14081F = C9551p.m14081F(arrayList);
                return new BlockedGroupChatListItem(text, context, color, backgroundColor, borderColor, revealed, m14081F);
            }
            throw new IllegalStateException("Unknown row type.".toString());
        }
        return loadingChatListItem;
    }

    public final void clearRows() {
        boolean z;
        List m14104i;
        List<Row> list = this.rows;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            SpoilerManager.INSTANCE.reset();
            m14104i = C9545j.m14104i();
            publishUpdate(new ChatListUpdate(m14104i, ChatListAction.Clear.INSTANCE, null));
        }
        this.rows = null;
    }

    public final int getRowCount() {
        List<Row> list = this.rows;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final void handleError(String errorJson, String causeMessage) {
        List m14098o;
        C9612q.m13917h(errorJson, "errorJson");
        C9612q.m13917h(causeMessage, "causeMessage");
        m14098o = C9545j.m14098o(new DeserializationErrorChatListItem("error-id", errorJson, causeMessage));
        publishUpdate(new ChatListUpdate(m14098o, ChatListAction.Noop.INSTANCE, null));
        this.isDisabled = true;
    }

    public final Flow<ChatListUpdate> observeUpdates() {
        return this.updatesFlow;
    }

    public final void updateRows(List<? extends Row> updates) {
        RowsModificationResult createNewRows;
        int m14093t;
        boolean z;
        boolean z2;
        Row row;
        MessageRow messageRow;
        boolean z3;
        MessageRow messageRow2;
        boolean z4;
        Boolean jumped;
        C9612q.m13917h(updates, "updates");
        if (this.isDisabled) {
            return;
        }
        if (this.rows != null) {
            createNewRows = modifyExistingRows(updates);
        } else {
            createNewRows = createNewRows(updates);
        }
        List<Row> component1 = createNewRows.component1();
        boolean component2 = createNewRows.component2();
        List<ListOperation> component3 = createNewRows.component3();
        m14093t = C9546k.m14093t(component1, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        int i = 0;
        ChatListAction chatListAction = null;
        for (Object obj : component1) {
            int i2 = i + 1;
            if (i < 0) {
                C9545j.m14094s();
            }
            Row row2 = (Row) obj;
            boolean z5 = row2 instanceof MessageRow;
            if (z5) {
                z = C9612q.m13922c(((MessageRow) row2).getScrollTo(), Boolean.TRUE);
            } else if (row2 instanceof SeparatorRow) {
                z = C9612q.m13922c(((SeparatorRow) row2).getScrollTo(), Boolean.TRUE);
            } else {
                z = false;
            }
            if (z && row2.getChangeType() != ChangeType.DELETE) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && updates.contains(row2)) {
                if (z5) {
                    messageRow = (MessageRow) row2;
                } else {
                    messageRow = null;
                }
                if (messageRow != null && (jumped = messageRow.getJumped()) != null) {
                    z3 = jumped.booleanValue();
                } else {
                    z3 = false;
                }
                if (z5) {
                    messageRow2 = (MessageRow) row2;
                } else {
                    messageRow2 = null;
                }
                if (messageRow2 != null) {
                    z4 = messageRow2.isHighlight();
                } else {
                    z4 = false;
                }
                row = row2;
                chatListAction = new ChatListAction.ScrollTo(i, z3, false, z4, 4, null);
            } else {
                row = row2;
            }
            arrayList.add(toChatListItem(row));
            i = i2;
        }
        if (chatListAction == null) {
            if (component2) {
                chatListAction = ChatListAction.StickToBottomIfAtBottom.INSTANCE;
            } else {
                chatListAction = ChatListAction.Noop.INSTANCE;
            }
        }
        publishUpdate(new ChatListUpdate(arrayList, chatListAction, component3));
    }
}