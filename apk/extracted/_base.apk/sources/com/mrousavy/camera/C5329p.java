package com.mrousavy.camera;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.DngCreator;
import com.facebook.react.util.JSStackTrace;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9570d;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.CoroutineScope;
import p388vf.C13277d;
import p405wd.C13495g;
import p467zf.C14180c;
import pf.C11586t;

@Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002\u001a+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0010H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, m14357d2 = {"Lcom/mrousavy/camera/j;", "Lcom/facebook/react/bridge/ReadableMap;", "optionsMap", "Lcom/facebook/react/bridge/WritableMap;", "f", "(Lcom/mrousavy/camera/j;Lcom/facebook/react/bridge/ReadableMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwd/g$a;", "photo", "Ljava/io/File;", JSStackTrace.FILE_KEY, "", "g", "Landroid/content/Context;", "context", "Landroid/hardware/camera2/CameraCharacteristics;", "cameraCharacteristics", "", "e", "(Landroid/content/Context;Landroid/hardware/camera2/CameraCharacteristics;Lwd/g$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "extension", "d", "react-native-vision-camera_release"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: com.mrousavy.camera.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5329p {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    @InterfaceC9571e(m13987c = "com.mrousavy.camera.CameraView_TakePhotoKt", m13986f = "CameraView+TakePhoto.kt", m13985l = {89}, m13984m = "savePhotoToFile")
    /* renamed from: com.mrousavy.camera.p$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5330a extends AbstractC9570d {

        /* renamed from: j */
        /* synthetic */ Object f15143j;

        /* renamed from: k */
        int f15144k;

        C5330a(Continuation<? super C5330a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            this.f15143j = obj;
            this.f15144k |= Integer.MIN_VALUE;
            return C5329p.m25480e(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "kotlin.jvm.PlatformType", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    @InterfaceC9571e(m13987c = "com.mrousavy.camera.CameraView_TakePhotoKt$savePhotoToFile$2", m13986f = "CameraView+TakePhoto.kt", m13985l = {}, m13984m = "invokeSuspend")
    /* renamed from: com.mrousavy.camera.p$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5331b extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super String>, Object> {

        /* renamed from: j */
        int f15145j;

        /* renamed from: k */
        final /* synthetic */ C13495g.C13496a f15146k;

        /* renamed from: l */
        final /* synthetic */ Context f15147l;

        /* renamed from: m */
        final /* synthetic */ CameraCharacteristics f15148m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5331b(C13495g.C13496a c13496a, Context context, CameraCharacteristics cameraCharacteristics, Continuation<? super C5331b> continuation) {
            super(2, continuation);
            this.f15146k = c13496a;
            this.f15147l = context;
            this.f15148m = cameraCharacteristics;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C5331b(this.f15146k, this.f15147l, this.f15148m, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((C5331b) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            C13277d.m2869d();
            if (this.f15145j == 0) {
                C11586t.m7586b(obj);
                int m2318a = this.f15146k.m2318a();
                if (m2318a != 32) {
                    if (m2318a != 256 && m2318a != 1768253795) {
                        throw new Error("Failed to save Photo to file, image format is not supported! " + this.f15146k.m2318a());
                    }
                    File m25481d = C5329p.m25481d(this.f15147l, ".jpg");
                    C5329p.m25478g(this.f15146k, m25481d);
                    return m25481d.getAbsolutePath();
                }
                DngCreator dngCreator = new DngCreator(this.f15148m, this.f15146k.m2316i());
                File m25481d2 = C5329p.m25481d(this.f15147l, ".dng");
                FileOutputStream fileOutputStream = new FileOutputStream(m25481d2);
                try {
                    dngCreator.writeImage(fileOutputStream, this.f15146k.m2317h());
                    Unit unit = Unit.f25302a;
                    C14180c.m514a(fileOutputStream, null);
                    return m25481d2.getAbsolutePath();
                } finally {
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    @InterfaceC9571e(m13987c = "com.mrousavy.camera.CameraView_TakePhotoKt", m13986f = "CameraView+TakePhoto.kt", m13985l = {39, 51}, m13984m = "takePhoto")
    /* renamed from: com.mrousavy.camera.p$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5332c extends AbstractC9570d {

        /* renamed from: j */
        Object f15149j;

        /* renamed from: k */
        Object f15150k;

        /* renamed from: l */
        /* synthetic */ Object f15151l;

        /* renamed from: m */
        int f15152m;

        C5332c(Continuation<? super C5332c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
        public final Object invokeSuspend(Object obj) {
            this.f15151l = obj;
            this.f15152m |= Integer.MIN_VALUE;
            return C5329p.m25479f(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final File m25481d(Context context, String str) {
        File createTempFile = File.createTempFile("mrousavy", str, context.getCacheDir());
        createTempFile.deleteOnExit();
        C9612q.m13918g(createTempFile, "createTempFile(\"mrousavy….apply { deleteOnExit() }");
        return createTempFile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m25480e(android.content.Context r5, android.hardware.camera2.CameraCharacteristics r6, p405wd.C13495g.C13496a r7, kotlin.coroutines.Continuation<? super java.lang.String> r8) {
        /*
            boolean r0 = r8 instanceof com.mrousavy.camera.C5329p.C5330a
            if (r0 == 0) goto L13
            r0 = r8
            com.mrousavy.camera.p$a r0 = (com.mrousavy.camera.C5329p.C5330a) r0
            int r1 = r0.f15144k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15144k = r1
            goto L18
        L13:
            com.mrousavy.camera.p$a r0 = new com.mrousavy.camera.p$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f15143j
            java.lang.Object r1 = p388vf.C13271b.m2873d()
            int r2 = r0.f15144k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            pf.C11586t.m7586b(r8)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            pf.C11586t.m7586b(r8)
            kotlinx.coroutines.CoroutineDispatcher r8 = kotlinx.coroutines.C9677b1.m13569b()
            com.mrousavy.camera.p$b r2 = new com.mrousavy.camera.p$b
            r4 = 0
            r2.<init>(r7, r5, r6, r4)
            r0.f15144k = r3
            java.lang.Object r8 = kotlinx.coroutines.C9810j.m13190g(r8, r2, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            java.lang.String r5 = "context: Context,\n      …rmat}\")\n      }\n    }\n  }"
            kotlin.jvm.internal.C9612q.m13918g(r8, r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.C5329p.m25480e(android.content.Context, android.hardware.camera2.CameraCharacteristics, wd.g$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0147 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019a  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    @android.annotation.SuppressLint({"UnsafeOptInUsageError"})
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m25479f(com.mrousavy.camera.C5313j r16, com.facebook.react.bridge.ReadableMap r17, kotlin.coroutines.Continuation<? super com.facebook.react.bridge.WritableMap> r18) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrousavy.camera.C5329p.m25479f(com.mrousavy.camera.j, com.facebook.react.bridge.ReadableMap, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m25478g(C13495g.C13496a c13496a, File file) {
        ByteBuffer buffer = c13496a.m2317h().getPlanes()[0].getBuffer();
        if (c13496a.m2314m()) {
            int remaining = buffer.remaining();
            byte[] bArr = new byte[remaining];
            buffer.get(bArr);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, remaining);
            Matrix matrix = new Matrix();
            matrix.preScale(-1.0f, 1.0f);
            Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                createBitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                C14180c.m514a(fileOutputStream, null);
                return;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    C14180c.m514a(fileOutputStream, th2);
                    throw th3;
                }
            }
        }
        FileChannel channel = new FileOutputStream(file).getChannel();
        channel.write(buffer);
        channel.close();
    }
}
