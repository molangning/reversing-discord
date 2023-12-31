package com.discord.chat.presentation.message.system;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.C2912R;
import com.discord.chat.bridge.MediaType;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.MessageKt;
import com.discord.chat.bridge.MessageType;
import com.discord.chat.bridge.embed.Embed;
import com.discord.chat.bridge.ephemeral.EphemeralIndication;
import com.discord.chat.bridge.policynotice.SafetyPolicyNoticeEmbed;
import com.discord.chat.bridge.reaction.MessageReaction;
import com.discord.chat.bridge.sticker.Sticker;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.threads.ThreadEmbed;
import com.discord.chat.databinding.SystemMessageViewBinding;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.MessageAccessoriesView;
import com.discord.chat.presentation.message.messagepart.ChannelPromptActionsAccessory;
import com.discord.chat.presentation.message.messagepart.EmbedMessageAccessory;
import com.discord.chat.presentation.message.messagepart.EphemeralIndicationMessageAccessory;
import com.discord.chat.presentation.message.messagepart.InviteToSpeakAccessory;
import com.discord.chat.presentation.message.messagepart.MessageAccessory;
import com.discord.chat.presentation.message.messagepart.MessageContentAccessory;
import com.discord.chat.presentation.message.messagepart.ReactionsMessageAccessory;
import com.discord.chat.presentation.message.messagepart.RoleSubscriptionPurchaseAccessory;
import com.discord.chat.presentation.message.messagepart.SafetyPolicyNoticeMessageAccessory;
import com.discord.chat.presentation.message.messagepart.ThreadEmbedMessageAccessory;
import com.discord.chat.presentation.message.messagepart.TimestampMessageAccessory;
import com.discord.chat.presentation.message.messagepart.WelcomeStickerAccessory;
import com.discord.chat.presentation.root.MessageContext;
import com.discord.chat.presentation.spine.SpineParentMessage;
import com.discord.fonts.DiscordFont;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.ripple.RippleUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C9545j;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u001cH\u0002J\u001c\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000f0\u001e2\u0006\u0010 \u001a\u00020!H\u0002J\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%J \u0010&\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u001c2\b\b\u0002\u0010'\u001a\u00020(R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m14357d2 = {"Lcom/discord/chat/presentation/message/system/SystemMessageView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/discord/chat/presentation/spine/SpineParentMessage;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "accessories", "Ljava/util/ArrayList;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "Lkotlin/collections/ArrayList;", "binding", "Lcom/discord/chat/databinding/SystemMessageViewBinding;", "greenIconColor", "", "normalIconColor", "pinkIconColor", "redIconColor", "spineOriginView", "Landroid/view/View;", "getSpineOriginView", "()Landroid/view/View;", "warnIconColor", "generateMessageAccessories", "", "message", "Lcom/discord/chat/bridge/Message;", "Lcom/discord/chat/presentation/root/MessageContext;", "getIconAndColor", "Lkotlin/Pair;", "Lcom/discord/react_asset_fetcher/ReactAsset;", "messageType", "Lcom/discord/chat/bridge/MessageType;", "setAccessoriesRecycledViewPool", "", "recycledViewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "setMessage", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SystemMessageView extends ConstraintLayout implements SpineParentMessage {
    private ArrayList<MessageAccessory> accessories;
    private final SystemMessageViewBinding binding;
    private final int greenIconColor;
    private final int normalIconColor;
    private final int pinkIconColor;
    private final int redIconColor;
    private final int warnIconColor;

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageType.values().length];
            try {
                iArr[MessageType.USER_JOIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageType.ROLE_SUBSCRIPTION_PURCHASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageType.RECIPIENT_ADD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageType.GUILD_STREAM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MessageType.GUILD_INVITE_REMINDER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MessageType.PRIVATE_CHANNEL_INTEGRATION_ADDED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MessageType.GUILD_DEADCHAT_REVIVE_PROMPT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MessageType.GUILD_GAMING_STATS_PROMPT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[MessageType.RECIPIENT_REMOVE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[MessageType.PRIVATE_CHANNEL_INTEGRATION_REMOVED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[MessageType.CHANNEL_NAME_CHANGE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[MessageType.CHANNEL_ICON_CHANGE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[MessageType.CHANNEL_PINNED_MESSAGE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[MessageType.GUILD_APPLICATION_PREMIUM_SUBSCRIPTION.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[MessageType.USER_PREMIUM_GUILD_SUBSCRIPTION.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[MessageType.USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[MessageType.USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[MessageType.USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_3.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[MessageType.CHANNEL_FOLLOW_ADD.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[MessageType.GUILD_DISCOVERY_DISQUALIFIED.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[MessageType.GUILD_DISCOVERY_REQUALIFIED.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[MessageType.GUILD_DISCOVERY_GRACE_PERIOD_INITIAL_WARNING.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[MessageType.GUILD_DISCOVERY_GRACE_PERIOD_FINAL_WARNING.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[MessageType.THREAD_CREATED.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[MessageType.THREAD_STARTER_MESSAGE.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[MessageType.STAGE_START.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[MessageType.STAGE_END.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[MessageType.STAGE_TOPIC.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[MessageType.STAGE_SPEAKER.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[MessageType.STAGE_RAISE_HAND.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[MessageType.GUILD_INCIDENT_ALERT_MODE_ENABLED.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[MessageType.GUILD_INCIDENT_ALERT_MODE_DISABLED.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SystemMessageView(Context context) {
        this(context, null, 2, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ SystemMessageView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final List<MessageAccessory> generateMessageAccessories(Message message, MessageContext messageContext) {
        int i;
        Message message2;
        boolean z;
        int dimensionPixelSize;
        this.accessories.clear();
        Integer constrainedWidth = message.getConstrainedWidth();
        if (constrainedWidth != null) {
            i = constrainedWidth.intValue();
        } else {
            i = getResources().getDisplayMetrics().widthPixels;
        }
        StructurableText content = message.getContent();
        boolean z2 = false;
        if (content != null) {
            ArrayList<MessageAccessory> arrayList = this.accessories;
            String m41436getId3Eiw7ao = message.m41436getId3Eiw7ao();
            boolean shouldAnimateEmoji = MessageKt.shouldAnimateEmoji(message);
            boolean shouldShowRoleDot = message.getShouldShowRoleDot();
            boolean shouldShowRoleOnName = message.getShouldShowRoleOnName();
            if (message.getTimestamp() != null) {
                dimensionPixelSize = 0;
            } else {
                dimensionPixelSize = getResources().getDimensionPixelSize(C2912R.dimen.message_accessories_vertical_spacing);
            }
            arrayList.add(new MessageContentAccessory(m41436getId3Eiw7ao, content, shouldAnimateEmoji, shouldShowRoleDot, shouldShowRoleOnName, dimensionPixelSize, ThemeManagerKt.getTheme().getTextNormal(), ThemeManagerKt.getTheme().getTextNormal(), DiscordFont.PrimaryNormal, 16, true, i, null, null, null, 24576, null));
        }
        String timestamp = message.getTimestamp();
        if (timestamp != null) {
            this.accessories.add(new TimestampMessageAccessory(message.m41436getId3Eiw7ao(), timestamp, ThemeManagerKt.getTheme().getTextMuted(), DiscordFont.PrimaryMedium, null));
        }
        Integer totalMonthsSubscribed = message.getTotalMonthsSubscribed();
        boolean z3 = true;
        if (totalMonthsSubscribed != null && totalMonthsSubscribed.intValue() <= 1) {
            ArrayList<MessageAccessory> arrayList2 = this.accessories;
            String m41436getId3Eiw7ao2 = message.m41436getId3Eiw7ao();
            String username = message.getUsername();
            Context context = this.binding.getRoot().getContext();
            C9612q.m13918g(context, "binding.root.context");
            message2 = message;
            arrayList2.add(new RoleSubscriptionPurchaseAccessory(m41436getId3Eiw7ao2, username, MessageKt.avatarUrl(message2, context), i, null));
        } else {
            message2 = message;
        }
        Sticker sticker = message.getSticker();
        if (sticker != null) {
            this.accessories.add(new WelcomeStickerAccessory(message2, sticker));
        }
        if (message.getType() == MessageType.STAGE_RAISE_HAND && C9612q.m13922c(message.getShowInviteToSpeakButton(), Boolean.TRUE)) {
            this.accessories.add(new InviteToSpeakAccessory(message2));
        }
        if (message.getType() != MessageType.GUILD_DEADCHAT_REVIVE_PROMPT && message.getType() != MessageType.GUILD_GAMING_STATS_PROMPT) {
            z = true;
        } else {
            List<Embed> embeds = message.getEmbeds();
            if (embeds != null) {
                int i2 = 0;
                for (Iterator it = embeds.iterator(); it.hasNext(); it = it) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        C9545j.m14094s();
                    }
                    this.accessories.add(new EmbedMessageAccessory(message.m41436getId3Eiw7ao(), i2, i, 16, (Embed) next, false, false, false, false, null, null, null));
                    z3 = z3;
                    i2 = i3;
                }
            }
            z = z3;
            this.accessories.add(new ChannelPromptActionsAccessory(message));
        }
        List<MessageReaction> reactions = message.getReactions();
        if (reactions != null && (reactions.isEmpty() ^ z) == z) {
            z2 = z;
        }
        if (z2) {
            this.accessories.add(new ReactionsMessageAccessory(message.m41436getId3Eiw7ao(), message.getReactions(), messageContext.getCanAddNewReactions(), messageContext.getUseAddBurstReaction(), messageContext.getAddReactionLabel(), messageContext.getAddNewReactionAccessibilityLabel(), messageContext.getAddNewBurstReactionAccessibilityLabel(), messageContext.getReactionsTheme(), null, null));
        }
        ThreadEmbed threadEmbed = message.getThreadEmbed();
        if (threadEmbed != null) {
            this.accessories.add(new ThreadEmbedMessageAccessory(message.m41436getId3Eiw7ao(), threadEmbed, null));
        }
        EphemeralIndication ephemeralIndication = message.getEphemeralIndication();
        if (ephemeralIndication != null) {
            this.accessories.add(new EphemeralIndicationMessageAccessory(message.m41436getId3Eiw7ao(), ephemeralIndication, null));
        }
        SafetyPolicyNoticeEmbed safetyPolicyNoticeEmbed = message.getSafetyPolicyNoticeEmbed();
        if (safetyPolicyNoticeEmbed != null) {
            this.accessories.add(new SafetyPolicyNoticeMessageAccessory(message.m41436getId3Eiw7ao(), safetyPolicyNoticeEmbed, null));
        }
        return this.accessories;
    }

    private final Pair<ReactAsset, Integer> getIconAndColor(MessageType messageType) {
        switch (WhenMappings.$EnumSwitchMapping$0[messageType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return C11591x.m7577a(ReactAsset.ArrowForward, Integer.valueOf(this.greenIconColor));
            case 9:
            case 10:
                return C11591x.m7577a(ReactAsset.ArrowBack, Integer.valueOf(this.redIconColor));
            case 11:
            case 12:
                return C11591x.m7577a(ReactAsset.Pencil, Integer.valueOf(this.normalIconColor));
            case 13:
                return C11591x.m7577a(ReactAsset.Pin, Integer.valueOf(this.normalIconColor));
            case 14:
                return C11591x.m7577a(ReactAsset.Ticket, Integer.valueOf(this.normalIconColor));
            case 15:
            case 16:
            case 17:
            case 18:
                return C11591x.m7577a(ReactAsset.MemberListBadge, Integer.valueOf(this.pinkIconColor));
            case 19:
                return C11591x.m7577a(ReactAsset.AnnouncementThread, Integer.valueOf(this.normalIconColor));
            case 20:
                return C11591x.m7577a(ReactAsset.Close, Integer.valueOf(this.redIconColor));
            case 21:
                return C11591x.m7577a(ReactAsset.Check, Integer.valueOf(this.greenIconColor));
            case 22:
            case 23:
                return C11591x.m7577a(ReactAsset.Alert, Integer.valueOf(this.warnIconColor));
            case 24:
            case 25:
                return C11591x.m7577a(ReactAsset.Thread, Integer.valueOf(this.normalIconColor));
            case 26:
                return C11591x.m7577a(ReactAsset.StageChannel, Integer.valueOf(this.greenIconColor));
            case 27:
            case 28:
                return C11591x.m7577a(ReactAsset.StageChannel, Integer.valueOf(this.normalIconColor));
            case 29:
                return C11591x.m7577a(ReactAsset.MoveToSpeaker, Integer.valueOf(this.normalIconColor));
            case 30:
                return C11591x.m7577a(ReactAsset.RaisedHand, Integer.valueOf(this.normalIconColor));
            case 31:
                return C11591x.m7577a(ReactAsset.LockClosed, Integer.valueOf(this.normalIconColor));
            case 32:
                return C11591x.m7577a(ReactAsset.LockOpen, Integer.valueOf(this.normalIconColor));
            default:
                throw new IllegalArgumentException("Unhandled message type: " + messageType);
        }
    }

    public static /* synthetic */ void setMessage$default(SystemMessageView systemMessageView, Message message, MessageContext messageContext, ChatEventHandler chatEventHandler, int i, Object obj) {
        if ((i & 4) != 0) {
            chatEventHandler = ChatEventHandler.Empty.INSTANCE;
        }
        systemMessageView.setMessage(message, messageContext, chatEventHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setMessage$lambda$0(Message message, ChatEventHandler eventHandler, View view) {
        C9612q.m13917h(message, "$message");
        C9612q.m13917h(eventHandler, "$eventHandler");
        if (MessageKt.isEphemeral(message)) {
            return false;
        }
        Function4<MessageId, ChannelId, Integer, MediaType, Unit> mo41622getOnMessageLongPressed = eventHandler.mo41622getOnMessageLongPressed();
        if (mo41622getOnMessageLongPressed != null) {
            mo41622getOnMessageLongPressed.invoke(MessageId.m42073boximpl(message.m41436getId3Eiw7ao()), ChannelId.m42047boximpl(message.m41434getChannelIdo4g7jtM()), null, null);
        }
        return true;
    }

    @Override // com.discord.chat.presentation.spine.SpineParentMessage
    public View getSpineOriginView() {
        SimpleDraweeView simpleDraweeView = this.binding.icon;
        C9612q.m13918g(simpleDraweeView, "binding.icon");
        return simpleDraweeView;
    }

    public final void setAccessoriesRecycledViewPool(RecyclerView.RecycledViewPool recycledViewPool) {
        C9612q.m13917h(recycledViewPool, "recycledViewPool");
        this.binding.accessoriesView.setRecycledViewPool(recycledViewPool);
    }

    public final void setMessage(final Message message, MessageContext context, final ChatEventHandler eventHandler) {
        int i;
        C9612q.m13917h(message, "message");
        C9612q.m13917h(context, "context");
        C9612q.m13917h(eventHandler, "eventHandler");
        View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() { // from class: com.discord.chat.presentation.message.system.b
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean message$lambda$0;
                message$lambda$0 = SystemMessageView.setMessage$lambda$0(Message.this, eventHandler, view);
                return message$lambda$0;
            }
        };
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested(this, true, onLongClickListener);
        Pair<ReactAsset, Integer> iconAndColor = getIconAndColor(message.getType());
        int intValue = iconAndColor.m14350b().intValue();
        SimpleDraweeView simpleDraweeView = this.binding.icon;
        C9612q.m13918g(simpleDraweeView, "binding.icon");
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView, iconAndColor.m14351a());
        SimpleDraweeView simpleDraweeView2 = this.binding.icon;
        C9612q.m13918g(simpleDraweeView2, "binding.icon");
        ColorUtilsKt.setTintColor(simpleDraweeView2, Integer.valueOf(intValue));
        List<MessageAccessory> generateMessageAccessories = generateMessageAccessories(message, context);
        this.binding.accessoriesView.m41652setAccessoriesRC8ZMxU(message.m41436getId3Eiw7ao(), message.m41434getChannelIdo4g7jtM(), message.m41435getGuildIdqOKuAAo(), generateMessageAccessories, eventHandler, null);
        MessageAccessoriesView messageAccessoriesView = this.binding.accessoriesView;
        C9612q.m13918g(messageAccessoriesView, "binding.accessoriesView");
        if (!generateMessageAccessories.isEmpty()) {
            i = 0;
        } else {
            i = 8;
        }
        messageAccessoriesView.setVisibility(i);
        this.binding.accessoriesView.setOnCurrentContentViewChanged(new SystemMessageView$setMessage$1(this, message, onLongClickListener));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9612q.m13917h(context, "context");
        this.normalIconColor = ThemeManagerKt.getTheme().getInteractiveNormal();
        this.greenIconColor = ColorUtilsKt.getColorCompat(this, C2912R.color.green_360);
        this.redIconColor = ColorUtilsKt.getColorCompat(this, C2912R.color.red_400);
        this.warnIconColor = ColorUtilsKt.getColorCompat(this, C2912R.color.yellow_300);
        this.pinkIconColor = ColorUtilsKt.getColorCompat(this, C2912R.color.guild_boosting_pink);
        SystemMessageViewBinding inflate = SystemMessageViewBinding.inflate(LayoutInflater.from(context), this);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        RippleUtilsKt.addRipple$default(this, false, 0, 3, null);
        this.accessories = new ArrayList<>(2);
    }
}
