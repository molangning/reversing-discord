package org.webrtc;

import java.util.ArrayList;
import java.util.HashMap;
import org.webrtc.VideoEncoderFactory;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class SoftwareVideoEncoderFactory implements VideoEncoderFactory {
    static VideoCodecInfo[] supportedCodecs() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VideoCodecInfo(VideoCodecMimeType.VP8.name(), new HashMap()));
        if (LibvpxVp9Encoder.nativeIsSupported()) {
            arrayList.add(new VideoCodecInfo(VideoCodecMimeType.VP9.name(), new HashMap()));
        }
        arrayList.add(new VideoCodecInfo(VideoCodecMimeType.AV1.name(), new HashMap()));
        return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()]);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        String name = videoCodecInfo.getName();
        if (name.equalsIgnoreCase(VideoCodecMimeType.VP8.name())) {
            return new LibvpxVp8Encoder();
        }
        if (name.equalsIgnoreCase(VideoCodecMimeType.VP9.name()) && LibvpxVp9Encoder.nativeIsSupported()) {
            return new LibvpxVp9Encoder();
        }
        if (name.equalsIgnoreCase(VideoCodecMimeType.AV1.name())) {
            return new LibaomAv1Encoder();
        }
        return null;
    }

    @Override // org.webrtc.VideoEncoderFactory
    public /* synthetic */ VideoEncoderFactory.VideoEncoderSelector getEncoderSelector() {
        return C11313j1.m8296a(this);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public /* synthetic */ VideoCodecInfo[] getImplementations() {
        return C11313j1.m8295b(this);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        return supportedCodecs();
    }
}
