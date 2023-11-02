package com.discord.chat.presentation.message;

import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, m14357d2 = {"<anonymous>", "", "url", "", "filename", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageAccessoriesAdapter$onBindViewHolder$40 extends AbstractC9614s implements Function2<String, String, Unit> {
    final /* synthetic */ MessageAccessoriesAdapter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageAccessoriesAdapter$onBindViewHolder$40(MessageAccessoriesAdapter messageAccessoriesAdapter) {
        super(2);
        this.this$0 = messageAccessoriesAdapter;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
        invoke2(str, str2);
        return Unit.f25302a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String url, String filename) {
        ChatEventHandler chatEventHandler;
        String str;
        C9612q.m13917h(url, "url");
        C9612q.m13917h(filename, "filename");
        chatEventHandler = this.this$0.eventHandler;
        if (chatEventHandler == null) {
            C9612q.m13900y("eventHandler");
            chatEventHandler = null;
        }
        str = this.this$0.messageId;
        C9612q.m13920e(str);
        chatEventHandler.mo41577onLinkClickedu7_MRrM(str, url, filename);
    }
}
