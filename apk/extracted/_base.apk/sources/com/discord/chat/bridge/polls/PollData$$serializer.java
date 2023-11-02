package com.discord.chat.bridge.polls;

import com.discord.chat.bridge.polls.PollLayoutType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC9936c;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p045cj.C2560a2;
import p045cj.C2581f;
import p045cj.C2590h;
import p045cj.InterfaceC2582f0;
import p470zi.C14289n;

@Metadata(m14358d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"com/discord/chat/bridge/polls/PollData.$serializer", "Lcj/f0;", "Lcom/discord/chat/bridge/polls/PollData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class PollData$$serializer implements InterfaceC2582f0<PollData> {
    public static final PollData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PollData$$serializer pollData$$serializer = new PollData$$serializer();
        INSTANCE = pollData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.polls.PollData", pollData$$serializer, 10);
        pluginGeneratedSerialDescriptor.m12856l("question", false);
        pluginGeneratedSerialDescriptor.m12856l("answers", false);
        pluginGeneratedSerialDescriptor.m12856l("layoutType", false);
        pluginGeneratedSerialDescriptor.m12856l("submitVoteLabel", false);
        pluginGeneratedSerialDescriptor.m12856l("canSubmitVote", false);
        pluginGeneratedSerialDescriptor.m12856l("canTapAnswers", false);
        pluginGeneratedSerialDescriptor.m12856l("canShowVoteCounts", false);
        pluginGeneratedSerialDescriptor.m12856l("hasVoted", false);
        pluginGeneratedSerialDescriptor.m12856l("expirationLabel", false);
        pluginGeneratedSerialDescriptor.m12856l("isExpired", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PollData$$serializer() {
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] childSerializers() {
        C2560a2 c2560a2 = C2560a2.f7013a;
        C2590h c2590h = C2590h.f7055a;
        return new KSerializer[]{PollMedia$$serializer.INSTANCE, new C2581f(PollAnswer$$serializer.INSTANCE), PollLayoutType.Serializer.INSTANCE, c2560a2, c2590h, c2590h, c2590h, c2590h, c2560a2, c2590h};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public PollData deserialize(Decoder decoder) {
        boolean z;
        String str;
        boolean z2;
        Object obj;
        boolean z3;
        String str2;
        Object obj2;
        boolean z4;
        Object obj3;
        int i;
        boolean z5;
        C9612q.m13917h(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC9936c mo12920b = decoder.mo12920b(descriptor2);
        int i2 = 9;
        int i3 = 7;
        int i4 = 6;
        int i5 = 0;
        if (mo12920b.mo12865p()) {
            obj3 = mo12920b.mo12862y(descriptor2, 0, PollMedia$$serializer.INSTANCE, null);
            obj2 = mo12920b.mo12862y(descriptor2, 1, new C2581f(PollAnswer$$serializer.INSTANCE), null);
            obj = mo12920b.mo12862y(descriptor2, 2, PollLayoutType.Serializer.INSTANCE, null);
            String mo12868m = mo12920b.mo12868m(descriptor2, 3);
            z3 = mo12920b.mo12876C(descriptor2, 4);
            boolean mo12876C = mo12920b.mo12876C(descriptor2, 5);
            boolean mo12876C2 = mo12920b.mo12876C(descriptor2, 6);
            boolean mo12876C3 = mo12920b.mo12876C(descriptor2, 7);
            String mo12868m2 = mo12920b.mo12868m(descriptor2, 8);
            z4 = mo12920b.mo12876C(descriptor2, 9);
            z2 = mo12876C3;
            z = mo12876C;
            str = mo12868m2;
            i = 1023;
            z5 = mo12876C2;
            str2 = mo12868m;
        } else {
            boolean z6 = true;
            boolean z7 = false;
            boolean z8 = false;
            z = false;
            boolean z9 = false;
            Object obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            String str3 = null;
            str = null;
            z2 = false;
            while (z6) {
                int mo12866o = mo12920b.mo12866o(descriptor2);
                switch (mo12866o) {
                    case -1:
                        z6 = false;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 0:
                        obj5 = mo12920b.mo12862y(descriptor2, 0, PollMedia$$serializer.INSTANCE, obj5);
                        i5 |= 1;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 1:
                        i5 |= 2;
                        obj6 = mo12920b.mo12862y(descriptor2, 1, new C2581f(PollAnswer$$serializer.INSTANCE), obj6);
                        i2 = 9;
                        i3 = 7;
                        break;
                    case 2:
                        obj4 = mo12920b.mo12862y(descriptor2, 2, PollLayoutType.Serializer.INSTANCE, obj4);
                        i5 |= 4;
                        i2 = 9;
                        continue;
                    case 3:
                        str3 = mo12920b.mo12868m(descriptor2, 3);
                        i5 |= 8;
                        break;
                    case 4:
                        z9 = mo12920b.mo12876C(descriptor2, 4);
                        i5 |= 16;
                        break;
                    case 5:
                        z = mo12920b.mo12876C(descriptor2, 5);
                        i5 |= 32;
                        break;
                    case 6:
                        z8 = mo12920b.mo12876C(descriptor2, i4);
                        i5 |= 64;
                        break;
                    case 7:
                        z2 = mo12920b.mo12876C(descriptor2, i3);
                        i5 |= 128;
                        break;
                    case 8:
                        str = mo12920b.mo12868m(descriptor2, 8);
                        i5 |= 256;
                        break;
                    case 9:
                        z7 = mo12920b.mo12876C(descriptor2, i2);
                        i5 |= 512;
                        break;
                    default:
                        throw new C14289n(mo12866o);
                }
            }
            obj = obj4;
            z3 = z9;
            str2 = str3;
            obj2 = obj6;
            boolean z10 = z8;
            z4 = z7;
            obj3 = obj5;
            i = i5;
            z5 = z10;
        }
        mo12920b.mo12872c(descriptor2);
        return new PollData(i, (PollMedia) obj3, (List) obj2, (PollLayoutType) obj, str2, z3, z, z5, z2, str, z4, null);
    }

    @Override // kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // p470zi.InterfaceC14279h
    public void serialize(Encoder encoder, PollData value) {
        C9612q.m13917h(encoder, "encoder");
        C9612q.m13917h(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder mo12900b = encoder.mo12900b(descriptor2);
        PollData.write$Self(value, mo12900b, descriptor2);
        mo12900b.mo12899c(descriptor2);
    }

    @Override // p045cj.InterfaceC2582f0
    public KSerializer<?>[] typeParametersSerializers() {
        return InterfaceC2582f0.C2583a.m32915a(this);
    }
}
