package com.discord.chat.bridge.botuikit;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2560a2;
import p045cj.C2615m0;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000201BS\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eBA\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013JP\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001J!\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/HÇ\u0001R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016¨\u00062"}, m14357d2 = {"Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;", "Lcom/discord/chat/bridge/botuikit/SelectItem;", "seen1", "", "label", "", "value", "emoji", "Lcom/discord/chat/bridge/botuikit/ComponentEmoji;", "type", "iconSrc", "iconColor", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ComponentEmoji;ILjava/lang/String;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ComponentEmoji;ILjava/lang/String;Ljava/lang/Integer;)V", "getEmoji", "()Lcom/discord/chat/bridge/botuikit/ComponentEmoji;", "getIconColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIconSrc", "()Ljava/lang/String;", "getLabel", "getType", "()I", "getValue", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/ComponentEmoji;ILjava/lang/String;Ljava/lang/Integer;)Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SearchableSelectItem extends SelectItem {
    public static final Companion Companion = new Companion(null);
    private final ComponentEmoji emoji;
    private final Integer iconColor;
    private final String iconSrc;
    private final String label;
    private final int type;
    private final String value;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/botuikit/SearchableSelectItem$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SearchableSelectItem> serializer() {
            return SearchableSelectItem$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchableSelectItem(int i, String str, String str2, ComponentEmoji componentEmoji, int i2, String str3, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (11 != (i & 11)) {
            C2620n1.m32836b(i, 11, SearchableSelectItem$$serializer.INSTANCE.getDescriptor());
        }
        this.label = str;
        this.value = str2;
        if ((i & 4) == 0) {
            this.emoji = null;
        } else {
            this.emoji = componentEmoji;
        }
        this.type = i2;
        if ((i & 16) == 0) {
            this.iconSrc = null;
        } else {
            this.iconSrc = str3;
        }
        if ((i & 32) == 0) {
            this.iconColor = null;
        } else {
            this.iconColor = num;
        }
    }

    public static /* synthetic */ SearchableSelectItem copy$default(SearchableSelectItem searchableSelectItem, String str, String str2, ComponentEmoji componentEmoji, int i, String str3, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = searchableSelectItem.getLabel();
        }
        if ((i2 & 2) != 0) {
            str2 = searchableSelectItem.getValue();
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            componentEmoji = searchableSelectItem.getEmoji();
        }
        ComponentEmoji componentEmoji2 = componentEmoji;
        if ((i2 & 8) != 0) {
            i = searchableSelectItem.type;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str3 = searchableSelectItem.iconSrc;
        }
        String str5 = str3;
        if ((i2 & 32) != 0) {
            num = searchableSelectItem.iconColor;
        }
        return searchableSelectItem.copy(str, str4, componentEmoji2, i3, str5, num);
    }

    public static final void write$Self(SearchableSelectItem self, CompositeEncoder output, SerialDescriptor serialDesc) {
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
        output.mo12882w(serialDesc, 3, self.type);
        if (output.mo12879z(serialDesc, 4) || self.iconSrc != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            output.mo12904E(serialDesc, 4, C2560a2.f7013a, self.iconSrc);
        }
        if (output.mo12879z(serialDesc, 5) || self.iconColor != null) {
            z3 = true;
        }
        if (z3) {
            output.mo12904E(serialDesc, 5, C2615m0.f7088a, self.iconColor);
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

    public final int component4() {
        return this.type;
    }

    public final String component5() {
        return this.iconSrc;
    }

    public final Integer component6() {
        return this.iconColor;
    }

    public final SearchableSelectItem copy(String label, String value, ComponentEmoji componentEmoji, int i, String str, Integer num) {
        C9612q.m13917h(label, "label");
        C9612q.m13917h(value, "value");
        return new SearchableSelectItem(label, value, componentEmoji, i, str, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SearchableSelectItem) {
            SearchableSelectItem searchableSelectItem = (SearchableSelectItem) obj;
            return C9612q.m13922c(getLabel(), searchableSelectItem.getLabel()) && C9612q.m13922c(getValue(), searchableSelectItem.getValue()) && C9612q.m13922c(getEmoji(), searchableSelectItem.getEmoji()) && this.type == searchableSelectItem.type && C9612q.m13922c(this.iconSrc, searchableSelectItem.iconSrc) && C9612q.m13922c(this.iconColor, searchableSelectItem.iconColor);
        }
        return false;
    }

    @Override // com.discord.chat.bridge.botuikit.SelectItem
    public ComponentEmoji getEmoji() {
        return this.emoji;
    }

    public final Integer getIconColor() {
        return this.iconColor;
    }

    public final String getIconSrc() {
        return this.iconSrc;
    }

    @Override // com.discord.chat.bridge.botuikit.SelectItem
    public String getLabel() {
        return this.label;
    }

    public final int getType() {
        return this.type;
    }

    @Override // com.discord.chat.bridge.botuikit.SelectItem
    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = ((((((getLabel().hashCode() * 31) + getValue().hashCode()) * 31) + (getEmoji() == null ? 0 : getEmoji().hashCode())) * 31) + this.type) * 31;
        String str = this.iconSrc;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.iconColor;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        String label = getLabel();
        String value = getValue();
        ComponentEmoji emoji = getEmoji();
        int i = this.type;
        String str = this.iconSrc;
        Integer num = this.iconColor;
        return "SearchableSelectItem(label=" + label + ", value=" + value + ", emoji=" + emoji + ", type=" + i + ", iconSrc=" + str + ", iconColor=" + num + ")";
    }

    public /* synthetic */ SearchableSelectItem(String str, String str2, ComponentEmoji componentEmoji, int i, String str3, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? null : componentEmoji, i, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : num);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchableSelectItem(String label, String value, ComponentEmoji componentEmoji, int i, String str, Integer num) {
        super(null);
        C9612q.m13917h(label, "label");
        C9612q.m13917h(value, "value");
        this.label = label;
        this.value = value;
        this.emoji = componentEmoji;
        this.type = i;
        this.iconSrc = str;
        this.iconColor = num;
    }
}
