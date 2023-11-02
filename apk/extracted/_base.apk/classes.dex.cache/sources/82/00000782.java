package androidx.media;

import androidx.versionedparcelable.AbstractC1926a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC1926a abstractC1926a) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f4555a = abstractC1926a.m34993p(audioAttributesImplBase.f4555a, 1);
        audioAttributesImplBase.f4556b = abstractC1926a.m34993p(audioAttributesImplBase.f4556b, 2);
        audioAttributesImplBase.f4557c = abstractC1926a.m34993p(audioAttributesImplBase.f4557c, 3);
        audioAttributesImplBase.f4558d = abstractC1926a.m34993p(audioAttributesImplBase.f4558d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AbstractC1926a abstractC1926a) {
        abstractC1926a.m34988x(false, false);
        abstractC1926a.m35008F(audioAttributesImplBase.f4555a, 1);
        abstractC1926a.m35008F(audioAttributesImplBase.f4556b, 2);
        abstractC1926a.m35008F(audioAttributesImplBase.f4557c, 3);
        abstractC1926a.m35008F(audioAttributesImplBase.f4558d, 4);
    }
}