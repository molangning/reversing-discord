package com.facebook.imagepipeline.nativecode;

import java.lang.reflect.InvocationTargetException;
import p025b5.InterfaceC2125d;

/* renamed from: com.facebook.imagepipeline.nativecode.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C3740f {
    /* renamed from: a */
    public static InterfaceC2125d m30942a(int i, boolean z, boolean z2) {
        try {
            Class cls = Boolean.TYPE;
            return (InterfaceC2125d) NativeJpegTranscoderFactory.class.getConstructor(Integer.TYPE, cls, cls).newInstance(Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(z2));
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e);
        }
    }
}