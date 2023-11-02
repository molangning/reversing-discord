package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.channelprompt.ChannelPromptData;
import com.discord.chat.databinding.ChannelPromptActionsViewBinding;
import com.discord.core.DCDButton;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J.\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/ChannelPromptActionsView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/ChannelPromptActionsViewBinding;", "configure", "", "message", "Lcom/discord/chat/bridge/Message;", "onTapCameraButton", "Landroid/view/View$OnClickListener;", "onTapEmojiButton", "onTapGamingStatsButton", "onTapGifButton", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChannelPromptActionsView extends LinearLayout {
    private final ChannelPromptActionsViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelPromptActionsView(Context context) {
        this(context, null, 2, null);
        C9612q.m13917h(context, "context");
    }

    public /* synthetic */ ChannelPromptActionsView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public final void configure(Message message, View.OnClickListener onTapCameraButton, View.OnClickListener onTapEmojiButton, View.OnClickListener onTapGamingStatsButton, View.OnClickListener onTapGifButton) {
        String str;
        String str2;
        String str3;
        C9612q.m13917h(message, "message");
        C9612q.m13917h(onTapCameraButton, "onTapCameraButton");
        C9612q.m13917h(onTapEmojiButton, "onTapEmojiButton");
        C9612q.m13917h(onTapGamingStatsButton, "onTapGamingStatsButton");
        C9612q.m13917h(onTapGifButton, "onTapGifButton");
        DCDButton configure$lambda$0 = this.binding.cameraButton;
        ChannelPromptData channelPromptData = message.getChannelPromptData();
        String str4 = null;
        if (channelPromptData != null) {
            str = channelPromptData.getCameraButtonIcon();
        } else {
            str = null;
        }
        if (str != null) {
            configure$lambda$0.setIcon(message.getChannelPromptData().getCameraButtonIcon(), SizeUtilsKt.getDpToPx(24));
            configure$lambda$0.setText(message.getChannelPromptData().getCameraButtonText());
            C9612q.m13918g(configure$lambda$0, "configure$lambda$0");
            configure$lambda$0.setVisibility(0);
        } else {
            C9612q.m13918g(configure$lambda$0, "configure$lambda$0");
            configure$lambda$0.setVisibility(8);
        }
        configure$lambda$0.setBackgroundColor(ThemeManagerKt.getTheme().getButtonSecondaryBackground());
        configure$lambda$0.setOnClickButtonListener(onTapCameraButton);
        DCDButton configure$lambda$1 = this.binding.gifButton;
        ChannelPromptData channelPromptData2 = message.getChannelPromptData();
        if (channelPromptData2 != null) {
            str2 = channelPromptData2.getGifButtonIcon();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            configure$lambda$1.setIcon(message.getChannelPromptData().getGifButtonIcon(), SizeUtilsKt.getDpToPx(24));
            configure$lambda$1.setText(message.getChannelPromptData().getGifButtonText());
            C9612q.m13918g(configure$lambda$1, "configure$lambda$1");
            configure$lambda$1.setVisibility(0);
        } else {
            C9612q.m13918g(configure$lambda$1, "configure$lambda$1");
            configure$lambda$1.setVisibility(8);
        }
        configure$lambda$1.setBackgroundColor(ThemeManagerKt.getTheme().getButtonSecondaryBackground());
        configure$lambda$1.setOnClickButtonListener(onTapGifButton);
        DCDButton configure$lambda$2 = this.binding.emojiButton;
        ChannelPromptData channelPromptData3 = message.getChannelPromptData();
        if (channelPromptData3 != null) {
            str3 = channelPromptData3.getEmojiButtonIcon();
        } else {
            str3 = null;
        }
        if (str3 != null) {
            configure$lambda$2.setIcon(message.getChannelPromptData().getEmojiButtonIcon(), SizeUtilsKt.getDpToPx(24));
            configure$lambda$2.setText(message.getChannelPromptData().getEmojiButtonText());
            C9612q.m13918g(configure$lambda$2, "configure$lambda$2");
            configure$lambda$2.setVisibility(0);
        } else {
            C9612q.m13918g(configure$lambda$2, "configure$lambda$2");
            configure$lambda$2.setVisibility(8);
        }
        configure$lambda$2.setBackgroundColor(ThemeManagerKt.getTheme().getButtonSecondaryBackground());
        configure$lambda$2.setOnClickButtonListener(onTapEmojiButton);
        DCDButton configure$lambda$3 = this.binding.gamingStatsButton;
        ChannelPromptData channelPromptData4 = message.getChannelPromptData();
        if (channelPromptData4 != null) {
            str4 = channelPromptData4.getGamingStatsButtonText();
        }
        if (str4 != null) {
            configure$lambda$3.setText(message.getChannelPromptData().getGamingStatsButtonText());
            C9612q.m13918g(configure$lambda$3, "configure$lambda$3");
            configure$lambda$3.setVisibility(0);
        } else {
            C9612q.m13918g(configure$lambda$3, "configure$lambda$3");
            configure$lambda$3.setVisibility(8);
        }
        configure$lambda$3.setBackgroundColor(ThemeManagerKt.getTheme().getButtonSecondaryBackground());
        configure$lambda$3.setOnClickButtonListener(onTapGamingStatsButton);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelPromptActionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9612q.m13917h(context, "context");
        ChannelPromptActionsViewBinding inflate = ChannelPromptActionsViewBinding.inflate(LayoutInflater.from(context), this);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
    }
}
