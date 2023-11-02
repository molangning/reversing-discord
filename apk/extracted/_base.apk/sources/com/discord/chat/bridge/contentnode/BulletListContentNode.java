package com.discord.chat.bridge.contentnode;

import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2581f;
import p045cj.C2620n1;
import p045cj.C2649w0;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002'(BA\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB/\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t0\t¢\u0006\u0002\u0010\rJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t0\tHÆ\u0003J:\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t0\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J!\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&HÇ\u0001R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006)"}, m14357d2 = {"Lcom/discord/chat/bridge/contentnode/BulletListContentNode;", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "seen1", "", ViewProps.START, "", "ordered", "", "items", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Long;ZLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Long;ZLjava/util/List;)V", "getItems", "()Ljava/util/List;", "getOrdered", "()Z", "getStart", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;ZLjava/util/List;)Lcom/discord/chat/bridge/contentnode/BulletListContentNode;", "equals", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class BulletListContentNode extends ContentNode {
    public static final Companion Companion = new Companion(null);
    private final List<List<ContentNode>> items;
    private final boolean ordered;
    private final Long start;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/contentnode/BulletListContentNode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/BulletListContentNode;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BulletListContentNode> serializer() {
            return BulletListContentNode$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BulletListContentNode(int i, Long l, boolean z, List list, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (4 != (i & 4)) {
            C2620n1.m32836b(i, 4, BulletListContentNode$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.start = null;
        } else {
            this.start = l;
        }
        if ((i & 2) == 0) {
            this.ordered = false;
        } else {
            this.ordered = z;
        }
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BulletListContentNode copy$default(BulletListContentNode bulletListContentNode, Long l, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            l = bulletListContentNode.start;
        }
        if ((i & 2) != 0) {
            z = bulletListContentNode.ordered;
        }
        if ((i & 4) != 0) {
            list = bulletListContentNode.items;
        }
        return bulletListContentNode.copy(l, z, list);
    }

    public static final void write$Self(BulletListContentNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        boolean z2 = false;
        if (output.mo12879z(serialDesc, 0) || self.start != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo12904E(serialDesc, 0, C2649w0.f7129a, self.start);
        }
        if (output.mo12879z(serialDesc, 1) || self.ordered) {
            z2 = true;
        }
        if (z2) {
            output.mo12881x(serialDesc, 1, self.ordered);
        }
        output.mo12894i(serialDesc, 2, new C2581f(new C2581f(ContentNodeSerializer.INSTANCE)), self.items);
    }

    public final Long component1() {
        return this.start;
    }

    public final boolean component2() {
        return this.ordered;
    }

    public final List<List<ContentNode>> component3() {
        return this.items;
    }

    public final BulletListContentNode copy(Long l, boolean z, List<? extends List<? extends ContentNode>> items) {
        C9612q.m13917h(items, "items");
        return new BulletListContentNode(l, z, items);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BulletListContentNode) {
            BulletListContentNode bulletListContentNode = (BulletListContentNode) obj;
            return C9612q.m13922c(this.start, bulletListContentNode.start) && this.ordered == bulletListContentNode.ordered && C9612q.m13922c(this.items, bulletListContentNode.items);
        }
        return false;
    }

    public final List<List<ContentNode>> getItems() {
        return this.items;
    }

    public final boolean getOrdered() {
        return this.ordered;
    }

    public final Long getStart() {
        return this.start;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Long l = this.start;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        boolean z = this.ordered;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + this.items.hashCode();
    }

    public String toString() {
        Long l = this.start;
        boolean z = this.ordered;
        List<List<ContentNode>> list = this.items;
        return "BulletListContentNode(start=" + l + ", ordered=" + z + ", items=" + list + ")";
    }

    public /* synthetic */ BulletListContentNode(Long l, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? false : z, list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BulletListContentNode(Long l, boolean z, List<? extends List<? extends ContentNode>> items) {
        super(null);
        C9612q.m13917h(items, "items");
        this.start = l;
        this.ordered = z;
        this.items = items;
    }
}
