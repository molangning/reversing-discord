package androidx.media;

import android.media.AudioAttributes;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    public AudioAttributes f4553a;

    /* renamed from: b */
    public int f4554b;

    public AudioAttributesImplApi21() {
        this.f4554b = -1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f4553a.equals(((AudioAttributesImplApi21) obj).f4553a);
    }

    public int hashCode() {
        return this.f4553a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f4553a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int i) {
        this.f4553a = audioAttributes;
        this.f4554b = i;
    }
}
