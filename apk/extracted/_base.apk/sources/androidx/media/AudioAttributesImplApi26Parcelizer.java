package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.AbstractC1926a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(AbstractC1926a abstractC1926a) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f4553a = (AudioAttributes) abstractC1926a.m34992r(audioAttributesImplApi26.f4553a, 1);
        audioAttributesImplApi26.f4554b = abstractC1926a.m34993p(audioAttributesImplApi26.f4554b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, AbstractC1926a abstractC1926a) {
        abstractC1926a.m34988x(false, false);
        abstractC1926a.m35007H(audioAttributesImplApi26.f4553a, 1);
        abstractC1926a.m35008F(audioAttributesImplApi26.f4554b, 2);
    }
}
