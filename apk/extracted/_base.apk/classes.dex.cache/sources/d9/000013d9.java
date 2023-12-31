package com.discord.chat.presentation.message.view.media;

import android.view.View;
import android.view.ViewTreeObserver;
import com.discord.chat.C2912R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/media/ViewScrollStateListener;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "", "queueScrollStop", "reset", "onScrollChanged", "Landroid/view/View;", "view", "Landroid/view/View;", "Lkotlin/Function1;", "", "viewScrolling", "Lkotlin/jvm/functions/Function1;", "", "isScrollingDuration", "J", "Ljava/lang/Runnable;", "isScrollingStoppedRunnable", "Ljava/lang/Runnable;", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ViewScrollStateListener implements ViewTreeObserver.OnScrollChangedListener {
    private final long isScrollingDuration;
    private Runnable isScrollingStoppedRunnable;
    private final View view;
    private final Function1<Boolean, Unit> viewScrolling;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewScrollStateListener(View view, Function1<? super Boolean, Unit> viewScrolling) {
        C9612q.m13917h(view, "view");
        C9612q.m13917h(viewScrolling, "viewScrolling");
        this.view = view;
        this.viewScrolling = viewScrolling;
        this.isScrollingDuration = view.getResources().getInteger(C2912R.integer.material_motion_duration_long_2);
        this.isScrollingStoppedRunnable = new Runnable() { // from class: com.discord.chat.presentation.message.view.media.b
            @Override // java.lang.Runnable
            public final void run() {
                ViewScrollStateListener.isScrollingStoppedRunnable$lambda$0(ViewScrollStateListener.this);
            }
        };
        queueScrollStop();
    }

    public static final void isScrollingStoppedRunnable$lambda$0(ViewScrollStateListener this$0) {
        C9612q.m13917h(this$0, "this$0");
        this$0.viewScrolling.invoke(Boolean.FALSE);
    }

    private final void queueScrollStop() {
        this.view.removeCallbacks(this.isScrollingStoppedRunnable);
        this.view.postDelayed(this.isScrollingStoppedRunnable, this.isScrollingDuration);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        this.viewScrolling.invoke(Boolean.TRUE);
        queueScrollStop();
    }

    public final void reset() {
        this.view.removeCallbacks(this.isScrollingStoppedRunnable);
    }
}