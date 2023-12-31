package com.discord.chat.bridge.structurabletext;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m14357d2 = {"Lcom/discord/chat/bridge/structurabletext/PrimitiveStructurableText;", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "content", "", "(Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "hasContent", "", "getHasContent", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f(with = PrimitiveStructurableTextSerializer.class)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class PrimitiveStructurableText extends StructurableText {
    public static final Companion Companion = new Companion(null);
    private final String content;
    private final boolean hasContent;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/structurabletext/PrimitiveStructurableText$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/structurabletext/PrimitiveStructurableText;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PrimitiveStructurableText> serializer() {
            return PrimitiveStructurableTextSerializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimitiveStructurableText(String content) {
        super(null);
        boolean z;
        C9612q.m13917h(content, "content");
        this.content = content;
        if (content.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        this.hasContent = z;
    }

    public static /* synthetic */ PrimitiveStructurableText copy$default(PrimitiveStructurableText primitiveStructurableText, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = primitiveStructurableText.content;
        }
        return primitiveStructurableText.copy(str);
    }

    public final String component1() {
        return this.content;
    }

    public final PrimitiveStructurableText copy(String content) {
        C9612q.m13917h(content, "content");
        return new PrimitiveStructurableText(content);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrimitiveStructurableText) && C9612q.m13922c(this.content, ((PrimitiveStructurableText) obj).content);
    }

    public final String getContent() {
        return this.content;
    }

    @Override // com.discord.chat.bridge.structurabletext.StructurableText
    public boolean getHasContent() {
        return this.hasContent;
    }

    public int hashCode() {
        return this.content.hashCode();
    }

    public String toString() {
        String str = this.content;
        return "PrimitiveStructurableText(content=" + str + ")";
    }
}