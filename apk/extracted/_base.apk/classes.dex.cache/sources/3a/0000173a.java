package com.discord.file_downloader;

import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9578k;
import kotlin.coroutines.jvm.internal.InterfaceC9571e;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m14357d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/discord/file_downloader/DownloadState;", "", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
@InterfaceC9571e(m13987c = "com.discord.file_downloader.FileDownloader$downloadFile$1", m13986f = "FileDownloader.kt", m13985l = {57, 61, 69, 76, 82}, m13984m = "invokeSuspend")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class FileDownloader$downloadFile$1 extends AbstractC9578k implements Function2<FlowCollector<? super DownloadState>, Continuation<? super Unit>, Object> {
    final /* synthetic */ File $downloadDirectory;
    final /* synthetic */ String $fileName;
    final /* synthetic */ String $fileUrl;
    final /* synthetic */ boolean $logErrors;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileDownloader$downloadFile$1(File file, String str, String str2, boolean z, Continuation<? super FileDownloader$downloadFile$1> continuation) {
        super(2, continuation);
        this.$downloadDirectory = file;
        this.$fileName = str;
        this.$fileUrl = str2;
        this.$logErrors = z;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FileDownloader$downloadFile$1 fileDownloader$downloadFile$1 = new FileDownloader$downloadFile$1(this.$downloadDirectory, this.$fileName, this.$fileUrl, this.$logErrors, continuation);
        fileDownloader$downloadFile$1.L$0 = obj;
        return fileDownloader$downloadFile$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super DownloadState> flowCollector, Continuation<? super Unit> continuation) {
        return ((FileDownloader$downloadFile$1) create(flowCollector, continuation)).invokeSuspend(Unit.f25302a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0109, code lost:
        if (r0 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x010b, code lost:
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x013b, code lost:
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0140, code lost:
        return kotlin.Unit.f25302a;
     */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0119: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:155:0x0119 */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00b8 A[Catch: all -> 0x0118, Exception -> 0x011b, TryCatch #3 {Exception -> 0x011b, blocks: (B:133:0x00a4, B:135:0x00b8, B:139:0x00d3, B:141:0x00f0, B:152:0x0114, B:153:0x0117), top: B:178:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00d3 A[Catch: all -> 0x0118, Exception -> 0x011b, TRY_LEAVE, TryCatch #3 {Exception -> 0x011b, blocks: (B:133:0x00a4, B:135:0x00b8, B:139:0x00d3, B:141:0x00f0, B:152:0x0114, B:153:0x0117), top: B:178:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0121 A[Catch: all -> 0x0118, TryCatch #4 {all -> 0x0118, blocks: (B:158:0x011d, B:160:0x0121, B:161:0x0124, B:133:0x00a4, B:135:0x00b8, B:139:0x00d3, B:141:0x00f0, B:152:0x0114, B:153:0x0117), top: B:179:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0135 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0147  */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, okhttp3.ResponseBody] */
    @Override // kotlin.coroutines.jvm.internal.AbstractC9567a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.file_downloader.FileDownloader$downloadFile$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}