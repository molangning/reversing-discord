package com.discord.chat.bridge.botuikit;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002 !B1\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u001f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J#\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J!\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÇ\u0001R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\""}, m14357d2 = {"Lcom/discord/chat/bridge/botuikit/UnknownComponent;", "Lcom/discord/chat/bridge/botuikit/Component;", "seen1", "", "type", "indices", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILjava/util/List;)V", "getIndices", "()Ljava/util/List;", "getType", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class UnknownComponent extends Component {
    public static final Companion Companion = new Companion(null);
    private final List<Integer> indices;
    private final int type;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/botuikit/UnknownComponent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/botuikit/UnknownComponent;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UnknownComponent> serializer() {
            return UnknownComponent$$serializer.INSTANCE;
        }
    }

    public UnknownComponent() {
        this(0, (List) null, 3, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UnknownComponent(int i, int i2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        List<Integer> m14104i;
        if ((i & 0) != 0) {
            C2620n1.m32836b(i, 0, UnknownComponent$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.type = 0;
        } else {
            this.type = i2;
        }
        if ((i & 2) != 0) {
            this.indices = list;
            return;
        }
        m14104i = C9545j.m14104i();
        this.indices = m14104i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnknownComponent copy$default(UnknownComponent unknownComponent, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = unknownComponent.getType();
        }
        if ((i2 & 2) != 0) {
            list = unknownComponent.getIndices();
        }
        return unknownComponent.copy(i, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (kotlin.jvm.internal.C9612q.m13922c(r1, r3) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void write$Self(com.discord.chat.bridge.botuikit.UnknownComponent r4, kotlinx.serialization.encoding.CompositeEncoder r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
        /*
            java.lang.String r0 = "self"
            kotlin.jvm.internal.C9612q.m13917h(r4, r0)
            java.lang.String r0 = "output"
            kotlin.jvm.internal.C9612q.m13917h(r5, r0)
            java.lang.String r0 = "serialDesc"
            kotlin.jvm.internal.C9612q.m13917h(r6, r0)
            r0 = 0
            boolean r1 = r5.mo12879z(r6, r0)
            r2 = 1
            if (r1 == 0) goto L19
        L17:
            r1 = r2
            goto L21
        L19:
            int r1 = r4.getType()
            if (r1 == 0) goto L20
            goto L17
        L20:
            r1 = r0
        L21:
            if (r1 == 0) goto L2a
            int r1 = r4.getType()
            r5.mo12882w(r6, r0, r1)
        L2a:
            boolean r1 = r5.mo12879z(r6, r2)
            if (r1 == 0) goto L32
        L30:
            r0 = r2
            goto L41
        L32:
            java.util.List r1 = r4.getIndices()
            java.util.List r3 = kotlin.collections.C9543h.m14145i()
            boolean r1 = kotlin.jvm.internal.C9612q.m13922c(r1, r3)
            if (r1 != 0) goto L41
            goto L30
        L41:
            if (r0 == 0) goto L51
            cj.f r0 = new cj.f
            cj.m0 r1 = p045cj.C2615m0.f7088a
            r0.<init>(r1)
            java.util.List r4 = r4.getIndices()
            r5.mo12894i(r6, r2, r0, r4)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.bridge.botuikit.UnknownComponent.write$Self(com.discord.chat.bridge.botuikit.UnknownComponent, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final int component1() {
        return getType();
    }

    public final List<Integer> component2() {
        return getIndices();
    }

    public final UnknownComponent copy(int i, List<Integer> indices) {
        C9612q.m13917h(indices, "indices");
        return new UnknownComponent(i, indices);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnknownComponent) {
            UnknownComponent unknownComponent = (UnknownComponent) obj;
            return getType() == unknownComponent.getType() && C9612q.m13922c(getIndices(), unknownComponent.getIndices());
        }
        return false;
    }

    @Override // com.discord.chat.bridge.botuikit.Component
    public List<Integer> getIndices() {
        return this.indices;
    }

    @Override // com.discord.chat.bridge.botuikit.Component
    public int getType() {
        return this.type;
    }

    public int hashCode() {
        return (getType() * 31) + getIndices().hashCode();
    }

    public String toString() {
        int type = getType();
        List<Integer> indices = getIndices();
        return "UnknownComponent(type=" + type + ", indices=" + indices + ")";
    }

    public /* synthetic */ UnknownComponent(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? C9545j.m14104i() : list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnknownComponent(int i, List<Integer> indices) {
        super(null);
        C9612q.m13917h(indices, "indices");
        this.type = i;
        this.indices = indices;
    }
}
