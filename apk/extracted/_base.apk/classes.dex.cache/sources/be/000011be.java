package com.discord.chat.messagemanager;

import com.discord.chat.messagemanager.MessageViewManagers;
import com.discord.chat.presentation.list.messagebundling.MessageBundleView;
import com.discord.misc.utilities.measure.ViewMeasuringWrapper;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"<anonymous>", "", "messageId", "Lcom/discord/primitives/MessageId;", "invoke-1xi1bu0", "(Ljava/lang/String;)V"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageViewManagers$MessageBundleViewManager$setData$1$3 extends AbstractC9614s implements Function1<MessageId, Unit> {
    final /* synthetic */ ViewMeasuringWrapper<MessageBundleView> $wrappedView;
    final /* synthetic */ MessageViewManagers.MessageBundleViewManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageViewManagers$MessageBundleViewManager$setData$1$3(MessageViewManagers.MessageBundleViewManager messageBundleViewManager, ViewMeasuringWrapper<MessageBundleView> viewMeasuringWrapper) {
        super(1);
        this.this$0 = messageBundleViewManager;
        this.$wrappedView = viewMeasuringWrapper;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MessageId messageId) {
        m41573invoke1xi1bu0(messageId.m42081unboximpl());
        return Unit.f25302a;
    }

    /* renamed from: invoke-1xi1bu0 */
    public final void m41573invoke1xi1bu0(String messageId) {
        C9612q.m13917h(messageId, "messageId");
        this.this$0.m41570emitOnTapReplyAyv7vGE(this.$wrappedView, messageId);
    }
}