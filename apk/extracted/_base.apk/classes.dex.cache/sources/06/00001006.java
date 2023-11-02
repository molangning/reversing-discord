package com.discord.chat.bridge.contentnode;

import com.discord.chat.bridge.spoiler.SpoilerableData;
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

@Metadata(m14358d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0002\"#B=\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\u0010\rJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0003J\u0019\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J!\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÇ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\t\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006$"}, m14357d2 = {"Lcom/discord/chat/bridge/contentnode/SpoilerContentNode;", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "Lcom/discord/chat/bridge/spoiler/SpoilerableData;", "seen1", "", "content", "", "spoilerOrNull", "", "obscureOrNull", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;)V", "getContent", "()Ljava/util/List;", "getObscureOrNull", "()Ljava/lang/String;", "getSpoilerOrNull", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SpoilerContentNode extends ContentNode implements SpoilerableData {
    public static final Companion Companion = new Companion(null);
    private final List<ContentNode> content;
    private final String obscureOrNull;
    private final String spoilerOrNull;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/contentnode/SpoilerContentNode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/SpoilerContentNode;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpoilerContentNode> serializer() {
            return SpoilerContentNode$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SpoilerContentNode(int i, List list, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (1 != (i & 1)) {
            C2620n1.m32836b(i, 1, SpoilerContentNode$$serializer.INSTANCE.getDescriptor());
        }
        this.content = list;
        if ((i & 2) == 0) {
            this.spoilerOrNull = "";
        } else {
            this.spoilerOrNull = str;
        }
        if ((i & 4) == 0) {
            this.obscureOrNull = "";
        } else {
            this.obscureOrNull = str2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpoilerContentNode copy$default(SpoilerContentNode spoilerContentNode, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = spoilerContentNode.content;
        }
        return spoilerContentNode.copy(list);
    }

    public static final void write$Self(SpoilerContentNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        boolean z2 = false;
        output.mo12894i(serialDesc, 0, new C2581f(ContentNodeSerializer.INSTANCE), self.content);
        if (output.mo12879z(serialDesc, 1) || !C9612q.m13922c(self.getSpoilerOrNull(), "")) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo12880y(serialDesc, 1, self.getSpoilerOrNull());
        }
        if (output.mo12879z(serialDesc, 2) || !C9612q.m13922c(self.getObscureOrNull(), "")) {
            z2 = true;
        }
        if (z2) {
            output.mo12880y(serialDesc, 2, self.getObscureOrNull());
        }
    }

    public final List<ContentNode> component1() {
        return this.content;
    }

    public final SpoilerContentNode copy(List<? extends ContentNode> content) {
        C9612q.m13917h(content, "content");
        return new SpoilerContentNode(content);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SpoilerContentNode) && C9612q.m13922c(this.content, ((SpoilerContentNode) obj).content);
    }

    public final List<ContentNode> getContent() {
        return this.content;
    }

    @Override // com.discord.chat.bridge.spoiler.SpoilerableData
    public String getObscureOrNull() {
        return this.obscureOrNull;
    }

    @Override // com.discord.chat.bridge.spoiler.SpoilerableData
    public String getSpoilerOrNull() {
        return this.spoilerOrNull;
    }

    public int hashCode() {
        return this.content.hashCode();
    }

    public String toString() {
        List<ContentNode> list = this.content;
        return "SpoilerContentNode(content=" + list + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SpoilerContentNode(List<? extends ContentNode> content) {
        super(null);
        C9612q.m13917h(content, "content");
        this.content = content;
        this.spoilerOrNull = "";
        this.obscureOrNull = "";
    }
}