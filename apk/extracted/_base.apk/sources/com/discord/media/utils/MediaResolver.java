package com.discord.media.utils;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.discord.crash_reporting.CrashReporting;
import java.io.File;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C9677b1;
import kotlinx.coroutines.C9810j;
import p304qf.C11889v;
import p388vf.C13277d;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 22\u00020\u0001:\u00012B)\u0012\u0006\u0010!\u001a\u00020 \u0012\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020#¢\u0006\u0004\b0\u00101J\u0013\u0010\u0003\u001a\u00020\u0002H\u0083@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J5\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R&\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010'\u001a\n &*\u0004\u0018\u00010\u00110\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0018\u0010/\u001a\u00020\u0015*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"}, m14357d2 = {"Lcom/discord/media/utils/MediaResolver;", "", "", "checkFreeSpace", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/net/Uri;", "inputUri", "Lcom/discord/media/utils/VideoCompressionQuality;", "compressionQuality", "handleVideo", "(Landroid/net/Uri;Lcom/discord/media/utils/VideoCompressionQuality;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "isLowQuality", "handleImage", "(Landroid/net/Uri;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uri", "Ljava/io/File;", "targetFile", "copyToFile", "(Landroid/net/Uri;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "tag", "message", "outputUri", "logMediaError", "getMimeType", "cancel", "imageCompressionQuality", "videoCompressionQuality", "resolveToUri", "(Landroid/net/Uri;ILcom/discord/media/utils/VideoCompressionQuality;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lkotlin/Function2;", "onProgress", "Lkotlin/jvm/functions/Function2;", "kotlin.jvm.PlatformType", "cacheDir", "Ljava/io/File;", "Landroid/content/ContentResolver;", "getResolver", "()Landroid/content/ContentResolver;", "resolver", "getRequestId", "(Landroid/net/Uri;)Ljava/lang/String;", "requestId", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function2;)V", "Companion", "media_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class MediaResolver {
    @Deprecated
    public static final double FREE_SPACE_PERCENT = 0.2d;
    private final File cacheDir;
    private final Context context;
    private final Function2<Uri, Integer, Unit> onProgress;
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final long HALF_DAY_MILLIS = TimeUnit.HOURS.toMillis(12);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m14357d2 = {"Lcom/discord/media/utils/MediaResolver$Companion;", "", "()V", "FREE_SPACE_PERCENT", "", "HALF_DAY_MILLIS", "", "getHALF_DAY_MILLIS", "()J", "media_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long getHALF_DAY_MILLIS() {
            return MediaResolver.HALF_DAY_MILLIS;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MediaResolver(Context context, Function2<? super Uri, ? super Integer, Unit> onProgress) {
        C9612q.m13917h(context, "context");
        C9612q.m13917h(onProgress, "onProgress");
        this.context = context;
        this.onProgress = onProgress;
        this.cacheDir = context.getCacheDir();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"UsableSpace"})
    public final Object checkFreeSpace(Continuation<? super Unit> continuation) {
        Object m2869d;
        Object m13190g = C9810j.m13190g(C9677b1.m13569b(), new MediaResolver$checkFreeSpace$2(this, null), continuation);
        m2869d = C13277d.m2869d();
        return m13190g == m2869d ? m13190g : Unit.f25302a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object copyToFile(Uri uri, File file, Continuation<? super Uri> continuation) {
        return C9810j.m13190g(C9677b1.m13569b(), new MediaResolver$copyToFile$2(file, this, uri, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object copyToFile$default(MediaResolver mediaResolver, Uri uri, File file, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            file = null;
        }
        return mediaResolver.copyToFile(uri, file, continuation);
    }

    private final String getRequestId(Uri uri) {
        String uri2 = uri.toString();
        C9612q.m13918g(uri2, "toString()");
        return uri2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContentResolver getResolver() {
        ContentResolver contentResolver = this.context.getContentResolver();
        C9612q.m13918g(contentResolver, "context.contentResolver");
        return contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object handleImage(android.net.Uri r11, int r12, boolean r13, kotlin.coroutines.Continuation<? super android.net.Uri> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.discord.media.utils.MediaResolver$handleImage$1
            if (r0 == 0) goto L13
            r0 = r14
            com.discord.media.utils.MediaResolver$handleImage$1 r0 = (com.discord.media.utils.MediaResolver$handleImage$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.discord.media.utils.MediaResolver$handleImage$1 r0 = new com.discord.media.utils.MediaResolver$handleImage$1
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r9 = p388vf.C13271b.m2873d()
            int r1 = r0.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L41
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2d
            pf.C11586t.m7586b(r14)
            goto Lad
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            java.lang.Object r11 = r0.L$1
            android.net.Uri r11 = (android.net.Uri) r11
            java.lang.Object r12 = r0.L$0
            com.discord.media.utils.MediaResolver r12 = (com.discord.media.utils.MediaResolver) r12
            pf.C11586t.m7586b(r14)
            goto L87
        L41:
            pf.C11586t.m7586b(r14)
            android.content.ContentResolver r14 = r10.getResolver()
            com.discord.media.utils.ContentResolverUtils r1 = com.discord.media.utils.ContentResolverUtils.INSTANCE
            boolean r4 = r1.isHeif(r14, r11)
            r5 = 0
            if (r4 != 0) goto L62
            boolean r4 = r1.isJpeg(r14, r11)
            if (r4 != 0) goto L62
            if (r13 == 0) goto L60
            boolean r14 = r1.isPng(r14, r11)
            if (r14 == 0) goto L60
            goto L62
        L60:
            r14 = r5
            goto L63
        L62:
            r14 = r3
        L63:
            if (r14 == 0) goto L68
            if (r13 == 0) goto L68
            r5 = r3
        L68:
            if (r14 == 0) goto L9e
            we.a r1 = p406we.C13530a.f34894a
            android.content.Context r2 = r10.context
            r4 = 0
            com.discord.media.utils.MediaResolver$handleImage$compressed$1 r13 = new com.discord.media.utils.MediaResolver$handleImage$compressed$1
            r13.<init>(r12, r5)
            r7 = 4
            r8 = 0
            r0.L$0 = r10
            r0.L$1 = r11
            r0.label = r3
            r3 = r11
            r5 = r13
            r6 = r0
            java.lang.Object r14 = p406we.C13530a.m2292b(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r14 != r9) goto L86
            return r9
        L86:
            r12 = r10
        L87:
            java.io.File r14 = (java.io.File) r14
            kotlin.jvm.functions.Function2<android.net.Uri, java.lang.Integer, kotlin.Unit> r12 = r12.onProgress
            r13 = 100
            java.lang.Integer r13 = kotlin.coroutines.jvm.internal.C9568b.m13989c(r13)
            r12.invoke(r11, r13)
            android.net.Uri r11 = android.net.Uri.fromFile(r14)
            java.lang.String r12 = "fromFile(this)"
            kotlin.jvm.internal.C9612q.m13918g(r11, r12)
            return r11
        L9e:
            r3 = 0
            r5 = 2
            r6 = 0
            r0.label = r2
            r1 = r10
            r2 = r11
            r4 = r0
            java.lang.Object r14 = copyToFile$default(r1, r2, r3, r4, r5, r6)
            if (r14 != r9) goto Lad
            return r9
        Lad:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.media.utils.MediaResolver.handleImage(android.net.Uri, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object handleVideo(android.net.Uri r19, com.discord.media.utils.VideoCompressionQuality r20, kotlin.coroutines.Continuation<? super android.net.Uri> r21) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.media.utils.MediaResolver.handleVideo(android.net.Uri, com.discord.media.utils.VideoCompressionQuality, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void logMediaError(String str, String str2, Uri uri, Uri uri2) {
        Map m6751k;
        CrashReporting crashReporting = CrashReporting.INSTANCE;
        m6751k = C11889v.m6751k(C11591x.m7577a("inputUri", uri.toString()), C11591x.m7577a("outputUri", uri2.toString()));
        CrashReporting.addBreadcrumb$default(crashReporting, str2, m6751k, null, 4, null);
        crashReporting.captureMessage(str, str2, CrashReporting.ErrorLevel.WARNING);
    }

    public final void cancel(Uri inputUri) {
        C9612q.m13917h(inputUri, "inputUri");
        Transcoder.INSTANCE.cancel(getRequestId(inputUri));
    }

    public final String getMimeType(Uri uri) {
        C9612q.m13917h(uri, "uri");
        return getResolver().getType(uri);
    }

    public final Object resolveToUri(Uri uri, int i, VideoCompressionQuality videoCompressionQuality, boolean z, Continuation<? super Uri> continuation) {
        return C9810j.m13190g(C9677b1.m13569b(), new MediaResolver$resolveToUri$2(this, uri, videoCompressionQuality, i, z, null), continuation);
    }
}
