package com.discord.chat.presentation.message.view.botuikit;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JB\u0010\u0007\u001a\n\u0012\u0004\u0012\u0002H\t\u0018\u00010\b\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u0002H\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086\b¢\u0006\u0002\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "getConfiguredComponentView", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;", "T", "Lcom/discord/chat/bridge/botuikit/Component;", "listener", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;", "component", "root", "Landroid/view/ViewGroup;", "childIndex", "", "(Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;Lcom/discord/chat/bridge/botuikit/Component;Landroid/view/ViewGroup;I)Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ComponentProvider {
    private final Context context;

    public ComponentProvider(Context context) {
        C9612q.m13917h(context, "context");
        this.context = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x002d, code lost:
        if (r1 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ <T extends com.discord.chat.bridge.botuikit.Component> com.discord.chat.presentation.message.view.botuikit.ComponentView<T> getConfiguredComponentView(com.discord.chat.presentation.message.view.botuikit.ComponentActionListener r5, T r6, android.view.ViewGroup r7, int r8) {
        /*
            r4 = this;
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.C9612q.m13917h(r5, r0)
            java.lang.String r0 = "component"
            kotlin.jvm.internal.C9612q.m13917h(r6, r0)
            java.lang.String r0 = "root"
            kotlin.jvm.internal.C9612q.m13917h(r7, r0)
            android.view.View r8 = r7.getChildAt(r8)
            boolean r0 = r8 instanceof com.discord.chat.presentation.message.view.botuikit.ComponentView
            r1 = 0
            if (r0 == 0) goto L1b
            com.discord.chat.presentation.message.view.botuikit.ComponentView r8 = (com.discord.chat.presentation.message.view.botuikit.ComponentView) r8
            goto L1c
        L1b:
            r8 = r1
        L1c:
            if (r8 == 0) goto L30
            kotlin.reflect.KClass r0 = r8.getComponentType()
            r2 = 3
            java.lang.String r3 = "T"
            kotlin.jvm.internal.C9612q.m13912m(r2, r3)
            boolean r0 = r0 instanceof com.discord.chat.bridge.botuikit.Component
            if (r0 == 0) goto L2d
            r1 = r8
        L2d:
            if (r1 == 0) goto L30
            goto L3d
        L30:
            com.discord.chat.presentation.message.view.botuikit.ComponentInflater r8 = new com.discord.chat.presentation.message.view.botuikit.ComponentInflater
            android.content.Context r0 = r4.getContext()
            r8.<init>(r0)
            com.discord.chat.presentation.message.view.botuikit.ComponentView r1 = r8.inflateComponent(r6, r7)
        L3d:
            if (r1 == 0) goto L42
            r1.configure(r6, r4, r5)
        L42:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.botuikit.ComponentProvider.getConfiguredComponentView(com.discord.chat.presentation.message.view.botuikit.ComponentActionListener, com.discord.chat.bridge.botuikit.Component, android.view.ViewGroup, int):com.discord.chat.presentation.message.view.botuikit.ComponentView");
    }

    public final Context getContext() {
        return this.context;
    }
}