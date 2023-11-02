package com.hannesdorfmann.adapterdelegates4;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: com.hannesdorfmann.adapterdelegates4.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC5131a<T> extends RecyclerView.Adapter {
    protected AdapterDelegatesManager<T> delegatesManager;
    protected T items;

    public AbstractC5131a() {
        this(new AdapterDelegatesManager());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.delegatesManager.m26102e(this.items, i);
    }

    public T getItems() {
        return this.items;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        this.delegatesManager.m26100g(this.items, i, viewHolder, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.delegatesManager.m26099h(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        return this.delegatesManager.m26098i(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        this.delegatesManager.m26097j(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        this.delegatesManager.m26096k(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        this.delegatesManager.m26095l(viewHolder);
    }

    public void setItems(T t) {
        this.items = t;
    }

    public AbstractC5131a(AdapterDelegatesManager<T> adapterDelegatesManager) {
        if (adapterDelegatesManager != null) {
            this.delegatesManager = adapterDelegatesManager;
            return;
        }
        throw new NullPointerException("AdapterDelegatesManager is null");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        this.delegatesManager.m26100g(this.items, i, viewHolder, list);
    }

    public AbstractC5131a(AdapterDelegate<T>... adapterDelegateArr) {
        this(new AdapterDelegatesManager(adapterDelegateArr));
    }
}