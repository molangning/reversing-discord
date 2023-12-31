package com.discord.chat.presentation.message.system;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.C2912R;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.MessageKt;
import com.discord.chat.bridge.MessageState;
import com.discord.chat.bridge.MessageType;
import com.discord.chat.bridge.activityinviteembed.ActivityInviteEmbed;
import com.discord.chat.bridge.automod.AutoModerationContext;
import com.discord.chat.bridge.automod.FlaggedMessageEmbed;
import com.discord.chat.bridge.channelprompt.ChannelPromptData;
import com.discord.chat.bridge.connectionsroletag.ConnectionsRoleTag;
import com.discord.chat.bridge.ephemeral.EphemeralIndication;
import com.discord.chat.bridge.executedcommand.ExecutedCommand;
import com.discord.chat.bridge.feedback.SurveyIndication;
import com.discord.chat.bridge.forums.ForumPostActions;
import com.discord.chat.bridge.gift.GiftEmbed;
import com.discord.chat.bridge.interaction.InteractionStatus;
import com.discord.chat.bridge.policynotice.SafetyPolicyNoticeEmbed;
import com.discord.chat.bridge.polls.PollData;
import com.discord.chat.bridge.reaction.MessageReaction;
import com.discord.chat.bridge.referencedmessage.ReferencedMessage;
import com.discord.chat.bridge.sticker.Sticker;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.threads.ThreadEmbed;
import com.discord.chat.databinding.AutomodSystemMessageViewBinding;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.ThreadStarterMessageHeaderView;
import com.discord.chat.presentation.message.messagepart.AutoModerationNotificationEmbedAccessory;
import com.discord.chat.presentation.message.messagepart.FlaggedMessageActionBarAccessory;
import com.discord.chat.presentation.message.messagepart.FlaggedMessageEmbedAccessory;
import com.discord.chat.presentation.message.messagepart.MessageAccessory;
import com.discord.chat.presentation.message.messagepart.ReactionsMessageAccessory;
import com.discord.chat.presentation.message.messagepart.ThreadEmbedMessageAccessory;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.discord.chat.presentation.root.MessageContext;
import com.discord.chat.presentation.spine.SpineParentMessage;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.primitives.UserId;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration;
import com.discord.ripple.RippleUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0003J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u000eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u000eH\u0002J\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\"2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020'H\u0016J\u000e\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020*J6\u0010+\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\b\b\u0002\u0010\r\u001a\u00020\u000eJ\r\u0010.\u001a\u00020/H\u0016¢\u0006\u0002\u00100R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u00061"}, m14357d2 = {"Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/discord/recycler_view/decorations/VerticalSpacingItemDecoration$SpacingProviderView;", "Lcom/discord/chat/presentation/spine/SpineParentMessage;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "accessories", "Ljava/util/ArrayList;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "Lkotlin/collections/ArrayList;", "allowChildGestures", "", "binding", "Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;", "spineOriginView", "Landroid/view/View;", "getSpineOriginView", "()Landroid/view/View;", "configureAuthor", "", "message", "Lcom/discord/chat/bridge/Message;", "automodContext", "Lcom/discord/chat/bridge/automod/AutoModerationContext;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "configureCommunicationDisabled", "isCommunicationDisabled", "configureDivider", "showDivider", "generateMessageAccessories", "", "messageContext", "Lcom/discord/chat/presentation/root/MessageContext;", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "setAccessoriesRecycledViewPool", "recycledViewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "setMessage", "componentProvider", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "spacingPxOverride", "", "()Ljava/lang/Integer;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class AutomodSystemMessageView extends ConstraintLayout implements VerticalSpacingItemDecoration.SpacingProviderView, SpineParentMessage {
    private ArrayList<MessageAccessory> accessories;
    private boolean allowChildGestures;
    private final AutomodSystemMessageViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutomodSystemMessageView(Context context) {
        this(context, null, 2, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ AutomodSystemMessageView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    @SuppressLint({"SetTextI18n"})
    private final void configureAuthor(Message message, final AutoModerationContext autoModerationContext, final ChatEventHandler chatEventHandler) {
        boolean z;
        int i;
        SimpleDraweeView simpleDraweeView = this.binding.authorAvatar;
        Context context = getContext();
        C9612q.m13918g(context, "context");
        simpleDraweeView.setImageURI(MessageKt.avatarUrl(message, context));
        this.binding.authorName.setText(message.getUsername());
        this.binding.messageTagView.m41654configureTagVieweCJZyo(autoModerationContext.getHeaderBadgeText(), Boolean.FALSE, null, null, null, chatEventHandler, message.m41436getId3Eiw7ao(), message.m41434getChannelIdo4g7jtM(), message.getTagType());
        this.binding.automodMessageContextHeader.setText(autoModerationContext.getHeaderText());
        this.binding.timestamp.setText(message.getTimestamp());
        TextView configureAuthor$lambda$8 = this.binding.automodMessageChannel;
        String channelName = autoModerationContext.getMessage().getChannelName();
        if (channelName == null) {
            channelName = "channel";
        }
        configureAuthor$lambda$8.setText("#" + channelName);
        C9612q.m13918g(configureAuthor$lambda$8, "configureAuthor$lambda$8");
        if (autoModerationContext.getMessage().getChannelName() != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        configureAuthor$lambda$8.setVisibility(i);
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(configureAuthor$lambda$8, false, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.system.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AutomodSystemMessageView.configureAuthor$lambda$8$lambda$7(ChatEventHandler.this, autoModerationContext, view);
            }
        }, 1, null);
    }

    public static final void configureAuthor$lambda$8$lambda$7(ChatEventHandler eventHandler, AutoModerationContext automodContext, View view) {
        String str;
        C9612q.m13917h(eventHandler, "$eventHandler");
        C9612q.m13917h(automodContext, "$automodContext");
        String m42054toStringimpl = ChannelId.m42054toStringimpl(automodContext.getMessage().m41444getChannelIdo4g7jtM());
        GuildId m41445getGuildIdqOKuAAo = automodContext.getMessage().m41445getGuildIdqOKuAAo();
        if (m41445getGuildIdqOKuAAo != null) {
            str = GuildId.m42067toStringimpl(m41445getGuildIdqOKuAAo.m42069unboximpl());
        } else {
            str = null;
        }
        eventHandler.onTapChannel(m42054toStringimpl, str, null);
    }

    private final void configureCommunicationDisabled(boolean z) {
        int i;
        float f;
        SimpleDraweeView configureCommunicationDisabled$lambda$9 = this.binding.guildCommunicationDisabledIcon;
        C9612q.m13918g(configureCommunicationDisabled$lambda$9, "configureCommunicationDisabled$lambda$9");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        configureCommunicationDisabled$lambda$9.setVisibility(i);
        if (z) {
            ReactAssetUtilsKt.setReactAsset(configureCommunicationDisabled$lambda$9, ReactAsset.ClockTimeout);
        }
        SimpleDraweeView simpleDraweeView = this.binding.authorAvatar;
        if (z) {
            f = 0.5f;
        } else {
            f = 1.0f;
        }
        simpleDraweeView.setAlpha(f);
    }

    private final void configureDivider(boolean z) {
        int i;
        View view = this.binding.messageHeaderDivider;
        C9612q.m13918g(view, "binding.messageHeaderDivider");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    private final List<MessageAccessory> generateMessageAccessories(Message message, MessageContext messageContext) {
        boolean z;
        List<MessageReaction> reactions;
        this.accessories.clear();
        AutoModerationContext autoModerationContext = message.getAutoModerationContext();
        if (autoModerationContext == null) {
            return this.accessories;
        }
        FlaggedMessageEmbed message2 = autoModerationContext.getMessage();
        MessageType messageType = MessageType.DEFAULT;
        String m41446getId3Eiw7ao = message2.m41446getId3Eiw7ao();
        long m41444getChannelIdo4g7jtM = message2.m41444getChannelIdo4g7jtM();
        GuildId m41445getGuildIdqOKuAAo = message2.m41445getGuildIdqOKuAAo();
        UserId m41447getUserIdwUX8bhU = message2.m41447getUserIdwUX8bhU();
        String username = message2.getUsername();
        String avatarURL = message2.getAvatarURL();
        StructurableText content = message2.getContent();
        int usernameColor = message2.getUsernameColor();
        Integer roleColor = message2.getRoleColor();
        boolean shouldShowRoleDot = message2.getShouldShowRoleDot();
        Boolean communicationDisabled = message2.getCommunicationDisabled();
        boolean z2 = false;
        if (communicationDisabled != null) {
            z = communicationDisabled.booleanValue();
        } else {
            z = false;
        }
        Message message3 = new Message(messageType, m41446getId3Eiw7ao, (String) null, m41444getChannelIdo4g7jtM, m41445getGuildIdqOKuAAo, (MessageState) null, m41447getUserIdwUX8bhU, 0L, (String) null, (Float) null, (String) null, username, Integer.valueOf(usernameColor), roleColor, shouldShowRoleDot, false, (Integer) null, avatarURL, (String) null, (List) null, (List) null, (Float) null, content, (List) null, (List) null, (Boolean) null, (List) null, (List) null, message.getRoleIcon(), (ConnectionsRoleTag) null, (ThreadEmbed) null, false, (Boolean) null, (Boolean) null, (ReferencedMessage) null, (ExecutedCommand) null, (List) null, (String) null, Boolean.valueOf(z), (String) null, (Boolean) null, (Integer) null, (Integer) null, (String) null, (String) null, (Boolean) null, (Integer) null, (Integer) null, (EphemeralIndication) null, (SurveyIndication) null, (InteractionStatus) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, (Boolean) null, (Boolean) null, (Long) null, (Sticker) null, (String) null, (String) null, (Boolean) null, (ActivityInviteEmbed) null, false, (ForumPostActions) null, autoModerationContext, (List) null, (GiftEmbed) null, (Integer) null, (List) null, (ChannelPromptData) null, (SafetyPolicyNoticeEmbed) null, (PollData) null, 1874692004, -65, 4079, (DefaultConstructorMarker) null);
        if (autoModerationContext.getNotification() != null) {
            this.accessories.add(new AutoModerationNotificationEmbedAccessory(message3.m41436getId3Eiw7ao(), message, autoModerationContext, null));
        } else {
            this.accessories.add(new FlaggedMessageEmbedAccessory(message3.m41436getId3Eiw7ao(), message3, messageContext, null));
            this.accessories.add(new FlaggedMessageActionBarAccessory(message3.m41436getId3Eiw7ao(), message, autoModerationContext, null));
        }
        if (message.getReactions() != null && (!reactions.isEmpty())) {
            z2 = true;
        }
        if (z2) {
            this.accessories.add(new ReactionsMessageAccessory(message.m41436getId3Eiw7ao(), message.getReactions(), messageContext.getCanAddNewReactions(), messageContext.getUseAddBurstReaction(), messageContext.getAddReactionLabel(), messageContext.getAddNewReactionAccessibilityLabel(), messageContext.getAddNewBurstReactionAccessibilityLabel(), messageContext.getReactionsTheme(), null, null));
        }
        ThreadEmbed threadEmbed = message.getThreadEmbed();
        if (threadEmbed != null) {
            this.accessories.add(new ThreadEmbedMessageAccessory(message.m41436getId3Eiw7ao(), threadEmbed, null));
        }
        return this.accessories;
    }

    public static /* synthetic */ void setMessage$default(AutomodSystemMessageView automodSystemMessageView, Message message, MessageContext messageContext, ChatEventHandler chatEventHandler, ComponentProvider componentProvider, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            chatEventHandler = ChatEventHandler.Empty.INSTANCE;
        }
        ChatEventHandler chatEventHandler2 = chatEventHandler;
        if ((i & 8) != 0) {
            componentProvider = null;
        }
        ComponentProvider componentProvider2 = componentProvider;
        if ((i & 16) != 0) {
            z = true;
        }
        automodSystemMessageView.setMessage(message, messageContext, chatEventHandler2, componentProvider2, z);
    }

    @Override // com.discord.chat.presentation.spine.SpineParentMessage
    public View getSpineOriginView() {
        SimpleDraweeView simpleDraweeView = this.binding.authorAvatar;
        C9612q.m13918g(simpleDraweeView, "binding.authorAvatar");
        return simpleDraweeView;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        C9612q.m13917h(ev, "ev");
        return !this.allowChildGestures;
    }

    public final void setAccessoriesRecycledViewPool(RecyclerView.RecycledViewPool recycledViewPool) {
        C9612q.m13917h(recycledViewPool, "recycledViewPool");
        this.binding.accessoriesView.setRecycledViewPool(recycledViewPool);
    }

    public final void setMessage(Message message, MessageContext messageContext, ChatEventHandler eventHandler, ComponentProvider componentProvider, boolean z) {
        boolean z2;
        C9612q.m13917h(message, "message");
        C9612q.m13917h(messageContext, "messageContext");
        C9612q.m13917h(eventHandler, "eventHandler");
        this.allowChildGestures = z;
        AutoModerationContext autoModerationContext = message.getAutoModerationContext();
        if (autoModerationContext == null) {
            return;
        }
        configureAuthor(message, autoModerationContext, eventHandler);
        configureCommunicationDisabled(C9612q.m13922c(message.getCommunicationDisabled(), Boolean.TRUE));
        configureDivider(messageContext.getShowDivider());
        String threadStarterMessageHeader = message.getThreadStarterMessageHeader();
        ThreadStarterMessageHeaderView threadStarterMessageHeaderView = this.binding.threadStarterHeader;
        if (message.getReferencedMessage() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        threadStarterMessageHeaderView.configure(threadStarterMessageHeader, z2);
        this.binding.replyPreview.clear();
        this.binding.accessoriesView.m41652setAccessoriesRC8ZMxU(message.m41436getId3Eiw7ao(), message.m41434getChannelIdo4g7jtM(), message.m41435getGuildIdqOKuAAo(), generateMessageAccessories(message, messageContext), eventHandler, componentProvider);
    }

    @Override // com.discord.recycler_view.decorations.VerticalSpacingItemDecoration.SpacingProviderView
    public Integer spacingPxOverride() {
        return Integer.valueOf(SizeUtilsKt.getDpToPx(8));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutomodSystemMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9612q.m13917h(context, "context");
        AutomodSystemMessageViewBinding inflate = AutomodSystemMessageViewBinding.inflate(LayoutInflater.from(context), this);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        this.allowChildGestures = true;
        RippleUtilsKt.addRipple$default(this, false, SizeUtilsKt.getDpToPx(4), 1, null);
        inflate.messageHeaderDivider.setBackgroundColor(ColorUtilsKt.getThemeColor(context, C2912R.color.message_divider_light, C2912R.color.message_divider_dark));
        TextView _init_$lambda$0 = inflate.messageHeaderTitle;
        _init_$lambda$0.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        C9612q.m13918g(_init_$lambda$0, "_init_$lambda$0");
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$0, discordFont);
        TextView _init_$lambda$1 = inflate.messageHeaderSubtitle;
        _init_$lambda$1.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        C9612q.m13918g(_init_$lambda$1, "_init_$lambda$1");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$1, DiscordFont.PrimaryNormal);
        TextView _init_$lambda$2 = inflate.authorName;
        _init_$lambda$2.setTextColor(ThemeManagerKt.getTheme().getTextBrand());
        C9612q.m13918g(_init_$lambda$2, "_init_$lambda$2");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$2, discordFont);
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$2, 16.0f, 20.0f);
        SimpleDraweeView simpleDraweeView = inflate.authorAvatar;
        C9612q.m13918g(simpleDraweeView, "binding.authorAvatar");
        ViewClippingUtilsKt.clipToCircle(simpleDraweeView);
        TextView _init_$lambda$3 = inflate.automodMessageContextHeader;
        C9612q.m13918g(_init_$lambda$3, "_init_$lambda$3");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$3, discordFont);
        _init_$lambda$3.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$3, 16.0f, 20.0f);
        TextView _init_$lambda$4 = inflate.automodMessageChannel;
        _init_$lambda$4.setBackgroundColor(ColorUtilsKt.getThemeColor(context, C2912R.color.brand_500, C2912R.color.brand_600));
        _init_$lambda$4.setTextColor(ColorUtilsKt.getThemeColor(context, C2912R.color.white_100, C2912R.color.white_160));
        C9612q.m13918g(_init_$lambda$4, "_init_$lambda$4");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$4, discordFont);
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$4, 12.0f, 15.0f);
        ViewClippingUtilsKt.clipToRoundedRectangle(_init_$lambda$4, SizeUtilsKt.getDpToPx(4));
        TextView _init_$lambda$5 = inflate.timestamp;
        C9612q.m13918g(_init_$lambda$5, "_init_$lambda$5");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$5, DiscordFont.PrimaryMedium);
        _init_$lambda$5.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$5, 12.0f, 15.0f);
        this.accessories = new ArrayList<>(2);
    }
}