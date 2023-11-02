package com.discord.notifications.api;

import com.discord.primitives.ChannelId;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9652n;
import kotlin.text.C9654p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p014aj.C0213a;

@Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000J!\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016ø\u0001\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, m14357d2 = {"Lcom/discord/notifications/api/ChannelListSerializer;", "Lkotlinx/serialization/KSerializer;", "", "Lcom/discord/primitives/ChannelId;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "notification_api_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class ChannelListSerializer implements KSerializer<List<? extends ChannelId>> {
    public static final ChannelListSerializer INSTANCE = new ChannelListSerializer();

    private ChannelListSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return C0213a.m40933h(ChannelId.Companion.serializer()).getDescriptor();
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public List<ChannelId> deserialize(Decoder decoder) {
        List<String> m13682z0;
        Long m13767o;
        C9612q.m13917h(decoder, "decoder");
        m13682z0 = C9654p.m13682z0(decoder.mo12909z(), new String[]{","}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        for (String str : m13682z0) {
            m13767o = C9652n.m13767o(str);
            ChannelId m42047boximpl = m13767o != null ? ChannelId.m42047boximpl(ChannelId.m42048constructorimpl(m13767o.longValue())) : null;
            if (m42047boximpl != null) {
                arrayList.add(m42047boximpl);
            }
        }
        return arrayList;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, List<ChannelId> value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        throw new UnsupportedOperationException();
    }
}
