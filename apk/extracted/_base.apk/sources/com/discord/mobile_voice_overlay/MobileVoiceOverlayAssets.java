package com.discord.mobile_voice_overlay;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 92\u00020\u0001:\u000289B\u0087\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012B]\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0002\u0010\u0013J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003Jw\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\t\u00100\u001a\u00020\u0005HÖ\u0001J!\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207HÇ\u0001R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015¨\u0006:"}, m14357d2 = {"Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;", "", "seen1", "", "useSpeaker", "", "mute", "disconnectFromVoice", "getInvite", "switchChannels", "openDiscord", "inviteLinkCopied", "channelSelect", "closeWindow", "searchChannels", "noResults", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannelSelect", "()Ljava/lang/String;", "getCloseWindow", "getDisconnectFromVoice", "getGetInvite", "getInviteLinkCopied", "getMute", "getNoResults", "getOpenDiscord", "getSearchChannels", "getSwitchChannels", "getUseSpeaker", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "mobile_voice_overlay_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class MobileVoiceOverlayAssets {
    public static final Companion Companion = new Companion(null);
    private final String channelSelect;
    private final String closeWindow;
    private final String disconnectFromVoice;
    private final String getInvite;
    private final String inviteLinkCopied;
    private final String mute;
    private final String noResults;
    private final String openDiscord;
    private final String searchChannels;
    private final String switchChannels;
    private final String useSpeaker;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;", "mobile_voice_overlay_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MobileVoiceOverlayAssets> serializer() {
            return MobileVoiceOverlayAssets$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MobileVoiceOverlayAssets(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i & 2047)) {
            C2620n1.m32836b(i, 2047, MobileVoiceOverlayAssets$$serializer.INSTANCE.getDescriptor());
        }
        this.useSpeaker = str;
        this.mute = str2;
        this.disconnectFromVoice = str3;
        this.getInvite = str4;
        this.switchChannels = str5;
        this.openDiscord = str6;
        this.inviteLinkCopied = str7;
        this.channelSelect = str8;
        this.closeWindow = str9;
        this.searchChannels = str10;
        this.noResults = str11;
    }

    public static final void write$Self(MobileVoiceOverlayAssets self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        output.mo12880y(serialDesc, 0, self.useSpeaker);
        output.mo12880y(serialDesc, 1, self.mute);
        output.mo12880y(serialDesc, 2, self.disconnectFromVoice);
        output.mo12880y(serialDesc, 3, self.getInvite);
        output.mo12880y(serialDesc, 4, self.switchChannels);
        output.mo12880y(serialDesc, 5, self.openDiscord);
        output.mo12880y(serialDesc, 6, self.inviteLinkCopied);
        output.mo12880y(serialDesc, 7, self.channelSelect);
        output.mo12880y(serialDesc, 8, self.closeWindow);
        output.mo12880y(serialDesc, 9, self.searchChannels);
        output.mo12880y(serialDesc, 10, self.noResults);
    }

    public final String component1() {
        return this.useSpeaker;
    }

    public final String component10() {
        return this.searchChannels;
    }

    public final String component11() {
        return this.noResults;
    }

    public final String component2() {
        return this.mute;
    }

    public final String component3() {
        return this.disconnectFromVoice;
    }

    public final String component4() {
        return this.getInvite;
    }

    public final String component5() {
        return this.switchChannels;
    }

    public final String component6() {
        return this.openDiscord;
    }

    public final String component7() {
        return this.inviteLinkCopied;
    }

    public final String component8() {
        return this.channelSelect;
    }

    public final String component9() {
        return this.closeWindow;
    }

    public final MobileVoiceOverlayAssets copy(String useSpeaker, String mute, String disconnectFromVoice, String getInvite, String switchChannels, String openDiscord, String inviteLinkCopied, String channelSelect, String closeWindow, String searchChannels, String noResults) {
        C9612q.m13917h(useSpeaker, "useSpeaker");
        C9612q.m13917h(mute, "mute");
        C9612q.m13917h(disconnectFromVoice, "disconnectFromVoice");
        C9612q.m13917h(getInvite, "getInvite");
        C9612q.m13917h(switchChannels, "switchChannels");
        C9612q.m13917h(openDiscord, "openDiscord");
        C9612q.m13917h(inviteLinkCopied, "inviteLinkCopied");
        C9612q.m13917h(channelSelect, "channelSelect");
        C9612q.m13917h(closeWindow, "closeWindow");
        C9612q.m13917h(searchChannels, "searchChannels");
        C9612q.m13917h(noResults, "noResults");
        return new MobileVoiceOverlayAssets(useSpeaker, mute, disconnectFromVoice, getInvite, switchChannels, openDiscord, inviteLinkCopied, channelSelect, closeWindow, searchChannels, noResults);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MobileVoiceOverlayAssets) {
            MobileVoiceOverlayAssets mobileVoiceOverlayAssets = (MobileVoiceOverlayAssets) obj;
            return C9612q.m13922c(this.useSpeaker, mobileVoiceOverlayAssets.useSpeaker) && C9612q.m13922c(this.mute, mobileVoiceOverlayAssets.mute) && C9612q.m13922c(this.disconnectFromVoice, mobileVoiceOverlayAssets.disconnectFromVoice) && C9612q.m13922c(this.getInvite, mobileVoiceOverlayAssets.getInvite) && C9612q.m13922c(this.switchChannels, mobileVoiceOverlayAssets.switchChannels) && C9612q.m13922c(this.openDiscord, mobileVoiceOverlayAssets.openDiscord) && C9612q.m13922c(this.inviteLinkCopied, mobileVoiceOverlayAssets.inviteLinkCopied) && C9612q.m13922c(this.channelSelect, mobileVoiceOverlayAssets.channelSelect) && C9612q.m13922c(this.closeWindow, mobileVoiceOverlayAssets.closeWindow) && C9612q.m13922c(this.searchChannels, mobileVoiceOverlayAssets.searchChannels) && C9612q.m13922c(this.noResults, mobileVoiceOverlayAssets.noResults);
        }
        return false;
    }

    public final String getChannelSelect() {
        return this.channelSelect;
    }

    public final String getCloseWindow() {
        return this.closeWindow;
    }

    public final String getDisconnectFromVoice() {
        return this.disconnectFromVoice;
    }

    public final String getGetInvite() {
        return this.getInvite;
    }

    public final String getInviteLinkCopied() {
        return this.inviteLinkCopied;
    }

    public final String getMute() {
        return this.mute;
    }

    public final String getNoResults() {
        return this.noResults;
    }

    public final String getOpenDiscord() {
        return this.openDiscord;
    }

    public final String getSearchChannels() {
        return this.searchChannels;
    }

    public final String getSwitchChannels() {
        return this.switchChannels;
    }

    public final String getUseSpeaker() {
        return this.useSpeaker;
    }

    public int hashCode() {
        return (((((((((((((((((((this.useSpeaker.hashCode() * 31) + this.mute.hashCode()) * 31) + this.disconnectFromVoice.hashCode()) * 31) + this.getInvite.hashCode()) * 31) + this.switchChannels.hashCode()) * 31) + this.openDiscord.hashCode()) * 31) + this.inviteLinkCopied.hashCode()) * 31) + this.channelSelect.hashCode()) * 31) + this.closeWindow.hashCode()) * 31) + this.searchChannels.hashCode()) * 31) + this.noResults.hashCode();
    }

    public String toString() {
        String str = this.useSpeaker;
        String str2 = this.mute;
        String str3 = this.disconnectFromVoice;
        String str4 = this.getInvite;
        String str5 = this.switchChannels;
        String str6 = this.openDiscord;
        String str7 = this.inviteLinkCopied;
        String str8 = this.channelSelect;
        String str9 = this.closeWindow;
        String str10 = this.searchChannels;
        String str11 = this.noResults;
        return "MobileVoiceOverlayAssets(useSpeaker=" + str + ", mute=" + str2 + ", disconnectFromVoice=" + str3 + ", getInvite=" + str4 + ", switchChannels=" + str5 + ", openDiscord=" + str6 + ", inviteLinkCopied=" + str7 + ", channelSelect=" + str8 + ", closeWindow=" + str9 + ", searchChannels=" + str10 + ", noResults=" + str11 + ")";
    }

    public MobileVoiceOverlayAssets(String useSpeaker, String mute, String disconnectFromVoice, String getInvite, String switchChannels, String openDiscord, String inviteLinkCopied, String channelSelect, String closeWindow, String searchChannels, String noResults) {
        C9612q.m13917h(useSpeaker, "useSpeaker");
        C9612q.m13917h(mute, "mute");
        C9612q.m13917h(disconnectFromVoice, "disconnectFromVoice");
        C9612q.m13917h(getInvite, "getInvite");
        C9612q.m13917h(switchChannels, "switchChannels");
        C9612q.m13917h(openDiscord, "openDiscord");
        C9612q.m13917h(inviteLinkCopied, "inviteLinkCopied");
        C9612q.m13917h(channelSelect, "channelSelect");
        C9612q.m13917h(closeWindow, "closeWindow");
        C9612q.m13917h(searchChannels, "searchChannels");
        C9612q.m13917h(noResults, "noResults");
        this.useSpeaker = useSpeaker;
        this.mute = mute;
        this.disconnectFromVoice = disconnectFromVoice;
        this.getInvite = getInvite;
        this.switchChannels = switchChannels;
        this.openDiscord = openDiscord;
        this.inviteLinkCopied = inviteLinkCopied;
        this.channelSelect = channelSelect;
        this.closeWindow = closeWindow;
        this.searchChannels = searchChannels;
        this.noResults = noResults;
    }
}
