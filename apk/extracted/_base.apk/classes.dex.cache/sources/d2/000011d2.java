package com.discord.chat.presentation.events;

import com.discord.chat.reactevents.ChatScrollPositionEvent;
import com.discord.chat.reactevents.CompleteFirstLayoutData;
import com.discord.chat.reactevents.FirstLayoutData;
import com.discord.chat.reactevents.InitiateEditData;
import com.discord.chat.reactevents.InitiateReplyData;
import com.discord.chat.reactevents.LongPressAvatarData;
import com.discord.chat.reactevents.LongPressChannelData;
import com.discord.chat.reactevents.LongPressCommandData;
import com.discord.chat.reactevents.LongPressLinkData;
import com.discord.chat.reactevents.LongPressMessageEvent;
import com.discord.chat.reactevents.LongPressReactionData;
import com.discord.chat.reactevents.LongPressStickerData;
import com.discord.chat.reactevents.LongPressUsernameData;
import com.discord.chat.reactevents.TapActivityBookmarkEmbedData;
import com.discord.chat.reactevents.TapAutoModerationActionsData;
import com.discord.chat.reactevents.TapAutoModerationFeedbackData;
import com.discord.chat.reactevents.TapAvatarData;
import com.discord.chat.reactevents.TapButtonActionComponent;
import com.discord.chat.reactevents.TapCallData;
import com.discord.chat.reactevents.TapCancelUploadItemData;
import com.discord.chat.reactevents.TapChannelData;
import com.discord.chat.reactevents.TapChannelPromptButtonData;
import com.discord.chat.reactevents.TapCommandData;
import com.discord.chat.reactevents.TapConnectionsRoleTagData;
import com.discord.chat.reactevents.TapCopyText;
import com.discord.chat.reactevents.TapDismissEmbeddedActivityData;
import com.discord.chat.reactevents.TapDismissMediaPostSharePromptData;
import com.discord.chat.reactevents.TapEmojiData;
import com.discord.chat.reactevents.TapFollowForumPost;
import com.discord.chat.reactevents.TapGiftCodeAcceptData;
import com.discord.chat.reactevents.TapGiftCodeEmbedData;
import com.discord.chat.reactevents.TapImageData;
import com.discord.chat.reactevents.TapInviteEvent;
import com.discord.chat.reactevents.TapInviteToSpeakData;
import com.discord.chat.reactevents.TapJoinActivityData;
import com.discord.chat.reactevents.TapJoinEmbeddedActivityData;
import com.discord.chat.reactevents.TapLinkData;
import com.discord.chat.reactevents.TapMentionData;
import com.discord.chat.reactevents.TapMessageData;
import com.discord.chat.reactevents.TapMessageReplyData;
import com.discord.chat.reactevents.TapObscuredMediaLearnMoreData;
import com.discord.chat.reactevents.TapOpTagData;
import com.discord.chat.reactevents.TapPollAnswer;
import com.discord.chat.reactevents.TapPollSubmitVote;
import com.discord.chat.reactevents.TapPostPreviewEmbedData;
import com.discord.chat.reactevents.TapReactionData;
import com.discord.chat.reactevents.TapRemixData;
import com.discord.chat.reactevents.TapRoleIconData;
import com.discord.chat.reactevents.TapSafetyPolicyNoticeEmbed;
import com.discord.chat.reactevents.TapSeeMoreData;
import com.discord.chat.reactevents.TapSelectActionComponent;
import com.discord.chat.reactevents.TapSeparatorData;
import com.discord.chat.reactevents.TapShareForumPost;
import com.discord.chat.reactevents.TapShowAltTextData;
import com.discord.chat.reactevents.TapStickerData;
import com.discord.chat.reactevents.TapSummaryData;
import com.discord.chat.reactevents.TapSummaryJumpData;
import com.discord.chat.reactevents.TapSuppressNotificationsIconData;
import com.discord.chat.reactevents.TapTagData;
import com.discord.chat.reactevents.TapThreadEmbedEvent;
import com.discord.chat.reactevents.TapTimestampEvent;
import com.discord.chat.reactevents.TapUploadProgressCloseData;
import com.discord.chat.reactevents.TapUsernameData;
import com.discord.chat.reactevents.TapWelcomeReplyData;
import com.discord.chat.reactevents.VoiceMessagePlaybackEndedData;
import com.discord.chat.reactevents.VoiceMessagePlaybackFailedData;
import com.discord.chat.reactevents.VoiceMessagePlaybackStartedData;
import com.discord.reactevents.ReactEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.C9591f0;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000¨\u0006\u0002"}, m14357d2 = {"createChatReactEvents", "Lcom/discord/reactevents/ReactEvents;", "chat_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class CreateChatReactEventsKt {
    public static final ReactEvents createChatReactEvents() {
        return new ReactEvents(C11591x.m7577a("onChatScrollPosition", C9591f0.m13969b(ChatScrollPositionEvent.class)), C11591x.m7577a("onLongPressAvatar", C9591f0.m13969b(LongPressAvatarData.class)), C11591x.m7577a("onLongPressMessage", C9591f0.m13969b(LongPressMessageEvent.class)), C11591x.m7577a("onLongPressReaction", C9591f0.m13969b(LongPressReactionData.class)), C11591x.m7577a("onLongPressSticker", C9591f0.m13969b(LongPressStickerData.class)), C11591x.m7577a("onLongPressUsername", C9591f0.m13969b(LongPressUsernameData.class)), C11591x.m7577a("onLongPressCommandMention", C9591f0.m13969b(LongPressCommandData.class)), C11591x.m7577a("onLongPressChannel", C9591f0.m13969b(LongPressChannelData.class)), C11591x.m7577a("onTapAvatar", C9591f0.m13969b(TapAvatarData.class)), C11591x.m7577a("onTapButtonActionComponent", C9591f0.m13969b(TapButtonActionComponent.class)), C11591x.m7577a("onTapCall", C9591f0.m13969b(TapCallData.class)), C11591x.m7577a("onTapChannel", C9591f0.m13969b(TapChannelData.class)), C11591x.m7577a("onTapCopyText", C9591f0.m13969b(TapCopyText.class)), C11591x.m7577a("onTapGiftCodeAccept", C9591f0.m13969b(TapGiftCodeAcceptData.class)), C11591x.m7577a("onTapGiftCodeEmbed", C9591f0.m13969b(TapGiftCodeEmbedData.class)), C11591x.m7577a("onTapImage", C9591f0.m13969b(TapImageData.class)), C11591x.m7577a("onTapInviteEmbed", C9591f0.m13969b(TapInviteEvent.class)), C11591x.m7577a("onTapJoinActivity", C9591f0.m13969b(TapJoinActivityData.class)), C11591x.m7577a("onTapLink", C9591f0.m13969b(TapLinkData.class)), C11591x.m7577a("onLongPressLink", C9591f0.m13969b(LongPressLinkData.class)), C11591x.m7577a("onTapMention", C9591f0.m13969b(TapMentionData.class)), C11591x.m7577a("onTapCommandMention", C9591f0.m13969b(TapCommandData.class)), C11591x.m7577a("onTapMessage", C9591f0.m13969b(TapMessageData.class)), C11591x.m7577a("onTapMessageReply", C9591f0.m13969b(TapMessageReplyData.class)), C11591x.m7577a("onTapSummary", C9591f0.m13969b(TapSummaryData.class)), C11591x.m7577a("onTapSummaryJump", C9591f0.m13969b(TapSummaryJumpData.class)), C11591x.m7577a("onTapReaction", C9591f0.m13969b(TapReactionData.class)), C11591x.m7577a("onTapRoleIcon", C9591f0.m13969b(TapRoleIconData.class)), C11591x.m7577a("onTapSuppressNotificationsIcon", C9591f0.m13969b(TapSuppressNotificationsIconData.class)), C11591x.m7577a("onTapSeeMore", C9591f0.m13969b(TapSeeMoreData.class)), C11591x.m7577a("onInitiateReply", C9591f0.m13969b(InitiateReplyData.class)), C11591x.m7577a("onInitiateEdit", C9591f0.m13969b(InitiateEditData.class)), C11591x.m7577a("onTapConnectionsRoleTag", C9591f0.m13969b(TapConnectionsRoleTagData.class)), C11591x.m7577a("onTapSelectActionComponent", C9591f0.m13969b(TapSelectActionComponent.class)), C11591x.m7577a("onTapSeparator", C9591f0.m13969b(TapSeparatorData.class)), C11591x.m7577a("onTapSticker", C9591f0.m13969b(TapStickerData.class)), C11591x.m7577a("onTapTimestamp", C9591f0.m13969b(TapTimestampEvent.class)), C11591x.m7577a("onTapThreadEmbed", C9591f0.m13969b(TapThreadEmbedEvent.class)), C11591x.m7577a("onTapUsername", C9591f0.m13969b(TapUsernameData.class)), C11591x.m7577a("onTapUploadProgressClose", C9591f0.m13969b(TapUploadProgressCloseData.class)), C11591x.m7577a("onTapCancelUploadItem", C9591f0.m13969b(TapCancelUploadItemData.class)), C11591x.m7577a("onTapWelcomeReply", C9591f0.m13969b(TapWelcomeReplyData.class)), C11591x.m7577a("onTapInviteToSpeak", C9591f0.m13969b(TapInviteToSpeakData.class)), C11591x.m7577a("onTapEmoji", C9591f0.m13969b(TapEmojiData.class)), C11591x.m7577a("onTapFollowForumPost", C9591f0.m13969b(TapFollowForumPost.class)), C11591x.m7577a("onTapShareForumPost", C9591f0.m13969b(TapShareForumPost.class)), C11591x.m7577a("onTapReactionOverflow", C9591f0.m13969b(TapReactionOverflow.class)), C11591x.m7577a("onTapAutoModerationActions", C9591f0.m13969b(TapAutoModerationActionsData.class)), C11591x.m7577a("onTapAutoModerationFeedback", C9591f0.m13969b(TapAutoModerationFeedbackData.class)), C11591x.m7577a("onTapOpTag", C9591f0.m13969b(TapOpTagData.class)), C11591x.m7577a("onTapShowAltText", C9591f0.m13969b(TapShowAltTextData.class)), C11591x.m7577a("onVoiceMessagePlaybackEnded", C9591f0.m13969b(VoiceMessagePlaybackEndedData.class)), C11591x.m7577a("onVoiceMessagePlaybackFailed", C9591f0.m13969b(VoiceMessagePlaybackFailedData.class)), C11591x.m7577a("onVoiceMessagePlaybackStarted", C9591f0.m13969b(VoiceMessagePlaybackStartedData.class)), C11591x.m7577a("onTapJoinEmbeddedActivity", C9591f0.m13969b(TapJoinEmbeddedActivityData.class)), C11591x.m7577a("onTapDismissEmbeddedActivity", C9591f0.m13969b(TapDismissEmbeddedActivityData.class)), C11591x.m7577a("onTapActivityBookmarkEmbed", C9591f0.m13969b(TapActivityBookmarkEmbedData.class)), C11591x.m7577a("onTapPostPreviewEmbed", C9591f0.m13969b(TapPostPreviewEmbedData.class)), C11591x.m7577a("onTapDismissMediaPostSharePrompt", C9591f0.m13969b(TapDismissMediaPostSharePromptData.class)), C11591x.m7577a("onTapTag", C9591f0.m13969b(TapTagData.class)), C11591x.m7577a("onTapRemix", C9591f0.m13969b(TapRemixData.class)), C11591x.m7577a("onTapChannelPromptButton", C9591f0.m13969b(TapChannelPromptButtonData.class)), C11591x.m7577a("onTapObscuredMediaLearnMore", C9591f0.m13969b(TapObscuredMediaLearnMoreData.class)), C11591x.m7577a("onTapSafetyPolicyNoticeEmbed", C9591f0.m13969b(TapSafetyPolicyNoticeEmbed.class)), C11591x.m7577a("onTapPollAnswer", C9591f0.m13969b(TapPollAnswer.class)), C11591x.m7577a("onTapPollSubmitVote", C9591f0.m13969b(TapPollSubmitVote.class)), C11591x.m7577a("onFirstLayout", C9591f0.m13969b(FirstLayoutData.class)), C11591x.m7577a("onCompleteFirstLayout", C9591f0.m13969b(CompleteFirstLayoutData.class)));
    }
}