package com.discord.media.engine.video.events;

import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001BS\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003\u0012\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016R \u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m14357d2 = {"Lcom/discord/media/engine/video/events/DeviceChangedEvent;", "Lcom/discord/reactevents/ReactEvent;", "inputDevices", "", "", "", "", "outputDevices", "videoInputDevices", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "serialize", "Lcom/facebook/react/bridge/WritableNativeMap;", "media_engine_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class DeviceChangedEvent implements ReactEvent {
    private final List<Map<String, Object>> inputDevices;
    private final List<Map<String, Object>> outputDevices;
    private final List<Map<String, Object>> videoInputDevices;

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceChangedEvent(List<? extends Map<String, ? extends Object>> inputDevices, List<? extends Map<String, ? extends Object>> outputDevices, List<? extends Map<String, ? extends Object>> videoInputDevices) {
        C9612q.m13917h(inputDevices, "inputDevices");
        C9612q.m13917h(outputDevices, "outputDevices");
        C9612q.m13917h(videoInputDevices, "videoInputDevices");
        this.inputDevices = inputDevices;
        this.outputDevices = outputDevices;
        this.videoInputDevices = videoInputDevices;
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableNativeMap serialize() {
        return NativeMapExtensionsKt.nativeMapOf(C11591x.m7577a("inputDevices", NativeArrayExtensionsKt.toNativeArrayOfMaps(this.inputDevices)), C11591x.m7577a("outputDevices", NativeArrayExtensionsKt.toNativeArrayOfMaps(this.outputDevices)), C11591x.m7577a("videoInputDevices", NativeArrayExtensionsKt.toNativeArrayOfMaps(this.videoInputDevices)));
    }
}