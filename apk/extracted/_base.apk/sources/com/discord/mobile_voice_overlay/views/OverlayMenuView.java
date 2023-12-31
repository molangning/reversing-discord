package com.discord.mobile_voice_overlay.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.mobile_voice_overlay.ConnectionQuality;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayAssets;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayData;
import com.discord.mobile_voice_overlay.databinding.ViewOverlayMenuBinding;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import pf.C11581q;

@Metadata(m14358d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, m14357d2 = {"Lcom/discord/mobile_voice_overlay/views/OverlayMenuView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attributeSetId", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "assets", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;", "binding", "Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;", "getBinding", "()Lcom/discord/mobile_voice_overlay/databinding/ViewOverlayMenuBinding;", "setAssets", "", "setData", "data", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;", "mobile_voice_overlay_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class OverlayMenuView extends LinearLayout {
    private MobileVoiceOverlayAssets assets;
    private final ViewOverlayMenuBinding binding;

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConnectionQuality.values().length];
            try {
                iArr[ConnectionQuality.Fine.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConnectionQuality.Average.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConnectionQuality.Bad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ConnectionQuality.Unknown.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayMenuView(Context context) {
        super(context);
        C9612q.m13917h(context, "context");
        ViewOverlayMenuBinding inflate = ViewOverlayMenuBinding.inflate(LayoutInflater.from(getContext()), this);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        TextView textView = inflate.overlayGuildName;
        C9612q.m13918g(textView, "binding.overlayGuildName");
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(textView, discordFont);
        TextView textView2 = inflate.overlayInviteLink;
        C9612q.m13918g(textView2, "binding.overlayInviteLink");
        DiscordFontUtilsKt.setDiscordFont(textView2, discordFont);
        TextView textView3 = inflate.overlaySwitchChannels;
        C9612q.m13918g(textView3, "binding.overlaySwitchChannels");
        DiscordFontUtilsKt.setDiscordFont(textView3, discordFont);
        TextView textView4 = inflate.overlayOpenApp;
        C9612q.m13918g(textView4, "binding.overlayOpenApp");
        DiscordFontUtilsKt.setDiscordFont(textView4, discordFont);
        inflate.menuTop.setCardBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
        inflate.menuTopStatusContainer.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundTertiary());
        inflate.menuTopStatusContainer.setBackgroundTintList(ColorStateList.valueOf(ThemeManagerKt.getTheme().getBackgroundTertiary()));
        inflate.menuBottom.setCardBackgroundColor(ThemeManagerKt.getTheme().getBackgroundTertiary());
        inflate.overlayInviteLink.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
        inflate.overlaySwitchChannels.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
        inflate.overlayOpenApp.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
        inflate.overlayGuildName.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
        inflate.overlayChannelName.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
    }

    public final ViewOverlayMenuBinding getBinding() {
        return this.binding;
    }

    public final void setAssets(MobileVoiceOverlayAssets assets) {
        C9612q.m13917h(assets, "assets");
        this.assets = assets;
        SimpleDraweeView setAssets$lambda$0 = this.binding.srcToggle;
        setAssets$lambda$0.setContentDescription(assets.getUseSpeaker());
        C9612q.m13918g(setAssets$lambda$0, "setAssets$lambda$0");
        ReactAssetUtilsKt.setReactAsset(setAssets$lambda$0, ReactAsset.Speaker);
        ColorUtilsKt.setTintColor(setAssets$lambda$0, Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveNormal()));
        SimpleDraweeView setAssets$lambda$1 = this.binding.muteToggle;
        setAssets$lambda$1.setContentDescription(assets.getMute());
        C9612q.m13918g(setAssets$lambda$1, "setAssets$lambda$1");
        ReactAssetUtilsKt.setReactAsset(setAssets$lambda$1, ReactAsset.Mic);
        ColorUtilsKt.setTintColor(setAssets$lambda$1, Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveNormal()));
        SimpleDraweeView setAssets$lambda$2 = this.binding.disconnectBtn;
        setAssets$lambda$2.setContentDescription(assets.getDisconnectFromVoice());
        C9612q.m13918g(setAssets$lambda$2, "setAssets$lambda$2");
        ReactAssetUtilsKt.setReactAsset(setAssets$lambda$2, ReactAsset.Disconnect);
        ColorUtilsKt.setTintColor(setAssets$lambda$2, Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveNormal()));
        this.binding.overlayInviteLink.setText(assets.getGetInvite());
        this.binding.overlaySwitchChannels.setText(assets.getSwitchChannels());
        this.binding.overlayOpenApp.setText(assets.getOpenDiscord());
    }

    public final void setData(MobileVoiceOverlayData data) {
        int i;
        ReactAsset reactAsset;
        ReactAsset reactAsset2;
        C9612q.m13917h(data, "data");
        TextView textView = this.binding.overlayInviteLink;
        C9612q.m13918g(textView, "binding.overlayInviteLink");
        if (data.getCanGenerateInvite()) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        SimpleDraweeView simpleDraweeView = this.binding.muteToggle;
        C9612q.m13918g(simpleDraweeView, "binding.muteToggle");
        if (data.getMuted()) {
            reactAsset = ReactAsset.MicMutedDark;
        } else {
            reactAsset = ReactAsset.Mic;
        }
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView, reactAsset);
        SimpleDraweeView simpleDraweeView2 = this.binding.overlayNetworkIcon;
        C9612q.m13918g(simpleDraweeView2, "binding.overlayNetworkIcon");
        int i2 = WhenMappings.$EnumSwitchMapping$0[data.getConnectionQuality().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        reactAsset2 = ReactAsset.CallStatusUnknown;
                    } else {
                        throw new C11581q();
                    }
                } else {
                    reactAsset2 = ReactAsset.CallStatusRed;
                }
            } else {
                reactAsset2 = ReactAsset.CallStatusYellow;
            }
        } else {
            reactAsset2 = ReactAsset.CallStatusGreen;
        }
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView2, reactAsset2);
        this.binding.overlayGuildName.setText(data.getGuildName());
        this.binding.overlayChannelName.setText(data.getChannelName());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9612q.m13917h(context, "context");
        ViewOverlayMenuBinding inflate = ViewOverlayMenuBinding.inflate(LayoutInflater.from(getContext()), this);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        TextView textView = inflate.overlayGuildName;
        C9612q.m13918g(textView, "binding.overlayGuildName");
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(textView, discordFont);
        TextView textView2 = inflate.overlayInviteLink;
        C9612q.m13918g(textView2, "binding.overlayInviteLink");
        DiscordFontUtilsKt.setDiscordFont(textView2, discordFont);
        TextView textView3 = inflate.overlaySwitchChannels;
        C9612q.m13918g(textView3, "binding.overlaySwitchChannels");
        DiscordFontUtilsKt.setDiscordFont(textView3, discordFont);
        TextView textView4 = inflate.overlayOpenApp;
        C9612q.m13918g(textView4, "binding.overlayOpenApp");
        DiscordFontUtilsKt.setDiscordFont(textView4, discordFont);
        inflate.menuTop.setCardBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
        inflate.menuTopStatusContainer.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundTertiary());
        inflate.menuTopStatusContainer.setBackgroundTintList(ColorStateList.valueOf(ThemeManagerKt.getTheme().getBackgroundTertiary()));
        inflate.menuBottom.setCardBackgroundColor(ThemeManagerKt.getTheme().getBackgroundTertiary());
        inflate.overlayInviteLink.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
        inflate.overlaySwitchChannels.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
        inflate.overlayOpenApp.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
        inflate.overlayGuildName.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
        inflate.overlayChannelName.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9612q.m13917h(context, "context");
        ViewOverlayMenuBinding inflate = ViewOverlayMenuBinding.inflate(LayoutInflater.from(getContext()), this);
        C9612q.m13918g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        TextView textView = inflate.overlayGuildName;
        C9612q.m13918g(textView, "binding.overlayGuildName");
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(textView, discordFont);
        TextView textView2 = inflate.overlayInviteLink;
        C9612q.m13918g(textView2, "binding.overlayInviteLink");
        DiscordFontUtilsKt.setDiscordFont(textView2, discordFont);
        TextView textView3 = inflate.overlaySwitchChannels;
        C9612q.m13918g(textView3, "binding.overlaySwitchChannels");
        DiscordFontUtilsKt.setDiscordFont(textView3, discordFont);
        TextView textView4 = inflate.overlayOpenApp;
        C9612q.m13918g(textView4, "binding.overlayOpenApp");
        DiscordFontUtilsKt.setDiscordFont(textView4, discordFont);
        inflate.menuTop.setCardBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
        inflate.menuTopStatusContainer.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundTertiary());
        inflate.menuTopStatusContainer.setBackgroundTintList(ColorStateList.valueOf(ThemeManagerKt.getTheme().getBackgroundTertiary()));
        inflate.menuBottom.setCardBackgroundColor(ThemeManagerKt.getTheme().getBackgroundTertiary());
        inflate.overlayInviteLink.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
        inflate.overlaySwitchChannels.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
        inflate.overlayOpenApp.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
        inflate.overlayGuildName.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
        inflate.overlayChannelName.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
    }
}
