package com.mrousavy.camera;

import android.os.Handler;
import android.os.HandlerThread;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C9840p1;
import kotlinx.coroutines.CoroutineDispatcher;
import vi.AbstractC13340e;
import vi.C13341f;

@Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m14357d2 = {"Lcom/mrousavy/camera/g;", "", "a", "b", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.mrousavy.camera.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5308g {

    /* renamed from: a */
    public static final C5310b f15086a = new C5310b(null);

    /* renamed from: b */
    private static final C5309a f15087b = new C5309a("mrousavy/VisionCamera.main");

    /* renamed from: c */
    private static final C5309a f15088c = new C5309a("mrousavy/VisionCamera.video");

    @Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0004R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015¨\u0006\u001b"}, m14357d2 = {"Lcom/mrousavy/camera/g$a;", "", "", "finalize", "Landroid/os/Handler;", "a", "Landroid/os/Handler;", "c", "()Landroid/os/Handler;", "handler", "Landroid/os/HandlerThread;", "b", "Landroid/os/HandlerThread;", "thread", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/Executor;", "()Ljava/util/concurrent/Executor;", "executor", "Lkotlinx/coroutines/CoroutineDispatcher;", "d", "Lkotlinx/coroutines/CoroutineDispatcher;", "()Lkotlinx/coroutines/CoroutineDispatcher;", "coroutineDispatcher", "", ZeroconfModule.KEY_SERVICE_NAME, "<init>", "(Ljava/lang/String;)V", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.mrousavy.camera.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5309a {

        /* renamed from: a */
        private final Handler f15089a;

        /* renamed from: b */
        private final HandlerThread f15090b;

        /* renamed from: c */
        private final Executor f15091c;

        /* renamed from: d */
        private final CoroutineDispatcher f15092d;

        public C5309a(String name) {
            C9612q.m13917h(name, "name");
            HandlerThread handlerThread = new HandlerThread(name);
            this.f15090b = handlerThread;
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            this.f15089a = handler;
            AbstractC13340e m2758b = C13341f.m2758b(handler, name);
            this.f15092d = m2758b;
            this.f15091c = C9840p1.m13117a(m2758b);
        }

        /* renamed from: a */
        public final CoroutineDispatcher m25514a() {
            return this.f15092d;
        }

        /* renamed from: b */
        public final Executor m25513b() {
            return this.f15091c;
        }

        /* renamed from: c */
        public final Handler m25512c() {
            return this.f15089a;
        }

        protected final void finalize() {
            this.f15090b.quitSafely();
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\u000b"}, m14357d2 = {"Lcom/mrousavy/camera/g$b;", "", "Lcom/mrousavy/camera/g$a;", "cameraQueue", "Lcom/mrousavy/camera/g$a;", "a", "()Lcom/mrousavy/camera/g$a;", "videoQueue", "b", "<init>", "()V", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.mrousavy.camera.g$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5310b {
        private C5310b() {
        }

        public /* synthetic */ C5310b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C5309a m25511a() {
            return C5308g.f15087b;
        }

        /* renamed from: b */
        public final C5309a m25510b() {
            return C5308g.f15088c;
        }
    }
}
