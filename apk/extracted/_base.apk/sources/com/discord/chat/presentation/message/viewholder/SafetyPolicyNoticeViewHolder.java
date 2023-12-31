package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.message.messagepart.SafetyPolicyNoticeMessageAccessory;
import com.discord.chat.presentation.message.view.SafetyPolicyNoticeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\"\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m14357d2 = {"Lcom/discord/chat/presentation/message/viewholder/SafetyPolicyNoticeViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "Lcom/discord/chat/presentation/message/messagepart/SafetyPolicyNoticeMessageAccessory;", "accessory", "Lkotlin/Function1;", "", "", "onTapEmbed", "bind", "Lcom/discord/chat/presentation/message/view/SafetyPolicyNoticeView;", "safetyPolicyNoticeView", "Lcom/discord/chat/presentation/message/view/SafetyPolicyNoticeView;", "<init>", "(Lcom/discord/chat/presentation/message/view/SafetyPolicyNoticeView;)V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SafetyPolicyNoticeViewHolder extends MessagePartViewHolder {
    private final SafetyPolicyNoticeView safetyPolicyNoticeView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyPolicyNoticeViewHolder(SafetyPolicyNoticeView safetyPolicyNoticeView) {
        super(safetyPolicyNoticeView, null);
        C9612q.m13917h(safetyPolicyNoticeView, "safetyPolicyNoticeView");
        this.safetyPolicyNoticeView = safetyPolicyNoticeView;
    }

    public final void bind(SafetyPolicyNoticeMessageAccessory accessory, Function1<? super String, Unit> onTapEmbed) {
        C9612q.m13917h(accessory, "accessory");
        C9612q.m13917h(onTapEmbed, "onTapEmbed");
        this.safetyPolicyNoticeView.setContent(accessory.getSafetyPolicyNoticeEmbed().getTitleText(), accessory.getSafetyPolicyNoticeEmbed().getSubtitleText(), accessory.getSafetyPolicyNoticeEmbed().getDescriptionText(), accessory.getSafetyPolicyNoticeEmbed().getCtaText(), accessory.getSafetyPolicyNoticeEmbed().getClassificationId(), onTapEmbed);
    }
}
