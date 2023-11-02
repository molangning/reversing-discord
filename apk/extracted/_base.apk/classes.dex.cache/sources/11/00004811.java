package org.webrtc.audio;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public interface AudioDeviceModule {
    long getNativeAudioDeviceModulePointer();

    void release();

    void setMicrophoneMute(boolean z);

    void setSpeakerMute(boolean z);
}