package org.webrtc;

import java.nio.ByteBuffer;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class JniCommon {
    public static native void nativeAddRef(long j);

    public static native ByteBuffer nativeAllocateByteBuffer(int i);

    public static native void nativeFreeByteBuffer(ByteBuffer byteBuffer);

    public static native void nativeReleaseRef(long j);
}
