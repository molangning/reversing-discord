package com.discord.media.engine.types;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.p047native.engine.AudioInputDeviceDescription;
import com.discord.p047native.engine.AudioOutputDeviceDescription;
import com.discord.p047native.engine.ConnectionInfo;
import com.discord.p047native.engine.VideoInputDeviceDescription;
import com.discord.p047native.engine.VideoInputDeviceFacing;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import p304qf.C11889v;
import pf.C11591x;

@Metadata(m14358d1 = {"\u00000\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a)\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0002\u0010\u0007\u001a)\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\b\u0012\u0004\u0012\u00020\b0\u0005H\u0000¢\u0006\u0002\u0010\t\u001a)\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\b\u0012\u0004\u0012\u00020\n0\u0005H\u0000¢\u0006\u0002\u0010\u000b\u001a\u0018\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002*\u00020\rH\u0000¨\u0006\u000e"}, m14357d2 = {"toListOfMaps", "", "", "", "", "", "Lcom/discord/native/engine/AudioInputDeviceDescription;", "([Lcom/discord/native/engine/AudioInputDeviceDescription;)Ljava/util/List;", "Lcom/discord/native/engine/AudioOutputDeviceDescription;", "([Lcom/discord/native/engine/AudioOutputDeviceDescription;)Ljava/util/List;", "Lcom/discord/native/engine/VideoInputDeviceDescription;", "([Lcom/discord/native/engine/VideoInputDeviceDescription;)Ljava/util/List;", "toMap", "Lcom/discord/native/engine/ConnectionInfo;", "media_engine_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class NativeTypeExtensionsKt {

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoInputDeviceFacing.values().length];
            try {
                iArr[VideoInputDeviceFacing.Front.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoInputDeviceFacing.Back.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final List<Map<String, Object>> toListOfMaps(AudioInputDeviceDescription[] audioInputDeviceDescriptionArr) {
        Map m6751k;
        C9612q.m13917h(audioInputDeviceDescriptionArr, "<this>");
        ArrayList arrayList = new ArrayList(audioInputDeviceDescriptionArr.length);
        int length = audioInputDeviceDescriptionArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            AudioInputDeviceDescription audioInputDeviceDescription = audioInputDeviceDescriptionArr[i];
            int i3 = i2 + 1;
            m6751k = C11889v.m6751k(C11591x.m7577a(ZeroconfModule.KEY_SERVICE_NAME, audioInputDeviceDescription.getName()), C11591x.m7577a("guid", audioInputDeviceDescription.getGuid()), C11591x.m7577a("index", Integer.valueOf(i2)));
            arrayList.add(m6751k);
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    public static final Map<String, Object> toMap(ConnectionInfo connectionInfo) {
        Map<String, Object> m6751k;
        C9612q.m13917h(connectionInfo, "<this>");
        m6751k = C11889v.m6751k(C11591x.m7577a("protocol", connectionInfo.getProtocol()), C11591x.m7577a("address", connectionInfo.getLocalAddress()), C11591x.m7577a(ZeroconfModule.KEY_SERVICE_PORT, Integer.valueOf(connectionInfo.getLocalPort())));
        return m6751k;
    }

    public static final List<Map<String, Object>> toListOfMaps(AudioOutputDeviceDescription[] audioOutputDeviceDescriptionArr) {
        Map m6751k;
        C9612q.m13917h(audioOutputDeviceDescriptionArr, "<this>");
        ArrayList arrayList = new ArrayList(audioOutputDeviceDescriptionArr.length);
        int length = audioOutputDeviceDescriptionArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            AudioOutputDeviceDescription audioOutputDeviceDescription = audioOutputDeviceDescriptionArr[i];
            int i3 = i2 + 1;
            m6751k = C11889v.m6751k(C11591x.m7577a(ZeroconfModule.KEY_SERVICE_NAME, audioOutputDeviceDescription.getName()), C11591x.m7577a("guid", audioOutputDeviceDescription.getGuid()), C11591x.m7577a("index", Integer.valueOf(i2)));
            arrayList.add(m6751k);
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    public static final List<Map<String, Object>> toListOfMaps(VideoInputDeviceDescription[] videoInputDeviceDescriptionArr) {
        Object m14054V;
        Object m14054V2;
        List m14101l;
        List m14059Q;
        int m14093t;
        Map m6751k;
        C9612q.m13917h(videoInputDeviceDescriptionArr, "<this>");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = videoInputDeviceDescriptionArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            VideoInputDeviceDescription videoInputDeviceDescription = videoInputDeviceDescriptionArr[i];
            if (videoInputDeviceDescription.getFacing() == VideoInputDeviceFacing.Front) {
                arrayList.add(videoInputDeviceDescription);
            } else {
                arrayList2.add(videoInputDeviceDescription);
            }
            i++;
        }
        Pair pair = new Pair(arrayList, arrayList2);
        m14054V = C9553r.m14054V((List) pair.m14351a());
        m14054V2 = C9553r.m14054V((List) pair.m14350b());
        m14101l = C9545j.m14101l((VideoInputDeviceDescription) m14054V, (VideoInputDeviceDescription) m14054V2);
        m14059Q = C9553r.m14059Q(m14101l);
        m14093t = C9546k.m14093t(m14059Q, 10);
        ArrayList arrayList3 = new ArrayList(m14093t);
        int i2 = 0;
        for (Object obj : m14059Q) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C9545j.m14094s();
            }
            VideoInputDeviceDescription videoInputDeviceDescription2 = (VideoInputDeviceDescription) obj;
            int i4 = WhenMappings.$EnumSwitchMapping$0[videoInputDeviceDescription2.getFacing().ordinal()];
            m6751k = C11889v.m6751k(C11591x.m7577a(ZeroconfModule.KEY_SERVICE_NAME, videoInputDeviceDescription2.getName()), C11591x.m7577a("guid", videoInputDeviceDescription2.getGuid()), C11591x.m7577a("facing", i4 != 1 ? i4 != 2 ? "unknown" : "back" : "front"), C11591x.m7577a("index", Integer.valueOf(i2)));
            arrayList3.add(m6751k);
            i2 = i3;
        }
        return arrayList3;
    }
}
