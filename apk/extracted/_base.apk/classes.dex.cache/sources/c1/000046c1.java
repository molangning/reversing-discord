package org.webrtc;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class AudioSource extends MediaSource {
    public AudioSource(long j) {
        super(j);
    }

    public long getNativeAudioSource() {
        return getNativeMediaSource();
    }
}