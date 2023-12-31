package com.discord.p047native.engine;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m14357d2 = {"Lcom/discord/native/engine/VideoInputDeviceDescription;", "", ZeroconfModule.KEY_SERVICE_NAME, "", "guid", "facing", "Lcom/discord/native/engine/VideoInputDeviceFacing;", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/native/engine/VideoInputDeviceFacing;)V", "getFacing", "()Lcom/discord/native/engine/VideoInputDeviceFacing;", "getGuid", "()Ljava/lang/String;", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* renamed from: com.discord.native.engine.VideoInputDeviceDescription */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class VideoInputDeviceDescription {
    private final VideoInputDeviceFacing facing;
    private final String guid;
    private final String name;

    public VideoInputDeviceDescription(String name, String guid, VideoInputDeviceFacing facing) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(guid, "guid");
        C9612q.m13917h(facing, "facing");
        this.name = name;
        this.guid = guid;
        this.facing = facing;
    }

    public static /* synthetic */ VideoInputDeviceDescription copy$default(VideoInputDeviceDescription videoInputDeviceDescription, String str, String str2, VideoInputDeviceFacing videoInputDeviceFacing, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoInputDeviceDescription.name;
        }
        if ((i & 2) != 0) {
            str2 = videoInputDeviceDescription.guid;
        }
        if ((i & 4) != 0) {
            videoInputDeviceFacing = videoInputDeviceDescription.facing;
        }
        return videoInputDeviceDescription.copy(str, str2, videoInputDeviceFacing);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.guid;
    }

    public final VideoInputDeviceFacing component3() {
        return this.facing;
    }

    public final VideoInputDeviceDescription copy(String name, String guid, VideoInputDeviceFacing facing) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(guid, "guid");
        C9612q.m13917h(facing, "facing");
        return new VideoInputDeviceDescription(name, guid, facing);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VideoInputDeviceDescription) {
            VideoInputDeviceDescription videoInputDeviceDescription = (VideoInputDeviceDescription) obj;
            return C9612q.m13922c(this.name, videoInputDeviceDescription.name) && C9612q.m13922c(this.guid, videoInputDeviceDescription.guid) && this.facing == videoInputDeviceDescription.facing;
        }
        return false;
    }

    public final VideoInputDeviceFacing getFacing() {
        return this.facing;
    }

    public final String getGuid() {
        return this.guid;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.guid.hashCode()) * 31) + this.facing.hashCode();
    }

    public String toString() {
        String str = this.name;
        String str2 = this.guid;
        VideoInputDeviceFacing videoInputDeviceFacing = this.facing;
        return "VideoInputDeviceDescription(name=" + str + ", guid=" + str2 + ", facing=" + videoInputDeviceFacing + ")";
    }
}