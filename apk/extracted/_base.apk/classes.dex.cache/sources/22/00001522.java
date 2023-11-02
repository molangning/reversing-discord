package com.discord.chat.reactevents;

import co.discord.media_engine.C2690c;
import com.discord.primitives.ApplicationId;
import com.discord.primitives.ApplicationId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.C9947f;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2560a2;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 92\u00020\u0001:\u000289B4\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0002\u0010\fBL\b\u0017\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u000f\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011ø\u0001\u0000¢\u0006\u0002\u0010\u0012B2\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u000f\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u0019\u0010\u001f\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u0018J\t\u0010!\u001a\u00020\u000fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0019\u0010#\u001a\u00020\tHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010\u0015J\t\u0010%\u001a\u00020\u000bHÆ\u0003JJ\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\u000eHÖ\u0001J\b\u0010.\u001a\u00020/H\u0016J\t\u00100\u001a\u00020\u0007HÖ\u0001J!\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207HÇ\u0001R\u001c\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001d\u0010\u0018\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006:"}, m14357d2 = {"Lcom/discord/chat/reactevents/TapButtonActionComponent;", "Lcom/discord/reactevents/ReactEvent;", "messageId", "Lcom/discord/primitives/MessageId;", "messageFlags", "", "customId", "", "applicationId", "Lcom/discord/primitives/ApplicationId;", "indices", "", "(Ljava/lang/String;JLjava/lang/String;J[ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen1", "", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;DLjava/lang/String;Lcom/discord/primitives/ApplicationId;[ILkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;DLjava/lang/String;J[ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getApplicationId-VavddsQ", "()J", "J", "getCustomId", "()Ljava/lang/String;", "getIndices", "()[I", "getMessageFlags", "()D", "getMessageId-3Eiw7ao", "Ljava/lang/String;", "component1", "component1-3Eiw7ao", "component2", "component3", "component4", "component4-VavddsQ", "component5", "copy", "copy-NkFJqEg", "(Ljava/lang/String;DLjava/lang/String;J[I)Lcom/discord/chat/reactevents/TapButtonActionComponent;", "equals", "", "other", "", "hashCode", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class TapButtonActionComponent implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final long applicationId;
    private final String customId;
    private final int[] indices;
    private final double messageFlags;
    private final String messageId;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/reactevents/TapButtonActionComponent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/TapButtonActionComponent;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TapButtonActionComponent> serializer() {
            return TapButtonActionComponent$$serializer.INSTANCE;
        }
    }

    private TapButtonActionComponent(int i, String str, double d, String str2, ApplicationId applicationId, int[] iArr, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            C2620n1.m32836b(i, 31, TapButtonActionComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.messageId = str;
        this.messageFlags = d;
        this.customId = str2;
        this.applicationId = applicationId.m42043unboximpl();
        this.indices = iArr;
    }

    public /* synthetic */ TapButtonActionComponent(int i, String str, double d, String str2, ApplicationId applicationId, int[] iArr, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, d, str2, applicationId, iArr, serializationConstructorMarker);
    }

    public /* synthetic */ TapButtonActionComponent(String str, double d, String str2, long j, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, d, str2, j, iArr);
    }

    public /* synthetic */ TapButtonActionComponent(String str, long j, String str2, long j2, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, str2, j2, iArr);
    }

    /* renamed from: copy-NkFJqEg$default */
    public static /* synthetic */ TapButtonActionComponent m41837copyNkFJqEg$default(TapButtonActionComponent tapButtonActionComponent, String str, double d, String str2, long j, int[] iArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tapButtonActionComponent.messageId;
        }
        if ((i & 2) != 0) {
            d = tapButtonActionComponent.messageFlags;
        }
        double d2 = d;
        if ((i & 4) != 0) {
            str2 = tapButtonActionComponent.customId;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            j = tapButtonActionComponent.applicationId;
        }
        long j2 = j;
        if ((i & 16) != 0) {
            iArr = tapButtonActionComponent.indices;
        }
        return tapButtonActionComponent.m41840copyNkFJqEg(str, d2, str3, j2, iArr);
    }

    public static final void write$Self(TapButtonActionComponent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        output.mo12894i(serialDesc, 0, MessageId$$serializer.INSTANCE, MessageId.m42073boximpl(self.messageId));
        output.mo12906C(serialDesc, 1, self.messageFlags);
        output.mo12904E(serialDesc, 2, C2560a2.f7013a, self.customId);
        output.mo12894i(serialDesc, 3, ApplicationId$$serializer.INSTANCE, ApplicationId.m42034boximpl(self.applicationId));
        output.mo12894i(serialDesc, 4, C9947f.f25823c, self.indices);
    }

    /* renamed from: component1-3Eiw7ao */
    public final String m41838component13Eiw7ao() {
        return this.messageId;
    }

    public final double component2() {
        return this.messageFlags;
    }

    public final String component3() {
        return this.customId;
    }

    /* renamed from: component4-VavddsQ */
    public final long m41839component4VavddsQ() {
        return this.applicationId;
    }

    public final int[] component5() {
        return this.indices;
    }

    /* renamed from: copy-NkFJqEg */
    public final TapButtonActionComponent m41840copyNkFJqEg(String messageId, double d, String str, long j, int[] indices) {
        C9612q.m13917h(messageId, "messageId");
        C9612q.m13917h(indices, "indices");
        return new TapButtonActionComponent(messageId, d, str, j, indices, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TapButtonActionComponent) {
            TapButtonActionComponent tapButtonActionComponent = (TapButtonActionComponent) obj;
            return MessageId.m42077equalsimpl0(this.messageId, tapButtonActionComponent.messageId) && Double.compare(this.messageFlags, tapButtonActionComponent.messageFlags) == 0 && C9612q.m13922c(this.customId, tapButtonActionComponent.customId) && ApplicationId.m42038equalsimpl0(this.applicationId, tapButtonActionComponent.applicationId) && C9612q.m13922c(this.indices, tapButtonActionComponent.indices);
        }
        return false;
    }

    /* renamed from: getApplicationId-VavddsQ */
    public final long m41841getApplicationIdVavddsQ() {
        return this.applicationId;
    }

    public final String getCustomId() {
        return this.customId;
    }

    public final int[] getIndices() {
        return this.indices;
    }

    public final double getMessageFlags() {
        return this.messageFlags;
    }

    /* renamed from: getMessageId-3Eiw7ao */
    public final String m41842getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public int hashCode() {
        int m42078hashCodeimpl = ((MessageId.m42078hashCodeimpl(this.messageId) * 31) + C2690c.m32715a(this.messageFlags)) * 31;
        String str = this.customId;
        return ((((m42078hashCodeimpl + (str == null ? 0 : str.hashCode())) * 31) + ApplicationId.m42039hashCodeimpl(this.applicationId)) * 31) + Arrays.hashCode(this.indices);
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return NativeMapExtensionsKt.nativeMapOf(C11591x.m7577a("messageId", MessageId.m42079toStringimpl(this.messageId)), C11591x.m7577a("messageFlags", Double.valueOf(this.messageFlags)), C11591x.m7577a("customId", this.customId), C11591x.m7577a("applicationId", ApplicationId.m42041toStringimpl(this.applicationId)), C11591x.m7577a("indices", NativeArrayExtensionsKt.toNativeArray(this.indices)));
    }

    public String toString() {
        String m42079toStringimpl = MessageId.m42079toStringimpl(this.messageId);
        double d = this.messageFlags;
        String str = this.customId;
        String m42041toStringimpl = ApplicationId.m42041toStringimpl(this.applicationId);
        String arrays = Arrays.toString(this.indices);
        return "TapButtonActionComponent(messageId=" + m42079toStringimpl + ", messageFlags=" + d + ", customId=" + str + ", applicationId=" + m42041toStringimpl + ", indices=" + arrays + ")";
    }

    private TapButtonActionComponent(String str, double d, String str2, long j, int[] iArr) {
        this.messageId = str;
        this.messageFlags = d;
        this.customId = str2;
        this.applicationId = j;
        this.indices = iArr;
    }

    private TapButtonActionComponent(String str, long j, String str2, long j2, int[] iArr) {
        this(str, j, str2, j2, iArr, (DefaultConstructorMarker) null);
    }
}