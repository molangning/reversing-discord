package com.mrousavy.camera;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p465zd.EnumC14148a;

@Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m14357d2 = {"Lcom/mrousavy/camera/a;", "Lcom/mrousavy/camera/c;", "", "cameraId", "Lzd/a;", "error", "<init>", "(Ljava/lang/String;Lzd/a;)V", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.mrousavy.camera.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5292a extends AbstractC5296c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5292a(String cameraId, EnumC14148a error) {
        super("session", "camera-cannot-be-opened", "The given Camera device (id: " + cameraId + ") could not be opened! Error: " + error, null, 8, null);
        C9612q.m13917h(cameraId, "cameraId");
        C9612q.m13917h(error, "error");
    }
}