package com.discord.chat.presentation.media;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ&\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m14357d2 = {"Lcom/discord/chat/presentation/media/AttachStateManager;", "", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "currentListener", "Landroid/view/View$OnAttachStateChangeListener;", "cancel", "", "onAttachStateChange", "onAttach", "Lkotlin/Function0;", "onDetach", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class AttachStateManager {
    private View.OnAttachStateChangeListener currentListener;
    private final View view;

    public AttachStateManager(View view) {
        C9612q.m13917h(view, "view");
        this.view = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onAttachStateChange$default(AttachStateManager attachStateManager, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = AttachStateManager$onAttachStateChange$1.INSTANCE;
        }
        if ((i & 2) != 0) {
            function02 = AttachStateManager$onAttachStateChange$2.INSTANCE;
        }
        attachStateManager.onAttachStateChange(function0, function02);
    }

    public final void cancel() {
        this.view.removeOnAttachStateChangeListener(this.currentListener);
        this.currentListener = null;
    }

    public final void onAttachStateChange(final Function0<Unit> onAttach, final Function0<Unit> onDetach) {
        C9612q.m13917h(onAttach, "onAttach");
        C9612q.m13917h(onDetach, "onDetach");
        this.view.removeOnAttachStateChangeListener(this.currentListener);
        View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.discord.chat.presentation.media.AttachStateManager$onAttachStateChange$3
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                C9612q.m13917h(view, "view");
                onAttach.invoke();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                C9612q.m13917h(view, "view");
                onDetach.invoke();
            }
        };
        this.currentListener = onAttachStateChangeListener;
        this.view.addOnAttachStateChangeListener(onAttachStateChangeListener);
    }
}
