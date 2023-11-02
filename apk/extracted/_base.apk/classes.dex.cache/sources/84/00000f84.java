package com.discord.chat.bridge.channelprompt;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2560a2;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002,-B_\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eBY\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J]\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001J!\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+HÇ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006."}, m14357d2 = {"Lcom/discord/chat/bridge/channelprompt/ChannelPromptData;", "", "seen1", "", "cameraButtonIcon", "", "gifButtonIcon", "emojiButtonIcon", "gamingStatsButtonText", "cameraButtonText", "gifButtonText", "emojiButtonText", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCameraButtonIcon", "()Ljava/lang/String;", "getCameraButtonText", "getEmojiButtonIcon", "getEmojiButtonText", "getGamingStatsButtonText", "getGifButtonIcon", "getGifButtonText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChannelPromptData {
    public static final Companion Companion = new Companion(null);
    private final String cameraButtonIcon;
    private final String cameraButtonText;
    private final String emojiButtonIcon;
    private final String emojiButtonText;
    private final String gamingStatsButtonText;
    private final String gifButtonIcon;
    private final String gifButtonText;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/channelprompt/ChannelPromptData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/channelprompt/ChannelPromptData;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChannelPromptData> serializer() {
            return ChannelPromptData$$serializer.INSTANCE;
        }
    }

    public ChannelPromptData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ ChannelPromptData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            C2620n1.m32836b(i, 0, ChannelPromptData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.cameraButtonIcon = null;
        } else {
            this.cameraButtonIcon = str;
        }
        if ((i & 2) == 0) {
            this.gifButtonIcon = null;
        } else {
            this.gifButtonIcon = str2;
        }
        if ((i & 4) == 0) {
            this.emojiButtonIcon = null;
        } else {
            this.emojiButtonIcon = str3;
        }
        if ((i & 8) == 0) {
            this.gamingStatsButtonText = null;
        } else {
            this.gamingStatsButtonText = str4;
        }
        if ((i & 16) == 0) {
            this.cameraButtonText = null;
        } else {
            this.cameraButtonText = str5;
        }
        if ((i & 32) == 0) {
            this.gifButtonText = null;
        } else {
            this.gifButtonText = str6;
        }
        if ((i & 64) == 0) {
            this.emojiButtonText = null;
        } else {
            this.emojiButtonText = str7;
        }
    }

    public static /* synthetic */ ChannelPromptData copy$default(ChannelPromptData channelPromptData, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = channelPromptData.cameraButtonIcon;
        }
        if ((i & 2) != 0) {
            str2 = channelPromptData.gifButtonIcon;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = channelPromptData.emojiButtonIcon;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = channelPromptData.gamingStatsButtonText;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = channelPromptData.cameraButtonText;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = channelPromptData.gifButtonText;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = channelPromptData.emojiButtonText;
        }
        return channelPromptData.copy(str, str8, str9, str10, str11, str12, str7);
    }

    public static final void write$Self(ChannelPromptData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        boolean z7 = false;
        if (output.mo12879z(serialDesc, 0) || self.cameraButtonIcon != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo12904E(serialDesc, 0, C2560a2.f7013a, self.cameraButtonIcon);
        }
        if (output.mo12879z(serialDesc, 1) || self.gifButtonIcon != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            output.mo12904E(serialDesc, 1, C2560a2.f7013a, self.gifButtonIcon);
        }
        if (output.mo12879z(serialDesc, 2) || self.emojiButtonIcon != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            output.mo12904E(serialDesc, 2, C2560a2.f7013a, self.emojiButtonIcon);
        }
        if (output.mo12879z(serialDesc, 3) || self.gamingStatsButtonText != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            output.mo12904E(serialDesc, 3, C2560a2.f7013a, self.gamingStatsButtonText);
        }
        if (output.mo12879z(serialDesc, 4) || self.cameraButtonText != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            output.mo12904E(serialDesc, 4, C2560a2.f7013a, self.cameraButtonText);
        }
        if (output.mo12879z(serialDesc, 5) || self.gifButtonText != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            output.mo12904E(serialDesc, 5, C2560a2.f7013a, self.gifButtonText);
        }
        if (output.mo12879z(serialDesc, 6) || self.emojiButtonText != null) {
            z7 = true;
        }
        if (z7) {
            output.mo12904E(serialDesc, 6, C2560a2.f7013a, self.emojiButtonText);
        }
    }

    public final String component1() {
        return this.cameraButtonIcon;
    }

    public final String component2() {
        return this.gifButtonIcon;
    }

    public final String component3() {
        return this.emojiButtonIcon;
    }

    public final String component4() {
        return this.gamingStatsButtonText;
    }

    public final String component5() {
        return this.cameraButtonText;
    }

    public final String component6() {
        return this.gifButtonText;
    }

    public final String component7() {
        return this.emojiButtonText;
    }

    public final ChannelPromptData copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new ChannelPromptData(str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChannelPromptData) {
            ChannelPromptData channelPromptData = (ChannelPromptData) obj;
            return C9612q.m13922c(this.cameraButtonIcon, channelPromptData.cameraButtonIcon) && C9612q.m13922c(this.gifButtonIcon, channelPromptData.gifButtonIcon) && C9612q.m13922c(this.emojiButtonIcon, channelPromptData.emojiButtonIcon) && C9612q.m13922c(this.gamingStatsButtonText, channelPromptData.gamingStatsButtonText) && C9612q.m13922c(this.cameraButtonText, channelPromptData.cameraButtonText) && C9612q.m13922c(this.gifButtonText, channelPromptData.gifButtonText) && C9612q.m13922c(this.emojiButtonText, channelPromptData.emojiButtonText);
        }
        return false;
    }

    public final String getCameraButtonIcon() {
        return this.cameraButtonIcon;
    }

    public final String getCameraButtonText() {
        return this.cameraButtonText;
    }

    public final String getEmojiButtonIcon() {
        return this.emojiButtonIcon;
    }

    public final String getEmojiButtonText() {
        return this.emojiButtonText;
    }

    public final String getGamingStatsButtonText() {
        return this.gamingStatsButtonText;
    }

    public final String getGifButtonIcon() {
        return this.gifButtonIcon;
    }

    public final String getGifButtonText() {
        return this.gifButtonText;
    }

    public int hashCode() {
        String str = this.cameraButtonIcon;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.gifButtonIcon;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.emojiButtonIcon;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.gamingStatsButtonText;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cameraButtonText;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.gifButtonText;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.emojiButtonText;
        return hashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        String str = this.cameraButtonIcon;
        String str2 = this.gifButtonIcon;
        String str3 = this.emojiButtonIcon;
        String str4 = this.gamingStatsButtonText;
        String str5 = this.cameraButtonText;
        String str6 = this.gifButtonText;
        String str7 = this.emojiButtonText;
        return "ChannelPromptData(cameraButtonIcon=" + str + ", gifButtonIcon=" + str2 + ", emojiButtonIcon=" + str3 + ", gamingStatsButtonText=" + str4 + ", cameraButtonText=" + str5 + ", gifButtonText=" + str6 + ", emojiButtonText=" + str7 + ")";
    }

    public ChannelPromptData(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.cameraButtonIcon = str;
        this.gifButtonIcon = str2;
        this.emojiButtonIcon = str3;
        this.gamingStatsButtonText = str4;
        this.cameraButtonText = str5;
        this.gifButtonText = str6;
        this.emojiButtonText = str7;
    }

    public /* synthetic */ ChannelPromptData(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }
}