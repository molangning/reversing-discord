package com.discord.chat.presentation.list.messagebundling;

import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"<anonymous>", "", "it", "Lcom/discord/primitives/MessageId;", "invoke-1xi1bu0", "(Ljava/lang/String;)V"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
final class MessageBundleAdapter$onTruncateMessage$1 extends AbstractC9614s implements Function1<MessageId, Unit> {
    public static final MessageBundleAdapter$onTruncateMessage$1 INSTANCE = new MessageBundleAdapter$onTruncateMessage$1();

    MessageBundleAdapter$onTruncateMessage$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MessageId messageId) {
        m41628invoke1xi1bu0(messageId.m42081unboximpl());
        return Unit.f25302a;
    }

    /* renamed from: invoke-1xi1bu0  reason: not valid java name */
    public final void m41628invoke1xi1bu0(String it) {
        C9612q.m13917h(it, "it");
    }
}
