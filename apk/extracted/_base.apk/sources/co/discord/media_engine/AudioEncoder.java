package co.discord.media_engine;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, m14357d2 = {"Lco/discord/media_engine/AudioEncoder;", "", "type", "", ZeroconfModule.KEY_SERVICE_NAME, "", "freq", "pacsize", "channels", "rate", "(ILjava/lang/String;IIII)V", "getChannels", "()I", "getFreq", "getName", "()Ljava/lang/String;", "getPacsize", "getRate", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "android_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class AudioEncoder {
    private final int channels;
    private final int freq;
    private final String name;
    private final int pacsize;
    private final int rate;
    private final int type;

    public AudioEncoder(int i, String name, int i2, int i3, int i4, int i5) {
        C9612q.m13917h(name, "name");
        this.type = i;
        this.name = name;
        this.freq = i2;
        this.pacsize = i3;
        this.channels = i4;
        this.rate = i5;
    }

    public static /* synthetic */ AudioEncoder copy$default(AudioEncoder audioEncoder, int i, String str, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = audioEncoder.type;
        }
        if ((i6 & 2) != 0) {
            str = audioEncoder.name;
        }
        String str2 = str;
        if ((i6 & 4) != 0) {
            i2 = audioEncoder.freq;
        }
        int i7 = i2;
        if ((i6 & 8) != 0) {
            i3 = audioEncoder.pacsize;
        }
        int i8 = i3;
        if ((i6 & 16) != 0) {
            i4 = audioEncoder.channels;
        }
        int i9 = i4;
        if ((i6 & 32) != 0) {
            i5 = audioEncoder.rate;
        }
        return audioEncoder.copy(i, str2, i7, i8, i9, i5);
    }

    public final int component1() {
        return this.type;
    }

    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.freq;
    }

    public final int component4() {
        return this.pacsize;
    }

    public final int component5() {
        return this.channels;
    }

    public final int component6() {
        return this.rate;
    }

    public final AudioEncoder copy(int i, String name, int i2, int i3, int i4, int i5) {
        C9612q.m13917h(name, "name");
        return new AudioEncoder(i, name, i2, i3, i4, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AudioEncoder) {
            AudioEncoder audioEncoder = (AudioEncoder) obj;
            return this.type == audioEncoder.type && C9612q.m13922c(this.name, audioEncoder.name) && this.freq == audioEncoder.freq && this.pacsize == audioEncoder.pacsize && this.channels == audioEncoder.channels && this.rate == audioEncoder.rate;
        }
        return false;
    }

    public final int getChannels() {
        return this.channels;
    }

    public final int getFreq() {
        return this.freq;
    }

    public final String getName() {
        return this.name;
    }

    public final int getPacsize() {
        return this.pacsize;
    }

    public final int getRate() {
        return this.rate;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((this.type * 31) + this.name.hashCode()) * 31) + this.freq) * 31) + this.pacsize) * 31) + this.channels) * 31) + this.rate;
    }

    public String toString() {
        int i = this.type;
        String str = this.name;
        int i2 = this.freq;
        int i3 = this.pacsize;
        int i4 = this.channels;
        int i5 = this.rate;
        return "AudioEncoder(type=" + i + ", name=" + str + ", freq=" + i2 + ", pacsize=" + i3 + ", channels=" + i4 + ", rate=" + i5 + ")";
    }
}
