package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.AudioAttachmentMessageAccessory;
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView;
import com.discord.primitives.UserId;
import com.reactnativecommunity.webview.RNCWebViewManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m14357d2 = {"Lcom/discord/chat/presentation/message/viewholder/VoiceMessageViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "view", "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;", "(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;)V", "bind", "", "accessory", "Lcom/discord/chat/presentation/message/messagepart/AudioAttachmentMessageAccessory;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "attachmentsOpacity", "", "(Lcom/discord/chat/presentation/message/messagepart/AudioAttachmentMessageAccessory;Lcom/discord/chat/presentation/events/ChatEventHandler;Ljava/lang/Float;)V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class VoiceMessageViewHolder extends MessagePartViewHolder {
    private final AudioPlayerView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceMessageViewHolder(AudioPlayerView view) {
        super(view, null);
        C9612q.m13917h(view, "view");
        this.view = view;
    }

    public final void bind(final AudioAttachmentMessageAccessory accessory, final ChatEventHandler eventHandler, Float f) {
        Float durationSecs;
        C9612q.m13917h(accessory, "accessory");
        C9612q.m13917h(eventHandler, "eventHandler");
        Attachment attachment = accessory.getAttachment();
        byte[] waveformByteArray = attachment.getWaveformByteArray();
        if (waveformByteArray != null && (durationSecs = attachment.getDurationSecs()) != null) {
            final float floatValue = durationSecs.floatValue();
            VoiceMessageViewHolder$bind$1$onCancelUpload$1 voiceMessageViewHolder$bind$1$onCancelUpload$1 = new VoiceMessageViewHolder$bind$1$onCancelUpload$1(attachment, eventHandler);
            AudioPlayerView audioPlayerView = this.view;
            audioPlayerView.m41784setSourceUrlntcYbpo(accessory.mo41659getMessageId3Eiw7ao(), accessory.getAttachment().getUrl());
            audioPlayerView.setSampleData(waveformByteArray);
            audioPlayerView.setDurationMs(((float) RNCWebViewManager.COMMAND_CLEAR_FORM_DATA) * floatValue);
            audioPlayerView.setUploadProgress(attachment.getProgress(), voiceMessageViewHolder$bind$1$onCancelUpload$1, f);
            audioPlayerView.shouldAnimate(attachment.isAnimated());
            audioPlayerView.setListener(new AudioPlayerView.Listener() { // from class: com.discord.chat.presentation.message.viewholder.VoiceMessageViewHolder$bind$1$1$1
                @Override // com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView.Listener
                public void voiceMessagePlaybackEnded(float f2, float f3) {
                    ChatEventHandler chatEventHandler = ChatEventHandler.this;
                    String mo41659getMessageId3Eiw7ao = accessory.mo41659getMessageId3Eiw7ao();
                    float f4 = floatValue;
                    UserId m41667getAuthorIdwUX8bhU = accessory.m41667getAuthorIdwUX8bhU();
                    if (m41667getAuthorIdwUX8bhU != null) {
                        chatEventHandler.mo41615voiceMessagePlaybackEndedHuwN0RY(mo41659getMessageId3Eiw7ao, f4, f2, m41667getAuthorIdwUX8bhU.m42120unboximpl(), f3);
                    }
                }

                @Override // com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView.Listener
                public void voiceMessagePlaybackFailed(String str) {
                    ChatEventHandler.this.mo41616voiceMessagePlaybackFailedntcYbpo(accessory.mo41659getMessageId3Eiw7ao(), str);
                }

                @Override // com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView.Listener
                public void voiceMessagePlaybackStarted(float f2) {
                    ChatEventHandler chatEventHandler = ChatEventHandler.this;
                    String mo41659getMessageId3Eiw7ao = accessory.mo41659getMessageId3Eiw7ao();
                    float f3 = floatValue;
                    UserId m41667getAuthorIdwUX8bhU = accessory.m41667getAuthorIdwUX8bhU();
                    if (m41667getAuthorIdwUX8bhU != null) {
                        chatEventHandler.mo41617voiceMessagePlaybackStartedOuNwOLg(mo41659getMessageId3Eiw7ao, f3, f2, m41667getAuthorIdwUX8bhU.m42120unboximpl());
                    }
                }
            });
        }
    }
}