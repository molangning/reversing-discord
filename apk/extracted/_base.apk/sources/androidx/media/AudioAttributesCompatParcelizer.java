package androidx.media;

import androidx.versionedparcelable.AbstractC1926a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC1926a abstractC1926a) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f4552a = (AudioAttributesImpl) abstractC1926a.m34989v(audioAttributesCompat.f4552a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC1926a abstractC1926a) {
        abstractC1926a.m34988x(false, false);
        abstractC1926a.m35003M(audioAttributesCompat.f4552a, 1);
    }
}
