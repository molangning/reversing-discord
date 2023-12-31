package com.discord.chat.input.bridge;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000212BU\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\n¢\u0006\u0002\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003JS\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\nHÆ\u0001J\u0013\u0010%\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001J!\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200HÇ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016¨\u00063"}, m14357d2 = {"Lcom/discord/chat/input/bridge/ChatInputNode;", "", "seen1", "", "type", "location", "length", "style", "Lcom/discord/chat/input/bridge/ChatInputNodeStyle;", "deleteNodeOnBackspace", "", "tapAction", "Lcom/discord/chat/input/bridge/TapAction;", "editDisabled", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIIILcom/discord/chat/input/bridge/ChatInputNodeStyle;ZLcom/discord/chat/input/bridge/TapAction;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(IIILcom/discord/chat/input/bridge/ChatInputNodeStyle;ZLcom/discord/chat/input/bridge/TapAction;Z)V", "getDeleteNodeOnBackspace", "()Z", "getEditDisabled", "getLength", "()I", "getLocation", "getStyle", "()Lcom/discord/chat/input/bridge/ChatInputNodeStyle;", "getTapAction", "()Lcom/discord/chat/input/bridge/TapAction;", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_input_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChatInputNode {
    public static final Companion Companion = new Companion(null);
    private final boolean deleteNodeOnBackspace;
    private final boolean editDisabled;
    private final int length;
    private final int location;
    private final ChatInputNodeStyle style;
    private final TapAction tapAction;
    private final int type;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/input/bridge/ChatInputNode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/input/bridge/ChatInputNode;", "chat_input_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChatInputNode> serializer() {
            return ChatInputNode$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChatInputNode(int i, int i2, int i3, int i4, ChatInputNodeStyle chatInputNodeStyle, boolean z, TapAction tapAction, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            C2620n1.m32836b(i, 7, ChatInputNode$$serializer.INSTANCE.getDescriptor());
        }
        this.type = i2;
        this.location = i3;
        this.length = i4;
        if ((i & 8) == 0) {
            this.style = null;
        } else {
            this.style = chatInputNodeStyle;
        }
        if ((i & 16) == 0) {
            this.deleteNodeOnBackspace = false;
        } else {
            this.deleteNodeOnBackspace = z;
        }
        if ((i & 32) == 0) {
            this.tapAction = null;
        } else {
            this.tapAction = tapAction;
        }
        if ((i & 64) == 0) {
            this.editDisabled = false;
        } else {
            this.editDisabled = z2;
        }
    }

    public static /* synthetic */ ChatInputNode copy$default(ChatInputNode chatInputNode, int i, int i2, int i3, ChatInputNodeStyle chatInputNodeStyle, boolean z, TapAction tapAction, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = chatInputNode.type;
        }
        if ((i4 & 2) != 0) {
            i2 = chatInputNode.location;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            i3 = chatInputNode.length;
        }
        int i6 = i3;
        if ((i4 & 8) != 0) {
            chatInputNodeStyle = chatInputNode.style;
        }
        ChatInputNodeStyle chatInputNodeStyle2 = chatInputNodeStyle;
        if ((i4 & 16) != 0) {
            z = chatInputNode.deleteNodeOnBackspace;
        }
        boolean z3 = z;
        if ((i4 & 32) != 0) {
            tapAction = chatInputNode.tapAction;
        }
        TapAction tapAction2 = tapAction;
        if ((i4 & 64) != 0) {
            z2 = chatInputNode.editDisabled;
        }
        return chatInputNode.copy(i, i5, i6, chatInputNodeStyle2, z3, tapAction2, z2);
    }

    public static final void write$Self(ChatInputNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        boolean z2;
        boolean z3;
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        boolean z4 = false;
        output.mo12882w(serialDesc, 0, self.type);
        output.mo12882w(serialDesc, 1, self.location);
        output.mo12882w(serialDesc, 2, self.length);
        if (output.mo12879z(serialDesc, 3) || self.style != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo12904E(serialDesc, 3, ChatInputNodeStyle$$serializer.INSTANCE, self.style);
        }
        if (output.mo12879z(serialDesc, 4) || self.deleteNodeOnBackspace) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            output.mo12881x(serialDesc, 4, self.deleteNodeOnBackspace);
        }
        if (output.mo12879z(serialDesc, 5) || self.tapAction != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            output.mo12904E(serialDesc, 5, TapAction$$serializer.INSTANCE, self.tapAction);
        }
        if (output.mo12879z(serialDesc, 6) || self.editDisabled) {
            z4 = true;
        }
        if (z4) {
            output.mo12881x(serialDesc, 6, self.editDisabled);
        }
    }

    public final int component1() {
        return this.type;
    }

    public final int component2() {
        return this.location;
    }

    public final int component3() {
        return this.length;
    }

    public final ChatInputNodeStyle component4() {
        return this.style;
    }

    public final boolean component5() {
        return this.deleteNodeOnBackspace;
    }

    public final TapAction component6() {
        return this.tapAction;
    }

    public final boolean component7() {
        return this.editDisabled;
    }

    public final ChatInputNode copy(int i, int i2, int i3, ChatInputNodeStyle chatInputNodeStyle, boolean z, TapAction tapAction, boolean z2) {
        return new ChatInputNode(i, i2, i3, chatInputNodeStyle, z, tapAction, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatInputNode) {
            ChatInputNode chatInputNode = (ChatInputNode) obj;
            return this.type == chatInputNode.type && this.location == chatInputNode.location && this.length == chatInputNode.length && C9612q.m13922c(this.style, chatInputNode.style) && this.deleteNodeOnBackspace == chatInputNode.deleteNodeOnBackspace && C9612q.m13922c(this.tapAction, chatInputNode.tapAction) && this.editDisabled == chatInputNode.editDisabled;
        }
        return false;
    }

    public final boolean getDeleteNodeOnBackspace() {
        return this.deleteNodeOnBackspace;
    }

    public final boolean getEditDisabled() {
        return this.editDisabled;
    }

    public final int getLength() {
        return this.length;
    }

    public final int getLocation() {
        return this.location;
    }

    public final ChatInputNodeStyle getStyle() {
        return this.style;
    }

    public final TapAction getTapAction() {
        return this.tapAction;
    }

    public final int getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i = ((((this.type * 31) + this.location) * 31) + this.length) * 31;
        ChatInputNodeStyle chatInputNodeStyle = this.style;
        int hashCode = (i + (chatInputNodeStyle == null ? 0 : chatInputNodeStyle.hashCode())) * 31;
        boolean z = this.deleteNodeOnBackspace;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode + i2) * 31;
        TapAction tapAction = this.tapAction;
        int hashCode2 = (i3 + (tapAction != null ? tapAction.hashCode() : 0)) * 31;
        boolean z2 = this.editDisabled;
        return hashCode2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        int i = this.type;
        int i2 = this.location;
        int i3 = this.length;
        ChatInputNodeStyle chatInputNodeStyle = this.style;
        boolean z = this.deleteNodeOnBackspace;
        TapAction tapAction = this.tapAction;
        boolean z2 = this.editDisabled;
        return "ChatInputNode(type=" + i + ", location=" + i2 + ", length=" + i3 + ", style=" + chatInputNodeStyle + ", deleteNodeOnBackspace=" + z + ", tapAction=" + tapAction + ", editDisabled=" + z2 + ")";
    }

    public ChatInputNode(int i, int i2, int i3, ChatInputNodeStyle chatInputNodeStyle, boolean z, TapAction tapAction, boolean z2) {
        this.type = i;
        this.location = i2;
        this.length = i3;
        this.style = chatInputNodeStyle;
        this.deleteNodeOnBackspace = z;
        this.tapAction = tapAction;
        this.editDisabled = z2;
    }

    public /* synthetic */ ChatInputNode(int i, int i2, int i3, ChatInputNodeStyle chatInputNodeStyle, boolean z, TapAction tapAction, boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, (i4 & 8) != 0 ? null : chatInputNodeStyle, (i4 & 16) != 0 ? false : z, (i4 & 32) != 0 ? null : tapAction, (i4 & 64) != 0 ? false : z2);
    }
}