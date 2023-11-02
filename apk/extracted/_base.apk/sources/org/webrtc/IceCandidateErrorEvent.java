package org.webrtc;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class IceCandidateErrorEvent {
    public final String address;
    public final int errorCode;
    public final String errorText;
    public final int port;
    public final String url;

    @CalledByNative
    public IceCandidateErrorEvent(String str, int i, String str2, int i2, String str3) {
        this.address = str;
        this.port = i;
        this.url = str2;
        this.errorCode = i2;
        this.errorText = str3;
    }
}
