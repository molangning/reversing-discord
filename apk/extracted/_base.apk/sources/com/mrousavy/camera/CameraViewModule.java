package com.mrousavy.camera;

import ae.C0149a;
import android.app.Activity;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import android.view.View;
import androidx.core.content.C0946a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;
import com.facebook.react.uimanager.UIManagerHelper;
import com.mrousavy.camera.frameprocessor.VisionCameraInstaller;
import com.mrousavy.camera.frameprocessor.VisionCameraProxy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.C9573g;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C9677b1;
import kotlinx.coroutines.C9818l;
import kotlinx.coroutines.C9824m0;
import kotlinx.coroutines.CoroutineScope;
import p371uf.C12968g;
import p388vf.C13272c;
import p388vf.C13277d;
import p405wd.C13493e;
import p465zd.EnumC14159f;
import pf.C11583s;
import pf.C11586t;

@ReactModule(name = "CameraView")
@Metadata(m14358d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001*B\u000f\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\b\u0010\u000e\u001a\u00020\tH\u0007J \u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J \u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0007J\u0018\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0018\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0018\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J \u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010!\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, m14357d2 = {"Lcom/mrousavy/camera/CameraViewModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "", "viewId", "Lcom/mrousavy/camera/j;", "findCameraView", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "permission", "", "canRequestPermission", "", "invalidate", "getName", "installFrameProcessorBindings", "viewTag", "Lcom/facebook/react/bridge/ReadableMap;", "options", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "takePhoto", "Lcom/facebook/react/bridge/Callback;", "onRecordCallback", "startRecording", "pauseRecording", "resumeRecording", "stopRecording", "point", "focus", "getAvailableCameraDevices", "getCameraPermissionStatus", "getMicrophonePermissionStatus", "requestCameraPermission", "requestMicrophonePermission", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Companion", "a", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class CameraViewModule extends ReactContextBaseJavaModule {
    public static final C5283a Companion = new C5283a(null);
    private static int RequestCode = 10;
    public static final String TAG = "CameraView";
    private final CoroutineScope coroutineScope;

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m14357d2 = {"Lcom/mrousavy/camera/CameraViewModule$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.mrousavy.camera.CameraViewModule$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5283a {
        private C5283a() {
        }

        public /* synthetic */ C5283a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m14357d2 = {"<anonymous>", "", "run"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: com.mrousavy.camera.CameraViewModule$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class RunnableC5284b implements Runnable {

        /* renamed from: j */
        final /* synthetic */ int f15017j;

        /* renamed from: k */
        final /* synthetic */ CameraViewModule f15018k;

        /* renamed from: l */
        final /* synthetic */ Continuation<C5313j> f15019l;

        /* JADX WARN: Multi-variable type inference failed */
        RunnableC5284b(int i, CameraViewModule cameraViewModule, Continuation<? super C5313j> continuation) {
            this.f15017j = i;
            this.f15018k = cameraViewModule;
            this.f15019l = continuation;
        }

        @Override // java.lang.Runnable
        public final void run() {
            StringBuilder sb2;
            String str;
            Log.d("CameraView", "Finding view " + this.f15017j + "...");
            View view = null;
            if (this.f15018k.getReactApplicationContext() != null) {
                UIManager uIManager = UIManagerHelper.getUIManager(this.f15018k.getReactApplicationContext(), this.f15017j);
                if (uIManager != null) {
                    view = uIManager.resolveView(this.f15017j);
                }
                view = (C5313j) view;
            }
            if (this.f15018k.getReactApplicationContext() != null) {
                sb2 = new StringBuilder();
                str = "Found view ";
            } else {
                sb2 = new StringBuilder();
                str = "Couldn't find view ";
            }
            sb2.append(str);
            sb2.append(this.f15017j);
            sb2.append('!');
            Log.d("CameraView", sb2.toString());
            if (view != null) {
                this.f15019l.resumeWith(C11583s.m7596b(view));
                return;
            }
            Continuation<C5313j> continuation = this.f15019l;
            C11583s.C11584a c11584a = C11583s.f30090k;
            continuation.resumeWith(C11583s.m7596b(C11586t.m7587a(new C5300d0(this.f15017j))));
        }
    }

    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    @InterfaceC9571e(m13987c = "com.mrousavy.camera.CameraViewModule$focus$1", m13986f = "CameraViewModule.kt", m13985l = {132, 134}, m13984m = "invokeSuspend")
    /* renamed from: com.mrousavy.camera.CameraViewModule$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C5285c extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        Object f15020j;

        /* renamed from: k */
        int f15021k;

        /* renamed from: m */
        final /* synthetic */ int f15023m;

        /* renamed from: n */
        final /* synthetic */ Promise f15024n;

        /* renamed from: o */
        final /* synthetic */ ReadableMap f15025o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5285c(int i, Promise promise, ReadableMap readableMap, Continuation<? super C5285c> continuation) {
            super(2, continuation);
            this.f15023m = i;
            this.f15024n = promise;
            this.f15025o = readableMap;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C5285c(this.f15023m, this.f15024n, this.f15025o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C5285c) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(7:1|(1:(1:(7:5|6|7|8|9|10|11)(2:20|21))(1:22))(2:32|(1:34))|23|24|25|(1:27)(5:28|8|9|10|11)|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
            r5 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
            r0 = r1;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p388vf.C13271b.m2873d()
                int r1 = r4.f15021k
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r0 = r4.f15020j
                com.facebook.react.bridge.Promise r0 = (com.facebook.react.bridge.Promise) r0
                pf.C11586t.m7586b(r5)     // Catch: java.lang.Throwable -> L16
                goto L46
            L16:
                r5 = move-exception
                goto L4d
            L18:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L20:
                pf.C11586t.m7586b(r5)
                goto L34
            L24:
                pf.C11586t.m7586b(r5)
                com.mrousavy.camera.CameraViewModule r5 = com.mrousavy.camera.CameraViewModule.this
                int r1 = r4.f15023m
                r4.f15021k = r3
                java.lang.Object r5 = com.mrousavy.camera.CameraViewModule.access$findCameraView(r5, r1, r4)
                if (r5 != r0) goto L34
                return r0
            L34:
                com.mrousavy.camera.j r5 = (com.mrousavy.camera.C5313j) r5
                com.facebook.react.bridge.Promise r1 = r4.f15024n
                com.facebook.react.bridge.ReadableMap r3 = r4.f15025o
                r4.f15020j = r1     // Catch: java.lang.Throwable -> L4b
                r4.f15021k = r2     // Catch: java.lang.Throwable -> L4b
                java.lang.Object r5 = com.mrousavy.camera.C5323n.m25491a(r5, r3, r4)     // Catch: java.lang.Throwable -> L4b
                if (r5 != r0) goto L45
                return r0
            L45:
                r0 = r1
            L46:
                r5 = 0
                r0.resolve(r5)     // Catch: java.lang.Throwable -> L16
                goto L84
            L4b:
                r5 = move-exception
                r0 = r1
            L4d:
                r5.printStackTrace()
                boolean r1 = r5 instanceof com.mrousavy.camera.AbstractC5296c
                if (r1 == 0) goto L57
                com.mrousavy.camera.c r5 = (com.mrousavy.camera.AbstractC5296c) r5
                goto L5d
            L57:
                com.mrousavy.camera.a0 r1 = new com.mrousavy.camera.a0
                r1.<init>(r5)
                r5 = r1
            L5d:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = r5.m25534a()
                r1.append(r2)
                r2 = 47
                r1.append(r2)
                java.lang.String r2 = r5.m25533b()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = r5.getMessage()
                java.lang.Throwable r5 = r5.getCause()
                r0.reject(r1, r2, r5)
            L84:
                kotlin.Unit r5 = kotlin.Unit.f25302a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.CameraViewModule.C5285c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    @InterfaceC9571e(m13987c = "com.mrousavy.camera.CameraViewModule$getAvailableCameraDevices$1", m13986f = "CameraViewModule.kt", m13985l = {}, m13984m = "invokeSuspend")
    /* renamed from: com.mrousavy.camera.CameraViewModule$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C5286d extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        int f15026j;

        /* renamed from: k */
        final /* synthetic */ Promise f15027k;

        /* renamed from: l */
        final /* synthetic */ CameraViewModule f15028l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5286d(Promise promise, CameraViewModule cameraViewModule, Continuation<? super C5286d> continuation) {
            super(2, continuation);
            this.f15027k = promise;
            this.f15028l = cameraViewModule;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C5286d(this.f15027k, this.f15028l, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C5286d) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            AbstractC5296c c5293a0;
            C13277d.m2869d();
            if (this.f15026j == 0) {
                C11586t.m7586b(obj);
                Promise promise = this.f15027k;
                try {
                    Object systemService = this.f15028l.getReactApplicationContext().getSystemService("camera");
                    C9612q.m13919f(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
                    CameraManager cameraManager = (CameraManager) systemService;
                    WritableArray createArray = Arguments.createArray();
                    String[] cameraIdList = cameraManager.getCameraIdList();
                    C9612q.m13918g(cameraIdList, "manager.cameraIdList");
                    for (String cameraId : cameraIdList) {
                        C9612q.m13918g(cameraId, "cameraId");
                        createArray.pushMap(new C13493e(cameraManager, cameraId).m2356k());
                    }
                    promise.resolve(createArray);
                    promise.resolve(Unit.f25302a);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    if (th2 instanceof AbstractC5296c) {
                        c5293a0 = th2;
                    } else {
                        c5293a0 = new C5293a0(th2);
                    }
                    promise.reject(c5293a0.m25534a() + '/' + c5293a0.m25533b(), c5293a0.getMessage(), c5293a0.getCause());
                }
                return Unit.f25302a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    @InterfaceC9571e(m13987c = "com.mrousavy.camera.CameraViewModule$pauseRecording$1", m13986f = "CameraViewModule.kt", m13985l = {100, 101}, m13984m = "invokeSuspend")
    /* renamed from: com.mrousavy.camera.CameraViewModule$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C5287e extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        Object f15029j;

        /* renamed from: k */
        int f15030k;

        /* renamed from: l */
        final /* synthetic */ Promise f15031l;

        /* renamed from: m */
        final /* synthetic */ CameraViewModule f15032m;

        /* renamed from: n */
        final /* synthetic */ int f15033n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5287e(Promise promise, CameraViewModule cameraViewModule, int i, Continuation<? super C5287e> continuation) {
            super(2, continuation);
            this.f15031l = promise;
            this.f15032m = cameraViewModule;
            this.f15033n = i;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C5287e(this.f15031l, this.f15032m, this.f15033n, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C5287e) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p388vf.C13271b.m2873d()
                int r1 = r6.f15030k
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r0 = r6.f15029j
                com.facebook.react.bridge.Promise r0 = (com.facebook.react.bridge.Promise) r0
                pf.C11586t.m7586b(r7)     // Catch: java.lang.Throwable -> L16
                goto L50
            L16:
                r7 = move-exception
                goto L59
            L18:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L20:
                java.lang.Object r1 = r6.f15029j
                com.facebook.react.bridge.Promise r1 = (com.facebook.react.bridge.Promise) r1
                pf.C11586t.m7586b(r7)     // Catch: java.lang.Throwable -> L28
                goto L42
            L28:
                r7 = move-exception
                r0 = r1
                goto L59
            L2b:
                pf.C11586t.m7586b(r7)
                com.facebook.react.bridge.Promise r7 = r6.f15031l
                com.mrousavy.camera.CameraViewModule r1 = r6.f15032m
                int r4 = r6.f15033n
                r6.f15029j = r7     // Catch: java.lang.Throwable -> L55
                r6.f15030k = r3     // Catch: java.lang.Throwable -> L55
                java.lang.Object r1 = com.mrousavy.camera.CameraViewModule.access$findCameraView(r1, r4, r6)     // Catch: java.lang.Throwable -> L55
                if (r1 != r0) goto L3f
                return r0
            L3f:
                r5 = r1
                r1 = r7
                r7 = r5
            L42:
                com.mrousavy.camera.j r7 = (com.mrousavy.camera.C5313j) r7     // Catch: java.lang.Throwable -> L28
                r6.f15029j = r1     // Catch: java.lang.Throwable -> L28
                r6.f15030k = r2     // Catch: java.lang.Throwable -> L28
                java.lang.Object r7 = com.mrousavy.camera.C5324o.m25490a(r7, r6)     // Catch: java.lang.Throwable -> L28
                if (r7 != r0) goto L4f
                return r0
            L4f:
                r0 = r1
            L50:
                r7 = 0
                r0.resolve(r7)     // Catch: java.lang.Throwable -> L16
                goto L90
            L55:
                r0 = move-exception
                r5 = r0
                r0 = r7
                r7 = r5
            L59:
                r7.printStackTrace()
                boolean r1 = r7 instanceof com.mrousavy.camera.AbstractC5296c
                if (r1 == 0) goto L63
                com.mrousavy.camera.c r7 = (com.mrousavy.camera.AbstractC5296c) r7
                goto L69
            L63:
                com.mrousavy.camera.a0 r1 = new com.mrousavy.camera.a0
                r1.<init>(r7)
                r7 = r1
            L69:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = r7.m25534a()
                r1.append(r2)
                r2 = 47
                r1.append(r2)
                java.lang.String r2 = r7.m25533b()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = r7.getMessage()
                java.lang.Throwable r7 = r7.getCause()
                r0.reject(r1, r2, r7)
            L90:
                kotlin.Unit r7 = kotlin.Unit.f25302a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.CameraViewModule.C5287e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    @InterfaceC9571e(m13987c = "com.mrousavy.camera.CameraViewModule$resumeRecording$1", m13986f = "CameraViewModule.kt", m13985l = {110, 112}, m13984m = "invokeSuspend")
    /* renamed from: com.mrousavy.camera.CameraViewModule$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C5288f extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        Object f15034j;

        /* renamed from: k */
        int f15035k;

        /* renamed from: m */
        final /* synthetic */ int f15037m;

        /* renamed from: n */
        final /* synthetic */ Promise f15038n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5288f(int i, Promise promise, Continuation<? super C5288f> continuation) {
            super(2, continuation);
            this.f15037m = i;
            this.f15038n = promise;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C5288f(this.f15037m, this.f15038n, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C5288f) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(7:1|(1:(1:(7:5|6|7|8|9|10|11)(2:20|21))(1:22))(2:32|(1:34))|23|24|25|(1:27)(5:28|8|9|10|11)|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
            r5 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
            r0 = r1;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p388vf.C13271b.m2873d()
                int r1 = r4.f15035k
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r0 = r4.f15034j
                com.facebook.react.bridge.Promise r0 = (com.facebook.react.bridge.Promise) r0
                pf.C11586t.m7586b(r5)     // Catch: java.lang.Throwable -> L16
                goto L44
            L16:
                r5 = move-exception
                goto L4b
            L18:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L20:
                pf.C11586t.m7586b(r5)
                goto L34
            L24:
                pf.C11586t.m7586b(r5)
                com.mrousavy.camera.CameraViewModule r5 = com.mrousavy.camera.CameraViewModule.this
                int r1 = r4.f15037m
                r4.f15035k = r3
                java.lang.Object r5 = com.mrousavy.camera.CameraViewModule.access$findCameraView(r5, r1, r4)
                if (r5 != r0) goto L34
                return r0
            L34:
                com.mrousavy.camera.j r5 = (com.mrousavy.camera.C5313j) r5
                com.facebook.react.bridge.Promise r1 = r4.f15038n
                r4.f15034j = r1     // Catch: java.lang.Throwable -> L49
                r4.f15035k = r2     // Catch: java.lang.Throwable -> L49
                java.lang.Object r5 = com.mrousavy.camera.C5324o.m25489b(r5, r4)     // Catch: java.lang.Throwable -> L49
                if (r5 != r0) goto L43
                return r0
            L43:
                r0 = r1
            L44:
                r5 = 0
                r0.resolve(r5)     // Catch: java.lang.Throwable -> L16
                goto L82
            L49:
                r5 = move-exception
                r0 = r1
            L4b:
                r5.printStackTrace()
                boolean r1 = r5 instanceof com.mrousavy.camera.AbstractC5296c
                if (r1 == 0) goto L55
                com.mrousavy.camera.c r5 = (com.mrousavy.camera.AbstractC5296c) r5
                goto L5b
            L55:
                com.mrousavy.camera.a0 r1 = new com.mrousavy.camera.a0
                r1.<init>(r5)
                r5 = r1
            L5b:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = r5.m25534a()
                r1.append(r2)
                r2 = 47
                r1.append(r2)
                java.lang.String r2 = r5.m25533b()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = r5.getMessage()
                java.lang.Throwable r5 = r5.getCause()
                r0.reject(r1, r2, r5)
            L82:
                kotlin.Unit r5 = kotlin.Unit.f25302a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.CameraViewModule.C5288f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    @InterfaceC9571e(m13987c = "com.mrousavy.camera.CameraViewModule$startRecording$1", m13986f = "CameraViewModule.kt", m13985l = {83, 85}, m13984m = "invokeSuspend")
    /* renamed from: com.mrousavy.camera.CameraViewModule$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C5289g extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        int f15039j;

        /* renamed from: l */
        final /* synthetic */ int f15041l;

        /* renamed from: m */
        final /* synthetic */ ReadableMap f15042m;

        /* renamed from: n */
        final /* synthetic */ Callback f15043n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5289g(int i, ReadableMap readableMap, Callback callback, Continuation<? super C5289g> continuation) {
            super(2, continuation);
            this.f15041l = i;
            this.f15042m = readableMap;
            this.f15043n = callback;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C5289g(this.f15041l, this.f15042m, this.f15043n, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C5289g) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            Object m2869d;
            m2869d = C13277d.m2869d();
            int i = this.f15039j;
            try {
            } catch (AbstractC5296c e) {
                this.f15043n.invoke(null, C0149a.m41059c(e.m25534a() + '/' + e.m25533b(), e.getMessage(), e, null, 8, null));
            } catch (Throwable th2) {
                this.f15043n.invoke(null, C0149a.m41059c("capture/unknown", "An unknown error occurred while trying to start a video recording! " + th2.getMessage(), th2, null, 8, null));
            }
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        C11586t.m7586b(obj);
                        return Unit.f25302a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C11586t.m7586b(obj);
            } else {
                C11586t.m7586b(obj);
                CameraViewModule cameraViewModule = CameraViewModule.this;
                int i2 = this.f15041l;
                this.f15039j = 1;
                obj = cameraViewModule.findCameraView(i2, this);
                if (obj == m2869d) {
                    return m2869d;
                }
            }
            C5313j c5313j = (C5313j) obj;
            ReadableMap readableMap = this.f15042m;
            Callback callback = this.f15043n;
            this.f15039j = 2;
            if (C5324o.m25488c(c5313j, readableMap, callback, this) == m2869d) {
                return m2869d;
            }
            return Unit.f25302a;
        }
    }

    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    @InterfaceC9571e(m13987c = "com.mrousavy.camera.CameraViewModule$stopRecording$1", m13986f = "CameraViewModule.kt", m13985l = {121, 123}, m13984m = "invokeSuspend")
    /* renamed from: com.mrousavy.camera.CameraViewModule$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C5290h extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        Object f15044j;

        /* renamed from: k */
        int f15045k;

        /* renamed from: m */
        final /* synthetic */ int f15047m;

        /* renamed from: n */
        final /* synthetic */ Promise f15048n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5290h(int i, Promise promise, Continuation<? super C5290h> continuation) {
            super(2, continuation);
            this.f15047m = i;
            this.f15048n = promise;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C5290h(this.f15047m, this.f15048n, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C5290h) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(7:1|(1:(1:(7:5|6|7|8|9|10|11)(2:20|21))(1:22))(2:32|(1:34))|23|24|25|(1:27)(5:28|8|9|10|11)|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
            r5 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
            r0 = r1;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p388vf.C13271b.m2873d()
                int r1 = r4.f15045k
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r0 = r4.f15044j
                com.facebook.react.bridge.Promise r0 = (com.facebook.react.bridge.Promise) r0
                pf.C11586t.m7586b(r5)     // Catch: java.lang.Throwable -> L16
                goto L44
            L16:
                r5 = move-exception
                goto L4b
            L18:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L20:
                pf.C11586t.m7586b(r5)
                goto L34
            L24:
                pf.C11586t.m7586b(r5)
                com.mrousavy.camera.CameraViewModule r5 = com.mrousavy.camera.CameraViewModule.this
                int r1 = r4.f15047m
                r4.f15045k = r3
                java.lang.Object r5 = com.mrousavy.camera.CameraViewModule.access$findCameraView(r5, r1, r4)
                if (r5 != r0) goto L34
                return r0
            L34:
                com.mrousavy.camera.j r5 = (com.mrousavy.camera.C5313j) r5
                com.facebook.react.bridge.Promise r1 = r4.f15048n
                r4.f15044j = r1     // Catch: java.lang.Throwable -> L49
                r4.f15045k = r2     // Catch: java.lang.Throwable -> L49
                java.lang.Object r5 = com.mrousavy.camera.C5324o.m25487d(r5, r4)     // Catch: java.lang.Throwable -> L49
                if (r5 != r0) goto L43
                return r0
            L43:
                r0 = r1
            L44:
                r5 = 0
                r0.resolve(r5)     // Catch: java.lang.Throwable -> L16
                goto L82
            L49:
                r5 = move-exception
                r0 = r1
            L4b:
                r5.printStackTrace()
                boolean r1 = r5 instanceof com.mrousavy.camera.AbstractC5296c
                if (r1 == 0) goto L55
                com.mrousavy.camera.c r5 = (com.mrousavy.camera.AbstractC5296c) r5
                goto L5b
            L55:
                com.mrousavy.camera.a0 r1 = new com.mrousavy.camera.a0
                r1.<init>(r5)
                r5 = r1
            L5b:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = r5.m25534a()
                r1.append(r2)
                r2 = 47
                r1.append(r2)
                java.lang.String r2 = r5.m25533b()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = r5.getMessage()
                java.lang.Throwable r5 = r5.getCause()
                r0.reject(r1, r2, r5)
            L82:
                kotlin.Unit r5 = kotlin.Unit.f25302a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.CameraViewModule.C5290h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    @InterfaceC9571e(m13987c = "com.mrousavy.camera.CameraViewModule$takePhoto$1", m13986f = "CameraViewModule.kt", m13985l = {72, 74}, m13984m = "invokeSuspend")
    /* renamed from: com.mrousavy.camera.CameraViewModule$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C5291i extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: j */
        Object f15049j;

        /* renamed from: k */
        int f15050k;

        /* renamed from: m */
        final /* synthetic */ int f15052m;

        /* renamed from: n */
        final /* synthetic */ Promise f15053n;

        /* renamed from: o */
        final /* synthetic */ ReadableMap f15054o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5291i(int i, Promise promise, ReadableMap readableMap, Continuation<? super C5291i> continuation) {
            super(2, continuation);
            this.f15052m = i;
            this.f15053n = promise;
            this.f15054o = readableMap;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C5291i(this.f15052m, this.f15053n, this.f15054o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C5291i) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(7:1|(1:(1:(6:5|6|7|8|9|10)(2:19|20))(1:21))(2:31|(1:33))|22|23|24|(1:26)(4:27|8|9|10)|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
            r5 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
            r0 = r1;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p388vf.C13271b.m2873d()
                int r1 = r4.f15050k
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r0 = r4.f15049j
                com.facebook.react.bridge.Promise r0 = (com.facebook.react.bridge.Promise) r0
                pf.C11586t.m7586b(r5)     // Catch: java.lang.Throwable -> L16
                goto L46
            L16:
                r5 = move-exception
                goto L4c
            L18:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L20:
                pf.C11586t.m7586b(r5)
                goto L34
            L24:
                pf.C11586t.m7586b(r5)
                com.mrousavy.camera.CameraViewModule r5 = com.mrousavy.camera.CameraViewModule.this
                int r1 = r4.f15052m
                r4.f15050k = r3
                java.lang.Object r5 = com.mrousavy.camera.CameraViewModule.access$findCameraView(r5, r1, r4)
                if (r5 != r0) goto L34
                return r0
            L34:
                com.mrousavy.camera.j r5 = (com.mrousavy.camera.C5313j) r5
                com.facebook.react.bridge.Promise r1 = r4.f15053n
                com.facebook.react.bridge.ReadableMap r3 = r4.f15054o
                r4.f15049j = r1     // Catch: java.lang.Throwable -> L4a
                r4.f15050k = r2     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r5 = com.mrousavy.camera.C5329p.m25479f(r5, r3, r4)     // Catch: java.lang.Throwable -> L4a
                if (r5 != r0) goto L45
                return r0
            L45:
                r0 = r1
            L46:
                r0.resolve(r5)     // Catch: java.lang.Throwable -> L16
                goto L83
            L4a:
                r5 = move-exception
                r0 = r1
            L4c:
                r5.printStackTrace()
                boolean r1 = r5 instanceof com.mrousavy.camera.AbstractC5296c
                if (r1 == 0) goto L56
                com.mrousavy.camera.c r5 = (com.mrousavy.camera.AbstractC5296c) r5
                goto L5c
            L56:
                com.mrousavy.camera.a0 r1 = new com.mrousavy.camera.a0
                r1.<init>(r5)
                r5 = r1
            L5c:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = r5.m25534a()
                r1.append(r2)
                r2 = 47
                r1.append(r2)
                java.lang.String r2 = r5.m25533b()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = r5.getMessage()
                java.lang.Throwable r5 = r5.getCause()
                r0.reject(r1, r2, r5)
            L83:
                kotlin.Unit r5 = kotlin.Unit.f25302a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.CameraViewModule.C5291i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraViewModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
        this.coroutineScope = C9824m0.m13174a(C9677b1.m13570a());
    }

    private final boolean canRequestPermission(String str) {
        PermissionAwareActivity permissionAwareActivity;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity instanceof PermissionAwareActivity) {
            permissionAwareActivity = (PermissionAwareActivity) currentActivity;
        } else {
            permissionAwareActivity = null;
        }
        if (permissionAwareActivity != null) {
            return permissionAwareActivity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object findCameraView(int i, Continuation<? super C5313j> continuation) {
        Continuation m2870c;
        Object m2869d;
        m2870c = C13272c.m2870c(continuation);
        C12968g c12968g = new C12968g(m2870c);
        UiThreadUtil.runOnUiThread(new RunnableC5284b(i, this, c12968g));
        Object m3570b = c12968g.m3570b();
        m2869d = C13277d.m2869d();
        if (m3570b == m2869d) {
            C9573g.m13976c(continuation);
        }
        return m3570b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean requestCameraPermission$lambda$1(int i, Promise promise, int i2, String[] strArr, int[] grantResults) {
        boolean z;
        int i3;
        C9612q.m13917h(promise, "$promise");
        C9612q.m13917h(strArr, "<anonymous parameter 1>");
        C9612q.m13917h(grantResults, "grantResults");
        if (i2 != i) {
            return false;
        }
        if (grantResults.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i3 = grantResults[0];
        } else {
            i3 = -1;
        }
        promise.resolve(EnumC14159f.f36433k.m545a(i3).m546b());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean requestMicrophonePermission$lambda$2(int i, Promise promise, int i2, String[] strArr, int[] grantResults) {
        boolean z;
        int i3;
        C9612q.m13917h(promise, "$promise");
        C9612q.m13917h(strArr, "<anonymous parameter 1>");
        C9612q.m13917h(grantResults, "grantResults");
        if (i2 != i) {
            return false;
        }
        if (grantResults.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i3 = grantResults[0];
        } else {
            i3 = -1;
        }
        promise.resolve(EnumC14159f.f36433k.m545a(i3).m546b());
        return true;
    }

    @ReactMethod
    public final void focus(int i, ReadableMap point, Promise promise) {
        C9612q.m13917h(point, "point");
        C9612q.m13917h(promise, "promise");
        C9818l.m13179d(this.coroutineScope, null, null, new C5285c(i, promise, point, null), 3, null);
    }

    @ReactMethod
    public final void getAvailableCameraDevices(Promise promise) {
        C9612q.m13917h(promise, "promise");
        C9818l.m13179d(this.coroutineScope, null, null, new C5286d(promise, this, null), 3, null);
    }

    @ReactMethod
    public final void getCameraPermissionStatus(Promise promise) {
        C9612q.m13917h(promise, "promise");
        EnumC14159f m545a = EnumC14159f.f36433k.m545a(C0946a.m38403a(getReactApplicationContext(), "android.permission.CAMERA"));
        if (m545a == EnumC14159f.DENIED && canRequestPermission("android.permission.CAMERA")) {
            m545a = EnumC14159f.NOT_DETERMINED;
        }
        promise.resolve(m545a.m546b());
    }

    @ReactMethod
    public final void getMicrophonePermissionStatus(Promise promise) {
        C9612q.m13917h(promise, "promise");
        EnumC14159f m545a = EnumC14159f.f36433k.m545a(C0946a.m38403a(getReactApplicationContext(), "android.permission.RECORD_AUDIO"));
        if (m545a == EnumC14159f.DENIED && canRequestPermission("android.permission.RECORD_AUDIO")) {
            m545a = EnumC14159f.NOT_DETERMINED;
        }
        promise.resolve(m545a.m546b());
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CameraView";
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final boolean installFrameProcessorBindings() {
        try {
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
            VisionCameraInstaller.install(new VisionCameraProxy(reactApplicationContext));
            return true;
        } catch (Error e) {
            Log.e("CameraView", "Failed to install Frame Processor JSI Bindings!", e);
            return false;
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        super.invalidate();
        if (C9824m0.m13167h(this.coroutineScope)) {
            C9824m0.m13170e(this.coroutineScope, "CameraViewModule has been destroyed.", null, 2, null);
        }
    }

    @ReactMethod
    public final void pauseRecording(int i, Promise promise) {
        C9612q.m13917h(promise, "promise");
        C9818l.m13179d(this.coroutineScope, null, null, new C5287e(promise, this, i, null), 3, null);
    }

    @ReactMethod
    public final void requestCameraPermission(final Promise promise) {
        C9612q.m13917h(promise, "promise");
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity instanceof PermissionAwareActivity) {
            final int i = RequestCode;
            RequestCode = i + 1;
            ((PermissionAwareActivity) currentActivity).requestPermissions(new String[]{"android.permission.CAMERA"}, i, new PermissionListener() { // from class: com.mrousavy.camera.k
                @Override // com.facebook.react.modules.core.PermissionListener
                public final boolean onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
                    boolean requestCameraPermission$lambda$1;
                    requestCameraPermission$lambda$1 = CameraViewModule.requestCameraPermission$lambda$1(i, promise, i2, strArr, iArr);
                    return requestCameraPermission$lambda$1;
                }
            });
            return;
        }
        promise.reject("NO_ACTIVITY", "No PermissionAwareActivity was found! Make sure the app has launched before calling this function.");
    }

    @ReactMethod
    public final void requestMicrophonePermission(final Promise promise) {
        C9612q.m13917h(promise, "promise");
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity instanceof PermissionAwareActivity) {
            final int i = RequestCode;
            RequestCode = i + 1;
            ((PermissionAwareActivity) currentActivity).requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, i, new PermissionListener() { // from class: com.mrousavy.camera.l
                @Override // com.facebook.react.modules.core.PermissionListener
                public final boolean onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
                    boolean requestMicrophonePermission$lambda$2;
                    requestMicrophonePermission$lambda$2 = CameraViewModule.requestMicrophonePermission$lambda$2(i, promise, i2, strArr, iArr);
                    return requestMicrophonePermission$lambda$2;
                }
            });
            return;
        }
        promise.reject("NO_ACTIVITY", "No PermissionAwareActivity was found! Make sure the app has launched before calling this function.");
    }

    @ReactMethod
    public final void resumeRecording(int i, Promise promise) {
        C9612q.m13917h(promise, "promise");
        C9818l.m13179d(this.coroutineScope, null, null, new C5288f(i, promise, null), 3, null);
    }

    @ReactMethod
    public final void startRecording(int i, ReadableMap options, Callback onRecordCallback) {
        C9612q.m13917h(options, "options");
        C9612q.m13917h(onRecordCallback, "onRecordCallback");
        C9818l.m13179d(this.coroutineScope, null, null, new C5289g(i, options, onRecordCallback, null), 3, null);
    }

    @ReactMethod
    public final void stopRecording(int i, Promise promise) {
        C9612q.m13917h(promise, "promise");
        C9818l.m13179d(this.coroutineScope, null, null, new C5290h(i, promise, null), 3, null);
    }

    @ReactMethod
    public final void takePhoto(int i, ReadableMap options, Promise promise) {
        C9612q.m13917h(options, "options");
        C9612q.m13917h(promise, "promise");
        C9818l.m13179d(this.coroutineScope, null, null, new C5291i(i, promise, options, null), 3, null);
    }
}
