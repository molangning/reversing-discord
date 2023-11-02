package org.webrtc;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public interface CapturerObserver {
    void onCapturerStarted(boolean z);

    void onCapturerStopped();

    void onFrameCaptured(VideoFrame videoFrame);
}