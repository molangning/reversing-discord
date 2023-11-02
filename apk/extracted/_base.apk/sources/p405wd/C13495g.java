package p405wd;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.mrousavy.camera.C5299d;
import com.mrousavy.camera.C5308g;
import com.mrousavy.camera.core.VideoPipeline;
import com.mrousavy.camera.frameprocessor.FrameProcessor;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.AbstractC9570d;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.text.C9653o;
import kotlinx.coroutines.C9818l;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.C9893d;
import kotlinx.coroutines.sync.InterfaceC9885b;
import org.webrtc.MediaStreamTrack;
import p388vf.C13277d;
import p425xd.C13781b;
import p425xd.C13788d;
import p425xd.C13792e;
import p446yd.C13999l;
import p465zd.EnumC14156e;
import p465zd.EnumC14174l;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 ¨\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003D©\u0001B;\u0012\u0006\u0010b\u001a\u00020_\u0012\u0006\u0010f\u001a\u00020c\u0012\f\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016\u0012\u0012\u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0006\b¦\u0001\u0010§\u0001J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u001b\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\rH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019JK\u0010#\u001a\u00020\"2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b#\u0010$J\b\u0010%\u001a\u00020\u0005H\u0002J\u0013\u0010&\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u0013\u0010(\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b(\u0010'J\u0013\u0010)\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b)\u0010'J\b\u0010*\u001a\u00020\u0005H\u0016J2\u00101\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/J=\u00102\u001a\u00020\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b2\u00103J\u000e\u00105\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u001eJC\u0010@\u001a\u00020?2\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020=H\u0086@ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\u0010\u0010D\u001a\u00020\u00052\u0006\u0010C\u001a\u00020BH\u0016JS\u0010N\u001a\u00020\u00052\u0006\u0010E\u001a\u00020\u001e2\u0006\u0010G\u001a\u00020F2\u0006\u0010I\u001a\u00020H2\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\u00050\r2\u0012\u0010M\u001a\u000e\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020\u00050\rH\u0086@ø\u0001\u0000¢\u0006\u0004\bN\u0010OJ\u0013\u0010P\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\bP\u0010'J\u0013\u0010Q\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\bQ\u0010'J\u0013\u0010R\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\bR\u0010'J\u001b\u0010T\u001a\u00020\u00052\u0006\u0010S\u001a\u00020\u001eH\u0086@ø\u0001\u0000¢\u0006\u0004\bT\u0010UJ\u000e\u0010X\u001a\u00020\u00052\u0006\u0010W\u001a\u00020VJ#\u0010[\u001a\u00020\u00052\u0006\u0010Y\u001a\u00020\u001a2\u0006\u0010Z\u001a\u00020\u001aH\u0086@ø\u0001\u0000¢\u0006\u0004\b[\u0010\\J\u0010\u0010]\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010^\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010b\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010f\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00050\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR \u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u00104\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010wR\u0016\u0010W\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0018\u0010}\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001b\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bY\u0010\u0081\u0001R\u0017\u0010\u0085\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bZ\u0010\u0084\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008b\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010qR\u0017\u0010S\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010qR0\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u008d\u00012\n\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008d\u00018\u0002@BX\u0082\u000e¢\u0006\u0010\n\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R8\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0094\u00012\n\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u0094\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R \u0010¡\u0001\u001a\u00030\u009c\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u0019\u0010¢\u0001\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010sR\u0014\u0010¥\u0001\u001a\u00020=8F¢\u0006\b\u001a\u0006\b£\u0001\u0010¤\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006ª\u0001"}, m14357d2 = {"Lwd/g;", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/io/Closeable;", "Lxd/b$a;", "Landroid/hardware/camera2/CameraManager$AvailabilityCallback;", "", "L0", "Landroid/graphics/Point;", "point", "U", "(Landroid/graphics/Point;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cameraId", "Lkotlin/Function1;", "", "onClosed", "Landroid/hardware/camera2/CameraDevice;", "V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cameraDevice", "Lxd/b;", "outputs", "Lkotlin/Function0;", "Landroid/hardware/camera2/CameraCaptureSession;", "Y", "(Landroid/hardware/camera2/CameraDevice;Lxd/b;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "fps", "Lzd/l;", "videoStabilizationMode", "", "lowLightBoost", "hdr", "torch", "Landroid/hardware/camera2/CaptureRequest;", "e0", "(Ljava/lang/Integer;Lzd/l;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Landroid/hardware/camera2/CaptureRequest;", "R", "G0", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "K0", "I0", "close", "Lxd/b$d;", "preview", "Lxd/b$c;", "photo", "Lxd/b$e;", MediaStreamTrack.VIDEO_TRACK_KIND, "Q", "I", "(Ljava/lang/Integer;Lzd/l;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "isActive", "B0", "Lzd/h;", "qualityPrioritization", "Lzd/b;", "flashMode", "enableShutterSound", "enableRedEyeReduction", "enableAutoStabilization", "Lzd/e;", "outputOrientation", "Lwd/g$a;", "J0", "(Lzd/h;Lzd/b;ZZZLzd/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/media/Image;", "image", "a", "enableAudio", "Lzd/j;", "codec", "Lzd/k;", "fileType", "Lwd/n$b;", "callback", "Lcom/mrousavy/camera/y;", "onError", "F0", "(ZLzd/j;Lzd/k;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "H0", "t0", "w0", "enableTorch", "D0", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "zoom", "E0", "x", "y", "S", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCameraAvailable", "onCameraUnavailable", "Landroid/content/Context;", "j", "Landroid/content/Context;", "context", "Landroid/hardware/camera2/CameraManager;", "k", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "l", "Lkotlin/jvm/functions/Function0;", "onInitialized", "m", "Lkotlin/jvm/functions/Function1;", "n", "Ljava/lang/String;", "o", "Lxd/b;", "p", "Z", "q", "Ljava/lang/Integer;", "r", "Lzd/l;", "s", "Ljava/lang/Boolean;", "t", "u", "F", "v", "Landroid/hardware/camera2/CameraCaptureSession;", "captureSession", "w", "Landroid/hardware/camera2/CameraDevice;", "Landroid/hardware/camera2/CaptureRequest$Builder;", "Landroid/hardware/camera2/CaptureRequest$Builder;", "previewRequest", "Lwd/h;", "Lwd/h;", "photoOutputSynchronizer", "Lkotlinx/coroutines/sync/b;", "z", "Lkotlinx/coroutines/sync/b;", "mutex", "A", "isRunning", "B", "Lwd/n;", "value", "C", "Lwd/n;", "C0", "(Lwd/n;)V", "recording", "Lcom/mrousavy/camera/frameprocessor/FrameProcessor;", "D", "Lcom/mrousavy/camera/frameprocessor/FrameProcessor;", "getFrameProcessor", "()Lcom/mrousavy/camera/frameprocessor/FrameProcessor;", "A0", "(Lcom/mrousavy/camera/frameprocessor/FrameProcessor;)V", "frameProcessor", "Lkotlin/coroutines/CoroutineContext;", "E", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "lastOutputsHashCode", "b0", "()Lzd/e;", "orientation", "<init>", "(Landroid/content/Context;Landroid/hardware/camera2/CameraManager;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "G", "b", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: wd.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13495g extends CameraManager.AvailabilityCallback implements CoroutineScope, Closeable, C13781b.InterfaceC13782a {

    /* renamed from: G */
    public static final C13497b f34757G = new C13497b(null);

    /* renamed from: H */
    private static final boolean f34758H;

    /* renamed from: A */
    private boolean f34759A;

    /* renamed from: B */
    private boolean f34760B;

    /* renamed from: C */
    private C13526n f34761C;

    /* renamed from: D */
    private FrameProcessor f34762D;

    /* renamed from: E */
    private final CoroutineContext f34763E;

    /* renamed from: F */
    private Integer f34764F;

    /* renamed from: j */
    private final Context f34765j;

    /* renamed from: k */
    private final CameraManager f34766k;

    /* renamed from: l */
    private final Function0<Unit> f34767l;

    /* renamed from: m */
    private final Function1<Throwable, Unit> f34768m;

    /* renamed from: n */
    private String f34769n;

    /* renamed from: o */
    private C13781b f34770o;

    /* renamed from: p */
    private boolean f34771p;

    /* renamed from: q */
    private Integer f34772q;

    /* renamed from: r */
    private EnumC14174l f34773r;

    /* renamed from: s */
    private Boolean f34774s;

    /* renamed from: t */
    private Boolean f34775t;

    /* renamed from: u */
    private float f34776u;

    /* renamed from: v */
    private CameraCaptureSession f34777v;

    /* renamed from: w */
    private CameraDevice f34778w;

    /* renamed from: x */
    private CaptureRequest.Builder f34779x;

    /* renamed from: y */
    private final C13517h f34780y;

    /* renamed from: z */
    private final InterfaceC9885b f34781z;

    @Metadata(m14358d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u0018\u0012\u0006\u0010 \u001a\u00020\n\u0012\u0006\u0010%\u001a\u00020\u0006¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\r\u0010\u001bR\u0017\u0010 \u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010%\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006("}, m14357d2 = {"Lwd/g$a;", "Ljava/io/Closeable;", "", "close", "", "toString", "", "hashCode", "", "other", "", "equals", "Landroid/media/Image;", "j", "Landroid/media/Image;", "h", "()Landroid/media/Image;", "image", "Landroid/hardware/camera2/TotalCaptureResult;", "k", "Landroid/hardware/camera2/TotalCaptureResult;", "i", "()Landroid/hardware/camera2/TotalCaptureResult;", "metadata", "Lzd/e;", "l", "Lzd/e;", "()Lzd/e;", "orientation", "m", "Z", "()Z", "isMirrored", "n", "I", "a", "()I", "format", "<init>", "(Landroid/media/Image;Landroid/hardware/camera2/TotalCaptureResult;Lzd/e;ZI)V", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: wd.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13496a implements Closeable {

        /* renamed from: j */
        private final Image f34782j;

        /* renamed from: k */
        private final TotalCaptureResult f34783k;

        /* renamed from: l */
        private final EnumC14156e f34784l;

        /* renamed from: m */
        private final boolean f34785m;

        /* renamed from: n */
        private final int f34786n;

        public C13496a(Image image, TotalCaptureResult metadata, EnumC14156e orientation, boolean z, int i) {
            C9612q.m13917h(image, "image");
            C9612q.m13917h(metadata, "metadata");
            C9612q.m13917h(orientation, "orientation");
            this.f34782j = image;
            this.f34783k = metadata;
            this.f34784l = orientation;
            this.f34785m = z;
            this.f34786n = i;
        }

        /* renamed from: a */
        public final int m2318a() {
            return this.f34786n;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f34782j.close();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C13496a) {
                C13496a c13496a = (C13496a) obj;
                return C9612q.m13922c(this.f34782j, c13496a.f34782j) && C9612q.m13922c(this.f34783k, c13496a.f34783k) && this.f34784l == c13496a.f34784l && this.f34785m == c13496a.f34785m && this.f34786n == c13496a.f34786n;
            }
            return false;
        }

        /* renamed from: h */
        public final Image m2317h() {
            return this.f34782j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((this.f34782j.hashCode() * 31) + this.f34783k.hashCode()) * 31) + this.f34784l.hashCode()) * 31;
            boolean z = this.f34785m;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return ((hashCode + i) * 31) + this.f34786n;
        }

        /* renamed from: i */
        public final TotalCaptureResult m2316i() {
            return this.f34783k;
        }

        /* renamed from: j */
        public final EnumC14156e m2315j() {
            return this.f34784l;
        }

        /* renamed from: m */
        public final boolean m2314m() {
            return this.f34785m;
        }

        public String toString() {
            return "CapturedPhoto(image=" + this.f34782j + ", metadata=" + this.f34783k + ", orientation=" + this.f34784l + ", isMirrored=" + this.f34785m + ", format=" + this.f34786n + ')';
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m14357d2 = {"Lwd/g$b;", "", "", "CAN_SET_FPS", "Z", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: wd.g$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13497b {
        private C13497b() {
        }

        public /* synthetic */ C13497b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    @InterfaceC9571e(m13987c = "com.mrousavy.camera.core.CameraSession$configureFormat$1", m13986f = "CameraSession.kt", m13985l = {185, 186}, m13984m = "invokeSuspend")
    /* renamed from: wd.g$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13498c extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        int f34787j;

        /* renamed from: k */
        final /* synthetic */ Ref$BooleanRef f34788k;

        /* renamed from: l */
        final /* synthetic */ C13495g f34789l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13498c(Ref$BooleanRef ref$BooleanRef, C13495g c13495g, Continuation<? super C13498c> continuation) {
            super(2, continuation);
            this.f34788k = ref$BooleanRef;
            this.f34789l = c13495g;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C13498c(this.f34788k, this.f34789l, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C13498c) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            Object m2869d;
            m2869d = C13277d.m2869d();
            int i = this.f34787j;
            if (i != 0) {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C11586t.m7586b(obj);
            } else {
                C11586t.m7586b(obj);
                if (this.f34788k.f25327j) {
                    C13495g c13495g = this.f34789l;
                    this.f34787j = 1;
                    if (c13495g.m2346G0(this) == m2869d) {
                        return m2869d;
                    }
                } else {
                    C13495g c13495g2 = this.f34789l;
                    this.f34787j = 2;
                    if (c13495g2.m2340K0(this) == m2869d) {
                        return m2869d;
                    }
                }
            }
            return Unit.f25302a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    @InterfaceC9571e(m13987c = "com.mrousavy.camera.core.CameraSession$configureSession$1", m13986f = "CameraSession.kt", m13985l = {157}, m13984m = "invokeSuspend")
    /* renamed from: wd.g$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13499d extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        int f34790j;

        C13499d(Continuation<? super C13499d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C13499d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C13499d) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            Object m2869d;
            m2869d = C13277d.m2869d();
            int i = this.f34790j;
            if (i != 0) {
                if (i == 1) {
                    C11586t.m7586b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C11586t.m7586b(obj);
                C13495g c13495g = C13495g.this;
                this.f34790j = 1;
                if (c13495g.m2346G0(this) == m2869d) {
                    return m2869d;
                }
            }
            return Unit.f25302a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    @InterfaceC9571e(m13987c = "com.mrousavy.camera.core.CameraSession", m13986f = "CameraSession.kt", m13985l = {570, 362}, m13984m = "focus")
    /* renamed from: wd.g$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13500e extends AbstractC9570d {

        /* renamed from: j */
        Object f34792j;

        /* renamed from: k */
        Object f34793k;

        /* renamed from: l */
        Object f34794l;

        /* renamed from: m */
        /* synthetic */ Object f34795m;

        /* renamed from: o */
        int f34797o;

        C13500e(Continuation<? super C13500e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            this.f34795m = obj;
            this.f34797o |= Integer.MIN_VALUE;
            return C13495g.this.m2335U(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    @InterfaceC9571e(m13987c = "com.mrousavy.camera.core.CameraSession", m13986f = "CameraSession.kt", m13985l = {383}, m13984m = "getCameraDevice")
    /* renamed from: wd.g$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13501f extends AbstractC9570d {

        /* renamed from: j */
        Object f34798j;

        /* renamed from: k */
        /* synthetic */ Object f34799k;

        /* renamed from: m */
        int f34801m;

        C13501f(Continuation<? super C13501f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            this.f34799k = obj;
            this.f34801m |= Integer.MIN_VALUE;
            return C13495g.this.m2334V(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m14357d2 = {"Landroid/hardware/camera2/CameraDevice;", "camera", "", "reason", "", "a", "(Landroid/hardware/camera2/CameraDevice;Ljava/lang/Throwable;)V"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: wd.g$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13502g extends AbstractC9614s implements Function2<CameraDevice, Throwable, Unit> {

        /* renamed from: k */
        final /* synthetic */ Function1<Throwable, Unit> f34803k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C13502g(Function1<? super Throwable, Unit> function1) {
            super(2);
            this.f34803k = function1;
        }

        /* renamed from: a */
        public final void m2313a(CameraDevice camera, Throwable reason) {
            C9612q.m13917h(camera, "camera");
            C9612q.m13917h(reason, "reason");
            Log.d("CameraSession", "Camera Closed (" + C13495g.this.f34778w + " == " + camera + ')');
            if (C9612q.m13922c(C13495g.this.f34778w, camera)) {
                this.f34803k.invoke(reason);
                C13495g.this.f34778w = null;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(CameraDevice cameraDevice, Throwable th2) {
            m2313a(cameraDevice, th2);
            return Unit.f25302a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    @InterfaceC9571e(m13987c = "com.mrousavy.camera.core.CameraSession", m13986f = "CameraSession.kt", m13985l = {413}, m13984m = "getCaptureSession")
    /* renamed from: wd.g$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13503h extends AbstractC9570d {

        /* renamed from: j */
        Object f34804j;

        /* renamed from: k */
        Object f34805k;

        /* renamed from: l */
        /* synthetic */ Object f34806l;

        /* renamed from: n */
        int f34808n;

        C13503h(Continuation<? super C13503h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            this.f34806l = obj;
            this.f34808n |= Integer.MIN_VALUE;
            return C13495g.this.m2333Y(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"Landroid/hardware/camera2/CameraCaptureSession;", "session", "", "a", "(Landroid/hardware/camera2/CameraCaptureSession;)V"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: wd.g$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13504i extends AbstractC9614s implements Function1<CameraCaptureSession, Unit> {

        /* renamed from: k */
        final /* synthetic */ Function0<Unit> f34810k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13504i(Function0<Unit> function0) {
            super(1);
            this.f34810k = function0;
        }

        /* renamed from: a */
        public final void m2312a(CameraCaptureSession session) {
            C9612q.m13917h(session, "session");
            Log.d("CameraSession", "Capture Session Closed (" + C13495g.this.f34777v + " == " + session + ')');
            if (C9612q.m13922c(C13495g.this.f34777v, session)) {
                this.f34810k.invoke();
                C13495g.this.f34777v = null;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CameraCaptureSession cameraCaptureSession) {
            m2312a(cameraCaptureSession);
            return Unit.f25302a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    @InterfaceC9571e(m13987c = "com.mrousavy.camera.core.CameraSession", m13986f = "CameraSession.kt", m13985l = {570}, m13984m = "pauseRecording")
    /* renamed from: wd.g$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13505j extends AbstractC9570d {

        /* renamed from: j */
        Object f34811j;

        /* renamed from: k */
        Object f34812k;

        /* renamed from: l */
        /* synthetic */ Object f34813l;

        /* renamed from: n */
        int f34815n;

        C13505j(Continuation<? super C13505j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            this.f34813l = obj;
            this.f34815n |= Integer.MIN_VALUE;
            return C13495g.this.m2321t0(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    @InterfaceC9571e(m13987c = "com.mrousavy.camera.core.CameraSession", m13986f = "CameraSession.kt", m13985l = {570}, m13984m = "resumeRecording")
    /* renamed from: wd.g$k */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13506k extends AbstractC9570d {

        /* renamed from: j */
        Object f34816j;

        /* renamed from: k */
        Object f34817k;

        /* renamed from: l */
        /* synthetic */ Object f34818l;

        /* renamed from: n */
        int f34820n;

        C13506k(Continuation<? super C13506k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            this.f34818l = obj;
            this.f34820n |= Integer.MIN_VALUE;
            return C13495g.this.m2319w0(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    @InterfaceC9571e(m13987c = "com.mrousavy.camera.core.CameraSession$setIsActive$1", m13986f = "CameraSession.kt", m13985l = {ItemTouchHelper.AbstractC1746c.DEFAULT_DRAG_ANIMATION_DURATION, 202}, m13984m = "invokeSuspend")
    /* renamed from: wd.g$l */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13507l extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        int f34821j;

        /* renamed from: k */
        final /* synthetic */ boolean f34822k;

        /* renamed from: l */
        final /* synthetic */ C13495g f34823l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13507l(boolean z, C13495g c13495g, Continuation<? super C13507l> continuation) {
            super(2, continuation);
            this.f34822k = z;
            this.f34823l = c13495g;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C13507l(this.f34822k, this.f34823l, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C13507l) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            Object m2869d;
            m2869d = C13277d.m2869d();
            int i = this.f34821j;
            if (i != 0) {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C11586t.m7586b(obj);
            } else {
                C11586t.m7586b(obj);
                if (this.f34822k) {
                    C13495g c13495g = this.f34823l;
                    this.f34821j = 1;
                    if (c13495g.m2346G0(this) == m2869d) {
                        return m2869d;
                    }
                } else {
                    C13495g c13495g2 = this.f34823l;
                    this.f34821j = 2;
                    if (c13495g2.m2342I0(this) == m2869d) {
                        return m2869d;
                    }
                }
            }
            return Unit.f25302a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    @InterfaceC9571e(m13987c = "com.mrousavy.camera.core.CameraSession$setZoom$1", m13986f = "CameraSession.kt", m13985l = {308}, m13984m = "invokeSuspend")
    /* renamed from: wd.g$m */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13508m extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        int f34824j;

        C13508m(Continuation<? super C13508m> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C13508m(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C13508m) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            Object m2869d;
            m2869d = C13277d.m2869d();
            int i = this.f34824j;
            if (i != 0) {
                if (i == 1) {
                    C11586t.m7586b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C11586t.m7586b(obj);
                C13495g c13495g = C13495g.this;
                this.f34824j = 1;
                if (c13495g.m2340K0(this) == m2869d) {
                    return m2869d;
                }
            }
            return Unit.f25302a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    @InterfaceC9571e(m13987c = "com.mrousavy.camera.core.CameraSession", m13986f = "CameraSession.kt", m13985l = {570}, m13984m = "startRecording")
    /* renamed from: wd.g$n */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13509n extends AbstractC9570d {

        /* renamed from: j */
        Object f34826j;

        /* renamed from: k */
        Object f34827k;

        /* renamed from: l */
        Object f34828l;

        /* renamed from: m */
        Object f34829m;

        /* renamed from: n */
        Object f34830n;

        /* renamed from: o */
        Object f34831o;

        /* renamed from: p */
        boolean f34832p;

        /* renamed from: q */
        /* synthetic */ Object f34833q;

        /* renamed from: s */
        int f34835s;

        C13509n(Continuation<? super C13509n> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            this.f34833q = obj;
            this.f34835s |= Integer.MIN_VALUE;
            return C13495g.this.m2347F0(false, null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    @InterfaceC9571e(m13987c = "com.mrousavy.camera.core.CameraSession", m13986f = "CameraSession.kt", m13985l = {570, 497, 503, 526}, m13984m = "startRunning")
    /* renamed from: wd.g$o */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13510o extends AbstractC9570d {

        /* renamed from: j */
        Object f34836j;

        /* renamed from: k */
        Object f34837k;

        /* renamed from: l */
        Object f34838l;

        /* renamed from: m */
        Object f34839m;

        /* renamed from: n */
        /* synthetic */ Object f34840n;

        /* renamed from: p */
        int f34842p;

        C13510o(Continuation<? super C13510o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            this.f34840n = obj;
            this.f34842p |= Integer.MIN_VALUE;
            return C13495g.this.m2346G0(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "reason", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: wd.g$p */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13511p extends AbstractC9614s implements Function1<Throwable, Unit> {
        C13511p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f25302a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable reason) {
            C9612q.m13917h(reason, "reason");
            C13495g.this.f34759A = false;
            C13495g.this.f34768m.invoke(reason);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m14357d2 = {"<anonymous>", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: wd.g$q */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13512q extends AbstractC9614s implements Function0<Unit> {
        C13512q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f25302a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C13495g.this.f34759A = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    @InterfaceC9571e(m13987c = "com.mrousavy.camera.core.CameraSession", m13986f = "CameraSession.kt", m13985l = {570}, m13984m = "stopRecording")
    /* renamed from: wd.g$r */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13513r extends AbstractC9570d {

        /* renamed from: j */
        Object f34845j;

        /* renamed from: k */
        Object f34846k;

        /* renamed from: l */
        /* synthetic */ Object f34847l;

        /* renamed from: n */
        int f34849n;

        C13513r(Continuation<? super C13513r> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            this.f34847l = obj;
            this.f34849n |= Integer.MIN_VALUE;
            return C13495g.this.m2344H0(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    @InterfaceC9571e(m13987c = "com.mrousavy.camera.core.CameraSession", m13986f = "CameraSession.kt", m13985l = {570}, m13984m = "stopRunning")
    /* renamed from: wd.g$s */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13514s extends AbstractC9570d {

        /* renamed from: j */
        Object f34850j;

        /* renamed from: k */
        Object f34851k;

        /* renamed from: l */
        /* synthetic */ Object f34852l;

        /* renamed from: n */
        int f34854n;

        C13514s(Continuation<? super C13514s> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            this.f34852l = obj;
            this.f34854n |= Integer.MIN_VALUE;
            return C13495g.this.m2342I0(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    @InterfaceC9571e(m13987c = "com.mrousavy.camera.core.CameraSession", m13986f = "CameraSession.kt", m13985l = {238, 242}, m13984m = "takePhoto")
    /* renamed from: wd.g$t */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13515t extends AbstractC9570d {

        /* renamed from: j */
        Object f34855j;

        /* renamed from: k */
        Object f34856k;

        /* renamed from: l */
        Object f34857l;

        /* renamed from: m */
        /* synthetic */ Object f34858m;

        /* renamed from: o */
        int f34860o;

        C13515t(Continuation<? super C13515t> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            this.f34858m = obj;
            this.f34860o |= Integer.MIN_VALUE;
            return C13495g.this.m2341J0(null, null, false, false, false, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    @InterfaceC9571e(m13987c = "com.mrousavy.camera.core.CameraSession", m13986f = "CameraSession.kt", m13985l = {570, 537}, m13984m = "updateRepeatingRequest")
    /* renamed from: wd.g$u */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13516u extends AbstractC9570d {

        /* renamed from: j */
        Object f34861j;

        /* renamed from: k */
        Object f34862k;

        /* renamed from: l */
        /* synthetic */ Object f34863l;

        /* renamed from: n */
        int f34865n;

        C13516u(Continuation<? super C13516u> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            this.f34863l = obj;
            this.f34865n |= Integer.MIN_VALUE;
            return C13495g.this.m2340K0(this);
        }
    }

    static {
        boolean m13754t;
        m13754t = C9653o.m13754t(Build.MANUFACTURER, "samsung", true);
        f34758H = !m13754t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13495g(Context context, CameraManager cameraManager, Function0<Unit> onInitialized, Function1<? super Throwable, Unit> onError) {
        C9612q.m13917h(context, "context");
        C9612q.m13917h(cameraManager, "cameraManager");
        C9612q.m13917h(onInitialized, "onInitialized");
        C9612q.m13917h(onError, "onError");
        this.f34765j = context;
        this.f34766k = cameraManager;
        this.f34767l = onInitialized;
        this.f34768m = onError;
        this.f34776u = 1.0f;
        this.f34780y = new C13517h();
        this.f34781z = C9893d.m12997b(false, 1, null);
        C5308g.C5310b c5310b = C5308g.f15086a;
        this.f34763E = c5310b.m25511a().m25514a();
        cameraManager.registerAvailabilityCallback(this, c5310b.m25511a().m25512c());
    }

    /* renamed from: C0 */
    private final void m2351C0(C13526n c13526n) {
        this.f34761C = c13526n;
        m2339L0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(18:1|(2:3|(15:5|6|7|(1:(1:(1:(1:(3:13|14|15)(2:17|18))(16:19|20|21|(1:23)(1:38)|24|25|(1:27)|28|(1:30)|31|32|33|34|(1:36)|14|15))(19:39|40|41|42|(1:44)|21|(0)(0)|24|25|(0)|28|(0)|31|32|33|34|(0)|14|15))(2:45|46))(2:63|(2:65|66)(2:67|(2:69|70)(3:71|72|(1:74)(1:75))))|47|48|(2:53|(1:55)(17:56|42|(0)|21|(0)(0)|24|25|(0)|28|(0)|31|32|33|34|(0)|14|15))|57|58|32|33|34|(0)|14|15))|79|6|7|(0)(0)|47|48|(3:50|53|(0)(0))|57|58|32|33|34|(0)|14|15|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(12:(2:3|(15:5|6|7|(1:(1:(1:(1:(3:13|14|15)(2:17|18))(16:19|20|21|(1:23)(1:38)|24|25|(1:27)|28|(1:30)|31|32|33|34|(1:36)|14|15))(19:39|40|41|42|(1:44)|21|(0)(0)|24|25|(0)|28|(0)|31|32|33|34|(0)|14|15))(2:45|46))(2:63|(2:65|66)(2:67|(2:69|70)(3:71|72|(1:74)(1:75))))|47|48|(2:53|(1:55)(17:56|42|(0)|21|(0)(0)|24|25|(0)|28|(0)|31|32|33|34|(0)|14|15))|57|58|32|33|34|(0)|14|15))|47|48|(3:50|53|(0)(0))|57|58|32|33|34|(0)|14|15)|79|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0184, code lost:
        android.util.Log.e("CameraSession", "Failed to start Camera Session, this session is already closed.", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0108 A[Catch: all -> 0x006d, TRY_ENTER, TryCatch #2 {all -> 0x006d, blocks: (B:21:0x0055, B:56:0x00eb, B:60:0x00f5, B:63:0x0108, B:64:0x0128, B:66:0x012e, B:67:0x014e, B:71:0x0165, B:24:0x0067, B:53:0x00d2), top: B:83:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012e A[Catch: all -> 0x006d, TryCatch #2 {all -> 0x006d, blocks: (B:21:0x0055, B:56:0x00eb, B:60:0x00f5, B:63:0x0108, B:64:0x0128, B:66:0x012e, B:67:0x014e, B:71:0x0165, B:24:0x0067, B:53:0x00d2), top: B:83:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017c A[RETURN] */
    /* renamed from: G0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m2346G0(kotlin.coroutines.Continuation<? super kotlin.Unit> r18) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p405wd.C13495g.m2346G0(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(2:10|11)(2:18|19))(3:20|21|(1:23)(1:24))|12|13|14|15))|27|6|7|(0)(0)|12|13|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
        android.util.Log.e("CameraSession", "Failed to stop Camera Session, this session is already closed.", r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* renamed from: I0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m2342I0(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p405wd.C13495g.C13514s
            if (r0 == 0) goto L13
            r0 = r7
            wd.g$s r0 = (p405wd.C13495g.C13514s) r0
            int r1 = r0.f34854n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34854n = r1
            goto L18
        L13:
            wd.g$s r0 = new wd.g$s
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f34852l
            java.lang.Object r1 = p388vf.C13271b.m2873d()
            int r2 = r0.f34854n
            r3 = 0
            r4 = 1
            java.lang.String r5 = "CameraSession"
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r1 = r0.f34851k
            kotlinx.coroutines.sync.b r1 = (kotlinx.coroutines.sync.InterfaceC9885b) r1
            java.lang.Object r0 = r0.f34850j
            wd.g r0 = (p405wd.C13495g) r0
            pf.C11586t.m7586b(r7)     // Catch: java.lang.IllegalStateException -> L66
            goto L55
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3c:
            pf.C11586t.m7586b(r7)
            java.lang.String r7 = "Stopping Camera Session..."
            android.util.Log.i(r5, r7)
            kotlinx.coroutines.sync.b r7 = r6.f34781z     // Catch: java.lang.IllegalStateException -> L66
            r0.f34850j = r6     // Catch: java.lang.IllegalStateException -> L66
            r0.f34851k = r7     // Catch: java.lang.IllegalStateException -> L66
            r0.f34854n = r4     // Catch: java.lang.IllegalStateException -> L66
            java.lang.Object r0 = r7.mo13008a(r3, r0)     // Catch: java.lang.IllegalStateException -> L66
            if (r0 != r1) goto L53
            return r1
        L53:
            r0 = r6
            r1 = r7
        L55:
            r0.m2337R()     // Catch: java.lang.Throwable -> L61
            java.lang.String r7 = "Camera Session stopped!"
            android.util.Log.i(r5, r7)     // Catch: java.lang.Throwable -> L61
            r1.mo13007b(r3)     // Catch: java.lang.IllegalStateException -> L66
            goto L6c
        L61:
            r7 = move-exception
            r1.mo13007b(r3)     // Catch: java.lang.IllegalStateException -> L66
            throw r7     // Catch: java.lang.IllegalStateException -> L66
        L66:
            r7 = move-exception
            java.lang.String r0 = "Failed to stop Camera Session, this session is already closed."
            android.util.Log.e(r5, r0, r7)
        L6c:
            kotlin.Unit r7 = kotlin.Unit.f25302a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p405wd.C13495g.m2342I0(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064 A[Catch: all -> 0x0098, TRY_LEAVE, TryCatch #1 {all -> 0x0098, blocks: (B:24:0x0060, B:26:0x0064, B:33:0x0078), top: B:42:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078 A[Catch: all -> 0x0098, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0098, blocks: (B:24:0x0060, B:26:0x0064, B:33:0x0078), top: B:42:0x0060 }] */
    /* renamed from: K0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m2340K0(kotlin.coroutines.Continuation<? super kotlin.Unit> r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            boolean r2 = r0 instanceof p405wd.C13495g.C13516u
            if (r2 == 0) goto L17
            r2 = r0
            wd.g$u r2 = (p405wd.C13495g.C13516u) r2
            int r3 = r2.f34865n
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f34865n = r3
            goto L1c
        L17:
            wd.g$u r2 = new wd.g$u
            r2.<init>(r0)
        L1c:
            java.lang.Object r0 = r2.f34863l
            java.lang.Object r3 = p388vf.C13271b.m2873d()
            int r4 = r2.f34865n
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L4c
            if (r4 == r6) goto L3f
            if (r4 != r5) goto L37
            java.lang.Object r2 = r2.f34861j
            kotlinx.coroutines.sync.b r2 = (kotlinx.coroutines.sync.InterfaceC9885b) r2
            pf.C11586t.m7586b(r0)     // Catch: java.lang.Throwable -> L35
            goto L72
        L35:
            r0 = move-exception
            goto L9a
        L37:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3f:
            java.lang.Object r4 = r2.f34862k
            kotlinx.coroutines.sync.b r4 = (kotlinx.coroutines.sync.InterfaceC9885b) r4
            java.lang.Object r6 = r2.f34861j
            wd.g r6 = (p405wd.C13495g) r6
            pf.C11586t.m7586b(r0)
            r8 = r6
            goto L60
        L4c:
            pf.C11586t.m7586b(r0)
            kotlinx.coroutines.sync.b r0 = r1.f34781z
            r2.f34861j = r1
            r2.f34862k = r0
            r2.f34865n = r6
            java.lang.Object r4 = r0.mo13008a(r7, r2)
            if (r4 != r3) goto L5e
            return r3
        L5e:
            r4 = r0
            r8 = r1
        L60:
            android.hardware.camera2.CameraCaptureSession r0 = r8.f34777v     // Catch: java.lang.Throwable -> L98
            if (r0 != 0) goto L78
            r2.f34861j = r4     // Catch: java.lang.Throwable -> L98
            r2.f34862k = r7     // Catch: java.lang.Throwable -> L98
            r2.f34865n = r5     // Catch: java.lang.Throwable -> L98
            java.lang.Object r0 = r8.m2346G0(r2)     // Catch: java.lang.Throwable -> L98
            if (r0 != r3) goto L71
            return r3
        L71:
            r2 = r4
        L72:
            kotlin.Unit r0 = kotlin.Unit.f25302a     // Catch: java.lang.Throwable -> L35
            r2.mo13007b(r7)
            return r0
        L78:
            java.lang.Integer r9 = r8.f34772q     // Catch: java.lang.Throwable -> L98
            zd.l r10 = r8.f34773r     // Catch: java.lang.Throwable -> L98
            java.lang.Boolean r11 = r8.f34774s     // Catch: java.lang.Throwable -> L98
            java.lang.Boolean r12 = r8.f34775t     // Catch: java.lang.Throwable -> L98
            r13 = 0
            r14 = 16
            r15 = 0
            android.hardware.camera2.CaptureRequest r2 = m2327j0(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L98
            java.lang.String r3 = "CameraSession"
            java.lang.String r5 = "Setting Repeating Request.."
            android.util.Log.d(r3, r5)     // Catch: java.lang.Throwable -> L98
            r0.setRepeatingRequest(r2, r7, r7)     // Catch: java.lang.Throwable -> L98
            r4.mo13007b(r7)
            kotlin.Unit r0 = kotlin.Unit.f25302a
            return r0
        L98:
            r0 = move-exception
            r2 = r4
        L9a:
            r2.mo13007b(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p405wd.C13495g.m2340K0(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: L0 */
    private final void m2339L0() {
        C13792e m1549A;
        VideoPipeline m1523m;
        C13781b c13781b = this.f34770o;
        if (c13781b != null && (m1549A = c13781b.m1549A()) != null && (m1523m = m1549A.m1523m()) != null) {
            C13781b c13781b2 = this.f34770o;
            if (c13781b2 != null) {
                c13781b2.m1541s();
            }
            m1523m.m25524t(this.f34761C);
            m1523m.m25525s(this.f34762D);
        }
    }

    /* renamed from: R */
    private final void m2337R() {
        Log.i("CameraSession", "Destroying session..");
        CameraCaptureSession cameraCaptureSession = this.f34777v;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.stopRepeating();
        }
        CameraCaptureSession cameraCaptureSession2 = this.f34777v;
        if (cameraCaptureSession2 != null) {
            cameraCaptureSession2.close();
        }
        this.f34777v = null;
        CameraDevice cameraDevice = this.f34778w;
        if (cameraDevice != null) {
            cameraDevice.close();
        }
        this.f34778w = null;
        this.f34759A = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071 A[Catch: all -> 0x0127, TryCatch #0 {all -> 0x0127, blocks: (B:24:0x006d, B:26:0x0071, B:28:0x0075, B:30:0x00bc, B:31:0x00c0, B:33:0x00c6, B:34:0x00cf, B:41:0x011b, B:42:0x0120, B:43:0x0121, B:44:0x0126), top: B:49:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0121 A[Catch: all -> 0x0127, TryCatch #0 {all -> 0x0127, blocks: (B:24:0x006d, B:26:0x0071, B:28:0x0075, B:30:0x00bc, B:31:0x00c0, B:33:0x00c6, B:34:0x00cf, B:41:0x011b, B:42:0x0120, B:43:0x0121, B:44:0x0126), top: B:49:0x006d }] */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m2335U(android.graphics.Point r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p405wd.C13495g.m2335U(android.graphics.Point, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m2334V(java.lang.String r6, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r7, kotlin.coroutines.Continuation<? super android.hardware.camera2.CameraDevice> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof p405wd.C13495g.C13501f
            if (r0 == 0) goto L13
            r0 = r8
            wd.g$f r0 = (p405wd.C13495g.C13501f) r0
            int r1 = r0.f34801m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34801m = r1
            goto L18
        L13:
            wd.g$f r0 = new wd.g$f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f34799k
            java.lang.Object r1 = p388vf.C13271b.m2873d()
            int r2 = r0.f34801m
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f34798j
            wd.g r6 = (p405wd.C13495g) r6
            pf.C11586t.m7586b(r8)
            goto L6c
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            pf.C11586t.m7586b(r8)
            android.hardware.camera2.CameraDevice r8 = r5.f34778w
            r2 = 0
            if (r8 == 0) goto L42
            java.lang.String r4 = r8.getId()
            goto L43
        L42:
            r4 = r2
        L43:
            boolean r4 = kotlin.jvm.internal.C9612q.m13922c(r4, r6)
            if (r4 == 0) goto L4a
            return r8
        L4a:
            android.hardware.camera2.CameraDevice r8 = r5.f34778w
            if (r8 == 0) goto L51
            p446yd.C13999l.m940b(r8)
        L51:
            r5.f34778w = r2
            android.hardware.camera2.CameraManager r8 = r5.f34766k
            wd.g$g r2 = new wd.g$g
            r2.<init>(r7)
            com.mrousavy.camera.g$b r7 = com.mrousavy.camera.C5308g.f15086a
            com.mrousavy.camera.g$a r7 = r7.m25511a()
            r0.f34798j = r5
            r0.f34801m = r3
            java.lang.Object r8 = p446yd.C13999l.m941a(r8, r6, r2, r7, r0)
            if (r8 != r1) goto L6b
            return r1
        L6b:
            r6 = r5
        L6c:
            android.hardware.camera2.CameraDevice r8 = (android.hardware.camera2.CameraDevice) r8
            r6.f34778w = r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p405wd.C13495g.m2334V(java.lang.String, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m2333Y(android.hardware.camera2.CameraDevice r9, p425xd.C13781b r10, kotlin.jvm.functions.Function0<kotlin.Unit> r11, kotlin.coroutines.Continuation<? super android.hardware.camera2.CameraCaptureSession> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof p405wd.C13495g.C13503h
            if (r0 == 0) goto L13
            r0 = r12
            wd.g$h r0 = (p405wd.C13495g.C13503h) r0
            int r1 = r0.f34808n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34808n = r1
            goto L18
        L13:
            wd.g$h r0 = new wd.g$h
            r0.<init>(r12)
        L18:
            r7 = r0
            java.lang.Object r12 = r7.f34806l
            java.lang.Object r0 = p388vf.C13271b.m2873d()
            int r1 = r7.f34808n
            r2 = 1
            if (r1 == 0) goto L3b
            if (r1 != r2) goto L33
            java.lang.Object r9 = r7.f34805k
            r10 = r9
            xd.b r10 = (p425xd.C13781b) r10
            java.lang.Object r9 = r7.f34804j
            wd.g r9 = (p405wd.C13495g) r9
            pf.C11586t.m7586b(r12)
            goto L88
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            pf.C11586t.m7586b(r12)
            android.hardware.camera2.CameraCaptureSession r12 = r8.f34777v
            r1 = 0
            if (r12 == 0) goto L48
            android.hardware.camera2.CameraDevice r3 = r12.getDevice()
            goto L49
        L48:
            r3 = r1
        L49:
            boolean r3 = kotlin.jvm.internal.C9612q.m13922c(r3, r9)
            if (r3 == 0) goto L5f
            int r3 = r10.hashCode()
            java.lang.Integer r4 = r8.f34764F
            if (r4 != 0) goto L58
            goto L5f
        L58:
            int r4 = r4.intValue()
            if (r3 != r4) goto L5f
            return r12
        L5f:
            android.hardware.camera2.CameraCaptureSession r12 = r8.f34777v
            if (r12 == 0) goto L66
            r12.close()
        L66:
            r8.f34777v = r1
            android.hardware.camera2.CameraManager r12 = r8.f34766k
            yd.p r3 = p446yd.EnumC14004p.REGULAR
            wd.g$i r5 = new wd.g$i
            r5.<init>(r11)
            com.mrousavy.camera.g$b r11 = com.mrousavy.camera.C5308g.f15086a
            com.mrousavy.camera.g$a r6 = r11.m25511a()
            r7.f34804j = r8
            r7.f34805k = r10
            r7.f34808n = r2
            r1 = r9
            r2 = r12
            r4 = r10
            java.lang.Object r12 = p446yd.C13994i.m945c(r1, r2, r3, r4, r5, r6, r7)
            if (r12 != r0) goto L87
            return r0
        L87:
            r9 = r8
        L88:
            android.hardware.camera2.CameraCaptureSession r12 = (android.hardware.camera2.CameraCaptureSession) r12
            r9.f34777v = r12
            int r10 = r10.hashCode()
            java.lang.Integer r10 = kotlin.coroutines.jvm.internal.C9568b.m13989c(r10)
            r9.f34764F = r10
            kotlin.jvm.functions.Function0<kotlin.Unit> r9 = r9.f34767l
            r9.invoke()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p405wd.C13495g.m2333Y(android.hardware.camera2.CameraDevice, xd.b, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* renamed from: e0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.hardware.camera2.CaptureRequest m2331e0(java.lang.Integer r5, p465zd.EnumC14174l r6, java.lang.Boolean r7, java.lang.Boolean r8, java.lang.Boolean r9) {
        /*
            r4 = this;
            android.hardware.camera2.CaptureRequest$Builder r0 = r4.f34779x
            if (r0 == 0) goto Lc5
            r1 = 30
            if (r5 == 0) goto L12
            boolean r2 = p405wd.C13495g.f34758H
            if (r2 == 0) goto L12
            android.util.Range r2 = new android.util.Range
            r2.<init>(r5, r5)
            goto L1f
        L12:
            android.util.Range r2 = new android.util.Range
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r2.<init>(r5, r3)
        L1f:
            android.hardware.camera2.CaptureRequest$Key r5 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE
            r0.set(r5, r2)
            android.hardware.camera2.CaptureRequest$Key r5 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE
            r2 = 0
            if (r6 == 0) goto L32
            int r3 = r6.m527c()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L33
        L32:
            r3 = r2
        L33:
            r0.set(r5, r3)
            android.hardware.camera2.CaptureRequest$Key r5 = android.hardware.camera2.CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE
            if (r6 == 0) goto L43
            int r6 = r6.m526d()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L44
        L43:
            r6 = r2
        L44:
            r0.set(r5, r6)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r6 = kotlin.jvm.internal.C9612q.m13922c(r8, r5)
            if (r6 == 0) goto L56
            r6 = 18
        L51:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            goto L5e
        L56:
            boolean r6 = kotlin.jvm.internal.C9612q.m13922c(r7, r5)
            if (r6 == 0) goto L5e
            r6 = 5
            goto L51
        L5e:
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE
            r0.set(r6, r2)
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            r7 = 2
            if (r2 == 0) goto L6a
            r8 = r7
            goto L6b
        L6a:
            r8 = 1
        L6b:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0.set(r6, r8)
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r1) goto L84
            android.hardware.camera2.CaptureRequest$Key r6 = p405wd.C13494f.m2355a()
            float r8 = r4.f34776u
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r0.set(r6, r8)
            goto Laa
        L84:
            android.hardware.camera2.CameraManager r6 = r4.f34766k
            java.lang.String r8 = r4.f34769n
            kotlin.jvm.internal.C9612q.m13920e(r8)
            android.hardware.camera2.CameraCharacteristics r6 = r6.getCameraCharacteristics(r8)
            java.lang.String r8 = "cameraManager.getCameraCharacteristics(cameraId!!)"
            kotlin.jvm.internal.C9612q.m13918g(r6, r8)
            android.hardware.camera2.CameraCharacteristics$Key r8 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE
            java.lang.Object r6 = r6.get(r8)
            kotlin.jvm.internal.C9612q.m13920e(r6)
            android.graphics.Rect r6 = (android.graphics.Rect) r6
            android.hardware.camera2.CaptureRequest$Key r8 = android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION
            float r1 = r4.f34776u
            android.graphics.Rect r6 = p446yd.C14003o.m936a(r6, r1)
            r0.set(r8, r6)
        Laa:
            boolean r5 = kotlin.jvm.internal.C9612q.m13922c(r9, r5)
            if (r5 == 0) goto Lb1
            goto Lb2
        Lb1:
            r7 = 0
        Lb2:
            android.hardware.camera2.CaptureRequest$Key r5 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r0.set(r5, r6)
            android.hardware.camera2.CaptureRequest r5 = r0.build()
            java.lang.String r6 = "captureRequest.build()"
            kotlin.jvm.internal.C9612q.m13918g(r5, r6)
            return r5
        Lc5:
            com.mrousavy.camera.d r5 = new com.mrousavy.camera.d
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p405wd.C13495g.m2331e0(java.lang.Integer, zd.l, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean):android.hardware.camera2.CaptureRequest");
    }

    /* renamed from: j0 */
    static /* synthetic */ CaptureRequest m2327j0(C13495g c13495g, Integer num, EnumC14174l enumC14174l, Boolean bool, Boolean bool2, Boolean bool3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            enumC14174l = null;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        if ((i & 8) != 0) {
            bool2 = null;
        }
        if ((i & 16) != 0) {
            bool3 = null;
        }
        return c13495g.m2331e0(num, enumC14174l, bool, bool2, bool3);
    }

    /* renamed from: A0 */
    public final void m2353A0(FrameProcessor frameProcessor) {
        this.f34762D = frameProcessor;
        m2339L0();
    }

    /* renamed from: B0 */
    public final void m2352B0(boolean z) {
        Log.i("CameraSession", "Setting isActive: " + z + " (isRunning: " + this.f34759A + ')');
        this.f34771p = z;
        if (z == this.f34759A) {
            return;
        }
        C9818l.m13179d(this, null, null, new C13507l(z, this, null), 3, null);
    }

    /* renamed from: D0 */
    public final Object m2349D0(boolean z, Continuation<? super Unit> continuation) {
        Object m2869d;
        if (this.f34760B != z) {
            this.f34760B = z;
            Object m2340K0 = m2340K0(continuation);
            m2869d = C13277d.m2869d();
            if (m2340K0 == m2869d) {
                return m2340K0;
            }
            return Unit.f25302a;
        }
        return Unit.f25302a;
    }

    /* renamed from: E0 */
    public final void m2348E0(float f) {
        boolean z;
        if (this.f34776u == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f34776u = f;
            C9818l.m13179d(this, null, null, new C13508m(null), 3, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c A[Catch: all -> 0x00cd, TryCatch #0 {all -> 0x00cd, blocks: (B:18:0x0088, B:20:0x008c, B:22:0x0090, B:24:0x0096, B:28:0x00a2, B:31:0x00bb, B:32:0x00c0, B:33:0x00c1, B:34:0x00c6, B:35:0x00c7, B:36:0x00cc), top: B:40:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c7 A[Catch: all -> 0x00cd, TryCatch #0 {all -> 0x00cd, blocks: (B:18:0x0088, B:20:0x008c, B:22:0x0090, B:24:0x0096, B:28:0x00a2, B:31:0x00bb, B:32:0x00c0, B:33:0x00c1, B:34:0x00c6, B:35:0x00c7, B:36:0x00cc), top: B:40:0x0088 }] */
    /* renamed from: F0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m2347F0(boolean r22, p465zd.EnumC14168j r23, p465zd.EnumC14171k r24, kotlin.jvm.functions.Function1<? super p405wd.C13526n.C13528b, kotlin.Unit> r25, kotlin.jvm.functions.Function1<? super com.mrousavy.camera.C5341y, kotlin.Unit> r26, kotlin.coroutines.Continuation<? super kotlin.Unit> r27) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p405wd.C13495g.m2347F0(boolean, zd.j, zd.k, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052 A[Catch: all -> 0x0066, TRY_LEAVE, TryCatch #0 {all -> 0x0066, blocks: (B:18:0x004e, B:20:0x0052, B:23:0x0060, B:24:0x0065), top: B:28:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060 A[Catch: all -> 0x0066, TRY_ENTER, TryCatch #0 {all -> 0x0066, blocks: (B:18:0x004e, B:20:0x0052, B:23:0x0060, B:24:0x0065), top: B:28:0x004e }] */
    /* renamed from: H0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m2344H0(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p405wd.C13495g.C13513r
            if (r0 == 0) goto L13
            r0 = r6
            wd.g$r r0 = (p405wd.C13495g.C13513r) r0
            int r1 = r0.f34849n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34849n = r1
            goto L18
        L13:
            wd.g$r r0 = new wd.g$r
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f34847l
            java.lang.Object r1 = p388vf.C13271b.m2873d()
            int r2 = r0.f34849n
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.f34846k
            kotlinx.coroutines.sync.b r1 = (kotlinx.coroutines.sync.InterfaceC9885b) r1
            java.lang.Object r0 = r0.f34845j
            wd.g r0 = (p405wd.C13495g) r0
            pf.C11586t.m7586b(r6)
            goto L4e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3a:
            pf.C11586t.m7586b(r6)
            kotlinx.coroutines.sync.b r6 = r5.f34781z
            r0.f34845j = r5
            r0.f34846k = r6
            r0.f34849n = r3
            java.lang.Object r0 = r6.mo13008a(r4, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
            r1 = r6
        L4e:
            wd.n r6 = r0.f34761C     // Catch: java.lang.Throwable -> L66
            if (r6 == 0) goto L60
            r6.m2296i()     // Catch: java.lang.Throwable -> L66
            r0.m2351C0(r4)     // Catch: java.lang.Throwable -> L66
            kotlin.Unit r6 = kotlin.Unit.f25302a     // Catch: java.lang.Throwable -> L66
            r1.mo13007b(r4)
            kotlin.Unit r6 = kotlin.Unit.f25302a
            return r6
        L60:
            com.mrousavy.camera.v r6 = new com.mrousavy.camera.v     // Catch: java.lang.Throwable -> L66
            r6.<init>()     // Catch: java.lang.Throwable -> L66
            throw r6     // Catch: java.lang.Throwable -> L66
        L66:
            r6 = move-exception
            r1.mo13007b(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p405wd.C13495g.m2344H0(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: I */
    public final void m2343I(Integer num, EnumC14174l enumC14174l, Boolean bool, Boolean bool2) {
        Log.i("CameraSession", "Setting Format (fps: " + num + " | videoStabilization: " + enumC14174l + " | hdr: " + bool + " | lowLightBoost: " + bool2 + ")...");
        this.f34772q = num;
        this.f34773r = enumC14174l;
        this.f34775t = bool;
        this.f34774s = bool2;
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        C13781b c13781b = this.f34770o;
        if (c13781b != null && !C9612q.m13922c(c13781b.m1545j(), bool)) {
            this.f34770o = new C13781b(c13781b.m1546i(), this.f34766k, c13781b.m1542q(), c13781b.m1544m(), c13781b.m1539v(), bool, this);
            ref$BooleanRef.f25327j = true;
        }
        C9818l.m13179d(this, null, null, new C13498c(ref$BooleanRef, this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0120 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0168  */
    /* renamed from: J0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m2341J0(p465zd.EnumC14164h r20, p465zd.EnumC14150b r21, boolean r22, boolean r23, boolean r24, p465zd.EnumC14156e r25, kotlin.coroutines.Continuation<? super p405wd.C13495g.C13496a> r26) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p405wd.C13495g.m2341J0(zd.h, zd.b, boolean, boolean, boolean, zd.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: Q */
    public final void m2338Q(String cameraId, C13781b.C13785d c13785d, C13781b.C13784c c13784c, C13781b.C13786e c13786e) {
        C9612q.m13917h(cameraId, "cameraId");
        Log.i("CameraSession", "Configuring Session for Camera " + cameraId + "...");
        C13781b c13781b = new C13781b(cameraId, this.f34766k, c13785d, c13784c, c13786e, Boolean.valueOf(C9612q.m13922c(this.f34775t, Boolean.TRUE)), this);
        if (C9612q.m13922c(this.f34769n, cameraId) && C9612q.m13922c(this.f34770o, c13781b) && this.f34771p == this.f34759A) {
            Log.i("CameraSession", "Nothing changed in configuration, canceling..");
        }
        C13781b c13781b2 = this.f34770o;
        if (c13781b2 != null) {
            c13781b2.close();
        }
        this.f34770o = c13781b;
        m2339L0();
        this.f34769n = cameraId;
        C9818l.m13179d(this, null, null, new C13499d(null), 3, null);
    }

    /* renamed from: S */
    public final Object m2336S(int i, int i2, Continuation<? super Unit> continuation) {
        C13788d m1541s;
        Object m2869d;
        CameraCaptureSession cameraCaptureSession = this.f34777v;
        if (cameraCaptureSession != null) {
            C13781b c13781b = this.f34770o;
            if (c13781b != null && (m1541s = c13781b.m1541s()) != null) {
                CameraCharacteristics cameraCharacteristics = this.f34766k.getCameraCharacteristics(cameraCaptureSession.getDevice().getId());
                C9612q.m13918g(cameraCharacteristics, "cameraManager.getCameraC…captureSession.device.id)");
                Object obj = cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                C9612q.m13920e(obj);
                Rect rect = (Rect) obj;
                Size m1530h = m1541s.m1530h();
                Point point = new Point((int) ((i / m1530h.getWidth()) * rect.height()), (int) ((i2 / m1530h.getHeight()) * rect.width()));
                Log.i("CameraSession", "Focusing (" + point.x + ", " + point.y + ")...");
                Object m2335U = m2335U(point, continuation);
                m2869d = C13277d.m2869d();
                if (m2335U == m2869d) {
                    return m2335U;
                }
                return Unit.f25302a;
            }
            throw new C5299d();
        }
        throw new C5299d();
    }

    @Override // p425xd.C13781b.InterfaceC13782a
    /* renamed from: a */
    public void mo1538a(Image image) {
        C9612q.m13917h(image, "image");
        Log.i("CameraView", "Photo captured! " + image.getWidth() + " x " + image.getHeight());
        this.f34780y.m2308d(image.getTimestamp(), image);
    }

    /* renamed from: b0 */
    public final EnumC14156e m2332b0() {
        String str = this.f34769n;
        if (str == null) {
            return EnumC14156e.PORTRAIT;
        }
        CameraCharacteristics cameraCharacteristics = this.f34766k.getCameraCharacteristics(str);
        C9612q.m13918g(cameraCharacteristics, "cameraManager.getCameraCharacteristics(cameraId)");
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
        if (num == null) {
            num = 0;
        }
        return EnumC14156e.f36425k.m549a(num.intValue());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f34766k.unregisterAvailabilityCallback(this);
        this.f34780y.m2310b();
        CameraCaptureSession cameraCaptureSession = this.f34777v;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
        }
        CameraDevice cameraDevice = this.f34778w;
        if (cameraDevice != null) {
            C13999l.m940b(cameraDevice);
        }
        C13781b c13781b = this.f34770o;
        if (c13781b != null) {
            c13781b.close();
        }
        this.f34759A = false;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f34763E;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public void onCameraAvailable(String cameraId) {
        C9612q.m13917h(cameraId, "cameraId");
        super.onCameraAvailable(cameraId);
        Log.i("CameraSession", "Camera became available: " + cameraId);
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public void onCameraUnavailable(String cameraId) {
        C9612q.m13917h(cameraId, "cameraId");
        super.onCameraUnavailable(cameraId);
        Log.i("CameraSession", "Camera became un-available: " + cameraId);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052 A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #0 {all -> 0x0063, blocks: (B:18:0x004e, B:20:0x0052, B:23:0x005d, B:24:0x0062), top: B:28:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d A[Catch: all -> 0x0063, TRY_ENTER, TryCatch #0 {all -> 0x0063, blocks: (B:18:0x004e, B:20:0x0052, B:23:0x005d, B:24:0x0062), top: B:28:0x004e }] */
    /* renamed from: t0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m2321t0(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p405wd.C13495g.C13505j
            if (r0 == 0) goto L13
            r0 = r6
            wd.g$j r0 = (p405wd.C13495g.C13505j) r0
            int r1 = r0.f34815n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34815n = r1
            goto L18
        L13:
            wd.g$j r0 = new wd.g$j
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f34813l
            java.lang.Object r1 = p388vf.C13271b.m2873d()
            int r2 = r0.f34815n
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r1 = r0.f34812k
            kotlinx.coroutines.sync.b r1 = (kotlinx.coroutines.sync.InterfaceC9885b) r1
            java.lang.Object r0 = r0.f34811j
            wd.g r0 = (p405wd.C13495g) r0
            pf.C11586t.m7586b(r6)
            goto L4e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3a:
            pf.C11586t.m7586b(r6)
            kotlinx.coroutines.sync.b r6 = r5.f34781z
            r0.f34811j = r5
            r0.f34812k = r6
            r0.f34815n = r4
            java.lang.Object r0 = r6.mo13008a(r3, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
            r1 = r6
        L4e:
            wd.n r6 = r0.f34761C     // Catch: java.lang.Throwable -> L63
            if (r6 == 0) goto L5d
            r6.m2299f()     // Catch: java.lang.Throwable -> L63
            kotlin.Unit r6 = kotlin.Unit.f25302a     // Catch: java.lang.Throwable -> L63
            r1.mo13007b(r3)
            kotlin.Unit r6 = kotlin.Unit.f25302a
            return r6
        L5d:
            com.mrousavy.camera.v r6 = new com.mrousavy.camera.v     // Catch: java.lang.Throwable -> L63
            r6.<init>()     // Catch: java.lang.Throwable -> L63
            throw r6     // Catch: java.lang.Throwable -> L63
        L63:
            r6 = move-exception
            r1.mo13007b(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p405wd.C13495g.m2321t0(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052 A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #0 {all -> 0x0063, blocks: (B:18:0x004e, B:20:0x0052, B:23:0x005d, B:24:0x0062), top: B:28:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d A[Catch: all -> 0x0063, TRY_ENTER, TryCatch #0 {all -> 0x0063, blocks: (B:18:0x004e, B:20:0x0052, B:23:0x005d, B:24:0x0062), top: B:28:0x004e }] */
    /* renamed from: w0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m2319w0(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p405wd.C13495g.C13506k
            if (r0 == 0) goto L13
            r0 = r6
            wd.g$k r0 = (p405wd.C13495g.C13506k) r0
            int r1 = r0.f34820n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34820n = r1
            goto L18
        L13:
            wd.g$k r0 = new wd.g$k
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f34818l
            java.lang.Object r1 = p388vf.C13271b.m2873d()
            int r2 = r0.f34820n
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r1 = r0.f34817k
            kotlinx.coroutines.sync.b r1 = (kotlinx.coroutines.sync.InterfaceC9885b) r1
            java.lang.Object r0 = r0.f34816j
            wd.g r0 = (p405wd.C13495g) r0
            pf.C11586t.m7586b(r6)
            goto L4e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3a:
            pf.C11586t.m7586b(r6)
            kotlinx.coroutines.sync.b r6 = r5.f34781z
            r0.f34816j = r5
            r0.f34817k = r6
            r0.f34820n = r4
            java.lang.Object r0 = r6.mo13008a(r3, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
            r1 = r6
        L4e:
            wd.n r6 = r0.f34761C     // Catch: java.lang.Throwable -> L63
            if (r6 == 0) goto L5d
            r6.m2298g()     // Catch: java.lang.Throwable -> L63
            kotlin.Unit r6 = kotlin.Unit.f25302a     // Catch: java.lang.Throwable -> L63
            r1.mo13007b(r3)
            kotlin.Unit r6 = kotlin.Unit.f25302a
            return r6
        L5d:
            com.mrousavy.camera.v r6 = new com.mrousavy.camera.v     // Catch: java.lang.Throwable -> L63
            r6.<init>()     // Catch: java.lang.Throwable -> L63
            throw r6     // Catch: java.lang.Throwable -> L63
        L63:
            r6 = move-exception
            r1.mo13007b(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p405wd.C13495g.m2319w0(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
