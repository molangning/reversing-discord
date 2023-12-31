package com.discord.chat.input.bridge;

import com.discord.span.utilities.common.BackgroundStyle;
import com.discord.span.utilities.common.BackgroundStyle$$serializer;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2615m0;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002*+B?\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB/\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\rJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J<\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J!\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)HÇ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006,"}, m14357d2 = {"Lcom/discord/chat/input/bridge/ChatInputNodeStyle;", "", "seen1", "", ViewProps.FONT_SIZE, ViewProps.COLOR, "backgroundStyle", "Lcom/discord/span/utilities/common/BackgroundStyle;", ViewProps.FONT_WEIGHT, "Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Integer;ILcom/discord/span/utilities/common/BackgroundStyle;Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Integer;ILcom/discord/span/utilities/common/BackgroundStyle;Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight;)V", "getBackgroundStyle", "()Lcom/discord/span/utilities/common/BackgroundStyle;", "getColor", "()I", "getFontSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFontWeight", "()Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;ILcom/discord/span/utilities/common/BackgroundStyle;Lcom/discord/chat/input/bridge/ChatInputNodeFontWeight;)Lcom/discord/chat/input/bridge/ChatInputNodeStyle;", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_input_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChatInputNodeStyle {
    public static final Companion Companion = new Companion(null);
    private final BackgroundStyle backgroundStyle;
    private final int color;
    private final Integer fontSize;
    private final ChatInputNodeFontWeight fontWeight;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/input/bridge/ChatInputNodeStyle$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/input/bridge/ChatInputNodeStyle;", "chat_input_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChatInputNodeStyle> serializer() {
            return ChatInputNodeStyle$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChatInputNodeStyle(int i, Integer num, int i2, BackgroundStyle backgroundStyle, ChatInputNodeFontWeight chatInputNodeFontWeight, SerializationConstructorMarker serializationConstructorMarker) {
        if (6 != (i & 6)) {
            C2620n1.m32836b(i, 6, ChatInputNodeStyle$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.fontSize = null;
        } else {
            this.fontSize = num;
        }
        this.color = i2;
        this.backgroundStyle = backgroundStyle;
        if ((i & 8) == 0) {
            this.fontWeight = null;
        } else {
            this.fontWeight = chatInputNodeFontWeight;
        }
    }

    public static /* synthetic */ ChatInputNodeStyle copy$default(ChatInputNodeStyle chatInputNodeStyle, Integer num, int i, BackgroundStyle backgroundStyle, ChatInputNodeFontWeight chatInputNodeFontWeight, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = chatInputNodeStyle.fontSize;
        }
        if ((i2 & 2) != 0) {
            i = chatInputNodeStyle.color;
        }
        if ((i2 & 4) != 0) {
            backgroundStyle = chatInputNodeStyle.backgroundStyle;
        }
        if ((i2 & 8) != 0) {
            chatInputNodeFontWeight = chatInputNodeStyle.fontWeight;
        }
        return chatInputNodeStyle.copy(num, i, backgroundStyle, chatInputNodeFontWeight);
    }

    public static final void write$Self(ChatInputNodeStyle self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        boolean z2 = false;
        if (output.mo12879z(serialDesc, 0) || self.fontSize != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo12904E(serialDesc, 0, C2615m0.f7088a, self.fontSize);
        }
        output.mo12882w(serialDesc, 1, self.color);
        output.mo12904E(serialDesc, 2, BackgroundStyle$$serializer.INSTANCE, self.backgroundStyle);
        if (output.mo12879z(serialDesc, 3) || self.fontWeight != null) {
            z2 = true;
        }
        if (z2) {
            output.mo12904E(serialDesc, 3, ChatInputNodeFontWeight.Companion.serializer(), self.fontWeight);
        }
    }

    public final Integer component1() {
        return this.fontSize;
    }

    public final int component2() {
        return this.color;
    }

    public final BackgroundStyle component3() {
        return this.backgroundStyle;
    }

    public final ChatInputNodeFontWeight component4() {
        return this.fontWeight;
    }

    public final ChatInputNodeStyle copy(Integer num, int i, BackgroundStyle backgroundStyle, ChatInputNodeFontWeight chatInputNodeFontWeight) {
        return new ChatInputNodeStyle(num, i, backgroundStyle, chatInputNodeFontWeight);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatInputNodeStyle) {
            ChatInputNodeStyle chatInputNodeStyle = (ChatInputNodeStyle) obj;
            return C9612q.m13922c(this.fontSize, chatInputNodeStyle.fontSize) && this.color == chatInputNodeStyle.color && C9612q.m13922c(this.backgroundStyle, chatInputNodeStyle.backgroundStyle) && this.fontWeight == chatInputNodeStyle.fontWeight;
        }
        return false;
    }

    public final BackgroundStyle getBackgroundStyle() {
        return this.backgroundStyle;
    }

    public final int getColor() {
        return this.color;
    }

    public final Integer getFontSize() {
        return this.fontSize;
    }

    public final ChatInputNodeFontWeight getFontWeight() {
        return this.fontWeight;
    }

    public int hashCode() {
        Integer num = this.fontSize;
        int hashCode = (((num == null ? 0 : num.hashCode()) * 31) + this.color) * 31;
        BackgroundStyle backgroundStyle = this.backgroundStyle;
        int hashCode2 = (hashCode + (backgroundStyle == null ? 0 : backgroundStyle.hashCode())) * 31;
        ChatInputNodeFontWeight chatInputNodeFontWeight = this.fontWeight;
        return hashCode2 + (chatInputNodeFontWeight != null ? chatInputNodeFontWeight.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.fontSize;
        int i = this.color;
        BackgroundStyle backgroundStyle = this.backgroundStyle;
        ChatInputNodeFontWeight chatInputNodeFontWeight = this.fontWeight;
        return "ChatInputNodeStyle(fontSize=" + num + ", color=" + i + ", backgroundStyle=" + backgroundStyle + ", fontWeight=" + chatInputNodeFontWeight + ")";
    }

    public ChatInputNodeStyle(Integer num, int i, BackgroundStyle backgroundStyle, ChatInputNodeFontWeight chatInputNodeFontWeight) {
        this.fontSize = num;
        this.color = i;
        this.backgroundStyle = backgroundStyle;
        this.fontWeight = chatInputNodeFontWeight;
    }

    public /* synthetic */ ChatInputNodeStyle(Integer num, int i, BackgroundStyle backgroundStyle, ChatInputNodeFontWeight chatInputNodeFontWeight, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : num, i, backgroundStyle, (i2 & 8) != 0 ? null : chatInputNodeFontWeight);
    }
}