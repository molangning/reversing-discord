package com.discord.chat.presentation.message;

import android.view.View;
import androidx.core.view.C1365w0;
import com.discord.chat.bridge.Message;
import com.discord.chat.presentation.message.view.MessageContentView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "it", "Lcom/discord/chat/presentation/message/view/MessageContentView;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageView$setMessage$5 extends AbstractC9614s implements Function1<MessageContentView, Unit> {
    final /* synthetic */ Message $message;
    final /* synthetic */ View.OnLongClickListener $messageLongPress;
    final /* synthetic */ View.OnClickListener $onClick;
    final /* synthetic */ MessageView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageView$setMessage$5(MessageView messageView, Message message, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        super(1);
        this.this$0 = messageView;
        this.$message = message;
        this.$onClick = onClickListener;
        this.$messageLongPress = onLongClickListener;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MessageContentView messageContentView) {
        invoke2(messageContentView);
        return Unit.f25302a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MessageContentView it) {
        C9612q.m13917h(it, "it");
        C1365w0.m37185q0(this.this$0, new MessageViewAccessibilityDelegate(this.$message, it, this.$onClick, this.$messageLongPress));
    }
}
