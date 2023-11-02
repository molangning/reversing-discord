package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C9609n;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public /* synthetic */ class EmbeddedActivityInviteViewHolder$bind$1$4 extends C9609n implements Function4<String, String, String, String, Unit> {
    public EmbeddedActivityInviteViewHolder$bind$1$4(Object obj) {
        super(4, obj, ChatEventHandler.class, "onLongPressChannel", "onLongPressChannel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, String str3, String str4) {
        invoke2(str, str2, str3, str4);
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2(String p0, String str, String str2, String str3) {
        C9612q.m13917h(p0, "p0");
        ((ChatEventHandler) this.receiver).onLongPressChannel(p0, str, str2, str3);
    }
}