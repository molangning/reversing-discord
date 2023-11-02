package com.mrousavy.camera;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import android.util.Size;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.C0946a;
import com.facebook.react.bridge.ReadableMap;
import com.mrousavy.camera.frameprocessor.FrameProcessor;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9545j;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C9677b1;
import kotlinx.coroutines.C9818l;
import kotlinx.coroutines.C9824m0;
import kotlinx.coroutines.CoroutineScope;
import org.webrtc.MediaStreamTrack;
import p388vf.C13277d;
import p405wd.C13495g;
import p405wd.C13519i;
import p425xd.C13781b;
import p446yd.C14007r;
import p465zd.EnumC14156e;
import p465zd.EnumC14161g;
import p465zd.EnumC14166i;
import p465zd.EnumC14174l;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ©\u00012\u00020\u0001:\u0002ª\u0001B\u0013\u0012\b\u0010¦\u0001\u001a\u00030¥\u0001¢\u0006\u0006\b§\u0001\u0010¨\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0003J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\r\u001a\u00020\u0002H\u0014J\b\u0010\u000e\u001a\u00020\u0002H\u0014J\u001e\u0010\u0013\u001a\u00020\u00022\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011R$\u0010\u0019\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010&\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010*\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001b\u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010\u001fR$\u0010.\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010!\u001a\u0004\b,\u0010#\"\u0004\b-\u0010%R$\u00102\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010!\u001a\u0004\b0\u0010#\"\u0004\b1\u0010%R$\u00106\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010!\u001a\u0004\b4\u0010#\"\u0004\b5\u0010%R\"\u0010:\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010\u001b\u001a\u0004\b8\u0010\u001d\"\u0004\b9\u0010\u001fR\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010J\u001a\u0004\u0018\u00010C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010R\u001a\u0004\u0018\u00010K8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010Z\u001a\u0004\u0018\u00010S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR$\u0010^\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010!\u001a\u0004\b\\\u0010#\"\u0004\b]\u0010%R$\u0010b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010!\u001a\u0004\b`\u0010#\"\u0004\ba\u0010%R\"\u0010f\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010\u001b\u001a\u0004\bd\u0010\u001d\"\u0004\be\u0010\u001fR\"\u0010n\u001a\u00020g8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\"\u0010v\u001a\u00020o8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR$\u0010~\u001a\u0004\u0018\u00010w8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R%\u0010\u0082\u0001\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u007f\u0010\u001b\u001a\u0005\b\u0080\u0001\u0010\u001d\"\u0005\b\u0081\u0001\u0010\u001fR\u0018\u0010\u0084\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010\u001bR \u0010\u008a\u0001\u001a\u00030\u0085\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R \u0010\u0090\u0001\u001a\u00030\u008b\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001b\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bq\u0010\u0092\u0001R\u001c\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0094\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R8\u0010 \u0001\u001a\u0005\u0018\u00010\u0098\u00012\n\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0000@@X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0016\u0010¢\u0001\u001a\u00020w8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¡\u0001\u0010{R\u0016\u0010¤\u0001\u001a\u00020w8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b£\u0001\u0010{¨\u0006«\u0001"}, m14357d2 = {"Lcom/mrousavy/camera/j;", "Landroid/widget/FrameLayout;", "", "g", "e", "d", "i", "k", "j", "l", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "onAttachedToWindow", "onDetachedFromWindow", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "changedProps", "h", "Ljava/lang/String;", "getCameraId", "()Ljava/lang/String;", "setCameraId", "(Ljava/lang/String;)V", "cameraId", "", "Z", "getEnableDepthData", "()Z", "setEnableDepthData", "(Z)V", "enableDepthData", "Ljava/lang/Boolean;", "getEnableHighQualityPhotos", "()Ljava/lang/Boolean;", "setEnableHighQualityPhotos", "(Ljava/lang/Boolean;)V", "enableHighQualityPhotos", "m", "getEnablePortraitEffectsMatteDelivery", "setEnablePortraitEffectsMatteDelivery", "enablePortraitEffectsMatteDelivery", "n", "getPhoto", "setPhoto", "photo", "o", "getVideo", "setVideo", MediaStreamTrack.VIDEO_TRACK_KIND, "p", "getAudio", "setAudio", MediaStreamTrack.AUDIO_TRACK_KIND, "q", "getEnableFrameProcessor", "setEnableFrameProcessor", "enableFrameProcessor", "Lzd/g;", "r", "Lzd/g;", "getPixelFormat", "()Lzd/g;", "setPixelFormat", "(Lzd/g;)V", "pixelFormat", "Lcom/facebook/react/bridge/ReadableMap;", "s", "Lcom/facebook/react/bridge/ReadableMap;", "getFormat", "()Lcom/facebook/react/bridge/ReadableMap;", "setFormat", "(Lcom/facebook/react/bridge/ReadableMap;)V", "format", "", "t", "Ljava/lang/Integer;", "getFps", "()Ljava/lang/Integer;", "setFps", "(Ljava/lang/Integer;)V", "fps", "Lzd/l;", "u", "Lzd/l;", "getVideoStabilizationMode", "()Lzd/l;", "setVideoStabilizationMode", "(Lzd/l;)V", "videoStabilizationMode", "v", "getHdr", "setHdr", "hdr", "w", "getLowLightBoost", "setLowLightBoost", "lowLightBoost", "x", "f", "setActive", "isActive", "Lzd/i;", "y", "Lzd/i;", "getTorch", "()Lzd/i;", "setTorch", "(Lzd/i;)V", "torch", "", "z", "F", "getZoom", "()F", "setZoom", "(F)V", "zoom", "Lzd/e;", "A", "Lzd/e;", "getOrientation", "()Lzd/e;", "setOrientation", "(Lzd/e;)V", "orientation", "B", "getEnableZoomGesture", "setEnableZoomGesture", "enableZoomGesture", "C", "isMounted", "Landroid/hardware/camera2/CameraManager;", "D", "Landroid/hardware/camera2/CameraManager;", "getCameraManager$react_native_vision_camera_release", "()Landroid/hardware/camera2/CameraManager;", "cameraManager", "Lwd/g;", "E", "Lwd/g;", "getCameraSession$react_native_vision_camera_release", "()Lwd/g;", "cameraSession", "Landroid/view/View;", "Landroid/view/View;", "previewView", "Landroid/view/Surface;", "G", "Landroid/view/Surface;", "previewSurface", "Lcom/mrousavy/camera/frameprocessor/FrameProcessor;", "value", "H", "Lcom/mrousavy/camera/frameprocessor/FrameProcessor;", "getFrameProcessor$react_native_vision_camera_release", "()Lcom/mrousavy/camera/frameprocessor/FrameProcessor;", "setFrameProcessor$react_native_vision_camera_release", "(Lcom/mrousavy/camera/frameprocessor/FrameProcessor;)V", "frameProcessor", "getInputOrientation", "inputOrientation", "getOutputOrientation$react_native_vision_camera_release", "outputOrientation", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "I", "c", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
@SuppressLint({"ClickableViewAccessibility", "ViewConstructor", "MissingPermission"})
/* renamed from: com.mrousavy.camera.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5313j extends FrameLayout {

    /* renamed from: I */
    public static final C5316c f15094I = new C5316c(null);

    /* renamed from: J */
    private static final ArrayList<String> f15095J;

    /* renamed from: K */
    private static final ArrayList<String> f15096K;

    /* renamed from: L */
    private static final ArrayList<String> f15097L;

    /* renamed from: A */
    private EnumC14156e f15098A;

    /* renamed from: B */
    private boolean f15099B;

    /* renamed from: C */
    private boolean f15100C;

    /* renamed from: D */
    private final CameraManager f15101D;

    /* renamed from: E */
    private final C13495g f15102E;

    /* renamed from: F */
    private View f15103F;

    /* renamed from: G */
    private Surface f15104G;

    /* renamed from: H */
    private FrameProcessor f15105H;

    /* renamed from: j */
    private String f15106j;

    /* renamed from: k */
    private boolean f15107k;

    /* renamed from: l */
    private Boolean f15108l;

    /* renamed from: m */
    private boolean f15109m;

    /* renamed from: n */
    private Boolean f15110n;

    /* renamed from: o */
    private Boolean f15111o;

    /* renamed from: p */
    private Boolean f15112p;

    /* renamed from: q */
    private boolean f15113q;

    /* renamed from: r */
    private EnumC14161g f15114r;

    /* renamed from: s */
    private ReadableMap f15115s;

    /* renamed from: t */
    private Integer f15116t;

    /* renamed from: u */
    private EnumC14174l f15117u;

    /* renamed from: v */
    private Boolean f15118v;

    /* renamed from: w */
    private Boolean f15119w;

    /* renamed from: x */
    private boolean f15120x;

    /* renamed from: y */
    private EnumC14166i f15121y;

    /* renamed from: z */
    private float f15122z;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m14357d2 = {"<anonymous>", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: com.mrousavy.camera.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5314a extends AbstractC9614s implements Function0<Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5314a() {
            super(0);
            C5313j.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f25302a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            C5322m.m25493c(C5313j.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "error", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: com.mrousavy.camera.j$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5315b extends AbstractC9614s implements Function1<Throwable, Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5315b() {
            super(1);
            C5313j.this = r1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f25302a;
        }

        /* renamed from: invoke */
        public final void invoke2(Throwable error) {
            C9612q.m13917h(error, "error");
            C5322m.m25494b(C5313j.this, error);
        }
    }

    @Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R$\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0005j\b\u0012\u0004\u0012\u00020\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0005j\b\u0012\u0004\u0012\u00020\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR$\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0005j\b\u0012\u0004\u0012\u00020\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\r"}, m14357d2 = {"Lcom/mrousavy/camera/j$c;", "", "", "TAG", "Ljava/lang/String;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "propsThatRequireFormatReconfiguration", "Ljava/util/ArrayList;", "propsThatRequirePreviewReconfiguration", "propsThatRequireSessionReconfiguration", "<init>", "()V", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.mrousavy.camera.j$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5316c {
        private C5316c() {
        }

        public /* synthetic */ C5316c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"Landroid/view/Surface;", "surface", "", "a", "(Landroid/view/Surface;)V"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: com.mrousavy.camera.j$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5317d extends AbstractC9614s implements Function1<Surface, Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5317d() {
            super(1);
            C5313j.this = r1;
        }

        /* renamed from: a */
        public final void m25496a(Surface surface) {
            C5313j.this.f15104G = surface;
            C5313j.this.m25505e();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Surface surface) {
            m25496a(surface);
            return Unit.f25302a;
        }
    }

    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    @InterfaceC9571e(m13987c = "com.mrousavy.camera.CameraView$updateTorch$1", m13986f = "CameraView.kt", m13985l = {226}, m13984m = "invokeSuspend")
    /* renamed from: com.mrousavy.camera.j$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5318e extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        int f15126j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5318e(Continuation<? super C5318e> continuation) {
            super(2, continuation);
            C5313j.this = r1;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C5318e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C5318e) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            Object m2869d;
            boolean z;
            m2869d = C13277d.m2869d();
            int i = this.f15126j;
            if (i != 0) {
                if (i == 1) {
                    C11586t.m7586b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C11586t.m7586b(obj);
                C13495g cameraSession$react_native_vision_camera_release = C5313j.this.getCameraSession$react_native_vision_camera_release();
                if (C5313j.this.getTorch() == EnumC14166i.ON) {
                    z = true;
                } else {
                    z = false;
                }
                this.f15126j = 1;
                if (cameraSession$react_native_vision_camera_release.m2349D0(z, this) == m2869d) {
                    return m2869d;
                }
            }
            return Unit.f25302a;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m14357d2 = {"com/mrousavy/camera/j$f", "Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;", "Landroid/view/ScaleGestureDetector;", "detector", "", "onScale", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.mrousavy.camera.j$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5319f extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        C5319f() {
            C5313j.this = r1;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector detector) {
            C9612q.m13917h(detector, "detector");
            C5313j c5313j = C5313j.this;
            c5313j.setZoom(c5313j.getZoom() * detector.getScaleFactor());
            C5313j.this.getCameraSession$react_native_vision_camera_release().m2348E0(C5313j.this.getZoom());
            return true;
        }
    }

    static {
        ArrayList<String> m14108e;
        ArrayList<String> m14108e2;
        ArrayList<String> m14108e3;
        m14108e = C9545j.m14108e("cameraId");
        f15095J = m14108e;
        m14108e2 = C9545j.m14108e("cameraId", "format", "photo", MediaStreamTrack.VIDEO_TRACK_KIND, "enableFrameProcessor", "pixelFormat");
        f15096K = m14108e2;
        m14108e3 = C9545j.m14108e("fps", "hdr", "videoStabilizationMode", "lowLightBoost");
        f15097L = m14108e3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5313j(Context context) {
        super(context);
        C9612q.m13917h(context, "context");
        this.f15114r = EnumC14161g.NATIVE;
        this.f15121y = EnumC14166i.OFF;
        this.f15122z = 1.0f;
        Object systemService = context.getSystemService("camera");
        C9612q.m13919f(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        CameraManager cameraManager = (CameraManager) systemService;
        this.f15101D = cameraManager;
        C14007r.m929a(this);
        m25503g();
        this.f15102E = new C13495g(context, cameraManager, new C5314a(), new C5315b());
    }

    /* renamed from: d */
    private final void m25506d() {
        this.f15102E.m2343I(this.f15116t, this.f15117u, this.f15118v, this.f15119w);
    }

    /* renamed from: e */
    public final void m25505e() {
        Size size;
        Size size2;
        C13781b.C13784c c13784c;
        try {
            Log.i("CameraView", "Configuring Camera Device...");
            if (C0946a.m38403a(getContext(), "android.permission.CAMERA") == 0) {
                String str = this.f15106j;
                if (str != null) {
                    ReadableMap readableMap = this.f15115s;
                    C13781b.C13786e c13786e = null;
                    if (readableMap != null) {
                        size = new Size(readableMap.getInt("videoWidth"), readableMap.getInt("videoHeight"));
                    } else {
                        size = null;
                    }
                    if (readableMap != null) {
                        size2 = new Size(readableMap.getInt("photoWidth"), readableMap.getInt("photoHeight"));
                    } else {
                        size2 = null;
                    }
                    Surface surface = this.f15104G;
                    if (surface == null) {
                        return;
                    }
                    C13781b.C13785d c13785d = new C13781b.C13785d(surface);
                    Boolean bool = this.f15110n;
                    Boolean bool2 = Boolean.TRUE;
                    if (C9612q.m13922c(bool, bool2)) {
                        c13784c = new C13781b.C13784c(size2, 0, 2, null);
                    } else {
                        c13784c = null;
                    }
                    if (C9612q.m13922c(this.f15111o, bool2) || this.f15113q) {
                        c13786e = new C13781b.C13786e(size, C9612q.m13922c(this.f15111o, bool2), Boolean.valueOf(this.f15113q), this.f15114r.m542c());
                    }
                    this.f15102E.m2338Q(str, c13785d, c13784c, c13786e);
                    return;
                }
                throw new C5337u();
            }
            throw new C5302f();
        } catch (Throwable th2) {
            Log.e("CameraView", "Failed to configure session: " + th2.getMessage(), th2);
            C5322m.m25494b(this, th2);
        }
    }

    /* renamed from: g */
    private final void m25503g() {
        removeView(this.f15103F);
        this.f15104G = null;
        String str = this.f15106j;
        if (str == null) {
            return;
        }
        Context context = getContext();
        C9612q.m13918g(context, "context");
        C13519i c13519i = new C13519i(context, this.f15101D, str, new C5317d());
        c13519i.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(c13519i);
        this.f15103F = c13519i;
    }

    private final EnumC14156e getInputOrientation() {
        return this.f15102E.m2332b0();
    }

    /* renamed from: i */
    private final void m25501i() {
        this.f15102E.m2352B0(this.f15120x && isAttachedToWindow());
    }

    /* renamed from: j */
    private final void m25500j() {
        C9818l.m13179d(C9824m0.m13174a(C9677b1.m13570a()), null, null, new C5318e(null), 3, null);
    }

    /* renamed from: k */
    private final void m25499k() {
        this.f15102E.m2348E0(this.f15122z);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: l */
    private final void m25498l() {
        if (this.f15099B) {
            final ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(getContext(), new C5319f());
            setOnTouchListener(new View.OnTouchListener() { // from class: com.mrousavy.camera.i
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean m25497m;
                    m25497m = C5313j.m25497m(scaleGestureDetector, view, motionEvent);
                    return m25497m;
                }
            });
            return;
        }
        setOnTouchListener(null);
    }

    /* renamed from: m */
    public static final boolean m25497m(ScaleGestureDetector scaleGestureDetector, View view, MotionEvent motionEvent) {
        C9612q.m13917h(scaleGestureDetector, "$scaleGestureDetector");
        return scaleGestureDetector.onTouchEvent(motionEvent);
    }

    /* renamed from: f */
    public final boolean m25504f() {
        return this.f15120x;
    }

    public final Boolean getAudio() {
        return this.f15112p;
    }

    public final String getCameraId() {
        return this.f15106j;
    }

    public final CameraManager getCameraManager$react_native_vision_camera_release() {
        return this.f15101D;
    }

    public final C13495g getCameraSession$react_native_vision_camera_release() {
        return this.f15102E;
    }

    public final boolean getEnableDepthData() {
        return this.f15107k;
    }

    public final boolean getEnableFrameProcessor() {
        return this.f15113q;
    }

    public final Boolean getEnableHighQualityPhotos() {
        return this.f15108l;
    }

    public final boolean getEnablePortraitEffectsMatteDelivery() {
        return this.f15109m;
    }

    public final boolean getEnableZoomGesture() {
        return this.f15099B;
    }

    public final ReadableMap getFormat() {
        return this.f15115s;
    }

    public final Integer getFps() {
        return this.f15116t;
    }

    public final FrameProcessor getFrameProcessor$react_native_vision_camera_release() {
        return this.f15105H;
    }

    public final Boolean getHdr() {
        return this.f15118v;
    }

    public final Boolean getLowLightBoost() {
        return this.f15119w;
    }

    public final EnumC14156e getOrientation() {
        return this.f15098A;
    }

    public final EnumC14156e getOutputOrientation$react_native_vision_camera_release() {
        EnumC14156e enumC14156e = this.f15098A;
        return enumC14156e == null ? getInputOrientation() : enumC14156e;
    }

    public final Boolean getPhoto() {
        return this.f15110n;
    }

    public final EnumC14161g getPixelFormat() {
        return this.f15114r;
    }

    public final EnumC14166i getTorch() {
        return this.f15121y;
    }

    public final Boolean getVideo() {
        return this.f15111o;
    }

    public final EnumC14174l getVideoStabilizationMode() {
        return this.f15117u;
    }

    public final float getZoom() {
        return this.f15122z;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x008a A[Catch: all -> 0x0098, TryCatch #0 {all -> 0x0098, blocks: (B:60:0x001b, B:62:0x0025, B:68:0x0033, B:74:0x0041, B:80:0x004f, B:86:0x005d, B:88:0x0065, B:91:0x006e, B:93:0x0076, B:95:0x007b, B:97:0x0080, B:99:0x0085, B:101:0x008a, B:103:0x008f, B:105:0x0094), top: B:110:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x008f A[Catch: all -> 0x0098, TryCatch #0 {all -> 0x0098, blocks: (B:60:0x001b, B:62:0x0025, B:68:0x0033, B:74:0x0041, B:80:0x004f, B:86:0x005d, B:88:0x0065, B:91:0x006e, B:93:0x0076, B:95:0x007b, B:97:0x0080, B:99:0x0085, B:101:0x008a, B:103:0x008f, B:105:0x0094), top: B:110:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0094 A[Catch: all -> 0x0098, TRY_LEAVE, TryCatch #0 {all -> 0x0098, blocks: (B:60:0x001b, B:62:0x0025, B:68:0x0033, B:74:0x0041, B:80:0x004f, B:86:0x005d, B:88:0x0065, B:91:0x006e, B:93:0x0076, B:95:0x007b, B:97:0x0080, B:99:0x0085, B:101:0x008a, B:103:0x008f, B:105:0x0094), top: B:110:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0041 A[Catch: all -> 0x0098, TryCatch #0 {all -> 0x0098, blocks: (B:60:0x001b, B:62:0x0025, B:68:0x0033, B:74:0x0041, B:80:0x004f, B:86:0x005d, B:88:0x0065, B:91:0x006e, B:93:0x0076, B:95:0x007b, B:97:0x0080, B:99:0x0085, B:101:0x008a, B:103:0x008f, B:105:0x0094), top: B:110:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x004f A[Catch: all -> 0x0098, TryCatch #0 {all -> 0x0098, blocks: (B:60:0x001b, B:62:0x0025, B:68:0x0033, B:74:0x0041, B:80:0x004f, B:86:0x005d, B:88:0x0065, B:91:0x006e, B:93:0x0076, B:95:0x007b, B:97:0x0080, B:99:0x0085, B:101:0x008a, B:103:0x008f, B:105:0x0094), top: B:110:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x005d A[Catch: all -> 0x0098, TryCatch #0 {all -> 0x0098, blocks: (B:60:0x001b, B:62:0x0025, B:68:0x0033, B:74:0x0041, B:80:0x004f, B:86:0x005d, B:88:0x0065, B:91:0x006e, B:93:0x0076, B:95:0x007b, B:97:0x0080, B:99:0x0085, B:101:0x008a, B:103:0x008f, B:105:0x0094), top: B:110:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0065 A[Catch: all -> 0x0098, TryCatch #0 {all -> 0x0098, blocks: (B:60:0x001b, B:62:0x0025, B:68:0x0033, B:74:0x0041, B:80:0x004f, B:86:0x005d, B:88:0x0065, B:91:0x006e, B:93:0x0076, B:95:0x007b, B:97:0x0080, B:99:0x0085, B:101:0x008a, B:103:0x008f, B:105:0x0094), top: B:110:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0076 A[Catch: all -> 0x0098, TryCatch #0 {all -> 0x0098, blocks: (B:60:0x001b, B:62:0x0025, B:68:0x0033, B:74:0x0041, B:80:0x004f, B:86:0x005d, B:88:0x0065, B:91:0x006e, B:93:0x0076, B:95:0x007b, B:97:0x0080, B:99:0x0085, B:101:0x008a, B:103:0x008f, B:105:0x0094), top: B:110:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x007b A[Catch: all -> 0x0098, TryCatch #0 {all -> 0x0098, blocks: (B:60:0x001b, B:62:0x0025, B:68:0x0033, B:74:0x0041, B:80:0x004f, B:86:0x005d, B:88:0x0065, B:91:0x006e, B:93:0x0076, B:95:0x007b, B:97:0x0080, B:99:0x0085, B:101:0x008a, B:103:0x008f, B:105:0x0094), top: B:110:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0080 A[Catch: all -> 0x0098, TryCatch #0 {all -> 0x0098, blocks: (B:60:0x001b, B:62:0x0025, B:68:0x0033, B:74:0x0041, B:80:0x004f, B:86:0x005d, B:88:0x0065, B:91:0x006e, B:93:0x0076, B:95:0x007b, B:97:0x0080, B:99:0x0085, B:101:0x008a, B:103:0x008f, B:105:0x0094), top: B:110:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0085 A[Catch: all -> 0x0098, TryCatch #0 {all -> 0x0098, blocks: (B:60:0x001b, B:62:0x0025, B:68:0x0033, B:74:0x0041, B:80:0x004f, B:86:0x005d, B:88:0x0065, B:91:0x006e, B:93:0x0076, B:95:0x007b, B:97:0x0080, B:99:0x0085, B:101:0x008a, B:103:0x008f, B:105:0x0094), top: B:110:0x001b }] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m25502h(java.util.ArrayList<java.lang.String> r10) {
        /*
            r9 = this;
            java.lang.String r0 = "changedProps"
            kotlin.jvm.internal.C9612q.m13917h(r10, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Props changed: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "CameraView"
            android.util.Log.i(r1, r0)
            java.util.ArrayList<java.lang.String> r0 = com.mrousavy.camera.C5313j.f15095J     // Catch: java.lang.Throwable -> L98
            boolean r0 = p446yd.C14002n.m937a(r10, r0)     // Catch: java.lang.Throwable -> L98
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L30
            java.util.ArrayList<java.lang.String> r4 = com.mrousavy.camera.C5313j.f15096K     // Catch: java.lang.Throwable -> L98
            boolean r4 = p446yd.C14002n.m937a(r10, r4)     // Catch: java.lang.Throwable -> L98
            if (r4 == 0) goto L2e
            goto L30
        L2e:
            r4 = r2
            goto L31
        L30:
            r4 = r3
        L31:
            if (r4 != 0) goto L3e
            java.util.ArrayList<java.lang.String> r5 = com.mrousavy.camera.C5313j.f15097L     // Catch: java.lang.Throwable -> L98
            boolean r5 = p446yd.C14002n.m937a(r10, r5)     // Catch: java.lang.Throwable -> L98
            if (r5 == 0) goto L3c
            goto L3e
        L3c:
            r5 = r2
            goto L3f
        L3e:
            r5 = r3
        L3f:
            if (r4 != 0) goto L4c
            java.lang.String r6 = "zoom"
            boolean r6 = r10.contains(r6)     // Catch: java.lang.Throwable -> L98
            if (r6 == 0) goto L4a
            goto L4c
        L4a:
            r6 = r2
            goto L4d
        L4c:
            r6 = r3
        L4d:
            if (r4 != 0) goto L5a
            java.lang.String r7 = "torch"
            boolean r7 = r10.contains(r7)     // Catch: java.lang.Throwable -> L98
            if (r7 == 0) goto L58
            goto L5a
        L58:
            r7 = r2
            goto L5b
        L5a:
            r7 = r3
        L5b:
            if (r4 != 0) goto L63
            java.lang.String r8 = "orientation"
            boolean r8 = r10.contains(r8)     // Catch: java.lang.Throwable -> L98
        L63:
            if (r5 != 0) goto L6d
            java.lang.String r8 = "isActive"
            boolean r8 = r10.contains(r8)     // Catch: java.lang.Throwable -> L98
            if (r8 == 0) goto L6e
        L6d:
            r2 = r3
        L6e:
            java.lang.String r3 = "enableZoomGesture"
            boolean r10 = r10.contains(r3)     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L79
            r9.m25503g()     // Catch: java.lang.Throwable -> L98
        L79:
            if (r4 == 0) goto L7e
            r9.m25505e()     // Catch: java.lang.Throwable -> L98
        L7e:
            if (r5 == 0) goto L83
            r9.m25506d()     // Catch: java.lang.Throwable -> L98
        L83:
            if (r2 == 0) goto L88
            r9.m25501i()     // Catch: java.lang.Throwable -> L98
        L88:
            if (r6 == 0) goto L8d
            r9.m25499k()     // Catch: java.lang.Throwable -> L98
        L8d:
            if (r7 == 0) goto L92
            r9.m25500j()     // Catch: java.lang.Throwable -> L98
        L92:
            if (r10 == 0) goto Lb4
            r9.m25498l()     // Catch: java.lang.Throwable -> L98
            goto Lb4
        L98:
            r10 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "update() threw: "
            r0.append(r2)
            java.lang.String r2 = r10.getMessage()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r1, r0)
            com.mrousavy.camera.C5322m.m25494b(r9, r10)
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.C5313j.m25502h(java.util.ArrayList):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f15100C) {
            this.f15100C = true;
            C5322m.m25492d(this);
        }
        m25501i();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m25501i();
    }

    public final void setActive(boolean z) {
        this.f15120x = z;
    }

    public final void setAudio(Boolean bool) {
        this.f15112p = bool;
    }

    public final void setCameraId(String str) {
        this.f15106j = str;
    }

    public final void setEnableDepthData(boolean z) {
        this.f15107k = z;
    }

    public final void setEnableFrameProcessor(boolean z) {
        this.f15113q = z;
    }

    public final void setEnableHighQualityPhotos(Boolean bool) {
        this.f15108l = bool;
    }

    public final void setEnablePortraitEffectsMatteDelivery(boolean z) {
        this.f15109m = z;
    }

    public final void setEnableZoomGesture(boolean z) {
        this.f15099B = z;
    }

    public final void setFormat(ReadableMap readableMap) {
        this.f15115s = readableMap;
    }

    public final void setFps(Integer num) {
        this.f15116t = num;
    }

    public final void setFrameProcessor$react_native_vision_camera_release(FrameProcessor frameProcessor) {
        this.f15105H = frameProcessor;
        this.f15102E.m2353A0(frameProcessor);
    }

    public final void setHdr(Boolean bool) {
        this.f15118v = bool;
    }

    public final void setLowLightBoost(Boolean bool) {
        this.f15119w = bool;
    }

    public final void setOrientation(EnumC14156e enumC14156e) {
        this.f15098A = enumC14156e;
    }

    public final void setPhoto(Boolean bool) {
        this.f15110n = bool;
    }

    public final void setPixelFormat(EnumC14161g enumC14161g) {
        C9612q.m13917h(enumC14161g, "<set-?>");
        this.f15114r = enumC14161g;
    }

    public final void setTorch(EnumC14166i enumC14166i) {
        C9612q.m13917h(enumC14166i, "<set-?>");
        this.f15121y = enumC14166i;
    }

    public final void setVideo(Boolean bool) {
        this.f15111o = bool;
    }

    public final void setVideoStabilizationMode(EnumC14174l enumC14174l) {
        this.f15117u = enumC14174l;
    }

    public final void setZoom(float f) {
        this.f15122z = f;
    }
}