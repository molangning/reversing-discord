package com.discord.chat.reactevents;

import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 !2\u00020\u0001:\u0002 !B&\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bB\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0019\u0010\r\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000bJ \u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J!\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÇ\u0001R\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, m14357d2 = {"Lcom/discord/chat/reactevents/TapSeeMoreData;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "messageId", "Lcom/discord/primitives/MessageId;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "component1", "component1-3Eiw7ao", "copy", "copy-1xi1bu0", "(Ljava/lang/String;)Lcom/discord/chat/reactevents/TapSeeMoreData;", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class TapSeeMoreData implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final String messageId;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/reactevents/TapSeeMoreData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/TapSeeMoreData;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TapSeeMoreData> serializer() {
            return TapSeeMoreData$$serializer.INSTANCE;
        }
    }

    private TapSeeMoreData(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            C2620n1.m32836b(i, 1, TapSeeMoreData$$serializer.INSTANCE.getDescriptor());
        }
        this.messageId = str;
    }

    public /* synthetic */ TapSeeMoreData(int i, String str, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, serializationConstructorMarker);
    }

    public /* synthetic */ TapSeeMoreData(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* renamed from: copy-1xi1bu0$default */
    public static /* synthetic */ TapSeeMoreData m41881copy1xi1bu0$default(TapSeeMoreData tapSeeMoreData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tapSeeMoreData.messageId;
        }
        return tapSeeMoreData.m41883copy1xi1bu0(str);
    }

    public static final void write$Self(TapSeeMoreData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        output.mo12894i(serialDesc, 0, MessageId$$serializer.INSTANCE, MessageId.m42073boximpl(self.messageId));
    }

    /* renamed from: component1-3Eiw7ao */
    public final String m41882component13Eiw7ao() {
        return this.messageId;
    }

    /* renamed from: copy-1xi1bu0 */
    public final TapSeeMoreData m41883copy1xi1bu0(String messageId) {
        C9612q.m13917h(messageId, "messageId");
        return new TapSeeMoreData(messageId, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TapSeeMoreData) && MessageId.m42077equalsimpl0(this.messageId, ((TapSeeMoreData) obj).messageId);
    }

    /* renamed from: getMessageId-3Eiw7ao */
    public final String m41884getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public int hashCode() {
        return MessageId.m42078hashCodeimpl(this.messageId);
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        String m42079toStringimpl = MessageId.m42079toStringimpl(this.messageId);
        return "TapSeeMoreData(messageId=" + m42079toStringimpl + ")";
    }

    private TapSeeMoreData(String str) {
        this.messageId = str;
    }
}