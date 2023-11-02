package com.reactnativepagerview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\u0003B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\t"}, m14357d2 = {"Lcom/reactnativepagerview/i;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/FrameLayout;", "a", "()Landroid/widget/FrameLayout;", "container", "<init>", "(Landroid/widget/FrameLayout;)V", "j", "react-native-pager-view_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.reactnativepagerview.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5492i extends RecyclerView.ViewHolder {

    /* renamed from: j */
    public static final C5493a f15459j = new C5493a(null);

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, m14357d2 = {"Lcom/reactnativepagerview/i$a;", "", "Landroid/view/ViewGroup;", "parent", "Lcom/reactnativepagerview/i;", "a", "<init>", "()V", "react-native-pager-view_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.reactnativepagerview.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5493a {
        private C5493a() {
        }

        public /* synthetic */ C5493a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C5492i m25119a(ViewGroup parent) {
            C9612q.m13917h(parent, "parent");
            FrameLayout frameLayout = new FrameLayout(parent.getContext());
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.setSaveEnabled(false);
            return new C5492i(frameLayout, null);
        }
    }

    private C5492i(FrameLayout frameLayout) {
        super(frameLayout);
    }

    public /* synthetic */ C5492i(FrameLayout frameLayout, DefaultConstructorMarker defaultConstructorMarker) {
        this(frameLayout);
    }

    /* renamed from: a */
    public final FrameLayout m25120a() {
        View view = this.itemView;
        C9612q.m13919f(view, "null cannot be cast to non-null type android.widget.FrameLayout");
        return (FrameLayout) view;
    }
}
