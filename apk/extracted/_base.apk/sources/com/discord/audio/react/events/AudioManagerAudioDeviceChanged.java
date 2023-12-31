package com.discord.audio.react.events;

import com.discord.audio.DiscordAudioManager;
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

@Metadata(m14358d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B#\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u000e\u001a\u00020\u0007HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0007HÖ\u0001J!\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cHÇ\u0001R\u0011\u0010\u0002\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m14357d2 = {"Lcom/discord/audio/react/events/AudioManagerAudioDeviceChanged;", "Lcom/discord/reactevents/ReactEvent;", "device", "Lcom/discord/audio/DiscordAudioManager$DeviceTypes;", "(Lcom/discord/audio/DiscordAudioManager$DeviceTypes;)V", "seen1", "", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getDevice", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "audio_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class AudioManagerAudioDeviceChanged implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final String device;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/audio/react/events/AudioManagerAudioDeviceChanged$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/audio/react/events/AudioManagerAudioDeviceChanged;", "audio_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AudioManagerAudioDeviceChanged> serializer() {
            return AudioManagerAudioDeviceChanged$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AudioManagerAudioDeviceChanged(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            C2620n1.m32836b(i, 1, AudioManagerAudioDeviceChanged$$serializer.INSTANCE.getDescriptor());
        }
        this.device = str;
    }

    public static /* synthetic */ AudioManagerAudioDeviceChanged copy$default(AudioManagerAudioDeviceChanged audioManagerAudioDeviceChanged, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = audioManagerAudioDeviceChanged.device;
        }
        return audioManagerAudioDeviceChanged.copy(str);
    }

    public static final void write$Self(AudioManagerAudioDeviceChanged self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        output.mo12880y(serialDesc, 0, self.device);
    }

    public final String component1() {
        return this.device;
    }

    public final AudioManagerAudioDeviceChanged copy(String device) {
        C9612q.m13917h(device, "device");
        return new AudioManagerAudioDeviceChanged(device);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AudioManagerAudioDeviceChanged) && C9612q.m13922c(this.device, ((AudioManagerAudioDeviceChanged) obj).device);
    }

    public final String getDevice() {
        return this.device;
    }

    public int hashCode() {
        return this.device.hashCode();
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        String str = this.device;
        return "AudioManagerAudioDeviceChanged(device=" + str + ")";
    }

    public AudioManagerAudioDeviceChanged(String device) {
        C9612q.m13917h(device, "device");
        this.device = device;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioManagerAudioDeviceChanged(DiscordAudioManager.DeviceTypes device) {
        this(device.toString());
        C9612q.m13917h(device, "device");
    }
}
