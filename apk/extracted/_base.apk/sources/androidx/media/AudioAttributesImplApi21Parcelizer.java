package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.AbstractC1926a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AbstractC1926a abstractC1926a) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f4553a = (AudioAttributes) abstractC1926a.m34992r(audioAttributesImplApi21.f4553a, 1);
        audioAttributesImplApi21.f4554b = abstractC1926a.m34993p(audioAttributesImplApi21.f4554b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, AbstractC1926a abstractC1926a) {
        abstractC1926a.m34988x(false, false);
        abstractC1926a.m35007H(audioAttributesImplApi21.f4553a, 1);
        abstractC1926a.m35008F(audioAttributesImplApi21.f4554b, 2);
    }
}
