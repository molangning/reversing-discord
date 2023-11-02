package com.hannesdorfmann.adapterdelegates4;

import java.util.List;

/* renamed from: com.hannesdorfmann.adapterdelegates4.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5132b<T extends List<?>> extends AbstractC5131a<T> {
    public C5132b() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        T t = this.items;
        if (t == 0) {
            return 0;
        }
        return ((List) t).size();
    }

    public C5132b(AdapterDelegatesManager<T> adapterDelegatesManager) {
        super(adapterDelegatesManager);
    }

    public C5132b(AdapterDelegate<T>... adapterDelegateArr) {
        super(adapterDelegateArr);
    }
}
