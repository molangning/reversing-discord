package org.webrtc;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class SoftwareVideoDecoderFactory implements VideoDecoderFactory {
    static VideoCodecInfo[] supportedCodecs() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VideoCodecInfo(VideoCodecMimeType.VP8.name(), new HashMap()));
        if (LibvpxVp9Decoder.nativeIsSupported()) {
            arrayList.add(new VideoCodecInfo(VideoCodecMimeType.VP9.name(), new HashMap()));
        }
        arrayList.add(new VideoCodecInfo(VideoCodecMimeType.AV1.name(), new HashMap()));
        return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()]);
    }

    @Override // org.webrtc.VideoDecoderFactory
    public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        String name = videoCodecInfo.getName();
        if (name.equalsIgnoreCase(VideoCodecMimeType.VP8.name())) {
            return new LibvpxVp8Decoder();
        }
        if (name.equalsIgnoreCase(VideoCodecMimeType.VP9.name()) && LibvpxVp9Decoder.nativeIsSupported()) {
            return new LibvpxVp9Decoder();
        }
        if (name.equalsIgnoreCase(VideoCodecMimeType.AV1.name())) {
            return new Dav1dDecoder();
        }
        return null;
    }

    @Override // org.webrtc.VideoDecoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        return supportedCodecs();
    }
}
