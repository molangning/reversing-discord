package com.discord.chat.presentation.message;

import com.discord.chat.bridge.sticker.Sticker;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9609n;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public /* synthetic */ class MessageAccessoriesAdapter$onCreateViewHolder$2 extends C9609n implements Function2<Sticker, MessageId, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public MessageAccessoriesAdapter$onCreateViewHolder$2(Object obj) {
        super(2, obj, ChatEventHandler.class, "onWelcomeReplyClicked", "onWelcomeReplyClicked-Ayv7vGE(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Sticker sticker, MessageId messageId) {
        m41650invokeAyv7vGE(sticker, messageId.m42081unboximpl());
        return Unit.f25302a;
    }

    /* renamed from: invoke-Ayv7vGE  reason: not valid java name */
    public final void m41650invokeAyv7vGE(Sticker p0, String p1) {
        C9612q.m13917h(p0, "p0");
        C9612q.m13917h(p1, "p1");
        ((ChatEventHandler) this.receiver).mo41614onWelcomeReplyClickedAyv7vGE(p0, p1);
    }
}
