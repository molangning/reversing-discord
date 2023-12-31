package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.SurveyIndicationMessageAccessory;
import com.discord.chat.presentation.message.view.SurveyIndicationView;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m14357d2 = {"Lcom/discord/chat/presentation/message/viewholder/SurveyIndicationViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "surveyIndicationView", "Lcom/discord/chat/presentation/message/view/SurveyIndicationView;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "(Lcom/discord/chat/presentation/message/view/SurveyIndicationView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V", "bind", "", "surveyAccessory", "Lcom/discord/chat/presentation/message/messagepart/SurveyIndicationMessageAccessory;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SurveyIndicationViewHolder extends MessagePartViewHolder {
    private final ChatEventHandler eventHandler;
    private final SurveyIndicationView surveyIndicationView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurveyIndicationViewHolder(SurveyIndicationView surveyIndicationView, ChatEventHandler eventHandler) {
        super(surveyIndicationView, null);
        C9612q.m13917h(surveyIndicationView, "surveyIndicationView");
        C9612q.m13917h(eventHandler, "eventHandler");
        this.surveyIndicationView = surveyIndicationView;
        this.eventHandler = eventHandler;
    }

    public final void bind(SurveyIndicationMessageAccessory surveyAccessory) {
        C9612q.m13917h(surveyAccessory, "surveyAccessory");
        this.surveyIndicationView.m41778setSurveyIndicationu7_MRrM(surveyAccessory.mo41659getMessageId3Eiw7ao(), surveyAccessory.getSurveyIndication(), new SurveyIndicationViewHolder$bind$1$1(this.eventHandler));
    }
}