package org.webrtc;

import java.util.Arrays;
import org.webrtc.PeerConnection;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class IceCandidate {
    public final PeerConnection.AdapterType adapterType;
    public final String sdp;
    public final int sdpMLineIndex;
    public final String sdpMid;
    public final String serverUrl;

    public IceCandidate(String str, int i, String str2) {
        this.sdpMid = str;
        this.sdpMLineIndex = i;
        this.sdp = str2;
        this.serverUrl = "";
        this.adapterType = PeerConnection.AdapterType.UNKNOWN;
    }

    private static boolean objectEquals(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof IceCandidate)) {
            return false;
        }
        IceCandidate iceCandidate = (IceCandidate) obj;
        if (!objectEquals(this.sdpMid, iceCandidate.sdpMid) || this.sdpMLineIndex != iceCandidate.sdpMLineIndex || !objectEquals(this.sdp, iceCandidate.sdp)) {
            return false;
        }
        return true;
    }

    @CalledByNative
    String getSdp() {
        return this.sdp;
    }

    @CalledByNative
    String getSdpMid() {
        return this.sdpMid;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.sdpMid, Integer.valueOf(this.sdpMLineIndex), this.sdp});
    }

    public String toString() {
        String str = this.sdpMid;
        int i = this.sdpMLineIndex;
        String str2 = this.sdp;
        String str3 = this.serverUrl;
        String obj = this.adapterType.toString();
        return str + ":" + i + ":" + str2 + ":" + str3 + ":" + obj;
    }

    @CalledByNative
    IceCandidate(String str, int i, String str2, String str3, PeerConnection.AdapterType adapterType) {
        this.sdpMid = str;
        this.sdpMLineIndex = i;
        this.sdp = str2;
        this.serverUrl = str3;
        this.adapterType = adapterType;
    }
}