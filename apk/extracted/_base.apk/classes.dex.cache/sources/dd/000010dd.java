package com.discord.chat.bridge.row;

import com.discord.chat.bridge.ChangeType;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.Message$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002)*B?\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J1\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\nHÖ\u0001J!\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(HÇ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006+"}, m14357d2 = {"Lcom/discord/chat/bridge/row/UploadProgressRow;", "Lcom/discord/chat/bridge/row/Row;", "seen1", "", "index", "changeType", "Lcom/discord/chat/bridge/ChangeType;", "message", "Lcom/discord/chat/bridge/Message;", "fileId", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILcom/discord/chat/bridge/ChangeType;Lcom/discord/chat/bridge/Message;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILcom/discord/chat/bridge/ChangeType;Lcom/discord/chat/bridge/Message;Ljava/lang/String;)V", "getChangeType", "()Lcom/discord/chat/bridge/ChangeType;", "getFileId", "()Ljava/lang/String;", "getIndex", "()I", "getMessage", "()Lcom/discord/chat/bridge/Message;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class UploadProgressRow extends Row {
    public static final Companion Companion = new Companion(null);
    private final ChangeType changeType;
    private final String fileId;
    private final int index;
    private final Message message;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/row/UploadProgressRow$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/row/UploadProgressRow;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UploadProgressRow> serializer() {
            return UploadProgressRow$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UploadProgressRow(int i, int i2, ChangeType changeType, Message message, String str, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (15 != (i & 15)) {
            C2620n1.m32836b(i, 15, UploadProgressRow$$serializer.INSTANCE.getDescriptor());
        }
        this.index = i2;
        this.changeType = changeType;
        this.message = message;
        this.fileId = str;
    }

    public static /* synthetic */ UploadProgressRow copy$default(UploadProgressRow uploadProgressRow, int i, ChangeType changeType, Message message, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = uploadProgressRow.getIndex();
        }
        if ((i2 & 2) != 0) {
            changeType = uploadProgressRow.getChangeType();
        }
        if ((i2 & 4) != 0) {
            message = uploadProgressRow.message;
        }
        if ((i2 & 8) != 0) {
            str = uploadProgressRow.fileId;
        }
        return uploadProgressRow.copy(i, changeType, message, str);
    }

    public static final void write$Self(UploadProgressRow self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        output.mo12882w(serialDesc, 0, self.getIndex());
        output.mo12894i(serialDesc, 1, ChangeType.Serializer.INSTANCE, self.getChangeType());
        output.mo12894i(serialDesc, 2, Message$$serializer.INSTANCE, self.message);
        output.mo12880y(serialDesc, 3, self.fileId);
    }

    public final int component1() {
        return getIndex();
    }

    public final ChangeType component2() {
        return getChangeType();
    }

    public final Message component3() {
        return this.message;
    }

    public final String component4() {
        return this.fileId;
    }

    public final UploadProgressRow copy(int i, ChangeType changeType, Message message, String fileId) {
        C9612q.m13917h(changeType, "changeType");
        C9612q.m13917h(message, "message");
        C9612q.m13917h(fileId, "fileId");
        return new UploadProgressRow(i, changeType, message, fileId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UploadProgressRow) {
            UploadProgressRow uploadProgressRow = (UploadProgressRow) obj;
            return getIndex() == uploadProgressRow.getIndex() && getChangeType() == uploadProgressRow.getChangeType() && C9612q.m13922c(this.message, uploadProgressRow.message) && C9612q.m13922c(this.fileId, uploadProgressRow.fileId);
        }
        return false;
    }

    @Override // com.discord.chat.bridge.row.Row
    public ChangeType getChangeType() {
        return this.changeType;
    }

    public final String getFileId() {
        return this.fileId;
    }

    @Override // com.discord.chat.bridge.row.Row
    public int getIndex() {
        return this.index;
    }

    public final Message getMessage() {
        return this.message;
    }

    public int hashCode() {
        return (((((getIndex() * 31) + getChangeType().hashCode()) * 31) + this.message.hashCode()) * 31) + this.fileId.hashCode();
    }

    public String toString() {
        int index = getIndex();
        ChangeType changeType = getChangeType();
        Message message = this.message;
        String str = this.fileId;
        return "UploadProgressRow(index=" + index + ", changeType=" + changeType + ", message=" + message + ", fileId=" + str + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadProgressRow(int i, ChangeType changeType, Message message, String fileId) {
        super(null);
        C9612q.m13917h(changeType, "changeType");
        C9612q.m13917h(message, "message");
        C9612q.m13917h(fileId, "fileId");
        this.index = i;
        this.changeType = changeType;
        this.message = message;
        this.fileId = fileId;
    }
}