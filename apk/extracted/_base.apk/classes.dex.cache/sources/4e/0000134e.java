package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.databinding.EmbeddedActivityInviteViewBinding;
import com.discord.chat.presentation.media.MediaContainingViewResizer;
import com.discord.chat.presentation.message.MessageAccessoriesView;
import com.discord.core.DCDButton;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.discord.overlapping_circles.OverlappingItem;
import com.discord.primitives.MessageId;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9546k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u00109\u001a\u000208\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:\u0012\b\b\u0002\u0010<\u001a\u00020)¢\u0006\u0004\b=\u0010>J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002J¯\u0002\u0010\"\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u000f2\"\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00040\u00112*\u0010\u0015\u001a&\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00040\u00142\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\f2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040\u000f2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040\u000f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u000f2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00040\u000f2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J\u0014\u0010%\u001a\u00020\u00042\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00120#J\u000e\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0012J\u0018\u0010+\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010\u00122\u0006\u0010*\u001a\u00020)J)\u00100\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010\u00122\b\u0010-\u001a\u0004\u0018\u00010)2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u000e\u00104\u001a\u00020\u00042\u0006\u00103\u001a\u000202R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006?"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/EmbeddedActivityInviteView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "titleText", "", "setTitleText", "headerText", "setHeaderText", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "subtitleText", "Lcom/discord/primitives/MessageId;", "messageId", "Lkotlin/Function2;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "onTapLink", "Lkotlin/Function1;", "onLongTapLink", "Lkotlin/Function3;", "", "onTapChannel", "Lkotlin/Function4;", "onLongPressChannel", "onTapMention", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "onTapCommand", "onLongPressCommand", "Lkotlin/Function0;", "onTapSpoiler", "onTapTimestamp", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "onTapEmoji", "onTapSeeMore", "setSubtitleText-SAQFhFE", "(Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "setSubtitleText", "", "avatarUris", "setAvatarUris", "noParticipantsText", "setNoParticipantsText", "splashUrl", "", "constrainedWidth", "setSplash", "text", ViewProps.BACKGROUND_COLOR, "", ViewProps.ENABLED, "setLaunchButton", "(Ljava/lang/String;Ljava/lang/Integer;Z)V", "Landroid/view/View$OnClickListener;", "onLaunchButtonClickListener", "setOnLaunchButtonClickListener", "Lcom/discord/chat/databinding/EmbeddedActivityInviteViewBinding;", "binding", "Lcom/discord/chat/databinding/EmbeddedActivityInviteViewBinding;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class EmbeddedActivityInviteView extends ConstraintLayout {
    private final EmbeddedActivityInviteViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmbeddedActivityInviteView(Context context) {
        this(context, null, 0, 6, null);
        C9612q.m13917h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmbeddedActivityInviteView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ EmbeddedActivityInviteView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void setAvatarUris(List<String> avatarUris) {
        int i;
        int m14093t;
        C9612q.m13917h(avatarUris, "avatarUris");
        boolean z = !avatarUris.isEmpty();
        OverlappingCirclesView overlappingCirclesView = this.binding.participants;
        C9612q.m13918g(overlappingCirclesView, "binding.participants");
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        overlappingCirclesView.setVisibility(i);
        OverlappingCirclesView overlappingCirclesView2 = this.binding.participants;
        m14093t = C9546k.m14093t(avatarUris, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (String str : avatarUris) {
            arrayList.add(new OverlappingItem(str));
        }
        overlappingCirclesView2.setItems(arrayList);
        TextView textView = this.binding.noParticipantsText;
        C9612q.m13918g(textView, "binding.noParticipantsText");
        if (!(!z)) {
            i2 = 8;
        }
        textView.setVisibility(i2);
    }

    public final void setHeaderText(CharSequence charSequence) {
        boolean z;
        int i = 0;
        if (charSequence != null && charSequence.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = true ^ z;
        TextView textView = this.binding.itemHeader;
        C9612q.m13918g(textView, "binding.itemHeader");
        if (!z2) {
            i = 8;
        }
        textView.setVisibility(i);
        this.binding.itemHeader.setText(charSequence);
    }

    public final void setLaunchButton(String str, Integer num, boolean z) {
        boolean z2;
        float f;
        DCDButton setLaunchButton$lambda$9 = this.binding.launchButton;
        C9612q.m13918g(setLaunchButton$lambda$9, "setLaunchButton$lambda$9");
        int i = 0;
        if (str != null && str.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!(true ^ z2)) {
            i = 8;
        }
        setLaunchButton$lambda$9.setVisibility(i);
        setLaunchButton$lambda$9.setText(str);
        setLaunchButton$lambda$9.setBackgroundColor(num);
        setLaunchButton$lambda$9.setEnabled(z);
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        setLaunchButton$lambda$9.setAlpha(f);
    }

    public final void setNoParticipantsText(String noParticipantsText) {
        C9612q.m13917h(noParticipantsText, "noParticipantsText");
        this.binding.noParticipantsText.setText(noParticipantsText);
    }

    public final void setOnLaunchButtonClickListener(View.OnClickListener onLaunchButtonClickListener) {
        C9612q.m13917h(onLaunchButtonClickListener, "onLaunchButtonClickListener");
        this.binding.launchButton.setOnClickButtonListener(onLaunchButtonClickListener);
    }

    public final void setSplash(String str, int i) {
        boolean z;
        SimpleDraweeView simpleDraweeView = this.binding.itemHero;
        C9612q.m13918g(simpleDraweeView, "binding.itemHero");
        int i2 = 0;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i2 = 8;
        }
        simpleDraweeView.setVisibility(i2);
        this.binding.itemHero.setImageURI(str);
        int width = MessageAccessoriesView.Companion.getWidth(i);
        int i3 = (width * 9) / 16;
        MediaContainingViewResizer mediaContainingViewResizer = MediaContainingViewResizer.INSTANCE;
        SimpleDraweeView simpleDraweeView2 = this.binding.itemHero;
        C9612q.m13918g(simpleDraweeView2, "binding.itemHero");
        mediaContainingViewResizer.resizeLayoutParams(simpleDraweeView2, width, i3, width, i3, MediaContainingViewResizer.ResizeMode.Fill);
    }

    /* renamed from: setSubtitleText-SAQFhFE */
    public final void m41762setSubtitleTextSAQFhFE(StructurableText structurableText, String messageId, Function2<? super MessageId, ? super LinkContentNode, Unit> onTapLink, Function1<? super LinkContentNode, Unit> onLongTapLink, Function3<? super String, ? super String, ? super String, Unit> onTapChannel, Function4<? super String, ? super String, ? super String, ? super String, Unit> onLongPressChannel, Function2<? super String, ? super String, Unit> onTapMention, Function1<? super CommandMentionContentNode, Unit> onTapCommand, Function1<? super CommandMentionContentNode, Unit> onLongPressCommand, Function0<Unit> onTapSpoiler, Function1<? super String, Unit> onTapTimestamp, Function1<? super EmojiContentNode, Unit> onTapEmoji, Function1<? super MessageId, Unit> onTapSeeMore) {
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
        MessageContentView messageContentView = this.binding.itemSubtitle;
        C9612q.m13918g(messageContentView, "binding.itemSubtitle");
        messageContentView.setVisibility(structurableText != null ? 0 : 8);
        SimpleDraweeView simpleDraweeView = this.binding.subtitleIcon;
        C9612q.m13918g(simpleDraweeView, "binding.subtitleIcon");
        simpleDraweeView.setVisibility(structurableText != null ? 0 : 8);
        if (structurableText != null) {
            MessageContentView messageContentView2 = this.binding.itemSubtitle;
            C9612q.m13918g(messageContentView2, "binding.itemSubtitle");
            messageContentView2.m41775setMessageContent2i9KL1s(structurableText, messageId, false, false, false, onTapLink, onLongTapLink, onTapChannel, onLongPressChannel, onTapMention, onTapCommand, onLongPressCommand, onTapSpoiler, onTapTimestamp, onTapEmoji, onTapSeeMore, (r47 & 65536) != 0 ? MessageContentView$setMessageContent$1.INSTANCE : null, 0, 0, (r47 & 524288) != 0 ? null : null, (r47 & 1048576) != 0 ? null : null, (r47 & 2097152) != 0 ? ThemeManagerKt.getTheme() : null);
        }
    }

    public final void setTitleText(CharSequence charSequence) {
        boolean z;
        int i = 0;
        if (charSequence != null && charSequence.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = true ^ z;
        TextView textView = this.binding.itemTitle;
        C9612q.m13918g(textView, "binding.itemTitle");
        if (!z2) {
            i = 8;
        }
        textView.setVisibility(i);
        this.binding.itemTitle.setText(charSequence);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbeddedActivityInviteView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9612q.m13917h(context, "context");
        EmbeddedActivityInviteViewBinding inflate = EmbeddedActivityInviteViewBinding.inflate(LayoutInflater.from(context), this);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        TextView lambda$6$lambda$0 = inflate.itemTitle;
        lambda$6$lambda$0.setTextColor(ThemeManagerKt.getTheme().getHeaderSecondary());
        C9612q.m13918g(lambda$6$lambda$0, "lambda$6$lambda$0");
        SetTextSizeSpKt.setTextSizeSp(lambda$6$lambda$0, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(lambda$6$lambda$0, DiscordFont.PrimaryExtraBold);
        TextView lambda$6$lambda$1 = inflate.itemHeader;
        lambda$6$lambda$1.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
        C9612q.m13918g(lambda$6$lambda$1, "lambda$6$lambda$1");
        SetTextSizeSpKt.setTextSizeSp(lambda$6$lambda$1, 24.0f);
        DiscordFontUtilsKt.setDiscordFont(lambda$6$lambda$1, DiscordFont.PrimarySemibold);
        MessageContentView lambda$6$lambda$2 = inflate.itemSubtitle;
        C9612q.m13918g(lambda$6$lambda$2, "lambda$6$lambda$2");
        DiscordFont discordFont = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(lambda$6$lambda$2, discordFont);
        lambda$6$lambda$2.setTextColor(ThemeManagerKt.getTheme().getHeaderSecondary());
        SetTextSizeSpKt.setTextSizeSp(lambda$6$lambda$2, 12.0f);
        SimpleDraweeView lambda$6$lambda$3 = inflate.subtitleIcon;
        C9612q.m13918g(lambda$6$lambda$3, "lambda$6$lambda$3");
        ReactAssetUtilsKt.setReactAsset(lambda$6$lambda$3, ReactAsset.Speaker);
        ColorUtilsKt.setTintColor(lambda$6$lambda$3, Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveNormal()));
        TextView lambda$6$lambda$4 = inflate.noParticipantsText;
        C9612q.m13918g(lambda$6$lambda$4, "lambda$6$lambda$4");
        DiscordFontUtilsKt.setDiscordFont(lambda$6$lambda$4, discordFont);
        lambda$6$lambda$4.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
        SetTextSizeSpKt.setTextSizeSp(lambda$6$lambda$4, 12.0f);
        inflate.launchButton.setTextColor(-1);
        ViewBackgroundUtilsKt.setBackgroundRectangle$default(this, ColorUtilsKt.getColorCompat(context, GetEmbedBackgroundColorKt.getEmbedBackgroundColor()), SizeUtilsKt.getDpToPx(8), null, 0, 12, null);
    }
}