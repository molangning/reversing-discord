package com.discord.chat.presentation.list.delegate.messagebundling;

import com.discord.chat.presentation.list.item.MessageItem;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m14357d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageBundleDelegateUtilsKt$getEventHandler$2 extends AbstractC9614s implements Function0<Integer> {
    final /* synthetic */ MessageItem $this_getEventHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageBundleDelegateUtilsKt$getEventHandler$2(MessageItem messageItem) {
        super(0);
        this.$this_getEventHandler = messageItem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        Integer reactTag = this.$this_getEventHandler.getReactTag();
        C9612q.m13920e(reactTag);
        return reactTag;
    }
}