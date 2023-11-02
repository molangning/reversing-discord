package com.hannesdorfmann.adapterdelegates4;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AdapterDelegate<T> {
    public abstract boolean isForViewType(T t, int i);

    public abstract void onBindViewHolder(T t, int i, RecyclerView.ViewHolder viewHolder, List<Object> list);

    public abstract RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup);

    public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        return false;
    }

    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
    }

    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
    }

    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
    }
}