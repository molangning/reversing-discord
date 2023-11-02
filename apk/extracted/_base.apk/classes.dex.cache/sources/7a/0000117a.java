package com.discord.chat.input.events;

import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.TouchesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B1\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J!\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 HÇ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006#"}, m14357d2 = {"Lcom/discord/chat/input/events/OnFocusEvent;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", ViewProps.START, ViewProps.END, TouchesHelper.TARGET_KEY, "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(III)V", "getEnd", "()I", "getStart", "getTarget", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_input_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class OnFocusEvent implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final int end;
    private final int start;
    private final int target;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/input/events/OnFocusEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/input/events/OnFocusEvent;", "chat_input_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OnFocusEvent> serializer() {
            return OnFocusEvent$$serializer.INSTANCE;
        }
    }

    public OnFocusEvent(int i, int i2, int i3) {
        this.start = i;
        this.end = i2;
        this.target = i3;
    }

    public static /* synthetic */ OnFocusEvent copy$default(OnFocusEvent onFocusEvent, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = onFocusEvent.start;
        }
        if ((i4 & 2) != 0) {
            i2 = onFocusEvent.end;
        }
        if ((i4 & 4) != 0) {
            i3 = onFocusEvent.target;
        }
        return onFocusEvent.copy(i, i2, i3);
    }

    public static final void write$Self(OnFocusEvent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        boolean z = false;
        output.mo12882w(serialDesc, 0, self.start);
        output.mo12882w(serialDesc, 1, self.end);
        if (output.mo12879z(serialDesc, 2) || self.target != 0) {
            z = true;
        }
        if (z) {
            output.mo12882w(serialDesc, 2, self.target);
        }
    }

    public final int component1() {
        return this.start;
    }

    public final int component2() {
        return this.end;
    }

    public final int component3() {
        return this.target;
    }

    public final OnFocusEvent copy(int i, int i2, int i3) {
        return new OnFocusEvent(i, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnFocusEvent) {
            OnFocusEvent onFocusEvent = (OnFocusEvent) obj;
            return this.start == onFocusEvent.start && this.end == onFocusEvent.end && this.target == onFocusEvent.target;
        }
        return false;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getStart() {
        return this.start;
    }

    public final int getTarget() {
        return this.target;
    }

    public int hashCode() {
        return (((this.start * 31) + this.end) * 31) + this.target;
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        int i = this.start;
        int i2 = this.end;
        int i3 = this.target;
        return "OnFocusEvent(start=" + i + ", end=" + i2 + ", target=" + i3 + ")";
    }

    public /* synthetic */ OnFocusEvent(int i, int i2, int i3, int i4, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            C2620n1.m32836b(i, 3, OnFocusEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.start = i2;
        this.end = i3;
        if ((i & 4) == 0) {
            this.target = 0;
        } else {
            this.target = i4;
        }
    }

    public /* synthetic */ OnFocusEvent(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i4 & 4) != 0 ? 0 : i3);
    }
}