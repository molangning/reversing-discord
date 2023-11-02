package com.discord.chat.messagemanager;

import com.discord.chat.bridge.row.MessageRow;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;

@Metadata(m14358d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m14357d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
final class MessageViewManagers$getEventHandler$1 extends AbstractC9614s implements Function0<Integer> {
    final /* synthetic */ MessageRow $this_getEventHandler;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageViewManagers$getEventHandler$1(MessageRow messageRow) {
        super(0);
        this.$this_getEventHandler = messageRow;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return this.$this_getEventHandler.getReactTag();
    }
}
