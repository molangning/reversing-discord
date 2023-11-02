package com.discord.chat.bridge.contentnode;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B5\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J!\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006$"}, m14357d2 = {"Lcom/discord/chat/bridge/contentnode/UnicodeEmojiContentNode;", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "seen1", "", "content", "", "surrogate", "jumboable", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getContent", "()Ljava/lang/String;", "getJumboable", "()Z", "getSurrogate", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class UnicodeEmojiContentNode extends EmojiContentNode {
    public static final Companion Companion = new Companion(null);
    private final String content;
    private final boolean jumboable;
    private final String surrogate;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/contentnode/UnicodeEmojiContentNode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/UnicodeEmojiContentNode;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UnicodeEmojiContentNode> serializer() {
            return UnicodeEmojiContentNode$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UnicodeEmojiContentNode(int i, String str, String str2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (3 != (i & 3)) {
            C2620n1.m32836b(i, 3, UnicodeEmojiContentNode$$serializer.INSTANCE.getDescriptor());
        }
        this.content = str;
        this.surrogate = str2;
        if ((i & 4) == 0) {
            this.jumboable = false;
        } else {
            this.jumboable = z;
        }
    }

    public static /* synthetic */ UnicodeEmojiContentNode copy$default(UnicodeEmojiContentNode unicodeEmojiContentNode, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unicodeEmojiContentNode.content;
        }
        if ((i & 2) != 0) {
            str2 = unicodeEmojiContentNode.surrogate;
        }
        if ((i & 4) != 0) {
            z = unicodeEmojiContentNode.getJumboable();
        }
        return unicodeEmojiContentNode.copy(str, str2, z);
    }

    public static final void write$Self(UnicodeEmojiContentNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        EmojiContentNode.write$Self(self, output, serialDesc);
        boolean z = false;
        output.mo12880y(serialDesc, 0, self.content);
        output.mo12880y(serialDesc, 1, self.surrogate);
        if (output.mo12879z(serialDesc, 2) || self.getJumboable()) {
            z = true;
        }
        if (z) {
            output.mo12881x(serialDesc, 2, self.getJumboable());
        }
    }

    public final String component1() {
        return this.content;
    }

    public final String component2() {
        return this.surrogate;
    }

    public final boolean component3() {
        return getJumboable();
    }

    public final UnicodeEmojiContentNode copy(String content, String surrogate, boolean z) {
        C9612q.m13917h(content, "content");
        C9612q.m13917h(surrogate, "surrogate");
        return new UnicodeEmojiContentNode(content, surrogate, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnicodeEmojiContentNode) {
            UnicodeEmojiContentNode unicodeEmojiContentNode = (UnicodeEmojiContentNode) obj;
            return C9612q.m13922c(this.content, unicodeEmojiContentNode.content) && C9612q.m13922c(this.surrogate, unicodeEmojiContentNode.surrogate) && getJumboable() == unicodeEmojiContentNode.getJumboable();
        }
        return false;
    }

    public final String getContent() {
        return this.content;
    }

    @Override // com.discord.chat.presentation.textutils.Jumboable
    public boolean getJumboable() {
        return this.jumboable;
    }

    public final String getSurrogate() {
        return this.surrogate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int hashCode = ((this.content.hashCode() * 31) + this.surrogate.hashCode()) * 31;
        boolean jumboable = getJumboable();
        ?? r1 = jumboable;
        if (jumboable) {
            r1 = 1;
        }
        return hashCode + r1;
    }

    public String toString() {
        String str = this.content;
        String str2 = this.surrogate;
        boolean jumboable = getJumboable();
        return "UnicodeEmojiContentNode(content=" + str + ", surrogate=" + str2 + ", jumboable=" + jumboable + ")";
    }

    public /* synthetic */ UnicodeEmojiContentNode(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnicodeEmojiContentNode(String content, String surrogate, boolean z) {
        super(null);
        C9612q.m13917h(content, "content");
        C9612q.m13917h(surrogate, "surrogate");
        this.content = content;
        this.surrogate = surrogate;
        this.jumboable = z;
    }
}