package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.C2912R;
import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.databinding.GuildEventInviteViewBinding;
import com.discord.core.DCDButton;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.misc.utilities.view.ViewUtilsKt;
import com.discord.primitives.MessageId;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ViewProps;
import com.reactnativecommunity.webview.RNCWebViewManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010:\u001a\u000209\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;\u0012\b\b\u0002\u0010=\u001a\u00020\u0005¢\u0006\u0004\b>\u0010?J \u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\t\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u001a\u0010\u000b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0002J#\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJÇ\u0002\u0010+\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u00192\"\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00070\u001b2*\u0010\u001e\u001a&\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00070\u001d2\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00162\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00070\u00192\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00070\u00192\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070#2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00192\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00070\u00192\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00070\u0019ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020\u00072\b\u0010,\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u001a\u0010.\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002JI\u00103\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010/\u001a\u0004\u0018\u00010\u00052\b\u00100\u001a\u0004\u0018\u00010\u00052\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b3\u00104J\u001a\u00105\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u00102\u001a\u0004\u0018\u000101R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006@"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/GuildEventInviteView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "iconUrl", "text", "", ViewProps.COLOR, "", "setHeader", "setCreatorAvatar", "count", "setBadge", "setTitle", "(Ljava/lang/String;Ljava/lang/Integer;)Lkotlin/Unit;", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "description", "Lcom/discord/primitives/MessageId;", "messageId", "", "shouldAnimateEmoji", "shouldShowRoleDot", "shouldShowRoleOnName", "Lkotlin/Function2;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "onTapLink", "Lkotlin/Function1;", "onLongTapLink", "Lkotlin/Function3;", "onTapChannel", "Lkotlin/Function4;", "onLongPressChannel", "onTapMention", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "onTapCommand", "onLongPressCommand", "Lkotlin/Function0;", "onTapSpoiler", "onTapTimestamp", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "onTapEmoji", "onTapSeeMore", "setDescription-KZKlO-o", "(Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;ZZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "setDescription", ZeroconfModule.KEY_SERVICE_NAME, "setGuild", "setChannel", ViewProps.BORDER_COLOR, ViewProps.BACKGROUND_COLOR, "Landroid/view/View$OnClickListener;", "listener", "setAcceptButton", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/view/View$OnClickListener;)V", "setSecondaryButton", "Lcom/discord/chat/databinding/GuildEventInviteViewBinding;", "binding", "Lcom/discord/chat/databinding/GuildEventInviteViewBinding;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class GuildEventInviteView extends ConstraintLayout {
    private final GuildEventInviteViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GuildEventInviteView(Context context) {
        this(context, null, 0, 6, null);
        C9612q.m13917h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GuildEventInviteView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ GuildEventInviteView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void setAcceptButton(String str, String str2, Integer num, Integer num2, Integer num3, View.OnClickListener onClickListener) {
        DCDButton dCDButton = this.binding.acceptButton;
        if (str != null) {
            dCDButton.setIcon(str, SizeUtilsKt.getDpToPx(24));
        }
        dCDButton.setText(str2);
        dCDButton.setTextColor(num);
        dCDButton.setBackgroundColor(num3);
        dCDButton.setBorderColor(num2);
        dCDButton.setOnClickButtonListener(onClickListener);
    }

    public final void setBadge(String str, String str2) {
        GuildEventInviteViewBinding guildEventInviteViewBinding = this.binding;
        SimpleDraweeView badgeIcon = guildEventInviteViewBinding.badgeIcon;
        C9612q.m13918g(badgeIcon, "badgeIcon");
        ReactAssetUtilsKt.setOptionalReactImageUrl(badgeIcon, str);
        guildEventInviteViewBinding.badgeText.setText(str2);
    }

    public final void setChannel(String str, String str2) {
        GuildEventInviteViewBinding guildEventInviteViewBinding = this.binding;
        SimpleDraweeView channelIcon = guildEventInviteViewBinding.channelIcon;
        C9612q.m13918g(channelIcon, "channelIcon");
        ReactAssetUtilsKt.setOptionalReactImageUrl(channelIcon, str);
        TextView channelName = guildEventInviteViewBinding.channelName;
        C9612q.m13918g(channelName, "channelName");
        ViewUtilsKt.setOptionalText(channelName, str2);
        guildEventInviteViewBinding.channelIcon.setColorFilter(new PorterDuffColorFilter(ThemeManagerKt.getTheme().getHeaderSecondary(), PorterDuff.Mode.SRC_ATOP));
    }

    public final void setCreatorAvatar(String str) {
        SimpleDraweeView simpleDraweeView = this.binding.creatorAvatar;
        C9612q.m13918g(simpleDraweeView, "binding.creatorAvatar");
        ReactAssetUtilsKt.setOptionalReactImageUrl(simpleDraweeView, str);
    }

    /* renamed from: setDescription-KZKlO-o */
    public final void m41768setDescriptionKZKlOo(StructurableText structurableText, String messageId, boolean z, boolean z2, boolean z3, Function2<? super MessageId, ? super LinkContentNode, Unit> onTapLink, Function1<? super LinkContentNode, Unit> onLongTapLink, Function3<? super String, ? super String, ? super String, Unit> onTapChannel, Function4<? super String, ? super String, ? super String, ? super String, Unit> onLongPressChannel, Function2<? super String, ? super String, Unit> onTapMention, Function1<? super CommandMentionContentNode, Unit> onTapCommand, Function1<? super CommandMentionContentNode, Unit> onLongPressCommand, Function0<Unit> onTapSpoiler, Function1<? super String, Unit> onTapTimestamp, Function1<? super EmojiContentNode, Unit> onTapEmoji, Function1<? super MessageId, Unit> onTapSeeMore) {
        String str;
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(onTapLink, "onTapLink");
        C9612q.m13917h(onLongTapLink, "onLongTapLink");
        C9612q.m13917h(onTapChannel, "onTapChannel");
        C9612q.m13917h(onLongPressChannel, "onLongPressChannel");
        C9612q.m13917h(onTapMention, "onTapMention");
        C9612q.m13917h(onTapCommand, "onTapCommand");
        C9612q.m13917h(onLongPressCommand, "onLongPressCommand");
        C9612q.m13917h(onTapSpoiler, "onTapSpoiler");
        C9612q.m13917h(onTapTimestamp, "onTapTimestamp");
        C9612q.m13917h(onTapEmoji, "onTapEmoji");
        C9612q.m13917h(onTapSeeMore, "onTapSeeMore");
        if (structurableText != null) {
            MessageContentView messageContentView = this.binding.descriptionText;
            C9612q.m13918g(messageContentView, "binding.descriptionText");
            str = "binding.descriptionText";
            messageContentView.m41775setMessageContent2i9KL1s(structurableText, messageId, z, z2, z3, onTapLink, onLongTapLink, onTapChannel, onLongPressChannel, onTapMention, onTapCommand, onLongPressCommand, onTapSpoiler, onTapTimestamp, onTapEmoji, onTapSeeMore, (r47 & 65536) != 0 ? MessageContentView$setMessageContent$1.INSTANCE : null, getResources().getDimensionPixelSize(C2912R.dimen.message_accessories_vertical_spacing), 0, (r47 & 524288) != 0 ? null : null, (r47 & 1048576) != 0 ? null : null, (r47 & 2097152) != 0 ? ThemeManagerKt.getTheme() : null);
        } else {
            str = "binding.descriptionText";
        }
        MessageContentView messageContentView2 = this.binding.descriptionText;
        C9612q.m13918g(messageContentView2, str);
        messageContentView2.setVisibility(structurableText != null ? 0 : 8);
    }

    public final void setGuild(String str, String str2) {
        boolean z;
        GuildEventInviteViewBinding guildEventInviteViewBinding = this.binding;
        TextView guildName = guildEventInviteViewBinding.guildName;
        C9612q.m13918g(guildName, "guildName");
        ViewUtilsKt.setOptionalText(guildName, str);
        SimpleDraweeView guildIcon = guildEventInviteViewBinding.guildIcon;
        C9612q.m13918g(guildIcon, "guildIcon");
        ReactAssetUtilsKt.setOptionalReactImageUrl(guildIcon, str2);
        SimpleDraweeView guildIcon2 = guildEventInviteViewBinding.guildIcon;
        C9612q.m13918g(guildIcon2, "guildIcon");
        int i = 0;
        if (str2 != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        guildIcon2.setVisibility(i);
    }

    public final void setHeader(String str, String text, int i) {
        C9612q.m13917h(text, "text");
        GuildEventInviteViewBinding guildEventInviteViewBinding = this.binding;
        SimpleDraweeView headerIcon = guildEventInviteViewBinding.headerIcon;
        C9612q.m13918g(headerIcon, "headerIcon");
        ReactAssetUtilsKt.setOptionalReactImageUrl(headerIcon, str);
        guildEventInviteViewBinding.headerText.setText(text);
        guildEventInviteViewBinding.headerIcon.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP));
    }

    public final void setSecondaryButton(String str, View.OnClickListener onClickListener) {
        SimpleDraweeView setSecondaryButton$lambda$15 = this.binding.secondaryButton;
        C9612q.m13918g(setSecondaryButton$lambda$15, "setSecondaryButton$lambda$15");
        ReactAssetUtilsKt.setOptionalReactImageUrl(setSecondaryButton$lambda$15, str);
        setSecondaryButton$lambda$15.setOnClickListener(onClickListener);
    }

    public final Unit setTitle(String str, Integer num) {
        TextView titleText = this.binding.titleText;
        C9612q.m13918g(titleText, "titleText");
        ViewUtilsKt.setOptionalText(titleText, str);
        if (num != null) {
            this.binding.titleText.setTextColor(num.intValue());
            return Unit.f25302a;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuildEventInviteView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9612q.m13917h(context, "context");
        GuildEventInviteViewBinding inflate = GuildEventInviteViewBinding.inflate(LayoutInflater.from(context), this);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        TextView lambda$6$lambda$0 = inflate.headerText;
        lambda$6$lambda$0.setTextColor(ThemeManagerKt.getTheme().getHeaderSecondary());
        C9612q.m13918g(lambda$6$lambda$0, "lambda$6$lambda$0");
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(lambda$6$lambda$0, discordFont);
        ConstraintLayout badgeContainer = inflate.badgeContainer;
        C9612q.m13918g(badgeContainer, "badgeContainer");
        ViewBackgroundUtilsKt.setBackgroundRectangle$default(badgeContainer, ThemeManagerKt.getTheme().getBackgroundTertiary(), SizeUtilsKt.getDpToPx((int) RNCWebViewManager.COMMAND_CLEAR_FORM_DATA), null, 0, 12, null);
        inflate.badgeText.setTextColor(ThemeManagerKt.getTheme().getHeaderSecondary());
        TextView lambda$6$lambda$1 = inflate.titleText;
        C9612q.m13918g(lambda$6$lambda$1, "lambda$6$lambda$1");
        DiscordFontUtilsKt.setDiscordFont(lambda$6$lambda$1, DiscordFont.PrimaryExtraBold);
        lambda$6$lambda$1.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
        SetTextSizeSpKt.setTextSizeSp(lambda$6$lambda$1, 18.0f);
        MessageContentView lambda$6$lambda$2 = inflate.descriptionText;
        C9612q.m13918g(lambda$6$lambda$2, "lambda$6$lambda$2");
        DiscordFont discordFont2 = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(lambda$6$lambda$2, discordFont2);
        lambda$6$lambda$2.setTextColor(ThemeManagerKt.getTheme().getHeaderSecondary());
        SetTextSizeSpKt.setTextSizeSp(lambda$6$lambda$2, 14.0f);
        TextView lambda$6$lambda$3 = inflate.guildName;
        C9612q.m13918g(lambda$6$lambda$3, "lambda$6$lambda$3");
        DiscordFontUtilsKt.setDiscordFont(lambda$6$lambda$3, discordFont);
        lambda$6$lambda$3.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
        SetTextSizeSpKt.setTextSizeSp(lambda$6$lambda$3, 14.0f);
        TextView lambda$6$lambda$4 = inflate.channelName;
        C9612q.m13918g(lambda$6$lambda$4, "lambda$6$lambda$4");
        DiscordFontUtilsKt.setDiscordFont(lambda$6$lambda$4, discordFont2);
        lambda$6$lambda$4.setTextColor(ThemeManagerKt.getTheme().getHeaderSecondary());
        SetTextSizeSpKt.setTextSizeSp(lambda$6$lambda$4, 12.0f);
        DCDButton dCDButton = inflate.acceptButton;
        dCDButton.setTextColor(Integer.valueOf(ThemeManagerKt.getTheme().getHeaderPrimary()));
        dCDButton.setMaxLines(1);
        dCDButton.ellipsize(TextUtils.TruncateAt.END);
        SimpleDraweeView secondaryButton = inflate.secondaryButton;
        C9612q.m13918g(secondaryButton, "secondaryButton");
        ViewBackgroundUtilsKt.setBackgroundRectangle(secondaryButton, ThemeManagerKt.getTheme().getBackgroundAccent(), SizeUtilsKt.getDpToPx(4), Integer.valueOf(ThemeManagerKt.getTheme().getBackgroundAccent()), SizeUtilsKt.getDpToPx(1));
        SimpleDraweeView guildIcon = inflate.guildIcon;
        C9612q.m13918g(guildIcon, "guildIcon");
        ViewClippingUtilsKt.clipToRoundedRectangle(guildIcon, SizeUtilsKt.getDpToPx(8));
        ViewBackgroundUtilsKt.setBackgroundRectangle$default(this, ThemeManagerKt.getTheme().getBackgroundSecondary(), SizeUtilsKt.getDpToPx(4), null, 0, 12, null);
        int dpToPx = SizeUtilsKt.getDpToPx(12);
        setPadding(dpToPx, dpToPx, dpToPx, dpToPx);
    }
}