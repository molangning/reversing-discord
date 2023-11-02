package org.webrtc;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class BuiltinAudioEncoderFactoryFactory implements AudioEncoderFactoryFactory {
    private static native long nativeCreateBuiltinAudioEncoderFactory();

    @Override // org.webrtc.AudioEncoderFactoryFactory
    public long createNativeAudioEncoderFactory() {
        return nativeCreateBuiltinAudioEncoderFactory();
    }
}