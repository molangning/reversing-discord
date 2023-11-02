package com.discord.chat.bridge.contentnode;

import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2560a2;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002)*BB\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\fø\u0001\u0000¢\u0006\u0002\u0010\rB6\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\nø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b\u0019J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JB\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b\u001cJ\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001J!\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(HÇ\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, m14357d2 = {"Lcom/discord/chat/bridge/contentnode/SoundmojiContentNode;", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "seen1", "", "id", "", "soundId", "channelId", "Lcom/discord/primitives/ChannelId;", "jumboable", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/discord/primitives/ChannelId;ZLkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/primitives/ChannelId;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getChannelId-qMVnFVQ", "()Lcom/discord/primitives/ChannelId;", "getId", "()Ljava/lang/String;", "getJumboable", "()Z", "getSoundId", "component1", "component2", "component3", "component3-qMVnFVQ", "component4", "copy", "copy-MrxLv8Q", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SoundmojiContentNode extends ContentNode {
    public static final Companion Companion = new Companion(null);
    private final ChannelId channelId;

    /* renamed from: id */
    private final String f8307id;
    private final boolean jumboable;
    private final String soundId;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/contentnode/SoundmojiContentNode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/SoundmojiContentNode;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SoundmojiContentNode> serializer() {
            return SoundmojiContentNode$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private SoundmojiContentNode(int i, String str, String str2, ChannelId channelId, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if ((i & 0) != 0) {
            C2620n1.m32836b(i, 0, SoundmojiContentNode$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.f8307id = null;
        } else {
            this.f8307id = str;
        }
        if ((i & 2) == 0) {
            this.soundId = null;
        } else {
            this.soundId = str2;
        }
        if ((i & 4) == 0) {
            this.channelId = null;
        } else {
            this.channelId = channelId;
        }
        if ((i & 8) == 0) {
            this.jumboable = false;
        } else {
            this.jumboable = z;
        }
    }

    public /* synthetic */ SoundmojiContentNode(int i, String str, String str2, ChannelId channelId, boolean z, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, channelId, z, serializationConstructorMarker);
    }

    public /* synthetic */ SoundmojiContentNode(String str, String str2, ChannelId channelId, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, channelId, z);
    }

    /* renamed from: copy-MrxLv8Q$default  reason: not valid java name */
    public static /* synthetic */ SoundmojiContentNode m41502copyMrxLv8Q$default(SoundmojiContentNode soundmojiContentNode, String str, String str2, ChannelId channelId, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = soundmojiContentNode.f8307id;
        }
        if ((i & 2) != 0) {
            str2 = soundmojiContentNode.soundId;
        }
        if ((i & 4) != 0) {
            channelId = soundmojiContentNode.channelId;
        }
        if ((i & 8) != 0) {
            z = soundmojiContentNode.jumboable;
        }
        return soundmojiContentNode.m41504copyMrxLv8Q(str, str2, channelId, z);
    }

    public static final void write$Self(SoundmojiContentNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        boolean z2;
        boolean z3;
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        boolean z4 = false;
        if (output.mo12879z(serialDesc, 0) || self.f8307id != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo12904E(serialDesc, 0, C2560a2.f7013a, self.f8307id);
        }
        if (output.mo12879z(serialDesc, 1) || self.soundId != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            output.mo12904E(serialDesc, 1, C2560a2.f7013a, self.soundId);
        }
        if (output.mo12879z(serialDesc, 2) || self.channelId != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            output.mo12904E(serialDesc, 2, ChannelId$$serializer.INSTANCE, self.channelId);
        }
        if (output.mo12879z(serialDesc, 3) || self.jumboable) {
            z4 = true;
        }
        if (z4) {
            output.mo12881x(serialDesc, 3, self.jumboable);
        }
    }

    public final String component1() {
        return this.f8307id;
    }

    public final String component2() {
        return this.soundId;
    }

    /* renamed from: component3-qMVnFVQ  reason: not valid java name */
    public final ChannelId m41503component3qMVnFVQ() {
        return this.channelId;
    }

    public final boolean component4() {
        return this.jumboable;
    }

    /* renamed from: copy-MrxLv8Q  reason: not valid java name */
    public final SoundmojiContentNode m41504copyMrxLv8Q(String str, String str2, ChannelId channelId, boolean z) {
        return new SoundmojiContentNode(str, str2, channelId, z, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SoundmojiContentNode) {
            SoundmojiContentNode soundmojiContentNode = (SoundmojiContentNode) obj;
            return C9612q.m13922c(this.f8307id, soundmojiContentNode.f8307id) && C9612q.m13922c(this.soundId, soundmojiContentNode.soundId) && C9612q.m13922c(this.channelId, soundmojiContentNode.channelId) && this.jumboable == soundmojiContentNode.jumboable;
        }
        return false;
    }

    /* renamed from: getChannelId-qMVnFVQ  reason: not valid java name */
    public final ChannelId m41505getChannelIdqMVnFVQ() {
        return this.channelId;
    }

    public final String getId() {
        return this.f8307id;
    }

    public final boolean getJumboable() {
        return this.jumboable;
    }

    public final String getSoundId() {
        return this.soundId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.f8307id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.soundId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ChannelId channelId = this.channelId;
        int m42052hashCodeimpl = (hashCode2 + (channelId != null ? ChannelId.m42052hashCodeimpl(channelId.m42056unboximpl()) : 0)) * 31;
        boolean z = this.jumboable;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return m42052hashCodeimpl + i;
    }

    public String toString() {
        String str = this.f8307id;
        String str2 = this.soundId;
        ChannelId channelId = this.channelId;
        boolean z = this.jumboable;
        return "SoundmojiContentNode(id=" + str + ", soundId=" + str2 + ", channelId=" + channelId + ", jumboable=" + z + ")";
    }

    public /* synthetic */ SoundmojiContentNode(String str, String str2, ChannelId channelId, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : channelId, (i & 8) != 0 ? false : z, null);
    }

    private SoundmojiContentNode(String str, String str2, ChannelId channelId, boolean z) {
        super(null);
        this.f8307id = str;
        this.soundId = str2;
        this.channelId = channelId;
        this.jumboable = z;
    }
}
