package com.mrousavy.camera;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m14357d2 = {"Lcom/mrousavy/camera/y;", "Lcom/mrousavy/camera/c;", "", ZeroconfModule.KEY_SERVICE_NAME, "", "extra", "<init>", "(Ljava/lang/String;I)V", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.mrousavy.camera.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5341y extends AbstractC5296c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5341y(String name, int i) {
        super("capture", "recorder-error", "An error occured while recording a video! " + name + ' ' + i, null, 8, null);
        C9612q.m13917h(name, "name");
    }
}
