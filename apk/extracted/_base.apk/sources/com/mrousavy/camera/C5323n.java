package com.mrousavy.camera;

import com.facebook.react.bridge.ReadableMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import p388vf.C13277d;

@Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, m14357d2 = {"Lcom/mrousavy/camera/j;", "Lcom/facebook/react/bridge/ReadableMap;", "pointMap", "", "a", "(Lcom/mrousavy/camera/j;Lcom/facebook/react/bridge/ReadableMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "react-native-vision-camera_release"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: com.mrousavy.camera.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5323n {
    /* renamed from: a */
    public static final Object m25491a(C5313j c5313j, ReadableMap readableMap, Continuation<? super Unit> continuation) {
        Object m2869d;
        Object m2336S = c5313j.getCameraSession$react_native_vision_camera_release().m2336S(readableMap.getInt("x"), readableMap.getInt("y"), continuation);
        m2869d = C13277d.m2869d();
        if (m2336S == m2869d) {
            return m2336S;
        }
        return Unit.f25302a;
    }
}
