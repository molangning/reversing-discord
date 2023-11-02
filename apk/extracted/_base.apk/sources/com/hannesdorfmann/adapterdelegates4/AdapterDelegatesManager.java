package com.hannesdorfmann.adapterdelegates4;

import android.view.ViewGroup;
import androidx.collection.SparseArrayCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class AdapterDelegatesManager<T> {

    /* renamed from: c */
    private static final List<Object> f14450c = Collections.emptyList();

    /* renamed from: a */
    protected SparseArrayCompat<AdapterDelegate<T>> f14451a = new SparseArrayCompat<>();

    /* renamed from: b */
    protected AdapterDelegate<T> f14452b;

    public AdapterDelegatesManager() {
    }

    /* renamed from: a */
    public AdapterDelegatesManager<T> m26106a(int i, AdapterDelegate<T> adapterDelegate) {
        return m26105b(i, false, adapterDelegate);
    }

    /* renamed from: b */
    public AdapterDelegatesManager<T> m26105b(int i, boolean z, AdapterDelegate<T> adapterDelegate) {
        if (adapterDelegate != null) {
            if (i != 2147483646) {
                if (!z && this.f14451a.m39516f(i) != null) {
                    throw new IllegalArgumentException("An AdapterDelegate is already registered for the viewType = " + i + ". Already registered AdapterDelegate is " + this.f14451a.m39516f(i));
                }
                this.f14451a.m39512l(i, adapterDelegate);
                return this;
            }
            throw new IllegalArgumentException("The view type = 2147483646 is reserved for fallback adapter delegate (see setFallbackDelegate() ). Please use another view type.");
        }
        throw new NullPointerException("AdapterDelegate is null!");
    }

    /* renamed from: c */
    public AdapterDelegatesManager<T> m26104c(AdapterDelegate<T> adapterDelegate) {
        int m39511m = this.f14451a.m39511m();
        while (this.f14451a.m39516f(m39511m) != null) {
            m39511m++;
            if (m39511m == 2147483646) {
                throw new IllegalArgumentException("Oops, we are very close to Integer.MAX_VALUE. It seems that there are no more free and unused view type integers left to add another AdapterDelegate.");
            }
        }
        return m26105b(m39511m, false, adapterDelegate);
    }

    /* renamed from: d */
    public AdapterDelegate<T> m26103d(int i) {
        return this.f14451a.m39515g(i, this.f14452b);
    }

    /* renamed from: e */
    public int m26102e(T t, int i) {
        String str;
        if (t != null) {
            int m39511m = this.f14451a.m39511m();
            for (int i2 = 0; i2 < m39511m; i2++) {
                if (this.f14451a.m39510n(i2).isForViewType(t, i)) {
                    return this.f14451a.m39513k(i2);
                }
            }
            if (this.f14452b != null) {
                return 2147483646;
            }
            if (t instanceof List) {
                str = "No AdapterDelegate added that matches item=" + ((List) t).get(i).toString() + " at position=" + i + " in data source";
            } else {
                str = "No AdapterDelegate added for item at position=" + i + ". items=" + t;
            }
            throw new NullPointerException(str);
        }
        throw new NullPointerException("Items datasource is null!");
    }

    /* renamed from: f */
    public int m26101f(AdapterDelegate<T> adapterDelegate) {
        if (adapterDelegate != null) {
            int m39514j = this.f14451a.m39514j(adapterDelegate);
            if (m39514j == -1) {
                return -1;
            }
            return this.f14451a.m39513k(m39514j);
        }
        throw new NullPointerException("Delegate is null");
    }

    /* renamed from: g */
    public void m26100g(T t, int i, RecyclerView.ViewHolder viewHolder, List list) {
        AdapterDelegate<T> m26103d = m26103d(viewHolder.getItemViewType());
        if (m26103d != null) {
            if (list == null) {
                list = f14450c;
            }
            m26103d.onBindViewHolder(t, i, viewHolder, list);
            return;
        }
        throw new NullPointerException("No delegate found for item at position = " + i + " for viewType = " + viewHolder.getItemViewType());
    }

    /* renamed from: h */
    public RecyclerView.ViewHolder m26099h(ViewGroup viewGroup, int i) {
        AdapterDelegate<T> m26103d = m26103d(i);
        if (m26103d != null) {
            RecyclerView.ViewHolder onCreateViewHolder = m26103d.onCreateViewHolder(viewGroup);
            if (onCreateViewHolder != null) {
                return onCreateViewHolder;
            }
            throw new NullPointerException("ViewHolder returned from AdapterDelegate " + m26103d + " for ViewType =" + i + " is null!");
        }
        throw new NullPointerException("No AdapterDelegate added for ViewType " + i);
    }

    /* renamed from: i */
    public boolean m26098i(RecyclerView.ViewHolder viewHolder) {
        AdapterDelegate<T> m26103d = m26103d(viewHolder.getItemViewType());
        if (m26103d != null) {
            return m26103d.onFailedToRecycleView(viewHolder);
        }
        throw new NullPointerException("No delegate found for " + viewHolder + " for item at position = " + viewHolder.getAdapterPosition() + " for viewType = " + viewHolder.getItemViewType());
    }

    /* renamed from: j */
    public void m26097j(RecyclerView.ViewHolder viewHolder) {
        AdapterDelegate<T> m26103d = m26103d(viewHolder.getItemViewType());
        if (m26103d != null) {
            m26103d.onViewAttachedToWindow(viewHolder);
            return;
        }
        throw new NullPointerException("No delegate found for " + viewHolder + " for item at position = " + viewHolder.getAdapterPosition() + " for viewType = " + viewHolder.getItemViewType());
    }

    /* renamed from: k */
    public void m26096k(RecyclerView.ViewHolder viewHolder) {
        AdapterDelegate<T> m26103d = m26103d(viewHolder.getItemViewType());
        if (m26103d != null) {
            m26103d.onViewDetachedFromWindow(viewHolder);
            return;
        }
        throw new NullPointerException("No delegate found for " + viewHolder + " for item at position = " + viewHolder.getAdapterPosition() + " for viewType = " + viewHolder.getItemViewType());
    }

    /* renamed from: l */
    public void m26095l(RecyclerView.ViewHolder viewHolder) {
        AdapterDelegate<T> m26103d = m26103d(viewHolder.getItemViewType());
        if (m26103d != null) {
            m26103d.onViewRecycled(viewHolder);
            return;
        }
        throw new NullPointerException("No delegate found for " + viewHolder + " for item at position = " + viewHolder.getAdapterPosition() + " for viewType = " + viewHolder.getItemViewType());
    }

    public AdapterDelegatesManager(AdapterDelegate<T>... adapterDelegateArr) {
        for (AdapterDelegate<T> adapterDelegate : adapterDelegateArr) {
            m26104c(adapterDelegate);
        }
    }
}
