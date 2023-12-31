package com.discord.chat.bridge.botuikit;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2560a2;
import p045cj.C2590h;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002,-BK\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eB9\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u000fJ\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0011JF\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001J!\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+HÇ\u0001R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014¨\u0006."}, m14357d2 = {"Lcom/discord/chat/bridge/botuikit/StringSelectItem;", "Lcom/discord/chat/bridge/botuikit/SelectItem;", "seen1", "", "label", "", "value", "emoji", "Lcom/discord/chat/bridge/botuikit/ComponentEmoji;", "description", "default", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ComponentEmoji;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ComponentEmoji;Ljava/lang/String;Ljava/lang/Boolean;)V", "getDefault", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDescription", "()Ljava/lang/String;", "getEmoji", "()Lcom/discord/chat/bridge/botuikit/ComponentEmoji;", "getLabel", "getValue", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ComponentEmoji;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/discord/chat/bridge/botuikit/StringSelectItem;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class StringSelectItem extends SelectItem {
    public static final Companion Companion = new Companion(null);

    /* renamed from: default */
    private final Boolean f36922default;
    private final String description;
    private final ComponentEmoji emoji;
    private final String label;
    private final String value;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/botuikit/StringSelectItem$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/botuikit/StringSelectItem;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StringSelectItem> serializer() {
            return StringSelectItem$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StringSelectItem(int i, String str, String str2, ComponentEmoji componentEmoji, String str3, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (3 != (i & 3)) {
            C2620n1.m32836b(i, 3, StringSelectItem$$serializer.INSTANCE.getDescriptor());
        }
        this.label = str;
        this.value = str2;
        if ((i & 4) == 0) {
            this.emoji = null;
        } else {
            this.emoji = componentEmoji;
        }
        if ((i & 8) == 0) {
            this.description = null;
        } else {
            this.description = str3;
        }
        if ((i & 16) == 0) {
            this.f36922default = Boolean.FALSE;
        } else {
            this.f36922default = bool;
        }
    }

    public static /* synthetic */ StringSelectItem copy$default(StringSelectItem stringSelectItem, String str, String str2, ComponentEmoji componentEmoji, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stringSelectItem.getLabel();
        }
        if ((i & 2) != 0) {
            str2 = stringSelectItem.getValue();
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            componentEmoji = stringSelectItem.getEmoji();
        }
        ComponentEmoji componentEmoji2 = componentEmoji;
        if ((i & 8) != 0) {
            str3 = stringSelectItem.description;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            bool = stringSelectItem.f36922default;
        }
        return stringSelectItem.copy(str, str4, componentEmoji2, str5, bool);
    }

    public static final void write$Self(StringSelectItem self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        boolean z2;
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        SelectItem.write$Self(self, output, serialDesc);
        boolean z3 = false;
        output.mo12880y(serialDesc, 0, self.getLabel());
        output.mo12880y(serialDesc, 1, self.getValue());
        if (output.mo12879z(serialDesc, 2) || self.getEmoji() != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo12904E(serialDesc, 2, ComponentEmoji$$serializer.INSTANCE, self.getEmoji());
        }
        if (output.mo12879z(serialDesc, 3) || self.description != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            output.mo12904E(serialDesc, 3, C2560a2.f7013a, self.description);
        }
        if (output.mo12879z(serialDesc, 4) || !C9612q.m13922c(self.f36922default, Boolean.FALSE)) {
            z3 = true;
        }
        if (z3) {
            output.mo12904E(serialDesc, 4, C2590h.f7055a, self.f36922default);
        }
    }

    public final String component1() {
        return getLabel();
    }

    public final String component2() {
        return getValue();
    }

    public final ComponentEmoji component3() {
        return getEmoji();
    }

    public final String component4() {
        return this.description;
    }

    public final Boolean component5() {
        return this.f36922default;
    }

    public final StringSelectItem copy(String label, String value, ComponentEmoji componentEmoji, String str, Boolean bool) {
        C9612q.m13917h(label, "label");
        C9612q.m13917h(value, "value");
        return new StringSelectItem(label, value, componentEmoji, str, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StringSelectItem) {
            StringSelectItem stringSelectItem = (StringSelectItem) obj;
            return C9612q.m13922c(getLabel(), stringSelectItem.getLabel()) && C9612q.m13922c(getValue(), stringSelectItem.getValue()) && C9612q.m13922c(getEmoji(), stringSelectItem.getEmoji()) && C9612q.m13922c(this.description, stringSelectItem.description) && C9612q.m13922c(this.f36922default, stringSelectItem.f36922default);
        }
        return false;
    }

    public final Boolean getDefault() {
        return this.f36922default;
    }

    public final String getDescription() {
        return this.description;
    }

    @Override // com.discord.chat.bridge.botuikit.SelectItem
    public ComponentEmoji getEmoji() {
        return this.emoji;
    }

    @Override // com.discord.chat.bridge.botuikit.SelectItem
    public String getLabel() {
        return this.label;
    }

    @Override // com.discord.chat.bridge.botuikit.SelectItem
    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = ((((getLabel().hashCode() * 31) + getValue().hashCode()) * 31) + (getEmoji() == null ? 0 : getEmoji().hashCode())) * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f36922default;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String label = getLabel();
        String value = getValue();
        ComponentEmoji emoji = getEmoji();
        String str = this.description;
        Boolean bool = this.f36922default;
        return "StringSelectItem(label=" + label + ", value=" + value + ", emoji=" + emoji + ", description=" + str + ", default=" + bool + ")";
    }

    public /* synthetic */ StringSelectItem(String str, String str2, ComponentEmoji componentEmoji, String str3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : componentEmoji, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? Boolean.FALSE : bool);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringSelectItem(String label, String value, ComponentEmoji componentEmoji, String str, Boolean bool) {
        super(null);
        C9612q.m13917h(label, "label");
        C9612q.m13917h(value, "value");
        this.label = label;
        this.value = value;
        this.emoji = componentEmoji;
        this.description = str;
        this.f36922default = bool;
    }
}