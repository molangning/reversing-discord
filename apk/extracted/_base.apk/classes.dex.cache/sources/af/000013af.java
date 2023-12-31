package com.discord.chat.presentation.message.view.botuikit;

import android.content.Context;
import android.view.ViewGroup;
import com.discord.chat.bridge.botuikit.ActionRowComponent;
import com.discord.chat.bridge.botuikit.ButtonComponent;
import com.discord.chat.bridge.botuikit.Component;
import com.discord.chat.bridge.botuikit.SelectComponent;
import com.discord.chat.presentation.message.view.botuikit.components.ActionRowComponentView;
import com.discord.chat.presentation.message.view.botuikit.components.ButtonComponentView;
import com.discord.chat.presentation.message.view.botuikit.components.SelectComponentView;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J-\u0010\u0007\u001a\n\u0012\u0004\u0012\u0002H\t\u0018\u00010\b\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u000b\u001a\u0002H\t2\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/ComponentInflater;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "inflateComponent", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;", "T", "Lcom/discord/chat/bridge/botuikit/Component;", "component", "root", "Landroid/view/ViewGroup;", "(Lcom/discord/chat/bridge/botuikit/Component;Landroid/view/ViewGroup;)Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ComponentInflater {
    private final Context context;

    public ComponentInflater(Context context) {
        C9612q.m13917h(context, "context");
        this.context = context;
    }

    public final Context getContext() {
        return this.context;
    }

    public final <T extends Component> ComponentView<T> inflateComponent(T component, ViewGroup root) {
        ComponentView<ActionRowComponent> componentView;
        C9612q.m13917h(component, "component");
        C9612q.m13917h(root, "root");
        if (component instanceof ActionRowComponent) {
            componentView = ActionRowComponentView.Companion.inflateComponent(this.context, root);
        } else if (component instanceof ButtonComponent) {
            componentView = ButtonComponentView.Companion.inflateComponent(this.context, root);
        } else if (component instanceof SelectComponent) {
            componentView = SelectComponentView.Companion.inflateComponent(this.context, root);
        } else {
            componentView = null;
        }
        if (!(componentView instanceof ComponentView)) {
            return null;
        }
        return componentView;
    }
}