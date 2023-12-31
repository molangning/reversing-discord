package com.discord.file_manager;

import com.facebook.react.bridge.Promise;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m14358d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.file_manager.FileManagerModule$readAsset$1", m13986f = "FileManagerModule.kt", m13985l = {}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
final class FileManagerModule$readAsset$1 extends AbstractC9578k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $assetUri;
    final /* synthetic */ String $encoding;
    final /* synthetic */ Promise $promise;
    int label;
    final /* synthetic */ FileManagerModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileManagerModule$readAsset$1(String str, FileManagerModule fileManagerModule, String str2, Promise promise, Continuation<? super FileManagerModule$readAsset$1> continuation) {
        super(2, continuation);
        this.$assetUri = str;
        this.this$0 = fileManagerModule;
        this.$encoding = str2;
        this.$promise = promise;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FileManagerModule$readAsset$1(this.$assetUri, this.this$0, this.$encoding, this.$promise, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FileManagerModule$readAsset$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25302a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0094 A[Catch: all -> 0x009e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00ca, blocks: (B:5:0x000a, B:7:0x0016, B:12:0x0025, B:14:0x002d, B:40:0x00a6, B:42:0x00b3, B:43:0x00be, B:45:0x00c2, B:46:0x00c6, B:15:0x0039, B:18:0x0042, B:21:0x004c, B:23:0x0055, B:24:0x005b, B:26:0x0061, B:27:0x007d, B:28:0x0088, B:29:0x0089, B:32:0x0094), top: B:54:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b3 A[Catch: all -> 0x00ca, TryCatch #2 {all -> 0x00ca, blocks: (B:5:0x000a, B:7:0x0016, B:12:0x0025, B:14:0x002d, B:40:0x00a6, B:42:0x00b3, B:43:0x00be, B:45:0x00c2, B:46:0x00c6, B:15:0x0039, B:18:0x0042, B:21:0x004c, B:23:0x0055, B:24:0x005b, B:26:0x0061, B:27:0x007d, B:28:0x0088, B:29:0x0089, B:32:0x0094), top: B:54:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be A[Catch: all -> 0x00ca, TryCatch #2 {all -> 0x00ca, blocks: (B:5:0x000a, B:7:0x0016, B:12:0x0025, B:14:0x002d, B:40:0x00a6, B:42:0x00b3, B:43:0x00be, B:45:0x00c2, B:46:0x00c6, B:15:0x0039, B:18:0x0042, B:21:0x004c, B:23:0x0055, B:24:0x005b, B:26:0x0061, B:27:0x007d, B:28:0x0088, B:29:0x0089, B:32:0x0094), top: B:54:0x000a }] */
    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            p388vf.C13271b.m2873d()
            int r0 = r6.label
            if (r0 != 0) goto Ld3
            pf.C11586t.m7586b(r7)
            java.lang.String r7 = r6.$assetUri     // Catch: java.lang.Throwable -> Lca
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r0 = r7.getScheme()     // Catch: java.lang.Throwable -> Lca
            if (r0 == 0) goto L89
            int r1 = r0.hashCode()     // Catch: java.lang.Throwable -> Lca
            r2 = 3143036(0x2ff57c, float:4.404332E-39)
            if (r1 == r2) goto L39
            r7 = 3213448(0x310888, float:4.503E-39)
            if (r1 == r7) goto L25
            goto L89
        L25:
            java.lang.String r7 = "http"
            boolean r7 = r0.equals(r7)     // Catch: java.lang.Throwable -> Lca
            if (r7 == 0) goto L89
            java.net.URL r7 = new java.net.URL     // Catch: java.lang.Throwable -> Lca
            java.lang.String r0 = r6.$assetUri     // Catch: java.lang.Throwable -> Lca
            r7.<init>(r0)     // Catch: java.lang.Throwable -> Lca
            java.io.InputStream r7 = r7.openStream()     // Catch: java.lang.Throwable -> Lca
            goto L91
        L39:
            java.lang.String r1 = "file"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> Lca
            if (r0 != 0) goto L42
            goto L89
        L42:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> Lca
            java.lang.String r1 = r7.getPath()     // Catch: java.lang.Throwable -> Lca
            if (r1 != 0) goto L4c
            java.lang.String r1 = ""
        L4c:
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lca
            boolean r1 = r0.exists()     // Catch: java.lang.Throwable -> Lca
            if (r1 == 0) goto L5b
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Lca
            r7.<init>(r0)     // Catch: java.lang.Throwable -> Lca
            goto L91
        L5b:
            java.lang.String r0 = r7.getLastPathSegment()     // Catch: java.lang.Throwable -> Lca
            if (r0 == 0) goto L7d
            com.discord.file_manager.FileManagerModule r7 = r6.this$0     // Catch: java.lang.Throwable -> Lca
            java.lang.String r1 = "."
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> Lca
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            java.util.List r0 = kotlin.text.C9642f.m13784z0(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lca
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> Lca
            java.io.InputStream r7 = r7.openRawResource(r0)     // Catch: java.lang.Throwable -> Lca
            goto L91
        L7d:
            java.lang.String r7 = "Could not find asset"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lca
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Lca
            r0.<init>(r7)     // Catch: java.lang.Throwable -> Lca
            throw r0     // Catch: java.lang.Throwable -> Lca
        L89:
            com.discord.file_manager.FileManagerModule r7 = r6.this$0     // Catch: java.lang.Throwable -> Lca
            java.lang.String r0 = r6.$assetUri     // Catch: java.lang.Throwable -> Lca
            java.io.InputStream r7 = r7.openRawResource(r0)     // Catch: java.lang.Throwable -> Lca
        L91:
            r0 = 0
            if (r7 == 0) goto La5
            java.lang.String r1 = "it"
            kotlin.jvm.internal.C9612q.m13918g(r7, r1)     // Catch: java.lang.Throwable -> L9e
            byte[] r1 = p467zf.C14179b.m515c(r7)     // Catch: java.lang.Throwable -> L9e
            goto La6
        L9e:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> La0
        La0:
            r1 = move-exception
            p467zf.C14180c.m514a(r7, r0)     // Catch: java.lang.Throwable -> Lca
            throw r1     // Catch: java.lang.Throwable -> Lca
        La5:
            r1 = r0
        La6:
            p467zf.C14180c.m514a(r7, r0)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r7 = r6.$encoding     // Catch: java.lang.Throwable -> Lca
            java.lang.String r2 = "base64"
            boolean r7 = kotlin.jvm.internal.C9612q.m13922c(r7, r2)     // Catch: java.lang.Throwable -> Lca
            if (r7 == 0) goto Lbe
            com.facebook.react.bridge.Promise r7 = r6.$promise     // Catch: java.lang.Throwable -> Lca
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)     // Catch: java.lang.Throwable -> Lca
            r7.resolve(r0)     // Catch: java.lang.Throwable -> Lca
            goto Ld0
        Lbe:
            com.facebook.react.bridge.Promise r7 = r6.$promise     // Catch: java.lang.Throwable -> Lca
            if (r1 == 0) goto Lc6
            java.lang.String r0 = kotlin.text.C9642f.m13798q(r1)     // Catch: java.lang.Throwable -> Lca
        Lc6:
            r7.resolve(r0)     // Catch: java.lang.Throwable -> Lca
            goto Ld0
        Lca:
            r7 = move-exception
            com.facebook.react.bridge.Promise r0 = r6.$promise
            r0.reject(r7)
        Ld0:
            kotlin.Unit r7 = kotlin.Unit.f25302a
            return r7
        Ld3:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.file_manager.FileManagerModule$readAsset$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
