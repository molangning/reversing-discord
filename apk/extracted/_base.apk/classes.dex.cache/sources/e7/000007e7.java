package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1784a implements InterfaceC1803h {

    /* renamed from: a */
    private final RecyclerView.Adapter f4884a;

    public C1784a(RecyclerView.Adapter adapter) {
        this.f4884a = adapter;
    }

    @Override // androidx.recyclerview.widget.InterfaceC1803h
    /* renamed from: a */
    public void mo35381a(int i, int i2) {
        this.f4884a.notifyItemRangeInserted(i, i2);
    }

    @Override // androidx.recyclerview.widget.InterfaceC1803h
    /* renamed from: b */
    public void mo35380b(int i, int i2) {
        this.f4884a.notifyItemRangeRemoved(i, i2);
    }

    @Override // androidx.recyclerview.widget.InterfaceC1803h
    /* renamed from: c */
    public void mo35379c(int i, int i2, Object obj) {
        this.f4884a.notifyItemRangeChanged(i, i2, obj);
    }

    @Override // androidx.recyclerview.widget.InterfaceC1803h
    /* renamed from: d */
    public void mo35378d(int i, int i2) {
        this.f4884a.notifyItemMoved(i, i2);
    }
}