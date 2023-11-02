package com.discord.chat.reactevents;

import co.discord.media_engine.C2689b;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.chat.bridge.botuikit.ChannelSelectComponent;
import com.discord.chat.bridge.botuikit.ComponentEmoji;
import com.discord.chat.bridge.botuikit.SearchableSelectComponent;
import com.discord.chat.bridge.botuikit.SearchableSelectItem;
import com.discord.chat.bridge.botuikit.SelectComponent;
import com.discord.chat.bridge.botuikit.StringSelectComponent;
import com.discord.chat.bridge.botuikit.StringSelectItem;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.ReadableNativeArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002,-B8\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000bø\u0001\u0000¢\u0006\u0002\u0010\fB \u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\tø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0019\u0010\u0015\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0011J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J4\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\b\u0010!\u001a\u00020\"H\u0016J\t\u0010#\u001a\u00020$HÖ\u0001J!\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+HÇ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, m14357d2 = {"Lcom/discord/chat/reactevents/TapSelectActionComponent;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "messageId", "Lcom/discord/primitives/MessageId;", "messageFlags", "", "selectionActionComponent", "Lcom/discord/chat/bridge/botuikit/SelectComponent;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;JLcom/discord/chat/bridge/botuikit/SelectComponent;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;JLcom/discord/chat/bridge/botuikit/SelectComponent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageFlags", "()J", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getSelectionActionComponent", "()Lcom/discord/chat/bridge/botuikit/SelectComponent;", "component1", "component1-3Eiw7ao", "component2", "component3", "copy", "copy-u7_MRrM", "(Ljava/lang/String;JLcom/discord/chat/bridge/botuikit/SelectComponent;)Lcom/discord/chat/reactevents/TapSelectActionComponent;", "equals", "", "other", "", "hashCode", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class TapSelectActionComponent implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final long messageFlags;
    private final String messageId;
    private final SelectComponent selectionActionComponent;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/reactevents/TapSelectActionComponent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/TapSelectActionComponent;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TapSelectActionComponent> serializer() {
            return TapSelectActionComponent$$serializer.INSTANCE;
        }
    }

    private TapSelectActionComponent(int i, String str, long j, SelectComponent selectComponent, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            C2620n1.m32836b(i, 7, TapSelectActionComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.messageId = str;
        this.messageFlags = j;
        this.selectionActionComponent = selectComponent;
    }

    public /* synthetic */ TapSelectActionComponent(int i, String str, long j, SelectComponent selectComponent, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, j, selectComponent, serializationConstructorMarker);
    }

    public /* synthetic */ TapSelectActionComponent(String str, long j, SelectComponent selectComponent, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, selectComponent);
    }

    /* renamed from: copy-u7_MRrM$default */
    public static /* synthetic */ TapSelectActionComponent m41885copyu7_MRrM$default(TapSelectActionComponent tapSelectActionComponent, String str, long j, SelectComponent selectComponent, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tapSelectActionComponent.messageId;
        }
        if ((i & 2) != 0) {
            j = tapSelectActionComponent.messageFlags;
        }
        if ((i & 4) != 0) {
            selectComponent = tapSelectActionComponent.selectionActionComponent;
        }
        return tapSelectActionComponent.m41887copyu7_MRrM(str, j, selectComponent);
    }

    public static final void write$Self(TapSelectActionComponent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        output.mo12894i(serialDesc, 0, MessageId$$serializer.INSTANCE, MessageId.m42073boximpl(self.messageId));
        output.mo12905D(serialDesc, 1, self.messageFlags);
        output.mo12894i(serialDesc, 2, SelectComponent.Companion.serializer(), self.selectionActionComponent);
    }

    /* renamed from: component1-3Eiw7ao */
    public final String m41886component13Eiw7ao() {
        return this.messageId;
    }

    public final long component2() {
        return this.messageFlags;
    }

    public final SelectComponent component3() {
        return this.selectionActionComponent;
    }

    /* renamed from: copy-u7_MRrM */
    public final TapSelectActionComponent m41887copyu7_MRrM(String messageId, long j, SelectComponent selectionActionComponent) {
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(selectionActionComponent, "selectionActionComponent");
        return new TapSelectActionComponent(messageId, j, selectionActionComponent, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TapSelectActionComponent) {
            TapSelectActionComponent tapSelectActionComponent = (TapSelectActionComponent) obj;
            return MessageId.m42077equalsimpl0(this.messageId, tapSelectActionComponent.messageId) && this.messageFlags == tapSelectActionComponent.messageFlags && C9612q.m13922c(this.selectionActionComponent, tapSelectActionComponent.selectionActionComponent);
        }
        return false;
    }

    public final long getMessageFlags() {
        return this.messageFlags;
    }

    /* renamed from: getMessageId-3Eiw7ao */
    public final String m41888getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final SelectComponent getSelectionActionComponent() {
        return this.selectionActionComponent;
    }

    public int hashCode() {
        return (((MessageId.m42078hashCodeimpl(this.messageId) * 31) + C2689b.m32716a(this.messageFlags)) * 31) + this.selectionActionComponent.hashCode();
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        List<StringSelectItem> m14104i;
        List<SearchableSelectItem> selectedOptions;
        int m14093t;
        ReadableNativeArray nativeArray;
        ReadableNativeArray readableNativeArray;
        int m14093t2;
        char c;
        WritableNativeMap writableNativeMap;
        List<Integer> channelTypes;
        SelectComponent selectComponent = this.selectionActionComponent;
        if (selectComponent instanceof StringSelectComponent) {
            m14104i = ((StringSelectComponent) selectComponent).getOptions();
        } else {
            m14104i = C9545j.m14104i();
        }
        SelectComponent selectComponent2 = this.selectionActionComponent;
        char c2 = 2;
        if (selectComponent2 instanceof StringSelectComponent) {
            List<Integer> selectedOptions2 = ((StringSelectComponent) selectComponent2).getSelectedOptions();
            if (selectedOptions2 != null) {
                nativeArray = NativeArrayExtensionsKt.toNativeArray(selectedOptions2);
            }
            nativeArray = null;
        } else {
            if ((selectComponent2 instanceof SearchableSelectComponent) && (selectedOptions = ((SearchableSelectComponent) selectComponent2).getSelectedOptions()) != null) {
                m14093t = C9546k.m14093t(selectedOptions, 10);
                ArrayList arrayList = new ArrayList(m14093t);
                for (SearchableSelectItem searchableSelectItem : selectedOptions) {
                    arrayList.add(NativeMapExtensionsKt.nativeMapOf(C11591x.m7577a("value", searchableSelectItem.getValue()), C11591x.m7577a("label", searchableSelectItem.getLabel())));
                }
                nativeArray = NativeArrayExtensionsKt.toNativeArray(arrayList);
            }
            nativeArray = null;
        }
        SelectComponent selectComponent3 = this.selectionActionComponent;
        if ((selectComponent3 instanceof ChannelSelectComponent) && (channelTypes = ((ChannelSelectComponent) selectComponent3).getChannelTypes()) != null) {
            readableNativeArray = NativeArrayExtensionsKt.toNativeArray(channelTypes);
        } else {
            readableNativeArray = null;
        }
        int i = 3;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = C11591x.m7577a("messageId", MessageId.m42079toStringimpl(this.messageId));
        pairArr[1] = C11591x.m7577a("messageFlags", Double.valueOf(this.messageFlags));
        Pair[] pairArr2 = new Pair[13];
        pairArr2[0] = C11591x.m7577a("selectedOptions", nativeArray);
        pairArr2[1] = C11591x.m7577a("customId", this.selectionActionComponent.getCustomId());
        pairArr2[2] = C11591x.m7577a("minValues", Integer.valueOf(this.selectionActionComponent.getMinValues()));
        pairArr2[3] = C11591x.m7577a("maxValues", Integer.valueOf(this.selectionActionComponent.getMaxValues()));
        pairArr2[4] = C11591x.m7577a("disabled", Boolean.valueOf(this.selectionActionComponent.getDisabled()));
        int i2 = 5;
        pairArr2[5] = C11591x.m7577a(ViewProps.ACCESSIBILITY_LABEL, this.selectionActionComponent.getAccessibilityLabel());
        pairArr2[6] = C11591x.m7577a("state", Integer.valueOf(this.selectionActionComponent.getState().getSerialNumber()));
        pairArr2[7] = C11591x.m7577a(ReactTextInputShadowNode.PROP_PLACEHOLDER, this.selectionActionComponent.getPlaceholder());
        pairArr2[8] = C11591x.m7577a("applicationId", this.selectionActionComponent.getApplicationId());
        pairArr2[9] = C11591x.m7577a("type", Integer.valueOf(this.selectionActionComponent.getType()));
        pairArr2[10] = C11591x.m7577a("indices", NativeArrayExtensionsKt.toNativeArray(this.selectionActionComponent.getIndices()));
        m14093t2 = C9546k.m14093t(m14104i, 10);
        ArrayList arrayList2 = new ArrayList(m14093t2);
        for (StringSelectItem stringSelectItem : m14104i) {
            Pair[] pairArr3 = new Pair[i2];
            pairArr3[0] = C11591x.m7577a("label", stringSelectItem.getLabel());
            pairArr3[1] = C11591x.m7577a("value", stringSelectItem.getValue());
            ComponentEmoji emoji = stringSelectItem.getEmoji();
            if (emoji != null) {
                Pair[] pairArr4 = new Pair[i];
                pairArr4[0] = C11591x.m7577a("id", emoji.getId());
                pairArr4[1] = C11591x.m7577a(ZeroconfModule.KEY_SERVICE_NAME, emoji.getName());
                c = 2;
                pairArr4[2] = C11591x.m7577a("src", emoji.getSrc());
                writableNativeMap = NativeMapExtensionsKt.nativeMapOf(pairArr4);
            } else {
                c = c2;
                writableNativeMap = null;
            }
            pairArr3[c] = C11591x.m7577a("emoji", writableNativeMap);
            i = 3;
            pairArr3[3] = C11591x.m7577a("description", stringSelectItem.getDescription());
            pairArr3[4] = C11591x.m7577a("default", stringSelectItem.getDefault());
            arrayList2.add(NativeMapExtensionsKt.nativeMapOf(pairArr3));
            c2 = 2;
            i2 = 5;
        }
        pairArr2[11] = C11591x.m7577a("options", NativeArrayExtensionsKt.toNativeArray(arrayList2));
        pairArr2[12] = C11591x.m7577a("channelTypes", readableNativeArray);
        pairArr[2] = C11591x.m7577a("selectionActionComponent", NativeMapExtensionsKt.nativeMapOf(pairArr2));
        return NativeMapExtensionsKt.nativeMapOf(pairArr);
    }

    public String toString() {
        String m42079toStringimpl = MessageId.m42079toStringimpl(this.messageId);
        long j = this.messageFlags;
        SelectComponent selectComponent = this.selectionActionComponent;
        return "TapSelectActionComponent(messageId=" + m42079toStringimpl + ", messageFlags=" + j + ", selectionActionComponent=" + selectComponent + ")";
    }

    private TapSelectActionComponent(String str, long j, SelectComponent selectComponent) {
        this.messageId = str;
        this.messageFlags = j;
        this.selectionActionComponent = selectComponent;
    }
}