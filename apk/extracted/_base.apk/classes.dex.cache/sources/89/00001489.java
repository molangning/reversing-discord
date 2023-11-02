package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;

@Metadata(m14358d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m14357d2 = {"<anonymous>", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class VideoAttachmentViewHolder$bind$onCancelUpload$1 extends AbstractC9614s implements Function0<Unit> {
    final /* synthetic */ String $uploadItemId;
    final /* synthetic */ String $uploaderId;
    final /* synthetic */ VideoAttachmentViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoAttachmentViewHolder$bind$onCancelUpload$1(String str, String str2, VideoAttachmentViewHolder videoAttachmentViewHolder) {
        super(0);
        this.$uploaderId = str;
        this.$uploadItemId = str2;
        this.this$0 = videoAttachmentViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2() {
        ChatEventHandler chatEventHandler;
        if (this.$uploaderId == null || this.$uploadItemId == null) {
            return;
        }
        chatEventHandler = this.this$0.eventHandler;
        chatEventHandler.onTapCancelUploadItem(this.$uploaderId, this.$uploadItemId);
    }
}