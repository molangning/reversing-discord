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

@Metadata(m14358d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002#$B0\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000¢\u0006\u0002\u0010\nB\u001a\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\rJ,\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J!\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u000e\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, m14357d2 = {"Lcom/discord/chat/reactevents/TapGiftCodeAcceptData;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "giftCode", "", "messageId", "Lcom/discord/primitives/MessageId;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getGiftCode", "()Ljava/lang/String;", "getMessageId-N_6c4I0", "Ljava/lang/String;", "component1", "component2", "component2-N_6c4I0", "copy", "copy-NU4t8f8", "(Ljava/lang/String;Ljava/lang/String;)Lcom/discord/chat/reactevents/TapGiftCodeAcceptData;", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class TapGiftCodeAcceptData implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final String giftCode;
    private final String messageId;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/reactevents/TapGiftCodeAcceptData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/TapGiftCodeAcceptData;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TapGiftCodeAcceptData> serializer() {
            return TapGiftCodeAcceptData$$serializer.INSTANCE;
        }
    }

    private TapGiftCodeAcceptData(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            C2620n1.m32836b(i, 3, TapGiftCodeAcceptData$$serializer.INSTANCE.getDescriptor());
        }
        this.giftCode = str;
        this.messageId = str2;
    }

    public /* synthetic */ TapGiftCodeAcceptData(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, serializationConstructorMarker);
    }

    public /* synthetic */ TapGiftCodeAcceptData(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    /* renamed from: copy-NU4t8f8$default  reason: not valid java name */
    public static /* synthetic */ TapGiftCodeAcceptData m41853copyNU4t8f8$default(TapGiftCodeAcceptData tapGiftCodeAcceptData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tapGiftCodeAcceptData.giftCode;
        }
        if ((i & 2) != 0) {
            str2 = tapGiftCodeAcceptData.messageId;
        }
        return tapGiftCodeAcceptData.m41855copyNU4t8f8(str, str2);
    }

    public static final void write$Self(TapGiftCodeAcceptData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        MessageId messageId;
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        output.mo12880y(serialDesc, 0, self.giftCode);
        MessageId$$serializer messageId$$serializer = MessageId$$serializer.INSTANCE;
        String str = self.messageId;
        if (str != null) {
            messageId = MessageId.m42073boximpl(str);
        } else {
            messageId = null;
        }
        output.mo12904E(serialDesc, 1, messageId$$serializer, messageId);
    }

    public final String component1() {
        return this.giftCode;
    }

    /* renamed from: component2-N_6c4I0  reason: not valid java name */
    public final String m41854component2N_6c4I0() {
        return this.messageId;
    }

    /* renamed from: copy-NU4t8f8  reason: not valid java name */
    public final TapGiftCodeAcceptData m41855copyNU4t8f8(String giftCode, String str) {
        C9612q.m13917h(giftCode, "giftCode");
        return new TapGiftCodeAcceptData(giftCode, str, null);
    }

    public boolean equals(Object obj) {
        boolean m42077equalsimpl0;
        if (this == obj) {
            return true;
        }
        if (obj instanceof TapGiftCodeAcceptData) {
            TapGiftCodeAcceptData tapGiftCodeAcceptData = (TapGiftCodeAcceptData) obj;
            if (C9612q.m13922c(this.giftCode, tapGiftCodeAcceptData.giftCode)) {
                String str = this.messageId;
                String str2 = tapGiftCodeAcceptData.messageId;
                if (str == null) {
                    if (str2 == null) {
                        m42077equalsimpl0 = true;
                    }
                    m42077equalsimpl0 = false;
                } else {
                    if (str2 != null) {
                        m42077equalsimpl0 = MessageId.m42077equalsimpl0(str, str2);
                    }
                    m42077equalsimpl0 = false;
                }
                return m42077equalsimpl0;
            }
            return false;
        }
        return false;
    }

    public final String getGiftCode() {
        return this.giftCode;
    }

    /* renamed from: getMessageId-N_6c4I0  reason: not valid java name */
    public final String m41856getMessageIdN_6c4I0() {
        return this.messageId;
    }

    public int hashCode() {
        int hashCode = this.giftCode.hashCode() * 31;
        String str = this.messageId;
        return hashCode + (str == null ? 0 : MessageId.m42078hashCodeimpl(str));
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        String str = this.giftCode;
        String str2 = this.messageId;
        String m42079toStringimpl = str2 == null ? "null" : MessageId.m42079toStringimpl(str2);
        return "TapGiftCodeAcceptData(giftCode=" + str + ", messageId=" + m42079toStringimpl + ")";
    }

    private TapGiftCodeAcceptData(String str, String str2) {
        this.giftCode = str;
        this.messageId = str2;
    }
}
