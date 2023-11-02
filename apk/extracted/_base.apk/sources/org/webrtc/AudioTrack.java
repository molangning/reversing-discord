package org.webrtc;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class AudioTrack extends MediaStreamTrack {
    public AudioTrack(long j) {
        super(j);
    }

    private static native void nativeSetVolume(long j, double d);

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getNativeAudioTrack() {
        return getNativeMediaStreamTrack();
    }

    public void setVolume(double d) {
        nativeSetVolume(getNativeAudioTrack(), d);
    }
}
