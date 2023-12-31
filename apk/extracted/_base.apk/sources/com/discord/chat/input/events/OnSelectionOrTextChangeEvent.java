package com.discord.chat.input.events;

import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002%&B=\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\fJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J!\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$HÇ\u0001R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006'"}, m14357d2 = {"Lcom/discord/chat/input/events/OnSelectionOrTextChangeEvent;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", ViewProps.START, ViewProps.END, "text", "", "editId", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(IILjava/lang/String;Ljava/lang/String;)V", "getEditId", "()Ljava/lang/String;", "getEnd", "()I", "getStart", "getText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_input_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class OnSelectionOrTextChangeEvent implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final String editId;
    private final int end;
    private final int start;
    private final String text;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/input/events/OnSelectionOrTextChangeEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/input/events/OnSelectionOrTextChangeEvent;", "chat_input_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OnSelectionOrTextChangeEvent> serializer() {
            return OnSelectionOrTextChangeEvent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OnSelectionOrTextChangeEvent(int i, int i2, int i3, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            C2620n1.m32836b(i, 15, OnSelectionOrTextChangeEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.start = i2;
        this.end = i3;
        this.text = str;
        this.editId = str2;
    }

    public static /* synthetic */ OnSelectionOrTextChangeEvent copy$default(OnSelectionOrTextChangeEvent onSelectionOrTextChangeEvent, int i, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = onSelectionOrTextChangeEvent.start;
        }
        if ((i3 & 2) != 0) {
            i2 = onSelectionOrTextChangeEvent.end;
        }
        if ((i3 & 4) != 0) {
            str = onSelectionOrTextChangeEvent.text;
        }
        if ((i3 & 8) != 0) {
            str2 = onSelectionOrTextChangeEvent.editId;
        }
        return onSelectionOrTextChangeEvent.copy(i, i2, str, str2);
    }

    public static final void write$Self(OnSelectionOrTextChangeEvent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        output.mo12882w(serialDesc, 0, self.start);
        output.mo12882w(serialDesc, 1, self.end);
        output.mo12880y(serialDesc, 2, self.text);
        output.mo12880y(serialDesc, 3, self.editId);
    }

    public final int component1() {
        return this.start;
    }

    public final int component2() {
        return this.end;
    }

    public final String component3() {
        return this.text;
    }

    public final String component4() {
        return this.editId;
    }

    public final OnSelectionOrTextChangeEvent copy(int i, int i2, String text, String editId) {
        C9612q.m13917h(text, "text");
        C9612q.m13917h(editId, "editId");
        return new OnSelectionOrTextChangeEvent(i, i2, text, editId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnSelectionOrTextChangeEvent) {
            OnSelectionOrTextChangeEvent onSelectionOrTextChangeEvent = (OnSelectionOrTextChangeEvent) obj;
            return this.start == onSelectionOrTextChangeEvent.start && this.end == onSelectionOrTextChangeEvent.end && C9612q.m13922c(this.text, onSelectionOrTextChangeEvent.text) && C9612q.m13922c(this.editId, onSelectionOrTextChangeEvent.editId);
        }
        return false;
    }

    public final String getEditId() {
        return this.editId;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getStart() {
        return this.start;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (((((this.start * 31) + this.end) * 31) + this.text.hashCode()) * 31) + this.editId.hashCode();
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        int i = this.start;
        int i2 = this.end;
        String str = this.text;
        String str2 = this.editId;
        return "OnSelectionOrTextChangeEvent(start=" + i + ", end=" + i2 + ", text=" + str + ", editId=" + str2 + ")";
    }

    public OnSelectionOrTextChangeEvent(int i, int i2, String text, String editId) {
        C9612q.m13917h(text, "text");
        C9612q.m13917h(editId, "editId");
        this.start = i;
        this.end = i2;
        this.text = text;
        this.editId = editId;
    }
}
