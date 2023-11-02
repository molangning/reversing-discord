package com.discord.chat.bridge.row;

import com.discord.chat.bridge.ChangeType;
import com.discord.chat.bridge.summaries.Summary;
import com.discord.chat.bridge.summaries.Summary$$serializer;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2590h;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000278Be\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0013J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jd\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\t\u0010/\u001a\u00020\bHÖ\u0001J!\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206HÇ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0015\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\r\u0010\u001bR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019¨\u00069"}, m14357d2 = {"Lcom/discord/chat/bridge/row/SeparatorRow;", "Lcom/discord/chat/bridge/row/Row;", "seen1", "", "changeType", "Lcom/discord/chat/bridge/ChangeType;", "index", "text", "", "id", ViewProps.COLOR, "scrollTo", "", "isBeforeContent", "summary", "Lcom/discord/chat/bridge/summaries/Summary;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/chat/bridge/ChangeType;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/summaries/Summary;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/discord/chat/bridge/ChangeType;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/summaries/Summary;)V", "getChangeType", "()Lcom/discord/chat/bridge/ChangeType;", "getColor", "()I", "getId", "()Ljava/lang/String;", "getIndex", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getScrollTo", "getSummary", "()Lcom/discord/chat/bridge/summaries/Summary;", "getText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lcom/discord/chat/bridge/ChangeType;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/summaries/Summary;)Lcom/discord/chat/bridge/row/SeparatorRow;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SeparatorRow extends Row {
    public static final Companion Companion = new Companion(null);
    private final ChangeType changeType;
    private final int color;

    /* renamed from: id */
    private final String f8311id;
    private final int index;
    private final Boolean isBeforeContent;
    private final Boolean scrollTo;
    private final Summary summary;
    private final String text;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/row/SeparatorRow$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/row/SeparatorRow;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SeparatorRow> serializer() {
            return SeparatorRow$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SeparatorRow(int i, ChangeType changeType, int i2, String str, String str2, int i3, Boolean bool, Boolean bool2, Summary summary, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (31 != (i & 31)) {
            C2620n1.m32836b(i, 31, SeparatorRow$$serializer.INSTANCE.getDescriptor());
        }
        this.changeType = changeType;
        this.index = i2;
        this.text = str;
        this.f8311id = str2;
        this.color = i3;
        if ((i & 32) == 0) {
            this.scrollTo = null;
        } else {
            this.scrollTo = bool;
        }
        if ((i & 64) == 0) {
            this.isBeforeContent = null;
        } else {
            this.isBeforeContent = bool2;
        }
        if ((i & 128) == 0) {
            this.summary = null;
        } else {
            this.summary = summary;
        }
    }

    public static final void write$Self(SeparatorRow self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        boolean z2;
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        boolean z3 = false;
        output.mo12894i(serialDesc, 0, ChangeType.Serializer.INSTANCE, self.getChangeType());
        output.mo12882w(serialDesc, 1, self.getIndex());
        output.mo12880y(serialDesc, 2, self.text);
        output.mo12880y(serialDesc, 3, self.f8311id);
        output.mo12882w(serialDesc, 4, self.color);
        if (output.mo12879z(serialDesc, 5) || self.scrollTo != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo12904E(serialDesc, 5, C2590h.f7055a, self.scrollTo);
        }
        if (output.mo12879z(serialDesc, 6) || self.isBeforeContent != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            output.mo12904E(serialDesc, 6, C2590h.f7055a, self.isBeforeContent);
        }
        if (output.mo12879z(serialDesc, 7) || self.summary != null) {
            z3 = true;
        }
        if (z3) {
            output.mo12904E(serialDesc, 7, Summary$$serializer.INSTANCE, self.summary);
        }
    }

    public final ChangeType component1() {
        return getChangeType();
    }

    public final int component2() {
        return getIndex();
    }

    public final String component3() {
        return this.text;
    }

    public final String component4() {
        return this.f8311id;
    }

    public final int component5() {
        return this.color;
    }

    public final Boolean component6() {
        return this.scrollTo;
    }

    public final Boolean component7() {
        return this.isBeforeContent;
    }

    public final Summary component8() {
        return this.summary;
    }

    public final SeparatorRow copy(ChangeType changeType, int i, String text, String id2, int i2, Boolean bool, Boolean bool2, Summary summary) {
        C9612q.m13917h(changeType, "changeType");
        C9612q.m13917h(text, "text");
        C9612q.m13917h(id2, "id");
        return new SeparatorRow(changeType, i, text, id2, i2, bool, bool2, summary);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SeparatorRow) {
            SeparatorRow separatorRow = (SeparatorRow) obj;
            return getChangeType() == separatorRow.getChangeType() && getIndex() == separatorRow.getIndex() && C9612q.m13922c(this.text, separatorRow.text) && C9612q.m13922c(this.f8311id, separatorRow.f8311id) && this.color == separatorRow.color && C9612q.m13922c(this.scrollTo, separatorRow.scrollTo) && C9612q.m13922c(this.isBeforeContent, separatorRow.isBeforeContent) && C9612q.m13922c(this.summary, separatorRow.summary);
        }
        return false;
    }

    @Override // com.discord.chat.bridge.row.Row
    public ChangeType getChangeType() {
        return this.changeType;
    }

    public final int getColor() {
        return this.color;
    }

    public final String getId() {
        return this.f8311id;
    }

    @Override // com.discord.chat.bridge.row.Row
    public int getIndex() {
        return this.index;
    }

    public final Boolean getScrollTo() {
        return this.scrollTo;
    }

    public final Summary getSummary() {
        return this.summary;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = ((((((((getChangeType().hashCode() * 31) + getIndex()) * 31) + this.text.hashCode()) * 31) + this.f8311id.hashCode()) * 31) + this.color) * 31;
        Boolean bool = this.scrollTo;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isBeforeContent;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Summary summary = this.summary;
        return hashCode3 + (summary != null ? summary.hashCode() : 0);
    }

    public final Boolean isBeforeContent() {
        return this.isBeforeContent;
    }

    public String toString() {
        ChangeType changeType = getChangeType();
        int index = getIndex();
        String str = this.text;
        String str2 = this.f8311id;
        int i = this.color;
        Boolean bool = this.scrollTo;
        Boolean bool2 = this.isBeforeContent;
        Summary summary = this.summary;
        return "SeparatorRow(changeType=" + changeType + ", index=" + index + ", text=" + str + ", id=" + str2 + ", color=" + i + ", scrollTo=" + bool + ", isBeforeContent=" + bool2 + ", summary=" + summary + ")";
    }

    public /* synthetic */ SeparatorRow(ChangeType changeType, int i, String str, String str2, int i2, Boolean bool, Boolean bool2, Summary summary, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(changeType, i, str, str2, i2, (i3 & 32) != 0 ? null : bool, (i3 & 64) != 0 ? null : bool2, (i3 & 128) != 0 ? null : summary);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeparatorRow(ChangeType changeType, int i, String text, String id2, int i2, Boolean bool, Boolean bool2, Summary summary) {
        super(null);
        C9612q.m13917h(changeType, "changeType");
        C9612q.m13917h(text, "text");
        C9612q.m13917h(id2, "id");
        this.changeType = changeType;
        this.index = i;
        this.text = text;
        this.f8311id = id2;
        this.color = i2;
        this.scrollTo = bool;
        this.isBeforeContent = bool2;
        this.summary = summary;
    }
}