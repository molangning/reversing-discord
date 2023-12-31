package com.discord.chat.listmanager;

import com.discord.chat.listmanager.ListOperation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlin.ranges.IntRange;

@Metadata(m14358d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m14357d2 = {"Lcom/discord/chat/listmanager/ListOperationsBuilder;", "", "()V", "listOperations", "", "Lcom/discord/chat/listmanager/ListOperation;", "add", "", "newOperation", "addChange", "changeOperation", "Lcom/discord/chat/listmanager/ListOperation$Change;", "addInsert", "insertOperation", "Lcom/discord/chat/listmanager/ListOperation$Insert;", "addRemove", "removeOperation", "Lcom/discord/chat/listmanager/ListOperation$Remove;", "build", "", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ListOperationsBuilder {
    private final List<ListOperation> listOperations = new ArrayList();

    private final void addChange(ListOperation.Change change) {
        Object m14044f0;
        int m14102k;
        int m14102k2;
        int m14102k3;
        int m14102k4;
        m14044f0 = C9553r.m14044f0(this.listOperations);
        ListOperation listOperation = (ListOperation) m14044f0;
        if (listOperation instanceof ListOperation.Change) {
            ListOperation.Change change2 = (ListOperation.Change) listOperation;
            int index = change2.getIndex();
            if (index == change.getIndex() - 1) {
                List<ListOperation> list = this.listOperations;
                m14102k4 = C9545j.m14102k(list);
                list.set(m14102k4, new ListOperation.ChangeRange(new IntRange(change2.getIndex(), change.getIndex())));
            } else if (index == change.getIndex() + 1) {
                List<ListOperation> list2 = this.listOperations;
                m14102k3 = C9545j.m14102k(list2);
                list2.set(m14102k3, new ListOperation.ChangeRange(new IntRange(change.getIndex(), change2.getIndex())));
            } else {
                this.listOperations.add(change);
            }
        } else if (listOperation instanceof ListOperation.ChangeRange) {
            ListOperation.ChangeRange changeRange = (ListOperation.ChangeRange) listOperation;
            if (changeRange.getLast() == change.getIndex() - 1) {
                List<ListOperation> list3 = this.listOperations;
                m14102k2 = C9545j.m14102k(list3);
                list3.set(m14102k2, new ListOperation.ChangeRange(new IntRange(changeRange.getFirst(), change.getIndex())));
            } else if (changeRange.getFirst() == change.getIndex() + 1) {
                List<ListOperation> list4 = this.listOperations;
                m14102k = C9545j.m14102k(list4);
                list4.set(m14102k, new ListOperation.ChangeRange(new IntRange(change.getIndex(), changeRange.getLast())));
            } else {
                this.listOperations.add(change);
            }
        } else {
            this.listOperations.add(change);
        }
    }

    private final void addInsert(ListOperation.Insert insert) {
        Object m14044f0;
        int m14102k;
        int m14102k2;
        int m14102k3;
        int m14102k4;
        m14044f0 = C9553r.m14044f0(this.listOperations);
        ListOperation listOperation = (ListOperation) m14044f0;
        if (listOperation instanceof ListOperation.Insert) {
            ListOperation.Insert insert2 = (ListOperation.Insert) listOperation;
            int index = insert2.getIndex();
            if (index == insert.getIndex() - 1) {
                List<ListOperation> list = this.listOperations;
                m14102k4 = C9545j.m14102k(list);
                list.set(m14102k4, new ListOperation.InsertRange(new IntRange(insert2.getIndex(), insert.getIndex())));
            } else if (index == insert.getIndex() + 1) {
                List<ListOperation> list2 = this.listOperations;
                m14102k3 = C9545j.m14102k(list2);
                list2.set(m14102k3, new ListOperation.InsertRange(new IntRange(insert.getIndex(), insert2.getIndex())));
            } else {
                this.listOperations.add(insert);
            }
        } else if (listOperation instanceof ListOperation.InsertRange) {
            ListOperation.InsertRange insertRange = (ListOperation.InsertRange) listOperation;
            if (insertRange.getLast() == insert.getIndex() - 1) {
                List<ListOperation> list3 = this.listOperations;
                m14102k2 = C9545j.m14102k(list3);
                list3.set(m14102k2, new ListOperation.InsertRange(new IntRange(insertRange.getFirst(), insert.getIndex())));
            } else if (insertRange.getFirst() == insert.getIndex() + 1) {
                List<ListOperation> list4 = this.listOperations;
                m14102k = C9545j.m14102k(list4);
                list4.set(m14102k, new ListOperation.InsertRange(new IntRange(insert.getIndex(), insertRange.getLast())));
            } else {
                this.listOperations.add(insert);
            }
        } else {
            this.listOperations.add(insert);
        }
    }

    private final void addRemove(ListOperation.Remove remove) {
        Object m14044f0;
        int m14102k;
        int m14102k2;
        int m14102k3;
        int m14102k4;
        m14044f0 = C9553r.m14044f0(this.listOperations);
        ListOperation listOperation = (ListOperation) m14044f0;
        if (listOperation instanceof ListOperation.Remove) {
            ListOperation.Remove remove2 = (ListOperation.Remove) listOperation;
            int index = remove2.getIndex();
            if (index == remove.getIndex() - 1) {
                List<ListOperation> list = this.listOperations;
                m14102k4 = C9545j.m14102k(list);
                list.set(m14102k4, new ListOperation.RemoveRange(new IntRange(remove2.getIndex(), remove.getIndex())));
            } else if (index == remove.getIndex() + 1) {
                List<ListOperation> list2 = this.listOperations;
                m14102k3 = C9545j.m14102k(list2);
                list2.set(m14102k3, new ListOperation.RemoveRange(new IntRange(remove.getIndex(), remove2.getIndex())));
            } else {
                this.listOperations.add(remove);
            }
        } else if (listOperation instanceof ListOperation.RemoveRange) {
            ListOperation.RemoveRange removeRange = (ListOperation.RemoveRange) listOperation;
            if (removeRange.getLast() == remove.getIndex() - 1) {
                List<ListOperation> list3 = this.listOperations;
                m14102k2 = C9545j.m14102k(list3);
                list3.set(m14102k2, new ListOperation.RemoveRange(new IntRange(removeRange.getFirst(), remove.getIndex())));
            } else if (removeRange.getFirst() == remove.getIndex() + 1) {
                List<ListOperation> list4 = this.listOperations;
                m14102k = C9545j.m14102k(list4);
                list4.set(m14102k, new ListOperation.RemoveRange(new IntRange(remove.getIndex(), removeRange.getLast())));
            } else {
                this.listOperations.add(remove);
            }
        } else {
            this.listOperations.add(remove);
        }
    }

    public final void add(ListOperation newOperation) {
        C9612q.m13917h(newOperation, "newOperation");
        if (this.listOperations.isEmpty()) {
            this.listOperations.add(newOperation);
        } else if (newOperation instanceof ListOperation.Insert) {
            addInsert((ListOperation.Insert) newOperation);
        } else if (newOperation instanceof ListOperation.Remove) {
            addRemove((ListOperation.Remove) newOperation);
        } else if (newOperation instanceof ListOperation.Change) {
            addChange((ListOperation.Change) newOperation);
        } else {
            throw new IllegalArgumentException("invalid new operation for add: " + newOperation);
        }
    }

    public final List<ListOperation> build() {
        return this.listOperations;
    }
}