package com.discord.audio.react.events;

import com.discord.audio.DiscordAudioManager;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.ReadableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9546k;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C11591x;

@Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, m14357d2 = {"Lcom/discord/audio/react/events/AudioManagerAudioDevicesUpdated;", "Lcom/discord/reactevents/ReactEvent;", "devices", "", "Lcom/discord/audio/DiscordAudioManager$AudioDevice;", "(Ljava/util/List;)V", "getDevices", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "serialize", "Lcom/facebook/react/bridge/WritableNativeMap;", "toString", "", "Companion", "audio_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class AudioManagerAudioDevicesUpdated implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final List<DiscordAudioManager.AudioDevice> devices;

    @Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¨\u0006\b"}, m14357d2 = {"Lcom/discord/audio/react/events/AudioManagerAudioDevicesUpdated$Companion;", "", "()V", "convertDevices", "Lcom/facebook/react/bridge/ReadableNativeArray;", "devices", "", "Lcom/discord/audio/DiscordAudioManager$AudioDevice;", "audio_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ReadableNativeArray convertDevices(List<DiscordAudioManager.AudioDevice> list) {
            int m14093t;
            ArrayList<DiscordAudioManager.AudioDevice> arrayList = new ArrayList();
            for (Object obj : list) {
                if (((DiscordAudioManager.AudioDevice) obj).isAvailable()) {
                    arrayList.add(obj);
                }
            }
            m14093t = C9546k.m14093t(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(m14093t);
            for (DiscordAudioManager.AudioDevice audioDevice : arrayList) {
                arrayList2.add(audioDevice.getType().toString());
            }
            return NativeArrayExtensionsKt.toNativeArray(arrayList2);
        }
    }

    public AudioManagerAudioDevicesUpdated(List<DiscordAudioManager.AudioDevice> devices) {
        C9612q.m13917h(devices, "devices");
        this.devices = devices;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AudioManagerAudioDevicesUpdated copy$default(AudioManagerAudioDevicesUpdated audioManagerAudioDevicesUpdated, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = audioManagerAudioDevicesUpdated.devices;
        }
        return audioManagerAudioDevicesUpdated.copy(list);
    }

    public final List<DiscordAudioManager.AudioDevice> component1() {
        return this.devices;
    }

    public final AudioManagerAudioDevicesUpdated copy(List<DiscordAudioManager.AudioDevice> devices) {
        C9612q.m13917h(devices, "devices");
        return new AudioManagerAudioDevicesUpdated(devices);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AudioManagerAudioDevicesUpdated) && C9612q.m13922c(this.devices, ((AudioManagerAudioDevicesUpdated) obj).devices);
    }

    public final List<DiscordAudioManager.AudioDevice> getDevices() {
        return this.devices;
    }

    public int hashCode() {
        return this.devices.hashCode();
    }

    public String toString() {
        List<DiscordAudioManager.AudioDevice> list = this.devices;
        return "AudioManagerAudioDevicesUpdated(devices=" + list + ")";
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableNativeMap serialize() {
        return NativeMapExtensionsKt.nativeMapOf(C11591x.m7577a("devices", Companion.convertDevices(this.devices)));
    }
}
