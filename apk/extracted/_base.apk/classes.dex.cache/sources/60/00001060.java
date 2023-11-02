package com.discord.chat.bridge.gift;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
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

@Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u000e2\u00020\u0001:\u0003\u000e\u000f\u0010R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005\u0082\u0001\u0002\u0011\u0012¨\u0006\u0013"}, m14357d2 = {"Lcom/discord/chat/bridge/gift/GiftEmbed;", "", ViewProps.BACKGROUND_COLOR, "", "getBackgroundColor", "()I", "headerColor", "getHeaderColor", "headerText", "", "getHeaderText", "()Ljava/lang/String;", "thumbnailCornerRadius", "getThumbnailCornerRadius", "Companion", "Resolved", "Resolving", "Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved;", "Lcom/discord/chat/bridge/gift/GiftEmbed$Resolving;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f(with = GiftEmbedSerializer.class)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public interface GiftEmbed {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/gift/GiftEmbed$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/gift/GiftEmbed;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final KSerializer<GiftEmbed> serializer() {
            return GiftEmbedSerializer.INSTANCE;
        }
    }

    @Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0010\u0011R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, m14357d2 = {"Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved;", "Lcom/discord/chat/bridge/gift/GiftEmbed;", "subtitle", "", "getSubtitle", "()Ljava/lang/String;", "subtitleColor", "", "getSubtitleColor", "()I", "thumbnailUrl", "getThumbnailUrl", "titleColor", "getTitleColor", "titleText", "getTitleText", "Invalid", "Valid", "Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Invalid;", "Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public interface Resolved extends GiftEmbed {

        @Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000278Bq\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011BU\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003Jm\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001J!\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206HÇ\u0001R\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0014\u0010\r\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0014\u0010\t\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017¨\u00069"}, m14357d2 = {"Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Invalid;", "Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved;", "seen1", "", "headerText", "", "headerColor", ViewProps.BACKGROUND_COLOR, "thumbnailCornerRadius", "thumbnailUrl", "titleText", "titleColor", "subtitle", "subtitleColor", "thumbnailBackgroundColor", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;ILjava/lang/String;IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;ILjava/lang/String;II)V", "getBackgroundColor", "()I", "getHeaderColor", "getHeaderText", "()Ljava/lang/String;", "getSubtitle", "getSubtitleColor", "getThumbnailBackgroundColor", "getThumbnailCornerRadius", "getThumbnailUrl", "getTitleColor", "getTitleText", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
        @InterfaceC14277f
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class Invalid implements Resolved {
            public static final Companion Companion = new Companion(null);
            private final int backgroundColor;
            private final int headerColor;
            private final String headerText;
            private final String subtitle;
            private final int subtitleColor;
            private final int thumbnailBackgroundColor;
            private final int thumbnailCornerRadius;
            private final String thumbnailUrl;
            private final int titleColor;
            private final String titleText;

            @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Invalid$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Invalid;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Invalid> serializer() {
                    return GiftEmbed$Resolved$Invalid$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Invalid(int i, String str, int i2, int i3, int i4, String str2, String str3, int i5, String str4, int i6, int i7, SerializationConstructorMarker serializationConstructorMarker) {
                if (1023 != (i & 1023)) {
                    C2620n1.m32836b(i, 1023, GiftEmbed$Resolved$Invalid$$serializer.INSTANCE.getDescriptor());
                }
                this.headerText = str;
                this.headerColor = i2;
                this.backgroundColor = i3;
                this.thumbnailCornerRadius = i4;
                this.thumbnailUrl = str2;
                this.titleText = str3;
                this.titleColor = i5;
                this.subtitle = str4;
                this.subtitleColor = i6;
                this.thumbnailBackgroundColor = i7;
            }

            public static final void write$Self(Invalid self, CompositeEncoder output, SerialDescriptor serialDesc) {
                C9612q.m13917h(self, "self");
                C9612q.m13917h(output, "output");
                C9612q.m13917h(serialDesc, "serialDesc");
                output.mo12880y(serialDesc, 0, self.getHeaderText());
                output.mo12882w(serialDesc, 1, self.getHeaderColor());
                output.mo12882w(serialDesc, 2, self.getBackgroundColor());
                output.mo12882w(serialDesc, 3, self.getThumbnailCornerRadius());
                output.mo12880y(serialDesc, 4, self.getThumbnailUrl());
                output.mo12880y(serialDesc, 5, self.getTitleText());
                output.mo12882w(serialDesc, 6, self.getTitleColor());
                output.mo12880y(serialDesc, 7, self.getSubtitle());
                output.mo12882w(serialDesc, 8, self.getSubtitleColor());
                output.mo12882w(serialDesc, 9, self.thumbnailBackgroundColor);
            }

            public final String component1() {
                return getHeaderText();
            }

            public final int component10() {
                return this.thumbnailBackgroundColor;
            }

            public final int component2() {
                return getHeaderColor();
            }

            public final int component3() {
                return getBackgroundColor();
            }

            public final int component4() {
                return getThumbnailCornerRadius();
            }

            public final String component5() {
                return getThumbnailUrl();
            }

            public final String component6() {
                return getTitleText();
            }

            public final int component7() {
                return getTitleColor();
            }

            public final String component8() {
                return getSubtitle();
            }

            public final int component9() {
                return getSubtitleColor();
            }

            public final Invalid copy(String headerText, int i, int i2, int i3, String thumbnailUrl, String titleText, int i4, String subtitle, int i5, int i6) {
                C9612q.m13917h(headerText, "headerText");
                C9612q.m13917h(thumbnailUrl, "thumbnailUrl");
                C9612q.m13917h(titleText, "titleText");
                C9612q.m13917h(subtitle, "subtitle");
                return new Invalid(headerText, i, i2, i3, thumbnailUrl, titleText, i4, subtitle, i5, i6);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Invalid) {
                    Invalid invalid = (Invalid) obj;
                    return C9612q.m13922c(getHeaderText(), invalid.getHeaderText()) && getHeaderColor() == invalid.getHeaderColor() && getBackgroundColor() == invalid.getBackgroundColor() && getThumbnailCornerRadius() == invalid.getThumbnailCornerRadius() && C9612q.m13922c(getThumbnailUrl(), invalid.getThumbnailUrl()) && C9612q.m13922c(getTitleText(), invalid.getTitleText()) && getTitleColor() == invalid.getTitleColor() && C9612q.m13922c(getSubtitle(), invalid.getSubtitle()) && getSubtitleColor() == invalid.getSubtitleColor() && this.thumbnailBackgroundColor == invalid.thumbnailBackgroundColor;
                }
                return false;
            }

            @Override // com.discord.chat.bridge.gift.GiftEmbed
            public int getBackgroundColor() {
                return this.backgroundColor;
            }

            @Override // com.discord.chat.bridge.gift.GiftEmbed
            public int getHeaderColor() {
                return this.headerColor;
            }

            @Override // com.discord.chat.bridge.gift.GiftEmbed
            public String getHeaderText() {
                return this.headerText;
            }

            @Override // com.discord.chat.bridge.gift.GiftEmbed.Resolved
            public String getSubtitle() {
                return this.subtitle;
            }

            @Override // com.discord.chat.bridge.gift.GiftEmbed.Resolved
            public int getSubtitleColor() {
                return this.subtitleColor;
            }

            public final int getThumbnailBackgroundColor() {
                return this.thumbnailBackgroundColor;
            }

            @Override // com.discord.chat.bridge.gift.GiftEmbed
            public int getThumbnailCornerRadius() {
                return this.thumbnailCornerRadius;
            }

            @Override // com.discord.chat.bridge.gift.GiftEmbed.Resolved
            public String getThumbnailUrl() {
                return this.thumbnailUrl;
            }

            @Override // com.discord.chat.bridge.gift.GiftEmbed.Resolved
            public int getTitleColor() {
                return this.titleColor;
            }

            @Override // com.discord.chat.bridge.gift.GiftEmbed.Resolved
            public String getTitleText() {
                return this.titleText;
            }

            public int hashCode() {
                return (((((((((((((((((getHeaderText().hashCode() * 31) + getHeaderColor()) * 31) + getBackgroundColor()) * 31) + getThumbnailCornerRadius()) * 31) + getThumbnailUrl().hashCode()) * 31) + getTitleText().hashCode()) * 31) + getTitleColor()) * 31) + getSubtitle().hashCode()) * 31) + getSubtitleColor()) * 31) + this.thumbnailBackgroundColor;
            }

            public String toString() {
                String headerText = getHeaderText();
                int headerColor = getHeaderColor();
                int backgroundColor = getBackgroundColor();
                int thumbnailCornerRadius = getThumbnailCornerRadius();
                String thumbnailUrl = getThumbnailUrl();
                String titleText = getTitleText();
                int titleColor = getTitleColor();
                String subtitle = getSubtitle();
                int subtitleColor = getSubtitleColor();
                int i = this.thumbnailBackgroundColor;
                return "Invalid(headerText=" + headerText + ", headerColor=" + headerColor + ", backgroundColor=" + backgroundColor + ", thumbnailCornerRadius=" + thumbnailCornerRadius + ", thumbnailUrl=" + thumbnailUrl + ", titleText=" + titleText + ", titleColor=" + titleColor + ", subtitle=" + subtitle + ", subtitleColor=" + subtitleColor + ", thumbnailBackgroundColor=" + i + ")";
            }

            public Invalid(String headerText, int i, int i2, int i3, String thumbnailUrl, String titleText, int i4, String subtitle, int i5, int i6) {
                C9612q.m13917h(headerText, "headerText");
                C9612q.m13917h(thumbnailUrl, "thumbnailUrl");
                C9612q.m13917h(titleText, "titleText");
                C9612q.m13917h(subtitle, "subtitle");
                this.headerText = headerText;
                this.headerColor = i;
                this.backgroundColor = i2;
                this.thumbnailCornerRadius = i3;
                this.thumbnailUrl = thumbnailUrl;
                this.titleText = titleText;
                this.titleColor = i4;
                this.subtitle = subtitle;
                this.subtitleColor = i5;
                this.thumbnailBackgroundColor = i6;
            }
        }

        @Metadata(m14358d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 S2\u00020\u0001:\u0002RSB¹\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0002\u0010\u001bB\u00ad\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0002\u0010\u001cJ\t\u00103\u001a\u00020\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0015HÆ\u0003J\t\u0010;\u001a\u00020\u0017HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003JÉ\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0005HÆ\u0001J\u0013\u0010F\u001a\u00020\u00172\b\u0010G\u001a\u0004\u0018\u00010HHÖ\u0003J\t\u0010I\u001a\u00020\u0003HÖ\u0001J\t\u0010J\u001a\u00020\u0005HÖ\u0001J!\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020QHÇ\u0001R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u0016\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0014\u0010\r\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0016\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001eR\u0016\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010!¨\u0006T"}, m14357d2 = {"Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;", "Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved;", "seen1", "", "headerText", "", "headerColor", ViewProps.BACKGROUND_COLOR, "thumbnailCornerRadius", "thumbnailUrl", "titleText", "titleColor", "subtitle", "subtitleColor", "bodyText", "bodyTextColor", "acceptLabelText", "acceptLabelColor", "acceptLabelBackgroundColor", "splashUrl", "splashOpacity", "", "canBeAccepted", "", "giftCode", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;IILjava/lang/String;FZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;IILjava/lang/String;FZLjava/lang/String;)V", "getAcceptLabelBackgroundColor", "()I", "getAcceptLabelColor", "getAcceptLabelText", "()Ljava/lang/String;", "getBackgroundColor", "getBodyText", "getBodyTextColor", "getCanBeAccepted", "()Z", "getGiftCode", "getHeaderColor", "getHeaderText", "getSplashOpacity", "()F", "getSplashUrl", "getSubtitle", "getSubtitleColor", "getThumbnailCornerRadius", "getThumbnailUrl", "getTitleColor", "getTitleText", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
        @InterfaceC14277f
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class Valid implements Resolved {
            public static final Companion Companion = new Companion(null);
            private final int acceptLabelBackgroundColor;
            private final int acceptLabelColor;
            private final String acceptLabelText;
            private final int backgroundColor;
            private final String bodyText;
            private final int bodyTextColor;
            private final boolean canBeAccepted;
            private final String giftCode;
            private final int headerColor;
            private final String headerText;
            private final float splashOpacity;
            private final String splashUrl;
            private final String subtitle;
            private final int subtitleColor;
            private final int thumbnailCornerRadius;
            private final String thumbnailUrl;
            private final int titleColor;
            private final String titleText;

            @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Valid> serializer() {
                    return GiftEmbed$Resolved$Valid$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Valid(int i, String str, int i2, int i3, int i4, String str2, String str3, int i5, String str4, int i6, String str5, int i7, String str6, int i8, int i9, String str7, float f, boolean z, String str8, SerializationConstructorMarker serializationConstructorMarker) {
                if (243023 != (i & 243023)) {
                    C2620n1.m32836b(i, 243023, GiftEmbed$Resolved$Valid$$serializer.INSTANCE.getDescriptor());
                }
                this.headerText = str;
                this.headerColor = i2;
                this.backgroundColor = i3;
                this.thumbnailCornerRadius = i4;
                if ((i & 16) == 0) {
                    this.thumbnailUrl = null;
                } else {
                    this.thumbnailUrl = str2;
                }
                if ((i & 32) == 0) {
                    this.titleText = null;
                } else {
                    this.titleText = str3;
                }
                this.titleColor = i5;
                if ((i & 128) == 0) {
                    this.subtitle = null;
                } else {
                    this.subtitle = str4;
                }
                this.subtitleColor = i6;
                if ((i & 512) == 0) {
                    this.bodyText = null;
                } else {
                    this.bodyText = str5;
                }
                this.bodyTextColor = i7;
                if ((i & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) {
                    this.acceptLabelText = null;
                } else {
                    this.acceptLabelText = str6;
                }
                this.acceptLabelColor = i8;
                this.acceptLabelBackgroundColor = i9;
                if ((i & 16384) == 0) {
                    this.splashUrl = null;
                } else {
                    this.splashUrl = str7;
                }
                this.splashOpacity = f;
                this.canBeAccepted = z;
                this.giftCode = str8;
            }

            public static final void write$Self(Valid self, CompositeEncoder output, SerialDescriptor serialDesc) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5;
                C9612q.m13917h(self, "self");
                C9612q.m13917h(output, "output");
                C9612q.m13917h(serialDesc, "serialDesc");
                boolean z6 = false;
                output.mo12880y(serialDesc, 0, self.getHeaderText());
                output.mo12882w(serialDesc, 1, self.getHeaderColor());
                output.mo12882w(serialDesc, 2, self.getBackgroundColor());
                output.mo12882w(serialDesc, 3, self.getThumbnailCornerRadius());
                if (output.mo12879z(serialDesc, 4) || self.getThumbnailUrl() != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    output.mo12904E(serialDesc, 4, C2560a2.f7013a, self.getThumbnailUrl());
                }
                if (output.mo12879z(serialDesc, 5) || self.getTitleText() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    output.mo12904E(serialDesc, 5, C2560a2.f7013a, self.getTitleText());
                }
                output.mo12882w(serialDesc, 6, self.getTitleColor());
                if (output.mo12879z(serialDesc, 7) || self.getSubtitle() != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    output.mo12904E(serialDesc, 7, C2560a2.f7013a, self.getSubtitle());
                }
                output.mo12882w(serialDesc, 8, self.getSubtitleColor());
                if (output.mo12879z(serialDesc, 9) || self.bodyText != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    output.mo12904E(serialDesc, 9, C2560a2.f7013a, self.bodyText);
                }
                output.mo12882w(serialDesc, 10, self.bodyTextColor);
                if (output.mo12879z(serialDesc, 11) || self.acceptLabelText != null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    output.mo12904E(serialDesc, 11, C2560a2.f7013a, self.acceptLabelText);
                }
                output.mo12882w(serialDesc, 12, self.acceptLabelColor);
                output.mo12882w(serialDesc, 13, self.acceptLabelBackgroundColor);
                if (output.mo12879z(serialDesc, 14) || self.splashUrl != null) {
                    z6 = true;
                }
                if (z6) {
                    output.mo12904E(serialDesc, 14, C2560a2.f7013a, self.splashUrl);
                }
                output.mo12886s(serialDesc, 15, self.splashOpacity);
                output.mo12881x(serialDesc, 16, self.canBeAccepted);
                output.mo12880y(serialDesc, 17, self.giftCode);
            }

            public final String component1() {
                return getHeaderText();
            }

            public final String component10() {
                return this.bodyText;
            }

            public final int component11() {
                return this.bodyTextColor;
            }

            public final String component12() {
                return this.acceptLabelText;
            }

            public final int component13() {
                return this.acceptLabelColor;
            }

            public final int component14() {
                return this.acceptLabelBackgroundColor;
            }

            public final String component15() {
                return this.splashUrl;
            }

            public final float component16() {
                return this.splashOpacity;
            }

            public final boolean component17() {
                return this.canBeAccepted;
            }

            public final String component18() {
                return this.giftCode;
            }

            public final int component2() {
                return getHeaderColor();
            }

            public final int component3() {
                return getBackgroundColor();
            }

            public final int component4() {
                return getThumbnailCornerRadius();
            }

            public final String component5() {
                return getThumbnailUrl();
            }

            public final String component6() {
                return getTitleText();
            }

            public final int component7() {
                return getTitleColor();
            }

            public final String component8() {
                return getSubtitle();
            }

            public final int component9() {
                return getSubtitleColor();
            }

            public final Valid copy(String headerText, int i, int i2, int i3, String str, String str2, int i4, String str3, int i5, String str4, int i6, String str5, int i7, int i8, String str6, float f, boolean z, String giftCode) {
                C9612q.m13917h(headerText, "headerText");
                C9612q.m13917h(giftCode, "giftCode");
                return new Valid(headerText, i, i2, i3, str, str2, i4, str3, i5, str4, i6, str5, i7, i8, str6, f, z, giftCode);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Valid) {
                    Valid valid = (Valid) obj;
                    return C9612q.m13922c(getHeaderText(), valid.getHeaderText()) && getHeaderColor() == valid.getHeaderColor() && getBackgroundColor() == valid.getBackgroundColor() && getThumbnailCornerRadius() == valid.getThumbnailCornerRadius() && C9612q.m13922c(getThumbnailUrl(), valid.getThumbnailUrl()) && C9612q.m13922c(getTitleText(), valid.getTitleText()) && getTitleColor() == valid.getTitleColor() && C9612q.m13922c(getSubtitle(), valid.getSubtitle()) && getSubtitleColor() == valid.getSubtitleColor() && C9612q.m13922c(this.bodyText, valid.bodyText) && this.bodyTextColor == valid.bodyTextColor && C9612q.m13922c(this.acceptLabelText, valid.acceptLabelText) && this.acceptLabelColor == valid.acceptLabelColor && this.acceptLabelBackgroundColor == valid.acceptLabelBackgroundColor && C9612q.m13922c(this.splashUrl, valid.splashUrl) && Float.compare(this.splashOpacity, valid.splashOpacity) == 0 && this.canBeAccepted == valid.canBeAccepted && C9612q.m13922c(this.giftCode, valid.giftCode);
                }
                return false;
            }

            public final int getAcceptLabelBackgroundColor() {
                return this.acceptLabelBackgroundColor;
            }

            public final int getAcceptLabelColor() {
                return this.acceptLabelColor;
            }

            public final String getAcceptLabelText() {
                return this.acceptLabelText;
            }

            @Override // com.discord.chat.bridge.gift.GiftEmbed
            public int getBackgroundColor() {
                return this.backgroundColor;
            }

            public final String getBodyText() {
                return this.bodyText;
            }

            public final int getBodyTextColor() {
                return this.bodyTextColor;
            }

            public final boolean getCanBeAccepted() {
                return this.canBeAccepted;
            }

            public final String getGiftCode() {
                return this.giftCode;
            }

            @Override // com.discord.chat.bridge.gift.GiftEmbed
            public int getHeaderColor() {
                return this.headerColor;
            }

            @Override // com.discord.chat.bridge.gift.GiftEmbed
            public String getHeaderText() {
                return this.headerText;
            }

            public final float getSplashOpacity() {
                return this.splashOpacity;
            }

            public final String getSplashUrl() {
                return this.splashUrl;
            }

            @Override // com.discord.chat.bridge.gift.GiftEmbed.Resolved
            public String getSubtitle() {
                return this.subtitle;
            }

            @Override // com.discord.chat.bridge.gift.GiftEmbed.Resolved
            public int getSubtitleColor() {
                return this.subtitleColor;
            }

            @Override // com.discord.chat.bridge.gift.GiftEmbed
            public int getThumbnailCornerRadius() {
                return this.thumbnailCornerRadius;
            }

            @Override // com.discord.chat.bridge.gift.GiftEmbed.Resolved
            public String getThumbnailUrl() {
                return this.thumbnailUrl;
            }

            @Override // com.discord.chat.bridge.gift.GiftEmbed.Resolved
            public int getTitleColor() {
                return this.titleColor;
            }

            @Override // com.discord.chat.bridge.gift.GiftEmbed.Resolved
            public String getTitleText() {
                return this.titleText;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int hashCode = ((((((((((((((((getHeaderText().hashCode() * 31) + getHeaderColor()) * 31) + getBackgroundColor()) * 31) + getThumbnailCornerRadius()) * 31) + (getThumbnailUrl() == null ? 0 : getThumbnailUrl().hashCode())) * 31) + (getTitleText() == null ? 0 : getTitleText().hashCode())) * 31) + getTitleColor()) * 31) + (getSubtitle() == null ? 0 : getSubtitle().hashCode())) * 31) + getSubtitleColor()) * 31;
                String str = this.bodyText;
                int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.bodyTextColor) * 31;
                String str2 = this.acceptLabelText;
                int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.acceptLabelColor) * 31) + this.acceptLabelBackgroundColor) * 31;
                String str3 = this.splashUrl;
                int hashCode4 = (((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + Float.floatToIntBits(this.splashOpacity)) * 31;
                boolean z = this.canBeAccepted;
                int i = z;
                if (z != 0) {
                    i = 1;
                }
                return ((hashCode4 + i) * 31) + this.giftCode.hashCode();
            }

            public String toString() {
                String headerText = getHeaderText();
                int headerColor = getHeaderColor();
                int backgroundColor = getBackgroundColor();
                int thumbnailCornerRadius = getThumbnailCornerRadius();
                String thumbnailUrl = getThumbnailUrl();
                String titleText = getTitleText();
                int titleColor = getTitleColor();
                String subtitle = getSubtitle();
                int subtitleColor = getSubtitleColor();
                String str = this.bodyText;
                int i = this.bodyTextColor;
                String str2 = this.acceptLabelText;
                int i2 = this.acceptLabelColor;
                int i3 = this.acceptLabelBackgroundColor;
                String str3 = this.splashUrl;
                float f = this.splashOpacity;
                boolean z = this.canBeAccepted;
                String str4 = this.giftCode;
                return "Valid(headerText=" + headerText + ", headerColor=" + headerColor + ", backgroundColor=" + backgroundColor + ", thumbnailCornerRadius=" + thumbnailCornerRadius + ", thumbnailUrl=" + thumbnailUrl + ", titleText=" + titleText + ", titleColor=" + titleColor + ", subtitle=" + subtitle + ", subtitleColor=" + subtitleColor + ", bodyText=" + str + ", bodyTextColor=" + i + ", acceptLabelText=" + str2 + ", acceptLabelColor=" + i2 + ", acceptLabelBackgroundColor=" + i3 + ", splashUrl=" + str3 + ", splashOpacity=" + f + ", canBeAccepted=" + z + ", giftCode=" + str4 + ")";
            }

            public Valid(String headerText, int i, int i2, int i3, String str, String str2, int i4, String str3, int i5, String str4, int i6, String str5, int i7, int i8, String str6, float f, boolean z, String giftCode) {
                C9612q.m13917h(headerText, "headerText");
                C9612q.m13917h(giftCode, "giftCode");
                this.headerText = headerText;
                this.headerColor = i;
                this.backgroundColor = i2;
                this.thumbnailCornerRadius = i3;
                this.thumbnailUrl = str;
                this.titleText = str2;
                this.titleColor = i4;
                this.subtitle = str3;
                this.subtitleColor = i5;
                this.bodyText = str4;
                this.bodyTextColor = i6;
                this.acceptLabelText = str5;
                this.acceptLabelColor = i7;
                this.acceptLabelBackgroundColor = i8;
                this.splashUrl = str6;
                this.splashOpacity = f;
                this.canBeAccepted = z;
                this.giftCode = giftCode;
            }

            public /* synthetic */ Valid(String str, int i, int i2, int i3, String str2, String str3, int i4, String str4, int i5, String str5, int i6, String str6, int i7, int i8, String str7, float f, boolean z, String str8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i, i2, i3, (i9 & 16) != 0 ? null : str2, (i9 & 32) != 0 ? null : str3, i4, (i9 & 128) != 0 ? null : str4, i5, (i9 & 512) != 0 ? null : str5, i6, (i9 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : str6, i7, i8, (i9 & 16384) != 0 ? null : str7, f, z, str8);
            }
        }

        String getSubtitle();

        int getSubtitleColor();

        String getThumbnailUrl();

        int getTitleColor();

        String getTitleText();
    }

    @Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002+,BK\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB5\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001J!\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*HÇ\u0001R\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006-"}, m14357d2 = {"Lcom/discord/chat/bridge/gift/GiftEmbed$Resolving;", "Lcom/discord/chat/bridge/gift/GiftEmbed;", "seen1", "", "headerText", "", "headerColor", ViewProps.BACKGROUND_COLOR, "thumbnailCornerRadius", "resolvingGradientStart", "resolvingGradientEnd", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;IIIIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;IIIII)V", "getBackgroundColor", "()I", "getHeaderColor", "getHeaderText", "()Ljava/lang/String;", "getResolvingGradientEnd", "getResolvingGradientStart", "getThumbnailCornerRadius", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    @InterfaceC14277f
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Resolving implements GiftEmbed {
        public static final Companion Companion = new Companion(null);
        private final int backgroundColor;
        private final int headerColor;
        private final String headerText;
        private final int resolvingGradientEnd;
        private final int resolvingGradientStart;
        private final int thumbnailCornerRadius;

        @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/gift/GiftEmbed$Resolving$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/gift/GiftEmbed$Resolving;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Resolving> serializer() {
                return GiftEmbed$Resolving$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Resolving(int i, String str, int i2, int i3, int i4, int i5, int i6, SerializationConstructorMarker serializationConstructorMarker) {
            if (63 != (i & 63)) {
                C2620n1.m32836b(i, 63, GiftEmbed$Resolving$$serializer.INSTANCE.getDescriptor());
            }
            this.headerText = str;
            this.headerColor = i2;
            this.backgroundColor = i3;
            this.thumbnailCornerRadius = i4;
            this.resolvingGradientStart = i5;
            this.resolvingGradientEnd = i6;
        }

        public static /* synthetic */ Resolving copy$default(Resolving resolving, String str, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                str = resolving.getHeaderText();
            }
            if ((i6 & 2) != 0) {
                i = resolving.getHeaderColor();
            }
            int i7 = i;
            if ((i6 & 4) != 0) {
                i2 = resolving.getBackgroundColor();
            }
            int i8 = i2;
            if ((i6 & 8) != 0) {
                i3 = resolving.getThumbnailCornerRadius();
            }
            int i9 = i3;
            if ((i6 & 16) != 0) {
                i4 = resolving.resolvingGradientStart;
            }
            int i10 = i4;
            if ((i6 & 32) != 0) {
                i5 = resolving.resolvingGradientEnd;
            }
            return resolving.copy(str, i7, i8, i9, i10, i5);
        }

        public static final void write$Self(Resolving self, CompositeEncoder output, SerialDescriptor serialDesc) {
            C9612q.m13917h(self, "self");
            C9612q.m13917h(output, "output");
            C9612q.m13917h(serialDesc, "serialDesc");
            output.mo12880y(serialDesc, 0, self.getHeaderText());
            output.mo12882w(serialDesc, 1, self.getHeaderColor());
            output.mo12882w(serialDesc, 2, self.getBackgroundColor());
            output.mo12882w(serialDesc, 3, self.getThumbnailCornerRadius());
            output.mo12882w(serialDesc, 4, self.resolvingGradientStart);
            output.mo12882w(serialDesc, 5, self.resolvingGradientEnd);
        }

        public final String component1() {
            return getHeaderText();
        }

        public final int component2() {
            return getHeaderColor();
        }

        public final int component3() {
            return getBackgroundColor();
        }

        public final int component4() {
            return getThumbnailCornerRadius();
        }

        public final int component5() {
            return this.resolvingGradientStart;
        }

        public final int component6() {
            return this.resolvingGradientEnd;
        }

        public final Resolving copy(String headerText, int i, int i2, int i3, int i4, int i5) {
            C9612q.m13917h(headerText, "headerText");
            return new Resolving(headerText, i, i2, i3, i4, i5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Resolving) {
                Resolving resolving = (Resolving) obj;
                return C9612q.m13922c(getHeaderText(), resolving.getHeaderText()) && getHeaderColor() == resolving.getHeaderColor() && getBackgroundColor() == resolving.getBackgroundColor() && getThumbnailCornerRadius() == resolving.getThumbnailCornerRadius() && this.resolvingGradientStart == resolving.resolvingGradientStart && this.resolvingGradientEnd == resolving.resolvingGradientEnd;
            }
            return false;
        }

        @Override // com.discord.chat.bridge.gift.GiftEmbed
        public int getBackgroundColor() {
            return this.backgroundColor;
        }

        @Override // com.discord.chat.bridge.gift.GiftEmbed
        public int getHeaderColor() {
            return this.headerColor;
        }

        @Override // com.discord.chat.bridge.gift.GiftEmbed
        public String getHeaderText() {
            return this.headerText;
        }

        public final int getResolvingGradientEnd() {
            return this.resolvingGradientEnd;
        }

        public final int getResolvingGradientStart() {
            return this.resolvingGradientStart;
        }

        @Override // com.discord.chat.bridge.gift.GiftEmbed
        public int getThumbnailCornerRadius() {
            return this.thumbnailCornerRadius;
        }

        public int hashCode() {
            return (((((((((getHeaderText().hashCode() * 31) + getHeaderColor()) * 31) + getBackgroundColor()) * 31) + getThumbnailCornerRadius()) * 31) + this.resolvingGradientStart) * 31) + this.resolvingGradientEnd;
        }

        public String toString() {
            String headerText = getHeaderText();
            int headerColor = getHeaderColor();
            int backgroundColor = getBackgroundColor();
            int thumbnailCornerRadius = getThumbnailCornerRadius();
            int i = this.resolvingGradientStart;
            int i2 = this.resolvingGradientEnd;
            return "Resolving(headerText=" + headerText + ", headerColor=" + headerColor + ", backgroundColor=" + backgroundColor + ", thumbnailCornerRadius=" + thumbnailCornerRadius + ", resolvingGradientStart=" + i + ", resolvingGradientEnd=" + i2 + ")";
        }

        public Resolving(String headerText, int i, int i2, int i3, int i4, int i5) {
            C9612q.m13917h(headerText, "headerText");
            this.headerText = headerText;
            this.headerColor = i;
            this.backgroundColor = i2;
            this.thumbnailCornerRadius = i3;
            this.resolvingGradientStart = i4;
            this.resolvingGradientEnd = i5;
        }
    }

    int getBackgroundColor();

    int getHeaderColor();

    String getHeaderText();

    int getThumbnailCornerRadius();
}