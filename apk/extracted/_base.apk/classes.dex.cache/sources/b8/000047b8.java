package org.webrtc;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public interface SdpObserver {
    @CalledByNative
    void onCreateFailure(String str);

    @CalledByNative
    void onCreateSuccess(SessionDescription sessionDescription);

    @CalledByNative
    void onSetFailure(String str);

    @CalledByNative
    void onSetSuccess();
}