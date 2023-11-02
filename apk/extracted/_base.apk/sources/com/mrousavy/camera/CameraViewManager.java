package com.mrousavy.camera;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.webrtc.MediaStreamTrack;
import p465zd.EnumC14156e;
import p465zd.EnumC14161g;
import p465zd.EnumC14166i;
import p465zd.EnumC14174l;

@Metadata(m14358d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\t\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001<B\u0007¢\u0006\u0004\b9\u0010:J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0014J\u0016\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0007J!\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0013J!\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0017\u0010\u0013J\u0018\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0010H\u0007J\u001a\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\nH\u0007J\u0018\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0010H\u0007J\u0018\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0010H\u0007J\u001a\u0010!\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\nH\u0007J!\u0010#\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b#\u0010\u0013J\u0018\u0010%\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0010H\u0007J\u001a\u0010(\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010&H\u0007J\u0018\u0010+\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)H\u0007J!\u0010-\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010,\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b-\u0010\u0013J!\u0010/\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b/\u0010\u0013J\u0018\u00101\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u0010H\u0007J\u0018\u00103\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u00102\u001a\u00020\nH\u0007J\u0018\u00106\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u00105\u001a\u000204H\u0007J\u001a\u00108\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\b\u00107\u001a\u0004\u0018\u00010\nH\u0007¨\u0006="}, m14357d2 = {"Lcom/mrousavy/camera/CameraViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/mrousavy/camera/j;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "createViewInstance", "view", "", "onAfterUpdateTransaction", "", "", "", "getExportedCustomDirectEventTypeConstants", "getName", "cameraId", "setCameraId", "", "photo", "setPhoto", "(Lcom/mrousavy/camera/j;Ljava/lang/Boolean;)V", MediaStreamTrack.VIDEO_TRACK_KIND, "setVideo", MediaStreamTrack.AUDIO_TRACK_KIND, "setAudio", "enableFrameProcessor", "setEnableFrameProcessor", "pixelFormat", "setPixelFormat", "enableDepthData", "setEnableDepthData", "enableZoomGesture", "setEnableZoomGesture", "videoStabilizationMode", "setVideoStabilizationMode", "enableHighQualityPhotos", "setEnableHighQualityPhotos", "enablePortraitEffectsMatteDelivery", "setEnablePortraitEffectsMatteDelivery", "Lcom/facebook/react/bridge/ReadableMap;", "format", "setFormat", "", "fps", "setFps", "hdr", "setHdr", "lowLightBoost", "setLowLightBoost", "isActive", "setIsActive", "torch", "setTorch", "", "zoom", "setZoom", "orientation", "setOrientation", "<init>", "()V", "Companion", "a", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class CameraViewManager extends ViewGroupManager<C5313j> {
    public static final String TAG = "CameraView";
    public static final C5282a Companion = new C5282a(null);
    private static final HashMap<C5313j, ArrayList<String>> cameraViewTransactions = new HashMap<>();

    @Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002RI\u0010\f\u001a4\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\bj\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\tj\b\u0012\u0004\u0012\u00020\u0004`\u000b`\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m14357d2 = {"Lcom/mrousavy/camera/CameraViewManager$a;", "", "Lcom/mrousavy/camera/j;", "view", "", "changedProp", "", "b", "Ljava/util/HashMap;", "Ljava/util/ArrayList;", "Lkotlin/collections/HashMap;", "Lkotlin/collections/ArrayList;", "cameraViewTransactions", "Ljava/util/HashMap;", "c", "()Ljava/util/HashMap;", "TAG", "Ljava/lang/String;", "<init>", "()V", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.mrousavy.camera.CameraViewManager$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5282a {
        private C5282a() {
        }

        public /* synthetic */ C5282a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final void m25538b(C5313j c5313j, String str) {
            if (m25537c().get(c5313j) == null) {
                m25537c().put(c5313j, new ArrayList<>());
            }
            ArrayList<String> arrayList = m25537c().get(c5313j);
            C9612q.m13920e(arrayList);
            arrayList.add(str);
        }

        /* renamed from: c */
        public final HashMap<C5313j, ArrayList<String>> m25537c() {
            return CameraViewManager.cameraViewTransactions;
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.builder().put("cameraViewReady", MapBuilder.m30470of("registrationName", "onViewReady")).put("cameraInitialized", MapBuilder.m30470of("registrationName", "onInitialized")).put("cameraError", MapBuilder.m30470of("registrationName", "onError")).build();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CameraView";
    }

    @ReactProp(name = MediaStreamTrack.AUDIO_TRACK_KIND)
    public final void setAudio(C5313j view, Boolean bool) {
        C9612q.m13917h(view, "view");
        if (!C9612q.m13922c(view.getAudio(), bool)) {
            Companion.m25538b(view, MediaStreamTrack.AUDIO_TRACK_KIND);
        }
        view.setAudio(bool);
    }

    @ReactProp(name = "cameraId")
    public final void setCameraId(C5313j view, String cameraId) {
        C9612q.m13917h(view, "view");
        C9612q.m13917h(cameraId, "cameraId");
        if (!C9612q.m13922c(view.getCameraId(), cameraId)) {
            Companion.m25538b(view, "cameraId");
        }
        view.setCameraId(cameraId);
    }

    @ReactProp(name = "enableDepthData")
    public final void setEnableDepthData(C5313j view, boolean z) {
        C9612q.m13917h(view, "view");
        if (view.getEnableDepthData() != z) {
            Companion.m25538b(view, "enableDepthData");
        }
        view.setEnableDepthData(z);
    }

    @ReactProp(name = "enableFrameProcessor")
    public final void setEnableFrameProcessor(C5313j view, boolean z) {
        C9612q.m13917h(view, "view");
        if (view.getEnableFrameProcessor() != z) {
            Companion.m25538b(view, "enableFrameProcessor");
        }
        view.setEnableFrameProcessor(z);
    }

    @ReactProp(name = "enableHighQualityPhotos")
    public final void setEnableHighQualityPhotos(C5313j view, Boolean bool) {
        C9612q.m13917h(view, "view");
        if (!C9612q.m13922c(view.getEnableHighQualityPhotos(), bool)) {
            Companion.m25538b(view, "enableHighQualityPhotos");
        }
        view.setEnableHighQualityPhotos(bool);
    }

    @ReactProp(name = "enablePortraitEffectsMatteDelivery")
    public final void setEnablePortraitEffectsMatteDelivery(C5313j view, boolean z) {
        C9612q.m13917h(view, "view");
        if (view.getEnablePortraitEffectsMatteDelivery() != z) {
            Companion.m25538b(view, "enablePortraitEffectsMatteDelivery");
        }
        view.setEnablePortraitEffectsMatteDelivery(z);
    }

    @ReactProp(name = "enableZoomGesture")
    public final void setEnableZoomGesture(C5313j view, boolean z) {
        C9612q.m13917h(view, "view");
        if (view.getEnableZoomGesture() != z) {
            Companion.m25538b(view, "enableZoomGesture");
        }
        view.setEnableZoomGesture(z);
    }

    @ReactProp(name = "format")
    public final void setFormat(C5313j view, ReadableMap readableMap) {
        C9612q.m13917h(view, "view");
        if (!C9612q.m13922c(view.getFormat(), readableMap)) {
            Companion.m25538b(view, "format");
        }
        view.setFormat(readableMap);
    }

    @ReactProp(defaultInt = -1, name = "fps")
    public final void setFps(C5313j view, int i) {
        Integer num;
        C9612q.m13917h(view, "view");
        Integer fps = view.getFps();
        if (fps == null || fps.intValue() != i) {
            Companion.m25538b(view, "fps");
        }
        if (i > 0) {
            num = Integer.valueOf(i);
        } else {
            num = null;
        }
        view.setFps(num);
    }

    @ReactProp(name = "hdr")
    public final void setHdr(C5313j view, Boolean bool) {
        C9612q.m13917h(view, "view");
        if (!C9612q.m13922c(view.getHdr(), bool)) {
            Companion.m25538b(view, "hdr");
        }
        view.setHdr(bool);
    }

    @ReactProp(name = "isActive")
    public final void setIsActive(C5313j view, boolean z) {
        C9612q.m13917h(view, "view");
        if (view.m25504f() != z) {
            Companion.m25538b(view, "isActive");
        }
        view.setActive(z);
    }

    @ReactProp(name = "lowLightBoost")
    public final void setLowLightBoost(C5313j view, Boolean bool) {
        C9612q.m13917h(view, "view");
        if (!C9612q.m13922c(view.getLowLightBoost(), bool)) {
            Companion.m25538b(view, "lowLightBoost");
        }
        view.setLowLightBoost(bool);
    }

    @ReactProp(name = "orientation")
    public final void setOrientation(C5313j view, String str) {
        C9612q.m13917h(view, "view");
        EnumC14156e m548b = EnumC14156e.f36425k.m548b(str);
        if (view.getOrientation() != m548b) {
            Companion.m25538b(view, "orientation");
        }
        view.setOrientation(m548b);
    }

    @ReactProp(name = "photo")
    public final void setPhoto(C5313j view, Boolean bool) {
        C9612q.m13917h(view, "view");
        if (!C9612q.m13922c(view.getPhoto(), bool)) {
            Companion.m25538b(view, "photo");
        }
        view.setPhoto(bool);
    }

    @ReactProp(name = "pixelFormat")
    public final void setPixelFormat(C5313j view, String str) {
        C9612q.m13917h(view, "view");
        EnumC14161g m540b = EnumC14161g.f36439k.m540b(str);
        if (view.getPixelFormat() != m540b) {
            Companion.m25538b(view, "pixelFormat");
        }
        if (m540b == null) {
            m540b = EnumC14161g.NATIVE;
        }
        view.setPixelFormat(m540b);
    }

    @ReactProp(name = "torch")
    public final void setTorch(C5313j view, String torch) {
        C9612q.m13917h(view, "view");
        C9612q.m13917h(torch, "torch");
        EnumC14166i m536a = EnumC14166i.f36454k.m536a(torch);
        if (view.getTorch() != m536a) {
            Companion.m25538b(view, "torch");
        }
        view.setTorch(m536a);
    }

    @ReactProp(name = MediaStreamTrack.VIDEO_TRACK_KIND)
    public final void setVideo(C5313j view, Boolean bool) {
        C9612q.m13917h(view, "view");
        if (!C9612q.m13922c(view.getVideo(), bool)) {
            Companion.m25538b(view, MediaStreamTrack.VIDEO_TRACK_KIND);
        }
        view.setVideo(bool);
    }

    @ReactProp(name = "videoStabilizationMode")
    public final void setVideoStabilizationMode(C5313j view, String str) {
        C9612q.m13917h(view, "view");
        EnumC14174l m523c = EnumC14174l.f36471k.m523c(str);
        if (view.getVideoStabilizationMode() != m523c) {
            Companion.m25538b(view, "videoStabilizationMode");
        }
        view.setVideoStabilizationMode(m523c);
    }

    @ReactProp(name = "zoom")
    public final void setZoom(C5313j view, double d) {
        boolean z;
        C9612q.m13917h(view, "view");
        float f = (float) d;
        if (view.getZoom() == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Companion.m25538b(view, "zoom");
        }
        view.setZoom(f);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C5313j createViewInstance(ThemedReactContext context) {
        C9612q.m13917h(context, "context");
        return new C5313j(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(C5313j view) {
        C9612q.m13917h(view, "view");
        super.onAfterUpdateTransaction((CameraViewManager) view);
        HashMap<C5313j, ArrayList<String>> hashMap = cameraViewTransactions;
        ArrayList<String> arrayList = hashMap.get(view);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        view.m25502h(arrayList);
        hashMap.remove(view);
    }
}
