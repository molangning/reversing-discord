package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9609n;
import kotlin.jvm.internal.C9612q;

@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
/* synthetic */ class EmbeddedActivityInviteViewHolder$bind$1$5 extends C9609n implements Function2<String, String, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public EmbeddedActivityInviteViewHolder$bind$1$5(Object obj) {
        super(2, obj, ChatEventHandler.class, "onTapMention", "onTapMention(Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
        invoke2(str, str2);
        return Unit.f25302a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String p0, String p1) {
        C9612q.m13917h(p0, "p0");
        C9612q.m13917h(p1, "p1");
        ((ChatEventHandler) this.receiver).onTapMention(p0, p1);
    }
}
