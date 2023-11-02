package com.mrousavy.camera;

import ae.C0149a;
import android.annotation.SuppressLint;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9570d;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import org.webrtc.MediaStreamTrack;
import p388vf.C13277d;
import p405wd.C13526n;

@Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a'\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\b\u001a\u00020\u0005*\u00020\u0000H\u0087@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u0005*\u00020\u0000H\u0087@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\t\u001a\u0017\u0010\u000b\u001a\u00020\u0005*\u00020\u0000H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m14357d2 = {"Lcom/mrousavy/camera/j;", "Lcom/facebook/react/bridge/ReadableMap;", "options", "Lcom/facebook/react/bridge/Callback;", "onRecordCallback", "", "c", "(Lcom/mrousavy/camera/j;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "(Lcom/mrousavy/camera/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "d", "react-native-vision-camera_release"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: com.mrousavy.camera.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5324o {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    @InterfaceC9571e(m13987c = "com.mrousavy.camera.CameraView_RecordVideoKt", m13986f = "CameraView+RecordVideo.kt", m13985l = {26, 47}, m13984m = "startRecording")
    /* renamed from: com.mrousavy.camera.o$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5325a extends AbstractC9570d {

        /* renamed from: j */
        Object f15133j;

        /* renamed from: k */
        Object f15134k;

        /* renamed from: l */
        Object f15135l;

        /* renamed from: m */
        /* synthetic */ Object f15136m;

        /* renamed from: n */
        int f15137n;

        C5325a(Continuation<? super C5325a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            this.f15136m = obj;
            this.f15137n |= Integer.MIN_VALUE;
            return C5324o.m25488c(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"Lwd/n$b;", MediaStreamTrack.VIDEO_TRACK_KIND, "", "a", "(Lwd/n$b;)V"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: com.mrousavy.camera.o$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5326b extends AbstractC9614s implements Function1<C13526n.C13528b, Unit> {

        /* renamed from: j */
        final /* synthetic */ Callback f15138j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5326b(Callback callback) {
            super(1);
            this.f15138j = callback;
        }

        /* renamed from: a */
        public final void m25486a(C13526n.C13528b video) {
            C9612q.m13917h(video, "video");
            WritableMap createMap = Arguments.createMap();
            createMap.putString("path", video.m2294b());
            createMap.putDouble("duration", video.m2295a() / 1000.0d);
            this.f15138j.invoke(createMap, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C13526n.C13528b c13528b) {
            m25486a(c13528b);
            return Unit.f25302a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"Lcom/mrousavy/camera/y;", "error", "", "a", "(Lcom/mrousavy/camera/y;)V"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: com.mrousavy.camera.o$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5327c extends AbstractC9614s implements Function1<C5341y, Unit> {

        /* renamed from: j */
        final /* synthetic */ Callback f15139j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5327c(Callback callback) {
            super(1);
            this.f15139j = callback;
        }

        /* renamed from: a */
        public final void m25485a(C5341y error) {
            C9612q.m13917h(error, "error");
            this.f15139j.invoke(null, C0149a.m41059c(C5334r.m25477a(error), error.getMessage(), null, null, 12, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C5341y c5341y) {
            m25485a(c5341y);
            return Unit.f25302a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    @InterfaceC9571e(m13987c = "com.mrousavy.camera.CameraView_RecordVideoKt", m13986f = "CameraView+RecordVideo.kt", m13985l = {62, 63}, m13984m = "stopRecording")
    /* renamed from: com.mrousavy.camera.o$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5328d extends AbstractC9570d {

        /* renamed from: j */
        Object f15140j;

        /* renamed from: k */
        /* synthetic */ Object f15141k;

        /* renamed from: l */
        int f15142l;

        C5328d(Continuation<? super C5328d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            this.f15141k = obj;
            this.f15142l |= Integer.MIN_VALUE;
            return C5324o.m25487d(null, this);
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: a */
    public static final Object m25490a(C5313j c5313j, Continuation<? super Unit> continuation) {
        Object m2869d;
        Object m2321t0 = c5313j.getCameraSession$react_native_vision_camera_release().m2321t0(continuation);
        m2869d = C13277d.m2869d();
        return m2321t0 == m2869d ? m2321t0 : Unit.f25302a;
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: b */
    public static final Object m25489b(C5313j c5313j, Continuation<? super Unit> continuation) {
        Object m2869d;
        Object m2319w0 = c5313j.getCameraSession$react_native_vision_camera_release().m2319w0(continuation);
        m2869d = C13277d.m2869d();
        return m2319w0 == m2869d ? m2319w0 : Unit.f25302a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e8 A[RETURN] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m25488c(com.mrousavy.camera.C5313j r9, com.facebook.react.bridge.ReadableMap r10, com.facebook.react.bridge.Callback r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.C5324o.m25488c(com.mrousavy.camera.j, com.facebook.react.bridge.ReadableMap, com.facebook.react.bridge.Callback, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067 A[RETURN] */
    @android.annotation.SuppressLint({"RestrictedApi"})
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m25487d(com.mrousavy.camera.C5313j r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            boolean r0 = r6 instanceof com.mrousavy.camera.C5324o.C5328d
            if (r0 == 0) goto L13
            r0 = r6
            com.mrousavy.camera.o$d r0 = (com.mrousavy.camera.C5324o.C5328d) r0
            int r1 = r0.f15142l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15142l = r1
            goto L18
        L13:
            com.mrousavy.camera.o$d r0 = new com.mrousavy.camera.o$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f15141k
            java.lang.Object r1 = p388vf.C13271b.m2873d()
            int r2 = r0.f15142l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            pf.C11586t.m7586b(r6)
            goto L68
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.f15140j
            com.mrousavy.camera.j r5 = (com.mrousavy.camera.C5313j) r5
            pf.C11586t.m7586b(r6)
            goto L4e
        L3c:
            pf.C11586t.m7586b(r6)
            wd.g r6 = r5.getCameraSession$react_native_vision_camera_release()
            r0.f15140j = r5
            r0.f15142l = r4
            java.lang.Object r6 = r6.m2344H0(r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            wd.g r6 = r5.getCameraSession$react_native_vision_camera_release()
            zd.i r5 = r5.getTorch()
            zd.i r2 = p465zd.EnumC14166i.ON
            if (r5 != r2) goto L5b
            goto L5c
        L5b:
            r4 = 0
        L5c:
            r5 = 0
            r0.f15140j = r5
            r0.f15142l = r3
            java.lang.Object r5 = r6.m2349D0(r4, r0)
            if (r5 != r1) goto L68
            return r1
        L68:
            kotlin.Unit r5 = kotlin.Unit.f25302a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.C5324o.m25487d(com.mrousavy.camera.j, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
