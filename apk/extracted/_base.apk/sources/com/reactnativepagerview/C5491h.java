package com.reactnativepagerview;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0016\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0012\u001a\u00020\nJ\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015¨\u0006\u0019"}, m14357d2 = {"Lcom/reactnativepagerview/h;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/reactnativepagerview/i;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "d", "holder", "index", "", "c", "getItemCount", "Landroid/view/View;", "child", "a", "b", "f", "e", "g", "Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "childrenViews", "<init>", "()V", "react-native-pager-view_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.reactnativepagerview.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5491h extends RecyclerView.Adapter<C5492i> {

    /* renamed from: a */
    private final ArrayList<View> f15458a = new ArrayList<>();

    /* renamed from: a */
    public final void m25127a(View child, int i) {
        C9612q.m13917h(child, "child");
        this.f15458a.add(i, child);
        notifyItemInserted(i);
    }

    /* renamed from: b */
    public final View m25126b(int i) {
        View view = this.f15458a.get(i);
        C9612q.m13918g(view, "childrenViews[index]");
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c */
    public void onBindViewHolder(C5492i holder, int i) {
        C9612q.m13917h(holder, "holder");
        FrameLayout m25120a = holder.m25120a();
        View m25126b = m25126b(i);
        if (m25120a.getChildCount() > 0) {
            m25120a.removeAllViews();
        }
        if (m25126b.getParent() != null) {
            ViewParent parent = m25126b.getParent();
            C9612q.m13919f(parent, "null cannot be cast to non-null type android.widget.FrameLayout");
            ((FrameLayout) parent).removeView(m25126b);
        }
        m25120a.addView(m25126b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d */
    public C5492i onCreateViewHolder(ViewGroup parent, int i) {
        C9612q.m13917h(parent, "parent");
        return C5492i.f15459j.m25119a(parent);
    }

    /* renamed from: e */
    public final void m25123e() {
        ViewParent viewParent;
        int size = this.f15458a.size();
        int i = 1;
        if (1 <= size) {
            while (true) {
                View view = this.f15458a.get(i - 1);
                C9612q.m13918g(view, "childrenViews[index-1]");
                View view2 = view;
                ViewParent parent = view2.getParent();
                if (parent != null) {
                    viewParent = parent.getParent();
                } else {
                    viewParent = null;
                }
                if (viewParent != null) {
                    ViewParent parent2 = view2.getParent().getParent();
                    C9612q.m13919f(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
                    ViewParent parent3 = view2.getParent();
                    C9612q.m13919f(parent3, "null cannot be cast to non-null type android.view.View");
                    ((ViewGroup) parent2).removeView((View) parent3);
                }
                if (i == size) {
                    break;
                }
                i++;
            }
        }
        int size2 = this.f15458a.size();
        this.f15458a.clear();
        notifyItemRangeRemoved(0, size2);
    }

    /* renamed from: f */
    public final void m25122f(View child) {
        C9612q.m13917h(child, "child");
        int indexOf = this.f15458a.indexOf(child);
        if (indexOf > -1) {
            m25121g(indexOf);
        }
    }

    /* renamed from: g */
    public final void m25121g(int i) {
        this.f15458a.remove(i);
        notifyItemRemoved(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f15458a.size();
    }
}
