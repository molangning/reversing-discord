package org.webrtc;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class AudioSource extends MediaSource {
    public AudioSource(long j) {
        super(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getNativeAudioSource() {
        return getNativeMediaSource();
    }
}
