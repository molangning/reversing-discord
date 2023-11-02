package com.discord.chat.bridge.spoiler;

import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.embed.Embed;
import com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B \u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0019\u0010\u000f\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\nJ\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016J4\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\b\u0010\u001e\u001a\u00020\u001cH\u0002J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, m14357d2 = {"Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "", "identifier", "Lcom/discord/chat/bridge/spoiler/SpoilerIdentifier;", "label", "", "type", "Lcom/discord/chat/bridge/spoiler/SpoilerType;", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/spoiler/SpoilerType;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getIdentifier-Bq9X6Gg", "()Ljava/lang/String;", "Ljava/lang/String;", "getLabel", "getType", "()Lcom/discord/chat/bridge/spoiler/SpoilerType;", "component1", "component1-Bq9X6Gg", "component2", "component3", "configure", "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "onTapSpoiler", "Lkotlin/Function0;", "", "copy", "copy-hoKre8U", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/spoiler/SpoilerType;)Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "equals", "", "other", "hasSpoilerConfig", "hashCode", "", "toString", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SpoilerAttributes {
    public static final Companion Companion = new Companion(null);
    private final String identifier;
    private final String label;
    private final SpoilerType type;

    @Metadata(m14358d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ \u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ/\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, m14357d2 = {"Lcom/discord/chat/bridge/spoiler/SpoilerAttributes$Companion;", "", "()V", "forAttachment", "Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "attachment", "Lcom/discord/chat/bridge/attachment/Attachment;", "message", "Lcom/discord/chat/bridge/Message;", "index", "", "forEmbed", "embed", "Lcom/discord/chat/bridge/embed/Embed;", "forItem", "spoilerableData", "Lcom/discord/chat/bridge/spoiler/SpoilerableData;", "messageId", "Lcom/discord/primitives/MessageId;", "key", "", "forItem-A9xMOlw", "(Lcom/discord/chat/bridge/spoiler/SpoilerableData;Ljava/lang/String;Ljava/lang/String;)Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "forMediaPostPreviewEmbed", "Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: forItem-A9xMOlw  reason: not valid java name */
        private final SpoilerAttributes m41544forItemA9xMOlw(SpoilerableData spoilerableData, String str, String str2) {
            String obscureOrNull = spoilerableData.getObscureOrNull();
            if (obscureOrNull != null) {
                String m42079toStringimpl = MessageId.m42079toStringimpl(str);
                return new SpoilerAttributes(SpoilerIdentifier.m41548constructorimpl("obscure:messageId" + m42079toStringimpl + ":" + str2), obscureOrNull, SpoilerType.OBSCURE, null);
            }
            String spoilerOrNull = spoilerableData.getSpoilerOrNull();
            if (spoilerOrNull == null) {
                return null;
            }
            String m42079toStringimpl2 = MessageId.m42079toStringimpl(str);
            return new SpoilerAttributes(SpoilerIdentifier.m41548constructorimpl("spoiler:messageId" + m42079toStringimpl2 + ":" + str2), spoilerOrNull, SpoilerType.SPOILER, null);
        }

        public final SpoilerAttributes forAttachment(Attachment attachment, Message message, int i) {
            C9612q.m13917h(attachment, "attachment");
            C9612q.m13917h(message, "message");
            String m41436getId3Eiw7ao = message.m41436getId3Eiw7ao();
            String indexLabel = attachment.type().getIndexLabel();
            return m41544forItemA9xMOlw(attachment, m41436getId3Eiw7ao, indexLabel + i);
        }

        public final SpoilerAttributes forEmbed(Embed embed, Message message, int i) {
            C9612q.m13917h(embed, "embed");
            C9612q.m13917h(message, "message");
            String m41436getId3Eiw7ao = message.m41436getId3Eiw7ao();
            return m41544forItemA9xMOlw(embed, m41436getId3Eiw7ao, "embedIndex" + i);
        }

        public final SpoilerAttributes forMediaPostPreviewEmbed(PostPreviewEmbed embed, Message message, int i) {
            C9612q.m13917h(embed, "embed");
            C9612q.m13917h(message, "message");
            String m41436getId3Eiw7ao = message.m41436getId3Eiw7ao();
            return m41544forItemA9xMOlw(embed, m41436getId3Eiw7ao, "mediaPostPreviewEmbed" + i);
        }
    }

    private SpoilerAttributes(String str, String str2, SpoilerType spoilerType) {
        this.identifier = str;
        this.label = str2;
        this.type = spoilerType;
    }

    public /* synthetic */ SpoilerAttributes(String str, String str2, SpoilerType spoilerType, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, spoilerType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpoilerConfig configure$default(SpoilerAttributes spoilerAttributes, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = SpoilerAttributes$configure$1.INSTANCE;
        }
        return spoilerAttributes.configure(function0);
    }

    /* renamed from: copy-hoKre8U$default  reason: not valid java name */
    public static /* synthetic */ SpoilerAttributes m41540copyhoKre8U$default(SpoilerAttributes spoilerAttributes, String str, String str2, SpoilerType spoilerType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spoilerAttributes.identifier;
        }
        if ((i & 2) != 0) {
            str2 = spoilerAttributes.label;
        }
        if ((i & 4) != 0) {
            spoilerType = spoilerAttributes.type;
        }
        return spoilerAttributes.m41542copyhoKre8U(str, str2, spoilerType);
    }

    private final boolean hasSpoilerConfig() {
        if (!SpoilerManager.INSTANCE.m41555isNotRevealedV2PEE7g(this.identifier) && this.type != SpoilerType.OBSCURE) {
            return false;
        }
        return true;
    }

    /* renamed from: component1-Bq9X6Gg  reason: not valid java name */
    public final String m41541component1Bq9X6Gg() {
        return this.identifier;
    }

    public final String component2() {
        return this.label;
    }

    public final SpoilerType component3() {
        return this.type;
    }

    public final SpoilerConfig configure(Function0<Unit> onTapSpoiler) {
        SpoilerAttributes spoilerAttributes;
        C9612q.m13917h(onTapSpoiler, "onTapSpoiler");
        if (hasSpoilerConfig()) {
            spoilerAttributes = this;
        } else {
            spoilerAttributes = null;
        }
        if (spoilerAttributes == null) {
            return null;
        }
        return new SpoilerConfig(spoilerAttributes, new SpoilerAttributes$configure$3$1(onTapSpoiler), new SpoilerAttributes$configure$3$2(onTapSpoiler));
    }

    /* renamed from: copy-hoKre8U  reason: not valid java name */
    public final SpoilerAttributes m41542copyhoKre8U(String identifier, String label, SpoilerType type) {
        C9612q.m13917h(identifier, "identifier");
        C9612q.m13917h(label, "label");
        C9612q.m13917h(type, "type");
        return new SpoilerAttributes(identifier, label, type, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SpoilerAttributes) {
            SpoilerAttributes spoilerAttributes = (SpoilerAttributes) obj;
            return SpoilerIdentifier.m41550equalsimpl0(this.identifier, spoilerAttributes.identifier) && C9612q.m13922c(this.label, spoilerAttributes.label) && this.type == spoilerAttributes.type;
        }
        return false;
    }

    /* renamed from: getIdentifier-Bq9X6Gg  reason: not valid java name */
    public final String m41543getIdentifierBq9X6Gg() {
        return this.identifier;
    }

    public final String getLabel() {
        return this.label;
    }

    public final SpoilerType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((SpoilerIdentifier.m41551hashCodeimpl(this.identifier) * 31) + this.label.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        String m41552toStringimpl = SpoilerIdentifier.m41552toStringimpl(this.identifier);
        String str = this.label;
        SpoilerType spoilerType = this.type;
        return "SpoilerAttributes(identifier=" + m41552toStringimpl + ", label=" + str + ", type=" + spoilerType + ")";
    }
}
