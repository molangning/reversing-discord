package com.discord.chat.bridge.ephemeral;

import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B7\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J!\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006$"}, m14357d2 = {"Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;", "", "seen1", "", "content", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "helpArticleLink", "", "helpButtonAccessibilityLabel", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Lcom/discord/chat/bridge/structurabletext/StructurableText;", "getHelpArticleLink", "()Ljava/lang/String;", "getHelpButtonAccessibilityLabel", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class EphemeralIndication {
    public static final Companion Companion = new Companion(null);
    private final StructurableText content;
    private final String helpArticleLink;
    private final String helpButtonAccessibilityLabel;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/ephemeral/EphemeralIndication$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EphemeralIndication> serializer() {
            return EphemeralIndication$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EphemeralIndication(int i, StructurableText structurableText, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            C2620n1.m32836b(i, 7, EphemeralIndication$$serializer.INSTANCE.getDescriptor());
        }
        this.content = structurableText;
        this.helpArticleLink = str;
        this.helpButtonAccessibilityLabel = str2;
    }

    public static /* synthetic */ EphemeralIndication copy$default(EphemeralIndication ephemeralIndication, StructurableText structurableText, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            structurableText = ephemeralIndication.content;
        }
        if ((i & 2) != 0) {
            str = ephemeralIndication.helpArticleLink;
        }
        if ((i & 4) != 0) {
            str2 = ephemeralIndication.helpButtonAccessibilityLabel;
        }
        return ephemeralIndication.copy(structurableText, str, str2);
    }

    public static final void write$Self(EphemeralIndication self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        output.mo12894i(serialDesc, 0, StructurableTextSerializer.INSTANCE, self.content);
        output.mo12880y(serialDesc, 1, self.helpArticleLink);
        output.mo12880y(serialDesc, 2, self.helpButtonAccessibilityLabel);
    }

    public final StructurableText component1() {
        return this.content;
    }

    public final String component2() {
        return this.helpArticleLink;
    }

    public final String component3() {
        return this.helpButtonAccessibilityLabel;
    }

    public final EphemeralIndication copy(StructurableText content, String helpArticleLink, String helpButtonAccessibilityLabel) {
        C9612q.m13917h(content, "content");
        C9612q.m13917h(helpArticleLink, "helpArticleLink");
        C9612q.m13917h(helpButtonAccessibilityLabel, "helpButtonAccessibilityLabel");
        return new EphemeralIndication(content, helpArticleLink, helpButtonAccessibilityLabel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EphemeralIndication) {
            EphemeralIndication ephemeralIndication = (EphemeralIndication) obj;
            return C9612q.m13922c(this.content, ephemeralIndication.content) && C9612q.m13922c(this.helpArticleLink, ephemeralIndication.helpArticleLink) && C9612q.m13922c(this.helpButtonAccessibilityLabel, ephemeralIndication.helpButtonAccessibilityLabel);
        }
        return false;
    }

    public final StructurableText getContent() {
        return this.content;
    }

    public final String getHelpArticleLink() {
        return this.helpArticleLink;
    }

    public final String getHelpButtonAccessibilityLabel() {
        return this.helpButtonAccessibilityLabel;
    }

    public int hashCode() {
        return (((this.content.hashCode() * 31) + this.helpArticleLink.hashCode()) * 31) + this.helpButtonAccessibilityLabel.hashCode();
    }

    public String toString() {
        StructurableText structurableText = this.content;
        String str = this.helpArticleLink;
        String str2 = this.helpButtonAccessibilityLabel;
        return "EphemeralIndication(content=" + structurableText + ", helpArticleLink=" + str + ", helpButtonAccessibilityLabel=" + str2 + ")";
    }

    public EphemeralIndication(StructurableText content, String helpArticleLink, String helpButtonAccessibilityLabel) {
        C9612q.m13917h(content, "content");
        C9612q.m13917h(helpArticleLink, "helpArticleLink");
        C9612q.m13917h(helpButtonAccessibilityLabel, "helpButtonAccessibilityLabel");
        this.content = content;
        this.helpArticleLink = helpArticleLink;
        this.helpButtonAccessibilityLabel = helpButtonAccessibilityLabel;
    }
}
