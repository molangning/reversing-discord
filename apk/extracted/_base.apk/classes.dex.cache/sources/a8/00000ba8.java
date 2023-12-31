package co.discord.media_engine;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J=\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006\""}, m14357d2 = {"Lco/discord/media_engine/VideoDecoder;", "", ZeroconfModule.KEY_SERVICE_NAME, "", "type", "", "rtxType", "params", "", "(Ljava/lang/String;IILjava/util/Map;)V", "getName", "()Ljava/lang/String;", "getParams", "()Ljava/util/Map;", "paramsKeys", "", "getParamsKeys", "()[Ljava/lang/String;", "[Ljava/lang/String;", "paramsValues", "getParamsValues", "getRtxType", "()I", "getType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "android_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class VideoDecoder {
    private final String name;
    private final Map<String, String> params;
    private final String[] paramsKeys;
    private final String[] paramsValues;
    private final int rtxType;
    private final int type;

    public VideoDecoder(String name, int i, int i2, Map<String, String> params) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(params, "params");
        this.name = name;
        this.type = i;
        this.rtxType = i2;
        this.params = params;
        this.paramsKeys = (String[]) params.keySet().toArray(new String[0]);
        this.paramsValues = (String[]) params.values().toArray(new String[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoDecoder copy$default(VideoDecoder videoDecoder, String str, int i, int i2, Map map, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = videoDecoder.name;
        }
        if ((i3 & 2) != 0) {
            i = videoDecoder.type;
        }
        if ((i3 & 4) != 0) {
            i2 = videoDecoder.rtxType;
        }
        if ((i3 & 8) != 0) {
            map = videoDecoder.params;
        }
        return videoDecoder.copy(str, i, i2, map);
    }

    public final String component1() {
        return this.name;
    }

    public final int component2() {
        return this.type;
    }

    public final int component3() {
        return this.rtxType;
    }

    public final Map<String, String> component4() {
        return this.params;
    }

    public final VideoDecoder copy(String name, int i, int i2, Map<String, String> params) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(params, "params");
        return new VideoDecoder(name, i, i2, params);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VideoDecoder) {
            VideoDecoder videoDecoder = (VideoDecoder) obj;
            return C9612q.m13922c(this.name, videoDecoder.name) && this.type == videoDecoder.type && this.rtxType == videoDecoder.rtxType && C9612q.m13922c(this.params, videoDecoder.params);
        }
        return false;
    }

    public final String getName() {
        return this.name;
    }

    public final Map<String, String> getParams() {
        return this.params;
    }

    public final String[] getParamsKeys() {
        return this.paramsKeys;
    }

    public final String[] getParamsValues() {
        return this.paramsValues;
    }

    public final int getRtxType() {
        return this.rtxType;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.type) * 31) + this.rtxType) * 31) + this.params.hashCode();
    }

    public String toString() {
        String str = this.name;
        int i = this.type;
        int i2 = this.rtxType;
        Map<String, String> map = this.params;
        return "VideoDecoder(name=" + str + ", type=" + i + ", rtxType=" + i2 + ", params=" + map + ")";
    }
}