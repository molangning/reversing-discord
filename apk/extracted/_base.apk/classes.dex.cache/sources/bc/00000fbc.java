package com.discord.chat.bridge.contentnode;

import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2581f;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000201BT\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000eø\u0001\u0000¢\u0006\u0002\u0010\u000fB6\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u0019\u0010\u001a\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0012J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JN\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\u0007HÖ\u0001J!\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/HÇ\u0001R\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, m14357d2 = {"Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "Lcom/discord/chat/bridge/contentnode/MentionContentNode;", "seen1", "", "channelId", "Lcom/discord/primitives/ChannelId;", "commandId", "", "commandName", "commandKey", "content", "", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getChannelId-o4g7jtM", "()J", "J", "getCommandId", "()Ljava/lang/String;", "getCommandKey", "getCommandName", "getContent", "()Ljava/util/List;", "component1", "component1-o4g7jtM", "component2", "component3", "component4", "component5", "copy", "copy-JrbBJuM", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class CommandMentionContentNode extends MentionContentNode {
    public static final Companion Companion = new Companion(null);
    private final long channelId;
    private final String commandId;
    private final String commandKey;
    private final String commandName;
    private final List<ContentNode> content;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CommandMentionContentNode> serializer() {
            return CommandMentionContentNode$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    private CommandMentionContentNode(int i, ChannelId channelId, String str, String str2, String str3, List<? extends ContentNode> list, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (31 != (i & 31)) {
            C2620n1.m32836b(i, 31, CommandMentionContentNode$$serializer.INSTANCE.getDescriptor());
        }
        this.channelId = channelId.m42056unboximpl();
        this.commandId = str;
        this.commandName = str2;
        this.commandKey = str3;
        this.content = list;
    }

    public /* synthetic */ CommandMentionContentNode(int i, ChannelId channelId, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, channelId, str, str2, str3, list, serializationConstructorMarker);
    }

    public /* synthetic */ CommandMentionContentNode(long j, String str, String str2, String str3, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, str3, list);
    }

    /* renamed from: copy-JrbBJuM$default */
    public static /* synthetic */ CommandMentionContentNode m41462copyJrbBJuM$default(CommandMentionContentNode commandMentionContentNode, long j, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = commandMentionContentNode.channelId;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = commandMentionContentNode.commandId;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = commandMentionContentNode.commandName;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = commandMentionContentNode.commandKey;
        }
        String str6 = str3;
        List<ContentNode> list2 = list;
        if ((i & 16) != 0) {
            list2 = commandMentionContentNode.getContent();
        }
        return commandMentionContentNode.m41464copyJrbBJuM(j2, str4, str5, str6, list2);
    }

    public static final void write$Self(CommandMentionContentNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        MentionContentNode.write$Self(self, output, serialDesc);
        output.mo12894i(serialDesc, 0, ChannelId$$serializer.INSTANCE, ChannelId.m42047boximpl(self.channelId));
        output.mo12880y(serialDesc, 1, self.commandId);
        output.mo12880y(serialDesc, 2, self.commandName);
        output.mo12880y(serialDesc, 3, self.commandKey);
        output.mo12894i(serialDesc, 4, new C2581f(ContentNodeSerializer.INSTANCE), self.getContent());
    }

    /* renamed from: component1-o4g7jtM */
    public final long m41463component1o4g7jtM() {
        return this.channelId;
    }

    public final String component2() {
        return this.commandId;
    }

    public final String component3() {
        return this.commandName;
    }

    public final String component4() {
        return this.commandKey;
    }

    public final List<ContentNode> component5() {
        return getContent();
    }

    /* renamed from: copy-JrbBJuM */
    public final CommandMentionContentNode m41464copyJrbBJuM(long j, String commandId, String commandName, String commandKey, List<? extends ContentNode> content) {
        C9612q.m13917h(commandId, "commandId");
        C9612q.m13917h(commandName, "commandName");
        C9612q.m13917h(commandKey, "commandKey");
        C9612q.m13917h(content, "content");
        return new CommandMentionContentNode(j, commandId, commandName, commandKey, content, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CommandMentionContentNode) {
            CommandMentionContentNode commandMentionContentNode = (CommandMentionContentNode) obj;
            return ChannelId.m42051equalsimpl0(this.channelId, commandMentionContentNode.channelId) && C9612q.m13922c(this.commandId, commandMentionContentNode.commandId) && C9612q.m13922c(this.commandName, commandMentionContentNode.commandName) && C9612q.m13922c(this.commandKey, commandMentionContentNode.commandKey) && C9612q.m13922c(getContent(), commandMentionContentNode.getContent());
        }
        return false;
    }

    /* renamed from: getChannelId-o4g7jtM */
    public final long m41465getChannelIdo4g7jtM() {
        return this.channelId;
    }

    public final String getCommandId() {
        return this.commandId;
    }

    public final String getCommandKey() {
        return this.commandKey;
    }

    public final String getCommandName() {
        return this.commandName;
    }

    @Override // com.discord.chat.bridge.contentnode.MentionContentNode
    public List<ContentNode> getContent() {
        return this.content;
    }

    public int hashCode() {
        return (((((((ChannelId.m42052hashCodeimpl(this.channelId) * 31) + this.commandId.hashCode()) * 31) + this.commandName.hashCode()) * 31) + this.commandKey.hashCode()) * 31) + getContent().hashCode();
    }

    public String toString() {
        String m42054toStringimpl = ChannelId.m42054toStringimpl(this.channelId);
        String str = this.commandId;
        String str2 = this.commandName;
        String str3 = this.commandKey;
        List<ContentNode> content = getContent();
        return "CommandMentionContentNode(channelId=" + m42054toStringimpl + ", commandId=" + str + ", commandName=" + str2 + ", commandKey=" + str3 + ", content=" + content + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    private CommandMentionContentNode(long j, String str, String str2, String str3, List<? extends ContentNode> list) {
        super(null);
        this.channelId = j;
        this.commandId = str;
        this.commandName = str2;
        this.commandKey = str3;
        this.content = list;
    }
}