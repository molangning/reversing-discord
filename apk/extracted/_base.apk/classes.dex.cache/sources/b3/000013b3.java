package com.discord.chat.presentation.message.view.botuikit;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.databinding.MessageComponentsViewBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ&\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/MessageComponentsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/MessageComponentsViewBinding;", "setComponents", "", "componentProvider", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "components", "", "Lcom/discord/chat/bridge/botuikit/Component;", "actionListener", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageComponentsView extends ConstraintLayout {
    private final MessageComponentsViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageComponentsView(Context context) {
        this(context, null, 0, 6, null);
        C9612q.m13917h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageComponentsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ MessageComponentsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0050, code lost:
        if (r5 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setComponents(com.discord.chat.presentation.message.view.botuikit.ComponentProvider r8, java.util.List<? extends com.discord.chat.bridge.botuikit.Component> r9, com.discord.chat.presentation.message.view.botuikit.ComponentActionListener r10) {
        /*
            r7 = this;
            java.lang.String r0 = "components"
            kotlin.jvm.internal.C9612q.m13917h(r9, r0)
            java.lang.String r0 = "actionListener"
            kotlin.jvm.internal.C9612q.m13917h(r10, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.C9543h.m14124t(r9, r1)
            r0.<init>(r1)
            java.util.Iterator r9 = r9.iterator()
            r1 = 0
        L1a:
            boolean r2 = r9.hasNext()
            java.lang.String r3 = "binding.itemComponentsRoot"
            if (r2 == 0) goto L6a
            java.lang.Object r2 = r9.next()
            int r4 = r1 + 1
            if (r1 >= 0) goto L2d
            kotlin.collections.C9543h.m14126s()
        L2d:
            com.discord.chat.bridge.botuikit.Component r2 = (com.discord.chat.bridge.botuikit.Component) r2
            r5 = 0
            if (r8 == 0) goto L65
            com.discord.chat.databinding.MessageComponentsViewBinding r6 = r7.binding
            android.widget.LinearLayout r6 = r6.itemComponentsRoot
            kotlin.jvm.internal.C9612q.m13918g(r6, r3)
            android.view.View r1 = r6.getChildAt(r1)
            boolean r3 = r1 instanceof com.discord.chat.presentation.message.view.botuikit.ComponentView
            if (r3 == 0) goto L44
            com.discord.chat.presentation.message.view.botuikit.ComponentView r1 = (com.discord.chat.presentation.message.view.botuikit.ComponentView) r1
            goto L45
        L44:
            r1 = r5
        L45:
            if (r1 == 0) goto L52
            kotlin.reflect.KClass r3 = r1.getComponentType()
            boolean r3 = r3 instanceof com.discord.chat.bridge.botuikit.Component
            if (r3 == 0) goto L50
            r5 = r1
        L50:
            if (r5 != 0) goto L60
        L52:
            com.discord.chat.presentation.message.view.botuikit.ComponentInflater r1 = new com.discord.chat.presentation.message.view.botuikit.ComponentInflater
            android.content.Context r3 = r8.getContext()
            r1.<init>(r3)
            com.discord.chat.presentation.message.view.botuikit.ComponentView r1 = r1.inflateComponent(r2, r6)
            r5 = r1
        L60:
            if (r5 == 0) goto L65
            r5.configure(r2, r8, r10)
        L65:
            r0.add(r5)
            r1 = r4
            goto L1a
        L6a:
            com.discord.chat.databinding.MessageComponentsViewBinding r8 = r7.binding
            android.widget.LinearLayout r8 = r8.itemComponentsRoot
            kotlin.jvm.internal.C9612q.m13918g(r8, r3)
            java.util.List r9 = kotlin.collections.C9543h.m14164Q(r0)
            com.discord.chat.presentation.message.view.botuikit.MessageComponentsViewKt.replaceViews(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.view.botuikit.MessageComponentsView.setComponents(com.discord.chat.presentation.message.view.botuikit.ComponentProvider, java.util.List, com.discord.chat.presentation.message.view.botuikit.ComponentActionListener):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageComponentsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9612q.m13917h(context, "context");
        MessageComponentsViewBinding inflate = MessageComponentsViewBinding.inflate(LayoutInflater.from(context), this);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
    }
}