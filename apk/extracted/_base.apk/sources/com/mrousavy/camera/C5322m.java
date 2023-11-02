package com.mrousavy.camera;

import android.content.Context;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import pf.C11560f;

@Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0000\u001a\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¨\u0006\t"}, m14357d2 = {"Lcom/mrousavy/camera/j;", "", "c", "", "error", "b", "d", "Lcom/facebook/react/bridge/WritableMap;", "a", "react-native-vision-camera_release"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: com.mrousavy.camera.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5322m {
    /* renamed from: a */
    private static final WritableMap m25495a(Throwable th2) {
        String m7636b;
        WritableMap map = Arguments.createMap();
        map.putString("message", th2.getMessage());
        m7636b = C11560f.m7636b(th2);
        map.putString("stacktrace", m7636b);
        Throwable cause = th2.getCause();
        if (cause != null) {
            map.putMap("cause", m25495a(cause));
        }
        C9612q.m13918g(map, "map");
        return map;
    }

    /* renamed from: b */
    public static final void m25494b(C5313j c5313j, Throwable error) {
        AbstractC5296c c5293a0;
        C9612q.m13917h(c5313j, "<this>");
        C9612q.m13917h(error, "error");
        Log.e("CameraView", "invokeOnError(...):");
        error.printStackTrace();
        if (error instanceof AbstractC5296c) {
            c5293a0 = (AbstractC5296c) error;
        } else {
            c5293a0 = new C5293a0(error);
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putString("code", C5334r.m25477a(c5293a0));
        createMap.putString("message", c5293a0.getMessage());
        Throwable cause = c5293a0.getCause();
        if (cause != null) {
            createMap.putMap("cause", m25495a(cause));
        }
        Context context = c5313j.getContext();
        C9612q.m13919f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(c5313j.getId(), "cameraError", createMap);
    }

    /* renamed from: c */
    public static final void m25493c(C5313j c5313j) {
        C9612q.m13917h(c5313j, "<this>");
        Log.i("CameraView", "invokeOnInitialized()");
        Context context = c5313j.getContext();
        C9612q.m13919f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(c5313j.getId(), "cameraInitialized", null);
    }

    /* renamed from: d */
    public static final void m25492d(C5313j c5313j) {
        C9612q.m13917h(c5313j, "<this>");
        WritableMap createMap = Arguments.createMap();
        Context context = c5313j.getContext();
        C9612q.m13919f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(c5313j.getId(), "cameraViewReady", createMap);
    }
}
