package com.discord.chat.reactevents;

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

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 12\u00020\u0001:\u000201Ba\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010BM\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003Jc\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001J!\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/HÇ\u0001R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013¨\u00062"}, m14357d2 = {"Lcom/discord/chat/reactevents/ChatScrollPositionEvent;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "isAtBottom", "", "isNearBottom", "isNearTop", "dragging", "decelerating", "shouldShowJumpToPresent", "isFirstMessageVisible", "firstVisibleMessageIndex", "lastVisibleMessageIndex", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZZZZZZZIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZZZZZZZII)V", "getDecelerating", "()Z", "getDragging", "getFirstVisibleMessageIndex", "()I", "getLastVisibleMessageIndex", "getShouldShowJumpToPresent", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChatScrollPositionEvent implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final boolean decelerating;
    private final boolean dragging;
    private final int firstVisibleMessageIndex;
    private final boolean isAtBottom;
    private final boolean isFirstMessageVisible;
    private final boolean isNearBottom;
    private final boolean isNearTop;
    private final int lastVisibleMessageIndex;
    private final boolean shouldShowJumpToPresent;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/reactevents/ChatScrollPositionEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/ChatScrollPositionEvent;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChatScrollPositionEvent> serializer() {
            return ChatScrollPositionEvent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChatScrollPositionEvent(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i & 511)) {
            C2620n1.m32836b(i, 511, ChatScrollPositionEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.isAtBottom = z;
        this.isNearBottom = z2;
        this.isNearTop = z3;
        this.dragging = z4;
        this.decelerating = z5;
        this.shouldShowJumpToPresent = z6;
        this.isFirstMessageVisible = z7;
        this.firstVisibleMessageIndex = i2;
        this.lastVisibleMessageIndex = i3;
    }

    public static final void write$Self(ChatScrollPositionEvent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        output.mo12881x(serialDesc, 0, self.isAtBottom);
        output.mo12881x(serialDesc, 1, self.isNearBottom);
        output.mo12881x(serialDesc, 2, self.isNearTop);
        output.mo12881x(serialDesc, 3, self.dragging);
        output.mo12881x(serialDesc, 4, self.decelerating);
        output.mo12881x(serialDesc, 5, self.shouldShowJumpToPresent);
        output.mo12881x(serialDesc, 6, self.isFirstMessageVisible);
        output.mo12882w(serialDesc, 7, self.firstVisibleMessageIndex);
        output.mo12882w(serialDesc, 8, self.lastVisibleMessageIndex);
    }

    public final boolean component1() {
        return this.isAtBottom;
    }

    public final boolean component2() {
        return this.isNearBottom;
    }

    public final boolean component3() {
        return this.isNearTop;
    }

    public final boolean component4() {
        return this.dragging;
    }

    public final boolean component5() {
        return this.decelerating;
    }

    public final boolean component6() {
        return this.shouldShowJumpToPresent;
    }

    public final boolean component7() {
        return this.isFirstMessageVisible;
    }

    public final int component8() {
        return this.firstVisibleMessageIndex;
    }

    public final int component9() {
        return this.lastVisibleMessageIndex;
    }

    public final ChatScrollPositionEvent copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, int i2) {
        return new ChatScrollPositionEvent(z, z2, z3, z4, z5, z6, z7, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatScrollPositionEvent) {
            ChatScrollPositionEvent chatScrollPositionEvent = (ChatScrollPositionEvent) obj;
            return this.isAtBottom == chatScrollPositionEvent.isAtBottom && this.isNearBottom == chatScrollPositionEvent.isNearBottom && this.isNearTop == chatScrollPositionEvent.isNearTop && this.dragging == chatScrollPositionEvent.dragging && this.decelerating == chatScrollPositionEvent.decelerating && this.shouldShowJumpToPresent == chatScrollPositionEvent.shouldShowJumpToPresent && this.isFirstMessageVisible == chatScrollPositionEvent.isFirstMessageVisible && this.firstVisibleMessageIndex == chatScrollPositionEvent.firstVisibleMessageIndex && this.lastVisibleMessageIndex == chatScrollPositionEvent.lastVisibleMessageIndex;
        }
        return false;
    }

    public final boolean getDecelerating() {
        return this.decelerating;
    }

    public final boolean getDragging() {
        return this.dragging;
    }

    public final int getFirstVisibleMessageIndex() {
        return this.firstVisibleMessageIndex;
    }

    public final int getLastVisibleMessageIndex() {
        return this.lastVisibleMessageIndex;
    }

    public final boolean getShouldShowJumpToPresent() {
        return this.shouldShowJumpToPresent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    public int hashCode() {
        boolean z = this.isAtBottom;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.isNearBottom;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r22 = this.isNearTop;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        ?? r23 = this.dragging;
        int i6 = r23;
        if (r23 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        ?? r24 = this.decelerating;
        int i8 = r24;
        if (r24 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        ?? r25 = this.shouldShowJumpToPresent;
        int i10 = r25;
        if (r25 != 0) {
            i10 = 1;
        }
        int i11 = (i9 + i10) * 31;
        boolean z2 = this.isFirstMessageVisible;
        return ((((i11 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.firstVisibleMessageIndex) * 31) + this.lastVisibleMessageIndex;
    }

    public final boolean isAtBottom() {
        return this.isAtBottom;
    }

    public final boolean isFirstMessageVisible() {
        return this.isFirstMessageVisible;
    }

    public final boolean isNearBottom() {
        return this.isNearBottom;
    }

    public final boolean isNearTop() {
        return this.isNearTop;
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        boolean z = this.isAtBottom;
        boolean z2 = this.isNearBottom;
        boolean z3 = this.isNearTop;
        boolean z4 = this.dragging;
        boolean z5 = this.decelerating;
        boolean z6 = this.shouldShowJumpToPresent;
        boolean z7 = this.isFirstMessageVisible;
        int i = this.firstVisibleMessageIndex;
        int i2 = this.lastVisibleMessageIndex;
        return "ChatScrollPositionEvent(isAtBottom=" + z + ", isNearBottom=" + z2 + ", isNearTop=" + z3 + ", dragging=" + z4 + ", decelerating=" + z5 + ", shouldShowJumpToPresent=" + z6 + ", isFirstMessageVisible=" + z7 + ", firstVisibleMessageIndex=" + i + ", lastVisibleMessageIndex=" + i2 + ")";
    }

    public ChatScrollPositionEvent(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, int i2) {
        this.isAtBottom = z;
        this.isNearBottom = z2;
        this.isNearTop = z3;
        this.dragging = z4;
        this.decelerating = z5;
        this.shouldShowJumpToPresent = z6;
        this.isFirstMessageVisible = z7;
        this.firstVisibleMessageIndex = i;
        this.lastVisibleMessageIndex = i2;
    }
}
