package com.discord.recycler_view.utils;

import androidx.recyclerview.widget.C1786c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u0011"}, m14357d2 = {"Lcom/discord/recycler_view/utils/ItemDiffer;", "Landroidx/recyclerview/widget/c$b;", "", "getOldListSize", "getNewListSize", "oldItemPosition", "newItemPosition", "", "areItemsTheSame", "areContentsTheSame", "", "Lcom/discord/recycler_view/utils/ItemDiffableType;", "oldItems", "Ljava/util/List;", "newItems", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "recycler_view_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class ItemDiffer extends C1786c.AbstractC1788b {
    private final List<ItemDiffableType> newItems;
    private final List<ItemDiffableType> oldItems;

    /* JADX WARN: Multi-variable type inference failed */
    public ItemDiffer(List<? extends ItemDiffableType> oldItems, List<? extends ItemDiffableType> newItems) {
        C9612q.m13917h(oldItems, "oldItems");
        C9612q.m13917h(newItems, "newItems");
        this.oldItems = oldItems;
        this.newItems = newItems;
    }

    @Override // androidx.recyclerview.widget.C1786c.AbstractC1788b
    public boolean areContentsTheSame(int i, int i2) {
        return C9612q.m13922c(this.oldItems.get(i), this.newItems.get(i2));
    }

    @Override // androidx.recyclerview.widget.C1786c.AbstractC1788b
    public boolean areItemsTheSame(int i, int i2) {
        return C9612q.m13922c(this.oldItems.get(i).getItemId(), this.newItems.get(i2).getItemId());
    }

    @Override // androidx.recyclerview.widget.C1786c.AbstractC1788b
    public int getNewListSize() {
        return this.newItems.size();
    }

    @Override // androidx.recyclerview.widget.C1786c.AbstractC1788b
    public int getOldListSize() {
        return this.oldItems.size();
    }
}