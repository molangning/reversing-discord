package com.mrousavy.camera;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m14357d2 = {"Lcom/mrousavy/camera/x;", "Lcom/mrousavy/camera/c;", "", "format", "<init>", "(Ljava/lang/String;)V", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.mrousavy.camera.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5340x extends AbstractC5296c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5340x(String format) {
        super("device", "pixel-format-not-supported", "The pixelFormat " + format + " is not supported on the given Camera Device!", null, 8, null);
        C9612q.m13917h(format, "format");
    }
}
