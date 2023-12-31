package com.discord.recycler_view.scroller;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.recycler_view.utils.LayoutManagerUtilsKt;
import com.discord.recycler_view.utils.RecyclerViewExtensionsKt;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002JN\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00162\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00162\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u0016JB\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u0016H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m14357d2 = {"Lcom/discord/recycler_view/scroller/Scroller;", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "(Landroidx/recyclerview/widget/RecyclerView;)V", "currentSearch", "Ljava/lang/Runnable;", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "cancel", "", "doScrollToPosition", ViewProps.POSITION, "", "targetAlignment", "Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment;", "scrollToPosition", "animate", "", "onStart", "Lkotlin/Function0;", "onComplete", "onScrollProgress", "search", "TargetAlignment", "recycler_view_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class Scroller {
    private Runnable currentSearch;
    private final RecyclerView recyclerView;

    @Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m14357d2 = {"Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment;", "", "()V", "Anywhere", "Center", "Top", "Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment$Anywhere;", "Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment$Center;", "Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment$Top;", "recycler_view_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
    public static abstract class TargetAlignment {

        @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m14357d2 = {"Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment$Anywhere;", "Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment;", "()V", "recycler_view_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
        public static final class Anywhere extends TargetAlignment {
            public static final Anywhere INSTANCE = new Anywhere();

            private Anywhere() {
                super(null);
            }
        }

        @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m14357d2 = {"Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment$Center;", "Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment;", "()V", "recycler_view_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
        public static final class Center extends TargetAlignment {
            public static final Center INSTANCE = new Center();

            private Center() {
                super(null);
            }
        }

        @Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m14357d2 = {"Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment$Top;", "Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment;", "offsetPx", "", "(I)V", "getOffsetPx", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "recycler_view_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
        public static final class Top extends TargetAlignment {
            private final int offsetPx;

            public Top(int i) {
                super(null);
                this.offsetPx = i;
            }

            public static /* synthetic */ Top copy$default(Top top, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = top.offsetPx;
                }
                return top.copy(i);
            }

            public final int component1() {
                return this.offsetPx;
            }

            public final Top copy(int i) {
                return new Top(i);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Top) && this.offsetPx == ((Top) obj).offsetPx;
            }

            public final int getOffsetPx() {
                return this.offsetPx;
            }

            public int hashCode() {
                return this.offsetPx;
            }

            public String toString() {
                int i = this.offsetPx;
                return "Top(offsetPx=" + i + ")";
            }
        }

        private TargetAlignment() {
        }

        public /* synthetic */ TargetAlignment(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Scroller(RecyclerView recyclerView) {
        C9612q.m13917h(recyclerView, "recyclerView");
        this.recyclerView = recyclerView;
        recyclerView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.discord.recycler_view.scroller.Scroller.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                C9612q.m13917h(v, "v");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
                C9612q.m13917h(v, "v");
                Scroller.this.cancel();
            }
        });
    }

    private final void doScrollToPosition(int i, TargetAlignment targetAlignment) {
        if (targetAlignment instanceof TargetAlignment.Anywhere) {
            this.recyclerView.scrollToPosition(i);
        } else if (targetAlignment instanceof TargetAlignment.Center) {
            RecyclerViewExtensionsKt.scrollToCenter(this.recyclerView, i);
        } else if (targetAlignment instanceof TargetAlignment.Top) {
            RecyclerViewExtensionsKt.scrollToTop(this.recyclerView, i, ((TargetAlignment.Top) targetAlignment).getOffsetPx());
        }
    }

    private final LinearLayoutManager getLayoutManager() {
        RecyclerView.LayoutManager layoutManager = this.recyclerView.getLayoutManager();
        C9612q.m13919f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        return (LinearLayoutManager) layoutManager;
    }

    public static /* synthetic */ void scrollToPosition$default(Scroller scroller, int i, TargetAlignment targetAlignment, boolean z, Function0 function0, Function0 function02, Function0 function03, int i2, Object obj) {
        Scroller$scrollToPosition$1 scroller$scrollToPosition$1 = function0;
        if ((i2 & 8) != 0) {
            scroller$scrollToPosition$1 = Scroller$scrollToPosition$1.INSTANCE;
        }
        Function0 function04 = scroller$scrollToPosition$1;
        Scroller$scrollToPosition$2 scroller$scrollToPosition$2 = function02;
        if ((i2 & 16) != 0) {
            scroller$scrollToPosition$2 = Scroller$scrollToPosition$2.INSTANCE;
        }
        Function0 function05 = scroller$scrollToPosition$2;
        Scroller$scrollToPosition$3 scroller$scrollToPosition$3 = function03;
        if ((i2 & 32) != 0) {
            scroller$scrollToPosition$3 = Scroller$scrollToPosition$3.INSTANCE;
        }
        scroller.scrollToPosition(i, targetAlignment, z, function04, function05, scroller$scrollToPosition$3);
    }

    private final void search(final int i, final TargetAlignment targetAlignment, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03) {
        Boolean isPositionVisible = LayoutManagerUtilsKt.isPositionVisible(getLayoutManager(), i);
        if (isPositionVisible != null && !isPositionVisible.booleanValue()) {
            doScrollToPosition(i, targetAlignment);
            function03.invoke();
            Runnable runnable = new Runnable() { // from class: com.discord.recycler_view.scroller.a
                @Override // java.lang.Runnable
                public final void run() {
                    Scroller.search$lambda$0(Scroller.this, i, targetAlignment, function0, function02, function03);
                }
            };
            this.currentSearch = runnable;
            this.recyclerView.post(runnable);
        } else if (targetAlignment instanceof TargetAlignment.Top) {
            doScrollToPosition(i, targetAlignment);
            function03.invoke();
            function02.invoke();
        } else {
            function02.invoke();
        }
    }

    public static final void search$lambda$0(Scroller this$0, int i, TargetAlignment targetAlignment, Function0 onStart, Function0 onComplete, Function0 onScrollProgress) {
        C9612q.m13917h(this$0, "this$0");
        C9612q.m13917h(targetAlignment, "$targetAlignment");
        C9612q.m13917h(onStart, "$onStart");
        C9612q.m13917h(onComplete, "$onComplete");
        C9612q.m13917h(onScrollProgress, "$onScrollProgress");
        this$0.search(i, targetAlignment, onStart, onComplete, onScrollProgress);
    }

    public final void cancel() {
        Runnable runnable = this.currentSearch;
        if (runnable != null) {
            this.recyclerView.removeCallbacks(runnable);
            this.currentSearch = null;
        }
    }

    public final void scrollToPosition(int i, TargetAlignment targetAlignment, boolean z, Function0<Unit> onStart, Function0<Unit> onComplete, Function0<Unit> onScrollProgress) {
        C9612q.m13917h(targetAlignment, "targetAlignment");
        C9612q.m13917h(onStart, "onStart");
        C9612q.m13917h(onComplete, "onComplete");
        C9612q.m13917h(onScrollProgress, "onScrollProgress");
        cancel();
        onStart.invoke();
        if (z) {
            RecyclerViewExtensionsKt.scrollToPositionAnimated(this.recyclerView, i, targetAlignment, new Scroller$scrollToPosition$4(onScrollProgress, onComplete));
        } else {
            search(i, targetAlignment, onStart, onComplete, onScrollProgress);
        }
    }
}