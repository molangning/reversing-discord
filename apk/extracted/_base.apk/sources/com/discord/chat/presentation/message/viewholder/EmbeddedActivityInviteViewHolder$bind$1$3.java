package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C9609n;
import kotlin.jvm.internal.C9612q;

@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
/* synthetic */ class EmbeddedActivityInviteViewHolder$bind$1$3 extends C9609n implements Function3<String, String, String, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public EmbeddedActivityInviteViewHolder$bind$1$3(Object obj) {
        super(3, obj, ChatEventHandler.class, "onTapChannel", "onTapChannel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, String str3) {
        invoke2(str, str2, str3);
        return Unit.f25302a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String p0, String str, String str2) {
        C9612q.m13917h(p0, "p0");
        ((ChatEventHandler) this.receiver).onTapChannel(p0, str, str2);
    }
}
